package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n1 extends View {
    public final /* synthetic */ o1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, Context context) {
        super(context);
        this.a = o1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
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
        o1 o1Var = this.a;
        s0 s0Var = o1Var.v;
        ImageReceiver imageReceiver2 = o1Var.c;
        ImageReceiver imageReceiver3 = o1Var.d;
        if (o1Var.s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(o1Var.r), null, DocumentObject.getSvgThumb(o1Var.r, i6.a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(o1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(o1Var.r), o1Var.r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                if (!o1Var.e) {
                    if (o1Var.h == 0.0f) {
                        o1Var.h = 1.0f;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().N(0, false, false);
                        }
                    }
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().A() && s0Var.l3) {
                        AndroidUtilities.cancelRunOnUIThread(s0Var.c3);
                        AndroidUtilities.runOnUIThread(s0Var.c3, 0L);
                    }
                } else if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().stop();
                }
                if (o1Var.f) {
                    if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().start();
                }
                z10 = o1Var.f;
                if (z10) {
                    float f7 = o1Var.n;
                    if (f7 != 1.0f) {
                        o1Var.n = f7 + 0.10666667f;
                        invalidate();
                        o1Var.n = Utilities.clamp(o1Var.n, 1.0f, 0.0f);
                        z11 = o1Var.e;
                        if (z11) {
                            float f10 = o1Var.h;
                            if (f10 != 1.0f) {
                                o1Var.h = f10 + 0.10666667f;
                                invalidate();
                                o1Var.h = Utilities.clamp(o1Var.h, 1.0f, 0.0f);
                                float f11 = s0Var.i3 * 0.45f;
                                float f12 = 1.499267f * f11;
                                float measuredWidth = getMeasuredWidth() - f12;
                                float measuredHeight = (getMeasuredHeight() - f12) / 2.0f;
                                float f13 = f12 - f11;
                                imageReceiver2.setImageCoords((f13 - (0.02f * f12)) + measuredWidth, (f13 / 2.0f) + measuredHeight, f11, f11);
                                imageReceiver2.setAlpha((o1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.draw(canvas);
                                if (o1Var.h == 0.0f) {
                                    imageReceiver.setImageCoords(measuredWidth, measuredHeight, f12, f12);
                                    imageReceiver.setAlpha(o1Var.h);
                                    imageReceiver.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f14 = o1Var.h;
                            if (f14 != 0.0f) {
                                o1Var.h = f14 - 0.10666667f;
                                invalidate();
                            }
                        }
                        o1Var.h = Utilities.clamp(o1Var.h, 1.0f, 0.0f);
                        float f112 = s0Var.i3 * 0.45f;
                        float f122 = 1.499267f * f112;
                        float measuredWidth2 = getMeasuredWidth() - f122;
                        float measuredHeight2 = (getMeasuredHeight() - f122) / 2.0f;
                        float f132 = f122 - f112;
                        imageReceiver2.setImageCoords((f132 - (0.02f * f122)) + measuredWidth2, (f132 / 2.0f) + measuredHeight2, f112, f112);
                        imageReceiver2.setAlpha((o1Var.n * 0.7f) + 0.3f);
                        imageReceiver2.draw(canvas);
                        if (o1Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f15 = o1Var.n;
                    if (f15 != 0.0f) {
                        o1Var.n = f15 - 0.10666667f;
                        invalidate();
                    }
                }
                o1Var.n = Utilities.clamp(o1Var.n, 1.0f, 0.0f);
                z11 = o1Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                o1Var.h = Utilities.clamp(o1Var.h, 1.0f, 0.0f);
                float f1122 = s0Var.i3 * 0.45f;
                float f1222 = 1.499267f * f1122;
                float measuredWidth22 = getMeasuredWidth() - f1222;
                float measuredHeight22 = (getMeasuredHeight() - f1222) / 2.0f;
                float f1322 = f1222 - f1122;
                imageReceiver2.setImageCoords((f1322 - (0.02f * f1222)) + measuredWidth22, (f1322 / 2.0f) + measuredHeight22, f1122, f1122);
                imageReceiver2.setAlpha((o1Var.n * 0.7f) + 0.3f);
                imageReceiver2.draw(canvas);
                if (o1Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!o1Var.e) {
        }
        if (o1Var.f) {
        }
        z10 = o1Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        o1Var.n = Utilities.clamp(o1Var.n, 1.0f, 0.0f);
        z11 = o1Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        o1Var.h = Utilities.clamp(o1Var.h, 1.0f, 0.0f);
        float f11222 = s0Var.i3 * 0.45f;
        float f12222 = 1.499267f * f11222;
        float measuredWidth222 = getMeasuredWidth() - f12222;
        float measuredHeight222 = (getMeasuredHeight() - f12222) / 2.0f;
        float f13222 = f12222 - f11222;
        imageReceiver2.setImageCoords((f13222 - (0.02f * f12222)) + measuredWidth222, (f13222 / 2.0f) + measuredHeight222, f11222, f11222);
        imageReceiver2.setAlpha((o1Var.n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (o1Var.h == 0.0f) {
        }
    }
}
