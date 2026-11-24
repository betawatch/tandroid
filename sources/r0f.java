// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
