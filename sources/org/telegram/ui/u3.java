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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((w3) this.b).K.o0 = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
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
                ((qq) this.b).e.S = (String) obj;
                break;
            case 3:
                wr wrVar = ((sr) this.b).d;
                wrVar.A1 = ((Integer) obj).intValue();
                AndroidUtilities.updateVisibleRow(wrVar.c, wrVar.r0);
                break;
            case 4:
                ts.U((ts) this.b, (TL_account.TL_birthday) obj);
                break;
            case 5:
                ((f20) this.b).e.Z(true);
                break;
            case 6:
                ((w50) this.b).c();
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
                cj0 cj0Var = (cj0) this.b;
                Integer num = (Integer) obj;
                cj0Var.getClass();
                boolean z10 = num.intValue() - cj0Var.e.d > AndroidUtilities.dp(20.0f);
                cj0Var.b0 = z10;
                cj0Var.d0.animate().translationY((z10 ? Math.min(cj0Var.c0, (cj0Var.F.getHeight() - num.intValue()) - cj0Var.d0.getMeasuredHeight()) : cj0Var.c0) - cj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                break;
            case 10:
                sj0 sj0Var = (sj0) this.b;
                sj0Var.j0 = (String) obj;
                x5 x5Var = sj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(x5Var);
                AndroidUtilities.runOnUIThread(x5Var, 100L);
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
                ((sp0) this.b).c.e();
                break;
            case 14:
                ((bi.p1) this.b).D(((Integer) obj).intValue());
                break;
            case 15:
                vw0 vw0Var = (vw0) this.b;
                vw0Var.s = ((Integer) obj).intValue();
                View x12 = vw0Var.d.x1(4);
                if (x12 instanceof org.telegram.ui.Cells.f9) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) x12;
                    if (f9Var.getFixedSize() <= 0 && vw0Var.s > 0) {
                        f9Var.setText(vw0Var.W());
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
                org.telegram.ui.Components.m90[] m90VarArr = (org.telegram.ui.Components.m90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = m90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.h;
                org.telegram.messenger.em.q(scaleY, wrVar2, 600L);
                m90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(wrVar2).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ey0(18, (e31) this.b, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 19:
                StickersActivity.b0((StickersActivity) this.b, (View) obj);
                break;
            case 20:
                ThemeActivity.U((ThemeActivity) this.b, (TL_account.contentSettings) obj);
                break;
            case 21:
                ae1 ae1Var = (ae1) this.b;
                ae1Var.getClass();
                ae1Var.n1 = ((Float) obj).floatValue();
                ae1Var.x0.invalidate();
                ae1Var.V0();
                break;
            case 22:
                ((bi.p1) this.b).D(((Integer) obj).intValue());
                break;
            default:
                ((zi1) this.b).E(true);
                break;
        }
    }
}
