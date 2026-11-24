// default package

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ty3 extends View {
    public in5[] a;
    public mm b;
    public gn c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        gn gnVar = this.c;
        if (gnVar == null) {
            return null;
        }
        TLRPC.Document document = gnVar.document;
        if (document != null) {
            return document;
        }
        return vm.e(z8c.t0, gnVar.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (z) {
                return;
            }
            float f = this.e;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new et1(this, (byte) 21));
                this.d.addListener(new kh2(this, (byte) 18));
                b10.n(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
