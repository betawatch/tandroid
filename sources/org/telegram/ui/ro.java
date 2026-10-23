package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ro implements org.telegram.ui.Components.q90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yo b;

    public ro(yo yoVar, Context context) {
        this.b = yoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q90
    public final void c() {
        this.b.Y(true);
    }

    @Override // org.telegram.ui.Components.q90
    public final void j() {
        yo yoVar = this.b;
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(this.a, yoVar.m0, yoVar.Z, yoVar.p0, yoVar, yoVar.a0, true, ChatObject.isChannel(yoVar.Y));
        yo yoVar2 = this.b;
        yoVar2.q0 = m70Var;
        yoVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void k() {
    }
}
