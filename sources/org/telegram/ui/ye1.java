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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class ye1 extends org.telegram.ui.Components.ka {
    public static final /* synthetic */ int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final /* synthetic */ af1 n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye1(af1 af1Var, Context context) {
        super(context, null);
        this.n3 = af1Var;
        this.k3 = true;
        new Paint();
        new RectF();
        this.f1 = true;
        this.i3 = AndroidUtilities.dp(200.0f);
    }

    public final void E1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = af1.q1;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.q4) || view.isClickable();
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        af1 af1Var = this.n3;
        af1Var.E = z10;
        if (z10) {
            af1Var.F.h1(0, 0);
            i10 = af1Var.E ? 0 : 2;
            af1Var.y = i10;
            fw fwVar = af1Var.w;
            if (fwVar != null) {
                fwVar.X = i10 != 0;
            }
            if (p2Var != null) {
                p2Var.T();
                p2Var.invalidate();
            }
        } else if (p2Var != null) {
            af1Var.F.h1(1, 0);
            i10 = af1Var.E ? 0 : 2;
            af1Var.y = i10;
            fw fwVar2 = af1Var.w;
            if (fwVar2 != null) {
                fwVar2.X = i10 != 0;
            }
        }
        oe1 oe1Var = af1Var.E0;
        if (oe1Var != null) {
            oe1Var.forceLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        af1 af1Var = this.n3;
        if (af1Var.c1 != null) {
            canvas.save();
            canvas.translate(af1Var.c1.getLeft(), af1Var.c1.getY());
            af1Var.c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        E1();
    }

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        E1();
        if (this.n3.c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        af1 af1Var = this.n3;
        if (af1Var.w != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            af1Var.w.c(canvas, true);
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
            HashSet hashSet = af1.q1;
            af1 af1Var = this.n3;
            if (af1Var.getParentLayout() == null || !((ActionBarLayout) af1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (af1Var.c != adapter.h()) {
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = af1.q1;
        af1 af1Var = this.n3;
        af1Var.getClass();
        af1Var.getClass();
        af1Var.getClass();
    }

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.k3) {
            af1 af1Var = this.n3;
            if (af1Var.getMessagesController().dialogsLoaded) {
                if (af1Var.x > 0) {
                    this.l3 = true;
                    s4.c0 c0Var = (s4.c0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.r2) af1Var).actionBar;
                    c0Var.h1(1, (int) kVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        if (!this.V1) {
            HashSet hashSet = af1.q1;
            af1 af1Var = this.n3;
            if (af1Var.getParentLayout() == null || !((ActionBarLayout) af1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ee1 ee1Var = af1Var.O;
                    if (ee1Var.y != 0 && af1Var.P.d && ee1Var.i(null, 4) != 0) {
                        af1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && af1Var.y == 2 && af1Var.x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - af1Var.Y;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.ds.h);
                        af1Var.y = 2;
                    } else if (af1Var.y != 1) {
                        if (this.m3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.ds.h);
                        }
                        if (!af1Var.Z) {
                            af1Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            fw fwVar = af1Var.w;
                            if (fwVar != null) {
                                fwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.p2) m10).Z();
                        af1Var.y = 1;
                    }
                    float f7 = this.m3;
                    if (f7 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                        ofFloat.addUpdateListener(new v11(this, 16));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.vh.w(this.m3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new fc1(this, 2));
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

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView
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
