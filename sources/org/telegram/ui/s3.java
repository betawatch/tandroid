package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((u3) this.b).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                bd bdVar = (bd) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                bdVar.E = wallPaper;
                bdVar.F = wallPaper;
                bdVar.G = wallPaper;
                bdVar.X0(false);
                bdVar.a1(false);
                AndroidUtilities.runOnUIThread(new gc(bdVar, 1), 350L);
                break;
            case 2:
                ((mq) this.b).e.S = (String) obj;
                break;
            case 3:
                sr srVar = ((or) this.b).d;
                srVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(srVar.c, srVar.r0);
                break;
            case 4:
                ss.U((ss) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((e20) this.b).e.Z(true);
                break;
            case 6:
                ((v50) this.b).c();
                break;
            case 7:
                ((oc0) this.b).Y();
                break;
            case 8:
                gg0 gg0Var = (gg0) this.b;
                String str = (String) obj;
                gg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    gg0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                cj0 cj0Var = (cj0) this.b;
                Integer num = (Integer) obj;
                cj0Var.getClass();
                boolean z10 = num.intValue() - cj0Var.e.d > AndroidUtilities.dp(20.0f);
                cj0Var.b0 = z10;
                cj0Var.d0.animate().translationY((z10 ? Math.min(cj0Var.c0, (cj0Var.F.getHeight() - num.intValue()) - cj0Var.d0.getMeasuredHeight()) : cj0Var.c0) - cj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                sj0 sj0Var = (sj0) this.b;
                sj0Var.j0 = (String) obj;
                w5 w5Var = sj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 11:
                ek0 ek0Var = (ek0) this.b;
                ek0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ek0Var.r();
                    break;
                }
                break;
            case 12:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 13:
                ((up0) this.b).c.e();
                break;
            case 14:
                ((ci.i1) this.b).E(((Integer) obj).intValue());
                break;
            case 15:
                tw0 tw0Var = (tw0) this.b;
                tw0Var.s = ((Integer) obj).intValue();
                View z12 = tw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && tw0Var.s > 0) {
                        e9Var.setText(tw0Var.W());
                        tw0Var.V(true);
                        break;
                    }
                }
                tw0Var.d.Y2.N(true);
                tw0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.l90[] l90VarArr = (org.telegram.ui.Components.l90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = l90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.wh.r(scaleY, qrVar, 600L);
                l90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(qrVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new cy0(19, (y21) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                vd1 vd1Var = (vd1) this.b;
                vd1Var.getClass();
                vd1Var.n1 = ((Float) obj).floatValue();
                vd1Var.x0.invalidate();
                vd1Var.V0();
                break;
            case 22:
                ((ci.i1) this.b).E(((Integer) obj).intValue());
                break;
            default:
                ((si1) this.b).E(true);
                break;
        }
    }
}
