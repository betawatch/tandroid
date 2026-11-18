package wg;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ y0(d1 d1Var, int i7) {
        this.a = i7;
        this.b = d1Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.b.dismiss();
                break;
            default:
                d1 d1Var = this.b;
                d1Var.j2 = (String) obj;
                s4.s0 s0Var = d1Var.q2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                break;
        }
    }
}
