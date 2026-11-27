// default package

import android.os.Bundle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vza extends zu1 {
    public final /* synthetic */ boolean Jd;
    public final /* synthetic */ e0b Kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vza(e0b e0bVar, Bundle bundle, boolean z) {
        super(bundle);
        this.Kd = e0bVar;
        this.Jd = z;
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Jd) {
            return;
        }
        this.Kd.show();
    }
}
