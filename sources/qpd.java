// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class qpd {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            lq5.g(i3, bs2.p("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            lq5.j(c00.h(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
