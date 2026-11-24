// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pfc extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public float W;
    public float a;
    public float a0;
    public float b;
    public float b0;
    public float c;
    public boolean c0;
    public float d;
    public boolean d0;
    public boolean e;
    public ValueAnimator e0;
    public int f;
    public final ae0 f0;
    public ValueAnimator g0;
    public int h;
    public final uwb h0;
    public View.OnClickListener i0;
    public ofc j0;
    public long k0;
    public WindowInsets n;
    public final float r;
    public final Path s;
    public final RectF w;
    public final Paint x;
    public final Drawable y;

    public pfc(Activity activity) {
        super(activity);
        this.s = new Path();
        this.w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.E = -1.0f;
        this.F = -1.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.R = -1.0f;
        this.S = true;
        this.f0 = new ae0(this, (byte) 17);
        this.h0 = new uwb(this, (byte) 6);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new cl0(this, (byte) 7));
        setClipToOutline(true);
        paint.setColor(bm2.o(-16777216, kk7.m1));
        this.y = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f = this.V;
        if (f < 0.0f || this.P) {
            return;
        }
        e(f, this.W, getMeasuredWidth(), getMeasuredHeight(), true);
        this.V = -1.0f;
        this.W = -1.0f;
    }

    public final void b() {
        if (getMeasuredWidth() <= 0 || this.E >= 0.0f) {
            this.V = -1.0f;
            this.W = -1.0f;
            return;
        }
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r2.getSystemWindowInsetTop() + this.I;
        float systemWindowInsetBottom = this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.J;
        View view = (View) parent;
        this.V = (getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - getMeasuredWidth());
        this.W = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
        this.V = Math.max(0.0f, Math.min(1.0f, this.V));
        this.W = Math.max(0.0f, Math.min(1.0f, this.W));
    }

    public final void c(boolean z, boolean z2) {
        pfc pfcVar;
        pfc pfcVar2;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z2 = false;
        }
        if (!z2) {
            if (this.N != z) {
                this.N = z;
                this.O = z;
                this.K = z ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.P) {
            this.O = z;
            return;
        }
        boolean z3 = this.N;
        if (!z) {
            pfcVar = this;
            if (z3) {
                pfcVar.O = z;
                float translationX = pfcVar.getTranslationX();
                float translationY = pfcVar.getTranslationY();
                pfcVar.f();
                pfcVar.N = false;
                pfcVar.P = true;
                pfcVar.requestLayout();
                pfcVar.animate().setListener(null).cancel();
                pfcVar.getViewTreeObserver().addOnPreDrawListener(new nfc(pfcVar, translationX, translationY));
                return;
            }
            r0 = 0.0f;
        } else {
            if (!z3) {
                this.N = true;
                this.O = z;
                f();
                float f = this.E;
                if (f >= 0.0f) {
                    pfcVar2 = this;
                    pfcVar2.e(f, this.F, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
                } else {
                    pfcVar2 = this;
                }
                pfcVar2.N = false;
                pfcVar2.P = true;
                float translationX2 = pfcVar2.getTranslationX();
                float translationY2 = pfcVar2.getTranslationY();
                pfcVar2.setTranslationX(0.0f);
                pfcVar2.setTranslationY(0.0f);
                pfcVar2.invalidate();
                ValueAnimator valueAnimator = pfcVar2.e0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(pfcVar2.K, 1.0f);
                pfcVar2.e0 = ofFloat;
                ofFloat.addUpdateListener(pfcVar2.f0);
                pfcVar2.e0.setDuration(300L);
                pfcVar2.e0.start();
                pfcVar2.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = pfcVar2.animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((pfcVar2.getMeasuredWidth() - (pfcVar2.getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((pfcVar2.getMeasuredHeight() - (pfcVar2.getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
                s33 s33Var = s33.f;
                duration.setInterpolator(s33Var).setListener(new w74(pfcVar2, translationX2, translationY2, (byte) 1)).setInterpolator(s33Var).start();
                return;
            }
            pfcVar = this;
        }
        pfcVar.K = r0;
        pfcVar.N = z;
        pfcVar.O = z;
        pfcVar.requestLayout();
    }

    public final void d(float f, float f2) {
        Object parent = getParent();
        if (this.N && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f, f2, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.E = f;
            this.F = f2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pfc pfcVar;
        if (this.a0 >= 0.0f) {
            if (!this.d0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.a0);
            setTranslationY(this.b0);
            if (!this.d0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.a0 = -1.0f;
            this.b0 = -1.0f;
        }
        if (this.E < 0.0f || !this.N || getMeasuredWidth() <= 0) {
            pfcVar = this;
        } else {
            pfcVar = this;
            pfcVar.e(this.E, this.F, getMeasuredWidth(), getMeasuredHeight(), false);
            pfcVar.E = -1.0f;
            pfcVar.F = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!pfcVar.P) {
            boolean z = pfcVar.N;
            boolean z2 = pfcVar.O;
            if (z != z2) {
                pfcVar.c(z2, true);
            }
        }
        int measuredWidth = pfcVar.getMeasuredWidth() >> 1;
        int measuredHeight = pfcVar.getMeasuredHeight() - ((int) ((gl.L(18.0f) * 1.0f) / pfcVar.getScaleY()));
        canvas.save();
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.scale((1.0f / pfcVar.getScaleX()) * pfcVar.K * pfcVar.L, (1.0f / pfcVar.getScaleY()) * pfcVar.K * pfcVar.L, f, f2);
        canvas.drawCircle(f, f2, gl.L(14.0f), pfcVar.x);
        Drawable drawable = pfcVar.y;
        drawable.setBounds(oo1.A(2, measuredWidth, drawable), oo1.y(2, measuredHeight, drawable), oo1.w(2, measuredWidth, drawable), oo1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (pfcVar.P) {
            pfcVar.invalidate();
        }
    }

    public final void e(float f, float f2, int i, int i2, boolean z) {
        Object parent = getParent();
        if (parent == null || !this.N || this.P || !this.S) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.I;
        float systemWindowInsetBottom = this.n != null ? r3.getSystemWindowInsetBottom() + this.J : 0.0f;
        View view = (View) parent;
        float A = tb4.A((view.getMeasuredWidth() - this.G) - this.H, i, f, this.G);
        float A2 = tb4.A((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i2, f2, systemWindowInsetTop);
        if (z) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(A).translationY(A2).alpha(1.0f).setStartDelay(this.M ? 0L : 150L).setDuration(150L).setInterpolator(s33.f).start();
            return;
        }
        if (!this.T) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(A);
        setTranslationY(A2);
    }

    public final void f() {
        this.G = gl.L(16.0f);
        this.H = gl.L(16.0f);
        this.I = this.M ? gl.L(60.0f) : gl.L(16.0f);
        this.J = gl.L(this.M ? 100.0f : 16.0f) + this.U;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.Q = false;
        if (this.N) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.Q = true;
        } else if (!this.c0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        ofc ofcVar = this.j0;
        if (ofcVar != null) {
            ((rfc) ofcVar).b.e0.d(this.Q, this.K);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        if (getMeasuredHeight() != this.f && getMeasuredWidth() != this.h) {
            Path path = this.s;
            path.reset();
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.w;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            path.addRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r1 != 3) goto L62;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (!this.N || this.P || !this.S) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = (getX() + motionEvent.getX()) - this.a;
                    float y = (getY() + motionEvent.getY()) - this.b;
                    if (!this.e) {
                        float f = (y * y) + (x * x);
                        float f2 = this.r;
                        if (f > f2 * f2) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.e = true;
                            this.a = getX() + motionEvent.getX();
                            this.b = getY() + motionEvent.getY();
                            this.c = getTranslationX();
                            this.d = getTranslationY();
                            x = 0.0f;
                            y = 0.0f;
                        }
                    }
                    if (this.e) {
                        setTranslationX(this.c + x);
                        setTranslationY(this.d + y);
                        return true;
                    }
                }
            }
            if (parent != null && this.N && !this.P) {
                parent.requestDisallowInterceptTouchEvent(false);
                animate().setListener(null).cancel();
                ViewPropertyAnimator startDelay = animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setStartDelay(0L);
                if (this.i0 != null && !this.e && System.currentTimeMillis() - this.k0 < 200) {
                    this.i0.onClick(this);
                }
                int measuredWidth = ((View) getParent()).getMeasuredWidth();
                int measuredHeight = ((View) getParent()).getMeasuredHeight();
                float f3 = this.I;
                float f4 = this.J;
                if (this.n != null) {
                    f3 += r5.getSystemWindowInsetTop();
                    f4 += this.n.getSystemWindowInsetBottom();
                }
                float x2 = getX();
                float f5 = this.G;
                if (x2 < f5) {
                    startDelay.translationX(f5);
                } else if (getX() + getMeasuredWidth() > measuredWidth - this.H) {
                    startDelay.translationX((measuredWidth - getMeasuredWidth()) - this.H);
                }
                if (getY() < f3) {
                    startDelay.translationY(f3);
                } else if (getY() + getMeasuredHeight() > measuredHeight - f4) {
                    startDelay.translationY((measuredHeight - getMeasuredHeight()) - f4);
                }
                startDelay.setDuration(150L).setInterpolator(s33.f).start();
            }
            this.e = false;
            return true;
        }
        if (this.N && !this.P) {
            this.k0 = System.currentTimeMillis();
            this.a = getX() + motionEvent.getX();
            this.b = getY() + motionEvent.getY();
            animate().setListener(null).cancel();
            animate().scaleY(1.05f).scaleX(1.05f).alpha(1.0f).setStartDelay(0L).start();
        }
        return true;
    }

    public void setCornerRadius(float f) {
        this.R = f;
        invalidateOutline();
    }

    public void setDelegate(ofc ofcVar) {
        this.j0 = ofcVar;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z) {
        this.S = z;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.i0 = onClickListener;
    }

    public void setRelativePosition(pfc pfcVar) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.I;
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (pfcVar.getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - pfcVar.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (pfcVar.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.J)) - systemWindowInsetTop) - pfcVar.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z) {
        if (getParent() == null) {
            this.M = z;
        } else {
            this.M = z;
        }
    }
}
