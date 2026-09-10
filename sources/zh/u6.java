package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u6 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public u6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, f6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.StoryError));
        textView.setTextColor(-1);
        addView(textView, w7.a6.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(AndroidUtilities.dp(9.0f));
        addView(textView2, w7.a6.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        int dp = AndroidUtilities.dp(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 536870911, 956301311, 956301311));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setText(LocaleController.getString(R.string.TryAgain));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, w7.a6.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(dp, height, AndroidUtilities.dp(10.0f), this.a);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp - AndroidUtilities.dp(1.0f), height - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + dp, AndroidUtilities.dpf2(1.6f) + height);
        float dp2 = AndroidUtilities.dp(3.0f);
        float dp3 = AndroidUtilities.dp(3.0f);
        Paint paint = this.b;
        canvas.drawRoundRect(rectF, dp2, dp3, paint);
        rectF.set(dp - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + height, dp + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(0.0f);
            textView2.setVisibility(8);
        } else {
            textView.setTranslationY(-AndroidUtilities.dpf2(5.33f));
            textView2.setText(tL_error.text);
            textView2.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }
}
