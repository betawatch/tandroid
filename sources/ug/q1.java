package ug;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.ui.ActionBar.a6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class q1 extends View implements a6 {
    public p1 a;
    public final tg.y b;
    public int c;
    public ii.c d;
    public boolean e;
    public Paint f;
    public LinearGradient h;
    public Matrix n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Context context) {
        super(context);
        int i7 = iz.o() == 2 ? qs.e3 : iz.o() == 1 ? 100 : 50;
        this.b = new tg.y(this, 3);
        this.e = true;
        this.a = new p1(i7);
        a();
    }

    public void a() {
        p1 p1Var = this.a;
        p1Var.O = 100;
        p1Var.M = true;
        p1Var.G = true;
        p1Var.K = true;
        p1Var.H = true;
        p1Var.r = 4;
        p1Var.w = 0.98f;
        p1Var.v = 0.98f;
        p1Var.u = 0.98f;
        p1Var.c();
    }

    public final void b(float f10) {
        float f11 = f10 < 60.0f ? 5.0f : f10 < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        ti.d dVar = new ti.d(this, 3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(dVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(dVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f.setShader(linearGradient);
        this.n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.g0.L(140.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ii.c cVar = new ii.c(this, 25);
        this.d = cVar;
        rc.a(cVar);
        boolean e10 = rc.e(131072);
        if (this.e != e10) {
            this.e = e10;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        ii.c cVar = this.d;
        if (cVar == null || (hashSet = rc.n) == null) {
            return;
        }
        hashSet.remove(cVar);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.a.d(canvas2);
            if (this.f != null) {
                canvas2.save();
                this.n.reset();
                this.n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(12.0f), getWidth(), getHeight(), this.f);
                this.n.reset();
                this.n.postRotate(180.0f);
                this.n.postTranslate(0.0f, org.telegram.messenger.g0.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(12.0f), this.f);
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.a.a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.g0.L(140.0f));
        this.a.a.offset((getMeasuredWidth() - this.a.a.width()) / 2.0f, (getMeasuredHeight() - this.a.a.height()) / 2.0f);
        this.a.b.set(-org.telegram.messenger.g0.L(15.0f), -org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight());
        if (this.c != measuredHeight) {
            this.c = measuredHeight;
            this.a.f();
        }
    }

    public void setPaused(boolean z9) {
        p1 p1Var = this.a;
        if (z9 == p1Var.g) {
            return;
        }
        p1Var.g = z9;
        if (z9) {
            p1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.a.n.size(); i7++) {
            o1 o1Var = (o1) this.a.n.get(i7);
            o1Var.a = (System.currentTimeMillis() - this.a.R) + o1Var.a;
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        tg.y yVar = this.b;
        removeCallbacks(yVar);
        postDelayed(yVar, 150L);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
