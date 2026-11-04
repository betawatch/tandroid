package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua1 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ ua1(UserInfoActivity userInfoActivity, int i3) {
        this.a = i3;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (i3) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                ai.h4 h4Var = userInfoActivity.y;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                }
                userInfoActivity.g0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.k5.o(null, 2131751234, org.telegram.ui.Components.fc.a0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.g0(true);
                    ai.h4 h4Var2 = userInfoActivity.y;
                    if (h4Var2 != null) {
                        h4Var2.g3.O(true);
                        break;
                    }
                }
                break;
        }
    }
}
