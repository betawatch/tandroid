package p4;

import a8.ia;
import a8.ka;
import a8.q7;
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
import c8.s9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.df;
import org.telegram.messenger.qs;
import org.telegram.messenger.re;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.r31;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class d0 {
    public static final m1 B = new m1(1);
    public static final g9.u C = ka.a(new d3.q(5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final b0 c;
    public final a0 d;
    public final pb.b e;
    public final Context f;
    public final c1 g;
    public final m0 h;
    public final String i;
    public final n1 j;
    public final x k;
    public final Handler l;
    public final h2.d m;
    public final y n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final h9.i0 r;
    public e1 s;
    public g1 t;
    public df u;
    public boolean v;
    public final long w;
    public boolean x;
    public final h9.i0 y;
    public final h9.i0 z;

    public d0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, pb.b bVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z9, boolean z10) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.a + "]");
        this.k = xVar;
        this.f = context;
        this.i = str2;
        this.y = i0Var;
        this.z = i0Var2;
        this.r = i0Var3;
        this.e = bVar;
        this.A = bundle2;
        this.m = dVar;
        this.p = z9;
        this.q = z10;
        c1 c1Var2 = new c1(this);
        this.g = c1Var2;
        this.o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.l = handler;
        this.s = e1.H;
        this.c = new b0(this, A0);
        this.d = new a0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.b = build;
        m0 m0Var = new m0(this, build, handler, bundle, z9, i0Var, i0Var2, t.e, t.f, bundle2);
        this.h = m0Var;
        this.j = new n1(Process.myUid(), context.getPackageName(), c1Var2, bundle, ((q4.l) m0Var.n.b).c.b);
        g1 g1Var = new g1(c1Var);
        this.t = g1Var;
        h2.m0.W(handler, new org.telegram.ui.web.s(10, this, g1Var));
        this.w = 3000L;
        this.n = new y(this, 2);
        h2.m0.W(handler, new y(this, 3));
    }

    public static void a(d0 d0Var) {
        synchronized (d0Var.a) {
            try {
                if (d0Var.v) {
                    return;
                }
                l1 R0 = d0Var.t.R0();
                if (!d0Var.c.hasMessages(1)) {
                    l1 l1Var = d0Var.s.c;
                    e2.b1 b1Var = R0.a;
                    int i7 = b1Var.b;
                    e2.b1 b1Var2 = l1Var.a;
                    if (i7 == b1Var2.b && b1Var.e == b1Var2.e && b1Var.h == b1Var2.h && b1Var.i == b1Var2.i) {
                        ui.e eVar = d0Var.g.b;
                        h9.i0 w10 = eVar.w();
                        for (int i10 = 0; i10 < w10.size(); i10++) {
                            v vVar = (v) w10.get(i10);
                            eVar.A(vVar);
                            d0Var.c(vVar, new z(R0, eVar.G(vVar, 16), eVar.G(vVar, 17), vVar));
                        }
                        try {
                            d0Var.h.j.b(0, R0, true, true, 0);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                d0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(v vVar) {
        return vVar != null && Objects.equals(vVar.a.a.a, "com.android.systemui");
    }

    public final boolean b(KeyEvent keyEvent, boolean z9, boolean z10) {
        e eVar;
        v e10 = this.k.a.e();
        if (e10 == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z9) {
            keyCode = 87;
        }
        if (keyCode != 79) {
            if (keyCode == 126) {
                eVar = new e(this, e10, 9);
            } else if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case qs.W0 /* 85 */:
                                break;
                            case qs.X0 /* 86 */:
                                eVar = new e(this, e10, 6);
                                break;
                            case qs.Y0 /* 87 */:
                                break;
                            case qs.Z0 /* 88 */:
                                break;
                            case qs.a1 /* 89 */:
                                eVar = new e(this, e10, 5);
                                break;
                            case qs.b1 /* 90 */:
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
            h2.m0.W(this.l, new xn(this, z10, e10, eVar, 15));
            return true;
        }
        eVar = this.t.u() ? new e(this, e10, 7) : new e(this, e10, 8);
        h2.m0.W(this.l, new xn(this, z10, e10, eVar, 15));
        return true;
    }

    public final void c(v vVar, c0 c0Var) {
        int i7;
        c1 c1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.s C2 = c1Var.b.C(vVar);
            if (C2 != null) {
                i7 = C2.e();
            } else if (!h(vVar)) {
                return;
            } else {
                i7 = 0;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                c0Var.b(uVar, i7);
            }
        } catch (DeadObjectException unused) {
            c1Var.b.T(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(c0 c0Var) {
        h9.i0 w10 = this.g.b.w();
        for (int i7 = 0; i7 < w10.size(); i7++) {
            c((v) w10.get(i7), c0Var);
        }
        try {
            c0Var.b(this.h.j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 w10 = this.g.b.w();
        for (int i7 = 0; i7 < w10.size(); i7++) {
            v vVar = (v) w10.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.c.a(false, false);
        d(new n3(y0Var, 7));
        try {
            re reVar = this.h.j;
            e2.o oVar = this.s.s;
            reVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z9) {
        if (o()) {
            boolean z10 = this.t.p0(16) && this.t.w() != null;
            boolean z11 = this.t.p0(31) || this.t.p0(20);
            v s5 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ia.p(!false);
            sparseBooleanArray.append(1, true);
            ia.p(!false);
            e2.y0 y0Var = new e2.y0(new e2.s(sparseBooleanArray));
            if (z10 || !z11) {
                if (!z10) {
                    h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                h2.m0.J(this.t);
                if (z9) {
                    p(s5);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            m9.v vVar2 = new m9.v();
            vVar2.n(unsupportedOperationException);
            vVar2.b(new m9.u(0, vVar2, new androidx.activity.n(this, s5, z9, y0Var)), new l2.g0(this, 2));
        }
    }

    public final boolean h(v vVar) {
        return this.g.b.D(vVar) || this.h.g.D(vVar);
    }

    public final boolean i(v vVar) {
        return Objects.equals(vVar.a.a.a, this.f.getPackageName()) && vVar.b != 0 && new Bundle(vVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z9;
        synchronized (this.a) {
            z9 = this.v;
        }
        return z9;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.e.getClass();
        return pb.b.e1(list);
    }

    public final t m(v vVar) {
        h9.i0 i0Var;
        boolean z9 = this.x;
        h9.i0 i0Var2 = null;
        m0 m0Var = this.h;
        if (z9 && k(vVar)) {
            m0Var.getClass();
            j1 j1Var = t.e;
            j1 j1Var2 = m0Var.x;
            j1Var2.getClass();
            e2.y0 y0Var = m0Var.y;
            y0Var.getClass();
            if (m0Var.w.isEmpty()) {
                h9.i0 i0Var3 = m0Var.v;
                h9.i0 q10 = i0Var3 == null ? null : h9.i0.q(i0Var3);
                i0Var = null;
                i0Var2 = q10;
            } else {
                h9.i0 i0Var4 = m0Var.w;
                i0Var = i0Var4 == null ? null : h9.i0.q(i0Var4);
            }
            return new t(j1Var2, y0Var, i0Var2, i0Var);
        }
        this.e.getClass();
        e2.y0 y0Var2 = t.f;
        j1 j1Var3 = t.e;
        t tVar = new t(j1Var3, y0Var2, null, null);
        if (i(vVar)) {
            this.x = true;
            x xVar = this.k;
            h9.i0 i0Var5 = xVar.a.z;
            if (i0Var5.isEmpty()) {
                m0Var.v = xVar.a.y;
            } else {
                m0Var.w = i0Var5;
                m0Var.o0();
            }
            d0 d0Var = m0Var.h;
            int i7 = 0;
            boolean z10 = m0Var.y.a(17) != y0Var2.a(17);
            m0Var.x = j1Var3;
            m0Var.y = y0Var2;
            if (!m0Var.w.isEmpty()) {
                m0Var.o0();
            }
            if (z10) {
                h2.m0.W(d0Var.l, new h0(m0Var, d0Var.t, i7));
                return tVar;
            }
            m0Var.p0(d0Var.t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.e.getClass();
        return s9.b(new m1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        try {
            return ((Boolean) q7.a(new n3(this, 6)).b.get()).booleanValue();
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
        return h2.m0.g0(pb.b.e1(list), new m9.q() { // from class: p4.s
            @Override // m9.q, v5.e
            public final m9.y apply(Object obj) {
                return s9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.a + "] [" + e2.m0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                r31 r31Var = a0Var.a;
                if (r31Var != null) {
                    a0Var.removeCallbacks(r31Var);
                    a0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    h2.m0.W(this.l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                m0 m0Var = this.h;
                ComponentName componentName = m0Var.p;
                d0 d0Var = m0Var.h;
                q4.q qVar = m0Var.n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d0Var.b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(d0Var.f, 0, intent, m0.z));
                    }
                }
                androidx.mediarouter.app.f fVar = m0Var.o;
                if (fVar != null) {
                    d0Var.f.unregisterReceiver(fVar);
                }
                b bVar = m0Var.m;
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
                c1 c1Var = this.g;
                Set set = c1Var.c;
                ui.e eVar = c1Var.b;
                h9.i0 w10 = eVar.w();
                int size = w10.size();
                while (i10 < size) {
                    Object obj = w10.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    eVar.T(vVar);
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
                c1Var.a.clear();
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
