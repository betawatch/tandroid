package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm0 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn0 b;

    public /* synthetic */ rm0(rn0 rn0Var, int i10) {
        this.a = i10;
        this.b = rn0Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                hk hkVar = this.b.I;
                if (hkVar != null) {
                    hkVar.E(num.intValue());
                    break;
                }
                break;
            default:
                rn0 rn0Var = this.b;
                rn0Var.r = false;
                rn0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    rn0Var.C0();
                    rn0Var.finishFragment();
                    rn0Var.I0();
                    break;
                }
                break;
        }
    }
}
