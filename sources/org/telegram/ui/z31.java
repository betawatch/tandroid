package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z31 implements d41 {
    public final /* synthetic */ eo a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;

    public z31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.a = eoVar;
        this.b = activity;
        this.c = f6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.d41
    public final void a() {
        AndroidUtilities.runOnUIThread(new t31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.d41
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.d41
    public final void c() {
        eo eoVar = this.a;
        eoVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 3, true));
    }
}
