package vh;

import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.ew0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e2 extends j2 {
    public final /* synthetic */ k2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(k2 k2Var) {
        super(k2Var);
        this.y = k2Var;
    }

    @Override // vh.j2
    public final void F(boolean z10) {
        k2 k2Var = this.y;
        org.telegram.ui.ActionBar.t0 t0Var = k2Var.G;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
        k2Var.s.e(z10, true);
    }

    @Override // s4.g0
    public final void f() {
        ew0 ew0Var = this.y.s;
        super.f();
        if (TextUtils.isEmpty(this.f)) {
            ew0Var.setStickerType(11);
            ew0Var.d.setText(dd.L0(2131745777, null));
        } else {
            ew0Var.setStickerType(1);
            ew0Var.d.setText(dd.a0(null, null, 2131748182, this.f));
        }
    }
}
