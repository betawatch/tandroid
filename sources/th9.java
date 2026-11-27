// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi9 b;
    public final /* synthetic */ mk0 c;

    public /* synthetic */ th9(pi9 pi9Var, mk0 mk0Var, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = mk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mk0 mk0Var = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                View D1 = pi9Var.D1(mk0Var);
                if (D1 instanceof km9) {
                    km9 km9Var = (km9) D1;
                    km9Var.A();
                    km9Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                pi9Var.a3(mk0Var);
                break;
            case 2:
                pi9Var.a3(mk0Var);
                break;
            case 3:
                pi9Var.b3(mk0Var);
                break;
            case 4:
                pi9Var.a3(mk0Var);
                break;
            default:
                pi9Var.a3(mk0Var);
                break;
        }
    }
}
