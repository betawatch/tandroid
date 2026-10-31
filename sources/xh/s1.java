package xh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ s1(m2 m2Var, int i10) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                e2 e2Var = this.b.D;
                if (e2Var != null) {
                    if (!bool.booleanValue()) {
                        e2Var.P = System.currentTimeMillis();
                        e2Var.x("secondary_button_pressed", null);
                        break;
                    } else {
                        e2Var.P = System.currentTimeMillis();
                        e2Var.x("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new vh.d1(23, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
