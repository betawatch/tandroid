// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v32 extends f12 {
    public final o24 n;
    public final d79 r;
    public final x46 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public v32(n12 n12Var, Context context, vnb vnbVar, boolean z) {
        super(n12Var, vnbVar, context);
        this.x = z;
        this.f = true;
        e eVar = n12Var.Z1;
        boolean z2 = !z;
        o24 o24Var = new o24(eVar, z2, z, false, getContext(), true, null, null, false, vnbVar, false, true);
        this.n = o24Var;
        o24Var.x0 = false;
        o24Var.H(z2, z, false, false);
        o24Var.o2 = true;
        e04 e04Var = o24Var.y;
        if (e04Var != null) {
            e04Var.setVisibility(8);
        }
        o24Var.p2 = true;
        ImageView imageView = o24Var.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        o24Var.S2 = true;
        addView(o24Var, tre.c(-1.0f, -1));
        HorizontalScrollView x = o24Var.x(z2 ? 1 : 0);
        this.w = x;
        d79 w = o24Var.w(z2 ? 1 : 0);
        this.r = w;
        w.j(new y(this, (byte) 20));
        this.s = (x46) w.getLayoutManager();
        x.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int L;
        int L2;
        d79 d79Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        if (!hl.O1()) {
            Point point = hl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                L = i3 - hl.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                L2 = hl.L(36.0f) + L;
                d79Var = this.r;
                if (d79Var.getPaddingTop() == L2) {
                    d79Var.setPadding(hl.L(6.0f), L2, hl.L(6.0f), hl.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        L = i3 - hl.L(52.0f);
        if (L < 0) {
        }
        L2 = hl.L(36.0f) + L;
        d79Var = this.r;
        if (d79Var.getPaddingTop() == L2) {
        }
    }

    @Override // f12
    public final void H(f12 f12Var) {
        n12 n12Var = this.b;
        try {
            n12Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        n12Var.U2.setTitle(ob6.M0(this.x ? 2131745380 : 2131745386, null));
        this.s.g1(0, 0);
    }

    @Override // f12
    public final void J() {
        this.r.A0(0);
    }

    @Override // f12
    public int getCurrentItemTop() {
        d79 d79Var = this.r;
        if (d79Var.getChildCount() <= 0) {
            d79Var.setTopGlowOffset(d79Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = d79Var.getChildAt(0);
        n69 n69Var = (n69) d79Var.H(childAt);
        int top = childAt.getTop() - hl.L(36.0f);
        int L = hl.L(7.0f);
        if (top < hl.L(7.0f) || n69Var == null || n69Var.b() != 0) {
            top = L;
        }
        d79Var.setTopGlowOffset(top);
        return top;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // f12
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(p14 p14Var) {
        this.n.setDelegate(p14Var);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
