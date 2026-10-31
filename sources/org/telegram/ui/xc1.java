package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc1 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ xc1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (i10) {
            case 0:
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.ii iiVar = userInfoActivity.y;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                }
                userInfoActivity.f0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.K != chat) {
                    userInfoActivity.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.m5.n(null, 2131751234, org.telegram.ui.Components.cc.a0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.f0(true);
                    org.telegram.ui.Components.ii iiVar2 = userInfoActivity.y;
                    if (iiVar2 != null) {
                        iiVar2.f3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
