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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class v10 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v10(Context context) {
        super(context);
        this.a = 13;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                b50 b50Var = (b50) this.b;
                if (b50Var != null && b50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
            case 1:
                super.onAttachedToWindow();
                b50 b50Var = (b50) this.b;
                if (b50Var != null) {
                    b50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.c;
                        if (i10 >= d50VarArr.length) {
                            break;
                        } else {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.i.add(this);
                            d50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onAttachedToWindow();
                yh.l1 l1Var = (yh.l1) this.b;
                if (l1Var != null && !l1Var.i) {
                    l1Var.i = true;
                    l1Var.a();
                    ig.l0 l0Var = new ig.l0(l1Var, 26);
                    l1Var.h = l0Var;
                    LiteMode.addOnPowerSaverAppliedListener(l0Var);
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
            case 1:
                super.onDetachedFromWindow();
                b50 b50Var = (b50) this.b;
                if (b50Var != null && b50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.c;
                        if (i10 >= d50VarArr.length) {
                            b50Var.g = null;
                            break;
                        } else {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.i.remove(this);
                            d50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                yh.l1 l1Var = (yh.l1) this.b;
                if (l1Var != null && l1Var.i) {
                    l1Var.i = false;
                    l1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
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
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 2:
                canvas.drawColor(((bj0) this.b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                break;
            case 3:
                sp0 sp0Var = (sp0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, sp0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(sp0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                sp0Var.S.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                sp0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
                int i10 = max / 2;
                sp0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(sp0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), sp0Var.U);
                sp0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                sp0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(sp0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), sp0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), sp0Var.S);
                break;
            case 4:
                jq0 jq0Var = (jq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, jq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(jq0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jq0Var.h0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                jq0Var.j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, jq0Var.u0, false));
                int i11 = max2 / 2;
                jq0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(jq0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), jq0Var.j0);
                jq0Var.j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                jq0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(jq0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), jq0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), jq0Var.h0);
                break;
            case 5:
                ((PhotoViewer) this.b).q3.a(canvas, this);
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 11:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.b;
                float d = x5Var.K.d(x5Var.J, false);
                if (x5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.x5.a(x5Var, canvas, d);
                    break;
                }
                break;
            case 12:
                super.onDraw(canvas);
                sg.k0 k0Var = (sg.k0) this.b;
                if (k0Var.p0 - k0Var.o0 > 1) {
                    d6Var = ((org.telegram.ui.ActionBar.f3) k0Var).resourcesProvider;
                    Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", d6Var);
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.h6.k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
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
                m41 m41Var = (m41) this.b;
                int[] iArr = m41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = m41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(m41Var.c, rect, m41Var.I, m41Var.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                y10 y10Var = (y10) this.b;
                if (y10Var.H) {
                    int i12 = y10Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
                    y10Var.J = (kVar.getMeasuredHeight() + i12) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + y10Var.I;
                    if (AndroidUtilities.dp(24.0f) + y10Var.y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + y10Var.y.getMeasuredHeight()) - y10Var.L);
                    }
                    y10Var.J = dp;
                }
                int i13 = (int) (y10Var.J - (0 * 2.5f));
                y10Var.J = i13;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 6:
                gw0 gw0Var = (gw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = gw0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + gw0Var.c.U.getMeasuredHeight() > dp2) {
                        dp2 = gw0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    gw0Var.c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(gw0Var.c.Y, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 10:
                super.setAlpha(f7);
                View view2 = ((re1) this.b).fragmentView;
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
            case 13:
                if (((yh.l1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var = (yh.l1) this.b;
                        if (l1Var.i) {
                            l1Var.i = false;
                            l1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.l1) {
                    this.b = (yh.l1) drawable;
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var2 = (yh.l1) this.b;
                        if (!l1Var2.i) {
                            l1Var2.i = true;
                            l1Var2.a();
                            ig.l0 l0Var = new ig.l0(l1Var2, 26);
                            l1Var2.h = l0Var;
                            LiteMode.addOnPowerSaverAppliedListener(l0Var);
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
    public /* synthetic */ v10(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(Context context, b50 b50Var) {
        super(context);
        this.a = 1;
        this.b = b50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.i51(20, this, context));
    }
}
