// default package

import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rd1 {
    public static final rd1 b = new rd1(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new rd1(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public rd1(int[] iArr) {
        for (int i : iArr) {
            this.a.add(Integer.valueOf(i));
        }
    }
}
