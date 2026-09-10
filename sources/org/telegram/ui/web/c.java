package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.p20;
import org.telegram.ui.uu0;
import org.telegram.ui.vg;
import pg.t2;
import xh.c3;
import xh.n7;
import xh.p7;
import xh.w3;
import xh.y5;
import xh.z7;
import zh.d7;
import zh.i4;
import zh.u7;
import zh.y6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.p2 R;
        org.telegram.ui.ActionBar.p2 R2;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new a(lVar));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                break;
            case 1:
                ((uu0) this.b).run();
                break;
            case 2:
                ((t2) this.b).onBackPressed();
                break;
            case 3:
                ((vg) this.b).run();
                break;
            case 4:
                ((m90) this.b).performClick();
                break;
            case 5:
                qg.m1 m1Var = (qg.m1) this.b;
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(m1Var.t0, null, "profile", null);
                break;
            case 6:
                final sg.h0 h0Var = (sg.h0) this.b;
                ug.a aVar = h0Var.Q0;
                if (!aVar.a.N) {
                    aVar.b(true);
                    String str = h0Var.R0;
                    final int i10 = 0;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: sg.g0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i10) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(h0Var2, 1), 200L);
                                    break;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    final int i11 = 1;
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: sg.g0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            switch (i11) {
                                case 0:
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(h0Var2, 1), 200L);
                                    break;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new sg.o(callback2, callback, 0), 2);
                    break;
                }
                break;
            case 7:
                ((sg.k0) this.b).dismiss();
                break;
            case 8:
                ((sg.b0) ((tg.e) this.b)).r.dismiss();
                break;
            case 9:
                Runnable runnable = ((wg.c) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                ((wh.c) this.b).dismiss();
                break;
            case 11:
                ((wh.d0) this.b).dismiss();
                break;
            case 12:
                if (((wh.p1) this.b).f0.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    R.showAsSheet(new z7(), n2Var);
                    break;
                }
                break;
            case 13:
                ((xh.t) this.b).dismiss();
                break;
            case 14:
                ((xh.e0) this.b).dismiss();
                break;
            case 15:
                xh.i0 i0Var = (xh.i0) this.b;
                yf.b bVar = i0Var.E.a;
                yf.b bVar2 = yf.b.b;
                if (bVar == bVar2) {
                    bVar2 = yf.b.a;
                }
                i0Var.n(yf.a.i(0L, bVar2), true, false, true);
                i0Var.c.setText("");
                break;
            case 16:
                ((xh.s0) this.b).dismiss();
                break;
            case 17:
                ((xh.r1) this.b).run();
                break;
            case 18:
                ((xh.r1) this.b).run();
                break;
            case 19:
                c3 c3Var = (c3) this.b;
                c3Var.getClass();
                new p7(c3Var.b, c3Var.g).show();
                break;
            case 20:
                ((w3) this.b).dismiss();
                break;
            case 21:
                ((y5) this.b).run();
                break;
            case 22:
                if (((n7) ((p20) this.b).d).f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                    n2Var2.a = true;
                    R2.showAsSheet(new z7(), n2Var2);
                    break;
                }
                break;
            case 23:
                yg.c0 c0Var = (yg.c0) this.b;
                if (c0Var.k) {
                    c0Var.d();
                    break;
                }
                break;
            case 24:
                ((zh.o1) this.b).q(!r6.f0, true);
                break;
            case 25:
                ((u7) this.b).N();
                break;
            case 26:
                ((i4) this.b).dismiss();
                org.telegram.ui.ActionBar.p2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new qg.a1(R3, 14, false));
                    break;
                }
                break;
            case 27:
                y6 y6Var = (y6) this.b;
                y6Var.onClick(y6Var.b);
                break;
            default:
                d7 d7Var = (d7) this.b;
                d7Var.b.u1.animate().alpha(0.0f).setDuration(150L).setListener(new zh.n7(d7Var, 0)).start();
                break;
        }
    }
}
