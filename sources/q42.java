// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q42 extends a22 {
    public final e34 n;
    public final r59 r;
    public final u46 s;
    public final HorizontalScrollView w;
    public final boolean x;

    public q42(i22 i22Var, Context context, ylb ylbVar, boolean z) {
        super(i22Var, ylbVar, context);
        this.x = z;
        this.f = true;
        d dVar = i22Var.Z1;
        boolean z2 = !z;
        e34 e34Var = new e34(dVar, z2, z, false, getContext(), true, null, null, false, ylbVar, false, true);
        this.n = e34Var;
        e34Var.x0 = false;
        e34Var.H(z2, z, false, false);
        e34Var.o2 = true;
        t04 t04Var = e34Var.y;
        if (t04Var != null) {
            t04Var.setVisibility(8);
        }
        e34Var.p2 = true;
        ImageView imageView = e34Var.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        e34Var.S2 = true;
        addView(e34Var, qoe.c(-1.0f, -1));
        HorizontalScrollView w = e34Var.w(z2 ? 1 : 0);
        this.w = w;
        r59 v = e34Var.v(z2 ? 1 : 0);
        this.r = v;
        v.j(new y(this, (byte) 21));
        this.s = (u46) v.getLayoutManager();
        w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int i3;
        int L;
        int L2;
        r59 r59Var;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        if (!gm.O1()) {
            Point point = gm.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                L = i3 - gm.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                L2 = gm.L(36.0f) + L;
                r59Var = this.r;
                if (r59Var.getPaddingTop() == L2) {
                    r59Var.setPadding(gm.L(6.0f), L2, gm.L(6.0f), gm.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        L = i3 - gm.L(52.0f);
        if (L < 0) {
        }
        L2 = gm.L(36.0f) + L;
        r59Var = this.r;
        if (r59Var.getPaddingTop() == L2) {
        }
    }

    @Override // a22
    public final void H(a22 a22Var) {
        i22 i22Var = this.b;
        try {
            i22Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        i22Var.U2.setTitle(jb6.M0(this.x ? 2131745386 : 2131745392, null));
        this.s.g1(0, 0);
    }

    @Override // a22
    public final void J() {
        this.r.z0(0);
    }

    @Override // a22
    public int getCurrentItemTop() {
        r59 r59Var = this.r;
        if (r59Var.getChildCount() <= 0) {
            r59Var.setTopGlowOffset(r59Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = r59Var.getChildAt(0);
        b59 b59Var = (b59) r59Var.G(childAt);
        int top = childAt.getTop() - gm.L(36.0f);
        int L = gm.L(7.0f);
        if (top < gm.L(7.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        r59Var.setTopGlowOffset(top);
        return top;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // a22
    public final int j() {
        return 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(f24 f24Var) {
        this.n.setDelegate(f24Var);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
