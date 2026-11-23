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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rf0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(dg0 dg0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = dg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                dg0 dg0Var = this.b;
                sf0 sf0Var = dg0Var.a0;
                sf0Var.e(canvas);
                ArrayList arrayList = sf0Var.G;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    lx lxVar = (lx) i5.c.h(1, arrayList);
                    ImageReceiver imageReceiver = lxVar.r;
                    org.telegram.messenger.fc fcVar = imageReceiver.g0;
                    if (fcVar == null) {
                        fcVar = imageReceiver.P;
                    }
                    if (fcVar == null) {
                        fcVar = imageReceiver.X;
                    }
                    if (fcVar != null) {
                        if (lxVar.s == null) {
                            TLRPC.Document document = fcVar.i;
                            if (document != null) {
                                lxVar.s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                lxVar.s = org.telegram.messenger.w7.r("tgs", fcVar.f);
                            }
                        }
                        if (lxVar.s != null) {
                            Float w10 = org.telegram.messenger.ec.D().w(lxVar.s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    dg0Var.X.h(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!sf0Var.G.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                dg0 dg0Var2 = this.b;
                if (dg0Var2.E <= 0.0f || dg0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    dg0Var2.n.reset();
                    float width = getWidth() / dg0Var2.e.getWidth();
                    dg0Var2.n.postScale(width, width);
                    dg0Var2.f.setLocalMatrix(dg0Var2.n);
                    dg0Var2.h.setAlpha((int) (dg0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dg0Var2.h);
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                dg0 dg0Var = this.b;
                if (!dg0Var.g0 || dg0Var.h0) {
                    ArrayList arrayList = dg0Var.N;
                    zf0 zf0Var = dg0Var.K;
                    if (dg0Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        dg0Var.d(iArr);
                        dg0Var.X.setScaleX(dg0Var.W.getScaleX());
                        dg0Var.X.setScaleY(dg0Var.W.getScaleY());
                        int[] iArr2 = dg0Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (zf0Var.getMeasuredHeight() - dg0Var.X.getHeight()) + (dg0Var.e0 != null ? org.telegram.messenger.g0.L(320.0f) : 0);
                        int L = org.telegram.messenger.g0.L(8.0f) + dg0Var.d.b;
                        int L2 = org.telegram.messenger.g0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = dg0Var.Z;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (dg0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - dg0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (dg0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - dg0Var.W.getHeight();
                        }
                        dg0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (r1.getWidth() - dg0Var.X.l())));
                        dg0Var.X.setY(iArr[1]);
                        if (dg0Var.p0) {
                            iArr[0] = iArr[0] - (dg0Var.Y - dg0Var.W.l());
                        }
                        zf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - zf0Var.getMeasuredWidth());
                        if (dg0Var.g0) {
                            org.telegram.messenger.m10.o(zf0Var.animate().translationY(((dg0Var.X.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight()) - zf0Var.getTop()), pi.k.V, 250L);
                        } else {
                            zf0Var.setY((dg0Var.X.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = dg0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - dg0Var.Z.getMeasuredWidth());
                            dg0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.g0.L(6.0f) : dg0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = dg0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i5.c.d(6.0f, (dg0Var.X.l() + iArr[0]) - dg0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = dg0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = dg0Var.d0;
                                float max = Math.max(dg0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                dg0Var.c0 = max;
                                frameLayout2.setY(max);
                                uf0 uf0Var = dg0Var.e0;
                                if (uf0Var != null) {
                                    uf0Var.setY(Math.max(dg0Var.d.b, (dg0Var.l0.top - org.telegram.messenger.g0.L(24.0f)) - dg0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (dg0Var.X.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = dg0Var.d0;
                                float max2 = Math.max(dg0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                dg0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                uf0 uf0Var2 = dg0Var.e0;
                                if (uf0Var2 != null) {
                                    uf0Var2.setY(Math.max(0.0f, (height - uf0Var2.getMeasuredHeight()) - dg0Var.c0));
                                }
                            }
                        }
                    }
                    dg0Var.g0 = true;
                    break;
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                dg0 dg0Var = this.b;
                ih.d.c(dg0Var.j0, dg0Var.F);
                ViewGroup viewGroup = dg0Var.Z;
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
