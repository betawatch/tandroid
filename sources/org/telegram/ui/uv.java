package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class uv extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv(int i7, Context context, Object obj) {
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
                tg.c0 c0Var = ((vp0) this.b).G0;
                if (c0Var != null) {
                    c0Var.d(canvas);
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
                        s30[] s30VarArr = (s30[]) bVar.e;
                        if (i7 >= s30VarArr.length) {
                            break;
                        } else {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.i.add(this);
                            s30Var.a();
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
                if (bVar != null && ((uv) bVar.i) != this) {
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.e;
                        if (i7 >= s30VarArr.length) {
                            bVar.i = null;
                            break;
                        } else {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.i.remove(this);
                            s30Var.a();
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
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, ((vg0) obj).J0));
                break;
            case 4:
                qm0 qm0Var = (qm0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, qm0Var.c.size())));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(qm0Var.T.measureText(format))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                qm0Var.T.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                qm0Var.V.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                int i10 = max / 2;
                qm0Var.U.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(qm0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), qm0Var.V);
                qm0Var.V.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                qm0Var.U.set(org.telegram.messenger.g0.L(2.0f) + r9, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(qm0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), qm0Var.V);
                canvas.drawText(format, measuredWidth - (r3 / 2), org.telegram.messenger.g0.L(16.2f), qm0Var.T);
                break;
            case 5:
                cn0 cn0Var = (cn0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, cn0Var.c.size())));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ((int) Math.ceil(cn0Var.i0.measureText(format2))), org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cn0Var.i0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                cn0Var.k0.setColor(org.telegram.ui.ActionBar.m6.x0(null, cn0Var.v0, false));
                int i11 = max2 / 2;
                cn0Var.j0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(cn0Var.j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), cn0Var.k0);
                cn0Var.k0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                cn0Var.j0.set(org.telegram.messenger.g0.L(2.0f) + r11, org.telegram.messenger.g0.L(2.0f), r4 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(cn0Var.j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), cn0Var.k0);
                canvas.drawText(format2, measuredWidth2 - (r3 / 2), org.telegram.messenger.g0.L(16.2f), cn0Var.i0);
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
                org.telegram.ui.Wallet.x6 x6Var = (org.telegram.ui.Wallet.x6) obj;
                float e10 = x6Var.L.e(false, x6Var.K);
                if (x6Var.R != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.x6.a(x6Var, canvas, e10);
                    break;
                }
                break;
            case 14:
                super.onDraw(canvas);
                ug.k0 k0Var = (ug.k0) obj;
                if (k0Var.l2 - k0Var.k2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", k0Var.J0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.m6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    break;
                }
                break;
            case 15:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, ((wg.e1) obj).J0));
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                i01 i01Var = (i01) this.b;
                int[] iArr = i01Var.H;
                getLocationOnScreen(iArr);
                Rect rect = i01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(i01Var.c, rect, i01Var.J, i01Var.e);
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
                s00 s00Var = (s00) this.b;
                if (s00Var.I) {
                    s00Var.K = (s00Var.p0().getMeasuredHeight() + s00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + s00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + s00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + s00Var.E.getMeasuredHeight()) - s00Var.M);
                    }
                    s00Var.K = L;
                }
                int i11 = (int) (s00Var.K - (0 * 2.5f));
                s00Var.K = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                break;
            case 7:
                qs0 qs0Var = (qs0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = qs0Var.c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + qs0Var.c.V.getMeasuredHeight() > L2) {
                        L2 = qs0Var.c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    qs0Var.c.Z = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(qs0Var.c.Z, TLObject.FLAG_30));
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
                View view = ((cx) this.b).fragmentView;
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
                View view3 = ((y91) this.b).fragmentView;
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
    public uv(Context context, g.b bVar) {
        super(context);
        this.a = 2;
        this.b = bVar;
        org.telegram.messenger.ks.i(this);
        setOnClickListener(new org.telegram.ui.Components.q31(19, this, context));
    }
}
