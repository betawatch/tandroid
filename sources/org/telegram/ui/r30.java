package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r30 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ c40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = c40Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.q4 || r0.R3.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z9 = true;
        c40 c40Var = this.e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(org.telegram.messenger.qs.e4);
            }
            this.a = iArr;
            if (c40Var.Y2 != null) {
                float f10 = c40Var.Z2;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (c40Var.Z2 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, c40Var.L2.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.b != c40Var.M3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, c40Var.M3);
            this.b = c40Var.M3;
        } else {
            z9 = z10;
        }
        if (z9) {
            invalidate();
        }
        c40Var.E1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.e.M3);
            this.d = f10;
            invalidate();
        }
    }
}
