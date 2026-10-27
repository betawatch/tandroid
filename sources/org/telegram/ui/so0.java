package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ so0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
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
                tp0 tp0Var = this.b;
                tp0Var.r = false;
                tp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    tp0Var.y0();
                    tp0Var.finishFragment();
                    tp0Var.E0();
                    break;
                }
                break;
        }
    }
}
