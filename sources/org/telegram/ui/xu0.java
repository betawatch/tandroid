package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xu0 extends org.telegram.ui.Components.no0 {
    public final /* synthetic */ yu0 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu0(yu0 yu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = yu0Var;
    }

    @Override // org.telegram.ui.Components.no0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new sn0(this, hVar, i7, 24), 250L);
        }
    }
}
