// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pya implements fn7 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ nx0[] b;

    public pya(boolean[] zArr, nx0[] nx0VarArr) {
        this.a = zArr;
        this.b = nx0VarArr;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        nx0 nx0Var;
        if (i == jn7.C3 && this.a[0] && (nx0Var = this.b[0]) != null) {
            nx0Var.dismiss();
        }
    }
}
