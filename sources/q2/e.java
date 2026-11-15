package q2;

import android.os.Handler;
import h2.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
