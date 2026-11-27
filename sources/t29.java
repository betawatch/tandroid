// default package

import android.media.Rating;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class t29 {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z) {
        return Rating.newHeartRating(z);
    }

    public static Rating h(float f) {
        return Rating.newPercentageRating(f);
    }

    public static Rating i(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    public static Rating j(boolean z) {
        return Rating.newThumbRating(z);
    }

    public static Rating k(int i) {
        return Rating.newUnratedRating(i);
    }
}
