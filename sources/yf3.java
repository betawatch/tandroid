// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf3 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ yf3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.Q1 = (Long) obj;
                cj3Var.m5();
                break;
            default:
                cj3Var.n4((TL_account.TL_birthday) obj);
                break;
        }
    }
}
