package y5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import c2.u;
import com.google.firebase.messaging.r;
import k7.g8;
import m.s3;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.rb0;
import q5.g0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h implements v0.h {
    public static h b;
    public Context a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context;
                break;
            case 2:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static h d(Context context) {
        b6.m.h(context);
        synchronized (h.class) {
            try {
                if (b == null) {
                    o.a(context);
                    b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    public static final l e(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (z4) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z4 ? e(packageInfo2, n.a) : e(packageInfo2, n.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z4 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z4 ? e(packageInfo2, n.a) : e(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    public void a(androidx.biometric.e eVar, u uVar, o5.i iVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        uVar.c = cancellationSignal2;
                        if (uVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) uVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (f10 = e0.b.f(this.a)) == null) {
            return;
        }
        e0.b.a(f10, e0.b.C(eVar), cancellationSignal, new k0.a(iVar));
    }

    public y2.j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        y2.j jVar = new y2.j();
        jVar.a = a3.a.a(y2.m.a);
        a3.c cVar = new a3.c(context, 0);
        jVar.b = cVar;
        jVar.c = a3.a.a(new g0(20, cVar, new qk0(cVar, 21)));
        a3.c cVar2 = jVar.b;
        jVar.d = new o5.i(cVar2, 16);
        rc.a a2 = a3.a.a(new bf.b(29, jVar.d, a3.a.a(new ja.c(cVar2, 8))));
        jVar.e = a2;
        db.a aVar = new db.a(4);
        a3.c cVar3 = jVar.b;
        androidx.biometric.e eVar = new androidx.biometric.e(cVar3, a2, aVar, 12);
        rc.a aVar2 = jVar.a;
        rc.a aVar3 = jVar.c;
        c5.j jVar2 = new c5.j();
        jVar2.a = aVar2;
        jVar2.b = aVar3;
        jVar2.c = eVar;
        jVar2.d = a2;
        jVar2.e = a2;
        s3 s3Var = new s3();
        s3Var.a = cVar3;
        s3Var.b = aVar3;
        s3Var.c = a2;
        s3Var.d = eVar;
        s3Var.e = aVar2;
        s3Var.f = a2;
        s3Var.h = a2;
        jVar.f = a3.a.a(new s5.m(jVar2, s3Var, new r(aVar2, a2, eVar, a2, 6), 11));
        return jVar;
    }

    public Object c(Context context, v0.e eVar, uc.c cVar) {
        ld.m mVar = new ld.m(1, g8.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        o2.o oVar = new o2.o(mVar, 27);
        rb0 rb0Var = new rb0(1);
        kotlin.jvm.internal.j.e(context, "context");
        v0.j a2 = k6.b.a(new k6.b(this.a, 1), eVar);
        if (a2 == null) {
            oVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            oVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, rb0Var, oVar);
        }
        Object r10 = mVar.r();
        vc.a aVar = vc.a.a;
        return r10;
    }
}
