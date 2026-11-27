// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
