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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class qf1 extends org.telegram.ui.Components.aa {
    public static final /* synthetic */ int e3 = 0;
    public boolean a3;
    public boolean b3;
    public float c3;
    public final /* synthetic */ sf1 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(sf1 sf1Var, Context context) {
        super(context, null);
        this.d3 = sf1Var;
        this.a3 = true;
        new Paint();
        new RectF();
        this.e1 = true;
        this.Y2 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.l4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.c3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sf1 sf1Var = this.d3;
        if (sf1Var.Y0 != null) {
            canvas.save();
            canvas.translate(sf1Var.Y0.getLeft(), sf1Var.Y0.getY());
            sf1Var.Y0.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        x1();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x1();
        if (this.d3.Y0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        sf1 sf1Var = this.d3;
        if (sf1Var.w != null && this.c3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            sf1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.U1) {
            HashSet hashSet = sf1.k1;
            sf1 sf1Var = this.d3;
            if (sf1Var.getParentLayout() == null || !((ActionBarLayout) sf1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
                    kVar.getClass();
                    f2.o0 adapter = getAdapter();
                    if (sf1Var.c != adapter.h()) {
                        this.b3 = true;
                        adapter.l();
                        this.b3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        HashSet hashSet = sf1.k1;
        sf1 sf1Var = this.d3;
        sf1Var.getClass();
        sf1Var.getClass();
        sf1Var.getClass();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.a3) {
            sf1 sf1Var = this.d3;
            if (sf1Var.getMessagesController().dialogsLoaded) {
                if (sf1Var.x > 0) {
                    this.b3 = true;
                    f2.i0 i0Var = (f2.i0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.p2) sf1Var).actionBar;
                    i0Var.h1(1, (int) kVar.getTranslationY());
                    this.b3 = false;
                }
                this.a3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.i0 i0Var;
        int L0;
        if (!this.U1) {
            HashSet hashSet = sf1.k1;
            sf1 sf1Var = this.d3;
            if (sf1Var.getParentLayout() == null || !((ActionBarLayout) sf1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ve1 ve1Var = sf1Var.L;
                    if (ve1Var.y != 0 && sf1Var.M.d && ve1Var.f(null, 4) != 0) {
                        sf1Var.M.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && sf1Var.y == 2 && sf1Var.x > 0 && (L0 = (i0Var = (f2.i0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m9 = i0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m9.getMeasuredHeight() + (m9.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - sf1Var.V;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        v0(0, measuredHeight, org.telegram.ui.Components.mr.h);
                        sf1Var.y = 2;
                    } else if (sf1Var.y != 1) {
                        if (this.c3 == 0.0f) {
                            v0(0, m9.getTop() - paddingTop, org.telegram.ui.Components.mr.h);
                        }
                        if (!sf1Var.W) {
                            sf1Var.W = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            xw xwVar = sf1Var.w;
                            if (xwVar != null) {
                                xwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.q2) m9).a0();
                        sf1Var.y = 1;
                    }
                    float f10 = this.c3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new o11(this, 19));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.y3.A(this.c3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.mr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ss0(this, 23));
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

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(f2.o0 o0Var) {
        super.setAdapter(o0Var);
        this.a3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m9;
        this.c3 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.B1 != -1 && (m9 = getLayoutManager().m(this.B1)) != null) {
            int left = m9.getLeft();
            int top = (int) (m9.getTop() + f10);
            int right = m9.getRight();
            int bottom = (int) (m9.getBottom() + f10);
            Rect rect = this.D1;
            rect.set(left, top, right, bottom);
            this.A1.setBounds(rect);
        }
        invalidate();
    }

    public final void x1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = sf1.k1;
    }

    public final void y1(boolean z4, org.telegram.ui.Cells.q2 q2Var) {
        int i10;
        sf1 sf1Var = this.d3;
        sf1Var.B = z4;
        if (z4) {
            sf1Var.C.h1(0, 0);
            i10 = sf1Var.B ? 0 : 2;
            sf1Var.y = i10;
            xw xwVar = sf1Var.w;
            if (xwVar != null) {
                xwVar.X = i10 != 0;
            }
            if (q2Var != null) {
                q2Var.U();
                q2Var.invalidate();
            }
        } else if (q2Var != null) {
            sf1Var.C.h1(1, 0);
            i10 = sf1Var.B ? 0 : 2;
            sf1Var.y = i10;
            xw xwVar2 = sf1Var.w;
            if (xwVar2 != null) {
                xwVar2.X = i10 != 0;
            }
        }
        gf1 gf1Var = sf1Var.B0;
        if (gf1Var != null) {
            gf1Var.forceLayout();
        }
    }
}
