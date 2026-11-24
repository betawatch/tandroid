// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
