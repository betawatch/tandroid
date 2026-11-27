// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s2a extends b3a {
    public final /* synthetic */ t2a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2a(t2a t2aVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.L = t2aVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = hl.L(78.0f) + getMeasuredHeight();
        t2a t2aVar = this.L;
        t2aVar.k2 = L;
        t2aVar.j2.G();
    }
}
