// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ad6 b;

    public /* synthetic */ uc6(ad6 ad6Var, byte b) {
        this.a = b;
        this.b = ad6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        int i2 = 0;
        r4 = false;
        r4 = false;
        boolean z = false;
        ad6 ad6Var = this.b;
        switch (b) {
            case 0:
                ad6Var.o();
                break;
            case 1:
                ad6Var.postDelayed(new uc6(ad6Var, (byte) 2), 150L);
                uc6 uc6Var = ad6Var.T;
                ad6Var.removeCallbacks(uc6Var);
                ad6Var.postDelayed(uc6Var, 3000L);
                ad6Var.S = true;
                break;
            case 2:
                yc6 yc6Var = ad6Var.a;
                yc6Var.e = false;
                yc6Var.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr = yc6Var.f;
                    if (i >= sj2VarArr.length) {
                        break;
                    } else {
                        sj2VarArr[i].A(0.0f);
                        i++;
                    }
                }
            case 3:
                ad6Var.postDelayed(new uc6(ad6Var, (byte) 5), 150L);
                break;
            case 4:
                zc6 zc6Var = ad6Var.R;
                ad6Var.S = false;
                int i3 = 0;
                while (true) {
                    sj2[] sj2VarArr2 = ad6Var.a.f;
                    if (i3 >= sj2VarArr2.length) {
                        if (zc6Var.getCurrentView() != ad6Var.e) {
                            zc6Var.showNext();
                            FrameLayout frameLayout = ad6Var.h;
                            if (ad6Var.f.getVisibility() != 0 && ad6Var.a0.G != 3 && !ad6Var.Q) {
                                z = true;
                            }
                            gl.T3(frameLayout, z, 1.0f, true, true);
                            break;
                        }
                    } else {
                        sj2VarArr2[i3].A(0.0f);
                        i3++;
                    }
                }
                break;
            case 5:
                yc6 yc6Var2 = ad6Var.a;
                yc6Var2.e = false;
                yc6Var2.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr3 = yc6Var2.f;
                    if (i2 >= sj2VarArr3.length) {
                        break;
                    } else {
                        sj2VarArr3[i2].A(0.0f);
                        i2++;
                    }
                }
            case 6:
                ad6Var.p(true);
                break;
            case 7:
                ad6Var.q();
                break;
            default:
                ry8 ry8Var = ad6Var.x;
                ry8Var.getAnimatedDrawable().I(0, false, false);
                ry8Var.d();
                yc6 yc6Var3 = ad6Var.a;
                if (yc6Var3 != null && yc6Var3.f != null) {
                    yc6Var3.setText("");
                    yc6Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
