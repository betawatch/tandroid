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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ad adVar = (ad) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                adVar.E = wallPaper;
                adVar.F = wallPaper;
                adVar.G = wallPaper;
                adVar.X0(false);
                adVar.a1(false);
                AndroidUtilities.runOnUIThread(new fc(adVar, 1), 350L);
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
                ss.U((ss) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((e20) this.b).e.Z(true);
                break;
            case 6:
                ((v50) this.b).c();
                break;
            case 7:
                ((nc0) this.b).Y();
                break;
            case 8:
                fg0 fg0Var = (fg0) this.b;
                String str = (String) obj;
                fg0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    fg0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                bj0 bj0Var = (bj0) this.b;
                Integer num = (Integer) obj;
                bj0Var.getClass();
                boolean z10 = num.intValue() - bj0Var.e.d > AndroidUtilities.dp(20.0f);
                bj0Var.b0 = z10;
                bj0Var.d0.animate().translationY((z10 ? Math.min(bj0Var.c0, (bj0Var.F.getHeight() - num.intValue()) - bj0Var.d0.getMeasuredHeight()) : bj0Var.c0) - bj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                rj0 rj0Var = (rj0) this.b;
                rj0Var.j0 = (String) obj;
                w5 w5Var = rj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 11:
                ck0 ck0Var = (ck0) this.b;
                ck0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ck0Var.r();
                    break;
                }
                break;
            case 12:
                super/*android.widget.LinearLayout*/.draw((Canvas) obj);
                break;
            case 13:
                ((sp0) this.b).c.e();
                break;
            case 14:
                ((ci.i1) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                tw0 tw0Var = (tw0) this.b;
                tw0Var.s = ((Integer) obj).intValue();
                View y12 = tw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.e9) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) y12;
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
                org.telegram.ui.Components.c90[] c90VarArr = (org.telegram.ui.Components.c90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = c90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.vl.r(scaleY, qrVar, 600L);
                c90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(qrVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new iy0(15, (z21) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                wd1 wd1Var = (wd1) this.b;
                wd1Var.getClass();
                wd1Var.n1 = ((Float) obj).floatValue();
                wd1Var.x0.invalidate();
                wd1Var.V0();
                break;
            case 22:
                ((ci.i1) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((ui1) this.b).E(true);
                break;
        }
    }
}
