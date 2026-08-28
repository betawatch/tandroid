package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class w1 extends View {
    public v1 a;
    public int b;
    public i9 c;
    public boolean d;
    public Paint e;
    public LinearGradient f;
    public Matrix h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Context context) {
        super(context);
        int i9 = SharedConfig.getDevicePerformanceClass() == 2 ? 200 : SharedConfig.getDevicePerformanceClass() == 1 ? 100 : 50;
        this.d = true;
        this.a = new v1(i9);
        a();
    }

    public void a() {
        v1 v1Var = this.a;
        v1Var.N = 100;
        v1Var.M = true;
        v1Var.G = true;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.r = 4;
        v1Var.w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.u = 0.98f;
        v1Var.c();
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
        i9 i9Var = new i9(this, 26);
        this.c = i9Var;
        LiteMode.addOnPowerSaverAppliedListener(i9Var);
        boolean isEnabled = LiteMode.isEnabled(131072);
        if (this.d != isEnabled) {
            this.d = isEnabled;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i9 i9Var = this.c;
        if (i9Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(i9Var);
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
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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
        v1 v1Var = this.a;
        if (z10 == v1Var.g) {
            return;
        }
        v1Var.g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i9 = 0; i9 < this.a.n.size(); i9++) {
            u1 u1Var = (u1) this.a.n.get(i9);
            u1Var.a = (System.currentTimeMillis() - this.a.Q) + u1Var.a;
        }
        invalidate();
    }
}
