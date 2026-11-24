// default package

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xv1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xv1(yn5 yn5Var, hd8 hd8Var, m01 m01Var, float f) {
        this.c = yn5Var;
        this.d = hd8Var;
        this.e = m01Var;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                jy1 jy1Var = (jy1) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i = ChatActivityEnterView.r7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.K5 = floatValue;
                float interpolation = s33.g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f2 = chatActivityEnterView.L5;
                float i2 = Utilities.i((floatValue - f2) / Math.max(60.0f, chatActivityEnterView.M5 - f2), 1.0f, 0.0f);
                jy1Var.w = interpolation;
                jy1Var.x = i2;
                jy1Var.invalidate();
                double radians = Math.toRadians(jy1Var.e());
                chatActivityEnterView.E5.R = ((float) Math.sin(radians)) * f;
                chatActivityEnterView.E5.S = (1.0f - ((float) Math.cos(radians))) * f;
                float f3 = chatActivityEnterView.N5;
                if (floatValue >= f3) {
                    float min = Math.min(1.0f, (floatValue - f3) / 260.0f);
                    jy1Var.y = min;
                    jy1Var.invalidate();
                    chatActivityEnterView.t(min);
                }
                recordCircle.invalidate();
                break;
            default:
                m01 m01Var = (m01) obj;
                c79 c79Var = ((yn5) obj3).a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy7 dy7Var = new dy7(new hd8[]{(hd8) obj2});
                m01Var.getClass();
                dy7Var.c = m01Var instanceof i01 ? -1 : c79Var.getCurrentColor();
                dy7Var.d = floatValue2 * f;
                dy7Var.e = m01Var;
                gu7 painting = c79Var.getPainting();
                if (painting.L == null) {
                    boolean z = true;
                    painting.f.f(new hw6(painting, dy7Var, z, z, null, (byte) 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xv1(ChatActivityEnterView chatActivityEnterView, jy1 jy1Var, float f, ChatActivityEnterView.RecordCircle recordCircle) {
        this.c = chatActivityEnterView;
        this.d = jy1Var;
        this.b = f;
        this.e = recordCircle;
    }
}
