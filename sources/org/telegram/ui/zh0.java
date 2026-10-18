package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh0(oi0 oi0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = oi0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                oi0 oi0Var = this.b;
                ai0 ai0Var = oi0Var.a0;
                ai0Var.e(canvas);
                ArrayList arrayList = ai0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    py pyVar = (py) i2.d.h(1, arrayList);
                    ImageReceiver imageReceiver = pyVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (pyVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                pyVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                pyVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (pyVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(pyVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    oi0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!ai0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                oi0 oi0Var2 = this.b;
                pa0 pa0Var = oi0Var2.d;
                if (pa0Var != null) {
                    pa0Var.a(oi0Var2.E == 1.0f && oi0Var2.n != null);
                }
                if (oi0Var2.E <= 0.0f || oi0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    oi0Var2.r.reset();
                    float width = getWidth() / oi0Var2.f.getWidth();
                    oi0Var2.r.postScale(width, width);
                    oi0Var2.h.setLocalMatrix(oi0Var2.r);
                    oi0Var2.n.setAlpha((int) (oi0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), oi0Var2.n);
                }
                super.dispatchDraw(canvas2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                oi0 oi0Var = this.b;
                if (!oi0Var.g0 || oi0Var.h0) {
                    ArrayList arrayList = oi0Var.N;
                    hi0 hi0Var = oi0Var.K;
                    if (oi0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.kk.D(6.0f, oi0Var.W.getWidth() - oi0Var.W.l(), r2), 0};
                        oi0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        oi0Var.X.setScaleX(oi0Var.W.getScaleX());
                        oi0Var.X.setScaleY(oi0Var.W.getScaleY());
                        int[] iArr2 = oi0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (hi0Var.getMeasuredHeight() - oi0Var.X.getHeight()) + (oi0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + oi0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = oi0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (oi0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - oi0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (oi0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - oi0Var.W.getHeight();
                        }
                        oi0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - oi0Var.X.l())));
                        oi0Var.X.setY(iArr[1]);
                        if (oi0Var.m0) {
                            iArr[0] = iArr[0] - (oi0Var.Y - oi0Var.W.l());
                        }
                        hi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - hi0Var.getMeasuredWidth());
                        if (oi0Var.g0) {
                            org.telegram.messenger.kk.t(hi0Var.animate().translationY(((oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight()) - hi0Var.getTop()), li.m.V, 250L);
                        } else {
                            hi0Var.setY((oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = oi0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - oi0Var.Z.getMeasuredWidth());
                            oi0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : oi0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = oi0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (oi0Var.X.l() + iArr[0]) - oi0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = oi0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = oi0Var.d0;
                                float max = Math.max(oi0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                oi0Var.c0 = max;
                                frameLayout2.setY(max);
                                ci0 ci0Var = oi0Var.e0;
                                if (ci0Var != null) {
                                    ci0Var.setY(Math.max(oi0Var.e.b, (oi0Var.l0.top - AndroidUtilities.dp(24.0f)) - oi0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (oi0Var.X.getHeight() + iArr[1]) - hi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = oi0Var.d0;
                                float max2 = Math.max(oi0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                oi0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                ci0 ci0Var2 = oi0Var.e0;
                                if (ci0Var2 != null) {
                                    ci0Var2.setY(Math.max(0.0f, (height - ci0Var2.getMeasuredHeight()) - oi0Var.c0));
                                }
                            }
                        }
                    }
                    oi0Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                oi0 oi0Var = this.b;
                hh.d.c(oi0Var.j0, oi0Var.F);
                ViewGroup viewGroup = oi0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
