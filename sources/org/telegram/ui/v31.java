package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v31 implements z31 {
    public final /* synthetic */ bo a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;

    public v31(bo boVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.a = boVar;
        this.b = activity;
        this.c = f6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.z31
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.z31
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.z31
    public final void c() {
        bo boVar = this.a;
        boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 3, true));
    }
}
