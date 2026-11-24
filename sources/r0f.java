// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class r0f {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            fvc.f("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            fvc.f(tb4.y("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
