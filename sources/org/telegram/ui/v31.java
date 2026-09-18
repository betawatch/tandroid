package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class v31 implements x31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ org.telegram.ui.Components.uw d;

    public v31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.uw uwVar) {
        this.a = n2Var;
        this.b = context;
        this.c = e6Var;
        this.d = uwVar;
    }

    @Override // org.telegram.ui.x31
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.x31
    public final void b() {
        AndroidUtilities.runOnUIThread(new cy0(24, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.x31
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
