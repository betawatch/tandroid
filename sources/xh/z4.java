package xh;

import ai.t5;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.b7;
import ci.c5;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.z6;
import org.telegram.ui.zn;
import w7.x5;
import yh.m5;
import yh.p7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class z4 extends eb implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean a0;
    public final boolean b0;
    public final TL_stars.StarGift c0;
    public GiftAuctionController.Auction d0;
    public final rg.k e0;
    public final String f0;
    public final Runnable g0;
    public final t4 h0;
    public final LinearLayout i0;
    public final long j0;
    public final org.telegram.ui.Cells.w0 k0;
    public final TLRPC.MessageAction l0;
    public final MessageObject m0;
    public final ci.d n0;
    public final FrameLayout o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final u4 s0;
    public c71 t0;
    public int u0;
    public final er[] v0;
    public boolean w0;

    public z4(Context context, int i10, final TL_stars.StarGift starGift, final rg.k kVar, long j3, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j10;
        Integer num;
        int i11;
        boolean z12;
        int i12;
        this.q0 = false;
        this.r0 = false;
        this.u0 = -2;
        new AnimationNotificationsLocker();
        this.v0 = new er[1];
        this.w0 = false;
        boolean z13 = j3 == UserConfig.getInstance(i10).getClientUserId();
        this.X = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.p0 = true;
        }
        this.Y = i10;
        this.Z = j3;
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
            this.q0 = true;
        } else if (z11) {
            this.q0 = false;
        }
        this.v = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.f0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            this.f0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.k0 = w0Var;
        w0Var.setDelegate(new s4());
        t4 t4Var = new t4(this, context);
        this.h0 = t4Var;
        Drawable e7 = b7.e(null, i10, j3, i6.I.q());
        t4Var.V(e7);
        fh.c cVar = new fh.c();
        if (e7 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e7).getColor());
        } else {
            if (e7 instanceof cd0) {
                cd0 cd0Var = (cd0) e7;
                if (cd0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = cd0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(i6.h5));
        ch.f fVar = new ch.f(cVar);
        e6 e6Var = this.resourcesProvider;
        int i13 = i6.h5;
        fVar.o(new dh.b(i13, e6Var));
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
                long e10 = kVar.e();
                tL_messageActionGiftPremium.amount = e10;
                if (kVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e10);
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
                long e11 = kVar.e();
                tL_messageActionGiftCode.amount = e11;
                z12 = z14;
                if (kVar.h != null) {
                    i12 = i13;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e11);
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
            boolean z15 = this.q0;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z15 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j3);
        tL_messageService.action = this.l0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j3) : j10;
        this.j0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.m0 = messageObject;
        w0Var.Y(messageObject, true);
        linearLayout.addView(w0Var, x5.t(-1, -1, 119, 0, sendPaidMessagesStars > j10 ? 0 : 8, 0, 8));
        t4Var.addView(linearLayout, x5.e(-1, -1, 119));
        u4 u4Var = new u4(this, context, (sw0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.s0 = u4Var;
        org.telegram.ui.Cells.e3 e3Var = u4Var.b;
        e3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        e3Var.Q = true;
        u4Var.setShowLimitWhenNear(50);
        this.Q = e3Var;
        u4Var.setShowLimitOnFocus(true);
        u4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(u4Var, 3);
        e3Var.getEditText().setImeOptions(i11);
        e3Var.getEditText().setOnEditorActionListener(new m.s2(gVar, 1));
        int i14 = this.backgroundPaddingLeft;
        u4Var.setPadding(i14, 0, i14, 0);
        v4 v4Var = new v4();
        v4Var.C = false;
        v4Var.m = false;
        v4Var.n(350L);
        v4Var.o(hs.h);
        v4Var.D = 40L;
        this.d.setItemAnimator(v4Var);
        this.t0.N(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        int i15 = i12;
        linearLayout2.setBackgroundColor(i6.w0(i15, this.resourcesProvider));
        int i16 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i16, 0, i16, 0);
        this.containerView.addView(linearLayout2, x5.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(i6.w0(i6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(x5.z(-1.0f), x5.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(i6.c0(AndroidUtilities.dp(6.0f), i6.w0(i6.a7, this.resourcesProvider)));
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, x5.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.o0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.o0 = frameLayout2;
            frameLayout2.addView(frameLayout, x5.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(i6.w0(i15, this.resourcesProvider));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i17 = i6.G6;
        textView.setTextColor(i6.w0(i17, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3), context);
        g10.setTextSize(1, 13.0f);
        g10.setGravity(21);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(i6.w0(i17, this.resourcesProvider));
        if (starGift != null) {
            g10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(g10, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        View w4Var = new w4(context, starGift, clamp);
        w4Var.setBackground(i6.c0(AndroidUtilities.dp(6.0f), i6.w0(i6.Oh, this.resourcesProvider)));
        frameLayout.addView(w4Var, x5.e(-1, -1, 119));
        x4 x4Var = new x4(context, clamp);
        x4Var.setWillNotDraw(false);
        frameLayout.addView(x4Var, x5.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        x4Var.addView(textView2, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 3));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        x4Var.addView(textView3, x5.a(-1.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 5));
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        this.n0 = dVar;
        dVar.e();
        a0(false);
        linearLayout2.addView(dVar, x5.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new p(this, j3, context, runnable, starGift));
        gg.a0 a0Var = this.c;
        this.P = true;
        a0Var.k1(true);
        this.t0.N(false);
        this.c.h1(this.t0.x.size(), AndroidUtilities.dp(200.0f));
        qm0 qm0Var = this.d;
        int i18 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i18, 0, i18, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.o0 == null) ? 40 : 0)));
        this.d.i(new y4(this));
        this.d.setOnItemClickListener(new em0() { // from class: xh.r4
            @Override // org.telegram.ui.Components.em0
            public final void d(int i19, View view2) {
                TL_stars.StarGift starGift2;
                z4 z4Var = z4.this;
                TL_stars.StarGift starGift3 = z4Var.c0;
                boolean z16 = z4Var.X;
                org.telegram.ui.Cells.w0 w0Var2 = z4Var.k0;
                TLRPC.MessageAction messageAction2 = z4Var.l0;
                MessageObject messageObject2 = z4Var.m0;
                c71 c71Var = z4Var.t0;
                if (!z4Var.P) {
                    i19--;
                }
                p61 G = c71Var.G(i19);
                if (G == null) {
                    return;
                }
                int i20 = G.d;
                if (i20 == 1) {
                    boolean z17 = !z4Var.p0;
                    z4Var.p0 = z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                    }
                    messageObject2.updateMessageText();
                    w0Var2.Y(messageObject2, true);
                    z4Var.t0.N(true);
                    return;
                }
                if (i20 == 2) {
                    if (z10 || z11) {
                        int i21 = -z4Var.u0;
                        z4Var.u0 = i21;
                        AndroidUtilities.shakeViewSpring(view2, i21);
                        return;
                    }
                    boolean z18 = z4Var.q0;
                    z4Var.q0 = !z18;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z18 || (z16 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z16 || z18) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z18 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    w0Var2.Y(messageObject2, true);
                    z4Var.t0.N(true);
                    z4Var.a0(true);
                    return;
                }
                if (i20 == 3) {
                    boolean z19 = z4Var.r0;
                    z4Var.r0 = !z19;
                    boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    rg.k kVar2 = kVar;
                    if (z20) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z19) {
                            tL_messageActionGiftPremium2.currency = kVar2.a();
                            long e12 = kVar2.e();
                            tL_messageActionGiftPremium2.amount = e12;
                            if (kVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e12);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = kVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z19) {
                            tL_messageActionGiftCode2.currency = kVar2.a();
                            long e13 = kVar2.e();
                            tL_messageActionGiftCode2.amount = e13;
                            if (kVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e13);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = kVar2.g();
                        }
                    }
                    messageObject2.updateMessageText();
                    w0Var2.Y(messageObject2, true);
                    z4Var.t0.N(true);
                    z4Var.a0(true);
                }
            }
        });
        this.e.setTitle(B());
    }

    public static void Q(z4 z4Var, TLRPC.User user, Boolean bool, String str) {
        int i10 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = z4Var.g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(z4Var.s0);
            z4Var.dismiss();
            AndroidUtilities.runOnUIThread(new q4(i10, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new ad(z4Var.topBulletinContainer, z4Var.resourcesProvider), R.raw.error, 36);
        }
        z4Var.n0.setLoading(false);
    }

    public static void R(z4 z4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = z4Var.g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(z4Var.s0);
            z4Var.dismiss();
            AndroidUtilities.runOnUIThread(new q4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new ad(z4Var.topBulletinContainer, z4Var.resourcesProvider), R.raw.error, 36);
        }
        z4Var.n0.setLoading(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(final z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i10 = z4Var.Y;
        u4 u4Var = z4Var.s0;
        ci.d dVar = z4Var.n0;
        if (dVar.N) {
            return;
        }
        int i11 = 5;
        if (z4Var.d0 != null) {
            o oVar = new o(context, z4Var.resourcesProvider, new n(j3, z4Var.p0, z4Var.X()), z4Var.d0);
            oVar.show();
            oVar.n0 = runnable;
            AndroidUtilities.hideKeyboard(u4Var);
            z4Var.dismiss();
            if (z4Var.w0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new p4(z4Var, i11), 500L);
            return;
        }
        final int i12 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.e3 e3Var = u4Var.b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var.k(true);
        } else if (e3Var.v) {
            e3Var.d();
        }
        final int i13 = 0;
        if (starGift != null) {
            m5.y(i10, false).i(z4Var.c0, z4Var.p0, z4Var.q0, z4Var.Z, z4Var.X(), new n4(z4Var, i12));
            return;
        }
        rg.k kVar = z4Var.e0;
        final TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(z4Var.Z));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (z4Var.r0) {
            tLObject = kVar.c;
            TLObject tLObject2 = kVar.d;
            if (tLObject != null || tLObject2 != null) {
                if (tLObject == null) {
                    tLObject = tLObject2 != null ? tLObject2 : null;
                }
                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                        m5.y(i10, false).g(z4Var.Z, tL_premiumGiftCodeOption, z4Var.X(), new Utilities.Callback2(z4Var) { // from class: xh.o4
                            public final /* synthetic */ z4 b;

                            {
                                this.b = z4Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i12) {
                                    case 0:
                                        z4.Q(this.b, user, bool, str);
                                        break;
                                    default:
                                        z4.R(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    } else {
                        int i14 = 11;
                        tg.s.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, z4Var.X(), new ai.z3(z4Var, i14), new z6(i14, z4Var, user), new ii.q1(z4Var, 23));
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                        m5.y(i10, false).g(z4Var.Z, tL_premiumGiftOption, z4Var.X(), new Utilities.Callback2(z4Var) { // from class: xh.o4
                            public final /* synthetic */ z4 b;

                            {
                                this.b = z4Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i13) {
                                    case 0:
                                        z4.Q(this.b, user, bool, str);
                                        break;
                                    default:
                                        z4.R(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (BuildVars.useInvoiceBilling()) {
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                            if (parse.getHost().equals("t.me")) {
                                if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                    launchActivity.Y0 = new p4(z4Var, i13);
                                } else {
                                    launchActivity.X0 = true;
                                }
                            }
                            of.f.s(launchActivity, kVar.a.bot_url);
                            z4Var.dismiss();
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
                    BillingController.getInstance().addResultListener(kVar.a.store_product, new c5(z4Var, i11));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new t5(z4Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 21));
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

    public static void V(z4 z4Var) {
        new yh.s3(z4Var.getContext(), z4Var.Y, z4Var.Z, z4Var.resourcesProvider, null).W1(z4Var.c0.id, z4Var.f0);
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return LocaleController.getString(this.X ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }

    public final TLRPC.TL_textWithEntities X() {
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

    public ad Y() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return ad.a0(U);
    }

    public final void Z(boolean z10) {
        int i10 = this.Y;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j3 = this.Z;
        TLRPC.UserFull userFull = messagesController.getUserFull(j3);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.n;
        if (n2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) n2Var.getParentActivity()).O().getFragmentStack());
            d5 parentLayout = n2Var.getParentLayout();
            int size = arrayList.size();
            zn znVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var2 instanceof zn) {
                    znVar = (zn) n2Var2;
                    if (znVar.a() != j3) {
                        n2Var2.removeSelfFromStack();
                    }
                } else if (n2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == n2Var2) {
                        n2Var2.finishFragment();
                    } else {
                        n2Var2.removeSelfFromStack();
                    }
                }
            }
            if (znVar == null || znVar.a() != j3) {
                ((ActionBarLayout) parentLayout).Q(new zn(sc.v.f(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void a0(boolean z10) {
        GiftAuctionController.Auction auction = this.d0;
        int i10 = this.Y;
        ci.d dVar = this.n0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.d0.isUpcoming(currentTime)) {
                int i11 = this.d0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.d0.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(null, z10);
                return;
            } else {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.c0;
        er[] erVarArr = this.v0;
        if (starGift != null) {
            long j3 = m5.y(i10, false).p().amount;
            long j10 = starGift.stars + (this.q0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.s0.getText()) ? 0L : this.j0);
            dVar.g(p7.W0(false, LocaleController.formatPluralStringComma(this.X ? "Gift2SendSelf" : "Gift2Send", (int) j10), erVarArr), z10, true);
            if (!m5.y(i10, false).e || j10 <= j3) {
                dVar.f(null, z10);
                return;
            } else {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j3), z10);
                return;
            }
        }
        rg.k kVar = this.e0;
        if (kVar != null) {
            if (this.r0) {
                dVar.g(p7.S0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, erVarArr), z10, true);
                erVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a0(true);
            c71 c71Var = this.t0;
            if (c71Var == null || this.e0 == null) {
                return;
            }
            c71Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        u4 u4Var = this.s0;
        org.telegram.ui.Cells.e3 e3Var = u4Var.b;
        org.telegram.ui.Cells.e3 e3Var2 = u4Var.b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var2.k(true);
            return;
        }
        if (e3Var2.v) {
            e3Var2.d();
            return;
        }
        e3Var2.r();
        if (this.d0 != null) {
            GiftAuctionController.getInstance(this.Y).unsubscribeFromGiftAuction(this.d0.giftId, this);
        }
        this.w0 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.Y).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        u4 u4Var = this.s0;
        org.telegram.ui.Cells.e3 e3Var = u4Var.b;
        org.telegram.ui.Cells.e3 e3Var2 = u4Var.b;
        if (e3Var.getEmojiPadding() > 0) {
            e3Var2.k(true);
        } else if (e3Var2.v) {
            e3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Y).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.d0 = auction;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        u4 u4Var = this.s0;
        if (u4Var != null) {
            u4Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(this.d, getContext(), this.Y, 0, true, new n4(this, 0), this.resourcesProvider);
        this.t0 = c71Var;
        c71Var.r = false;
        return c71Var;
    }
}
