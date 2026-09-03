package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x91 {
    public final org.telegram.ui.Components.t00 a;
    public xf.f b;
    public final int c;
    public final /* synthetic */ y91 d;

    public x91(y91 y91Var, int i10) {
        this.d = y91Var;
        this.c = i10;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(y91Var.getContext());
        t00Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        t00Var.e = textPaint;
        t00Var.f = new Paint(1);
        Paint paint = new Paint(1);
        t00Var.h = paint;
        Paint paint2 = new Paint(1);
        t00Var.n = paint2;
        t00Var.w = AndroidUtilities.dp(35.0f);
        t00Var.x = AndroidUtilities.dp(22.0f);
        t00Var.y = AndroidUtilities.dp(8.0f);
        t00Var.B = AndroidUtilities.dp(3.5f);
        t00Var.C = new RectF();
        t00Var.D = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = t00Var;
        t00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        y91Var.h.addView(t00Var);
        y91Var.n.add(this);
    }
}
