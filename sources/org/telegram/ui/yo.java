package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
