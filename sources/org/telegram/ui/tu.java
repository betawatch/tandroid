package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tu extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ vu c;

    public tu(vu vuVar) {
        this.c = vuVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.g0.h() ? 1 : 3;
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        vu vuVar = this.c;
        if (i10 == 0) {
            view = vuVar.d0;
        } else if (i10 == 2) {
            view = vuVar.e0;
            s4.q0 q0Var = new s4.q0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.k3) vuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.k3) vuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i12;
            view.setLayoutParams(q0Var);
        } else {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(viewGroup.getContext());
            i9Var.setFixedSize(12);
            int i13 = org.telegram.ui.ActionBar.y6.a7;
            ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
            org.telegram.ui.ActionBar.f7.y(i9Var, colorDrawable, i13, null, PorterDuff.Mode.SRC_IN);
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, org.telegram.ui.ActionBar.y6.X0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7));
            arVar.w = true;
            i9Var.setBackgroundDrawable(arVar);
            view = i9Var;
        }
        return new org.telegram.ui.Components.vl0(view);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
    }
}
