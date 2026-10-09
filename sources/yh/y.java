package yh;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.zd0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class y extends eb {
    public static final int[] w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long a0;
    public final c50 b0;
    public final zd0 c0;
    public final EditTextBoldCursor d0;
    public final TextView e0;
    public final w f0;
    public final TextView g0;
    public final ci.d h0;
    public final org.telegram.ui.Components.r6 i0;
    public final ImageView j0;
    public final ImageView k0;
    public final m.f3 l0;
    public zf.a m0;
    public int n0;
    public int o0;
    public boolean p0;
    public final a1 q0;
    public final er[] r0;
    public final er[] s0;
    public boolean t0;
    public c71 u0;
    public final p61 v0;

    public y(final Context context, final int i10, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.e6 e6Var, a1 a1Var) {
        super(context, null, true, false, 2, e6Var);
        TLRPC.User user;
        m.f3 f3Var = new m.f3(26);
        za.z[] zVarArr = (za.z[]) f3Var.b;
        this.l0 = f3Var;
        this.r0 = new er[1];
        this.s0 = new er[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.a0 = j3;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        this.q0 = a1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j10 = m5.y(i10, true).j();
        if (j3 > 0 && MessagesController.getInstance(i10).getUserFull(j3) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j11 = tL_starGiftUnique.offer_min_stars;
        zf.b bVar = zf.b.a;
        zf.a g10 = zf.a.g(j11, bVar);
        zf.a g11 = zf.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        zf.b bVar2 = zf.b.b;
        zf.a i11 = zf.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        zf.a i12 = zf.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        zf.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            zVarArr[bVar3.ordinal()] = new za.z(g10, g11);
        }
        zf.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            zVarArr[bVar4.ordinal()] = new za.z(i11, i12);
        }
        a aVar = new a(context, i10, e6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new xg.e(this, context, e6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d0 = editTextBoldCursor;
        if (j10) {
            c50 c50Var = new c50(context, e6Var);
            this.b0 = c50Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            c50Var.b(arrayList, new u(this, 0));
            linearLayout.addView(c50Var, w7.x5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.b0 = null;
        }
        LinearLayout e7 = bi.e(context, 1);
        linearLayout.addView(e7, w7.x5.l(1.0f, -1, -2));
        zd0 zd0Var = new zd0(context, null);
        this.c0 = zd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        zd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        zd0Var.e(editTextBoldCursor);
        zd0Var.b(1.0f, 0.0f, false);
        zd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ii.x5(this, 4));
        zd0Var.addView(editTextBoldCursor, w7.x5.e(-1, -2, 48));
        e7.addView(zd0Var, w7.x5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        zd0Var.addView(imageView, w7.x5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        zd0Var.addView(imageView2, w7.x5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
        this.i0 = r6Var;
        int i14 = org.telegram.ui.ActionBar.i6.y6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        r6Var.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var.setGravity(5);
        zd0Var.addView(r6Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextSize(1, 13.0f);
        e7.addView(textView, w7.x5.t(-1, -2, 55, 33, 4, 33, 0));
        w wVar = new w(context);
        this.f0 = wVar;
        wVar.setCursorSize(AndroidUtilities.dp(20.0f));
        wVar.setCursorWidth(1.5f);
        wVar.setTextSize(1, 17.0f);
        wVar.setMaxLines(1);
        wVar.setBackground(null);
        wVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        wVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        wVar.setFocusable(false);
        wVar.setClickable(false);
        wVar.setEnabled(false);
        zd0 zd0Var2 = new zd0(context, null);
        zd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        zd0Var2.e(wVar);
        zd0Var2.addView(wVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 48));
        w7.z5.b(zd0Var2, 0.02f, 1.2f);
        zd0Var2.setOnClickListener(new xh.a(6, this, context));
        e7.addView(zd0Var2, w7.x5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W5, e6Var), PorterDuff.Mode.SRC_IN));
        zd0Var2.addView(imageView3, w7.x5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        TextView textView2 = new TextView(context);
        this.g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.x5.t(-1, -2, 55, 33, 4, 33, 0));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: yh.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y.R(y.this, i10, context, e6Var, j3);
            }
        });
        V(zf.a.i(0L, bVar), false, true, false);
        if (this.n0 != 86400) {
            this.n0 = 86400;
            wVar.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        U(false);
        editTextBoldCursor.addTextChangedListener(new x(this));
        FrameLayout.LayoutParams a2 = w7.x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(dVar, a2);
        qm0 qm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.v0 = p61.k(linearLayout);
        this.u0.N(false);
    }

    public static void Q(y yVar, long j3, boolean z10, zf.a aVar, long j10, org.telegram.ui.ActionBar.b2 b2Var) {
        if (j3 > 0) {
            int i10 = yVar.currentAccount;
            zf.b bVar = zf.b.a;
            m5 x10 = m5.x(i10, bVar);
            zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
            zf.a g10 = z10 ? zf.a.g(j3, bVar) : zf.a.i(yVar.m0.b + aVar.b, bVar);
            if (l4 == null || l4.b < g10.b) {
                new e7(yVar.getContext(), yVar.resourcesProvider, g10.a(), 14, null, null, yVar.a0).show();
                return;
            }
        }
        of.e g11 = b2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = yVar.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(yVar.currentAccount).getInputPeer(yVar.a0);
        tL_sendStarGiftOffer.duration = yVar.n0;
        tL_sendStarGiftOffer.slug = yVar.Y.slug;
        tL_sendStarGiftOffer.random_id = j10;
        if (j3 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j3;
        }
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(yVar, g11, b2Var, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.cd[], org.telegram.ui.Components.q01[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void R(final y yVar, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (yVar.h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            m5 x10 = m5.x(i10, yVar.m0.a);
            zf.a l4 = x10.e ? zf.a.l(x10.p()) : null;
            zf.b bVar = zf.b.a;
            zf.b bVar2 = zf.b.b;
            if (l4 != null) {
                long j10 = l4.b;
                zf.a aVar = yVar.m0;
                if (j10 >= aVar.b) {
                    String str2 = yVar.Z;
                    long j11 = yVar.a0;
                    String d = aVar.d();
                    if (yVar.m0.a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(yVar.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(yVar.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.i6.j5;
                    org.telegram.ui.Cells.c1.n(i11, yVar.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(yVar.getContext());
                    bi.o(i11, yVar.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(yVar.m0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j11), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j11), str)));
                    linearLayout.addView(textView2, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
                    r01 r01Var = new r01(yVar.getContext(), yVar.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(yVar.currentAccount).getSendPaidMessagesStars(j11);
                    final zf.a g10 = zf.a.g(sendPaidMessagesStars, bVar);
                    r01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), p7.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        r01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), p7.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    r01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", yVar.n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(r01Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(yVar.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) p7.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) p7.R0(LocaleController.formatString(R.string.GiftOfferPay, zf.a.i(yVar.m0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yVar.getContext(), 0, yVar.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() { // from class: yh.t
                                @Override // org.telegram.ui.ActionBar.a2
                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                                    y.Q(y.this, sendPaidMessagesStars, z12, g10, nextRandomId, b2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.X0 = true;
                            b2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, p7.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), p7.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yVar.getContext(), 0, yVar.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.a2() { // from class: yh.t
                        @Override // org.telegram.ui.ActionBar.a2
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i12) {
                            y.Q(y.this, sendPaidMessagesStars, z122, g10, nextRandomId, b2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                    b2Var2.X0 = true;
                    b2Var2.show();
                    return;
                }
            }
            zf.a aVar2 = yVar.m0;
            zf.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new e7(context, e6Var, aVar2.a(), 14, null, null, j3).show();
            } else if (bVar3 == bVar2) {
                new di.h(context, e6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void S(y yVar, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(yVar.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(yVar, eVar, b2Var, updates, tL_error, 6));
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return LocaleController.getString(R.string.GiftOfferToBuyTitle);
    }

    public final void T() {
        boolean z10 = this.t0;
        a aVar = this.X;
        boolean z11 = (z10 && !isDismissed() && aVar != null && this.containerView.getY() > ((float) AndroidUtilities.dp(32.0f))) || this.b0 == null;
        if (this.p0 != z11) {
            this.p0 = z11;
            if (aVar != null) {
                aVar.setEnabled(z11);
                aVar.setClickable(z11);
                bi.s(aVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void U(boolean z10) {
        boolean z11 = this.o0 == 0 && this.m0.b > 0;
        ci.d dVar = this.h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                bi.s(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    public final void V(zf.a aVar, boolean z10, boolean z11, boolean z12) {
        ?? r16;
        boolean z13;
        zf.a aVar2 = this.m0;
        int i10 = this.o0;
        this.o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = zf.a.i(0L, aVar2.a);
            this.o0 |= 1;
        }
        zf.b bVar = this.m0.a;
        m.f3 f3Var = this.l0;
        za.z[] zVarArr = (za.z[]) f3Var.b;
        za.z[] zVarArr2 = (za.z[]) f3Var.b;
        long j3 = ((zf.a) zVarArr[bVar.ordinal()].b).b;
        zf.a aVar3 = this.m0;
        if (j3 < aVar3.b) {
            this.o0 |= 4;
        }
        if (!aVar3.k() && ((zf.a) zVarArr2[this.m0.a.ordinal()].a).b > this.m0.b) {
            this.o0 |= 2;
        }
        boolean z14 = z11 || aVar2.a != this.m0.a;
        boolean z15 = z11 || aVar2.b != this.m0.b;
        boolean z16 = z11 || i10 != this.o0;
        zf.b bVar2 = zf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.d0;
        zf.b bVar3 = zf.b.b;
        if (z14) {
            c50 c50Var = this.b0;
            if (c50Var != null) {
                c50Var.a(this.m0.a == bVar2 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.a0);
            zf.b bVar4 = this.m0.a;
            TextView textView = this.g0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) zVarArr2[this.m0.a.ordinal()].b).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((zf.a) zVarArr2[this.m0.a.ordinal()].b).a()).length() + 3)});
            }
            ImageView imageView = this.k0;
            ImageView imageView2 = this.j0;
            if (z12) {
                z13 = false;
                imageView2.animate().alpha(this.m0.a == bVar2 ? 1.0f : 0.0f).scaleX(this.m0.a == bVar2 ? 1.0f : 0.0f).scaleY(this.m0.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.m0.a == bVar3 ? 1.0f : 0.0f).scaleX(this.m0.a == bVar3 ? 1.0f : 0.0f).scaleY(this.m0.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z13 = false;
                imageView2.setAlpha(this.m0.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.m0.a == bVar3 ? 1.0f : 0.0f);
            }
            a aVar4 = this.X;
            r16 = z13;
            if (aVar4 != null) {
                zf.b bVar5 = this.m0.a;
                r16 = z13;
                if (aVar4.e != bVar5) {
                    aVar4.e = bVar5;
                    aVar4.a();
                    r16 = z13;
                }
            }
        } else {
            r16 = 0;
        }
        if (z14 || z16) {
            this.c0.setText(LocaleController.getString(this.m0.a == bVar2 ? R.string.GiftOfferStarsToOffer : R.string.GiftOfferTONToOffer));
            zf.b bVar6 = this.m0.a;
            int i11 = this.o0;
            int i12 = i11 & 4;
            String str = this.Z;
            TextView textView2 = this.e0;
            if (i12 != 0) {
                int i13 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((zf.a) zVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr = new Object[2];
                objArr[r16] = d;
                objArr[1] = str;
                bi.r(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((zf.a) zVarArr2[bVar6.ordinal()].a).d();
                Object[] objArr2 = new Object[2];
                objArr2[r16] = d10;
                objArr2[1] = str;
                bi.r(i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                bi.r(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.o0 & (-9)) == 0 ? org.telegram.ui.ActionBar.i6.y6 : org.telegram.ui.ActionBar.i6.q7));
        }
        if (z14 || z15 || z16) {
            zf.a aVar5 = this.m0;
            boolean z17 = aVar5.a == bVar3 ? true : r16;
            int i16 = R.string.GiftOfferButtonStars;
            Object[] objArr4 = new Object[1];
            objArr4[r16] = z17 ? aVar5.b() : LocaleController.formatNumber(aVar5.a(), ',');
            this.h0.g(p7.W0(z17, LocaleController.formatString(i16, objArr4), z17 ? this.s0 : this.r0), z12, true);
            U(z12);
        }
        if (z14 || z15) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (this.m0.c() * (this.m0.a == bVar3 ? MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get() : MessagesController.getInstance(this.currentAccount).starsUsdWithdrawRate1000 * 1.0E-5d) * 100.0d), "USD", 2));
            this.i0.c(sb2, z12, true);
        }
        if (z10 && z15) {
            String b10 = this.m0.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (!this.p0 || (aVar = this.X) == null || f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        T();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.t0 = true;
        T();
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rg.x1(this, 28), 50L);
    }

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 23), this.resourcesProvider);
        this.u0 = c71Var;
        c71Var.r = false;
        return c71Var;
    }
}
