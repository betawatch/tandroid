package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u50 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u50(Context context) {
        super(context);
        this.a = 12;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                v50 v50Var = (v50) this.b;
                if (v50Var != null && v50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
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
            case 0:
                super.onAttachedToWindow();
                v50 v50Var = (v50) this.b;
                if (v50Var != null) {
                    v50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        x50[] x50VarArr = v50Var.c;
                        if (i10 >= x50VarArr.length) {
                            break;
                        } else {
                            x50 x50Var = x50VarArr[i10];
                            x50Var.i.add(this);
                            x50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onAttachedToWindow();
                xh.n1 n1Var = (xh.n1) this.b;
                if (n1Var != null && !n1Var.i) {
                    n1Var.i = true;
                    n1Var.a();
                    org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(n1Var, 17);
                    n1Var.h = b1Var;
                    LiteMode.addOnPowerSaverAppliedListener(b1Var);
                    break;
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
            case 0:
                super.onDetachedFromWindow();
                v50 v50Var = (v50) this.b;
                if (v50Var != null && v50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        x50[] x50VarArr = v50Var.c;
                        if (i10 >= x50VarArr.length) {
                            v50Var.g = null;
                            break;
                        } else {
                            x50 x50Var = x50VarArr[i10];
                            x50Var.i.remove(this);
                            x50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.b;
                if (n1Var != null && n1Var.i) {
                    n1Var.i = false;
                    n1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 1:
                canvas.drawColor(((tj0) this.b).getThemedColor(org.telegram.ui.ActionBar.j6.e7));
                break;
            case 2:
                lq0 lq0Var = (lq0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, lq0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(lq0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                lq0Var.S.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                lq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                int i10 = max / 2;
                lq0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(lq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), lq0Var.U);
                lq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                lq0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(lq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), lq0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), lq0Var.S);
                break;
            case 3:
                cr0 cr0Var = (cr0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, cr0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(cr0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cr0Var.h0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                cr0Var.j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, cr0Var.u0, false));
                int i11 = max2 / 2;
                cr0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(cr0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cr0Var.j0);
                cr0Var.j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                cr0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cr0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cr0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), cr0Var.h0);
                break;
            case 4:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 7:
                g31 g31Var = (g31) this.b;
                canvas.drawColor(g31Var.K ? -15590870 : -6569073);
                org.telegram.ui.Components.cc0 cc0Var = g31Var.n;
                if (cc0Var != null) {
                    cc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                g31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cc0 cc0Var2 = g31Var.n;
                if (cc0Var2 != null) {
                    cc0Var2.draw(canvas);
                }
                g31Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    f6Var = ((org.telegram.ui.ActionBar.g3) j0Var).resourcesProvider;
                    Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var);
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.j6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                x51 x51Var = (x51) this.b;
                int[] iArr = x51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = x51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(x51Var.c, rect, x51Var.I, x51Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 5:
                ex0 ex0Var = (ex0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ex0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ex0Var.c.U.getMeasuredHeight() > dp) {
                        dp = ex0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ex0Var.c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ex0Var.c.Y, TLObject.FLAG_30));
                break;
            case 13:
                yh.y7 y7Var = (yh.y7) this.b;
                if (y7Var.H) {
                    int i13 = y7Var.I;
                    kVar = ((org.telegram.ui.ActionBar.o2) y7Var).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + y7Var.I;
                    if (AndroidUtilities.dp(24.0f) + y7Var.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + y7Var.y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 10:
                super.setAlpha(f7);
                View view2 = ((fg1) this.b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        switch (this.a) {
            case 12:
                if (((xh.n1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.b;
                        if (n1Var.i) {
                            n1Var.i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.b;
                        if (!n1Var2.i) {
                            n1Var2.i = true;
                            n1Var2.a();
                            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(n1Var2, 17);
                            n1Var2.h = b1Var;
                            LiteMode.addOnPowerSaverAppliedListener(b1Var);
                            break;
                        }
                    }
                }
                break;
            default:
                super.setBackground(drawable);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u50(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(Context context, v50 v50Var) {
        super(context);
        this.a = 0;
        this.b = v50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new uv(10, this, context));
    }
}
