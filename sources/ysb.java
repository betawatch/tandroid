// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ysb extends n39 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public xsb e;
    public int f;
    public final /* synthetic */ zsb h;

    public ysb(zsb zsbVar) {
        this.h = zsbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        return this.c.size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
        String str = (String) this.d.get(i);
        za5 za5Var = (za5) s49Var.a;
        za5Var.e(chat, chat.title, str, i != arrayList.size() - 1);
        za5Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(new za5(viewGroup.getContext(), 1, 0, false));
    }
}
