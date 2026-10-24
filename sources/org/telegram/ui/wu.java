package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wu extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ yu c;

    public wu(yu yuVar) {
        this.c = yuVar;
    }

    @Override // org.telegram.ui.Components.lm0
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
        yu yuVar = this.c;
        if (i10 == 0) {
            view = yuVar.d0;
        } else if (i10 == 2) {
            view = yuVar.e0;
            s4.o0 o0Var = new s4.o0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.h3) yuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.h3) yuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i12;
            view.setLayoutParams(o0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            int i13 = org.telegram.ui.ActionBar.k6.a7;
            ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            org.telegram.ui.ActionBar.r6.z(e9Var, colorDrawable, i13, null, PorterDuff.Mode.SRC_IN);
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(colorDrawable, org.telegram.ui.ActionBar.k6.X0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            yqVar.w = true;
            e9Var.setBackgroundDrawable(yqVar);
            view = e9Var;
        }
        return new org.telegram.ui.Components.wl0(view);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
    }
}
