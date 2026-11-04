package tf;

import ai.r1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import ba.i;
import bi.z;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.b1;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.a2;
import e5.l;
import e5.y;
import e6.e0;
import ei.j4;
import ei.q9;
import ei.r9;
import f6.h;
import f9.k;
import gi.w5;
import h2.q;
import h2.r;
import i2.g;
import i2.o;
import i6.n;
import i6.w;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import ji.b0;
import ji.h0;
import kotlin.jvm.internal.j;
import l4.a0;
import l4.d0;
import l4.f0;
import mi.z3;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wm;
import p6.m;
import r0.i0;
import r0.l0;
import v7.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements h, z, OnCompleteListener, com.google.android.gms.internal.clearcut.h, fb.b, y, p, k, g, n, ia.a, h0, a0, Continuation {
    public static volatile b c;
    public Object a;
    public Object b;

    public /* synthetic */ b(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public static b t() {
        b bVar;
        b bVar2 = c;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = c;
                if (bVar == null) {
                    bVar = new b(0);
                    c = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // ia.a
    public StackTraceElement[] A(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ia.a[] aVarArr = (ia.a[]) this.a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i3 = 0; i3 < 1; i3++) {
            ia.a aVar = aVarArr[i3];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.A(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((s) this.b).A(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public void B(l lVar) {
        this.a = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.b = str;
            }
        }
    }

    public void C(f6.c cVar) {
        p7.d dVar = (p7.d) this.a;
        if (cVar == null) {
            return;
        }
        m.d("Must be called from the main thread.");
        g6.h hVar = cVar.j;
        String a10 = cVar.a();
        if (TextUtils.isEmpty(a10) || hVar == null) {
            return;
        }
        a aVar = (a) dVar.c;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a10)) {
            dVar.F(new a(cVar, (f6.g) this.b, hVar));
            m.d("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer v12 = PhotoViewer.v1();
            d.i();
            if (v12.F == null || v12.f0 == null || !v12.U1()) {
                return;
            }
            new fc(v12.f0, new ei.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? bd.a0(null, null, 2131752102, str) : bd.M0(2131752103, null)).j();
        }
    }

    public void D(ArrayList arrayList) {
        r rVar;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((q) arrayList.get(i3)).a == 1) {
                try {
                    rVar = new r((q) arrayList.get(i3));
                } catch (h2.p unused) {
                    rVar = null;
                }
                this.b = rVar;
            }
        }
    }

    public void E(a2 a2Var) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new a1.f(27, this, a2Var));
        }
    }

    public void F(g3 g3Var) {
        try {
            M(g3Var, (p3) this.a);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void G(g3 g3Var, int i3, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.a).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i3);
            p3 p3Var = (p3) o3Var.a();
            this.a = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void H(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.a;
            } else {
                o3 o3Var = (o3) ((p3) this.a).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j10);
                p3Var = (p3) o3Var.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // ji.h0
    public void H0() {
        b0 b0Var = (b0) this.b;
        b0Var.t1.d.g3.O(true);
        b0Var.s1.d.g3.O(true);
    }

    public void I(g3 g3Var, int i3, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.a).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i3);
            this.a = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.a;
            } else {
                o3 o3Var2 = (o3) ((p3) this.a).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void J(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.a);
            t10.c();
            x3.p((x3) t10.b, l3Var);
            ((i) this.b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void K(a4 a4Var) {
        try {
            i iVar = (i) this.b;
            w3 t10 = x3.t();
            t10.d((p3) this.a);
            t10.c();
            x3.r((x3) t10.b, a4Var);
            iVar.m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void L(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.a);
            t10.c();
            x3.s((x3) t10.b, b4Var);
            ((i) this.b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void M(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.b, g3Var);
            ((i) this.b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void N(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.b, i3Var);
            ((i) this.b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // f6.h
    public void a(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((f6.c) fVar).a() + " " + i3);
        ((p7.d) this.a).F(null);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.a;
        String str = (String) this.b;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        m.i("Not connected to device", e0Var.G == 2);
        i6.f fVar = (i6.f) wVar.m();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        fVar.U0(P0, 5);
        synchronized (e0Var.t) {
            try {
                if (e0Var.q != null) {
                    taskCompletionSource.setException(m.l(new Status(2001, null, null, null)));
                } else {
                    e0Var.q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f9.k
    public Object apply(Object obj) {
        return ((k) ((c6.i) this.a).b).apply(obj);
    }

    @Override // l4.a0
    public void c(g2.y yVar) {
        d0 d0Var = (d0) this.b;
        SparseArray sparseArray = d0Var.h;
        c4.f fVar = (c4.f) this.a;
        if (yVar.A() == 0 && (yVar.A() & 128) != 0) {
            yVar.O(6);
            int a10 = yVar.a() / 4;
            for (int i3 = 0; i3 < a10; i3++) {
                yVar.k(0, 4, (byte[]) fVar.b);
                fVar.J(0);
                int j10 = fVar.j(16);
                fVar.L(3);
                if (j10 == 0) {
                    fVar.L(13);
                } else {
                    int j11 = fVar.j(13);
                    if (sparseArray.get(j11) == null) {
                        sparseArray.put(j11, new l4.b0(new e0.e0(d0Var, j11)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // ji.h0, o0.b
    public void close() {
        ((b0) this.b).l1.D(0);
    }

    @Override // i2.g
    public i2.h createDataSource() {
        return new o((Context) this.a, ((i2.p) this.b).createDataSource());
    }

    @Override // f6.h
    public void d(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((f6.c) fVar).a() + " " + i3);
    }

    @Override // bi.z
    public void e(bi.a0 a0Var) {
        g0.E2(a0Var);
        ((Runnable) this.b).run();
    }

    @Override // f6.h
    public void f(f6.f fVar, String str) {
        f6.c cVar = (f6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        C(cVar);
    }

    @Override // f6.h
    public void g(f6.f fVar) {
        f6.c cVar = (f6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        C(cVar);
    }

    @Override // cd.a
    public Object get() {
        Context appContext = (Context) ((e.a) this.a).a;
        fd.h blockingDispatcher = (fd.h) ((fb.c) this.b).get();
        j.e(appContext, "appContext");
        j.e(blockingDispatcher, "blockingDispatcher");
        return db.q.a(gb.j.a, new w5(new db.o(0), 12), wd.b0.b(blockingDispatcher), new db.p(appContext, 0));
    }

    @Override // f6.h
    public void h(f6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((f6.c) fVar).a());
    }

    @Override // i6.n
    public void i(String str, long j10, long j11, long j12) {
        n nVar = (n) this.a;
        if (nVar != null) {
            nVar.i(str, j10, j11, j12);
        }
    }

    @Override // ji.h0
    public void i0(long j10) {
        ((d2) this.a).presentFragment(wm.ra(j10));
        ((b0) this.b).dismiss();
    }

    @Override // f6.h
    public void j(f6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((f6.c) fVar).a() + " " + str);
    }

    public e5.d k() {
        if (((l) this.a) != null) {
            return new e5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // f6.h
    public void l(f6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((f6.c) fVar).a() + " " + z10);
    }

    @Override // f6.h
    public void m(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((f6.c) fVar).a() + " " + i3);
    }

    @Override // f6.h
    public void n(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((f6.c) fVar).a() + " " + i3);
    }

    @Override // bi.z
    public void o(String str) {
        ((u10) this.a).a(str);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        f6.b bVar;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.a;
        f6.b bVar2 = (f6.b) this.b;
        r4.y yVar = qVar.c;
        i6.b bVar3 = com.google.android.gms.internal.cast.q.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.y)));
                boolean z12 = !z10 && bVar2.y;
                if (yVar != null || (bVar = qVar.d) == null) {
                }
                boolean z13 = bVar.w;
                boolean z14 = bVar.s;
                r4.z zVar = new r4.z();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    zVar.b = z12;
                }
                if (i3 >= 30) {
                    zVar.d = z13;
                }
                if (i3 >= 30) {
                    zVar.c = z14;
                }
                r4.y.i(new r4.a0(zVar));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    t tVar = qVar.f;
                    m.g(tVar);
                    com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                    r4.y.b();
                    r4.y.c().f = pVar;
                    b2.a(b1.c0);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.y)));
        if (z10) {
        }
        if (yVar != null) {
        }
    }

    @Override // i6.n
    public void p(String str, long j10, int i3, Object obj, long j11, long j12) {
        ((i6.m) this.b).g = null;
        n nVar = (n) this.a;
        if (nVar != null) {
            nVar.p(str, j10, i3, obj, j11, j12);
        }
    }

    public void q() {
        this.a = null;
        this.b = null;
    }

    public boolean r(int i3) {
        return ((d2.t) this.a).a.get(i3);
    }

    public void s(k2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new c3.h0(this, dVar, 1));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        l6.c cVar = (l6.c) this.a;
        Bundle bundle = (Bundle) this.b;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : cVar.d(bundle).onSuccessTask(l6.d.b, ra.e.b);
    }

    public boolean u() {
        return ((a) ((p7.d) this.a).c) != null;
    }

    public void v(k.a aVar) {
        ui.f fVar = (ui.f) this.a;
        ((ActionMode.Callback) fVar.b).onDestroyActionMode(fVar.l(aVar));
        g.s sVar = (g.s) this.b;
        if (sVar.F != null) {
            sVar.f.getDecorView().removeCallbacks(sVar.G);
        }
        if (sVar.E != null) {
            l0 l0Var = sVar.H;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a10 = i0.a(sVar.E);
            a10.a(0.0f);
            sVar.H = a10;
            a10.d(new g.j(this, 2));
        }
        sVar.y = null;
        ViewGroup viewGroup = sVar.K;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        sVar.x();
    }

    public boolean w(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.b).K;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        ui.f fVar = (ui.f) this.a;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.b;
        k.e l10 = fVar.l(aVar);
        a0.l lVar = (a0.l) fVar.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(l10, menu2);
    }

    public void x(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.a;
        ei.b4 b4Var = (ei.b4) this.b;
        r9 r9Var = b4Var.e;
        r9.C1 = f10;
        q9 q9Var = r9Var.A0;
        if (q9Var != null) {
            q9Var.setSpeed(f10);
        }
        j4.Y(b4Var.x, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void y(Object obj) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new r1(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public void z(z3 z3Var) {
        d dVar;
        z3 z3Var2;
        int i3;
        Log.d("CAST_CONTROLLER", "set current media");
        p7.d dVar2 = (p7.d) this.a;
        z3 z3Var3 = (z3) dVar2.d;
        if (d1.f.u()) {
            if (z3Var3 == null && z3Var == null) {
                return;
            }
            if (z3Var3 != null) {
                ArrayList arrayList = z3Var3.a;
                if (z3Var != null && arrayList.size() == z3Var.a.size()) {
                    for (0; i3 < arrayList.size(); i3 + 1) {
                        f c2 = z3Var3.c(i3);
                        f c10 = z3Var.c(i3);
                        i3 = ((c2 == null && c10 == null) || (c2 != null && c10 != null && Objects.equals(c2.a, c10.a) && Objects.equals(c2.b, c10.b) && Objects.equals(c2.c, c10.c) && Objects.equals(c2.d, c10.d) && c2.e == c10.e && c2.f == c10.f)) ? i3 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) dVar2.c) != null && z3Var != null) {
            dVar2.g(z3Var);
        }
        if (((a) dVar2.c) != null && (z3Var2 = (z3) dVar2.d) != null) {
            dVar2.C(z3Var2);
        }
        if (z3Var != null && z3Var.a.size() > 0 && !z3Var.c(0).a.startsWith("audio/") && (dVar = (d) dVar2.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) dVar2.c;
        if (aVar != null && z3Var != null) {
            aVar.d = z3Var;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        dVar2.d = z3Var;
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.a;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.b;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", false))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10) {
        this.b = obj;
        this.a = obj2;
    }

    public b(Context context, p3 p3Var) {
        i iVar = new i(2);
        try {
            n5.s.b(context);
            iVar.c = n5.s.a().c(l5.a.e).a("PLAY_BILLING_LIBRARY", new k5.c("proto"), new ra.e(6));
        } catch (Throwable unused) {
            iVar.b = true;
        }
        this.b = iVar;
        this.a = p3Var;
    }

    public b(int i3) {
        switch (i3) {
            case 2:
                break;
            case 7:
                this.a = ByteBuffer.allocateDirect(500);
                break;
            default:
                f6.a c2 = f6.a.c(t0.b);
                s0.b bVar = new s0.b(18);
                c2.getClass();
                m.d("Must be called from the main thread.");
                f6.g gVar = c2.c;
                gVar.getClass();
                boolean z10 = false;
                try {
                    f6.y yVar = gVar.a;
                    f6.j jVar = new f6.j(bVar);
                    Parcel P0 = yVar.P0();
                    com.google.android.gms.internal.cast.u.d(P0, jVar);
                    yVar.T0(P0, 4);
                } catch (RemoteException e10) {
                    f6.g.c.a(e10, "Unable to call %s on %s.", "addCastStateListener", f6.y.class.getSimpleName());
                }
                this.a = new p7.d(14, z10);
                f6.g b10 = c2.b();
                this.b = b10;
                b10.a(this);
                C(b10.c());
                break;
        }
    }

    public b(Context context) {
        i2.p pVar = new i2.p();
        this.a = context.getApplicationContext();
        this.b = pVar;
    }

    public b(Handler handler, c3.i0 i0Var) {
        if (i0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = i0Var;
    }

    public b(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    @Override // l4.a0
    public void b(g2.l0 l0Var, e3.q qVar, f0 f0Var) {
    }
}
