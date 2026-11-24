// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qg3 implements hk3, cv2 {
    public final /* synthetic */ ug3 a;

    public /* synthetic */ qg3(ug3 ug3Var) {
        this.a = ug3Var;
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    @Override // cv2
    public final void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j = ((bf7) arrayList.get(0)).a;
        if (!pg3.D(j)) {
            return true;
        }
        ug3 ug3Var = this.a;
        ug3Var.q0(ug3Var.getMessagesController().W1(Long.valueOf(j)));
        return true;
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }
}
