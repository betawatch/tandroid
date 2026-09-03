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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h {
    public static h b;
    public final Context a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static h b(Context context) {
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

    public static final l c(PackageInfo packageInfo, l... lVarArr) {
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
    public static final boolean d(PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (z4) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z4 ? c(packageInfo2, n.a) : c(packageInfo2, n.a[0])) == null) {
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
            if ((!z4 ? c(packageInfo2, n.a) : c(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    public void a(af.d dVar, u uVar, o5.i iVar) {
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
        e0.b.a(f10, e0.b.C(dVar), cancellationSignal, new k0.a(iVar));
    }
}
