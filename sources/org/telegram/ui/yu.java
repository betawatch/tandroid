package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yu extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ av c;

    public yu(av avVar) {
        this.c = avVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.c0.h() ? 1 : 3;
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        av avVar = this.c;
        if (i10 == 0) {
            view = avVar.Z;
        } else if (i10 == 2) {
            view = avVar.a0;
            f2.y0 y0Var = new f2.y0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.e3) avVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) y0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.e3) avVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) y0Var).rightMargin = i12;
            view.setLayoutParams(y0Var);
        } else {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(viewGroup.getContext());
            x8Var.setFixedSize(12);
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            dqVar.w = true;
            x8Var.setBackgroundDrawable(dqVar);
            view = x8Var;
        }
        return new org.telegram.ui.Components.lk0(view);
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
    }
}
