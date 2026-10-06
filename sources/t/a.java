package t;

import java.util.HashSet;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
