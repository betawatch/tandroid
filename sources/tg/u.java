package tg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.m80;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((j01) this.b).run();
                break;
            case 1:
                ((l2) this.b).onBackPressed();
                break;
            case 2:
                ((m80) this.b).performClick();
                break;
            case 3:
                ug.h1 h1Var = (ug.h1) this.b;
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(h1Var.p2, null, "profile", null);
                break;
            case 4:
                final wg.g0 g0Var = (wg.g0) this.b;
                yg.a aVar = g0Var.M2;
                if (!aVar.a.R) {
                    aVar.b(true);
                    String str = g0Var.N2;
                    final int i7 = 0;
                    x10 x10Var = new x10() { // from class: wg.f0
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj) {
                            switch (i7) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.M2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.b, g0Var3.J0, new e0(g0Var3, 0));
                                    break;
                            }
                        }
                    };
                    final int i10 = 1;
                    x10 x10Var2 = new x10() { // from class: wg.f0
                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj) {
                            switch (i10) {
                                case 0:
                                    g0 g0Var2 = g0Var;
                                    g0Var2.M2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new e0(g0Var2, 1), 200L);
                                    break;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.b, g0Var3.J0, new e0(g0Var3, 0));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(x10Var2, x10Var, 0), 2);
                    break;
                }
                break;
            case 5:
                ((wg.j0) this.b).dismiss();
                break;
            default:
                ((wg.b0) ((xg.e) this.b)).r.dismiss();
                break;
        }
    }
}
