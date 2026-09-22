package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class te1 extends org.telegram.ui.Components.xl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public se1 e;
    public int f;
    public final /* synthetic */ ue1 h;

    public te1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) c1Var.a;
        h4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        h4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.il0(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
