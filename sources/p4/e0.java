package p4;

import a8.bb;
import a8.la;
import a8.t7;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import c8.t9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.cf;
import org.telegram.messenger.ls;
import org.telegram.messenger.qe;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class e0 {
    public static final o1 B = new o1(1);
    public static final g9.t C = bb.a(new d3.p(5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final c0 c;
    public final b0 d;
    public final w7.s e;
    public final Context f;
    public final e1 g;
    public final n0 h;
    public final String i;
    public final p1 j;
    public final x k;
    public final Handler l;
    public final h2.d m;
    public final y n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final h9.i0 r;
    public g1 s;
    public i1 t;
    public cf u;
    public boolean v;
    public final long w;
    public boolean x;
    public final h9.i0 y;
    public final h9.i0 z;

    public e0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.a + "]");
        this.k = xVar;
        this.f = context;
        this.i = str2;
        this.y = i0Var;
        this.z = i0Var2;
        this.r = i0Var3;
        this.e = sVar;
        this.A = bundle2;
        this.m = dVar;
        this.p = z10;
        this.q = z11;
        e1 e1Var = new e1(this);
        this.g = e1Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.l = handler;
        this.s = g1.H;
        this.c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.b = build;
        n0 n0Var = new n0(this, build, handler, bundle, z10, i0Var, i0Var2, t.e, t.f, bundle2);
        this.h = n0Var;
        this.j = new p1(Process.myUid(), context.getPackageName(), e1Var, bundle, ((q4.l) n0Var.n.b).c.b);
        i1 i1Var = new i1(c1Var);
        this.t = i1Var;
        h2.l0.W(handler, new u4(29, this, i1Var));
        this.w = 3000L;
        this.n = new y(this, 2);
        h2.l0.W(handler, new y(this, 3));
    }

    public static void a(e0 e0Var) {
        synchronized (e0Var.a) {
            try {
                if (e0Var.v) {
                    return;
                }
                n1 R0 = e0Var.t.R0();
                if (!e0Var.c.hasMessages(1)) {
                    n1 n1Var = e0Var.s.c;
                    e2.b1 b1Var = R0.a;
                    int i7 = b1Var.b;
                    e2.b1 b1Var2 = n1Var.a;
                    if (i7 == b1Var2.b && b1Var.e == b1Var2.e && b1Var.h == b1Var2.h && b1Var.i == b1Var2.i) {
                        ab.c0 c0Var = e0Var.g.b;
                        h9.i0 p10 = c0Var.p();
                        for (int i10 = 0; i10 < p10.size(); i10++) {
                            v vVar = (v) p10.get(i10);
                            c0Var.t(vVar);
                            e0Var.c(vVar, new a0(R0, c0Var.C(vVar, 16), c0Var.C(vVar, 17), vVar));
                        }
                        try {
                            e0Var.h.j.b(0, R0, true, true, 0);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                e0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(v vVar) {
        return vVar != null && Objects.equals(vVar.a.a.a, "com.android.systemui");
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.k.a.e();
        if (e10 == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode != 79) {
            if (keyCode == 126) {
                eVar = new e(this, e10, 9);
            } else if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case ls.W0 /* 85 */:
                                break;
                            case ls.X0 /* 86 */:
                                eVar = new e(this, e10, 6);
                                break;
                            case ls.Y0 /* 87 */:
                                break;
                            case ls.Z0 /* 88 */:
                                break;
                            case ls.a1 /* 89 */:
                                eVar = new e(this, e10, 5);
                                break;
                            case ls.b1 /* 90 */:
                                eVar = new e(this, e10, 4);
                                break;
                            default:
                                return false;
                        }
                    }
                    eVar = new e(this, e10, 3);
                }
                eVar = new e(this, e10, 2);
            } else {
                eVar = new e(this, e10, 1);
            }
            h2.l0.W(this.l, new yn(this, z11, e10, eVar, 15));
            return true;
        }
        eVar = this.t.u() ? new e(this, e10, 7) : new e(this, e10, 8);
        h2.l0.W(this.l, new yn(this, z11, e10, eVar, 15));
        return true;
    }

    public final void c(v vVar, d0 d0Var) {
        int i7;
        e1 e1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.t v = e1Var.b.v(vVar);
            if (v != null) {
                i7 = v.e();
            } else if (!h(vVar)) {
                return;
            } else {
                i7 = 0;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                d0Var.b(uVar, i7);
            }
        } catch (DeadObjectException unused) {
            e1Var.b.K(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(d0 d0Var) {
        h9.i0 p10 = this.g.b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            c((v) p10.get(i7), d0Var);
        }
        try {
            d0Var.b(this.h.j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 p10 = this.g.b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            v vVar = (v) p10.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.c.a(false, false);
        d(new org.telegram.tgnet.u(y0Var, 13));
        try {
            qe qeVar = this.h.j;
            e2.o oVar = this.s.s;
            qeVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        if (o()) {
            boolean z11 = this.t.p0(16) && this.t.w() != null;
            boolean z12 = this.t.p0(31) || this.t.p0(20);
            v s5 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            la.p(!false);
            sparseBooleanArray.append(1, true);
            la.p(!false);
            e2.y0 y0Var = new e2.y0(new e2.s(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                h2.l0.J(this.t);
                if (z10) {
                    p(s5);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            m9.v vVar2 = new m9.v();
            vVar2.n(unsupportedOperationException);
            vVar2.b(new m9.u(0, vVar2, new androidx.activity.n(this, s5, z10, y0Var)), new l2.d0(this, 2));
        }
    }

    public final boolean h(v vVar) {
        return this.g.b.A(vVar) || this.h.g.A(vVar);
    }

    public final boolean i(v vVar) {
        return Objects.equals(vVar.a.a.a, this.f.getPackageName()) && vVar.b != 0 && new Bundle(vVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.a) {
            z10 = this.v;
        }
        return z10;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.e.getClass();
        return w7.s.s0(list);
    }

    public final t m(v vVar) {
        h9.i0 i0Var;
        boolean z10 = this.x;
        h9.i0 i0Var2 = null;
        n0 n0Var = this.h;
        if (z10 && k(vVar)) {
            n0Var.getClass();
            l1 l1Var = t.e;
            l1 l1Var2 = n0Var.x;
            l1Var2.getClass();
            e2.y0 y0Var = n0Var.y;
            y0Var.getClass();
            if (n0Var.w.isEmpty()) {
                h9.i0 i0Var3 = n0Var.v;
                h9.i0 q10 = i0Var3 == null ? null : h9.i0.q(i0Var3);
                i0Var = null;
                i0Var2 = q10;
            } else {
                h9.i0 i0Var4 = n0Var.w;
                i0Var = i0Var4 == null ? null : h9.i0.q(i0Var4);
            }
            return new t(l1Var2, y0Var, i0Var2, i0Var);
        }
        this.e.getClass();
        e2.y0 y0Var2 = t.f;
        l1 l1Var3 = t.e;
        t tVar = new t(l1Var3, y0Var2, null, null);
        if (i(vVar)) {
            this.x = true;
            x xVar = this.k;
            h9.i0 i0Var5 = xVar.a.z;
            if (i0Var5.isEmpty()) {
                n0Var.v = xVar.a.y;
            } else {
                n0Var.w = i0Var5;
                n0Var.o0();
            }
            e0 e0Var = n0Var.h;
            int i7 = 0;
            boolean z11 = n0Var.y.a(17) != y0Var2.a(17);
            n0Var.x = l1Var3;
            n0Var.y = y0Var2;
            if (!n0Var.w.isEmpty()) {
                n0Var.o0();
            }
            if (z11) {
                h2.l0.W(e0Var.l, new i0(n0Var, e0Var.t, i7));
                return tVar;
            }
            n0Var.p0(e0Var.t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.e.getClass();
        return t9.b(new o1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        try {
            return ((Boolean) t7.a(new org.telegram.tgnet.u(this, 12)).b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void p(v vVar) {
        s(vVar);
        this.e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.e.getClass();
        return h2.l0.g0(w7.s.s0(list), new m9.q() { // from class: p4.s
            @Override // m9.q, v5.e
            public final m9.y apply(Object obj) {
                return t9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.a + "] [" + e2.m0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                es0 es0Var = b0Var.a;
                if (es0Var != null) {
                    b0Var.removeCallbacks(es0Var);
                    b0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    h2.l0.W(this.l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                n0 n0Var = this.h;
                ComponentName componentName = n0Var.p;
                e0 e0Var = n0Var.h;
                q4.q qVar = n0Var.n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", e0Var.b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(e0Var.f, 0, intent, n0.z));
                    }
                }
                androidx.mediarouter.app.f fVar = n0Var.o;
                if (fVar != null) {
                    e0Var.f.unregisterReceiver(fVar);
                }
                b bVar = n0Var.m;
                if (bVar != null && !bVar.f.getAndSet(true)) {
                    bVar.c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.b;
                MediaSession mediaSession = lVar.a;
                lVar.f.kill();
                if (i7 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e11) {
                        h2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                    }
                }
                mediaSession.setCallback(null);
                lVar.b.a.clear();
                mediaSession.release();
                e1 e1Var = this.g;
                Set set = e1Var.c;
                ab.c0 c0Var = e1Var.b;
                h9.i0 p10 = c0Var.p();
                int size = p10.size();
                while (i10 < size) {
                    Object obj = p10.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    c0Var.K(vVar);
                    u uVar = vVar.d;
                    if (uVar != null) {
                        uVar.g();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    u uVar2 = ((v) it.next()).d;
                    if (uVar2 != null) {
                        uVar2.g();
                    }
                }
                set.clear();
                e1Var.a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        return (this.x && k(vVar) && (e10 = e()) != null) ? e10 : vVar;
    }

    public final void t() {
        Handler handler = this.l;
        y yVar = this.n;
        handler.removeCallbacks(yVar);
        if (this.q) {
            long j3 = this.w;
            if (j3 > 0) {
                if (this.t.h() || this.t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
