package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rj0 implements u9 {
    public final /* synthetic */ sj0 a;

    public rj0(sj0 sj0Var) {
        this.a = sj0Var;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String G0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void K(String str) {
        int i10;
        String b10 = af.g.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(27));
        } else {
            i10 = ((org.telegram.ui.ActionBar.g3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new nh.e(12));
        }
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void S0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
