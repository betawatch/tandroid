package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class se1 extends org.telegram.ui.Components.kl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public re1 e;
    public int f;
    public final /* synthetic */ te1 h;

    public se1(te1 te1Var) {
        this.h = te1Var;
    }

    @Override // org.telegram.ui.Components.kl0
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
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.a;
        g4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        g4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
