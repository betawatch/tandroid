package wg;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
