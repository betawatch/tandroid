// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pi extends hn7 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(Context context, wjb wjbVar, int[] iArr) {
        super(context, wjbVar);
        this.z0 = iArr;
    }

    @Override // hn7
    public final CharSequence d(int i) {
        int i2 = this.z0[i];
        return i2 == 0 ? k96.M0(2131753846, null) : i2 < 10080 ? k96.G(i2 / 1440, "Days", new Object[0]) : i2 < 44640 ? k96.G(i2 / 1440, "Weeks", new Object[0]) : i2 < 525600 ? k96.G(i2 / 10080, "Months", new Object[0]) : k96.G(((i2 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
