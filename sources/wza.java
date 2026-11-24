// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wza implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ wza(FrameLayout frameLayout, View view, byte b) {
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
                xza xzaVar = (xza) frameLayout;
                xzaVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xzaVar.invalidate();
                ((er9) view).invalidate();
                break;
            default:
                ((wec) frameLayout).F(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
