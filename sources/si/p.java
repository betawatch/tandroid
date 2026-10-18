package si;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.xc;
import yh.h1;
import yh.m2;
import yh.p2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2;
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                l0 l0Var = (l0) this.c;
                l0 l0Var2 = (l0) this.d;
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
                    uVar.d0 = l0Var;
                    uVar.e0 = l0Var2;
                    String[] strArr = t0.a;
                    synchronized (t0.class) {
                        t0.b();
                        if (l0Var == l0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a2 = t0.a(l0Var == l0.b ? 0 : 1);
                    }
                    uVar.b0 = a2;
                    uVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    uVar.a0 = (r1 - r2) * 1000000;
                    uVar.i.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + uVar.b0 + ", targetBlurRadiusPx=" + (((uVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((uVar.Z + uVar.a0) / 1000000));
                    uVar.Q = -1L;
                    handler.removeCallbacks(uVar.x0);
                    handler.post(uVar.x0);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                        callback2.run((TLRPC.payments_GiveawayInfo) tLObject);
                        return;
                    }
                    return;
                }
            default:
                final m2 m2Var = (m2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                h1 h1Var = (h1) this.d;
                final View view = (View) this.e;
                is0 is0Var = m2Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.n(savedStarGift, z11, false)) {
                    new p2(m2Var.getContext(), is0Var.c, savedStarGift, m2Var.c, new Utilities.Callback0Return() { // from class: yh.f2
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f.u0(0);
                            return xc.a0(m2Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z10) {
                    org.telegram.messenger.g0.q(R.string.Gift2Unpinned, xc.a0(is0Var.a), R.raw.ic_unpin, 36);
                } else {
                    xc.a0(is0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((h1) view).c(z11, true);
                m2Var.f.u0(0);
                return;
        }
    }
}
