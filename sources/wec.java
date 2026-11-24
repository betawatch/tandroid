// default package

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class wec extends FrameLayout {
    public static final ef3 V = new ef3((byte) 4);
    public boolean E;
    public float F;
    public boolean G;
    public final int H;
    public boolean I;
    public boolean J;
    public final on K;
    public final float L;
    public oec M;
    public mec N;
    public final ae0 O;
    public final Rect P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public ValueAnimator T;
    public float U;
    public final wjb a;
    public int b;
    public float c;
    public int d;
    public final View[] e;
    public final int[] f;
    public final SparseArray h;
    public int n;
    public int r;
    public int s;
    public VelocityTracker w;
    public AnimatorSet x;
    public boolean y;

    public wec(Context context, wjb wjbVar) {
        super(context);
        this.c = 1.0f;
        this.h = new SparseArray();
        this.K = new on(null);
        this.O = new ae0(this, (byte) 16);
        this.P = new Rect();
        this.Q = true;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.a = wjbVar;
        this.L = gl.Z0(true, 0.3f);
        this.H = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f = new int[2];
        this.e = new View[2];
        setClipChildren(true);
    }

    public static o39 o(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof o39) {
                return (o39) childAt;
            }
            if (childAt instanceof ViewGroup) {
                o(childAt);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x027d, code lost:
    
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean B(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z;
        float f3;
        View p;
        mec mecVar = this.N;
        if (mecVar == null || !mecVar.K) {
            if (motionEvent != null) {
                VelocityTracker velocityTracker = this.w;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.w = velocityTracker;
                }
                velocityTracker.addMovement(motionEvent);
            }
            View[] viewArr = this.e;
            byte b = 1;
            if (motionEvent != null && motionEvent.getAction() == 0 && k()) {
                this.I = true;
                v();
                this.n = motionEvent.getPointerId(0);
                int x = (int) motionEvent.getX();
                this.r = x;
                if (!this.E) {
                    if (viewArr[1] != null) {
                        if (x < viewArr[1].getTranslationX() + r5.getMeasuredWidth()) {
                            G();
                            this.E = true;
                            this.F = viewArr[0].getTranslationX();
                        } else {
                            this.F = viewArr[0].getTranslationX();
                        }
                    }
                } else if (x < viewArr[0].getTranslationX() + viewArr[0].getMeasuredWidth()) {
                    this.F = viewArr[0].getTranslationX();
                } else {
                    G();
                    this.E = false;
                    this.F = viewArr[0].getTranslationX();
                }
                this.x.removeAllListeners();
                this.x.cancel();
                this.y = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                this.F = 0.0f;
            }
            if (this.I || motionEvent == null || (p = p(this, motionEvent.getX(), motionEvent.getY())) == null || (!p.canScrollHorizontally(1) && !p.canScrollHorizontally(-1))) {
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.I && !this.J) {
                    this.n = motionEvent.getPointerId(0);
                    this.J = true;
                    this.r = (int) motionEvent.getX();
                    this.s = (int) motionEvent.getY();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n) {
                    int x2 = (int) ((motionEvent.getX() - this.r) + this.F);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.s);
                    if (this.I && (!this.E ? x2 < 0 : x2 > 0)) {
                        if (!C(motionEvent, x2 < 0)) {
                            this.J = true;
                            this.I = false;
                            F(viewArr[0], 0.0f);
                            View view = viewArr[1];
                            if (view != null) {
                                F(view, this.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            this.d = 0;
                            this.c = 1.0f;
                            mec mecVar2 = this.N;
                            if (mecVar2 != null) {
                                mecVar2.f(1.0f, 0, this.b);
                            }
                            x(false);
                        }
                    }
                    if (this.J && !this.I) {
                        int x3 = (int) (motionEvent.getX() - this.r);
                        if (Math.abs(x3) >= this.L && Math.abs(x3) > abs) {
                            C(motionEvent, x2 < 0);
                        }
                    } else if (this.I) {
                        float abs2 = Math.abs(x2) / viewArr[0].getMeasuredWidth();
                        if (this.d == -1) {
                            this.U = abs2;
                        } else {
                            F(viewArr[0], x2);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                if (this.E) {
                                    F(view2, viewArr[0].getMeasuredWidth() + x2);
                                } else {
                                    F(view2, x2 - viewArr[0].getMeasuredWidth());
                                }
                            }
                        }
                        float f4 = 1.0f - abs2;
                        this.c = f4;
                        mec mecVar3 = this.N;
                        if (mecVar3 != null) {
                            mecVar3.f(f4, this.d, this.b);
                        }
                        x(false);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker2 = this.w;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000, this.H);
                    }
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f = 0.0f;
                        f2 = 0.0f;
                    } else {
                        f = this.w.getXVelocity();
                        f2 = this.w.getYVelocity();
                        if (!this.I && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                            C(motionEvent, f < 0.0f);
                        }
                    }
                    if (this.I) {
                        float x4 = viewArr[0].getX();
                        this.x = new AnimatorSet();
                        if (this.F != 0.0f) {
                            float abs3 = Math.abs(f);
                            boolean z2 = this.E;
                            if (abs3 > 1500.0f) {
                                z = z2 ? false : false;
                                this.G = z;
                            } else if (z2) {
                                View view3 = viewArr[1];
                                if (view3 != null) {
                                    z = view3.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                                    this.G = z;
                                } else {
                                    this.G = false;
                                    z = false;
                                }
                            } else {
                                z = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
                                this.G = z;
                            }
                        } else {
                            z = Math.abs(x4) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                            this.G = z;
                        }
                        if (z) {
                            f3 = Math.abs(x4);
                            boolean z3 = this.E;
                            AnimatorSet animatorSet = this.x;
                            if (z3) {
                                animatorSet.playTogether(I(viewArr[0], 0.0f));
                                View view4 = viewArr[1];
                                if (view4 != null) {
                                    this.x.playTogether(I(view4, view4.getMeasuredWidth()));
                                }
                            } else {
                                animatorSet.playTogether(I(viewArr[0], 0.0f));
                                View view5 = viewArr[1];
                                if (view5 != null) {
                                    this.x.playTogether(I(view5, -view5.getMeasuredWidth()));
                                }
                            }
                        } else if (this.d >= 0) {
                            f3 = viewArr[0].getMeasuredWidth() - Math.abs(x4);
                            boolean z4 = this.E;
                            AnimatorSet animatorSet2 = this.x;
                            if (z4) {
                                animatorSet2.playTogether(I(viewArr[0], -r7.getMeasuredWidth()));
                                View view6 = viewArr[1];
                                if (view6 != null) {
                                    this.x.playTogether(I(view6, 0.0f));
                                }
                            } else {
                                animatorSet2.playTogether(I(viewArr[0], r7.getMeasuredWidth()));
                                View view7 = viewArr[1];
                                if (view7 != null) {
                                    this.x.playTogether(I(view7, 0.0f));
                                }
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        if (this.d < 0) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, this.G ? 0.0f : 1.0f);
                            ofFloat.addUpdateListener(new kec(this, b));
                            this.x.playTogether(ofFloat);
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(this.O);
                        this.x.playTogether(ofFloat2);
                        this.x.setInterpolator(V);
                        float measuredWidth = getMeasuredWidth() / 2;
                        float sin = (((float) Math.sin((Math.min(1.0f, (f3 * 1.0f) / r2) - 0.5f) * 0.47123894f)) * measuredWidth) + measuredWidth;
                        this.x.setDuration(Math.max(kk7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(sin / r5) * 1000.0f) << 2 : (int) (((f3 / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        this.x.addListener(new lec(this, b));
                        this.x.start();
                        this.y = true;
                        this.I = false;
                        x(false);
                    } else {
                        this.J = false;
                        mec mecVar4 = this.N;
                        if (mecVar4 != null) {
                            mecVar4.setEnabled(true);
                        }
                    }
                    VelocityTracker velocityTracker3 = this.w;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.w = null;
                    }
                }
                if (this.I || this.J) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0013, code lost:
    
        if (r0 != (r4.M.e() - 1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(MotionEvent motionEvent, boolean z) {
        int i = this.b;
        if (!z) {
            if (i == 0) {
                this.U = 0.0f;
                return false;
            }
        }
        if (this.T == null && g(motionEvent) && (!z ? h(motionEvent) : i(motionEvent))) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.J = false;
            this.I = true;
            v();
            this.r = (int) (motionEvent.getX() + this.F);
            mec mecVar = this.N;
            if (mecVar != null) {
                mecVar.setEnabled(false);
            }
            this.K.d();
            this.E = z;
            this.d = this.b + (z ? 1 : -1);
            K(1);
            View view = this.e[1];
            if (view != null) {
                if (z) {
                    F(view, r5[0].getMeasuredWidth());
                } else {
                    F(view, -r5[0].getMeasuredWidth());
                }
            }
            x(false);
            return true;
        }
        return false;
    }

    public final void D(boolean z) {
        onTouchEvent(null);
        oec oecVar = this.M;
        oecVar.getClass();
        if (!(oecVar instanceof z61)) {
            z = false;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view != null) {
            removeView(view);
            viewArr[1] = null;
        }
        View view2 = viewArr[0];
        viewArr[1] = view2;
        int intValue = (view2 == null || view2.getTag() == null) ? 0 : ((Integer) viewArr[1].getTag()).intValue();
        if (this.M.e() == 0) {
            View view3 = viewArr[1];
            if (view3 != null) {
                removeView(view3);
                viewArr[1] = null;
            }
            View view4 = viewArr[0];
            if (view4 != null) {
                removeView(view4);
                viewArr[0] = null;
                return;
            }
            return;
        }
        if (this.b > this.M.e() - 1) {
            this.b = this.M.e() - 1;
        }
        int i = this.b;
        if (i < 0) {
            this.b = 0;
            i = 0;
        }
        int h = this.M.h(i);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = this.M.d(h);
        viewArr[0] = d;
        this.M.b(d, this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        if ((viewArr[0].getTag() == null ? 0 : ((Integer) viewArr[0].getTag()).intValue()) == intValue) {
            z = false;
        }
        if (z) {
            this.N.getClass();
        }
        m(z);
        if (!z) {
            View view5 = viewArr[1];
            if (view5 != null) {
                removeView(view5);
                viewArr[1] = null;
                return;
            }
            return;
        }
        this.x = new AnimatorSet();
        View view6 = viewArr[1];
        if (view6 != null) {
            F(view6, 0.0f);
        }
        View view7 = viewArr[0];
        if (view7 != null) {
            F(view7, -getMeasuredWidth());
        }
        View view8 = viewArr[1];
        if (view8 != null) {
            this.x.playTogether(I(view8, getMeasuredWidth()));
        }
        View view9 = viewArr[0];
        if (view9 != null) {
            this.x.playTogether(I(view9, 0.0f));
        }
        x(true);
        mec mecVar = this.N;
        mecVar.a = 0.0f;
        mecVar.w.h1();
        this.N.invalidate();
        byte b = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kec(this, b));
        this.x.playTogether(ofFloat);
        this.x.setInterpolator(V);
        this.x.setDuration(220L);
        this.x.addListener(new lec(this, b));
        this.N.setEnabled(false);
        this.y = true;
        this.x.start();
    }

    public final boolean E(int i) {
        byte b = 0;
        if (i != this.b) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                if (this.d != i) {
                    valueAnimator.cancel();
                    this.T = null;
                }
            }
            boolean z = this.b < i;
            this.E = z;
            this.d = i;
            K(1);
            z(i, z);
            View[] viewArr = this.e;
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            if (z) {
                F(viewArr[1], measuredWidth);
            } else {
                F(viewArr[1], -measuredWidth);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new kec(this, b));
            this.T.addListener(new lec(this, b));
            this.T.setDuration(getManualScrollDuration());
            this.T.setInterpolator(s33.h);
            this.T.start();
            return true;
        }
        return false;
    }

    public void F(View view, float f) {
        int i;
        int round = Math.round(f);
        int round2 = Math.round(view.getTranslationX());
        view.setTranslationX(round);
        if (view != this.e[0] || (i = round2 - round) == 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((gw4) arrayList.get(i2)).a.h(i, 0);
            i2++;
        }
    }

    public void G() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        View view2 = viewArr[1];
        viewArr[0] = view2;
        viewArr[1] = view;
        int i = this.b;
        int i2 = this.d;
        this.b = i2;
        this.d = i;
        this.c = 1.0f - this.c;
        int[] iArr = this.f;
        int i3 = iArr[0];
        iArr[0] = iArr[1];
        iArr[1] = i3;
        s(view2, view, i2, i);
    }

    public int H() {
        return 16;
    }

    public final ValueAnimator I(View view, float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationX(), f);
        ofFloat.addUpdateListener(new wza(this, view, (byte) 1));
        ofFloat.addListener(new nec(this, view, f));
        return ofFloat;
    }

    public final void J() {
        int[] iArr = this.f;
        if (iArr[0] != this.M.h(this.b)) {
            K(0);
            View[] viewArr = this.e;
            View view = viewArr[1];
            if (view != null) {
                this.h.put(iArr[1], view);
                removeView(viewArr[1]);
                viewArr[1] = null;
            }
            F(viewArr[0], 0.0f);
            x(true);
        }
    }

    public final void K(int i) {
        int i2 = i == 0 ? this.b : this.d;
        if (i2 < 0 || i2 >= this.M.e()) {
            return;
        }
        View[] viewArr = this.e;
        View view = viewArr[i];
        SparseArray sparseArray = this.h;
        int[] iArr = this.f;
        if (view == null) {
            int h = this.M.h(i2);
            iArr[i] = h;
            View view2 = (View) sparseArray.get(h);
            if (view2 == null) {
                view2 = this.M.d(iArr[i]);
            } else {
                sparseArray.remove(iArr[i]);
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            addView(view2);
            view2.setTranslationX(i != 0 ? getMeasuredWidth() : 0.0f);
            viewArr[i] = view2;
            this.M.b(view2, i2, iArr[i]);
            viewArr[i].setVisibility(0);
            return;
        }
        if (iArr[i] == this.M.h(i2)) {
            this.M.b(viewArr[i], i2, iArr[i]);
            viewArr[i].setVisibility(0);
            return;
        }
        sparseArray.put(iArr[i], viewArr[i]);
        viewArr[i].setVisibility(8);
        removeView(viewArr[i]);
        int h2 = this.M.h(i2);
        iArr[i] = h2;
        View view3 = (View) sparseArray.get(h2);
        if (view3 == null) {
            view3 = this.M.d(iArr[i]);
        } else {
            sparseArray.remove(iArr[i]);
        }
        view3.setTranslationX(i != 0 ? getMeasuredWidth() : 0.0f);
        addView(view3);
        viewArr[i] = view3;
        view3.setVisibility(0);
        oec oecVar = this.M;
        oecVar.b(viewArr[i], i2, oecVar.h(i2));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (i != 0) {
            if (!this.y && !this.I) {
                boolean z = i > 0;
                int i2 = this.b;
                if (z ? i2 != this.M.e() - 1 : i2 != 0) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(MotionEvent motionEvent) {
        return true;
    }

    public float getAvailableTranslationX() {
        return gl.q.x;
    }

    public int getCurrentPosition() {
        return this.b;
    }

    public float getCurrentPositionAlpha() {
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public View getCurrentView() {
        return this.e[0];
    }

    public long getManualScrollDuration() {
        return 540L;
    }

    public int getNextPosition() {
        return this.d;
    }

    public float getNextPositionAlpha() {
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f);
    }

    public float getPositionAnimated() {
        float f;
        View[] viewArr = this.e;
        View view = viewArr[0];
        if (view == null || view.getVisibility() != 0) {
            f = 0.0f;
        } else {
            f = (this.b * Utilities.i(1.0f - Math.abs(viewArr[0].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + 0.0f;
        }
        View view2 = viewArr[1];
        if (view2 == null || view2.getVisibility() != 0) {
            return f;
        }
        return (this.d * Utilities.i(1.0f - Math.abs(viewArr[1].getTranslationX() / getAvailableTranslationX()), 1.0f, 0.0f)) + f;
    }

    public View[] getViewPages() {
        return this.e;
    }

    public boolean h(MotionEvent motionEvent) {
        return true;
    }

    public boolean i(MotionEvent motionEvent) {
        return g(motionEvent);
    }

    public final void j() {
        boolean z;
        float f;
        VelocityTracker velocityTracker = this.w;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.H);
        }
        if (this.I) {
            View[] viewArr = this.e;
            float x = viewArr[0].getX();
            this.x = new AnimatorSet();
            if (this.F == 0.0f) {
                z = Math.abs(x) < ((float) viewArr[0].getMeasuredWidth()) / 3.0f;
                this.G = z;
            } else if (this.E) {
                View view = viewArr[1];
                if (view != null) {
                    z = view.getX() > ((float) (viewArr[0].getMeasuredWidth() >> 1));
                    this.G = z;
                } else {
                    this.G = false;
                    z = false;
                }
            } else {
                z = viewArr[0].getX() < ((float) (viewArr[0].getMeasuredWidth() >> 1));
                this.G = z;
            }
            if (z) {
                f = Math.abs(x);
                boolean z2 = this.E;
                AnimatorSet animatorSet = this.x;
                if (z2) {
                    animatorSet.playTogether(I(viewArr[0], 0.0f));
                    View view2 = viewArr[1];
                    if (view2 != null) {
                        this.x.playTogether(I(view2, view2.getMeasuredWidth()));
                    }
                } else {
                    animatorSet.playTogether(I(viewArr[0], 0.0f));
                    View view3 = viewArr[1];
                    if (view3 != null) {
                        this.x.playTogether(I(view3, -view3.getMeasuredWidth()));
                    }
                }
            } else if (this.d >= 0) {
                f = viewArr[0].getMeasuredWidth() - Math.abs(x);
                boolean z3 = this.E;
                AnimatorSet animatorSet2 = this.x;
                if (z3) {
                    animatorSet2.playTogether(I(viewArr[0], -r4.getMeasuredWidth()));
                    View view4 = viewArr[1];
                    if (view4 != null) {
                        this.x.playTogether(I(view4, 0.0f));
                    }
                } else {
                    animatorSet2.playTogether(I(viewArr[0], r4.getMeasuredWidth()));
                    View view5 = viewArr[1];
                    if (view5 != null) {
                        this.x.playTogether(I(view5, 0.0f));
                    }
                }
            } else {
                f = 0.0f;
            }
            byte b = 3;
            if (this.d < 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, this.G ? 0.0f : 1.0f);
                ofFloat.addUpdateListener(new kec(this, b));
                this.x.playTogether(ofFloat);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(this.O);
            this.x.playTogether(ofFloat2);
            this.x.setInterpolator(V);
            getMeasuredWidth();
            this.x.setDuration(Math.max(kk7.f2, Math.min((int) (((f / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.x.addListener(new lec(this, b));
            this.x.start();
            this.y = true;
            this.I = false;
            x(false);
        } else {
            this.J = false;
            mec mecVar = this.N;
            if (mecVar != null) {
                mecVar.setEnabled(true);
            }
        }
        VelocityTracker velocityTracker2 = this.w;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.w = null;
        }
    }

    public final boolean k() {
        boolean z;
        if (!this.y) {
            return false;
        }
        boolean z2 = this.G;
        View[] viewArr = this.e;
        if (z2) {
            if (Math.abs(viewArr[0].getTranslationX()) < 1.0f) {
                F(viewArr[0], 0.0f);
                View view = viewArr[1];
                if (view != null) {
                    F(view, viewArr[0].getMeasuredWidth() * (this.E ? 1 : -1));
                }
                z = true;
            }
            z = false;
        } else {
            if (Math.abs(viewArr[1].getTranslationX()) < 1.0f) {
                F(viewArr[0], r0.getMeasuredWidth() * (this.E ? -1 : 1));
                View view2 = viewArr[1];
                if (view2 != null) {
                    F(view2, 0.0f);
                }
                z = true;
            }
            z = false;
        }
        x(true);
        if (z) {
            AnimatorSet animatorSet = this.x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.x = null;
            }
            this.y = false;
        }
        return this.y;
    }

    public final vec l(int i, boolean z) {
        mec mecVar = new mec(this, getContext(), z, i, this.a);
        this.N = mecVar;
        mecVar.r = H();
        this.N.setDelegate(new u39(this, (byte) 22));
        m(false);
        return this.N;
    }

    public final void m(boolean z) {
        mec mecVar;
        if (this.M == null || (mecVar = this.N) == null) {
            return;
        }
        mecVar.c();
        for (int i = 0; i < this.M.e(); i++) {
            this.M.getClass();
            this.N.a(this.M.f(i), this.M.g(i));
        }
        e();
        if (z) {
            ns9 ns9Var = this.N.w;
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) s33.f);
            TransitionManager.beginDelayedTransition(ns9Var, transitionSet);
        }
        this.N.y.f();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mec mecVar = this.N;
        if (mecVar != null && mecVar.K) {
            return false;
        }
        if (k()) {
            return true;
        }
        onTouchEvent(motionEvent);
        return this.I;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return B(motionEvent);
    }

    public final View p(ViewGroup viewGroup, float f, float f2) {
        View p;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = this.P;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (p = p((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return p;
                    }
                }
            }
        }
        return null;
    }

    public final float q(int i) {
        return getMeasuredWidth() == 0 ? moe.b(1 - Math.abs(getCurrentPosition() - i), 0, 1) : moe.a(1.0f - Math.abs(getPositionAnimated() - i), 0.0f, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.Q && this.J && !this.I) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAdapter(oec oecVar) {
        this.M = oecVar;
        int h = oecVar.h(this.b);
        int[] iArr = this.f;
        iArr[0] = h;
        View d = oecVar.d(h);
        View[] viewArr = this.e;
        viewArr[0] = d;
        if (d == null && this.b != 0) {
            this.b = 0;
            int h2 = oecVar.h(0);
            iArr[0] = h2;
            viewArr[0] = oecVar.d(h2);
        }
        oecVar.b(viewArr[0], this.b, iArr[0]);
        addView(viewArr[0]);
        viewArr[0].setVisibility(0);
        m(false);
    }

    public void setAllowDisallowInterceptTouch(boolean z) {
        this.Q = z;
    }

    public void setPosition(int i) {
        if (this.M == null) {
            this.b = i;
            x(false);
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View[] viewArr = this.e;
        View view = viewArr[1];
        if (view != null) {
            this.h.put(this.f[1], view);
            removeView(viewArr[1]);
            viewArr[1] = null;
        }
        int i2 = this.b;
        if (i2 != i) {
            this.b = i;
            this.d = 0;
            this.c = 1.0f;
            View view2 = viewArr[0];
            K(0);
            s(viewArr[0], view2, this.b, i2);
            F(viewArr[0], 0.0f);
            mec mecVar = this.N;
            if (mecVar != null) {
                mecVar.f(this.c, this.d, this.b);
            }
            x(true);
        }
    }

    public final void x(boolean z) {
        Iterator it = this.R.iterator();
        if (it.hasNext()) {
            throw ls6.l(it);
        }
        w(z);
    }

    public void z(int i, boolean z) {
        y(i);
    }

    public void e() {
    }

    public void r() {
    }

    public void u() {
    }

    public void v() {
    }

    public void A(int i) {
    }

    public void w(boolean z) {
    }

    public void y(int i) {
    }

    public void s(View view, View view2, int i, int i2) {
    }
}
