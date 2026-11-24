// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sva extends mu1 {
    public final /* synthetic */ boolean wd;
    public final /* synthetic */ bwa xd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sva(bwa bwaVar, Bundle bundle, boolean z) {
        super(bundle);
        this.xd = bwaVar;
        this.wd = z;
    }

    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.wd) {
            return;
        }
        this.xd.show();
    }
}
