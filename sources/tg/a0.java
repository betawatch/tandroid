package tg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.j80;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((e21) this.b).run();
                break;
            case 1:
                ((o2) this.b).onBackPressed();
                break;
            case 2:
                ((j80) this.b).performClick();
                break;
            case 3:
                ug.h1 h1Var = (ug.h1) this.b;
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(h1Var.p2, null, "profile", null);
                break;
            case 4:
                final wg.f0 f0Var = (wg.f0) this.b;
                yg.a aVar = f0Var.M2;
                if (!aVar.a.R) {
                    aVar.b(true);
                    String str = f0Var.N2;
                    final int i7 = 0;
                    w10 w10Var = new w10() { // from class: wg.e0
                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj) {
                            switch (i7) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    f0Var2.M2.b(false);
                                    f0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new d0(f0Var2, 1), 200L);
                                    break;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) f0Var3.b, f0Var3.J0, new d0(f0Var3, 0));
                                    break;
                            }
                        }
                    };
                    final int i10 = 1;
                    w10 w10Var2 = new w10() { // from class: wg.e0
                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj) {
                            switch (i10) {
                                case 0:
                                    f0 f0Var2 = f0Var;
                                    f0Var2.M2.b(false);
                                    f0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new d0(f0Var2, 1), 200L);
                                    break;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) f0Var3.b, f0Var3.J0, new d0(f0Var3, 0));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(w10Var2, w10Var, 0), 2);
                    break;
                }
                break;
            case 5:
                ((wg.i0) this.b).dismiss();
                break;
            default:
                ((wg.a0) ((xg.e) this.b)).r.dismiss();
                break;
        }
    }
}
