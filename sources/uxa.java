// default package

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uxa extends ProfileActivity {
    public final /* synthetic */ boolean g7;
    public final /* synthetic */ eya h7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxa(eya eyaVar, Bundle bundle, boolean z) {
        super(bundle, null);
        this.h7 = eyaVar;
        this.g7 = z;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.g7) {
            return;
        }
        this.h7.show();
    }
}
