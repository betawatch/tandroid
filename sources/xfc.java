// default package

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xfc extends zm2 {
    public final /* synthetic */ yfc E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfc(yfc yfcVar, Drawable drawable, Drawable drawable2) {
        super(drawable, drawable2);
        this.E = yfcVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        yfc yfcVar = this.E;
        boolean z = yfcVar.d;
        float f = yfcVar.N;
        if (z) {
            super.setBounds(i, (int) (i2 - f), i3, i4);
        } else {
            super.setBounds(i, i2, i3, (int) (i4 + f));
        }
    }
}
