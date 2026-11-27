// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
