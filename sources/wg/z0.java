package wg;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ z0(e1 e1Var, int i7) {
        this.a = i7;
        this.b = e1Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            default:
                e1 e1Var = this.b;
                e1Var.j2 = (String) obj;
                s4.s0 s0Var = e1Var.q2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                break;
        }
    }
}
