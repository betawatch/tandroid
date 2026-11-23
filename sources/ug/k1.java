package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.u5;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        u0 u0Var = l1Var.w;
        ImageReceiver imageReceiver2 = l1Var.c;
        ImageReceiver imageReceiver3 = l1Var.d;
        if (l1Var.s) {
            imageReceiver2.r0(fc.b(l1Var.r), null, u5.f(l1Var.r, n6.a7, 0.5f, null), "webp", null, 1);
            if (fj.X3(l1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.u0(fc.d(fj.F1(l1Var.r), l1Var.r), "140_140", null, null, "tgs", null, 1);
                if (!l1Var.e) {
                    if (l1Var.h == 0.0f) {
                        l1Var.h = 1.0f;
                        if (imageReceiver.C() != null) {
                            imageReceiver.C().N(0, false, false);
                        }
                    }
                    if (imageReceiver.C() != null) {
                        imageReceiver.C().start();
                    }
                    if (imageReceiver.C() != null && imageReceiver.C().A() && u0Var.v3) {
                        org.telegram.messenger.g0.r(u0Var.m3);
                        org.telegram.messenger.g0.h3(u0Var.m3, 0L);
                    }
                } else if (imageReceiver.C() != null) {
                    imageReceiver.C().stop();
                }
                if (l1Var.f) {
                    if (imageReceiver2.C() != null) {
                        imageReceiver2.C().stop();
                    }
                } else if (imageReceiver2.C() != null) {
                    imageReceiver2.C().start();
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
                                float f12 = u0Var.s3 * 0.45f;
                                float f13 = 1.499267f * f12;
                                float measuredWidth = getMeasuredWidth() - f13;
                                float measuredHeight = (getMeasuredHeight() - f13) / 2.0f;
                                float f14 = f13 - f12;
                                imageReceiver2.z0((f14 - (0.02f * f13)) + measuredWidth, (f14 / 2.0f) + measuredHeight, f12, f12);
                                imageReceiver2.setAlpha((l1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.h(canvas, null);
                                if (l1Var.h == 0.0f) {
                                    imageReceiver.z0(measuredWidth, measuredHeight, f13, f13);
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
                        float f122 = u0Var.s3 * 0.45f;
                        float f132 = 1.499267f * f122;
                        float measuredWidth2 = getMeasuredWidth() - f132;
                        float measuredHeight2 = (getMeasuredHeight() - f132) / 2.0f;
                        float f142 = f132 - f122;
                        imageReceiver2.z0((f142 - (0.02f * f132)) + measuredWidth2, (f142 / 2.0f) + measuredHeight2, f122, f122);
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
                float f1222 = u0Var.s3 * 0.45f;
                float f1322 = 1.499267f * f1222;
                float measuredWidth22 = getMeasuredWidth() - f1322;
                float measuredHeight22 = (getMeasuredHeight() - f1322) / 2.0f;
                float f1422 = f1322 - f1222;
                imageReceiver2.z0((f1422 - (0.02f * f1322)) + measuredWidth22, (f1422 / 2.0f) + measuredHeight22, f1222, f1222);
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
        float f12222 = u0Var.s3 * 0.45f;
        float f13222 = 1.499267f * f12222;
        float measuredWidth222 = getMeasuredWidth() - f13222;
        float measuredHeight222 = (getMeasuredHeight() - f13222) / 2.0f;
        float f14222 = f13222 - f12222;
        imageReceiver2.z0((f14222 - (0.02f * f13222)) + measuredWidth222, (f14222 / 2.0f) + measuredHeight222, f12222, f12222);
        imageReceiver2.setAlpha((l1Var.n * 0.7f) + 0.3f);
        imageReceiver2.h(canvas, null);
        if (l1Var.h == 0.0f) {
        }
    }
}
