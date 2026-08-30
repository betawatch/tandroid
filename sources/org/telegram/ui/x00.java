package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x00 extends u00 {
    public final /* synthetic */ y00 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(y00 y00Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context, p2Var, i10, i11);
        this.B = y00Var;
    }

    @Override // org.telegram.ui.u00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.B.e.l0(tL_exportedChatlistInvite);
    }
}
