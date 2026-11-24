// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class unc extends soc {
    public final /* synthetic */ goc m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unc(goc gocVar, Context context) {
        super(context);
        this.m0 = gocVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        goc gocVar = this.m0;
        if (gocVar.r <= 0 || getMeasuredHeight() <= gocVar.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, gocVar.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), 0);
    }

    @Override // soc
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        goc gocVar = this.m0;
        gocVar.Z0(gocVar.A0);
        gocVar.a1(fArr);
    }
}
