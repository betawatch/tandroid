// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class tl7 {
    public static final sl7 a;
    public static final sl7 b;

    static {
        ow8 ow8Var = ow8.c;
        sl7 sl7Var = null;
        try {
            sl7Var = (sl7) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = sl7Var;
        b = new sl7();
    }
}
