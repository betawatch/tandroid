package s9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new m(a1.g.p("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e10) {
                    throw new m(a1.g.p("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new m(b10.j("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new m(b10.j("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new ta.b((m9.h) this.b);
        }
    }
}
