package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc1 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoActivity b;

    public /* synthetic */ vc1(UserInfoActivity userInfoActivity, int i10) {
        this.a = i10;
        this.b = userInfoActivity;
    }

    @Override // org.telegram.messenger.r20
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
                userInfoActivity.g0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.K != chat) {
                    userInfoActivity.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.m5.n(null, 2131751234, org.telegram.ui.Components.cc.a0(userInfoActivity), R.raw.contact_check, 36);
                    }
                    userInfoActivity.g0(true);
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
