package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class zr extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public bs[] f;

    public zr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        bs[] bsVarArr = this.f;
        int i15 = 0;
        if (bsVarArr == null || bsVarArr.length != i10) {
            if (bsVarArr != null) {
                for (bs bsVar : bsVarArr) {
                    removeView(bsVar);
                }
            }
            this.f = new bs[i10];
            int i16 = 0;
            while (i16 < i10) {
                this.f[i16] = new xr(this, getContext(), i16, i10);
                this.f[i16].setImeOptions(268435461);
                this.f[i16].setTextSize(1, 20.0f);
                this.f[i16].setMaxLines(1);
                this.f[i16].setTypeface(org.telegram.messenger.i0.o());
                this.f[i16].setPadding(0, 0, 0, 0);
                this.f[i16].setGravity(17);
                if (i11 == 3) {
                    this.f[i16].setEnabled(false);
                    this.f[i16].setInputType(0);
                    this.f[i16].setVisibility(8);
                } else {
                    this.f[i16].setInputType(3);
                }
                int i17 = 42;
                int i18 = 10;
                if (i11 == 10) {
                    i12 = 47;
                } else {
                    i12 = 34;
                    if (i11 == 11) {
                        i17 = 28;
                        i18 = 5;
                    } else {
                        i18 = 7;
                        i13 = 42;
                        i14 = 34;
                        addView(this.f[i16], w7.b6.t(i14, i13, 1, 0, 0, i16 == i10 + (-1) ? i18 : 0, 0));
                        this.f[i16].addTextChangedListener(new yr(this, i16, i10));
                        this.f[i16].setOnEditorActionListener(new ha(this, 3));
                        i16++;
                    }
                }
                i14 = i17;
                i13 = i12;
                addView(this.f[i16], w7.b6.t(i14, i13, 1, 0, 0, i16 == i10 + (-1) ? i18 : 0, 0));
                this.f[i16].addTextChangedListener(new yr(this, i16, i10));
                this.f[i16].setOnEditorActionListener(new ha(this, 3));
                i16++;
            }
            return;
        }
        while (true) {
            bs[] bsVarArr2 = this.f;
            if (i15 >= bsVarArr2.length) {
                return;
            }
            bsVarArr2[i15].setText("");
            i15++;
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int i11 = 0;
            while (true) {
                bs[] bsVarArr = this.f;
                if (i11 >= bsVarArr.length) {
                    break;
                }
                if (bsVarArr[i11].isFocused()) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        for (int i12 = i10; i12 < Math.min(this.f.length, str.length() + i10); i12++) {
            this.f[i12].setText(Character.toString(str.charAt(i12 - i10)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof bs) {
                bs bsVar = (bs) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        bsVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        bsVar.A(0.0f);
                    }
                }
                float successProgress = bsVar.getSuccessProgress();
                int f7 = i0.b.f(successProgress, i0.b.f(bsVar.getErrorProgress(), i0.b.f(bsVar.getFocusedProgress(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.k6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.l6, false)), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false)), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i7, false));
                Paint paint = this.a;
                paint.setColor(f7);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (bsVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof bs)) {
            return super.drawChild(canvas, view, j10);
        }
        bs bsVar = (bs) view;
        canvas.save();
        float f7 = bsVar.P1;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f10 = this.c;
        rectF.inset(f10, f10);
        canvas.clipRect(rectF);
        if (bsVar.R1) {
            float f11 = (f7 * 0.5f) + 0.5f;
            view.setAlpha(f7);
            canvas.scale(f11, f11, (bsVar.getMeasuredWidth() / 2.0f) + bsVar.getX(), (bsVar.getMeasuredHeight() / 2.0f) + bsVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f12 = bsVar.Q1;
        if (f12 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f13 = 1.0f - f12;
        float f14 = (f13 * 0.5f) + 0.5f;
        canvas.scale(f14, f14, (bsVar.getMeasuredWidth() / 2.0f) + bsVar.getX(), (bsVar.getMeasuredHeight() / 2.0f) + bsVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f13 * 255.0f));
        canvas.drawBitmap(bsVar.S1, bsVar.getX(), bsVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            bs[] bsVarArr = this.f;
            if (i10 >= bsVarArr.length) {
                return sb2.toString();
            }
            sb2.append(af.b.d(bsVarArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(1.5f);
        this.c = L;
        this.a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
