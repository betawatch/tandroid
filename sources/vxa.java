// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vxa extends yv1 {
    public final /* synthetic */ boolean Gd;
    public final /* synthetic */ eya Hd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxa(eya eyaVar, Bundle bundle, boolean z) {
        super(bundle);
        this.Hd = eyaVar;
        this.Gd = z;
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Gd) {
            return;
        }
        this.Hd.show();
    }
}
