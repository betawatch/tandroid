package vg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(h1Var.m2, null, "profile", null);
                break;
            case 1:
                final xg.g0 g0Var = (xg.g0) this.b;
                zg.a aVar = g0Var.J2;
                if (!aVar.a.R) {
                    aVar.b(true);
                    String str = g0Var.K2;
                    final int i3 = 0;
                    u10 u10Var = new u10() { // from class: xg.f0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            switch (i3) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.J2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.J2.b(false);
                                    j.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.b, g0Var3.J0, new e0(g0Var3, 0));
                                    break;
                            }
                        }
                    };
                    final int i10 = 1;
                    u10 u10Var2 = new u10() { // from class: xg.f0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            switch (i10) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.J2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.J2.b(false);
                                    j.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.b, g0Var3.J0, new e0(g0Var3, 0));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new xg.p(u10Var2, u10Var, 0), 2);
                    break;
                }
                break;
            case 2:
                ((xg.j0) this.b).dismiss();
                break;
            default:
                ((xg.b0) ((yg.e) this.b)).r.dismiss();
                break;
        }
    }
}
