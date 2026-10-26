package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ qo0(rp0 rp0Var, int i10) {
        this.a = i10;
        this.b = rp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                fi.h1 h1Var = this.b.I;
                if (h1Var != null) {
                    h1Var.E(num.intValue());
                    break;
                }
                break;
            default:
                rp0 rp0Var = this.b;
                rp0Var.r = false;
                rp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    rp0Var.y0();
                    rp0Var.finishFragment();
                    rp0Var.E0();
                    break;
                }
                break;
        }
    }
}
