package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qd1 extends org.telegram.ui.Components.mm0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public pd1 e;
    public int f;
    public final /* synthetic */ rd1 h;

    public qd1(rd1 rd1Var) {
        this.h = rd1Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) e1Var.a;
        k4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        k4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.k4(viewGroup.getContext(), 1, 0, false));
    }
}
