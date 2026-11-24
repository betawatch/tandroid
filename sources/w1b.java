// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w1b extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public boolean e;
    public CharSequence f;
    public int h;
    public int n;
    public CharSequence r;
    public int s;
    public final ylb w;

    public w1b(Context context, boolean z, boolean z2, ylb ylbVar, boolean z3) {
        super(context);
        ViewGroup.LayoutParams d;
        int p1;
        int i;
        wmb K;
        wmb K2;
        ViewGroup.LayoutParams d2;
        this.w = ylbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        anb.Y(textView, z3 ? anb.g(cmb.Ml, nm7.i2) : anb.M(cmb.Kf), ylbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z2) {
            d = qoe.i(-2.0f, -2.0f, 8388659, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        } else {
            d = qoe.d(-2, -2.0f, 51, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView m = wi8.m(linearLayout, textView, qoe.p(-2, -2, 1.0f, 16), context);
        this.c = m;
        anb.Y(m, z3 ? anb.g(cmb.Ml, nm7.i2) : anb.M(cmb.Kf), ylbVar);
        m.setTextSize(1, 11.0f);
        m.setTypeface(gm.o());
        m.setEllipsize(truncateAt);
        m.setPadding(gm.L(6.0f), 0, gm.L(6.33f), 0);
        int L = gm.L(9.0f);
        if (z3) {
            int i2 = cmb.Ml;
            i = on2.p(cmb.v0(i2, ylbVar), 12);
            p1 = on2.p(cmb.v0(i2, ylbVar), 20);
        } else {
            int i3 = cmb.Kf;
            int p12 = cmb.p1(0.1f, cmb.v0(i3, ylbVar));
            p1 = cmb.p1(0.24f, cmb.v0(i3, ylbVar));
            i = p12;
        }
        fg0 i0 = cmb.i0(L, L, L, L, i, p1, p1);
        if (z3) {
            int i4 = cmb.Ml;
            K = anb.g(i4, 12);
            K2 = anb.g(i4, 20);
        } else {
            int i5 = cmb.Kf;
            K = anb.K(0.1f, i5);
            K2 = anb.K(0.24f, i5);
        }
        m.setBackground(i0);
        anb.j(m, i0, K, K2, ylbVar);
        m.setGravity(17);
        m.setSingleLine(true);
        rve.a(m);
        linearLayout.addView(m, qoe.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        m.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.Y(textView2, z3 ? anb.g(cmb.Ml, nm7.i2) : anb.M(cmb.Kf), ylbVar);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z2 ? qoe.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : qoe.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        wmb g = z3 ? anb.g(cmb.Ml, nm7.i2) : anb.M(cmb.Mf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i6 = g.a;
        int i7 = g.b;
        byte b = g.c;
        float f = g.d;
        int P = anb.P(i6, i7, b, f, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        anb.N(imageView, 5, i6, i7, b, f, ylbVar, P, porterDuffColorFilter).h = mode;
        int i8 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i8, ylbVar), 3, -1);
        wmb M = anb.M(i8);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        if (z2) {
            d2 = qoe.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        } else {
            d2 = qoe.d(24, 24.0f, 53, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(gm.L(4.0f));
        addView(imageView, d2);
    }

    public final void a(int i, CharSequence charSequence) {
        b(charSequence, i, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i, String str, int i2, int i3) {
        this.f = charSequence;
        this.h = i2;
        this.n = i3;
        TextView textView = this.a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.e = false;
            if (i3 != 0) {
                d();
            } else {
                textView.setText(gw3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i != 0) {
                imageView.setImageResource(i);
                imageView.setContentDescription(str);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.c.setVisibility(8);
    }

    public final void c(int i, CharSequence charSequence) {
        this.r = charSequence;
        this.s = i;
        this.b.setVisibility(charSequence != null ? 0 : 8);
        e();
    }

    public final void d() {
        if (this.f == null || this.n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f);
        try {
            do4 do4Var = new do4(cmb.Lf, this.w);
            int i = this.h;
            spannableStringBuilder.setSpan(do4Var, i, this.n + i, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(gw3.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }

    public final void e() {
        ylb ylbVar = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new v1b(cmb.Lf, ylbVar), 0, this.s, 33);
                spannableStringBuilder.setSpan(new v1b(cmb.Kf, ylbVar), this.s, this.r.length(), 33);
            } catch (Exception unused) {
            }
            this.b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.a.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view == this.b) {
            i2 = hg9.v(16.0f, this.a.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 1073741825);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(jb6.M0(2131751194, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i) {
        this.a.setTextColor(i);
    }
}
