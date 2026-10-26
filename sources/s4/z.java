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
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class z extends n0 implements r0 {
    public int E;
    public int G;
    public RecyclerView H;
    public VelocityTracker J;
    public ArrayList K;
    public ArrayList L;
    public jg.s0 N;
    public x O;
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
    public final w x;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public e1 c = null;
    public int w = -1;
    public int y = 0;
    public final ArrayList F = new ArrayList();
    public final cy0 I = new cy0(this, 11);
    public View M = null;
    public final gm0 P = new gm0(this);

    public z(w wVar) {
        this.x = wVar;
    }

    public static boolean o(View view, float f7, float f10, float f11, float f12) {
        return f7 >= f11 && f7 <= f11 + ((float) view.getWidth()) && f10 >= f12 && f10 <= f12 + ((float) view.getHeight());
    }

    @Override // s4.r0
    public final void a(View view) {
        q(view);
        e1 T = this.H.T(view);
        if (T == null) {
            return;
        }
        e1 e1Var = this.c;
        if (e1Var != null && T == e1Var) {
            r(null, 0);
            return;
        }
        l(T, false);
        if (this.a.remove(T.a)) {
            this.x.a(this.H, T);
        }
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, b1 b1Var) {
        rect.setEmpty();
    }

    @Override // s4.n0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f11 = fArr[0];
            f7 = fArr[1];
            f10 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        e1 e1Var = this.c;
        int i10 = this.y;
        w wVar = this.x;
        wVar.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            v vVar = (v) arrayList.get(i11);
            e1 e1Var2 = vVar.e;
            float f12 = vVar.a;
            float f13 = vVar.c;
            if (f12 == f13) {
                vVar.r = e1Var2.a.getTranslationX();
            } else {
                vVar.r = c3.h0.z(f13, f12, vVar.x, f12);
            }
            float f14 = vVar.b;
            float f15 = vVar.d;
            if (f14 == f15) {
                vVar.s = e1Var2.a.getTranslationY();
            } else {
                vVar.s = c3.h0.z(f15, f14, vVar.x, f14);
            }
            int save = canvas.save();
            wVar.m(canvas, recyclerView, vVar.e, vVar.r, vVar.s, vVar.f, false);
            canvas.restoreToCount(save);
        }
        if (e1Var != null) {
            int save2 = canvas.save();
            wVar.m(canvas, recyclerView, e1Var, f10, f7, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // s4.n0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f7 = fArr[0];
            float f10 = fArr[1];
        }
        e1 e1Var = this.c;
        this.x.getClass();
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = (v) arrayList.get(i10);
            int save = canvas.save();
            View view = vVar.e.a;
            canvas.restoreToCount(save);
        }
        if (e1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            v vVar2 = (v) arrayList.get(i11);
            boolean z11 = vVar2.w;
            if (z11 && !vVar2.n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void h(mm0 mm0Var) {
        RecyclerView recyclerView = this.H;
        if (recyclerView == mm0Var) {
            return;
        }
        gm0 gm0Var = this.P;
        if (recyclerView != null) {
            recyclerView.q0(this);
            RecyclerView recyclerView2 = this.H;
            recyclerView2.E.remove(gm0Var);
            if (recyclerView2.F == gm0Var) {
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
                this.x.a(this.H, ((v) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.M = null;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
            x xVar = this.O;
            if (xVar != null) {
                xVar.a = false;
                this.O = null;
            }
            if (this.N != null) {
                this.N = null;
            }
        }
        this.H = mm0Var;
        if (mm0Var != null) {
            mm0Var.getResources();
            this.f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.G = ViewConfiguration.get(this.H.getContext()).getScaledTouchSlop();
            this.H.i(this);
            this.H.E.add(gm0Var);
            RecyclerView recyclerView3 = this.H;
            if (recyclerView3.P == null) {
                recyclerView3.P = new ArrayList();
            }
            recyclerView3.P.add(this);
            this.O = new x(this);
            this.N = new jg.s0(this.H.getContext(), this.O);
        }
    }

    public final int i(e1 e1Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.J;
        w wVar = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, wVar.h(this.h));
            float xVelocity = this.J.getXVelocity(this.w);
            float yVelocity = this.J.getYVelocity(this.w);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= wVar.f(this.f) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float g7 = wVar.g() * this.H.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.n) <= g7) {
            return 0;
        }
        return i11;
    }

    public final void j(int i10, int i11, MotionEvent motionEvent) {
        View m10;
        if (this.c == null && i10 == 2 && this.y != 2) {
            w wVar = this.x;
            if (wVar.j() && this.H.getScrollState() != 1) {
                p0 layoutManager = this.H.getLayoutManager();
                int i12 = this.w;
                e1 e1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float x9 = motionEvent.getX(findPointerIndex) - this.d;
                    float y3 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x9);
                    float abs2 = Math.abs(y3);
                    float f7 = this.G;
                    if ((abs >= f7 || abs2 >= f7) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m10 = m(motionEvent)) != null))) {
                        e1Var = this.H.T(m10);
                    }
                }
                if (e1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.H;
                int e = wVar.e(recyclerView, e1Var);
                WeakHashMap weakHashMap = r0.i0.a;
                int b10 = (wVar.b(e, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x10 = motionEvent.getX(i11);
                float y10 = motionEvent.getY(i11);
                float f10 = x10 - this.d;
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
                    r(e1Var, 1);
                }
            }
        }
    }

    public final int k(e1 e1Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.J;
        w wVar = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, wVar.h(this.h));
            float xVelocity = this.J.getXVelocity(this.w);
            float yVelocity = this.J.getYVelocity(this.w);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= wVar.f(this.f) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float g7 = wVar.g() * this.H.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.r) <= g7) {
            return 0;
        }
        return i11;
    }

    public final void l(e1 e1Var, boolean z10) {
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            if (vVar.e == e1Var) {
                vVar.v |= z10;
                if (!vVar.w) {
                    vVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        e1 e1Var = this.c;
        if (e1Var != null) {
            View view = e1Var.a;
            if (o(view, x9, y3, this.s + this.n, this.v + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            View view2 = vVar.e.a;
            if (o(view2, x9, y3, vVar.r, vVar.s)) {
                return view2;
            }
        }
        return this.H.E(x9, y3);
    }

    public final void n(float[] fArr) {
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

    public final void p(e1 e1Var) {
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
            w wVar = this.x;
            wVar.getClass();
            int i13 = (int) (this.s + this.n);
            int i14 = (int) (this.v + this.r);
            View view2 = e1Var.a;
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
                p0 layoutManager = this.H.getLayoutManager();
                int r6 = layoutManager.r();
                int i17 = 0;
                while (i17 < r6) {
                    View q5 = layoutManager.q(i17);
                    if (q5 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q5.getBottom() >= round2 && q5.getTop() <= height && q5.getRight() >= round && q5.getLeft() <= width) {
                            e1 T = this.H.T(q5);
                            int abs5 = Math.abs(i15 - ((q5.getRight() + q5.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q5.getBottom() + q5.getTop()) / 2));
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
                e1 e1Var2 = null;
                int i23 = -1;
                int i24 = 0;
                while (i24 < size2) {
                    e1 e1Var3 = (e1) arrayList3.get(i24);
                    if (left2 <= 0 || (right = e1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (e1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                            i23 = abs4;
                            e1Var2 = e1Var3;
                        }
                    }
                    if (left2 < 0 && (left = e1Var3.a.getLeft() - i22) > 0 && e1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                        i23 = abs3;
                        e1Var2 = e1Var3;
                    }
                    if (top2 < 0 && (top = e1Var3.a.getTop() - i14) > 0 && e1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                        i23 = abs2;
                        e1Var2 = e1Var3;
                    }
                    if (top2 > 0 && (bottom = e1Var3.a.getBottom() - height2) < 0 && e1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                        i23 = abs;
                        e1Var2 = e1Var3;
                    }
                    i24++;
                    arrayList3 = arrayList;
                }
                if (e1Var2 == null) {
                    this.K.clear();
                    this.L.clear();
                    return;
                }
                int b10 = e1Var2.b();
                e1Var.b();
                if (wVar.n(this.H, e1Var, e1Var2)) {
                    this.x.o(this.H, e1Var, e1Var2, b10, i22, i14);
                }
            }
        }
    }

    public final void q(View view) {
        if (view == this.M) {
            this.M = null;
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
    public final void r(e1 e1Var, int i10) {
        w wVar;
        boolean z10;
        boolean z11;
        char c10;
        int k10;
        int i11;
        ?? r16;
        float signum;
        Object obj;
        if (e1Var == this.c && i10 == this.y) {
            return;
        }
        this.R = Long.MIN_VALUE;
        int i12 = this.y;
        l(e1Var, true);
        this.y = i10;
        if (i10 == 2) {
            if (e1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.M = e1Var.a;
        }
        int i13 = (1 << ((i10 * 8) + 8)) - 1;
        e1 e1Var2 = this.c;
        w wVar2 = this.x;
        if (e1Var2 != null) {
            View view = e1Var2.a;
            if (view.getParent() != null) {
                boolean s10 = s();
                if (i12 == 2) {
                    i11 = 0;
                    r16 = 0;
                } else {
                    if (this.y != 2) {
                        int e = wVar2.e(this.H, e1Var2);
                        RecyclerView recyclerView = this.H;
                        WeakHashMap weakHashMap = r0.i0.a;
                        int b10 = (wVar2.b(e, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i14 = (e & 65280) >> 8;
                            c10 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                k10 = i(e1Var2, b10);
                                if (k10 <= 0) {
                                    k10 = k(e1Var2, b10);
                                } else if ((i14 & k10) == 0) {
                                    k10 = w.c(k10, this.H.getLayoutDirection());
                                }
                                i11 = k10;
                                r16 = c10;
                            } else {
                                k10 = k(e1Var2, b10);
                                if (k10 <= 0) {
                                    k10 = i(e1Var2, b10);
                                    if (k10 > 0) {
                                        if ((i14 & k10) == 0) {
                                            k10 = w.c(k10, this.H.getLayoutDirection());
                                        }
                                    }
                                    k10 = 0;
                                }
                                i11 = k10;
                                r16 = c10;
                            }
                        }
                    }
                    k10 = 0;
                    c10 = 0;
                    i11 = k10;
                    r16 = c10;
                }
                VelocityTracker velocityTracker = this.J;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.J = null;
                }
                int i15 = 4;
                float f7 = 0.0f;
                if (!s10) {
                    if (i11 == 1 || i11 == 2) {
                        signum = Math.signum(this.r) * this.H.getHeight();
                        obj = null;
                    } else if (i11 == 4 || i11 == 8 || i11 == 16 || i11 == 32) {
                        f7 = Math.signum(this.n) * this.H.getWidth();
                        obj = null;
                        signum = 0.0f;
                    }
                    if (i12 != 2) {
                        i15 = 8;
                    } else if (i11 > 0) {
                        i15 = 2;
                    }
                    float[] fArr = this.b;
                    n(fArr);
                    int i16 = i15;
                    float f10 = fArr[r16];
                    float f11 = fArr[1];
                    z10 = r16;
                    wVar = wVar2;
                    v vVar = new v(this, e1Var2, i12, f10, f11, f7, signum, i11, e1Var2);
                    long d = wVar.d(this.H, i16, f7 - f10, signum - f11);
                    ValueAnimator valueAnimator = vVar.h;
                    valueAnimator.setDuration(d);
                    this.F.add(vVar);
                    e1Var2.q(z10);
                    valueAnimator.start();
                    z11 = true;
                }
                obj = null;
                signum = 0.0f;
                if (i12 != 2) {
                }
                float[] fArr2 = this.b;
                n(fArr2);
                int i162 = i15;
                float f102 = fArr2[r16];
                float f112 = fArr2[1];
                z10 = r16;
                wVar = wVar2;
                v vVar2 = new v(this, e1Var2, i12, f102, f112, f7, signum, i11, e1Var2);
                long d10 = wVar.d(this.H, i162, f7 - f102, signum - f112);
                ValueAnimator valueAnimator2 = vVar2.h;
                valueAnimator2.setDuration(d10);
                this.F.add(vVar2);
                e1Var2.q(z10);
                valueAnimator2.start();
                z11 = true;
            } else {
                wVar = wVar2;
                z10 = false;
                q(view);
                wVar.a(this.H, e1Var2);
                z11 = false;
            }
            this.c = null;
        } else {
            wVar = wVar2;
            z10 = false;
            z11 = false;
        }
        if (e1Var != null) {
            View view2 = e1Var.a;
            RecyclerView recyclerView2 = this.H;
            int e10 = wVar.e(recyclerView2, e1Var);
            WeakHashMap weakHashMap2 = r0.i0.a;
            this.E = (wVar.b(e10, recyclerView2.getLayoutDirection()) & i13) >> (this.y * 8);
            this.s = view2.getLeft();
            this.v = view2.getTop();
            this.c = e1Var;
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
        wVar.p(this.c, this.y);
        this.H.invalidate();
    }

    public boolean s() {
        return false;
    }

    public final void t(e1 e1Var) {
        RecyclerView recyclerView = this.H;
        w wVar = this.x;
        int e = wVar.e(recyclerView, e1Var);
        WeakHashMap weakHashMap = r0.i0.a;
        if ((wVar.b(e, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (e1Var.a.getParent() != this.H) {
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
        r(e1Var, 2);
    }

    public final void u(int i10, int i11, MotionEvent motionEvent) {
        float x9 = motionEvent.getX(i11);
        float y3 = motionEvent.getY(i11);
        float f7 = x9 - this.d;
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

    @Override // s4.r0
    public final void c() {
    }
}
