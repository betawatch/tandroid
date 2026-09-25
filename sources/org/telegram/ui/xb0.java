package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xb0 extends w21 {
    public xb0(Bundle bundle) {
        super(bundle);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new c10(this, 16));
    }
}
