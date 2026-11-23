package t;

import java.util.HashSet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a {
    public static final a b = new a(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    public final HashSet a = new HashSet();

    static {
        new a(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public a(int[] iArr) {
        for (int i7 : iArr) {
            this.a.add(Integer.valueOf(i7));
        }
    }
}
