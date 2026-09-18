package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class t31 implements x31 {
    public final /* synthetic */ zn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ MessageObject d;

    public t31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.a = znVar;
        this.b = activity;
        this.c = e6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.x31
    public final void a() {
        AndroidUtilities.runOnUIThread(new n31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.x31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.x31
    public final void c() {
        zn znVar = this.a;
        znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
