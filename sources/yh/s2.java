package yh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((t2) obj).invalidate();
                break;
            case 1:
                ((x2) obj).invalidateSelf();
                break;
            case 2:
                v3 v3Var = (v3) obj;
                s2 s2Var = v3Var.i0;
                v9[] v9VarArr = v3Var.d;
                int i11 = 2;
                if (!v9VarArr[2 - v3Var.r0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(s2Var);
                    AndroidUtilities.runOnUIThread(s2Var, 150L);
                    break;
                } else {
                    f4.d dVar = v3Var.U;
                    if (dVar != null && dVar.b == 1 && v3Var.isAttachedToWindow()) {
                        AndroidUtilities.cancelRunOnUIThread(s2Var);
                        ValueAnimator valueAnimator = v3Var.h0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v3Var.h0 = null;
                        }
                        int i12 = 1 - v3Var.r0;
                        v3Var.r0 = i12;
                        kj0 lottieAnimation = v9VarArr[2 - i12].getImageReceiver().getLottieAnimation();
                        kj0 lottieAnimation2 = v9VarArr[v3Var.r0 + 1].getImageReceiver().getLottieAnimation();
                        if (lottieAnimation2 != null && lottieAnimation != null) {
                            lottieAnimation2.T(lottieAnimation.t(), false);
                        }
                        v3Var.W.c();
                        int i13 = v3Var.r0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = v3Var.V;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v3Var.b0.c();
                        stargiftattributebackdropArr[i13] = stargiftattributebackdrop;
                        v3Var.e(i13, stargiftattributebackdrop);
                        v3Var.g(1, (TL_stars.starGiftAttributePattern) v3Var.a0.c(), true);
                        v3Var.a();
                        float f7 = v3Var.r0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                        v3Var.h0 = ofFloat;
                        ofFloat.addUpdateListener(new r3(v3Var, i11));
                        v3Var.h0.addListener(new t3(v3Var));
                        v3Var.h0.setDuration(320L);
                        v3Var.h0.setInterpolator(qr.h);
                        v3Var.h0.start();
                        break;
                    }
                }
                break;
            case 3:
                ((sg.e) obj).setPaused(true);
                break;
            case 4:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) obj);
                break;
            case 5:
                ((i0[]) obj)[0].dismiss();
                break;
            case 6:
                di.f fVar = (di.f) obj;
                fVar.getClass();
                try {
                    yl0 currentListView = ((w7) fVar.L0).R.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 7:
                nf.f.s(((l7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 8:
                nf.f.s(((m7) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 9:
                zg.u uVar = (zg.u) ((zg.t) obj).a;
                zg.s sVar = uVar.b;
                if (sVar != null) {
                    sVar.d();
                }
                uVar.a.z7(true);
                break;
            case 10:
                ((ValueAnimator) obj).start();
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = ((zg.y) obj).f2.r;
                if (!(n2Var instanceof zn)) {
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
