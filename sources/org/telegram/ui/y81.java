package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y81 extends org.telegram.ui.Components.sa {
    public static final /* synthetic */ int a0 = 0;
    public final lh.c U;
    public final LinearLayout V;
    public final LinearLayout W;
    public boolean X;
    public boolean Y;
    public org.telegram.ui.Components.w51 Z;

    public y81(final Context context, final int i10, final org.telegram.ui.ActionBar.f6 f6Var, final kh.a1 a1Var) {
        super(context, null, true, false, false, 1, f6Var);
        this.currentAccount = i10;
        this.v = 0.2f;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        lh.c cVar = new lh.c(context, i10, mf.b.b, f6Var);
        this.U = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.container.addView(cVar, 0, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.d6.a(cVar);
        cVar.setOnClickListener(new kh.m(context, 2, f6Var));
        TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(i10).stakeDiceInfo;
        if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
            TLRPC.TL_emojiGameDiceInfo tL_emojiGameDiceInfo = (TLRPC.TL_emojiGameDiceInfo) emojiGameInfo;
            LinearLayout linearLayout = new LinearLayout(context);
            this.V = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.dice6);
            linearLayout.addView(imageView, k7.b6.t(80, 80, 1, 0, 0, 0, 8));
            int i11 = org.telegram.ui.ActionBar.j6.j5;
            TextView b10 = k7.f6.b(context, 20.0f, i11, true, null);
            b10.setGravity(17);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceTitle));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StakeDiceTitleBeta));
            spannableStringBuilder.setSpan(new w81(f6Var), length, spannableStringBuilder.length(), 33);
            b10.setText(spannableStringBuilder);
            linearLayout.addView(b10, k7.b6.k(32.0f, 0.0f, 32.0f, 8.0f, -1, -2));
            TextView b11 = k7.f6.b(context, 14.0f, i11, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.StakeDiceText));
            linearLayout.addView(b11, k7.b6.k(32.0f, 0.0f, 32.0f, 12.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TextView b12 = k7.f6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.L6, true, null);
            b12.setText(LocaleController.getString(R.string.StakeDiceReturns));
            linearLayout2.addView(b12, k7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
            org.telegram.ui.Components.sz0 sz0Var = new org.telegram.ui.Components.sz0(context, f6Var);
            linearLayout2.addView(sz0Var, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            TableRow tableRow = new TableRow(context);
            sz0Var.addView(tableRow);
            TableRow tableRow2 = new TableRow(context);
            sz0Var.addView(tableRow2);
            int i12 = R.drawable.dice1;
            int i13 = R.drawable.dice2;
            int i14 = R.drawable.dice3;
            int i15 = R.drawable.dice4;
            int i16 = R.drawable.dice5;
            int i17 = R.drawable.dice6;
            a1.d dVar = new a1.d(context, new int[]{i12, i13, i14, i15, i16, i17, i17}, f6Var, sz0Var, 19);
            if (tL_emojiGameDiceInfo.params.size() == 7) {
                tableRow.addView((View) dVar.run((Object) 1, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(0).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 2, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(1).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 3, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(2).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow.addView((View) dVar.run((Object) 4, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(3).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 5, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(4).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 6, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(5).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 1.0f));
                tableRow2.addView((View) dVar.run((Object) 7, (Object) Float.valueOf(tL_emojiGameDiceInfo.params.get(6).intValue() / 1000.0f)), new TableRow.LayoutParams(0, -1, 2.0f));
            }
            TextView b13 = k7.f6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.y6, false, null);
            b13.setGravity(17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("🎲");
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.dice6, 0);
            mqVar.recolorDrawable = false;
            mqVar.setScale(0.8f, 0.8f);
            spannableStringBuilder2.setSpan(mqVar, 0, spannableStringBuilder2.length(), 33);
            b13.setText(AndroidUtilities.replaceMultipleCharSequence("🎲", LocaleController.getString(R.string.StakeDiceReturnsInfo), spannableStringBuilder2));
            linearLayout2.addView(b13, k7.b6.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
            linearLayout.addView(linearLayout2, k7.b6.k(8.0f, 0.0f, 8.0f, 0.0f, -1, -2));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.W = linearLayout3;
            linearLayout3.setOrientation(1);
            linearLayout3.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(7.0f));
            linearLayout3.setClipToPadding(false);
            final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            final org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0(context, f6Var);
            ad0Var.setForceForceUseCenter(true);
            ad0Var.setText(LocaleController.getString(R.string.StakeDicePlaceholder));
            ad0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setBackground(null);
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setMaxLines(1);
            int dp = AndroidUtilities.dp(16.0f);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
            editTextBoldCursor.setInputType(8194);
            editTextBoldCursor.setTypeface(Typeface.DEFAULT);
            editTextBoldCursor.setSelectAllOnFocus(true);
            editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
            editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
            editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
            editTextBoldCursor.setOnFocusChangeListener(new lh.n8(ad0Var, editTextBoldCursor, 1));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(R.drawable.diamond);
            linearLayout4.addView(imageView2, k7.b6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
            linearLayout4.addView(editTextBoldCursor, k7.b6.o(-1, -2, 1.0f, 119));
            ad0Var.e(editTextBoldCursor);
            ad0Var.addView(linearLayout4, k7.b6.e(-1, -2, 48));
            linearLayout3.addView(ad0Var, k7.b6.n(-1, -2));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
            ad0Var.addView(textView, k7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
            long j10 = tL_emojiGameDiceInfo.prev_stake;
            j10 = j10 <= 0 ? 1000000000L : j10;
            editTextBoldCursor.setText(lh.ja.M0(j10));
            textView.setAlpha(1.0f);
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d), "USD", 2));
            final int[] iArr = {2};
            ad0Var.c(false, TextUtils.isEmpty(editTextBoldCursor.getText()) ^ true);
            editTextBoldCursor.addTextChangedListener(new x81(i10, editTextBoldCursor, ad0Var, iArr, textView));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: org.telegram.ui.u81
                @Override // org.telegram.messenger.Utilities.CallbackReturn
                public final Object run(Object obj) {
                    Long l10 = (Long) obj;
                    TextView textView2 = new TextView(context);
                    textView2.setGravity(17);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    int i18 = org.telegram.ui.ActionBar.j6.Oh;
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var2));
                    textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.v0(i18, f6Var2))));
                    textView2.setText(lh.ja.O0(lh.ja.M0(l10.longValue()) + " 💎", 0.75f));
                    k7.d6.a(textView2);
                    textView2.setOnClickListener(new gb0(20, editTextBoldCursor, l10));
                    return textView2;
                }
            };
            long[] jArr = MessagesController.getInstance(i10).tonStakediceStakeSuggestedAmounts;
            for (int i18 = 0; i18 < Utilities.divCeil(jArr.length, 3); i18++) {
                LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
                int i19 = 0;
                while (true) {
                    int i20 = i18 * 3;
                    if (i19 < Math.min(3, jArr.length - i20)) {
                        f10.addView((View) callbackReturn.run(Long.valueOf(jArr[i20 + i19])), k7.b6.p(0, 26, 1.0f, 112, 0, 0, i19 == 2 ? 0 : 6, 0));
                        i19++;
                    }
                }
                this.W.addView(f10, k7.b6.k(0.0f, 7.0f, 0.0f, 0.0f, -1, -2));
            }
            ph.d dVar2 = new ph.d(context, f6Var, true);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("🎲");
            org.telegram.ui.Components.mq mqVar2 = new org.telegram.ui.Components.mq(R.drawable.mini_roll, 0);
            mqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableStringBuilder3.setSpan(mqVar2, 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder3.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StakeDiceButton));
            dVar2.g(spannableStringBuilder3, false, true);
            dVar2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.v81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                    Editable text = editTextBoldCursor2.getText();
                    try {
                        double parseDouble = TextUtils.isEmpty(text) ? 0.0d : Double.parseDouble(text.toString());
                        int i21 = i10;
                        double d = MessagesController.getInstance(i21).tonStakeddiceStakeAmountMax / 1.0E9d;
                        org.telegram.ui.Components.ad0 ad0Var2 = ad0Var;
                        int[] iArr2 = iArr;
                        if (parseDouble > d) {
                            editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i21).tonStakeddiceStakeAmountMax / 1.0E9d));
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                            int i22 = -iArr2[0];
                            iArr2[0] = i22;
                            AndroidUtilities.shakeViewSpring(ad0Var2, i22);
                            return;
                        }
                        if (TextUtils.isEmpty(text) || parseDouble >= MessagesController.getInstance(i21).tonStakeddiceStakeAmountMin / 1.0E9d) {
                            if (lh.t7.y(i21, true).f.toDouble() < parseDouble) {
                                new qh.f(context, f6Var, mf.a.i((long) (parseDouble * 1.0E9d), mf.b.b), true, new c21(3));
                                return;
                            } else {
                                a1Var.run(Long.valueOf((long) (parseDouble * 1.0E9d)));
                                y81.this.dismiss();
                                return;
                            }
                        }
                        editTextBoldCursor2.setText(Double.toString(MessagesController.getInstance(i21).tonStakeddiceStakeAmountMin / 1.0E9d));
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        int i23 = -iArr2[0];
                        iArr2[0] = i23;
                        AndroidUtilities.shakeViewSpring(ad0Var2, i23);
                    } catch (Exception unused) {
                    }
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(dVar2, k7.b6.t(-1, 48, 87, 16, 0, 16, 10));
            ViewGroup viewGroup = this.containerView;
            int i21 = this.backgroundPaddingLeft;
            viewGroup.addView(frameLayout, k7.b6.f(-2.0f, 87, i21, 0, i21, 0));
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            int i22 = this.backgroundPaddingLeft;
            sl0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(68.0f));
            this.Z.N(false);
        }
    }

    public final void P() {
        boolean z4 = (!this.X || isDismissed() || isKeyboardVisible()) ? false : true;
        if (this.Y != z4) {
            this.Y = z4;
            lh.c cVar = this.U;
            if (cVar != null) {
                cVar.setEnabled(z4);
                cVar.setClickable(z4);
                cVar.animate().scaleX(z4 ? 1.0f : 0.6f).scaleY(z4 ? 1.0f : 0.6f).alpha(z4 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean isTouchOutside(float f10, float f11) {
        lh.c cVar = this.U;
        if (f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        P();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.X = false;
        P();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.X = true;
        P();
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, false, new d5(this, 27), this.resourcesProvider);
        this.Z = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StakeDiceTitle);
    }
}
