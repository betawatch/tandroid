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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((a4) this.b).H.l0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 1:
                dd ddVar = (dd) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                ddVar.B = wallPaper;
                ddVar.C = wallPaper;
                ddVar.D = wallPaper;
                ddVar.X0(false);
                ddVar.a1(false);
                AndroidUtilities.runOnUIThread(new fc(ddVar, 1), 350L);
                break;
            case 2:
                ((kq) this.b).e.P = (String) obj;
                break;
            case 3:
                rr rrVar = ((nr) this.b).d;
                rrVar.x1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(rrVar.c, rrVar.o0);
                break;
            case 4:
                ps.U((ps) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((b20) this.b).e.Z(true);
                break;
            case 6:
                ((r50) this.b).c();
                break;
            case 7:
                ((gc0) this.b).Y();
                break;
            case 8:
                yf0 yf0Var = (yf0) this.b;
                String str = (String) obj;
                yf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    yf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                ui0 ui0Var = (ui0) this.b;
                Integer num = (Integer) obj;
                ui0Var.getClass();
                boolean z4 = num.intValue() - ui0Var.e.d > AndroidUtilities.dp(20.0f);
                ui0Var.Y = z4;
                ui0Var.a0.animate().translationY((z4 ? Math.min(ui0Var.Z, (ui0Var.C.getHeight() - num.intValue()) - ui0Var.a0.getMeasuredHeight()) : ui0Var.Z) - ui0Var.a0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 10:
                jj0 jj0Var = (jj0) this.b;
                jj0Var.g0 = (String) obj;
                b6 b6Var = jj0Var.q0;
                AndroidUtilities.cancelRunOnUIThread(b6Var);
                AndroidUtilities.runOnUIThread(b6Var, 100L);
                break;
            case 11:
                uj0 uj0Var = (uj0) this.b;
                uj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    uj0Var.r();
                    break;
                }
                break;
            case 12:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 13:
                ((fp0) this.b).c.e();
                break;
            case 14:
                ((gk) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                fw0 fw0Var = (fw0) this.b;
                fw0Var.s = ((Integer) obj).intValue();
                View x12 = fw0Var.d.x1(4);
                if (x12 instanceof org.telegram.ui.Cells.z8) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) x12;
                    if (z8Var.getFixedSize() <= 0 && fw0Var.s > 0) {
                        z8Var.setText(fw0Var.W());
                        fw0Var.V(true);
                        break;
                    }
                }
                fw0Var.d.V2.N(true);
                fw0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.M;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.f90[] f90VarArr = (org.telegram.ui.Components.f90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = f90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
                b.p(scaleY, mrVar, 600L);
                f90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(mrVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new b11(2, (o21) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                jd1 jd1Var = (jd1) this.b;
                jd1Var.getClass();
                jd1Var.k1 = ((Float) obj).floatValue();
                jd1Var.u0.invalidate();
                jd1Var.V0();
                break;
            case 22:
                ((gk) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((ii1) this.b).E(true);
                break;
        }
    }
}
