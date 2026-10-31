package org.telegram.ui;

import android.widget.Toast;
import java.util.List;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wc implements ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;

    public wc(xc xcVar, int i10) {
        this.b = xcVar;
        this.a = i10;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.messenger.zs.f(this.a).d(new h0(17, this, (List) obj));
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
