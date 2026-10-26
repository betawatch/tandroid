package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class to implements org.telegram.ui.Components.q90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ap b;

    public to(ap apVar, Context context) {
        this.b = apVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q90
    public final void d() {
        this.b.Z(true);
    }

    @Override // org.telegram.ui.Components.q90
    public final void e() {
        ap apVar = this.b;
        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(this.a, apVar.l0, apVar.Y, apVar.o0, apVar, apVar.Z, true, ChatObject.isChannel(apVar.X));
        ap apVar2 = this.b;
        apVar2.p0 = n70Var;
        apVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void k() {
    }
}
