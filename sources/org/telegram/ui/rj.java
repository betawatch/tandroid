package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rj extends org.telegram.ui.Components.jo {
    public final /* synthetic */ eo v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(eo eoVar, Context context, eo eoVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, eoVar2, z10, f6Var);
        this.v0 = eoVar;
    }

    @Override // org.telegram.ui.Components.jo
    public final boolean a() {
        boolean z10;
        eo eoVar = this.v0;
        if (eoVar.Oa || eoVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inBubbleMode;
        if (z10 || eoVar.j0 == null || eoVar.s3) {
            return false;
        }
        return !eoVar.F9() || eoVar.h4;
    }

    @Override // org.telegram.ui.Components.jo
    public final boolean d() {
        eo eoVar = this.v0;
        TLRPC.User user = eoVar.f;
        if (user != null && user.linked_community_id != 0) {
            eoVar.showDialog(new ei.k0(eoVar, eoVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = eoVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        eoVar.showDialog(new ei.k0(eoVar, eoVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.jo
    public final void f() {
        eo eoVar = this.v0;
        eoVar.la(eoVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.jo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
