package xh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.mf;
import org.telegram.ui.un;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final p6 a;
    public final g9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final p80 h;

    public k(Activity activity, p6 p6Var) {
        super(activity);
        this.a = p6Var;
        LinearLayout e = m5.e(activity, 0);
        e.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(5.0f));
        e6.b(e, 0.025f, 1.4f);
        addView(e, b6.e(-1, -1, zs.E1));
        int i10 = t6.Ci;
        Drawable a02 = t6.a0(t6.r1(0.1f, t6.w0(i10, p6Var)), 0, 0);
        w6 L = a7.L(0.1f, i10);
        setBackground(a02);
        a7.k(this, a02, null, L, p6Var);
        LinearLayout e7 = m5.e(activity, 1);
        e.addView(e7, b6.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        e7.addView(linearLayout, b6.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = t6.G6;
        a7.V(textView, i11, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(textView, b6.p(-2, -2, 0.0f, 16));
        zs.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        a7.V(textView2, i10, p6Var);
        e6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.i0.L(6.33f), 0, org.telegram.messenger.i0.L(6.33f), 0);
        ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(9.0f), t6.r1(0.1f, t6.w0(i10, p6Var)));
        w6 L2 = a7.L(0.1f, i10);
        textView2.setBackground(d02);
        a7.k(textView2, d02, L2, null, p6Var);
        textView2.setText(cd.L0(2131753155, null));
        linearLayout.addView(textView2, b6.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        a7.V(textView3, i11, p6Var);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        e7.addView(textView3, b6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        zs.i(textView3);
        p80 p80Var = new p80(activity, null);
        this.h = p80Var;
        p80Var.setTextSize(1, 13.0f);
        a7.H(p80Var, t6.Uc, p6Var);
        a7.V(p80Var, i11, p6Var);
        e7.addView(p80Var, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        zs.i(p80Var);
        g9 g9Var = new g9(activity);
        this.b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
        g9Var.setVisibility(8);
        e.addView(g9Var, b6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(t6.h0(5, t6.r1(0.2f, t6.w0(t6.W5, p6Var)), -1));
        e6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        a7.t(imageView, t6.Re, p6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new bh.c(28));
        imageView.setVisibility(8);
        e.addView(imageView, b6.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final un unVar, final jj jjVar, mf mfVar, mf mfVar2) {
        boolean z10;
        boolean z11;
        float measureText;
        float measureText2;
        if (jjVar == null) {
            return;
        }
        String str = jjVar.Q0;
        TextView textView = this.d;
        CharSequence m10 = k6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = jjVar.v;
        p80 p80Var = this.h;
        CharSequence m11 = k6.m(charSequence, p80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = jjVar.R0;
        TLRPC.MessageMedia messageMedia = jjVar.Y0;
        ImageView imageView = this.c;
        g9 g9Var = this.b;
        if (messageMedia != null) {
            g9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = jjVar.Y0;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w9 = b8.w(document.thumbs, 48, false, null, false);
                ic b10 = ic.b(jjVar.Y0.document);
                ic c10 = ic.c(w9, jjVar.Y0.document);
                z10 = true;
                g9Var.g(0, 0L, null, "48_48", "48_48", null, b10, c10);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = b8.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w11 = b8.w(jjVar.Y0.photo.sizes, 48, true, w10, false);
                    z10 = true;
                    g9Var.g(0, 0L, null, "48_48", "48_48", null, ic.i(w10, jjVar.Y0.photo), ic.i(w11, jjVar.Y0.photo));
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = jjVar.T0;
            if (photo2 == null) {
                g9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131745276, null));
                int i10 = t6.Ci;
                p6 p6Var = this.a;
                spannableStringBuilder.setSpan(new l00(i10, p6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.i0.L(32.0f)) - org.telegram.messenger.i0.L(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131745276, null));
                    spannableStringBuilder.setSpan(new l00(i10, p6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                p80Var.setText(m11);
                p80Var.setOnLinkPressListener(new o80() { // from class: xh.j
                    @Override // org.telegram.ui.Components.o80
                    public final void a(ClickableSpan clickableSpan) {
                        k kVar = k.this;
                        kVar.getClass();
                        un unVar2 = unVar;
                        if (unVar2 != null) {
                            unVar2.Z9(jjVar, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (unVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                unVar2.ta(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(kVar.h);
                    }
                });
                textView2.setOnClickListener(new rh.s(mfVar, 23));
                setOnClickListener(new org.telegram.messenger.video.h(this, unVar, jjVar, str2, 14));
                imageView.setOnClickListener(new rh.s(mfVar2, 24));
            }
            TLRPC.PhotoSize w12 = b8.w(photo2.sizes, 48, true, null, true);
            g9Var.g(0, 0L, null, "48_48", "48_48", null, ic.i(w12, jjVar.T0), ic.i(b8.w(jjVar.T0.sizes, 48, true, w12, false), jjVar.T0));
            g9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131745276, null));
        int i102 = t6.Ci;
        p6 p6Var2 = this.a;
        spannableStringBuilder2.setSpan(new l00(i102, p6Var2), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(m10);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float L2 = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((L2 - textView22.getPaint().measureText(textView22.getText().toString())) - org.telegram.messenger.i0.L(32.0f)) - org.telegram.messenger.i0.L(!z11 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        p80Var.setText(m11);
        p80Var.setOnLinkPressListener(new o80() { // from class: xh.j
            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                k kVar = k.this;
                kVar.getClass();
                un unVar2 = unVar;
                if (unVar2 != null) {
                    unVar2.Z9(jjVar, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (unVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        unVar2.ta(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(kVar.h);
            }
        });
        textView22.setOnClickListener(new rh.s(mfVar, 23));
        setOnClickListener(new org.telegram.messenger.video.h(this, unVar, jjVar, str2, 14));
        imageView.setOnClickListener(new rh.s(mfVar2, 24));
    }
}
