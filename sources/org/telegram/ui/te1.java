package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class te1 extends org.telegram.ui.Components.pm0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public se1 e;
    public int f;
    public final /* synthetic */ ue1 h;

    public te1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) d1Var.a;
        g4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        g4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.am0(new org.telegram.ui.Cells.g4(1, 0, viewGroup.getContext(), false));
    }
}
