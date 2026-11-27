// default package

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wt9 implements qhc {
    public final Application a;
    public final phc b;
    public final Bundle c;
    public final a36 d;
    public final po e;

    public wt9(Application application, vt9 vt9Var, Bundle bundle) {
        phc phcVar;
        this.e = vt9Var.g();
        this.d = vt9Var.m();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            phcVar = phc.H;
            if (phcVar == null) {
                phcVar = new phc(application);
                phc.H = phcVar;
            }
        } else {
            phcVar = new phc(null);
        }
        this.b = phcVar;
    }

    @Override // qhc
    public final nhc g(Class cls, e23 e23Var) {
        AutoCloseable autoCloseable;
        Application application;
        e23Var.getClass();
        String str = (String) e23Var.b(z3f.e);
        if (str == null) {
            grb.i("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        byte b = 1;
        if (e23Var.b(fhd.a) != null && e23Var.b(fhd.b) != null) {
            Application application2 = (Application) e23Var.b(phc.I);
            boolean isAssignableFrom = il.class.isAssignableFrom(cls);
            Constructor a = (!isAssignableFrom || application2 == null) ? xt9.a(cls, xt9.b) : xt9.a(cls, xt9.a);
            return a == null ? this.b.g(cls, e23Var) : (!isAssignableFrom || application2 == null) ? xt9.b(cls, a, fhd.a(e23Var)) : xt9.b(cls, a, application2, fhd.a(e23Var));
        }
        if (this.d == null) {
            grb.i("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        a36 a36Var = this.d;
        if (a36Var == null) {
            qyc.c("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom2 = il.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom2 || this.a == null) ? xt9.a(cls, xt9.b) : xt9.a(cls, xt9.a);
        if (a2 == null) {
            if (this.a != null) {
                return this.b.f(cls);
            }
            qf5 qf5Var = qf5.F;
            if (qf5Var == null) {
                qf5Var = new qf5((byte) 29);
                qf5.F = qf5Var;
            }
            return qf5Var.f(cls);
        }
        po poVar = this.e;
        poVar.getClass();
        Bundle bundle = this.c;
        Bundle c = poVar.c(str);
        Class[] clsArr = ot9.f;
        ot9 a3 = fye.a(c, bundle);
        pt9 pt9Var = new pt9(str, a3);
        pt9Var.a(poVar, a36Var);
        z26 z26Var = ((k36) a36Var).b;
        if (z26Var == z26.b || z26Var.compareTo(z26.d) >= 0) {
            poVar.g();
        } else {
            a36Var.a(new bc3(a36Var, poVar, b));
        }
        nhc b2 = (!isAssignableFrom2 || (application = this.a) == null) ? xt9.b(cls, a2, a3) : xt9.b(cls, a2, application, a3);
        b2.getClass();
        ohc ohcVar = b2.a;
        if (ohcVar.d) {
            ohc.a(pt9Var);
            return b2;
        }
        synchronized (ohcVar.a) {
            autoCloseable = (AutoCloseable) ohcVar.b.put("androidx.lifecycle.savedstate.vm.tag", pt9Var);
        }
        ohc.a(autoCloseable);
        return b2;
    }

    @Override // qhc
    public final /* synthetic */ nhc j(ki2 ki2Var, e23 e23Var) {
        return xnb.a(this, ki2Var, e23Var);
    }
}
