// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
