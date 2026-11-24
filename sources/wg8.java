// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wg8 extends rc2 {
    public final /* synthetic */ byte Ld;
    public final /* synthetic */ int Md;
    public final /* synthetic */ int Nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg8(Context context, int i, ylb ylbVar, int i2, int i3, byte b) {
        super(context, i, false, null, ylbVar);
        this.Ld = b;
        this.Md = i2;
        this.Nd = i3;
    }

    @Override // rc2
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

    @Override // rc2, android.view.View
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

    @Override // rc2, android.view.View
    public final void setPressed(boolean z) {
        byte b = this.Ld;
    }

    private final void h4(boolean z) {
    }

    private final void i4(boolean z) {
    }
}
