package zf;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b0 extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
                break;
        }
    }
}
