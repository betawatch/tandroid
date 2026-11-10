package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ za0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, fe0 fe0Var, boolean z9) {
        this.a = i7;
        this.b = fe0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_boolTrue;
                final fe0 fe0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z9) {
                    org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    fe0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    fe0Var.C1(false, true);
                    fe0Var.p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i7 = 0;
                    final boolean z10 = this.e;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ab0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    fe0Var.y1(bundle, auth_sentcode, z10);
                                    break;
                                default:
                                    fe0Var.y1(bundle, auth_sentcode, z10);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final fe0 fe0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z11) {
                    org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    fe0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    fe0Var2.C1(false, true);
                    fe0Var2.p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z12 = this.e;
                    org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ab0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    fe0Var2.y1(bundle2, auth_sentcode2, z12);
                                    break;
                                default:
                                    fe0Var2.y1(bundle2, auth_sentcode2, z12);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
