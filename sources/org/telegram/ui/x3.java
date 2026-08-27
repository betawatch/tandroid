package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                xc xcVar = (xc) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                xcVar.A = wallPaper;
                xcVar.B = wallPaper;
                xcVar.C = wallPaper;
                xcVar.X0(false);
                xcVar.a1(false);
                AndroidUtilities.runOnUIThread(new bc(xcVar, 1), 350L);
                break;
            case 2:
                ((cq) this.b).e.O = (String) obj;
                break;
            case 3:
                lr lrVar = ((hr) this.b).d;
                lrVar.w1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(lrVar.c, lrVar.n0);
                break;
            case 4:
                js.U((js) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((o10) this.b).e.Z(true);
                break;
            case 6:
                ((e50) this.b).c();
                break;
            case 7:
                ((xb0) this.b).Y();
                break;
            case 8:
                rf0 rf0Var = (rf0) this.b;
                String str = (String) obj;
                rf0Var.getClass();
                FileLog.d("LoginBilling purchased done " + str);
                if ("CANCELLED".equalsIgnoreCase(str)) {
                    rf0Var.b.setLoading(false);
                    break;
                }
                break;
            case 9:
                ni0 ni0Var = (ni0) this.b;
                Integer num = (Integer) obj;
                ni0Var.getClass();
                boolean z10 = num.intValue() - ni0Var.e.d > AndroidUtilities.dp(20.0f);
                ni0Var.X = z10;
                ni0Var.Z.animate().translationY((z10 ? Math.min(ni0Var.Y, (ni0Var.B.getHeight() - num.intValue()) - ni0Var.Z.getMeasuredHeight()) : ni0Var.Y) - ni0Var.Z.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                dj0 dj0Var = (dj0) this.b;
                dj0Var.f0 = (String) obj;
                w5 w5Var = dj0Var.p0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 11:
                oj0 oj0Var = (oj0) this.b;
                oj0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    oj0Var.s();
                    break;
                }
                break;
            case 12:
                Integer num2 = (Integer) obj;
                lh.h1 h1Var = ((ap0) this.b).y;
                if (h1Var != null) {
                    h1Var.D(num2.intValue());
                    break;
                }
                break;
            case 13:
                ((to0) this.b).c.e();
                break;
            case 14:
                ((lh.h1) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                qv0 qv0Var = (qv0) this.b;
                qv0Var.s = ((Integer) obj).intValue();
                View y12 = qv0Var.d.y1(4);
                if (y12 instanceof org.telegram.ui.Cells.x8) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) y12;
                    if (x8Var.getFixedSize() <= 0 && qv0Var.s > 0) {
                        x8Var.setText(qv0Var.W());
                        qv0Var.V(true);
                        break;
                    }
                }
                qv0Var.d.U2.N(true);
                qv0Var.V(true);
                break;
            case 16:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                ArrayList arrayList = privacySettingsActivity.L;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                privacySettingsActivity.A0(true);
                break;
            case 17:
                org.telegram.ui.Components.p80[] p80VarArr = (org.telegram.ui.Components.p80[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = p80VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                org.telegram.messenger.rl.o(scaleY, erVar, 600L);
                p80VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(erVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new zs0(27, (t11) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                nc1 nc1Var = (nc1) this.b;
                nc1Var.getClass();
                nc1Var.j1 = ((Float) obj).floatValue();
                nc1Var.t0.invalidate();
                nc1Var.V0();
                break;
            case 22:
                ((lh.h1) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((lh1) this.b).E(true);
                break;
        }
    }
}
