package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class sr extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public ur[] f;

    public sr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        ur[] urVarArr = this.f;
        int i14 = 0;
        if (urVarArr == null || urVarArr.length != i10) {
            if (urVarArr != null) {
                for (ur urVar : urVarArr) {
                    removeView(urVar);
                }
            }
            this.f = new ur[i10];
            int i15 = 0;
            while (i15 < i10) {
                this.f[i15] = new qr(this, getContext(), i15, i10);
                this.f[i15].setImeOptions(268435461);
                this.f[i15].setTextSize(1, 20.0f);
                this.f[i15].setMaxLines(1);
                this.f[i15].setTypeface(AndroidUtilities.bold());
                this.f[i15].setPadding(0, 0, 0, 0);
                this.f[i15].setGravity(17);
                if (i11 == 3) {
                    this.f[i15].setEnabled(false);
                    this.f[i15].setInputType(0);
                    this.f[i15].setVisibility(8);
                } else {
                    this.f[i15].setInputType(3);
                }
                int i16 = 10;
                if (i11 == 10) {
                    i12 = 42;
                    i13 = 47;
                } else if (i11 == 11) {
                    i16 = 5;
                    i12 = 28;
                    i13 = 34;
                } else {
                    i16 = 7;
                    i12 = 34;
                    i13 = 42;
                }
                addView(this.f[i15], i7.f6.t(i12, i13, 1, 0, 0, i15 != i10 + (-1) ? i16 : 0, 0));
                this.f[i15].addTextChangedListener(new rr(this, i15, i10));
                this.f[i15].setOnEditorActionListener(new da(this, 3));
                i15++;
            }
            return;
        }
        while (true) {
            ur[] urVarArr2 = this.f;
            if (i14 >= urVarArr2.length) {
                return;
            }
            urVarArr2[i14].setText("");
            i14++;
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
                ur[] urVarArr = this.f;
                if (i11 >= urVarArr.length) {
                    break;
                }
                if (urVarArr[i11].isFocused()) {
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
            if (childAt instanceof ur) {
                ur urVar = (ur) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        urVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        urVar.j(0.0f);
                    }
                }
                float successProgress = urVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(urVar.getErrorProgress(), i0.a.d(urVar.getFocusedProgress(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l6, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i7, false));
                Paint paint = this.a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f9 = this.c;
                rectF.inset(f9, f9);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (urVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof ur)) {
            return super.drawChild(canvas, view, j10);
        }
        ur urVar = (ur) view;
        canvas.save();
        float f9 = urVar.v;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f10 = this.c;
        rectF.inset(f10, f10);
        canvas.clipRect(rectF);
        if (urVar.x) {
            float f11 = (f9 * 0.5f) + 0.5f;
            view.setAlpha(f9);
            canvas.scale(f11, f11, (urVar.getMeasuredWidth() / 2.0f) + urVar.getX(), (urVar.getMeasuredHeight() / 2.0f) + urVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f9) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f12 = urVar.w;
        if (f12 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f13 = 1.0f - f12;
        float f14 = (f13 * 0.5f) + 0.5f;
        canvas.scale(f14, f14, (urVar.getMeasuredWidth() / 2.0f) + urVar.getX(), (urVar.getMeasuredHeight() / 2.0f) + urVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f13 * 255.0f));
        canvas.drawBitmap(urVar.y, urVar.getX(), urVar.getY(), paint);
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
            ur[] urVarArr = this.f;
            if (i10 >= urVarArr.length) {
                return sb2.toString();
            }
            sb2.append(qe.b.d(urVarArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
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
