// default package

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zp2 implements mt8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zp2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // mt8
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new aq5("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new aq5(tb4.y("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new aq5(tb4.y("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new aq5(b00.h("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new aq5(b00.h("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new ak5((jg4) obj);
        }
    }
}
