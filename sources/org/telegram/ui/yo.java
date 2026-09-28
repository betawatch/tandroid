package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class yo implements org.telegram.ui.Components.h90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fp b;

    public yo(fp fpVar, Context context) {
        this.b = fpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.h90
    public final void e() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.h90
    public final void j() {
        fp fpVar = this.b;
        org.telegram.ui.Components.e70 e70Var = new org.telegram.ui.Components.e70(this.a, fpVar.l0, fpVar.Y, fpVar.o0, fpVar, fpVar.Z, true, ChatObject.isChannel(fpVar.X));
        fp fpVar2 = this.b;
        fpVar2.p0 = e70Var;
        fpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.h90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.h90
    public final /* synthetic */ void k() {
    }
}
