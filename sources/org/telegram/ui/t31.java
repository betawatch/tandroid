package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class t31 extends org.telegram.ui.Components.na {
    public static final /* synthetic */ int V1 = 0;
    public final bi.c P1;
    public final LinearLayout Q1;
    public final LinearLayout R1;
    public boolean S1;
    public boolean T1;
    public org.telegram.ui.Components.l41 U1;

    public t31(final Context context, final int i7, final org.telegram.ui.ActionBar.f6 f6Var, final org.telegram.messenger.voip.k kVar) {
        super(1, context, f6Var, true);
        this.a = i7;
        this.r1 = 0.2f;
        this.P0 = true;
        this.Q0 = true;
        bi.c cVar = new bi.c(context, i7, cg.b.b, f6Var);
        this.P1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.c.addView(cVar, 0, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.ka.a(cVar);
        cVar.setOnClickListener(new bi.gd(1, context, f6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.qp.s1(i7).w8;
        if (!(emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo)) {
            return;
        }
        TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.dice6);
        linearLayout.addView(imageView, c8.ha.t(80, 80, 1, 0, 0, 0, 8));
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        TextView b10 = c8.qa.b(context, 20.0f, i10, true, null);
        b10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131745239, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131745238, null));
        spannableStringBuilder.setSpan(new di.k0(f6Var), length, spannableStringBuilder.length(), 33);
        b10.setText(spannableStringBuilder);
        linearLayout.addView(b10, c8.ha.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
        TextView b11 = c8.qa.b(context, 14.0f, i10, false, null);
        org.telegram.messenger.k5.m(b11, 17, null, 2131745240);
        linearLayout.addView(b11, c8.ha.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView b12 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.k6.L6, true, null);
        b12.setText(org.telegram.messenger.hd.M0(2131745242, null));
        linearLayout2.addView(b12, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, f6Var);
        linearLayout2.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        TableRow tableRow = new TableRow(context);
        tx0Var.addView(tableRow);
        TableRow tableRow2 = new TableRow(context);
        tx0Var.addView(tableRow2);
        a1.d dVar = new a1.d(context, new int[]{R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6, R.drawable.dice6}, f6Var, tx0Var, 21);
        if (tL_emojiGameDiceInfo.params.size() == 7) {
            tableRow.addView((View) dVar.d(1, Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(2, Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(3, Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow.addView((View) dVar.d(4, Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(5, Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(6, Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
            tableRow2.addView((View) dVar.d(7, Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
        }
        TextView b13 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.k6.y6, false, null);
        b13.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.dice6, 0);
        wpVar.d = false;
        wpVar.H = 0.8f;
        wpVar.I = 0.8f;
        spannableStringBuilder2.setSpan(wpVar, 0, spannableStringBuilder2.length(), 33);
        b13.setText(org.telegram.messenger.g0.M2(org.telegram.messenger.hd.M0(2131745241, null), spannableStringBuilder2, "🎲"));
        linearLayout2.addView(b13, c8.ha.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.addView(linearLayout2, c8.ha.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.R1 = linearLayout3;
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout3.setClipToPadding(false);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        final org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, f6Var);
        lb0Var.setForceForceUseCenter(true);
        lb0Var.setText(org.telegram.messenger.hd.M0(2131745243, null));
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.G6, f6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.r6.D(editTextBoldCursor, org.telegram.ui.ActionBar.k6.ig, f6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.k6.jg, f6Var);
        editTextBoldCursor.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new bi.bb(lb0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(R.drawable.diamond);
        linearLayout4.addView(imageView2, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout4.addView(editTextBoldCursor, c8.ha.p(-1, -2, 1.0f, org.telegram.messenger.qs.E1));
        lb0Var.e(editTextBoldCursor);
        lb0Var.addView(linearLayout4, c8.ha.e(-1, -2, 48));
        linearLayout3.addView(lb0Var, c8.ha.o(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, null);
        lb0Var.addView(textView, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        long j3 = tL_emojiGameDiceInfo.prev_stake;
        j3 = j3 <= 0 ? 1000000000L : j3;
        editTextBoldCursor.setText(bi.dd.P0(j3));
        textView.setAlpha(1.0f);
        StringBuilder sb2 = new StringBuilder("≈");
        org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
        long j10 = (long) ((j3 / 1.0E9d) * ((org.telegram.messenger.i0) org.telegram.messenger.qp.s1(i7).x7.l.b).a * 100.0d);
        i11.getClass();
        sb2.append(org.telegram.messenger.r1.g("USD", 2, j10, false));
        textView.setText(sb2.toString());
        final int[] iArr = {2};
        lb0Var.c(false, !TextUtils.isEmpty(editTextBoldCursor.getText()));
        int i12 = 3;
        editTextBoldCursor.addTextChangedListener(new s31(i7, editTextBoldCursor, lb0Var, iArr, textView));
        org.telegram.messenger.d20 d20Var = new org.telegram.messenger.d20() { // from class: org.telegram.ui.q31
            @Override // org.telegram.messenger.d20
            public final Object a(Object obj) {
                Long l10 = (Long) obj;
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                textView2.setTextSize(1, 13.0f);
                textView2.setTypeface(org.telegram.messenger.g0.o());
                int i13 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.r6.V(textView2, i13, f6Var2);
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(13.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(i13, f6Var2)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.15f, i13);
                textView2.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(textView2, d02, L2, null, f6Var2);
                textView2.setText(bi.dd.R0(bi.dd.P0(l10.longValue()) + " 💎", 0.75f));
                c8.ka.a(textView2);
                textView2.setOnClickListener(new fk0(11, editTextBoldCursor, l10));
                return textView2;
            }
        };
        long[] jArr = org.telegram.messenger.qp.s1(i7).b7;
        int i13 = 0;
        while (true) {
            int length2 = jArr.length;
            Pattern pattern = Utilities.a;
            if (i13 >= (length2 + 2) / i12) {
                fi.d dVar2 = new fi.d(context, f6Var, true);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.mini_roll, 0);
                wpVar2.s = org.telegram.messenger.g0.L(1.0f);
                spannableStringBuilder3.setSpan(wpVar2, 0, spannableStringBuilder3.length(), 33);
                spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.hd.M0(2131745244, null));
                dVar2.i(spannableStringBuilder3, false, true);
                dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.r31
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        Editable text = editTextBoldCursor2.getText();
                        try {
                            double parseDouble = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
                            int i14 = i7;
                            double d = org.telegram.messenger.qp.s1(i14).a7 / 1.0E9d;
                            org.telegram.ui.Components.lb0 lb0Var2 = lb0Var;
                            int[] iArr2 = iArr;
                            if (parseDouble > d) {
                                editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.qp.s1(i14).a7 / 1.0E9d));
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                                int i15 = -iArr2[0];
                                iArr2[0] = i15;
                                org.telegram.messenger.g0.G3(i15, lb0Var2, null);
                                return;
                            }
                            if (TextUtils.isEmpty(text) || parseDouble >= org.telegram.messenger.qp.s1(i14).Z6 / 1.0E9d) {
                                if (bi.ea.y(i14, true).f.toDouble() < parseDouble) {
                                    new gi.e(context, f6Var, cg.a.i((long) (parseDouble * 1.0E9d), cg.b.b), true, new org.telegram.ui.Components.l10(27));
                                    return;
                                } else {
                                    kVar.a(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                    t31.this.dismiss();
                                    return;
                                }
                            }
                            editTextBoldCursor2.setText(Double.toString(org.telegram.messenger.qp.s1(i14).Z6 / 1.0E9d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i16 = -iArr2[0];
                            iArr2[0] = i16;
                            org.telegram.messenger.g0.G3(i16, lb0Var2, null);
                        } catch (Exception unused) {
                        }
                    }
                });
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(dVar2, c8.ha.t(-1, 48, 87, 16, 0, 16, 10));
                ViewGroup viewGroup = this.b;
                int i14 = this.t0;
                viewGroup.addView(frameLayout, c8.ha.f(-2.0f, -1, 87, i14, 0, i14, 0));
                org.telegram.ui.Components.pj0 pj0Var = this.k1;
                int i15 = this.t0;
                pj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(68.0f));
                this.U1.O(false);
                return;
            }
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            int i16 = 0;
            while (true) {
                int i17 = i13 * 3;
                if (i16 < Math.min(i12, jArr.length - i17)) {
                    f10.addView((View) d20Var.a(Long.valueOf(jArr[i17 + i16])), c8.ha.q(0, 26, 1.0f, org.telegram.messenger.qs.x1, 0, 0, i16 == 2 ? 0 : 6, 0));
                    i16++;
                    i12 = 3;
                }
            }
            this.R1.addView(f10, c8.ha.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
            i13++;
            i12 = 3;
        }
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(pj0Var, getContext(), this.a, 0, false, new a5(this, 28), this.I0);
        this.U1 = l41Var;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131745239, null);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean X(float f10, float f11) {
        bi.c cVar = this.P1;
        if (f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    public final void d1() {
        boolean z9 = (!this.S1 || this.I || this.d) ? false : true;
        if (this.T1 != z9) {
            this.T1 = z9;
            bi.c cVar = this.P1;
            if (cVar != null) {
                cVar.setEnabled(z9);
                cVar.setClickable(z9);
                org.telegram.messenger.camera.q.k(cVar.animate().scaleX(z9 ? 1.0f : 0.6f).scaleY(z9 ? 1.0f : 0.6f), z9 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void n0() {
        this.S1 = false;
        d1();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        this.S1 = true;
        d1();
    }
}
