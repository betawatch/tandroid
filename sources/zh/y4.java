package zh;

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
import bi.ca;
import bi.dd;
import bi.h7;
import bi.n7;
import fi.o6;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class y4 extends bb implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean X;
    public final int Y;
    public final long Z;
    public final boolean a0;
    public final boolean b0;
    public final TL_stars.StarGift c0;
    public GiftAuctionController.Auction d0;
    public final tg.k e0;
    public final String f0;
    public final Runnable g0;
    public final s4 h0;
    public final LinearLayout i0;
    public final long j0;
    public final org.telegram.ui.Cells.v0 k0;
    public final TLRPC.MessageAction l0;
    public final MessageObject m0;
    public final LinearLayout n0;
    public final fi.d o0;
    public final FrameLayout p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public final t4 t0;
    public j71 u0;
    public int v0;
    public final zq[] w0;
    public boolean x0;
    public final hh.c y0;

    public y4(Context context, int i10, final TL_stars.StarGift starGift, final tg.k kVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
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
        this.w0 = new zq[1];
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
        v0Var.setDelegate(new r4());
        s4 s4Var = new s4(this, context);
        this.h0 = s4Var;
        Drawable e = o6.e(null, i10, j10, y6.I.q());
        s4Var.U(e);
        hh.c cVar = new hh.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof uc0) {
                uc0 uc0Var = (uc0) e;
                if (uc0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = uc0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(y6.h5));
        this.y0 = num == null ? cVar : null;
        eh.f fVar = new eh.f(cVar);
        u6 u6Var = this.resourcesProvider;
        int i13 = y6.h5;
        fVar.v(new fh.b(i13, u6Var));
        fVar.x(AndroidUtilities.dp(20.0f));
        fVar.w(AndroidUtilities.dp(f7));
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
        linearLayout.addView(v0Var, gb1.x(-1, -1, 119, 0, sendPaidMessagesStars > j11 ? 0 : 8, 0, 8));
        s4Var.addView(linearLayout, gb1.i(-1, -1, 119));
        t4 t4Var = new t4(this, context, (vw0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.t0 = t4Var;
        org.telegram.ui.Cells.b3 b3Var = t4Var.b;
        b3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        b3Var.Q = true;
        t4Var.setShowLimitWhenNear(50);
        this.Q = b3Var;
        t4Var.setShowLimitOnFocus(true);
        t4Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(t4Var, 3);
        b3Var.getEditText().setImeOptions(i11);
        b3Var.getEditText().setOnEditorActionListener(new m.s2(gVar, 1));
        int i14 = this.backgroundPaddingLeft;
        t4Var.setPadding(i14, 0, i14, 0);
        u4 u4Var = new u4();
        u4Var.C = false;
        u4Var.m = false;
        u4Var.n(350L);
        u4Var.o(ds.h);
        u4Var.D = 40L;
        this.d.setItemAnimator(u4Var);
        this.u0.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n0 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(y6.w0(i12, this.resourcesProvider));
        int i15 = this.backgroundPaddingLeft;
        int i16 = i12;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i15, 0, i15, 0));
        int i17 = this.backgroundPaddingLeft;
        linearLayout2.setPadding(i17, 0, i17, 0);
        this.containerView.addView(linearLayout2, gb1.i(-1, -2, 87));
        View view = new View(context);
        f7.i(y6.K5, view, this.resourcesProvider);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gb1.I(-1.0f), gb1.I(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(6.0f);
        int i18 = y6.a7;
        Drawable c02 = y6.c0(dp, y6.w0(i18, this.resourcesProvider));
        b7 N = f7.N(i18);
        u6 u6Var2 = this.resourcesProvider;
        frameLayout.setBackground(c02);
        f7.k(frameLayout, c02, N, null, u6Var2);
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, gb1.o(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.p0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.p0 = frameLayout2;
            frameLayout2.addView(frameLayout, gb1.o(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            f7.i(i16, frameLayout2, this.resourcesProvider);
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i19 = y6.G6;
        f7.V(textView, i19, this.resourcesProvider);
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, gb1.h(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        k10.setTextSize(1, 13.0f);
        k10.setGravity(21);
        k10.setTypeface(AndroidUtilities.bold());
        f7.V(k10, i19, this.resourcesProvider);
        if (starGift != null) {
            k10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(k10, gb1.h(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View v4Var = new v4(context, starGift, clamp);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i20 = y6.Oh;
        Drawable c03 = y6.c0(dp2, y6.w0(i20, this.resourcesProvider));
        b7 N2 = f7.N(i20);
        u6 u6Var3 = this.resourcesProvider;
        v4Var.setBackground(c03);
        f7.k(v4Var, c03, N2, null, u6Var3);
        frameLayout.addView(v4Var, gb1.i(-1, -1, 119));
        w4 w4Var = new w4(context, clamp);
        w4Var.setWillNotDraw(false);
        frameLayout.addView(w4Var, gb1.i(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        w4Var.addView(textView2, gb1.h(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        w4Var.addView(textView3, gb1.h(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        fi.d dVar = new fi.d(context, this.resourcesProvider, true);
        this.o0 = dVar;
        dVar.f();
        Z(false);
        linearLayout2.addView(dVar, gb1.x(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j10, context, runnable, starGift));
        ig.a0 a0Var = this.c;
        this.P = true;
        a0Var.l1(true);
        this.u0.O(false);
        this.c.h1(this.u0.y.size(), AndroidUtilities.dp(200.0f));
        mm0 mm0Var = this.d;
        int i21 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i21, 0, i21, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.p0 == null) ? 40 : 0)));
        this.d.i(new x4(this));
        this.d.setOnItemClickListener(new zl0() { // from class: zh.q4
            @Override // org.telegram.ui.Components.zl0
            public final void c(int i22, View view2) {
                TL_stars.StarGift starGift2;
                y4 y4Var = y4.this;
                TL_stars.StarGift starGift3 = y4Var.c0;
                boolean z16 = y4Var.X;
                org.telegram.ui.Cells.v0 v0Var2 = y4Var.k0;
                TLRPC.MessageAction messageAction2 = y4Var.l0;
                MessageObject messageObject2 = y4Var.m0;
                j71 j71Var = y4Var.u0;
                if (!y4Var.P) {
                    i22--;
                }
                t61 G = j71Var.G(i22);
                if (G == null) {
                    return;
                }
                int i23 = G.d;
                if (i23 == 1) {
                    boolean z17 = !y4Var.q0;
                    y4Var.q0 = z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.X(messageObject2, true);
                    y4Var.u0.O(true);
                    return;
                }
                if (i23 == 2) {
                    if (z10 || z11) {
                        int i24 = -y4Var.v0;
                        y4Var.v0 = i24;
                        AndroidUtilities.shakeViewSpring(view2, i24);
                        return;
                    }
                    boolean z18 = y4Var.r0;
                    y4Var.r0 = !z18;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z18 || (z16 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z16 || z18) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z18 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.X(messageObject2, true);
                    y4Var.u0.O(true);
                    y4Var.Z(true);
                    return;
                }
                if (i23 == 3) {
                    boolean z19 = y4Var.s0;
                    y4Var.s0 = !z19;
                    boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    tg.k kVar2 = kVar;
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
                    v0Var2.X(messageObject2, true);
                    y4Var.u0.O(true);
                    y4Var.Z(true);
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(y4 y4Var, TLRPC.User user, Boolean bool, String str) {
        int i10 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = y4Var.g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(y4Var.t0);
            y4Var.dismiss();
            AndroidUtilities.runOnUIThread(new p4(i10, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new wc(y4Var.topBulletinContainer, y4Var.resourcesProvider), R.raw.error, 36);
        }
        y4Var.o0.setLoading(false);
    }

    public static void Q(y4 y4Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = y4Var.g0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(y4Var.t0);
            y4Var.dismiss();
            AndroidUtilities.runOnUIThread(new p4(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new wc(y4Var.topBulletinContainer, y4Var.resourcesProvider), R.raw.error, 36);
        }
        y4Var.o0.setLoading(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(final y4 y4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i10 = y4Var.Y;
        t4 t4Var = y4Var.t0;
        fi.d dVar = y4Var.o0;
        if (dVar.Q) {
            return;
        }
        if (y4Var.d0 != null) {
            m mVar = new m(context, y4Var.resourcesProvider, new l(j10, y4Var.q0, y4Var.W()), y4Var.d0);
            mVar.show();
            mVar.n0 = runnable;
            AndroidUtilities.hideKeyboard(t4Var);
            y4Var.dismiss();
            if (y4Var.x0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new o4(y4Var, 5), 500L);
            return;
        }
        final int i11 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.b3 b3Var = t4Var.b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var.k(true);
        } else if (b3Var.v) {
            b3Var.d();
        }
        final int i12 = 0;
        if (starGift != null) {
            ca.y(i10, false).i(y4Var.c0, y4Var.q0, y4Var.r0, y4Var.Z, y4Var.W(), new m4(y4Var, i11));
            return;
        }
        tg.k kVar = y4Var.e0;
        final TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(y4Var.Z));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (y4Var.s0) {
            tLObject = kVar.c;
            TLObject tLObject2 = kVar.d;
            if (tLObject != null || tLObject2 != null) {
                if (tLObject == null) {
                    tLObject = tLObject2 != null ? tLObject2 : null;
                }
                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                        ca.y(i10, false).g(y4Var.Z, tL_premiumGiftCodeOption, y4Var.W(), new Utilities.Callback2(y4Var) { // from class: zh.n4
                            public final /* synthetic */ y4 b;

                            {
                                this.b = y4Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i11) {
                                    case 0:
                                        y4.P(this.b, user, bool, str);
                                        break;
                                    default:
                                        y4.Q(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    } else {
                        vg.s.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, y4Var.W(), new bi.v4(y4Var, 12), new org.telegram.ui.Wallet.s(20, y4Var, user), new l1(y4Var, 3));
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                        ca.y(i10, false).g(y4Var.Z, tL_premiumGiftOption, y4Var.W(), new Utilities.Callback2(y4Var) { // from class: zh.n4
                            public final /* synthetic */ y4 b;

                            {
                                this.b = y4Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i12) {
                                    case 0:
                                        y4.P(this.b, user, bool, str);
                                        break;
                                    default:
                                        y4.Q(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (BuildVars.useInvoiceBilling()) {
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                            if (parse.getHost().equals("t.me")) {
                                if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                    launchActivity.Z0 = new o4(y4Var, i12);
                                } else {
                                    launchActivity.Y0 = true;
                                }
                            }
                            qf.d.r(launchActivity, kVar.a.bot_url);
                            y4Var.dismiss();
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
                    BillingController.getInstance().addResultListener(kVar.a.store_product, new n7(y4Var, 6));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new bi.h2(y4Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 26));
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

    public static void U(y4 y4Var) {
        new h7(y4Var.getContext(), y4Var.Y, y4Var.Z, y4Var.resourcesProvider, null).s2(y4Var.c0.id, y4Var.f0);
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

    public wc X() {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return wc.b0(U);
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
        org.telegram.ui.ActionBar.r2 r2Var = this.n;
        if (r2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) r2Var.getParentActivity()).O().getFragmentStack());
            j5 parentLayout = r2Var.getParentLayout();
            int size = arrayList.size();
            un unVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                if (r2Var2 instanceof un) {
                    unVar = (un) r2Var2;
                    if (unVar.a() != j10) {
                        r2Var2.removeSelfFromStack();
                    }
                } else if (r2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == r2Var2) {
                        r2Var2.finishFragment();
                    } else {
                        r2Var2.removeSelfFromStack();
                    }
                }
            }
            if (unVar == null || unVar.a() != j10) {
                ((ActionBarLayout) parentLayout).S(new un(a1.g.h(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        GiftAuctionController.Auction auction = this.d0;
        int i10 = this.Y;
        fi.d dVar = this.o0;
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
        zq[] zqVarArr = this.w0;
        if (starGift != null) {
            long j10 = ca.y(i10, false).p().amount;
            long j11 = starGift.stars + (this.r0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.t0.getText()) ? 0L : this.j0);
            dVar.i(dd.U0(false, LocaleController.formatPluralStringComma(this.X ? "Gift2SendSelf" : "Gift2Send", (int) j11), zqVarArr), z10, true);
            if (!ca.y(i10, false).e || j11 <= j10) {
                dVar.g(null, z10);
                return;
            } else {
                dVar.g(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j10), z10);
                return;
            }
        }
        tg.k kVar = this.e0;
        if (kVar != null) {
            if (this.s0) {
                dVar.i(dd.Q0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, zqVarArr), z10, true);
                zqVarArr[0].spaceScaleX = 0.85f;
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
            j71 j71Var = this.u0;
            if (j71Var == null || this.e0 == null) {
                return;
            }
            j71Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        t4 t4Var = this.t0;
        org.telegram.ui.Cells.b3 b3Var = t4Var.b;
        org.telegram.ui.Cells.b3 b3Var2 = t4Var.b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
            return;
        }
        if (b3Var2.v) {
            b3Var2.d();
            return;
        }
        b3Var2.r();
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

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        t4 t4Var = this.t0;
        org.telegram.ui.Cells.b3 b3Var = t4Var.b;
        org.telegram.ui.Cells.b3 b3Var2 = t4Var.b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
        } else if (b3Var2.v) {
            b3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.Y).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.n0;
            if (linearLayout != null) {
                int w02 = y6.w0(y6.h5, this.resourcesProvider);
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
            hh.c cVar = this.y0;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.h5));
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

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        t4 t4Var = this.t0;
        if (t4Var != null) {
            t4Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.Y, 0, true, new m4(this, 0), this.resourcesProvider);
        this.u0 = j71Var;
        j71Var.r = false;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(this.X ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }
}
