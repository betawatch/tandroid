package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y3;
import org.telegram.ui.iw0;
import qh.o9;
import r0.m1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public float B;
    public int C;
    public final Rect D;
    public final RectF E;
    public og.b F;
    public float G;
    public float H;
    public boolean I;
    public dh.g a;
    public final iw0 b;
    public final FrameLayout c;
    public final o9 d;
    public boolean e;
    public qg.b f;
    public qg.b h;
    public final Path n;
    public int r;
    public float s;
    public float v;
    public boolean w;
    public float x;
    public float y;

    public f(Context context) {
        super(context);
        this.e = true;
        this.n = new Path();
        this.D = new Rect();
        this.E = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, c6.e(-1, -2, 80));
        o9 o9Var = new o9(this, context, 3);
        this.d = o9Var;
        addView(o9Var, c6.e(-1, -2, 80));
        this.b = new iw0(this, context, 11);
    }

    public final void a(boolean z4) {
        e();
        int round = Math.round(this.s) + AndroidUtilities.dp(9.0f) + this.C;
        if (this.r != round || z4) {
            this.r = round;
            int dp = AndroidUtilities.dp(29.0f);
            float measuredHeight = getMeasuredHeight() - this.v;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.E;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.n;
            path.rewind();
            float f10 = dp;
            path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void b() {
        int i10;
        int measuredHeight;
        og.b bVar = this.F;
        if (bVar == null || (i10 = bVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.G))) {
            return;
        }
        this.F.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        m1 m1Var = ((dh.i) this.a).r;
        int i10 = m1Var != null ? m1Var.a.f(2).d : 0;
        float b10 = ((dh.i) this.a).b();
        o9 o9Var = this.d;
        int childCount = o9Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = o9Var.getChildAt(i11);
            if (childAt instanceof dh.a) {
                dh.a aVar = (dh.a) childAt;
                aVar.b(i10);
                aVar.c(b10);
            }
        }
    }

    public final void d() {
        int i10;
        WindowInsets rootWindowInsets;
        this.s = ((dh.i) this.a).c();
        this.v = ((dh.i) this.a).b();
        int i11 = 0;
        this.w = ((dh.i) this.a).s != 1;
        o9 o9Var = this.d;
        boolean z4 = o9Var.getVisibility() == 0;
        boolean z10 = this.w;
        if (z4 != z10) {
            o9Var.setVisibility(z10 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o9Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((dh.i) this.a).w;
        if (i12 != i13) {
            layoutParams.height = i13;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i10 = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i10 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i11 = roundedCorner2.getRadius();
                }
            }
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i11, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), y3.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.r;
        int round = Math.round(this.x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.y);
        int i10 = this.C;
        Rect rect = this.D;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.H));
        this.f.setBounds(rect);
        if (this.e) {
            this.f.draw(canvas);
        }
        if (this.w) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4 = view == this.d;
        if (z4) {
            canvas.save();
            canvas.clipPath(this.h.h.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.s) - AndroidUtilities.dp(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.B;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qg.b bVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            qg.b bVar2 = this.f;
            this.I = (bVar2 != null && bVar2.j == 255 && bVar2.getBounds().contains(x10, y10)) || ((bVar = this.h) != null && bVar.getBounds().contains(x10, y10));
        }
        if (action == 1 || action == 3) {
            this.I = false;
        }
        return this.I;
    }

    public void setBackgroundWithFadeDrawable(og.b bVar) {
        this.F = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.G != f10) {
            this.G = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        qg.b bVar = this.f;
        if (bVar != null) {
            bVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.B = f10;
        this.C = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.H = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(qg.b bVar) {
        this.f = bVar;
        bVar.o(AndroidUtilities.dp(7.0f));
        this.f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(qg.b bVar) {
        this.h = bVar;
        bVar.k = true;
        bVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        qg.b bVar2 = this.h;
        bVar2.h.g = 0.4f;
        bVar2.j();
    }

    public void setWindowInsetsProvider(dh.g gVar) {
        this.a = gVar;
    }
}
