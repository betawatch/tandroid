package u4;

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
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class y extends n0 implements q0 {
    public int F;
    public int H;
    public RecyclerView I;
    public VelocityTracker K;
    public ArrayList L;
    public ArrayList M;
    public y00 O;
    public w P;
    public Rect R;
    public long S;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public final v y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public d1 c = null;
    public int x = -1;
    public int E = 0;
    public final ArrayList G = new ArrayList();
    public final lt J = new lt(this, 26);
    public View N = null;
    public final mj0 Q = new mj0(this);

    public y(v vVar) {
        this.y = vVar;
    }

    public static boolean o(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // u4.q0
    public final void a(View view) {
        q(view);
        d1 T = this.I.T(view);
        if (T == null) {
            return;
        }
        d1 d1Var = this.c;
        if (d1Var != null && T == d1Var) {
            r(null, 0);
            return;
        }
        l(T, false);
        if (this.a.remove(T.a)) {
            this.y.a(this.I, T);
        }
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        rect.setEmpty();
    }

    @Override // u4.n0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        d1 d1Var = this.c;
        int i3 = this.E;
        v vVar = this.y;
        vVar.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) arrayList.get(i10);
            d1 d1Var2 = uVar.e;
            float f13 = uVar.a;
            float f14 = uVar.c;
            if (f13 == f14) {
                uVar.r = d1Var2.a.getTranslationX();
            } else {
                uVar.r = com.google.android.recaptcha.internal.a.y(f14, f13, uVar.y, f13);
            }
            float f15 = uVar.b;
            float f16 = uVar.d;
            if (f15 == f16) {
                uVar.s = d1Var2.a.getTranslationY();
            } else {
                uVar.s = com.google.android.recaptcha.internal.a.y(f16, f15, uVar.y, f15);
            }
            int save = canvas.save();
            vVar.m(canvas, recyclerView, uVar.e, uVar.r, uVar.s, uVar.f, false);
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            int save2 = canvas.save();
            vVar.m(canvas, recyclerView, d1Var, f11, f10, i3, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // u4.n0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        d1 d1Var = this.c;
        this.y.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            u uVar = (u) arrayList.get(i3);
            int save = canvas.save();
            View view = uVar.e.a;
            canvas.restoreToCount(save);
        }
        if (d1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            u uVar2 = (u) arrayList.get(i10);
            boolean z11 = uVar2.x;
            if (z11 && !uVar2.n) {
                arrayList.remove(i10);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void h(tj0 tj0Var) {
        RecyclerView recyclerView = this.I;
        if (recyclerView == tj0Var) {
            return;
        }
        mj0 mj0Var = this.Q;
        if (recyclerView != null) {
            recyclerView.q0(this);
            RecyclerView recyclerView2 = this.I;
            recyclerView2.F.remove(mj0Var);
            if (recyclerView2.G == mj0Var) {
                recyclerView2.G = null;
            }
            ArrayList arrayList = this.I.Q;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.G;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.y.a(this.I, ((u) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.N = null;
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.K = null;
            }
            w wVar = this.P;
            if (wVar != null) {
                wVar.a = false;
                this.P = null;
            }
            if (this.O != null) {
                this.O = null;
            }
        }
        this.I = tj0Var;
        if (tj0Var != null) {
            tj0Var.getResources();
            this.f = org.telegram.messenger.g0.L(120.0f);
            this.h = org.telegram.messenger.g0.L(800.0f);
            this.H = ViewConfiguration.get(this.I.getContext()).getScaledTouchSlop();
            this.I.i(this);
            this.I.F.add(mj0Var);
            RecyclerView recyclerView3 = this.I;
            if (recyclerView3.Q == null) {
                recyclerView3.Q = new ArrayList();
            }
            recyclerView3.Q.add(this);
            this.P = new w(this);
            this.O = new y00(this.I.getContext(), this.P);
        }
    }

    public final int i(d1 d1Var, int i3) {
        if ((i3 & 12) == 0) {
            return 0;
        }
        int i10 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.K;
        v vVar = this.y;
        if (velocityTracker != null && this.x > -1) {
            velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
            float xVelocity = this.K.getXVelocity(this.x);
            float yVelocity = this.K.getYVelocity(this.x);
            int i11 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i11 & i3) != 0 && i10 == i11 && abs >= vVar.f(this.f) && abs > Math.abs(yVelocity)) {
                return i11;
            }
        }
        float g7 = vVar.g() * this.I.getWidth();
        if ((i3 & i10) == 0 || Math.abs(this.n) <= g7) {
            return 0;
        }
        return i10;
    }

    public final void j(int i3, int i10, MotionEvent motionEvent) {
        View m10;
        if (this.c == null && i3 == 2 && this.E != 2) {
            v vVar = this.y;
            if (vVar.j() && this.I.getScrollState() != 1) {
                o0 layoutManager = this.I.getLayoutManager();
                int i11 = this.x;
                d1 d1Var = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x10 = motionEvent.getX(findPointerIndex) - this.d;
                    float y9 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x10);
                    float abs2 = Math.abs(y9);
                    float f10 = this.H;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m10 = m(motionEvent)) != null))) {
                        d1Var = this.I.T(m10);
                    }
                }
                if (d1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.I;
                int e10 = vVar.e(recyclerView, d1Var);
                WeakHashMap weakHashMap = r0.i0.a;
                int b10 = (vVar.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x11 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                float f11 = x11 - this.d;
                float f12 = y10 - this.e;
                float abs3 = Math.abs(f11);
                float abs4 = Math.abs(f12);
                float f13 = this.H;
                if (abs3 >= f13 || abs4 >= f13) {
                    if (abs3 > abs4) {
                        if (f11 < 0.0f && (b10 & 4) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (b10 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f12 < 0.0f && (b10 & 1) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (b10 & 2) == 0) {
                            return;
                        }
                    }
                    this.r = 0.0f;
                    this.n = 0.0f;
                    this.x = motionEvent.getPointerId(0);
                    r(d1Var, 1);
                }
            }
        }
    }

    public final int k(d1 d1Var, int i3) {
        if ((i3 & 3) == 0) {
            return 0;
        }
        int i10 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.K;
        v vVar = this.y;
        if (velocityTracker != null && this.x > -1) {
            velocityTracker.computeCurrentVelocity(1000, vVar.h(this.h));
            float xVelocity = this.K.getXVelocity(this.x);
            float yVelocity = this.K.getYVelocity(this.x);
            int i11 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i11 & i3) != 0 && i11 == i10 && abs >= vVar.f(this.f) && abs > Math.abs(xVelocity)) {
                return i11;
            }
        }
        float g7 = vVar.g() * this.I.getHeight();
        if ((i3 & i10) == 0 || Math.abs(this.r) <= g7) {
            return 0;
        }
        return i10;
    }

    public final void l(d1 d1Var, boolean z10) {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar.e == d1Var) {
                uVar.w |= z10;
                if (!uVar.x) {
                    uVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        d1 d1Var = this.c;
        if (d1Var != null) {
            View view = d1Var.a;
            if (o(view, x10, y9, this.s + this.n, this.w + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            View view2 = uVar.e.a;
            if (o(view2, x10, y9, uVar.r, uVar.s)) {
                return view2;
            }
        }
        return this.I.E(x10, y9);
    }

    public final void n(float[] fArr) {
        if ((this.F & 12) != 0) {
            fArr[0] = (this.s + this.n) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.F & 3) != 0) {
            fArr[1] = (this.w + this.r) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void p(d1 d1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i3;
        View view;
        int i10;
        int i11;
        if (!this.I.isLayoutRequested() && this.E == 2) {
            v vVar = this.y;
            vVar.getClass();
            int i12 = (int) (this.s + this.n);
            int i13 = (int) (this.w + this.r);
            View view2 = d1Var.a;
            if (Math.abs(i13 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i12 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.L;
                if (arrayList2 == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.M.clear();
                }
                int round = Math.round(this.s + this.n);
                int round2 = Math.round(this.w + this.r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                o0 layoutManager = this.I.getLayoutManager();
                int r5 = layoutManager.r();
                int i16 = 0;
                while (i16 < r5) {
                    View q10 = layoutManager.q(i16);
                    if (q10 == view2) {
                        i3 = i16;
                    } else {
                        i3 = i16;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            d1 T = this.I.T(q10);
                            int abs5 = Math.abs(i14 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i15 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i17 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.L.size();
                            i10 = round;
                            i11 = i12;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.M.get(i18)).intValue()) {
                                    break;
                                }
                                i19++;
                                i18++;
                                size = i20;
                            }
                            this.L.add(i19, T);
                            this.M.add(i19, Integer.valueOf(i17));
                            i16 = i3 + 1;
                            view2 = view;
                            round = i10;
                            i12 = i11;
                        }
                    }
                    view = view2;
                    i10 = round;
                    i11 = i12;
                    i16 = i3 + 1;
                    view2 = view;
                    round = i10;
                    i12 = i11;
                }
                View view3 = view2;
                int i21 = i12;
                ArrayList arrayList3 = this.L;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view3.getWidth() + i21;
                int height2 = view3.getHeight() + i13;
                int left2 = i21 - view3.getLeft();
                int top2 = i13 - view3.getTop();
                int size2 = arrayList3.size();
                d1 d1Var2 = null;
                int i22 = -1;
                int i23 = 0;
                while (i23 < size2) {
                    d1 d1Var3 = (d1) arrayList3.get(i23);
                    if (left2 <= 0 || (right = d1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (d1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i22) {
                            i22 = abs4;
                            d1Var2 = d1Var3;
                        }
                    }
                    if (left2 < 0 && (left = d1Var3.a.getLeft() - i21) > 0 && d1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i22) {
                        i22 = abs3;
                        d1Var2 = d1Var3;
                    }
                    if (top2 < 0 && (top = d1Var3.a.getTop() - i13) > 0 && d1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i22) {
                        i22 = abs2;
                        d1Var2 = d1Var3;
                    }
                    if (top2 > 0 && (bottom = d1Var3.a.getBottom() - height2) < 0 && d1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i22) {
                        i22 = abs;
                        d1Var2 = d1Var3;
                    }
                    i23++;
                    arrayList3 = arrayList;
                }
                if (d1Var2 == null) {
                    this.L.clear();
                    this.M.clear();
                    return;
                }
                int b10 = d1Var2.b();
                d1Var.b();
                if (vVar.n(this.I, d1Var, d1Var2)) {
                    this.y.o(this.I, d1Var, d1Var2, b10, i21, i13);
                }
            }
        }
    }

    public final void q(View view) {
        if (view == this.N) {
            this.N = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x009e, code lost:
    
        if (r4 > 0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(d1 d1Var, int i3) {
        v vVar;
        boolean z10;
        boolean z11;
        char c2;
        int k10;
        int i10;
        ?? r16;
        float signum;
        Object obj;
        if (d1Var == this.c && i3 == this.E) {
            return;
        }
        this.S = Long.MIN_VALUE;
        int i11 = this.E;
        l(d1Var, true);
        this.E = i3;
        if (i3 == 2) {
            if (d1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.N = d1Var.a;
        }
        int i12 = (1 << ((i3 * 8) + 8)) - 1;
        d1 d1Var2 = this.c;
        v vVar2 = this.y;
        if (d1Var2 != null) {
            View view = d1Var2.a;
            if (view.getParent() != null) {
                boolean s6 = s();
                if (i11 == 2) {
                    i10 = 0;
                    r16 = 0;
                } else {
                    if (this.E != 2) {
                        int e10 = vVar2.e(this.I, d1Var2);
                        RecyclerView recyclerView = this.I;
                        WeakHashMap weakHashMap = r0.i0.a;
                        int b10 = (vVar2.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i13 = (e10 & 65280) >> 8;
                            c2 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                k10 = i(d1Var2, b10);
                                if (k10 <= 0) {
                                    k10 = k(d1Var2, b10);
                                } else if ((i13 & k10) == 0) {
                                    k10 = v.c(k10, this.I.getLayoutDirection());
                                }
                                i10 = k10;
                                r16 = c2;
                            } else {
                                k10 = k(d1Var2, b10);
                                if (k10 <= 0) {
                                    k10 = i(d1Var2, b10);
                                    if (k10 > 0) {
                                        if ((i13 & k10) == 0) {
                                            k10 = v.c(k10, this.I.getLayoutDirection());
                                        }
                                    }
                                    k10 = 0;
                                }
                                i10 = k10;
                                r16 = c2;
                            }
                        }
                    }
                    k10 = 0;
                    c2 = 0;
                    i10 = k10;
                    r16 = c2;
                }
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.K = null;
                }
                int i14 = 4;
                float f10 = 0.0f;
                if (!s6) {
                    if (i10 == 1 || i10 == 2) {
                        signum = Math.signum(this.r) * this.I.getHeight();
                        obj = null;
                    } else if (i10 == 4 || i10 == 8 || i10 == 16 || i10 == 32) {
                        f10 = Math.signum(this.n) * this.I.getWidth();
                        obj = null;
                        signum = 0.0f;
                    }
                    if (i11 != 2) {
                        i14 = 8;
                    } else if (i10 > 0) {
                        i14 = 2;
                    }
                    float[] fArr = this.b;
                    n(fArr);
                    int i15 = i14;
                    float f11 = fArr[r16];
                    float f12 = fArr[1];
                    z10 = r16;
                    vVar = vVar2;
                    u uVar = new u(this, d1Var2, i11, f11, f12, f10, signum, i10, d1Var2);
                    long d = vVar.d(this.I, i15, f10 - f11, signum - f12);
                    ValueAnimator valueAnimator = uVar.h;
                    valueAnimator.setDuration(d);
                    this.G.add(uVar);
                    d1Var2.q(z10);
                    valueAnimator.start();
                    z11 = true;
                }
                obj = null;
                signum = 0.0f;
                if (i11 != 2) {
                }
                float[] fArr2 = this.b;
                n(fArr2);
                int i152 = i14;
                float f112 = fArr2[r16];
                float f122 = fArr2[1];
                z10 = r16;
                vVar = vVar2;
                u uVar2 = new u(this, d1Var2, i11, f112, f122, f10, signum, i10, d1Var2);
                long d10 = vVar.d(this.I, i152, f10 - f112, signum - f122);
                ValueAnimator valueAnimator2 = uVar2.h;
                valueAnimator2.setDuration(d10);
                this.G.add(uVar2);
                d1Var2.q(z10);
                valueAnimator2.start();
                z11 = true;
            } else {
                vVar = vVar2;
                z10 = false;
                q(view);
                vVar.a(this.I, d1Var2);
                z11 = false;
            }
            this.c = null;
        } else {
            vVar = vVar2;
            z10 = false;
            z11 = false;
        }
        if (d1Var != null) {
            View view2 = d1Var.a;
            RecyclerView recyclerView2 = this.I;
            int e11 = vVar.e(recyclerView2, d1Var);
            WeakHashMap weakHashMap2 = r0.i0.a;
            this.F = (vVar.b(e11, recyclerView2.getLayoutDirection()) & i12) >> (this.E * 8);
            this.s = view2.getLeft();
            this.w = view2.getTop();
            this.c = d1Var;
            if (i3 == 2) {
                try {
                    view2.performHapticFeedback(z10 ? 1 : 0, 2);
                } catch (Exception unused) {
                }
            }
        }
        ViewParent parent = this.I.getParent();
        if (parent != null) {
            if (this.c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.I.getLayoutManager().f = true;
        }
        vVar.p(this.c, this.E);
        this.I.invalidate();
    }

    public boolean s() {
        return false;
    }

    public final void t(d1 d1Var) {
        RecyclerView recyclerView = this.I;
        v vVar = this.y;
        int e10 = vVar.e(recyclerView, d1Var);
        WeakHashMap weakHashMap = r0.i0.a;
        if ((vVar.b(e10, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (d1Var.a.getParent() != this.I) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.K = VelocityTracker.obtain();
        this.r = 0.0f;
        this.n = 0.0f;
        r(d1Var, 2);
    }

    public final void u(int i3, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y9 = motionEvent.getY(i10);
        float f10 = x10 - this.d;
        this.n = f10;
        this.r = y9 - this.e;
        if ((i3 & 4) == 0) {
            this.n = Math.max(0.0f, f10);
        }
        if ((i3 & 8) == 0) {
            this.n = Math.min(0.0f, this.n);
        }
        if ((i3 & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i3 & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }

    @Override // u4.q0
    public final void c() {
    }
}
