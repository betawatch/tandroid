package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((y3) this.b).G.k0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                xc xcVar = (xc) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                xcVar.A = wallPaper;
                xcVar.B = wallPaper;
                xcVar.C = wallPaper;
                xcVar.X0(false);
                xcVar.a1(false);
                AndroidUtilities.runOnUIThread(new ac(xcVar, 1), 350L);
                break;
            case 2:
                ((aq) this.b).e.O = (String) obj;
                break;
            case 3:
                jr jrVar = ((er) this.b).d;
                jrVar.w1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(jrVar.c, jrVar.n0);
                break;
            case 4:
                is.T((is) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((l10) this.b).e.Y(true);
                break;
            case 6:
                ((b50) this.b).c();
                break;
            case 7:
                ((sb0) this.b).X();
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
                li0 li0Var = (li0) this.b;
                Integer num = (Integer) obj;
                li0Var.getClass();
                boolean z10 = num.intValue() - li0Var.e.d > AndroidUtilities.dp(20.0f);
                li0Var.X = z10;
                li0Var.Z.animate().translationY((z10 ? Math.min(li0Var.Y, (li0Var.B.getHeight() - num.intValue()) - li0Var.Z.getMeasuredHeight()) : li0Var.Y) - li0Var.Z.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 10:
                bj0 bj0Var = (bj0) this.b;
                bj0Var.f0 = (String) obj;
                v5 v5Var = bj0Var.p0;
                AndroidUtilities.cancelRunOnUIThread(v5Var);
                AndroidUtilities.runOnUIThread(v5Var, 100L);
                break;
            case 11:
                nj0 nj0Var = (nj0) this.b;
                nj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    nj0Var.r();
                    break;
                }
                break;
            case 12:
                Integer num2 = (Integer) obj;
                kh.j1 j1Var = ((zo0) this.b).y;
                if (j1Var != null) {
                    j1Var.D(num2.intValue());
                    break;
                }
                break;
            case 13:
                ((so0) this.b).c.e();
                break;
            case 14:
                ((kh.j1) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                pv0 pv0Var = (pv0) this.b;
                pv0Var.s = ((Integer) obj).intValue();
                View y12 = pv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) y12;
                    if (b9Var.getFixedSize() <= 0 && pv0Var.s > 0) {
                        b9Var.setText(pv0Var.V());
                        pv0Var.U(true);
                        break;
                    }
                }
                pv0Var.d.U2.N(true);
                pv0Var.U(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.L;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.z0(true);
                break;
            case 17:
                org.telegram.ui.Components.l80[] l80VarArr = (org.telegram.ui.Components.l80[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = l80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.ll.r(scaleY, grVar, 600L);
                l80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(grVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ys0(27, (u11) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.a0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.T((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                oc1 oc1Var = (oc1) this.b;
                oc1Var.getClass();
                oc1Var.j1 = ((Float) obj).floatValue();
                oc1Var.t0.invalidate();
                oc1Var.V0();
                break;
            case 22:
                ((kh.j1) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((mh1) this.b).E(true);
                break;
        }
    }
}
