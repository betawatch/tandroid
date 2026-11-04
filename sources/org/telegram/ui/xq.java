package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class xq extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public zq[] f;

    public xq(Context context) {
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
    public final void b(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        zq[] zqVarArr = this.f;
        int i14 = 0;
        if (zqVarArr == null || zqVarArr.length != i3) {
            if (zqVarArr != null) {
                for (zq zqVar : zqVarArr) {
                    removeView(zqVar);
                }
            }
            this.f = new zq[i3];
            int i15 = 0;
            while (i15 < i3) {
                this.f[i15] = new vq(this, getContext(), i15, i3);
                this.f[i15].setImeOptions(268435461);
                this.f[i15].setTextSize(1, 20.0f);
                this.f[i15].setMaxLines(1);
                this.f[i15].setTypeface(org.telegram.messenger.g0.o());
                this.f[i15].setPadding(0, 0, 0, 0);
                this.f[i15].setGravity(17);
                if (i10 == 3) {
                    this.f[i15].setEnabled(false);
                    this.f[i15].setInputType(0);
                    this.f[i15].setVisibility(8);
                } else {
                    this.f[i15].setInputType(3);
                }
                int i16 = 42;
                int i17 = 10;
                if (i10 == 10) {
                    i11 = 47;
                } else {
                    i11 = 34;
                    if (i10 == 11) {
                        i16 = 28;
                        i17 = 5;
                    } else {
                        i17 = 7;
                        i12 = 42;
                        i13 = 34;
                        addView(this.f[i15], b8.mf.t(i13, i12, 1, 0, 0, i15 == i3 + (-1) ? i17 : 0, 0));
                        this.f[i15].addTextChangedListener(new wq(this, i15, i3));
                        this.f[i15].setOnEditorActionListener(new ea(this, 3));
                        i15++;
                    }
                }
                i13 = i16;
                i12 = i11;
                addView(this.f[i15], b8.mf.t(i13, i12, 1, 0, 0, i15 == i3 + (-1) ? i17 : 0, 0));
                this.f[i15].addTextChangedListener(new wq(this, i15, i3));
                this.f[i15].setOnEditorActionListener(new ea(this, 3));
                i15++;
            }
            return;
        }
        while (true) {
            zq[] zqVarArr2 = this.f;
            if (i14 >= zqVarArr2.length) {
                return;
            }
            zqVarArr2[i14].setText("");
            i14++;
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f == null) {
            return;
        }
        int i3 = 0;
        if (z10) {
            int i10 = 0;
            while (true) {
                zq[] zqVarArr = this.f;
                if (i10 >= zqVarArr.length) {
                    break;
                }
                if (zqVarArr[i10].isFocused()) {
                    i3 = i10;
                    break;
                }
                i10++;
            }
        }
        for (int i11 = i3; i11 < Math.min(this.f.length, str.length() + i3); i11++) {
            this.f[i11].setText(Character.toString(str.charAt(i11 - i3)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof zq) {
                zq zqVar = (zq) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        zqVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        zqVar.A(0.0f);
                    }
                }
                float successProgress = zqVar.getSuccessProgress();
                int f10 = i0.a.f(successProgress, i0.a.f(zqVar.getErrorProgress(), i0.a.f(zqVar.getFocusedProgress(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false));
                Paint paint = this.a;
                paint.setColor(f10);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f11 = this.c;
                rectF.inset(f11, f11);
                if (successProgress != 0.0f) {
                    float f12 = -Math.max(0.0f, (zqVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f12, f12);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof zq)) {
            return super.drawChild(canvas, view, j10);
        }
        zq zqVar = (zq) view;
        canvas.save();
        float f10 = zqVar.Q1;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f11 = this.c;
        rectF.inset(f11, f11);
        canvas.clipRect(rectF);
        if (zqVar.S1) {
            float f12 = (f10 * 0.5f) + 0.5f;
            view.setAlpha(f10);
            canvas.scale(f12, f12, (zqVar.getMeasuredWidth() / 2.0f) + zqVar.getX(), (zqVar.getMeasuredHeight() / 2.0f) + zqVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f13 = zqVar.R1;
        if (f13 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f14 = 1.0f - f13;
        float f15 = (f14 * 0.5f) + 0.5f;
        canvas.scale(f15, f15, (zqVar.getMeasuredWidth() / 2.0f) + zqVar.getX(), (zqVar.getMeasuredHeight() / 2.0f) + zqVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawBitmap(zqVar.T1, zqVar.getX(), zqVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            zq[] zqVarArr = this.f;
            if (i3 >= zqVarArr.length) {
                return sb2.toString();
            }
            sb2.append(mf.b.d(zqVarArr[i3].getText().toString(), false));
            i3++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        float L = org.telegram.messenger.g0.L(1.5f);
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
