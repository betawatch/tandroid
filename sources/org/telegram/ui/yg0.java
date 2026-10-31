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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg0(kh0 kh0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = kh0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                kh0 kh0Var = this.b;
                zg0 zg0Var = kh0Var.Z;
                zg0Var.e(canvas);
                ArrayList arrayList = zg0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ky kyVar = (ky) i0.a.g(1, arrayList);
                    ImageReceiver imageReceiver = kyVar.r;
                    org.telegram.messenger.ic icVar = imageReceiver.f0;
                    if (icVar == null) {
                        icVar = imageReceiver.O;
                    }
                    if (icVar == null) {
                        icVar = imageReceiver.W;
                    }
                    if (icVar != null) {
                        if (kyVar.s == null) {
                            TLRPC.Document document = icVar.i;
                            if (document != null) {
                                kyVar.s = org.telegram.messenger.b8.r("tgs", document);
                            } else {
                                kyVar.s = org.telegram.messenger.b8.r("tgs", icVar.f);
                            }
                        }
                        if (kyVar.s != null) {
                            Float w9 = org.telegram.messenger.hc.D().w(kyVar.s);
                            if (w9 == null) {
                                w9 = Float.valueOf(1.0f);
                            }
                            f7 = (w9.floatValue() * 0.55f) + 0.15f + (w9.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    kh0Var.W.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!zg0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                kh0 kh0Var2 = this.b;
                if (kh0Var2.D <= 0.0f || kh0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    kh0Var2.n.reset();
                    float width = getWidth() / kh0Var2.e.getWidth();
                    kh0Var2.n.postScale(width, width);
                    kh0Var2.f.setLocalMatrix(kh0Var2.n);
                    kh0Var2.h.setAlpha((int) (kh0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), kh0Var2.h);
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
                kh0 kh0Var = this.b;
                if (!kh0Var.f0 || kh0Var.g0) {
                    ArrayList arrayList = kh0Var.M;
                    gh0 gh0Var = kh0Var.J;
                    if (kh0Var.E.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.z20.D(6.0f, kh0Var.V.getWidth() - kh0Var.V.l(), r2), 0};
                        kh0Var.V.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        kh0Var.W.setScaleX(kh0Var.V.getScaleX());
                        kh0Var.W.setScaleY(kh0Var.V.getScaleY());
                        int[] iArr2 = kh0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (gh0Var.getMeasuredHeight() - kh0Var.W.getHeight()) + (kh0Var.d0 != null ? org.telegram.messenger.i0.L(320.0f) : 0);
                        int L = org.telegram.messenger.i0.L(8.0f) + kh0Var.d.b;
                        int L2 = org.telegram.messenger.i0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = kh0Var.Y;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (kh0Var.F.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f)) - kh0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (kh0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - kh0Var.V.getHeight();
                        }
                        kh0Var.W.setX(org.telegram.messenger.i0.L(6.0f) + (iArr[0] - (r2.getWidth() - kh0Var.W.l())));
                        kh0Var.W.setY(iArr[1]);
                        if (kh0Var.l0) {
                            iArr[0] = iArr[0] - (kh0Var.X - kh0Var.V.l());
                        }
                        gh0Var.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - gh0Var.getMeasuredWidth());
                        if (kh0Var.f0) {
                            org.telegram.messenger.z20.m(gh0Var.animate().translationY(((kh0Var.W.getHeight() + iArr[1]) - gh0Var.getMeasuredHeight()) - gh0Var.getTop()), ci.o.V, 250L);
                        } else {
                            gh0Var.setY((kh0Var.W.getHeight() + iArr[1]) - gh0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = kh0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - kh0Var.Y.getMeasuredWidth());
                            kh0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.i0.L(6.0f) : kh0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = kh0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i0.a.d(6.0f, (kh0Var.W.l() + iArr[0]) - kh0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = kh0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = kh0Var.c0;
                                float max = Math.max(kh0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                kh0Var.b0 = max;
                                frameLayout2.setY(max);
                                bh0 bh0Var = kh0Var.d0;
                                if (bh0Var != null) {
                                    bh0Var.setY(Math.max(kh0Var.d.b, (kh0Var.k0.top - org.telegram.messenger.i0.L(24.0f)) - kh0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (kh0Var.W.getHeight() + iArr[1]) - gh0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = kh0Var.c0;
                                float max2 = Math.max(kh0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.i0.L(24.0f);
                                kh0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                bh0 bh0Var2 = kh0Var.d0;
                                if (bh0Var2 != null) {
                                    bh0Var2.setY(Math.max(0.0f, (height - bh0Var2.getMeasuredHeight()) - kh0Var.b0));
                                }
                            }
                        }
                    }
                    kh0Var.f0 = true;
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
                kh0 kh0Var = this.b;
                yg.d.c(kh0Var.i0, kh0Var.E);
                ViewGroup viewGroup = kh0Var.Y;
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
