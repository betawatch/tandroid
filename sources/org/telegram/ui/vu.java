package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ xu c;

    public vu(xu xuVar) {
        this.c = xuVar;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.g0.h() ? 1 : 3;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        xu xuVar = this.c;
        if (i10 == 0) {
            view = xuVar.d0;
        } else if (i10 == 2) {
            view = xuVar.e0;
            s4.o0 o0Var = new s4.o0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i12;
            view.setLayoutParams(o0Var);
        } else {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(viewGroup.getContext());
            d9Var.setFixedSize(12);
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false)), org.telegram.ui.ActionBar.h6.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            zqVar.w = true;
            d9Var.setBackgroundDrawable(zqVar);
            view = d9Var;
        }
        return new org.telegram.ui.Components.sl0(view);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
    }
}
