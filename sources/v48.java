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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v48 extends FrameLayout {
    public final wjb E;
    public final s48 F;
    public final s48 G;
    public u48 a;
    public final j33 b;
    public final b33 c;
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

    public v48(ContextThemeWrapper contextThemeWrapper, wjb wjbVar) {
        super(contextThemeWrapper);
        this.h = true;
        this.r = 1.0f;
        this.x = 0.0f;
        this.y = new Paint(1);
        this.F = new s48(this, (byte) 0);
        this.G = new s48(this, (byte) 1);
        this.E = wjbVar;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        j33 j33Var = new j33(contextThemeWrapper);
        this.b = j33Var;
        j33Var.setListener(new s34((Object) this, (byte) 22));
        j33Var.setBottomPadding(gl.L(64.0f));
        addView(j33Var);
        this.e = new ImageReceiver(this);
        b33 b33Var = new b33(contextThemeWrapper);
        this.c = b33Var;
        b33Var.setListener(new r23(this, (byte) 2));
        addView(b33Var, nme.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        j33 j33Var = this.b;
        j33Var.b.setVisibility(4);
        CropAreaView cropAreaView = j33Var.a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i, boolean z, boolean z2, c33 c33Var, kac kacVar, zl6 zl6Var) {
        zl6 zl6Var2;
        requestLayout();
        this.f = false;
        this.e.g0(null);
        j33 j33Var = this.b;
        ImageView imageView = j33Var.b;
        j33Var.y = z;
        j33Var.d = kacVar;
        j33Var.e = c33Var;
        j33Var.L = i;
        j33Var.x = bitmap;
        CropAreaView cropAreaView = j33Var.a;
        cropAreaView.setIsVideo(kacVar != null);
        if (bitmap == null && kacVar == null) {
            j33Var.M = null;
            imageView.setImageDrawable(null);
            zl6Var2 = zl6Var;
        } else {
            int currentWidth = j33Var.getCurrentWidth();
            int currentHeight = j33Var.getCurrentHeight();
            h33 h33Var = j33Var.M;
            if (h33Var == null || !z2) {
                j33Var.M = new h33(j33Var, currentWidth, currentHeight);
                zl6Var2 = zl6Var;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new f33(j33Var, zl6Var2, currentHeight, currentWidth, (byte) 1));
            } else {
                float f = currentWidth;
                h33Var.e *= h33Var.a / f;
                h33Var.a = f;
                h33Var.b = currentHeight;
                h33Var.h();
                Matrix matrix = h33Var.k;
                j33 j33Var2 = h33Var.l;
                matrix.getValues(j33Var2.I);
                matrix.reset();
                float f2 = h33Var.e;
                matrix.postScale(f2, f2);
                float[] fArr = j33Var2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                j33Var2.r(false);
                zl6Var2 = zl6Var;
            }
            imageView.setImageBitmap(kacVar == null ? j33Var.x : null);
        }
        b33 b33Var = this.c;
        b33Var.setFreeform(z);
        b33Var.b(0.0f);
        b33Var.setMirrored(false);
        b33Var.setRotated(false);
        if (zl6Var2 != null) {
            b33Var.b(zl6Var2.d);
            b33Var.setRotated(zl6Var2.k != 0);
            b33Var.setMirrored(zl6Var2.l);
        } else {
            b33Var.setRotated(false);
            b33Var.setMirrored(false);
        }
        b33Var.setVisibility(z ? 0 : 4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j33 j33Var;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.f && view == (j33Var = this.b)) {
            RectF actualRect = j33Var.getActualRect();
            int L = gl.L(32.0f);
            d78 d78Var = (d78) this.a;
            d78Var.getClass();
            int L2 = gl.L(2.0f) + (((int) (((r1.Y7.getMeasuredWidth() - gl.L(32.0f)) * d78Var.a.C8) + gl.L(16.0f))) - (L / 2));
            int measuredHeight = getMeasuredHeight() - gl.L(156.0f);
            float f = actualRect.left;
            float f2 = this.r;
            float f3 = ((L2 - f) * f2) + f;
            float f4 = actualRect.top;
            float A = tb4.A(measuredHeight, f4, f2, f4);
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
            paint.setColor(bkb.v0(bkb.pg, this.E));
            paint.setAlpha(Math.min(kk7.d4, (int) (this.r * 255.0f * this.n)));
            canvas.drawCircle(L2 + r1, gl.L(8.0f) + measuredHeight + L, gl.L(3.0f), paint);
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
        return this.b.getCropLeft() - gl.L(14.0f);
    }

    public float getRectY() {
        return (this.b.getCropTop() - gl.L(14.0f)) - (!this.d ? gl.m : 0);
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
                    ((d78) this.a).c();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h33 h33Var;
        super.onLayout(z, i, i2, i3, i4);
        j33 j33Var = this.b;
        CropAreaView cropAreaView = j33Var.a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (h33Var = j33Var.M) == null) {
            return;
        }
        cropAreaView.a(j33Var.h, h33Var.a / h33Var.b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(j33Var.f);
        j33Var.M.f(cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        j33Var.r(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f) {
            if (this.e.H(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((d78) this.a).c();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        this.b.setAspectRatio(f);
    }

    public void setDelegate(u48 u48Var) {
        this.a = u48Var;
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
        this.w.addListener(new t48(this, (byte) 1));
        this.w.start();
    }
}
