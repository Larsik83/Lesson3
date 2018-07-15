package lesson6;

import java.util.*;

public class CollectionUtilImpl implements CollectionUtils{

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(a);
        for (Iterator <Integer> iter=b.iterator();iter.hasNext();){
            union.add(iter.next());
        }
        return union;

    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result=new ArrayList<>();
        for(Iterator<Integer> iter=a.iterator();iter.hasNext();) {
            Integer currentNumber=iter.next();
            if (b.contains(currentNumber)){
                result.add(currentNumber);
            }
        }
        for (Iterator<Integer> iter=b.iterator();iter.hasNext();){
            Integer currentNumber=iter.next();
            if (a.contains(currentNumber)){
                result.add(currentNumber);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result=new LinkedHashSet();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result=new LinkedHashSet<>();
        for(Iterator<Integer> iter=a.iterator();iter.hasNext();) {
            Integer currentNumber=iter.next();
            if (b.contains(currentNumber)){
                result.add(currentNumber);
            }
        }
        for (Iterator<Integer> iter=b.iterator();iter.hasNext();){
            Integer currentNumber=iter.next();
            if (a.contains(currentNumber)){
                result.add(currentNumber);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result=new LinkedHashSet<>();
        for(Iterator<Integer> iter=a.iterator();iter.hasNext();) {
            Integer currentNumber=iter.next();
            if (!b.contains(currentNumber)){
                result.add(currentNumber);
            }
        }
        for (Iterator<Integer> iter=b.iterator();iter.hasNext();){
            Integer currentNumber=iter.next();
            if (!a.contains(currentNumber)){
                result.add(currentNumber);
            }
        }

        return result;
    }
}
