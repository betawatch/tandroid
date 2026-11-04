package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ t70(LaunchActivity launchActivity, int i3) {
        this.a = i3;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new ly(18, launchActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new ly(14, launchActivity, tLObject));
                break;
        }
    }
}
