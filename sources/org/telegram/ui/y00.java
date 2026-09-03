package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y00 extends v00 {
    public final /* synthetic */ z00 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(z00 z00Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context, p2Var, i10, i11);
        this.B = z00Var;
    }

    @Override // org.telegram.ui.v00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.B.e.l0(tL_exportedChatlistInvite);
    }
}
