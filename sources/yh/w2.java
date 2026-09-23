package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((x2) obj).invalidateSelf();
                break;
            case 1:
                v3 v3Var = (v3) obj;
                w2 w2Var = v3Var.i0;
                w9[] w9VarArr = v3Var.d;
                if (!w9VarArr[2 - v3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(w2Var);
                    AndroidUtilities.runOnUIThread(w2Var, 150L);
                    break;
                } else {
                    f4.d dVar = v3Var.U;
                    if (dVar != null && dVar.b == 1 && v3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(w2Var);
                        ValueAnimator valueAnimator = v3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v3Var.h0 = null;
                        }
                        int i11 = 1 - v3Var.r0;
                        v3Var.r0 = i11;
                        yi0 lottieAnimation = w9VarArr[2 - i11].getImageReceiver().getLottieAnimation();
                        yi0 lottieAnimation2 = w9VarArr[v3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        v3Var.W.c();
                        int i12 = v3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = v3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v3Var.b0.c();
                        stargiftattributebackdropArr[i12] = stargiftattributebackdrop;
                        v3Var.e(i12, stargiftattributebackdrop);
                        v3Var.g(1, (TL_stars.starGiftAttributePattern) v3Var.a0.c(), true);
                        v3Var.a();
                        float f7 = v3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        v3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new r3(v3Var, 2));
                        v3Var.h0.addListener(new t3(v3Var));
                        v3Var.h0.setDuration(320L);
                        v3Var.h0.setInterpolator(rr.h);
                        v3Var.h0.start();
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
                    ml0 currentListView = ((w7) fVar.M0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 6:
                nf.f.s(((l7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 7:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                zg.t tVar = (zg.t) ((e2) obj).a;
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
                if (!(n2Var instanceof xn)) {
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
