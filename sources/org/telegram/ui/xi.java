package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xi extends org.telegram.ui.Components.aw {
    public final /* synthetic */ sn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(sn snVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, activity, g6Var, arrayList);
        this.W = snVar;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}
