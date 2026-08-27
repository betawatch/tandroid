package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.bb0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i extends LinearLayout implements x5 {
    public final c6 a;
    public final bb0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public i(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.a = c6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        bb0 bb0Var = new bb0(1);
        this.b = bb0Var;
        frameLayout.setBackground(bb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        LinearLayout g10 = y1.g(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = pa.i(g10, textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = i10;
        i10.setGravity(17);
        i10.setMinWidth(AndroidUtilities.dp(20.66f));
        i10.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i10, z5.j(13.33f, 0.0f));
            addView(g10, z5.p(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, z5.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, z5.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(g10, z5.p(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(i10, z5.j(0.0f, 13.33f));
        }
        d();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i12 != 0 ? 0 : 8);
        this.e.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.a;
        this.e.setTextColor(g6.v0(i10, c6Var));
        int v02 = g6.v0(this.n ? g6.W8 : g6.n6, c6Var);
        TextView textView = this.f;
        textView.setTextColor(v02);
        textView.setBackground(this.n ? g6.b0(AndroidUtilities.dp(10.33f), g6.v0(g6.U8, c6Var)) : null);
        this.b.b = c6Var != null ? c6Var.a() : g6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            float f10 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f10);
            textView.setTypeface(z10 ? AndroidUtilities.bold() : null);
            int i10 = z10 ? g6.W8 : g6.n6;
            c6 c6Var = this.a;
            textView.setTextColor(g6.v0(i10, c6Var));
            textView.setBackground(z10 ? g6.b0(AndroidUtilities.dp(10.33f), g6.v0(g6.U8, c6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
