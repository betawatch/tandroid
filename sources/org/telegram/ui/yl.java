package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.PipRoundVideoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class yl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                sn snVar = ((em) obj).Q;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
                if (pipRoundVideoView != null) {
                    pipRoundVideoView.e(true);
                }
                t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageReceiver photoImage = t1Var.getPhotoImage();
                float imageWidth = photoImage.getImageWidth();
                RectF cameraRect = snVar.n3.getCameraRect();
                float width = imageWidth / cameraRect.width();
                t1Var.getTransitionParams().x0 = true;
                t1Var.setAlpha(0.0f);
                t1Var.setTimeAlpha(0.0f);
                int[] iArr = {(int) ((photoImage.getImageX() - t1Var.getAnimationOffsetX()) + r11), (int) (((photoImage.getImageY() + t1Var.getPaddingTop()) - t1Var.getTranslationY()) + r11)};
                t1Var.getLocationOnScreen(iArr);
                float f7 = iArr[0];
                float f10 = iArr[1];
                org.telegram.ui.Components.p60 cameraContainer = snVar.n3.getCameraContainer();
                cameraContainer.getLocationOnScreen(new int[2]);
                cameraContainer.setPivotX(cameraRect.left - r11[0]);
                cameraContainer.setPivotY(cameraRect.top - r11[1]);
                AnimatorSet animatorSet = new AnimatorSet();
                cameraContainer.setImageReceiver(photoImage);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) View.SCALE_X, width);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) View.SCALE_Y, width);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) View.TRANSLATION_Y, iArr[1] - cameraRect.top);
                View buttonsLayout = snVar.n3.getButtonsLayout();
                Property property = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(buttonsLayout, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(snVar.n3.getPaint(), org.telegram.ui.Components.t6.b, 0), ObjectAnimator.ofFloat(snVar.n3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.bs.h);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p60, Float>) View.TRANSLATION_X, iArr[0] - cameraRect.left);
                ofFloat4.setInterpolator(org.telegram.ui.Components.bs.f);
                animatorSet2.playTogether(ofFloat4, animatorSet);
                animatorSet2.setDuration(300L);
                org.telegram.ui.Components.s60 s60Var = snVar.n3;
                if (s60Var != null) {
                    s60Var.setIsMessageTransition(true);
                }
                animatorSet2.addListener(new ai.ne(15, this, cameraContainer));
                animatorSet2.start();
                return true;
            case 1:
                ((jx) obj).b.e0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                AndroidUtilities.runOnUIThread((ai.v3) obj2, 100L);
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                vh.h hVar = (vh.h) obj;
                org.telegram.ui.Components.yb ybVar = hVar.W;
                if (ybVar != null) {
                    int[] iArr2 = vh.h.d0;
                    ybVar.getLocationInWindow(iArr2);
                    float f11 = iArr2[0];
                    float translationY = iArr2[1] - hVar.W.getTranslationY();
                    org.telegram.ui.Components.yb ybVar2 = hVar.W;
                    float topOffset = ybVar2.top ? ybVar2.getTopOffset() : -ybVar2.getBottomOffset();
                    hVar.a.getLocationInWindow(iArr2);
                    float f12 = iArr2[0];
                    float f13 = iArr2[1];
                    hVar.X = (hVar.W.a.getMeasuredWidth() / 2.0f) + (f11 - f12) + hVar.W.a.getLeft();
                    hVar.Y = (hVar.W.a.getMeasuredHeight() / 2.0f) + ((translationY + topOffset) - f13) + hVar.W.a.getTop();
                }
                hVar.c();
                return true;
        }
    }
}
