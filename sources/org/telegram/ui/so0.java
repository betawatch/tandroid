package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ so0(up0 up0Var, int i10) {
        this.a = i10;
        this.b = up0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                up0 up0Var = this.b;
                up0Var.r = false;
                up0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    up0Var.x0();
                    up0Var.finishFragment();
                    up0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
