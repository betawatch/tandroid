package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f1(y3 y3Var, long j3, long j10, Utilities.Callback callback, long j11) {
        this.b = y3Var;
        this.c = j3;
        this.d = j10;
        this.f = callback;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p1(this.b, (org.telegram.ui.ActionBar.b2) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new p1(this.b, tLObject, this.c, this.d, (Utilities.Callback) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ f1(y3 y3Var, org.telegram.ui.ActionBar.b2 b2Var, long j3, long j10, long j11) {
        this.b = y3Var;
        this.f = b2Var;
        this.c = j3;
        this.d = j10;
        this.e = j11;
    }
}
