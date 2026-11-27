// default package

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
