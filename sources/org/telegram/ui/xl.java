package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.Cells.a0 {
    public final /* synthetic */ em f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f = emVar;
    }

    @Override // org.telegram.ui.Cells.a0
    public final int getSideMenuWidth() {
        sn snVar = this.f.Q;
        int i10 = sn.Vc;
        return snVar.W8();
    }
}
