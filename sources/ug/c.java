package ug;

import a5.j;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.n;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.aj;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final c6 a;
    public final j b;
    public final j c;
    public float d;

    public c(Context context, c6 c6Var, aj ajVar, lg.a aVar) {
        super(context);
        j jVar = new j(this);
        this.b = jVar;
        j jVar2 = new j(this);
        this.c = jVar2;
        this.a = c6Var;
        tg.a c3 = tg.a.c(context, aVar, ajVar, c6Var);
        jVar.a = c3;
        c3.setOnClickListener(new n(28));
        h6.b((tg.a) jVar.a, 0.065f, 2.0f);
        tg.a c6 = tg.a.c(context, aVar, ajVar, c6Var);
        jVar2.a = c6;
        c6.setOnClickListener(new n(28));
        h6.b((tg.a) jVar2.a, 0.065f, 2.0f);
        a(jVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(jVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((tg.a) jVar.a, f6.m(1.0f, 0, 56, 1, -1, 0));
        addView((tg.a) jVar2.a, f6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(j jVar, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = g6.Xk;
        c6 c6Var = this.a;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Wk, c6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        jVar.b = textView;
        ((tg.a) jVar.a).addView(textView, f6.e(-2, -2, 17));
    }

    public final void b(j jVar) {
        float f9 = this.d * ((vd.a) jVar.c).e;
        float f10 = (1.0f - f9) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ud.a.a.getInterpolation(f9)) * (getMeasuredWidth() / 2.0f);
        if (jVar == this.b) {
            interpolation *= -1.0f;
        }
        ((tg.a) jVar.a).setTranslationX(interpolation);
        ((tg.a) jVar.a).setTranslationY(f10);
        ((tg.a) jVar.a).setAlpha(f9);
        ((tg.a) jVar.a).setVisibility(f9 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (tg.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((tg.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((tg.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f9) {
        if (this.d != f9) {
            this.d = f9;
            b(this.c);
            b(this.b);
        }
    }
}
