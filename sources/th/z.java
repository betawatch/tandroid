package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z extends ReplacementSpan {
    public final /* synthetic */ int a;
    public final Object b;
    public final Paint c;
    public final qz0 d;

    public z(org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = 2;
        this.b = p6Var;
        this.d = new qz0(cd.L0(2131745255, null), 12.0f, org.telegram.messenger.i0.o());
        this.c = new Paint(1);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.a) {
            case 0:
                float L = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(0.0f);
                RectF rectF = (RectF) this.b;
                rectF.set(f7, L - org.telegram.messenger.i0.L(6.0f), this.d.k() + f7 + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(6.0f) + L);
                Paint paint2 = this.c;
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                this.d.c(org.telegram.messenger.i0.L(4.0f) + f7, L, 1.0f, -1, canvas);
                break;
            case 1:
                float L2 = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.33f);
                RectF rectF2 = (RectF) this.b;
                rectF2.set(f7, L2 - org.telegram.messenger.i0.L(7.0f), this.d.k() + f7 + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f) + L2);
                Paint paint3 = this.c;
                paint3.setColor(-572850);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint3);
                this.d.c(org.telegram.messenger.i0.L(6.0f) + f7, L2, 1.0f, -1, canvas);
                break;
            default:
                float L3 = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.0f);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, (org.telegram.ui.ActionBar.p6) this.b);
                Paint paint4 = this.c;
                paint4.setColor(w02);
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(f7, L3 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f) + f7 + this.d.c, org.telegram.messenger.i0.L(9.0f) + L3);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), paint4);
                this.d.c(f7 + org.telegram.messenger.i0.L(8.0f), L3, 1.0f, -1, canvas);
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float k10;
        int L;
        float f7;
        switch (this.a) {
            case 0:
                k10 = this.d.k();
                L = org.telegram.messenger.i0.L(8.0f);
                f7 = L;
                break;
            case 1:
                k10 = this.d.k();
                L = org.telegram.messenger.i0.L(12.0f);
                f7 = L;
                break;
            default:
                k10 = org.telegram.messenger.i0.L(16.0f);
                f7 = this.d.c;
                break;
        }
        return (int) (k10 + f7);
    }

    public z(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new qz0(cd.L0(2131748835, null), 9.0f, org.telegram.messenger.i0.o());
                break;
            default:
                this.b = new RectF();
                this.c = new Paint(1);
                this.d = new qz0(cd.L0(2131748835, null), 8.0f, org.telegram.messenger.i0.o());
                break;
        }
    }
}
