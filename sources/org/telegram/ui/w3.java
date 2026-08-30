package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((y3) this.b).H.l0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                bd bdVar = (bd) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bdVar.B = wallPaper;
                bdVar.C = wallPaper;
                bdVar.D = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new ec(bdVar, 1), 350L);
                break;
            case 2:
                ((iq) this.b).e.P = (String) obj;
                break;
            case 3:
                pr prVar = ((lr) this.b).d;
                prVar.x1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(prVar.c, prVar.o0);
                break;
            case 4:
                ns.U((ns) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((z10) this.b).e.Z(true);
                break;
            case 6:
                ((p50) this.b).c();
                break;
            case 7:
                ((ec0) this.b).Y();
                break;
            case 8:
                wf0 wf0Var = (wf0) this.b;
                String str = (String) obj;
                wf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    wf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                si0 si0Var = (si0) this.b;
                Integer num = (Integer) obj;
                si0Var.getClass();
                boolean z4 = num.intValue() - si0Var.e.d > AndroidUtilities.dp(20.0f);
                si0Var.Y = z4;
                si0Var.a0.animate().translationY((z4 ? Math.min(si0Var.Z, (si0Var.C.getHeight() - num.intValue()) - si0Var.a0.getMeasuredHeight()) : si0Var.Z) - si0Var.a0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 10:
                hj0 hj0Var = (hj0) this.b;
                hj0Var.g0 = (String) obj;
                z5 z5Var = hj0Var.q0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
                break;
            case 11:
                sj0 sj0Var = (sj0) this.b;
                sj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    sj0Var.r();
                    break;
                }
                break;
            case 12:
                Integer num2 = (Integer) obj;
                ek ekVar = ((gp0) this.b).y;
                if (ekVar != null) {
                    ekVar.D(num2.intValue());
                    break;
                }
                break;
            case 13:
                ((zo0) this.b).c.e();
                break;
            case 14:
                ((ek) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                yv0 yv0Var = (yv0) this.b;
                yv0Var.s = ((Integer) obj).intValue();
                View y12 = yv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.a9) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) y12;
                    if (a9Var.getFixedSize() <= 0 && yv0Var.s > 0) {
                        a9Var.setText(yv0Var.W());
                        yv0Var.V(true);
                        break;
                    }
                }
                yv0Var.d.V2.N(true);
                yv0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.M;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.e90[] e90VarArr = (org.telegram.ui.Components.e90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = e90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                b.p(scaleY, nrVar, 600L);
                e90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(nrVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new l01(3, (h21) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                cd1 cd1Var = (cd1) this.b;
                cd1Var.getClass();
                cd1Var.k1 = ((Float) obj).floatValue();
                cd1Var.u0.invalidate();
                cd1Var.V0();
                break;
            case 22:
                ((ek) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((ai1) this.b).E(true);
                break;
        }
    }
}
