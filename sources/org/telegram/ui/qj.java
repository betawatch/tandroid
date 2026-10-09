package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qj extends org.telegram.ui.Components.uo {
    public final /* synthetic */ zn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(zn znVar, Context context, zn znVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, znVar2, z10, e6Var);
        this.v0 = znVar;
    }

    @Override // org.telegram.ui.Components.uo
    public final boolean a() {
        boolean z10;
        zn znVar = this.v0;
        if (znVar.Pa || znVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
        if (z10 || znVar.j0 == null || znVar.s3) {
            return false;
        }
        return !znVar.K9() || znVar.h4;
    }

    @Override // org.telegram.ui.Components.uo
    public final boolean d() {
        zn znVar = this.v0;
        TLRPC.User user = znVar.f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        znVar.showDialog(new fi.k0(znVar, znVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.uo
    public final void f() {
        zn znVar = this.v0;
        znVar.qa(znVar.J9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.uo
    public final boolean p() {
        return this.v0.R3 == 3;
    }
}
