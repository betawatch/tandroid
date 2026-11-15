package t5;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.logging.Logger;
import l5.g;
import o5.h;
import o5.i;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.km;
import org.telegram.ui.ln0;
import p5.e;
import tg.b2;
import tg.c2;
import tg.e2;
import xi.d;
import zi.n0;
import zi.u;
import zi.w0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
                b bVar = (b) this.b;
                i iVar = (i) this.c;
                String str = iVar.a;
                g gVar = (g) this.d;
                h hVar = (h) this.e;
                bVar.getClass();
                Logger logger = b.f;
                try {
                    e a11 = bVar.c.a(str);
                    if (a11 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.a(new IllegalArgumentException(str2));
                    } else {
                        ((v5.g) bVar.e).f(new km(bVar, iVar, ((m5.c) a11).a(hVar), 12));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.a(e10);
                    return;
                }
            case 1:
                e2 e2Var = (e2) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ln0 ln0Var = (ln0) this.d;
                b2 b2Var = (b2) this.e;
                e2Var.H = true;
                e2Var.I = (b2[]) arrayList.toArray(new b2[0]);
                ln0Var.a(b2Var);
                return;
            case 2:
                e2 e2Var2 = (e2) this.b;
                TLObject tLObject = (TLObject) this.c;
                c2 c2Var = (c2) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    e2Var2.h();
                    e2Var2.n(tL_error);
                    return;
                }
                e2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                c2Var.e = si.a0(tL_messageMediaDocument.document, c2Var.c);
                c2Var.f = tL_messageMediaDocument;
                e2Var2.a();
                return;
            case 3:
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
            case 4:
                xi.e eVar = (xi.e) this.b;
                ((ArrayDeque) eVar.a).addLast(new d((ki.e) this.c, (xi.a) this.d, (RequestTimeDelegate) this.e));
                eVar.G();
                return;
            default:
                u uVar = (u) this.b;
                n0 n0Var = (n0) this.c;
                n0 n0Var2 = (n0) this.d;
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
                    String[] strArr = w0.a;
                    synchronized (w0.class) {
                        w0.b();
                        if (n0Var == n0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a10 = w0.a(n0Var == n0.b ? 0 : 1);
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
