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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                zh0 zh0Var = ni0Var.W;
                zh0Var.e(canvas);
                ArrayList arrayList = zh0Var.B;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ry ryVar = (ry) i0.a.i(1, arrayList);
                    ImageReceiver imageReceiver = ryVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (ryVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                ryVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                ryVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (ryVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(ryVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    ni0Var.T.h(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!zh0Var.B.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ni0 ni0Var2 = this.b;
                gf.t0 t0Var = ni0Var2.d;
                if (t0Var != null) {
                    t0Var.a(ni0Var2.A == 1.0f && ni0Var2.n != null);
                }
                if (ni0Var2.A <= 0.0f || ni0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    ni0Var2.r.reset();
                    float width = getWidth() / ni0Var2.f.getWidth();
                    ni0Var2.r.postScale(width, width);
                    ni0Var2.h.setLocalMatrix(ni0Var2.r);
                    ni0Var2.n.setAlpha((int) (ni0Var2.A * 255.0f));
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
                if (!ni0Var.c0 || ni0Var.d0) {
                    ArrayList arrayList = ni0Var.J;
                    gi0 gi0Var = ni0Var.G;
                    if (ni0Var.B.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.rl.C(6.0f, ni0Var.S.getWidth() - ni0Var.S.l(), r2), 0};
                        ni0Var.S.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ni0Var.T.setScaleX(ni0Var.S.getScaleX());
                        ni0Var.T.setScaleY(ni0Var.S.getScaleY());
                        int[] iArr2 = ni0Var.k0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (gi0Var.getMeasuredHeight() - ni0Var.T.getHeight()) + (ni0Var.a0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + ni0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ni0Var.V;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ni0Var.C.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ni0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (ni0Var.S.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ni0Var.S.getHeight();
                        }
                        ni0Var.T.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - ni0Var.T.l())));
                        ni0Var.T.setY(iArr[1]);
                        if (ni0Var.i0) {
                            iArr[0] = iArr[0] - (ni0Var.U - ni0Var.S.l());
                        }
                        gi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gi0Var.getMeasuredWidth());
                        if (ni0Var.c0) {
                            org.telegram.messenger.rl.o(gi0Var.animate().translationY(((ni0Var.T.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight()) - gi0Var.getTop()), sh.m.V, 250L);
                        } else {
                            gi0Var.setY((ni0Var.T.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ni0Var.V;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.V.getMeasuredWidth());
                            ni0Var.V.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ni0Var.T.getHeight()));
                        }
                        FrameLayout frameLayout = ni0Var.Z;
                        if (frameLayout != null) {
                            frameLayout.setX(i0.a.d(6.0f, (ni0Var.T.l() + iArr[0]) - ni0Var.Z.getMeasuredWidth(), 0));
                            RectF rectF = ni0Var.h0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ni0Var.Z;
                                float max = Math.max(ni0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ni0Var.Y = max;
                                frameLayout2.setY(max);
                                bi0 bi0Var = ni0Var.a0;
                                if (bi0Var != null) {
                                    bi0Var.setY(Math.max(ni0Var.e.b, (ni0Var.h0.top - AndroidUtilities.dp(24.0f)) - ni0Var.a0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ni0Var.T.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ni0Var.Z;
                                float max2 = Math.max(ni0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ni0Var.Y = max2;
                                frameLayout3.setY(max2);
                                bi0 bi0Var2 = ni0Var.a0;
                                if (bi0Var2 != null) {
                                    bi0Var2.setY(Math.max(0.0f, (height - bi0Var2.getMeasuredHeight()) - ni0Var.Y));
                                }
                            }
                        }
                    }
                    ni0Var.c0 = true;
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
                pg.c.c(ni0Var.f0, ni0Var.B);
                ViewGroup viewGroup = ni0Var.V;
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
