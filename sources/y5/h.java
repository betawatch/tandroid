package y5;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.r;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.e1;
import dg.e2;
import eg.q2;
import g.q;
import hg.y1;
import i9.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import k1.d0;
import l.e0;
import l.x;
import l3.t;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h implements a0, androidx.activity.result.b, v0, q2, a3.b, com.google.android.gms.common.api.internal.o, x, s, t, l.j, k1.g, o0.a {
    public static h c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h(int i10, boolean z4) {
        this.a = i10;
    }

    public static p h(Looper looper, Object obj, String str) {
        b6.m.i(obj, "Listener must not be null");
        b6.m.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    public static h m(Context context) {
        b6.m.h(context);
        synchronized (h.class) {
            try {
                if (c == null) {
                    o.a(context);
                    c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c;
    }

    public static final l u(PackageInfo packageInfo, l... lVarArr) {
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
    public static final boolean w(PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (z4) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z4 ? u(packageInfo2, n.a) : u(packageInfo2, n.a[0])) == null) {
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
            if ((!z4 ? u(packageInfo2, n.a) : u(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void B(a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // eg.q2
    public void H(float f10) {
        ht0 ht0Var = (ht0) this.b;
        e1.e(ht0Var.M1).k(String.valueOf(dg.m.a.indexOf(ht0Var.T0.getCurrentBrush())), f10);
        e2 e2Var = ht0Var.H1;
        e2Var.c = f10;
        ht0Var.s0(e2Var, null);
    }

    @Override // androidx.lifecycle.a0
    public void W(Object obj) {
        switch (this.a) {
            case 2:
                r rVar = (r) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (rVar.R()) {
                        rVar.W(rVar.q(R.string.fingerprint_not_recognized));
                    }
                    androidx.biometric.a0 a0Var = rVar.i0;
                    if (a0Var.n) {
                        Executor executor = a0Var.d;
                        if (executor == null) {
                            executor = new androidx.biometric.p(1);
                        }
                        executor.execute(new androidx.biometric.h(rVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    androidx.biometric.a0 a0Var2 = rVar.i0;
                    if (a0Var2.u == null) {
                        a0Var2.u = new z();
                    }
                    androidx.biometric.a0.h(a0Var2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar.o0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // l3.t
    public void a(long j10) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 18:
                g6.f fVar = new g6.f(0, (TaskCompletionSource) obj2);
                g6.e eVar = (g6.e) ((g6.h) obj).u();
                g6.a aVar = (g6.a) this.b;
                Parcel G0 = eVar.G0();
                y6.a.d(G0, fVar);
                y6.a.c(G0, aVar);
                eVar.H0(G0, 1);
                return;
            default:
                j8.j jVar = (j8.j) this.b;
                s7.b bVar = (s7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                s7.a aVar2 = new s7.a(0, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e6) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e6);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.l0(Status.h, null);
                    return;
                }
        }
    }

    @Override // l.x
    public void c(l.l lVar, boolean z4) {
        switch (this.a) {
            case 17:
                ((q) this.b).g(lVar);
                break;
            default:
                if (lVar instanceof e0) {
                    ((e0) lVar).z.k().c(false);
                }
                x xVar = ((m.h) this.b).e;
                if (xVar != null) {
                    xVar.c(lVar, z4);
                    break;
                }
                break;
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // k1.g
    public Object d(dd.p pVar, wc.c cVar) {
        return ((d0) this.b).d(new n1.c(pVar, null, 0), cVar);
    }

    @Override // l.x
    public boolean d0(l.l lVar) {
        switch (this.a) {
            case 17:
                Window.Callback callback = ((q) this.b).f.getCallback();
                if (callback == null) {
                    return true;
                }
                callback.onMenuOpened(108, lVar);
                return true;
            default:
                m.h hVar = (m.h) this.b;
                if (lVar == hVar.c) {
                    return false;
                }
                ((e0) lVar).A.getClass();
                hVar.getClass();
                x xVar = hVar.e;
                if (xVar != null) {
                    return xVar.d0(lVar);
                }
                return false;
        }
    }

    @Override // l3.t
    public void e(int i10, long j10, long j11) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void f(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        androidx.activity.o oVar = ((f7.j) this.b).b;
        synchronized (oVar) {
            oVar.a = false;
            nVar = ((p) oVar.b).c;
        }
        if (nVar != null) {
            ((f7.d) oVar.c).c(nVar, 2441);
        }
    }

    public void g(x5.k kVar, w wVar) {
        k0 k0Var = (k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.b;
        r rVar = (r) k0Var2.D("androidx.biometric.BiometricFragment");
        if (rVar == null) {
            rVar = new r();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, rVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        v k10 = rVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        androidx.biometric.a0 a0Var = rVar.i0;
        a0Var.f = kVar;
        int i10 = kVar.a;
        if (i10 == 0) {
            i10 = wVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || wVar != null) {
            a0Var.g = wVar;
        } else {
            a0Var.g = h7.s.a();
        }
        if (rVar.Q()) {
            rVar.i0.k = rVar.q(R.string.confirm_device_credential_password);
        } else {
            rVar.i0.k = null;
        }
        if (rVar.Q() && new androidx.biometric.e(new u(k10, 0)).h(255) != 0) {
            rVar.i0.n = true;
            rVar.S();
        } else if (rVar.i0.p) {
            rVar.h0.postDelayed(new androidx.biometric.q(rVar), 600L);
        } else {
            rVar.X();
        }
    }

    @Override // rc.a
    public Object get() {
        return new f3.j((Context) ((rc.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(f3.j.d).intValue());
    }

    @Override // k1.g
    public od.b getData() {
        return ((d0) this.b).c;
    }

    @Override // l.j
    public void j(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.h hVar = toolbar.a.G;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.T.c).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.t();
            }
        }
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s r10 = j0Var.c.r(str);
        if (r10 != null) {
            r10.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // l3.t
    public void l(Exception exc) {
        h5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    public StringBuilder n() {
        pe.a aVar = (pe.a) this.b;
        if (!(aVar instanceof ke.o)) {
            return null;
        }
        StringBuilder sb = ((ke.o) aVar).b.b;
        if (sb.length() == 0) {
            return null;
        }
        return sb;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(int i10) {
        a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.f()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // l3.t
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new kh.f(1, bVar, z4));
        }
    }

    @Override // l3.t
    public void p() {
        ((com.google.android.exoplayer2.ext.ffmpeg.b) this.b).T = true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void q(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // o0.a
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e6) {
            Log.w("FontsProvider", "Unable to query the content provider", e6);
            return null;
        }
    }

    @Override // l.j
    public boolean s(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    public void t(e3.g gVar, Thread thread, Throwable th2) {
        i9.n nVar = (i9.n) this.b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y.a(nVar.e.I(new i9.l(nVar, System.currentTimeMillis(), th2, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e6) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e6);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public void v() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + z());
    }

    public void x(long j10) {
        long z4 = z();
        if (z4 != j10) {
            if (z4 != -1) {
                if (z4 != -2) {
                    return;
                } else {
                    z4 = -2;
                }
            }
            StringBuilder s6 = android.support.v4.media.a.s(j10, "expected non-string scope or scope ", " but found ");
            s6.append(z4);
            throw new IOException(s6.toString());
        }
    }

    public long z() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public /* synthetic */ h(g6.g gVar, g6.a aVar) {
        this.a = 18;
        this.b = aVar;
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public h(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public h(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }

    @Override // eg.q2
    public float get() {
        ht0 ht0Var = (ht0) this.b;
        int i10 = ht0Var.M1;
        dg.m currentBrush = ht0Var.T0.getCurrentBrush();
        if (currentBrush == null) {
            return e1.e(i10).i;
        }
        return e1.e(i10).f(String.valueOf(dg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public h(Context context, Uri uri) {
        this.a = 27;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public h(LaunchActivity launchActivity, Executor executor, ee.b bVar) {
        this.a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s6 = launchActivity.s();
            androidx.biometric.a0 a0Var = (androidx.biometric.a0) new androidx.biometric.e(launchActivity).m(androidx.biometric.a0.class);
            this.b = s6;
            a0Var.d = executor;
            a0Var.e = bVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // l3.t
    public /* synthetic */ void b() {
    }

    @Override // l3.t
    public /* synthetic */ void i() {
    }

    @Override // l3.t
    public /* synthetic */ void y() {
    }
}
