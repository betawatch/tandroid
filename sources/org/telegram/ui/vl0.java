package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vl0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView a;
    public org.telegram.ui.Components.ly0 b;
    public final org.telegram.ui.Components.e5 c;
    public final /* synthetic */ wl0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(wl0 wl0Var, Context context) {
        super(context);
        this.d = wl0Var;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        cm0 cm0Var = wl0Var.q0;
        org.telegram.ui.ActionBar.r6.i(i3, this, cm0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        boolean z10 = cm0Var.a;
        org.telegram.ui.ActionBar.r6.V(textView, i10, cm0Var.getResourceProvider());
        if (wl0Var.n0 == 1) {
            textView.setText(org.telegram.messenger.bd.M0(z10 ? 2131752312 : 2131743740, null));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(z10 ? 2131752321 : 2131743743, null));
        }
        addView(textView, b8.mf.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
    }

    public final int a() {
        int i3;
        org.telegram.messenger.xo xoVar;
        org.telegram.messenger.wo d;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        wl0 wl0Var = this.d;
        cm0 cm0Var = wl0Var.q0;
        int i11 = wl0Var.h;
        if (i11 >= 0) {
            if (i11 < 7) {
                return cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[i11]);
            }
            if (wl0Var.n0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                xoVar = org.telegram.messenger.hp.s1(i10).q4;
            } else {
                i3 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                xoVar = org.telegram.messenger.hp.s1(i3).r4;
            }
            return (xoVar == null || (d = xoVar.d(wl0Var.h)) == null) ? cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[0]) : d.f();
        }
        int i12 = org.telegram.ui.ActionBar.k6.s8;
        if (org.telegram.messenger.g0.B(cm0Var.getThemedColor(i12)) > 0.8f) {
            int i13 = org.telegram.ui.ActionBar.k6.n6;
            e6Var4 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.w0(i13, e6Var4);
        }
        if (org.telegram.messenger.g0.B(cm0Var.getThemedColor(i12)) < 0.2f) {
            int i14 = org.telegram.ui.ActionBar.k6.A8;
            e6Var3 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i14, e6Var3));
        }
        int i15 = org.telegram.ui.ActionBar.k6.d6;
        e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
        e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        return org.telegram.ui.ActionBar.k6.w(w02, org.telegram.ui.ActionBar.k6.r1(0.7f, cm0.B0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var2))));
    }

    public final void b(boolean z10) {
        wl0 wl0Var = this.d;
        long j10 = wl0Var.n;
        org.telegram.ui.Components.e5 e5Var = this.c;
        if (j10 != 0) {
            e5Var.j(j10, z10);
            this.b = null;
        } else {
            e5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.ly0(org.telegram.messenger.bd.M0(wl0Var.q0.a ? 2131752311 : 2131743739, null), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = org.telegram.messenger.bd.a0;
        org.telegram.ui.Components.e5 e5Var = this.c;
        e5Var.setBounds(z10 ? org.telegram.messenger.g0.L(21.0f) : (getWidth() - e5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.s) / 2, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(21.0f) + e5Var.s : getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.e5 e5Var = this.c;
        e5Var.k(valueOf);
        org.telegram.ui.Components.ly0 ly0Var = this.b;
        if (ly0Var != null) {
            ly0Var.c((getMeasuredWidth() - this.b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.q0.getThemedColor(org.telegram.ui.ActionBar.k6.q6), canvas);
        } else {
            e5Var.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        wl0 wl0Var = this.d;
        setBackgroundColor(wl0Var.q0.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.a.setTextColor(wl0Var.q0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
