// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tob extends rc2 {
    public final GestureDetector Ld;
    public final km Md;
    public final km Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ uob Pd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tob(uob uobVar, Context context, int i, ylb ylbVar, Context context2, int i2) {
        super(context, i, false, null, ylbVar);
        this.Pd = uobVar;
        this.Od = i2;
        this.Ld = new GestureDetector(context2, new rm3(this, (byte) 2));
        d53 d53Var = d53.g;
        this.Md = new km(this, 180L, d53Var, 0);
        this.Nd = new km(this, 180L, d53Var, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        int v02;
        k47 messageObject = getMessageObject();
        km kmVar = this.Nd;
        km kmVar2 = this.Md;
        pc0 pc0Var = this.B7;
        if (messageObject == null || getMessageObject().e1 < 0) {
            kmVar2.a(pc0Var.b(), false);
            boolean z = pc0Var.g;
            int i = pc0Var.e;
            if (z) {
                amb i2 = cmb.I.i(false);
                i = cmb.B(cmb.I, i2 != null ? i2.c : 0, i);
            }
            kmVar.a(i, false);
        } else {
            int i3 = getMessageObject().e1;
            if (i3 >= 14) {
                fc7 fc7Var = oc7.r1(z8c.t0).E3;
                ec7 d = fc7Var != null ? fc7Var.d(i3) : null;
                if (d != null) {
                    int f = d.f();
                    v0 = cmb.v0(cmb.o8[pc0.e(f)], this.cc);
                    v02 = cmb.v0(cmb.p8[pc0.e(f)], this.cc);
                } else {
                    long j = i3;
                    v0 = cmb.v0(cmb.o8[pc0.d(j)], this.cc);
                    v02 = cmb.v0(cmb.p8[pc0.d(j)], this.cc);
                }
            } else {
                long j2 = i3;
                v0 = cmb.v0(cmb.o8[pc0.d(j2)], this.cc);
                v02 = cmb.v0(cmb.p8[pc0.d(j2)], this.cc);
            }
            pc0Var.h(kmVar2.a(v0, false), kmVar.a(v02, false));
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().i0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - gm.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().q0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.Od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // rc2, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ld.onTouchEvent(motionEvent);
        return true;
    }
}
