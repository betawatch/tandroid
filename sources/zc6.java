// default package

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
