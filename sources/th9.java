// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
