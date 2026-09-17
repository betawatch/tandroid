package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
