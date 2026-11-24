// default package

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zc6 extends ViewSwitcher {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc6(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), TLObject.FLAG_31));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), TLObject.FLAG_31));
                break;
        }
    }
}
