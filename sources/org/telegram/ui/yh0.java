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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                zh0 zh0Var = ni0Var.Z;
                zh0Var.e(canvas);
                ArrayList arrayList = zh0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ny nyVar = (ny) ic.a.g(1, arrayList);
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
                    ni0Var.W.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!zh0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ni0 ni0Var2 = this.b;
                if (ni0Var2.y <= 0.0f || ni0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    ni0Var2.n.reset();
                    float width = getWidth() / ni0Var2.e.getWidth();
                    ni0Var2.n.postScale(width, width);
                    ni0Var2.f.setLocalMatrix(ni0Var2.n);
                    ni0Var2.h.setAlpha((int) (ni0Var2.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ni0Var2.h);
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
                if (!ni0Var.f0 || ni0Var.g0) {
                    ArrayList arrayList = ni0Var.M;
                    gi0 gi0Var = ni0Var.J;
                    if (ni0Var.E.getWidth() > 0) {
                        int[] iArr = {d3.w(6.0f, ni0Var.V.getWidth() - ni0Var.V.l(), r2), 0};
                        ni0Var.V.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ni0Var.W.setScaleX(ni0Var.V.getScaleX());
                        ni0Var.W.setScaleY(ni0Var.V.getScaleY());
                        int[] iArr2 = ni0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (gi0Var.getMeasuredHeight() - ni0Var.W.getHeight()) + (ni0Var.d0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + ni0Var.d.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ni0Var.Y;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ni0Var.F.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - ni0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (ni0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ni0Var.V.getHeight();
                        }
                        ni0Var.W.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - ni0Var.W.l())));
                        ni0Var.W.setY(iArr[1]);
                        if (ni0Var.l0) {
                            iArr[0] = iArr[0] - (ni0Var.X - ni0Var.V.l());
                        }
                        gi0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - gi0Var.getMeasuredWidth());
                        if (ni0Var.f0) {
                            org.telegram.messenger.vh.q(gi0Var.animate().translationY(((ni0Var.W.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight()) - gi0Var.getTop()), mi.m.V, 250L);
                        } else {
                            gi0Var.setY((ni0Var.W.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ni0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ni0Var.Y.getMeasuredWidth());
                            ni0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : ni0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = ni0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.t.c(6.0f, (ni0Var.W.l() + iArr[0]) - ni0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = ni0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ni0Var.c0;
                                float max = Math.max(ni0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ni0Var.b0 = max;
                                frameLayout2.setY(max);
                                bi0 bi0Var = ni0Var.d0;
                                if (bi0Var != null) {
                                    bi0Var.setY(Math.max(ni0Var.d.b, (ni0Var.k0.top - AndroidUtilities.dp(24.0f)) - ni0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ni0Var.W.getHeight() + iArr[1]) - gi0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ni0Var.c0;
                                float max2 = Math.max(ni0Var.d.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                ni0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                bi0 bi0Var2 = ni0Var.d0;
                                if (bi0Var2 != null) {
                                    bi0Var2.setY(Math.max(0.0f, (height - bi0Var2.getMeasuredHeight()) - ni0Var.b0));
                                }
                            }
                        }
                    }
                    ni0Var.f0 = true;
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
                ih.d.c(ni0Var.i0, ni0Var.E);
                ViewGroup viewGroup = ni0Var.Y;
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
