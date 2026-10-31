package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u51;
import org.telegram.ui.y01;
import w7.b6;
import w7.n7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w extends y {
    public final g9 h;
    public final r8 n;
    public final /* synthetic */ a0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, Context context) {
        super(a0Var, context);
        this.r = a0Var;
        int i10 = 4;
        u51 u51Var = new u51(context, a0Var.a, 0, false, new r(a0Var, i10), new s(a0Var, 3), new s(a0Var, i10), a0Var.I0);
        this.d = u51Var;
        u51Var.r1();
        u51 u51Var2 = this.d;
        u51Var2.f3.r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.n);
        i0.E2(this.b);
        this.c.addView(a0Var.w1, b6.g());
        this.c.addView(this.d, b6.g());
        this.c.addView(a0Var.y1, b6.g());
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, a0Var.I0);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        a7.m(this.a, 5, t6.G6, a0Var.I0);
        a7.m(this.a, 3, t6.z8, a0Var.I0);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        a7.m(this.a, 1, t6.y8, a0Var.I0);
        this.a.setTitle(o5.m(a0Var.m1));
        this.a.getTitleTextView().setTranslationX(-i0.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new y01(this, 24));
        r8 r8Var = new r8(a0Var.m1);
        this.n = r8Var;
        g9 g9Var = new g9(getContext());
        this.h = g9Var;
        g9Var.setRoundRadius(i0.L(9.0f));
        g9Var.e(a0Var.m1, r8Var);
        this.a.addView(g9Var, b6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, b6.e(-1, 56, 48));
        this.c.addView(a0Var.u1, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y p5 = this.a.p();
        p5.setGlassMode(true);
        p5.setTranslationX(-i0.L(7.0f));
        p5.a(3, R.drawable.outline_header_search);
        if (w3.N(a0Var.m1)) {
            p5.a(2, R.drawable.msg_download_settings);
        }
        vh.d dVar = new vh.d(getContext(), a0Var.I0, true);
        dVar.f();
        if (w3.w(27, a0Var.m1)) {
            dq dqVar = new dq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) cd.L0(2131751989, null));
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(cd.L0(2131747847, null));
        }
        a0Var.o1 = dVar;
        dVar.setOnClickListener(new rh.s(this, 29));
        this.c.addView(dVar, b6.f(48.0f, -1, 80, i0.L(12.0f), 0, i0.L(12.0f), i0.L(12.0f) + i0.n));
        a();
    }

    @Override // yh.y
    public final float b() {
        return n7.a(this.r.i1.e) * super.b();
    }

    @Override // yh.y
    public final void c() {
        super.c();
        this.r.u1.setTranslationY(Math.max(i0.L(8.0f) + i0.m, b() + i0.L(4.0f)));
    }
}
