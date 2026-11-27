// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
