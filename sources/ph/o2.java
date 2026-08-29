package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o2 extends hv0 implements org.telegram.ui.ActionBar.t3 {
    public final Paint s0;
    public boolean t0;
    public final RectF u0;
    public final Path v0;
    public final /* synthetic */ p2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, Context context) {
        super(context, null);
        this.w0 = p2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.s0 = new Paint(1);
        this.u0 = new RectF();
        this.v0 = new Path();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        p2 p2Var = this.w0;
        nd0 nd0Var = p2Var.o0;
        Rect rect = p2Var.h;
        Rect rect2 = p2Var.f;
        if (this.t0) {
            return;
        }
        int visibility = nd0Var.getVisibility();
        Paint paint2 = this.s0;
        if (visibility != 0) {
            float f9 = p2Var.b0;
            if (f9 < 1.0f && f9 > 0.0f) {
                paint2.setColor(g6.l1(p2Var.J0, p2Var.N));
                int i10 = rect2.left;
                if (i10 > 0) {
                    canvas.drawRect(0.0f, 0.0f, i10, getHeight(), paint2);
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), rect2.top, paint2);
                }
                if (rect2.bottom > 0) {
                    canvas.drawRect(0.0f, getHeight() - rect2.bottom, getWidth(), getHeight(), paint2);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(getWidth() - rect2.right, 0.0f, getWidth(), getHeight(), paint2);
                }
            }
        }
        if (p2Var.s == null || AndroidUtilities.isTablet()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - p2Var.b0) * rect.left, 0.0f);
            a5.j jVar = p2Var.s;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), p2Var.b0);
            getHeight();
            jVar.k(canvas, true, false, lerp, 1.0f - p2Var.b0);
            canvas.translate((1.0f - p2Var.b0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (nd0Var.getVisibility() != 0) {
            paint2.setColor(g6.l1(p2Var.J0, p2Var.N));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - p2Var.b0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - p2Var.b0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f10 = rect2.bottom;
                l2 l2Var = p2Var.h0;
                canvas.drawRect(0.0f, height - (f10 * ((l2Var == null || l2Var.getTotalHeight() <= 0) ? 1.0f - p2Var.b0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(th.b(1.0f, p2Var.b0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p2 p2Var = this.w0;
        Rect rect = p2Var.h;
        LaunchActivity launchActivity = LaunchActivity.C1;
        org.telegram.ui.ActionBar.m3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - p2Var.b0) * ((int) P.C));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        p2 p2Var = this.w0;
        Rect rect = p2Var.h;
        g2 g2Var = p2Var.v;
        Paint paint = p2Var.J;
        m2 m2Var = p2Var.S;
        Drawable drawable = p2Var.U;
        if (this.t0) {
            return;
        }
        super.draw(canvas);
        float f9 = AndroidUtilities.isTablet() ? 0.0f : p2Var.b;
        paint.setColor(p2Var.a);
        paint.setAlpha((int) ((1.0f - p2Var.b0) * (1.0f - (Math.min(0.5f, f9) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f9;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(g2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, p2Var.b) : AndroidUtilities.lerp(g2Var.getTranslationY(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f9) + AndroidUtilities.dp(12.0f);
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (m2Var.getAlpha() * 255.0f));
        float translationY = m2Var.getTranslationY() + m2Var.getY() + m2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        p2 p2Var = this.w0;
        if (view != p2Var.v || !p2Var.d0 || p2Var.f0 <= 0 || p2Var.e0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(p2Var.e0, view.getWidth(), p2Var.c0), view.getY() + AndroidUtilities.lerp(p2Var.f0, view.getHeight(), p2Var.c0));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public RectF getRect() {
        g2 g2Var = this.w0.v;
        float left = g2Var.getLeft();
        float translationY = g2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = g2Var.getRight();
        float height = getHeight();
        RectF rectF = this.u0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.a(this, new eg.x(15));
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        p2 p2Var = this.w0;
        Paint paint = p2Var.P;
        Paint paint2 = p2Var.L;
        g2 g2Var = p2Var.v;
        if (this.t0) {
            return;
        }
        super.onDraw(canvas);
        if (p2Var.o0.getVisibility() != 0) {
            canvas.save();
            a5.j jVar = p2Var.s;
            if (jVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                jVar.k(canvas2, false, false, width, 1.0f - p2Var.b0);
            } else {
                canvas2 = canvas;
            }
            if (!p2Var.R) {
                int v02 = g6.v0(g6.d6, p2Var.A);
                paint2.setColor(v02);
                p2Var.x.setFlickerViewColor(v02);
                org.telegram.ui.h3 h3Var = p2Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    p2Var.Q0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, p2Var.K);
            org.telegram.ui.ActionBar.m3 m3Var = p2Var.r;
            int i10 = m3Var != null ? (int) m3Var.C : 0;
            paint.setColor(p2Var.M);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - p2Var.b);
            rectF.set(AndroidUtilities.lerp(g2Var.getLeft(), 0, p2Var.b0), AndroidUtilities.lerp(g2Var.getTranslationY(), 0.0f, p2Var.b), g2Var.getRight(), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(g2Var.getLeft(), 0, p2Var.b0), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(g2Var.getRight(), getWidth(), p2Var.b0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p2 p2Var = this.w0;
        g2 g2Var = p2Var.v;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, p2Var.b) && motionEvent.getX() <= g2Var.getRight() && motionEvent.getX() >= g2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        p2Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.t0 != z10) {
            this.t0 = z10;
            invalidate();
            p2 p2Var = this.w0;
            p2Var.G();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || !p2Var.Z) {
                return;
            }
            launchActivity.z0(p2Var.N);
        }
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final float z(Canvas canvas, RectF rectF, float f9, RectF rectF2, float f10) {
        p2 p2Var = this.w0;
        g2 g2Var = p2Var.v;
        float left = g2Var.getLeft();
        float translationY = g2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = g2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.u0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f9, rectF2);
        canvas.save();
        Path path = this.v0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - p2Var.b), AndroidUtilities.dp(18.0f), f9);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(p2Var.L);
        if (g2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f9 * AndroidUtilities.dp(51.0f)) + Math.max(g2Var.getY(), rectF2.top));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
