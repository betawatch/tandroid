package rh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends LinearLayout implements us {
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final TextView c;
    public final p80 d;
    public sf.b e;
    public final dq[] f;

    public a(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, i10, sf.b.a, p6Var);
    }

    public final void a() {
        sf.b bVar = this.e;
        int i10 = this.a;
        sf.a s10 = e6.x(i10, bVar).s();
        sf.b bVar2 = this.e;
        sf.b bVar3 = sf.b.a;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        p80 p80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(h8.Z0(false, cd.a0(null, null, 2131750125, cd.E(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.t6.uj;
            org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
            org.telegram.ui.ActionBar.a7.H(p80Var, i11, p6Var);
            p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750124, null), new ph.x1(this, 7)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
            return;
        }
        if (bVar2 == sf.b.b) {
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131750123, s10.b()));
            dq[] dqVarArr = this.f;
            textView.setText(h8.Z0(true, W2, 0.6f, dqVarArr));
            dqVarArr[0].a(org.telegram.ui.ActionBar.t6.uj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
            long c10 = (long) (s10.c() * ((org.telegram.messenger.k0) vp.r1(i10).y7.l.b).a * 100.0d);
            i12.getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", 2, c10, false));
            int i13 = org.telegram.ui.ActionBar.t6.vj;
            int i14 = org.telegram.ui.ActionBar.t6.tj;
            org.telegram.ui.ActionBar.a7.n(p80Var, i13, i14, 3, 0.33f, p6Var);
            org.telegram.ui.ActionBar.a7.o(p80Var, 2, i13, i14, 3, 0.33f, p6Var);
            p80Var.setText(sb2);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.y3) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        int i10 = this.a;
        zs.f(i10).c(this, zs.y3);
        zs.f(i10).c(this, zs.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        zs.f(i10).n(this, zs.y3);
        zs.f(i10).n(this, zs.C3);
    }

    public a(Context context, int i10, sf.b bVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f = new dq[1];
        this.a = i10;
        this.b = p6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(9.0f));
        int L = org.telegram.messenger.i0.L(24.0f);
        int i11 = org.telegram.ui.ActionBar.t6.tj;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.vj, p6Var);
        textView.setGravity(17);
        addView(textView, w7.b6.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        p80 p80Var = new p80(context, p6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 12.0f);
        p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(cd.L0(2131750124, null), new cs(2, context, p6Var)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
        p80Var.setGravity(17);
        addView(p80Var, w7.b6.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
