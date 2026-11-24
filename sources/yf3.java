// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
