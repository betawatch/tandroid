// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qf6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sf6 b;

    public /* synthetic */ qf6(sf6 sf6Var, byte b) {
        this.a = b;
        this.b = sf6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        sf6 sf6Var = this.b;
        switch (b) {
            case 0:
                s09 s09Var = sf6Var.e;
                s09Var.getAnimatedDrawable().I(0, false, false);
                s09Var.d();
                xe6 xe6Var = sf6Var.a;
                if (xe6Var != null) {
                    xe6Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                sf6Var.x = false;
                while (true) {
                    gl2[] gl2VarArr = sf6Var.a.f;
                    if (i >= gl2VarArr.length) {
                        break;
                    } else {
                        gl2VarArr[i].A(0.0f);
                        i++;
                    }
                }
            case 2:
                sf6Var.postDelayed(new qf6(sf6Var, (byte) 3), 150L);
                qf6 qf6Var = sf6Var.y;
                sf6Var.removeCallbacks(qf6Var);
                sf6Var.postDelayed(qf6Var, 3000L);
                sf6Var.x = true;
                break;
            default:
                xe6 xe6Var2 = sf6Var.a;
                xe6Var2.e = false;
                xe6Var2.f[0].requestFocus();
                while (true) {
                    gl2[] gl2VarArr2 = xe6Var2.f;
                    if (i >= gl2VarArr2.length) {
                        break;
                    } else {
                        gl2VarArr2[i].A(0.0f);
                        i++;
                    }
                }
        }
    }
}
