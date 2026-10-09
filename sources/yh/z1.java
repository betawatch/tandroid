package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ z1(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final s3 s3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                s3.b0(s3Var, tLObject, tL_error);
                                break;
                            default:
                                s3.A0(s3Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final s3 s3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                s3.b0(s3Var2, tLObject, tL_error);
                                break;
                            default:
                                s3.A0(s3Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
