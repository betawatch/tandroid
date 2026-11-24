// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x68 extends FrameLayout {
    public final ylb E;
    public final u68 F;
    public final u68 G;
    public w68 a;
    public final u43 b;
    public final m43 c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public AnimatorSet s;
    public AnimatorSet w;
    public float x;
    public final Paint y;

    public x68(ContextThemeWrapper contextThemeWrapper, ylb ylbVar) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.F = new u68(this, (byte) 0);
        this.G = new u68(this, (byte) 1);
        this.E = ylbVar;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        u43 u43Var = new u43(contextThemeWrapper);
        this.b = u43Var;
        u43Var.setListener(new fk3(this));
        u43Var.setBottomPadding(gm.L(64.0f));
        addView(u43Var);
        this.e = new ImageReceiver(this);
        m43 m43Var = new m43(contextThemeWrapper);
        this.c = m43Var;
        m43Var.setListener(new c43(this, (byte) 2));
        addView(m43Var, qoe.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        u43 u43Var = this.b;
        u43Var.b.setVisibility(4);
        CropAreaView cropAreaView = u43Var.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i, boolean z, boolean z2, n43 n43Var, ncc nccVar, ao6 ao6Var) {
        ao6 ao6Var2;
        requestLayout();
        this.f = false;
        this.e.g0(null);
        u43 u43Var = this.b;
        ImageView imageView = u43Var.b;
        u43Var.y = z;
        u43Var.d = nccVar;
        u43Var.e = n43Var;
        u43Var.L = i;
        u43Var.x = bitmap;
        CropAreaView cropAreaView = u43Var.a;
        cropAreaView.setIsVideo(nccVar != null);
        if (bitmap == null && nccVar == null) {
            u43Var.M = null;
            imageView.setImageDrawable(null);
            ao6Var2 = ao6Var;
        } else {
            int currentWidth = u43Var.getCurrentWidth();
            int currentHeight = u43Var.getCurrentHeight();
            s43 s43Var = u43Var.M;
            if (s43Var == null || !z2) {
                u43Var.M = new s43(u43Var, currentWidth, currentHeight);
                ao6Var2 = ao6Var;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new q43(u43Var, ao6Var2, currentHeight, currentWidth, (byte) 1));
            } else {
                float f = currentWidth;
                s43Var.e *= s43Var.a / f;
                s43Var.a = f;
                s43Var.b = currentHeight;
                s43Var.h();
                Matrix matrix = s43Var.k;
                u43 u43Var2 = s43Var.l;
                matrix.getValues(u43Var2.I);
                matrix.reset();
                float f2 = s43Var.e;
                matrix.postScale(f2, f2);
                float[] fArr = u43Var2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                u43Var2.r(false);
                ao6Var2 = ao6Var;
            }
            imageView.setImageBitmap(nccVar == null ? u43Var.x : null);
        }
        m43 m43Var = this.c;
        m43Var.setFreeform(z);
        m43Var.b(0.0f);
        m43Var.setMirrored(false);
        m43Var.setRotated(false);
        if (ao6Var2 != null) {
            m43Var.b(ao6Var2.d);
            m43Var.setRotated(ao6Var2.k != 0);
            m43Var.setMirrored(ao6Var2.l);
        } else {
            m43Var.setRotated(false);
            m43Var.setMirrored(false);
        }
        m43Var.setVisibility(z ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        u43 u43Var;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.f && view == (u43Var = this.b)) {
            RectF actualRect = u43Var.getActualRect();
            int L = gm.L(32.0f);
            e98 e98Var = (e98) this.a;
            e98Var.getClass();
            int L2 = gm.L(2.0f) + (((int) (((r1.X7.getMeasuredWidth() - gm.L(32.0f)) * e98Var.a.B8) + gm.L(16.0f))) - (L / 2));
            int measuredHeight = getMeasuredHeight() - gm.L(156.0f);
            float f = actualRect.left;
            float f2 = this.r;
            float f3 = ((L2 - f) * f2) + f;
            float f4 = actualRect.top;
            float A = td4.A(measuredHeight, f4, f2, f4);
            float width = ((L - actualRect.width()) * this.r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.q0((int) (width / 2.0f));
            imageReceiver.i0(f3, A, width, width);
            imageReceiver.setAlpha(this.n);
            imageReceiver.h(canvas, null);
            float f5 = this.x;
            Paint paint = this.y;
            if (f5 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(cmb.v0(cmb.pg, this.E));
            paint.setAlpha(Math.min(nm7.d4, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(L2 + r1, gm.L(8.0f) + measuredHeight + L, gm.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.b.getCropHeight();
    }

    public float getRectX() {
        return this.b.getCropLeft() - gm.L(14.0f);
    }

    public float getRectY() {
        return (this.b.getCropTop() - gm.L(14.0f)) - (!this.d ? gm.m : 0);
    }

    public Bitmap getVideoThumb() {
        if (this.f && this.h) {
            return this.e.n();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.H(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((e98) this.a).c();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        s43 s43Var;
        super.onLayout(z, i, i2, i3, i4);
        u43 u43Var = this.b;
        CropAreaView cropAreaView = u43Var.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (s43Var = u43Var.M) == null) {
            return;
        }
        cropAreaView.a(u43Var.h, s43Var.a / s43Var.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(u43Var.f);
        u43Var.M.f(cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        u43Var.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.H(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((e98) this.a).c();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        this.b.setAspectRatio(f);
    }

    public void setDelegate(w68 w68Var) {
        this.a = w68Var;
    }

    public void setFreeform(boolean z) {
        this.b.setFreeform(z);
    }

    public void setSubtitle(String str) {
        this.b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f) {
        this.x = f;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, z ? 1.0f : 0.0f));
        this.w.setDuration(180L);
        this.w.addListener(new v68(this, (byte) 1));
        this.w.start();
    }
}
