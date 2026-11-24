// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zub extends q59 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public yub e;
    public int f;
    public final /* synthetic */ avb h;

    public zub(avb avbVar) {
        this.h = avbVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return this.c.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
        String str = (String) this.d.get(i);
        xc5 xc5Var = (xc5) u69Var.a;
        xc5Var.e(chat, chat.title, str, i != arrayList.size() - 1);
        xc5Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new xc5(viewGroup.getContext(), 1, 0, false));
    }
}
