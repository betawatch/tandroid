package th;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.ew;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a6 extends z4.g {
    public ArrayList A0;
    public v2 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public final x2 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public final ew M0;
    public final o7 N0;
    public int O0;
    public final ArrayList P0;
    public float Q0;
    public long w0;
    public ArrayList x0;
    public int y0;
    public final y5 z0;

    public a6(int i10, Context context, o7 o7Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.A0 = new ArrayList();
        this.D0 = true;
        q qVar = (q) this;
        this.M0 = new ew(qVar, 28);
        this.O0 = -1;
        this.P0 = new ArrayList();
        this.y0 = i10;
        this.H0 = new x2(context);
        this.N0 = o7Var;
        y5 y5Var = new y5(qVar, context, o7Var, p6Var);
        this.z0 = y5Var;
        setAdapter(y5Var);
        rh.d0 d0Var = new rh.d0(qVar, 16);
        boolean z10 = this.m0 == null;
        this.m0 = d0Var;
        setChildrenDrawingOrderEnabled(true);
        this.o0 = 1;
        this.n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new kg.f1(qVar, o7Var, 1));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != arrayList2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= getChildCount()) {
                z10 = true;
                break;
            }
            z5 z5Var = (z5) getChildAt(i10);
            if (z5Var.d && !z5Var.a.x1.d()) {
                break;
            } else {
                i10++;
            }
        }
        this.N0.x(z10);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    z5 z5Var = (z5) getChildAt(i10);
                    if (!z5Var.d) {
                        this.O0 = -1;
                        z5Var.a(true);
                        if (this.x0 != null) {
                            z2 z2Var = z5Var.a;
                            long j10 = z5Var.b;
                            ArrayList arrayList = z5Var.c;
                            z2Var.k1 = j10;
                            z2Var.i1 = arrayList;
                            z2Var.m0(0);
                        } else {
                            z5Var.a.S0(0, z5Var.b);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i10, long j10, ArrayList arrayList) {
        boolean z10;
        y5 y5Var;
        int size;
        o7 o7Var;
        ArrayList arrayList2;
        int i11 = 0;
        if (this.w0 == j10) {
            ArrayList arrayList3 = this.x0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        if (!C((ArrayList) arrayList3.get(i12), (ArrayList) arrayList.get(i12))) {
                            break;
                        }
                    }
                }
            }
            if (this.y0 == i10) {
                return;
            }
        }
        if (this.w0 == j10 && this.y0 == i10 && (arrayList2 = this.x0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (C((ArrayList) arrayList2.get(i13), (ArrayList) arrayList.get(i13))) {
                }
            }
            z10 = true;
            this.w0 = j10;
            this.x0 = arrayList;
            this.y0 = i10;
            y5Var = this.z0;
            if (!z10 && y5Var != null) {
                y5Var.g();
                this.C0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(y5Var);
            while (true) {
                size = arrayList.size();
                o7Var = this.N0;
                if (i11 < size || ((ArrayList) arrayList.get(i11)).contains(Integer.valueOf(o7Var.P0))) {
                    break;
                } else {
                    i11++;
                }
            }
            if (o7Var.R0) {
                i11 = (arrayList.size() - 1) - i11;
            }
            setCurrentItem(i11);
            this.C0 = true;
        }
        z10 = false;
        this.w0 = j10;
        this.x0 = arrayList;
        this.y0 = i10;
        y5Var = this.z0;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(y5Var);
        while (true) {
            size = arrayList.size();
            o7Var = this.N0;
            if (i11 < size) {
                break;
            } else {
                break;
            }
            i11++;
        }
        if (o7Var.R0) {
        }
        setCurrentItem(i11);
        this.C0 = true;
    }

    public final boolean E(boolean z10) {
        o7 o7Var = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (o7Var.a && Build.VERSION.SDK_INT < 33) {
                    z11 = true;
                }
                x(currentItem2, !z11);
                return true;
            }
        }
        if (z10 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (o7Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            z2 z2Var = (z2) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            z2Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !z2Var.D3);
        }
    }

    public long getCurrentDialogId() {
        if (this.x0 != null) {
            return this.w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public z2 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (z2) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.A0;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return false;
    }

    @Override // z4.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.C0) {
            this.C0 = false;
            z2 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                v2 v2Var = this.B0;
                f7 f7Var = (f7) v2Var;
                f7Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.L0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(v2 v2Var) {
        this.B0 = v2Var;
    }

    public void setHorizontalProgressToDismiss(float f7) {
        if (Math.abs(f7) > 1.0f || this.Q0 == f7) {
            return;
        }
        this.Q0 = f7;
        setCameraDistance(getWidth() * 15);
        setPivotX(f7 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f7 * 90.0f);
    }

    public void setKeyboardHeight(int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            z2 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((z2) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}
