// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vx0 extends ela implements dz0 {
    public final Paint m0;
    public boolean n0;
    public final RectF o0;
    public final Path p0;
    public final /* synthetic */ wx0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx0(wx0 wx0Var, Context context) {
        super(context, null);
        this.q0 = wx0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.m0 = new Paint(1);
        this.o0 = new RectF();
        this.p0 = new Path();
    }

    @Override // ela, vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.t8));
        hashSet.add(Integer.valueOf(cmb.F8));
        hashSet.add(Integer.valueOf(cmb.D8));
        hashSet.add(Integer.valueOf(cmb.E8));
        hashSet.add(Integer.valueOf(cmb.H5));
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Paint paint;
        wx0 wx0Var = this.q0;
        by7 by7Var = wx0Var.u0;
        Rect rect = wx0Var.n;
        Rect rect2 = wx0Var.h;
        if (this.n0) {
            return;
        }
        int visibility = by7Var.getVisibility();
        Paint paint2 = this.m0;
        if (visibility != 0) {
            float f = wx0Var.h0;
            if (f < 1.0f && f > 0.0f) {
                paint2.setColor(cmb.p1(wx0Var.S0, wx0Var.T));
                int i = rect2.left;
                if (i > 0) {
                    canvas.drawRect(0.0f, 0.0f, i, getHeight(), paint2);
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
        if (wx0Var.w == null || gm.O1()) {
            z = false;
        } else {
            canvas.save();
            canvas.translate((1.0f - wx0Var.h0) * rect.left, 0.0f);
            sm2 sm2Var = wx0Var.w;
            int U1 = gm.U1(wx0Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
            getHeight();
            sm2Var.t(canvas, true, false, U1, 1.0f - wx0Var.h0);
            canvas.translate((1.0f - wx0Var.h0) * (-rect.left), 0.0f);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
        if (by7Var.getVisibility() != 0) {
            paint2.setColor(cmb.p1(wx0Var.S0, wx0Var.T));
            int i2 = rect2.left;
            if (i2 > 0) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, (1.0f - wx0Var.h0) * i2, getHeight(), paint);
            } else {
                paint = paint2;
            }
            if (rect2.top > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - wx0Var.h0) * rect2.top, paint);
            }
            if (rect2.bottom > 0) {
                float height = getHeight();
                float f2 = rect2.bottom;
                sx0 sx0Var = wx0Var.n0;
                canvas.drawRect(0.0f, height - (f2 * ((sx0Var == null || sx0Var.getTotalHeight() <= 0) ? 1.0f - wx0Var.h0 : 1.0f)), getWidth(), getHeight(), paint);
            }
            if (rect2.right > 0) {
                canvas.drawRect(kt6.B(1.0f, wx0Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wx0 wx0Var = this.q0;
        Rect rect = wx0Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        xy0 O = launchActivity != null ? launchActivity.O() : null;
        if (O != null && rect != null) {
            int i = (int) ((1.0f - wx0Var.h0) * ((int) O.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i && motionEvent.getY() <= getHeight() - rect.bottom && !gm.O1()) {
                return O.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        wx0 wx0Var = this.q0;
        Rect rect = wx0Var.n;
        Paint paint = wx0Var.P;
        tx0 tx0Var = wx0Var.Y;
        Drawable drawable = wx0Var.a0;
        if (this.n0) {
            return;
        }
        super.draw(canvas);
        float f = gm.O1() ? 0.0f : wx0Var.c;
        paint.setColor(wx0Var.a);
        paint.setAlpha((int) ((1.0f - wx0Var.h0) * (1.0f - (Math.min(0.5f, f) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f2 = 1.0f - f;
        boolean O1 = gm.O1();
        nx0 nx0Var = wx0Var.x;
        float R1 = O1 ? gm.R1(nx0Var.getTranslationY() + gm.L(12.0f), gm.m / 2.0f, wx0Var.c) : gm.R1(nx0Var.getTranslationY(), (a.getCurrentActionBarHeight() / 2.0f) + gm.m, f) + gm.L(12.0f);
        canvas.scale(f2, f2, getWidth() / 2.0f, R1);
        canvas.drawLine((getWidth() / 2.0f) - gm.L(16.0f), R1, (getWidth() / 2.0f) + gm.L(16.0f), R1, paint);
        canvas.restore();
        drawable.setAlpha((int) (tx0Var.getAlpha() * 255.0f));
        float translationY = tx0Var.getTranslationY() + tx0Var.getY() + tx0Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        wx0 wx0Var = this.q0;
        if (view != wx0Var.x || !wx0Var.j0 || wx0Var.l0 <= 0 || wx0Var.k0 <= 0) {
            z = false;
        } else {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + gm.U1(wx0Var.i0, wx0Var.k0, view.getWidth()), view.getY() + gm.U1(wx0Var.i0, wx0Var.l0, view.getHeight()));
            z = true;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // dz0
    public RectF getRect() {
        nx0 nx0Var = this.q0.x;
        float left = nx0Var.getLeft();
        float translationY = nx0Var.getTranslationY() + gm.L(24.0f);
        float right = nx0Var.getRight();
        float height = getHeight();
        RectF rectF = this.o0;
        rectF.set(left, translationY, right, height);
        return rectF;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new oz((byte) 2));
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        wx0 wx0Var = this.q0;
        Paint paint = wx0Var.V;
        Paint paint2 = wx0Var.R;
        nx0 nx0Var = wx0Var.x;
        if (this.n0) {
            return;
        }
        super.onDraw(canvas);
        if (wx0Var.u0.getVisibility() != 0) {
            canvas.save();
            sm2 sm2Var = wx0Var.w;
            if (sm2Var != null) {
                int width = getWidth();
                getHeight();
                canvas2 = canvas;
                sm2Var.t(canvas2, false, false, width, 1.0f - wx0Var.h0);
            } else {
                canvas2 = canvas;
            }
            if (!wx0Var.X) {
                int v0 = cmb.v0(cmb.c6, wx0Var.G);
                paint2.setColor(v0);
                wx0Var.E.setFlickerViewColor(v0);
                cx cxVar = wx0Var.Z0;
                if (cxVar != null) {
                    cxVar.b(gm.B(paint2.getColor()) <= 0.721f, false);
                    wx0Var.Z0.setBackgroundColor(paint2.getColor());
                }
            }
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRect(rectF, wx0Var.Q);
            xy0 xy0Var = wx0Var.s;
            int i = xy0Var != null ? (int) xy0Var.H : 0;
            paint.setColor(wx0Var.S);
            float L = gm.L(16.0f) * (gm.O1() ? 1.0f : 1.0f - wx0Var.c);
            rectF.set(gm.U1(wx0Var.h0, nx0Var.getLeft(), 0), gm.R1(nx0Var.getTranslationY(), 0.0f, wx0Var.c), nx0Var.getRight(), nx0Var.getTranslationY() + gm.L(24.0f) + L);
            canvas2.drawRoundRect(rectF, L, L, paint);
            rectF.set(gm.U1(wx0Var.h0, nx0Var.getLeft(), 0), nx0Var.getTranslationY() + gm.L(24.0f), gm.U1(wx0Var.h0, nx0Var.getRight(), getWidth()), getHeight() - i);
            canvas2.drawRect(rectF, paint2);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wx0 wx0Var = this.q0;
        nx0 nx0Var = wx0Var.x;
        if (motionEvent.getAction() != 0 || (motionEvent.getY() > gm.R1(nx0Var.getTranslationY() + gm.L(24.0f), 0.0f, wx0Var.c) && motionEvent.getX() <= nx0Var.getRight() && motionEvent.getX() >= nx0Var.getLeft())) {
            return super.onTouchEvent(motionEvent);
        }
        wx0Var.m(true);
        return true;
    }

    @Override // dz0
    public void setDrawingFromOverlay(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            invalidate();
            wx0 wx0Var = this.q0;
            wx0Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || !wx0Var.f0) {
                return;
            }
            launchActivity.D0(wx0Var.T);
        }
    }

    @Override // ela, vlb
    public final void updateColors() {
        int v0;
        wx0 wx0Var = this.q0;
        Paint paint = wx0Var.R;
        vx0 vx0Var = wx0Var.f;
        tx0 tx0Var = wx0Var.Y;
        ylb ylbVar = wx0Var.G;
        if (tx0Var == null || vx0Var == null) {
            return;
        }
        try {
            if (wx0Var.E == null || paint == null) {
                return;
            }
            if (!wx0Var.W) {
                int i = wx0Var.w0;
                if (i < 0) {
                    i = cmb.c6;
                }
                int v02 = cmb.v0(i, ylbVar);
                int i2 = wx0Var.S;
                if (v02 != i2) {
                    wx0Var.S = v02;
                    if ((tx0Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) tx0Var.getBackground()).getColor() == i2) {
                        tx0Var.setBackgroundColor(wx0Var.S);
                    }
                }
            }
            if (wx0Var.J0 && wx0Var.n0 != null && (v0 = cmb.v0(cmb.Z6, ylbVar)) != wx0Var.T) {
                wx0Var.D(v0, false);
                wx0Var.J0 = true;
            }
            if (wx0Var.a == wx0Var.b) {
                int w0 = cmb.w0(null, cmb.yj, false);
                wx0Var.b = w0;
                wx0Var.a = w0;
            }
            int color = paint.getColor();
            if (!wx0Var.W) {
                color = (((((((((((color * 31) + cmb.v0(cmb.F6, ylbVar)) * 31) + cmb.v0(cmb.t8, ylbVar)) * 31) + cmb.v0(cmb.F8, ylbVar)) * 31) + cmb.v0(cmb.D8, ylbVar)) * 31) + cmb.v0(cmb.E8, ylbVar)) * 31) + cmb.v0(cmb.H5, ylbVar);
            }
            if (!wx0Var.K0 || color != wx0Var.L0) {
                wx0Var.K0 = true;
                wx0Var.L0 = color;
                wx0Var.F();
            }
            wx0Var.J();
            vx0Var.invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // dz0
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        wx0 wx0Var = this.q0;
        nx0 nx0Var = wx0Var.x;
        float left = nx0Var.getLeft();
        float translationY = nx0Var.getTranslationY() + gm.L(24.0f);
        float right = nx0Var.getRight();
        float height = getHeight();
        RectF rectF3 = this.o0;
        rectF3.set(left, translationY, right, height);
        gm.a2(rectF3, rectF, f, rectF2);
        canvas.save();
        Path path = this.p0;
        path.rewind();
        float R1 = gm.R1(gm.L(16.0f) * (gm.O1() ? 1.0f : 1.0f - wx0Var.c), gm.L(18.0f), f);
        path.addRoundRect(rectF2, R1, R1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(wx0Var.R);
        if (nx0Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f * gm.L(51.0f)) + Math.max(nx0Var.getY(), rectF2.top));
            nx0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return R1;
    }
}
