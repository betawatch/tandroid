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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public abstract class uf1 extends org.telegram.ui.Components.ja {
    public static final /* synthetic */ int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final /* synthetic */ wf1 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.n3 = wf1Var;
        this.k3 = true;
        new Paint();
        new RectF();
        this.h1 = true;
        this.i3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        int i10;
        wf1 wf1Var = this.n3;
        wf1Var.E = z10;
        if (z10) {
            wf1Var.F.h1(0, 0);
            i10 = wf1Var.E ? 0 : 2;
            wf1Var.y = i10;
            yw ywVar = wf1Var.w;
            if (ywVar != null) {
                ywVar.X = i10 != 0;
            }
            if (s2Var != null) {
                s2Var.S();
                s2Var.invalidate();
            }
        } else if (s2Var != null) {
            wf1Var.F.h1(1, 0);
            i10 = wf1Var.E ? 0 : 2;
            wf1Var.y = i10;
            yw ywVar2 = wf1Var.w;
            if (ywVar2 != null) {
                ywVar2.X = i10 != 0;
            }
        }
        kf1 kf1Var = wf1Var.E0;
        if (kf1Var != null) {
            kf1Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean G0(View view) {
        return !(view instanceof org.telegram.ui.Cells.m4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wf1 wf1Var = this.n3;
        if (wf1Var.b1 != null) {
            canvas.save();
            canvas.translate(wf1Var.b1.getLeft(), wf1Var.b1.getY());
            wf1Var.b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z1();
        if (this.n3.b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        wf1 wf1Var = this.n3;
        if (wf1Var.w != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            wf1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            HashSet hashSet = wf1.n1;
            wf1 wf1Var = this.n3;
            if (wf1Var.getParentLayout() == null || !((ActionBarLayout) wf1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) wf1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (wf1Var.c != adapter.h()) {
                        this.l3 = true;
                        adapter.l();
                        this.l3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = wf1.n1;
        wf1 wf1Var = this.n3;
        wf1Var.getClass();
        wf1Var.getClass();
        wf1Var.getClass();
    }

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.k3) {
            wf1 wf1Var = this.n3;
            if (wf1Var.getMessagesController().dialogsLoaded) {
                if (wf1Var.x > 0) {
                    this.l3 = true;
                    s4.c0 c0Var = (s4.c0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.n2) wf1Var).actionBar;
                    c0Var.h1(1, (int) kVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        if (!this.X1) {
            HashSet hashSet = wf1.n1;
            wf1 wf1Var = this.n3;
            if (wf1Var.getParentLayout() == null || !((ActionBarLayout) wf1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    af1 af1Var = wf1Var.O;
                    if (af1Var.y != 0 && wf1Var.P.d && af1Var.g(null, 4) != 0) {
                        wf1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && wf1Var.y == 2 && wf1Var.x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - wf1Var.Y;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.tr.h);
                        wf1Var.y = 2;
                    } else if (wf1Var.y != 1) {
                        if (this.m3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.tr.h);
                        }
                        if (!wf1Var.Z) {
                            wf1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            yw ywVar = wf1Var.w;
                            if (ywVar != null) {
                                ywVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.s2) m10).Z();
                        wf1Var.y = 1;
                    }
                    float f7 = this.m3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new b21(this, 18));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.bi.b(this.m3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.tr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ap0(this, 25));
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

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.k3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.m3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(left, top, right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    public final void z1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = wf1.n1;
    }
}
