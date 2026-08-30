package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xd1 extends org.telegram.ui.Components.rl0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public wd1 e;
    public int f;
    public final /* synthetic */ yd1 h;

    public xd1(yd1 yd1Var) {
        this.h = yd1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) l1Var.a;
        g4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        g4Var.c(this.h.w.contains(Long.valueOf(chat.id)), false);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.el0(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
