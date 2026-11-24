// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class tlc extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hmc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tlc(hmc hmcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = hmcVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                hmcVar.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gl.L(24.0f)), TLObject.FLAG_30), 0);
                setMeasuredDimension(size, gl.L(36.0f) + hmcVar.a0.getMeasuredHeight());
                break;
            default:
                hmcVar.e.measure(i, 0);
                setMeasuredDimension(View.MeasureSpec.getSize(i), hmcVar.e.getMeasuredHeight());
                break;
        }
    }
}
