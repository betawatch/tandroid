// default package

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rv1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rv1(bq5 bq5Var, vg8 vg8Var, v01 v01Var, float f) {
        this.c = bq5Var;
        this.d = vg8Var;
        this.e = v01Var;
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
                zy1 zy1Var = (zy1) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i = ChatActivityEnterView.X7;
                float f2 = chatActivityEnterView.M5;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f2 != 0.0f) {
                    floatValue = Math.max(floatValue, ((chatActivityEnterView.M5 != 0.0f ? AnimationUtils.currentAnimationTimeMillis() - chatActivityEnterView.N5 : chatActivityEnterView.T5) / 1000.0f) * 1000.0f);
                }
                chatActivityEnterView.T5 = floatValue;
                float interpolation = k43.g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f3 = chatActivityEnterView.U5;
                float i2 = Utilities.i((floatValue - f3) / Math.max(60.0f, chatActivityEnterView.V5 - f3), 1.0f, 0.0f);
                zy1Var.w = interpolation;
                zy1Var.x = i2;
                zy1Var.invalidate();
                double radians = Math.toRadians(zy1Var.e());
                chatActivityEnterView.L5.S = ((float) Math.sin(radians)) * f;
                chatActivityEnterView.L5.T = (1.0f - ((float) Math.cos(radians))) * f;
                float f4 = chatActivityEnterView.W5;
                if (floatValue >= f4) {
                    float min = Math.min(1.0f, (floatValue - f4) / 260.0f);
                    zy1Var.y = min;
                    zy1Var.invalidate();
                    chatActivityEnterView.s(min);
                }
                recordCircle.invalidate();
                break;
            default:
                v01 v01Var = (v01) obj;
                pa9 pa9Var = ((bq5) obj3).a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j18 j18Var = new j18(new vg8[]{(vg8) obj2});
                v01Var.getClass();
                j18Var.c = v01Var instanceof r01 ? -1 : pa9Var.getCurrentColor();
                j18Var.d = floatValue2 * f;
                j18Var.e = v01Var;
                nx7 painting = pa9Var.getPainting();
                if (painting.L == null) {
                    boolean z = true;
                    painting.f.f(new my6(painting, j18Var, z, z, null, (byte) 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rv1(ChatActivityEnterView chatActivityEnterView, zy1 zy1Var, float f, ChatActivityEnterView.RecordCircle recordCircle) {
        this.c = chatActivityEnterView;
        this.d = zy1Var;
        this.b = f;
        this.e = recordCircle;
    }
}
