// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pz3 implements View.OnFocusChangeListener {
    public final /* synthetic */ o24 a;

    public pz3(o24 o24Var) {
        this.a = o24Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = hl.F0();
            o24 o24Var = this.a;
            o24Var.X0 = F0;
            ls6.d0(o24Var.d1).O(o24Var.X0, false);
        }
    }
}
