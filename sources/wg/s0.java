package wg;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i7) {
        this.a = i7;
        this.b = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.a2.clear();
                w0Var.U1.d.b(true);
                w0Var.o1(true, false);
                break;
            default:
                this.b.j1(false);
                break;
        }
    }
}
