package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ z70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new q10(13, launchActivity, (TL_account.Password) tLObject));
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new q10(9, launchActivity, tLObject));
                break;
        }
    }
}
