package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ac0;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a0 extends ab {
    public static final int[] w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long a0;
    public final v40 b0;
    public final hd0 c0;
    public final EditTextBoldCursor d0;
    public final TextView e0;
    public final y f0;
    public final TextView g0;
    public final bi.d h0;
    public final org.telegram.ui.Components.o6 i0;
    public final ImageView j0;
    public final ImageView k0;
    public final m.g3 l0;
    public yf.a m0;
    public int n0;
    public int o0;
    public boolean p0;
    public final b1 q0;
    public final uq[] r0;
    public final uq[] s0;
    public boolean t0;
    public j61 u0;
    public final v51 v0;

    public a0(final Context context, final int i10, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.f6 f6Var, b1 b1Var) {
        super(context, null, true, false, 2, f6Var);
        TLRPC.User user;
        m.g3 g3Var = new m.g3(28);
        og.u0[] u0VarArr = (og.u0[]) g3Var.b;
        this.l0 = g3Var;
        this.r0 = new uq[1];
        this.s0 = new uq[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.a0 = j3;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = hc.b.l(tL_starGiftUnique.num, ',', sb2);
        this.q0 = b1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j10 = v5.y(i10, true).j();
        if (j3 > 0 && MessagesController.getInstance(i10).getUserFull(j3) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        yf.b bVar = yf.b.a;
        yf.a g10 = yf.a.g(j11, bVar);
        yf.a g11 = yf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        yf.b bVar2 = yf.b.b;
        yf.a i11 = yf.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        yf.a i12 = yf.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        yf.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            u0VarArr[bVar3.ordinal()] = new og.u0(25, g10, g11);
        }
        yf.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            u0VarArr[bVar4.ordinal()] = new og.u0(25, i11, i12);
        }
        a aVar = new a(context, i10, f6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.a6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new wh.r(this, context, f6Var, 2));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d0 = editTextBoldCursor;
        if (j10) {
            v40 v40Var = new v40(context, f6Var);
            this.b0 = v40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            v40Var.b(arrayList, new v(this, 0));
            linearLayout.addView(v40Var, w7.a6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.b0 = null;
        }
        LinearLayout f7 = em.f(context, 1);
        linearLayout.addView(f7, w7.a6.l(1.0f, -1, -2));
        hd0 hd0Var = new hd0(context, null);
        this.c0 = hd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        editTextBoldCursor.requestFocus();
        hd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        hd0Var.e(editTextBoldCursor);
        hd0Var.b(1.0f, 0.0f, false);
        hd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new hi.y5(this, 4));
        hd0Var.addView(editTextBoldCursor, w7.a6.e(-1, -2, 48));
        f7.addView(hd0Var, w7.a6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        hd0Var.addView(imageView, w7.a6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        imageView2.setColorFilter(-13397548);
        hd0Var.addView(imageView2, w7.a6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.i0 = o6Var;
        int i14 = org.telegram.ui.ActionBar.j6.y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var.setGravity(5);
        hd0Var.addView(o6Var, w7.a6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextSize(1, 13.0f);
        f7.addView(textView, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        y yVar = new y(context);
        this.f0 = yVar;
        yVar.setCursorSize(AndroidUtilities.dp(20.0f));
        yVar.setCursorWidth(1.5f);
        yVar.setTextSize(1, 17.0f);
        yVar.setMaxLines(1);
        yVar.setBackground(null);
        yVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        yVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        yVar.setFocusable(false);
        yVar.setClickable(false);
        yVar.setEnabled(false);
        hd0 hd0Var2 = new hd0(context, null);
        hd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        hd0Var2.e(yVar);
        hd0Var2.addView(yVar, w7.a6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.c6.b(hd0Var2, 0.02f, 1.2f);
        hd0Var2.setOnClickListener(new w71(26, this, context));
        f7.addView(hd0Var2, w7.a6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), PorterDuff.Mode.SRC_IN));
        hd0Var2.addView(imageView3, w7.a6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.a6.t(-1, -2, 55, 33, 4, 33, 0));
        bi.d dVar = new bi.d(context, f6Var, true);
        this.h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: xh.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a0.Q(a0.this, i10, context, f6Var, j3);
            }
        });
        U(yf.a.i(0L, bVar), false, true, false);
        if (this.n0 != 86400) {
            this.n0 = 86400;
            yVar.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        T(false);
        editTextBoldCursor.addTextChangedListener(new z(this));
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(dVar, d);
        vl0 vl0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.v0 = v51.k(linearLayout);
        this.u0.N(false);
    }

    public static void P(a0 a0Var, long j3, boolean z10, yf.a aVar, long j10, org.telegram.ui.ActionBar.d2 d2Var) {
        if (j3 > 0) {
            int i10 = a0Var.currentAccount;
            yf.b bVar = yf.b.a;
            v5 x10 = v5.x(i10, bVar);
            yf.a l4 = x10.e ? yf.a.l(x10.p()) : null;
            yf.a g10 = z10 ? yf.a.g(j3, bVar) : yf.a.i(a0Var.m0.b + aVar.b, bVar);
            if (l4 == null || l4.b < g10.b) {
                new o7(a0Var.getContext(), a0Var.resourcesProvider, g10.a(), 14, null, null, a0Var.a0).show();
                return;
            }
        }
        nf.e g11 = d2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = a0Var.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(a0Var.currentAccount).getInputPeer(a0Var.a0);
        tL_sendStarGiftOffer.duration = a0Var.n0;
        tL_sendStarGiftOffer.slug = a0Var.Y.slug;
        tL_sendStarGiftOffer.random_id = j10;
        if (j3 > 0) {
            tL_sendStarGiftOffer.flags = 1 | tL_sendStarGiftOffer.flags;
            tL_sendStarGiftOffer.allow_paid_stars = j3;
        }
        ConnectionsManager.getInstance(a0Var.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.g(a0Var, g11, d2Var, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.a01[], org.telegram.ui.Components.yc[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void Q(final a0 a0Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (a0Var.h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            v5 x10 = v5.x(i10, a0Var.m0.a);
            yf.a l4 = x10.e ? yf.a.l(x10.p()) : null;
            yf.b bVar = yf.b.a;
            yf.b bVar2 = yf.b.b;
            if (l4 != null) {
                long j10 = l4.b;
                yf.a aVar = a0Var.m0;
                if (j10 >= aVar.b) {
                    String str2 = a0Var.Z;
                    long j11 = a0Var.a0;
                    String d = aVar.d();
                    if (a0Var.m0.a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(a0Var.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(a0Var.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.j6.j5;
                    em.x(i11, a0Var.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.a6.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(a0Var.getContext());
                    em.n(i11, a0Var.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(a0Var.m0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j11), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j11), str)));
                    linearLayout.addView(textView2, w7.a6.t(-1, -2, 48, 24, 4, 24, 4));
                    b01 b01Var = new b01(a0Var.getContext(), a0Var.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(a0Var.currentAccount).getSendPaidMessagesStars(j11);
                    final yf.a g10 = yf.a.g(sendPaidMessagesStars, bVar);
                    b01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), z7.X0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        b01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), z7.X0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    b01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", a0Var.n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(b01Var, w7.a6.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(a0Var.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) z7.S0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) z7.Q0(LocaleController.formatString(R.string.GiftOfferPay, yf.a.i(a0Var.m0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a0Var.getContext(), 0, a0Var.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() { // from class: xh.u
                                @Override // org.telegram.ui.ActionBar.c2
                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i12) {
                                    a0.P(a0.this, sendPaidMessagesStars, z12, g10, nextRandomId, d2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            d2Var.X0 = true;
                            d2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, z7.S0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), z7.Q0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a0Var.getContext(), 0, a0Var.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.c2() { // from class: xh.u
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i12) {
                            a0.P(a0.this, sendPaidMessagesStars, z122, g10, nextRandomId, d2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                    d2Var2.X0 = true;
                    d2Var2.show();
                    return;
                }
            }
            yf.a aVar2 = a0Var.m0;
            yf.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new o7(context, f6Var, aVar2.a(), 14, null, null, j3).show();
            } else if (bVar3 == bVar2) {
                new ci.i(context, f6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void R(a0 a0Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(a0Var.currentAccount).processUpdates(updates, false);
        }
        AndroidUtilities.runOnUIThread(new ac0((Object) a0Var, (Object) eVar, (Object) d2Var, (Object) updates, tL_error, 26));
    }

    public final void S() {
        boolean z10 = this.t0;
        a aVar = this.X;
        boolean z11 = (z10 && !isDismissed() && aVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.b0 == null;
        if (this.p0 != z11) {
            this.p0 = z11;
            if (aVar != null) {
                aVar.setEnabled(z11);
                aVar.setClickable(z11);
                aVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).alpha(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            }
        }
    }

    public final void T(boolean z10) {
        boolean z11 = this.o0 == 0 && this.m0.b > 0;
        bi.d dVar = this.h0;
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

    public final void U(yf.a aVar, boolean z10, boolean z11, boolean z12) {
        char c10;
        yf.b bVar;
        yf.a aVar2 = this.m0;
        int i10 = this.o0;
        this.o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = yf.a.i(0L, aVar2.a);
            this.o0 |= 1;
        }
        yf.b bVar2 = this.m0.a;
        m.g3 g3Var = this.l0;
        og.u0[] u0VarArr = (og.u0[]) g3Var.b;
        og.u0[] u0VarArr2 = (og.u0[]) g3Var.b;
        long j3 = ((yf.a) u0VarArr[bVar2.ordinal()].c).b;
        yf.a aVar3 = this.m0;
        if (j3 < aVar3.b) {
            this.o0 |= 4;
        }
        if (!aVar3.k() && ((yf.a) u0VarArr2[this.m0.a.ordinal()].b).b > this.m0.b) {
            this.o0 |= 2;
        }
        boolean z13 = z11 || aVar2.a != this.m0.a;
        boolean z14 = z11 || aVar2.b != this.m0.b;
        boolean z15 = z11 || i10 != this.o0;
        yf.b bVar3 = yf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.d0;
        yf.b bVar4 = yf.b.b;
        if (z13) {
            v40 v40Var = this.b0;
            if (v40Var != null) {
                v40Var.a(this.m0.a == bVar3 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.a0);
            yf.b bVar5 = this.m0.a;
            TextView textView = this.g0;
            if (bVar5 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((yf.a) u0VarArr2[this.m0.a.ordinal()].c).a()).length())});
            } else if (bVar5 == bVar4) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((yf.a) u0VarArr2[this.m0.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.k0;
            ImageView imageView2 = this.j0;
            if (z12) {
                c10 = 0;
                imageView2.animate().alpha(this.m0.a == bVar3 ? 1.0f : 0.0f).scaleX(this.m0.a == bVar3 ? 1.0f : 0.0f).scaleY(this.m0.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.m0.a == bVar4 ? 1.0f : 0.0f).scaleX(this.m0.a == bVar4 ? 1.0f : 0.0f).scaleY(this.m0.a == bVar4 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                c10 = 0;
                imageView2.setAlpha(this.m0.a == bVar3 ? 1.0f : 0.0f);
                imageView.setAlpha(this.m0.a == bVar4 ? 1.0f : 0.0f);
            }
            a aVar4 = this.X;
            if (aVar4 != null && aVar4.e != (bVar = this.m0.a)) {
                aVar4.e = bVar;
                aVar4.a();
            }
        } else {
            c10 = 0;
        }
        if (z13 || z15) {
            this.c0.setText(LocaleController.getString(this.m0.a == bVar3 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            yf.b bVar6 = this.m0.a;
            int i11 = this.o0;
            int i12 = i11 & 4;
            String str = this.Z;
            TextView textView2 = this.e0;
            if (i12 != 0) {
                int i13 = bVar6 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((yf.a) u0VarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[c10] = d;
                objArr[1] = str;
                em.p(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar3 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((yf.a) u0VarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[c10] = d10;
                objArr2[1] = str;
                em.p(i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar3 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[c10] = str;
                em.p(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.o0 & (-9)) == 0 ? org.telegram.ui.ActionBar.j6.y6 : org.telegram.ui.ActionBar.j6.q7));
        }
        if (z13 || z14 || z15) {
            yf.a aVar5 = this.m0;
            boolean z16 = aVar5.a == bVar4;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[c10] = z16 ? aVar5.b() : LocaleController.formatNumber(aVar5.a(), ',');
            this.h0.g(z7.V0(z16, LocaleController.formatString(i16, objArr4), z16 ? this.s0 : this.r0), z12, true);
            T(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * (this.m0.a == bVar4 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.i0.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.m0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (!this.p0 || (aVar = this.X) == null || f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        S();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.t0 = true;
        S();
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new x(this, 0), 50L);
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new gi.a(this, 23), this.resourcesProvider);
        this.u0 = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }
}
