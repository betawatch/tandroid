// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s2b extends y0b {
    public final /* synthetic */ t2b P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2b(t2b t2bVar, Context context, ylb ylbVar) {
        super(ylbVar, context, false);
        this.P = t2bVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        x2b x2bVar = this.P.r;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(x2bVar.I1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(x2bVar.I1, TLObject.FLAG_30));
    }
}
