package cool.superfcking.apps.sanrafaeltourguide;

/**
 * Created by jsinclair on 30/10/16.
 */
public class Location {

    private String mLocationName;

    private final int NO_IMAGE_SET = -1;
    private int mImageResourceId = NO_IMAGE_SET;

    public Location(String name){
        mLocationName = name;
    }

    public Location(String name, int imageId) {
        mLocationName = name;
        mImageResourceId = imageId;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId == NO_IMAGE_SET;
    }

    @Override
    public String toString() {
        return mLocationName;
    }
}
