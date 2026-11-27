// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zwb extends c79 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ywb e;
    public int f;
    public final /* synthetic */ axb h;

    public zwb(axb axbVar) {
        this.h = axbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return this.c.size();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
        String str = (String) this.d.get(i);
        bd5 bd5Var = (bd5) f89Var.a;
        bd5Var.e(chat, chat.title, str, i != arrayList.size() - 1);
        bd5Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(new bd5(viewGroup.getContext(), 1, 0, false));
    }
}
