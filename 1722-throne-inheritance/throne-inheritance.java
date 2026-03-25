import java.util.*;

class ThroneInheritance {

    String king;
    Map<String, List<String>> map; // parent -> children
    Set<String> dead; // dead people

    public ThroneInheritance(String kingName) {
        king = kingName;
        map = new HashMap<>();
        dead = new HashSet<>();
    }
    
    public void birth(String parentName, String childName) {
        map.putIfAbsent(parentName, new ArrayList<>());
        map.get(parentName).add(childName);
    }
    
    public void death(String name) {
        dead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> res = new ArrayList<>();
        dfs(king, res);
        return res;
    }
    
    private void dfs(String person, List<String> res) {
        if (!dead.contains(person)) {
            res.add(person);
        }
        
        if (map.containsKey(person)) {
            for (String child : map.get(person)) {
                dfs(child, res);
            }
        }
    }
}