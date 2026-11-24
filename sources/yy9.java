// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yy9 extends hz9 {
    public final /* synthetic */ zy9 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy9(zy9 zy9Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.L = zy9Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = gl.L(78.0f) + getMeasuredHeight();
        zy9 zy9Var = this.L;
        zy9Var.k2 = L;
        zy9Var.j2.G();
    }
}
