// default package

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uza extends ProfileActivity {
    public final /* synthetic */ boolean b7;
    public final /* synthetic */ e0b c7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uza(e0b e0bVar, Bundle bundle, boolean z) {
        super(bundle, null);
        this.c7 = e0bVar;
        this.b7 = z;
    }

    @Override // org.telegram.ui.ProfileActivity, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.b7) {
            return;
        }
        this.c7.show();
    }
}
