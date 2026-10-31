package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.va0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends LinearLayout implements k6 {
    public final p6 a;
    public final va0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public j(Context context, p6 p6Var, boolean z10) {
        super(context);
        this.a = p6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        va0 va0Var = new va0(1);
        this.b = va0Var;
        frameLayout.setBackground(va0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        LinearLayout f7 = m5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = z20.f(f7, textView, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = f10;
        f10.setGravity(17);
        f10.setMinWidth(i0.L(20.66f));
        f10.setPadding(i0.L(6.33f), 0, i0.L(6.33f), 0);
        f10.setTextSize(1, 16.0f);
        if (cd.X) {
            addView(f10, b6.j(13.33f, 0.0f));
            addView(f7, b6.q(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, b6.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, b6.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(f7, b6.q(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(f10, b6.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.c.setVisibility(i12 != 0 ? 0 : 8);
        this.e.setTranslationX(i12 == 0 ? i0.L(2.0f) : 0.0f);
        this.b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.U8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            float f7 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f7);
            textView.setTypeface(z10 ? i0.o() : null);
            int i10 = z10 ? t6.W8 : t6.n6;
            p6 p6Var = this.a;
            a7.V(textView, i10, p6Var);
            textView.setBackground(z10 ? t6.d0(i0.L(10.33f), t6.w0(t6.U8, p6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = t6.G6;
        p6 p6Var = this.a;
        this.e.setTextColor(t6.w0(i10, p6Var));
        int w02 = t6.w0(this.n ? t6.W8 : t6.n6, p6Var);
        TextView textView = this.f;
        textView.setTextColor(w02);
        textView.setBackground(this.n ? t6.d0(i0.L(10.33f), t6.w0(t6.U8, p6Var)) : null);
        this.b.b = p6Var != null ? p6Var.a() : t6.I.q();
    }
}
