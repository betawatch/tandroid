// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qv1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ qv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.G5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.p();
                break;
            case 1:
                int i2 = ChatActivityEnterView.X7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.O1 = floatValue;
                z92 G0 = chatActivityEnterView.G0();
                if (G0 != null) {
                    G0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                rw1 rw1Var = chatActivityEnterView.f1;
                if (rw1Var != null) {
                    rw1Var.invalidate();
                    break;
                }
                break;
            case 2:
                int i3 = ChatActivityEnterView.X7;
                cx1 cx1Var = chatActivityEnterView.y2;
                if (cx1Var != null) {
                    cx1Var.setTranslationX(cx1Var.a);
                    break;
                }
                break;
            case 3:
                int i4 = ChatActivityEnterView.X7;
                chatActivityEnterView.b2.invalidate();
                break;
            case 4:
                int i5 = ChatActivityEnterView.X7;
                chatActivityEnterView.b2.invalidate();
                break;
            case 5:
                int i6 = ChatActivityEnterView.X7;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    my1Var.Y();
                    break;
                }
                break;
            case 6:
                int i7 = ChatActivityEnterView.X7;
                chatActivityEnterView.y2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                int i8 = ChatActivityEnterView.X7;
                cx1 cx1Var2 = chatActivityEnterView.y2;
                if (cx1Var2 != null) {
                    cx1Var2.setTranslationX(cx1Var2.a);
                    break;
                }
                break;
            case 8:
                int i9 = ChatActivityEnterView.X7;
                chatActivityEnterView.U6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = chatActivityEnterView.D2;
                if (lVar != null) {
                    lVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    break;
                }
                break;
            case 9:
                int i10 = ChatActivityEnterView.X7;
                chatActivityEnterView.C2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    chatActivityEnterView.i1.setAlpha(chatActivityEnterView.J1 ? 1.0f : chatActivityEnterView.C2.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.Y0();
                break;
            case 10:
                int i11 = ChatActivityEnterView.X7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.l2.setScaleX(hl.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.l2.setScaleY(hl.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.l2.setAlpha(floatValue2);
                break;
            case 11:
                int i12 = ChatActivityEnterView.X7;
                chatActivityEnterView.v(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int i13 = ChatActivityEnterView.X7;
                chatActivityEnterView.C7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.s2();
                break;
        }
    }
}
