// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wh4 extends View {
    public final /* synthetic */ byte a;
    public final byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wh4(Context context, int i, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = i;
                super(context);
                break;
            default:
                this.b = i;
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(this.b), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(this.b), TLObject.FLAG_30));
                break;
        }
    }
}
