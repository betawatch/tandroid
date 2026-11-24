// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q09 extends be0 {
    public final /* synthetic */ byte H;
    public final /* synthetic */ r09 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q09(r09 r09Var, Context context, byte b) {
        super(context);
        this.H = b;
        this.I = r09Var;
    }

    @Override // be0
    public final ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new p09(this, (byte) 0);
            case 1:
                return new p09(this, (byte) 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                r09 r09Var = this.I;
                q09 q09Var = r09Var.b;
                super.dispatchDraw(canvas);
                if (this.a.y() != null && !r09Var.F) {
                    this.a.y().start();
                }
                if (r09Var.s && !r09Var.w && this.a.y() != null && this.a.y().v() && q09Var.a.y() != null && q09Var.a.y().p()) {
                    r09Var.w = true;
                    q09Var.a.y().I(0, false, true);
                    q09Var.setVisibility(0);
                    Runnable runnable = r09Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    gl.d3(new sr8(this, (byte) 9));
                }
                invalidate();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.H;
        r09 r09Var = this.I;
        switch (b) {
            case 0:
                t09 t09Var = r09Var.Q;
                if (!pg5.c(this, t09Var)) {
                    super.invalidate();
                    t09Var.invalidate();
                    break;
                }
                break;
            case 1:
                if (!pg5.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                r09Var.Q.invalidate();
                break;
        }
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 1:
                this.I.a();
                super.onDraw(canvas);
                break;
            case 2:
                vl vlVar = this.e;
                ImageReceiver imageReceiver = vlVar != null ? vlVar.k : this.a;
                if (imageReceiver != null && imageReceiver.y() != null) {
                    imageReceiver.y().start();
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        switch (this.H) {
            case 0:
                if (!pg5.c(this)) {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
                break;
            case 1:
                if (!pg5.c(this)) {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
                break;
            default:
                super.invalidate(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                t09 t09Var = this.I.Q;
                if (!pg5.c(this, t09Var)) {
                    super.invalidate(rect);
                    t09Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }
}
