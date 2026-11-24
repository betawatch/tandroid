// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tt5 extends o39 {
    public final /* synthetic */ xt5 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(xt5 xt5Var, Context context) {
        super(context, null);
        this.f3 = xt5Var;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.t1) {
            return;
        }
        super.requestLayout();
    }
}
