// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ot4 extends vt4 {
    public final /* synthetic */ wt4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot4(wt4 wt4Var) {
        super(wt4Var);
        this.y = wt4Var;
    }

    @Override // vt4
    public final void F(boolean z) {
        wt4 wt4Var = this.y;
        s7 s7Var = wt4Var.H;
        if (s7Var != null) {
            s7Var.setShowSearchProgress(z);
        }
        wt4Var.s.e(z, true);
    }

    @Override // j79
    public final void f() {
        super.f();
        boolean isEmpty = TextUtils.isEmpty(this.f);
        z2b z2bVar = this.y.s;
        if (isEmpty) {
            z2bVar.setStickerType(11);
            z2bVar.d.setText(ob6.M0(2131745488, null));
        } else {
            z2bVar.setStickerType(1);
            z2bVar.d.setText(ob6.a0(null, null, 2131747897, this.f));
        }
    }
}
