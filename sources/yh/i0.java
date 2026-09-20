package yh;

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
import org.telegram.messenger.rk;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.pj0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class i0 extends org.telegram.ui.ActionBar.f3 {
    public zf.a E;
    public int F;
    public final hd0 b;
    public final EditTextBoldCursor c;
    public final TextView d;
    public final org.telegram.ui.Components.o6 e;
    public final ci.d f;
    public final org.telegram.ui.Components.o6 h;
    public final y8 n;
    public final ImageView r;
    public final ImageView s;
    public final zf.a v;
    public final zf.a w;
    public final zf.a x;
    public final zf.a y;

    public i0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, zf.a aVar, pj0 pj0Var) {
        super(1, context, f6Var, true);
        this.currentAccount = i10;
        this.smoothKeyboardAnimationEnabled = true;
        this.waitingKeyboard = true;
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long max = Math.max(appGlobalConfig.tonStarGiftResaleAmountMin.get(), 10000000L);
        zf.b bVar = zf.b.b;
        this.x = zf.a.i(max, bVar);
        this.y = zf.a.i(appGlobalConfig.tonStarGiftResaleAmountMax.get(), bVar);
        long j3 = appGlobalConfig.starsStarGiftResaleAmountMin.get();
        zf.b bVar2 = zf.b.a;
        this.v = zf.a.g(j3, bVar2);
        this.w = zf.a.g(appGlobalConfig.starsStarGiftResaleAmountMax.get(), bVar2);
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = rk.f(context, 0);
        linearLayout.addView(f7, w7.y5.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.e = o6Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        o6Var.setTextSize(AndroidUtilities.dp(20.0f));
        o6Var.setGravity(8388627);
        o6Var.setTypeface(AndroidUtilities.bold());
        f7.addView(o6Var, w7.y5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.y5.l(1.0f, -1, -2));
        hd0 hd0Var = new hd0(context, null);
        this.b = hd0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
        hd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        hd0Var.e(editTextBoldCursor);
        hd0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        hd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.v5(this, 6));
        hd0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        linearLayout2.addView(hd0Var, w7.y5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        hd0Var.addView(imageView, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        hd0Var.addView(imageView2, w7.y5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.h = o6Var2;
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setGravity(5);
        hd0Var.addView(o6Var2, w7.y5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.y5.t(-1, -2, 55, 33, 4, 33, 0));
        y8 y8Var = new y8(context);
        this.n = y8Var;
        y8Var.c.setLayoutParams(w7.y5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        y8Var.b(LocaleController.getString(R.string.ResellGiftPriceOnlyTON), LocaleController.getString(R.string.ResellGiftPriceHintOnlyTON), true, false);
        y8Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 20));
        linearLayout2.addView(y8Var, w7.y5.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.y5.q(-1, -2, 80));
        ci.d g10 = rk.g(24, context, f6Var, true);
        this.f = g10;
        g10.setOnClickListener(new w(1, this, pj0Var));
        g10.g(LocaleController.getString(R.string.ResellGiftButton), false, true);
        linearLayout3.addView(g10, w7.y5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            n(zf.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            n(zf.a.i(0L, bVar2), false, true, false);
        }
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new h0(this));
    }

    public final zf.a m() {
        return this.E.a == zf.b.b ? this.y : this.w;
    }

    public final void n(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j3;
        zf.a aVar2;
        char c10;
        zf.a aVar3 = this.E;
        int i10 = this.F;
        this.F = 0;
        if (aVar != null) {
            this.E = aVar;
        } else {
            this.E = zf.a.i(0L, aVar3.a);
            this.F |= 1;
        }
        long j10 = m().b;
        zf.a aVar4 = this.E;
        if (j10 < aVar4.b) {
            this.F |= 4;
        }
        boolean k10 = aVar4.k();
        zf.a aVar5 = this.v;
        zf.a aVar6 = this.x;
        zf.b bVar = zf.b.b;
        if (k10) {
            j3 = 0;
        } else {
            zf.a aVar7 = this.E;
            j3 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.F |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.E.a;
        boolean z14 = z11 || aVar3.b != this.E.b;
        boolean z15 = z11 || i10 != this.F;
        hd0 hd0Var = this.b;
        if (z15) {
            hd0Var.a((this.F & (-9)) == 0 ? 0.0f : 1.0f);
        }
        zf.b bVar2 = zf.b.a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (z13) {
            c10 = 0;
            zf.b bVar3 = this.E.a;
            org.telegram.ui.Components.o6 o6Var = this.e;
            if (bVar3 == bVar2) {
                o6Var.c(LocaleController.getString(R.string.ResellGiftTitle), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length())});
            } else if (bVar3 == bVar) {
                o6Var.c(LocaleController.getString(R.string.ResellGiftTitleTON), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(m().a()).length() + 3)});
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
            c10 = 0;
        }
        if (z13 || z15) {
            int i11 = this.F;
            if ((i11 & 4) != 0) {
                int i12 = R.string.ResellGiftPriceTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = m().f();
                hd0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.ResellGiftPriceTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.E.a == bVar ? aVar6 : aVar2).f();
                hd0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                hd0Var.setText(LocaleController.getString(this.E.a == bVar2 ? R.string.ResellGiftPriceTitle : R.string.ResellGiftPriceTitleTON));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.F == 0 && this.E.b > j11;
            ci.d dVar = this.f;
            if (dVar.W != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    rk.r(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.currentAccount).config;
            zf.a aVar8 = this.E;
            zf.b bVar4 = aVar8.a;
            zf.b bVar5 = aVar8.a;
            long j12 = aVar8.b;
            TextView textView = this.d;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("ResellGiftInfo", (int) zf.a.i((j12 * appGlobalConfig.starsStarGiftResaleCommissionPermille.get()) / 1000, bVar5).a(), new Object[0])));
            } else if (bVar4 == bVar) {
                rk.q(R.string.ResellGiftInfoTON, new Object[]{zf.a.i((j12 * appGlobalConfig.tonStarGiftResaleCommissionPermille.get()) / 1000, bVar5).b()}, textView);
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rg.q1(this, 26), 50L);
    }
}
