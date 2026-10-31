package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l2 extends uu0 implements org.telegram.ui.ActionBar.o3 {
    public final Paint f0;
    public boolean g0;
    public final RectF h0;
    public final Path i0;
    public final /* synthetic */ m2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, Context context) {
        super(context, null);
        this.j0 = m2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f0 = new Paint(1);
        this.h0 = new RectF();
        this.i0 = new Path();
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.d6));
        hashSet.add(Integer.valueOf(t6.a7));
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.u8));
        hashSet.add(Integer.valueOf(t6.G8));
        hashSet.add(Integer.valueOf(t6.E8));
        hashSet.add(Integer.valueOf(t6.F8));
        hashSet.add(Integer.valueOf(t6.I5));
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        m2 m2Var = this.j0;
        zc0 zc0Var = m2Var.t0;
        Rect rect = m2Var.n;
        Rect rect2 = m2Var.h;
        if (this.g0) {
            return;
        }
        int visibility = zc0Var.getVisibility();
        Paint paint2 = this.f0;
        if (visibility != 0) {
            float f7 = m2Var.g0;
            if (f7 < 1.0f && f7 > 0.0f) {
                paint2.setColor(t6.r1(m2Var.R0, m2Var.S));
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
        if (m2Var.w == null || org.telegram.messenger.i0.Q1()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - m2Var.g0) * rect.left, 0.0f);
            bh.d dVar = m2Var.w;
            int W1 = org.telegram.messenger.i0.W1(m2Var.g0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            dVar.n(canvas, true, false, W1, 1.0f - m2Var.g0);
            canvas.translate((1.0f - m2Var.g0) * (-rect.left), 0.0f);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        if (zc0Var.getVisibility() != 0) {
            paint2.setColor(t6.r1(m2Var.R0, m2Var.S));
            int i11 = rect2.left;
            if (i11 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - m2Var.g0) * i11, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - m2Var.g0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f10 = rect2.bottom;
                i2 i2Var = m2Var.m0;
                canvas.drawRect(0.0f, height - (f10 * ((i2Var == null || i2Var.getTotalHeight() <= 0) ? 1.0f - m2Var.g0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(sc.e.z(1.0f, m2Var.g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m2 m2Var = this.j0;
        Rect rect = m2Var.n;
        LaunchActivity launchActivity = LaunchActivity.I1;
        org.telegram.ui.ActionBar.i3 O = launchActivity != null ? launchActivity.O() : null;
        if (O != null && rect != null) {
            int i10 = (int) ((1.0f - m2Var.g0) * ((int) O.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.i0.Q1()) {
                return O.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        m2 m2Var = this.j0;
        Rect rect = m2Var.n;
        d2 d2Var = m2Var.x;
        Paint paint = m2Var.O;
        j2 j2Var = m2Var.X;
        Drawable drawable = m2Var.Z;
        if (this.g0) {
            return;
        }
        super.draw(canvas);
        float f7 = org.telegram.messenger.i0.Q1() ? 0.0f : m2Var.c;
        paint.setColor(m2Var.a);
        paint.setAlpha((int) ((1.0f - m2Var.g0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        float T1 = org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.T1(d2Var.getTranslationY() + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.m / 2.0f, m2Var.c) : org.telegram.messenger.i0.T1(d2Var.getTranslationY(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.i0.m, f7) + org.telegram.messenger.i0.L(12.0f);
        canvas.scale(f10, f10, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.i0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.i0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (j2Var.getAlpha() * 255.0f));
        float translationY = j2Var.getTranslationY() + j2Var.getY() + j2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        m2 m2Var = this.j0;
        if (view != m2Var.x || !m2Var.i0 || m2Var.k0 <= 0 || m2Var.j0 <= 0) {
            z10 = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.i0.W1(m2Var.h0, m2Var.j0, view.getWidth()), view.getY() + org.telegram.messenger.i0.W1(m2Var.h0, m2Var.k0, view.getHeight()));
            z10 = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.o3
    public RectF getRect() {
        d2 d2Var = this.j0.x;
        float left = d2Var.getLeft();
        float translationY = d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f);
        float right = d2Var.getRight();
        float height = getHeight();
        RectF rectF = this.h0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new mg.u(14));
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        m2 m2Var = this.j0;
        Paint paint = m2Var.U;
        Paint paint2 = m2Var.Q;
        d2 d2Var = m2Var.x;
        if (this.g0) {
            return;
        }
        super.onDraw(canvas);
        if (m2Var.t0.getVisibility() != 0) {
            canvas.save();
            bh.d dVar = m2Var.w;
            if (dVar != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                dVar.n(canvas2, false, false, width, 1.0f - m2Var.g0);
            } else {
                canvas2 = canvas;
            }
            if (!m2Var.W) {
                int w02 = t6.w0(t6.d6, m2Var.F);
                paint2.setColor(w02);
                m2Var.D.setFlickerViewColor(w02);
                org.telegram.ui.b3 b3Var = m2Var.Y0;
                if (b3Var != null) {
                    b3Var.b(org.telegram.messenger.i0.B(paint2.getColor()) <= 0.721f, false);
                    m2Var.Y0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, m2Var.P);
            org.telegram.ui.ActionBar.i3 i3Var = m2Var.s;
            int i10 = i3Var != null ? (int) i3Var.G : 0;
            paint.setColor(m2Var.R);
            float L = org.telegram.messenger.i0.L(16.0f) * (org.telegram.messenger.i0.Q1() ? 1.0f : 1.0f - m2Var.c);
            rectF.set(org.telegram.messenger.i0.W1(m2Var.g0, d2Var.getLeft(), 0), org.telegram.messenger.i0.T1(d2Var.getTranslationY(), 0.0f, m2Var.c), d2Var.getRight(), d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(org.telegram.messenger.i0.W1(m2Var.g0, d2Var.getLeft(), 0), d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.W1(m2Var.g0, d2Var.getRight(), getWidth()), getHeight() - i10);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var = this.j0;
        d2 d2Var = m2Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > org.telegram.messenger.i0.T1(d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f), 0.0f, m2Var.c) && motionEvent.getX() <= d2Var.getRight() && motionEvent.getX() >= d2Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        m2Var.o(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o3
    public void setDrawingFromOverlay(boolean z10) {
        if (this.g0 != z10) {
            this.g0 = z10;
            invalidate();
            m2 m2Var = this.j0;
            m2Var.L();
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || !m2Var.e0) {
                return;
            }
            launchActivity.D0(m2Var.S);
        }
    }

    @Override // org.telegram.ui.Components.uu0, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        m2 m2Var = this.j0;
        Paint paint = m2Var.Q;
        l2 l2Var = m2Var.f;
        j2 j2Var = m2Var.X;
        p6 p6Var = m2Var.F;
        if (j2Var == null || l2Var == null) {
            return;
        }
        try {
            if (m2Var.D != null && paint != null) {
                if (!m2Var.V) {
                    int i10 = m2Var.v0;
                    if (i10 < 0) {
                        i10 = t6.d6;
                    }
                    int w03 = t6.w0(i10, p6Var);
                    int i11 = m2Var.R;
                    if (w03 != i11) {
                        m2Var.R = w03;
                        if ((j2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) j2Var.getBackground()).getColor() == i11) {
                            j2Var.setBackgroundColor(m2Var.R);
                        }
                    }
                }
                if (m2Var.I0 && m2Var.m0 != null && (w02 = t6.w0(t6.a7, p6Var)) != m2Var.S) {
                    m2Var.D(w02, false);
                    m2Var.I0 = true;
                }
                if (m2Var.a == m2Var.b) {
                    int x02 = t6.x0(null, t6.wj, false);
                    m2Var.b = x02;
                    m2Var.a = x02;
                }
                int color = paint.getColor();
                if (!m2Var.V) {
                    color = (((((((((((color * 31) + t6.w0(t6.G6, p6Var)) * 31) + t6.w0(t6.u8, p6Var)) * 31) + t6.w0(t6.G8, p6Var)) * 31) + t6.w0(t6.E8, p6Var)) * 31) + t6.w0(t6.F8, p6Var)) * 31) + t6.w0(t6.I5, p6Var);
                }
                if (!m2Var.J0 || color != m2Var.K0) {
                    m2Var.J0 = true;
                    m2Var.K0 = color;
                    m2Var.F();
                }
                m2Var.J();
                l2Var.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o3
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        m2 m2Var = this.j0;
        d2 d2Var = m2Var.x;
        float left = d2Var.getLeft();
        float translationY = d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f);
        float right = d2Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.h0;
        rectF3.set(left, translationY, right, height);
        org.telegram.messenger.i0.c2(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.i0;
        path.rewind();
        float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(16.0f) * (org.telegram.messenger.i0.Q1() ? 1.0f : 1.0f - m2Var.c), org.telegram.messenger.i0.L(18.0f), f7);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(m2Var.Q);
        if (d2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * org.telegram.messenger.i0.L(51.0f)) + Math.max(d2Var.getY(), rectF2.top));
            d2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
