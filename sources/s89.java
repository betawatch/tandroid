// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
