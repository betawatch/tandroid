package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import c8.kb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kg.x1;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tm;
import org.telegram.ui.on0;
import tg.c2;
import tg.d2;
import tg.f2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a10;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                v vVar = (v) this.d;
                e0 e0Var = (e0) this.b;
                l lVar = (l) this.e;
                ab.c0 c0Var = e1Var.b;
                try {
                    e1Var.c.remove(vVar);
                    if (!e0Var.j()) {
                        z0 z0Var = (z0) vVar.d;
                        z0Var.getClass();
                        IBinder asBinder = z0Var.a.asBinder();
                        t m10 = e0Var.m(vVar);
                        if (c0Var.A(vVar)) {
                            h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                        }
                        c0Var.b(asBinder, vVar, m10.a, m10.b);
                        com.google.android.gms.common.api.internal.t v = c0Var.v(vVar);
                        if (v == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            i1 i1Var = e0Var.t;
                            g1 g1Var = e0Var.s;
                            e2.y0 y0Var = m10.b;
                            g1 A1 = e1Var.A1(g1Var);
                            MediaSession.Token token = ((q4.l) e0Var.h.n.b).c.b;
                            h9.i0 i0Var = m10.c;
                            if (i0Var == null) {
                                i0Var = e0Var.y;
                            }
                            h9.i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = e0Var.z;
                            }
                            h9.i0 i0Var3 = i0Var;
                            h9.i0 i0Var4 = e0Var.r;
                            l1 l1Var = m10.a;
                            e2.y0 t6 = i1Var.t();
                            q1 q1Var = e0Var.j.a;
                            q1Var.getClass();
                            j jVar = new j(e1Var, i0Var3, i0Var2, i0Var4, l1Var, y0Var, t6, new Bundle(q1Var.g), e0Var.A, A1, token);
                            if (!e0Var.j()) {
                                try {
                                    ((k) lVar).h1(v.e(), jVar.a(vVar.c));
                                    z10 = true;
                                } catch (RemoteException unused) {
                                }
                                if (z10 && (!e0Var.x || !e0.k(vVar))) {
                                    e0Var.e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    return;
                } finally {
                    if (0 == 0) {
                        kb.a(lVar);
                    }
                }
            case 1:
                e0 e0Var2 = (e0) this.b;
                m9.e0 e0Var3 = (m9.e0) this.c;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.e;
                if (e0Var2.j()) {
                    e0Var3.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var3.m(null);
                    return;
                } catch (Throwable th2) {
                    e0Var3.n(th2);
                    return;
                }
            case 2:
                e0 e0Var4 = (e0) this.b;
                b1 b1Var = (b1) this.c;
                v vVar2 = (v) this.d;
                List list = (List) this.e;
                if (e0Var4.j()) {
                    return;
                }
                b1Var.a(e0Var4.t, vVar2, list);
                return;
            case 3:
                t5.a aVar = (t5.a) this.c;
                o5.i iVar = (o5.i) this.d;
                String str = iVar.a;
                l5.g gVar = (l5.g) this.b;
                o5.h hVar = (o5.h) this.e;
                aVar.getClass();
                Logger logger = t5.a.f;
                try {
                    p5.f a11 = aVar.c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) aVar.e).f(new tm(aVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 4:
                f2 f2Var = (f2) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                on0 on0Var = (on0) this.b;
                c2 c2Var = (c2) this.e;
                f2Var.H = true;
                f2Var.I = (c2[]) arrayList.toArray(new c2[0]);
                on0Var.a(c2Var);
                return;
            case 5:
                f2 f2Var2 = (f2) this.c;
                TLObject tLObject = (TLObject) this.d;
                d2 d2Var = (d2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    f2Var2.h();
                    f2Var2.n(tL_error);
                    return;
                }
                f2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                d2Var.e = si.c0(tL_messageMediaDocument.document, d2Var.c);
                d2Var.f = tL_messageMediaDocument;
                f2Var2.a();
                return;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                y10 y10Var = (y10) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                y10 y10Var2 = (y10) this.e;
                if (tL_error2 != null) {
                    y10Var.a(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                        y10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                        return;
                    }
                    return;
                }
            case 7:
                xi.e eVar = (xi.e) this.c;
                ((ArrayDeque) eVar.a).addLast(new xi.d((x1) this.d, (xi.a) this.b, (RequestTimeDelegate) this.e));
                eVar.K();
                return;
            default:
                zi.t tVar = (zi.t) this.c;
                zi.n0 n0Var = (zi.n0) this.d;
                zi.n0 n0Var2 = (zi.n0) this.b;
                Handler handler = (Handler) this.e;
                if (tVar.r0 && tVar.W == 0 && tVar.T) {
                    tVar.N.g(tVar.L, tVar.D, false);
                    tVar.U = false;
                    tVar.V = false;
                    tVar.c0 = 0.0f;
                    tVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    tVar.X = elapsedRealtimeNanos;
                    tVar.Y = elapsedRealtimeNanos;
                    tVar.d0 = n0Var;
                    tVar.e0 = n0Var2;
                    String[] strArr = zi.v0.a;
                    synchronized (zi.v0.class) {
                        zi.v0.b();
                        if (n0Var == n0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a10 = zi.v0.a(n0Var == zi.n0.b ? 0 : 1);
                    }
                    tVar.b0 = a10;
                    tVar.Z = ((Math.max(210, Math.min(ls.X4, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.a0 = (r3 - r4) * 1000000;
                    tVar.i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + tVar.b0 + ", targetBlurRadiusPx=" + (((tVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.y0);
                    handler.post(tVar.y0);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s0(e0 e0Var, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = e0Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
