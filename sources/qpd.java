// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
