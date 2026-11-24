// default package

import java.io.File;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sz1 extends jb8 {
    public boolean a;
    public final /* synthetic */ jo6 b;
    public final /* synthetic */ File c;
    public final /* synthetic */ tz1 d;

    public sz1(tz1 tz1Var, jo6 jo6Var, File file) {
        this.d = tz1Var;
        this.b = jo6Var;
        this.c = file;
    }

    @Override // jb8, pb8
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        k47 threadMessage;
        String str;
        yv1 yv1Var;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        nv1 nv1Var = chatActivityEnterView.L3;
        if (nv1Var != null && (yv1Var = chatActivityEnterView.F3) != null && nv1Var.f) {
            yv1Var.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        z5a z5aVar = new z5a();
        jo6 jo6Var = this.b;
        if (jo6Var.b || (str = jo6Var.h) == null) {
            String str2 = jo6Var.I;
            if (str2 != null) {
                z5aVar.c = str2;
            }
        } else {
            z5aVar.c = str;
        }
        z5aVar.e = jo6Var.c;
        z5aVar.p = jo6Var.d();
        z5aVar.o = jo6Var.b;
        z5aVar.q = jo6Var.j();
        z5aVar.z = jo6Var.m;
        z5aVar.A = jo6Var.P;
        CharSequence charSequence = jo6Var.a;
        z5aVar.d = charSequence != null ? charSequence.toString() : null;
        z5aVar.i = jo6Var.n;
        z5aVar.j = jo6Var.r;
        z5aVar.h = jo6Var.x;
        z5aVar.k = rccVar;
        z5aVar.r = true;
        arrayList.add(z5aVar);
        jo6Var.e();
        this.a = true;
        boolean h = a6a.h(z5aVar.d);
        j5 j5Var = chatActivityEnterView.S;
        v67 v67Var = null;
        long j = chatActivityEnterView.G3;
        k47 k47Var = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        nv1 nv1Var2 = chatActivityEnterView.L3;
        k47 k47Var2 = chatActivityEnterView.P2;
        yv1 yv1Var2 = chatActivityEnterView.F3;
        l3a X6 = yv1Var2 != null ? yv1Var2.X6() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        yv1 yv1Var3 = chatActivityEnterView.F3;
        if (yv1Var3 != null) {
            v67Var = yv1Var3.y5;
        }
        a6a.W(j5Var, arrayList, j, k47Var, threadMessage, null, nv1Var2, false, false, k47Var2, null, z, i2, i3, h, null, X6, 0L, false, 0L, sendMonoForumPeerId, v67Var, null, false);
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.w(null, true, i2, i3, 0L);
        }
    }

    @Override // jb8, pb8
    public final boolean h() {
        return false;
    }
}
