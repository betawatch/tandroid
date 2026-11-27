// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
