// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class rzb extends sl0 {
    public static final /* synthetic */ int o3 = 0;
    public boolean k3;
    public boolean l3;
    public float m3;
    public final /* synthetic */ tzb n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzb(tzb tzbVar, Context context) {
        super(context, null);
        this.n3 = tzbVar;
        this.k3 = true;
        this.g1 = true;
        this.i3 = hl.L(200.0f);
    }

    public final void C1(boolean z, of3 of3Var) {
        byte b;
        tzb tzbVar = this.n3;
        tzbVar.F = z;
        if (z) {
            tzbVar.G.g1(0, 0);
            b = tzbVar.F ? (byte) 0 : (byte) 2;
            tzbVar.E = b;
            xh3 xh3Var = tzbVar.x;
            if (xh3Var != null) {
                xh3Var.X = b != 0;
            }
            if (of3Var != null) {
                of3Var.c0();
                of3Var.invalidate();
            }
        } else if (of3Var != null) {
            tzbVar.G.g1(1, 0);
            b = tzbVar.F ? (byte) 0 : (byte) 2;
            tzbVar.E = b;
            xh3 xh3Var2 = tzbVar.x;
            if (xh3Var2 != null) {
                xh3Var2.X = b != 0;
            }
        }
        izb izbVar = tzbVar.F0;
        if (izbVar != null) {
            izbVar.forceLayout();
        }
    }

    @Override // d79
    public final boolean H0(View view) {
        return !(view instanceof mf5) || view.isClickable();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setTranslationY(this.m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // sl0, d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tzb tzbVar = this.n3;
        if (tzbVar.d1 != null) {
            canvas.save();
            canvas.translate(tzbVar.d1.getLeft(), tzbVar.d1.getY());
            tzbVar.d1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override // sl0, d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.n3.d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        tzb tzbVar = this.n3;
        if (tzbVar.x != null && this.m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tzbVar.x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.W1) {
            HashSet hashSet = tzb.s1;
            tzb tzbVar = this.n3;
            if (tzbVar.getParentLayout() == null || !((ActionBarLayout) tzbVar.getParentLayout()).w()) {
                if (motionEvent.getAction() == 0) {
                    aVar = ((e) tzbVar).actionBar;
                    aVar.getClass();
                    j79 adapter = getAdapter();
                    if (tzbVar.c != adapter.b()) {
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

    @Override // sl0, d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        if (this.k3) {
            tzb tzbVar = this.n3;
            if (tzbVar.getMessagesController().R1) {
                if (tzbVar.y > 0) {
                    this.l3 = true;
                    x46 x46Var = (x46) getLayoutManager();
                    aVar = ((e) tzbVar).actionBar;
                    x46Var.g1(1, (int) aVar.getTranslationY());
                    this.l3 = false;
                }
                this.k3 = false;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x46 x46Var;
        int K0;
        if (!this.W1) {
            HashSet hashSet = tzb.s1;
            tzb tzbVar = this.n3;
            if (tzbVar.getParentLayout() == null || !((ActionBarLayout) tzbVar.getParentLayout()).w()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                byte b = 1;
                if (action == 1 || action == 3) {
                    wyb wybVar = tzbVar.P;
                    if (wybVar.E != 0 && tzbVar.Q.e && wybVar.i(null, 4) != 0) {
                        tzbVar.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && tzbVar.E == 2 && tzbVar.y > 0 && (K0 = (x46Var = (x46) getLayoutManager()).K0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m = x46Var.m(K0);
                    int L = (int) (hl.L(xea.l1 ? 78.0f : 72.0f) * 0.85f);
                    int measuredHeight = m.getMeasuredHeight() + (m.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - tzbVar.Z;
                    if (measuredHeight < L || currentTimeMillis < 200) {
                        y0(0, measuredHeight, k43.h);
                        tzbVar.E = (byte) 2;
                    } else if (tzbVar.E != 1) {
                        if (this.m3 == 0.0f) {
                            y0(0, m.getTop() - paddingTop, k43.h);
                        }
                        if (!tzbVar.a0) {
                            tzbVar.a0 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            xh3 xh3Var = tzbVar.x;
                            if (xh3Var != null) {
                                xh3Var.a(true);
                            }
                        }
                        ((of3) m).i0();
                        tzbVar.E = (byte) 1;
                    }
                    float f = this.m3;
                    if (f != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                        ofFloat.addUpdateListener(new pzb(this, b));
                        ofFloat.setDuration(Math.max(100L, (long) uh9.x(this.m3, hl.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(k43.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new omb(this, (byte) 5));
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

    @Override // sl0, d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(j79 j79Var) {
        super.setAdapter(j79Var);
        this.k3 = true;
    }

    public final void setViewsOffset(float f) {
        View m;
        this.m3 = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY(f);
        }
        if (this.D1 != -1 && (m = getLayoutManager().m(this.D1)) != null) {
            int left = m.getLeft();
            int top = (int) (m.getTop() + f);
            int right = m.getRight();
            int bottom = (int) (m.getBottom() + f);
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }
}
