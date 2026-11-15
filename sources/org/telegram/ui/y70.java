package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ y70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new g50(9, launchActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new g50(5, launchActivity, tLObject));
                break;
        }
    }
}
