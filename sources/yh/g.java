package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(52.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(g0.L(68.0f), TLObject.FLAG_30));
                break;
        }
    }
}
