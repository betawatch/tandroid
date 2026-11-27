// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
