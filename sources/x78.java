// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x78 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(ik8.E(2.0f, this.a, TLObject.FLAG_30), ik8.E(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i) {
        this.a = i;
    }
}
