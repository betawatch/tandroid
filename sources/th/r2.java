package th;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh.w6 b;

    public /* synthetic */ r2(vh.w6 w6Var, int i10) {
        this.a = i10;
        this.b = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                this.b.onBackPressed();
                break;
        }
    }
}
