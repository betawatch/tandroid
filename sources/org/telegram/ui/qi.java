package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qi extends org.telegram.ui.Components.jn {
    public final /* synthetic */ wm B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(wm wmVar, Context context, wm wmVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, wmVar2, z10, e6Var);
        this.B0 = wmVar;
    }

    @Override // org.telegram.ui.Components.jn
    public final boolean a() {
        boolean z10;
        wm wmVar = this.B0;
        if (wmVar.jb || wmVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inBubbleMode;
        if (z10 || wmVar.k0 == null || wmVar.H3) {
            return false;
        }
        return !wmVar.da() || wmVar.w4;
    }

    @Override // org.telegram.ui.Components.jn
    public final boolean d() {
        wm wmVar = this.B0;
        TLRPC.User user = wmVar.f;
        if (user != null && user.linked_community_id != 0) {
            wmVar.showDialog(new ji.b0(wmVar, wmVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = wmVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        wmVar.showDialog(new ji.b0(wmVar, wmVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.jn
    public final void f() {
        wm wmVar = this.B0;
        wmVar.La(wmVar.ca() ? "" : null);
    }

    @Override // org.telegram.ui.Components.jn
    public final boolean o() {
        return this.B0.g4 == 3;
    }
}
