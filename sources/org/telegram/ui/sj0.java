package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj0 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasskeysActivity b;

    public /* synthetic */ sj0(PasskeysActivity passkeysActivity, int i10) {
        this.a = i10;
        this.b = passkeysActivity;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        PasskeysActivity passkeysActivity = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = passkeysActivity.b;
                passkeysActivity.addPasskeyRow = -1;
                String L0 = org.telegram.messenger.cd.L0(2131747645, null);
                org.telegram.ui.Components.a51 a51Var = new org.telegram.ui.Components.a51(2);
                a51Var.l = L0;
                a51Var.k = R.raw.passkey;
                arrayList.add(a51Var);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i11);
                    f50 f50Var = new f50(passkeysActivity, 16);
                    int i12 = uj0.b;
                    org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(uj0.class);
                    K.G = passkey;
                    K.D = f50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.l0) passkeysActivity.getMessagesController().y7.z.a).c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.a51 c10 = org.telegram.ui.Components.a51.c(-1, R.drawable.menu_passkey_add, org.telegram.messenger.cd.L0(2131747666, null));
                    c10.q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131747651, null), new mg0(passkeysActivity, 4)), true)));
                break;
            default:
                PasskeysActivity.Y(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
