package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yo implements org.telegram.ui.Components.w80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fp b;

    public yo(fp fpVar, Context context) {
        this.b = fpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.w80
    public final void f() {
        fp fpVar = this.b;
        org.telegram.ui.Components.t60 t60Var = new org.telegram.ui.Components.t60(this.a, fpVar.i0, fpVar.V, fpVar.l0, fpVar, fpVar.W, true, ChatObject.isChannel(fpVar.U));
        fp fpVar2 = this.b;
        fpVar2.m0 = t60Var;
        fpVar2.m0.show();
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void h() {
    }
}
