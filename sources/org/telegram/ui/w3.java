package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                AndroidUtilities.runOnUIThread(new dc(bdVar, 1), 350L);
                break;
            case 2:
                ((jq) this.b).e.P = (String) obj;
                break;
            case 3:
                qr qrVar = ((mr) this.b).d;
                qrVar.x1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(qrVar.c, qrVar.o0);
                break;
            case 4:
                os.U((os) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((a20) this.b).e.Z(true);
                break;
            case 6:
                ((q50) this.b).c();
                break;
            case 7:
                ((fc0) this.b).Y();
                break;
            case 8:
                xf0 xf0Var = (xf0) this.b;
                String str = (String) obj;
                xf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    xf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                ti0 ti0Var = (ti0) this.b;
                Integer num = (Integer) obj;
                ti0Var.getClass();
                boolean z4 = num.intValue() - ti0Var.e.d > AndroidUtilities.dp(20.0f);
                ti0Var.Y = z4;
                ti0Var.a0.animate().translationY((z4 ? Math.min(ti0Var.Z, (ti0Var.C.getHeight() - num.intValue()) - ti0Var.a0.getMeasuredHeight()) : ti0Var.Z) - ti0Var.a0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 10:
                ij0 ij0Var = (ij0) this.b;
                ij0Var.g0 = (String) obj;
                z5 z5Var = ij0Var.q0;
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                AndroidUtilities.runOnUIThread(z5Var, 100L);
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
                Integer num2 = (Integer) obj;
                ek ekVar = ((ip0) this.b).y;
                if (ekVar != null) {
                    ekVar.D(num2.intValue());
                    break;
                }
                break;
            case 13:
                ((bp0) this.b).c.e();
                break;
            case 14:
                ((ek) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                aw0 aw0Var = (aw0) this.b;
                aw0Var.s = ((Integer) obj).intValue();
                View y12 = aw0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.a9) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) y12;
                    if (a9Var.getFixedSize() <= 0 && aw0Var.s > 0) {
                        a9Var.setText(aw0Var.W());
                        aw0Var.V(true);
                        break;
                    }
                }
                aw0Var.d.V2.N(true);
                aw0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.M;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.g90[] g90VarArr = (org.telegram.ui.Components.g90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = g90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                b.p(scaleY, prVar, 600L);
                g90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(prVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new w01(2, (j21) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                ed1 ed1Var = (ed1) this.b;
                ed1Var.getClass();
                ed1Var.k1 = ((Float) obj).floatValue();
                ed1Var.u0.invalidate();
                ed1Var.V0();
                break;
            case 22:
                ((ek) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((ci1) this.b).E(true);
                break;
        }
    }
}
