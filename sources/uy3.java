// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uy3 implements View.OnFocusChangeListener {
    public final /* synthetic */ t14 a;

    public uy3(t14 t14Var) {
        this.a = t14Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = gl.F0();
            t14 t14Var = this.a;
            t14Var.X0 = F0;
            hq6.d0(t14Var.d1).O(t14Var.X0, false);
        }
    }
}
