package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((y2) obj).invalidateSelf();
                break;
            case 1:
                w3 w3Var = (w3) obj;
                x2 x2Var = w3Var.i0;
                u9[] u9VarArr = w3Var.d;
                if (!u9VarArr[2 - w3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(x2Var);
                    AndroidUtilities.runOnUIThread(x2Var, 150L);
                    break;
                } else {
                    f4.d dVar = w3Var.U;
                    if (dVar != null && dVar.b == 1 && w3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(x2Var);
                        ValueAnimator valueAnimator = w3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            w3Var.h0 = null;
                        }
                        int i11 = 1 - w3Var.r0;
                        w3Var.r0 = i11;
                        xi0 lottieAnimation = u9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        xi0 lottieAnimation2 = u9VarArr[w3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        w3Var.W.c();
                        int i12 = w3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = w3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) w3Var.b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        w3Var.e(i12, stargiftattributebackdrop);
                        w3Var.g(1, (TL_stars.starGiftAttributePattern) w3Var.a0.c(), true);
                        w3Var.a();
                        float f7 = w3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        w3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new s3(w3Var, 2));
                        w3Var.h0.addListener(new u3(w3Var));
                        w3Var.h0.setDuration(320L);
                        w3Var.h0.setInterpolator(qr.h);
                        w3Var.h0.start();
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
                    ll0 currentListView = ((x7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 6:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                zg.t tVar = (zg.t) ((f2) obj).a;
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
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.y) obj).f2.r;
                if (!(n2Var instanceof bo)) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(n2Var, 11, false));
                        break;
                    }
                } else {
                    n2Var.showDialog(new rg.x0(n2Var, 11, false));
                    break;
                }
                break;
        }
    }
}
