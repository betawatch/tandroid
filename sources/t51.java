// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t51 extends ka {
    public final /* synthetic */ v51 d;

    public t51(v51 v51Var) {
        this.d = v51Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 1 || i == 2 || i == 4;
    }

    @Override // w39
    public final int b() {
        return this.d.c.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((u51) this.d.c.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        v51 v51Var = this.d;
        ArrayList arrayList = v51Var.c;
        if (((u51) arrayList.get(i)).a == 2) {
            v6c v6cVar = (v6c) s49Var.a;
            m51 m51Var = ((u51) arrayList.get(i)).c;
            TLObject Z1 = v51Var.getMessagesController().Z1(m51Var.a);
            String str = null;
            if (Z1 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) Z1;
                str = user.self ? k96.M0(2131745709, null) : qu2.m(0, user.first_name, user.last_name);
            } else if (Z1 instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) Z1).title;
            }
            v6cVar.setSelfAsSavedMessages(true);
            v6cVar.d(Z1, str, o51.f(m51Var.b), i == arrayList.size() - 1 || ((u51) arrayList.get(i + 1)).a == 2);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2 = null;
        if (i != 1) {
            if (i == 2) {
                View v6cVar = new v6c(4, 0, null, viewGroup.getContext(), false, false);
                zkb.h(bkb.c6, null, v6cVar);
                view2 = v6cVar;
            } else if (i == 3) {
                view = new b9a(viewGroup.getContext(), (de9) null);
            } else if (i == 4) {
                wgb wgbVar = new wgb(viewGroup.getContext());
                wgbVar.k(k96.M0(2131747722, null), false);
                wgbVar.g(-1, bkb.o7);
                zkb.h(bkb.c6, null, wgbVar);
                view = wgbVar;
            }
            return ls6.h(view2, view2, -1, -2);
        }
        wgb wgbVar2 = new wgb(viewGroup.getContext());
        wgbVar2.o(R.drawable.msg_contact_add, k96.M0(2131747730, null), true);
        wgbVar2.g(bkb.u6, bkb.t6);
        zkb.h(bkb.c6, null, wgbVar2);
        view = wgbVar2;
        view2 = view;
        return ls6.h(view2, view2, -1, -2);
    }
}
