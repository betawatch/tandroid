package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zo implements org.telegram.ui.Components.v80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ gp b;

    public zo(gp gpVar, Context context) {
        this.b = gpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.v80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.v80
    public final void i() {
        gp gpVar = this.b;
        org.telegram.ui.Components.s60 s60Var = new org.telegram.ui.Components.s60(this.a, gpVar.l0, gpVar.Y, gpVar.o0, gpVar, gpVar.Z, true, ChatObject.isChannel(gpVar.X));
        gp gpVar2 = this.b;
        gpVar2.p0 = s60Var;
        gpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void j() {
    }
}
