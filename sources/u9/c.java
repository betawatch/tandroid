package u9;

import a8.p0;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ua.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // ua.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new l(p0.p("Could not instantiate ", str, "."), e10);
                } catch (InstantiationException e11) {
                    throw new l(p0.p("Could not instantiate ", str, "."), e11);
                } catch (NoSuchMethodException e12) {
                    throw new l(rf.b.i("Could not instantiate ", str), e12);
                } catch (InvocationTargetException e13) {
                    throw new l(rf.b.i("Could not instantiate ", str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new wa.c((o9.g) this.b);
        }
    }
}
