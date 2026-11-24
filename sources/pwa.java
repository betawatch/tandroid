// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pwa implements jm7 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ my0[] b;

    public pwa(boolean[] zArr, my0[] my0VarArr) {
        this.a = zArr;
        this.b = my0VarArr;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        my0 my0Var;
        if (i == nm7.C3 && this.a[0] && (my0Var = this.b[0]) != null) {
            my0Var.dismiss();
        }
    }
}
