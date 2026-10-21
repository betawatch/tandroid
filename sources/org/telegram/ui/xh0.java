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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class xh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(mi0 mi0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = mi0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                mi0 mi0Var = this.b;
                yh0 yh0Var = mi0Var.Z;
                yh0Var.e(canvas);
                ArrayList arrayList = yh0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ny nyVar = (ny) i2.e.h(1, arrayList);
                    ImageReceiver imageReceiver = nyVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (nyVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                nyVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                nyVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (nyVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(nyVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f7 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    mi0Var.W.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!yh0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                mi0 mi0Var2 = this.b;
                if (mi0Var2.y <= 0.0f || mi0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    mi0Var2.n.reset();
                    float width = getWidth() / mi0Var2.e.getWidth();
                    mi0Var2.n.postScale(width, width);
                    mi0Var2.f.setLocalMatrix(mi0Var2.n);
                    mi0Var2.h.setAlpha((int) (mi0Var2.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mi0Var2.h);
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
                mi0 mi0Var = this.b;
                if (!mi0Var.f0 || mi0Var.g0) {
                    ArrayList arrayList = mi0Var.M;
                    fi0 fi0Var = mi0Var.J;
                    if (mi0Var.E.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.mk.D(6.0f, mi0Var.V.getWidth() - mi0Var.V.l(), r2), 0};
                        mi0Var.V.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        mi0Var.W.setScaleX(mi0Var.V.getScaleX());
                        mi0Var.W.setScaleY(mi0Var.V.getScaleY());
                        int[] iArr2 = mi0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (fi0Var.getMeasuredHeight() - mi0Var.W.getHeight()) + (mi0Var.d0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + mi0Var.d.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = mi0Var.Y;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (mi0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - mi0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (mi0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - mi0Var.V.getHeight();
                        }
                        mi0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - mi0Var.W.l())));
                        mi0Var.W.setY(iArr[1]);
                        if (mi0Var.l0) {
                            iArr[0] = iArr[0] - (mi0Var.X - mi0Var.V.l());
                        }
                        fi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - fi0Var.getMeasuredWidth());
                        if (mi0Var.f0) {
                            org.telegram.messenger.mk.t(fi0Var.animate().translationY(((mi0Var.W.getHeight() + iArr[1]) - fi0Var.getMeasuredHeight()) - fi0Var.getTop()), li.m.V, 250L);
                        } else {
                            fi0Var.setY((mi0Var.W.getHeight() + iArr[1]) - fi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = mi0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - mi0Var.Y.getMeasuredWidth());
                            mi0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : mi0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = mi0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (mi0Var.W.l() + iArr[0]) - mi0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = mi0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = mi0Var.c0;
                                float max = Math.max(mi0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                mi0Var.b0 = max;
                                frameLayout2.setY(max);
                                ai0 ai0Var = mi0Var.d0;
                                if (ai0Var != null) {
                                    ai0Var.setY(Math.max(mi0Var.d.b, (mi0Var.k0.top - AndroidUtilities.dp(24.0f)) - mi0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (mi0Var.W.getHeight() + iArr[1]) - fi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = mi0Var.c0;
                                float max2 = Math.max(mi0Var.d.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                mi0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                ai0 ai0Var2 = mi0Var.d0;
                                if (ai0Var2 != null) {
                                    ai0Var2.setY(Math.max(0.0f, (height - ai0Var2.getMeasuredHeight()) - mi0Var.b0));
                                }
                            }
                        }
                    }
                    mi0Var.f0 = true;
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
                mi0 mi0Var = this.b;
                hh.d.c(mi0Var.i0, mi0Var.E);
                ViewGroup viewGroup = mi0Var.Y;
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
