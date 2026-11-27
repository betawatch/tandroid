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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class t3b extends FrameLayout {
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
    public final vnb w;

    public t3b(Context context, boolean z, boolean z2, vnb vnbVar, boolean z3) {
        super(context);
        ViewGroup.LayoutParams d;
        int p1;
        int i;
        uob K;
        uob K2;
        ViewGroup.LayoutParams d2;
        this.w = vnbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        yob.Y(textView, z3 ? yob.g(aob.Nl, jn7.i2) : yob.M(aob.Lf), vnbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z2) {
            d = tre.i(-2.0f, -2.0f, 8388659, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        } else {
            d = tre.d(-2, -2.0f, 51, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView m = ik8.m(linearLayout, textView, tre.p(-2, -2, 1.0f, 16), context);
        this.c = m;
        yob.Y(m, z3 ? yob.g(aob.Nl, jn7.i2) : yob.M(aob.Lf), vnbVar);
        m.setTextSize(1, 11.0f);
        m.setTypeface(hl.o());
        m.setEllipsize(truncateAt);
        m.setPadding(hl.L(6.0f), 0, hl.L(6.33f), 0);
        int L = hl.L(9.0f);
        if (z3) {
            int i2 = aob.Nl;
            i = vm2.o(aob.v0(i2, vnbVar), 12);
            p1 = vm2.o(aob.v0(i2, vnbVar), 20);
        } else {
            int i3 = aob.Lf;
            int p12 = aob.p1(0.1f, aob.v0(i3, vnbVar));
            p1 = aob.p1(0.24f, aob.v0(i3, vnbVar));
            i = p12;
        }
        hf0 i0 = aob.i0(L, L, L, L, i, p1, p1);
        if (z3) {
            int i4 = aob.Nl;
            K = yob.g(i4, 12);
            K2 = yob.g(i4, 20);
        } else {
            int i5 = aob.Lf;
            K = yob.K(0.1f, i5);
            K2 = yob.K(0.24f, i5);
        }
        m.setBackground(i0);
        yob.j(m, i0, K, K2, vnbVar);
        m.setGravity(17);
        m.setSingleLine(true);
        iye.a(m);
        linearLayout.addView(m, tre.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        m.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.Y(textView2, z3 ? yob.g(aob.Nl, jn7.i2) : yob.M(aob.Lf), vnbVar);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z2 ? tre.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : tre.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        uob g = z3 ? yob.g(aob.Nl, jn7.i2) : yob.M(aob.Nf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i6 = g.a;
        int i7 = g.b;
        byte b = g.c;
        float f = g.d;
        int P = yob.P(i6, i7, b, f, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        yob.N(imageView, 5, i6, i7, b, f, vnbVar, P, porterDuffColorFilter).h = mode;
        int i8 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i8, vnbVar), 3, -1);
        uob M = yob.M(i8);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        if (z2) {
            d2 = tre.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        } else {
            d2 = tre.d(24, 24.0f, 53, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(hl.L(4.0f));
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
                textView.setText(pv3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
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
            ho4 ho4Var = new ho4(aob.Mf, this.w);
            int i = this.h;
            spannableStringBuilder.setSpan(ho4Var, i, this.n + i, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(pv3.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }

    public final void e() {
        vnb vnbVar = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new s3b(aob.Mf, vnbVar), 0, this.s, 33);
                spannableStringBuilder.setSpan(new s3b(aob.Lf, vnbVar), this.s, this.r.length(), 33);
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
            i2 = uh9.w(16.0f, this.a.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 1073741825);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(ob6.M0(2131751222, null));
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
