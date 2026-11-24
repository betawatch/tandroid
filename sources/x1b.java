// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x1b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ x1b(FrameLayout frameLayout, View view, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        View view = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                y1b y1bVar = (y1b) frameLayout;
                y1bVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1bVar.invalidate();
                ((gt9) view).invalidate();
                break;
            default:
                ((wgc) frameLayout).F(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
