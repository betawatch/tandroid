// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qi extends hq7 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(Context context, vnb vnbVar, int[] iArr) {
        super(context, vnbVar);
        this.z0 = iArr;
    }

    @Override // hq7
    public final CharSequence d(int i) {
        int i2 = this.z0[i];
        return i2 == 0 ? ob6.M0(2131753842, null) : i2 < 10080 ? ob6.G(i2 / 1440, "Days", new Object[0]) : i2 < 44640 ? ob6.G(i2 / 1440, "Weeks", new Object[0]) : i2 < 525600 ? ob6.G(i2 / 10080, "Months", new Object[0]) : ob6.G(((i2 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
