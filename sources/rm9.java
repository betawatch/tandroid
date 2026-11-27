// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class rm9 extends FrameLayout {
    public static long R;
    public static final /* synthetic */ int S = 0;
    public float E;
    public si3 F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public VelocityTracker M;
    public boolean N;
    public float O;
    public float P;
    public Paint Q;
    public si3 a;
    public View b;
    public h8b c;
    public a d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public pn n;
    public boolean r;
    public int s;
    public boolean w;
    public wk5 x;
    public vpa y;

    public static void f(si3 si3Var, si3 si3Var2, float f) {
        int measuredWidth;
        if (si3Var != null) {
            measuredWidth = si3Var.getFragmentView().getMeasuredWidth();
        } else if (si3Var2 == null) {
            return;
        } else {
            measuredWidth = si3Var2.getFragmentView().getMeasuredWidth();
        }
        if (si3Var != null) {
            if (si3Var.getFragmentView() != null) {
                si3Var.getFragmentView().setAlpha(1.0f - f);
                si3Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f);
            }
            si3Var.setPreviewOpenedProgress(1.0f - f);
        }
        if (si3Var2 != null) {
            if (si3Var2.getFragmentView() != null) {
                si3Var2.getFragmentView().setAlpha(1.0f);
                si3Var2.getFragmentView().setTranslationX((1.0f - f) * measuredWidth);
            }
            si3Var2.setPreviewReplaceProgress(f);
        }
    }

    public static int getRightPaddingSize() {
        return xea.l1 ? 74 : 76;
    }

    public final void a() {
        if (this.f) {
            e(false);
            b();
        }
    }

    public final void b() {
        byte b = 0;
        this.f = false;
        if (xea.c()) {
            this.n.d();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 0.0f);
            this.h = ofFloat;
            ofFloat.addUpdateListener(new om9(this, (byte) 0));
            this.h.addListener(new qm9(this, b));
            this.h.setDuration(250L);
            this.h.setInterpolator(k43.f);
            this.h.start();
            return;
        }
        this.e = 0.0f;
        g();
        si3 si3Var = this.a;
        if (si3Var != null) {
            si3Var.onPause();
            this.a.onFragmentDestroy();
            removeAllViews();
            this.a = null;
            jn7.e().k(jn7.u4, new Object[0]);
        }
        d(false);
    }

    public final boolean c() {
        return this.a != null;
    }

    public abstract void d(boolean z);

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.w) {
            f(this.F, this.a, this.E);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f = this.e;
        a aVar = this.d;
        float alpha = (aVar == null || aVar.getActionMode() == null) ? 0.0f : this.d.getActionMode().getAlpha();
        a aVar2 = this.d;
        float max = Math.max(alpha, aVar2 == null ? 0.0f : aVar2.p0) * f;
        if (this.a == null || this.d == null || max <= 0.0f) {
            return;
        }
        Paint paint = this.Q;
        if (paint == null) {
            paint = new Paint();
            this.Q = paint;
        }
        paint.setColor(aob.w0(null, aob.w8, false));
        if (max == 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (max * 255.0f), 31);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.P, this.Q);
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.save();
        canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
        this.d.getBackButton().draw(canvas);
        canvas.restore();
        if (this.d.getActionMode() != null) {
            float alpha2 = this.d.getActionMode().getAlpha() * this.e;
            a aVar3 = this.d;
            if (max != alpha2) {
                aVar3.draw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
                this.d.getActionMode().draw(canvas);
                canvas.restore();
            } else {
                aVar3.getActionMode().draw(canvas);
            }
        } else {
            this.d.draw(canvas);
        }
        canvas.restore();
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar = this.d;
        if (view == aVar && aVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public abstract void e(boolean z);

    public final void g() {
        if (this.w || !c()) {
            return;
        }
        setOpenProgress(this.e);
        View view = this.b;
        if (view != null) {
            view.setTranslationX((1.0f - this.e) * (getMeasuredWidth() - hl.L(getRightPaddingSize())));
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.setTranslationX((1.0f - this.e) * hl.L(48.0f));
        }
        si3 si3Var = this.a;
        if (si3Var != null) {
            si3Var.setPreviewOpenedProgress(this.e);
        }
        invalidate();
    }

    public long getCurrentFragmetDialogId() {
        return R;
    }

    public e getFragment() {
        return this.a;
    }

    public View getFragmentView() {
        return this.b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = getOccupyStatusbar() ? hl.m : 0;
        View view = this.b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = hl.L(getRightPaddingSize());
            layoutParams.topMargin = a.getCurrentActionBarHeight() + i3 + this.s;
        }
        a aVar = this.d;
        if (aVar != null) {
            ((FrameLayout.LayoutParams) aVar.getLayoutParams()).topMargin = i3;
        }
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.G != measuredWidth) {
            this.G = measuredWidth;
            g();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var = this.x;
        if ((wk5Var != null && ((ActionBarLayout) wk5Var).w()) || !c() || !this.N) {
            return false;
        }
        byte b = 1;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.H = motionEvent.getPointerId(0);
                this.I = true;
                this.K = (int) motionEvent.getX();
                this.L = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.M;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.H) {
                if (this.M == null) {
                    this.M = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.K));
                int abs = Math.abs(((int) motionEvent.getY()) - this.L);
                this.M.addMovement(motionEvent);
                if (!this.I || this.J || max < hl.Z0(true, 0.4f) || Math.abs(max) / 3 <= abs) {
                    if (this.J) {
                        float f = max;
                        this.O = f;
                        this.e = Utilities.i(1.0f - (f / getMeasuredWidth()), 1.0f, 0.0f);
                        g();
                    }
                } else if (ActionBarLayout.s(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.I = false;
                    this.J = true;
                    this.K = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.I = false;
                }
            }
            return this.J;
        }
        if (motionEvent != null && motionEvent.getPointerId(0) == this.H && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            VelocityTracker velocityTracker2 = this.M;
            if (velocityTracker2 == null) {
                velocityTracker2 = VelocityTracker.obtain();
                this.M = velocityTracker2;
            }
            velocityTracker2.computeCurrentVelocity(1000);
            if (this.J) {
                float f2 = this.O;
                float xVelocity = this.M.getXVelocity();
                float yVelocity = this.M.getYVelocity();
                if (f2 >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    b();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new om9(this, (byte) 1));
                    this.h.addListener(new qm9(this, b));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(k43.f);
                    this.h.start();
                }
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker3 = this.M;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.M = null;
            }
        } else if (motionEvent == null) {
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker4 = this.M;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.M = null;
            }
        }
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.b) {
            a();
        }
    }

    public void setCurrentTop(int i) {
        this.P = i;
        View view = this.b;
        if (view != null) {
            view.setTranslationY((i - view.getTop()) + this.s);
        }
        h8b h8bVar = this.c;
        if (h8bVar != null) {
            h8bVar.setTranslationY(i - h8bVar.getTop());
        }
    }

    public void setFragmentViewPadding(int i) {
        this.s = i;
    }

    public void setTransitionPaddingBottom(int i) {
        si3 si3Var = this.a;
        if (ik8.A(si3Var)) {
            float f = i;
            si3Var.Y0 = f;
            si3Var.h.setTranslationY(((-f) - si3Var.h1) - si3Var.g1);
        }
    }

    public void setOpenProgress(float f) {
    }
}
