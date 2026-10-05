package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class to0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;

    public /* synthetic */ to0(wp0 wp0Var, int i10) {
        this.a = i10;
        this.b = wp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.b.I;
                if (i1Var != null) {
                    i1Var.E(num.intValue());
                    break;
                }
                break;
            default:
                wp0 wp0Var = this.b;
                wp0Var.r = false;
                wp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    wp0Var.x0();
                    wp0Var.finishFragment();
                    wp0Var.D0();
                    break;
                }
                break;
        }
    }
}
