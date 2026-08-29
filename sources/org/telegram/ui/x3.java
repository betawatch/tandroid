package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((z3) this.b).G.k0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                vc vcVar = (vc) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                vcVar.A = wallPaper;
                vcVar.B = wallPaper;
                vcVar.C = wallPaper;
                vcVar.X0(false);
                vcVar.a1(false);
                AndroidUtilities.runOnUIThread(new zb(vcVar, 1), 350L);
                break;
            case 2:
                ((cq) this.b).e.O = (String) obj;
                break;
            case 3:
                jr jrVar = ((fr) this.b).d;
                jrVar.w1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.c, jrVar.n0);
                break;
            case 4:
                hs.U((hs) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((n10) this.b).e.Z(true);
                break;
            case 6:
                ((d50) this.b).c();
                break;
            case 7:
                ((ub0) this.b).Y();
                break;
            case 8:
                of0 of0Var = (of0) this.b;
                String str = (String) obj;
                of0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    of0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                ki0 ki0Var = (ki0) this.b;
                Integer num = (Integer) obj;
                ki0Var.getClass();
                boolean z10 = num.intValue() - ki0Var.e.d > AndroidUtilities.dp(20.0f);
                ki0Var.X = z10;
                ki0Var.Z.animate().translationY((z10 ? Math.min(ki0Var.Y, (ki0Var.B.getHeight() - num.intValue()) - ki0Var.Z.getMeasuredHeight()) : ki0Var.Y) - ki0Var.Z.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 10:
                zi0 zi0Var = (zi0) this.b;
                zi0Var.f0 = (String) obj;
                w5 w5Var = zi0Var.p0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 11:
                kj0 kj0Var = (kj0) this.b;
                kj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    kj0Var.r();
                    break;
                }
                break;
            case 12:
                Integer num2 = (Integer) obj;
                nh.g1 g1Var = ((yo0) this.b).y;
                if (g1Var != null) {
                    g1Var.D(num2.intValue());
                    break;
                }
                break;
            case 13:
                ((ro0) this.b).c.e();
                break;
            case 14:
                ((nh.g1) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                pv0 pv0Var = (pv0) this.b;
                pv0Var.s = ((Integer) obj).intValue();
                View y12 = pv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) y12;
                    if (y8Var.getFixedSize() <= 0 && pv0Var.s > 0) {
                        y8Var.setText(pv0Var.W());
                        pv0Var.V(true);
                        break;
                    }
                }
                pv0Var.d.U2.N(true);
                pv0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.L;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.y80[] y80VarArr = (org.telegram.ui.Components.y80[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = y80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.h;
                b.q(scaleY, jrVar2, 600L);
                y80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(jrVar2).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new av0(24, (v11) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                qc1 qc1Var = (qc1) this.b;
                qc1Var.getClass();
                qc1Var.j1 = ((Float) obj).floatValue();
                qc1Var.t0.invalidate();
                qc1Var.V0();
                break;
            case 22:
                ((nh.g1) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((oh1) this.b).E(true);
                break;
        }
    }
}
