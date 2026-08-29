package yf;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                int[] iArr = (int[]) this.c;
                bVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue, iArr[0], bVar.h[0]), i0.a.d(floatValue, iArr[1], bVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                bVar.b = linearGradient;
                linearGradient.setLocalMatrix(bVar.c);
                paint.setShader(bVar.b);
                bVar.a.setPaint(paint, 0);
                bVar.g.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[1], bVar.h[1]), -1));
                bVar.f.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[0], bVar.h[0]), -16777216));
                bVar.invalidateSelf();
                break;
            default:
                u0 u0Var = (u0) this.b;
                v0 v0Var = (v0) this.c;
                u0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                break;
        }
    }
}
