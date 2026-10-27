package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vo implements org.telegram.ui.Components.r90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cp b;

    public vo(cp cpVar, Context context) {
        this.b = cpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.r90
    public final void d() {
        this.b.Z(true);
    }

    @Override // org.telegram.ui.Components.r90
    public final void e() {
        cp cpVar = this.b;
        org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(this.a, cpVar.l0, cpVar.Y, cpVar.o0, cpVar, cpVar.Z, true, ChatObject.isChannel(cpVar.X));
        cp cpVar2 = this.b;
        cpVar2.p0 = o70Var;
        cpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.r90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.r90
    public final /* synthetic */ void k() {
    }
}
