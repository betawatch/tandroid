package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o1 extends View {
    public final /* synthetic */ p1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, Context context) {
        super(context);
        this.a = p1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        boolean z10;
        boolean z11;
        super.draw(canvas);
        p1 p1Var = this.a;
        v0 v0Var = p1Var.v;
        ImageReceiver imageReceiver2 = p1Var.c;
        ImageReceiver imageReceiver3 = p1Var.d;
        if (p1Var.s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(p1Var.r), null, DocumentObject.getSvgThumb(p1Var.r, j6.a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(p1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(p1Var.r), p1Var.r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                if (!p1Var.e) {
                    if (p1Var.h == 0.0f) {
                        p1Var.h = 1.0f;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().N(0, false, false);
                        }
                    }
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().A() && v0Var.n3) {
                        AndroidUtilities.cancelRunOnUIThread(v0Var.e3);
                        AndroidUtilities.runOnUIThread(v0Var.e3, 0L);
                    }
                } else if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().stop();
                }
                if (p1Var.f) {
                    if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().start();
                }
                z10 = p1Var.f;
                if (z10) {
                    float f7 = p1Var.n;
                    if (f7 != 1.0f) {
                        p1Var.n = f7 + 0.10666667f;
                        invalidate();
                        p1Var.n = Utilities.clamp(p1Var.n, 1.0f, 0.0f);
                        z11 = p1Var.e;
                        if (z11) {
                            float f10 = p1Var.h;
                            if (f10 != 1.0f) {
                                p1Var.h = f10 + 0.10666667f;
                                invalidate();
                                p1Var.h = Utilities.clamp(p1Var.h, 1.0f, 0.0f);
                                float f11 = v0Var.k3 * 0.45f;
                                float f12 = 1.499267f * f11;
                                float measuredWidth = getMeasuredWidth() - f12;
                                float measuredHeight = (getMeasuredHeight() - f12) / 2.0f;
                                float f13 = f12 - f11;
                                imageReceiver2.setImageCoords((f13 - (0.02f * f12)) + measuredWidth, (f13 / 2.0f) + measuredHeight, f11, f11);
                                imageReceiver2.setAlpha((p1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.draw(canvas);
                                if (p1Var.h == 0.0f) {
                                    imageReceiver.setImageCoords(measuredWidth, measuredHeight, f12, f12);
                                    imageReceiver.setAlpha(p1Var.h);
                                    imageReceiver.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f14 = p1Var.h;
                            if (f14 != 0.0f) {
                                p1Var.h = f14 - 0.10666667f;
                                invalidate();
                            }
                        }
                        p1Var.h = Utilities.clamp(p1Var.h, 1.0f, 0.0f);
                        float f112 = v0Var.k3 * 0.45f;
                        float f122 = 1.499267f * f112;
                        float measuredWidth2 = getMeasuredWidth() - f122;
                        float measuredHeight2 = (getMeasuredHeight() - f122) / 2.0f;
                        float f132 = f122 - f112;
                        imageReceiver2.setImageCoords((f132 - (0.02f * f122)) + measuredWidth2, (f132 / 2.0f) + measuredHeight2, f112, f112);
                        imageReceiver2.setAlpha((p1Var.n * 0.7f) + 0.3f);
                        imageReceiver2.draw(canvas);
                        if (p1Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f15 = p1Var.n;
                    if (f15 != 0.0f) {
                        p1Var.n = f15 - 0.10666667f;
                        invalidate();
                    }
                }
                p1Var.n = Utilities.clamp(p1Var.n, 1.0f, 0.0f);
                z11 = p1Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                p1Var.h = Utilities.clamp(p1Var.h, 1.0f, 0.0f);
                float f1122 = v0Var.k3 * 0.45f;
                float f1222 = 1.499267f * f1122;
                float measuredWidth22 = getMeasuredWidth() - f1222;
                float measuredHeight22 = (getMeasuredHeight() - f1222) / 2.0f;
                float f1322 = f1222 - f1122;
                imageReceiver2.setImageCoords((f1322 - (0.02f * f1222)) + measuredWidth22, (f1322 / 2.0f) + measuredHeight22, f1122, f1122);
                imageReceiver2.setAlpha((p1Var.n * 0.7f) + 0.3f);
                imageReceiver2.draw(canvas);
                if (p1Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!p1Var.e) {
        }
        if (p1Var.f) {
        }
        z10 = p1Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        p1Var.n = Utilities.clamp(p1Var.n, 1.0f, 0.0f);
        z11 = p1Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        p1Var.h = Utilities.clamp(p1Var.h, 1.0f, 0.0f);
        float f11222 = v0Var.k3 * 0.45f;
        float f12222 = 1.499267f * f11222;
        float measuredWidth222 = getMeasuredWidth() - f12222;
        float measuredHeight222 = (getMeasuredHeight() - f12222) / 2.0f;
        float f13222 = f12222 - f11222;
        imageReceiver2.setImageCoords((f13222 - (0.02f * f12222)) + measuredWidth222, (f13222 / 2.0f) + measuredHeight222, f11222, f11222);
        imageReceiver2.setAlpha((p1Var.n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (p1Var.h == 0.0f) {
        }
    }
}
