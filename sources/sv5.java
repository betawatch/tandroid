// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sv5 extends r59 {
    public final /* synthetic */ wv5 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv5(wv5 wv5Var, Context context) {
        super(context, null);
        this.f3 = wv5Var;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.t1) {
            return;
        }
        super.requestLayout();
    }
}
