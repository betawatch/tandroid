package sg;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q1 extends View {
    public final /* synthetic */ r1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Context context) {
        super(context);
        this.a = r1Var;
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
        r1 r1Var = this.a;
        u0 u0Var = r1Var.v;
        ImageReceiver imageReceiver2 = r1Var.c;
        ImageReceiver imageReceiver3 = r1Var.d;
        if (r1Var.s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(r1Var.r), null, DocumentObject.getSvgThumb(r1Var.r, j6.a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(r1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(r1Var.r), r1Var.r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                if (!r1Var.e) {
                    if (r1Var.h == 0.0f) {
                        r1Var.h = 1.0f;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().L(0, false, false);
                        }
                    }
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().y() && u0Var.n3) {
                        AndroidUtilities.cancelRunOnUIThread(u0Var.e3);
                        AndroidUtilities.runOnUIThread(u0Var.e3, 0L);
                    }
                } else if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().stop();
                }
                if (r1Var.f) {
                    if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().start();
                }
                z10 = r1Var.f;
                if (z10) {
                    float f7 = r1Var.n;
                    if (f7 != 1.0f) {
                        r1Var.n = f7 + 0.10666667f;
                        invalidate();
                        r1Var.n = Utilities.clamp(r1Var.n, 1.0f, 0.0f);
                        z11 = r1Var.e;
                        if (z11) {
                            float f10 = r1Var.h;
                            if (f10 != 1.0f) {
                                r1Var.h = f10 + 0.10666667f;
                                invalidate();
                                r1Var.h = Utilities.clamp(r1Var.h, 1.0f, 0.0f);
                                float f11 = u0Var.k3 * 0.45f;
                                float f12 = 1.499267f * f11;
                                float measuredWidth = getMeasuredWidth() - f12;
                                float measuredHeight = (getMeasuredHeight() - f12) / 2.0f;
                                float f13 = f12 - f11;
                                imageReceiver2.setImageCoords((f13 - (0.02f * f12)) + measuredWidth, (f13 / 2.0f) + measuredHeight, f11, f11);
                                imageReceiver2.setAlpha((r1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.draw(canvas);
                                if (r1Var.h == 0.0f) {
                                    imageReceiver.setImageCoords(measuredWidth, measuredHeight, f12, f12);
                                    imageReceiver.setAlpha(r1Var.h);
                                    imageReceiver.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f14 = r1Var.h;
                            if (f14 != 0.0f) {
                                r1Var.h = f14 - 0.10666667f;
                                invalidate();
                            }
                        }
                        r1Var.h = Utilities.clamp(r1Var.h, 1.0f, 0.0f);
                        float f112 = u0Var.k3 * 0.45f;
                        float f122 = 1.499267f * f112;
                        float measuredWidth2 = getMeasuredWidth() - f122;
                        float measuredHeight2 = (getMeasuredHeight() - f122) / 2.0f;
                        float f132 = f122 - f112;
                        imageReceiver2.setImageCoords((f132 - (0.02f * f122)) + measuredWidth2, (f132 / 2.0f) + measuredHeight2, f112, f112);
                        imageReceiver2.setAlpha((r1Var.n * 0.7f) + 0.3f);
                        imageReceiver2.draw(canvas);
                        if (r1Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f15 = r1Var.n;
                    if (f15 != 0.0f) {
                        r1Var.n = f15 - 0.10666667f;
                        invalidate();
                    }
                }
                r1Var.n = Utilities.clamp(r1Var.n, 1.0f, 0.0f);
                z11 = r1Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                r1Var.h = Utilities.clamp(r1Var.h, 1.0f, 0.0f);
                float f1122 = u0Var.k3 * 0.45f;
                float f1222 = 1.499267f * f1122;
                float measuredWidth22 = getMeasuredWidth() - f1222;
                float measuredHeight22 = (getMeasuredHeight() - f1222) / 2.0f;
                float f1322 = f1222 - f1122;
                imageReceiver2.setImageCoords((f1322 - (0.02f * f1222)) + measuredWidth22, (f1322 / 2.0f) + measuredHeight22, f1122, f1122);
                imageReceiver2.setAlpha((r1Var.n * 0.7f) + 0.3f);
                imageReceiver2.draw(canvas);
                if (r1Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!r1Var.e) {
        }
        if (r1Var.f) {
        }
        z10 = r1Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        r1Var.n = Utilities.clamp(r1Var.n, 1.0f, 0.0f);
        z11 = r1Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        r1Var.h = Utilities.clamp(r1Var.h, 1.0f, 0.0f);
        float f11222 = u0Var.k3 * 0.45f;
        float f12222 = 1.499267f * f11222;
        float measuredWidth222 = getMeasuredWidth() - f12222;
        float measuredHeight222 = (getMeasuredHeight() - f12222) / 2.0f;
        float f13222 = f12222 - f11222;
        imageReceiver2.setImageCoords((f13222 - (0.02f * f12222)) + measuredWidth222, (f13222 / 2.0f) + measuredHeight222, f11222, f11222);
        imageReceiver2.setAlpha((r1Var.n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (r1Var.h == 0.0f) {
        }
    }
}
