package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yi0 extends View {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi0(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 10:
                ig.b bVar = ((pg.f) this.b).E;
                if (bVar != null) {
                    bVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 12:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.b).l = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 12:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.b).l = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                canvas.drawColor(((bj0) obj).getThemedColor(org.telegram.ui.ActionBar.f6.e7));
                break;
            case 1:
                ip0 ip0Var = (ip0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, ip0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(ip0Var.O.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ip0Var.O.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.C5, false));
                ip0Var.Q.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                int i10 = max / 2;
                ip0Var.P.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(ip0Var.P, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ip0Var.Q);
                ip0Var.Q.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B5, false));
                ip0Var.P.set(AndroidUtilities.dp(2.0f) + r10, AndroidUtilities.dp(2.0f), r4 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ip0Var.P, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ip0Var.Q);
                canvas.drawText(format, measuredWidth - (r3 / 2), AndroidUtilities.dp(16.2f), ip0Var.O);
                break;
            case 2:
                zp0 zp0Var = (zp0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, zp0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(zp0Var.d0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                zp0Var.d0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.C5, false));
                zp0Var.f0.setColor(org.telegram.ui.ActionBar.f6.w0(null, zp0Var.q0, false));
                int i11 = max2 / 2;
                zp0Var.e0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(zp0Var.e0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), zp0Var.f0);
                zp0Var.f0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B5, false));
                zp0Var.e0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(zp0Var.e0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), zp0Var.f0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), zp0Var.d0);
                break;
            case 3:
                ((PhotoViewer) obj).m3.a(canvas, this);
                break;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 6:
                z11 z11Var = (z11) obj;
                canvas.drawColor(z11Var.G ? -15590870 : -6569073);
                org.telegram.ui.Components.jb0 jb0Var = z11Var.n;
                if (jb0Var != null) {
                    jb0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                z11Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.jb0 jb0Var2 = z11Var.n;
                if (jb0Var2 != null) {
                    jb0Var2.draw(canvas);
                }
                z11Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 7:
                ((SecretMediaViewer) obj).M.a(canvas, this);
                break;
            case 11:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((qh.q0) obj).c.draw(canvas);
                canvas.restore();
                break;
            case 12:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                break;
            case 13:
                super.onDraw(canvas);
                zf.j0 j0Var = (zf.j0) obj;
                if (j0Var.l0 - j0Var.k0 > 1) {
                    b6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                    Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var);
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.f6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 8:
                super.onLayout(z10, i9, i10, i11, i12);
                q41 q41Var = (q41) this.b;
                int[] iArr = q41Var.C;
                getLocationOnScreen(iArr);
                Rect rect = q41Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                AndroidUtilities.lerp(q41Var.c, rect, q41Var.E, q41Var.e);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 4:
                yv0 yv0Var = (yv0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = yv0Var.c;
                if (premiumPreviewFragment.S) {
                    premiumPreviewFragment.U = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + yv0Var.c.Q.getMeasuredHeight() > dp) {
                        dp = yv0Var.c.Q.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    yv0Var.c.U = dp;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(yv0Var.c.U, TLObject.FLAG_30));
                break;
            case 12:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(24.0f));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.a) {
            case 5:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 9:
                super.setAlpha(f10);
                View view2 = ((we1) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = 12;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, b6Var);
        this.b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.f6.hl, org.telegram.ui.ActionBar.f6.z5, org.telegram.ui.ActionBar.f6.k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
