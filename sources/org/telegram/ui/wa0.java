package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ wa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ce0 ce0Var, boolean z9) {
        this.a = i7;
        this.b = ce0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_boolTrue;
                final ce0 ce0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z9) {
                    org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ce0Var.C1(false, true);
                    ce0Var.p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i7 = 0;
                    final boolean z10 = this.e;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xa0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    ce0Var.y1(bundle, auth_sentcode, z10);
                                    break;
                                default:
                                    ce0Var.y1(bundle, auth_sentcode, z10);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final ce0 ce0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z11) {
                    org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ce0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ce0Var2.C1(false, true);
                    ce0Var2.p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z12 = this.e;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xa0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ce0Var2.y1(bundle2, auth_sentcode2, z12);
                                    break;
                                default:
                                    ce0Var2.y1(bundle2, auth_sentcode2, z12);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
