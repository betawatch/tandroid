// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qk8 extends View {
    public final /* synthetic */ rk8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk8(rk8 rk8Var, Context context) {
        super(context);
        this.a = rk8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        boolean z;
        boolean z2;
        super.draw(canvas);
        rk8 rk8Var = this.a;
        fj8 fj8Var = rk8Var.w;
        ImageReceiver imageReceiver2 = rk8Var.c;
        ImageReceiver imageReceiver3 = rk8Var.d;
        if (rk8Var.s) {
            imageReceiver2.d0(gn5.b(rk8Var.r), null, eq3.f(rk8Var.r, cmb.Z6, 0.5f, null), "webp", null, 1);
            if (k47.W3(rk8Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.b0(gn5.d(k47.F1(rk8Var.r), rk8Var.r), "140_140", null, null, "tgs", null, 1);
                if (!rk8Var.e) {
                    if (rk8Var.h == 0.0f) {
                        rk8Var.h = 1.0f;
                        if (imageReceiver.y() != null) {
                            imageReceiver.y().I(0, false, false);
                        }
                    }
                    if (imageReceiver.y() != null) {
                        imageReceiver.y().start();
                    }
                    if (imageReceiver.y() != null && imageReceiver.y().v() && fj8Var.v3) {
                        gm.r(fj8Var.m3);
                        gm.d3(fj8Var.m3, 0L);
                    }
                } else if (imageReceiver.y() != null) {
                    imageReceiver.y().stop();
                }
                if (rk8Var.f) {
                    if (imageReceiver2.y() != null) {
                        imageReceiver2.y().stop();
                    }
                } else if (imageReceiver2.y() != null) {
                    imageReceiver2.y().start();
                }
                z = rk8Var.f;
                float f = rk8Var.n;
                if (z) {
                    if (f != 0.0f) {
                        rk8Var.n = f - 0.10666667f;
                        invalidate();
                    }
                } else if (f != 1.0f) {
                    rk8Var.n = f + 0.10666667f;
                    invalidate();
                }
                rk8Var.n = Utilities.i(rk8Var.n, 1.0f, 0.0f);
                z2 = rk8Var.e;
                float f2 = rk8Var.h;
                if (z2) {
                    if (f2 != 0.0f) {
                        rk8Var.h = f2 - 0.10666667f;
                        invalidate();
                    }
                } else if (f2 != 1.0f) {
                    rk8Var.h = f2 + 0.10666667f;
                    invalidate();
                }
                rk8Var.h = Utilities.i(rk8Var.h, 1.0f, 0.0f);
                float f3 = fj8Var.s3 * 0.45f;
                float f4 = 1.499267f * f3;
                float measuredWidth = getMeasuredWidth() - f4;
                float measuredHeight = (getMeasuredHeight() - f4) / 2.0f;
                float f5 = f4 - f3;
                imageReceiver2.i0((f5 - (0.02f * f4)) + measuredWidth, (f5 / 2.0f) + measuredHeight, f3, f3);
                imageReceiver2.setAlpha((rk8Var.n * 0.7f) + 0.3f);
                imageReceiver2.h(canvas, null);
                if (rk8Var.h == 0.0f) {
                    imageReceiver.i0(measuredWidth, measuredHeight, f4, f4);
                    imageReceiver.setAlpha(rk8Var.h);
                    imageReceiver.h(canvas, null);
                    return;
                }
                return;
            }
        }
        imageReceiver = imageReceiver3;
        if (!rk8Var.e) {
        }
        if (rk8Var.f) {
        }
        z = rk8Var.f;
        float f6 = rk8Var.n;
        if (z) {
        }
        rk8Var.n = Utilities.i(rk8Var.n, 1.0f, 0.0f);
        z2 = rk8Var.e;
        float f22 = rk8Var.h;
        if (z2) {
        }
        rk8Var.h = Utilities.i(rk8Var.h, 1.0f, 0.0f);
        float f32 = fj8Var.s3 * 0.45f;
        float f42 = 1.499267f * f32;
        float measuredWidth2 = getMeasuredWidth() - f42;
        float measuredHeight2 = (getMeasuredHeight() - f42) / 2.0f;
        float f52 = f42 - f32;
        imageReceiver2.i0((f52 - (0.02f * f42)) + measuredWidth2, (f52 / 2.0f) + measuredHeight2, f32, f32);
        imageReceiver2.setAlpha((rk8Var.n * 0.7f) + 0.3f);
        imageReceiver2.h(canvas, null);
        if (rk8Var.h == 0.0f) {
        }
    }
}
