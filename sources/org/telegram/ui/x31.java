package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x31 implements z31 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.Components.ny d;

    public x31(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ny nyVar) {
        this.a = o2Var;
        this.b = context;
        this.c = f6Var;
        this.d = nyVar;
    }

    @Override // org.telegram.ui.z31
    public final void a() {
        AndroidUtilities.runOnUIThread(new r31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.z31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ky0(20, this.a, this.d), 200L);
    }

    @Override // org.telegram.ui.z31
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.a;
        o2Var.showDialog(new rg.x0(o2Var, 3, true));
    }
}
