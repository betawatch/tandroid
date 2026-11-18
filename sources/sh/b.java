package sh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.k80;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.af;
import tg.k2;
import ug.i1;
import wg.b0;
import wg.g0;
import wg.j0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((af) this.b).run();
                break;
            case 1:
                ((h01) this.b).run();
                break;
            case 2:
                ((k2) this.b).onBackPressed();
                break;
            case 3:
                ((k80) this.b).performClick();
                break;
            case 4:
                i1 i1Var = (i1) this.b;
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(i1Var.p2, null, "profile", null);
                break;
            case 5:
                final g0 g0Var = (g0) this.b;
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
            case 6:
                ((j0) this.b).dismiss();
                break;
            default:
                ((b0) ((xg.e) this.b)).r.dismiss();
                break;
        }
    }
}
