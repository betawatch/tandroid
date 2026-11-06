package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.Components.kn {
    public final /* synthetic */ an A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(an anVar, Context context, an anVar2, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, anVar2, z9, f6Var);
        this.A0 = anVar;
    }

    @Override // org.telegram.ui.Components.kn
    public final boolean a() {
        boolean z9;
        an anVar = this.A0;
        if (anVar.ib || anVar.isInPreviewMode()) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inBubbleMode;
        if (z9 || anVar.j0 == null || anVar.G3) {
            return false;
        }
        return !anVar.da() || anVar.v4;
    }

    @Override // org.telegram.ui.Components.kn
    public final boolean d() {
        an anVar = this.A0;
        TLRPC.User user = anVar.f;
        if (user != null && user.linked_community_id != 0) {
            anVar.showDialog(new ii.d0(anVar, anVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = anVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        anVar.showDialog(new ii.d0(anVar, anVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.kn
    public final void f() {
        an anVar = this.A0;
        anVar.La(anVar.ca() ? "" : null);
    }

    @Override // org.telegram.ui.Components.kn
    public final boolean o() {
        return this.A0.f4 == 3;
    }
}
