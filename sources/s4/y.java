package s4;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class y extends n0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public l.d N;
    public w O;
    public Rect Q;
    public long R;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float v;
    public final v x;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public c1 c = null;
    public int w = -1;
    public int y = 0;
    public final ArrayList F = new ArrayList();
    public final rg.b0 I = new rg.b0(this, 1);
    public View M = null;
    public final gl0 P = new gl0(this);

    public y(v vVar) {
        this.x = vVar;
    }

    public static boolean m(View view, float f7, float f10, float f11, float f12) {
        return f7 >= f11 && f7 <= f11 + ((float) view.getWidth()) && f10 >= f12 && f10 <= f12 + ((float) view.getHeight());
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        rect.setEmpty();
    }

    @Override // s4.n0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        c1 c1Var = this.c;
        int i10 = this.y;
        v vVar = this.x;
        vVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = (u) arrayList.get(i11);
            c1 c1Var2 = uVar.e;
            float f12 = uVar.a;
            float f13 = uVar.c;
            if (f12 == f13) {
                uVar.r = c1Var2.a.getTranslationX();
            } else {
                uVar.r = e2.z(f13, f12, uVar.x, f12);
            }
            float f14 = uVar.b;
            float f15 = uVar.d;
            if (f14 == f15) {
                uVar.s = c1Var2.a.getTranslationY();
            } else {
                uVar.s = e2.z(f15, f14, uVar.x, f14);
            }
            int save = canvas.save();
            vVar.m(canvas, recyclerView, uVar.e, uVar.r, uVar.s, uVar.f, false);
            canvas.restoreToCount(save);
        }
        if (c1Var != null) {
            int save2 = canvas.save();
            vVar.m(canvas, recyclerView, c1Var, f10, f7, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // s4.n0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        c1 c1Var = this.c;
        this.x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) arrayList.get(i10);
            int save = canvas.save();
            View view = uVar.e.a;
            canvas.restoreToCount(save);
        }
        if (c1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            u uVar2 = (u) arrayList.get(i11);
            boolean z11 = uVar2.w;
            if (z11 && !uVar2.n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(ll0 ll0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView == ll0Var) {
            return;
        }
        gl0 gl0Var = this.P;
        if (recyclerView != null) {
            recyclerView.p0(this);
            RecyclerView recyclerView2 = this.H;
            recyclerView2.E.remove(gl0Var);
            if (recyclerView2.F == gl0Var) {
                recyclerView2.F = null;
            }
            ArrayList arrayList = this.H.P;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.F;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.x.a(this.H, ((u) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.M = null;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
            w wVar = this.O;
            if (wVar != null) {
                wVar.a = false;
                this.O = null;
            }
            if (this.N != null) {
                this.N = null;
            }
        }
        this.H = ll0Var;
        if (ll0Var != null) {
            ll0Var.getResources();
            this.f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
            this.H.i(this);
            this.H.E.add(gl0Var);
            RecyclerView recyclerView3 = this.H;
            if (recyclerView3.P == null) {
                recyclerView3.P = new ArrayList();
            }
            recyclerView3.P.add(this);
            this.O = new w(this);
            this.N = new l.d(this.H.getContext(), this.O);
        }
    }

    public final int g(c1 c1Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.J;
        v vVar = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, vVar.h(this.h));
            float xVelocity = this.J.getXVelocity(this.w);
            float yVelocity = this.J.getYVelocity(this.w);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= vVar.f(this.f) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float g10 = vVar.g() * this.H.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.n) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.c == null && i10 == 2 && this.y != 2) {
            v vVar = this.x;
            if (vVar.j() && this.H.getScrollState() != 1) {
                o0 layoutManager = this.H.getLayoutManager();
                int i12 = this.w;
                c1 c1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float x10 = motionEvent.getX(findPointerIndex) - this.d;
                    float y3 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x10);
                    float abs2 = Math.abs(y3);
                    float f7 = this.G;
                    if ((abs >= f7 || abs2 >= f7) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        c1Var = this.H.T(k10);
                    }
                }
                if (c1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.H;
                int e7 = vVar.e(recyclerView, c1Var);
                WeakHashMap weakHashMap = r0.i0.a;
                int b10 = (vVar.b(e7, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x11 = motionEvent.getX(i11);
                float y10 = motionEvent.getY(i11);
                float f10 = x11 - this.d;
                float f11 = y10 - this.e;
                float abs3 = Math.abs(f10);
                float abs4 = Math.abs(f11);
                float f12 = this.G;
                if (abs3 >= f12 || abs4 >= f12) {
                    if (abs3 > abs4) {
                        if (f10 < 0.0f && (b10 & 4) == 0) {
                            return;
                        }
                        if (f10 > 0.0f && (b10 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f11 < 0.0f && (b10 & 1) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (b10 & 2) == 0) {
                            return;
                        }
                    }
                    this.r = 0.0f;
                    this.n = 0.0f;
                    this.w = motionEvent.getPointerId(0);
                    p(c1Var, 1);
                }
            }
        }
    }

    public final int i(c1 c1Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.J;
        v vVar = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, vVar.h(this.h));
            float xVelocity = this.J.getXVelocity(this.w);
            float yVelocity = this.J.getYVelocity(this.w);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= vVar.f(this.f) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float g10 = vVar.g() * this.H.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.r) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void j(c1 c1Var, boolean z10) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar.e == c1Var) {
                uVar.v |= z10;
                if (!uVar.w) {
                    uVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        c1 c1Var = this.c;
        if (c1Var != null) {
            View view = c1Var.a;
            if (m(view, x10, y3, this.s + this.n, this.v + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.e.a;
            if (m(view2, x10, y3, uVar.r, uVar.s)) {
                return view2;
            }
        }
        return this.H.E(x10, y3);
    }

    public final void l(float[] fArr) {
        if ((this.E & 12) != 0) {
            fArr[0] = (this.s + this.n) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.E & 3) != 0) {
            fArr[1] = (this.v + this.r) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void n(c1 c1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i10;
        View view;
        int i11;
        int i12;
        if (!this.H.isLayoutRequested() && this.y == 2) {
            v vVar = this.x;
            vVar.getClass();
            int i13 = (int) (this.s + this.n);
            int i14 = (int) (this.v + this.r);
            View view2 = c1Var.a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.K;
                if (arrayList2 == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.L.clear();
                }
                int round = Math.round(this.s + this.n);
                int round2 = Math.round(this.v + this.r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                o0 layoutManager = this.H.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q6 = layoutManager.q(i17);
                    if (q6 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q6.getBottom() >= round2 && q6.getTop() <= height && q6.getRight() >= round && q6.getLeft() <= width) {
                            c1 T = this.H.T(q6);
                            int abs5 = Math.abs(i15 - ((q6.getRight() + q6.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q6.getBottom() + q6.getTop()) / 2));
                            int i18 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.K.size();
                            i11 = round;
                            i12 = i13;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.L.get(i19)).intValue()) {
                                    break;
                                }
                                i20++;
                                i19++;
                                size = i21;
                            }
                            this.K.add(i20, T);
                            this.L.add(i20, Integer.valueOf(i18));
                            i17 = i10 + 1;
                            view2 = view;
                            round = i11;
                            i13 = i12;
                        }
                    }
                    view = view2;
                    i11 = round;
                    i12 = i13;
                    i17 = i10 + 1;
                    view2 = view;
                    round = i11;
                    i13 = i12;
                }
                View view3 = view2;
                int i22 = i13;
                ArrayList arrayList3 = this.K;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view3.getWidth() + i22;
                int height2 = view3.getHeight() + i14;
                int left2 = i22 - view3.getLeft();
                int top2 = i14 - view3.getTop();
                int size2 = arrayList3.size();
                c1 c1Var2 = null;
                int i23 = -1;
                int i24 = 0;
                while (i24 < size2) {
                    c1 c1Var3 = (c1) arrayList3.get(i24);
                    if (left2 <= 0 || (right = c1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (c1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                            i23 = abs4;
                            c1Var2 = c1Var3;
                        }
                    }
                    if (left2 < 0 && (left = c1Var3.a.getLeft() - i22) > 0 && c1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                        i23 = abs3;
                        c1Var2 = c1Var3;
                    }
                    if (top2 < 0 && (top = c1Var3.a.getTop() - i14) > 0 && c1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                        i23 = abs2;
                        c1Var2 = c1Var3;
                    }
                    if (top2 > 0 && (bottom = c1Var3.a.getBottom() - height2) < 0 && c1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                        i23 = abs;
                        c1Var2 = c1Var3;
                    }
                    i24++;
                    arrayList3 = arrayList;
                }
                if (c1Var2 == null) {
                    this.K.clear();
                    this.L.clear();
                    return;
                }
                int b10 = c1Var2.b();
                c1Var.b();
                if (vVar.n(this.H, c1Var, c1Var2)) {
                    this.x.o(this.H, c1Var, c1Var2, b10, i22, i14);
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.M) {
            this.M = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x009e, code lost:
    
        if (r4 > 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(c1 c1Var, int i10) {
        v vVar;
        boolean z10;
        boolean z11;
        char c10;
        int i11;
        int i12;
        float signum;
        Object[] objArr;
        if (c1Var == this.c && i10 == this.y) {
            return;
        }
        this.R = Long.MIN_VALUE;
        int i13 = this.y;
        j(c1Var, true);
        this.y = i10;
        if (i10 == 2) {
            if (c1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.M = c1Var.a;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        c1 c1Var2 = this.c;
        v vVar2 = this.x;
        if (c1Var2 != null) {
            View view = c1Var2.a;
            if (view.getParent() != null) {
                boolean q6 = q();
                if (i13 == 2) {
                    i12 = 0;
                    c10 = 0;
                } else {
                    if (this.y != 2) {
                        int e7 = vVar2.e(this.H, c1Var2);
                        RecyclerView recyclerView = this.H;
                        WeakHashMap weakHashMap = r0.i0.a;
                        int b10 = (vVar2.b(e7, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i15 = (e7 & 65280) >> 8;
                            c10 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                i11 = g(c1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = i(c1Var2, b10);
                                } else if ((i15 & i11) == 0) {
                                    i11 = v.c(i11, this.H.getLayoutDirection());
                                }
                                i12 = i11;
                            } else {
                                i11 = i(c1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = g(c1Var2, b10);
                                    if (i11 > 0) {
                                        if ((i15 & i11) == 0) {
                                            i11 = v.c(i11, this.H.getLayoutDirection());
                                        }
                                    }
                                    i11 = 0;
                                }
                                i12 = i11;
                            }
                        }
                    }
                    i11 = 0;
                    c10 = 0;
                    i12 = i11;
                }
                VelocityTracker velocityTracker = this.J;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.J = null;
                }
                int i16 = 4;
                float f7 = 0.0f;
                if (!q6) {
                    if (i12 == 1 || i12 == 2) {
                        signum = Math.signum(this.r) * this.H.getHeight();
                        objArr = null;
                        if (i13 != 2) {
                            i16 = 8;
                        } else if (i12 > 0) {
                            i16 = 2;
                        }
                        float[] fArr = this.b;
                        l(fArr);
                        int i17 = i16;
                        float f10 = fArr[c10];
                        float f11 = fArr[1];
                        vVar = vVar2;
                        z10 = false;
                        u uVar = new u(this, c1Var2, i13, f10, f11, f7, signum, i12, c1Var2);
                        long d = vVar.d(this.H, i17, f7 - f10, signum - f11);
                        ValueAnimator valueAnimator = uVar.h;
                        valueAnimator.setDuration(d);
                        this.F.add(uVar);
                        c1Var2.q(false);
                        valueAnimator.start();
                        z11 = true;
                    } else if (i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                        f7 = Math.signum(this.n) * this.H.getWidth();
                    }
                }
                objArr = null;
                signum = 0.0f;
                if (i13 != 2) {
                }
                float[] fArr2 = this.b;
                l(fArr2);
                int i172 = i16;
                float f102 = fArr2[c10];
                float f112 = fArr2[1];
                vVar = vVar2;
                z10 = false;
                u uVar2 = new u(this, c1Var2, i13, f102, f112, f7, signum, i12, c1Var2);
                long d10 = vVar.d(this.H, i172, f7 - f102, signum - f112);
                ValueAnimator valueAnimator2 = uVar2.h;
                valueAnimator2.setDuration(d10);
                this.F.add(uVar2);
                c1Var2.q(false);
                valueAnimator2.start();
                z11 = true;
            } else {
                vVar = vVar2;
                z10 = false;
                o(view);
                vVar.a(this.H, c1Var2);
                z11 = false;
            }
            this.c = null;
        } else {
            vVar = vVar2;
            z10 = false;
            z11 = false;
        }
        if (c1Var != null) {
            View view2 = c1Var.a;
            RecyclerView recyclerView2 = this.H;
            int e10 = vVar.e(recyclerView2, c1Var);
            WeakHashMap weakHashMap2 = r0.i0.a;
            this.E = (vVar.b(e10, recyclerView2.getLayoutDirection()) & i14) >> (this.y * 8);
            this.s = view2.getLeft();
            this.v = view2.getTop();
            this.c = c1Var;
            if (i10 == 2) {
                try {
                    view2.performHapticFeedback(z10 ? 1 : 0, 2);
                } catch (Exception unused) {
                }
            }
        }
        ViewParent parent = this.H.getParent();
        if (parent != null) {
            if (this.c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.H.getLayoutManager().f = true;
        }
        vVar.p(this.c, this.y);
        this.H.invalidate();
    }

    public boolean q() {
        return false;
    }

    public final void r(c1 c1Var) {
        RecyclerView recyclerView = this.H;
        v vVar = this.x;
        int e7 = vVar.e(recyclerView, c1Var);
        WeakHashMap weakHashMap = r0.i0.a;
        if ((vVar.b(e7, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (c1Var.a.getParent() != this.H) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.J = VelocityTracker.obtain();
        this.r = 0.0f;
        this.n = 0.0f;
        p(c1Var, 2);
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x10 - this.d;
        this.n = f7;
        this.r = y3 - this.e;
        if ((i10 & 4) == 0) {
            this.n = Math.max(0.0f, f7);
        }
        if ((i10 & 8) == 0) {
            this.n = Math.min(0.0f, this.n);
        }
        if ((i10 & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i10 & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }
}
