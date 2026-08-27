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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class ue1 extends org.telegram.ui.Components.y9 {
    public static final /* synthetic */ int d3 = 0;
    public boolean Z2;
    public boolean a3;
    public float b3;
    public final /* synthetic */ we1 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(we1 we1Var, Context context) {
        super(context, null);
        this.c3 = we1Var;
        this.Z2 = true;
        new Paint();
        new RectF();
        this.d1 = true;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.j4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.b3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        we1 we1Var = this.c3;
        if (we1Var.X0 != null) {
            canvas.save();
            canvas.translate(we1Var.X0.getLeft(), we1Var.X0.getY());
            we1Var.X0.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y1();
    }

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y1();
        if (this.c3.X0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        we1 we1Var = this.c3;
        if (we1Var.w != null && this.b3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            we1Var.w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.T1) {
            HashSet hashSet = we1.j1;
            we1 we1Var = this.c3;
            if (we1Var.getParentLayout() == null || !((ActionBarLayout) we1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) we1Var).actionBar;
                    kVar.getClass();
                    f2.q0 adapter = getAdapter();
                    if (we1Var.c != adapter.h()) {
                        this.a3 = true;
                        adapter.l();
                        this.a3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = we1.j1;
        we1 we1Var = this.c3;
        we1Var.getClass();
        we1Var.getClass();
        we1Var.getClass();
    }

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.Z2) {
            we1 we1Var = this.c3;
            if (we1Var.getMessagesController().dialogsLoaded) {
                if (we1Var.x > 0) {
                    this.a3 = true;
                    f2.k0 k0Var = (f2.k0) getLayoutManager();
                    kVar = ((org.telegram.ui.ActionBar.n2) we1Var).actionBar;
                    k0Var.h1(1, (int) kVar.getTranslationY());
                    this.a3 = false;
                }
                this.Z2 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.k0 k0Var;
        int L0;
        if (!this.T1) {
            HashSet hashSet = we1.j1;
            we1 we1Var = this.c3;
            if (we1Var.getParentLayout() == null || !((ActionBarLayout) we1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ae1 ae1Var = we1Var.K;
                    if (ae1Var.y != 0 && we1Var.L.d && ae1Var.f(null, 4) != 0) {
                        we1Var.L.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && we1Var.y == 2 && we1Var.x > 0 && (L0 = (k0Var = (f2.k0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = k0Var.m(L0);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - we1Var.U;
                    if (measuredHeight < dp || currentTimeMillis < 200) {
                        v0(0, measuredHeight, org.telegram.ui.Components.er.h);
                        we1Var.y = 2;
                    } else if (we1Var.y != 1) {
                        if (this.b3 == 0.0f) {
                            v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.er.h);
                        }
                        if (!we1Var.V) {
                            we1Var.V = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            nw nwVar = we1Var.w;
                            if (nwVar != null) {
                                nwVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.p2) m10).a0();
                        we1Var.y = 1;
                    }
                    float f10 = this.b3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new w01(this, 19));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.rl.c(this.b3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new zb1(this, 2));
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

    @Override // org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(f2.q0 q0Var) {
        super.setAdapter(q0Var);
        this.Z2 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.b3 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            this.z1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() == null || !getItemAnimator().k()) {
            return;
        }
        HashSet hashSet = we1.j1;
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        int i10;
        we1 we1Var = this.c3;
        we1Var.A = z10;
        if (z10) {
            we1Var.B.h1(0, 0);
            i10 = we1Var.A ? 0 : 2;
            we1Var.y = i10;
            nw nwVar = we1Var.w;
            if (nwVar != null) {
                nwVar.X = i10 != 0;
            }
            if (p2Var != null) {
                p2Var.U();
                p2Var.invalidate();
            }
        } else if (p2Var != null) {
            we1Var.B.h1(1, 0);
            i10 = we1Var.A ? 0 : 2;
            we1Var.y = i10;
            nw nwVar2 = we1Var.w;
            if (nwVar2 != null) {
                nwVar2.X = i10 != 0;
            }
        }
        ke1 ke1Var = we1Var.A0;
        if (ke1Var != null) {
            ke1Var.forceLayout();
        }
    }
}
