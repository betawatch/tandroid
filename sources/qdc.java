// default package

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qdc extends pd5 {
    public static qdc H;
    public static final vi2 I = new vi2(29);
    public final Application G;

    public qdc(Application application) {
        super((byte) 29);
        this.G = application;
    }

    @Override // pd5, rdc
    public final odc e(Class cls, l13 l13Var) {
        l13Var.getClass();
        if (this.G != null) {
            return h(cls);
        }
        Application application = (Application) l13Var.b(I);
        if (application != null) {
            return j(cls, application);
        }
        if (!hl.class.isAssignableFrom(cls)) {
            return rle.a(cls);
        }
        w26.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // pd5
    public final odc h(Class cls) {
        Application application = this.G;
        if (application != null) {
            return j(cls, application);
        }
        fyb.i("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final odc j(Class cls, Application application) {
        if (!hl.class.isAssignableFrom(cls)) {
            return rle.a(cls);
        }
        try {
            odc odcVar = (odc) cls.getConstructor(Application.class).newInstance(application);
            odcVar.getClass();
            return odcVar;
        } catch (IllegalAccessException e) {
            ho9.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            ho9.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ho9.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            ho9.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
