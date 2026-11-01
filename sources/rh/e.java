package rh;

import android.app.Activity;
import org.telegram.messenger.ch;
import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hf;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(i iVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = iVar;
        this.e = twoStepVerificationActivity;
        this.f = activity;
        this.b = z10;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new ch((i) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject, 4));
                break;
            default:
                org.telegram.messenger.i0.g3(new hf((th.e5) this.d, tL_error, this.b, this.c, (r20) this.e, (org.telegram.ui.ActionBar.p6) this.f));
                break;
        }
    }

    public /* synthetic */ e(th.e5 e5Var, boolean z10, long j10, r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = e5Var;
        this.b = z10;
        this.c = j10;
        this.e = r20Var;
        this.f = p6Var;
    }
}
