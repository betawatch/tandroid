package si;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.vp0;
import yh.g1;
import yh.l2;
import yh.o2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2;
        String str = null;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                m0 m0Var = (m0) this.c;
                m0 m0Var2 = (m0) this.d;
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
                    String[] strArr = v0.a;
                    synchronized (v0.class) {
                        v0.b();
                        if (m0Var == m0Var2) {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                        a2 = v0.a(m0Var == m0.b ? 0 : 1);
                    }
                    tVar.b0 = a2;
                    tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    tVar.a0 = (r1 - r3) * 1000000;
                    tVar.i.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + tVar.b0 + ", targetBlurRadiusPx=" + (((tVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.a0) / 1000000));
                    tVar.Q = -1L;
                    handler.removeCallbacks(tVar.x0);
                    handler.post(tVar.x0);
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
            case 2:
                final l2 l2Var = (l2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                g1 g1Var = (g1) this.d;
                final View view = (View) this.e;
                ns0 ns0Var = l2Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    g1Var.i(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = l2Var.e.h(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(l2Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (l2Var.e.o(savedStarGift, z11, false)) {
                    new o2(l2Var.getContext(), ns0Var.c, savedStarGift, l2Var.c, new Utilities.Callback0Return() { // from class: yh.e2
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((g1) view).d(z11, true);
                            l2 l2Var2 = l2.this;
                            l2Var2.f.u0(0);
                            return xc.a0(l2Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z10) {
                    org.telegram.messenger.v0.p(R.string.Gift2Unpinned, xc.a0(ns0Var.a), R.raw.ic_unpin, 36);
                } else {
                    xc.a0(ns0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((g1) view).d(z11, true);
                l2Var.f.u0(0);
                return;
            case 3:
                e71 e71Var = (e71) this.b;
                zh.b0 b0Var = (zh.b0) this.c;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                if (zh.b0.d(e71Var.getParentActivity())) {
                    b0Var.e();
                    vp0 vp0Var = new vp0(10, false, false, null);
                    vp0Var.G = 1;
                    vp0Var.H = false;
                    vp0Var.x = false;
                    vp0Var.V = new zh.y(callbackReturn, e71Var, callback3);
                    e71Var.presentFragment(vp0Var);
                    return;
                }
                return;
            default:
                String str2 = (String) this.b;
                Utilities.CallbackReturn callbackReturn2 = (Utilities.CallbackReturn) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                try {
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str2, null, realScreenSize.x, realScreenSize.y, true);
                    if (loadBitmap != null) {
                        str = zh.b0.l(loadBitmap, callbackReturn2);
                        loadBitmap.recycle();
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                AndroidUtilities.runOnUIThread(new zh.x(o2Var, str, callback4));
                return;
        }
    }
}
