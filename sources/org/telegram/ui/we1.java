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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class we1 extends org.telegram.ui.Components.ia {
    public static final /* synthetic */ int i3 = 0;
    public boolean e3;
    public boolean f3;
    public float g3;
    public final /* synthetic */ ye1 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we1(ye1 ye1Var, Context context) {
        super(context, null);
        this.h3 = ye1Var;
        this.e3 = true;
        new Paint();
        new RectF();
        this.f1 = true;
        this.c3 = AndroidUtilities.dp(200.0f);
    }

    public final void E1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = ye1.q1;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.l4) || view.isClickable();
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        ye1 ye1Var = this.h3;
        ye1Var.E = z10;
        if (z10) {
            ye1Var.F.h1(0, 0);
            i10 = ye1Var.E ? 0 : 2;
            ye1Var.y = i10;
            kw kwVar = ye1Var.w;
            if (kwVar != null) {
                kwVar.X = i10 != 0;
            }
            if (q2Var != null) {
                q2Var.T();
                q2Var.invalidate();
            }
        } else if (q2Var != null) {
            ye1Var.F.h1(1, 0);
            i10 = ye1Var.E ? 0 : 2;
            ye1Var.y = i10;
            kw kwVar2 = ye1Var.w;
            if (kwVar2 != null) {
                kwVar2.X = i10 != 0;
            }
        }
        le1 le1Var = ye1Var.E0;
        if (le1Var != null) {
            le1Var.forceLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.g3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ye1 ye1Var = this.h3;
        if (ye1Var.c1 != null) {
            canvas.save();
            canvas.translate(ye1Var.c1.getLeft(), ye1Var.c1.getY());
            ye1Var.c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        E1();
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        E1();
        if (this.h3.c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        ye1 ye1Var = this.h3;
        if (ye1Var.w != null && this.g3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ye1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.V1) {
            HashSet hashSet = ye1.q1;
            ye1 ye1Var = this.h3;
            if (ye1Var.getParentLayout() == null || !((ActionBarLayout) ye1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) ye1Var).actionBar;
                    kVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (ye1Var.c != adapter.h()) {
                        this.f3 = true;
                        adapter.l();
                        this.f3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = ye1.q1;
        ye1 ye1Var = this.h3;
        ye1Var.getClass();
        ye1Var.getClass();
        ye1Var.getClass();
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.e3) {
            ye1 ye1Var = this.h3;
            if (ye1Var.getMessagesController().dialogsLoaded) {
                if (ye1Var.x > 0) {
                    this.f3 = true;
                    s4.b0 b0Var = (s4.b0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.o2) ye1Var).actionBar;
                    b0Var.h1(1, (int) kVar.getTranslationY());
                    this.f3 = false;
                }
                this.e3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.b0 b0Var;
        int L0;
        int i10 = 0;
        if (!this.V1) {
            HashSet hashSet = ye1.q1;
            ye1 ye1Var = this.h3;
            if (ye1Var.getParentLayout() == null || !((ActionBarLayout) ye1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    be1 be1Var = ye1Var.O;
                    if (be1Var.y != 0 && ye1Var.P.d && be1Var.g(null, 4) != 0) {
                        ye1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && ye1Var.y == 2 && ye1Var.x > 0 && (L0 = (b0Var = (s4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - ye1Var.Y;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                        ye1Var.y = 2;
                    } else if (ye1Var.y != 1) {
                        if (this.g3 == 0.0f) {
                            v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                        }
                        if (!ye1Var.Z) {
                            ye1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            kw kwVar = ye1Var.w;
                            if (kwVar != null) {
                                kwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.q2) m10).Z();
                        ye1Var.y = 1;
                    }
                    float f7 = this.g3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new g11(this, 17));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.sl.x(this.g3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ve1(this, i10));
                        ofFloat.start();
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

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.e3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.g3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }
}
