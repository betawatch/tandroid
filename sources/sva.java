// default package

import android.os.Bundle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sva extends mu1 {
    public final /* synthetic */ boolean vd;
    public final /* synthetic */ bwa wd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sva(bwa bwaVar, Bundle bundle, boolean z) {
        super(bundle);
        this.wd = bwaVar;
        this.vd = z;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.vd) {
            return;
        }
        this.wd.show();
    }
}
