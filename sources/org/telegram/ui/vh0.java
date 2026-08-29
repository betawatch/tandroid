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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh0(ki0 ki0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ki0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                ki0 ki0Var = this.b;
                wh0 wh0Var = ki0Var.W;
                wh0Var.e(canvas);
                ArrayList arrayList = wh0Var.B;
                float f9 = -1.0f;
                if (!arrayList.isEmpty()) {
                    qy qyVar = (qy) j7.l1.i(1, arrayList);
                    ImageReceiver imageReceiver = qyVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (qyVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                qyVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                qyVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (qyVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(qyVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f9 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f9 != -2.0f) {
                    ki0Var.T.h(f9 >= 0.0f && f9 < 1.0f);
                }
                if (!wh0Var.B.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ki0 ki0Var2 = this.b;
                jf.s0 s0Var = ki0Var2.d;
                if (s0Var != null) {
                    s0Var.a(ki0Var2.A == 1.0f && ki0Var2.n != null);
                }
                if (ki0Var2.A <= 0.0f || ki0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    ki0Var2.r.reset();
                    float width = getWidth() / ki0Var2.f.getWidth();
                    ki0Var2.r.postScale(width, width);
                    ki0Var2.h.setLocalMatrix(ki0Var2.r);
                    ki0Var2.n.setAlpha((int) (ki0Var2.A * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ki0Var2.n);
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
                ki0 ki0Var = this.b;
                if (!ki0Var.c0 || ki0Var.d0) {
                    ArrayList arrayList = ki0Var.J;
                    di0 di0Var = ki0Var.G;
                    if (ki0Var.B.getWidth() > 0) {
                        int[] iArr = {b.C(6.0f, ki0Var.S.getWidth() - ki0Var.S.l(), r2), 0};
                        ki0Var.S.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ki0Var.T.setScaleX(ki0Var.S.getScaleX());
                        ki0Var.T.setScaleY(ki0Var.S.getScaleY());
                        int[] iArr2 = ki0Var.k0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (di0Var.getMeasuredHeight() - ki0Var.T.getHeight()) + (ki0Var.a0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + ki0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ki0Var.V;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ki0Var.C.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ki0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (ki0Var.S.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ki0Var.S.getHeight();
                        }
                        ki0Var.T.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - ki0Var.T.l())));
                        ki0Var.T.setY(iArr[1]);
                        if (ki0Var.i0) {
                            iArr[0] = iArr[0] - (ki0Var.U - ki0Var.S.l());
                        }
                        di0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - di0Var.getMeasuredWidth());
                        if (ki0Var.c0) {
                            b.q(di0Var.animate().translationY(((ki0Var.T.getHeight() + iArr[1]) - di0Var.getMeasuredHeight()) - di0Var.getTop()), uh.m.V, 250L);
                        } else {
                            di0Var.setY((ki0Var.T.getHeight() + iArr[1]) - di0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ki0Var.V;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ki0Var.V.getMeasuredWidth());
                            ki0Var.V.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ki0Var.T.getHeight()));
                        }
                        FrameLayout frameLayout = ki0Var.Z;
                        if (frameLayout != null) {
                            frameLayout.setX(j7.l1.d(6.0f, (ki0Var.T.l() + iArr[0]) - ki0Var.Z.getMeasuredWidth(), 0));
                            RectF rectF = ki0Var.h0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ki0Var.Z;
                                float max = Math.max(ki0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ki0Var.Y = max;
                                frameLayout2.setY(max);
                                yh0 yh0Var = ki0Var.a0;
                                if (yh0Var != null) {
                                    yh0Var.setY(Math.max(ki0Var.e.b, (ki0Var.h0.top - AndroidUtilities.dp(24.0f)) - ki0Var.a0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ki0Var.T.getHeight() + iArr[1]) - di0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ki0Var.Z;
                                float max2 = Math.max(ki0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ki0Var.Y = max2;
                                frameLayout3.setY(max2);
                                yh0 yh0Var2 = ki0Var.a0;
                                if (yh0Var2 != null) {
                                    yh0Var2.setY(Math.max(0.0f, (height - yh0Var2.getMeasuredHeight()) - ki0Var.Y));
                                }
                            }
                        }
                    }
                    ki0Var.c0 = true;
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
                ki0 ki0Var = this.b;
                rg.c.c(ki0Var.f0, ki0Var.B);
                ViewGroup viewGroup = ki0Var.V;
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
