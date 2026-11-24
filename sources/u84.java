// default package

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u84 extends by4 implements v19 {
    public static final yn l = new yn("Fido.FIDO2_API", new op5(22), new wn());
    public static final yn m = new yn("IdentityCredentials.API", new op5(0), new wn());
    public static final yn n = new yn("ClientNotification.API", new op5(5), new wn());
    public static final yn o = new yn("ClientTelemetry.API", new op5(6), new wn());
    public static final yn p = new yn("ModuleInstall.API", new op5(4), new wn());
    public static final yn q = new yn("SmsRetriever.API", new op5(11), new wn());
    public static final yn r = new yn("LocationServices.API", new op5(14), new wn());
    public static final yn s = new yn("RecaptchaBase.API", new op5(19), new wn());
    public static final yn t = new yn("CloudMessaging.API", new op5(17), new wn());
    public static final yn u = new yn("CastApi.API", new op5(20), new wn());
    public static byte v = 1;

    public u84(Context context, ay4 ay4Var) {
        super(context, asc.a, zrc.a, ay4Var);
    }

    public final Task f(tq7... tq7VarArr) {
        boolean z = false;
        fre.a("Please provide at least one OptionalModuleApi.", tq7VarArr.length > 0);
        for (tq7 tq7Var : tq7VarArr) {
            fre.i(tq7Var, "Requested API must not be null.");
        }
        eo b = eo.b(Arrays.asList(tq7VarArr), false);
        if (b.a.isEmpty()) {
            return Tasks.forResult(new me7(0, true));
        }
        agb b2 = bgb.b();
        b2.c = new f84[]{vdd.a};
        b2.d = (char) 27301;
        b2.b = false;
        b2.a = new aec(this, b, z, (byte) 6);
        return e(0, b2.a());
    }

    public final Task g(GetCredentialRequest getCredentialRequest) {
        agb b = bgb.b();
        b.c = new f84[]{led.a};
        b.a = new e6e((Object) getCredentialRequest, (byte) 3);
        b.d = (char) 32701;
        Task e = e(0, b.a());
        e.getClass();
        return e;
    }

    public final Intent h() {
        int l2 = l();
        int i = l2 - 1;
        if (l2 == 0) {
            throw null;
        }
        vn vnVar = this.e;
        Context context = this.a;
        if (i == 2) {
            h4d.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a = h4d.a(context, (GoogleSignInOptions) vnVar);
            a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a;
        }
        if (i == 3) {
            return h4d.a(context, (GoogleSignInOptions) vnVar);
        }
        h4d.a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a2 = h4d.a(context, (GoogleSignInOptions) vnVar);
        a2.setAction("com.google.android.gms.auth.NO_IMPL");
        return a2;
    }

    public final Task i(mgb mgbVar) {
        agb b = bgb.b();
        b.c = new f84[]{udd.a};
        b.b = false;
        b.a = new u39(mgbVar, (byte) 25);
        return e(2, b.a());
    }

    public final void j(LocationRequest locationRequest, ly4 ly4Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            fre.i(looper, "invalid null looper");
        }
        w56 w = s34.w(looper, ly4Var, ly4.class.getSimpleName());
        qx qxVar = new qx(this, w);
        aec aecVar = new aec(qxVar, locationRequest, false, (byte) 10);
        t59 t59Var = new t59();
        t59Var.e = true;
        t59Var.a = aecVar;
        t59Var.b = qxVar;
        t59Var.c = w;
        t59Var.f = (short) 2436;
        b(t59Var.a());
    }

    public final Task k() {
        BasePendingResult basePendingResult;
        byte b = 0;
        boolean z = l() == 3;
        h4d.a.a("Signing out", new Object[0]);
        h4d.b(this.a);
        x1d x1dVar = this.i;
        if (z) {
            BasePendingResult cyaVar = new cya(x1dVar, b);
            cyaVar.a(Status.e);
            basePendingResult = cyaVar;
        } else {
            f4d f4dVar = new f4d(x1dVar, (byte) 0);
            x1dVar.b.d(1, f4dVar);
            basePendingResult = f4dVar;
        }
        return wbd.a(basePendingResult, new o5f((byte) 29));
    }

    public final synchronized int l() {
        byte b;
        b = v;
        if (b == 1) {
            Context context = this.a;
            cy4 cy4Var = cy4.e;
            int c = cy4Var.c(context, 12451000);
            if (c == 0) {
                b = 4;
                v = (byte) 4;
            } else if (cy4Var.a(c, context, null) != null || ds3.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                b = 2;
                v = (byte) 2;
            } else {
                b = 3;
                v = (byte) 3;
            }
        }
        return b;
    }

    public final Task m(String[] strArr) {
        agb b = bgb.b();
        b.a = new e6e(this, strArr);
        b.c = new f84[]{ied.b};
        b.b = false;
        b.d = (char) 8425;
        return e(0, b.a());
    }
}
