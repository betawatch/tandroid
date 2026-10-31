package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ex0;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c0 extends FrameLayout implements y60 {
    public final nh.p D;
    public final TextView E;
    public final TextView F;
    public final dq[] G;
    public final dq[] H;
    public int I;
    public ValueAnimator J;
    public h0 K;
    public final Paint L;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final ai.b h;
    public final LinearLayout n;
    public final nh.p r;
    public final nh.p s;
    public CharSequence w;
    public final g9 x;
    public final r8 y;

    public c0(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.G = new dq[1];
        this.H = new dq[1];
        this.L = new Paint(1);
        this.c = i10;
        this.d = z10;
        ai.b bVar = new ai.b(this, context);
        this.h = bVar;
        bVar.setOrientation(0);
        addView(bVar, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.y = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.x = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(11.0f));
        bVar.addView(g9Var, w7.b6.q(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bVar.addView(linearLayout, w7.b6.q(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.b6.o(-2, -2));
        nh.p pVar = new nh.p(context);
        this.r = pVar;
        pVar.setTextColor(-1);
        pVar.setTextSize(1, 14.0f);
        pVar.setGravity(3);
        pVar.setTypeface(org.telegram.messenger.i0.o());
        linearLayout2.addView(pVar, w7.b6.q(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        nh.p pVar2 = new nh.p(context);
        this.s = pVar2;
        pVar2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.55f, -1));
        pVar2.setTextSize(1, 12.0f);
        pVar2.setGravity(5);
        linearLayout2.addView(pVar2, w7.b6.q(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        nh.p pVar3 = new nh.p(context);
        this.D = pVar3;
        pVar3.setTextColor(-1);
        pVar3.setTextSize(1, 14.0f);
        pVar3.setShadowLayer(org.telegram.messenger.i0.L(2.5f), 0.0f, org.telegram.messenger.i0.L(1.5f), org.telegram.ui.ActionBar.t6.r1(0.6f, -16777216));
        zs.i(pVar3);
        linearLayout.addView(pVar3, w7.b6.o(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.i0.L(4.66f), 0, org.telegram.messenger.i0.L(4.66f), 0);
        textView.setVisibility(8);
        bVar.addView(textView, w7.b6.q(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        bVar.addView(textView2, w7.b6.q(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.y60
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(Canvas canvas, float f7) {
        ai.b bVar = this.h;
        if (bVar.getBackground() == null) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(bVar.getX(), bVar.getY(), bVar.getX() + bVar.getWidth(), bVar.getY() + bVar.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        h0 h0Var = this.K;
        if (h0Var == null || this.e == null) {
            return;
        }
        this.I = h0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 13));
        this.J.addListener(new sg.r(this, 4));
        this.J.setDuration(350L);
        this.J.setInterpolator(gr.h);
        this.J.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(h0 h0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        boolean z11;
        String str2;
        int i11;
        CharSequence subSequence;
        int i12;
        this.K = h0Var;
        ai.b bVar = this.h;
        if ((h0Var == null || this.I != h0Var.a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                bVar.invalidate();
            }
        }
        long j10 = h0Var.c;
        g9 g9Var = this.x;
        r8 r8Var = this.y;
        int i13 = this.c;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(i13).Z1(Long.valueOf(h0Var.c));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
            str = h20.k(Z1);
        } else {
            TLRPC.Chat L0 = vp.r1(i13).L0(Long.valueOf(-h0Var.c));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
            str = L0 == null ? "" : L0.title;
        }
        int b10 = o.b(i13, (int) h0Var.g, 3);
        int b11 = o.b(i13, (int) h0Var.g, 4);
        int b12 = o.b(i13, (int) h0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z12 = h0Var.b;
        String str3 = " ";
        boolean z13 = this.d;
        nh.p pVar = this.D;
        if (!z12 || h0Var.g > 0) {
            if (h0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + h0Var.h));
                z10 = z13;
                dq dqVar = new dq(0, new fq(getContext(), h0Var.h));
                dqVar.s = org.telegram.messenger.i0.L(1.0f);
                spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z13;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, pVar.getPaint(), org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new a0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z13;
        }
        int b13 = o.b(i13, (int) h0Var.g, 1);
        int b14 = o.b(i13, (int) h0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = h0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence j02 = jj.j0(tL_textWithEntities, false, false, pVar.getPaint());
            this.w = j02;
            if (j02 == null) {
                z11 = true;
                str2 = " ";
                subSequence = null;
            } else {
                int length = j02.length();
                z11 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        i11 = length;
                        break;
                    }
                    char charAt = j02.charAt(i14);
                    if (!Character.isWhitespace(charAt)) {
                        i11 = length;
                        if (charAt != 10240 && charAt != 12644 && charAt != 65440) {
                            break;
                        }
                    } else {
                        i11 = length;
                    }
                    i14++;
                    length = i11;
                }
                int i15 = i11;
                while (true) {
                    if (i14 >= i15) {
                        str2 = str3;
                        break;
                    }
                    char charAt2 = j02.charAt(i15 - 1);
                    if (!Character.isWhitespace(charAt2)) {
                        str2 = str3;
                        if (charAt2 != 10240 && charAt2 != 12644) {
                            if (charAt2 != 65440) {
                                break;
                            }
                            i15--;
                            str3 = str2;
                        }
                    } else {
                        str2 = str3;
                    }
                    i15--;
                    str3 = str2;
                }
                subSequence = (i14 > 0 || i15 < j02.length()) ? j02.subSequence(i14, i15) : j02;
            }
            this.w = subSequence;
            if (subSequence.length() <= b13 || h0Var.b) {
                i12 = 0;
            } else {
                i12 = 0;
                this.w = this.w.subSequence(0, b13);
            }
            CharSequence charSequence = this.w;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannable.getSpans(i12, charSequence.length(), org.telegram.ui.Components.o5.class);
                org.telegram.messenger.h6[] h6VarArr = (org.telegram.messenger.h6[]) spannable.getSpans(i12, this.w.length(), org.telegram.messenger.h6.class);
                if (o5VarArr.length + h6VarArr.length > b14 && !h0Var.b) {
                    ArrayList arrayList = new ArrayList();
                    int i16 = 0;
                    while (i16 < o5VarArr.length) {
                        org.telegram.ui.Components.o5[] o5VarArr2 = o5VarArr;
                        int i17 = i16;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(o5VarArr2[i16])), Integer.valueOf(spannable.getSpanEnd(o5VarArr2[i17]))));
                        i16 = i17 + 1;
                        o5VarArr = o5VarArr2;
                    }
                    int i18 = 0;
                    while (i18 < h6VarArr.length) {
                        int i19 = i18;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(h6VarArr[i18])), Integer.valueOf(spannable.getSpanEnd(h6VarArr[i19]))));
                        i18 = i19 + 1;
                    }
                    Collections.sort(arrayList, new ex0(22));
                    if (!(this.w instanceof SpannableStringBuilder)) {
                        this.w = new SpannableStringBuilder(this.w);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.w).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            }
            if (!h0Var.b) {
                this.w = org.telegram.messenger.i0.M2(this.w);
            }
            spannableStringBuilder.append(this.w);
        } else {
            z11 = true;
            str2 = " ";
            this.w = "";
        }
        pVar.setText(org.telegram.messenger.k6.m(spannableStringBuilder, pVar.getPaint().getFontMetricsInt(), false, null, 0));
        this.e = null;
        this.n.setVisibility((!h0Var.b || h0Var.g > 0) ? 8 : 0);
        long j11 = h0Var.g;
        TextView textView = this.F;
        TextView textView2 = this.E;
        if (j11 > 0) {
            boolean z14 = j11 >= 250 ? z11 : false;
            this.a = z14;
            bVar.setWillNotDraw(!z14);
            bVar.invalidate();
            pVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int L = org.telegram.messenger.i0.L(13.0f);
            int i20 = org.telegram.ui.ActionBar.t6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(L);
            this.e = gradientDrawable;
            bVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f7 = z10 ? 1.0f : 0.65f;
            this.f = f7;
            drawable2.setAlpha((int) (f7 * 255.0f));
            if (h0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(13.0f), org.telegram.ui.ActionBar.t6.r1(0.25f, b12)));
                textView2.setText(h8.W0(false, i0.a.k(h0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, org.telegram.messenger.i0.L(0.66f), 1.0f));
                dq dqVar2 = this.G[0];
                if (dqVar2 != null) {
                    dqVar2.a = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(h8.W0(false, i0.a.k(h0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (h0Var.b) {
            this.a = false;
            bVar.setWillNotDraw(z11);
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(13.0f), -16777216);
            this.e = d02;
            bVar.setBackground(d02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            pVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.o5.l(i13, h0Var.c));
            spannableStringBuilder2.append((CharSequence) str2);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) cd.L0(2131748835, null));
            spannableStringBuilder2.setSpan(new z(0), length2, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(cd.L0(2131748838, null));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            bVar.setWillNotDraw(true);
            pVar.setShadowLayer(org.telegram.messenger.i0.L(2.5f), 0.0f, org.telegram.messenger.i0.L(1.5f), org.telegram.ui.ActionBar.t6.r1(0.6f, -16777216));
            this.e = null;
            bVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        bVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        dq dqVar = this.G[0];
        if (dqVar == null || dqVar.a == z10) {
            return;
        }
        dqVar.a = z10;
        this.E.invalidate();
    }
}
