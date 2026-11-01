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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ja;
import org.telegram.ui.l10;
import org.telegram.ui.oa1;
import org.telegram.ui.s71;
import org.telegram.ui.xv0;
import rh.d0;
import rh.s;
import s4.x;
import sg.v;
import sg.y;
import th.q4;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final ew0 D;
    public final j6 E;
    public final vh.d F;
    public final x G;
    public boolean H;
    public boolean I;
    public final l10 J;
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
    public final /* synthetic */ vq0 W;
    public q4 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final c f;
    public final t51 h;
    public final s4.j n;
    public final ss0 r;
    public final oi s;
    public final e w;
    public final h x;
    public final f y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vq0 vq0Var, Context context) {
        super(context);
        this.W = vq0Var;
        this.d = Utilities.j(uz.u1, 6, 2);
        this.e = Utilities.j(uz.u1, 6, 2);
        int i10 = 0;
        this.H = false;
        this.I = false;
        this.V = new Rect();
        t51 t51Var = new t51();
        this.h = t51Var;
        int i11 = 1;
        t51Var.O = new b(this, i11);
        t51Var.y1(this.d);
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
        cVar.setLayoutManager(t51Var);
        addView(cVar, b6.c(-1.0f, -1));
        cVar.i(new d(this, i10));
        cVar.setOnItemClickListener(new y0(this, 17));
        cVar.setOnItemLongClickListener(new d0(this, 22));
        ss0 ss0Var = new ss0(context, null);
        this.r = ss0Var;
        oi oiVar = new oi(3, this);
        this.s = oiVar;
        ss0Var.setLayoutManager(oiVar);
        ss0Var.i(new d(this, i11));
        oiVar.y1(this.e);
        ss0Var.setVisibility(8);
        addView(ss0Var, b6.c(-1.0f, -1));
        e eVar = new e(this, context);
        this.w = eVar;
        cVar.setAdapter(eVar);
        h hVar = new h(this, getContext());
        eVar.f = hVar;
        this.x = hVar;
        ss0Var.setAdapter(hVar);
        f fVar = new f(this, context);
        this.y = fVar;
        fVar.x = false;
        ew0 ew0Var = new ew0(context, fVar, 1, null);
        this.D = ew0Var;
        ew0Var.setVisibility(8);
        ew0Var.setAnimateLayoutChange(true);
        addView(ew0Var, b6.c(-1.0f, -1));
        ew0Var.setOnTouchListener(new oa1(1));
        ew0Var.e(true, false);
        ew0Var.b.setVisibility(8);
        ew0Var.d.setText(dd.L0(2131746713, null));
        ew0Var.e.setText(dd.G(wp.r1(vq0Var.b).U5, "ProfileBotPreviewEmptyText", new Object[0]));
        String L0 = dd.L0(2131746717, null);
        vh.d dVar = ew0Var.f;
        dVar.i(L0, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new a(this, i10));
        j6 j6Var = new j6(this, context);
        this.E = j6Var;
        int i12 = t6.y6;
        p6 p6Var = vq0Var.c;
        a7.V(j6Var, i12, p6Var);
        j6Var.setText(dd.L0(2131746718, null));
        j6Var.setTextSize(1, 14.0f);
        j6Var.setTextAlignment(4);
        j6Var.setGravity(17);
        j6Var.setTypeface(i0.o());
        LinearLayout.LayoutParams t10 = b6.t(at.v2, -2, 17, 0, 17, 0, 12);
        s71 s71Var = ew0Var.a;
        s71Var.addView(j6Var, t10);
        vh.d dVar2 = new vh.d(context, p6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(i0.L(200.0f));
        s71Var.addView(dVar2, b6.r(-2, 44, 17));
        ew0Var.addView(fVar, 0, b6.c(-1.0f, -1));
        cVar.setEmptyView(ew0Var);
        cVar.W1 = true;
        cVar.X1 = 0;
        new SparseArray();
        new HashMap();
        x xVar = new x(new ja(this, 9));
        this.G = xVar;
        xVar.h(cVar);
        l10 l10Var = new l10(context, p6Var);
        this.J = l10Var;
        addView(l10Var, b6.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f7 = this.c;
            ss0 ss0Var = this.r;
            c cVar = this.f;
            if (f7 != 1.0f) {
                if (f7 == 0.0f) {
                    this.b = false;
                    ss0Var.setVisibility(8);
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
            uz.F(i10);
            e eVar = this.w;
            int b10 = eVar.b();
            ss0Var.setVisibility(8);
            int i11 = this.d;
            t51 t51Var = this.h;
            t51Var.y1(i11);
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
                t51Var.h1(this.S, (-cVar.getPaddingTop()) + this.T);
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
        ss0 ss0Var = this.r;
        ss0Var.setVisibility(0);
        ss0Var.setAdapter(this.x);
        ss0Var.setPadding(ss0Var.getPaddingLeft(), 0, ss0Var.getPaddingRight(), this.J.getMeasuredHeight() + i0.L(42.0f));
        oi oiVar = this.s;
        oiVar.y1(j10);
        ss0Var.a0();
        oiVar.O = new b(this, 0);
        i0.a4(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.S;
        if (i11 >= 0) {
            oiVar.h1(i11, this.T - ss0Var.getPaddingTop());
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
        l10 l10Var = this.J;
        l10Var.setVisibility(i12);
        String L02 = z10 ? dd.L0(2131746710, null) : dd.a0(null, null, 2131746709, n31.O0(this.a.E, null, null));
        String L03 = dd.L0(2131746730, null);
        v vVar = new v(this, 26);
        if (z10 || size <= 0) {
            L0 = dd.L0(z10 ? 2131746712 : 2131746711, null);
        } else {
            L0 = null;
        }
        xv0 xv0Var = (z10 || size <= 0) ? new xv0(9, this, z10) : null;
        j6 j6Var = (j6) l10Var.d;
        vh.d dVar = (vh.d) l10Var.e;
        ((TextView) l10Var.b).setText(L02);
        ph.i iVar = (ph.i) l10Var.c;
        iVar.i(L03, false, true);
        iVar.setOnClickListener(new s(vVar, 16));
        if (L0 == null) {
            j6Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            j6Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(L0, false, true);
            dVar.setOnClickListener(new u(3, xv0Var));
        }
        j6 j6Var2 = this.E;
        vh.d dVar2 = this.F;
        ew0 ew0Var = this.D;
        if (z10) {
            ew0Var.d.setVisibility(0);
            ew0Var.d.setText(dd.L0(2131746713, null));
            ew0Var.e.setText(dd.G(wp.r1(i10).U5, "ProfileBotPreviewEmptyText", new Object[0]));
            ew0Var.f.i(dd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            ew0Var.d.setVisibility(8);
            ew0Var.e.setText(dd.a0(null, null, 2131746709, n31.O0(this.a.E, null, null)));
            ew0Var.f.i(dd.L0(2131746717, null), false, true);
            j6Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(dd.L0(2131746711, null), false, true);
            dVar2.setOnClickListener(new a(this, i11));
        }
        ew0Var.f.setVisibility(this.w.b() >= wp.r1(i10).U5 ? 8 : 0);
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
