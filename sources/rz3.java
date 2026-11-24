// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rz3 extends u26 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz3(Context context, int i) {
        super(context);
        this.r = i;
    }

    @Override // u26
    public final int i(int i, int i2, int i3, int i4, int i5) {
        return super.i(i, i2, i3, i4, i5) + this.r;
    }

    @Override // u26
    public final int m(int i) {
        return super.m(i) << 4;
    }

    @Override // u26
    public final int p() {
        return -1;
    }
}
