package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class x00 extends u00 {
    public final /* synthetic */ y00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(y00 y00Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, int i11) {
        super(context, m2Var, i10, i11);
        this.E = y00Var;
    }

    @Override // org.telegram.ui.u00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.E.e.l0(tL_exportedChatlistInvite);
    }
}
