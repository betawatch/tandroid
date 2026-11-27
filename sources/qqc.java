// default package

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qqc extends t79 {
    public wa a;
    public wa c;
    public boolean d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public final /* synthetic */ uqc j;
    public final n52 b = new n52(this);
    public final olc i = new olc(this, (byte) 7);

    public qqc(uqc uqcVar) {
        this.j = uqcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    @Override // t79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, int i2) {
        int minFlingVelocity;
        int i3;
        boolean z = this.f;
        if (z) {
            if (z) {
                this.d = true;
            }
            q79 layoutManager = this.a.getLayoutManager();
            if (layoutManager != null && this.a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = this.a.getMinFlingVelocity()) || Math.abs(i) > minFlingVelocity) && (layoutManager instanceof x46))) {
                tna tnaVar = new tna(this, this.a.getContext());
                if (this.c != null && this.f && Math.abs(i2) >= hl.L(600.0f)) {
                    uqc uqcVar = this.j;
                    if (uqcVar.s0()) {
                        int i4 = i2 > 0 ? 1 : -1;
                        q9c q0 = uqcVar.q0();
                        if (this.c.canScrollVertically(i4) && (i4 >= 0 || q0 == null || !q0.canScrollVertically(-1))) {
                            i3 = i4 > 0 ? layoutManager.A() - 1 : 0;
                            if (i3 != -1) {
                                tnaVar.a = i3;
                                layoutManager.v0(tnaVar);
                                return true;
                            }
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
            }
        }
        return false;
    }

    public final void b(wa waVar) {
        wa waVar2 = this.c;
        if (waVar2 != null) {
            waVar2.removeCallbacks(this.i);
        }
        this.c = waVar;
        wa waVar3 = this.a;
        if (waVar3 != waVar) {
            n52 n52Var = this.b;
            if (waVar3 != null) {
                ArrayList arrayList = waVar3.x0;
                if (arrayList != null) {
                    arrayList.remove(n52Var);
                }
                this.a.setOnFlingListener(null);
            }
            this.a = waVar;
            if (waVar != null) {
                if (waVar.getOnFlingListener() != null) {
                    grb.i("An instance of OnFlingListener already set.");
                    return;
                }
                this.a.j(n52Var);
                this.a.setOnFlingListener(this);
                new Scroller(this.a.getContext(), new DecelerateInterpolator());
                f();
            }
        }
    }

    public final void c() {
        this.e = false;
        this.f = false;
        this.d = false;
        wa waVar = this.c;
        if (waVar != null) {
            waVar.removeCallbacks(this.i);
        }
    }

    public final View d(q79 q79Var) {
        wa waVar;
        if (this.e || (waVar = this.c) == null || waVar.getScrollState() != 0) {
            return null;
        }
        uqc uqcVar = this.j;
        q9c q0 = uqcVar.q0();
        if ((q0 != null && q0.getScrollState() != 0) || !this.d) {
            return null;
        }
        this.d = false;
        if (!uqcVar.s0()) {
            return null;
        }
        View m = q79Var.m(0);
        View m2 = q79Var.m(q79Var.A() - 1);
        return m == null ? m2 : (m2 == null || Math.abs(new int[]{0, q79.y(m) - q79Var.E()}[1]) < Math.abs(new int[]{0, q79.y(m2) - q79Var.E()}[1])) ? m : m2;
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c();
            this.e = true;
            this.g = motionEvent.getX();
            this.h = motionEvent.getY();
            return;
        }
        if (actionMasked == 3) {
            c();
            return;
        }
        if (actionMasked == 2 || actionMasked == 1) {
            float abs = Math.abs(motionEvent.getX() - this.g);
            float abs2 = Math.abs(motionEvent.getY() - this.h);
            boolean z = abs2 > ((float) ViewConfiguration.get(this.c.getContext()).getScaledTouchSlop()) && abs2 > abs * 1.5f;
            this.f = z;
            if (!z) {
                this.d = false;
            }
            if (actionMasked == 1) {
                this.e = false;
            }
        }
    }

    public final void f() {
        q79 layoutManager;
        View d;
        wa waVar = this.a;
        if (waVar == null || (layoutManager = waVar.getLayoutManager()) == null || (d = d(layoutManager)) == null) {
            return;
        }
        int[] iArr = {0, q79.y(d) - layoutManager.E()};
        int i = iArr[0];
        if (i == 0 && iArr[1] == 0) {
            return;
        }
        this.a.y0(i, iArr[1], null);
    }
}
