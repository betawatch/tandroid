// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class t2f {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            gxc.d("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            gxc.d(kt6.o("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
