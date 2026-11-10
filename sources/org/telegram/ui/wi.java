package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wi extends org.telegram.ui.Components.jn {
    public final /* synthetic */ cn A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(cn cnVar, Context context, cn cnVar2, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, cnVar2, z9, h6Var);
        this.A0 = cnVar;
    }

    @Override // org.telegram.ui.Components.jn
    public final boolean a() {
        boolean z9;
        cn cnVar = this.A0;
        if (cnVar.kb || cnVar.isInPreviewMode()) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
        if (z9 || cnVar.j0 == null || cnVar.G3) {
            return false;
        }
        return !cnVar.ea() || cnVar.v4;
    }

    @Override // org.telegram.ui.Components.jn
    public final boolean d() {
        cn cnVar = this.A0;
        TLRPC.User user = cnVar.f;
        if (user != null && user.linked_community_id != 0) {
            cnVar.showDialog(new ii.d0(cnVar, cnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = cnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        cnVar.showDialog(new ii.d0(cnVar, cnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.jn
    public final void f() {
        cn cnVar = this.A0;
        cnVar.Na(cnVar.da() ? "" : null);
    }

    @Override // org.telegram.ui.Components.jn
    public final boolean o() {
        return this.A0.f4 == 3;
    }
}
