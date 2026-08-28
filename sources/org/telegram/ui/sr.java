package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class sr extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public vr[] f;

    public sr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i9, int i10) {
        int i11;
        int i12;
        vr[] vrVarArr = this.f;
        int i13 = 0;
        if (vrVarArr == null || vrVarArr.length != i9) {
            if (vrVarArr != null) {
                for (vr vrVar : vrVarArr) {
                    removeView(vrVar);
                }
            }
            this.f = new vr[i9];
            int i14 = 0;
            while (i14 < i9) {
                this.f[i14] = new qr(this, getContext(), i14, i9);
                this.f[i14].setImeOptions(268435461);
                this.f[i14].setTextSize(1, 20.0f);
                this.f[i14].setMaxLines(1);
                this.f[i14].setTypeface(AndroidUtilities.bold());
                this.f[i14].setPadding(0, 0, 0, 0);
                this.f[i14].setGravity(17);
                if (i10 == 3) {
                    this.f[i14].setEnabled(false);
                    this.f[i14].setInputType(0);
                    this.f[i14].setVisibility(8);
                } else {
                    this.f[i14].setInputType(3);
                }
                int i15 = 10;
                if (i10 == 10) {
                    i11 = 42;
                    i12 = 47;
                } else if (i10 == 11) {
                    i15 = 5;
                    i11 = 28;
                    i12 = 34;
                } else {
                    i15 = 7;
                    i11 = 34;
                    i12 = 42;
                }
                addView(this.f[i14], g7.e6.t(i11, i12, 1, 0, 0, i14 != i9 + (-1) ? i15 : 0, 0));
                this.f[i14].addTextChangedListener(new rr(this, i14, i9));
                this.f[i14].setOnEditorActionListener(new ea(this, 3));
                i14++;
            }
            return;
        }
        while (true) {
            vr[] vrVarArr2 = this.f;
            if (i13 >= vrVarArr2.length) {
                return;
            }
            vrVarArr2[i13].setText("");
            i13++;
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f == null) {
            return;
        }
        int i9 = 0;
        if (z10) {
            int i10 = 0;
            while (true) {
                vr[] vrVarArr = this.f;
                if (i10 >= vrVarArr.length) {
                    break;
                }
                if (vrVarArr[i10].isFocused()) {
                    i9 = i10;
                    break;
                }
                i10++;
            }
        }
        for (int i11 = i9; i11 < Math.min(this.f.length, str.length() + i9); i11++) {
            this.f[i11].setText(Character.toString(str.charAt(i11 - i9)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof vr) {
                vr vrVar = (vr) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        vrVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        vrVar.j(0.0f);
                    }
                }
                float successProgress = vrVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(vrVar.getErrorProgress(), i0.a.d(vrVar.getFocusedProgress(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l6, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i7, false));
                Paint paint = this.a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (vrVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof vr)) {
            return super.drawChild(canvas, view, j10);
        }
        vr vrVar = (vr) view;
        canvas.save();
        float f10 = vrVar.v;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f11 = this.c;
        rectF.inset(f11, f11);
        canvas.clipRect(rectF);
        if (vrVar.x) {
            float f12 = (f10 * 0.5f) + 0.5f;
            view.setAlpha(f10);
            canvas.scale(f12, f12, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f13 = vrVar.w;
        if (f13 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f14 = 1.0f - f13;
        float f15 = (f14 * 0.5f) + 0.5f;
        canvas.scale(f15, f15, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawBitmap(vrVar.y, vrVar.getX(), vrVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            vr[] vrVarArr = this.f;
            if (i9 >= vrVarArr.length) {
                return sb2.toString();
            }
            sb2.append(ne.b.d(vrVarArr[i9].getText().toString(), false));
            i9++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        float dp = AndroidUtilities.dp(1.5f);
        this.c = dp;
        this.a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
