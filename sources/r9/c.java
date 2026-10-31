package r9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements qa.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // qa.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new m(a1.g.n("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e7) {
                    throw new m(a1.g.n("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e10) {
                    throw new m(sc.e.h("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new m(sc.e.h("Could not instantiate ", str), e11);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new sa.b((l9.h) this.b);
        }
    }
}
