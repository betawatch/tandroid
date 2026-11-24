// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v24 extends y0b {
    public final /* synthetic */ byte P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v24(Context context, boolean z, ylb ylbVar, byte b) {
        super(ylbVar, context, z);
        this.P = b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.P) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(82.0f), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(82.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(82.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(82.0f), TLObject.FLAG_30));
                break;
        }
    }
}
