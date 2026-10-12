package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uj extends org.telegram.ui.Components.ro {
    public final /* synthetic */ fo v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(fo foVar, Context context, fo foVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, foVar2, z10, c6Var);
        this.v0 = foVar;
    }

    @Override // org.telegram.ui.Components.ro
    public final boolean a() {
        boolean z10;
        fo foVar = this.v0;
        if (foVar.Pa || foVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inBubbleMode;
        if (z10 || foVar.j0 == null || foVar.s3) {
            return false;
        }
        return !foVar.K9() || foVar.h4;
    }

    @Override // org.telegram.ui.Components.ro
    public final boolean d() {
        fo foVar = this.v0;
        TLRPC.User user = foVar.f;
        if (user != null && user.linked_community_id != 0) {
            foVar.showDialog(new gi.k0(foVar, foVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        foVar.showDialog(new gi.k0(foVar, foVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.ro
    public final void f() {
        fo foVar = this.v0;
        foVar.qa(foVar.J9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.ro
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
