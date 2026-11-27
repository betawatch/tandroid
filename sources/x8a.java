// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class x8a implements View.OnClickListener {
    public final /* synthetic */ f9a a;

    public x8a(f9a f9aVar) {
        this.a = f9aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e29 e29Var = this.a.n1;
        if (e29Var.b() || e29Var.getAnimatedDrawable() == null) {
            return;
        }
        e29Var.getAnimatedDrawable().H(40);
        e29Var.d();
    }
}
