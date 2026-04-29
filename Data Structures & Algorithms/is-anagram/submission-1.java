class Solution {
    public boolean isAnagram(String s, String t) {
        boolean check = false;
        if(s.length() != t.length()) {
            return check;
        }
        List<Character> s1 = s.chars().mapToObj(c -> (char) c)
        .collect(Collectors.toList());
        List<Character> t1 = t.chars().mapToObj(c -> (char) c)
        .collect(Collectors.toList());

        Collections.sort(s1);
        Collections.sort(t1);

        return s1.equals(t1);

        // for(int i = 0; i < s1.size(); i++) {
        //     if(t1.contains(s1.get(i))) {
        //         check = true;
        //     } else {
        //         check = false;
        //     }
        // }
        // return check;
    }
}
