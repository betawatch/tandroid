// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vf6 b;

    public /* synthetic */ tf6(vf6 vf6Var, byte b) {
        this.a = b;
        this.b = vf6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        vf6 vf6Var = this.b;
        switch (b) {
            case 0:
                e29 e29Var = vf6Var.e;
                e29Var.getAnimatedDrawable().I(0, false, false);
                e29Var.d();
                bf6 bf6Var = vf6Var.a;
                if (bf6Var != null) {
                    bf6Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                vf6Var.x = false;
                while (true) {
                    ok2[] ok2VarArr = vf6Var.a.f;
                    if (i >= ok2VarArr.length) {
                        break;
                    } else {
                        ok2VarArr[i].A(0.0f);
                        i++;
                    }
                }
            case 2:
                vf6Var.postDelayed(new tf6(vf6Var, (byte) 3), 150L);
                tf6 tf6Var = vf6Var.y;
                vf6Var.removeCallbacks(tf6Var);
                vf6Var.postDelayed(tf6Var, 3000L);
                vf6Var.x = true;
                break;
            default:
                bf6 bf6Var2 = vf6Var.a;
                bf6Var2.e = false;
                bf6Var2.f[0].requestFocus();
                while (true) {
                    ok2[] ok2VarArr2 = bf6Var2.f;
                    if (i >= ok2VarArr2.length) {
                        break;
                    } else {
                        ok2VarArr2[i].A(0.0f);
                        i++;
                    }
                }
        }
    }
}
