package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r11 implements q9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public r11(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.q9
    public final void J(String str) {
        String b10 = ye.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new ef0(4));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new rb(this.b, 4));
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ boolean d1(String str, i9 i9Var) {
        return false;
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ void S0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ void onDismiss() {
    }
}
