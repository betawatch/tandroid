package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v21 implements t9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public v21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(27));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new xb(this.b, 4));
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
