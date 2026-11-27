// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qk8 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xk8 b;

    public /* synthetic */ qk8(xk8 xk8Var, byte b) {
        this.a = b;
        this.b = xk8Var;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        xk8 xk8Var = this.b;
        switch (b) {
            case 0:
                xk8Var.b.invalidate();
                xk8Var.E0();
                break;
            default:
                xk8Var.b.invalidate();
                xk8Var.E0();
                break;
        }
    }
}
