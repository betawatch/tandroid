package zh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ n4(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b;
                i5Var.R = false;
                i5Var.S = null;
                break;
            case 1:
                i5 i5Var2 = this.b;
                i5Var2.s = true;
                i5Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                i5 i5Var3 = this.b;
                i5Var3.R = false;
                i5Var3.S = null;
                break;
        }
    }
}
