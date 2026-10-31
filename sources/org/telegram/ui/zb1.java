package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb1 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zb1(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.b = z10;
        this.c = z11;
        this.e = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.b, this.c, (Runnable) this.e));
                break;
            default:
                org.telegram.messenger.i0.g3(new ig.k0((th.e5) this.d, this.b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.c));
                break;
        }
    }

    public /* synthetic */ zb1(th.e5 e5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = e5Var;
        this.b = z10;
        this.e = tL_stories_getAllStories;
        this.c = z11;
    }
}
