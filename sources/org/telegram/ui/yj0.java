package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yj0 extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final TextView[] c;
    public final /* synthetic */ zj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj0(zj0 zj0Var, Context context) {
        super(context);
        this.d = zj0Var;
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new TextView[2];
        setWillNotDraw(false);
        int i10 = 0;
        while (i10 < 2) {
            TextView[] textViewArr = this.c;
            TextView textView = new TextView(context);
            textViewArr[i10] = textView;
            textView.setText(LocaleController.getString(i10 == 0 ? R.string.NewsForYou : R.string.Added));
            textView.setTextSize(14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            textView.setOnClickListener(new ai.w(this, i10, 26));
            addView(textView);
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.a;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        int i10 = org.telegram.ui.ActionBar.y6.d7;
        zj0 zj0Var = this.d;
        paint.setColor(zj0Var.getThemedColor(i10));
        float dp = AndroidUtilities.dp(0.5f);
        float dp2 = AndroidUtilities.dp(0.5f);
        float width = getWidth() - AndroidUtilities.dp(0.5f);
        float height = getHeight() - AndroidUtilities.dp(0.5f);
        RectF rectF = this.b;
        rectF.set(dp, dp2, width, height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(zj0Var.getThemedColor(org.telegram.ui.ActionBar.y6.a7));
        float width2 = (getWidth() - AndroidUtilities.dp(6.0f)) / 2.0f;
        float positionAnimated = (zj0Var.v.getPositionAnimated() * width2) + AndroidUtilities.dp(3.0f);
        rectF.set(positionAnimated, AndroidUtilities.dp(3.0f), width2 + positionAnimated, AndroidUtilities.dp(33.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
        int i11 = 0;
        while (i11 < 2) {
            TextView[] textViewArr = this.c;
            textViewArr[i11].setSelected(zj0Var.v.getCurrentPosition() == i11);
            textViewArr[i11].setTextColor(i0.a.f(Math.max(0.0f, 1.0f - Math.abs(zj0Var.v.getPositionAnimated() - i11)), zj0Var.getThemedColor(org.telegram.ui.ActionBar.y6.y6), zj0Var.getThemedColor(org.telegram.ui.ActionBar.y6.G6)));
            i11++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < 2; i14++) {
            int width = (((getWidth() - AndroidUtilities.dp(6.0f)) * i14) / 2) + AndroidUtilities.dp(3.0f);
            TextView[] textViewArr = this.c;
            textViewArr[i14].layout(width, AndroidUtilities.dp(3.0f), textViewArr[i14].getMeasuredWidth() + width, AndroidUtilities.dp(33.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        for (TextView textView : this.c) {
            textView.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - AndroidUtilities.dp(6.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), TLObject.FLAG_30));
        }
    }
}
