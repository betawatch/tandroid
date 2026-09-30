package t;

import java.util.HashSet;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
