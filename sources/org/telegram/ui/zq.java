package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class zq extends org.telegram.ui.Components.w20 {
    public final /* synthetic */ hr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(hr hrVar, Activity activity, hr hrVar2) {
        super(activity, hrVar2);
        this.b = hrVar;
    }

    @Override // org.telegram.ui.Components.w20
    public final void o() {
        hr hrVar = this.b;
        hrVar.getMessagesController().convertToGigaGroup(hrVar.getParentActivity(), hrVar.r, hrVar, new b1(this, 24));
    }

    @Override // org.telegram.ui.Components.w20
    public final void n() {
    }
}
