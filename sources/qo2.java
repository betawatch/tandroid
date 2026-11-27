// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class qo2 extends vo2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ xo2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo2(xo2 xo2Var, Context context, byte b) {
        super(xo2Var, context);
        this.h = b;
        byte b2 = 3;
        byte b3 = 5;
        final byte b4 = 0;
        final byte b5 = 1;
        switch (b) {
            case 1:
                this.n = xo2Var;
                super(xo2Var, context);
                q9c q9cVar = new q9c(context, xo2Var.a, 0, false, new lo2(xo2Var, b3), new mo2(xo2Var, b3), null, xo2Var.J0);
                this.d = q9cVar;
                q9cVar.s1();
                q9c q9cVar2 = this.d;
                q9cVar2.g3.r = false;
                q9cVar2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, hl.L(60.0f) + hl.n);
                this.d.j(new to2(this, b5));
                this.c.addView(this.d, 0, tre.c(-1.0f, -1));
                a aVar = new a(context, xo2Var.J0);
                this.a = aVar;
                aVar.setOccupyStatusBar(false);
                a aVar2 = this.a;
                int i = aob.G6;
                yob.l(aVar2, 5, i, xo2Var.J0);
                yob.l(this.a, 3, aob.z8, xo2Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                yob.l(this.a, 1, aob.y8, xo2Var.J0);
                this.a.setTitle(ob6.M0(2131751851, null));
                this.a.getTitleTextView().setTranslationX(-hl.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new kg2(this, (byte) 6));
                this.c.addView(this.a, tre.e(-1, 56, 48));
                LinearLayout j = uh9.j(context, 0);
                j.setPadding(hl.L(7.0f), 0, hl.L(7.0f), hl.L(12.0f));
                c51 c51Var = new c51(xo2Var.J0, context, true);
                c51Var.e();
                int i2 = aob.d6;
                c51Var.setColor(vm2.f(0.125f, aob.v0(i2, xo2Var.J0), aob.v0(i, xo2Var.J0)));
                c51Var.setText(ob6.M0(2131751865, null));
                c51Var.f();
                if (c51Var.getBackground() != null) {
                    Drawable background = c51Var.getBackground();
                    vnb vnbVar = xo2Var.J0;
                    c51Var.setBackground(background);
                    tob o = yob.o(c51Var, true);
                    o.d = background;
                    o.e = null;
                    o.f = null;
                    if (background != null) {
                        sob sobVar = new sob();
                        o.e = sobVar;
                        sobVar.c(i2, i, 3, 0.125f, vnbVar);
                        sobVar.g = yob.t(background);
                    }
                }
                c51Var.setOnClickListener(new View.OnClickListener(this) { // from class: wo2
                    public final /* synthetic */ qo2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b6 = b4;
                        qo2 qo2Var = this.b;
                        switch (b6) {
                            case 0:
                                qo2Var.n.G1.f(false, true);
                                break;
                            default:
                                qo2Var.n.G1.f(true, true);
                                break;
                        }
                    }
                });
                j.addView(c51Var, tre.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                c51 c51Var2 = new c51(xo2Var.J0, context, true);
                c51Var2.setText(ob6.M0(2131751867, null));
                c51Var2.f();
                c51Var2.setOnClickListener(new View.OnClickListener(this) { // from class: wo2
                    public final /* synthetic */ qo2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b6 = b5;
                        qo2 qo2Var = this.b;
                        switch (b6) {
                            case 0:
                                qo2Var.n.G1.f(false, true);
                                break;
                            default:
                                qo2Var.n.G1.f(true, true);
                                break;
                        }
                    }
                });
                j.addView(c51Var2, tre.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(j, tre.f(-2.0f, -1, 80, 0, 0, 0, hl.n));
                a();
                break;
            default:
                this.n = xo2Var;
                hl.B2(this.b);
                q9c q9cVar3 = new q9c(context, xo2Var.a, 0, false, new lo2(xo2Var, b2), new mo2(xo2Var, (byte) 2), null, xo2Var.J0);
                this.d = q9cVar3;
                q9cVar3.s1();
                q9c q9cVar4 = this.d;
                q9cVar4.g3.r = false;
                q9cVar4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, hl.L(60.0f) + hl.n);
                this.c.addView(xo2Var.A1, tre.g());
                this.c.addView(this.d, 0, tre.c(-1.0f, -1));
                this.c.addView(xo2Var.C1, tre.g());
                a aVar3 = new a(context, xo2Var.J0);
                this.a = aVar3;
                aVar3.setOccupyStatusBar(false);
                yob.l(this.a, 5, aob.G6, xo2Var.J0);
                yob.l(this.a, 3, aob.z8, xo2Var.J0);
                a aVar4 = this.a;
                boolean z = xo2Var.H1;
                aVar4.setBackButtonImage(z ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                yob.l(this.a, 1, aob.y8, xo2Var.J0);
                this.a.setTitle(ob6.M0(2131751953, null));
                this.a.getTitleTextView().setTranslationX(-hl.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new kg2(this, (byte) 4));
                this.c.addView(this.a, tre.e(-1, 56, 48));
                this.c.addView(xo2Var.y1, tre.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                s6 u = this.a.u();
                u.setGlassMode(true);
                u.setTranslationX(-hl.L(7.0f));
                u.a(3, R.drawable.outline_header_search);
                c51 c51Var3 = new c51(xo2Var.J0, getContext(), true);
                xo2Var.s1 = c51Var3;
                c51Var3.f();
                xo2Var.s1.setText(ob6.M0(2131747558, null));
                xo2Var.s1.setOnClickListener(new r81(this, (byte) 19));
                if (z) {
                    xo2Var.s1.setVisibility(8);
                }
                this.c.addView(xo2Var.s1, tre.f(48.0f, -1, 80, hl.L(12.0f), 0, hl.L(12.0f), hl.L(12.0f) + hl.n));
                a();
                break;
        }
    }

    @Override // vo2
    public final float b() {
        switch (this.h) {
            case 0:
                return qke.a(this.n.m1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // vo2
    public final void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.y1.setTranslationY(Math.max(hl.L(8.0f) + hl.m, b() + hl.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
