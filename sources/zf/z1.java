package zf;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b2 b2Var = (b2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                b2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        b2Var.n0.b(b2Var.u0, false);
                    }
                    float f10 = (floatValue - 0.5f) / 0.5f;
                    b2Var.setRotationY((1.0f - f10) * (-90.0f));
                    b2Var.v0 = (f10 * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    break;
                } else {
                    float f11 = floatValue / 0.5f;
                    b2Var.setRotationY(90.0f * f11);
                    b2Var.v0 = ((1.0f - f11) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    break;
                }
            default:
                wf.a aVar = (wf.a) this.b;
                int[] iArr = (int[]) this.c;
                aVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.b.d(floatValue2, iArr[0], aVar.h[0]), i0.b.d(floatValue2, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.b = linearGradient;
                linearGradient.setLocalMatrix(aVar.c);
                paint.setShader(aVar.b);
                aVar.a.setPaint(paint, 0);
                aVar.g.setColor(i0.b.d(0.1f, i0.b.d(floatValue2, iArr[1], aVar.h[1]), -1));
                aVar.f.setColor(i0.b.d(0.1f, i0.b.d(floatValue2, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
        }
    }
}
