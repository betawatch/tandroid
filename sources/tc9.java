// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tc9 extends b8 {
    public final int W;
    public long a0;
    public rc9 b0;

    public tc9(int i, vnb vnbVar, Context context) {
        super(0, vnbVar, context, false, false);
        this.W = i;
        setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        c(aob.E8, aob.F8);
        setIconColor(-1);
        this.c.setTranslationX(hl.L(2.0f));
        this.c.setScaleX(1.2f);
        this.c.setScaleY(1.2f);
        a(2);
        setBackground(null);
        this.c.addOnAttachStateChangeListener(new xc(this, (byte) 14));
    }

    @Override // b8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = hl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
    }
}
