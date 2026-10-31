package yh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Components.u51;
import org.telegram.ui.y01;
import w7.b6;
import w7.n7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v extends y {
    public final /* synthetic */ int h;
    public final /* synthetic */ a0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, Context context, int i10) {
        super(a0Var, context);
        this.h = i10;
        int i11 = 5;
        final int i12 = 0;
        int i13 = 3;
        switch (i10) {
            case 1:
                this.n = a0Var;
                super(a0Var, context);
                u51 u51Var = new u51(context, a0Var.a, 0, false, new r(a0Var, i11), new s(a0Var, i11), null, a0Var.I0);
                this.d = u51Var;
                u51Var.r1();
                u51 u51Var2 = this.d;
                u51Var2.f3.r = false;
                u51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.n);
                this.d.j(new p(this, i13));
                this.c.addView(this.d, 0, b6.c(-1.0f, -1));
                org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, a0Var.I0);
                this.a = lVar;
                lVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.l lVar2 = this.a;
                int i14 = t6.G6;
                a7.m(lVar2, 5, i14, a0Var.I0);
                a7.m(this.a, 3, t6.z8, a0Var.I0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                a7.m(this.a, 1, t6.y8, a0Var.I0);
                this.a.setTitle(cd.L0(2131751886, null));
                this.a.getTitleTextView().setTranslationX(-i0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new y01(this, 25));
                this.c.addView(this.a, b6.e(-1, 56, 48));
                LinearLayout f7 = m5.f(context, 0);
                f7.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f));
                vh.d dVar = new vh.d(context, a0Var.I0, true);
                dVar.e();
                int i15 = t6.d6;
                dVar.setColor(i0.b.f(0.125f, t6.w0(i15, a0Var.I0), t6.w0(i14, a0Var.I0)));
                dVar.setText(cd.L0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    p6 p6Var = a0Var.I0;
                    dVar.setBackground(background);
                    v6 p5 = a7.p(dVar, true);
                    p5.d = background;
                    p5.e = null;
                    p5.f = null;
                    if (background != null) {
                        u6 u6Var = new u6();
                        p5.e = u6Var;
                        u6Var.c(i15, i14, 3, 0.125f, p6Var);
                        u6Var.g = a7.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) { // from class: yh.z
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                this.b.n.D1.f(false, true);
                                break;
                            default:
                                this.b.n.D1.f(true, true);
                                break;
                        }
                    }
                });
                f7.addView(dVar, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final int i16 = 1;
                vh.d dVar2 = new vh.d(context, a0Var.I0, true);
                dVar2.setText(cd.L0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: yh.z
                    public final /* synthetic */ v b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                this.b.n.D1.f(false, true);
                                break;
                            default:
                                this.b.n.D1.f(true, true);
                                break;
                        }
                    }
                });
                f7.addView(dVar2, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(f7, b6.f(-2.0f, -1, 80, 0, 0, 0, i0.n));
                a();
                break;
            default:
                this.n = a0Var;
                i0.E2(this.b);
                u51 u51Var3 = new u51(context, a0Var.a, 0, false, new r(a0Var, i13), new s(a0Var, 2), null, a0Var.I0);
                this.d = u51Var3;
                u51Var3.r1();
                u51 u51Var4 = this.d;
                u51Var4.f3.r = false;
                u51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.n);
                this.c.addView(a0Var.x1, b6.g());
                this.c.addView(this.d, 0, b6.c(-1.0f, -1));
                this.c.addView(a0Var.z1, b6.g());
                org.telegram.ui.ActionBar.l lVar3 = new org.telegram.ui.ActionBar.l(context, a0Var.I0);
                this.a = lVar3;
                lVar3.setOccupyStatusBar(false);
                a7.m(this.a, 5, t6.G6, a0Var.I0);
                a7.m(this.a, 3, t6.z8, a0Var.I0);
                org.telegram.ui.ActionBar.l lVar4 = this.a;
                boolean z10 = a0Var.E1;
                lVar4.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                a7.m(this.a, 1, t6.y8, a0Var.I0);
                this.a.setTitle(cd.L0(2131751988, null));
                this.a.getTitleTextView().setTranslationX(-i0.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new y01(this, 23));
                this.c.addView(this.a, b6.e(-1, 56, 48));
                this.c.addView(a0Var.v1, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y p9 = this.a.p();
                p9.setGlassMode(true);
                p9.setTranslationX(-i0.L(7.0f));
                p9.a(3, R.drawable.outline_header_search);
                vh.d dVar3 = new vh.d(getContext(), a0Var.I0, true);
                a0Var.p1 = dVar3;
                dVar3.f();
                a0Var.p1.setText(cd.L0(2131747847, null));
                a0Var.p1.setOnClickListener(new rh.s(this, 28));
                if (z10) {
                    a0Var.p1.setVisibility(8);
                }
                this.c.addView(a0Var.p1, b6.f(48.0f, -1, 80, i0.L(12.0f), 0, i0.L(12.0f), i0.L(12.0f) + i0.n));
                a();
                break;
        }
    }

    @Override // yh.y
    public float b() {
        switch (this.h) {
            case 0:
                return n7.a(this.n.j1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // yh.y
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.v1.setTranslationY(Math.max(i0.L(8.0f) + i0.m, b() + i0.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
