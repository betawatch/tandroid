package ui;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import wi.m0;
import wi.s;
import wi.u0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
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
                f fVar = (f) this.b;
                ((ArrayDeque) fVar.b).addLast(new e((l5.b) this.c, (a) this.d, (RequestTimeDelegate) this.e));
                fVar.I();
                return;
            case 1:
                s sVar = (s) this.b;
                m0 m0Var = (m0) this.c;
                m0 m0Var2 = (m0) this.d;
                Handler handler = (Handler) this.e;
                if (sVar.r0 && sVar.W == 0 && sVar.T) {
                    sVar.N.g(sVar.L, sVar.D, false);
                    sVar.U = false;
                    sVar.V = false;
                    sVar.c0 = 0.0f;
                    sVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    sVar.X = elapsedRealtimeNanos;
                    sVar.Y = elapsedRealtimeNanos;
                    sVar.d0 = m0Var;
                    sVar.e0 = m0Var2;
                    String[] strArr = u0.a;
                    synchronized (u0.class) {
                        u0.b();
                        if (m0Var == m0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a10 = u0.a(m0Var == m0.b ? 0 : 1);
                    }
                    sVar.b0 = a10;
                    sVar.Z = ((Math.max(hs.n3, Math.min(hs.X4, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    sVar.a0 = (r4 - r5) * 1000000;
                    sVar.i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + sVar.b0 + ", targetBlurRadiusPx=" + (((sVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((sVar.Z + sVar.a0) / 1000000));
                    sVar.Q = -1L;
                    handler.removeCallbacks(sVar.x0);
                    handler.post(sVar.x0);
                    return;
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                u10 u10Var = (u10) this.c;
                TLObject tLObject = (TLObject) this.d;
                u10 u10Var2 = (u10) this.e;
                if (tL_error != null) {
                    u10Var.a(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                        u10Var2.a((TLRPC.payments_GiveawayInfo) tLObject);
                        return;
                    }
                    return;
                }
        }
    }
}
