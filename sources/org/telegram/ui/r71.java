package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f81 b;

    public /* synthetic */ r71(f81 f81Var, int i10) {
        this.a = i10;
        this.b = f81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                qf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            default:
                this.b.c.g3.O(true);
                break;
        }
    }
}
