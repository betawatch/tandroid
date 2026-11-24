// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zkd {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            w26.h(i3, ir2.p("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            w26.j(b00.g(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
