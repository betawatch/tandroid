package tg;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ln0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a10;
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ln0 ln0Var = (ln0) this.d;
                c2 c2Var = (c2) this.e;
                f2Var.H = true;
                f2Var.I = (c2[]) arrayList.toArray(new c2[0]);
                ln0Var.a(c2Var);
                return;
            case 1:
                f2 f2Var2 = (f2) this.b;
                TLObject tLObject = (TLObject) this.c;
                d2 d2Var = (d2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    f2Var2.h();
                    f2Var2.n(tL_error);
                    return;
                }
                f2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                d2Var.e = si.a0(tL_messageMediaDocument.document, d2Var.c);
                d2Var.f = tL_messageMediaDocument;
                f2Var2.a();
                return;
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                z10 z10Var = (z10) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                z10 z10Var2 = (z10) this.e;
                if (tL_error2 != null) {
                    z10Var.a(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                        z10Var2.a((TLRPC.payments_GiveawayInfo) tLObject2);
                        return;
                    }
                    return;
                }
            case 3:
                xi.e eVar = (xi.e) this.b;
                ((ArrayDeque) eVar.a).addLast(new xi.d((ki.e) this.c, (xi.a) this.d, (RequestTimeDelegate) this.e));
                eVar.G();
                return;
            default:
                zi.u uVar = (zi.u) this.b;
                zi.n0 n0Var = (zi.n0) this.c;
                zi.n0 n0Var2 = (zi.n0) this.d;
                Handler handler = (Handler) this.e;
                if (uVar.r0 && uVar.W == 0 && uVar.T) {
                    uVar.N.g(uVar.L, uVar.D, false);
                    uVar.U = false;
                    uVar.V = false;
                    uVar.c0 = 0.0f;
                    uVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    uVar.X = elapsedRealtimeNanos;
                    uVar.Y = elapsedRealtimeNanos;
                    uVar.d0 = n0Var;
                    uVar.e0 = n0Var2;
                    String[] strArr = zi.w0.a;
                    synchronized (zi.w0.class) {
                        zi.w0.b();
                        if (n0Var == n0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a10 = zi.w0.a(n0Var == zi.n0.b ? 0 : 1);
                    }
                    uVar.b0 = a10;
                    uVar.Z = ((Math.max(ns.n3, Math.min(ns.X4, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    uVar.a0 = (r1 - r2) * 1000000;
                    uVar.i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + uVar.b0 + ", targetBlurRadiusPx=" + (((uVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((uVar.Z + uVar.a0) / 1000000));
                    uVar.Q = -1L;
                    handler.removeCallbacks(uVar.y0);
                    handler.post(uVar.y0);
                    return;
                }
                return;
        }
    }
}
