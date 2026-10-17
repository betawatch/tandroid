package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class x10 extends View {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x10(Context context) {
        super(context);
        this.a = 13;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                d50 d50Var = (d50) this.b;
                if (d50Var != null && d50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
                d50 d50Var = (d50) this.b;
                if (d50Var != null) {
                    d50Var.g = this;
                    int i10 = 0;
                    while (true) {
                        f50[] f50VarArr = d50Var.c;
                        if (i10 >= f50VarArr.length) {
                            break;
                        } else {
                            f50 f50Var = f50VarArr[i10];
                            f50Var.i.add(this);
                            f50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
                super.onAttachedToWindow();
                yh.m1 m1Var = (yh.m1) this.b;
                if (m1Var != null && !m1Var.i) {
                    m1Var.i = true;
                    m1Var.a();
                    ig.l0 l0Var = new ig.l0(m1Var, 26);
                    m1Var.h = l0Var;
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
                d50 d50Var = (d50) this.b;
                if (d50Var != null && d50Var.g != this) {
                    int i10 = 0;
                    while (true) {
                        f50[] f50VarArr = d50Var.c;
                        if (i10 >= f50VarArr.length) {
                            d50Var.g = null;
                            break;
                        } else {
                            f50 f50Var = f50VarArr[i10];
                            f50Var.i.remove(this);
                            f50Var.a();
                            i10++;
                        }
                    }
                }
                break;
            case 13:
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
    public void onDraw(final Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10 = 2;
        switch (this.a) {
            case 2:
                canvas.drawColor(((dj0) this.b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                break;
            case 3:
                tp0 tp0Var = (tp0) this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, tp0Var.c.size())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(tp0Var.S.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                tp0Var.S.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                tp0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
                int i11 = max / 2;
                tp0Var.T.set(measuredWidth - i11, 0.0f, i11 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(tp0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tp0Var.U);
                tp0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                tp0Var.T.set(AndroidUtilities.dp(2.0f) + r8, AndroidUtilities.dp(2.0f), r5 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tp0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tp0Var.U);
                canvas.drawText(format, measuredWidth - (r4 / 2), AndroidUtilities.dp(16.2f), tp0Var.S);
                break;
            case 4:
                kq0 kq0Var = (kq0) this.b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, kq0Var.c.size())));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(kq0Var.h0.measureText(format2))), AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                kq0Var.h0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                kq0Var.j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, kq0Var.u0, false));
                int i12 = max2 / 2;
                kq0Var.i0.set(measuredWidth2 - i12, 0.0f, i12 + measuredWidth2, getMeasuredHeight());
                canvas.drawRoundRect(kq0Var.i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), kq0Var.j0);
                kq0Var.j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                kq0Var.i0.set(AndroidUtilities.dp(2.0f) + r13, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(kq0Var.i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), kq0Var.j0);
                canvas.drawText(format2, measuredWidth2 - (r2 / 2), AndroidUtilities.dp(16.2f), kq0Var.h0);
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
                final org.telegram.ui.Wallet.v5 v5Var = (org.telegram.ui.Wallet.v5) this.b;
                float d = v5Var.O.d(v5Var.N, false);
                FrameLayout frameLayout = v5Var.G;
                if (frameLayout instanceof org.telegram.ui.Wallet.c6) {
                    ((org.telegram.ui.Wallet.c6) frameLayout).setEngravingAlpha(1.0f - d);
                }
                if (v5Var.U != null && d > 0.0f && getWidth() > 0) {
                    Paint paint = v5Var.M;
                    float width = v5Var.getFrontFace().getWidth();
                    float height = v5Var.getFrontFace().getHeight();
                    float f7 = width / 1640.0f;
                    float f10 = !v5Var.s ? 0.51061195f : 0.5002976f;
                    paint.setTypeface(org.telegram.ui.Wallet.v5.h(v5Var.getContext()));
                    paint.setTextSize(47.345238f * f7);
                    paint.setTextAlign(Paint.Align.CENTER);
                    float[] fArr = v5Var.e0;
                    paint.setColor((fArr == null || fArr.length < 18) ? org.telegram.ui.Wallet.k7.a(null, 0) : i0.b.f(fArr[8], org.telegram.ui.Wallet.k7.a(fArr, 0), org.telegram.ui.Wallet.k7.a(fArr, 1)));
                    paint.setAlpha((int) (255.0f * d));
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    final float f11 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
                    final float f12 = 27.333332f * f7;
                    final String[] split = org.telegram.ui.Wallet.v5.g(v5Var.U).split("\\n");
                    canvas.save();
                    canvas.translate(f7 * 1527.738f, f10 * height);
                    canvas.rotate(90.0f);
                    v5Var.d(d, false, new org.telegram.ui.Wallet.o2(v5Var, i10), new Runnable() { // from class: org.telegram.ui.Wallet.s5
                        @Override // java.lang.Runnable
                        public final void run() {
                            v5 v5Var2 = v5.this;
                            v5Var2.getClass();
                            String[] strArr = split;
                            String str = strArr[0];
                            float f13 = f12;
                            float f14 = f11;
                            Paint paint2 = v5Var2.M;
                            Canvas canvas2 = canvas;
                            canvas2.drawText(str, 0.0f, (-f13) + f14, paint2);
                            if (strArr.length > 1) {
                                canvas2.drawText(strArr[1], 0.0f, f13 + f14, paint2);
                            }
                        }
                    });
                    canvas.restore();
                    break;
                }
                break;
            case 12:
                super.onDraw(canvas);
                sg.j0 j0Var = (sg.j0) this.b;
                if (j0Var.p0 - j0Var.o0 > 1) {
                    d6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
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
                o41 o41Var = (o41) this.b;
                int[] iArr = o41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = o41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(o41Var.c, rect, o41Var.I, o41Var.e);
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
                a20 a20Var = (a20) this.b;
                if (a20Var.H) {
                    int i12 = a20Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    a20Var.J = (kVar.getMeasuredHeight() + i12) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + a20Var.I;
                    if (AndroidUtilities.dp(24.0f) + a20Var.y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + a20Var.y.getMeasuredHeight()) - a20Var.L);
                    }
                    a20Var.J = dp;
                }
                int i13 = (int) (a20Var.J - (0 * 2.5f));
                a20Var.J = i13;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30));
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                break;
            case 6:
                iw0 iw0Var = (iw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = iw0Var.c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + iw0Var.c.U.getMeasuredHeight() > dp2) {
                        dp2 = iw0Var.c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    iw0Var.c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iw0Var.c.Y, TLObject.FLAG_30));
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
                View view2 = ((te1) this.b).fragmentView;
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
                            ig.l0 l0Var = new ig.l0(m1Var2, 26);
                            m1Var2.h = l0Var;
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
    public /* synthetic */ x10(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(Context context, d50 d50Var) {
        super(context);
        this.a = 1;
        this.b = d50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.g51(20, this, context));
    }
}
