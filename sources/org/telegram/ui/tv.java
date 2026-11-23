package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class tv extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv(int i7, Context context, Object obj) {
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
                tg.g0 g0Var = ((vp0) this.b).G0;
                if (g0Var != null) {
                    g0Var.d(canvas);
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
                        r30[] r30VarArr = (r30[]) bVar.e;
                        if (i7 >= r30VarArr.length) {
                            break;
                        } else {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.i.add(this);
                            r30Var.a();
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
                if (bVar != null && ((tv) bVar.i) != this) {
                    int i7 = 0;
                    while (true) {
                        r30[] r30VarArr = (r30[]) bVar.e;
                        if (i7 >= r30VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.i.remove(this);
                            r30Var.a();
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
                canvas.drawColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.e7, ((tg0) obj).J0));
                break;
            case 4:
                om0 om0Var = (om0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, om0Var.c.size())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(om0Var.T.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                om0Var.T.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.C5, false));
                om0Var.V.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
                int i10 = max / 2;
                om0Var.U.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(om0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), om0Var.V);
                om0Var.V.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
                om0Var.U.set(org.telegram.messenger.g0.L(2.0f) + r9, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(om0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), om0Var.V);
                canvas.drawText(format, measuredWidth - (r3 / 2), org.telegram.messenger.g0.L(16.2f), om0Var.T);
                break;
            case 5:
                an0 an0Var = (an0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, an0Var.c.size())));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(an0Var.i0.measureText(format2))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                an0Var.i0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.C5, false));
                an0Var.k0.setColor(org.telegram.ui.ActionBar.n6.x0(null, an0Var.v0, false));
                int i11 = max2 / 2;
                an0Var.j0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(an0Var.j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), an0Var.k0);
                an0Var.k0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
                an0Var.j0.set(org.telegram.messenger.g0.L(2.0f) + r11, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(an0Var.j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), an0Var.k0);
                canvas.drawText(format2, measuredWidth2 - (r3 / 2), org.telegram.messenger.g0.L(16.2f), an0Var.i0);
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
                org.telegram.ui.Wallet.y6 y6Var = (org.telegram.ui.Wallet.y6) obj;
                float e10 = y6Var.L.e(false, y6Var.K);
                if (y6Var.R != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.y6.a(y6Var, canvas, e10);
                    break;
                }
                break;
            case 14:
                super.onDraw(canvas);
                ug.k0 k0Var = (ug.k0) obj;
                if (k0Var.l2 - k0Var.k2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", k0Var.J0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.n6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 15:
                canvas.drawColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.e7, ((wg.d1) obj).J0));
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                g01 g01Var = (g01) this.b;
                int[] iArr = g01Var.H;
                getLocationOnScreen(iArr);
                Rect rect = g01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(g01Var.c, rect, g01Var.J, g01Var.e);
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
                r00 r00Var = (r00) this.b;
                if (r00Var.I) {
                    r00Var.K = (r00Var.p0().getMeasuredHeight() + r00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + r00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + r00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + r00Var.E.getMeasuredHeight()) - r00Var.M);
                    }
                    r00Var.K = L;
                }
                int i11 = (int) (r00Var.K - (0 * 2.5f));
                r00Var.K = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                break;
            case 7:
                ps0 ps0Var = (ps0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ps0Var.c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ps0Var.c.V.getMeasuredHeight() > L2) {
                        L2 = ps0Var.c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ps0Var.c.Z = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ps0Var.c.Z, TLObject.FLAG_30));
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
                View view = ((bx) this.b).fragmentView;
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
                View view3 = ((w91) this.b).fragmentView;
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
    public tv(Context context, g.b bVar) {
        super(context);
        this.a = 2;
        this.b = bVar;
        org.telegram.messenger.ks.i(this);
        setOnClickListener(new org.telegram.ui.Components.p31(19, this, context));
    }
}
