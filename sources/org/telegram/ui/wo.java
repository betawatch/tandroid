package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wo implements org.telegram.ui.Components.w80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ dp b;

    public wo(dp dpVar, Context context) {
        this.b = dpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.w80
    public final void e() {
        dp dpVar = this.b;
        org.telegram.ui.Components.s60 s60Var = new org.telegram.ui.Components.s60(this.a, dpVar.i0, dpVar.V, dpVar.l0, dpVar, dpVar.W, true, ChatObject.isChannel(dpVar.U));
        dp dpVar2 = this.b;
        dpVar2.m0 = s60Var;
        dpVar2.m0.show();
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w80
    public final /* synthetic */ void j() {
    }
}
