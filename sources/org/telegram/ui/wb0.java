package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wb0 extends org.telegram.ui.Components.uu0 implements r0.l {
    public final /* synthetic */ int f0 = 1;
    public final ac.g g0;
    public boolean h0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(org.telegram.ui.Wallet.b6 b6Var, Context context) {
        super(context, null);
        this.i0 = b6Var;
        this.g0 = new ac.g();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.b6) this.i0).q0;
        if (x5Var != null) {
            x5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.i0;
        jg.z2 z2Var = b6Var.n0;
        return z2Var != null && (z2Var.getParent() instanceof View) && ((View) b6Var.n0.getParent()).getTop() <= b6Var.a.getPaddingTop();
    }

    /* JADX WARN: Finally extract failed */
    public int b0(org.telegram.ui.Components.u51 u51Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.bu0 bu0Var = new org.telegram.ui.Components.bu0(iArr, 7);
        this.h0 = true;
        u51Var.j(bu0Var);
        try {
            u51Var.scrollBy(0, i10);
            ArrayList arrayList = u51Var.w0;
            if (arrayList != null) {
                arrayList.remove(bu0Var);
            }
            this.h0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = u51Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(bu0Var);
            }
            this.h0 = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v6 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.x5 x5Var;
        org.telegram.ui.Wallet.g6 g6Var;
        float f7;
        float f10;
        org.telegram.ui.Wallet.g8 g8Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Wallet.g8 g8Var2;
        float f11;
        Iterator it;
        org.telegram.ui.Wallet.g8 g8Var3;
        org.telegram.ui.Wallet.g8 g8Var4;
        int i10;
        switch (this.f0) {
            case 1:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.i0;
                org.telegram.ui.Wallet.h8 h8Var = b6Var.j0;
                int i11 = 1;
                if (h8Var != null) {
                    org.telegram.ui.Wallet.z7 z7Var = h8Var.B1;
                    LinkedHashMap linkedHashMap = h8Var.f;
                    org.telegram.ui.Wallet.z7 z7Var2 = h8Var.A1;
                    boolean z13 = false;
                    if (!h8Var.b && ((g6Var = h8Var.c.D) == null || !g6Var.a || h8Var.p0 || h8Var.q0)) {
                        if (h8Var.a1 || h8Var.s0 || !h8Var.A()) {
                            z13 = h8Var.p0;
                        } else {
                            if (h8Var.h1) {
                                h8Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                h8Var.removeCallbacks(z7Var2);
                                h8Var.removeCallbacks(z7Var);
                                h8Var.g0 = null;
                                h8Var.o0 = false;
                                h8Var.i0 = false;
                                h8Var.n0 = false;
                                h8Var.m0 = false;
                                h8Var.q0 = false;
                                h8Var.p0 = false;
                                h8Var.v0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                float[] fArr = {x10, y3};
                                h8Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.g8 g8Var5 = h8Var.h0;
                                if (g8Var5 != null && g8Var5.H == 2) {
                                    float P = (h8Var.P(g8Var5) * 0.5f) + org.telegram.messenger.i0.L(9.0f);
                                    double radians = Math.toRadians(g8Var5.i.a);
                                    int i12 = -1;
                                    while (i12 <= i11) {
                                        int i13 = i11;
                                        float f12 = i12 * P;
                                        double d = radians;
                                        float[] L = h8Var.L((((float) Math.cos(d)) * f12) + g8Var5.e.a + g8Var5.n.a, (f12 * ((float) Math.sin(d))) + g8Var5.f.a + g8Var5.o.a);
                                        if (Utilities.t(x10, y3, L[0], L[i13 == true ? 1 : 0]) < org.telegram.messenger.i0.L(22.0f)) {
                                            z12 = i13 == true ? 1 : 0;
                                            z11 = i13;
                                            h8Var.i0 = z12;
                                            if (z12) {
                                                float f13 = fArr[0];
                                                float f14 = fArr[z11];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.g8 g8Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.g8 g8Var7 = (org.telegram.ui.Wallet.g8) it2.next();
                                                    if (g8Var7.H != 2 || Utilities.t(f13, f14, g8Var7.e.a, g8Var7.f.a) >= h8Var.P(g8Var7) * 0.44f) {
                                                        f11 = f14;
                                                        it = it2;
                                                    } else {
                                                        if (g8Var6 != null) {
                                                            f11 = f14;
                                                            it = it2;
                                                            if (g8Var7.I <= g8Var6.I) {
                                                            }
                                                        } else {
                                                            f11 = f14;
                                                            it = it2;
                                                        }
                                                        g8Var6 = g8Var7;
                                                    }
                                                    f14 = f11;
                                                    it2 = it;
                                                }
                                                g8Var2 = g8Var6;
                                            } else {
                                                g8Var2 = h8Var.h0;
                                            }
                                            h8Var.g0 = g8Var2;
                                            if (!h8Var.i0 && g8Var2 != h8Var.h0) {
                                                h8Var.h0 = null;
                                                h8Var.f0();
                                            }
                                            g8Var3 = h8Var.g0;
                                            h8Var.u0 = g8Var3 == null ? z11 : false;
                                            if (g8Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.g8 g8Var8 = (org.telegram.ui.Wallet.g8) it3.next();
                                                        RectF Z = h8Var.Z(g8Var8);
                                                        if (Z != null && Z.contains(x10, y3)) {
                                                            if (org.telegram.ui.Wallet.h8.b(g8Var8)) {
                                                                h8Var.r0 = (Math.abs(x10 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y3 - Z.centerY()) >= Z.height() * 0.35f) ? false : z11;
                                                                h8Var.g0 = g8Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            g8Var4 = h8Var.g0;
                                            if (g8Var4 == null && ((i10 = g8Var4.H) == 0 || i10 == 2)) {
                                                h8Var.x0 = x10;
                                                h8Var.y0 = y3;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.g8 g8Var9 = h8Var.g0;
                                                h8Var.K0 = g8Var9.H;
                                                h8Var.G0 = g8Var9.e.b;
                                                h8Var.H0 = g8Var9.f.b;
                                                h8Var.J0 = g8Var9.i.b;
                                                h8Var.I0 = g8Var9.h.b;
                                                VelocityTracker velocityTracker = h8Var.O0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                h8Var.O0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (h8Var.i0) {
                                                    h8Var.B0 = Float.NaN;
                                                    h8Var.E0 = Float.NaN;
                                                    h8Var.C0 = 0.0f;
                                                    org.telegram.ui.Wallet.g8 g8Var10 = h8Var.g0;
                                                    h8Var.D0 = g8Var10.i.b;
                                                    h8Var.L0 = false;
                                                    long j10 = h8Var.N0 + 1;
                                                    h8Var.N0 = j10;
                                                    g8Var10.I = j10;
                                                    h8Var.M(g8Var10, x10, y3);
                                                } else {
                                                    h8Var.postDelayed(z7Var2, h8Var.u0 ? 450L : 500L);
                                                }
                                                if (h8Var.u0) {
                                                    boolean z14 = z11;
                                                    h8Var.p0 = z14;
                                                    h8Var.getParent().requestDisallowInterceptTouchEvent(z14);
                                                    h8Var.f0();
                                                    z13 = z14;
                                                } else {
                                                    h8Var.q0 = z11;
                                                    h8Var.postDelayed(z7Var, 170L);
                                                }
                                            } else {
                                                h8Var.g0 = null;
                                            }
                                            z13 = false;
                                        } else {
                                            i12 += 2;
                                            i11 = i13 == true ? 1 : 0;
                                            radians = d;
                                        }
                                    }
                                }
                                z11 = i11;
                                z12 = false;
                                h8Var.i0 = z12;
                                if (z12) {
                                }
                                h8Var.g0 = g8Var2;
                                if (!h8Var.i0) {
                                    h8Var.h0 = null;
                                    h8Var.f0();
                                }
                                g8Var3 = h8Var.g0;
                                h8Var.u0 = g8Var3 == null ? z11 : false;
                                if (g8Var3 == null) {
                                }
                                g8Var4 = h8Var.g0;
                                if (g8Var4 == null) {
                                }
                                h8Var.g0 = null;
                                z13 = false;
                            } else {
                                if (h8Var.p0 || h8Var.q0) {
                                    VelocityTracker velocityTracker2 = h8Var.O0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(h8Var.v0);
                                    boolean z15 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == h8Var.v0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (h8Var.q0) {
                                            if (actionMasked != 2 || Utilities.t(x11, y10, h8Var.x0, h8Var.y0) <= ViewConfiguration.get(h8Var.getContext()).getScaledTouchSlop()) {
                                                z10 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                    h8Var.a();
                                                }
                                            } else if (h8Var.r0 && h8Var.g0.H == 0) {
                                                h8Var.q0 = false;
                                                h8Var.p0 = true;
                                                h8Var.removeCallbacks(z7Var);
                                                ((wb0) h8Var.d.b).X();
                                                h8Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                h8Var.W(h8Var.g0, x11, y10);
                                                h8Var.q(h8Var.g0, x11, y10);
                                                h8Var.f0();
                                            } else {
                                                z10 = false;
                                                h8Var.a();
                                            }
                                            z13 = z10;
                                        } else {
                                            if (actionMasked == 2 && (g8Var = h8Var.g0) != null) {
                                                if (h8Var.n0 || h8Var.i0) {
                                                    h8Var.M(g8Var, x11, y10);
                                                } else if (Utilities.t(x11, y10, h8Var.x0, h8Var.y0) > ViewConfiguration.get(h8Var.getContext()).getScaledTouchSlop()) {
                                                    h8Var.removeCallbacks(z7Var2);
                                                    if (!h8Var.m0 && (h8Var.u0 || h8Var.g0.H == 0)) {
                                                        h8Var.W(h8Var.g0, x11, y10);
                                                    }
                                                    if (h8Var.m0) {
                                                        h8Var.q(h8Var.g0, x11, y10);
                                                    }
                                                }
                                                h8Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                VelocityTracker velocityTracker3 = h8Var.O0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f7 = h8Var.O0.getXVelocity(h8Var.v0);
                                                    f10 = h8Var.O0.getYVelocity(h8Var.v0);
                                                } else {
                                                    f7 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                h8Var.w(f7, f10, actionMasked == 3);
                                            }
                                        }
                                    } else if (h8Var.q0) {
                                        h8Var.a();
                                    } else {
                                        h8Var.w(0.0f, 0.0f, true);
                                    }
                                    z13 = true;
                                }
                                z13 = false;
                            }
                        }
                    }
                    if (z13) {
                        return true;
                    }
                }
                org.telegram.ui.Wallet.x5 x5Var2 = b6Var.q0;
                if (x5Var2 != null) {
                    x5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (x5Var = b6Var.q0) != null) {
                    org.telegram.ui.Wallet.l lVar = x5Var.i;
                    org.telegram.ui.Components.ii iiVar = x5Var.c;
                    if (iiVar != null) {
                        iiVar.removeCallbacks(lVar);
                        x5Var.c.post(lVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        switch (this.f0) {
            case 1:
                return this.g0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.k
    public final void k(int i10, View view) {
        switch (this.f0) {
            case 0:
                this.g0.a = 0;
                break;
            default:
                ac.g gVar = this.g0;
                if (i10 == 1) {
                    gVar.b = 0;
                } else {
                    gVar.a = 0;
                }
                org.telegram.ui.Wallet.x5 x5Var = ((org.telegram.ui.Wallet.b6) this.i0).q0;
                if (x5Var != null) {
                    org.telegram.ui.Wallet.l lVar = x5Var.i;
                    org.telegram.ui.Components.ii iiVar = x5Var.c;
                    if (iiVar != null) {
                        iiVar.removeCallbacks(lVar);
                        x5Var.c.post(lVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        qb0 qb0Var;
        org.telegram.ui.Components.u51 x02;
        switch (this.f0) {
            case 0:
                yb0 yb0Var = (yb0) this.i0;
                try {
                    if (view == yb0Var.S && (qb0Var = yb0Var.S0) != null && qb0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.tk0 currentListView = yb0Var.S0.getCurrentListView();
                        int top = yb0Var.S0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                    org.telegram.messenger.i0.g3(new zy(this, 20));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.i0;
                if (!this.h0 && i13 != 0 && (x02 = b6Var.x0()) != null) {
                    if (view != b6Var.a || !Y()) {
                        if (view == x02 && i13 < 0) {
                            iArr[1] = b0(b6Var.a, i13) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = b0(x02, i13) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.k
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f0) {
            case 0:
                break;
            default:
                l(view, i10, i11, i12, i13, i14, new int[2]);
                break;
        }
    }

    @Override // r0.k
    public final boolean n(View view, View view2, int i10, int i11) {
        switch (this.f0) {
            case 0:
                if (((yb0) this.i0).S0 == null || i10 != 2) {
                }
                break;
            default:
                if ((i10 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f0) {
            case 0:
                yb0 yb0Var = (yb0) this.i0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    yb0Var.O0(true);
                    break;
                } else {
                    yb0Var.t0(this.h0);
                    this.h0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.f0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.i0;
                if (b6Var.r != size) {
                    b6Var.r = size;
                    org.telegram.ui.Wallet.o5 o5Var = b6Var.e;
                    if (o5Var != null) {
                        o5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.l5 l5Var = b6Var.f;
                    if (l5Var != null) {
                        l5Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.x5 x5Var;
        switch (this.f0) {
            case 1:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.i0;
                if (view != b6Var.x0() || (x5Var = b6Var.q0) == null) {
                    return false;
                }
                return x5Var.a((int) f7, (int) f10);
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.f0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.k
    public final void q(View view, View view2, int i10, int i11) {
        switch (this.f0) {
            case 0:
                this.g0.a = i10;
                break;
            default:
                ac.g gVar = this.g0;
                if (i11 != 1) {
                    gVar.a = i10;
                    break;
                } else {
                    gVar.b = i10;
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    @Override // r0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        qb0 qb0Var;
        org.telegram.ui.ActionBar.i5 i5Var;
        boolean z10;
        int i13;
        org.telegram.ui.Components.tk0 currentListView;
        org.telegram.ui.ActionBar.i5 i5Var2;
        org.telegram.ui.Components.u51 x02;
        org.telegram.ui.Wallet.x5 x5Var;
        switch (this.f0) {
            case 0:
                yb0 yb0Var = (yb0) this.i0;
                if (view == yb0Var.S && (qb0Var = yb0Var.S0) != null && qb0Var.isAttachedToWindow()) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) yb0Var).simpleActionBar;
                    boolean z11 = false;
                    if (i5Var != null) {
                        i5Var2 = ((org.telegram.ui.ActionBar.k2) yb0Var).simpleActionBar;
                        if (i5Var2.F) {
                            z10 = true;
                            int top = yb0Var.S0.getTop();
                            if (i11 < 0) {
                                if (z10) {
                                    org.telegram.ui.Components.tk0 currentListView2 = yb0Var.S0.getCurrentListView();
                                    iArr[1] = i11;
                                    if (top > 0) {
                                        iArr[1] = 0;
                                    }
                                    if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                                        currentListView2.scrollBy(0, i13);
                                        break;
                                    }
                                }
                            } else {
                                if (top <= 0 && (currentListView = yb0Var.S0.getCurrentListView()) != null) {
                                    int L0 = ((s4.a0) currentListView.getLayoutManager()).L0();
                                    if (L0 != -1) {
                                        s4.c1 K = currentListView.K(L0);
                                        int top2 = K != null ? K.a.getTop() : -1;
                                        int paddingTop = currentListView.getPaddingTop();
                                        if (top2 != paddingTop || L0 != 0) {
                                            iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                            currentListView.scrollBy(0, i11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (z10) {
                                    if (!z11 && top < 0) {
                                        iArr[1] = i11 - Math.max(top, i11);
                                        break;
                                    } else {
                                        iArr[1] = i11;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                    int top3 = yb0Var.S0.getTop();
                    if (i11 < 0) {
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.i0;
                if (!this.h0 && (x02 = b6Var.x0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((view == b6Var.a || view == x02) && (x5Var = b6Var.q0) != null && x5Var.f)) {
                        x5Var.d = true;
                    }
                    if (view != b6Var.a || i11 >= 0 || !Y()) {
                        if (view == x02 && i11 > 0) {
                            iArr[1] = b0(b6Var.a, i11) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = b0(x02, i11) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(yb0 yb0Var, Context context) {
        super(context, null);
        this.i0 = yb0Var;
        this.h0 = true;
        this.g0 = new ac.g();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
