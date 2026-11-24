// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ts1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb2 b;
    public final /* synthetic */ vs1 c;

    public /* synthetic */ ts1(vs1 vs1Var, gb2 gb2Var, byte b) {
        this.a = b;
        this.c = vs1Var;
        this.b = gb2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        gb2 gb2Var = this.b;
        vs1 vs1Var = this.c;
        byte b2 = 8;
        switch (b) {
            case 0:
                mu1 mu1Var = vs1Var.R;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                gb2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = gb2Var.getPhotoImage();
                float f = photoImage.N0;
                RectF cameraRect = mu1Var.q3.getCameraRect();
                float width = f / cameraRect.width();
                gb2Var.getTransitionParams().y0 = true;
                gb2Var.setAlpha(0.0f);
                gb2Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.L0 - gb2Var.getAnimationOffsetX()) + r12), (int) (((photoImage.M0 + gb2Var.getPaddingTop()) - gb2Var.getTranslationY()) + r12)};
                gb2Var.getLocationOnScreen(iArr);
                float f2 = iArr[0];
                float f3 = iArr[1];
                wo5 cameraContainer = mu1Var.q3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r12[0]);
                cameraContainer.setPivotY(cameraRect.top - r12[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = mu1Var.q3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(mu1Var.q3.getPaint(), rn.b, 0), ObjectAnimator.ofFloat(mu1Var.q3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(s33.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<wo5, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(s33.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                q qVar = mu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new u5(this, cameraContainer, (byte) 8));
                animatorSet2.start();
                break;
            default:
                mu1 mu1Var2 = vs1Var.R;
                gb2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                g27 g27Var = gb2Var.getMessageObject().N1;
                if (g27Var != null) {
                    mu1Var2.F6.add(gb2Var);
                    ImageReceiver photoImage2 = gb2Var.getPhotoImage();
                    float f4 = g27Var.h ? 1.0f : g27Var.c / photoImage2.N0;
                    int[] iArr2 = new int[2];
                    gb2Var.getTransitionParams().y0 = true;
                    gb2Var.getLocationInWindow(iArr2);
                    iArr2[1] = (int) (iArr2[1] - gb2Var.getTranslationY());
                    if (mu1Var2.a0.W0()) {
                        iArr2[1] = gl.L(48.0f) + iArr2[1];
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    pm pmVar = new pm("p1", (byte) 8);
                    us1 us1Var = new us1(this, (byte) 0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(g27Var, pmVar, f4, 1.0f), ObjectAnimator.ofFloat(g27Var, new us1(this, (byte) 1), 0.0f, 1.0f));
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(g27Var, us1Var, g27Var.a, iArr2[0] + (g27Var.h ? 0.0f : photoImage2.r())), animatorSet4);
                    animatorSet3.setInterpolator(s33.h);
                    animatorSet3.setDuration(460L);
                    animatorSet3.addListener(new bb1(this, b2));
                    animatorSet3.start();
                    us1 us1Var2 = new us1(this, (byte) 2);
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(g27Var, us1Var2, 0.0f, 1.0f));
                    animatorSet5.setDuration(100L);
                    animatorSet5.setStartDelay(150L);
                    animatorSet5.setInterpolator(new DecelerateInterpolator());
                    animatorSet5.start();
                    break;
                }
                break;
        }
        return true;
    }
}
