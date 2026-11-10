package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sf0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf0(eg0 eg0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = eg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                eg0 eg0Var = this.b;
                tf0 tf0Var = eg0Var.Z;
                tf0Var.e(canvas);
                ArrayList arrayList = tf0Var.F;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    kx kxVar = (kx) jg.g.i(1, arrayList);
                    ImageReceiver imageReceiver = kxVar.r;
                    org.telegram.messenger.hc hcVar = imageReceiver.f0;
                    if (hcVar == null) {
                        hcVar = imageReceiver.O;
                    }
                    if (hcVar == null) {
                        hcVar = imageReceiver.W;
                    }
                    if (hcVar != null) {
                        if (kxVar.s == null) {
                            TLRPC.Document document = hcVar.i;
                            if (document != null) {
                                kxVar.s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                kxVar.s = org.telegram.messenger.w7.r("tgs", hcVar.f);
                            }
                        }
                        if (kxVar.s != null) {
                            Float w10 = org.telegram.messenger.gc.D().w(kxVar.s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    eg0Var.W.f(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!tf0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                eg0 eg0Var2 = this.b;
                if (eg0Var2.D <= 0.0f || eg0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    eg0Var2.n.reset();
                    float width = getWidth() / eg0Var2.e.getWidth();
                    eg0Var2.n.postScale(width, width);
                    eg0Var2.f.setLocalMatrix(eg0Var2.n);
                    eg0Var2.h.setAlpha((int) (eg0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), eg0Var2.h);
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                eg0 eg0Var = this.b;
                if (!eg0Var.f0 || eg0Var.g0) {
                    ArrayList arrayList = eg0Var.M;
                    ag0 ag0Var = eg0Var.J;
                    if (eg0Var.E.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, eg0Var.V.getWidth() - eg0Var.V.l(), r2), 0};
                        eg0Var.V.getLocationOnScreen(iArr);
                        int i13 = iArr[0];
                        eg0Var.W.setScaleX(eg0Var.V.getScaleX());
                        eg0Var.W.setScaleY(eg0Var.V.getScaleY());
                        int[] iArr2 = eg0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (ag0Var.getMeasuredHeight() - eg0Var.W.getHeight()) + (eg0Var.d0 != null ? org.telegram.messenger.g0.L(320.0f) : 0);
                        int L = org.telegram.messenger.g0.L(8.0f) + eg0Var.d.b;
                        int L2 = org.telegram.messenger.g0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = eg0Var.Y;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (eg0Var.F.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - eg0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (eg0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - eg0Var.V.getHeight();
                        }
                        eg0Var.W.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (r2.getWidth() - eg0Var.W.l())));
                        eg0Var.W.setY(iArr[1]);
                        if (eg0Var.l0) {
                            iArr[0] = iArr[0] - (eg0Var.X - eg0Var.V.l());
                        }
                        ag0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - ag0Var.getMeasuredWidth());
                        if (eg0Var.f0) {
                            org.telegram.messenger.camera.q.l(ag0Var.animate().translationY(((eg0Var.W.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight()) - ag0Var.getTop()), mi.l.V, 250L);
                        } else {
                            ag0Var.setY((eg0Var.W.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = eg0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - eg0Var.Y.getMeasuredWidth());
                            eg0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.g0.L(6.0f) : eg0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = eg0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(jg.g.e(6.0f, (eg0Var.W.l() + iArr[0]) - eg0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = eg0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = eg0Var.c0;
                                float max = Math.max(eg0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                eg0Var.b0 = max;
                                frameLayout2.setY(max);
                                vf0 vf0Var = eg0Var.d0;
                                if (vf0Var != null) {
                                    vf0Var.setY(Math.max(eg0Var.d.b, (eg0Var.k0.top - org.telegram.messenger.g0.L(24.0f)) - eg0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (eg0Var.W.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = eg0Var.c0;
                                float max2 = Math.max(eg0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                eg0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                vf0 vf0Var2 = eg0Var.d0;
                                if (vf0Var2 != null) {
                                    vf0Var2.setY(Math.max(0.0f, (height - vf0Var2.getMeasuredHeight()) - eg0Var.b0));
                                }
                            }
                        }
                    }
                    eg0Var.f0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                eg0 eg0Var = this.b;
                ih.d.c(eg0Var.i0, eg0Var.E);
                ViewGroup viewGroup = eg0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    break;
                }
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
