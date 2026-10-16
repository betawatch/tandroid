package zh;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.yd0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class z extends db {
    public static final int[] w0 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final a X;
    public final TL_stars.TL_starGiftUnique Y;
    public final String Z;
    public final long a0;
    public final y40 b0;
    public final yd0 c0;
    public final EditTextBoldCursor d0;
    public final TextView e0;
    public final x f0;
    public final TextView g0;
    public final di.d h0;
    public final org.telegram.ui.Components.s6 i0;
    public final ImageView j0;
    public final ImageView k0;
    public final a4.l l0;
    public ag.a m0;
    public int n0;
    public int o0;
    public boolean p0;
    public final a1 q0;
    public final br[] r0;
    public final br[] s0;
    public boolean t0;
    public a71 u0;
    public final m61 v0;

    public z(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.c6 c6Var, a1 a1Var) {
        super(context, null, true, false, 2, c6Var);
        TLRPC.User user;
        a4.l lVar = new a4.l(1);
        n4.s[] sVarArr = (n4.s[]) lVar.b;
        this.l0 = lVar;
        this.r0 = new br[1];
        this.s0 = new br[1];
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.2f;
        this.a0 = j10;
        this.Y = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Z = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        this.q0 = a1Var;
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        boolean j11 = n5.y(i10, true).j();
        if (j10 > 0 && MessagesController.getInstance(i10).getUserFull(j10) == null && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, false);
        }
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(i10).config;
        long j12 = tL_starGiftUnique.offer_min_stars;
        ag.b bVar = ag.b.a;
        ag.a g10 = ag.a.g(j12, bVar);
        ag.a g11 = ag.a.g(Math.max(g10.a() * 2, appGlobalConfig.starsStarGiftResaleAmountMax.get()), bVar);
        ag.b bVar2 = ag.b.b;
        ag.a i11 = ag.a.i(Math.max(g10.e(bVar2).n(2).b, appGlobalConfig.tonStarGiftResaleAmountMin.get()), bVar2);
        ag.a i12 = ag.a.i(Math.max(i11.b * 2, appGlobalConfig.tonStarGiftResaleAmountMax.get()), bVar2);
        ag.b bVar3 = g10.a;
        if (bVar3 == g11.a) {
            sVarArr[bVar3.ordinal()] = new n4.s(4, g10, g11);
        }
        ag.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            sVarArr[bVar4.ordinal()] = new n4.s(4, i11, i12);
        }
        a aVar = new a(context, i10, c6Var);
        this.X = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.z5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.b6.a(aVar);
        aVar.setOnClickListener(new yg.e(this, context, c6Var, 6));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d0 = editTextBoldCursor;
        if (j11) {
            y40 y40Var = new y40(context, c6Var);
            this.b0 = y40Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferStars));
            arrayList.add(LocaleController.getString(R.string.SuggestedOfferTON));
            y40Var.b(arrayList, new v(this, 0));
            linearLayout.addView(y40Var, w7.z5.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
        } else {
            this.b0 = null;
        }
        LinearLayout e = sk.e(context, 1);
        linearLayout.addView(e, w7.z5.l(1.0f, -1, -2));
        yd0 yd0Var = new yd0(context, null);
        this.c0 = yd0Var;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        editTextBoldCursor.requestFocus();
        yd0Var.setLeftPadding(AndroidUtilities.dp(28.0f));
        yd0Var.e(editTextBoldCursor);
        yd0Var.b(1.0f, 0.0f, false);
        yd0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 5));
        yd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        e.addView(yd0Var, w7.z5.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.j0 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        yd0Var.addView(imageView, w7.z5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        ImageView imageView2 = new ImageView(context);
        this.k0 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        yd0Var.addView(imageView2, w7.z5.a(22.0f, 14.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.i0 = s6Var;
        int i14 = org.telegram.ui.ActionBar.g6.y6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var.setGravity(5);
        yd0Var.addView(s6Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 16.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextSize(1, 13.0f);
        e.addView(textView, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        x xVar = new x(context);
        this.f0 = xVar;
        xVar.setCursorSize(AndroidUtilities.dp(20.0f));
        xVar.setCursorWidth(1.5f);
        xVar.setTextSize(1, 17.0f);
        xVar.setMaxLines(1);
        xVar.setBackground(null);
        xVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        xVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        xVar.setFocusable(false);
        xVar.setClickable(false);
        xVar.setEnabled(false);
        yd0 yd0Var2 = new yd0(context, null);
        yd0Var2.setText(LocaleController.getString(R.string.GiftOfferDuration));
        yd0Var2.e(xVar);
        yd0Var2.addView(xVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 48));
        w7.b6.b(yd0Var2, 0.02f, 1.2f);
        yd0Var2.setOnClickListener(new yh.a(6, this, context));
        e.addView(yd0Var2, w7.z5.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, c6Var), PorterDuff.Mode.SRC_IN));
        yd0Var2.addView(imageView3, w7.z5.a(24.0f, 0.0f, 0.0f, 14.0f, 0.0f, 24, 21));
        TextView textView2 = new TextView(context);
        this.g0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-1, -2, 55, 33, 4, 33, 0));
        di.d dVar = new di.d(context, c6Var, true);
        this.h0 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: zh.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.R(z.this, i10, context, c6Var, j10);
            }
        });
        V(ag.a.i(0L, bVar), false, true, false);
        if (this.n0 != 86400) {
            this.n0 = 86400;
            xVar.setText(LocaleController.formatPluralString("GiftOfferHours", 24, new Object[0]));
        }
        U(false);
        editTextBoldCursor.addTextChangedListener(new y(this));
        FrameLayout.LayoutParams a2 = w7.z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i15 = a2.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        a2.leftMargin = i15 + i16;
        a2.rightMargin += i16;
        this.containerView.addView(dVar, a2);
        mm0 mm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(64.0f));
        this.d.setOverScrollMode(2);
        this.v0 = m61.k(linearLayout);
        this.u0.N(false);
    }

    public static void Q(z zVar, long j10, boolean z10, ag.a aVar, long j11, org.telegram.ui.ActionBar.a2 a2Var) {
        if (j10 > 0) {
            int i10 = zVar.currentAccount;
            ag.b bVar = ag.b.a;
            n5 x10 = n5.x(i10, bVar);
            ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
            ag.a g10 = z10 ? ag.a.g(j10, bVar) : ag.a.i(zVar.m0.b + aVar.b, bVar);
            if (l4 == null || l4.b < g10.b) {
                new e7(zVar.getContext(), zVar.resourcesProvider, g10.a(), 14, null, null, zVar.a0).show();
                return;
            }
        }
        pf.c g11 = a2Var.g(-1, true, true);
        g11.d();
        TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
        tL_sendStarGiftOffer.price = zVar.m0.o();
        tL_sendStarGiftOffer.peer = MessagesController.getInstance(zVar.currentAccount).getInputPeer(zVar.a0);
        tL_sendStarGiftOffer.duration = zVar.n0;
        tL_sendStarGiftOffer.slug = zVar.Y.slug;
        tL_sendStarGiftOffer.random_id = j11;
        if (j10 > 0) {
            tL_sendStarGiftOffer.flags |= 1;
            tL_sendStarGiftOffer.allow_paid_stars = j10;
        }
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(zVar, g11, a2Var, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Components.bd[], org.telegram.ui.Components.n01[]] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static void R(final z zVar, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10) {
        String str;
        boolean z10;
        ?? r14;
        boolean z11;
        if (zVar.h0.W) {
            if (MessagesController.getInstance(i10).isFrozen()) {
                org.telegram.ui.b.b(i10);
                return;
            }
            n5 x10 = n5.x(i10, zVar.m0.a);
            ag.a l4 = x10.e ? ag.a.l(x10.p()) : null;
            ag.b bVar = ag.b.a;
            ag.b bVar2 = ag.b.b;
            if (l4 != null) {
                long j11 = l4.b;
                ag.a aVar = zVar.m0;
                if (j11 >= aVar.b) {
                    String str2 = zVar.Z;
                    long j12 = zVar.a0;
                    String d = aVar.d();
                    if (zVar.m0.a == bVar2) {
                        str = str2;
                        z10 = true;
                    } else {
                        str = str2;
                        z10 = false;
                    }
                    LinearLayout linearLayout = new LinearLayout(zVar.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(zVar.getContext());
                    textView.setText(LocaleController.getString(R.string.GiftOfferConfirmSend));
                    int i11 = org.telegram.ui.ActionBar.g6.j5;
                    org.telegram.ui.Cells.c1.n(i11, zVar.resourcesProvider, textView, 1, 20.0f);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
                    TextView textView2 = new TextView(zVar.getContext());
                    sk.o(i11, zVar.resourcesProvider, textView2, 1, 16.0f);
                    textView2.setText(AndroidUtilities.replaceTags(zVar.m0.a == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextStars, d, DialogObject.getShortName(j12), str) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextTON, d, DialogObject.getShortName(j12), str)));
                    linearLayout.addView(textView2, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
                    o01 o01Var = new o01(zVar.getContext(), zVar.resourcesProvider);
                    final long sendPaidMessagesStars = MessagesController.getInstance(zVar.currentAccount).getSendPaidMessagesStars(j12);
                    final ag.a g10 = ag.a.g(sendPaidMessagesStars, bVar);
                    o01Var.c(LocaleController.getString(R.string.GiftOfferRowOffer), p7.Y0(z10, LocaleController.formatString(R.string.GiftOfferAmount, d), 0.8f, null), null, null);
                    if (sendPaidMessagesStars > 0) {
                        r14 = 0;
                        o01Var.c(LocaleController.getString(R.string.GiftOfferRowFee), p7.Y0(false, LocaleController.formatString(R.string.GiftOfferAmount, g10.d()), 0.8f, null), null, null);
                    } else {
                        r14 = 0;
                    }
                    o01Var.c(LocaleController.getString(R.string.GiftOfferRowDuration), LocaleController.formatPluralString("GiftOfferHours", zVar.n0 / 3600, new Object[0]), r14, r14);
                    linearLayout.addView(o01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
                    final long nextRandomId = SendMessagesHelper.getInstance(zVar.currentAccount).getNextRandomId();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (sendPaidMessagesStars == 0) {
                        spannableStringBuilder.append((CharSequence) p7.T0(LocaleController.formatString(R.string.GiftOfferPay, d), z10));
                    } else {
                        if (!z10) {
                            z11 = z10;
                            spannableStringBuilder.append((CharSequence) p7.R0(LocaleController.formatString(R.string.GiftOfferPay, ag.a.i(zVar.m0.b + g10.b, bVar).d())));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zVar.getContext(), 0, zVar.resourcesProvider);
                            alertDialog$Builder.n(linearLayout);
                            final boolean z12 = z11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() { // from class: zh.u
                                @Override // org.telegram.ui.ActionBar.z1
                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i12) {
                                    z.Q(z.this, sendPaidMessagesStars, z12, g10, nextRandomId, a2Var);
                                }
                            });
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            a2Var.X0 = true;
                            a2Var.show();
                            return;
                        }
                        spannableStringBuilder.append(LocaleController.formatSpannable(R.string.GiftOfferPayMulti, p7.T0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, d), true), p7.R0(LocaleController.formatString(R.string.GiftOfferPayMultiPart, g10.d()))));
                    }
                    z11 = z10;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zVar.getContext(), 0, zVar.resourcesProvider);
                    alertDialog$Builder2.n(linearLayout);
                    final boolean z122 = z11;
                    alertDialog$Builder2.k(spannableStringBuilder, new org.telegram.ui.ActionBar.z1() { // from class: zh.u
                        @Override // org.telegram.ui.ActionBar.z1
                        public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i12) {
                            z.Q(z.this, sendPaidMessagesStars, z122, g10, nextRandomId, a2Var2);
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
                    a2Var2.X0 = true;
                    a2Var2.show();
                    return;
                }
            }
            ag.a aVar2 = zVar.m0;
            ag.b bVar3 = aVar2.a;
            if (bVar3 == bVar) {
                new e7(context, c6Var, aVar2.a(), 14, null, null, j10).show();
            } else if (bVar3 == bVar2) {
                new ei.h(context, c6Var, aVar2, true, null).show();
            }
        }
    }

    public static /* synthetic */ void S(z zVar, pf.c cVar, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null && tL_error == null) {
            MessagesController.getInstance(zVar.currentAccount).lambda$processUpdates$377(updates, false);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(zVar, cVar, a2Var, updates, tL_error, 6));
    }

    @Override // org.telegram.ui.Components.db
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
                sk.s(aVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void U(boolean z10) {
        boolean z11 = this.o0 == 0 && this.m0.b > 0;
        di.d dVar = this.h0;
        if (dVar.W != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                sk.s(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
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
    public final void V(ag.a aVar, boolean z10, boolean z11, boolean z12) {
        ?? r16;
        boolean z13;
        ag.a aVar2 = this.m0;
        int i10 = this.o0;
        this.o0 = 0;
        if (aVar != null) {
            this.m0 = aVar;
        } else {
            this.m0 = ag.a.i(0L, aVar2.a);
            this.o0 |= 1;
        }
        ag.b bVar = this.m0.a;
        a4.l lVar = this.l0;
        n4.s[] sVarArr = (n4.s[]) lVar.b;
        n4.s[] sVarArr2 = (n4.s[]) lVar.b;
        long j10 = ((ag.a) sVarArr[bVar.ordinal()].c).b;
        ag.a aVar3 = this.m0;
        if (j10 < aVar3.b) {
            this.o0 |= 4;
        }
        if (!aVar3.k() && ((ag.a) sVarArr2[this.m0.a.ordinal()].b).b > this.m0.b) {
            this.o0 |= 2;
        }
        boolean z14 = z11 || aVar2.a != this.m0.a;
        boolean z15 = z11 || aVar2.b != this.m0.b;
        boolean z16 = z11 || i10 != this.o0;
        ag.b bVar2 = ag.b.a;
        EditTextBoldCursor editTextBoldCursor = this.d0;
        ag.b bVar3 = ag.b.b;
        if (z14) {
            y40 y40Var = this.b0;
            if (y40Var != null) {
                y40Var.a(this.m0.a == bVar2 ? 0 : 1, z12);
            }
            String shortName = DialogObject.getShortName(this.a0);
            ag.b bVar4 = this.m0.a;
            TextView textView = this.g0;
            if (bVar4 == bVar2) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoStars, shortName)));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr2[this.m0.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferDurationInfoTON, shortName)));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((ag.a) sVarArr2[this.m0.a.ordinal()].c).a()).length() + 3)});
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
                ag.b bVar5 = this.m0.a;
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
            ag.b bVar6 = this.m0.a;
            int i11 = this.o0;
            int i12 = i11 & 4;
            String str = this.Z;
            TextView textView2 = this.e0;
            if (i12 != 0) {
                int i13 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsHigh : R.string.GiftOfferTONToOfferInfoIsHigh;
                String d = ((ag.a) sVarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[r16] = d;
                objArr[1] = str;
                sk.r(i13, objArr, textView2);
            } else if ((i11 & 2) != 0) {
                int i14 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfoIsLow : R.string.GiftOfferTONToOfferInfoIsLow;
                String d10 = ((ag.a) sVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[r16] = d10;
                objArr2[1] = str;
                sk.r(i14, objArr2, textView2);
            } else {
                int i15 = bVar6 == bVar2 ? R.string.GiftOfferStarsToOfferInfo : R.string.GiftOfferTONToOfferInfo;
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                sk.r(i15, objArr3, textView2);
            }
            textView2.setTextColor(getThemedColor((this.o0 & (-9)) == 0 ? org.telegram.ui.ActionBar.g6.y6 : org.telegram.ui.ActionBar.g6.q7));
        }
        if (z14 || z15 || z16) {
            ag.a aVar5 = this.m0;
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

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar;
        if (!this.p0 || (aVar = this.X) == null || f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        T();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.t0 = true;
        T();
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new zf.c(this, 5), 50L);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 23), this.resourcesProvider);
        this.u0 = a71Var;
        a71Var.r = false;
        return a71Var;
    }
}
