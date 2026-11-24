// default package

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y04 extends a4c {
    public final /* synthetic */ e34 b;

    public y04(e34 e34Var) {
        this.b = e34Var;
    }

    @Override // a4c
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // a4c
    public final String[] b() {
        return this.b.X0;
    }

    @Override // a4c
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // a4c
    public final boolean d(t3c t3cVar, MotionEvent motionEvent) {
        hx2 e = hx2.e();
        e34 e34Var = this.b;
        e34Var.getMeasuredHeight();
        return e.g(motionEvent, t3cVar, e34Var.h2, e34Var.a2);
    }

    @Override // a4c
    public final boolean e(t3c t3cVar, s19 s19Var, MotionEvent motionEvent) {
        hx2 e = hx2.e();
        e34 e34Var = this.b;
        e34Var.getMeasuredHeight();
        return e.h(motionEvent, t3cVar, s19Var, e34Var.h2, e34Var.a2);
    }

    @Override // a4c
    public final void f(int i, Object obj, TLRPC.Document document, boolean z) {
        this.b.u1.x(null, document, null, obj, null, z, i);
    }

    @Override // a4c
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        e34 e34Var = this.b;
        e34Var.u1.q(stickerSetCovered);
        if (z) {
            e34Var.Y(true);
        }
    }

    @Override // a4c
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.i(stickerSetCovered);
    }

    @Override // a4c
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
