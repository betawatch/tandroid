// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p94 extends TextView implements snb {
    public ul a;
    public final Paint b;
    public final Path c;
    public final RectF d;
    public ValueAnimator e;
    public float f;
    public float h;
    public float n;
    public boolean r;
    public int s;
    public final /* synthetic */ q94 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p94(q94 q94Var, Context context) {
        super(context);
        this.w = q94Var;
        this.b = new Paint(1);
        this.c = new Path();
        this.d = new RectF();
        this.h = -1.0f;
        int L = hl.L(14.0f);
        int p1 = aob.p1(0.25f, aob.v0(aob.n6, q94Var.a));
        setForeground(aob.i0(L, L, L, L, 0, p1, p1));
    }

    public final void a(boolean z, boolean z2) {
        if (z2 && isSelected() == z) {
            return;
        }
        setSelected(z);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            this.f = z ? 1.0f : 0.0f;
            b();
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, z ? 1.0f : 0.0f);
            this.e = ofFloat;
            ofFloat.setDuration(280L);
            this.e.setInterpolator(k43.h);
            this.e.addUpdateListener(new az1(this, (byte) 26));
            this.e.start();
        }
    }

    public final void b() {
        this.r = true;
        int i = aob.n6;
        vnb vnbVar = this.w.a;
        int f = vm2.f(this.f, aob.v0(i, vnbVar), aob.v0(aob.Ji, vnbVar));
        if (getCurrentTextColor() != f) {
            setTextColor(f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ul ulVar = this.a;
        if (ulVar != null) {
            ulVar.a();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f = isSelected() ? 1.0f : 0.0f;
        b();
        ul ulVar = this.a;
        if (ulVar != null) {
            ulVar.b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = aob.n6;
        vnb vnbVar = this.w.a;
        int v0 = aob.v0(i, vnbVar);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, width, height);
        Path path = this.c;
        path.rewind();
        float L = hl.L(14.0f);
        float L2 = hl.L(14.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, L, L2, direction);
        canvas.save();
        canvas.clipPath(path);
        int p1 = aob.p1(0.1f, v0);
        Paint paint = this.b;
        paint.setColor(p1);
        canvas.drawRect(rectF, paint);
        if (this.f > 0.0f) {
            float f = this.h;
            if (f < 0.0f) {
                f = getWidth() / 2.0f;
            }
            float height2 = this.h < 0.0f ? getHeight() / 2.0f : this.n;
            float hypot = (float) Math.hypot(Math.max(f, getWidth() - f), Math.max(height2, getHeight() - height2));
            path.rewind();
            path.addCircle(f, height2, hypot * this.f, direction);
            canvas.clipPath(path);
            paint.setColor(aob.v0(aob.Fi, vnbVar));
            canvas.drawRect(rectF, paint);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isSelected());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.h = motionEvent.getX();
            this.n = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // snb
    public final void updateColors() {
        try {
            if (this.r) {
                b();
            }
            int p1 = aob.p1(0.25f, aob.v0(aob.n6, this.w.a));
            if (p1 != this.s) {
                this.s = p1;
                aob.F1(getForeground(), p1, true);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
