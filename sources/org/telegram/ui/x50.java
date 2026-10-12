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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x50 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x50(Context context) {
        super(context);
        this.a = 12;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                y50 y50Var = (y50) this.b;
                if (y50Var != null && y50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
                y50 y50Var = (y50) this.b;
                if (y50Var != null) {
                    y50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        a60[] a60VarArr = y50Var.c;
                        if (i10 >= a60VarArr.length) {
                            break;
                        } else {
                            a60 a60Var = a60VarArr[i10];
                            a60Var.i.add(this);
                            a60Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onAttachedToWindow();
                yh.m1 m1Var = (yh.m1) this.b;
                if (m1Var != null && !m1Var.i) {
                    m1Var.i = true;
                    m1Var.a();
                    ji.p1 p1Var = new ji.p1(m1Var, 20);
                    m1Var.h = p1Var;
                    LiteMode.addOnPowerSaverAppliedListener(p1Var);
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
                y50 y50Var = (y50) this.b;
                if (y50Var != null && y50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        a60[] a60VarArr = y50Var.c;
                        if (i10 >= a60VarArr.length) {
                            y50Var.g = null;
                            break;
                        } else {
                            a60 a60Var = a60VarArr[i10];
                            a60Var.i.remove(this);
                            a60Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                yh.m1 m1Var = (yh.m1) this.b;
                if (m1Var != null && m1Var.i) {
                    m1Var.i = false;
                    m1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
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
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.a) {
            case 1:
                canvas.drawColor(((xj0) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.e7));
                break;
            case 2:
                qq0 qq0Var = (qq0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, qq0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(qq0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                qq0Var.S.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C5, false));
                qq0Var.U.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false));
                int i10 = max / 2;
                qq0Var.T.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(qq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), qq0Var.U);
                qq0Var.U.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
                qq0Var.T.set(AndroidUtilities.dp(2.0f) + r12, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(qq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), qq0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), qq0Var.S);
                break;
            case 3:
                hr0 hr0Var = (hr0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, hr0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(hr0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hr0Var.h0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C5, false));
                hr0Var.j0.setColor(org.telegram.ui.ActionBar.g6.x0(null, hr0Var.u0, false));
                int i11 = max2 / 2;
                hr0Var.i0.set(measuredWidth2 - i11, 0.0f, i11 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(hr0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), hr0Var.j0);
                hr0Var.j0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
                hr0Var.i0.set(AndroidUtilities.dp(2.0f) + r15, AndroidUtilities.dp(2.0f), r8 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(hr0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), hr0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r12 / 2), AndroidUtilities.dp(16.2f), hr0Var.h0);
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
                l31 l31Var = (l31) this.b;
                canvas.drawColor(l31Var.K ? -15590870 : -6569073);
                org.telegram.ui.Components.cd0 cd0Var = l31Var.n;
                if (cd0Var != null) {
                    cd0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                l31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cd0 cd0Var2 = l31Var.n;
                if (cd0Var2 != null) {
                    cd0Var2.draw(canvas);
                }
                l31Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 8:
                ((SecretMediaViewer) this.b).Q.a(canvas, this);
                break;
            case 11:
                super.onDraw(canvas);
                sg.j0 j0Var = (sg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    c6Var = ((org.telegram.ui.ActionBar.e3) j0Var).resourcesProvider;
                    Paint U0 = org.telegram.ui.ActionBar.g6.U0("paintDivider", c6Var);
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.g6.k0;
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
                g61 g61Var = (g61) this.b;
                int[] iArr = g61Var.G;
                getLocationOnScreen(iArr);
                Rect rect = g61Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(g61Var.c, rect, g61Var.I, g61Var.e);
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
                ix0 ix0Var = (ix0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ix0Var.c.U.getMeasuredHeight() > dp) {
                        dp = ix0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ix0Var.c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ix0Var.c.Y, TLObject.FLAG_30));
                break;
            case 13:
                zh.p7 p7Var = (zh.p7) this.b;
                if (p7Var.H) {
                    int i13 = p7Var.I;
                    kVar = ((org.telegram.ui.ActionBar.m2) p7Var).actionBar;
                    i12 = (kVar.getMeasuredHeight() + i13) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + p7Var.I;
                    if (AndroidUtilities.dp(24.0f) + p7Var.y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + p7Var.y.getMeasuredHeight();
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
                View view2 = ((lg1) this.b).fragmentView;
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
                if (((yh.m1) this.b) != null) {
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var = (yh.m1) this.b;
                        if (m1Var.i) {
                            m1Var.i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.m1) {
                    this.b = (yh.m1) drawable;
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var2 = (yh.m1) this.b;
                        if (!m1Var2.i) {
                            m1Var2.i = true;
                            m1Var2.a();
                            ji.p1 p1Var = new ji.p1(m1Var2, 20);
                            m1Var2.h = p1Var;
                            LiteMode.addOnPowerSaverAppliedListener(p1Var);
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
    public /* synthetic */ x50(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(Context context, y50 y50Var) {
        super(context);
        this.a = 0;
        this.b = y50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new xv(10, this, context));
    }
}
