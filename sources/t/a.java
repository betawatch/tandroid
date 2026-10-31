package t;

import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public static final a b = new a(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new a(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public a(int[] iArr) {
        for (int i10 : iArr) {
            this.a.add(Integer.valueOf(i10));
        }
    }
}
