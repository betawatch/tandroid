package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tj0 implements w9 {
    public final /* synthetic */ uj0 a;

    public tj0(uj0 uj0Var) {
        this.a = uj0Var;
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.w9
    public final void K(String str) {
        int i10;
        String b10 = ze.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(27));
        } else {
            i10 = ((org.telegram.ui.ActionBar.g3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new nh.e(12));
        }
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ void onDismiss() {
    }
}
