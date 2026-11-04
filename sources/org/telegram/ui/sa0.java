package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ sa0(int i3, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, xd0 xd0Var, boolean z10) {
        this.a = i3;
        this.b = xd0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final xd0 xd0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z10) {
                    org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    xd0Var.B1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    xd0Var.t1(false, true);
                    xd0Var.q0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i3 = 0;
                    final boolean z11 = this.e;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ta0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    xd0Var.p1(bundle, auth_sentcode, z11);
                                    break;
                                default:
                                    xd0Var.p1(bundle, auth_sentcode, z11);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final xd0 xd0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z12) {
                    org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    xd0Var2.B1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    xd0Var2.t1(false, true);
                    xd0Var2.q0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z13 = this.e;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ta0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    xd0Var2.p1(bundle2, auth_sentcode2, z13);
                                    break;
                                default:
                                    xd0Var2.p1(bundle2, auth_sentcode2, z13);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
