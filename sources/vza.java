// default package

import android.os.Bundle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
