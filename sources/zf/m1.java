package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m1 extends View {
    public final /* synthetic */ n1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, Context context) {
        super(context);
        this.a = n1Var;
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
        n1 n1Var = this.a;
        s0 s0Var = n1Var.v;
        ImageReceiver imageReceiver2 = n1Var.c;
        ImageReceiver imageReceiver3 = n1Var.d;
        if (n1Var.s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(n1Var.r), null, DocumentObject.getSvgThumb(n1Var.r, f6.a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(n1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(n1Var.r), n1Var.r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                if (!n1Var.e) {
                    if (n1Var.h == 0.0f) {
                        n1Var.h = 1.0f;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().L(0, false, false);
                        }
                    }
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().y() && s0Var.j3) {
                        AndroidUtilities.cancelRunOnUIThread(s0Var.a3);
                        AndroidUtilities.runOnUIThread(s0Var.a3, 0L);
                    }
                } else if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().stop();
                }
                if (n1Var.f) {
                    if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().start();
                }
                z10 = n1Var.f;
                if (z10) {
                    float f10 = n1Var.n;
                    if (f10 != 1.0f) {
                        n1Var.n = f10 + 0.10666667f;
                        invalidate();
                        n1Var.n = Utilities.clamp(n1Var.n, 1.0f, 0.0f);
                        z11 = n1Var.e;
                        if (z11) {
                            float f11 = n1Var.h;
                            if (f11 != 1.0f) {
                                n1Var.h = f11 + 0.10666667f;
                                invalidate();
                                n1Var.h = Utilities.clamp(n1Var.h, 1.0f, 0.0f);
                                float f12 = s0Var.g3 * 0.45f;
                                float f13 = 1.499267f * f12;
                                float measuredWidth = getMeasuredWidth() - f13;
                                float measuredHeight = (getMeasuredHeight() - f13) / 2.0f;
                                float f14 = f13 - f12;
                                imageReceiver2.setImageCoords((f14 - (0.02f * f13)) + measuredWidth, (f14 / 2.0f) + measuredHeight, f12, f12);
                                imageReceiver2.setAlpha((n1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.draw(canvas);
                                if (n1Var.h == 0.0f) {
                                    imageReceiver.setImageCoords(measuredWidth, measuredHeight, f13, f13);
                                    imageReceiver.setAlpha(n1Var.h);
                                    imageReceiver.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f15 = n1Var.h;
                            if (f15 != 0.0f) {
                                n1Var.h = f15 - 0.10666667f;
                                invalidate();
                            }
                        }
                        n1Var.h = Utilities.clamp(n1Var.h, 1.0f, 0.0f);
                        float f122 = s0Var.g3 * 0.45f;
                        float f132 = 1.499267f * f122;
                        float measuredWidth2 = getMeasuredWidth() - f132;
                        float measuredHeight2 = (getMeasuredHeight() - f132) / 2.0f;
                        float f142 = f132 - f122;
                        imageReceiver2.setImageCoords((f142 - (0.02f * f132)) + measuredWidth2, (f142 / 2.0f) + measuredHeight2, f122, f122);
                        imageReceiver2.setAlpha((n1Var.n * 0.7f) + 0.3f);
                        imageReceiver2.draw(canvas);
                        if (n1Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f16 = n1Var.n;
                    if (f16 != 0.0f) {
                        n1Var.n = f16 - 0.10666667f;
                        invalidate();
                    }
                }
                n1Var.n = Utilities.clamp(n1Var.n, 1.0f, 0.0f);
                z11 = n1Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                n1Var.h = Utilities.clamp(n1Var.h, 1.0f, 0.0f);
                float f1222 = s0Var.g3 * 0.45f;
                float f1322 = 1.499267f * f1222;
                float measuredWidth22 = getMeasuredWidth() - f1322;
                float measuredHeight22 = (getMeasuredHeight() - f1322) / 2.0f;
                float f1422 = f1322 - f1222;
                imageReceiver2.setImageCoords((f1422 - (0.02f * f1322)) + measuredWidth22, (f1422 / 2.0f) + measuredHeight22, f1222, f1222);
                imageReceiver2.setAlpha((n1Var.n * 0.7f) + 0.3f);
                imageReceiver2.draw(canvas);
                if (n1Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!n1Var.e) {
        }
        if (n1Var.f) {
        }
        z10 = n1Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        n1Var.n = Utilities.clamp(n1Var.n, 1.0f, 0.0f);
        z11 = n1Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        n1Var.h = Utilities.clamp(n1Var.h, 1.0f, 0.0f);
        float f12222 = s0Var.g3 * 0.45f;
        float f13222 = 1.499267f * f12222;
        float measuredWidth222 = getMeasuredWidth() - f13222;
        float measuredHeight222 = (getMeasuredHeight() - f13222) / 2.0f;
        float f14222 = f13222 - f12222;
        imageReceiver2.setImageCoords((f14222 - (0.02f * f13222)) + measuredWidth222, (f14222 / 2.0f) + measuredHeight222, f12222, f12222);
        imageReceiver2.setAlpha((n1Var.n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (n1Var.h == 0.0f) {
        }
    }
}
