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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class x91 extends org.telegram.ui.Components.w9 {
    public static final /* synthetic */ int n3 = 0;
    public boolean j3;
    public boolean k3;
    public float l3;
    public final /* synthetic */ z91 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(z91 z91Var, Context context) {
        super(context, null);
        this.m3 = z91Var;
        this.j3 = true;
        new Paint();
        new RectF();
        this.f1 = true;
        this.h3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z9, org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        z91 z91Var = this.m3;
        z91Var.E = z9;
        if (z9) {
            z91Var.F.h1(0, 0);
            i7 = z91Var.E ? 0 : 2;
            z91Var.D = i7;
            iv ivVar = z91Var.x;
            if (ivVar != null) {
                ivVar.X = i7 != 0;
            }
            if (t2Var != null) {
                t2Var.b0();
                t2Var.invalidate();
            }
        } else if (t2Var != null) {
            z91Var.F.h1(1, 0);
            i7 = z91Var.E ? 0 : 2;
            z91Var.D = i7;
            iv ivVar2 = z91Var.x;
            if (ivVar2 != null) {
                ivVar2.X = i7 != 0;
            }
        }
        p91 p91Var = z91Var.E0;
        if (p91Var != null) {
            p91Var.forceLayout();
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.n4) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(this.l3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z91 z91Var = this.m3;
        if (z91Var.c1 != null) {
            canvas.save();
            canvas.translate(z91Var.c1.getLeft(), z91Var.c1.getY());
            z91Var.c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.m3.c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        z91 z91Var = this.m3;
        if (z91Var.x != null && this.l3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            z91Var.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.V1) {
            HashSet hashSet = z91.q1;
            z91 z91Var = this.m3;
            if (z91Var.getParentLayout() == null || !((ActionBarLayout) z91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
                    lVar.getClass();
                    v4.g0 adapter = getAdapter();
                    if (z91Var.c != adapter.b()) {
                        this.k3 = true;
                        adapter.f();
                        this.k3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        z91 z91Var = this.m3;
        z91Var.getClass();
        z91Var.getClass();
        z91Var.getClass();
    }

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.j3) {
            z91 z91Var = this.m3;
            if (z91Var.getMessagesController().Y1) {
                if (z91Var.y > 0) {
                    this.k3 = true;
                    v4.b0 b0Var = (v4.b0) getLayoutManager();
                    lVar = ((org.telegram.ui.ActionBar.f2) z91Var).actionBar;
                    b0Var.h1(1, (int) lVar.getTranslationY());
                    this.k3 = false;
                }
                this.j3 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.b0 b0Var;
        int L0;
        if (!this.V1) {
            HashSet hashSet = z91.q1;
            z91 z91Var = this.m3;
            if (z91Var.getParentLayout() == null || !((ActionBarLayout) z91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                int i7 = 1;
                if (action == 1 || action == 3) {
                    e91 e91Var = z91Var.O;
                    if (e91Var.D != 0 && z91Var.P.d && e91Var.i(null, 4) != 0) {
                        z91Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && z91Var.D == 2 && z91Var.y > 0 && (L0 = (b0Var = (v4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    int L = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - z91Var.Y;
                    if (measuredHeight < L || currentTimeMillis < 200) {
                        w0(0, measuredHeight, org.telegram.ui.Components.wq.h);
                        z91Var.D = 2;
                    } else if (z91Var.D != 1) {
                        if (this.l3 == 0.0f) {
                            w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.wq.h);
                        }
                        if (!z91Var.Z) {
                            z91Var.Z = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            iv ivVar = z91Var.x;
                            if (ivVar != null) {
                                ivVar.a(true);
                            }
                        }
                        ((org.telegram.ui.Cells.t2) m10).i0();
                        z91Var.D = 1;
                    }
                    float f10 = this.l3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new kz0(this, 15));
                        ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.camera.q.v(this.l3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new u81(this, i7));
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

    @Override // org.telegram.ui.Components.w9, org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.k3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(v4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.j3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.l3 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }
}
