package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class e0 extends org.telegram.ui.ActionBar.f3 {
    public final zf.a E;
    public final zf.a F;
    public final zf.a G;
    public zf.a H;
    public long I;
    public int J;
    public boolean K;
    public final nq[] L;
    public final nq[] M;
    public boolean N;
    public final a b;
    public final boolean c;
    public final int d;
    public final l40 e;
    public final zc0 f;
    public final EditTextBoldCursor h;
    public final TextView n;
    public final c0 r;
    public final di.d s;
    public final org.telegram.ui.Components.q6 v;
    public final ImageView w;
    public final ImageView x;
    public final zf.a y;

    public e0(final Context context, int i10, long j3, MessageSuggestionParams messageSuggestionParams, co coVar, final org.telegram.ui.ActionBar.f6 f6Var, int i11, Utilities.Callback callback) {
        super(1, context, f6Var, true);
        boolean z10;
        this.I = -1L;
        this.L = new nq[1];
        this.M = new nq[1];
        this.d = i11;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, j3);
        this.c = canManageMonoForum;
        final int i12 = 0;
        boolean z11 = canManageMonoForum || s5.y(i10, true).j();
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j10 = appGlobalConfig.tonSuggestedPostAmountMin.get();
        zf.b bVar = zf.b.b;
        this.F = zf.a.i(j10, bVar);
        this.G = zf.a.i(appGlobalConfig.tonSuggestedPostAmountMax.get(), bVar);
        long j11 = appGlobalConfig.starsSuggestedPostAmountMin.get();
        zf.b bVar2 = zf.b.a;
        this.y = zf.a.g(j11, bVar2);
        this.E = zf.a.g(appGlobalConfig.starsSuggestedPostAmountMax.get(), bVar2);
        if (canManageMonoForum) {
            this.b = null;
        } else {
            a aVar = new a(context, i10, f6Var);
            this.b = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.container.addView(aVar, w7.x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.z5.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) { // from class: zh.b0
                public final /* synthetic */ e0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.H.a == zf.b.a) {
                                new l7(context, f6Var).show();
                                break;
                            }
                            break;
                        default:
                            e0 e0Var = this.b;
                            org.telegram.ui.Components.e5.T(context, e0Var.I, new rg.p2(e0Var, 19), f6Var, 0).a.show();
                            break;
                    }
                }
            });
        }
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = wl.f(context, 0);
        linearLayout.addView(f7, w7.x5.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(LocaleController.getString(i11 == 0 ? R.string.PostSuggestionsOfferTitle : R.string.PostSuggestionsOfferChangeTitle));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7.addView(textView, w7.x5.p(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.j6.W5;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        w7.z5.a(imageView);
        imageView.setOnClickListener(new ji.m4(this, 20));
        f7.addView(imageView, w7.x5.p(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.h = editTextBoldCursor;
        if (z11) {
            l40 l40Var = new l40(context, f6Var);
            this.e = l40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            l40Var.b(arrayList, new v(this, 1));
            linearLayout.addView(l40Var, w7.x5.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.e = null;
        }
        LinearLayout f10 = wl.f(context, 1);
        linearLayout.addView(f10, w7.x5.l(1.0f, -1, -2));
        zc0 zc0Var = new zc0(context, null);
        this.f = zc0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        zc0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        zc0Var.e(editTextBoldCursor);
        zf.a aVar2 = messageSuggestionParams.amount;
        zc0Var.b(1.0f, aVar2 != null && !aVar2.k() ? 1.0f : 0.0f, false);
        zc0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.v0(this, 6));
        zc0Var.addView(editTextBoldCursor, w7.x5.e(-1, -2, 48));
        f10.addView(zc0Var, w7.x5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.w = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        zc0Var.addView(imageView2, w7.x5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.x = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        imageView3.setColorFilter(-13397548);
        zc0Var.addView(imageView3, w7.x5.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.v = q6Var;
        int i15 = org.telegram.ui.ActionBar.j6.y6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var.setGravity(5);
        zc0Var.addView(q6Var, w7.x5.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.n = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, w7.x5.t(-1, -2, 55, 33, 4, 33, 0));
        c0 c0Var = new c0(context);
        this.r = c0Var;
        c0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c0Var.setCursorWidth(1.5f);
        c0Var.setTextSize(1, 17.0f);
        c0Var.setMaxLines(1);
        c0Var.setBackground(null);
        c0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        c0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        c0Var.setFocusable(false);
        c0Var.setClickable(false);
        c0Var.setEnabled(false);
        zc0 zc0Var2 = new zc0(context, null);
        zc0Var2.setText(LocaleController.getString(R.string.PostSuggestionsOfferTitleTime));
        zc0Var2.e(c0Var);
        zc0Var2.addView(c0Var, w7.x5.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.z5.b(zc0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        zc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: zh.b0
            public final /* synthetic */ e0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.H.a == zf.b.a) {
                            new l7(context, f6Var).show();
                            break;
                        }
                        break;
                    default:
                        e0 e0Var = this.b;
                        org.telegram.ui.Components.e5.T(context, e0Var.I, new rg.p2(e0Var, 19), f6Var, 0).a.show();
                        break;
                }
            }
        });
        f10.addView(zc0Var2, w7.x5.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), mode));
        zc0Var2.addView(imageView4, w7.x5.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.PostSuggestionsAddTimeHint)));
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PostSuggestionsAddTimeHint2, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
        textView3.setText(spannableStringBuilder);
        f10.addView(textView3, w7.x5.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.x5.q(-1, -2, 80));
        di.d dVar = new di.d(context, f6Var, true);
        this.s = dVar;
        dVar.setOnClickListener(new fi.c1(this, coVar, i10, context, f6Var, j3, callback));
        if (i11 == 1) {
            dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), false, true);
        }
        linearLayout2.addView(dVar, w7.x5.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        zf.a aVar3 = messageSuggestionParams.amount;
        if (aVar3 != null) {
            z10 = false;
            q(zf.a.i(aVar3.b, aVar3.a), !messageSuggestionParams.amount.k(), true, false);
        } else {
            z10 = false;
            q(zf.a.i(0L, bVar2), false, true, false);
        }
        long j12 = messageSuggestionParams.time;
        if (this.I != j12) {
            this.I = j12;
            c0Var.setText(o(j12));
        }
        n(z10);
        setCustomView(linearLayout);
        editTextBoldCursor.addTextChangedListener(new d0(this));
    }

    public static String o(long j3) {
        if (j3 <= 0) {
            return LocaleController.getString(R.string.PostSuggestionsAnytime);
        }
        String formatDateTime = LocaleController.formatDateTime(j3, true);
        if (formatDateTime.isEmpty()) {
            return formatDateTime;
        }
        return Character.toUpperCase(formatDateTime.charAt(0)) + formatDateTime.substring(1);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (!this.K || (aVar = this.b) == null || f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    public final void m() {
        boolean z10 = this.N;
        a aVar = this.b;
        boolean z11 = (z10 && !isDismissed() && aVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.e == null;
        if (this.K != z11) {
            this.K = z11;
            if (aVar != null) {
                aVar.setEnabled(z11);
                aVar.setClickable(z11);
                aVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void n(boolean z10) {
        boolean z11 = this.J == 0 && (this.H.b >= 0 || this.I > 0);
        di.d dVar = this.s;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                dVar.animate().alpha(z11 ? 1.0f : 0.6f).setDuration(180L).start();
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        m();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.N = true;
        m();
    }

    public final zf.a p() {
        return this.H.a == zf.b.b ? this.G : this.E;
    }

    public final void q(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        zf.a aVar2;
        char c10;
        zf.b bVar;
        zf.a aVar3 = this.H;
        int i10 = this.J;
        this.J = 0;
        if (aVar != null) {
            this.H = aVar;
        } else {
            this.H = zf.a.i(0L, aVar3.a);
            this.J |= 1;
        }
        long j3 = p().b;
        zf.a aVar4 = this.H;
        if (j3 < aVar4.b) {
            this.J |= 4;
        }
        boolean k10 = aVar4.k();
        zf.a aVar5 = this.y;
        zf.a aVar6 = this.F;
        zf.b bVar2 = zf.b.b;
        if (!k10) {
            zf.a aVar7 = this.H;
            if ((aVar7.a == bVar2 ? aVar6 : aVar5).b > aVar7.b) {
                this.J |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.H.a;
        boolean z14 = z11 || aVar3.b != this.H.b;
        boolean z15 = z11 || i10 != this.J;
        zc0 zc0Var = this.f;
        if (z15) {
            zc0Var.a((this.J & (-9)) == 0 ? 0.0f : 1.0f);
        }
        zf.b bVar3 = zf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.h;
        if (z13) {
            c10 = 0;
            l40 l40Var = this.e;
            if (l40Var != null) {
                l40Var.a(this.H.a == bVar3 ? 0 : 1, z12);
            }
            zf.b bVar4 = this.H.a;
            TextView textView = this.n;
            if (bVar4 == bVar3) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleStars));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length())});
            } else if (bVar4 == bVar2) {
                textView.setText(LocaleController.getString(R.string.PostSuggestionsOfferSubtitleTON));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(p().a()).length() + 3)});
            }
            ImageView imageView = this.x;
            ImageView imageView2 = this.w;
            if (z12) {
                aVar2 = aVar5;
                imageView2.animate().alpha(this.H.a == bVar3 ? 1.0f : 0.0f).scaleX(this.H.a == bVar3 ? 1.0f : 0.0f).scaleY(this.H.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.H.a == bVar2 ? 1.0f : 0.0f).scaleX(this.H.a == bVar2 ? 1.0f : 0.0f).scaleY(this.H.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                imageView2.setAlpha(this.H.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.H.a == bVar2 ? 1.0f : 0.0f);
            }
            a aVar8 = this.b;
            if (aVar8 != null && aVar8.e != (bVar = this.H.a)) {
                aVar8.e = bVar;
                aVar8.a();
            }
        } else {
            aVar2 = aVar5;
            c10 = 0;
        }
        if (z13 || z15) {
            int i11 = this.J;
            if ((i11 & 4) != 0) {
                int i12 = R.string.SuggestAPostTooMuch;
                Object[] objArr = new Object[1];
                objArr[c10] = p().f();
                zc0Var.setText(LocaleController.formatString(i12, objArr));
            } else if ((i11 & 2) != 0) {
                int i13 = R.string.SuggestAPostTooSmall;
                Object[] objArr2 = new Object[1];
                objArr2[c10] = (this.H.a == bVar2 ? aVar6 : aVar2).f();
                zc0Var.setText(LocaleController.formatString(i13, objArr2));
            } else {
                zc0Var.setText(LocaleController.getString(this.H.a == bVar3 ? R.string.PostSuggestionsOfferTitlePriceStars : R.string.PostSuggestionsOfferTitlePriceTON));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.d;
            di.d dVar = this.s;
            if (i14 != 0) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferChangeUpdateTerms), z12, true);
            } else if (this.H.k()) {
                dVar.g(LocaleController.getString(R.string.PostSuggestionsOfferForFree), z12, true);
            } else {
                zf.a aVar9 = this.H;
                boolean z16 = aVar9.a == bVar2;
                int i15 = R.string.PostSuggestionsOfferStars;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = z16 ? aVar9.b() : LocaleController.formatNumber(aVar9.a(), ',');
                dVar.g(v7.V0(z16, LocaleController.formatString(i15, objArr3), z16 ? this.M : this.L), z12, true);
            }
            n(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.H.c() * (this.H.a == bVar2 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.v.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.H.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new sg.p0(this, 27), 50L);
    }
}
