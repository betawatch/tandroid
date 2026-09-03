package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c5.j;
import dg.m;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.hj;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final f6 a;
    public final j b;
    public final j c;
    public float d;

    public c(Context context, f6 f6Var, hj hjVar, ng.a aVar) {
        super(context);
        j jVar = new j(this);
        this.b = jVar;
        j jVar2 = new j(this);
        this.c = jVar2;
        this.a = f6Var;
        vg.a c3 = vg.a.c(context, aVar, f6Var, hjVar);
        jVar.a = c3;
        c3.setOnClickListener(new m(28));
        d6.b((vg.a) jVar.a, 0.065f, 2.0f);
        vg.a c10 = vg.a.c(context, aVar, f6Var, hjVar);
        jVar2.a = c10;
        c10.setOnClickListener(new m(28));
        d6.b((vg.a) jVar2.a, 0.065f, 2.0f);
        a(jVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(jVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((vg.a) jVar.a, b6.m(1.0f, 0, 56, 1, -1, 0));
        addView((vg.a) jVar2.a, b6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(j jVar, String str, int i10, boolean z4) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = j6.Xk;
        f6 f6Var = this.a;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Wk, f6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z4 ? mutate : null;
        if (z4) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        jVar.b = textView;
        ((vg.a) jVar.a).addView(textView, b6.e(-2, -2, 17));
    }

    public final void b(j jVar) {
        float f10 = this.d * ((xd.a) jVar.c).e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - wd.a.a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (jVar == this.b) {
            interpolation *= -1.0f;
        }
        ((vg.a) jVar.a).setTranslationX(interpolation);
        ((vg.a) jVar.a).setTranslationY(f11);
        ((vg.a) jVar.a).setAlpha(f10);
        ((vg.a) jVar.a).setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (vg.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((vg.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((vg.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.c);
            b(this.b);
        }
    }
}
