package Task1;

public interface Ownerable extends OwnerCat {
    @Override
    default String getName(){
        return DEFAULT_NAME;
    }
    Owner getOwner();
}
