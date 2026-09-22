package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ qd0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, yg0 yg0Var, boolean z10) {
        this.a = i10;
        this.b = yg0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final yg0 yg0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z10) {
                    FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    yg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    yg0Var.k1(false, true);
                    yg0Var.o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sd0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    yg0Var.g1(bundle, auth_sentcode, z11);
                                    break;
                                default:
                                    yg0Var.g1(bundle, auth_sentcode, z11);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final yg0 yg0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z12) {
                    FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    yg0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    yg0Var2.k1(false, true);
                    yg0Var2.o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i11 = 0;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sd0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    yg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    break;
                                default:
                                    yg0Var2.g1(bundle2, auth_sentcode2, z13);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
