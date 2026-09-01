package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wo implements org.telegram.ui.Components.x80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ep b;

    public wo(ep epVar, Context context) {
        this.b = epVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.x80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.x80
    public final void e() {
        ep epVar = this.b;
        org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(this.a, epVar.i0, epVar.V, epVar.l0, epVar, epVar.W, true, ChatObject.isChannel(epVar.U));
        ep epVar2 = this.b;
        epVar2.m0 = u60Var;
        epVar2.m0.show();
    }

    @Override // org.telegram.ui.Components.x80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.x80
    public final /* synthetic */ void k() {
    }
}
