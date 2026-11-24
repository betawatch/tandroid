// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wya extends r59 {
    public int f3;
    public final /* synthetic */ xza g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wya(xza xzaVar, Context context) {
        super(context, null);
        this.g3 = xzaVar;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        bza bzaVar;
        super.onMeasure(i, i2);
        if (this.f3 != getMeasuredHeight() && (bzaVar = this.g3.X) != null) {
            bzaVar.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
