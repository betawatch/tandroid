// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
