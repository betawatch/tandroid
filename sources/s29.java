// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s29 extends bf0 {
    public final /* synthetic */ byte H;
    public final /* synthetic */ t29 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s29(t29 t29Var, Context context, byte b) {
        super(context);
        this.H = b;
        this.I = t29Var;
    }

    @Override // bf0
    public final ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new r29(this, (byte) 0);
            case 1:
                return new r29(this, (byte) 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                t29 t29Var = this.I;
                s29 s29Var = t29Var.b;
                super.dispatchDraw(canvas);
                if (this.a.y() != null && !t29Var.F) {
                    this.a.y().start();
                }
                if (t29Var.s && !t29Var.w && this.a.y() != null && this.a.y().v() && s29Var.a.y() != null && s29Var.a.y().p()) {
                    t29Var.w = true;
                    s29Var.a.y().I(0, false, true);
                    s29Var.setVisibility(0);
                    Runnable runnable = t29Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    gm.c3(new pp8(this, (byte) 17));
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
        t29 t29Var = this.I;
        switch (b) {
            case 0:
                v29 v29Var = t29Var.Q;
                if (!oi5.c(this, v29Var)) {
                    super.invalidate();
                    v29Var.invalidate();
                    break;
                }
                break;
            case 1:
                if (!oi5.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                t29Var.Q.invalidate();
                break;
        }
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 1:
                this.I.a();
                super.onDraw(canvas);
                break;
            case 2:
                vm vmVar = this.e;
                ImageReceiver imageReceiver = vmVar != null ? vmVar.k : this.a;
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
                if (!oi5.c(this)) {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
                break;
            case 1:
                if (!oi5.c(this)) {
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
                v29 v29Var = this.I.Q;
                if (!oi5.c(this, v29Var)) {
                    super.invalidate(rect);
                    v29Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }
}
