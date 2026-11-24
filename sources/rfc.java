// default package

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rfc extends nf5 {
    public static rfc H;
    public static final jk2 I = new jk2(29);
    public final Application G;

    public rfc(Application application) {
        super((byte) 29);
        this.G = application;
    }

    @Override // nf5, sfc
    public final pfc d(Class cls, x23 x23Var) {
        x23Var.getClass();
        if (this.G != null) {
            return j(cls);
        }
        Application application = (Application) x23Var.b(I);
        if (application != null) {
            return l(cls, application);
        }
        if (!hm.class.isAssignableFrom(cls)) {
            return tne.a(cls);
        }
        u36.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // nf5
    public final pfc j(Class cls) {
        Application application = this.G;
        if (application != null) {
            return l(cls, application);
        }
        rjb.j("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final pfc l(Class cls, Application application) {
        if (!hm.class.isAssignableFrom(cls)) {
            return tne.a(cls);
        }
        try {
            pfc pfcVar = (pfc) cls.getConstructor(Application.class).newInstance(application);
            pfcVar.getClass();
            return pfcVar;
        } catch (IllegalAccessException e) {
            dq9.n("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            dq9.n("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            dq9.n("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            dq9.n("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
