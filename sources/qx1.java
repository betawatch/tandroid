// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qx1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qx1(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ((rx1) obj).d;
                chatActivityEnterView.H = f2 * floatValue;
                chatActivityEnterView.p2();
                chatActivityEnterView.R0.setTranslationX(f * floatValue);
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq4 uq4Var = ((hl3) obj).a;
                uq4Var.d = f2 * floatValue2;
                uq4Var.i = f * floatValue2;
                break;
            case 2:
                cy3 cy3Var = (cy3) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cy3Var.L = floatValue3;
                cy3Var.K = gl.R1(f2, f, floatValue3);
                cy3Var.b.invalidate();
                break;
            case 3:
                y74 y74Var = (y74) obj;
                if (y74Var.h) {
                    DecelerateInterpolator decelerateInterpolator = tn.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    y74Var.d((f * animatedFraction) + f2, animatedFraction);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f2;
                float f3 = photoViewer.a6;
                float f4 = ((photoViewer.e6 - f3) * photoViewer.l6) + f3;
                cropAreaView.o0 = floatValue4;
                cropAreaView.p0 = f4;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.b(gl.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                bgc bgcVar = (bgc) obj;
                bgcVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f2 + gl.L(28.0f);
                float L2 = f + gl.L(52.0f);
                float f5 = bgcVar.E;
                bgcVar.H = L - (L * f5);
                bgcVar.I = L2 - (f5 * L2);
                bgcVar.invalidate();
                break;
            case 6:
                t7b t7bVar = (t7b) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7bVar.r.setTranslationY(f2 * floatValue5);
                t7bVar.r.b(f * floatValue5);
                break;
            case 7:
                nkc nkcVar = (nkc) obj;
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nkcVar.A = (f2 * floatValue6) + nkcVar.g();
                nkcVar.B = (f * floatValue6) + (nkcVar.k.F * 0.14f);
                nkcVar.D = floatValue6 > 0.0f;
                nkcVar.a.invalidate();
                break;
            default:
                mmc mmcVar = (mmc) obj;
                float floatValue7 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmcVar.O = f2 * floatValue7;
                mmcVar.P = f * floatValue7;
                break;
        }
    }
}
