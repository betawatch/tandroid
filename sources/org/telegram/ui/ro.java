package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class ro extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.w40, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.User A0;
    public EditTextBoldCursor B;
    public TLRPC.UserFull B0;
    public LinearLayout C;
    public boolean C0;
    public org.telegram.ui.Cells.y6 D;
    public boolean D0;
    public org.telegram.ui.Cells.n8 E;
    public boolean E0;
    public org.telegram.ui.Cells.n8 F;
    public boolean F0;
    public org.telegram.ui.Cells.n8 G;
    public boolean G0;
    public org.telegram.ui.Cells.n8 H;
    public TLRPC.ChatReactions H0;
    public so0 I;
    public TL_stories.TL_premium_boostsStatus I0;
    public org.telegram.ui.Cells.n8 J;
    public boolean J0;
    public org.telegram.ui.Cells.n8 K;
    public boolean K0;
    public org.telegram.ui.Cells.n8 L;
    public boolean L0;
    public org.telegram.ui.Cells.z8 M;
    public final ArrayList M0;
    public org.telegram.ui.Cells.n8 N;
    public final po N0;
    public LinearLayout O;
    public org.telegram.ui.Components.gj0 O0;
    public LinearLayout P;
    public ValueAnimator P0;
    public org.telegram.ui.Cells.n8 Q;
    public org.telegram.ui.Cells.n8 R;
    public org.telegram.ui.Cells.n8 S;
    public org.telegram.ui.Cells.n8 T;
    public org.telegram.ui.Cells.n8 U;
    public org.telegram.ui.Cells.n8 V;
    public org.telegram.ui.Cells.n8 W;
    public org.telegram.ui.Cells.n8 X;
    public qo Y;
    public FrameLayout Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.z9 a0;
    public org.telegram.ui.ActionBar.d2 b;
    public org.telegram.ui.Cells.y6 b0;
    public UndoView c;
    public org.telegram.ui.Cells.n8 c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.n8 d0;
    public nh.y3 e;
    public th.a e0;
    public eg.i0 f;
    public org.telegram.ui.Cells.z8 f0;
    public org.telegram.ui.Cells.n8 g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.z8 h0;
    public org.telegram.ui.Cells.n8 i0;
    public org.telegram.ui.Cells.n8 j0;
    public org.telegram.ui.Cells.n8 k0;
    public org.telegram.ui.Cells.n8 l0;
    public org.telegram.ui.Cells.n8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.n8 n0;
    public org.telegram.ui.Cells.n8 o0;
    public org.telegram.ui.Cells.z8 p0;
    public org.telegram.ui.Cells.z8 q0;
    public final org.telegram.ui.Components.z8 r;
    public org.telegram.ui.Cells.n8 r0;
    public final org.telegram.ui.Components.x40 s;
    public TLRPC.FileLocation s0;
    public long t0;
    public TLRPC.Chat u0;
    public org.telegram.ui.Components.cu v;
    public TLRPC.ChatFull v0;
    public dg.u3 w;
    public TLRPC.TL_chatAdminRights w0;
    public org.telegram.ui.Components.do0 x;
    public TLRPC.TL_chatBannedRights x0;
    public LinearLayout y;
    public TLRPC.TL_chatBannedRights y0;
    public final long z0;

    public ro(Bundle bundle) {
        super(bundle);
        this.M0 = new ArrayList();
        this.N0 = new po(this);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.t0 = bundle.getLong("chat_id", 0L);
        this.z0 = bundle.getLong("user_id", 0L);
        if (this.t0 == 0) {
            this.s = new org.telegram.ui.Components.x40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.t0));
            this.s = new org.telegram.ui.Components.x40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(ro roVar, FrameLayout frameLayout, View view) {
        if (!roVar.D0) {
            TLRPC.ChatFull chatFull = roVar.v0;
            org.telegram.ui.Components.qc.a0(roVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", roVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -roVar.t0;
        jz jzVar = new jz(null);
        jzVar.a = j10;
        jzVar.setResourceProvider(roVar.resourceProvider);
        boolean z4 = roVar.C0;
        boolean z10 = roVar.E0;
        dh.v vVar = new dh.v(13, roVar, view);
        jzVar.c = z4;
        jzVar.d = z10;
        jzVar.f = vVar;
        roVar.presentFragment(jzVar);
    }

    public static /* synthetic */ void V(ro roVar) {
        roVar.s0 = null;
        long j10 = roVar.z0;
        if (j10 == 0) {
            MessagesController.getInstance(roVar.currentAccount).changeChatAvatar(roVar.t0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = roVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            roVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new jo(roVar, 2));
        }
        roVar.n0(false, true);
        nh.y3 y3Var = roVar.e;
        org.telegram.ui.Components.z8 z8Var = roVar.r;
        Object obj = roVar.A0;
        if (obj == null) {
            obj = roVar.u0;
        }
        y3Var.h(null, null, z8Var, obj);
        roVar.O0.K(0);
        roVar.Y.e.d();
    }

    public static void X(ro roVar) {
        int i10 = roVar.currentAccount;
        long j10 = roVar.z0;
        TL_bots.botVerifierSettings botverifiersettings = roVar.B0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e = org.telegram.messenger.y3.e(16, "onlySelect", "dialogsType", true);
        e.putBoolean("resetDelegate", false);
        qy qyVar = new qy(e);
        qyVar.setCurrentAccount(i10);
        qyVar.z2 = new org.telegram.ui.Components.s1(qyVar, i10, j10, botverifiersettings);
        U.presentFragment(qyVar);
    }

    public static void Y(ro roVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        d2Var.dismiss();
        if (roVar.getParentActivity() == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(35, roVar.currentAccount, roVar.getParentActivity(), roVar, roVar.getResourceProvider());
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.N0 = new hc(25, roVar, chat);
        }
        roVar.showDialog(v0Var);
    }

    public static void Z(ro roVar) {
        dd ddVar = new dd(-roVar.u0.id);
        ddVar.i0 = roVar;
        roVar.presentFragment(ddVar);
        MessagesController.getInstance(roVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(roVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(ro roVar) {
        roVar.L0 = true;
        NotificationCenter.getInstance(roVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        a10 a10Var = new a10(10);
        a10Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        a10Var.f = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false);
        spannableStringBuilder.setSpan(a10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String g0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.w40
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.w40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ed(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0979  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        final ro roVar;
        dg.u3 u3Var;
        Context context2;
        final int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        boolean z4;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final ro roVar2;
        float f10;
        boolean z10;
        String format;
        int i14;
        org.telegram.ui.Cells.n8 n8Var;
        org.telegram.ui.Cells.n8 n8Var2;
        int i15;
        int i16;
        org.telegram.ui.Cells.n8 n8Var3;
        org.telegram.ui.Cells.n8 n8Var4;
        org.telegram.ui.Cells.n8 n8Var5;
        org.telegram.ui.Cells.n8 n8Var6;
        TLRPC.ChatFull chatFull;
        boolean z11;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i17 = 1;
        org.telegram.ui.Components.cu cuVar = this.v;
        if (cuVar != null) {
            cuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 17));
        ld ldVar = new ld(i17, context, this);
        ldVar.setOnTouchListener(new oh.d(9));
        this.fragmentView = ldVar;
        ldVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.a7));
        dg.u3 u3Var2 = new dg.u3(context);
        this.w = u3Var2;
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(context, this.w, this.resourceProvider, false);
        this.x = do0Var;
        do0Var.setFillViewport(true);
        ldVar.addView(this.x, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(u3Var2, new FrameLayout.LayoutParams(-1, -2));
        u3Var2.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.d6));
        u3Var2.addView(this.d, k7.b6.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, k7.b6.n(-1, -2));
        nh.y3 y3Var = new nh.y3(this, context, 5);
        this.e = y3Var;
        y3Var.setRoundRadius(this.C0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i18 = 4;
        if (this.A0 != null || ChatObject.canChangeChatInfo(this.u0)) {
            nh.y3 y3Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(y3Var2, k7.b6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            eg.i0 i0Var = new eg.i0(this, context, paint, i18);
            this.f = i0Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(i0Var, k7.b6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, k7.b6.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j10 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                                        int i19 = chatPhoto2.dc_id;
                                        if (i19 != 0) {
                                            chatPhoto2.photo_big.dc_id = i19;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j11 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var7 = roVar14.E;
                            boolean z15 = n8Var7 != null && n8Var7.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j11;
                            fpVar.k0 = z15;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z16 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat2 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat2;
                            if (ChatObject.isChannel(chat2) && !spVar.f.megagroup) {
                                z16 = true;
                            }
                            spVar.s = z16;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
        } else {
            nh.y3 y3Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(y3Var3, k7.b6.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.cu cuVar2 = new org.telegram.ui.Components.cu(context, ldVar, this);
        this.v = cuVar2;
        long j10 = this.z0;
        if (j10 != 0) {
            cuVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.F0) {
            cuVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            cuVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.cu cuVar3 = this.v;
        TLRPC.Chat chat = this.u0;
        cuVar3.setEnabled(chat != null || ChatObject.canChangeChatInfo(chat));
        org.telegram.ui.Components.cu cuVar4 = this.v;
        cuVar4.setFocusable(cuVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new p0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.cu cuVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(cuVar5, k7.b6.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        u3Var2.addView(this.y, k7.b6.n(-1, -2));
        final int i19 = 12;
        if (this.A0 != null || ChatObject.canChangeChatInfo(this.u0)) {
            qo qoVar = new qo(context);
            this.Y = qoVar;
            qoVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            this.Y.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat2 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat2.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j11 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var7 = roVar14.E;
                            boolean z152 = n8Var7 != null && n8Var7.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j11;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat22 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat22;
                            if (ChatObject.isChannel(chat22) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.Y, k7.b6.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.B = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.B.setHintTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.B;
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.u0(i20));
        this.B.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.B.setBackgroundDrawable(null);
        this.B.setGravity(LocaleController.isRTL ? 5 : 3);
        this.B.setInputType(180225);
        this.B.setImeOptions(6);
        this.B.setEnabled(this.A0 != null || ChatObject.canChangeChatInfo(this.u0));
        EditTextBoldCursor editTextBoldCursor3 = this.B;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.B.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.B.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.B.setCursorColor(org.telegram.ui.ActionBar.j6.u0(i20));
        this.B.setCursorSize(AndroidUtilities.dp(20.0f));
        this.B.setCursorWidth(1.5f);
        if (this.B.isEnabled()) {
            this.y.addView(this.B, k7.b6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.B, k7.b6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.B.setOnEditorActionListener(new ja(this, 2));
        this.B.addTextChangedListener(new od(1));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context);
        this.D = y6Var;
        u3Var2.addView(y6Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.C = linearLayout3;
        linearLayout3.setOrientation(1);
        u3Var2.addView(this.C, k7.b6.n(-1, -2));
        TLRPC.Chat chat2 = this.u0;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.v0) == null || chatFull3.can_set_location)) {
                org.telegram.ui.Cells.n8 n8Var7 = new org.telegram.ui.Cells.n8(context);
                this.E = n8Var7;
                n8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.C.addView(this.E, k7.b6.n(-1, -2));
                final int i21 = 15;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ ro b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                ro roVar3 = this.b;
                                roVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", roVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rr rrVar = new rr(bundle);
                                rrVar.x0(roVar3.v0);
                                roVar3.presentFragment(rrVar);
                                break;
                            case 1:
                                ro roVar4 = this.b;
                                po poVar = roVar4.N0;
                                long j102 = roVar4.z0;
                                if (!roVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = roVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ro roVar5 = this.b;
                                roVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", roVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rr rrVar2 = new rr(bundle2);
                                rrVar2.x0(roVar5.v0);
                                roVar5.presentFragment(rrVar2);
                                break;
                            case 3:
                                ro roVar6 = this.b;
                                roVar6.presentFragment(new sh0(roVar6.t0));
                                break;
                            case 4:
                                ro roVar7 = this.b;
                                roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                break;
                            case 5:
                                ro roVar8 = this.b;
                                roVar8.getClass();
                                roVar8.presentFragment(new ub(roVar8.u0));
                                break;
                            case 6:
                                ro roVar9 = this.b;
                                roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                break;
                            case 7:
                                ro roVar10 = this.b;
                                roVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", roVar10.z0);
                                roVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                ro roVar11 = this.b;
                                roVar11.presentFragment(new rh.j(roVar11.z0));
                                break;
                            case 9:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ro.X(this.b);
                                break;
                            case 14:
                                ro roVar12 = this.b;
                                org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                break;
                            case 15:
                                ro roVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                    cd0 cd0Var = new cd0(4);
                                    cd0Var.b0 = -roVar13.t0;
                                    TLRPC.ChatFull chatFull5 = roVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    cd0Var.C0 = new ko(roVar13, 6);
                                    roVar13.presentFragment(cd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ro roVar14 = this.b;
                                long j11 = roVar14.t0;
                                org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                fp fpVar = new fp(null);
                                fpVar.J = new ArrayList();
                                fpVar.K = new ArrayList();
                                fpVar.M = new ArrayList();
                                fpVar.Z = true;
                                fpVar.c0 = new ArrayList();
                                fpVar.l0 = new HashMap();
                                fpVar.n0 = new uo(fpVar, 5);
                                fpVar.q0 = false;
                                fpVar.W = j11;
                                fpVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = roVar14.v0;
                                fpVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        fpVar.i0 = tL_chatInviteExported;
                                    } else {
                                        fpVar.X(false);
                                    }
                                }
                                roVar14.presentFragment(fpVar);
                                break;
                            case 17:
                                ro roVar15 = this.b;
                                long j12 = roVar15.t0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.L = false;
                                spVar.M = false;
                                spVar.B = j12;
                                TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                spVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = roVar15.v0;
                                roVar15.presentFragment(spVar);
                                break;
                            case 18:
                                ro roVar16 = this.b;
                                fw0 fw0Var = new fw0(roVar16.t0);
                                fw0Var.v = new ko(roVar16, 4);
                                roVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                ro.Z(this.b);
                                break;
                            case 20:
                                ro roVar17 = this.b;
                                o60 o60Var = new o60(-roVar17.u0.id);
                                o60Var.c = roVar17.I0;
                                o60Var.i0 = roVar17;
                                roVar17.presentFragment(o60Var);
                                break;
                            case 21:
                                ro roVar18 = this.b;
                                roVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", roVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                rr rrVar3 = new rr(bundle4);
                                rrVar3.x0(roVar18.v0);
                                roVar18.presentFragment(rrVar3);
                                break;
                            case 22:
                                ro roVar19 = this.b;
                                rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = roVar19.v0;
                                rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                roVar19.presentFragment(rh0Var);
                                break;
                            case 23:
                                ro roVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                    roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", roVar20.t0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = roVar20.v0;
                                    zpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    roVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                ro roVar21 = this.b;
                                roVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", roVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                roVar21.presentFragment(new zn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.u0.creator && ((chatFull2 = this.v0) == null || chatFull2.can_set_username)) {
                org.telegram.ui.Cells.n8 n8Var8 = new org.telegram.ui.Cells.n8(context);
                this.F = n8Var8;
                n8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.C.addView(this.F, k7.b6.n(-1, -2));
                final int i22 = 16;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ ro b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                ro roVar3 = this.b;
                                roVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", roVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rr rrVar = new rr(bundle);
                                rrVar.x0(roVar3.v0);
                                roVar3.presentFragment(rrVar);
                                break;
                            case 1:
                                ro roVar4 = this.b;
                                po poVar = roVar4.N0;
                                long j102 = roVar4.z0;
                                if (!roVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = roVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ro roVar5 = this.b;
                                roVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", roVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rr rrVar2 = new rr(bundle2);
                                rrVar2.x0(roVar5.v0);
                                roVar5.presentFragment(rrVar2);
                                break;
                            case 3:
                                ro roVar6 = this.b;
                                roVar6.presentFragment(new sh0(roVar6.t0));
                                break;
                            case 4:
                                ro roVar7 = this.b;
                                roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                break;
                            case 5:
                                ro roVar8 = this.b;
                                roVar8.getClass();
                                roVar8.presentFragment(new ub(roVar8.u0));
                                break;
                            case 6:
                                ro roVar9 = this.b;
                                roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                break;
                            case 7:
                                ro roVar10 = this.b;
                                roVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", roVar10.z0);
                                roVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                ro roVar11 = this.b;
                                roVar11.presentFragment(new rh.j(roVar11.z0));
                                break;
                            case 9:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ro.X(this.b);
                                break;
                            case 14:
                                ro roVar12 = this.b;
                                org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                break;
                            case 15:
                                ro roVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                    cd0 cd0Var = new cd0(4);
                                    cd0Var.b0 = -roVar13.t0;
                                    TLRPC.ChatFull chatFull5 = roVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    cd0Var.C0 = new ko(roVar13, 6);
                                    roVar13.presentFragment(cd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ro roVar14 = this.b;
                                long j11 = roVar14.t0;
                                org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                fp fpVar = new fp(null);
                                fpVar.J = new ArrayList();
                                fpVar.K = new ArrayList();
                                fpVar.M = new ArrayList();
                                fpVar.Z = true;
                                fpVar.c0 = new ArrayList();
                                fpVar.l0 = new HashMap();
                                fpVar.n0 = new uo(fpVar, 5);
                                fpVar.q0 = false;
                                fpVar.W = j11;
                                fpVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = roVar14.v0;
                                fpVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        fpVar.i0 = tL_chatInviteExported;
                                    } else {
                                        fpVar.X(false);
                                    }
                                }
                                roVar14.presentFragment(fpVar);
                                break;
                            case 17:
                                ro roVar15 = this.b;
                                long j12 = roVar15.t0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.L = false;
                                spVar.M = false;
                                spVar.B = j12;
                                TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                spVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = roVar15.v0;
                                roVar15.presentFragment(spVar);
                                break;
                            case 18:
                                ro roVar16 = this.b;
                                fw0 fw0Var = new fw0(roVar16.t0);
                                fw0Var.v = new ko(roVar16, 4);
                                roVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                ro.Z(this.b);
                                break;
                            case 20:
                                ro roVar17 = this.b;
                                o60 o60Var = new o60(-roVar17.u0.id);
                                o60Var.c = roVar17.I0;
                                o60Var.i0 = roVar17;
                                roVar17.presentFragment(o60Var);
                                break;
                            case 21:
                                ro roVar18 = this.b;
                                roVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", roVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                rr rrVar3 = new rr(bundle4);
                                rrVar3.x0(roVar18.v0);
                                roVar18.presentFragment(rrVar3);
                                break;
                            case 22:
                                ro roVar19 = this.b;
                                rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = roVar19.v0;
                                rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                roVar19.presentFragment(rh0Var);
                                break;
                            case 23:
                                ro roVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                    roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", roVar20.t0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = roVar20.v0;
                                    zpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    roVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                ro roVar21 = this.b;
                                roVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", roVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                roVar21.presentFragment(new zn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.u0) && ((this.F0 && ChatObject.canUserDoAdminAction(this.u0, 1)) || (!this.F0 && ChatObject.canUserDoAdminAction(this.u0, 0)))) {
                org.telegram.ui.Cells.n8 n8Var9 = new org.telegram.ui.Cells.n8(context);
                this.G = n8Var9;
                n8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.C.addView(this.G, k7.b6.n(-1, -2));
                final int i23 = 17;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ ro b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                ro roVar3 = this.b;
                                roVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", roVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rr rrVar = new rr(bundle);
                                rrVar.x0(roVar3.v0);
                                roVar3.presentFragment(rrVar);
                                break;
                            case 1:
                                ro roVar4 = this.b;
                                po poVar = roVar4.N0;
                                long j102 = roVar4.z0;
                                if (!roVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = roVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ro roVar5 = this.b;
                                roVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", roVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rr rrVar2 = new rr(bundle2);
                                rrVar2.x0(roVar5.v0);
                                roVar5.presentFragment(rrVar2);
                                break;
                            case 3:
                                ro roVar6 = this.b;
                                roVar6.presentFragment(new sh0(roVar6.t0));
                                break;
                            case 4:
                                ro roVar7 = this.b;
                                roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                break;
                            case 5:
                                ro roVar8 = this.b;
                                roVar8.getClass();
                                roVar8.presentFragment(new ub(roVar8.u0));
                                break;
                            case 6:
                                ro roVar9 = this.b;
                                roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                break;
                            case 7:
                                ro roVar10 = this.b;
                                roVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", roVar10.z0);
                                roVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                ro roVar11 = this.b;
                                roVar11.presentFragment(new rh.j(roVar11.z0));
                                break;
                            case 9:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ro.X(this.b);
                                break;
                            case 14:
                                ro roVar12 = this.b;
                                org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                break;
                            case 15:
                                ro roVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                    cd0 cd0Var = new cd0(4);
                                    cd0Var.b0 = -roVar13.t0;
                                    TLRPC.ChatFull chatFull5 = roVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    cd0Var.C0 = new ko(roVar13, 6);
                                    roVar13.presentFragment(cd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ro roVar14 = this.b;
                                long j11 = roVar14.t0;
                                org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                fp fpVar = new fp(null);
                                fpVar.J = new ArrayList();
                                fpVar.K = new ArrayList();
                                fpVar.M = new ArrayList();
                                fpVar.Z = true;
                                fpVar.c0 = new ArrayList();
                                fpVar.l0 = new HashMap();
                                fpVar.n0 = new uo(fpVar, 5);
                                fpVar.q0 = false;
                                fpVar.W = j11;
                                fpVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = roVar14.v0;
                                fpVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        fpVar.i0 = tL_chatInviteExported;
                                    } else {
                                        fpVar.X(false);
                                    }
                                }
                                roVar14.presentFragment(fpVar);
                                break;
                            case 17:
                                ro roVar15 = this.b;
                                long j12 = roVar15.t0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.L = false;
                                spVar.M = false;
                                spVar.B = j12;
                                TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                spVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = roVar15.v0;
                                roVar15.presentFragment(spVar);
                                break;
                            case 18:
                                ro roVar16 = this.b;
                                fw0 fw0Var = new fw0(roVar16.t0);
                                fw0Var.v = new ko(roVar16, 4);
                                roVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                ro.Z(this.b);
                                break;
                            case 20:
                                ro roVar17 = this.b;
                                o60 o60Var = new o60(-roVar17.u0.id);
                                o60Var.c = roVar17.I0;
                                o60Var.i0 = roVar17;
                                roVar17.presentFragment(o60Var);
                                break;
                            case 21:
                                ro roVar18 = this.b;
                                roVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", roVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                rr rrVar3 = new rr(bundle4);
                                rrVar3.x0(roVar18.v0);
                                roVar18.presentFragment(rrVar3);
                                break;
                            case 22:
                                ro roVar19 = this.b;
                                rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = roVar19.v0;
                                rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                roVar19.presentFragment(rh0Var);
                                break;
                            case 23:
                                ro roVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                    roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", roVar20.t0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = roVar20.v0;
                                    zpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    roVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                ro roVar21 = this.b;
                                roVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", roVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                roVar21.presentFragment(new zn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.u0) && this.F0 && ChatObject.canUserDoAdminAction(this.u0, 1)) {
                org.telegram.ui.Cells.n8 n8Var10 = new org.telegram.ui.Cells.n8(context);
                this.H = n8Var10;
                n8Var10.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.H.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.C.addView(this.H, k7.b6.n(-1, -2));
                final int i24 = 18;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ ro b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                ro roVar3 = this.b;
                                roVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", roVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rr rrVar = new rr(bundle);
                                rrVar.x0(roVar3.v0);
                                roVar3.presentFragment(rrVar);
                                break;
                            case 1:
                                ro roVar4 = this.b;
                                po poVar = roVar4.N0;
                                long j102 = roVar4.z0;
                                if (!roVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = roVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ro roVar5 = this.b;
                                roVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", roVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rr rrVar2 = new rr(bundle2);
                                rrVar2.x0(roVar5.v0);
                                roVar5.presentFragment(rrVar2);
                                break;
                            case 3:
                                ro roVar6 = this.b;
                                roVar6.presentFragment(new sh0(roVar6.t0));
                                break;
                            case 4:
                                ro roVar7 = this.b;
                                roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                break;
                            case 5:
                                ro roVar8 = this.b;
                                roVar8.getClass();
                                roVar8.presentFragment(new ub(roVar8.u0));
                                break;
                            case 6:
                                ro roVar9 = this.b;
                                roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                break;
                            case 7:
                                ro roVar10 = this.b;
                                roVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", roVar10.z0);
                                roVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                ro roVar11 = this.b;
                                roVar11.presentFragment(new rh.j(roVar11.z0));
                                break;
                            case 9:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ro.X(this.b);
                                break;
                            case 14:
                                ro roVar12 = this.b;
                                org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                break;
                            case 15:
                                ro roVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                    cd0 cd0Var = new cd0(4);
                                    cd0Var.b0 = -roVar13.t0;
                                    TLRPC.ChatFull chatFull5 = roVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    cd0Var.C0 = new ko(roVar13, 6);
                                    roVar13.presentFragment(cd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ro roVar14 = this.b;
                                long j11 = roVar14.t0;
                                org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                fp fpVar = new fp(null);
                                fpVar.J = new ArrayList();
                                fpVar.K = new ArrayList();
                                fpVar.M = new ArrayList();
                                fpVar.Z = true;
                                fpVar.c0 = new ArrayList();
                                fpVar.l0 = new HashMap();
                                fpVar.n0 = new uo(fpVar, 5);
                                fpVar.q0 = false;
                                fpVar.W = j11;
                                fpVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = roVar14.v0;
                                fpVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        fpVar.i0 = tL_chatInviteExported;
                                    } else {
                                        fpVar.X(false);
                                    }
                                }
                                roVar14.presentFragment(fpVar);
                                break;
                            case 17:
                                ro roVar15 = this.b;
                                long j12 = roVar15.t0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.L = false;
                                spVar.M = false;
                                spVar.B = j12;
                                TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                spVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = roVar15.v0;
                                roVar15.presentFragment(spVar);
                                break;
                            case 18:
                                ro roVar16 = this.b;
                                fw0 fw0Var = new fw0(roVar16.t0);
                                fw0Var.v = new ko(roVar16, 4);
                                roVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                ro.Z(this.b);
                                break;
                            case 20:
                                ro roVar17 = this.b;
                                o60 o60Var = new o60(-roVar17.u0.id);
                                o60Var.c = roVar17.I0;
                                o60Var.i0 = roVar17;
                                roVar17.presentFragment(o60Var);
                                break;
                            case 21:
                                ro roVar18 = this.b;
                                roVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", roVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                rr rrVar3 = new rr(bundle4);
                                rrVar3.x0(roVar18.v0);
                                roVar18.presentFragment(rrVar3);
                                break;
                            case 22:
                                ro roVar19 = this.b;
                                rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = roVar19.v0;
                                rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                roVar19.presentFragment(rh0Var);
                                break;
                            case 23:
                                ro roVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                    roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", roVar20.t0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = roVar20.v0;
                                    zpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    roVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                ro roVar21 = this.b;
                                roVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", roVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                roVar21.presentFragment(new zn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.u0) && ChatObject.canChangeChatInfo(this.u0)) {
                z11 = true;
                u3Var = u3Var2;
                so0 so0Var = new so0(this.currentAccount, -this.u0.id, context, getResourceProvider());
                this.I = so0Var;
                so0Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.C.addView(this.I, k7.b6.n(-1, -2));
                final int i25 = 19;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ ro b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                ro roVar3 = this.b;
                                roVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", roVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rr rrVar = new rr(bundle);
                                rrVar.x0(roVar3.v0);
                                roVar3.presentFragment(rrVar);
                                break;
                            case 1:
                                ro roVar4 = this.b;
                                po poVar = roVar4.N0;
                                long j102 = roVar4.z0;
                                if (!roVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = roVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ro roVar5 = this.b;
                                roVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", roVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rr rrVar2 = new rr(bundle2);
                                rrVar2.x0(roVar5.v0);
                                roVar5.presentFragment(rrVar2);
                                break;
                            case 3:
                                ro roVar6 = this.b;
                                roVar6.presentFragment(new sh0(roVar6.t0));
                                break;
                            case 4:
                                ro roVar7 = this.b;
                                roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                break;
                            case 5:
                                ro roVar8 = this.b;
                                roVar8.getClass();
                                roVar8.presentFragment(new ub(roVar8.u0));
                                break;
                            case 6:
                                ro roVar9 = this.b;
                                roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                break;
                            case 7:
                                ro roVar10 = this.b;
                                roVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", roVar10.z0);
                                roVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                ro roVar11 = this.b;
                                roVar11.presentFragment(new rh.j(roVar11.z0));
                                break;
                            case 9:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ro.X(this.b);
                                break;
                            case 14:
                                ro roVar12 = this.b;
                                org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                break;
                            case 15:
                                ro roVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                    cd0 cd0Var = new cd0(4);
                                    cd0Var.b0 = -roVar13.t0;
                                    TLRPC.ChatFull chatFull5 = roVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    cd0Var.C0 = new ko(roVar13, 6);
                                    roVar13.presentFragment(cd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ro roVar14 = this.b;
                                long j11 = roVar14.t0;
                                org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                fp fpVar = new fp(null);
                                fpVar.J = new ArrayList();
                                fpVar.K = new ArrayList();
                                fpVar.M = new ArrayList();
                                fpVar.Z = true;
                                fpVar.c0 = new ArrayList();
                                fpVar.l0 = new HashMap();
                                fpVar.n0 = new uo(fpVar, 5);
                                fpVar.q0 = false;
                                fpVar.W = j11;
                                fpVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = roVar14.v0;
                                fpVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        fpVar.i0 = tL_chatInviteExported;
                                    } else {
                                        fpVar.X(false);
                                    }
                                }
                                roVar14.presentFragment(fpVar);
                                break;
                            case 17:
                                ro roVar15 = this.b;
                                long j12 = roVar15.t0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.L = false;
                                spVar.M = false;
                                spVar.B = j12;
                                TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                spVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = roVar15.v0;
                                roVar15.presentFragment(spVar);
                                break;
                            case 18:
                                ro roVar16 = this.b;
                                fw0 fw0Var = new fw0(roVar16.t0);
                                fw0Var.v = new ko(roVar16, 4);
                                roVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                ro.Z(this.b);
                                break;
                            case 20:
                                ro roVar17 = this.b;
                                o60 o60Var = new o60(-roVar17.u0.id);
                                o60Var.c = roVar17.I0;
                                o60Var.i0 = roVar17;
                                roVar17.presentFragment(o60Var);
                                break;
                            case 21:
                                ro roVar18 = this.b;
                                roVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", roVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                rr rrVar3 = new rr(bundle4);
                                rrVar3.x0(roVar18.v0);
                                roVar18.presentFragment(rrVar3);
                                break;
                            case 22:
                                ro roVar19 = this.b;
                                rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = roVar19.v0;
                                rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                roVar19.presentFragment(rh0Var);
                                break;
                            case 23:
                                ro roVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                    roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", roVar20.t0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = roVar20.v0;
                                    zpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    roVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                ro roVar21 = this.b;
                                roVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", roVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                roVar21.presentFragment(new zn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                u3Var = u3Var2;
                z11 = true;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.u0) || ChatObject.isCommunity(this.u0)) {
                context3 = context;
                frameLayout = frameLayout2;
                roVar = this;
            } else {
                long j11 = -this.u0.id;
                org.telegram.ui.Cells.n8 n8Var11 = new org.telegram.ui.Cells.n8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.J = n8Var11;
                n8Var11.setBackground(org.telegram.ui.ActionBar.j6.K0(z11));
                this.J.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.u0.autotranslation);
                final int i26 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j11, new h5.d(this) { // from class: org.telegram.ui.io
                    public final /* synthetic */ ro b;

                    {
                        this.b = this;
                    }

                    @Override // h5.d
                    public final void accept(Object obj) {
                        switch (i26) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ro roVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    roVar3.getClass();
                                    break;
                                } else {
                                    roVar3.J.getCheckBox().setIcon(tL_premium_boostsStatus.level < roVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.I0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.C.addView(this.J, k7.b6.n(-1, -2));
                frameLayout = frameLayout2;
                roVar = this;
                this.J.setOnClickListener(new lh.r2(this, new boolean[]{false}, j11, 1));
            }
            final int i27 = 20;
            if (!roVar.F0 && ChatObject.canBlockUsers(roVar.u0) && (ChatObject.isChannel(roVar.u0) || roVar.u0.creator)) {
                org.telegram.ui.Cells.n8 n8Var12 = new org.telegram.ui.Cells.n8(context3);
                roVar.K = n8Var12;
                n8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                roVar.C.addView(roVar.K, k7.b6.n(-1, -2));
                roVar.K.setOnClickListener(new org.telegram.messenger.video.g(i27, roVar, context3));
            }
            if (ChatObject.isMegagroup(roVar.u0) && ChatObject.hasAdminRights(roVar.u0) && !ChatObject.isCommunity(roVar.u0)) {
                final int i28 = 1;
                MessagesController.getInstance(roVar.currentAccount).getBoostsController().getBoostsStats(-roVar.u0.id, new h5.d(roVar) { // from class: org.telegram.ui.io
                    public final /* synthetic */ ro b;

                    {
                        this.b = roVar;
                    }

                    @Override // h5.d
                    public final void accept(Object obj) {
                        switch (i28) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ro roVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    roVar3.getClass();
                                    break;
                                } else {
                                    roVar3.J.getCheckBox().setIcon(tL_premium_boostsStatus.level < roVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.I0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                so0 so0Var2 = new so0(roVar.currentAccount, -roVar.u0.id, context3, roVar.getResourceProvider());
                roVar.I = so0Var2;
                so0Var2.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                roVar.C.addView(roVar.I, k7.b6.n(-1, -2));
                roVar.I.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ ro b;

                    {
                        this.b = roVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                ro roVar3 = this.b;
                                roVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", roVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rr rrVar = new rr(bundle);
                                rrVar.x0(roVar3.v0);
                                roVar3.presentFragment(rrVar);
                                break;
                            case 1:
                                ro roVar4 = this.b;
                                po poVar = roVar4.N0;
                                long j102 = roVar4.z0;
                                if (!roVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = roVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, roVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ro roVar5 = this.b;
                                roVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", roVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rr rrVar2 = new rr(bundle2);
                                rrVar2.x0(roVar5.v0);
                                roVar5.presentFragment(rrVar2);
                                break;
                            case 3:
                                ro roVar6 = this.b;
                                roVar6.presentFragment(new sh0(roVar6.t0));
                                break;
                            case 4:
                                ro roVar7 = this.b;
                                roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                break;
                            case 5:
                                ro roVar8 = this.b;
                                roVar8.getClass();
                                roVar8.presentFragment(new ub(roVar8.u0));
                                break;
                            case 6:
                                ro roVar9 = this.b;
                                roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                break;
                            case 7:
                                ro roVar10 = this.b;
                                roVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", roVar10.z0);
                                roVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                ro roVar11 = this.b;
                                roVar11.presentFragment(new rh.j(roVar11.z0));
                                break;
                            case 9:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ro.X(this.b);
                                break;
                            case 14:
                                ro roVar12 = this.b;
                                org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                break;
                            case 15:
                                ro roVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                    cd0 cd0Var = new cd0(4);
                                    cd0Var.b0 = -roVar13.t0;
                                    TLRPC.ChatFull chatFull5 = roVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    cd0Var.C0 = new ko(roVar13, 6);
                                    roVar13.presentFragment(cd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ro roVar14 = this.b;
                                long j112 = roVar14.t0;
                                org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                fp fpVar = new fp(null);
                                fpVar.J = new ArrayList();
                                fpVar.K = new ArrayList();
                                fpVar.M = new ArrayList();
                                fpVar.Z = true;
                                fpVar.c0 = new ArrayList();
                                fpVar.l0 = new HashMap();
                                fpVar.n0 = new uo(fpVar, 5);
                                fpVar.q0 = false;
                                fpVar.W = j112;
                                fpVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = roVar14.v0;
                                fpVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        fpVar.i0 = tL_chatInviteExported;
                                    } else {
                                        fpVar.X(false);
                                    }
                                }
                                roVar14.presentFragment(fpVar);
                                break;
                            case 17:
                                ro roVar15 = this.b;
                                long j12 = roVar15.t0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.L = false;
                                spVar.M = false;
                                spVar.B = j12;
                                TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                spVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = roVar15.v0;
                                roVar15.presentFragment(spVar);
                                break;
                            case 18:
                                ro roVar16 = this.b;
                                fw0 fw0Var = new fw0(roVar16.t0);
                                fw0Var.v = new ko(roVar16, 4);
                                roVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                ro.Z(this.b);
                                break;
                            case 20:
                                ro roVar17 = this.b;
                                o60 o60Var = new o60(-roVar17.u0.id);
                                o60Var.c = roVar17.I0;
                                o60Var.i0 = roVar17;
                                roVar17.presentFragment(o60Var);
                                break;
                            case 21:
                                ro roVar18 = this.b;
                                roVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", roVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                rr rrVar3 = new rr(bundle4);
                                rrVar3.x0(roVar18.v0);
                                roVar18.presentFragment(rrVar3);
                                break;
                            case 22:
                                ro roVar19 = this.b;
                                rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = roVar19.v0;
                                rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                roVar19.presentFragment(rh0Var);
                                break;
                            case 23:
                                ro roVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                    roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", roVar20.t0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = roVar20.v0;
                                    zpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    roVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                ro roVar21 = this.b;
                                roVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", roVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                roVar21.presentFragment(new zn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!roVar.F0 && roVar.u0.creator) {
                org.telegram.ui.Cells.n8 n8Var13 = new org.telegram.ui.Cells.n8(23, context, null, false, true);
                context2 = context;
                roVar.N = n8Var13;
                n8Var13.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                roVar.N.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), roVar.C0);
                roVar.N.getCheckBox().setIcon(roVar.D0 ? 0 : R.drawable.permission_locked);
                roVar.C.addView(roVar.N, k7.b6.c(-2.0f, -1));
                i10 = 21;
                roVar.N.setOnClickListener(new org.telegram.messenger.video.g(i10, roVar, frameLayout));
            } else {
                context2 = context;
                i10 = 21;
            }
            roVar.o0();
        } else {
            roVar = this;
            u3Var = u3Var2;
            context2 = context;
            i10 = 21;
        }
        org.telegram.ui.ActionBar.z n10 = roVar.actionBar.n();
        if (roVar.A0 != null || ChatObject.canChangeChatInfo(roVar.u0) || roVar.K != null) {
            org.telegram.ui.ActionBar.w0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            roVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (roVar.E == null && roVar.K == null && roVar.F == null && roVar.G == null && roVar.N == null) {
            i12 = -1;
            i13 = -2;
            i11 = 12;
        } else {
            i11 = 12;
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context2, 12, roVar.resourceProvider);
            roVar.M = z8Var;
            if (roVar.N != null) {
                z8Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                z8Var.setFixedSize(12);
            }
            i12 = -1;
            i13 = -2;
            u3Var.addView(roVar.M, k7.b6.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        roVar.O = linearLayout4;
        linearLayout4.setOrientation(1);
        u3Var.addView(roVar.O, k7.b6.n(i12, i13));
        final int i29 = 8;
        if (roVar.u0 != null) {
            org.telegram.ui.Cells.n8 n8Var14 = new org.telegram.ui.Cells.n8(context2);
            roVar.U = n8Var14;
            n8Var14.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            org.telegram.ui.Cells.n8 n8Var15 = roVar.U;
            if (!ChatObject.isChannel(roVar.u0)) {
                TLRPC.Chat chat3 = roVar.u0;
                if (!chat3.creator && (!ChatObject.hasAdminRights(chat3) || !ChatObject.canChangeChatInfo(roVar.u0))) {
                    i14 = 8;
                    n8Var15.setVisibility(i14);
                    roVar.U.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                        public final /* synthetic */ ro b;

                        {
                            this.b = roVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    ro roVar3 = this.b;
                                    roVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", roVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rr rrVar = new rr(bundle);
                                    rrVar.x0(roVar3.v0);
                                    roVar3.presentFragment(rrVar);
                                    break;
                                case 1:
                                    ro roVar4 = this.b;
                                    po poVar = roVar4.N0;
                                    long j102 = roVar4.z0;
                                    if (!roVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ro roVar5 = this.b;
                                    roVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", roVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rr rrVar2 = new rr(bundle2);
                                    rrVar2.x0(roVar5.v0);
                                    roVar5.presentFragment(rrVar2);
                                    break;
                                case 3:
                                    ro roVar6 = this.b;
                                    roVar6.presentFragment(new sh0(roVar6.t0));
                                    break;
                                case 4:
                                    ro roVar7 = this.b;
                                    roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                    break;
                                case 5:
                                    ro roVar8 = this.b;
                                    roVar8.getClass();
                                    roVar8.presentFragment(new ub(roVar8.u0));
                                    break;
                                case 6:
                                    ro roVar9 = this.b;
                                    roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                    break;
                                case 7:
                                    ro roVar10 = this.b;
                                    roVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", roVar10.z0);
                                    roVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    ro roVar11 = this.b;
                                    roVar11.presentFragment(new rh.j(roVar11.z0));
                                    break;
                                case 9:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ro.X(this.b);
                                    break;
                                case 14:
                                    ro roVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                    break;
                                case 15:
                                    ro roVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                        cd0 cd0Var = new cd0(4);
                                        cd0Var.b0 = -roVar13.t0;
                                        TLRPC.ChatFull chatFull5 = roVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        cd0Var.C0 = new ko(roVar13, 6);
                                        roVar13.presentFragment(cd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ro roVar14 = this.b;
                                    long j112 = roVar14.t0;
                                    org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                    boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                    fp fpVar = new fp(null);
                                    fpVar.J = new ArrayList();
                                    fpVar.K = new ArrayList();
                                    fpVar.M = new ArrayList();
                                    fpVar.Z = true;
                                    fpVar.c0 = new ArrayList();
                                    fpVar.l0 = new HashMap();
                                    fpVar.n0 = new uo(fpVar, 5);
                                    fpVar.q0 = false;
                                    fpVar.W = j112;
                                    fpVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = roVar14.v0;
                                    fpVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            fpVar.i0 = tL_chatInviteExported;
                                        } else {
                                            fpVar.X(false);
                                        }
                                    }
                                    roVar14.presentFragment(fpVar);
                                    break;
                                case 17:
                                    ro roVar15 = this.b;
                                    long j12 = roVar15.t0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.L = false;
                                    spVar.M = false;
                                    spVar.B = j12;
                                    TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                    spVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = roVar15.v0;
                                    roVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    ro roVar16 = this.b;
                                    fw0 fw0Var = new fw0(roVar16.t0);
                                    fw0Var.v = new ko(roVar16, 4);
                                    roVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    ro.Z(this.b);
                                    break;
                                case 20:
                                    ro roVar17 = this.b;
                                    o60 o60Var = new o60(-roVar17.u0.id);
                                    o60Var.c = roVar17.I0;
                                    o60Var.i0 = roVar17;
                                    roVar17.presentFragment(o60Var);
                                    break;
                                case 21:
                                    ro roVar18 = this.b;
                                    roVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", roVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                    rr rrVar3 = new rr(bundle4);
                                    rrVar3.x0(roVar18.v0);
                                    roVar18.presentFragment(rrVar3);
                                    break;
                                case 22:
                                    ro roVar19 = this.b;
                                    rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = roVar19.v0;
                                    rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    roVar19.presentFragment(rh0Var);
                                    break;
                                case 23:
                                    ro roVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                        roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", roVar20.t0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = roVar20.v0;
                                        zpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        roVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    ro roVar21 = this.b;
                                    roVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", roVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                    roVar21.presentFragment(new zn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.n8 n8Var16 = new org.telegram.ui.Cells.n8(context2);
                    roVar.S = n8Var16;
                    n8Var16.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i30 = 22;
                    roVar.S.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                        public final /* synthetic */ ro b;

                        {
                            this.b = roVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    ro roVar3 = this.b;
                                    roVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", roVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rr rrVar = new rr(bundle);
                                    rrVar.x0(roVar3.v0);
                                    roVar3.presentFragment(rrVar);
                                    break;
                                case 1:
                                    ro roVar4 = this.b;
                                    po poVar = roVar4.N0;
                                    long j102 = roVar4.z0;
                                    if (!roVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ro roVar5 = this.b;
                                    roVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", roVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rr rrVar2 = new rr(bundle2);
                                    rrVar2.x0(roVar5.v0);
                                    roVar5.presentFragment(rrVar2);
                                    break;
                                case 3:
                                    ro roVar6 = this.b;
                                    roVar6.presentFragment(new sh0(roVar6.t0));
                                    break;
                                case 4:
                                    ro roVar7 = this.b;
                                    roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                    break;
                                case 5:
                                    ro roVar8 = this.b;
                                    roVar8.getClass();
                                    roVar8.presentFragment(new ub(roVar8.u0));
                                    break;
                                case 6:
                                    ro roVar9 = this.b;
                                    roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                    break;
                                case 7:
                                    ro roVar10 = this.b;
                                    roVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", roVar10.z0);
                                    roVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    ro roVar11 = this.b;
                                    roVar11.presentFragment(new rh.j(roVar11.z0));
                                    break;
                                case 9:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ro.X(this.b);
                                    break;
                                case 14:
                                    ro roVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                    break;
                                case 15:
                                    ro roVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                        cd0 cd0Var = new cd0(4);
                                        cd0Var.b0 = -roVar13.t0;
                                        TLRPC.ChatFull chatFull5 = roVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        cd0Var.C0 = new ko(roVar13, 6);
                                        roVar13.presentFragment(cd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ro roVar14 = this.b;
                                    long j112 = roVar14.t0;
                                    org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                    boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                    fp fpVar = new fp(null);
                                    fpVar.J = new ArrayList();
                                    fpVar.K = new ArrayList();
                                    fpVar.M = new ArrayList();
                                    fpVar.Z = true;
                                    fpVar.c0 = new ArrayList();
                                    fpVar.l0 = new HashMap();
                                    fpVar.n0 = new uo(fpVar, 5);
                                    fpVar.q0 = false;
                                    fpVar.W = j112;
                                    fpVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = roVar14.v0;
                                    fpVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            fpVar.i0 = tL_chatInviteExported;
                                        } else {
                                            fpVar.X(false);
                                        }
                                    }
                                    roVar14.presentFragment(fpVar);
                                    break;
                                case 17:
                                    ro roVar15 = this.b;
                                    long j12 = roVar15.t0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.L = false;
                                    spVar.M = false;
                                    spVar.B = j12;
                                    TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                    spVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = roVar15.v0;
                                    roVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    ro roVar16 = this.b;
                                    fw0 fw0Var = new fw0(roVar16.t0);
                                    fw0Var.v = new ko(roVar16, 4);
                                    roVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    ro.Z(this.b);
                                    break;
                                case 20:
                                    ro roVar17 = this.b;
                                    o60 o60Var = new o60(-roVar17.u0.id);
                                    o60Var.c = roVar17.I0;
                                    o60Var.i0 = roVar17;
                                    roVar17.presentFragment(o60Var);
                                    break;
                                case 21:
                                    ro roVar18 = this.b;
                                    roVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", roVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                    rr rrVar3 = new rr(bundle4);
                                    rrVar3.x0(roVar18.v0);
                                    roVar18.presentFragment(rrVar3);
                                    break;
                                case 22:
                                    ro roVar19 = this.b;
                                    rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = roVar19.v0;
                                    rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    roVar19.presentFragment(rh0Var);
                                    break;
                                case 23:
                                    ro roVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                        roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", roVar20.t0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = roVar20.v0;
                                        zpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        roVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    ro roVar21 = this.b;
                                    roVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", roVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                    roVar21.presentFragment(new zn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.n8 n8Var17 = new org.telegram.ui.Cells.n8(context2);
                    roVar.L = n8Var17;
                    n8Var17.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i31 = 23;
                    roVar.L.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                        public final /* synthetic */ ro b;

                        {
                            this.b = roVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    ro roVar3 = this.b;
                                    roVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", roVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rr rrVar = new rr(bundle);
                                    rrVar.x0(roVar3.v0);
                                    roVar3.presentFragment(rrVar);
                                    break;
                                case 1:
                                    ro roVar4 = this.b;
                                    po poVar = roVar4.N0;
                                    long j102 = roVar4.z0;
                                    if (!roVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ro roVar5 = this.b;
                                    roVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", roVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rr rrVar2 = new rr(bundle2);
                                    rrVar2.x0(roVar5.v0);
                                    roVar5.presentFragment(rrVar2);
                                    break;
                                case 3:
                                    ro roVar6 = this.b;
                                    roVar6.presentFragment(new sh0(roVar6.t0));
                                    break;
                                case 4:
                                    ro roVar7 = this.b;
                                    roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                    break;
                                case 5:
                                    ro roVar8 = this.b;
                                    roVar8.getClass();
                                    roVar8.presentFragment(new ub(roVar8.u0));
                                    break;
                                case 6:
                                    ro roVar9 = this.b;
                                    roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                    break;
                                case 7:
                                    ro roVar10 = this.b;
                                    roVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", roVar10.z0);
                                    roVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    ro roVar11 = this.b;
                                    roVar11.presentFragment(new rh.j(roVar11.z0));
                                    break;
                                case 9:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ro.X(this.b);
                                    break;
                                case 14:
                                    ro roVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                    break;
                                case 15:
                                    ro roVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                        cd0 cd0Var = new cd0(4);
                                        cd0Var.b0 = -roVar13.t0;
                                        TLRPC.ChatFull chatFull5 = roVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        cd0Var.C0 = new ko(roVar13, 6);
                                        roVar13.presentFragment(cd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ro roVar14 = this.b;
                                    long j112 = roVar14.t0;
                                    org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                    boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                    fp fpVar = new fp(null);
                                    fpVar.J = new ArrayList();
                                    fpVar.K = new ArrayList();
                                    fpVar.M = new ArrayList();
                                    fpVar.Z = true;
                                    fpVar.c0 = new ArrayList();
                                    fpVar.l0 = new HashMap();
                                    fpVar.n0 = new uo(fpVar, 5);
                                    fpVar.q0 = false;
                                    fpVar.W = j112;
                                    fpVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = roVar14.v0;
                                    fpVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            fpVar.i0 = tL_chatInviteExported;
                                        } else {
                                            fpVar.X(false);
                                        }
                                    }
                                    roVar14.presentFragment(fpVar);
                                    break;
                                case 17:
                                    ro roVar15 = this.b;
                                    long j12 = roVar15.t0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.L = false;
                                    spVar.M = false;
                                    spVar.B = j12;
                                    TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                    spVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = roVar15.v0;
                                    roVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    ro roVar16 = this.b;
                                    fw0 fw0Var = new fw0(roVar16.t0);
                                    fw0Var.v = new ko(roVar16, 4);
                                    roVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    ro.Z(this.b);
                                    break;
                                case 20:
                                    ro roVar17 = this.b;
                                    o60 o60Var = new o60(-roVar17.u0.id);
                                    o60Var.c = roVar17.I0;
                                    o60Var.i0 = roVar17;
                                    roVar17.presentFragment(o60Var);
                                    break;
                                case 21:
                                    ro roVar18 = this.b;
                                    roVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", roVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                    rr rrVar3 = new rr(bundle4);
                                    rrVar3.x0(roVar18.v0);
                                    roVar18.presentFragment(rrVar3);
                                    break;
                                case 22:
                                    ro roVar19 = this.b;
                                    rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = roVar19.v0;
                                    rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    roVar19.presentFragment(rh0Var);
                                    break;
                                case 23:
                                    ro roVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                        roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", roVar20.t0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = roVar20.v0;
                                        zpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        roVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    ro roVar21 = this.b;
                                    roVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", roVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                    roVar21.presentFragment(new zn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(roVar.u0, 28)) {
                        org.telegram.ui.Cells.n8 n8Var18 = new org.telegram.ui.Cells.n8(context2);
                        roVar.c0 = n8Var18;
                        n8Var18.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i32 = 24;
                        roVar.c0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                            public final /* synthetic */ ro b;

                            {
                                this.b = roVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i32) {
                                    case 0:
                                        ro roVar3 = this.b;
                                        roVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", roVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rr rrVar = new rr(bundle);
                                        rrVar.x0(roVar3.v0);
                                        roVar3.presentFragment(rrVar);
                                        break;
                                    case 1:
                                        ro roVar4 = this.b;
                                        po poVar = roVar4.N0;
                                        long j102 = roVar4.z0;
                                        if (!roVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ro roVar5 = this.b;
                                        roVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", roVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rr rrVar2 = new rr(bundle2);
                                        rrVar2.x0(roVar5.v0);
                                        roVar5.presentFragment(rrVar2);
                                        break;
                                    case 3:
                                        ro roVar6 = this.b;
                                        roVar6.presentFragment(new sh0(roVar6.t0));
                                        break;
                                    case 4:
                                        ro roVar7 = this.b;
                                        roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                        break;
                                    case 5:
                                        ro roVar8 = this.b;
                                        roVar8.getClass();
                                        roVar8.presentFragment(new ub(roVar8.u0));
                                        break;
                                    case 6:
                                        ro roVar9 = this.b;
                                        roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                        break;
                                    case 7:
                                        ro roVar10 = this.b;
                                        roVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", roVar10.z0);
                                        roVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        ro roVar11 = this.b;
                                        roVar11.presentFragment(new rh.j(roVar11.z0));
                                        break;
                                    case 9:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ro.X(this.b);
                                        break;
                                    case 14:
                                        ro roVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                        break;
                                    case 15:
                                        ro roVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                            cd0 cd0Var = new cd0(4);
                                            cd0Var.b0 = -roVar13.t0;
                                            TLRPC.ChatFull chatFull5 = roVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            cd0Var.C0 = new ko(roVar13, 6);
                                            roVar13.presentFragment(cd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ro roVar14 = this.b;
                                        long j112 = roVar14.t0;
                                        org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                        boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                        fp fpVar = new fp(null);
                                        fpVar.J = new ArrayList();
                                        fpVar.K = new ArrayList();
                                        fpVar.M = new ArrayList();
                                        fpVar.Z = true;
                                        fpVar.c0 = new ArrayList();
                                        fpVar.l0 = new HashMap();
                                        fpVar.n0 = new uo(fpVar, 5);
                                        fpVar.q0 = false;
                                        fpVar.W = j112;
                                        fpVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = roVar14.v0;
                                        fpVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                fpVar.i0 = tL_chatInviteExported;
                                            } else {
                                                fpVar.X(false);
                                            }
                                        }
                                        roVar14.presentFragment(fpVar);
                                        break;
                                    case 17:
                                        ro roVar15 = this.b;
                                        long j12 = roVar15.t0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.L = false;
                                        spVar.M = false;
                                        spVar.B = j12;
                                        TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                        spVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = roVar15.v0;
                                        roVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        ro roVar16 = this.b;
                                        fw0 fw0Var = new fw0(roVar16.t0);
                                        fw0Var.v = new ko(roVar16, 4);
                                        roVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        ro.Z(this.b);
                                        break;
                                    case 20:
                                        ro roVar17 = this.b;
                                        o60 o60Var = new o60(-roVar17.u0.id);
                                        o60Var.c = roVar17.I0;
                                        o60Var.i0 = roVar17;
                                        roVar17.presentFragment(o60Var);
                                        break;
                                    case 21:
                                        ro roVar18 = this.b;
                                        roVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", roVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                        rr rrVar3 = new rr(bundle4);
                                        rrVar3.x0(roVar18.v0);
                                        roVar18.presentFragment(rrVar3);
                                        break;
                                    case 22:
                                        ro roVar19 = this.b;
                                        rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = roVar19.v0;
                                        rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        roVar19.presentFragment(rh0Var);
                                        break;
                                    case 23:
                                        ro roVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                            roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", roVar20.t0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = roVar20.v0;
                                            zpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            roVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        ro roVar21 = this.b;
                                        roVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", roVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                        roVar21.presentFragment(new zn(bundle6));
                                        break;
                                }
                            }
                        });
                        roVar.f0();
                    }
                    org.telegram.ui.Cells.n8 n8Var19 = new org.telegram.ui.Cells.n8(context2);
                    roVar.T = n8Var19;
                    final int i33 = 0;
                    n8Var19.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    roVar.T.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                        public final /* synthetic */ ro b;

                        {
                            this.b = roVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    ro roVar3 = this.b;
                                    roVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", roVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rr rrVar = new rr(bundle);
                                    rrVar.x0(roVar3.v0);
                                    roVar3.presentFragment(rrVar);
                                    break;
                                case 1:
                                    ro roVar4 = this.b;
                                    po poVar = roVar4.N0;
                                    long j102 = roVar4.z0;
                                    if (!roVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ro roVar5 = this.b;
                                    roVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", roVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rr rrVar2 = new rr(bundle2);
                                    rrVar2.x0(roVar5.v0);
                                    roVar5.presentFragment(rrVar2);
                                    break;
                                case 3:
                                    ro roVar6 = this.b;
                                    roVar6.presentFragment(new sh0(roVar6.t0));
                                    break;
                                case 4:
                                    ro roVar7 = this.b;
                                    roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                    break;
                                case 5:
                                    ro roVar8 = this.b;
                                    roVar8.getClass();
                                    roVar8.presentFragment(new ub(roVar8.u0));
                                    break;
                                case 6:
                                    ro roVar9 = this.b;
                                    roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                    break;
                                case 7:
                                    ro roVar10 = this.b;
                                    roVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", roVar10.z0);
                                    roVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    ro roVar11 = this.b;
                                    roVar11.presentFragment(new rh.j(roVar11.z0));
                                    break;
                                case 9:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ro.X(this.b);
                                    break;
                                case 14:
                                    ro roVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                    break;
                                case 15:
                                    ro roVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                        cd0 cd0Var = new cd0(4);
                                        cd0Var.b0 = -roVar13.t0;
                                        TLRPC.ChatFull chatFull5 = roVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        cd0Var.C0 = new ko(roVar13, 6);
                                        roVar13.presentFragment(cd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ro roVar14 = this.b;
                                    long j112 = roVar14.t0;
                                    org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                    boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                    fp fpVar = new fp(null);
                                    fpVar.J = new ArrayList();
                                    fpVar.K = new ArrayList();
                                    fpVar.M = new ArrayList();
                                    fpVar.Z = true;
                                    fpVar.c0 = new ArrayList();
                                    fpVar.l0 = new HashMap();
                                    fpVar.n0 = new uo(fpVar, 5);
                                    fpVar.q0 = false;
                                    fpVar.W = j112;
                                    fpVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = roVar14.v0;
                                    fpVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            fpVar.i0 = tL_chatInviteExported;
                                        } else {
                                            fpVar.X(false);
                                        }
                                    }
                                    roVar14.presentFragment(fpVar);
                                    break;
                                case 17:
                                    ro roVar15 = this.b;
                                    long j12 = roVar15.t0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.L = false;
                                    spVar.M = false;
                                    spVar.B = j12;
                                    TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                    spVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = roVar15.v0;
                                    roVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    ro roVar16 = this.b;
                                    fw0 fw0Var = new fw0(roVar16.t0);
                                    fw0Var.v = new ko(roVar16, 4);
                                    roVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    ro.Z(this.b);
                                    break;
                                case 20:
                                    ro roVar17 = this.b;
                                    o60 o60Var = new o60(-roVar17.u0.id);
                                    o60Var.c = roVar17.I0;
                                    o60Var.i0 = roVar17;
                                    roVar17.presentFragment(o60Var);
                                    break;
                                case 21:
                                    ro roVar18 = this.b;
                                    roVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", roVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                    rr rrVar3 = new rr(bundle4);
                                    rrVar3.x0(roVar18.v0);
                                    roVar18.presentFragment(rrVar3);
                                    break;
                                case 22:
                                    ro roVar19 = this.b;
                                    rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = roVar19.v0;
                                    rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    roVar19.presentFragment(rh0Var);
                                    break;
                                case 23:
                                    ro roVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                        roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", roVar20.t0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = roVar20.v0;
                                        zpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        roVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    ro roVar21 = this.b;
                                    roVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", roVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                    roVar21.presentFragment(new zn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.n8 n8Var20 = new org.telegram.ui.Cells.n8(context2);
                    roVar.Q = n8Var20;
                    n8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i34 = 2;
                    roVar.Q.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                        public final /* synthetic */ ro b;

                        {
                            this.b = roVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    ro roVar3 = this.b;
                                    roVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", roVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rr rrVar = new rr(bundle);
                                    rrVar.x0(roVar3.v0);
                                    roVar3.presentFragment(rrVar);
                                    break;
                                case 1:
                                    ro roVar4 = this.b;
                                    po poVar = roVar4.N0;
                                    long j102 = roVar4.z0;
                                    if (!roVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ro roVar5 = this.b;
                                    roVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", roVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rr rrVar2 = new rr(bundle2);
                                    rrVar2.x0(roVar5.v0);
                                    roVar5.presentFragment(rrVar2);
                                    break;
                                case 3:
                                    ro roVar6 = this.b;
                                    roVar6.presentFragment(new sh0(roVar6.t0));
                                    break;
                                case 4:
                                    ro roVar7 = this.b;
                                    roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                    break;
                                case 5:
                                    ro roVar8 = this.b;
                                    roVar8.getClass();
                                    roVar8.presentFragment(new ub(roVar8.u0));
                                    break;
                                case 6:
                                    ro roVar9 = this.b;
                                    roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                    break;
                                case 7:
                                    ro roVar10 = this.b;
                                    roVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", roVar10.z0);
                                    roVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    ro roVar11 = this.b;
                                    roVar11.presentFragment(new rh.j(roVar11.z0));
                                    break;
                                case 9:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ro.X(this.b);
                                    break;
                                case 14:
                                    ro roVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                    break;
                                case 15:
                                    ro roVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                        cd0 cd0Var = new cd0(4);
                                        cd0Var.b0 = -roVar13.t0;
                                        TLRPC.ChatFull chatFull5 = roVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        cd0Var.C0 = new ko(roVar13, 6);
                                        roVar13.presentFragment(cd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ro roVar14 = this.b;
                                    long j112 = roVar14.t0;
                                    org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                    boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                    fp fpVar = new fp(null);
                                    fpVar.J = new ArrayList();
                                    fpVar.K = new ArrayList();
                                    fpVar.M = new ArrayList();
                                    fpVar.Z = true;
                                    fpVar.c0 = new ArrayList();
                                    fpVar.l0 = new HashMap();
                                    fpVar.n0 = new uo(fpVar, 5);
                                    fpVar.q0 = false;
                                    fpVar.W = j112;
                                    fpVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = roVar14.v0;
                                    fpVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            fpVar.i0 = tL_chatInviteExported;
                                        } else {
                                            fpVar.X(false);
                                        }
                                    }
                                    roVar14.presentFragment(fpVar);
                                    break;
                                case 17:
                                    ro roVar15 = this.b;
                                    long j12 = roVar15.t0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.L = false;
                                    spVar.M = false;
                                    spVar.B = j12;
                                    TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                    spVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = roVar15.v0;
                                    roVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    ro roVar16 = this.b;
                                    fw0 fw0Var = new fw0(roVar16.t0);
                                    fw0Var.v = new ko(roVar16, 4);
                                    roVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    ro.Z(this.b);
                                    break;
                                case 20:
                                    ro roVar17 = this.b;
                                    o60 o60Var = new o60(-roVar17.u0.id);
                                    o60Var.c = roVar17.I0;
                                    o60Var.i0 = roVar17;
                                    roVar17.presentFragment(o60Var);
                                    break;
                                case 21:
                                    ro roVar18 = this.b;
                                    roVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", roVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                    rr rrVar3 = new rr(bundle4);
                                    rrVar3.x0(roVar18.v0);
                                    roVar18.presentFragment(rrVar3);
                                    break;
                                case 22:
                                    ro roVar19 = this.b;
                                    rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = roVar19.v0;
                                    rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    roVar19.presentFragment(rh0Var);
                                    break;
                                case 23:
                                    ro roVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                        roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", roVar20.t0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = roVar20.v0;
                                        zpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        roVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    ro roVar21 = this.b;
                                    roVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", roVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                    roVar21.presentFragment(new zn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(roVar.u0)) {
                        org.telegram.ui.Cells.n8 n8Var21 = new org.telegram.ui.Cells.n8(context2);
                        roVar.R = n8Var21;
                        n8Var21.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i35 = 3;
                        roVar.R.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                            public final /* synthetic */ ro b;

                            {
                                this.b = roVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i35) {
                                    case 0:
                                        ro roVar3 = this.b;
                                        roVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", roVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rr rrVar = new rr(bundle);
                                        rrVar.x0(roVar3.v0);
                                        roVar3.presentFragment(rrVar);
                                        break;
                                    case 1:
                                        ro roVar4 = this.b;
                                        po poVar = roVar4.N0;
                                        long j102 = roVar4.z0;
                                        if (!roVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ro roVar5 = this.b;
                                        roVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", roVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rr rrVar2 = new rr(bundle2);
                                        rrVar2.x0(roVar5.v0);
                                        roVar5.presentFragment(rrVar2);
                                        break;
                                    case 3:
                                        ro roVar6 = this.b;
                                        roVar6.presentFragment(new sh0(roVar6.t0));
                                        break;
                                    case 4:
                                        ro roVar7 = this.b;
                                        roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                        break;
                                    case 5:
                                        ro roVar8 = this.b;
                                        roVar8.getClass();
                                        roVar8.presentFragment(new ub(roVar8.u0));
                                        break;
                                    case 6:
                                        ro roVar9 = this.b;
                                        roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                        break;
                                    case 7:
                                        ro roVar10 = this.b;
                                        roVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", roVar10.z0);
                                        roVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        ro roVar11 = this.b;
                                        roVar11.presentFragment(new rh.j(roVar11.z0));
                                        break;
                                    case 9:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ro.X(this.b);
                                        break;
                                    case 14:
                                        ro roVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                        break;
                                    case 15:
                                        ro roVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                            cd0 cd0Var = new cd0(4);
                                            cd0Var.b0 = -roVar13.t0;
                                            TLRPC.ChatFull chatFull5 = roVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            cd0Var.C0 = new ko(roVar13, 6);
                                            roVar13.presentFragment(cd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ro roVar14 = this.b;
                                        long j112 = roVar14.t0;
                                        org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                        boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                        fp fpVar = new fp(null);
                                        fpVar.J = new ArrayList();
                                        fpVar.K = new ArrayList();
                                        fpVar.M = new ArrayList();
                                        fpVar.Z = true;
                                        fpVar.c0 = new ArrayList();
                                        fpVar.l0 = new HashMap();
                                        fpVar.n0 = new uo(fpVar, 5);
                                        fpVar.q0 = false;
                                        fpVar.W = j112;
                                        fpVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = roVar14.v0;
                                        fpVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                fpVar.i0 = tL_chatInviteExported;
                                            } else {
                                                fpVar.X(false);
                                            }
                                        }
                                        roVar14.presentFragment(fpVar);
                                        break;
                                    case 17:
                                        ro roVar15 = this.b;
                                        long j12 = roVar15.t0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.L = false;
                                        spVar.M = false;
                                        spVar.B = j12;
                                        TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                        spVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = roVar15.v0;
                                        roVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        ro roVar16 = this.b;
                                        fw0 fw0Var = new fw0(roVar16.t0);
                                        fw0Var.v = new ko(roVar16, 4);
                                        roVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        ro.Z(this.b);
                                        break;
                                    case 20:
                                        ro roVar17 = this.b;
                                        o60 o60Var = new o60(-roVar17.u0.id);
                                        o60Var.c = roVar17.I0;
                                        o60Var.i0 = roVar17;
                                        roVar17.presentFragment(o60Var);
                                        break;
                                    case 21:
                                        ro roVar18 = this.b;
                                        roVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", roVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                        rr rrVar3 = new rr(bundle4);
                                        rrVar3.x0(roVar18.v0);
                                        roVar18.presentFragment(rrVar3);
                                        break;
                                    case 22:
                                        ro roVar19 = this.b;
                                        rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = roVar19.v0;
                                        rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        roVar19.presentFragment(rh0Var);
                                        break;
                                    case 23:
                                        ro roVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                            roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", roVar20.t0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = roVar20.v0;
                                            zpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            roVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        ro roVar21 = this.b;
                                        roVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", roVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                        roVar21.presentFragment(new zn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.n8 n8Var22 = new org.telegram.ui.Cells.n8(context2);
                    roVar.W = n8Var22;
                    n8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    roVar.W.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i36 = 4;
                    roVar.W.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                        public final /* synthetic */ ro b;

                        {
                            this.b = roVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    ro roVar3 = this.b;
                                    roVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", roVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rr rrVar = new rr(bundle);
                                    rrVar.x0(roVar3.v0);
                                    roVar3.presentFragment(rrVar);
                                    break;
                                case 1:
                                    ro roVar4 = this.b;
                                    po poVar = roVar4.N0;
                                    long j102 = roVar4.z0;
                                    if (!roVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, roVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ro roVar5 = this.b;
                                    roVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", roVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rr rrVar2 = new rr(bundle2);
                                    rrVar2.x0(roVar5.v0);
                                    roVar5.presentFragment(rrVar2);
                                    break;
                                case 3:
                                    ro roVar6 = this.b;
                                    roVar6.presentFragment(new sh0(roVar6.t0));
                                    break;
                                case 4:
                                    ro roVar7 = this.b;
                                    roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                    break;
                                case 5:
                                    ro roVar8 = this.b;
                                    roVar8.getClass();
                                    roVar8.presentFragment(new ub(roVar8.u0));
                                    break;
                                case 6:
                                    ro roVar9 = this.b;
                                    roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                    break;
                                case 7:
                                    ro roVar10 = this.b;
                                    roVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", roVar10.z0);
                                    roVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    ro roVar11 = this.b;
                                    roVar11.presentFragment(new rh.j(roVar11.z0));
                                    break;
                                case 9:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ro.X(this.b);
                                    break;
                                case 14:
                                    ro roVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                    break;
                                case 15:
                                    ro roVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                        cd0 cd0Var = new cd0(4);
                                        cd0Var.b0 = -roVar13.t0;
                                        TLRPC.ChatFull chatFull5 = roVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        cd0Var.C0 = new ko(roVar13, 6);
                                        roVar13.presentFragment(cd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ro roVar14 = this.b;
                                    long j112 = roVar14.t0;
                                    org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                    boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                    fp fpVar = new fp(null);
                                    fpVar.J = new ArrayList();
                                    fpVar.K = new ArrayList();
                                    fpVar.M = new ArrayList();
                                    fpVar.Z = true;
                                    fpVar.c0 = new ArrayList();
                                    fpVar.l0 = new HashMap();
                                    fpVar.n0 = new uo(fpVar, 5);
                                    fpVar.q0 = false;
                                    fpVar.W = j112;
                                    fpVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = roVar14.v0;
                                    fpVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            fpVar.i0 = tL_chatInviteExported;
                                        } else {
                                            fpVar.X(false);
                                        }
                                    }
                                    roVar14.presentFragment(fpVar);
                                    break;
                                case 17:
                                    ro roVar15 = this.b;
                                    long j12 = roVar15.t0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.L = false;
                                    spVar.M = false;
                                    spVar.B = j12;
                                    TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                    spVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = roVar15.v0;
                                    roVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    ro roVar16 = this.b;
                                    fw0 fw0Var = new fw0(roVar16.t0);
                                    fw0Var.v = new ko(roVar16, 4);
                                    roVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    ro.Z(this.b);
                                    break;
                                case 20:
                                    ro roVar17 = this.b;
                                    o60 o60Var = new o60(-roVar17.u0.id);
                                    o60Var.c = roVar17.I0;
                                    o60Var.i0 = roVar17;
                                    roVar17.presentFragment(o60Var);
                                    break;
                                case 21:
                                    ro roVar18 = this.b;
                                    roVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", roVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                    rr rrVar3 = new rr(bundle4);
                                    rrVar3.x0(roVar18.v0);
                                    roVar18.presentFragment(rrVar3);
                                    break;
                                case 22:
                                    ro roVar19 = this.b;
                                    rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = roVar19.v0;
                                    rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    roVar19.presentFragment(rh0Var);
                                    break;
                                case 23:
                                    ro roVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                        roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", roVar20.t0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = roVar20.v0;
                                        zpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        roVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    ro roVar21 = this.b;
                                    roVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", roVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                    roVar21.presentFragment(new zn(bundle6));
                                    break;
                            }
                        }
                    });
                    roVar.W.setVisibility(8);
                    if (!ChatObject.isChannel(roVar.u0) || roVar.u0.gigagroup) {
                        org.telegram.ui.Cells.n8 n8Var23 = new org.telegram.ui.Cells.n8(context2);
                        roVar.V = n8Var23;
                        n8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        roVar.V.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i37 = 5;
                        roVar.V.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                            public final /* synthetic */ ro b;

                            {
                                this.b = roVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i37) {
                                    case 0:
                                        ro roVar3 = this.b;
                                        roVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", roVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rr rrVar = new rr(bundle);
                                        rrVar.x0(roVar3.v0);
                                        roVar3.presentFragment(rrVar);
                                        break;
                                    case 1:
                                        ro roVar4 = this.b;
                                        po poVar = roVar4.N0;
                                        long j102 = roVar4.z0;
                                        if (!roVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ro roVar5 = this.b;
                                        roVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", roVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rr rrVar2 = new rr(bundle2);
                                        rrVar2.x0(roVar5.v0);
                                        roVar5.presentFragment(rrVar2);
                                        break;
                                    case 3:
                                        ro roVar6 = this.b;
                                        roVar6.presentFragment(new sh0(roVar6.t0));
                                        break;
                                    case 4:
                                        ro roVar7 = this.b;
                                        roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                        break;
                                    case 5:
                                        ro roVar8 = this.b;
                                        roVar8.getClass();
                                        roVar8.presentFragment(new ub(roVar8.u0));
                                        break;
                                    case 6:
                                        ro roVar9 = this.b;
                                        roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                        break;
                                    case 7:
                                        ro roVar10 = this.b;
                                        roVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", roVar10.z0);
                                        roVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        ro roVar11 = this.b;
                                        roVar11.presentFragment(new rh.j(roVar11.z0));
                                        break;
                                    case 9:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ro.X(this.b);
                                        break;
                                    case 14:
                                        ro roVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                        break;
                                    case 15:
                                        ro roVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                            cd0 cd0Var = new cd0(4);
                                            cd0Var.b0 = -roVar13.t0;
                                            TLRPC.ChatFull chatFull5 = roVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            cd0Var.C0 = new ko(roVar13, 6);
                                            roVar13.presentFragment(cd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ro roVar14 = this.b;
                                        long j112 = roVar14.t0;
                                        org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                        boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                        fp fpVar = new fp(null);
                                        fpVar.J = new ArrayList();
                                        fpVar.K = new ArrayList();
                                        fpVar.M = new ArrayList();
                                        fpVar.Z = true;
                                        fpVar.c0 = new ArrayList();
                                        fpVar.l0 = new HashMap();
                                        fpVar.n0 = new uo(fpVar, 5);
                                        fpVar.q0 = false;
                                        fpVar.W = j112;
                                        fpVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = roVar14.v0;
                                        fpVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                fpVar.i0 = tL_chatInviteExported;
                                            } else {
                                                fpVar.X(false);
                                            }
                                        }
                                        roVar14.presentFragment(fpVar);
                                        break;
                                    case 17:
                                        ro roVar15 = this.b;
                                        long j12 = roVar15.t0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.L = false;
                                        spVar.M = false;
                                        spVar.B = j12;
                                        TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                        spVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = roVar15.v0;
                                        roVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        ro roVar16 = this.b;
                                        fw0 fw0Var = new fw0(roVar16.t0);
                                        fw0Var.v = new ko(roVar16, 4);
                                        roVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        ro.Z(this.b);
                                        break;
                                    case 20:
                                        ro roVar17 = this.b;
                                        o60 o60Var = new o60(-roVar17.u0.id);
                                        o60Var.c = roVar17.I0;
                                        o60Var.i0 = roVar17;
                                        roVar17.presentFragment(o60Var);
                                        break;
                                    case 21:
                                        ro roVar18 = this.b;
                                        roVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", roVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                        rr rrVar3 = new rr(bundle4);
                                        rrVar3.x0(roVar18.v0);
                                        roVar18.presentFragment(rrVar3);
                                        break;
                                    case 22:
                                        ro roVar19 = this.b;
                                        rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = roVar19.v0;
                                        rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        roVar19.presentFragment(rh0Var);
                                        break;
                                    case 23:
                                        ro roVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                            roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", roVar20.t0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = roVar20.v0;
                                            zpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            roVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        ro roVar21 = this.b;
                                        roVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", roVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                        roVar21.presentFragment(new zn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(roVar.u0)) {
                        org.telegram.ui.Cells.n8 n8Var24 = new org.telegram.ui.Cells.n8(context2);
                        roVar.X = n8Var24;
                        n8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        roVar.X.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i38 = 6;
                        roVar.X.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                            public final /* synthetic */ ro b;

                            {
                                this.b = roVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i38) {
                                    case 0:
                                        ro roVar3 = this.b;
                                        roVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", roVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rr rrVar = new rr(bundle);
                                        rrVar.x0(roVar3.v0);
                                        roVar3.presentFragment(rrVar);
                                        break;
                                    case 1:
                                        ro roVar4 = this.b;
                                        po poVar = roVar4.N0;
                                        long j102 = roVar4.z0;
                                        if (!roVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = roVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, roVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ro roVar5 = this.b;
                                        roVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", roVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rr rrVar2 = new rr(bundle2);
                                        rrVar2.x0(roVar5.v0);
                                        roVar5.presentFragment(rrVar2);
                                        break;
                                    case 3:
                                        ro roVar6 = this.b;
                                        roVar6.presentFragment(new sh0(roVar6.t0));
                                        break;
                                    case 4:
                                        ro roVar7 = this.b;
                                        roVar7.presentFragment(new rh.d3(-roVar7.t0));
                                        break;
                                    case 5:
                                        ro roVar8 = this.b;
                                        roVar8.getClass();
                                        roVar8.presentFragment(new ub(roVar8.u0));
                                        break;
                                    case 6:
                                        ro roVar9 = this.b;
                                        roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                                        break;
                                    case 7:
                                        ro roVar10 = this.b;
                                        roVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", roVar10.z0);
                                        roVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        ro roVar11 = this.b;
                                        roVar11.presentFragment(new rh.j(roVar11.z0));
                                        break;
                                    case 9:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ro.X(this.b);
                                        break;
                                    case 14:
                                        ro roVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                                        break;
                                    case 15:
                                        ro roVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                            cd0 cd0Var = new cd0(4);
                                            cd0Var.b0 = -roVar13.t0;
                                            TLRPC.ChatFull chatFull5 = roVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            cd0Var.C0 = new ko(roVar13, 6);
                                            roVar13.presentFragment(cd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ro roVar14 = this.b;
                                        long j112 = roVar14.t0;
                                        org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                                        boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                                        fp fpVar = new fp(null);
                                        fpVar.J = new ArrayList();
                                        fpVar.K = new ArrayList();
                                        fpVar.M = new ArrayList();
                                        fpVar.Z = true;
                                        fpVar.c0 = new ArrayList();
                                        fpVar.l0 = new HashMap();
                                        fpVar.n0 = new uo(fpVar, 5);
                                        fpVar.q0 = false;
                                        fpVar.W = j112;
                                        fpVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = roVar14.v0;
                                        fpVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                fpVar.i0 = tL_chatInviteExported;
                                            } else {
                                                fpVar.X(false);
                                            }
                                        }
                                        roVar14.presentFragment(fpVar);
                                        break;
                                    case 17:
                                        ro roVar15 = this.b;
                                        long j12 = roVar15.t0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.L = false;
                                        spVar.M = false;
                                        spVar.B = j12;
                                        TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                                        spVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = roVar15.v0;
                                        roVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        ro roVar16 = this.b;
                                        fw0 fw0Var = new fw0(roVar16.t0);
                                        fw0Var.v = new ko(roVar16, 4);
                                        roVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        ro.Z(this.b);
                                        break;
                                    case 20:
                                        ro roVar17 = this.b;
                                        o60 o60Var = new o60(-roVar17.u0.id);
                                        o60Var.c = roVar17.I0;
                                        o60Var.i0 = roVar17;
                                        roVar17.presentFragment(o60Var);
                                        break;
                                    case 21:
                                        ro roVar18 = this.b;
                                        roVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", roVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                                        rr rrVar3 = new rr(bundle4);
                                        rrVar3.x0(roVar18.v0);
                                        roVar18.presentFragment(rrVar3);
                                        break;
                                    case 22:
                                        ro roVar19 = this.b;
                                        rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = roVar19.v0;
                                        rh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        roVar19.presentFragment(rh0Var);
                                        break;
                                    case 23:
                                        ro roVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                            roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", roVar20.t0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = roVar20.v0;
                                            zpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            roVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        ro roVar21 = this.b;
                                        roVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", roVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                                        roVar21.presentFragment(new zn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    roVar.O.addView(roVar.L, k7.b6.n(-1, -2));
                    n8Var = roVar.c0;
                    if (n8Var != null) {
                        roVar.O.addView(n8Var, k7.b6.n(-1, -2));
                    }
                    if (!roVar.F0 && !roVar.u0.gigagroup) {
                        roVar.O.addView(roVar.U, k7.b6.n(-1, -2));
                    }
                    if (!roVar.F0) {
                        roVar.O.addView(roVar.S, k7.b6.n(-1, -2));
                    }
                    roVar.O.addView(roVar.T, k7.b6.n(-1, -2));
                    roVar.O.addView(roVar.Q, k7.b6.n(-1, -2));
                    n8Var2 = roVar.R;
                    if (n8Var2 != null && (chatFull = roVar.v0) != null && chatFull.requests_pending > 0) {
                        roVar.O.addView(n8Var2, k7.b6.n(-1, -2));
                    }
                    if (roVar.F0) {
                        roVar.O.addView(roVar.S, k7.b6.n(-1, -2));
                    }
                    if (!roVar.F0 || roVar.u0.gigagroup) {
                        i15 = -1;
                        i16 = -2;
                        roVar.O.addView(roVar.U, k7.b6.n(-1, -2));
                    } else {
                        i15 = -1;
                        i16 = -2;
                    }
                    n8Var3 = roVar.X;
                    if (n8Var3 != null) {
                        roVar.O.addView(n8Var3, k7.b6.n(i15, i16));
                    }
                    n8Var4 = roVar.V;
                    if (n8Var4 != null) {
                        roVar.O.addView(n8Var4, k7.b6.n(i15, i16));
                    }
                    n8Var5 = roVar.W;
                    if (n8Var5 != null) {
                        roVar.O.addView(n8Var5, k7.b6.n(i15, i16));
                    }
                    if (roVar.W != null && roVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(roVar.u0)) {
                        roVar.W.setVisibility(0);
                    }
                    n8Var6 = roVar.V;
                    if (n8Var6 != null) {
                        org.telegram.ui.Cells.n8 n8Var25 = roVar.W;
                        n8Var6.setNeedDivider(n8Var25 != null && n8Var25.getVisibility() == 0);
                    }
                }
            }
            i14 = 0;
            n8Var15.setVisibility(i14);
            roVar.U.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var162 = new org.telegram.ui.Cells.n8(context2);
            roVar.S = n8Var162;
            n8Var162.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i302 = 22;
            roVar.S.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i302) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var172 = new org.telegram.ui.Cells.n8(context2);
            roVar.L = n8Var172;
            n8Var172.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i312 = 23;
            roVar.L.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i312) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(roVar.u0, 28)) {
            }
            org.telegram.ui.Cells.n8 n8Var192 = new org.telegram.ui.Cells.n8(context2);
            roVar.T = n8Var192;
            final int i332 = 0;
            n8Var192.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            roVar.T.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var202 = new org.telegram.ui.Cells.n8(context2);
            roVar.Q = n8Var202;
            n8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            final int i342 = 2;
            roVar.Q.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(roVar.u0)) {
            }
            org.telegram.ui.Cells.n8 n8Var222 = new org.telegram.ui.Cells.n8(context2);
            roVar.W = n8Var222;
            n8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            roVar.W.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i362 = 4;
            roVar.W.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            roVar.W.setVisibility(8);
            if (!ChatObject.isChannel(roVar.u0)) {
            }
            org.telegram.ui.Cells.n8 n8Var232 = new org.telegram.ui.Cells.n8(context2);
            roVar.V = n8Var232;
            n8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            roVar.V.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i372 = 5;
            roVar.V.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i372) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(roVar.u0)) {
            }
            roVar.O.addView(roVar.L, k7.b6.n(-1, -2));
            n8Var = roVar.c0;
            if (n8Var != null) {
            }
            if (!roVar.F0) {
                roVar.O.addView(roVar.U, k7.b6.n(-1, -2));
            }
            if (!roVar.F0) {
            }
            roVar.O.addView(roVar.T, k7.b6.n(-1, -2));
            roVar.O.addView(roVar.Q, k7.b6.n(-1, -2));
            n8Var2 = roVar.R;
            if (n8Var2 != null) {
                roVar.O.addView(n8Var2, k7.b6.n(-1, -2));
            }
            if (roVar.F0) {
            }
            if (roVar.F0) {
            }
            i15 = -1;
            i16 = -2;
            roVar.O.addView(roVar.U, k7.b6.n(-1, -2));
            n8Var3 = roVar.X;
            if (n8Var3 != null) {
            }
            n8Var4 = roVar.V;
            if (n8Var4 != null) {
            }
            n8Var5 = roVar.W;
            if (n8Var5 != null) {
            }
            if (roVar.W != null) {
                roVar.W.setVisibility(0);
            }
            n8Var6 = roVar.V;
            if (n8Var6 != null) {
            }
        }
        if (roVar.A0 != null) {
            org.telegram.ui.Cells.n8 n8Var26 = new org.telegram.ui.Cells.n8(context2);
            roVar.i0 = n8Var26;
            n8Var26.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            roVar.i0.setPrioritizeTitleOverValue(true);
            roVar.O.addView(roVar.i0, k7.b6.n(-1, -2));
            final int i39 = 7;
            roVar.i0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            roVar.r0();
            org.telegram.ui.Cells.n8 n8Var27 = new org.telegram.ui.Cells.n8(context2);
            roVar.l0 = n8Var27;
            n8Var27.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            roVar.l0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            roVar.O.addView(roVar.l0, k7.b6.n(-1, -2));
            roVar.l0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i29) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            roVar.l0.f(45, roVar.B0 == null, false);
            TLRPC.UserFull userFull = roVar.B0;
            if (userFull != null) {
                org.telegram.ui.Cells.n8 n8Var28 = roVar.l0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z10 = false;
                } else {
                    z10 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                n8Var28.u(format, z10);
            }
            if (!roVar.getMessagesController().starrefProgramAllowed) {
                roVar.l0.setVisibility(8);
            }
            org.telegram.ui.Cells.n8 n8Var29 = new org.telegram.ui.Cells.n8(context2);
            roVar.m0 = n8Var29;
            n8Var29.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            roVar.m0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            roVar.O.addView(roVar.m0, k7.b6.n(-1, -2));
            final int i40 = 9;
            roVar.m0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i40) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var30 = new org.telegram.ui.Cells.n8(context2);
            roVar.n0 = n8Var30;
            n8Var30.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            roVar.n0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            roVar.O.addView(roVar.n0, k7.b6.n(-1, -2));
            final int i41 = 10;
            roVar.n0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i41) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var31 = new org.telegram.ui.Cells.n8(context2);
            roVar.o0 = n8Var31;
            n8Var31.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            roVar.o0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            roVar.O.addView(roVar.o0, k7.b6.n(-1, -2));
            final int i42 = 11;
            roVar.o0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i42) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = roVar.u0;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                roVar.O.setVisibility(8);
                roVar.D.setVisibility(8);
            }
            u3Var.addView(new org.telegram.ui.Cells.y6(context2), k7.b6.n(-1, -2));
        } else if (roVar.A0 != null) {
            roVar.p0 = new org.telegram.ui.Cells.z8(context2, i11, roVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new lh.l3(1), indexOf, indexOf + 10, 33);
            }
            roVar.p0.setText(valueOf);
            u3Var.addView(roVar.p0, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.n8 n8Var32 = new org.telegram.ui.Cells.n8(context2);
            roVar.r0 = n8Var32;
            n8Var32.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            roVar.r0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.n8 n8Var33 = roVar.r0;
            int i43 = org.telegram.ui.ActionBar.j6.q6;
            n8Var33.e(i43, i43);
            u3Var.addView(roVar.r0, k7.b6.n(-1, -2));
            final int i44 = 13;
            roVar.r0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j12 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j12;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j12));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context2, i11, roVar.resourceProvider);
            roVar.q0 = z8Var2;
            z8Var2.setFixedSize(i11);
            u3Var.addView(roVar.q0, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.n8 n8Var34 = roVar.r0;
            TLRPC.UserFull userFull2 = roVar.B0;
            n8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.z8 z8Var3 = roVar.q0;
            TLRPC.UserFull userFull3 = roVar.B0;
            z8Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = roVar.A0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                roVar.P = linearLayout5;
                linearLayout5.setOrientation(1);
                u3Var.addView(roVar.P, k7.b6.n(-1, -2));
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2);
                l4Var.setText(LocaleController.getString(R.string.BotBalance));
                roVar.P.addView(l4Var, k7.b6.n(-1, -2));
                org.telegram.ui.Cells.n8 n8Var35 = new org.telegram.ui.Cells.n8(context2);
                roVar.j0 = n8Var35;
                n8Var35.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                roVar.j0.setPrioritizeTitleOverValue(true);
                roVar.P.addView(roVar.j0, k7.b6.n(-1, -2));
                final lh.b0 g11 = lh.b0.g(roVar.currentAccount);
                final int i45 = 0;
                roVar.j0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.fo
                    public final /* synthetic */ ro b;

                    {
                        this.b = roVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i45) {
                            case 0:
                                ro roVar3 = this.b;
                                long j12 = roVar3.z0;
                                if (g11.h(j12, false) != null) {
                                    roVar3.presentFragment(new lh.q(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ro roVar4 = this.b;
                                long j13 = roVar4.z0;
                                if (g11.h(j13, false) != null) {
                                    roVar4.presentFragment(new lh.q(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.m(j10)) {
                    long i46 = g11.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i46 > 0) {
                        double d = i46 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            charSequence = "";
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            roVar.j0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    charSequence = "";
                    roVar.j0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.k90(AndroidUtilities.dp(30.0f), roVar.j0.c), 0, spannableStringBuilder2.length(), 33);
                    roVar.j0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    charSequence = "";
                }
                roVar.j0.setVisibility(g11.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.n8 n8Var36 = new org.telegram.ui.Cells.n8(context2);
                roVar.k0 = n8Var36;
                n8Var36.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                final int i47 = 1;
                roVar.k0.setPrioritizeTitleOverValue(true);
                roVar.P.addView(roVar.k0, k7.b6.n(-1, -2));
                roVar.k0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.fo
                    public final /* synthetic */ ro b;

                    {
                        this.b = roVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i47) {
                            case 0:
                                ro roVar3 = this.b;
                                long j12 = roVar3.z0;
                                if (g11.h(j12, false) != null) {
                                    roVar3.presentFragment(new lh.q(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ro roVar4 = this.b;
                                long j13 = roVar4.z0;
                                if (g11.h(j13, false) != null) {
                                    roVar4.presentFragment(new lh.q(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j10, false) != null) {
                    org.telegram.ui.Cells.n8 n8Var37 = roVar.k0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j10).amount <= 0) {
                        X0 = charSequence;
                        z4 = false;
                    } else {
                        z4 = false;
                        X0 = lh.ja.X0(false, TextUtils.concat("XTR", lh.ja.K0(g11.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    n8Var37.q(string2, X0, R.drawable.menu_premium_main, z4);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.k90(AndroidUtilities.dp(30.0f), roVar.k0.c), 0, spannableStringBuilder3.length(), 33);
                    roVar.k0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                roVar.k0.setVisibility(g11.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context2, 12, roVar.getResourceProvider());
                z8Var4.setFixedSize(12);
                z8Var4.setTag(R.id.fit_width_tag, 1);
                u3Var.addView(z8Var4, k7.b6.n(-1, 12));
                roVar.P.setVisibility((roVar.k0.getVisibility() == 0 || roVar.j0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = roVar.u0;
        final int i48 = 14;
        if ((chat5 == null || !chat5.creator) && !((user = roVar.A0) != null && user.bot && user.bot_can_edit)) {
            roVar2 = roVar;
            f10 = -2.0f;
        } else {
            final long j12 = chat5 != null ? chat5.linked_community_id : roVar.A0.linked_community_id;
            final long j13 = chat5 != null ? -chat5.id : roVar.A0.id;
            final boolean z17 = roVar.A0 != null;
            if (j12 != 0) {
                th.a aVar = new th.a(context2, roVar.resourceProvider);
                roVar.e0 = aVar;
                aVar.a(roVar.currentAccount, roVar.getMessagesController().getChat(Long.valueOf(j12)));
                final int i49 = 0;
                roVar.e0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                roVar.e0.setOnClickListener(new View.OnClickListener(roVar) { // from class: org.telegram.ui.go
                    public final /* synthetic */ ro b;

                    {
                        this.b = roVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i49) {
                            case 0:
                                ro roVar3 = this.b;
                                MessagesController messagesController = roVar3.getMessagesController();
                                long j14 = j12;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    roVar3.showDialog(new sh.i0(roVar3, j14, null, null));
                                    break;
                                } else {
                                    roVar3.presentFragment(new sh.n(kf.k0.g(j14, "community_id")));
                                    break;
                                }
                            default:
                                ro roVar4 = this.b;
                                roVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j12);
                                roVar4.presentFragment(new sh.g(bundle));
                                break;
                        }
                    }
                });
                u3Var.addView(roVar.e0, k7.b6.n(-1, -2));
                org.telegram.ui.Cells.n8 n8Var38 = new org.telegram.ui.Cells.n8(context2);
                roVar.g0 = n8Var38;
                n8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : roVar.F0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                org.telegram.ui.Cells.n8 n8Var39 = roVar.g0;
                int i50 = org.telegram.ui.ActionBar.j6.p7;
                n8Var39.e(i50, i50);
                roVar.g0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                roVar2 = roVar;
                f10 = -2.0f;
                roVar.g0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ho
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                        ro roVar3 = ro.this;
                        org.telegram.ui.Components.z4.v0(roVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : roVar3.F0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new oo(roVar3, j13, j12, 0));
                    }
                });
                u3Var.addView(roVar2.g0, k7.b6.n(-1, -2));
                org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(context2, 12, roVar2.getResourceProvider());
                roVar2.h0 = z8Var5;
                z8Var5.setFixedSize(14);
                roVar2.h0.setTag(R.id.fit_width_tag, 1);
                u3Var.addView(roVar2.h0, k7.b6.n(-1, 14));
            } else {
                roVar2 = roVar;
                f10 = -2.0f;
                org.telegram.ui.Cells.n8 n8Var40 = new org.telegram.ui.Cells.n8(context2);
                roVar2.d0 = n8Var40;
                n8Var40.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                roVar2.d0.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.il));
                roVar2.d0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                roVar2.d0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : roVar2.F0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                final int i51 = 1;
                roVar2.d0.setOnClickListener(new View.OnClickListener(roVar2) { // from class: org.telegram.ui.go
                    public final /* synthetic */ ro b;

                    {
                        this.b = roVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                ro roVar3 = this.b;
                                MessagesController messagesController = roVar3.getMessagesController();
                                long j14 = j13;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    roVar3.showDialog(new sh.i0(roVar3, j14, null, null));
                                    break;
                                } else {
                                    roVar3.presentFragment(new sh.n(kf.k0.g(j14, "community_id")));
                                    break;
                                }
                            default:
                                ro roVar4 = this.b;
                                roVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j13);
                                roVar4.presentFragment(new sh.g(bundle));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.z8 z8Var6 = new org.telegram.ui.Cells.z8(context2, 12, roVar2.resourceProvider);
                roVar2.f0 = z8Var6;
                z8Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : roVar2.F0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                u3Var.addView(roVar2.d0, k7.b6.n(-1, -2));
                u3Var.addView(roVar2.f0, k7.b6.n(-1, -2));
            }
        }
        TLRPC.Chat chat6 = roVar2.u0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context2);
            roVar2.Z = frameLayout3;
            u3Var.addView(frameLayout3, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context2);
            roVar2.a0 = z9Var;
            z9Var.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.p7));
            roVar2.a0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (roVar2.A0 != null) {
                roVar2.a0.b(LocaleController.getString(R.string.DeleteBot), false);
            } else if (roVar2.F0) {
                roVar2.a0.b(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                roVar2.a0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            roVar2.Z.addView(roVar2.a0, k7.b6.c(f10, -1));
            roVar2.a0.setOnClickListener(new View.OnClickListener(roVar2) { // from class: org.telegram.ui.eo
                public final /* synthetic */ ro b;

                {
                    this.b = roVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i48) {
                        case 0:
                            ro roVar3 = this.b;
                            roVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", roVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rr rrVar = new rr(bundle);
                            rrVar.x0(roVar3.v0);
                            roVar3.presentFragment(rrVar);
                            break;
                        case 1:
                            ro roVar4 = this.b;
                            po poVar = roVar4.N0;
                            long j102 = roVar4.z0;
                            if (!roVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : roVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat22 = roVar4.getMessagesController().getChat(Long.valueOf(roVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = roVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(roVar4.v0.chat_photo.video_sizes.get(0), roVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, roVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, poVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ro roVar5 = this.b;
                            roVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", roVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rr rrVar2 = new rr(bundle2);
                            rrVar2.x0(roVar5.v0);
                            roVar5.presentFragment(rrVar2);
                            break;
                        case 3:
                            ro roVar6 = this.b;
                            roVar6.presentFragment(new sh0(roVar6.t0));
                            break;
                        case 4:
                            ro roVar7 = this.b;
                            roVar7.presentFragment(new rh.d3(-roVar7.t0));
                            break;
                        case 5:
                            ro roVar8 = this.b;
                            roVar8.getClass();
                            roVar8.presentFragment(new ub(roVar8.u0));
                            break;
                        case 6:
                            ro roVar9 = this.b;
                            roVar9.presentFragment(oa1.d0(roVar9.u0, false));
                            break;
                        case 7:
                            ro roVar10 = this.b;
                            roVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", roVar10.z0);
                            roVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            ro roVar11 = this.b;
                            roVar11.presentFragment(new rh.j(roVar11.z0));
                            break;
                        case 9:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            ze.d.s(view.getContext(), "https://t.me/BotFather?start=" + ro.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ro.X(this.b);
                            break;
                        case 14:
                            ro roVar12 = this.b;
                            org.telegram.ui.Components.z4.s(roVar12, false, roVar12.u0, null, false, true, true, false, new ko(roVar12, 7));
                            break;
                        case 15:
                            ro roVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(roVar13)) {
                                cd0 cd0Var = new cd0(4);
                                cd0Var.b0 = -roVar13.t0;
                                TLRPC.ChatFull chatFull5 = roVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        cd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                cd0Var.C0 = new ko(roVar13, 6);
                                roVar13.presentFragment(cd0Var);
                                break;
                            }
                            break;
                        case 16:
                            ro roVar14 = this.b;
                            long j112 = roVar14.t0;
                            org.telegram.ui.Cells.n8 n8Var72 = roVar14.E;
                            boolean z152 = n8Var72 != null && n8Var72.getVisibility() == 0;
                            fp fpVar = new fp(null);
                            fpVar.J = new ArrayList();
                            fpVar.K = new ArrayList();
                            fpVar.M = new ArrayList();
                            fpVar.Z = true;
                            fpVar.c0 = new ArrayList();
                            fpVar.l0 = new HashMap();
                            fpVar.n0 = new uo(fpVar, 5);
                            fpVar.q0 = false;
                            fpVar.W = j112;
                            fpVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = roVar14.v0;
                            fpVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    fpVar.i0 = tL_chatInviteExported;
                                } else {
                                    fpVar.X(false);
                                }
                            }
                            roVar14.presentFragment(fpVar);
                            break;
                        case 17:
                            ro roVar15 = this.b;
                            long j122 = roVar15.t0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.L = false;
                            spVar.M = false;
                            spVar.B = j122;
                            TLRPC.Chat chat222 = spVar.getMessagesController().getChat(Long.valueOf(j122));
                            spVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = roVar15.v0;
                            roVar15.presentFragment(spVar);
                            break;
                        case 18:
                            ro roVar16 = this.b;
                            fw0 fw0Var = new fw0(roVar16.t0);
                            fw0Var.v = new ko(roVar16, 4);
                            roVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            ro.Z(this.b);
                            break;
                        case 20:
                            ro roVar17 = this.b;
                            o60 o60Var = new o60(-roVar17.u0.id);
                            o60Var.c = roVar17.I0;
                            o60Var.i0 = roVar17;
                            roVar17.presentFragment(o60Var);
                            break;
                        case 21:
                            ro roVar18 = this.b;
                            roVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", roVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((roVar18.F0 || roVar18.u0.gigagroup) && !ChatObject.isCommunity(roVar18.u0)) ? 0 : 3);
                            rr rrVar3 = new rr(bundle4);
                            rrVar3.x0(roVar18.v0);
                            roVar18.presentFragment(rrVar3);
                            break;
                        case 22:
                            ro roVar19 = this.b;
                            rh0 rh0Var = new rh0(roVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = roVar19.v0;
                            rh0Var.g0(chatFull7, chatFull7.exported_invite);
                            roVar19.presentFragment(rh0Var);
                            break;
                        case 23:
                            ro roVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(roVar20.u0)) {
                                roVar20.presentFragment(new mg.s(roVar20.t0, roVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", roVar20.t0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.C = new ArrayList();
                                long j132 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j132;
                                TLRPC.ChatFull chatFull8 = roVar20.v0;
                                zpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j132));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                roVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            ro roVar21 = this.b;
                            roVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", roVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", roVar21.t0);
                            roVar21.presentFragment(new zn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context2);
            roVar2.b0 = y6Var2;
            u3Var.addView(y6Var2, k7.b6.n(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        roVar2.c = undoView;
        ldVar.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.cu cuVar6 = roVar2.v;
        TLRPC.User user3 = roVar2.A0;
        cuVar6.setText(Emoji.replaceEmoji(user3 != null ? ContactsController.formatName(user3) : roVar2.u0.title, roVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.cu cuVar7 = roVar2.v;
        cuVar7.setSelection(cuVar7.n());
        TLRPC.ChatFull chatFull4 = roVar2.v0;
        if (chatFull4 != null) {
            roVar2.B.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = roVar2.B0;
            if (userFull4 != null) {
                roVar2.B.setText(userFull4.about);
            }
        }
        roVar2.k0();
        roVar2.p0(true, false);
        return roVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.u0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z4;
        org.telegram.ui.Cells.n8 n8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z10 = true;
        long j10 = this.z0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.t0) {
                if (this.v0 == null && (editTextBoldCursor = this.B) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z11 = this.v0 == null;
                this.v0 = chatFull;
                f0();
                if (j10 != 0) {
                    this.D0 = false;
                } else {
                    if (!this.C0) {
                        TLRPC.ChatFull chatFull2 = this.v0;
                    }
                    TLRPC.ChatFull chatFull3 = this.v0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z4 = true;
                        this.D0 = z4;
                        n8Var = this.N;
                        if (n8Var != null) {
                            n8Var.getCheckBox().setIcon(this.D0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z4 = false;
                    this.D0 = z4;
                    n8Var = this.N;
                    if (n8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.u0) && !this.v0.hidden_prehistory) {
                    z10 = false;
                }
                this.G0 = z10;
                p0(false, false);
                if (z11) {
                    h0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatSwitchedForum) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.t0 != longValue) {
                return;
            }
            this.C0 = booleanValue;
            this.E0 = booleanValue2;
            org.telegram.ui.Cells.n8 n8Var2 = this.N;
            if (n8Var2 != null) {
                n8Var2.setChecked(booleanValue);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0) {
                k0();
            }
            if ((intValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                r0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.channelRightsUpdated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.t0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.w0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.x0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.y0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var == null || e5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.t0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.v0 = chatFull4;
                if (chatFull4 != null) {
                    this.H0 = chatFull4.available_reactions;
                }
                s0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.botStarsUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == j10) {
                    m0(getMessagesController().getUserFull(j10));
                    return;
                }
                return;
            } else {
                if (i10 == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i10 == NotificationCenter.dialogDeleted && (-this.t0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.e5 e5Var2 = this.parentLayout;
                    if (e5Var2 == null || e5Var2.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == j10) {
            if (this.k0 != null) {
                lh.b0 g10 = lh.b0.g(this.currentAccount);
                this.k0.setVisibility(g10.a(j10) ? 0 : 8);
                this.k0.u(lh.ja.X0(false, TextUtils.concat("XTR", lh.ja.J0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.n8 n8Var3 = this.i0;
                if (n8Var3 != null) {
                    n8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.P.setVisibility((this.k0.getVisibility() == 0 || this.j0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.j0 != null) {
                lh.b0 g11 = lh.b0.g(this.currentAccount);
                this.j0.setVisibility(g11.b(j10) ? 0 : 8);
                long i14 = g11.i(j10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i14 > 0) {
                    double d = i14 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        decimalFormat.setMinimumFractionDigits(2);
                        decimalFormat.setMaximumFractionDigits(3);
                        decimalFormat.setGroupingUsed(false);
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                    }
                }
                this.j0.u(spannableStringBuilder, true);
                org.telegram.ui.Cells.n8 n8Var4 = this.i0;
                if (n8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z10 = false;
                    }
                    n8Var4.setNeedDivider(z10);
                }
                LinearLayout linearLayout = this.P;
                if (this.k0.getVisibility() != 0 && this.j0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        if (this.s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z4) {
        org.telegram.ui.Components.cu cuVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.z0 != 0) {
            TLRPC.UserFull userFull = this.B0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.cu cuVar2 = this.v;
            if ((cuVar2 == null || this.A0.first_name.equals(cuVar2.getText().toString())) && ((editTextBoldCursor2 = this.B) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ko(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new ko(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.v0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.u0) || this.v0.hidden_prehistory == this.G0) && (((cuVar = this.v) == null || this.u0.title.equals(cuVar.getText().toString())) && (((editTextBoldCursor = this.B) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.C0 == this.u0.forum))) {
                return true;
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.O = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.F0) {
                    alertDialog$Builder2.a.Q = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder2.a.Q = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new ko(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new ko(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    public final void f0() {
        if (this.c0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.t0);
        TLRPC.ChatFull chatFull = this.v0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.c0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        qo qoVar = this.Y;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qoVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.n8 n8Var = this.R;
        if (n8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(n8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.cu cuVar = this.v;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cuVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Z, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 4, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i17 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.n8 n8Var2 = this.H;
        if (n8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(n8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.n8 n8Var3 = this.X;
        if (n8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(n8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.t0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new jo(this, 0));
    }

    public final void i0() {
        this.s.o(this.s0 != null, new lo(this, 0), new x5(this, 5), 0);
        this.O0.K(0);
        this.O0.N(43);
        this.Y.e.d();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.cu cuVar;
        String str;
        String str2;
        if (this.K0 || (cuVar = this.v) == null) {
            return;
        }
        if (cuVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.K0 = true;
        int i10 = 0;
        int i11 = 3;
        String str3 = "";
        if (this.A0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.A0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.A0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.B0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.B;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.B.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new lh.w(this, getConnectionsManager().sendRequest(setbotinfo, new no(i10, this, setbotinfo)), i11));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.u0) && (!this.G0 || this.C0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.t0, this, new ko(this, 5));
            return;
        }
        if (this.v0 != null && ChatObject.isChannel(this.u0)) {
            TLRPC.ChatFull chatFull = this.v0;
            boolean z4 = chatFull.hidden_prehistory;
            boolean z10 = this.G0;
            if (z4 != z10) {
                chatFull.hidden_prehistory = z10;
                getMessagesController().toggleChannelInvitesHistory(this.t0, this.G0);
            }
        }
        if (this.s.h()) {
            this.J0 = true;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.b = d2Var;
            d2Var.setOnCancelListener(new kg(this, r0));
            this.b.show();
            return;
        }
        if (!this.u0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.t0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.v0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.B;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.t0, this.B.getText().toString(), this.v0);
        }
        boolean z11 = this.C0;
        TLRPC.Chat chat = this.u0;
        if (z11 != chat.forum || this.E0 != chat.forum_tabs) {
            r0 = this.E0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.t0, this.C0, this.E0);
            if (this.C0 && !this.E0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                while (i10 < fragmentStack.size()) {
                    if ((fragmentStack.get(i10) instanceof zn) && ((zn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.t0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.t0);
                        org.telegram.ui.ActionBar.e5 parentLayout = getParentLayout();
                        HashSet hashSet = sf1.k1;
                        ((ActionBarLayout) parentLayout).c(i10, sf1.E0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                    i10++;
                }
            }
            if (r0 != 0) {
                q0();
            }
        }
        finishFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        boolean z4;
        if (this.e == null || this.L0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.t0));
        long j10 = this.z0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.A0 = user;
        this.u0 = chat;
        org.telegram.ui.Components.z8 z8Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(z8Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.s0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, z8Var);
            if (forUserOrChat != null) {
                z4 = true;
                if (this.Y != null) {
                    if (z4 || this.s.h()) {
                        this.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.O0 == null) {
                        this.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.Y.e.setAnimation(this.O0);
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    PhotoViewer.t1().y0();
                }
                if (this.W == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.u0)) {
                    this.W.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z4 = false;
        if (this.Y != null) {
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().y0();
        }
        if (this.W == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.l5 n10;
        this.v0 = chatFull;
        if (chatFull != null) {
            if (this.u0 == null) {
                this.u0 = getMessagesController().getChat(Long.valueOf(this.t0));
            }
            this.G0 = !ChatObject.isChannel(this.u0) || this.v0.hidden_prehistory;
            this.H0 = this.v0.available_reactions;
            ArrayList arrayList = this.M0;
            arrayList.clear();
            TLRPC.Chat chat = this.u0;
            TLRPC.ChatFull chatFull2 = this.v0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i10);
                        i10++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                n10 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, org.telegram.ui.Components.l5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.l5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.l5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.l5 m9 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, org.telegram.ui.Components.l5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m9);
                            m9.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.W != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.u0)) {
                this.W.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.B0 = userFull;
        if (userFull != null) {
            if (this.A0 == null) {
                long j10 = this.z0;
                this.A0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.n8 n8Var = this.l0;
            if (n8Var != null) {
                n8Var.f(45, this.B0 == null, true);
                TLRPC.UserFull userFull2 = this.B0;
                if (userFull2 != null) {
                    this.l0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.n8 n8Var2 = this.r0;
            if (n8Var2 != null) {
                TLRPC.UserFull userFull3 = this.B0;
                n8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.z8 z8Var = this.q0;
            if (z8Var != null) {
                TLRPC.UserFull userFull4 = this.B0;
                z8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void n0(boolean z4, boolean z10) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z10) {
            if (z4) {
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                this.f.setAlpha(1.0f);
                this.f.setVisibility(0);
                return;
            }
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            this.f.setAlpha(0.0f);
            this.f.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.h = animatorSet2;
        if (z4) {
            this.n.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<eg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<eg.i0, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new dg.w2(21, this, z4));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.n8 n8Var;
        org.telegram.ui.Cells.n8 n8Var2;
        ip0 ip0Var;
        int v02;
        ArrayList<Integer> arrayList;
        so0 so0Var = this.I;
        if (so0Var != null) {
            TLRPC.Chat chat = this.u0;
            org.telegram.ui.Cells.n8 n8Var3 = this.K;
            boolean z4 = (n8Var3 != null && n8Var3.getVisibility() == 0) || ((n8Var = this.N) != null && n8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.u0) && ChatObject.hasAdminRights(this.u0)) || ((n8Var2 = this.J) != null && n8Var2.getVisibility() == 0));
            Paint paint = so0Var.n;
            int i10 = so0Var.a;
            org.telegram.ui.ActionBar.f6 f6Var = so0Var.d;
            if (chat == null) {
                return;
            }
            so0Var.v = z4;
            so0Var.r = new org.telegram.ui.Components.k01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            ip0 ip0Var2 = so0Var.w;
            if (ip0Var2 != null) {
                ip0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = ip0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                so0Var.w = new ip0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    ip0Var = ip0.c(i10, ChatObject.getProfileColorId(chat));
                    ip0Var.a = AndroidUtilities.dp(11.0f);
                    ip0Var.d();
                } else {
                    ip0Var = null;
                }
                so0Var.w = ip0Var;
            }
            ip0 ip0Var3 = so0Var.w;
            if (ip0Var3 != null) {
                ip0Var3.e(so0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                so0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i13));
                ip0 ip0Var4 = new ip0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                ip0Var4.a = AndroidUtilities.dp(11.0f);
                ip0Var4.d();
                so0Var.x = ip0Var4;
                ip0Var4.e(so0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.j6.r8[colorId];
                so0Var.s = i14;
                v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    so0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.j6.r8[0];
                    so0Var.s = i15;
                    v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
                }
            }
            so0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
            ip0 a10 = ip0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            so0Var.x = a10;
            a10.e(so0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.cu cuVar = this.v;
        if (cuVar == null || !cuVar.e) {
            return e0(z4);
        }
        if (!z4) {
            return false;
        }
        cuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
    
        if (java.lang.Math.max(r2 == null ? 0 : r2.participants_count, r1.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.t0;
        long j11 = this.z0;
        boolean z4 = true;
        if (j10 == 0) {
            TLRPC.User user = j11 == 0 ? null : getMessagesController().getUser(Long.valueOf(j11));
            this.A0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j11);
                this.A0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.A0, true);
                    if (this.B0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.B0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.u0;
            org.telegram.ui.Components.z8 z8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.x40 x40Var = this.s;
            x40Var.a = this;
            x40Var.b = this;
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            if (this.v0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.t0));
        this.u0 = chat2;
        if (chat2 == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.t0);
            this.u0 = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.u0, true);
                if (this.v0 == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.t0, ChatObject.isChannel(this.u0), new CountDownLatch(1), false, false);
                    this.v0 = loadChatInfo;
                }
            }
            return false;
        }
        chat = this.u0;
        org.telegram.ui.Components.z8 z8Var2 = this.r;
        if (chat == null) {
            this.w0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.x0 = TLRPC.TL_chatBannedRights.clone(this.u0.banned_rights);
            this.y0 = TLRPC.TL_chatBannedRights.clone(this.u0.default_banned_rights);
            z8Var2.n(5L, this.u0.title, null);
            this.F0 = ChatObject.isChannel(this.u0) && !this.u0.megagroup;
            TLRPC.Chat chat3 = this.u0;
            boolean z10 = chat3.forum;
            this.C0 = z10;
            this.E0 = chat3.forum_tabs;
            if (j11 == 0) {
                if (!z10) {
                    TLRPC.ChatFull chatFull = this.v0;
                }
                TLRPC.ChatFull chatFull2 = this.v0;
                if (chatFull2 != null) {
                }
                this.D0 = z4;
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
                getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
            }
            z4 = false;
            this.D0 = z4;
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            z8Var2.n(5L, this.A0.first_name, null);
            this.F0 = false;
            this.C0 = false;
            this.E0 = false;
            this.D0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.A0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.x40 x40Var2 = this.s;
        x40Var2.a = this;
        x40Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.v0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.x40 x40Var = this.s;
        if (x40Var != null) {
            x40Var.e();
        }
        if (this.u0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.A0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.cu cuVar = this.v;
        if (cuVar != null) {
            cuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        dg.u3 u3Var = this.w;
        if (u3Var != null) {
            u3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.M0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.l5) obj).p(null);
        }
        org.telegram.ui.Components.cu cuVar = this.v;
        if (cuVar != null) {
            cuVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s.j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.cu cuVar = this.v;
        if (cuVar != null) {
            cuVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.s.l();
    }

    public final void p0(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        TLRPC.ChatFull chatFull;
        int i14;
        String str2;
        String string;
        org.telegram.ui.Cells.n8 n8Var;
        org.telegram.ui.Cells.n8 n8Var2;
        org.telegram.ui.Cells.n8 n8Var3;
        org.telegram.ui.Cells.n8 n8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.n8 n8Var5;
        org.telegram.ui.Cells.n8 n8Var6;
        org.telegram.ui.Cells.n8 n8Var7;
        org.telegram.ui.Cells.n8 n8Var8;
        org.telegram.ui.Cells.n8 n8Var9;
        TLRPC.Chat chat;
        if (z4 && (chat = getMessagesController().getChat(Long.valueOf(this.t0))) != null) {
            this.u0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.u0);
        org.telegram.ui.Cells.z8 z8Var = this.M;
        if (z8Var != null) {
            z8Var.setVisibility((this.F != null || ((n8Var7 = this.G) != null && n8Var7.getVisibility() == 0) || (((n8Var8 = this.K) != null && n8Var8.getVisibility() == 0) || ((n8Var9 = this.E) != null && n8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.n8 n8Var10 = this.V;
        if (n8Var10 != null) {
            n8Var10.setVisibility(ChatObject.isChannel(this.u0) ? 0 : 8);
        }
        org.telegram.ui.Cells.n8 n8Var11 = this.G;
        if (n8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.v0;
            if (chatFull2 == null || (!this.F0 && chatFull2.linked_chat_id == 0)) {
                n8Var11.setVisibility(8);
            } else {
                n8Var11.setVisibility(0);
                if (this.v0.linked_chat_id == 0) {
                    this.G.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.v0.linked_chat_id));
                    if (chat2 == null) {
                        this.G.setVisibility(8);
                    } else if (this.F0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.G.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.G.s(LocaleController.getString("Discussion", R.string.Discussion), vh.w2.e("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.n8 n8Var12 = this.G;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.n8 n8Var13 = this.N;
                            n8Var12.s(string2, str4, false, i16, n8Var13 != null && n8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.n8 n8Var14 = this.G;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String e = vh.w2.e("@", publicUsername2);
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.n8 n8Var15 = this.N;
                            n8Var14.s(string3, e, false, i17, n8Var15 != null && n8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.n8 n8Var16 = this.E;
        if (n8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.v0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                n8Var16.setVisibility(8);
            } else {
                n8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.v0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.E.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z10, true);
                } else {
                    this.E.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z10, true);
                }
            }
        }
        if (this.F != null) {
            TLRPC.ChatFull chatFull4 = this.v0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z12 = this.u0.noforwards;
                if (this.F0) {
                    if (isPublic) {
                        i15 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z12) {
                        i15 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i15 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i15);
                } else {
                    if (isPublic) {
                        i14 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z12) {
                        i14 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i14);
                }
                String str5 = string;
                if (this.F0) {
                    org.telegram.ui.Cells.n8 n8Var17 = this.F;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i18 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.n8 n8Var18 = this.K;
                    n8Var17.s(string4, str5, false, i18, (n8Var18 != null && n8Var18.getVisibility() == 0) || ((n8Var3 = this.G) != null && n8Var3.getVisibility() == 0) || ((n8Var4 = this.N) != null && n8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.n8 n8Var19 = this.F;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i19 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.n8 n8Var20 = this.K;
                    n8Var19.s(string5, str5, false, i19, (n8Var20 != null && n8Var20.getVisibility() == 0) || ((n8Var = this.G) != null && n8Var.getVisibility() == 0) || ((n8Var2 = this.N) != null && n8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(android.support.v4.media.a.r(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.u0));
                org.telegram.ui.Cells.n8 n8Var21 = this.F;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i20 = R.drawable.msg_channel;
                org.telegram.ui.Cells.n8 n8Var22 = this.K;
                n8Var21.s(string7, string6, false, i20, (n8Var22 != null && n8Var22.getVisibility() == 0) || ((n8Var5 = this.G) != null && n8Var5.getVisibility() == 0) || ((n8Var6 = this.N) != null && n8Var6.getVisibility() == 0));
            }
        }
        if (this.K != null) {
            if (!this.G0 || this.C0) {
                i13 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i13 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.K.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i13), z10, R.drawable.msg_discuss, this.N != null);
            this.K.setEnabled(!this.C0);
            boolean z13 = (this.C0 || isPublic || ((chatFull = this.v0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.P0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.K.getAlpha() <= 0.0f && !z13) {
                this.K.setVisibility(8);
                o0();
            } else if (this.K.getVisibility() != 0 || this.K.getAlpha() < 1.0f || !z13) {
                ArrayList arrayList = new ArrayList();
                boolean z14 = false;
                for (int i21 = 0; i21 < this.C.getChildCount(); i21++) {
                    if (!z14 && this.C.getChildAt(i21) == this.K) {
                        z14 = true;
                    } else if (z14) {
                        arrayList.add(this.C.getChildAt(i21));
                    }
                }
                boolean z15 = false;
                for (int i22 = 0; i22 < this.w.getChildCount(); i22++) {
                    if (!z15 && this.w.getChildAt(i22) == this.C) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.w.getChildAt(i22));
                    }
                }
                if (this.K.getVisibility() != 0) {
                    this.K.setAlpha(0.0f);
                    this.K.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.K.setVisibility(0);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    ((View) arrayList.get(i23)).setTranslationY((1.0f - this.K.getAlpha()) * (-this.K.getHeight()));
                }
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K.getAlpha(), z13 ? 1.0f : 0.0f);
                    this.P0 = ofFloat;
                    ofFloat.addUpdateListener(new ag.a(9, this, arrayList));
                    this.P0.addListener(new androidx.fragment.app.g(this, z13, arrayList, 5));
                    this.P0.setDuration(320L);
                    this.P0.setInterpolator(org.telegram.ui.Components.mr.h);
                    this.P0.start();
                } else {
                    this.K.setAlpha(z13 ? 1.0f : 0.0f);
                    this.K.setTranslationY(((-r5.getHeight()) / 2.0f) * (z13 ? 0.0f : 1.0f));
                    this.K.setScaleY(((z13 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.K.setVisibility(z13 ? 0 : 8);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY(0.0f);
                    }
                    this.P0 = null;
                }
            }
        }
        if (this.Q != null) {
            if (this.v0 != null) {
                org.telegram.ui.Cells.n8 n8Var23 = this.R;
                if (n8Var23 != null) {
                    if (n8Var23.getParent() == null) {
                        this.O.addView(this.R, this.O.indexOfChild(this.Q) + 1, k7.b6.n(-1, -2));
                    }
                    this.R.setVisibility(this.v0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.F0 || ChatObject.isCommunity(this.u0)) {
                    if (ChatObject.isChannel(this.u0)) {
                        this.Q.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.v0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.Q.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.v0.participants.participants.size())), false, R.drawable.msg_groups, this.R.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.u0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i25 = this.C0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.u0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i10 = rr.n0(tL_chatBannedRights) + i26;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.u0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.C0 && !tL_chatBannedRights2.manage_topics) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i10++;
                            }
                            i11 = i25;
                        } else {
                            i10 = i25;
                            i11 = i10;
                        }
                        z11 = z10;
                        this.U.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z11, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.n8 n8Var24 = this.U;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.v0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i27 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.n8 n8Var25 = this.V;
                        n8Var24.s(string8, format, false, i27, n8Var25 != null && n8Var25.getVisibility() == 0);
                        z11 = z10;
                    }
                    org.telegram.ui.Cells.n8 n8Var26 = this.R;
                    if (n8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.v0.requests_pending));
                        int i28 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.n8 n8Var27 = this.V;
                        n8Var26.s(string9, format2, false, i28, n8Var27 != null && n8Var27.getVisibility() == 0);
                    }
                } else {
                    this.Q.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.v0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.n8 n8Var28 = this.U;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.v0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i29 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.n8 n8Var29 = this.V;
                    n8Var28.s(string10, format3, false, i29, n8Var29 != null && n8Var29.getVisibility() == 0);
                    z11 = z10;
                }
                org.telegram.ui.Cells.n8 n8Var30 = this.T;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.u0)) {
                    i12 = this.v0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.v0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i30 = 0;
                        for (int i31 = 0; i31 < size; i31++) {
                            TLRPC.ChatParticipant chatParticipant = this.v0.participants.participants.get(i31);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i30++;
                            }
                        }
                        i12 = i30;
                    }
                }
                n8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z11 = z10;
                if (!this.F0 || ChatObject.isCommunity(this.u0)) {
                    org.telegram.ui.Cells.n8 n8Var31 = this.Q;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i32 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.n8 n8Var32 = this.V;
                    n8Var31.m(i32, string12, n8Var32 != null && n8Var32.getVisibility() == 0);
                    if (this.u0.gigagroup) {
                        org.telegram.ui.Cells.n8 n8Var33 = this.U;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i33 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.n8 n8Var34 = this.V;
                        n8Var33.m(i33, string13, n8Var34 != null && n8Var34.getVisibility() == 0);
                    } else {
                        this.U.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.Q.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.n8 n8Var35 = this.U;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i34 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.n8 n8Var36 = this.V;
                    n8Var35.m(i34, string14, n8Var36 != null && n8Var36.getVisibility() == 0);
                }
                this.T.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.L.setVisibility(ChatObject.canChangeChatInfo(this.u0) ? 0 : 8);
            s0(z11);
            if (this.v0 == null || !ChatObject.canUserDoAdminAction(this.u0, 3) || (isPublic && this.u0.creator)) {
                this.S.setVisibility(8);
            } else if (this.v0.invitesCount > 0) {
                this.S.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.v0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.S.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.H != null) {
            t0(null);
        }
    }

    public final void q0() {
        qy qyVar;
        lx lxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof zn) {
                zn znVar = (zn) fragmentStack.get(i10);
                if (znVar.getArguments().getLong("chat_id") == this.t0) {
                    ((ActionBarLayout) getParentLayout()).a0(znVar, false);
                    znVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, znVar);
                    if (!this.E0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.t0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new sf1(bundle));
                        i10++;
                    }
                }
            } else if (this.E0 && (fragmentStack.get(i10) instanceof sf1)) {
                sf1 sf1Var = (sf1) fragmentStack.get(i10);
                if (sf1Var.g() != null && sf1Var.g().id == this.t0) {
                    ((ActionBarLayout) getParentLayout()).a0(sf1Var, false);
                    i10--;
                }
            } else if (this.E0 && (fragmentStack.get(i10) instanceof qy) && (qyVar = (qy) fragmentStack.get(i10)) != null && (lxVar = qyVar.C3) != null && lxVar.c()) {
                qyVar.C3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.i0 == null) {
            return;
        }
        if (this.A0.usernames.size() <= 1) {
            this.i0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.A0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.A0.usernames;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i11);
            i11++;
            if (tL_username.active) {
                i10++;
            }
        }
        this.i0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.A0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x40 x40Var = this.s;
        if (x40Var != null) {
            x40Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z4) {
        String str;
        String str2;
        int i10;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.t0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.u0);
        TLRPC.ChatReactions chatReactions = this.H0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string;
                this.L.s(LocaleController.getString(R.string.Reactions), str, z4, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i11 = 0;
            while (i10 < tL_chatReactionsSome.reactions.size()) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i11++;
                    }
                } else {
                    i10 = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i10 + 1;
                    i11++;
                }
            }
            if (isChannelAndNotMegaGroup) {
                if (chatFull != null && chatFull.paid_reactions_available) {
                    i11++;
                }
                str2 = i11 == 0 ? LocaleController.getString(R.string.ReactionsOff) : String.valueOf(i11);
            } else {
                int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i11);
                str2 = min == 0 ? LocaleController.getString(R.string.ReactionsOff) : LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
            }
        } else {
            str2 = LocaleController.getString(R.string.ReactionsAll);
        }
        str = str2;
        this.L.s(LocaleController.getString(R.string.Reactions), str, z4, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x40 x40Var = this.s;
        if (x40Var != null && (str = x40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.cu cuVar = this.v;
        if (cuVar != null) {
            String obj = cuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l10) {
        TLRPC.Chat chat = this.u0;
        if (chat == null || this.H == null) {
            return;
        }
        long j10 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.H.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.u0.linked_monoforum_id));
        if (l10 != null) {
            j10 = l10.longValue();
        } else if (chat2 != null) {
            j10 = chat2.send_paid_messages_stars;
        }
        this.H.s(LocaleController.getString(R.string.PostSuggestions), lh.ja.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ void P() {
    }
}
