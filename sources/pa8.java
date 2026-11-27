// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
