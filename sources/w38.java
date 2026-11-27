// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w38 extends d1a {
    public final /* synthetic */ a48 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w38(a48 a48Var, v38 v38Var) {
        super(v38Var);
        this.e = a48Var;
    }

    @Override // d1a, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
