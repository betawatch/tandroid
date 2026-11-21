package t;

import java.util.HashSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
