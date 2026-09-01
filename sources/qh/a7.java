package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.l90;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class a7 extends FrameLayout {
    public final Paint a;
    public final ImageView b;
    public final ImageView c;
    public final org.telegram.ui.Components.k6 d;
    public final org.telegram.ui.Components.k6 e;
    public final ImageView f;
    public final SpannableString h;
    public final SpannableString n;

    public a7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, k7.c6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setBackground(new y6(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, k7.c6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.d = k6Var;
        k6Var.setTextColor(-15033089);
        k6Var.setTextSize(AndroidUtilities.dp(14.21f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setEllipsizeByGradient(true);
        k6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(k6Var, k7.c6.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.e = k6Var2;
        k6Var2.setTextColor(-8355712);
        k6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        k6Var2.setEllipsizeByGradient(true);
        k6Var2.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(k6Var2, k7.c6.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = k6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        l90 l90Var = new l90(AndroidUtilities.dp(200.0f), k6Var);
        l90Var.e = 0.8f;
        l90Var.a(org.telegram.ui.ActionBar.k6.l1(0.4f, textColor), org.telegram.ui.ActionBar.k6.l1(0.08f, textColor));
        spannableString.setSpan(l90Var, 0, spannableString.length(), 33);
        int textColor2 = k6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        l90 l90Var2 = new l90(AndroidUtilities.dp(140.0f), k6Var2);
        l90Var2.e = 0.8f;
        l90Var2.a(org.telegram.ui.ActionBar.k6.l1(0.4f, textColor2), org.telegram.ui.ActionBar.k6.l1(0.08f, textColor2));
        spannableString2.setSpan(l90Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, k7.c6.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float shadowHeight = AndroidUtilities.getShadowHeight();
        Paint paint = this.a;
        canvas.drawRect(0.0f, 0.0f, width, shadowHeight, paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
