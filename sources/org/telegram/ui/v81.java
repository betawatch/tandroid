package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ v81(i91 i91Var, int i10) {
        this.a = i10;
        this.b = i91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.Y2.N(true);
                break;
            case 1:
                of.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl));
                break;
            case 2:
                i91 i91Var = this.b;
                i91Var.c.postOnAnimation(new v81(i91Var, 3));
                break;
            case 3:
                this.b.i0();
                break;
            default:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
        }
    }
}
