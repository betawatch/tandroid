// default package

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ye6 extends ViewSwitcher {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye6(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), TLObject.FLAG_31));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), TLObject.FLAG_31));
                break;
        }
    }
}
