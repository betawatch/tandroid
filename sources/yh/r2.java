package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((s2) obj).invalidate();
                break;
            case 1:
                ((w2) obj).invalidateSelf();
                break;
            case 2:
                u3 u3Var = (u3) obj;
                r2 r2Var = u3Var.i0;
                w9[] w9VarArr = u3Var.d;
                int i11 = 2;
                if (!w9VarArr[2 - u3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(r2Var);
                    AndroidUtilities.runOnUIThread(r2Var, 150L);
                    break;
                } else {
                    f4.d dVar = u3Var.U;
                    if (dVar != null && dVar.b == 1 && u3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(r2Var);
                        ValueAnimator valueAnimator = u3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u3Var.h0 = null;
                        }
                        int i12 = 1 - u3Var.r0;
                        u3Var.r0 = i12;
                        kj0 lottieAnimation = w9VarArr[2 - i12].getImageReceiver().getLottieAnimation();
                        kj0 lottieAnimation2 = w9VarArr[u3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        u3Var.W.c();
                        int i13 = u3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = u3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u3Var.b0.c();
                        stargiftattributebackdropArr[i13] = stargiftattributebackdrop;
                        u3Var.e(i13, stargiftattributebackdrop);
                        u3Var.g(1, (TL_stars.starGiftAttributePattern) u3Var.a0.c(), true);
                        u3Var.a();
                        float f7 = u3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        u3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new q3(u3Var, i11));
                        u3Var.h0.addListener(new s3(u3Var));
                        u3Var.h0.setDuration(320L);
                        u3Var.h0.setInterpolator(tr.h);
                        u3Var.h0.start();
                        break;
                    }
                }
                break;
            case 3:
                x7 x7Var = (x7) obj;
                if (x7Var.S != null && x7Var.Y != -1) {
                    x7Var.q1("POSTED_ALIGN");
                    x7Var.S.Z();
                    break;
                }
                break;
            case 4:
                ((sg.e) obj).setPaused(true);
                break;
            case 5:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 6:
                ((i0[]) obj)[0].dismiss();
                break;
            case 7:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                nf.f.s(((n7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 9:
                zg.t tVar = (zg.t) ((w9.k) obj).a;
                zg.s sVar = tVar.b;
                if (sVar != null) {
                    sVar.d();
                }
                tVar.a.z7(true);
                break;
            case 10:
                ((ValueAnimator) obj).start();
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.x) obj).f2.r;
                if (!(n2Var instanceof yn)) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.y0(n2Var, 11, false));
                        break;
                    }
                } else {
                    n2Var.showDialog(new rg.y0(n2Var, 11, false));
                    break;
                }
                break;
        }
    }
}
