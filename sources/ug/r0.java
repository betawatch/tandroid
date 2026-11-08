package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ r0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.b.invalidate();
                w0Var.I0();
                break;
            default:
                w0 w0Var2 = this.b;
                w0Var2.b.invalidate();
                w0Var2.I0();
                break;
        }
    }
}
