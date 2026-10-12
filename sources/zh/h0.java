package zh;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yd0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h0 extends org.telegram.ui.ActionBar.e3 {
    public ag.a E;
    public int F;
    public final yd0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.s6 e;
    public final di.d f;
    public final org.telegram.ui.Components.s6 h;
    public final x8 n;
    public final ImageView r;
    public final ImageView s;
    public final ag.a v;
    public final ag.a w;
    public final ag.a x;
    public final ag.a y;

    public h0(Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10, ag.a aVar, org.telegram.ui.Wallet.y6 y6Var) {
        super(1, context, c6Var, true);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        ag.b bVar = ag.b.b;
        this.x = ag.a.i(max, bVar);
        this.y = ag.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j10 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        ag.b bVar2 = ag.b.a;
        this.v = ag.a.g(j10, bVar2);
        this.w = ag.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = yh.e(context, 0);
        linearLayout.addView(e, w7.a6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.e = s6Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        s6Var.setTextSize(AndroidUtilities.dp(20.0f));
        s6Var.setGravity(8388627);
        s6Var.setTypeface(AndroidUtilities.bold());
        e.addView(s6Var, w7.a6.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.a6.l(1.0f, -1, -2));
        yd0 yd0Var = new yd0(context, null);
        this.b = yd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        editTextBoldCursor.requestFocus();
        yd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        yd0Var.e(editTextBoldCursor);
        yd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        yd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 7));
        yd0Var.addView(editTextBoldCursor, w7.a6.e(-1, -2, 48));
        linearLayout2.addView(yd0Var, w7.a6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        yd0Var.addView(imageView, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        yd0Var.addView(imageView2, w7.a6.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.h = s6Var2;
        int i12 = org.telegram.ui.ActionBar.g6.y6;
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(5);
        yd0Var.addView(s6Var2, w7.a6.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        x8 x8Var = new x8(context);
        this.n = x8Var;
        x8Var.c.setLayoutParams(w7.a6.a(20.0f, 22.0f, 22.0f, 22.0f, 0.0f, 20, (LocaleController.isRTL ? 5 : 3) | 48));
        x8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        x8Var.setOnClickListener(new ji.o4(this, 21));
        linearLayout2.addView(x8Var, w7.a6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.a6.q(-1, -2, 80));
        di.d f7 = yh.f(24, context, c6Var, true);
        this.f = f7;
        f7.setOnClickListener(new yh.a(7, this, y6Var));
        f7.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(f7, w7.a6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            o(ag.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            o(ag.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new g0(this));
    }

    public final ag.a n() {
        return this.E.a == ag.b.b ? this.y : this.w;
    }

    public final void o(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        ag.a aVar2;
        ag.a aVar3 = this.E;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = ag.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j11 = n().b;
        ag.a aVar4 = this.E;
        if (j11 < aVar4.b) {
            this.F |= 4;
        }
        boolean k10 = aVar4.k();
        ag.a aVar5 = this.v;
        ag.a aVar6 = this.x;
        ag.b bVar = ag.b.b;
        if (k10) {
            j10 = 0;
        } else {
            ag.a aVar7 = this.E;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.E.a;
        boolean z14 = z11 || aVar3.b != this.E.b;
        boolean z15 = z11 || i10 != this.F;
        yd0 yd0Var = this.b;
        if (z15) {
            yd0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        ag.b bVar2 = ag.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            ag.b bVar3 = this.E.a;
            org.telegram.ui.Components.s6 s6Var = this.e;
            if (bVar3 == bVar2) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(n().a()).length())});
            } else if (bVar3 == bVar) {
                s6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(n().a()).length() + 3)});
            }
            this.n.c.a(this.E.a == bVar, z12);
            ImageView imageView = this.s;
            ImageView imageView2 = this.r;
            if (z12) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.E.a == bVar2 ? 1.0f : 0.0f).scaleX(this.E.a == bVar2 ? 1.0f : 0.0f).scaleY(this.E.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.E.a == bVar ? 1.0f : 0.0f).scaleX(this.E.a == bVar ? 1.0f : 0.0f).scaleY(this.E.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.E.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.E.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
        }
        if (z13 || z15) {
            int i11 = this.F;
            if ((i11 & 4) != 0) {
                yd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooMuch, n().f()));
            } else if ((i11 & 2) != 0) {
                yd0Var.setText(LocaleController.formatString(R.string.ResellGiftPriceTooSmall, (this.E.a == bVar ? aVar6 : aVar2).f()));
            } else {
                yd0Var.setText(LocaleController.getString(this.E.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.F == 0 && this.E.b > j12;
            di.d dVar = this.f;
            if (dVar.W != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    yh.r(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            ag.a aVar8 = this.E;
            ag.b bVar4 = aVar8.a;
            ag.b bVar5 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) ag.a.i((j13 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                yh.q(R.string.ResellGiftInfoTON, new Object[]{ag.a.i((j13 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.E.c() * (this.E.a == bVar ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.h.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.E.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new zf.c(this, 7), 50L);
    }
}
