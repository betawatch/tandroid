package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w extends FrameLayout {
    public final RadioButton a;
    public final Drawable b;
    public final Drawable c;
    public final s6 d;
    public final s6 e;
    public final TextView f;
    public final SpannableString h;
    public final SpannableString n;
    public TL_stars.TL_starsGiveawayOption r;
    public int s;
    public final h6 v;

    public w(Context context, u6 u6Var) {
        super(context);
        this.v = new h6(this, 0L, 500L, ds.h);
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.b = mutate;
        f7.y(this, mutate, y6.h5, u6Var, PorterDuff.Mode.SRC_IN);
        this.c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        s6 s6Var = new s6(context, false, false, false);
        this.d = s6Var;
        f7.Z(s6Var, y6.G6, u6Var);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(16.0f));
        addView(s6Var, kb1.h(-1, 20.0f, 51, 64.0f, 8.0f, 80.0f, 0.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new fa0(AndroidUtilities.dp(90.0f), s6Var), 0, 1, 33);
        s6 s6Var2 = new s6(context, false, true, true);
        this.e = s6Var2;
        int i10 = y6.z6;
        f7.Z(s6Var2, i10, u6Var);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        addView(s6Var2, kb1.h(-1, 14.0f, 51, 64.0f, 31.0f, 80.0f, 0.0f));
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        spannableString2.setSpan(new fa0(AndroidUtilities.dp(70.0f), s6Var2), 0, 1, 33);
        TextView textView = new TextView(context);
        this.f = textView;
        f7.V(textView, i10, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        addView(textView, kb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        f7.P(radioButton, y6.j7, y6.E5, u6Var);
        addView(radioButton, kb1.h(20, 20.0f, 19, 22.0f, 0.0f, 0.0f, 0.0f));
    }

    public TL_stars.TL_starsGiveawayOption getOption() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float d = this.v.d(this.s, false);
        float dp = AndroidUtilities.dp(24.0f);
        float dp2 = AndroidUtilities.dp(24.0f);
        float dp3 = AndroidUtilities.dp(2.5f);
        float dp4 = AndroidUtilities.dp(64.0f);
        float dp5 = AndroidUtilities.dp(8.0f);
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f7 = (((ceil - 1) - (1.0f - clamp)) * dp3 * 1.0f) + dp4;
            int i10 = (int) f7;
            int i11 = (int) dp5;
            int i12 = (int) (f7 + dp);
            int i13 = (int) (dp5 + dp2);
            Drawable drawable = this.b;
            drawable.setBounds(i10, i11, i12, i13);
            int i14 = (int) (clamp * 255.0f);
            drawable.setAlpha(i14);
            drawable.draw(canvas);
            Drawable drawable2 = this.c;
            drawable2.setBounds(i10, i11, i12, i13);
            drawable2.setAlpha(i14);
            drawable2.draw(canvas);
        }
        this.d.setTranslationX((dp3 * d) + AndroidUtilities.dp(22.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }
}
