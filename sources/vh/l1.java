package vh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l1 extends h1 {
    public final b1 b;
    public final k1 c;
    public final s4.r d;
    public final j1 e;
    public final p1 f;
    public int h;
    public float n;
    public boolean r;
    public final /* synthetic */ u1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(u1 u1Var, Context context) {
        super(context);
        this.s = u1Var;
        this.h = 8;
        this.n = -1.0f;
        this.r = false;
        b1 b1Var = new b1(context);
        this.b = b1Var;
        k1 k1Var = new k1(this);
        this.c = k1Var;
        b1Var.setAdapter(k1Var);
        s4.r rVar = new s4.r(this.h);
        this.d = rVar;
        b1Var.setLayoutManager(rVar);
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        int i10 = 17;
        rVar.O = new jg.h1(this, i10);
        b1Var.setOnItemClickListener(new ag.y0(this, 20));
        b1Var.setOnScrollListener(new bu0(this, 25));
        s4.j jVar = new s4.j();
        jVar.c = 220L;
        jVar.e = 220L;
        jVar.f = 160L;
        jVar.g = 160L;
        jVar.i = gr.g;
        b1Var.setItemAnimator(jVar);
        addView(b1Var, w7.b6.c(-1.0f, -1));
        int i11 = u1.y1;
        p1 p1Var = new p1(context, u1Var.I0);
        this.f = p1Var;
        p1Var.x = new qh.d(this, i10);
        addView(p1Var, w7.b6.e(-1, -2, 48));
        j1 j1Var = new j1(this, context, u1Var.I0);
        this.e = j1Var;
        addView(j1Var, w7.b6.c(36.0f, -1));
    }

    @Override // vh.h1
    public final void a(int i10) {
        this.a = i10;
        this.b.f3 = i10 == 0;
        int i11 = i10 == 0 ? 8 : 5;
        this.h = i11;
        this.d.y1(i11);
        boolean z10 = this.r;
        k1 k1Var = this.c;
        if (!z10) {
            k1Var.D(null);
        }
        u1 u1Var = this.s;
        int i12 = u1Var.j1;
        p1 p1Var = this.f;
        if (i12 >= 0) {
            p1Var.s = true;
            p1Var.e.setText("");
            p1Var.s = false;
            o1 o1Var = p1Var.h;
            if (o1Var != null) {
                o1Var.H1(u1Var.j1);
                p1Var.h.F1();
                if (p1Var.h.getSelectedCategory() != null) {
                    k1Var.H = p1Var.h.getSelectedCategory().a;
                    d0 d0Var = k1Var.M;
                    org.telegram.messenger.i0.r(d0Var);
                    org.telegram.messenger.i0.g3(d0Var);
                }
            }
        } else if (TextUtils.isEmpty(u1Var.i1)) {
            p1Var.b();
        } else {
            p1Var.e.setText(u1Var.i1);
            o1 o1Var2 = p1Var.h;
            if (o1Var2 != null) {
                o1Var2.I1(null);
                p1Var.h.G1();
            }
            org.telegram.messenger.i0.r(k1Var.M);
            org.telegram.messenger.i0.g3(k1Var.M);
        }
        p1Var.a(i10, u1Var.q1);
        ui.b0(u1Var.a).B(i10 == 0 ? 5 : 0);
    }

    @Override // vh.h1
    public final float b() {
        float f7 = this.n;
        if (f7 >= 0.0f) {
            return f7;
        }
        int i10 = 0;
        while (true) {
            b1 b1Var = this.b;
            if (i10 >= b1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = b1Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i0.a.d(102.0f, r3.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override // vh.h1
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(org.telegram.messenger.i0.L(16.0f) + max);
        this.f.setTranslationY(org.telegram.messenger.i0.L(52.0f) + max);
        b1 b1Var = this.b;
        float height = b1Var.getHeight() - b1Var.getPaddingBottom();
        b1Var.g3 = max + b1Var.getPaddingTop();
        b1Var.h3 = height;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = u1.y1;
        u1 u1Var = this.s;
        int i13 = u1Var.t0;
        setPadding(i13, 0, i13, 0);
        this.e.setTranslationY(org.telegram.messenger.i0.L(16.0f));
        this.f.setTranslationY(org.telegram.messenger.i0.L(52.0f));
        this.b.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(102.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(u1Var.p1 ? 0.0f : 40.0f) + org.telegram.messenger.i0.n);
        super.onMeasure(i10, i11);
    }
}
