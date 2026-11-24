// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class vlc extends smc {
    public final /* synthetic */ hmc m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlc(hmc hmcVar, Context context) {
        super(context);
        this.m0 = hmcVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        hmc hmcVar = this.m0;
        if (hmcVar.r <= 0 || getMeasuredHeight() <= hmcVar.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, hmcVar.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), 0);
    }

    @Override // smc
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        hmc hmcVar = this.m0;
        hmcVar.Y0(hmcVar.A0);
        hmcVar.Z0(fArr);
    }
}
