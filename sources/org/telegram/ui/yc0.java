package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ yc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ig0 ig0Var, boolean z10) {
        this.a = i10;
        this.b = ig0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z10) {
                    FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ig0Var.w1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ig0Var.o1(false, true);
                    ig0Var.o0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z11 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ad0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ig0Var.k1(bundle, auth_sentcode, z11);
                                    break;
                                default:
                                    ig0Var.k1(bundle, auth_sentcode, z11);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final ig0 ig0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z12) {
                    FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ig0Var2.w1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ig0Var2.o1(false, true);
                    ig0Var2.o0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i11 = 0;
                    final boolean z13 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ad0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ig0Var2.k1(bundle2, auth_sentcode2, z13);
                                    break;
                                default:
                                    ig0Var2.k1(bundle2, auth_sentcode2, z13);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
