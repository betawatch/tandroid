package vh;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ o5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.e1();
                break;
            default:
                this.b.h1();
                break;
        }
    }
}
