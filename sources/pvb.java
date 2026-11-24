// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pvb extends fs5 {
    public boolean e;
    public final /* synthetic */ qvb f;

    public pvb(qvb qvbVar) {
        this.f = qvbVar;
    }

    @Override // fs5
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        super.a(recyclerView, s49Var);
        s49Var.a.setPressed(false);
    }

    @Override // fs5
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        qvb qvbVar = this.f;
        ArrayList arrayList = qvbVar.b;
        int m = fs5.m(0, 0);
        int b = s49Var.b();
        if (b >= 0 && b < arrayList.size() && ((ivb) arrayList.get(b)).c != null && hc2.y(15, qvbVar.f())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ivb) arrayList.get(b)).c;
            if (qvbVar.b0.isEmpty()) {
                View view = s49Var.a;
                if ((view instanceof nvb) && tL_forumTopic.id == 1) {
                    this.e = true;
                    ((nvb) view).setSliding(true);
                    return fs5.m(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return fs5.m(3, 0);
            }
        }
        return m;
    }

    @Override // fs5
    public final boolean l() {
        return !this.f.b0.isEmpty();
    }

    @Override // fs5
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        int b;
        qvb qvbVar = this.f;
        ArrayList arrayList = qvbVar.b;
        if (s49Var.f != s49Var2.f || (b = s49Var2.b()) < 0 || b >= arrayList.size() || ((ivb) arrayList.get(b)).c == null || !((ivb) arrayList.get(b)).c.pinned) {
            return false;
        }
        hvb hvbVar = qvbVar.r;
        int b2 = s49Var.b();
        int b3 = s49Var2.b();
        qvb qvbVar2 = hvbVar.d;
        ArrayList arrayList2 = qvbVar2.b;
        arrayList2.add(b3, (ivb) arrayList2.remove(b2));
        b49 itemAnimator = qvbVar2.O.getItemAnimator();
        evb evbVar = qvbVar2.J0;
        if (itemAnimator != evbVar) {
            qvbVar2.O.setItemAnimator(evbVar);
        }
        hvbVar.j(b2, b3);
        return true;
    }

    @Override // fs5
    public final void q(s49 s49Var, int i) {
        qvb qvbVar = this.f;
        if (i != 0) {
            qvbVar.O.J0(false);
            s49Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = qvbVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ivb) arrayList.get(i2)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        qvbVar.getMessagesController().g4.w(arrayList2, qvbVar.a);
    }

    @Override // fs5
    public final void r(s49 s49Var) {
        if (s49Var != null) {
            nvb nvbVar = (nvb) s49Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = nvbVar.O;
            qvb qvbVar = this.f;
            if (tL_forumTopic != null) {
                pub pubVar = qvbVar.getMessagesController().g4;
                long j = qvbVar.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = nvbVar.O;
                pubVar.A(tL_forumTopic2.id, j, tL_forumTopic2.hidden);
            }
            qvbVar.d1 = nvbVar;
            cvb cvbVar = qvbVar.O;
            boolean z = !nvbVar.O.hidden;
            int i = ovb.o3;
            cvbVar.B1(z, nvbVar);
            qvbVar.Y0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = nvbVar.d5;
            if (tL_forumTopic3 != null) {
                nvbVar.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
