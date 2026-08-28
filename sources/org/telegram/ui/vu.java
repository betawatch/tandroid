package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vu extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ xu c;

    public vu(xu xuVar) {
        this.c = xuVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.c0.h() ? 1 : 3;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10;
        int i11;
        xu xuVar = this.c;
        if (i9 == 0) {
            view = xuVar.Z;
        } else if (i9 == 2) {
            view = xuVar.a0;
            f2.a1 a1Var = new f2.a1(-1, -2);
            i10 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) a1Var).leftMargin = i10;
            i11 = ((org.telegram.ui.ActionBar.f3) xuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) a1Var).rightMargin = i11;
            view.setLayoutParams(a1Var);
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(viewGroup.getContext());
            b9Var.setFixedSize(12);
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false)), org.telegram.ui.ActionBar.f6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            fqVar.w = true;
            b9Var.setBackgroundDrawable(fqVar);
            view = b9Var;
        }
        return new org.telegram.ui.Components.ik0(view);
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
    }
}
