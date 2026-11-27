// default package

import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vy1 extends yc8 {
    public boolean a;
    public final /* synthetic */ no6 b;
    public final /* synthetic */ File c;
    public final /* synthetic */ wy1 d;

    public vy1(wy1 wy1Var, no6 no6Var, File file) {
        this.d = wy1Var;
        this.b = no6Var;
        this.c = file;
    }

    @Override // yc8, ed8
    public final void F() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        r47 threadMessage;
        String str;
        zu1 zu1Var;
        ChatActivityEnterView chatActivityEnterView = this.d.g2;
        ou1 ou1Var = chatActivityEnterView.K3;
        if (ou1Var != null && (zu1Var = chatActivityEnterView.E3) != null && ou1Var.f) {
            zu1Var.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        q7a q7aVar = new q7a();
        no6 no6Var = this.b;
        if (no6Var.b || (str = no6Var.h) == null) {
            String str2 = no6Var.I;
            if (str2 != null) {
                q7aVar.c = str2;
            }
        } else {
            q7aVar.c = str;
        }
        q7aVar.e = no6Var.c;
        q7aVar.p = no6Var.d();
        q7aVar.o = no6Var.b;
        q7aVar.q = no6Var.j();
        q7aVar.z = no6Var.m;
        q7aVar.A = no6Var.P;
        CharSequence charSequence = no6Var.a;
        q7aVar.d = charSequence != null ? charSequence.toString() : null;
        q7aVar.i = no6Var.n;
        q7aVar.j = no6Var.r;
        q7aVar.h = no6Var.x;
        q7aVar.k = oecVar;
        q7aVar.r = true;
        arrayList.add(q7aVar);
        no6Var.e();
        this.a = true;
        boolean h = r7a.h(q7aVar.d);
        k5 k5Var = chatActivityEnterView.S;
        b77 b77Var = null;
        long j = chatActivityEnterView.F3;
        r47 r47Var = chatActivityEnterView.I3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        ou1 ou1Var2 = chatActivityEnterView.K3;
        r47 r47Var2 = chatActivityEnterView.O2;
        zu1 zu1Var2 = chatActivityEnterView.E3;
        c5a X6 = zu1Var2 != null ? zu1Var2.X6() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        zu1 zu1Var3 = chatActivityEnterView.E3;
        if (zu1Var3 != null) {
            b77Var = zu1Var3.y5;
        }
        r7a.W(k5Var, arrayList, j, r47Var, threadMessage, null, ou1Var2, false, false, r47Var2, null, z, i2, i3, h, null, X6, 0L, false, 0L, sendMonoForumPeerId, b77Var, null, false);
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.x(null, true, i2, i3, 0L);
        }
    }

    @Override // yc8, ed8
    public final boolean h() {
        return false;
    }
}
