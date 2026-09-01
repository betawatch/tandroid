package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tj0 implements u9 {
    public final /* synthetic */ uj0 a;

    public tj0(uj0 uj0Var) {
        this.a = uj0Var;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void J(String str) {
        int i10;
        String b10 = af.g.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(29));
        } else {
            i10 = ((org.telegram.ui.ActionBar.h3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ag.d(13));
        }
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
