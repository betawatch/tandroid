package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c5.j;
import eg.m;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.fj;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final g6 a;
    public final j b;
    public final j c;
    public float d;

    public c(Context context, g6 g6Var, fj fjVar, og.a aVar) {
        super(context);
        j jVar = new j(this);
        this.b = jVar;
        j jVar2 = new j(this);
        this.c = jVar2;
        this.a = g6Var;
        wg.a c3 = wg.a.c(context, aVar, g6Var, fjVar);
        jVar.a = c3;
        c3.setOnClickListener(new m(28));
        e6.b((wg.a) jVar.a, 0.065f, 2.0f);
        wg.a c10 = wg.a.c(context, aVar, g6Var, fjVar);
        jVar2.a = c10;
        c10.setOnClickListener(new m(28));
        e6.b((wg.a) jVar2.a, 0.065f, 2.0f);
        a(jVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(jVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((wg.a) jVar.a, c6.m(1.0f, 0, 56, 1, -1, 0));
        addView((wg.a) jVar2.a, c6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(j jVar, String str, int i10, boolean z4) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = k6.Xk;
        g6 g6Var = this.a;
        textView.setTextColor(k6.v0(i11, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.Wk, g6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z4 ? mutate : null;
        if (z4) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        jVar.b = textView;
        ((wg.a) jVar.a).addView(textView, c6.e(-2, -2, 17));
    }

    public final void b(j jVar) {
        float f10 = this.d * ((xd.a) jVar.c).e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - wd.a.a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (jVar == this.b) {
            interpolation *= -1.0f;
        }
        ((wg.a) jVar.a).setTranslationX(interpolation);
        ((wg.a) jVar.a).setTranslationY(f11);
        ((wg.a) jVar.a).setAlpha(f10);
        ((wg.a) jVar.a).setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (wg.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((wg.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((wg.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.c);
            b(this.b);
        }
    }
}
