package sh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class o2 extends qv0 implements org.telegram.ui.ActionBar.v3 {
    public final Paint t0;
    public boolean u0;
    public final RectF v0;
    public final Path w0;
    public final /* synthetic */ p2 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, Context context) {
        super(context, null);
        this.x0 = p2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.t0 = new Paint(1);
        this.v0 = new RectF();
        this.w0 = new Path();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        Paint paint;
        p2 p2Var = this.x0;
        xd0 xd0Var = p2Var.p0;
        Rect rect = p2Var.h;
        Rect rect2 = p2Var.f;
        if (this.u0) {
            return;
        }
        int visibility = xd0Var.getVisibility();
        Paint paint2 = this.t0;
        if (visibility != 0) {
            float f10 = p2Var.c0;
            if (f10 < 1.0f && f10 > 0.0f) {
                paint2.setColor(k6.l1(p2Var.K0, p2Var.O));
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
            z4 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - p2Var.c0) * rect.left, 0.0f);
            c5.j jVar = p2Var.s;
            int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), p2Var.c0);
            getHeight();
            jVar.p(canvas, true, false, lerp, 1.0f - p2Var.c0);
            canvas.translate((1.0f - p2Var.c0) * (-rect.left), 0.0f);
            z4 = true;
        }
        super.dispatchDraw(canvas);
        if (z4) {
            canvas.restore();
        }
        if (xd0Var.getVisibility() != 0) {
            paint2.setColor(k6.l1(p2Var.K0, p2Var.O));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - p2Var.c0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - p2Var.c0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f11 = rect2.bottom;
                l2 l2Var = p2Var.i0;
                canvas.drawRect(0.0f, height - (f11 * ((l2Var == null || l2Var.getTotalHeight() <= 0) ? 1.0f - p2Var.c0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(yh.c(1.0f, p2Var.c0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p2 p2Var = this.x0;
        Rect rect = p2Var.h;
        LaunchActivity launchActivity = LaunchActivity.D1;
        org.telegram.ui.ActionBar.o3 P = launchActivity != null ? launchActivity.P() : null;
        if (P != null && rect != null) {
            int i10 = (int) ((1.0f - p2Var.c0) * ((int) P.D));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return P.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        p2 p2Var = this.x0;
        Rect rect = p2Var.h;
        g2 g2Var = p2Var.v;
        Paint paint = p2Var.K;
        m2 m2Var = p2Var.T;
        Drawable drawable = p2Var.V;
        if (this.u0) {
            return;
        }
        super.draw(canvas);
        float f10 = AndroidUtilities.isTablet() ? 0.0f : p2Var.b;
        paint.setColor(p2Var.a);
        paint.setAlpha((int) ((1.0f - p2Var.c0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(g2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, p2Var.b) : AndroidUtilities.lerp(g2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f10) + AndroidUtilities.dp(12.0f);
        canvas.scale(f11, f11, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (m2Var.getAlpha() * 255.0f));
        float translationY = m2Var.getTranslationY() + m2Var.getY() + m2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        p2 p2Var = this.x0;
        if (view != p2Var.v || !p2Var.e0 || p2Var.g0 <= 0 || p2Var.f0 <= 0) {
            z4 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(p2Var.f0, view.getWidth(), p2Var.d0), view.getY() + AndroidUtilities.lerp(p2Var.g0, view.getHeight(), p2Var.d0));
            z4 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public RectF getRect() {
        g2 g2Var = this.x0.v;
        float left = g2Var.getLeft();
        float translationY = g2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = g2Var.getRight();
        float height = getHeight();
        RectF rectF = this.v0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new hg.w(15));
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        p2 p2Var = this.x0;
        Paint paint = p2Var.Q;
        Paint paint2 = p2Var.M;
        g2 g2Var = p2Var.v;
        if (this.u0) {
            return;
        }
        super.onDraw(canvas);
        if (p2Var.p0.getVisibility() != 0) {
            canvas.save();
            c5.j jVar = p2Var.s;
            if (jVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                jVar.p(canvas2, false, false, width, 1.0f - p2Var.c0);
            } else {
                canvas2 = canvas;
            }
            if (!p2Var.S) {
                int v02 = k6.v0(k6.d6, p2Var.B);
                paint2.setColor(v02);
                p2Var.x.setFlickerViewColor(v02);
                org.telegram.ui.f3 f3Var = p2Var.R0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                    p2Var.R0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, p2Var.L);
            org.telegram.ui.ActionBar.o3 o3Var = p2Var.r;
            int i10 = o3Var != null ? (int) o3Var.D : 0;
            paint.setColor(p2Var.N);
            float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - p2Var.b);
            rectF.set(AndroidUtilities.lerp(g2Var.getLeft(), 0, p2Var.c0), AndroidUtilities.lerp(g2Var.getTranslationY(), 0.0f, p2Var.b), g2Var.getRight(), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
            canvas2.drawRoundRect(rectF, dp, dp, paint);
            rectF.set(AndroidUtilities.lerp(g2Var.getLeft(), 0, p2Var.c0), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(g2Var.getRight(), getWidth(), p2Var.c0), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p2 p2Var = this.x0;
        g2 g2Var = p2Var.v;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.lerp(g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, p2Var.b) && motionEvent.getX() <= g2Var.getRight() && motionEvent.getX() >= g2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        p2Var.k(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.v3
    public void setDrawingFromOverlay(boolean z4) {
        if (this.u0 != z4) {
            this.u0 = z4;
            invalidate();
            p2 p2Var = this.x0;
            p2Var.G();
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity == null || !p2Var.a0) {
                return;
            }
            launchActivity.z0(p2Var.O);
        }
    }

    @Override // org.telegram.ui.ActionBar.v3
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        p2 p2Var = this.x0;
        g2 g2Var = p2Var.v;
        float left = g2Var.getLeft();
        float translationY = g2Var.getTranslationY() + AndroidUtilities.dp(24.0f);
        float right = g2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.v0;
        rectF3.set(left, translationY, right, height);
        AndroidUtilities.lerpCentered(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.w0;
        path.rewind();
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - p2Var.b), AndroidUtilities.dp(18.0f), f10);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(p2Var.M);
        if (g2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * AndroidUtilities.dp(51.0f)) + Math.max(g2Var.getY(), rectF2.top));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
