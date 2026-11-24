// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class snc extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ snc(goc gocVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = gocVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                gocVar.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gm.L(24.0f)), TLObject.FLAG_30), 0);
                setMeasuredDimension(size, gm.L(36.0f) + gocVar.a0.getMeasuredHeight());
                break;
            default:
                gocVar.e.measure(i, 0);
                setMeasuredDimension(View.MeasureSpec.getSize(i), gocVar.e.getMeasuredHeight());
                break;
        }
    }
}
