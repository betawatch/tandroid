package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq0 b;

    public /* synthetic */ zo0(bq0 bq0Var, int i10) {
        this.a = i10;
        this.b = bq0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                bq0 bq0Var = this.b;
                bq0Var.r = false;
                bq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    bq0Var.x0();
                    bq0Var.finishFragment();
                    bq0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                di.i1 i1Var = this.b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
