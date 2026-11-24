// default package

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rva extends ProfileActivity {
    public final /* synthetic */ boolean b7;
    public final /* synthetic */ bwa c7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rva(bwa bwaVar, Bundle bundle, boolean z) {
        super(bundle, null);
        this.c7 = bwaVar;
        this.b7 = z;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.b7) {
            return;
        }
        this.c7.show();
    }
}
