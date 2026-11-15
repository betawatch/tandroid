package tg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((l2) this.b).onBackPressed();
                break;
            case 1:
                ((z70) this.b).performClick();
                break;
            case 2:
                ug.g1 g1Var = (ug.g1) this.b;
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(g1Var.p2, null, "profile", null);
                break;
            case 3:
                final wg.e0 e0Var = (wg.e0) this.b;
                yg.a aVar = e0Var.M2;
                if (!aVar.a.R) {
                    aVar.b(true);
                    String str = e0Var.N2;
                    final int i7 = 0;
                    z10 z10Var = new z10() { // from class: wg.d0
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj) {
                            switch (i7) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    e0Var2.M2.b(false);
                                    e0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new c0(e0Var2, 1), 200L);
                                    break;
                                default:
                                    e0 e0Var3 = e0Var;
                                    e0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) e0Var3.b, e0Var3.J0, new c0(e0Var3, 0));
                                    break;
                            }
                        }
                    };
                    final int i10 = 1;
                    z10 z10Var2 = new z10() { // from class: wg.d0
                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj) {
                            switch (i10) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    e0Var2.M2.b(false);
                                    e0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new c0(e0Var2, 1), 200L);
                                    break;
                                default:
                                    e0 e0Var3 = e0Var;
                                    e0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) e0Var3.b, e0Var3.J0, new c0(e0Var3, 0));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(z10Var2, z10Var, 0), 2);
                    break;
                }
                break;
            case 4:
                ((wg.h0) this.b).dismiss();
                break;
            default:
                ((wg.z) ((xg.f) this.b)).r.dismiss();
                break;
        }
    }
}
