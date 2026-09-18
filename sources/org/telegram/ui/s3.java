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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                cd cdVar = (cd) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                cdVar.E = wallPaper;
                cdVar.F = wallPaper;
                cdVar.G = wallPaper;
                cdVar.X0(false);
                cdVar.a1(false);
                AndroidUtilities.runOnUIThread(new hc(cdVar, 1), 350L);
                break;
            case 2:
                ((oq) this.b).e.S = (String) obj;
                break;
            case 3:
                ur urVar = ((qr) this.b).d;
                urVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(urVar.c, urVar.r0);
                break;
            case 4:
                us.U((us) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((g20) this.b).e.Z(true);
                break;
            case 6:
                ((x50) this.b).c();
                break;
            case 7:
                ((pc0) this.b).Y();
                break;
            case 8:
                hg0 hg0Var = (hg0) this.b;
                String str = (String) obj;
                hg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    hg0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                dj0 dj0Var = (dj0) this.b;
                Integer num = (Integer) obj;
                dj0Var.getClass();
                boolean z10 = num.intValue() - dj0Var.e.d > AndroidUtilities.dp(20.0f);
                dj0Var.b0 = z10;
                dj0Var.d0.animate().translationY((z10 ? Math.min(dj0Var.c0, (dj0Var.F.getHeight() - num.intValue()) - dj0Var.d0.getMeasuredHeight()) : dj0Var.c0) - dj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 10:
                tj0 tj0Var = (tj0) this.b;
                tj0Var.j0 = (String) obj;
                w5 w5Var = tj0Var.t0;
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
                vw0 vw0Var = (vw0) this.b;
                vw0Var.s = ((Integer) obj).intValue();
                View z12 = vw0Var.d.z1(4);
                if (z12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) z12;
                    if (e9Var.getFixedSize() <= 0 && vw0Var.s > 0) {
                        e9Var.setText(vw0Var.W());
                        vw0Var.V(true);
                        break;
                    }
                }
                vw0Var.d.Y2.N(true);
                vw0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.P;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.c90[] c90VarArr = (org.telegram.ui.Components.c90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = c90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.wl.q(scaleY, qrVar, 600L);
                c90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(qrVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ky0(15, (a31) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                xd1 xd1Var = (xd1) this.b;
                xd1Var.getClass();
                xd1Var.n1 = ((Float) obj).floatValue();
                xd1Var.x0.invalidate();
                xd1Var.V0();
                break;
            case 22:
                ((ci.i1) this.b).E(((Integer) obj).intValue());
                break;
            default:
                ((ti1) this.b).E(true);
                break;
        }
    }
}
