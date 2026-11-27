// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sg3 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ sg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.Q1 = (Long) obj;
                uj3Var.q5();
                break;
            default:
                uj3Var.q4((TL_account.TL_birthday) obj);
                break;
        }
    }
}
