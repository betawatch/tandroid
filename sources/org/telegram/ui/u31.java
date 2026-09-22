package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u31 implements y31 {
    public final /* synthetic */ zn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;

    public u31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.a = znVar;
        this.b = activity;
        this.c = f6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        zn znVar = this.a;
        znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
