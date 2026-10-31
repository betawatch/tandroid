package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v91 extends org.telegram.ui.Cells.q1 {
    public final Path hd;
    public final Paint id;
    public final /* synthetic */ int jd;
    public final /* synthetic */ int kd;
    public final /* synthetic */ int ld;
    public final /* synthetic */ x91 md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v91(x91 x91Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, p6Var);
        this.md = x91Var;
        this.jd = i11;
        this.kd = i12;
        this.ld = i13;
        this.hd = new Path();
        this.id = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void h1(Canvas canvas) {
        this.Q4 = 0;
        this.R4 = this.O4.size() - 1;
        super.h1(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int Z1 = Z1(this.jd);
        float S1 = S1(Z1);
        float R1 = R1(Z1);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getPollButtonsLeft(), S1, getPollButtonsRight(), R1);
        Path path = this.hd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        Paint paint = this.id;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(this.md.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
        canvas.clipPath(path);
        b1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.kd, this.ld);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
