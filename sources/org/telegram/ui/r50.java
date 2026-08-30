package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r50 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ c60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = c60Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.w2 || r0.X1.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z4 = true;
        c60 c60Var = this.e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.a = iArr;
            if (c60Var.e1 != null) {
                float f10 = c60Var.f1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (c60Var.f1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, c60Var.R0.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.b != c60Var.S1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, c60Var.S1);
            this.b = c60Var.S1;
        } else {
            z4 = z10;
        }
        if (z4) {
            invalidate();
        }
        c60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f10 = i10;
        if (this.d != f10) {
            this.c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.S1);
            this.d = f10;
            invalidate();
        }
    }
}
