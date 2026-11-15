package q2;

import android.os.Handler;
import h2.l0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e implements m {
    public final k a;
    public h b;
    public boolean c;
    public final /* synthetic */ f d;

    public e(f fVar, k kVar) {
        this.d = fVar;
        this.a = kVar;
    }

    @Override // q2.m
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        l0.W(handler, new d(this, 0));
    }
}
