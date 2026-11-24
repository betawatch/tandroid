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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vza extends FrameLayout {
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
    public final wjb w;

    public vza(Context context, boolean z, boolean z2, wjb wjbVar, boolean z3) {
        super(context);
        ViewGroup.LayoutParams d;
        int p1;
        int i;
        vkb K;
        vkb K2;
        ViewGroup.LayoutParams d2;
        this.w = wjbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.Y(textView, z3 ? zkb.g(bkb.Ml, kk7.i2) : zkb.M(bkb.Kf), wjbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z2) {
            d = nme.i(-2.0f, -2.0f, 8388659, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        } else {
            d = nme.d(-2, -2.0f, 51, z ? 5.0f : 15.0f, 5.0f, z ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, d);
        TextView m = ug8.m(linearLayout, textView, nme.p(-2, -2, 1.0f, 16), context);
        this.c = m;
        zkb.Y(m, z3 ? zkb.g(bkb.Ml, kk7.i2) : zkb.M(bkb.Kf), wjbVar);
        m.setTextSize(1, 11.0f);
        m.setTypeface(gl.o());
        m.setEllipsize(truncateAt);
        m.setPadding(gl.L(6.0f), 0, gl.L(6.33f), 0);
        int L = gl.L(9.0f);
        if (z3) {
            int i2 = bkb.Ml;
            i = bm2.o(bkb.v0(i2, wjbVar), 12);
            p1 = bm2.o(bkb.v0(i2, wjbVar), 20);
        } else {
            int i3 = bkb.Kf;
            int p12 = bkb.p1(0.1f, bkb.v0(i3, wjbVar));
            p1 = bkb.p1(0.24f, bkb.v0(i3, wjbVar));
            i = p12;
        }
        ff0 i0 = bkb.i0(L, L, L, L, i, p1, p1);
        if (z3) {
            int i4 = bkb.Ml;
            K = zkb.g(i4, 12);
            K2 = zkb.g(i4, 20);
        } else {
            int i5 = bkb.Kf;
            K = zkb.K(0.1f, i5);
            K2 = zkb.K(0.24f, i5);
        }
        m.setBackground(i0);
        zkb.j(m, i0, K, K2, wjbVar);
        m.setGravity(17);
        m.setSingleLine(true);
        ote.a(m);
        linearLayout.addView(m, nme.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        m.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.Y(textView2, z3 ? zkb.g(bkb.Ml, kk7.i2) : zkb.M(bkb.Kf), wjbVar);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z2 ? nme.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : nme.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        vkb g = z3 ? zkb.g(bkb.Ml, kk7.i2) : zkb.M(bkb.Mf);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i6 = g.a;
        int i7 = g.b;
        byte b = g.c;
        float f = g.d;
        int P = zkb.P(i6, i7, b, f, wjbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        zkb.N(imageView, 5, i6, i7, b, f, wjbVar, P, porterDuffColorFilter).h = mode;
        int i8 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i8, wjbVar), 3, -1);
        vkb M = zkb.M(i8);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        if (z2) {
            d2 = nme.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        } else {
            d2 = nme.d(24, 24.0f, 53, 0.0f, 0.0f, z ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(gl.L(4.0f));
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
                textView.setText(vu3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
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
            cm4 cm4Var = new cm4(bkb.Lf, this.w);
            int i = this.h;
            spannableStringBuilder.setSpan(cm4Var, i, this.n + i, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.a;
        textView.setText(vu3.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
    }

    public final void e() {
        wjb wjbVar = this.w;
        if (this.r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r);
            try {
                spannableStringBuilder.setSpan(new uza(bkb.Lf, wjbVar), 0, this.s, 33);
                spannableStringBuilder.setSpan(new uza(bkb.Kf, wjbVar), this.s, this.r.length(), 33);
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
            i2 = de9.w(16.0f, this.a.getMeasuredWidth(), i2);
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 1073741825);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(27.0f), TLObject.FLAG_30));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.c;
        textView.setVisibility(0);
        textView.setText(k96.M0(2131751245, null));
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
