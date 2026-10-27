package s9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ra.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ra.b
    public final Object get() {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new n("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new n(a1.g.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e10) {
                    throw new n(a1.g.p("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new n(b10.j("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new n(b10.j("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new ta.b((m9.h) this.b);
        }
    }
}
