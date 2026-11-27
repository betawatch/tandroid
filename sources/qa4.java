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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qa4 extends h05 implements k59 {
    public static final zn l = new zn("Fido.FIDO2_API", new rr5(22), new xn());
    public static final zn m = new zn("IdentityCredentials.API", new rr5(0), new xn());
    public static final zn n = new zn("ClientNotification.API", new rr5(5), new xn());
    public static final zn o = new zn("ClientTelemetry.API", new rr5(6), new xn());
    public static final zn p = new zn("ModuleInstall.API", new rr5(4), new xn());
    public static final zn q = new zn("SmsRetriever.API", new rr5(11), new xn());
    public static final zn r = new zn("LocationServices.API", new rr5(14), new xn());
    public static final zn s = new zn("RecaptchaBase.API", new rr5(19), new xn());
    public static final zn t = new zn("CloudMessaging.API", new rr5(17), new xn());
    public static final zn u = new zn("CastApi.API", new rr5(20), new xn());
    public static byte v = 1;

    public qa4(Context context, g05 g05Var) {
        super(context, qwc.a, pwc.a, g05Var);
    }

    public final Task f(yt7... yt7VarArr) {
        boolean z = false;
        xve.a("Please provide at least one OptionalModuleApi.", yt7VarArr.length > 0);
        for (yt7 yt7Var : yt7VarArr) {
            xve.i(yt7Var, "Requested API must not be null.");
        }
        fo b = fo.b(Arrays.asList(yt7VarArr), false);
        if (b.a.isEmpty()) {
            return Tasks.forResult(new vg7(0, true));
        }
        wjb b2 = xjb.b();
        b2.c = new a94[]{nid.a};
        b2.d = (char) 27301;
        b2.b = false;
        b2.a = new zhc(this, b, z, (byte) 6);
        return e(0, b2.a());
    }

    public final Task g(GetCredentialRequest getCredentialRequest) {
        wjb b = xjb.b();
        b.c = new a94[]{cjd.a};
        b.a = new uae((Object) getCredentialRequest, (byte) 3);
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
        wn wnVar = this.e;
        Context context = this.a;
        if (i == 2) {
            y8d.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a = y8d.a(context, (GoogleSignInOptions) wnVar);
            a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a;
        }
        if (i == 3) {
            return y8d.a(context, (GoogleSignInOptions) wnVar);
        }
        y8d.a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a2 = y8d.a(context, (GoogleSignInOptions) wnVar);
        a2.setAction("com.google.android.gms.auth.NO_IMPL");
        return a2;
    }

    public final Task i(ikb ikbVar) {
        wjb b = xjb.b();
        b.c = new a94[]{mid.a};
        b.b = false;
        b.a = new ve9((Object) ikbVar, (byte) 22);
        return e(2, b.a());
    }

    public final void j(LocationRequest locationRequest, r05 r05Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            xve.i(looper, "invalid null looper");
        }
        a86 T = aj3.T(looper, r05Var, r05.class.getSimpleName());
        rx rxVar = new rx(this, T);
        zhc zhcVar = new zhc(rxVar, locationRequest, false, (byte) 10);
        g99 g99Var = new g99();
        g99Var.e = true;
        g99Var.a = zhcVar;
        g99Var.b = rxVar;
        g99Var.c = T;
        g99Var.f = (short) 2436;
        b(g99Var.a());
    }

    public final Task k() {
        BasePendingResult basePendingResult;
        byte b = 0;
        boolean z = l() == 3;
        y8d.a.a("Signing out", new Object[0]);
        y8d.b(this.a);
        o6d o6dVar = this.i;
        if (z) {
            BasePendingResult e2bVar = new e2b(o6dVar, b);
            e2bVar.a(Status.e);
            basePendingResult = e2bVar;
        } else {
            w8d w8dVar = new w8d(o6dVar, (byte) 0);
            o6dVar.b.d(1, w8dVar);
            basePendingResult = w8dVar;
        }
        return pgd.a(basePendingResult, new uif((byte) 29));
    }

    public final synchronized int l() {
        byte b;
        b = v;
        if (b == 1) {
            Context context = this.a;
            i05 i05Var = i05.e;
            int c = i05Var.c(context, 12451000);
            if (c == 0) {
                b = 4;
                v = (byte) 4;
            } else if (i05Var.a(c, context, null) != null || vs3.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
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
        wjb b = xjb.b();
        b.a = new uae(this, strArr);
        b.c = new a94[]{zid.b};
        b.b = false;
        b.d = (char) 8425;
        return e(0, b.a());
    }
}
