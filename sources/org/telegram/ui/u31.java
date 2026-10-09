package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u31 implements y31 {
    public final /* synthetic */ zn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ MessageObject d;

    public u31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.a = znVar;
        this.b = activity;
        this.c = e6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.y31
    public final void a() {
        AndroidUtilities.runOnUIThread(new o31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        zn znVar = this.a;
        znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 3, true));
    }
}
