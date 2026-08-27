package qg;

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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.y1;
import org.telegram.ui.aj0;
import r0.m1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public float A;
    public int B;
    public final Rect C;
    public final RectF D;
    public jg.b E;
    public float F;
    public float G;
    public boolean H;
    public yg.g a;
    public final aj0 b;
    public final FrameLayout c;
    public final f d;
    public boolean e;
    public lg.d f;
    public lg.d h;
    public final Path n;
    public int r;
    public float s;
    public float v;
    public boolean w;
    public float x;
    public float y;

    public g(Context context) {
        super(context);
        this.e = true;
        this.n = new Path();
        this.C = new Rect();
        this.D = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, z5.e(-1, -2, 80));
        f fVar = new f(this, context, 0);
        this.d = fVar;
        addView(fVar, z5.e(-1, -2, 80));
        this.b = new aj0(this, context, 11);
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
        int i10;
        int measuredHeight;
        jg.b bVar = this.E;
        if (bVar == null || (i10 = bVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.F))) {
            return;
        }
        this.E.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        m1 m1Var = ((yg.i) this.a).r;
        int i10 = m1Var != null ? m1Var.a.f(2).d : 0;
        float b10 = ((yg.i) this.a).b();
        f fVar = this.d;
        int childCount = fVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = fVar.getChildAt(i11);
            if (childAt instanceof yg.a) {
                yg.a aVar = (yg.a) childAt;
                aVar.a(i10);
                aVar.d(b10);
            }
        }
    }

    public final void d() {
        int i10;
        WindowInsets rootWindowInsets;
        this.s = ((yg.i) this.a).c();
        this.v = ((yg.i) this.a).b();
        int i11 = 0;
        this.w = ((yg.i) this.a).s != 1;
        f fVar = this.d;
        boolean z10 = fVar.getVisibility() == 0;
        boolean z11 = this.w;
        if (z10 != z11) {
            fVar.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fVar.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((yg.i) this.a).w;
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
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), y1.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.r;
        int round = Math.round(this.x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.y);
        int i10 = this.B;
        Rect rect = this.C;
        rect.set(round, 0, measuredWidth, i10);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
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
        lg.d dVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            lg.d dVar2 = this.f;
            this.H = (dVar2 != null && dVar2.j == 255 && dVar2.getBounds().contains(x8, y10)) || ((dVar = this.h) != null && dVar.getBounds().contains(x8, y10));
        }
        if (action == 1 || action == 3) {
            this.H = false;
        }
        return this.H;
    }

    public void setBackgroundWithFadeDrawable(jg.b bVar) {
        this.E = bVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.F != f10) {
            this.F = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        lg.d dVar = this.f;
        if (dVar != null) {
            dVar.setAlpha(i10);
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

    public void setInputIslandBubbleDrawable(lg.d dVar) {
        this.f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(lg.d dVar) {
        this.h = dVar;
        dVar.k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        lg.d dVar2 = this.h;
        dVar2.h.g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(yg.g gVar) {
        this.a = gVar;
    }
}
