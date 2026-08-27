package sg;

import af.h;
import ag.l2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final c6 a;
    public final h b;
    public final h c;
    public float d;

    public c(Context context, c6 c6Var, zi ziVar, jg.a aVar) {
        super(context);
        h hVar = new h(this);
        this.b = hVar;
        h hVar2 = new h(this);
        this.c = hVar2;
        this.a = c6Var;
        rg.a c10 = rg.a.c(context, aVar, ziVar, c6Var);
        hVar.a = c10;
        c10.setOnClickListener(new l2(27));
        b6.b((rg.a) hVar.a, 0.065f, 2.0f);
        rg.a c11 = rg.a.c(context, aVar, ziVar, c6Var);
        hVar2.a = c11;
        c11.setOnClickListener(new l2(27));
        b6.b((rg.a) hVar2.a, 0.065f, 2.0f);
        a(hVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(hVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((rg.a) hVar.a, z5.m(1.0f, 0, 56, 1, -1, 0));
        addView((rg.a) hVar2.a, z5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(h hVar, String str, int i10, boolean z10) {
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
        hVar.b = textView;
        ((rg.a) hVar.a).addView(textView, z5.e(-2, -2, 17));
    }

    public final void b(h hVar) {
        float f10 = this.d * ((ud.a) hVar.c).e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - td.a.a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (hVar == this.b) {
            interpolation *= -1.0f;
        }
        ((rg.a) hVar.a).setTranslationX(interpolation);
        ((rg.a) hVar.a).setTranslationY(f11);
        ((rg.a) hVar.a).setAlpha(f10);
        ((rg.a) hVar.a).setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (rg.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((rg.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((rg.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.c);
            b(this.b);
        }
    }
}
