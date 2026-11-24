// default package

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oz3 extends a2c {
    public final /* synthetic */ t14 b;

    public oz3(t14 t14Var) {
        this.b = t14Var;
    }

    @Override // a2c
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override // a2c
    public final String[] b() {
        return this.b.X0;
    }

    @Override // a2c
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override // a2c
    public final boolean d(t1c t1cVar, MotionEvent motionEvent) {
        xv2 e = xv2.e();
        t14 t14Var = this.b;
        t14Var.getMeasuredHeight();
        return e.g(motionEvent, t1cVar, t14Var.h2, t14Var.a2);
    }

    @Override // a2c
    public final boolean e(t1c t1cVar, f09 f09Var, MotionEvent motionEvent) {
        xv2 e = xv2.e();
        t14 t14Var = this.b;
        t14Var.getMeasuredHeight();
        return e.h(motionEvent, t1cVar, f09Var, t14Var.h2, t14Var.a2);
    }

    @Override // a2c
    public final void f(int i, Object obj, TLRPC.Document document, boolean z) {
        this.b.u1.x(null, document, null, obj, null, z, i);
    }

    @Override // a2c
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        t14 t14Var = this.b;
        t14Var.u1.q(stickerSetCovered);
        if (z) {
            t14Var.Y(true);
        }
    }

    @Override // a2c
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.i(stickerSetCovered);
    }

    @Override // a2c
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}
