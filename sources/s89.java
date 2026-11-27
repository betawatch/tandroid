// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
