// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pa8 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z11 z11Var;
        Drawable[] drawableArr = PhotoViewer.d9;
        v21 v21Var = v21.x;
        if (v21Var == null || (z11Var = v21Var.e) == null) {
            return;
        }
        z11Var.updatePosition();
    }
}
