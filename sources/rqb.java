// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rqb extends wb2 {
    public final GestureDetector Ld;
    public final ll Md;
    public final ll Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ sqb Pd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqb(sqb sqbVar, Context context, int i, vnb vnbVar, Context context2, int i2) {
        super(context, i, false, null, vnbVar);
        this.Pd = sqbVar;
        this.Od = i2;
        this.Ld = new GestureDetector(context2, new yl3(this, (byte) 2));
        k43 k43Var = k43.g;
        this.Md = new ll(this, 180L, k43Var, 0);
        this.Nd = new ll(this, 180L, k43Var, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        int v02;
        r47 messageObject = getMessageObject();
        ll llVar = this.Nd;
        ll llVar2 = this.Md;
        rb0 rb0Var = this.B7;
        if (messageObject == null || getMessageObject().e1 < 0) {
            llVar2.a(rb0Var.b(), false);
            boolean z = rb0Var.g;
            int i = rb0Var.e;
            if (z) {
                ynb i2 = aob.I.i(false);
                i = aob.B(aob.I, i2 != null ? i2.c : 0, i);
            }
            llVar.a(i, false);
        } else {
            int i3 = getMessageObject().e1;
            if (i3 >= 14) {
                lc7 lc7Var = uc7.s1(yac.t0).E3;
                kc7 d = lc7Var != null ? lc7Var.d(i3) : null;
                if (d != null) {
                    int f = d.f();
                    v0 = aob.v0(aob.p8[rb0.e(f)], this.cc);
                    v02 = aob.v0(aob.q8[rb0.e(f)], this.cc);
                } else {
                    long j = i3;
                    v0 = aob.v0(aob.p8[rb0.d(j)], this.cc);
                    v02 = aob.v0(aob.q8[rb0.d(j)], this.cc);
                }
            } else {
                long j2 = i3;
                v0 = aob.v0(aob.p8[rb0.d(j2)], this.cc);
                v02 = aob.v0(aob.q8[rb0.d(j2)], this.cc);
            }
            rb0Var.h(llVar2.a(v0, false), llVar.a(v02, false));
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().i0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - hl.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().q0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.Od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override // wb2, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.Ld.onTouchEvent(motionEvent);
        return true;
    }
}
