package y8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements x9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // x9.b
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
                } catch (IllegalAccessException e10) {
                    throw new m(aa.d.o("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new m(aa.d.o("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new m(ta.b.d("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new m(ta.b.d("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new z9.b((s8.h) this.b);
        }
    }
}
