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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ua4 extends c05 implements z39 {
    public static final zo l = new zo("Fido.FIDO2_API", new or5(22), new xo());
    public static final zo m = new zo("IdentityCredentials.API", new or5(0), new xo());
    public static final zo n = new zo("ClientNotification.API", new or5(5), new xo());
    public static final zo o = new zo("ClientTelemetry.API", new or5(6), new xo());
    public static final zo p = new zo("ModuleInstall.API", new or5(4), new xo());
    public static final zo q = new zo("SmsRetriever.API", new or5(11), new xo());
    public static final zo r = new zo("LocationServices.API", new or5(14), new xo());
    public static final zo s = new zo("RecaptchaBase.API", new or5(19), new xo());
    public static final zo t = new zo("CloudMessaging.API", new or5(17), new xo());
    public static final zo u = new zo("CastApi.API", new or5(20), new xo());
    public static byte v = 1;

    public ua4(Context context, b05 b05Var) {
        super(context, duc.a, cuc.a, b05Var);
    }

    public final Task f(vs7... vs7VarArr) {
        boolean z = false;
        ite.a("Please provide at least one OptionalModuleApi.", vs7VarArr.length > 0);
        for (vs7 vs7Var : vs7VarArr) {
            ite.i(vs7Var, "Requested API must not be null.");
        }
        ep b = ep.b(Arrays.asList(vs7VarArr), false);
        if (b.a.isEmpty()) {
            return Tasks.forResult(new og7(0, true));
        }
        bib b2 = cib.b();
        b2.c = new o94[]{xfd.a};
        b2.d = (char) 27301;
        b2.b = false;
        b2.a = new rhb(this, b, z, (byte) 8);
        return e(0, b2.a());
    }

    public final Task g(GetCredentialRequest getCredentialRequest) {
        bib b = cib.b();
        b.c = new o94[]{mgd.a};
        b.a = new fkd((Object) getCredentialRequest, (byte) 6);
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
        wo woVar = this.e;
        Context context = this.a;
        if (i == 2) {
            j6d.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a = j6d.a(context, (GoogleSignInOptions) woVar);
            a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a;
        }
        if (i == 3) {
            return j6d.a(context, (GoogleSignInOptions) woVar);
        }
        j6d.a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a2 = j6d.a(context, (GoogleSignInOptions) woVar);
        a2.setAction("com.google.android.gms.auth.NO_IMPL");
        return a2;
    }

    public final Task i(nib nibVar) {
        bib b = cib.b();
        b.c = new o94[]{wfd.a};
        b.b = false;
        b.a = new x59(nibVar, (byte) 25);
        return e(2, b.a());
    }

    public final void j(LocationRequest locationRequest, m05 m05Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            ite.i(looper, "invalid null looper");
        }
        w76 U = fk3.U(looper, m05Var, m05.class.getSimpleName());
        ry ryVar = new ry(this, U);
        rhb rhbVar = new rhb(ryVar, locationRequest, false, (byte) 12);
        v79 v79Var = new v79();
        v79Var.e = true;
        v79Var.a = rhbVar;
        v79Var.b = ryVar;
        v79Var.c = U;
        v79Var.f = (short) 2436;
        b(v79Var.a());
    }

    public final Task k() {
        BasePendingResult basePendingResult;
        byte b = 0;
        boolean z = l() == 3;
        j6d.a.a("Signing out", new Object[0]);
        j6d.b(this.a);
        z3d z3dVar = this.i;
        if (z) {
            BasePendingResult f0bVar = new f0b(z3dVar, b);
            f0bVar.a(Status.e);
            basePendingResult = f0bVar;
        } else {
            h6d h6dVar = new h6d(z3dVar, (byte) 0);
            z3dVar.b.d(1, h6dVar);
            basePendingResult = h6dVar;
        }
        return ydd.a(basePendingResult, new q7f((byte) 29));
    }

    public final synchronized int l() {
        byte b;
        b = v;
        if (b == 1) {
            Context context = this.a;
            d05 d05Var = d05.e;
            int c = d05Var.c(context, 12451000);
            if (c == 0) {
                b = 4;
                v = (byte) 4;
            } else if (d05Var.a(c, context, null) != null || nt3.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
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
        bib b = cib.b();
        b.a = new fkd(this, strArr);
        b.c = new o94[]{jgd.b};
        b.b = false;
        b.d = (char) 8425;
        return e(0, b.a());
    }
}
