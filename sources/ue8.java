// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ue8 extends gb2 {
    public final /* synthetic */ byte Ld;
    public final /* synthetic */ int Md;
    public final /* synthetic */ int Nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue8(Context context, int i, wjb wjbVar, int i2, int i3, byte b) {
        super(context, i, false, null, wjbVar);
        this.Ld = b;
        this.Md = i2;
        this.Nd = i3;
    }

    @Override // gb2
    public final void j1(Canvas canvas) {
        switch (this.Ld) {
            case 0:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                break;
            default:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                break;
        }
    }

    @Override // gb2, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.Ld) {
            case 0:
                setMeasuredDimension(this.Md, this.Nd);
                break;
            default:
                setMeasuredDimension(this.Md, this.Nd);
                break;
        }
    }

    @Override // gb2, android.view.View
    public final void setPressed(boolean z) {
        byte b = this.Ld;
    }

    private final void h4(boolean z) {
    }

    private final void i4(boolean z) {
    }
}
