package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
