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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class si0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si0(hj0 hj0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                hj0 hj0Var = this.b;
                ti0 ti0Var = hj0Var.a0;
                ti0Var.e(canvas);
                ArrayList arrayList = ti0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jz jzVar = (jz) i2.d.g(1, arrayList);
                    ImageReceiver imageReceiver = jzVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (jzVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                jzVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                jzVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (jzVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(jzVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    hj0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!ti0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                hj0 hj0Var2 = this.b;
                nb0 nb0Var = hj0Var2.d;
                if (nb0Var != null) {
                    nb0Var.a(hj0Var2.E == 1.0f && hj0Var2.n != null);
                }
                if (hj0Var2.E <= 0.0f || hj0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    hj0Var2.r.reset();
                    float width = getWidth() / hj0Var2.f.getWidth();
                    hj0Var2.r.postScale(width, width);
                    hj0Var2.h.setLocalMatrix(hj0Var2.r);
                    hj0Var2.n.setAlpha((int) (hj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), hj0Var2.n);
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
                hj0 hj0Var = this.b;
                if (!hj0Var.g0 || hj0Var.h0) {
                    ArrayList arrayList = hj0Var.N;
                    aj0 aj0Var = hj0Var.K;
                    if (hj0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.ui.Cells.d0.b(6.0f, hj0Var.W.getWidth() - hj0Var.W.l(), r2), 0};
                        hj0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        hj0Var.X.setScaleX(hj0Var.W.getScaleX());
                        hj0Var.X.setScaleY(hj0Var.W.getScaleY());
                        int[] iArr2 = hj0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (aj0Var.getMeasuredHeight() - hj0Var.X.getHeight()) + (hj0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + hj0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = hj0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (hj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - hj0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (hj0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - hj0Var.W.getHeight();
                        }
                        hj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - hj0Var.X.l())));
                        hj0Var.X.setY(iArr[1]);
                        if (hj0Var.m0) {
                            iArr[0] = iArr[0] - (hj0Var.Y - hj0Var.W.l());
                        }
                        aj0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - aj0Var.getMeasuredWidth());
                        if (hj0Var.g0) {
                            org.telegram.messenger.yh.s(aj0Var.animate().translationY(((hj0Var.X.getHeight() + iArr[1]) - aj0Var.getMeasuredHeight()) - aj0Var.getTop()), ki.n.V, 250L);
                        } else {
                            aj0Var.setY((hj0Var.X.getHeight() + iArr[1]) - aj0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = hj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - hj0Var.Z.getMeasuredWidth());
                            hj0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : hj0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = hj0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.q.c(6.0f, (hj0Var.X.l() + iArr[0]) - hj0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = hj0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = hj0Var.d0;
                                float max = Math.max(hj0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                hj0Var.c0 = max;
                                frameLayout2.setY(max);
                                vi0 vi0Var = hj0Var.e0;
                                if (vi0Var != null) {
                                    vi0Var.setY(Math.max(hj0Var.e.b, (hj0Var.l0.top - AndroidUtilities.dp(24.0f)) - hj0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (hj0Var.X.getHeight() + iArr[1]) - aj0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = hj0Var.d0;
                                float max2 = Math.max(hj0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                hj0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                vi0 vi0Var2 = hj0Var.e0;
                                if (vi0Var2 != null) {
                                    vi0Var2.setY(Math.max(0.0f, (height - vi0Var2.getMeasuredHeight()) - hj0Var.c0));
                                }
                            }
                        }
                    }
                    hj0Var.g0 = true;
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
                hj0 hj0Var = this.b;
                hh.d.c(hj0Var.j0, hj0Var.F);
                ViewGroup viewGroup = hj0Var.Z;
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
