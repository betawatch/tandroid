package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wu extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ yu c;

    public wu(yu yuVar) {
        this.c = yuVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.c0.h() ? 1 : 3;
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        yu yuVar = this.c;
        if (i10 == 0) {
            view = yuVar.Z;
        } else if (i10 == 2) {
            view = yuVar.a0;
            f2.x0 x0Var = new f2.x0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) yuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) yuVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = i12;
            view.setLayoutParams(x0Var);
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(viewGroup.getContext());
            y8Var.setFixedSize(12);
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            jqVar.w = true;
            y8Var.setBackgroundDrawable(jqVar);
            view = y8Var;
        }
        return new org.telegram.ui.Components.vk0(view);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
    }
}
