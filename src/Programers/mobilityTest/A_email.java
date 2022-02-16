package Programers.mobilityTest;

import java.util.*;

public class A_email {
    public static void main(String[] args) {
        A_email M = new A_email();

        String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
        String C = "Example";

        String result = "John Doe <jdoe@example.com>, Peter Parker <pparker@example.com>, " +
                "Mary Jane Watson-Parker <mjwatsonpa@example.com>, James Doe <jdoe2@example.com>, " +
                "John Elvis Doe <jedoe@example.com>, Jane Doe <jdoe3@example.com>, Penny Parker <pparker2@example.com>";

        System.out.println(result.equals(M.solution(S, C)));
    }

    private String solution(String S, String C) {
        StringBuilder sb = new StringBuilder();
        String id = "";
        List<String> ids = new ArrayList<>();

        String[] names = S.split(", ");

        for (int i = 0; i < names.length; i++) {
            String replacedName = names[i].replace("-", "");
            String[] sp = replacedName.split(" ");

            for (int j = 0; j < sp.length; j++) {
                if (j == sp.length - 1) {
                    id += (sp[j].length() > 8) ? sp[j].toLowerCase().substring(0,8): sp[j].toLowerCase();
                }else {
                    id += sp[j].toLowerCase().charAt(0);
                }
            }
            if (ids.contains(id)){
                int count = 2;
                String newId = id + count;
                while (ids.contains(newId)) {
                    newId = id + ++count;
                }
                ids.add(newId);
            } else ids.add(id);

            id = "";
        }

        for (int i = 0; i < ids.size(); i++) {
            sb.append(names[i]).append(" <").append(ids.get(i))
                    .append("@").append(C.toLowerCase()).append(".com");
            if (i == ids.size()-1) sb.append(">");
            else sb.append(">, ");
        }

        return sb.toString();
    }
}
