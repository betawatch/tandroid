package rh;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ t2(p3 p3Var, a aVar, int i10) {
        this.a = i10;
        this.b = p3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View z12 = this.b.z1(this.c);
                if (z12 instanceof t5) {
                    t5 t5Var = (t5) z12;
                    t5Var.B();
                    t5Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.d3(this.c);
                break;
            case 2:
                this.b.d3(this.c);
                break;
            case 3:
                this.b.e3(this.c);
                break;
            case 4:
                this.b.d3(this.c);
                break;
            default:
                this.b.d3(this.c);
                break;
        }
    }
}
