package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ u21(SessionsActivity sessionsActivity, int i7) {
        this.a = i7;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f = connectedbots.connected_bots;
                    if (sessionsActivity.a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.a.f();
                        break;
                    }
                }
                break;
            default:
                SessionsActivity.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
