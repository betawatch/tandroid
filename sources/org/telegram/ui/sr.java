package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        vr[] vrVarArr = this.f;
        int i15 = 0;
        if (vrVarArr == null || vrVarArr.length != i10) {
            if (vrVarArr != null) {
                for (vr vrVar : vrVarArr) {
                    removeView(vrVar);
                }
            }
            this.f = new vr[i10];
            int i16 = 0;
            while (i16 < i10) {
                this.f[i16] = new qr(this, getContext(), i16, i10);
                this.f[i16].setImeOptions(268435461);
                this.f[i16].setTextSize(1, 20.0f);
                this.f[i16].setMaxLines(1);
                this.f[i16].setTypeface(AndroidUtilities.bold());
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
                        addView(this.f[i16], w7.z5.t(i14, i13, 1, 0, 0, i16 == i10 + (-1) ? i18 : 0, 0));
                        this.f[i16].addTextChangedListener(new rr(this, i16, i10));
                        this.f[i16].setOnEditorActionListener(new ka(this, 3));
                        i16++;
                    }
                }
                i14 = i17;
                i13 = i12;
                addView(this.f[i16], w7.z5.t(i14, i13, 1, 0, 0, i16 == i10 + (-1) ? i18 : 0, 0));
                this.f[i16].addTextChangedListener(new rr(this, i16, i10));
                this.f[i16].setOnEditorActionListener(new ka(this, 3));
                i16++;
            }
            return;
        }
        while (true) {
            vr[] vrVarArr2 = this.f;
            if (i15 >= vrVarArr2.length) {
                return;
            }
            vrVarArr2[i15].setText("");
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
                vr[] vrVarArr = this.f;
                if (i11 >= vrVarArr.length) {
                    break;
                }
                if (vrVarArr[i11].isFocused()) {
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
                int f7 = i0.a.f(successProgress, i0.a.f(vrVar.getErrorProgress(), i0.a.f(vrVar.getFocusedProgress(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false));
                Paint paint = this.a;
                paint.setColor(f7);
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
        float f7 = vrVar.v;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f10 = this.c;
        rectF.inset(f10, f10);
        canvas.clipRect(rectF);
        if (vrVar.x) {
            float f11 = (f7 * 0.5f) + 0.5f;
            view.setAlpha(f7);
            canvas.scale(f11, f11, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f12 = vrVar.w;
        if (f12 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f13 = 1.0f - f12;
        float f14 = (f13 * 0.5f) + 0.5f;
        canvas.scale(f14, f14, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f13 * 255.0f));
        canvas.drawBitmap(vrVar.y, vrVar.getX(), vrVar.getY(), paint);
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
            vr[] vrVarArr = this.f;
            if (i10 >= vrVarArr.length) {
                return sb2.toString();
            }
            sb2.append(jf.b.d(vrVarArr[i10].getText().toString(), false));
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
