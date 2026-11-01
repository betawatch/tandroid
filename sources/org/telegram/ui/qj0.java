package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj0 implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ qj0(PasskeysActivity passkeysActivity, int i10) {
        this.a = i10;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String L0 = org.telegram.messenger.dd.L0(2131747645, null);
                org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(2);
                b51Var.l = L0;
                b51Var.k = R.raw.passkey;
                arrayList.add(b51Var);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i11);
                    e50 e50Var = new e50(passkeysActivity, 16);
                    int i12 = sj0.b;
                    org.telegram.ui.Components.b51 K = org.telegram.ui.Components.b51.K(sj0.class);
                    K.G = passkey;
                    K.D = e50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.l0) passkeysActivity.getMessagesController().y7.z.a).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.b51 c10 = org.telegram.ui.Components.b51.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.dd.L0(2131747666, null));
                    c10.q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.b51.C(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131747651, null), new kg0(passkeysActivity, 4)), true)));
                break;
            default:
                PasskeysActivity.Z(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
