package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u31 implements y31 {
    public final /* synthetic */ bo a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ MessageObject d;

    public u31(bo boVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.a = boVar;
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
        AndroidUtilities.runOnUIThread(new se(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.y31
    public final void c() {
        bo boVar = this.a;
        boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 3, true));
    }
}
