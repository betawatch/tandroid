// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
