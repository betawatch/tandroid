package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class w91 extends org.telegram.ui.Components.ba {
    public static final /* synthetic */ int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final /* synthetic */ y91 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w91(y91 y91Var, Context context) {
        super(context, null);
        this.n3 = y91Var;
        this.k3 = true;
        new Paint();
        new RectF();
        this.g1 = true;
        this.i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        y91 y91Var = this.n3;
        y91Var.F = z10;
        if (z10) {
            y91Var.G.h1(0, 0);
            i7 = y91Var.F ? 0 : 2;
            y91Var.E = i7;
            jv jvVar = y91Var.x;
            if (jvVar != null) {
                jvVar.X = i7 != 0;
            }
            if (t2Var != null) {
                t2Var.b0();
                t2Var.invalidate();
            }
        } else if (t2Var != null) {
            y91Var.G.h1(1, 0);
            i7 = y91Var.F ? 0 : 2;
            y91Var.E = i7;
            jv jvVar2 = y91Var.x;
            if (jvVar2 != null) {
                jvVar2.X = i7 != 0;
            }
        }
        o91 o91Var = y91Var.F0;
        if (o91Var != null) {
            o91Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.n4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(this.m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ba, org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y91 y91Var = this.n3;
        if (y91Var.d1 != null) {
            canvas.save();
            canvas.translate(y91Var.d1.getLeft(), y91Var.d1.getY());
            y91Var.d1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override // org.telegram.ui.Components.ba, org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.n3.d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        y91 y91Var = this.n3;
        if (y91Var.x != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            y91Var.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.W1) {
            HashSet hashSet = y91.s1;
            y91 y91Var = this.n3;
            if (y91Var.getParentLayout() == null || !((ActionBarLayout) y91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.h2) y91Var).actionBar;
                    kVar.getClass();
                    v4.i0 adapter = getAdapter();
                    if (y91Var.c != adapter.b()) {
                        this.l3 = true;
                        adapter.f();
                        this.l3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y91 y91Var = this.n3;
        y91Var.getClass();
        y91Var.getClass();
        y91Var.getClass();
    }

    @Override // org.telegram.ui.Components.ba, org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.k3) {
            y91 y91Var = this.n3;
            if (y91Var.getMessagesController().b2) {
                if (y91Var.y > 0) {
                    this.l3 = true;
                    v4.c0 c0Var = (v4.c0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.h2) y91Var).actionBar;
                    c0Var.h1(1, (int) kVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.c0 c0Var;
        int L0;
        if (!this.W1) {
            HashSet hashSet = y91.s1;
            y91 y91Var = this.n3;
            if (y91Var.getParentLayout() == null || !((ActionBarLayout) y91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    d91 d91Var = y91Var.P;
                    if (d91Var.E != 0 && y91Var.Q.d && d91Var.i(null, 4) != 0) {
                        y91Var.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    int i7 = 2;
                    if (y91Var.E == 2 && y91Var.y > 0 && (L0 = (c0Var = (v4.c0) getLayoutManager()).L0()) == 0) {
                        int paddingTop = getPaddingTop();
                        View m10 = c0Var.m(L0);
                        int L = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 78.0f : 72.0f) * 0.85f);
                        int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - y91Var.Z;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            w0(0, measuredHeight, org.telegram.ui.Components.lr.h);
                            y91Var.E = 2;
                        } else if (y91Var.E != 1) {
                            if (this.m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.lr.h);
                            }
                            if (!y91Var.a0) {
                                y91Var.a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                jv jvVar = y91Var.x;
                                if (jvVar != null) {
                                    jvVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.t2) m10).h0();
                            y91Var.E = 1;
                        }
                        float f10 = this.m3;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            ofFloat.addUpdateListener(new iz0(this, 15));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.n10.w(this.m3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.lr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new k71(this, i7));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ba, org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(v4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.k3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.m3 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }
}
