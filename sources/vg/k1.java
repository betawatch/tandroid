package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.t5;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k1 extends View {
    public final /* synthetic */ l1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, Context context) {
        super(context);
        this.a = l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        boolean z10;
        boolean z11;
        super.draw(canvas);
        l1 l1Var = this.a;
        r0 r0Var = l1Var.w;
        ImageReceiver imageReceiver2 = l1Var.c;
        ImageReceiver imageReceiver3 = l1Var.d;
        if (l1Var.s) {
            imageReceiver2.q0(ac.b(l1Var.r), null, t5.f(l1Var.r, k6.a7, 0.5f, null), "webp", null, 1);
            if (zi.Y3(l1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.t0(ac.d(zi.G1(l1Var.r), l1Var.r), "140_140", null, null, "tgs", null, 1);
                if (!l1Var.e) {
                    if (l1Var.h == 0.0f) {
                        l1Var.h = 1.0f;
                        if (imageReceiver.B() != null) {
                            imageReceiver.B().N(0, false, false);
                        }
                    }
                    if (imageReceiver.B() != null) {
                        imageReceiver.B().start();
                    }
                    if (imageReceiver.B() != null && imageReceiver.B().A() && r0Var.v3) {
                        org.telegram.messenger.g0.r(r0Var.m3);
                        org.telegram.messenger.g0.i3(r0Var.m3, 0L);
                    }
                } else if (imageReceiver.B() != null) {
                    imageReceiver.B().stop();
                }
                if (l1Var.f) {
                    if (imageReceiver2.B() != null) {
                        imageReceiver2.B().stop();
                    }
                } else if (imageReceiver2.B() != null) {
                    imageReceiver2.B().start();
                }
                z10 = l1Var.f;
                if (z10) {
                    float f10 = l1Var.n;
                    if (f10 != 1.0f) {
                        l1Var.n = f10 + 0.10666667f;
                        invalidate();
                        l1Var.n = Utilities.i(l1Var.n, 1.0f, 0.0f);
                        z11 = l1Var.e;
                        if (z11) {
                            float f11 = l1Var.h;
                            if (f11 != 1.0f) {
                                l1Var.h = f11 + 0.10666667f;
                                invalidate();
                                l1Var.h = Utilities.i(l1Var.h, 1.0f, 0.0f);
                                float f12 = r0Var.s3 * 0.45f;
                                float f13 = 1.499267f * f12;
                                float measuredWidth = getMeasuredWidth() - f13;
                                float measuredHeight = (getMeasuredHeight() - f13) / 2.0f;
                                float f14 = f13 - f12;
                                imageReceiver2.y0((f14 - (0.02f * f13)) + measuredWidth, (f14 / 2.0f) + measuredHeight, f12, f12);
                                imageReceiver2.setAlpha((l1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.h(canvas, null);
                                if (l1Var.h == 0.0f) {
                                    imageReceiver.y0(measuredWidth, measuredHeight, f13, f13);
                                    imageReceiver.setAlpha(l1Var.h);
                                    imageReceiver.h(canvas, null);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f15 = l1Var.h;
                            if (f15 != 0.0f) {
                                l1Var.h = f15 - 0.10666667f;
                                invalidate();
                            }
                        }
                        l1Var.h = Utilities.i(l1Var.h, 1.0f, 0.0f);
                        float f122 = r0Var.s3 * 0.45f;
                        float f132 = 1.499267f * f122;
                        float measuredWidth2 = getMeasuredWidth() - f132;
                        float measuredHeight2 = (getMeasuredHeight() - f132) / 2.0f;
                        float f142 = f132 - f122;
                        imageReceiver2.y0((f142 - (0.02f * f132)) + measuredWidth2, (f142 / 2.0f) + measuredHeight2, f122, f122);
                        imageReceiver2.setAlpha((l1Var.n * 0.7f) + 0.3f);
                        imageReceiver2.h(canvas, null);
                        if (l1Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f16 = l1Var.n;
                    if (f16 != 0.0f) {
                        l1Var.n = f16 - 0.10666667f;
                        invalidate();
                    }
                }
                l1Var.n = Utilities.i(l1Var.n, 1.0f, 0.0f);
                z11 = l1Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                l1Var.h = Utilities.i(l1Var.h, 1.0f, 0.0f);
                float f1222 = r0Var.s3 * 0.45f;
                float f1322 = 1.499267f * f1222;
                float measuredWidth22 = getMeasuredWidth() - f1322;
                float measuredHeight22 = (getMeasuredHeight() - f1322) / 2.0f;
                float f1422 = f1322 - f1222;
                imageReceiver2.y0((f1422 - (0.02f * f1322)) + measuredWidth22, (f1422 / 2.0f) + measuredHeight22, f1222, f1222);
                imageReceiver2.setAlpha((l1Var.n * 0.7f) + 0.3f);
                imageReceiver2.h(canvas, null);
                if (l1Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!l1Var.e) {
        }
        if (l1Var.f) {
        }
        z10 = l1Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        l1Var.n = Utilities.i(l1Var.n, 1.0f, 0.0f);
        z11 = l1Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        l1Var.h = Utilities.i(l1Var.h, 1.0f, 0.0f);
        float f12222 = r0Var.s3 * 0.45f;
        float f13222 = 1.499267f * f12222;
        float measuredWidth222 = getMeasuredWidth() - f13222;
        float measuredHeight222 = (getMeasuredHeight() - f13222) / 2.0f;
        float f14222 = f13222 - f12222;
        imageReceiver2.y0((f14222 - (0.02f * f13222)) + measuredWidth222, (f14222 / 2.0f) + measuredHeight222, f12222, f12222);
        imageReceiver2.setAlpha((l1Var.n * 0.7f) + 0.3f);
        imageReceiver2.h(canvas, null);
        if (l1Var.h == 0.0f) {
        }
    }
}
