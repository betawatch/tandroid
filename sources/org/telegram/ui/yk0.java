package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ yk0(PasskeysActivity passkeysActivity, int i10) {
        this.a = i10;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.w41 w41Var = new org.telegram.ui.Components.w41(2);
                w41Var.l = string;
                w41Var.k = i11;
                arrayList.add(w41Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i12);
                    t50 t50Var = new t50(passkeysActivity, 15);
                    int i13 = bl0.a;
                    org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(bl0.class);
                    J.G = passkey;
                    J.D = t50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.w41 c3 = org.telegram.ui.Components.w41.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c3.q = true;
                    arrayList.add(c3);
                }
                arrayList.add(org.telegram.ui.Components.w41.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new vk0(passkeysActivity, 1)), true)));
                break;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
