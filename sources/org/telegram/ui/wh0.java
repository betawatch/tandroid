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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh0(li0 li0Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = li0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                li0 li0Var = this.b;
                xh0 xh0Var = li0Var.W;
                xh0Var.e(canvas);
                ArrayList arrayList = xh0Var.B;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    oy oyVar = (oy) j3.r0.j(1, arrayList);
                    ImageReceiver imageReceiver = oyVar.r;
                    ImageLocation mediaLocation = imageReceiver.getMediaLocation();
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getImageLocation();
                    }
                    if (mediaLocation == null) {
                        mediaLocation = imageReceiver.getThumbLocation();
                    }
                    if (mediaLocation != null) {
                        if (oyVar.s == null) {
                            TLRPC.Document document = mediaLocation.document;
                            if (document != null) {
                                oyVar.s = FileLoader.getAttachFileName(document, "tgs");
                            } else {
                                oyVar.s = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                            }
                        }
                        if (oyVar.s != null) {
                            Float fileProgress = ImageLoader.getInstance().getFileProgress(oyVar.s);
                            if (fileProgress == null) {
                                fileProgress = Float.valueOf(1.0f);
                            }
                            f10 = (fileProgress.floatValue() * 0.55f) + 0.15f + (fileProgress.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    li0Var.T.h(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!xh0Var.B.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                li0 li0Var2 = this.b;
                ff.t0 t0Var = li0Var2.d;
                if (t0Var != null) {
                    t0Var.a(li0Var2.A == 1.0f && li0Var2.n != null);
                }
                if (li0Var2.A <= 0.0f || li0Var2.n == null) {
                    canvas2 = canvas;
                } else {
                    li0Var2.r.reset();
                    float width = getWidth() / li0Var2.f.getWidth();
                    li0Var2.r.postScale(width, width);
                    li0Var2.h.setLocalMatrix(li0Var2.r);
                    li0Var2.n.setAlpha((int) (li0Var2.A * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), li0Var2.n);
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                li0 li0Var = this.b;
                if (!li0Var.c0 || li0Var.d0) {
                    ArrayList arrayList = li0Var.J;
                    ei0 ei0Var = li0Var.G;
                    if (li0Var.B.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.ll.D(6.0f, li0Var.S.getWidth() - li0Var.S.l(), r2), 0};
                        li0Var.S.getLocationOnScreen(iArr);
                        int i13 = iArr[0];
                        li0Var.T.setScaleX(li0Var.S.getScaleX());
                        li0Var.T.setScaleY(li0Var.S.getScaleY());
                        int[] iArr2 = li0Var.k0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (ei0Var.getMeasuredHeight() - li0Var.T.getHeight()) + (li0Var.a0 != null ? AndroidUtilities.dp(320.0f) : 0);
                        int dp = AndroidUtilities.dp(8.0f) + li0Var.e.b;
                        int dp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = li0Var.V;
                        int measuredHeight2 = dp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (li0Var.C.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - li0Var.e.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < dp) {
                            iArr[1] = dp + measuredHeight;
                        }
                        if (li0Var.S.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - li0Var.S.getHeight();
                        }
                        li0Var.T.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (r2.getWidth() - li0Var.T.l())));
                        li0Var.T.setY(iArr[1]);
                        if (li0Var.i0) {
                            iArr[0] = iArr[0] - (li0Var.U - li0Var.S.l());
                        }
                        ei0Var.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - ei0Var.getMeasuredWidth());
                        if (li0Var.c0) {
                            org.telegram.messenger.ll.r(ei0Var.animate().translationY(((li0Var.T.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight()) - ei0Var.getTop()), rh.m.V, 250L);
                        } else {
                            ei0Var.setY((li0Var.T.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = li0Var.V;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - li0Var.V.getMeasuredWidth());
                            li0Var.V.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : li0Var.T.getHeight()));
                        }
                        FrameLayout frameLayout = li0Var.Z;
                        if (frameLayout != null) {
                            frameLayout.setX(org.telegram.messenger.l0.b(6.0f, (li0Var.T.l() + iArr[0]) - li0Var.Z.getMeasuredWidth(), 0));
                            RectF rectF = li0Var.h0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = li0Var.Z;
                                float max = Math.max(li0Var.e.b, rectF.top - frameLayout2.getMeasuredWidth());
                                li0Var.Y = max;
                                frameLayout2.setY(max);
                                zh0 zh0Var = li0Var.a0;
                                if (zh0Var != null) {
                                    zh0Var.setY(Math.max(li0Var.e.b, (li0Var.h0.top - AndroidUtilities.dp(24.0f)) - li0Var.a0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (li0Var.T.getHeight() + iArr[1]) - ei0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = li0Var.Z;
                                float max2 = Math.max(li0Var.e.b, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                li0Var.Y = max2;
                                frameLayout3.setY(max2);
                                zh0 zh0Var2 = li0Var.a0;
                                if (zh0Var2 != null) {
                                    zh0Var2.setY(Math.max(0.0f, (height - zh0Var2.getMeasuredHeight()) - li0Var.Y));
                                }
                            }
                        }
                    }
                    li0Var.c0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                li0 li0Var = this.b;
                og.d.c(li0Var.f0, li0Var.B);
                ViewGroup viewGroup = li0Var.V;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }
}
