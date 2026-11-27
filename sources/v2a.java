// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v2a extends if0 {
    public final og2 s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final ux9 y;

    public v2a(Context context, vnb vnbVar) {
        super(context, vnbVar);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new ux9(this, (byte) 9);
        textPaint.setTextSize(hl.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        og2 og2Var = new og2(21, vnbVar, context);
        this.s = og2Var;
        og2Var.b(aob.B5, aob.j7, aob.C5);
        og2Var.setDrawUnchecked(true);
        og2Var.setDrawBackgroundAsArc(10);
        addView(og2Var);
        og2Var.a(false, false);
        og2Var.setLayoutParams(tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // if0
    public final int a() {
        return 22;
    }

    @Override // if0
    public final boolean b() {
        return true;
    }

    @Override // if0
    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.s;
        if (og2Var.getVisibility() == 0) {
            og2Var.a(z, z2);
        }
    }

    @Override // if0
    public final void d() {
        boolean z = ob6.a0;
        this.d.setLayoutParams(tre.d(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 52.0f, 0.0f, z ? 52.0f : 20.0f, 0.0f));
        boolean z2 = ob6.a0;
        this.e.setLayoutParams(tre.d(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 52.0f, 0.0f, z2 ? 52.0f : 20.0f, 0.0f));
        boolean z3 = ob6.a0;
        this.f.setLayoutParams(tre.d(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o = pv3.o(ob6.E0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o != null) {
            spannableStringBuilder.append(o).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new u2a(16), o.length(), o.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new u2a(34), 0, 1, 0);
        }
        String i0 = ob6.i0(2131750481, tL_help_country.iso2);
        if (TextUtils.isEmpty(i0)) {
            i0 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i0);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override // if0
    public int getFullHeight() {
        return 44;
    }
}
