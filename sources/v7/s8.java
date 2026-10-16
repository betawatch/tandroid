package v7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class s8 {
    public static void a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder m10 = i2.d.m("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            m10.append(i12);
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a1.g.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }
}
