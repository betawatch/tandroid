package uh;

import ag.y0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.o;
import bi.j6;
import java.util.HashMap;
import og.u;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.ja;
import org.telegram.ui.m10;
import org.telegram.ui.qa1;
import org.telegram.ui.u71;
import org.telegram.ui.yv0;
import rh.d0;
import rh.s;
import s4.x;
import sg.v;
import sg.y;
import th.q4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final dw0 D;
    public final j6 E;
    public final vh.d F;
    public final x G;
    public boolean H;
    public boolean I;
    public final m10 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final /* synthetic */ uq0 W;
    public q4 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final c f;
    public final s51 h;
    public final s4.j n;
    public final rs0 r;
    public final oi s;
    public final e w;
    public final h x;
    public final f y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(uq0 uq0Var, Context context) {
        super(context);
        this.W = uq0Var;
        this.d = Utilities.j(tz.u1, 6, 2);
        this.e = Utilities.j(tz.u1, 6, 2);
        int i10 = 0;
        this.H = false;
        this.I = false;
        this.V = new Rect();
        s51 s51Var = new s51();
        this.h = s51Var;
        int i11 = 1;
        s51Var.O = new b(this, i11);
        s51Var.y1(this.d);
        s4.j jVar = new s4.j();
        this.n = jVar;
        jVar.n(280L);
        jVar.o(gr.h);
        jVar.m = false;
        c cVar = new c(this, context);
        this.f = cVar;
        cVar.setScrollingTouchSlop(1);
        cVar.setPinnedSectionOffsetY(-i0.L(2.0f));
        cVar.setPadding(0, 0, 0, 0);
        cVar.setItemAnimator(null);
        cVar.setClipToPadding(false);
        cVar.setSectionsType(2);
        cVar.setLayoutManager(s51Var);
        addView(cVar, b6.c(-1.0f, -1));
        cVar.i(new d(this, i10));
        cVar.setOnItemClickListener(new y0(this, 17));
        cVar.setOnItemLongClickListener(new d0(this, 22));
        rs0 rs0Var = new rs0(context, null);
        this.r = rs0Var;
        oi oiVar = new oi(3, this);
        this.s = oiVar;
        rs0Var.setLayoutManager(oiVar);
        rs0Var.i(new d(this, i11));
        oiVar.y1(this.e);
        rs0Var.setVisibility(8);
        addView(rs0Var, b6.c(-1.0f, -1));
        e eVar = new e(this, context);
        this.w = eVar;
        cVar.setAdapter(eVar);
        h hVar = new h(this, getContext());
        eVar.f = hVar;
        this.x = hVar;
        rs0Var.setAdapter(hVar);
        f fVar = new f(this, context);
        this.y = fVar;
        fVar.x = false;
        dw0 dw0Var = new dw0(context, fVar, 1, null);
        this.D = dw0Var;
        dw0Var.setVisibility(8);
        dw0Var.setAnimateLayoutChange(true);
        addView(dw0Var, b6.c(-1.0f, -1));
        dw0Var.setOnTouchListener(new qa1(1));
        dw0Var.e(true, false);
        dw0Var.b.setVisibility(8);
        dw0Var.d.setText(cd.L0(2131746713, null));
        dw0Var.e.setText(cd.G(vp.r1(uq0Var.b).U5, "ProfileBotPreviewEmptyText", new Object[0]));
        String L0 = cd.L0(2131746717, null);
        vh.d dVar = dw0Var.f;
        dVar.i(L0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new a(this, i10));
        j6 j6Var = new j6(this, context);
        this.E = j6Var;
        int i12 = t6.y6;
        p6 p6Var = uq0Var.c;
        a7.V(j6Var, i12, p6Var);
        j6Var.setText(cd.L0(2131746718, null));
        j6Var.setTextSize(1, 14.0f);
        j6Var.setTextAlignment(4);
        j6Var.setGravity(17);
        j6Var.setTypeface(i0.o());
        LinearLayout.LayoutParams t10 = b6.t(zs.v2, -2, 17, 0, 17, 0, 12);
        u71 u71Var = dw0Var.a;
        u71Var.addView(j6Var, t10);
        vh.d dVar2 = new vh.d(context, p6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(i0.L(200.0f));
        u71Var.addView(dVar2, b6.r(-2, 44, 17));
        dw0Var.addView(fVar, 0, b6.c(-1.0f, -1));
        cVar.setEmptyView(dw0Var);
        cVar.W1 = true;
        cVar.X1 = 0;
        new SparseArray();
        new HashMap();
        x xVar = new x(new ja(this, 9));
        this.G = xVar;
        xVar.h(cVar);
        m10 m10Var = new m10(context, p6Var);
        this.J = m10Var;
        addView(m10Var, b6.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            rs0 rs0Var = this.r;
            c cVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    rs0Var.setVisibility(8);
                    cVar.invalidate();
                    return;
                }
                boolean z10 = f7 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new o(this, 12));
                ofFloat.addListener(new y(6, this, z10));
                ofFloat.setInterpolator(gr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.W.D = i10;
            tz.F(i10);
            e eVar = this.w;
            int b10 = eVar.b();
            rs0Var.setVisibility(8);
            int i11 = this.d;
            s51 s51Var = this.h;
            s51Var.y1(i11);
            cVar.a0();
            cVar.invalidate();
            if (eVar.b() == b10) {
                i0.a4(cVar);
            } else {
                eVar.f();
            }
            int i12 = this.S;
            if (i12 >= 0) {
                View m10 = this.s.m(i12);
                if (m10 != null) {
                    this.T = m10.getTop();
                }
                s51Var.h1(this.S, (-cVar.getPaddingTop()) + this.T);
            }
        }
    }

    public final void b(boolean z10) {
        if (this.b || this.W.G.E1) {
            return;
        }
        int i10 = this.d + (!z10 ? 1 : -1);
        if (i10 > 6) {
            i10 = !z10 ? 9 : 6;
        }
        int j10 = Utilities.j(i10, 6, this.H ? 1 : 2);
        this.e = j10;
        if (j10 == this.d || this.H) {
            return;
        }
        rs0 rs0Var = this.r;
        rs0Var.setVisibility(0);
        rs0Var.setAdapter(this.x);
        rs0Var.setPadding(rs0Var.getPaddingLeft(), 0, rs0Var.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
        oi oiVar = this.s;
        oiVar.y1(j10);
        rs0Var.a0();
        oiVar.O = new b(this, 0);
        i0.a4(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            oiVar.h1(i11, this.T - rs0Var.getPaddingTop());
        }
    }

    public final void c() {
        String L0;
        int i10 = this.W.b;
        q4 q4Var = this.a;
        int size = q4Var == null ? 0 : q4Var.i.size();
        q4 q4Var2 = this.a;
        int i11 = 1;
        boolean z10 = q4Var2 == null || TextUtils.isEmpty(q4Var2.E);
        int i12 = size > 0 ? 0 : 8;
        m10 m10Var = this.J;
        m10Var.setVisibility(i12);
        String L02 = z10 ? cd.L0(2131746710, null) : cd.a0(null, null, 2131746709, m31.O0(this.a.E, null, null));
        String L03 = cd.L0(2131746730, null);
        v vVar = new v(this, 26);
        if (z10 || size <= 0) {
            L0 = cd.L0(z10 ? 2131746712 : 2131746711, null);
        } else {
            L0 = null;
        }
        yv0 yv0Var = (z10 || size <= 0) ? new yv0(9, this, z10) : null;
        j6 j6Var = (j6) m10Var.d;
        vh.d dVar = (vh.d) m10Var.e;
        ((TextView) m10Var.b).setText(L02);
        ph.i iVar = (ph.i) m10Var.c;
        iVar.i(L03, false, true);
        iVar.setOnClickListener(new s(vVar, 16));
        if (L0 == null) {
            j6Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            j6Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(L0, false, true);
            dVar.setOnClickListener(new u(3, yv0Var));
        }
        j6 j6Var2 = this.E;
        vh.d dVar2 = this.F;
        dw0 dw0Var = this.D;
        if (z10) {
            dw0Var.d.setVisibility(0);
            dw0Var.d.setText(cd.L0(2131746713, null));
            dw0Var.e.setText(cd.G(vp.r1(i10).U5, "ProfileBotPreviewEmptyText", new Object[0]));
            dw0Var.f.i(cd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            dw0Var.d.setVisibility(8);
            dw0Var.e.setText(cd.a0(null, null, 2131746709, m31.O0(this.a.E, null, null)));
            dw0Var.f.i(cd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(cd.L0(2131746711, null), false, true);
            dVar2.setOnClickListener(new a(this, i11));
        }
        dw0Var.f.setVisibility(this.w.b() >= vp.r1(i10).U5 ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c cVar = this.f;
        cVar.setPadding(cVar.getPaddingLeft(), cVar.e3, cVar.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
    }

    public void setList(q4 q4Var) {
        if (this.a != q4Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.D;
        }
        this.a = q4Var;
        e eVar = this.w;
        eVar.e = q4Var;
        if (eVar != eVar.s.x) {
            eVar.M();
        }
        eVar.f();
        h hVar = this.x;
        hVar.e = q4Var;
        if (hVar != hVar.s.x) {
            hVar.M();
        }
        hVar.f();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, i0.L(280.0f)))) / 2.0f;
        this.D.setTranslationY(f7);
        this.y.setTranslationY(-f7);
    }
}
