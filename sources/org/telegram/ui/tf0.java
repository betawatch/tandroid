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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tf0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf0(fg0 fg0Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = fg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                fg0 fg0Var = this.b;
                uf0 uf0Var = fg0Var.a0;
                uf0Var.e(canvas);
                ArrayList arrayList = uf0Var.G;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    mx mxVar = (mx) i5.c.h(1, arrayList);
                    ImageReceiver imageReceiver = mxVar.r;
                    org.telegram.messenger.fc fcVar = imageReceiver.g0;
                    if (fcVar == null) {
                        fcVar = imageReceiver.P;
                    }
                    if (fcVar == null) {
                        fcVar = imageReceiver.X;
                    }
                    if (fcVar != null) {
                        if (mxVar.s == null) {
                            TLRPC.Document document = fcVar.i;
                            if (document != null) {
                                mxVar.s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                mxVar.s = org.telegram.messenger.w7.r("tgs", fcVar.f);
                            }
                        }
                        if (mxVar.s != null) {
                            Float w10 = org.telegram.messenger.ec.D().w(mxVar.s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    fg0Var.X.g(f10 >= 0.0f && f10 < 1.0f);
                }
                if (!uf0Var.G.isEmpty()) {
                    invalidate();
                    break;
                }
                break;
            default:
                fg0 fg0Var2 = this.b;
                if (fg0Var2.E <= 0.0f || fg0Var2.h == null) {
                    canvas2 = canvas;
                } else {
                    fg0Var2.n.reset();
                    float width = getWidth() / fg0Var2.e.getWidth();
                    fg0Var2.n.postScale(width, width);
                    fg0Var2.f.setLocalMatrix(fg0Var2.n);
                    fg0Var2.h.setAlpha((int) (fg0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), fg0Var2.h);
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
                fg0 fg0Var = this.b;
                if (!fg0Var.g0 || fg0Var.h0) {
                    ArrayList arrayList = fg0Var.N;
                    bg0 bg0Var = fg0Var.K;
                    if (fg0Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        fg0Var.d(iArr);
                        fg0Var.X.setScaleX(fg0Var.W.getScaleX());
                        fg0Var.X.setScaleY(fg0Var.W.getScaleY());
                        int[] iArr2 = fg0Var.r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight = (bg0Var.getMeasuredHeight() - fg0Var.X.getHeight()) + (fg0Var.e0 != null ? org.telegram.messenger.g0.L(320.0f) : 0);
                        int L = org.telegram.messenger.g0.L(8.0f) + fg0Var.d.b;
                        int L2 = org.telegram.messenger.g0.L(arrayList.isEmpty() ? -6.0f : 48.0f);
                        ViewGroup viewGroup = fg0Var.Z;
                        int measuredHeight2 = L2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                        int measuredHeight3 = (fg0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - fg0Var.d.d;
                        if (iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - measuredHeight2;
                        }
                        if (iArr[1] - measuredHeight < L) {
                            iArr[1] = L + measuredHeight;
                        }
                        if (fg0Var.W.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - measuredHeight2) - fg0Var.W.getHeight();
                        }
                        fg0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (r1.getWidth() - fg0Var.X.l())));
                        fg0Var.X.setY(iArr[1]);
                        if (fg0Var.p0) {
                            iArr[0] = iArr[0] - (fg0Var.Y - fg0Var.W.l());
                        }
                        bg0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - bg0Var.getMeasuredWidth());
                        if (fg0Var.g0) {
                            org.telegram.messenger.n10.o(bg0Var.animate().translationY(((fg0Var.X.getHeight() + iArr[1]) - bg0Var.getMeasuredHeight()) - bg0Var.getTop()), pi.k.V, 250L);
                        } else {
                            bg0Var.setY((fg0Var.X.getHeight() + iArr[1]) - bg0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = fg0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - fg0Var.Z.getMeasuredWidth());
                            fg0Var.Z.setY(iArr[1] + (arrayList.isEmpty() ? -org.telegram.messenger.g0.L(6.0f) : fg0Var.X.getHeight()));
                        }
                        FrameLayout frameLayout = fg0Var.d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i5.c.d(6.0f, (fg0Var.X.l() + iArr[0]) - fg0Var.d0.getMeasuredWidth(), 0));
                            RectF rectF = fg0Var.l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = fg0Var.d0;
                                float max = Math.max(fg0Var.d.b, rectF.top - frameLayout2.getMeasuredWidth());
                                fg0Var.c0 = max;
                                frameLayout2.setY(max);
                                wf0 wf0Var = fg0Var.e0;
                                if (wf0Var != null) {
                                    wf0Var.setY(Math.max(fg0Var.d.b, (fg0Var.l0.top - org.telegram.messenger.g0.L(24.0f)) - fg0Var.e0.getMeasuredHeight()));
                                }
                            } else {
                                float height = (fg0Var.X.getHeight() + iArr[1]) - bg0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = fg0Var.d0;
                                float max2 = Math.max(fg0Var.d.b, height - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                fg0Var.c0 = max2;
                                frameLayout3.setY(max2);
                                wf0 wf0Var2 = fg0Var.e0;
                                if (wf0Var2 != null) {
                                    wf0Var2.setY(Math.max(0.0f, (height - wf0Var2.getMeasuredHeight()) - fg0Var.c0));
                                }
                            }
                        }
                    }
                    fg0Var.g0 = true;
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
                fg0 fg0Var = this.b;
                ih.d.c(fg0Var.j0, fg0Var.F);
                ViewGroup viewGroup = fg0Var.Z;
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
