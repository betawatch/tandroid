package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ xa0(int i7, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ee0 ee0Var, boolean z10) {
        this.a = i7;
        this.b = ee0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ee0 ee0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z10) {
                    org.telegram.messenger.a8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ee0Var.K1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ee0Var.C1(false, true);
                    ee0Var.r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i7 = 0;
                    final boolean z11 = this.e;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ya0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    ee0Var.y1(bundle, auth_sentcode, z11);
                                    break;
                                default:
                                    ee0Var.y1(bundle, auth_sentcode, z11);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ee0 ee0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z12) {
                    org.telegram.messenger.a8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ee0Var2.K1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ee0Var2.C1(false, true);
                    ee0Var2.r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z13 = this.e;
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.ya0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ee0Var2.y1(bundle2, auth_sentcode2, z13);
                                    break;
                                default:
                                    ee0Var2.y1(bundle2, auth_sentcode2, z13);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
