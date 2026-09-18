package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public class v1 extends View {
    public u1 a;
    public int b;
    public org.telegram.ui.web.b1 c;
    public boolean d;
    public Paint e;
    public LinearGradient f;
    public Matrix h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(Context context) {
        super(context);
        int i10 = SharedConfig.getDevicePerformanceClass() == 2 ? 200 : SharedConfig.getDevicePerformanceClass() == 1 ? 100 : 50;
        this.d = true;
        this.a = new u1(i10);
        a();
    }

    public void a() {
        u1 u1Var = this.a;
        u1Var.N = 100;
        u1Var.M = true;
        u1Var.G = true;
        u1Var.K = true;
        u1Var.H = true;
        u1Var.r = 4;
        u1Var.w = 0.98f;
        u1Var.v = 0.98f;
        u1Var.u = 0.98f;
        u1Var.c();
    }

    public final void b() {
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f = linearGradient;
        this.e.setShader(linearGradient);
        this.h = new Matrix();
    }

    public int getStarsRectWidth() {
        return AndroidUtilities.dp(140.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 9);
        this.c = b1Var;
        LiteMode.addOnPowerSaverAppliedListener(b1Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.web.b1 b1Var = this.c;
        if (b1Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(b1Var);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.d) {
            if (this.e != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.a.d(canvas2);
            if (this.e != null) {
                canvas2.save();
                this.h.reset();
                this.h.postTranslate(0.0f, (getHeight() + 1) - AndroidUtilities.dp(12.0f));
                this.f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, getHeight() - AndroidUtilities.dp(12.0f), getWidth(), getHeight(), this.e);
                this.h.reset();
                this.h.postRotate(180.0f);
                this.h.postTranslate(0.0f, AndroidUtilities.dp(12.0f));
                this.f.setLocalMatrix(this.h);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f), this.e);
                canvas2.restore();
                canvas2.restore();
            }
            if (this.a.g) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.a.a.set(0.0f, 0.0f, getStarsRectWidth(), AndroidUtilities.dp(140.0f));
        this.a.a.offset((getMeasuredWidth() - this.a.a.width()) / 2.0f, (getMeasuredHeight() - this.a.a.height()) / 2.0f);
        this.a.b.set(-AndroidUtilities.dp(15.0f), -AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + getMeasuredWidth(), AndroidUtilities.dp(15.0f) + getMeasuredHeight());
        if (this.b != measuredHeight) {
            this.b = measuredHeight;
            this.a.f();
        }
    }

    public void setPaused(boolean z10) {
        u1 u1Var = this.a;
        if (z10 == u1Var.g) {
            return;
        }
        u1Var.g = z10;
        if (z10) {
            u1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.a.n.size(); i10++) {
            t1 t1Var = (t1) this.a.n.get(i10);
            t1Var.a = (System.currentTimeMillis() - this.a.Q) + t1Var.a;
        }
        invalidate();
    }
}
