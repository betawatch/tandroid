package wg;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.up0;
import zh.c2;
import zh.z1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                c20 c20Var = (c20) this.c;
                TLObject tLObject = (TLObject) this.e;
                c20 c20Var2 = (c20) this.d;
                if (tL_error != null) {
                    c20Var.a(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                        c20Var2.a((TLRPC.payments_GiveawayInfo) tLObject);
                        return;
                    }
                    return;
                }
            case 1:
                wi.t tVar = (wi.t) this.b;
                wi.m0 m0Var = (wi.m0) this.c;
                wi.m0 m0Var2 = (wi.m0) this.d;
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
                    tVar.d0 = m0Var;
                    tVar.e0 = m0Var2;
                    String[] strArr = wi.u0.a;
                    synchronized (wi.u0.class) {
                        wi.u0.b();
                        if (m0Var == m0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a10 = wi.u0.a(m0Var == wi.m0.b ? 0 : 1);
                    }
                    tVar.b0 = a10;
                    tVar.Z = ((Math.max(qs.n3, Math.min(qs.X4, 300 - ((Math.max(0, a10 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.a0 = (r1 - r2) * 1000000;
                    tVar.i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + tVar.b0 + ", targetBlurRadiusPx=" + (((tVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.y0);
                    handler.post(tVar.y0);
                    return;
                }
                return;
            default:
                final z1 z1Var = (z1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                zh.y0 y0Var = (zh.y0) this.d;
                final View view = (View) this.e;
                up0 up0Var = z1Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    y0Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = z1Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(z1Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z9 = savedStarGift.pinned_to_top;
                final boolean z10 = !z9;
                if (z1Var.e.o(savedStarGift, z10, false)) {
                    new c2(z1Var.getContext(), up0Var.c, savedStarGift, z1Var.c, new u10() { // from class: zh.t1
                        @Override // org.telegram.messenger.u10
                        public final Object run() {
                            ((y0) view).d(z10, true);
                            z1 z1Var2 = z1.this;
                            z1Var2.f.v0(0);
                            return hc.a0(z1Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z9) {
                    k5.o(null, 2131749881, hc.a0(up0Var.a), R.raw.ic_unpin, 36);
                } else {
                    hc.a0(up0Var.a).I(R.raw.ic_pin, id.M0(2131750077, null), id.M0(2131750078, null)).j();
                }
                ((zh.y0) view).d(z10, true);
                z1Var.f.v0(0);
                return;
        }
    }

    public /* synthetic */ r(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, c20 c20Var2) {
        this.a = 0;
        this.b = tL_error;
        this.c = c20Var;
        this.e = tLObject;
        this.d = c20Var2;
    }
}
