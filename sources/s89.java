// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class s89 {
    public static final t89 a;

    static {
        t89 t89Var = null;
        try {
            t89Var = (t89) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (t89Var == null) {
            t89Var = new t89();
        }
        a = t89Var;
    }

    public static ki2 a(Class cls) {
        a.getClass();
        return new ki2(cls);
    }
}
