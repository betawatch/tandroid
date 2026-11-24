// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rd6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ td6 b;

    public /* synthetic */ rd6(td6 td6Var, byte b) {
        this.a = b;
        this.b = td6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        td6 td6Var = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = td6Var.e;
                ry8Var.getAnimatedDrawable().I(0, false, false);
                ry8Var.d();
                yc6 yc6Var = td6Var.a;
                if (yc6Var != null) {
                    yc6Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                td6Var.x = false;
                while (true) {
                    sj2[] sj2VarArr = td6Var.a.f;
                    if (i >= sj2VarArr.length) {
                        break;
                    } else {
                        sj2VarArr[i].A(0.0f);
                        i++;
                    }
                }
            case 2:
                td6Var.postDelayed(new rd6(td6Var, (byte) 3), 150L);
                rd6 rd6Var = td6Var.y;
                td6Var.removeCallbacks(rd6Var);
                td6Var.postDelayed(rd6Var, 3000L);
                td6Var.x = true;
                break;
            default:
                yc6 yc6Var2 = td6Var.a;
                yc6Var2.e = false;
                yc6Var2.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr2 = yc6Var2.f;
                    if (i >= sj2VarArr2.length) {
                        break;
                    } else {
                        sj2VarArr2[i].A(0.0f);
                        i++;
                    }
                }
        }
    }
}
