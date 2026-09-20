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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                dj0Var.d0.animate().translationY((z10 ? Math.min(dj0Var.c0, (dj0Var.F.getHeight() - num.intValue()) - dj0Var.d0.getMeasuredHeight()) : dj0Var.c0) - dj0Var.d0.getTop()).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            case 10:
                uj0 uj0Var = (uj0) this.b;
                uj0Var.j0 = (String) obj;
                w5 w5Var = uj0Var.t0;
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                AndroidUtilities.runOnUIThread(w5Var, 100L);
                break;
            case 11:
                fk0 fk0Var = (fk0) this.b;
                fk0Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    fk0Var.r();
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
                if (z12 instanceof org.telegram.ui.Cells.f9) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) z12;
                    if (f9Var.getFixedSize() <= 0 && tw0Var.s > 0) {
                        f9Var.setText(tw0Var.W());
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
                org.telegram.ui.Components.k90[] k90VarArr = (org.telegram.ui.Components.k90[]) this.b;
                Boolean bool = (Boolean) obj;
                ViewPropertyAnimator scaleY = k90VarArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.rk.s(scaleY, qrVar, 600L);
                k90VarArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(qrVar).setDuration(600L).start();
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new rx0(21, (z21) this.b, (TLRPC.TL_exportedContactToken) obj));
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
