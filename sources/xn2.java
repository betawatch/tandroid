// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class xn2 extends co2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ eo2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn2(eo2 eo2Var, Context context, byte b) {
        super(eo2Var, context);
        this.h = b;
        final byte b2 = 0;
        byte b3 = 3;
        byte b4 = 5;
        switch (b) {
            case 1:
                this.n = eo2Var;
                super(eo2Var, context);
                q5c q5cVar = new q5c(context, eo2Var.a, 0, false, new sn2(eo2Var, b4), new tn2(eo2Var, b4), null, eo2Var.J0);
                this.d = q5cVar;
                q5cVar.r1();
                q5c q5cVar2 = this.d;
                q5cVar2.g3.r = false;
                q5cVar2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, gl.L(60.0f) + gl.n);
                this.d.j(new ao2(this, (byte) 1));
                this.c.addView(this.d, 0, nme.c(-1.0f, -1));
                a aVar = new a(context, eo2Var.J0);
                this.a = aVar;
                aVar.setOccupyStatusBar(false);
                a aVar2 = this.a;
                int i = bkb.F6;
                zkb.l(aVar2, 5, i, eo2Var.J0);
                zkb.l(this.a, 3, bkb.y8, eo2Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                zkb.l(this.a, 1, bkb.x8, eo2Var.J0);
                this.a.setTitle(k96.M0(2131751874, null));
                this.a.getTitleTextView().setTranslationX(-gl.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new vm2(this, b4));
                this.c.addView(this.a, nme.e(-1, 56, 48));
                LinearLayout j = de9.j(context, 0);
                j.setPadding(gl.L(7.0f), 0, gl.L(7.0f), gl.L(12.0f));
                u41 u41Var = new u41(eo2Var.J0, context, true);
                u41Var.e();
                int i2 = bkb.c6;
                u41Var.setColor(bm2.f(0.125f, bkb.v0(i2, eo2Var.J0), bkb.v0(i, eo2Var.J0)));
                u41Var.setText(k96.M0(2131751888, null));
                u41Var.f();
                if (u41Var.getBackground() != null) {
                    Drawable background = u41Var.getBackground();
                    wjb wjbVar = eo2Var.J0;
                    u41Var.setBackground(background);
                    ukb o = zkb.o(u41Var, true);
                    o.d = background;
                    o.e = null;
                    o.f = null;
                    if (background != null) {
                        tkb tkbVar = new tkb();
                        o.e = tkbVar;
                        tkbVar.c(i2, i, 3, 0.125f, wjbVar);
                        tkbVar.g = zkb.t(background);
                    }
                }
                u41Var.setOnClickListener(new View.OnClickListener(this) { // from class: do2
                    public final /* synthetic */ xn2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b5 = b2;
                        xn2 xn2Var = this.b;
                        switch (b5) {
                            case 0:
                                xn2Var.n.G1.f(false, true);
                                break;
                            default:
                                xn2Var.n.G1.f(true, true);
                                break;
                        }
                    }
                });
                j.addView(u41Var, nme.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final byte b5 = 1;
                u41 u41Var2 = new u41(eo2Var.J0, context, true);
                u41Var2.setText(k96.M0(2131751890, null));
                u41Var2.f();
                u41Var2.setOnClickListener(new View.OnClickListener(this) { // from class: do2
                    public final /* synthetic */ xn2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b52 = b5;
                        xn2 xn2Var = this.b;
                        switch (b52) {
                            case 0:
                                xn2Var.n.G1.f(false, true);
                                break;
                            default:
                                xn2Var.n.G1.f(true, true);
                                break;
                        }
                    }
                });
                j.addView(u41Var2, nme.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(j, nme.f(-2.0f, -1, 80, 0, 0, 0, gl.n));
                a();
                break;
            default:
                this.n = eo2Var;
                gl.B2(this.b);
                q5c q5cVar3 = new q5c(context, eo2Var.a, 0, false, new sn2(eo2Var, b3), new tn2(eo2Var, (byte) 2), null, eo2Var.J0);
                this.d = q5cVar3;
                q5cVar3.r1();
                q5c q5cVar4 = this.d;
                q5cVar4.g3.r = false;
                q5cVar4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, gl.L(60.0f) + gl.n);
                this.c.addView(eo2Var.A1, nme.g());
                this.c.addView(this.d, 0, nme.c(-1.0f, -1));
                this.c.addView(eo2Var.C1, nme.g());
                a aVar3 = new a(context, eo2Var.J0);
                this.a = aVar3;
                aVar3.setOccupyStatusBar(false);
                zkb.l(this.a, 5, bkb.F6, eo2Var.J0);
                zkb.l(this.a, 3, bkb.y8, eo2Var.J0);
                a aVar4 = this.a;
                boolean z = eo2Var.H1;
                aVar4.setBackButtonImage(z ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                zkb.l(this.a, 1, bkb.x8, eo2Var.J0);
                this.a.setTitle(k96.M0(2131751976, null));
                this.a.getTitleTextView().setTranslationX(-gl.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new vm2(this, b3));
                this.c.addView(this.a, nme.e(-1, 56, 48));
                this.c.addView(eo2Var.y1, nme.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                r6 t = this.a.t();
                t.setGlassMode(true);
                t.setTranslationX(-gl.L(7.0f));
                t.a(3, R.drawable.outline_header_search);
                u41 u41Var3 = new u41(eo2Var.J0, getContext(), true);
                eo2Var.s1 = u41Var3;
                u41Var3.f();
                eo2Var.s1.setText(k96.M0(2131747638, null));
                eo2Var.s1.setOnClickListener(new x91(this, (byte) 17));
                if (z) {
                    eo2Var.s1.setVisibility(8);
                }
                this.c.addView(eo2Var.s1, nme.f(48.0f, -1, 80, gl.L(12.0f), 0, gl.L(12.0f), gl.L(12.0f) + gl.n));
                a();
                break;
        }
    }

    @Override // co2
    public final float b() {
        switch (this.h) {
            case 0:
                return zfe.a(this.n.m1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // co2
    public final void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.y1.setTranslationY(Math.max(gl.L(8.0f) + gl.m, b() + gl.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
