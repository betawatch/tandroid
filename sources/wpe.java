// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class wpe {
    public static final npe a = new npe();
    public static final npe b;

    static {
        npe npeVar = null;
        try {
            npeVar = (npe) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = npeVar;
    }
}
