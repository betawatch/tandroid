// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pj extends lp7 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(Context context, ylb ylbVar, int[] iArr) {
        super(context, ylbVar);
        this.z0 = iArr;
    }

    @Override // lp7
    public final CharSequence d(int i) {
        int i2 = this.z0[i];
        return i2 == 0 ? jb6.M0(2131753814, null) : i2 < 10080 ? jb6.G(i2 / 1440, "Days", new Object[0]) : i2 < 44640 ? jb6.G(i2 / 1440, "Weeks", new Object[0]) : i2 < 525600 ? jb6.G(i2 / 10080, "Months", new Object[0]) : jb6.G(((i2 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
