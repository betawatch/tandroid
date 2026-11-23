package wg;

import org.telegram.messenger.w10;
import org.telegram.ui.Wallet.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            default:
                d1 d1Var = this.b;
                d1Var.j2 = (String) obj;
                o5 o5Var = d1Var.q2;
                org.telegram.messenger.g0.r(o5Var);
                org.telegram.messenger.g0.h3(o5Var, 350L);
                break;
        }
    }
}
