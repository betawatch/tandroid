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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ri0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri0(gj0 gj0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = gj0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                gj0 gj0Var = this.b;
                si0 si0Var = gj0Var.a0;
                si0Var.e(canvas);
                ArrayList arrayList = si0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jz jzVar = (jz) i2.d.h(1, arrayList);
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
                    gj0Var.X.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!si0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                gj0 gj0Var2 = this.b;
                mb0 mb0Var = gj0Var2.d;
                if (mb0Var != null) {
                    mb0Var.a(gj0Var2.E == 1.0f && gj0Var2.n != null);
                }
                if (gj0Var2.E <= 0.0f || gj0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    gj0Var2.r.reset();
                    float width = getWidth() / gj0Var2.f.getWidth();
                    gj0Var2.r.postScale(width, width);
                    gj0Var2.h.setLocalMatrix(gj0Var2.r);
                    gj0Var2.n.setAlpha((int) (gj0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), gj0Var2.n);
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
                gj0 gj0Var = this.b;
                if (!gj0Var.g0 || gj0Var.h0) {
                    ArrayList arrayList = gj0Var.N;
                    zi0 zi0Var = gj0Var.K;
                    if (gj0Var.F.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.sk.D(6.0f, gj0Var.W.getWidth() - gj0Var.W.l(), r2), 0};
                        gj0Var.W.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        gj0Var.X.setScaleX(gj0Var.W.getScaleX());
                        gj0Var.X.setScaleY(gj0Var.W.getScaleY());
                        int[] iArr2 = gj0Var.o0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (zi0Var.getMeasuredHeight() - gj0Var.X.getHeight()) + (gj0Var.e0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + gj0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = gj0Var.Z;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (gj0Var.G.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - gj0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (gj0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - gj0Var.W.getHeight();
                        }
                        gj0Var.X.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - gj0Var.X.l())));
                        gj0Var.X.setY(iArr[1]);
                        if (gj0Var.m0) {
                            iArr[0] = iArr[0] - (gj0Var.Y - gj0Var.W.l());
                        }
                        zi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - zi0Var.getMeasuredWidth());
                        if (gj0Var.g0) {
                            org.telegram.messenger.sk.t(zi0Var.animate().translationY(((gj0Var.X.getHeight() + iArr[1]) - zi0Var.getMeasuredHeight()) - zi0Var.getTop()), ki.n.V, 250L);
                        } else {
                            zi0Var.setY((gj0Var.X.getHeight() + iArr[1]) - zi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = gj0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gj0Var.Z.getMeasuredWidth());
                            gj0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : gj0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = gj0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.g0.b(6.0f, (gj0Var.X.l() + iArr[0]) - gj0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = gj0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = gj0Var.d0;
                                float max = Math.max(gj0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                gj0Var.c0 = max;
                                frameLayout2.setY(max);
                                ui0 ui0Var = gj0Var.e0;
                                if (ui0Var != null) {
                                    ui0Var.setY(Math.max(gj0Var.e.b, (gj0Var.l0.top - AndroidUtilities.dp(24.0f)) - gj0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (gj0Var.X.getHeight() + iArr[1]) - zi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = gj0Var.d0;
                                float max2 = Math.max(gj0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                gj0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                ui0 ui0Var2 = gj0Var.e0;
                                if (ui0Var2 != null) {
                                    ui0Var2.setY(Math.max(0.0f, (height - ui0Var2.getMeasuredHeight()) - gj0Var.c0));
                                }
                            }
                        }
                    }
                    gj0Var.g0 = true;
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
                gj0 gj0Var = this.b;
                hh.d.c(gj0Var.j0, gj0Var.F);
                ViewGroup viewGroup = gj0Var.Z;
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
