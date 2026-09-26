package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vj0 implements t9 {
    public final /* synthetic */ wj0 a;

    public vj0(wj0 wj0Var) {
        this.a = wj0Var;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final void K(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(26));
        } else {
            i10 = ((org.telegram.ui.ActionBar.e3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(18));
        }
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void onDismiss() {
    }
}
