package pg;

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
import fh.d2;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.ui.yi0;
import r0.m1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public float A;
    public int B;
    public final Rect C;
    public final RectF D;
    public ig.b E;
    public float F;
    public float G;
    public boolean H;
    public xg.g a;
    public final yi0 b;
    public final FrameLayout c;
    public final d2 d;
    public boolean e;
    public kg.d f;
    public kg.d h;
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
        this.C = new Rect();
        this.D = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, e6.e(-1, -2, 80));
        d2 d2Var = new d2(this, context, 27);
        this.d = d2Var;
        addView(d2Var, e6.e(-1, -2, 80));
        this.b = new yi0(this, context, 10);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.s) + AndroidUtilities.dp(9.0f) + this.B;
        if (this.r != round || z10) {
            this.r = round;
            int dp = AndroidUtilities.dp(29.0f);
            float measuredHeight = getMeasuredHeight() - this.v;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.D;
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
        int i9;
        int measuredHeight;
        ig.b bVar = this.E;
        if (bVar == null || (i9 = bVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.F))) {
            return;
        }
        this.E.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i9, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i9, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        m1 m1Var = ((xg.i) this.a).r;
        int i9 = m1Var != null ? m1Var.a.f(2).d : 0;
        float b10 = ((xg.i) this.a).b();
        d2 d2Var = this.d;
        int childCount = d2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyEvent.Callback childAt = d2Var.getChildAt(i10);
            if (childAt instanceof xg.a) {
                xg.a aVar = (xg.a) childAt;
                aVar.a(i9);
                aVar.d(b10);
            }
        }
    }

    public final void d() {
        int i9;
        WindowInsets rootWindowInsets;
        this.s = ((xg.i) this.a).c();
        this.v = ((xg.i) this.a).b();
        int i10 = 0;
        this.w = ((xg.i) this.a).s != 1;
        d2 d2Var = this.d;
        boolean z10 = d2Var.getVisibility() == 0;
        boolean z11 = this.w;
        if (z10 != z11) {
            d2Var.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = ((xg.i) this.a).w;
        if (i11 != i12) {
            layoutParams.height = i12;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i9 = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i9 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i10 = roundedCorner2.getRadius();
                }
            }
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), l0.z(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.r;
        int round = Math.round(this.x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.y);
        int i9 = this.B;
        Rect rect = this.C;
        rect.set(round, 0, measuredWidth, i9);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.G));
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
        boolean z10 = view == this.d;
        if (z10) {
            canvas.save();
            canvas.clipPath(this.h.h.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
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
        return this.A;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kg.d dVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            kg.d dVar2 = this.f;
            this.H = (dVar2 != null && dVar2.j == 255 && dVar2.getBounds().contains(x10, y10)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y10));
        }
        if (action == 1 || action == 3) {
            this.H = false;
        }
        return this.H;
    }

    public void setBackgroundWithFadeDrawable(ig.b bVar) {
        this.E = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.F != f10) {
            this.F = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i9) {
        kg.d dVar = this.f;
        if (dVar != null) {
            dVar.setAlpha(i9);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.A = f10;
        this.B = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.G = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(kg.d dVar) {
        this.f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(kg.d dVar) {
        this.h = dVar;
        dVar.k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        kg.d dVar2 = this.h;
        dVar2.h.g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(xg.g gVar) {
        this.a = gVar;
    }
}
