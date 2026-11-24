// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pk3 extends View {
    public final Paint a;
    public final Matrix b;
    public LinearGradient c;
    public int d;
    public float e;
    public float f;

    public pk3(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f, this.a);
    }

    public void setColor(int i) {
        if (this.d != i) {
            this.d = i;
            int alpha = Color.alpha(i);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{on2.p(i, (alpha * nm7.H3) / nm7.d4), on2.p(i, (alpha * nm7.V2) / nm7.d4), on2.p(i, (alpha * nm7.Z1) / nm7.d4), on2.p(i, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.c = linearGradient;
            this.a.setShader(linearGradient);
            this.c.setLocalMatrix(this.b);
            invalidate();
        }
    }
}
