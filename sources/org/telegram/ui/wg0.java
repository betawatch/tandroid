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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg0(ih0 ih0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ih0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                ih0 ih0Var = this.b;
                xg0 xg0Var = ih0Var.Z;
                xg0Var.e(canvas);
                ArrayList arrayList = xg0Var.F;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jy jyVar = (jy) i0.a.g(1, arrayList);
                    ImageReceiver imageReceiver = jyVar.r;
                    org.telegram.messenger.jc jcVar = imageReceiver.f0;
                    if (jcVar == null) {
                        jcVar = imageReceiver.O;
                    }
                    if (jcVar == null) {
                        jcVar = imageReceiver.W;
                    }
                    if (jcVar != null) {
                        if (jyVar.s == null) {
                            TLRPC.Document document = jcVar.i;
                            if (document != null) {
                                jyVar.s = org.telegram.messenger.b8.r("tgs", document);
                            } else {
                                jyVar.s = org.telegram.messenger.b8.r("tgs", jcVar.f);
                            }
                        }
                        if (jyVar.s != null) {
                            Float w9 = org.telegram.messenger.ic.D().w(jyVar.s);
                            if (w9 == null) {
                                w9 = Float.valueOf(1.0f);
                            }
                            f7 = (w9.floatValue() * 0.55f) + 0.15f + (w9.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    ih0Var.W.h(f7 >= 0.0f && f7 < 1.0f);
                }
                if (!xg0Var.F.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                ih0 ih0Var2 = this.b;
                if (ih0Var2.D <= 0.0f || ih0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    ih0Var2.n.reset();
                    float width = getWidth() / ih0Var2.e.getWidth();
                    ih0Var2.n.postScale(width, width);
                    ih0Var2.f.setLocalMatrix(ih0Var2.n);
                    ih0Var2.h.setAlpha((int) (ih0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ih0Var2.h);
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
                ih0 ih0Var = this.b;
                if (!ih0Var.f0 || ih0Var.g0) {
                    ArrayList arrayList = ih0Var.M;
                    eh0 eh0Var = ih0Var.J;
                    if (ih0Var.E.getWidth() > 0) {
                        int[] iArr = {org.telegram.messenger.a30.D(6.0f, ih0Var.V.getWidth() - ih0Var.V.l(), r2), 0};
                        ih0Var.V.getLocationOnScreen(iArr);
                        int i14 = iArr[0];
                        ih0Var.W.setScaleX(ih0Var.V.getScaleX());
                        ih0Var.W.setScaleY(ih0Var.V.getScaleY());
                        int[] iArr2 = ih0Var.n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (eh0Var.getMeasuredHeight() - ih0Var.W.getHeight()) + (ih0Var.d0 != null ? org.telegram.messenger.i0.L(320.0f) : 0);
                        int L = org.telegram.messenger.i0.L(8.0f) + ih0Var.d.b;
                        int L2 = org.telegram.messenger.i0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = ih0Var.Y;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (ih0Var.F.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f)) - ih0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (ih0Var.V.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - ih0Var.V.getHeight();
                        }
                        ih0Var.W.setX(org.telegram.messenger.i0.L(6.0f) + (iArr[0] - (r2.getWidth() - ih0Var.W.l())));
                        ih0Var.W.setY(iArr[1]);
                        if (ih0Var.l0) {
                            iArr[0] = iArr[0] - (ih0Var.X - ih0Var.V.l());
                        }
                        eh0Var.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - eh0Var.getMeasuredWidth());
                        if (ih0Var.f0) {
                            org.telegram.messenger.a30.m(eh0Var.animate().translationY(((ih0Var.W.getHeight() + iArr[1]) - eh0Var.getMeasuredHeight()) - eh0Var.getTop()), ci.o.V, 250L);
                        } else {
                            eh0Var.setY((ih0Var.W.getHeight() + iArr[1]) - eh0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ih0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - ih0Var.Y.getMeasuredWidth());
                            ih0Var.Y.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.i0.L(6.0f) : ih0Var.W.getHeight()));
                        }
                        FrameLayout frameLayout = ih0Var.c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i0.a.d(6.0f, (ih0Var.W.l() + iArr[0]) - ih0Var.c0.getMeasuredWidth(), 0));
                            RectF rectF = ih0Var.k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ih0Var.c0;
                                float max = Math.max(ih0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                ih0Var.b0 = max;
                                frameLayout2.setY(max);
                                zg0 zg0Var = ih0Var.d0;
                                if (zg0Var != null) {
                                    zg0Var.setY(Math.max(ih0Var.d.b, (ih0Var.k0.top - org.telegram.messenger.i0.L(24.0f)) - ih0Var.d0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (ih0Var.W.getHeight() + iArr[1]) - eh0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ih0Var.c0;
                                float max2 = Math.max(ih0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.i0.L(24.0f);
                                ih0Var.b0 = max2;
                                frameLayout3.setY(max2);
                                zg0 zg0Var2 = ih0Var.d0;
                                if (zg0Var2 != null) {
                                    zg0Var2.setY(Math.max(0.0f, (height - zg0Var2.getMeasuredHeight()) - ih0Var.b0));
                                }
                            }
                        }
                    }
                    ih0Var.f0 = true;
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
                ih0 ih0Var = this.b;
                yg.d.c(ih0Var.i0, ih0Var.E);
                ViewGroup viewGroup = ih0Var.Y;
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
