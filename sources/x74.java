// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class x74 {
    public static final w74 a = new w74();
    public static final w74 b;

    static {
        ow8 ow8Var = ow8.c;
        w74 w74Var = null;
        try {
            w74Var = (w74) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = w74Var;
    }
}
