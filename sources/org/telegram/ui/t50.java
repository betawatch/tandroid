package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t50 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ e60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = e60Var;
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
        e60 e60Var = this.e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.a = iArr;
            if (e60Var.e1 != null) {
                float f10 = e60Var.f1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (e60Var.f1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, e60Var.R0.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.b != e60Var.S1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, e60Var.S1);
            this.b = e60Var.S1;
        } else {
            z4 = z10;
        }
        if (z4) {
            invalidate();
        }
        e60Var.z1();
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
