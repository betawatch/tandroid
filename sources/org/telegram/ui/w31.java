package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class w31 implements a41 {
    public final /* synthetic */ co a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;

    public w31(co coVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.a = coVar;
        this.b = activity;
        this.c = f6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.a41
    public final void a() {
        AndroidUtilities.runOnUIThread(new p31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.a41
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.a41
    public final void c() {
        co coVar = this.a;
        coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 3, true));
    }
}
