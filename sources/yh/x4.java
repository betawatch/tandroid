package yh;

import ai.a5;
import ai.ha;
import ai.l7;
import ai.nd;
import ai.r7;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.r6;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public class x4 extends bb implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean a0;
    public final boolean b0;
    public final TL_stars.StarGift c0;
    public GiftAuctionController.Auction d0;
    public final sg.k e0;
    public final String f0;
    public final Runnable g0;
    public final r4 h0;
    public final LinearLayout i0;
    public final long j0;
    public final org.telegram.ui.Cells.v0 k0;
    public final TLRPC.MessageAction l0;
    public final MessageObject m0;
    public final LinearLayout n0;
    public final ei.d o0;
    public final FrameLayout p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public final s4 t0;
    public b71 u0;
    public int v0;
    public final xq[] w0;
    public boolean x0;
    public final gh.c y0;

    public x4(Context context, int i10, final TL_stars.StarGift starGift, final sg.k kVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j11;
        Integer num;
        int i11;
        boolean z12;
        int i12;
        this.r0 = false;
        this.s0 = false;
        this.v0 = -2;
        new AnimationNotificationsLocker();
        this.w0 = new xq[1];
        this.x0 = false;
        boolean z13 = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.X = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.q0 = true;
        }
        this.Y = i10;
        this.Z = j10;
        this.c0 = starGift;
        if (starGift == null || !starGift.auction) {
            f7 = 4.0f;
        } else {
            f7 = 4.0f;
            this.d0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.id, this);
        }
        this.e0 = kVar;
        this.g0 = runnable;
        this.a0 = z10;
        this.b0 = z11;
        if (z10) {
            this.r0 = true;
        } else if (z11) {
            this.r0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            j11 = 0;
            this.f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
        } else {
            j11 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.resourcesProvider, false);
        this.k0 = v0Var;
        v0Var.setDelegate(new q4());
        r4 r4Var = new r4(this, context);
        this.h0 = r4Var;
        Drawable e = r6.e(null, i10, j10, k6.I.q());
        r4Var.U(e);
        gh.c cVar = new gh.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof yc0) {
                yc0 yc0Var = (yc0) e;
                if (yc0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = yc0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(k6.h5));
        this.y0 = num == null ? cVar : null;
        dh.f fVar = new dh.f(cVar);
        g6 g6Var = this.resourcesProvider;
        int i13 = k6.h5;
        fVar.o(new eh.b(i13, g6Var));
        fVar.q(AndroidUtilities.dp(20.0f));
        fVar.p(AndroidUtilities.dp(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.l0 = tL_messageActionStarGift;
            z12 = z13;
            i12 = i13;
        } else {
            boolean z14 = z13;
            i11 = 6;
            if (kVar == null || kVar.b == null) {
                z12 = z14;
                i12 = i13;
                if (kVar == null || kVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = kVar.d();
                tL_messageActionGiftPremium.currency = kVar.a();
                long e7 = kVar.e();
                tL_messageActionGiftPremium.amount = e7;
                if (kVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e7);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.l0 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e10 = kVar.e();
                tL_messageActionGiftCode.amount = e10;
                z12 = z14;
                if (kVar.h != null) {
                    i12 = i13;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e10);
                } else {
                    i12 = i13;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.l0 = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.r0;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j11;
            tL_messageActionStarGift2.convert_stars = z15 ? j11 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.l0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j10) : j11;
        this.j0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        v0Var.X(messageObject, true);
        linearLayout.addView(v0Var, z5.t(-1, -1, 119, 0, sendPaidMessagesStars > j11 ? 0 : 8, 0, 8));
        r4Var.addView(linearLayout, z5.e(-1, -1, 119));
        s4 s4Var = new s4(this, context, (ow0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.t0 = s4Var;
        org.telegram.ui.Cells.c3 c3Var = s4Var.b;
        c3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.g3());
        c3Var.Q = true;
        s4Var.setShowLimitWhenNear(50);
        this.Q = c3Var;
        s4Var.setShowLimitOnFocus(true);
        s4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(s4Var, 3);
        c3Var.getEditText().setImeOptions(i11);
        c3Var.getEditText().setOnEditorActionListener(new m.t2(gVar, 1));
        int i14 = this.backgroundPaddingLeft;
        s4Var.setPadding(i14, 0, i14, 0);
        t4 t4Var = new t4();
        t4Var.C = false;
        t4Var.m = false;
        t4Var.n(350L);
        t4Var.o(bs.h);
        t4Var.D = 40L;
        this.d.setItemAnimator(t4Var);
        this.u0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n0 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(i12, this.resourcesProvider));
        int i15 = this.backgroundPaddingLeft;
        int i16 = i12;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i15, 0, i15, 0));
        int i17 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i17, 0, i17, 0);
        this.containerView.addView(linearLayout2, z5.e(-1, -2, 87));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(k6.K5, view, this.resourcesProvider);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(6.0f);
        int i18 = k6.a7;
        Drawable c02 = k6.c0(dp, k6.w0(i18, this.resourcesProvider));
        n6 O = org.telegram.ui.ActionBar.r6.O(i18);
        g6 g6Var2 = this.resourcesProvider;
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, c02, O, null, g6Var2);
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, z5.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.p0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.p0 = frameLayout2;
            frameLayout2.addView(frameLayout, z5.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            org.telegram.ui.ActionBar.r6.i(i16, frameLayout2, this.resourcesProvider);
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i19 = k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i19, this.resourcesProvider);
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView j12 = org.telegram.ui.Cells.b1.j(frameLayout, textView, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        j12.setTextSize(1, 13.0f);
        j12.setGravity(21);
        j12.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.W(j12, i19, this.resourcesProvider);
        if (starGift != null) {
            j12.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(j12, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View u4Var = new u4(context, starGift, clamp);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i20 = k6.Oh;
        Drawable c03 = k6.c0(dp2, k6.w0(i20, this.resourcesProvider));
        n6 O2 = org.telegram.ui.ActionBar.r6.O(i20);
        g6 g6Var3 = this.resourcesProvider;
        u4Var.setBackground(c03);
        org.telegram.ui.ActionBar.r6.k(u4Var, c03, O2, null, g6Var3);
        frameLayout.addView(u4Var, z5.e(-1, -1, 119));
        v4 v4Var = new v4(context, clamp);
        v4Var.setWillNotDraw(false);
        frameLayout.addView(v4Var, z5.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        v4Var.addView(textView2, z5.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        v4Var.addView(textView3, z5.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ei.d dVar = new ei.d(context, this.resourcesProvider, true);
        this.o0 = dVar;
        dVar.f();
        Z(false);
        linearLayout2.addView(dVar, z5.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j10, context, runnable, starGift));
        hg.a0 a0Var = this.c;
        this.P = true;
        a0Var.k1(true);
        this.u0.N(false);
        this.c.h1(this.u0.y.size(), AndroidUtilities.dp(200.0f));
        mm0 mm0Var = this.d;
        int i21 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i21, 0, i21, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.p0 == null) ? 40 : 0)));
        this.d.i(new w4(this));
        this.d.setOnItemClickListener(new am0() { // from class: yh.p4
            @Override // org.telegram.ui.Components.am0
            public final void d(int i22, View view2) {
                TL_stars.StarGift starGift2;
                x4 x4Var = x4.this;
                TL_stars.StarGift starGift3 = x4Var.c0;
                boolean z16 = x4Var.X;
                org.telegram.ui.Cells.v0 v0Var2 = x4Var.k0;
                TLRPC.MessageAction messageAction2 = x4Var.l0;
                MessageObject messageObject2 = x4Var.m0;
                b71 b71Var = x4Var.u0;
                if (!x4Var.P) {
                    i22--;
                }
                m61 G = b71Var.G(i22);
                if (G == null) {
                    return;
                }
                int i23 = G.d;
                if (i23 == 1) {
                    boolean z17 = !x4Var.q0;
                    x4Var.q0 = z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.X(messageObject2, true);
                    x4Var.u0.N(true);
                    return;
                }
                if (i23 == 2) {
                    if (z10 || z11) {
                        int i24 = -x4Var.v0;
                        x4Var.v0 = i24;
                        AndroidUtilities.shakeViewSpring(view2, i24);
                        return;
                    }
                    boolean z18 = x4Var.r0;
                    x4Var.r0 = !z18;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z18 || (z16 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z16 || z18) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z18 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.X(messageObject2, true);
                    x4Var.u0.N(true);
                    x4Var.Z(true);
                    return;
                }
                if (i23 == 3) {
                    boolean z19 = x4Var.s0;
                    x4Var.s0 = !z19;
                    boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    sg.k kVar2 = kVar;
                    if (z20) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z19) {
                            tL_messageActionGiftPremium2.currency = kVar2.a();
                            long e11 = kVar2.e();
                            tL_messageActionGiftPremium2.amount = e11;
                            if (kVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e11);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = kVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z19) {
                            tL_messageActionGiftCode2.currency = kVar2.a();
                            long e12 = kVar2.e();
                            tL_messageActionGiftCode2.amount = e12;
                            if (kVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e12);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = kVar2.g();
                        }
                    }
                    messageObject2.updateMessageText();
                    v0Var2.X(messageObject2, true);
                    x4Var.u0.N(true);
                    x4Var.Z(true);
                }
            }
        });
        this.e.setTitle(z());
    }

    public static void P(x4 x4Var, TLRPC.User user, Boolean bool, String str) {
        int i10 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = x4Var.g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(x4Var.t0);
            x4Var.dismiss();
            AndroidUtilities.runOnUIThread(new o4(i10, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, new xc(x4Var.topBulletinContainer, x4Var.resourcesProvider), R.raw.error, 36);
        }
        x4Var.o0.setLoading(false);
    }

    public static void Q(x4 x4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = x4Var.g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(x4Var.t0);
            x4Var.dismiss();
            AndroidUtilities.runOnUIThread(new o4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, new xc(x4Var.topBulletinContainer, x4Var.resourcesProvider), R.raw.error, 36);
        }
        x4Var.o0.setLoading(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(final x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i10 = x4Var.Y;
        s4 s4Var = x4Var.t0;
        ei.d dVar = x4Var.o0;
        if (dVar.Q) {
            return;
        }
        if (x4Var.d0 != null) {
            m mVar = new m(context, x4Var.resourcesProvider, new l(j10, x4Var.q0, x4Var.W()), x4Var.d0);
            mVar.show();
            mVar.n0 = runnable;
            AndroidUtilities.hideKeyboard(s4Var);
            x4Var.dismiss();
            if (x4Var.x0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new n4(x4Var, 5), 500L);
            return;
        }
        final int i11 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.c3 c3Var = s4Var.b;
        if (c3Var.getEmojiPadding() > 0) {
            c3Var.k(true);
        } else if (c3Var.v) {
            c3Var.d();
        }
        final int i12 = 0;
        if (starGift != null) {
            ha.y(i10, false).i(x4Var.c0, x4Var.q0, x4Var.r0, x4Var.Z, x4Var.W(), new l4(x4Var, i11));
            return;
        }
        sg.k kVar = x4Var.e0;
        final TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(x4Var.Z));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (x4Var.s0) {
            tLObject = kVar.c;
            TLObject tLObject2 = kVar.d;
            if (tLObject != null || tLObject2 != null) {
                if (tLObject == null) {
                    tLObject = tLObject2 != null ? tLObject2 : null;
                }
                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                        ha.y(i10, false).g(x4Var.Z, tL_premiumGiftCodeOption, x4Var.W(), new Utilities.Callback2(x4Var) { // from class: yh.m4
                            public final /* synthetic */ x4 b;

                            {
                                this.b = x4Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i11) {
                                    case 0:
                                        x4.P(this.b, user, bool, str);
                                        break;
                                    default:
                                        x4.Q(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    } else {
                        ug.q.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, x4Var.W(), new a5(x4Var, 12), new org.telegram.ui.Wallet.w(18, x4Var, user), new ig.k0(x4Var, 29));
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                        ha.y(i10, false).g(x4Var.Z, tL_premiumGiftOption, x4Var.W(), new Utilities.Callback2(x4Var) { // from class: yh.m4
                            public final /* synthetic */ x4 b;

                            {
                                this.b = x4Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i12) {
                                    case 0:
                                        x4.P(this.b, user, bool, str);
                                        break;
                                    default:
                                        x4.Q(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (BuildVars.useInvoiceBilling()) {
                        LaunchActivity launchActivity = LaunchActivity.J1;
                        if (launchActivity != null) {
                            Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                            if (parse.getHost().equals("t.me")) {
                                if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                    launchActivity.Z0 = new n4(x4Var, i12);
                                } else {
                                    launchActivity.Y0 = true;
                                }
                            }
                            pf.d.r(launchActivity, kVar.a.bot_url);
                            x4Var.dismiss();
                            return;
                        }
                        return;
                    }
                    if (!BillingController.getInstance().isReady() || kVar.h == null) {
                        return;
                    }
                    TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                    tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(i10).getInputUser(user);
                    tL_inputStorePaymentGiftPremium.currency = kVar.h.a().c;
                    tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)) * (r3.b / Math.pow(10.0d, 6.0d)));
                    BillingController.getInstance().addResultListener(kVar.a.store_product, new r7(x4Var, 6));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new ai.j2(x4Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 26));
                    return;
                }
                return;
            }
        }
        tLObject = kVar.b;
        if (tLObject == null && (tLObject = kVar.a) == null) {
            dVar.setLoading(false);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
        }
    }

    public static void U(x4 x4Var) {
        new l7(x4Var.getContext(), x4Var.Y, x4Var.Z, x4Var.resourcesProvider, null).s2(x4Var.c0.id, x4Var.f0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.Y).getSendPaidMessagesStars(this.Z) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    public xc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return xc.a0(U);
    }

    public final void Y(boolean z10) {
        int i10 = this.Y;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.Z;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (o2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) o2Var.getParentActivity()).O().getFragmentStack());
            h5 parentLayout = o2Var.getParentLayout();
            int size = arrayList.size();
            sn snVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var2 instanceof sn) {
                    snVar = (sn) o2Var2;
                    if (snVar.a() != j10) {
                        o2Var2.removeSelfFromStack();
                    }
                } else if (o2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == o2Var2) {
                        o2Var2.finishFragment();
                    } else {
                        o2Var2.removeSelfFromStack();
                    }
                }
            }
            if (snVar == null || snVar.a() != j10) {
                ((ActionBarLayout) parentLayout).R(new sn(si.o0.e(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        GiftAuctionController.Auction auction = this.d0;
        int i10 = this.Y;
        ei.d dVar = this.o0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.d0.isUpcoming(currentTime)) {
                int i11 = this.d0.gift.auction_start_date - currentTime;
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.d0.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.g(null, z10);
                return;
            } else {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.g(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.c0;
        xq[] xqVarArr = this.w0;
        if (starGift != null) {
            long j10 = ha.y(i10, false).p().amount;
            long j11 = starGift.stars + (this.r0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.t0.getText()) ? 0L : this.j0);
            dVar.i(nd.W0(false, LocaleController.formatPluralStringComma(this.X ? "Gift2SendSelf" : "Gift2Send", (int) j11), xqVarArr), z10, true);
            if (!ha.y(i10, false).e || j11 <= j10) {
                dVar.g(null, z10);
                return;
            } else {
                dVar.g(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j10), z10);
                return;
            }
        }
        sg.k kVar = this.e0;
        if (kVar != null) {
            if (this.s0) {
                dVar.i(nd.S0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, xqVarArr), z10, true);
                xqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.i(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.g(null, z10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            b71 b71Var = this.u0;
            if (b71Var == null || this.e0 == null) {
                return;
            }
            b71Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        s4 s4Var = this.t0;
        org.telegram.ui.Cells.c3 c3Var = s4Var.b;
        org.telegram.ui.Cells.c3 c3Var2 = s4Var.b;
        if (c3Var.getEmojiPadding() > 0) {
            c3Var2.k(true);
            return;
        }
        if (c3Var2.v) {
            c3Var2.d();
            return;
        }
        c3Var2.r();
        if (this.d0 != null) {
            GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.d0.giftId, this);
        }
        this.x0 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Y).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        s4 s4Var = this.t0;
        org.telegram.ui.Cells.c3 c3Var = s4Var.b;
        org.telegram.ui.Cells.c3 c3Var2 = s4Var.b;
        if (c3Var.getEmojiPadding() > 0) {
            c3Var2.k(true);
        } else if (c3Var2.v) {
            c3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Y).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.n0;
            if (linearLayout != null) {
                int w02 = k6.w0(k6.h5, this.resourcesProvider);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i10 = this.backgroundPaddingLeft;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i10, 0, i10, 0));
                }
            }
            gh.c cVar = this.y0;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.h5));
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.d0 = auction;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        s4 s4Var = this.t0;
        if (s4Var != null) {
            s4Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.Y, 0, true, new l4(this, 0), this.resourcesProvider);
        this.u0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(this.X ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }
}
