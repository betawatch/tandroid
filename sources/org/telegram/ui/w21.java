package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w21 implements t9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public w21(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.t9
    public final void K(String str) {
        String b10 = of.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(28));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new xb(this.b, 4));
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String K0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void W0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void onDismiss() {
    }
}
