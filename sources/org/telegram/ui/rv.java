package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rv extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    break;
                }
                break;
            case 13:
                super.dispatchDraw(canvas);
                tg.b0 b0Var = ((tp0) this.b).G0;
                if (b0Var != null) {
                    b0Var.d(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 2:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null) {
                    bVar.i = this;
                    int i7 = 0;
                    while (true) {
                        p30[] p30VarArr = (p30[]) bVar.e;
                        if (i7 >= p30VarArr.length) {
                            break;
                        } else {
                            p30 p30Var = p30VarArr[i7];
                            p30Var.i.add(this);
                            p30Var.a();
                            i7++;
                        }
                    }
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.b;
                if (bVar != null && ((rv) bVar.i) != this) {
                    int i7 = 0;
                    while (true) {
                        p30[] p30VarArr = (p30[]) bVar.e;
                        if (i7 >= p30VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            p30 p30Var = p30VarArr[i7];
                            p30Var.i.remove(this);
                            p30Var.a();
                            i7++;
                        }
                    }
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 3:
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.e7, ((qg0) obj).J0));
                break;
            case 4:
                nm0 nm0Var = (nm0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, nm0Var.c.size())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(nm0Var.T.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                nm0Var.T.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.C5, false));
                nm0Var.V.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                int i10 = max / 2;
                nm0Var.U.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(nm0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), nm0Var.V);
                nm0Var.V.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B5, false));
                nm0Var.U.set(org.telegram.messenger.g0.L(2.0f) + r9, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(nm0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), nm0Var.V);
                canvas.drawText(format, measuredWidth - (r3 / 2), org.telegram.messenger.g0.L(16.2f), nm0Var.T);
                break;
            case 5:
                ym0 ym0Var = (ym0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, ym0Var.c.size())));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(ym0Var.i0.measureText(format2))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ym0Var.i0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.C5, false));
                ym0Var.k0.setColor(org.telegram.ui.ActionBar.j6.x0(null, ym0Var.v0, false));
                int i11 = max2 / 2;
                ym0Var.j0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(ym0Var.j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), ym0Var.k0);
                ym0Var.k0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B5, false));
                ym0Var.j0.set(org.telegram.messenger.g0.L(2.0f) + r11, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(ym0Var.j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ym0Var.k0);
                canvas.drawText(format2, measuredWidth2 - (r3 / 2), org.telegram.messenger.g0.L(16.2f), ym0Var.i0);
                break;
            case 6:
                ((PhotoViewer) obj).q3.a(canvas, this);
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            default:
                super.onDraw(canvas);
                break;
            case 9:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                break;
            case 12:
                org.telegram.ui.Wallet.h6 h6Var = (org.telegram.ui.Wallet.h6) obj;
                float e10 = h6Var.L.e(false, h6Var.K);
                if (h6Var.R != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.h6.a(h6Var, canvas, e10);
                    break;
                }
                break;
            case 14:
                super.onDraw(canvas);
                ug.j0 j0Var = (ug.j0) obj;
                if (j0Var.l2 - j0Var.k2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", j0Var.J0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.j6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 15:
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.e7, ((wg.c1) obj).J0));
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                d01 d01Var = (d01) this.b;
                int[] iArr = d01Var.H;
                getLocationOnScreen(iArr);
                Rect rect = d01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(d01Var.c, rect, d01Var.J, d01Var.e);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                p00 p00Var = (p00) this.b;
                if (p00Var.I) {
                    p00Var.K = (p00Var.p0().getMeasuredHeight() + p00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + p00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + p00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + p00Var.E.getMeasuredHeight()) - p00Var.M);
                    }
                    p00Var.K = L;
                }
                int i11 = (int) (p00Var.K - (0 * 2.5f));
                p00Var.K = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                break;
            case 7:
                ms0 ms0Var = (ms0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ms0Var.c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ms0Var.c.V.getMeasuredHeight() > L2) {
                        L2 = ms0Var.c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ms0Var.c.Z = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ms0Var.c.Z, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                View view = ((yw) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 8:
                super.setAlpha(f10);
                View view2 = ((ProfileActivity) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 11:
                super.setAlpha(f10);
                View view3 = ((u91) this.b).fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(Context context, g.b bVar) {
        super(context);
        this.a = 2;
        this.b = bVar;
        org.telegram.messenger.ns.i(this);
        setOnClickListener(new org.telegram.ui.Components.vv0(25, this, context));
    }
}
