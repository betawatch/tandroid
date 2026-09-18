package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((z2) obj).invalidateSelf();
                break;
            case 1:
                x3 x3Var = (x3) obj;
                y2 y2Var = x3Var.i0;
                u9[] u9VarArr = x3Var.d;
                if (!u9VarArr[2 - x3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(y2Var);
                    AndroidUtilities.runOnUIThread(y2Var, 150L);
                    break;
                } else {
                    f4.d dVar = x3Var.U;
                    if (dVar != null && dVar.b == 1 && x3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(y2Var);
                        ValueAnimator valueAnimator = x3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            x3Var.h0 = null;
                        }
                        int i11 = 1 - x3Var.r0;
                        x3Var.r0 = i11;
                        yi0 lottieAnimation = u9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        yi0 lottieAnimation2 = u9VarArr[x3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        x3Var.W.c();
                        int i12 = x3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = x3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x3Var.b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        x3Var.e(i12, stargiftattributebackdrop);
                        x3Var.g(1, (TL_stars.starGiftAttributePattern) x3Var.a0.c(), true);
                        x3Var.a();
                        float f7 = x3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        x3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new t3(x3Var, 2));
                        x3Var.h0.addListener(new v3(x3Var));
                        x3Var.h0.setDuration(320L);
                        x3Var.h0.setInterpolator(qr.h);
                        x3Var.h0.start();
                        break;
                    }
                }
                break;
            case 2:
                ((sg.e) obj).setPaused(true);
                break;
            case 3:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 4:
                ((i0[]) obj)[0].dismiss();
                break;
            case 5:
                di.f fVar = (di.f) obj;
                fVar.getClass();
                try {
                    ml0 currentListView = ((y7) fVar.L0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 6:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                nf.f.s(((o7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                zg.t tVar = (zg.t) ((g2) obj).a;
                zg.s sVar = tVar.b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.a.z7(true);
                break;
            case 9:
                ((ValueAnimator) obj).start();
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = ((zg.y) obj).f2.r;
                if (!(o2Var instanceof bo)) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(o2Var, 11, false));
                        break;
                    }
                } else {
                    o2Var.showDialog(new rg.x0(o2Var, 11, false));
                    break;
                }
                break;
        }
    }
}
