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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class yh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh0(ni0 ni0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ni0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                ni0 ni0Var = this.b;
                zh0 zh0Var = ni0Var.a0;
                zh0Var.e(canvas);
                ArrayList arrayList = zh0Var.F;
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
                    ni0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!zh0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ni0 ni0Var2 = this.b;
                pa0 pa0Var = ni0Var2.d;
                if (pa0Var != null) {
                    pa0Var.a(ni0Var2.E == 1.0f && ni0Var2.n != null);
                }
                if (ni0Var2.E <= 0.0f || ni0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    ni0Var2.r.reset();
                    float width = getWidth() / ni0Var2.f.getWidth();
                    ni0Var2.r.postScale(width, width);
                    ni0Var2.h.setLocalMatrix(ni0Var2.r);
                    ni0Var2.n.setAlpha((int) (ni0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ni0Var2.n);
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
                ni0 ni0Var = this.b;
                if (!ni0Var.g0 || ni0Var.h0) {
                    ArrayList arrayList = ni0Var.N;
                    gi0 gi0Var = ni0Var.K;
                    if (ni0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.lk.D(6.0f, ni0Var.W.getWidth() - ni0Var.W.l(), r2), 0};
                        ni0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ni0Var.X.setScaleX(ni0Var.W.getScaleX());
                        ni0Var.X.setScaleY(ni0Var.W.getScaleY());
                        int[] iArr2 = ni0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (gi0Var.getMeasuredHeight() - ni0Var.X.getHeight()) + (ni0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + ni0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ni0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ni0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ni0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (ni0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ni0Var.W.getHeight();
                        }
                        ni0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - ni0Var.X.l())));
                        ni0Var.X.setY(iArr[1]);
                        if (ni0Var.m0) {
                            iArr[0] = iArr[0] - (ni0Var.Y - ni0Var.W.l());
                        }
                        gi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gi0Var.getMeasuredWidth());
                        if (ni0Var.g0) {
                            org.telegram.messenger.lk.t(gi0Var.animate().translationY(((ni0Var.X.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight()) - gi0Var.getTop()), li.m.V, 250L);
                        } else {
                            gi0Var.setY((ni0Var.X.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ni0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.Z.getMeasuredWidth());
                            ni0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ni0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = ni0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (ni0Var.X.l() + iArr[0]) - ni0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = ni0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ni0Var.d0;
                                float max = Math.max(ni0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ni0Var.c0 = max;
                                frameLayout2.setY(max);
                                bi0 bi0Var = ni0Var.e0;
                                if (bi0Var != null) {
                                    bi0Var.setY(Math.max(ni0Var.e.b, (ni0Var.l0.top - AndroidUtilities.dp(24.0f)) - ni0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ni0Var.X.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ni0Var.d0;
                                float max2 = Math.max(ni0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ni0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                bi0 bi0Var2 = ni0Var.e0;
                                if (bi0Var2 != null) {
                                    bi0Var2.setY(Math.max(0.0f, (height - bi0Var2.getMeasuredHeight()) - ni0Var.c0));
                                }
                            }
                        }
                    }
                    ni0Var.g0 = true;
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
                ni0 ni0Var = this.b;
                hh.d.c(ni0Var.j0, ni0Var.F);
                ViewGroup viewGroup = ni0Var.Z;
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
