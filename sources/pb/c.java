package pb;

import a0.i;
import a6.l;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import bi.b8;
import bi.e8;
import bi.n0;
import c7.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import db.j;
import fb.n;
import fg.b2;
import fg.c2;
import g6.q;
import h7.d;
import h7.f;
import hi.g2;
import hi.k1;
import hi.k2;
import hi.l0;
import hi.p4;
import hi.r4;
import hi.v3;
import hi.z3;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import kg.e;
import l.x;
import m.e2;
import n7.k;
import n7.n1;
import n7.o1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.wi;
import org.telegram.ui.cj0;
import org.telegram.ui.iy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c implements a0, androidx.activity.result.b, s, e, q71, k0, v0, OnCompleteListener, f6.a, n, c2, x, wi, c5, l0, e2 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    @Override // kg.e
    public void B(float f7) {
        ((n0) this.b).f.setRotation(f7);
    }

    @Override // fg.c2
    public /* synthetic */ i D() {
        return null;
    }

    @Override // hi.l0
    public s9 E() {
        p4 p4Var = ((r4) this.b).G;
        if (p4Var != null) {
            return ((v3) p4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 23:
                ((hi.s) this.b).I(i10, z10, i11, false, 0L);
                hi.s sVar = (hi.s) this.b;
                cj0 cj0Var = sVar.O;
                if (cj0Var != null) {
                    cj0Var.i();
                    sVar.O = null;
                    break;
                }
                break;
            default:
                g2 g2Var = (g2) this.b;
                g2Var.s0(i10, i11, z10);
                cj0 cj0Var2 = g2Var.O0;
                if (cj0Var2 != null) {
                    cj0Var2.i();
                    g2Var.O0 = null;
                    break;
                }
                break;
        }
    }

    @Override // hi.l0
    public void J(CharSequence charSequence) {
        p4 p4Var = ((r4) this.b).G;
        if (p4Var != null) {
            v3 v3Var = (v3) p4Var;
            v3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            v3Var.a.s4(charSequence.toString());
        }
    }

    @Override // hi.l0
    public r9 M() {
        return (r4) this.b;
    }

    @Override // hi.l0
    public hi.a O() {
        return ((r4) this.b).a;
    }

    @Override // fg.c2
    public /* synthetic */ i P() {
        return null;
    }

    @Override // hi.l0
    public boolean R() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var == null) {
            return false;
        }
        hi.a aVar = r4Var.a;
        return ((v3) p4Var).a.R4();
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean R1() {
        return false;
    }

    @Override // hi.l0
    public void U(int i10, int i11) {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.a;
            k2 k2Var = ((v3) p4Var).a.J3;
            if (k2Var != null) {
                k2Var.f(i10, i11);
            }
        }
    }

    @Override // fg.c2
    public void a(int i10) {
        ao0 ao0Var = (ao0) this.b;
        ao0Var.D0--;
        ao0Var.e0 = i10;
        if (ao0Var.f0 != i10) {
            ao0Var.s.clear();
        }
        if (ao0Var.g0 != i10) {
            ao0Var.I.clear();
        }
        ao0Var.N = true;
        iy iyVar = ao0Var.U;
        if (iyVar != null) {
            iyVar.d(ao0Var.D0 > 0, true);
        }
        ao0Var.l();
        iy iyVar2 = ao0Var.U;
        if (iyVar2 != null) {
            iyVar2.c();
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                o1 o1Var = (o1) ((n1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(o1Var.b);
                int i10 = k.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    o1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 20:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O0 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, qVar);
                O0.writeStringArray(strArr);
                iVar.T0(O0, 5);
                return;
            case 22:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                f fVar = new f(1, (TaskCompletionSource) obj2);
                d dVar = (d) ((h7.e) obj).u();
                g gVar = new g(new h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, getCredentialRequest);
                q7.a.b(obtain3, gVar);
                ((h7.b) dVar).G0(obtain3, 1);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                x5.e eVar = (x5.e) this.b;
                Parcel K0 = iVar2.K0();
                int i12 = i7.f.a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, eVar);
                iVar2.L0(K0, 1);
                return;
        }
    }

    @Override // hi.l0, hi.j1
    public void b(k1 k1Var) {
        p4 p4Var = ((r4) this.b).G;
        if (p4Var != null) {
            z3 z3Var = ((v3) p4Var).a;
            z3.L1(z3Var, k1Var);
            z3Var.h3.C(k1Var, true);
        }
    }

    @Override // hi.l0
    public void b0() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.a;
            z3 z3Var = ((v3) p4Var).a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.h3.onContentChanged();
        }
    }

    @Override // l.x
    public void c(l.l lVar, boolean z10) {
        ((g.s) this.b).g(lVar);
    }

    @Override // fg.c2
    public boolean c0(int i10) {
        return i10 == ((ao0) this.b).d0;
    }

    @Override // kg.e
    public boolean e() {
        n0 n0Var = (n0) this.b;
        n0Var.d.invalidate();
        return n0Var.f.j();
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void f() {
        m0 m0Var = (m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.m();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // hi.l0
    public void g() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            z3.O1(((v3) p4Var).a, r4Var.a);
        }
    }

    @Override // m.e2
    public void h(l.l lVar, MenuItem menuItem) {
        ((l.f) this.b).f.removeCallbacksAndMessages(lVar);
    }

    @Override // kg.e
    public void i() {
        ((n0) this.b).f.o();
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 3:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i10 = f0Var.b;
                    androidx.fragment.app.s l4 = j0Var.c.l(str);
                    if (l4 != null) {
                        l4.x(i10, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i11 = aVar2.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // fg.c2
    public void k0(ArrayList arrayList) {
        ao0 ao0Var = (ao0) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ao0Var.J.add(((b2) arrayList.get(i10)).a);
        }
        iy iyVar = ao0Var.U;
        if (iyVar != null) {
            iyVar.d(ao0Var.D0 > 0, false);
        }
        ao0Var.l();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void m() {
        m0 m0Var = (m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void n(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // fb.n
    public Object n2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new j("Invalid EnumMap type: " + type.toString());
    }

    @Override // m.e2
    public void o(l.l lVar, l.n nVar) {
        l.f fVar = (l.f) this.b;
        Handler handler = fVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((l.e) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new p(this, i11 < arrayList.size() ? (l.e) arrayList.get(i11) : null, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        e8 e8Var = (e8) this.b;
        b8 b8Var = e8Var.L;
        AndroidUtilities.cancelRunOnUIThread(b8Var);
        t71 t71Var = e8Var.y;
        if (t71Var == null || !t71Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(b8Var);
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((e8) this.b).i();
    }

    @Override // kg.e
    public void p() {
        ((n0) this.b).f.a.g(1, true);
    }

    @Override // hi.l0
    public void p0() {
        r4 r4Var = (r4) this.b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.a;
            z3.N1(((v3) p4Var).a);
        }
    }

    @Override // kg.e
    public boolean q() {
        n0 n0Var = (n0) this.b;
        bi.l0 l0Var = n0Var.f;
        boolean m10 = l0Var.m(-90.0f);
        l0Var.i();
        n0Var.d.invalidate();
        return m10;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean r() {
        return true;
    }

    @Override // androidx.lifecycle.a0
    public void r0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // f6.a
    public void s(Bitmap bitmap) {
        ((f6.i) this.b).e(bitmap, 3);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e t(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // l.x
    public boolean u(l.l lVar) {
        Window.Callback callback = ((g.s) this.b).f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void v(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // kg.e
    public void w() {
        ((n0) this.b).f.k();
    }

    public da.a x(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.q2((na.d) this.b, jSONObject);
    }

    @Override // org.telegram.ui.Components.wi
    public void y0(jh jhVar) {
        int i10;
        i10 = ((p2) ((gg.n) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(jhVar);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void z(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    public /* synthetic */ c(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public c(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = (HashMap) this.b;
            bVar.getClass();
            hashMap.put(a.class, bVar.a);
        }
    }

    public c() {
        this.a = 8;
        this.b = new e2.v(10);
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void d(Bundle bundle) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void i1(TLRPC.User user) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void l(int i10) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void k(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.wi
    public void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
