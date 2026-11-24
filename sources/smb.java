// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class smb extends gb2 {
    public final GestureDetector Ld;
    public final kl Md;
    public final kl Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ tmb Pd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smb(tmb tmbVar, Context context, int i, wjb wjbVar, Context context2, int i2) {
        super(context, i, false, null, wjbVar);
        this.Pd = tmbVar;
        this.Od = i2;
        this.Ld = new GestureDetector(context2, new gl3(this, (byte) 2));
        s33 s33Var = s33.g;
        this.Md = new kl(this, 180L, s33Var, 0);
        this.Nd = new kl(this, 180L, s33Var, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        int v02;
        k27 messageObject = getMessageObject();
        kl klVar = this.Nd;
        kl klVar2 = this.Md;
        pb0 pb0Var = this.B7;
        if (messageObject == null || getMessageObject().e1 < 0) {
            klVar2.a(pb0Var.b(), false);
            boolean z = pb0Var.g;
            int i = pb0Var.e;
            if (z) {
                zjb i2 = bkb.I.i(false);
                i = bkb.B(bkb.I, i2 != null ? i2.c : 0, i);
            }
            klVar.a(i, false);
        } else {
            int i3 = getMessageObject().e1;
            if (i3 >= 14) {
                ea7 ea7Var = na7.q1(y6c.t0).E3;
                da7 d = ea7Var != null ? ea7Var.d(i3) : null;
                if (d != null) {
                    int f = d.f();
                    v0 = bkb.v0(bkb.o8[pb0.e(f)], this.cc);
                    v02 = bkb.v0(bkb.p8[pb0.e(f)], this.cc);
                } else {
                    long j = i3;
                    v0 = bkb.v0(bkb.o8[pb0.d(j)], this.cc);
                    v02 = bkb.v0(bkb.p8[pb0.d(j)], this.cc);
                }
            } else {
                long j2 = i3;
                v0 = bkb.v0(bkb.o8[pb0.d(j2)], this.cc);
                v02 = bkb.v0(bkb.p8[pb0.d(j2)], this.cc);
            }
            pb0Var.h(klVar2.a(v0, false), klVar.a(v02, false));
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().i0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - gl.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().q0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.Od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // gb2, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ld.onTouchEvent(motionEvent);
        return true;
    }
}
