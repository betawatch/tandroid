// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
