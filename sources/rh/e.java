package rh;

import android.app.Activity;
import org.telegram.messenger.bh;
import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hf;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                org.telegram.messenger.i0.g3(new bh((i) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f, this.b, this.c, tLObject, 4));
                break;
            default:
                org.telegram.messenger.i0.g3(new hf((th.e5) this.d, tL_error, this.b, this.c, (q20) this.e, (org.telegram.ui.ActionBar.p6) this.f));
                break;
        }
    }

    public /* synthetic */ e(th.e5 e5Var, boolean z10, long j10, q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = e5Var;
        this.b = z10;
        this.c = j10;
        this.e = q20Var;
        this.f = p6Var;
    }
}
