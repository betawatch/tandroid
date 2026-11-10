package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u30 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ f40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = f40Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.t4 || r0.U3.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z9 = true;
        f40 f40Var = this.e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(org.telegram.messenger.qs.e4);
            }
            this.a = iArr;
            if (f40Var.b3 != null) {
                float f10 = f40Var.c3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (f40Var.c3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f40Var.O2.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.b != f40Var.P3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, f40Var.P3);
            this.b = f40Var.P3;
        } else {
            z9 = z10;
        }
        if (z9) {
            invalidate();
        }
        f40Var.E1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.e.P3);
            this.d = f10;
            invalidate();
        }
    }
}
