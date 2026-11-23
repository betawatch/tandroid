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
import org.telegram.messenger.cz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.b6;
import tg.z1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class t1 extends View implements b6 {
    public s1 a;
    public final s4.s0 b;
    public int c;
    public z d;
    public boolean e;
    public Paint f;
    public LinearGradient h;
    public Matrix n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Context context) {
        super(context);
        int i7 = cz.o() == 2 ? ls.e3 : cz.o() == 1 ? 100 : 50;
        this.b = new s4.s0(this, 6);
        this.e = true;
        this.a = new s1(i7);
        a();
    }

    public void a() {
        s1 s1Var = this.a;
        s1Var.O = 100;
        s1Var.M = true;
        s1Var.G = true;
        s1Var.K = true;
        s1Var.H = true;
        s1Var.r = 4;
        s1Var.w = 0.98f;
        s1Var.v = 0.98f;
        s1Var.u = 0.98f;
        s1Var.c();
    }

    public final void b(float f10) {
        float f11 = f10 < 60.0f ? 5.0f : f10 < 180.0f ? 9.0f : 15.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        z1 z1Var = new z1(this, 4);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f11);
        ofFloat.addUpdateListener(z1Var);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 1.0f);
        ofFloat2.addUpdateListener(z1Var);
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
        z zVar = new z(this, 1);
        this.d = zVar;
        qc.a(zVar);
        boolean e10 = qc.e(131072);
        if (this.e != e10) {
            this.e = e10;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        z zVar = this.d;
        if (zVar == null || (hashSet = qc.n) == null) {
            return;
        }
        hashSet.remove(zVar);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), ls.e4, 31);
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

    public void setPaused(boolean z10) {
        s1 s1Var = this.a;
        if (z10 == s1Var.g) {
            return;
        }
        s1Var.g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < this.a.n.size(); i7++) {
            r1 r1Var = (r1) this.a.n.get(i7);
            r1Var.a = (System.currentTimeMillis() - this.a.R) + r1Var.a;
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        s4.s0 s0Var = this.b;
        removeCallbacks(s0Var);
        postDelayed(s0Var, 150L);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
