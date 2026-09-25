package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yo implements org.telegram.ui.Components.f90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fp b;

    public yo(fp fpVar, Context context) {
        this.b = fpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f90
    public final void e() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.f90
    public final void j() {
        fp fpVar = this.b;
        org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(this.a, fpVar.l0, fpVar.Y, fpVar.o0, fpVar, fpVar.Z, true, ChatObject.isChannel(fpVar.X));
        fp fpVar2 = this.b;
        fpVar2.p0 = c70Var;
        fpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void k() {
    }
}
