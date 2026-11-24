// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uh8 implements ee, oac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh8 b;

    public /* synthetic */ uh8(wh8 wh8Var, byte b) {
        this.a = b;
        this.b = wh8Var;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((c6c) obj).d == 1) {
            bjb bjbVar = (bjb) view;
            boolean z = !bjbVar.e.h;
            wh8 wh8Var = this.b;
            wh8Var.n = z;
            bjbVar.setChecked(z);
            wh8Var.d.g3.O(true);
            wh8Var.Z(true);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        wh8 wh8Var = this.b;
        switch (b) {
            case 0:
                wh8Var.d0();
                break;
            default:
                wh8Var.finishFragment();
                break;
        }
    }
}
