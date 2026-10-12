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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class zo extends org.telegram.ui.ActionBar.m2 implements org.telegram.ui.Components.h50, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public EditTextBoldCursor E;
    public TLRPC.UserFull E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.b7 G;
    public boolean G0;
    public org.telegram.ui.Cells.r8 H;
    public boolean H0;
    public org.telegram.ui.Cells.r8 I;
    public boolean I0;
    public org.telegram.ui.Cells.r8 J;
    public boolean J0;
    public org.telegram.ui.Cells.r8 K;
    public TLRPC.ChatReactions K0;
    public lp0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.r8 M;
    public boolean M0;
    public org.telegram.ui.Cells.r8 N;
    public boolean N0;
    public org.telegram.ui.Cells.r8 O;
    public boolean O0;
    public org.telegram.ui.Cells.e9 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.r8 Q;
    public final wo Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.yj0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.r8 T;
    public org.telegram.ui.Cells.r8 U;
    public org.telegram.ui.Cells.r8 V;
    public org.telegram.ui.Cells.r8 W;
    public org.telegram.ui.Cells.r8 X;
    public org.telegram.ui.Cells.r8 Y;
    public org.telegram.ui.Cells.r8 Z;
    public org.telegram.ui.ActionBar.u0 a;
    public org.telegram.ui.Cells.r8 a0;
    public org.telegram.ui.ActionBar.a2 b;
    public xo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ca d0;
    public bi.k5 e;
    public org.telegram.ui.Cells.b7 e0;
    public di.p6 f;
    public org.telegram.ui.Cells.r8 f0;
    public org.telegram.ui.Cells.r8 g0;
    public AnimatorSet h;
    public hi.b h0;
    public org.telegram.ui.Cells.e9 i0;
    public org.telegram.ui.Cells.r8 j0;
    public org.telegram.ui.Cells.e9 k0;
    public org.telegram.ui.Cells.r8 l0;
    public org.telegram.ui.Cells.r8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.r8 n0;
    public org.telegram.ui.Cells.r8 o0;
    public org.telegram.ui.Cells.r8 p0;
    public org.telegram.ui.Cells.r8 q0;
    public final org.telegram.ui.Components.k9 r;
    public org.telegram.ui.Cells.r8 r0;
    public final org.telegram.ui.Components.i50 s;
    public org.telegram.ui.Cells.e9 s0;
    public org.telegram.ui.Cells.e9 t0;
    public org.telegram.ui.Cells.r8 u0;
    public org.telegram.ui.Components.vu v;
    public TLRPC.FileLocation v0;
    public ee w;
    public long w0;
    public org.telegram.ui.Components.ap0 x;
    public TLRPC.Chat x0;
    public LinearLayout y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public zo(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new wo(this);
        this.r = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.i50(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.i50((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(zo zoVar, FrameLayout frameLayout, View view) {
        if (!zoVar.G0) {
            TLRPC.ChatFull chatFull = zoVar.y0;
            org.telegram.ui.Components.zc.a0(zoVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", zoVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -zoVar.w0;
        qz qzVar = new qz(null);
        qzVar.a = j10;
        qzVar.setResourceProvider(zoVar.resourceProvider);
        boolean z10 = zoVar.F0;
        boolean z11 = zoVar.H0;
        bi.f0 f0Var = new bi.f0(8, zoVar, view);
        qzVar.c = z10;
        qzVar.d = z11;
        qzVar.f = f0Var;
        zoVar.presentFragment(qzVar);
    }

    public static /* synthetic */ void V(zo zoVar) {
        zoVar.v0 = null;
        long j10 = zoVar.C0;
        if (j10 == 0) {
            MessagesController.getInstance(zoVar.currentAccount).changeChatAvatar(zoVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = zoVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            zoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new po(zoVar, 2));
        }
        zoVar.n0(false, true);
        bi.k5 k5Var = zoVar.e;
        org.telegram.ui.Components.k9 k9Var = zoVar.r;
        Object obj = zoVar.D0;
        if (obj == null) {
            obj = zoVar.x0;
        }
        k5Var.h(null, null, k9Var, obj);
        zoVar.R0.M(0);
        zoVar.b0.e.d();
    }

    public static void X(zo zoVar) {
        int i10 = zoVar.currentAccount;
        long j10 = zoVar.C0;
        TL_bots.botVerifierSettings botverifiersettings = zoVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle d = org.telegram.messenger.yh.d(16, "onlySelect", "dialogsType", true);
        d.putBoolean("resetDelegate", false);
        yy yyVar = new yy(d);
        yyVar.setCurrentAccount(i10);
        yyVar.C2 = new fi.t1(yyVar, i10, j10, botverifiersettings);
        U.presentFragment(yyVar);
    }

    public static void Y(zo zoVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        a2Var.dismiss();
        if (zoVar.getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(35, zoVar.currentAccount, zoVar.getParentActivity(), zoVar, zoVar.getResourceProvider());
        j0Var.H1(canApplyBoost);
        j0Var.G1(tL_premium_boostsStatus, true);
        j0Var.I1(j10);
        TLRPC.Chat chat = zoVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new fc(27, zoVar, chat);
        }
        zoVar.showDialog(j0Var);
    }

    public static void Z(zo zoVar) {
        hd hdVar = new hd(-zoVar.x0.id);
        hdVar.l0 = zoVar;
        zoVar.presentFragment(hdVar);
        MessagesController.getInstance(zoVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(zoVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(zo zoVar) {
        zoVar.O0 = true;
        NotificationCenter.getInstance(zoVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        j10 j10Var = new j10(10);
        j10Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        j10Var.f = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lj, false);
        spannableStringBuilder.setSpan(j10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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

    @Override // org.telegram.ui.Components.h50
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.h50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.h50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0962  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v28 */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r21;
        Context context2;
        long j10;
        od odVar;
        ee eeVar;
        final int i10;
        final zo zoVar;
        int i11;
        ee eeVar2;
        boolean z10;
        CharSequence Y0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final zo zoVar2;
        boolean z11;
        String format;
        int i12;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        org.telegram.ui.Cells.r8 r8Var3;
        org.telegram.ui.Cells.r8 r8Var4;
        org.telegram.ui.Cells.r8 r8Var5;
        org.telegram.ui.Cells.r8 r8Var6;
        TLRPC.ChatFull chatFull;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i13 = 1;
        org.telegram.ui.Components.vu vuVar = this.v;
        if (vuVar != null) {
            vuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i14 = 2;
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, i14));
        od odVar2 = new od(i13, context, this);
        odVar2.setOnTouchListener(new ci.d(9));
        this.fragmentView = odVar2;
        odVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a7));
        ee eeVar3 = new ee(context);
        this.w = eeVar3;
        org.telegram.ui.Components.ap0 ap0Var = new org.telegram.ui.Components.ap0(context, this.w, this.resourceProvider, false);
        this.x = ap0Var;
        ap0Var.setFillViewport(true);
        odVar2.addView(this.x, w7.a6.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(eeVar3, new FrameLayout.LayoutParams(-1, -2));
        eeVar3.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6));
        eeVar3.addView(this.d, w7.a6.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.a6.n(-1, -2));
        bi.k5 k5Var = new bi.k5(this, context, 6);
        this.e = k5Var;
        k5Var.setRoundRadius(this.F0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i15 = 5;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            bi.k5 k5Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(k5Var2, w7.a6.a(64.0f, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f, 64, (z12 ? 5 : 3) | 48));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            di.p6 p6Var = new di.p6(this, context, paint, i15);
            this.f = p6Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(p6Var, w7.a6.a(64.0f, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f, 64, (z13 ? 5 : 3) | 48));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, w7.a6.a(64.0f, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f, 64, (z14 ? 5 : 3) | 48));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j11 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j11 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j11));
                                if (user2 == null) {
                                    TLRPC.Chat chat = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                                        int i16 = chatPhoto2.dc_id;
                                        if (i16 != 0) {
                                            chatPhoto2.photo_big.dc_id = i16;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i17 = userProfilePhoto2.dc_id;
                                        if (i17 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i17;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j12 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var7 = zoVar14.H;
                            boolean z15 = r8Var7 != null && r8Var7.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j12;
                            npVar.n0 = z15;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z16 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat2 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat2;
                            if (ChatObject.isChannel(chat2) && !aqVar.f.megagroup) {
                                z16 = true;
                            }
                            aqVar.s = z16;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i18 = 0; i18 < tL_chatReactionsSome.reactions.size(); i18++) {
                                            if (tL_chatReactionsSome.reactions.get(i18) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i18)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
        } else {
            bi.k5 k5Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(k5Var3, w7.a6.a(64.0f, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f, 64, (z15 ? 5 : 3) | 48));
        }
        org.telegram.ui.Components.vu vuVar2 = new org.telegram.ui.Components.vu(context, odVar2, this);
        this.v = vuVar2;
        long j11 = this.C0;
        if (j11 != 0) {
            vuVar2.setHint(LocaleController.getString(R.string.BotName));
            r21 = 0;
        } else if (this.I0) {
            r21 = 0;
            vuVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            r21 = 0;
            vuVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.vu vuVar3 = this.v;
        TLRPC.Chat chat = this.x0;
        vuVar3.setEnabled((chat != null || ChatObject.canChangeChatInfo(chat)) ? true : r21);
        org.telegram.ui.Components.vu vuVar4 = this.v;
        vuVar4.setFocusable(vuVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new n0(this, i14));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r21] = new InputFilter.LengthFilter(128);
        this.v.setFilters(inputFilterArr);
        org.telegram.ui.Components.vu vuVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(vuVar5, w7.a6.a(-2.0f, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f, -1, 16));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        eeVar3.addView(this.y, w7.a6.n(-1, -2));
        final int i16 = 12;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            xo xoVar = new xo(context);
            this.b0 = xoVar;
            xoVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(r21));
            this.b0.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat2 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat2.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i17 = userProfilePhoto2.dc_id;
                                        if (i17 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i17;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j12 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var7 = zoVar14.H;
                            boolean z152 = r8Var7 != null && r8Var7.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j12;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat22 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat22;
                            if (ChatObject.isChannel(chat22) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i18 = 0; i18 < tL_chatReactionsSome.reactions.size(); i18++) {
                                            if (tL_chatReactionsSome.reactions.get(i18) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i18)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.b0, w7.a6.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.E.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i17 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17));
        int i18 = r21;
        this.E.setPadding(i18, i18, i18, AndroidUtilities.dp(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(LocaleController.isRTL ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.D0 != null || ChatObject.canChangeChatInfo(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.E.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.E.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i17));
        this.E.setCursorSize(AndroidUtilities.dp(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.y.addView(this.E, w7.a6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, w7.a6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new na(this, 2));
        this.E.addTextChangedListener(new rd(1));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context);
        this.G = b7Var;
        eeVar3.addView(b7Var, w7.a6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(1);
        eeVar3.addView(this.F, w7.a6.n(-1, -2));
        TLRPC.Chat chat2 = this.x0;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.y0) == null || chatFull3.can_set_location)) {
                org.telegram.ui.Cells.r8 r8Var7 = new org.telegram.ui.Cells.r8(context);
                this.H = r8Var7;
                r8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(true));
                this.F.addView(this.H, w7.a6.n(-1, -2));
                final int i19 = 15;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ zo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                zo zoVar3 = this.b;
                                zoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", zoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                yr yrVar = new yr(bundle);
                                yrVar.x0(zoVar3.y0);
                                zoVar3.presentFragment(yrVar);
                                break;
                            case 1:
                                zo zoVar4 = this.b;
                                wo woVar = zoVar4.Q0;
                                long j112 = zoVar4.C0;
                                if (!zoVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                zo zoVar5 = this.b;
                                zoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", zoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yr yrVar2 = new yr(bundle2);
                                yrVar2.x0(zoVar5.y0);
                                zoVar5.presentFragment(yrVar2);
                                break;
                            case 3:
                                zo zoVar6 = this.b;
                                zoVar6.presentFragment(new fi0(zoVar6.w0));
                                break;
                            case 4:
                                zo zoVar7 = this.b;
                                zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                break;
                            case 5:
                                zo zoVar8 = this.b;
                                zoVar8.getClass();
                                zoVar8.presentFragment(new ac(zoVar8.x0));
                                break;
                            case 6:
                                zo zoVar9 = this.b;
                                zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                break;
                            case 7:
                                zo zoVar10 = this.b;
                                zoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", zoVar10.C0);
                                zoVar10.presentFragment(new va(bundle3));
                                break;
                            case 8:
                                zo zoVar11 = this.b;
                                zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                break;
                            case 9:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                zo.X(this.b);
                                break;
                            case 14:
                                zo zoVar12 = this.b;
                                org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                break;
                            case 15:
                                zo zoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                    nd0 nd0Var = new nd0(4);
                                    nd0Var.e0 = -zoVar13.w0;
                                    TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    nd0Var.F0 = new qo(zoVar13, 6);
                                    zoVar13.presentFragment(nd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                zo zoVar14 = this.b;
                                long j12 = zoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                np npVar = new np(null);
                                npVar.M = new ArrayList();
                                npVar.N = new ArrayList();
                                npVar.P = new ArrayList();
                                npVar.c0 = true;
                                npVar.f0 = new ArrayList();
                                npVar.o0 = new HashMap();
                                npVar.q0 = new cp(npVar, 5);
                                npVar.t0 = false;
                                npVar.Z = j12;
                                npVar.n0 = z152;
                                TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                npVar.Y = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        npVar.l0 = tL_chatInviteExported;
                                    } else {
                                        npVar.X(false);
                                    }
                                }
                                zoVar14.presentFragment(npVar);
                                break;
                            case 17:
                                zo zoVar15 = this.b;
                                long j13 = zoVar15.w0;
                                aq aqVar = new aq(null);
                                aqVar.v = new ArrayList();
                                boolean z162 = false;
                                aqVar.O = false;
                                aqVar.P = false;
                                aqVar.E = j13;
                                TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                aqVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                    z162 = true;
                                }
                                aqVar.s = z162;
                                aqVar.h = zoVar15.y0;
                                zoVar15.presentFragment(aqVar);
                                break;
                            case 18:
                                zo zoVar16 = this.b;
                                zw0 zw0Var = new zw0(zoVar16.w0);
                                zw0Var.v = new qo(zoVar16, 4);
                                zoVar16.presentFragment(zw0Var);
                                break;
                            case 19:
                                zo.Z(this.b);
                                break;
                            case 20:
                                zo zoVar17 = this.b;
                                x60 x60Var = new x60(-zoVar17.x0.id);
                                x60Var.c = zoVar17.L0;
                                x60Var.l0 = zoVar17;
                                zoVar17.presentFragment(x60Var);
                                break;
                            case 21:
                                zo zoVar18 = this.b;
                                zoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", zoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                yr yrVar3 = new yr(bundle4);
                                yrVar3.x0(zoVar18.y0);
                                zoVar18.presentFragment(yrVar3);
                                break;
                            case 22:
                                zo zoVar19 = this.b;
                                ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                zoVar19.presentFragment(ei0Var);
                                break;
                            case 23:
                                zo zoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                    zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", zoVar20.w0);
                                    hq hqVar = new hq(bundle5);
                                    hqVar.d = new ArrayList();
                                    hqVar.r = new ArrayList();
                                    hqVar.v = -1;
                                    hqVar.F = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    hqVar.c = j14;
                                    TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                    hqVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (hqVar.a == null) {
                                            hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        hqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            hqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            hqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            hqVar.w = 1;
                                        }
                                    }
                                    zoVar20.presentFragment(hqVar);
                                    break;
                                }
                            default:
                                zo zoVar21 = this.b;
                                zoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", zoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                zoVar21.presentFragment(new fo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull2 = this.y0) == null || chatFull2.can_set_username)) {
                org.telegram.ui.Cells.r8 r8Var8 = new org.telegram.ui.Cells.r8(context);
                this.I = r8Var8;
                r8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(true));
                this.F.addView(this.I, w7.a6.n(-1, -2));
                final int i20 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ zo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                zo zoVar3 = this.b;
                                zoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", zoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                yr yrVar = new yr(bundle);
                                yrVar.x0(zoVar3.y0);
                                zoVar3.presentFragment(yrVar);
                                break;
                            case 1:
                                zo zoVar4 = this.b;
                                wo woVar = zoVar4.Q0;
                                long j112 = zoVar4.C0;
                                if (!zoVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                zo zoVar5 = this.b;
                                zoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", zoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yr yrVar2 = new yr(bundle2);
                                yrVar2.x0(zoVar5.y0);
                                zoVar5.presentFragment(yrVar2);
                                break;
                            case 3:
                                zo zoVar6 = this.b;
                                zoVar6.presentFragment(new fi0(zoVar6.w0));
                                break;
                            case 4:
                                zo zoVar7 = this.b;
                                zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                break;
                            case 5:
                                zo zoVar8 = this.b;
                                zoVar8.getClass();
                                zoVar8.presentFragment(new ac(zoVar8.x0));
                                break;
                            case 6:
                                zo zoVar9 = this.b;
                                zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                break;
                            case 7:
                                zo zoVar10 = this.b;
                                zoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", zoVar10.C0);
                                zoVar10.presentFragment(new va(bundle3));
                                break;
                            case 8:
                                zo zoVar11 = this.b;
                                zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                break;
                            case 9:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                zo.X(this.b);
                                break;
                            case 14:
                                zo zoVar12 = this.b;
                                org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                break;
                            case 15:
                                zo zoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                    nd0 nd0Var = new nd0(4);
                                    nd0Var.e0 = -zoVar13.w0;
                                    TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    nd0Var.F0 = new qo(zoVar13, 6);
                                    zoVar13.presentFragment(nd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                zo zoVar14 = this.b;
                                long j12 = zoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                np npVar = new np(null);
                                npVar.M = new ArrayList();
                                npVar.N = new ArrayList();
                                npVar.P = new ArrayList();
                                npVar.c0 = true;
                                npVar.f0 = new ArrayList();
                                npVar.o0 = new HashMap();
                                npVar.q0 = new cp(npVar, 5);
                                npVar.t0 = false;
                                npVar.Z = j12;
                                npVar.n0 = z152;
                                TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                npVar.Y = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        npVar.l0 = tL_chatInviteExported;
                                    } else {
                                        npVar.X(false);
                                    }
                                }
                                zoVar14.presentFragment(npVar);
                                break;
                            case 17:
                                zo zoVar15 = this.b;
                                long j13 = zoVar15.w0;
                                aq aqVar = new aq(null);
                                aqVar.v = new ArrayList();
                                boolean z162 = false;
                                aqVar.O = false;
                                aqVar.P = false;
                                aqVar.E = j13;
                                TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                aqVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                    z162 = true;
                                }
                                aqVar.s = z162;
                                aqVar.h = zoVar15.y0;
                                zoVar15.presentFragment(aqVar);
                                break;
                            case 18:
                                zo zoVar16 = this.b;
                                zw0 zw0Var = new zw0(zoVar16.w0);
                                zw0Var.v = new qo(zoVar16, 4);
                                zoVar16.presentFragment(zw0Var);
                                break;
                            case 19:
                                zo.Z(this.b);
                                break;
                            case 20:
                                zo zoVar17 = this.b;
                                x60 x60Var = new x60(-zoVar17.x0.id);
                                x60Var.c = zoVar17.L0;
                                x60Var.l0 = zoVar17;
                                zoVar17.presentFragment(x60Var);
                                break;
                            case 21:
                                zo zoVar18 = this.b;
                                zoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", zoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                yr yrVar3 = new yr(bundle4);
                                yrVar3.x0(zoVar18.y0);
                                zoVar18.presentFragment(yrVar3);
                                break;
                            case 22:
                                zo zoVar19 = this.b;
                                ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                zoVar19.presentFragment(ei0Var);
                                break;
                            case 23:
                                zo zoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                    zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", zoVar20.w0);
                                    hq hqVar = new hq(bundle5);
                                    hqVar.d = new ArrayList();
                                    hqVar.r = new ArrayList();
                                    hqVar.v = -1;
                                    hqVar.F = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    hqVar.c = j14;
                                    TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                    hqVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (hqVar.a == null) {
                                            hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        hqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            hqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            hqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            hqVar.w = 1;
                                        }
                                    }
                                    zoVar20.presentFragment(hqVar);
                                    break;
                                }
                            default:
                                zo zoVar21 = this.b;
                                zoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", zoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                zoVar21.presentFragment(new fo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.x0) && ((this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) || (!this.I0 && ChatObject.canUserDoAdminAction(this.x0, 0)))) {
                org.telegram.ui.Cells.r8 r8Var9 = new org.telegram.ui.Cells.r8(context);
                this.J = r8Var9;
                r8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(true));
                this.F.addView(this.J, w7.a6.n(-1, -2));
                final int i21 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ zo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                zo zoVar3 = this.b;
                                zoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", zoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                yr yrVar = new yr(bundle);
                                yrVar.x0(zoVar3.y0);
                                zoVar3.presentFragment(yrVar);
                                break;
                            case 1:
                                zo zoVar4 = this.b;
                                wo woVar = zoVar4.Q0;
                                long j112 = zoVar4.C0;
                                if (!zoVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                zo zoVar5 = this.b;
                                zoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", zoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yr yrVar2 = new yr(bundle2);
                                yrVar2.x0(zoVar5.y0);
                                zoVar5.presentFragment(yrVar2);
                                break;
                            case 3:
                                zo zoVar6 = this.b;
                                zoVar6.presentFragment(new fi0(zoVar6.w0));
                                break;
                            case 4:
                                zo zoVar7 = this.b;
                                zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                break;
                            case 5:
                                zo zoVar8 = this.b;
                                zoVar8.getClass();
                                zoVar8.presentFragment(new ac(zoVar8.x0));
                                break;
                            case 6:
                                zo zoVar9 = this.b;
                                zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                break;
                            case 7:
                                zo zoVar10 = this.b;
                                zoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", zoVar10.C0);
                                zoVar10.presentFragment(new va(bundle3));
                                break;
                            case 8:
                                zo zoVar11 = this.b;
                                zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                break;
                            case 9:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                zo.X(this.b);
                                break;
                            case 14:
                                zo zoVar12 = this.b;
                                org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                break;
                            case 15:
                                zo zoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                    nd0 nd0Var = new nd0(4);
                                    nd0Var.e0 = -zoVar13.w0;
                                    TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    nd0Var.F0 = new qo(zoVar13, 6);
                                    zoVar13.presentFragment(nd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                zo zoVar14 = this.b;
                                long j12 = zoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                np npVar = new np(null);
                                npVar.M = new ArrayList();
                                npVar.N = new ArrayList();
                                npVar.P = new ArrayList();
                                npVar.c0 = true;
                                npVar.f0 = new ArrayList();
                                npVar.o0 = new HashMap();
                                npVar.q0 = new cp(npVar, 5);
                                npVar.t0 = false;
                                npVar.Z = j12;
                                npVar.n0 = z152;
                                TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                npVar.Y = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        npVar.l0 = tL_chatInviteExported;
                                    } else {
                                        npVar.X(false);
                                    }
                                }
                                zoVar14.presentFragment(npVar);
                                break;
                            case 17:
                                zo zoVar15 = this.b;
                                long j13 = zoVar15.w0;
                                aq aqVar = new aq(null);
                                aqVar.v = new ArrayList();
                                boolean z162 = false;
                                aqVar.O = false;
                                aqVar.P = false;
                                aqVar.E = j13;
                                TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                aqVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                    z162 = true;
                                }
                                aqVar.s = z162;
                                aqVar.h = zoVar15.y0;
                                zoVar15.presentFragment(aqVar);
                                break;
                            case 18:
                                zo zoVar16 = this.b;
                                zw0 zw0Var = new zw0(zoVar16.w0);
                                zw0Var.v = new qo(zoVar16, 4);
                                zoVar16.presentFragment(zw0Var);
                                break;
                            case 19:
                                zo.Z(this.b);
                                break;
                            case 20:
                                zo zoVar17 = this.b;
                                x60 x60Var = new x60(-zoVar17.x0.id);
                                x60Var.c = zoVar17.L0;
                                x60Var.l0 = zoVar17;
                                zoVar17.presentFragment(x60Var);
                                break;
                            case 21:
                                zo zoVar18 = this.b;
                                zoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", zoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                yr yrVar3 = new yr(bundle4);
                                yrVar3.x0(zoVar18.y0);
                                zoVar18.presentFragment(yrVar3);
                                break;
                            case 22:
                                zo zoVar19 = this.b;
                                ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                zoVar19.presentFragment(ei0Var);
                                break;
                            case 23:
                                zo zoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                    zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", zoVar20.w0);
                                    hq hqVar = new hq(bundle5);
                                    hqVar.d = new ArrayList();
                                    hqVar.r = new ArrayList();
                                    hqVar.v = -1;
                                    hqVar.F = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    hqVar.c = j14;
                                    TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                    hqVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (hqVar.a == null) {
                                            hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        hqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            hqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            hqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            hqVar.w = 1;
                                        }
                                    }
                                    zoVar20.presentFragment(hqVar);
                                    break;
                                }
                            default:
                                zo zoVar21 = this.b;
                                zoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", zoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                zoVar21.presentFragment(new fo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) {
                org.telegram.ui.Cells.r8 r8Var10 = new org.telegram.ui.Cells.r8(context);
                this.K = r8Var10;
                r8Var10.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
                this.K.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.a6.n(-1, -2));
                final int i22 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ zo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                zo zoVar3 = this.b;
                                zoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", zoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                yr yrVar = new yr(bundle);
                                yrVar.x0(zoVar3.y0);
                                zoVar3.presentFragment(yrVar);
                                break;
                            case 1:
                                zo zoVar4 = this.b;
                                wo woVar = zoVar4.Q0;
                                long j112 = zoVar4.C0;
                                if (!zoVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                zo zoVar5 = this.b;
                                zoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", zoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yr yrVar2 = new yr(bundle2);
                                yrVar2.x0(zoVar5.y0);
                                zoVar5.presentFragment(yrVar2);
                                break;
                            case 3:
                                zo zoVar6 = this.b;
                                zoVar6.presentFragment(new fi0(zoVar6.w0));
                                break;
                            case 4:
                                zo zoVar7 = this.b;
                                zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                break;
                            case 5:
                                zo zoVar8 = this.b;
                                zoVar8.getClass();
                                zoVar8.presentFragment(new ac(zoVar8.x0));
                                break;
                            case 6:
                                zo zoVar9 = this.b;
                                zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                break;
                            case 7:
                                zo zoVar10 = this.b;
                                zoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", zoVar10.C0);
                                zoVar10.presentFragment(new va(bundle3));
                                break;
                            case 8:
                                zo zoVar11 = this.b;
                                zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                break;
                            case 9:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                zo.X(this.b);
                                break;
                            case 14:
                                zo zoVar12 = this.b;
                                org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                break;
                            case 15:
                                zo zoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                    nd0 nd0Var = new nd0(4);
                                    nd0Var.e0 = -zoVar13.w0;
                                    TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    nd0Var.F0 = new qo(zoVar13, 6);
                                    zoVar13.presentFragment(nd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                zo zoVar14 = this.b;
                                long j12 = zoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                np npVar = new np(null);
                                npVar.M = new ArrayList();
                                npVar.N = new ArrayList();
                                npVar.P = new ArrayList();
                                npVar.c0 = true;
                                npVar.f0 = new ArrayList();
                                npVar.o0 = new HashMap();
                                npVar.q0 = new cp(npVar, 5);
                                npVar.t0 = false;
                                npVar.Z = j12;
                                npVar.n0 = z152;
                                TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                npVar.Y = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        npVar.l0 = tL_chatInviteExported;
                                    } else {
                                        npVar.X(false);
                                    }
                                }
                                zoVar14.presentFragment(npVar);
                                break;
                            case 17:
                                zo zoVar15 = this.b;
                                long j13 = zoVar15.w0;
                                aq aqVar = new aq(null);
                                aqVar.v = new ArrayList();
                                boolean z162 = false;
                                aqVar.O = false;
                                aqVar.P = false;
                                aqVar.E = j13;
                                TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                aqVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                    z162 = true;
                                }
                                aqVar.s = z162;
                                aqVar.h = zoVar15.y0;
                                zoVar15.presentFragment(aqVar);
                                break;
                            case 18:
                                zo zoVar16 = this.b;
                                zw0 zw0Var = new zw0(zoVar16.w0);
                                zw0Var.v = new qo(zoVar16, 4);
                                zoVar16.presentFragment(zw0Var);
                                break;
                            case 19:
                                zo.Z(this.b);
                                break;
                            case 20:
                                zo zoVar17 = this.b;
                                x60 x60Var = new x60(-zoVar17.x0.id);
                                x60Var.c = zoVar17.L0;
                                x60Var.l0 = zoVar17;
                                zoVar17.presentFragment(x60Var);
                                break;
                            case 21:
                                zo zoVar18 = this.b;
                                zoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", zoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                yr yrVar3 = new yr(bundle4);
                                yrVar3.x0(zoVar18.y0);
                                zoVar18.presentFragment(yrVar3);
                                break;
                            case 22:
                                zo zoVar19 = this.b;
                                ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                zoVar19.presentFragment(ei0Var);
                                break;
                            case 23:
                                zo zoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                    zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", zoVar20.w0);
                                    hq hqVar = new hq(bundle5);
                                    hqVar.d = new ArrayList();
                                    hqVar.r = new ArrayList();
                                    hqVar.v = -1;
                                    hqVar.F = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    hqVar.c = j14;
                                    TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                    hqVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (hqVar.a == null) {
                                            hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        hqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            hqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            hqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            hqVar.w = 1;
                                        }
                                    }
                                    zoVar20.presentFragment(hqVar);
                                    break;
                                }
                            default:
                                zo zoVar21 = this.b;
                                zoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", zoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                zoVar21.presentFragment(new fo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && ChatObject.canChangeChatInfo(this.x0)) {
                odVar = odVar2;
                j10 = j11;
                i11 = -2;
                i10 = 5;
                lp0 lp0Var = new lp0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.L = lp0Var;
                lp0Var.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
                this.F.addView(this.L, w7.a6.n(-1, -2));
                final int i23 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ zo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                zo zoVar3 = this.b;
                                zoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", zoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                yr yrVar = new yr(bundle);
                                yrVar.x0(zoVar3.y0);
                                zoVar3.presentFragment(yrVar);
                                break;
                            case 1:
                                zo zoVar4 = this.b;
                                wo woVar = zoVar4.Q0;
                                long j112 = zoVar4.C0;
                                if (!zoVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                zo zoVar5 = this.b;
                                zoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", zoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yr yrVar2 = new yr(bundle2);
                                yrVar2.x0(zoVar5.y0);
                                zoVar5.presentFragment(yrVar2);
                                break;
                            case 3:
                                zo zoVar6 = this.b;
                                zoVar6.presentFragment(new fi0(zoVar6.w0));
                                break;
                            case 4:
                                zo zoVar7 = this.b;
                                zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                break;
                            case 5:
                                zo zoVar8 = this.b;
                                zoVar8.getClass();
                                zoVar8.presentFragment(new ac(zoVar8.x0));
                                break;
                            case 6:
                                zo zoVar9 = this.b;
                                zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                break;
                            case 7:
                                zo zoVar10 = this.b;
                                zoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", zoVar10.C0);
                                zoVar10.presentFragment(new va(bundle3));
                                break;
                            case 8:
                                zo zoVar11 = this.b;
                                zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                break;
                            case 9:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                zo.X(this.b);
                                break;
                            case 14:
                                zo zoVar12 = this.b;
                                org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                break;
                            case 15:
                                zo zoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                    nd0 nd0Var = new nd0(4);
                                    nd0Var.e0 = -zoVar13.w0;
                                    TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    nd0Var.F0 = new qo(zoVar13, 6);
                                    zoVar13.presentFragment(nd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                zo zoVar14 = this.b;
                                long j12 = zoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                np npVar = new np(null);
                                npVar.M = new ArrayList();
                                npVar.N = new ArrayList();
                                npVar.P = new ArrayList();
                                npVar.c0 = true;
                                npVar.f0 = new ArrayList();
                                npVar.o0 = new HashMap();
                                npVar.q0 = new cp(npVar, 5);
                                npVar.t0 = false;
                                npVar.Z = j12;
                                npVar.n0 = z152;
                                TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                npVar.Y = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        npVar.l0 = tL_chatInviteExported;
                                    } else {
                                        npVar.X(false);
                                    }
                                }
                                zoVar14.presentFragment(npVar);
                                break;
                            case 17:
                                zo zoVar15 = this.b;
                                long j13 = zoVar15.w0;
                                aq aqVar = new aq(null);
                                aqVar.v = new ArrayList();
                                boolean z162 = false;
                                aqVar.O = false;
                                aqVar.P = false;
                                aqVar.E = j13;
                                TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                aqVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                    z162 = true;
                                }
                                aqVar.s = z162;
                                aqVar.h = zoVar15.y0;
                                zoVar15.presentFragment(aqVar);
                                break;
                            case 18:
                                zo zoVar16 = this.b;
                                zw0 zw0Var = new zw0(zoVar16.w0);
                                zw0Var.v = new qo(zoVar16, 4);
                                zoVar16.presentFragment(zw0Var);
                                break;
                            case 19:
                                zo.Z(this.b);
                                break;
                            case 20:
                                zo zoVar17 = this.b;
                                x60 x60Var = new x60(-zoVar17.x0.id);
                                x60Var.c = zoVar17.L0;
                                x60Var.l0 = zoVar17;
                                zoVar17.presentFragment(x60Var);
                                break;
                            case 21:
                                zo zoVar18 = this.b;
                                zoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", zoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                yr yrVar3 = new yr(bundle4);
                                yrVar3.x0(zoVar18.y0);
                                zoVar18.presentFragment(yrVar3);
                                break;
                            case 22:
                                zo zoVar19 = this.b;
                                ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                zoVar19.presentFragment(ei0Var);
                                break;
                            case 23:
                                zo zoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                    zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", zoVar20.w0);
                                    hq hqVar = new hq(bundle5);
                                    hqVar.d = new ArrayList();
                                    hqVar.r = new ArrayList();
                                    hqVar.v = -1;
                                    hqVar.F = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    hqVar.c = j14;
                                    TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                    hqVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (hqVar.a == null) {
                                            hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        hqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            hqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            hqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            hqVar.w = 1;
                                        }
                                    }
                                    zoVar20.presentFragment(hqVar);
                                    break;
                                }
                            default:
                                zo zoVar21 = this.b;
                                zoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", zoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                zoVar21.presentFragment(new fo(bundle6));
                                break;
                        }
                    }
                });
            } else {
                j10 = j11;
                odVar = odVar2;
                i10 = 5;
                i11 = -2;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.x0) || ChatObject.isCommunity(this.x0)) {
                context3 = context;
                frameLayout = frameLayout2;
                eeVar = eeVar3;
                zoVar = this;
            } else {
                long j12 = -this.x0.id;
                eeVar = eeVar3;
                org.telegram.ui.Cells.r8 r8Var11 = new org.telegram.ui.Cells.r8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.M = r8Var11;
                r8Var11.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
                this.M.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.x0.autotranslation);
                final int i24 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j12, new Utilities.Callback(this) { // from class: org.telegram.ui.oo
                    public final /* synthetic */ zo b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i24) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                zo zoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    zoVar3.getClass();
                                    break;
                                } else {
                                    zoVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < zoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, w7.a6.n(-1, i11));
                frameLayout = frameLayout2;
                zoVar = this;
                this.M.setOnClickListener(new ko(this, new boolean[]{false}, j12, 0));
            }
            if (!zoVar.I0 && ChatObject.canBlockUsers(zoVar.x0) && (ChatObject.isChannel(zoVar.x0) || zoVar.x0.creator)) {
                org.telegram.ui.Cells.r8 r8Var12 = new org.telegram.ui.Cells.r8(context3);
                zoVar.N = r8Var12;
                r8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(true));
                zoVar.F.addView(zoVar.N, w7.a6.n(-1, i11));
                zoVar.N.setOnClickListener(new xf(i10, zoVar, context3));
            }
            if (ChatObject.isMegagroup(zoVar.x0) && ChatObject.hasAdminRights(zoVar.x0) && !ChatObject.isCommunity(zoVar.x0)) {
                MessagesController.getInstance(zoVar.currentAccount).getBoostsController().getBoostsStats(-zoVar.x0.id, new Utilities.Callback(zoVar) { // from class: org.telegram.ui.oo
                    public final /* synthetic */ zo b;

                    {
                        this.b = zoVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i13) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                zo zoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    zoVar3.getClass();
                                    break;
                                } else {
                                    zoVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < zoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                lp0 lp0Var2 = new lp0(zoVar.currentAccount, -zoVar.x0.id, context3, zoVar.getResourceProvider());
                zoVar.L = lp0Var2;
                lp0Var2.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
                zoVar.F.addView(zoVar.L, w7.a6.n(-1, i11));
                final int i25 = 20;
                zoVar.L.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ zo b;

                    {
                        this.b = zoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                zo zoVar3 = this.b;
                                zoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", zoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                yr yrVar = new yr(bundle);
                                yrVar.x0(zoVar3.y0);
                                zoVar3.presentFragment(yrVar);
                                break;
                            case 1:
                                zo zoVar4 = this.b;
                                wo woVar = zoVar4.Q0;
                                long j112 = zoVar4.C0;
                                if (!zoVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, zoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                zo zoVar5 = this.b;
                                zoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", zoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                yr yrVar2 = new yr(bundle2);
                                yrVar2.x0(zoVar5.y0);
                                zoVar5.presentFragment(yrVar2);
                                break;
                            case 3:
                                zo zoVar6 = this.b;
                                zoVar6.presentFragment(new fi0(zoVar6.w0));
                                break;
                            case 4:
                                zo zoVar7 = this.b;
                                zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                break;
                            case 5:
                                zo zoVar8 = this.b;
                                zoVar8.getClass();
                                zoVar8.presentFragment(new ac(zoVar8.x0));
                                break;
                            case 6:
                                zo zoVar9 = this.b;
                                zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                break;
                            case 7:
                                zo zoVar10 = this.b;
                                zoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", zoVar10.C0);
                                zoVar10.presentFragment(new va(bundle3));
                                break;
                            case 8:
                                zo zoVar11 = this.b;
                                zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                break;
                            case 9:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                zo.X(this.b);
                                break;
                            case 14:
                                zo zoVar12 = this.b;
                                org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                break;
                            case 15:
                                zo zoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                    nd0 nd0Var = new nd0(4);
                                    nd0Var.e0 = -zoVar13.w0;
                                    TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    nd0Var.F0 = new qo(zoVar13, 6);
                                    zoVar13.presentFragment(nd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                zo zoVar14 = this.b;
                                long j122 = zoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                np npVar = new np(null);
                                npVar.M = new ArrayList();
                                npVar.N = new ArrayList();
                                npVar.P = new ArrayList();
                                npVar.c0 = true;
                                npVar.f0 = new ArrayList();
                                npVar.o0 = new HashMap();
                                npVar.q0 = new cp(npVar, 5);
                                npVar.t0 = false;
                                npVar.Z = j122;
                                npVar.n0 = z152;
                                TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                npVar.Y = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        npVar.l0 = tL_chatInviteExported;
                                    } else {
                                        npVar.X(false);
                                    }
                                }
                                zoVar14.presentFragment(npVar);
                                break;
                            case 17:
                                zo zoVar15 = this.b;
                                long j13 = zoVar15.w0;
                                aq aqVar = new aq(null);
                                aqVar.v = new ArrayList();
                                boolean z162 = false;
                                aqVar.O = false;
                                aqVar.P = false;
                                aqVar.E = j13;
                                TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                aqVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                    z162 = true;
                                }
                                aqVar.s = z162;
                                aqVar.h = zoVar15.y0;
                                zoVar15.presentFragment(aqVar);
                                break;
                            case 18:
                                zo zoVar16 = this.b;
                                zw0 zw0Var = new zw0(zoVar16.w0);
                                zw0Var.v = new qo(zoVar16, 4);
                                zoVar16.presentFragment(zw0Var);
                                break;
                            case 19:
                                zo.Z(this.b);
                                break;
                            case 20:
                                zo zoVar17 = this.b;
                                x60 x60Var = new x60(-zoVar17.x0.id);
                                x60Var.c = zoVar17.L0;
                                x60Var.l0 = zoVar17;
                                zoVar17.presentFragment(x60Var);
                                break;
                            case 21:
                                zo zoVar18 = this.b;
                                zoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", zoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                yr yrVar3 = new yr(bundle4);
                                yrVar3.x0(zoVar18.y0);
                                zoVar18.presentFragment(yrVar3);
                                break;
                            case 22:
                                zo zoVar19 = this.b;
                                ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                zoVar19.presentFragment(ei0Var);
                                break;
                            case 23:
                                zo zoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                    zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", zoVar20.w0);
                                    hq hqVar = new hq(bundle5);
                                    hqVar.d = new ArrayList();
                                    hqVar.r = new ArrayList();
                                    hqVar.v = -1;
                                    hqVar.F = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    hqVar.c = j14;
                                    TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                    hqVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (hqVar.a == null) {
                                            hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        hqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            hqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            hqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            hqVar.w = 1;
                                        }
                                    }
                                    zoVar20.presentFragment(hqVar);
                                    break;
                                }
                            default:
                                zo zoVar21 = this.b;
                                zoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", zoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                zoVar21.presentFragment(new fo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!zoVar.I0 && zoVar.x0.creator) {
                org.telegram.ui.Cells.r8 r8Var13 = new org.telegram.ui.Cells.r8(23, context, null, false, true);
                context2 = context;
                zoVar.Q = r8Var13;
                r8Var13.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
                zoVar.Q.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), zoVar.F0);
                zoVar.Q.getCheckBox().setIcon(zoVar.G0 ? 0 : R.drawable.permission_locked);
                zoVar.F.addView(zoVar.Q, w7.a6.d(-2.0f, -1));
                zoVar.Q.setOnClickListener(new xf(6, zoVar, frameLayout));
            } else {
                context2 = context;
            }
            zoVar.o0();
        } else {
            context2 = context;
            j10 = j11;
            odVar = odVar2;
            eeVar = eeVar3;
            i10 = 5;
            zoVar = this;
            i11 = -2;
        }
        org.telegram.ui.ActionBar.y n10 = zoVar.actionBar.n();
        if (zoVar.D0 != null || ChatObject.canChangeChatInfo(zoVar.x0) || zoVar.N != null) {
            org.telegram.ui.ActionBar.u0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            zoVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (zoVar.H == null && zoVar.N == null && zoVar.I == null && zoVar.J == null && zoVar.Q == null) {
            eeVar2 = eeVar;
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context2, 12, zoVar.resourceProvider);
            zoVar.P = e9Var;
            if (zoVar.Q != null) {
                e9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                e9Var.setFixedSize(12);
            }
            eeVar2 = eeVar;
            eeVar2.addView(zoVar.P, w7.a6.n(-1, i11));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        zoVar.R = linearLayout4;
        linearLayout4.setOrientation(1);
        eeVar2.addView(zoVar.R, w7.a6.n(-1, i11));
        final int i26 = 8;
        if (zoVar.x0 != null) {
            org.telegram.ui.Cells.r8 r8Var14 = new org.telegram.ui.Cells.r8(context2);
            zoVar.X = r8Var14;
            r8Var14.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            org.telegram.ui.Cells.r8 r8Var15 = zoVar.X;
            if (!ChatObject.isChannel(zoVar.x0)) {
                TLRPC.Chat chat3 = zoVar.x0;
                if (!chat3.creator && (!ChatObject.hasAdminRights(chat3) || !ChatObject.canChangeChatInfo(zoVar.x0))) {
                    i12 = 8;
                    r8Var15.setVisibility(i12);
                    final int i27 = 21;
                    zoVar.X.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ zo b;

                        {
                            this.b = zoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
                                case 0:
                                    zo zoVar3 = this.b;
                                    zoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", zoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    yr yrVar = new yr(bundle);
                                    yrVar.x0(zoVar3.y0);
                                    zoVar3.presentFragment(yrVar);
                                    break;
                                case 1:
                                    zo zoVar4 = this.b;
                                    wo woVar = zoVar4.Q0;
                                    long j112 = zoVar4.C0;
                                    if (!zoVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    zo zoVar5 = this.b;
                                    zoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", zoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yr yrVar2 = new yr(bundle2);
                                    yrVar2.x0(zoVar5.y0);
                                    zoVar5.presentFragment(yrVar2);
                                    break;
                                case 3:
                                    zo zoVar6 = this.b;
                                    zoVar6.presentFragment(new fi0(zoVar6.w0));
                                    break;
                                case 4:
                                    zo zoVar7 = this.b;
                                    zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                    break;
                                case 5:
                                    zo zoVar8 = this.b;
                                    zoVar8.getClass();
                                    zoVar8.presentFragment(new ac(zoVar8.x0));
                                    break;
                                case 6:
                                    zo zoVar9 = this.b;
                                    zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                    break;
                                case 7:
                                    zo zoVar10 = this.b;
                                    zoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", zoVar10.C0);
                                    zoVar10.presentFragment(new va(bundle3));
                                    break;
                                case 8:
                                    zo zoVar11 = this.b;
                                    zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                    break;
                                case 9:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    zo.X(this.b);
                                    break;
                                case 14:
                                    zo zoVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                    break;
                                case 15:
                                    zo zoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                        nd0 nd0Var = new nd0(4);
                                        nd0Var.e0 = -zoVar13.w0;
                                        TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        nd0Var.F0 = new qo(zoVar13, 6);
                                        zoVar13.presentFragment(nd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    zo zoVar14 = this.b;
                                    long j122 = zoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    np npVar = new np(null);
                                    npVar.M = new ArrayList();
                                    npVar.N = new ArrayList();
                                    npVar.P = new ArrayList();
                                    npVar.c0 = true;
                                    npVar.f0 = new ArrayList();
                                    npVar.o0 = new HashMap();
                                    npVar.q0 = new cp(npVar, 5);
                                    npVar.t0 = false;
                                    npVar.Z = j122;
                                    npVar.n0 = z152;
                                    TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                    npVar.Y = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            npVar.l0 = tL_chatInviteExported;
                                        } else {
                                            npVar.X(false);
                                        }
                                    }
                                    zoVar14.presentFragment(npVar);
                                    break;
                                case 17:
                                    zo zoVar15 = this.b;
                                    long j13 = zoVar15.w0;
                                    aq aqVar = new aq(null);
                                    aqVar.v = new ArrayList();
                                    boolean z162 = false;
                                    aqVar.O = false;
                                    aqVar.P = false;
                                    aqVar.E = j13;
                                    TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    aqVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    aqVar.s = z162;
                                    aqVar.h = zoVar15.y0;
                                    zoVar15.presentFragment(aqVar);
                                    break;
                                case 18:
                                    zo zoVar16 = this.b;
                                    zw0 zw0Var = new zw0(zoVar16.w0);
                                    zw0Var.v = new qo(zoVar16, 4);
                                    zoVar16.presentFragment(zw0Var);
                                    break;
                                case 19:
                                    zo.Z(this.b);
                                    break;
                                case 20:
                                    zo zoVar17 = this.b;
                                    x60 x60Var = new x60(-zoVar17.x0.id);
                                    x60Var.c = zoVar17.L0;
                                    x60Var.l0 = zoVar17;
                                    zoVar17.presentFragment(x60Var);
                                    break;
                                case 21:
                                    zo zoVar18 = this.b;
                                    zoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", zoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                    yr yrVar3 = new yr(bundle4);
                                    yrVar3.x0(zoVar18.y0);
                                    zoVar18.presentFragment(yrVar3);
                                    break;
                                case 22:
                                    zo zoVar19 = this.b;
                                    ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                    ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                    zoVar19.presentFragment(ei0Var);
                                    break;
                                case 23:
                                    zo zoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                        zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", zoVar20.w0);
                                        hq hqVar = new hq(bundle5);
                                        hqVar.d = new ArrayList();
                                        hqVar.r = new ArrayList();
                                        hqVar.v = -1;
                                        hqVar.F = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        hqVar.c = j14;
                                        TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                        hqVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (hqVar.a == null) {
                                                hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            hqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                hqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                hqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                hqVar.w = 1;
                                            }
                                        }
                                        zoVar20.presentFragment(hqVar);
                                        break;
                                    }
                                default:
                                    zo zoVar21 = this.b;
                                    zoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", zoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                    zoVar21.presentFragment(new fo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var16 = new org.telegram.ui.Cells.r8(context2);
                    zoVar.V = r8Var16;
                    r8Var16.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                    final int i28 = 22;
                    zoVar.V.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ zo b;

                        {
                            this.b = zoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i28) {
                                case 0:
                                    zo zoVar3 = this.b;
                                    zoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", zoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    yr yrVar = new yr(bundle);
                                    yrVar.x0(zoVar3.y0);
                                    zoVar3.presentFragment(yrVar);
                                    break;
                                case 1:
                                    zo zoVar4 = this.b;
                                    wo woVar = zoVar4.Q0;
                                    long j112 = zoVar4.C0;
                                    if (!zoVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    zo zoVar5 = this.b;
                                    zoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", zoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yr yrVar2 = new yr(bundle2);
                                    yrVar2.x0(zoVar5.y0);
                                    zoVar5.presentFragment(yrVar2);
                                    break;
                                case 3:
                                    zo zoVar6 = this.b;
                                    zoVar6.presentFragment(new fi0(zoVar6.w0));
                                    break;
                                case 4:
                                    zo zoVar7 = this.b;
                                    zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                    break;
                                case 5:
                                    zo zoVar8 = this.b;
                                    zoVar8.getClass();
                                    zoVar8.presentFragment(new ac(zoVar8.x0));
                                    break;
                                case 6:
                                    zo zoVar9 = this.b;
                                    zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                    break;
                                case 7:
                                    zo zoVar10 = this.b;
                                    zoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", zoVar10.C0);
                                    zoVar10.presentFragment(new va(bundle3));
                                    break;
                                case 8:
                                    zo zoVar11 = this.b;
                                    zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                    break;
                                case 9:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    zo.X(this.b);
                                    break;
                                case 14:
                                    zo zoVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                    break;
                                case 15:
                                    zo zoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                        nd0 nd0Var = new nd0(4);
                                        nd0Var.e0 = -zoVar13.w0;
                                        TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        nd0Var.F0 = new qo(zoVar13, 6);
                                        zoVar13.presentFragment(nd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    zo zoVar14 = this.b;
                                    long j122 = zoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    np npVar = new np(null);
                                    npVar.M = new ArrayList();
                                    npVar.N = new ArrayList();
                                    npVar.P = new ArrayList();
                                    npVar.c0 = true;
                                    npVar.f0 = new ArrayList();
                                    npVar.o0 = new HashMap();
                                    npVar.q0 = new cp(npVar, 5);
                                    npVar.t0 = false;
                                    npVar.Z = j122;
                                    npVar.n0 = z152;
                                    TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                    npVar.Y = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            npVar.l0 = tL_chatInviteExported;
                                        } else {
                                            npVar.X(false);
                                        }
                                    }
                                    zoVar14.presentFragment(npVar);
                                    break;
                                case 17:
                                    zo zoVar15 = this.b;
                                    long j13 = zoVar15.w0;
                                    aq aqVar = new aq(null);
                                    aqVar.v = new ArrayList();
                                    boolean z162 = false;
                                    aqVar.O = false;
                                    aqVar.P = false;
                                    aqVar.E = j13;
                                    TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    aqVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    aqVar.s = z162;
                                    aqVar.h = zoVar15.y0;
                                    zoVar15.presentFragment(aqVar);
                                    break;
                                case 18:
                                    zo zoVar16 = this.b;
                                    zw0 zw0Var = new zw0(zoVar16.w0);
                                    zw0Var.v = new qo(zoVar16, 4);
                                    zoVar16.presentFragment(zw0Var);
                                    break;
                                case 19:
                                    zo.Z(this.b);
                                    break;
                                case 20:
                                    zo zoVar17 = this.b;
                                    x60 x60Var = new x60(-zoVar17.x0.id);
                                    x60Var.c = zoVar17.L0;
                                    x60Var.l0 = zoVar17;
                                    zoVar17.presentFragment(x60Var);
                                    break;
                                case 21:
                                    zo zoVar18 = this.b;
                                    zoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", zoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                    yr yrVar3 = new yr(bundle4);
                                    yrVar3.x0(zoVar18.y0);
                                    zoVar18.presentFragment(yrVar3);
                                    break;
                                case 22:
                                    zo zoVar19 = this.b;
                                    ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                    ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                    zoVar19.presentFragment(ei0Var);
                                    break;
                                case 23:
                                    zo zoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                        zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", zoVar20.w0);
                                        hq hqVar = new hq(bundle5);
                                        hqVar.d = new ArrayList();
                                        hqVar.r = new ArrayList();
                                        hqVar.v = -1;
                                        hqVar.F = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        hqVar.c = j14;
                                        TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                        hqVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (hqVar.a == null) {
                                                hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            hqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                hqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                hqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                hqVar.w = 1;
                                            }
                                        }
                                        zoVar20.presentFragment(hqVar);
                                        break;
                                    }
                                default:
                                    zo zoVar21 = this.b;
                                    zoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", zoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                    zoVar21.presentFragment(new fo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var17 = new org.telegram.ui.Cells.r8(context2);
                    zoVar.O = r8Var17;
                    r8Var17.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                    final int i29 = 23;
                    zoVar.O.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ zo b;

                        {
                            this.b = zoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    zo zoVar3 = this.b;
                                    zoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", zoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    yr yrVar = new yr(bundle);
                                    yrVar.x0(zoVar3.y0);
                                    zoVar3.presentFragment(yrVar);
                                    break;
                                case 1:
                                    zo zoVar4 = this.b;
                                    wo woVar = zoVar4.Q0;
                                    long j112 = zoVar4.C0;
                                    if (!zoVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    zo zoVar5 = this.b;
                                    zoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", zoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yr yrVar2 = new yr(bundle2);
                                    yrVar2.x0(zoVar5.y0);
                                    zoVar5.presentFragment(yrVar2);
                                    break;
                                case 3:
                                    zo zoVar6 = this.b;
                                    zoVar6.presentFragment(new fi0(zoVar6.w0));
                                    break;
                                case 4:
                                    zo zoVar7 = this.b;
                                    zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                    break;
                                case 5:
                                    zo zoVar8 = this.b;
                                    zoVar8.getClass();
                                    zoVar8.presentFragment(new ac(zoVar8.x0));
                                    break;
                                case 6:
                                    zo zoVar9 = this.b;
                                    zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                    break;
                                case 7:
                                    zo zoVar10 = this.b;
                                    zoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", zoVar10.C0);
                                    zoVar10.presentFragment(new va(bundle3));
                                    break;
                                case 8:
                                    zo zoVar11 = this.b;
                                    zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                    break;
                                case 9:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    zo.X(this.b);
                                    break;
                                case 14:
                                    zo zoVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                    break;
                                case 15:
                                    zo zoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                        nd0 nd0Var = new nd0(4);
                                        nd0Var.e0 = -zoVar13.w0;
                                        TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        nd0Var.F0 = new qo(zoVar13, 6);
                                        zoVar13.presentFragment(nd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    zo zoVar14 = this.b;
                                    long j122 = zoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    np npVar = new np(null);
                                    npVar.M = new ArrayList();
                                    npVar.N = new ArrayList();
                                    npVar.P = new ArrayList();
                                    npVar.c0 = true;
                                    npVar.f0 = new ArrayList();
                                    npVar.o0 = new HashMap();
                                    npVar.q0 = new cp(npVar, 5);
                                    npVar.t0 = false;
                                    npVar.Z = j122;
                                    npVar.n0 = z152;
                                    TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                    npVar.Y = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            npVar.l0 = tL_chatInviteExported;
                                        } else {
                                            npVar.X(false);
                                        }
                                    }
                                    zoVar14.presentFragment(npVar);
                                    break;
                                case 17:
                                    zo zoVar15 = this.b;
                                    long j13 = zoVar15.w0;
                                    aq aqVar = new aq(null);
                                    aqVar.v = new ArrayList();
                                    boolean z162 = false;
                                    aqVar.O = false;
                                    aqVar.P = false;
                                    aqVar.E = j13;
                                    TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    aqVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    aqVar.s = z162;
                                    aqVar.h = zoVar15.y0;
                                    zoVar15.presentFragment(aqVar);
                                    break;
                                case 18:
                                    zo zoVar16 = this.b;
                                    zw0 zw0Var = new zw0(zoVar16.w0);
                                    zw0Var.v = new qo(zoVar16, 4);
                                    zoVar16.presentFragment(zw0Var);
                                    break;
                                case 19:
                                    zo.Z(this.b);
                                    break;
                                case 20:
                                    zo zoVar17 = this.b;
                                    x60 x60Var = new x60(-zoVar17.x0.id);
                                    x60Var.c = zoVar17.L0;
                                    x60Var.l0 = zoVar17;
                                    zoVar17.presentFragment(x60Var);
                                    break;
                                case 21:
                                    zo zoVar18 = this.b;
                                    zoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", zoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                    yr yrVar3 = new yr(bundle4);
                                    yrVar3.x0(zoVar18.y0);
                                    zoVar18.presentFragment(yrVar3);
                                    break;
                                case 22:
                                    zo zoVar19 = this.b;
                                    ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                    ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                    zoVar19.presentFragment(ei0Var);
                                    break;
                                case 23:
                                    zo zoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                        zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", zoVar20.w0);
                                        hq hqVar = new hq(bundle5);
                                        hqVar.d = new ArrayList();
                                        hqVar.r = new ArrayList();
                                        hqVar.v = -1;
                                        hqVar.F = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        hqVar.c = j14;
                                        TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                        hqVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (hqVar.a == null) {
                                                hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            hqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                hqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                hqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                hqVar.w = 1;
                                            }
                                        }
                                        zoVar20.presentFragment(hqVar);
                                        break;
                                    }
                                default:
                                    zo zoVar21 = this.b;
                                    zoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", zoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                    zoVar21.presentFragment(new fo(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(zoVar.x0, 28)) {
                        org.telegram.ui.Cells.r8 r8Var18 = new org.telegram.ui.Cells.r8(context2);
                        zoVar.f0 = r8Var18;
                        r8Var18.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                        final int i30 = 24;
                        zoVar.f0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                            public final /* synthetic */ zo b;

                            {
                                this.b = zoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i30) {
                                    case 0:
                                        zo zoVar3 = this.b;
                                        zoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", zoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        yr yrVar = new yr(bundle);
                                        yrVar.x0(zoVar3.y0);
                                        zoVar3.presentFragment(yrVar);
                                        break;
                                    case 1:
                                        zo zoVar4 = this.b;
                                        wo woVar = zoVar4.Q0;
                                        long j112 = zoVar4.C0;
                                        if (!zoVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        zo zoVar5 = this.b;
                                        zoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", zoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        yr yrVar2 = new yr(bundle2);
                                        yrVar2.x0(zoVar5.y0);
                                        zoVar5.presentFragment(yrVar2);
                                        break;
                                    case 3:
                                        zo zoVar6 = this.b;
                                        zoVar6.presentFragment(new fi0(zoVar6.w0));
                                        break;
                                    case 4:
                                        zo zoVar7 = this.b;
                                        zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                        break;
                                    case 5:
                                        zo zoVar8 = this.b;
                                        zoVar8.getClass();
                                        zoVar8.presentFragment(new ac(zoVar8.x0));
                                        break;
                                    case 6:
                                        zo zoVar9 = this.b;
                                        zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                        break;
                                    case 7:
                                        zo zoVar10 = this.b;
                                        zoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", zoVar10.C0);
                                        zoVar10.presentFragment(new va(bundle3));
                                        break;
                                    case 8:
                                        zo zoVar11 = this.b;
                                        zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        zo.X(this.b);
                                        break;
                                    case 14:
                                        zo zoVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                        break;
                                    case 15:
                                        zo zoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                            nd0 nd0Var = new nd0(4);
                                            nd0Var.e0 = -zoVar13.w0;
                                            TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            nd0Var.F0 = new qo(zoVar13, 6);
                                            zoVar13.presentFragment(nd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        zo zoVar14 = this.b;
                                        long j122 = zoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        np npVar = new np(null);
                                        npVar.M = new ArrayList();
                                        npVar.N = new ArrayList();
                                        npVar.P = new ArrayList();
                                        npVar.c0 = true;
                                        npVar.f0 = new ArrayList();
                                        npVar.o0 = new HashMap();
                                        npVar.q0 = new cp(npVar, 5);
                                        npVar.t0 = false;
                                        npVar.Z = j122;
                                        npVar.n0 = z152;
                                        TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                        npVar.Y = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                npVar.l0 = tL_chatInviteExported;
                                            } else {
                                                npVar.X(false);
                                            }
                                        }
                                        zoVar14.presentFragment(npVar);
                                        break;
                                    case 17:
                                        zo zoVar15 = this.b;
                                        long j13 = zoVar15.w0;
                                        aq aqVar = new aq(null);
                                        aqVar.v = new ArrayList();
                                        boolean z162 = false;
                                        aqVar.O = false;
                                        aqVar.P = false;
                                        aqVar.E = j13;
                                        TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        aqVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        aqVar.s = z162;
                                        aqVar.h = zoVar15.y0;
                                        zoVar15.presentFragment(aqVar);
                                        break;
                                    case 18:
                                        zo zoVar16 = this.b;
                                        zw0 zw0Var = new zw0(zoVar16.w0);
                                        zw0Var.v = new qo(zoVar16, 4);
                                        zoVar16.presentFragment(zw0Var);
                                        break;
                                    case 19:
                                        zo.Z(this.b);
                                        break;
                                    case 20:
                                        zo zoVar17 = this.b;
                                        x60 x60Var = new x60(-zoVar17.x0.id);
                                        x60Var.c = zoVar17.L0;
                                        x60Var.l0 = zoVar17;
                                        zoVar17.presentFragment(x60Var);
                                        break;
                                    case 21:
                                        zo zoVar18 = this.b;
                                        zoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", zoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                        yr yrVar3 = new yr(bundle4);
                                        yrVar3.x0(zoVar18.y0);
                                        zoVar18.presentFragment(yrVar3);
                                        break;
                                    case 22:
                                        zo zoVar19 = this.b;
                                        ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                        ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                        zoVar19.presentFragment(ei0Var);
                                        break;
                                    case 23:
                                        zo zoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                            zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", zoVar20.w0);
                                            hq hqVar = new hq(bundle5);
                                            hqVar.d = new ArrayList();
                                            hqVar.r = new ArrayList();
                                            hqVar.v = -1;
                                            hqVar.F = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            hqVar.c = j14;
                                            TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                            hqVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (hqVar.a == null) {
                                                    hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                hqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    hqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    hqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    hqVar.w = 1;
                                                }
                                            }
                                            zoVar20.presentFragment(hqVar);
                                            break;
                                        }
                                    default:
                                        zo zoVar21 = this.b;
                                        zoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", zoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                        zoVar21.presentFragment(new fo(bundle6));
                                        break;
                                }
                            }
                        });
                        zoVar.f0();
                    }
                    org.telegram.ui.Cells.r8 r8Var19 = new org.telegram.ui.Cells.r8(context2);
                    zoVar.W = r8Var19;
                    final int i31 = 0;
                    r8Var19.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                    zoVar.W.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ zo b;

                        {
                            this.b = zoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    zo zoVar3 = this.b;
                                    zoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", zoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    yr yrVar = new yr(bundle);
                                    yrVar.x0(zoVar3.y0);
                                    zoVar3.presentFragment(yrVar);
                                    break;
                                case 1:
                                    zo zoVar4 = this.b;
                                    wo woVar = zoVar4.Q0;
                                    long j112 = zoVar4.C0;
                                    if (!zoVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    zo zoVar5 = this.b;
                                    zoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", zoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yr yrVar2 = new yr(bundle2);
                                    yrVar2.x0(zoVar5.y0);
                                    zoVar5.presentFragment(yrVar2);
                                    break;
                                case 3:
                                    zo zoVar6 = this.b;
                                    zoVar6.presentFragment(new fi0(zoVar6.w0));
                                    break;
                                case 4:
                                    zo zoVar7 = this.b;
                                    zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                    break;
                                case 5:
                                    zo zoVar8 = this.b;
                                    zoVar8.getClass();
                                    zoVar8.presentFragment(new ac(zoVar8.x0));
                                    break;
                                case 6:
                                    zo zoVar9 = this.b;
                                    zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                    break;
                                case 7:
                                    zo zoVar10 = this.b;
                                    zoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", zoVar10.C0);
                                    zoVar10.presentFragment(new va(bundle3));
                                    break;
                                case 8:
                                    zo zoVar11 = this.b;
                                    zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                    break;
                                case 9:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    zo.X(this.b);
                                    break;
                                case 14:
                                    zo zoVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                    break;
                                case 15:
                                    zo zoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                        nd0 nd0Var = new nd0(4);
                                        nd0Var.e0 = -zoVar13.w0;
                                        TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        nd0Var.F0 = new qo(zoVar13, 6);
                                        zoVar13.presentFragment(nd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    zo zoVar14 = this.b;
                                    long j122 = zoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    np npVar = new np(null);
                                    npVar.M = new ArrayList();
                                    npVar.N = new ArrayList();
                                    npVar.P = new ArrayList();
                                    npVar.c0 = true;
                                    npVar.f0 = new ArrayList();
                                    npVar.o0 = new HashMap();
                                    npVar.q0 = new cp(npVar, 5);
                                    npVar.t0 = false;
                                    npVar.Z = j122;
                                    npVar.n0 = z152;
                                    TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                    npVar.Y = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            npVar.l0 = tL_chatInviteExported;
                                        } else {
                                            npVar.X(false);
                                        }
                                    }
                                    zoVar14.presentFragment(npVar);
                                    break;
                                case 17:
                                    zo zoVar15 = this.b;
                                    long j13 = zoVar15.w0;
                                    aq aqVar = new aq(null);
                                    aqVar.v = new ArrayList();
                                    boolean z162 = false;
                                    aqVar.O = false;
                                    aqVar.P = false;
                                    aqVar.E = j13;
                                    TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    aqVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    aqVar.s = z162;
                                    aqVar.h = zoVar15.y0;
                                    zoVar15.presentFragment(aqVar);
                                    break;
                                case 18:
                                    zo zoVar16 = this.b;
                                    zw0 zw0Var = new zw0(zoVar16.w0);
                                    zw0Var.v = new qo(zoVar16, 4);
                                    zoVar16.presentFragment(zw0Var);
                                    break;
                                case 19:
                                    zo.Z(this.b);
                                    break;
                                case 20:
                                    zo zoVar17 = this.b;
                                    x60 x60Var = new x60(-zoVar17.x0.id);
                                    x60Var.c = zoVar17.L0;
                                    x60Var.l0 = zoVar17;
                                    zoVar17.presentFragment(x60Var);
                                    break;
                                case 21:
                                    zo zoVar18 = this.b;
                                    zoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", zoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                    yr yrVar3 = new yr(bundle4);
                                    yrVar3.x0(zoVar18.y0);
                                    zoVar18.presentFragment(yrVar3);
                                    break;
                                case 22:
                                    zo zoVar19 = this.b;
                                    ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                    ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                    zoVar19.presentFragment(ei0Var);
                                    break;
                                case 23:
                                    zo zoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                        zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", zoVar20.w0);
                                        hq hqVar = new hq(bundle5);
                                        hqVar.d = new ArrayList();
                                        hqVar.r = new ArrayList();
                                        hqVar.v = -1;
                                        hqVar.F = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        hqVar.c = j14;
                                        TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                        hqVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (hqVar.a == null) {
                                                hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            hqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                hqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                hqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                hqVar.w = 1;
                                            }
                                        }
                                        zoVar20.presentFragment(hqVar);
                                        break;
                                    }
                                default:
                                    zo zoVar21 = this.b;
                                    zoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", zoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                    zoVar21.presentFragment(new fo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var20 = new org.telegram.ui.Cells.r8(context2);
                    zoVar.T = r8Var20;
                    r8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                    final int i32 = 2;
                    zoVar.T.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ zo b;

                        {
                            this.b = zoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    zo zoVar3 = this.b;
                                    zoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", zoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    yr yrVar = new yr(bundle);
                                    yrVar.x0(zoVar3.y0);
                                    zoVar3.presentFragment(yrVar);
                                    break;
                                case 1:
                                    zo zoVar4 = this.b;
                                    wo woVar = zoVar4.Q0;
                                    long j112 = zoVar4.C0;
                                    if (!zoVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    zo zoVar5 = this.b;
                                    zoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", zoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yr yrVar2 = new yr(bundle2);
                                    yrVar2.x0(zoVar5.y0);
                                    zoVar5.presentFragment(yrVar2);
                                    break;
                                case 3:
                                    zo zoVar6 = this.b;
                                    zoVar6.presentFragment(new fi0(zoVar6.w0));
                                    break;
                                case 4:
                                    zo zoVar7 = this.b;
                                    zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                    break;
                                case 5:
                                    zo zoVar8 = this.b;
                                    zoVar8.getClass();
                                    zoVar8.presentFragment(new ac(zoVar8.x0));
                                    break;
                                case 6:
                                    zo zoVar9 = this.b;
                                    zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                    break;
                                case 7:
                                    zo zoVar10 = this.b;
                                    zoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", zoVar10.C0);
                                    zoVar10.presentFragment(new va(bundle3));
                                    break;
                                case 8:
                                    zo zoVar11 = this.b;
                                    zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                    break;
                                case 9:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    zo.X(this.b);
                                    break;
                                case 14:
                                    zo zoVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                    break;
                                case 15:
                                    zo zoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                        nd0 nd0Var = new nd0(4);
                                        nd0Var.e0 = -zoVar13.w0;
                                        TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        nd0Var.F0 = new qo(zoVar13, 6);
                                        zoVar13.presentFragment(nd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    zo zoVar14 = this.b;
                                    long j122 = zoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    np npVar = new np(null);
                                    npVar.M = new ArrayList();
                                    npVar.N = new ArrayList();
                                    npVar.P = new ArrayList();
                                    npVar.c0 = true;
                                    npVar.f0 = new ArrayList();
                                    npVar.o0 = new HashMap();
                                    npVar.q0 = new cp(npVar, 5);
                                    npVar.t0 = false;
                                    npVar.Z = j122;
                                    npVar.n0 = z152;
                                    TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                    npVar.Y = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            npVar.l0 = tL_chatInviteExported;
                                        } else {
                                            npVar.X(false);
                                        }
                                    }
                                    zoVar14.presentFragment(npVar);
                                    break;
                                case 17:
                                    zo zoVar15 = this.b;
                                    long j13 = zoVar15.w0;
                                    aq aqVar = new aq(null);
                                    aqVar.v = new ArrayList();
                                    boolean z162 = false;
                                    aqVar.O = false;
                                    aqVar.P = false;
                                    aqVar.E = j13;
                                    TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    aqVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    aqVar.s = z162;
                                    aqVar.h = zoVar15.y0;
                                    zoVar15.presentFragment(aqVar);
                                    break;
                                case 18:
                                    zo zoVar16 = this.b;
                                    zw0 zw0Var = new zw0(zoVar16.w0);
                                    zw0Var.v = new qo(zoVar16, 4);
                                    zoVar16.presentFragment(zw0Var);
                                    break;
                                case 19:
                                    zo.Z(this.b);
                                    break;
                                case 20:
                                    zo zoVar17 = this.b;
                                    x60 x60Var = new x60(-zoVar17.x0.id);
                                    x60Var.c = zoVar17.L0;
                                    x60Var.l0 = zoVar17;
                                    zoVar17.presentFragment(x60Var);
                                    break;
                                case 21:
                                    zo zoVar18 = this.b;
                                    zoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", zoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                    yr yrVar3 = new yr(bundle4);
                                    yrVar3.x0(zoVar18.y0);
                                    zoVar18.presentFragment(yrVar3);
                                    break;
                                case 22:
                                    zo zoVar19 = this.b;
                                    ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                    ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                    zoVar19.presentFragment(ei0Var);
                                    break;
                                case 23:
                                    zo zoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                        zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", zoVar20.w0);
                                        hq hqVar = new hq(bundle5);
                                        hqVar.d = new ArrayList();
                                        hqVar.r = new ArrayList();
                                        hqVar.v = -1;
                                        hqVar.F = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        hqVar.c = j14;
                                        TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                        hqVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (hqVar.a == null) {
                                                hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            hqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                hqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                hqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                hqVar.w = 1;
                                            }
                                        }
                                        zoVar20.presentFragment(hqVar);
                                        break;
                                    }
                                default:
                                    zo zoVar21 = this.b;
                                    zoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", zoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                    zoVar21.presentFragment(new fo(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(zoVar.x0)) {
                        org.telegram.ui.Cells.r8 r8Var21 = new org.telegram.ui.Cells.r8(context2);
                        zoVar.U = r8Var21;
                        r8Var21.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                        final int i33 = 3;
                        zoVar.U.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                            public final /* synthetic */ zo b;

                            {
                                this.b = zoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i33) {
                                    case 0:
                                        zo zoVar3 = this.b;
                                        zoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", zoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        yr yrVar = new yr(bundle);
                                        yrVar.x0(zoVar3.y0);
                                        zoVar3.presentFragment(yrVar);
                                        break;
                                    case 1:
                                        zo zoVar4 = this.b;
                                        wo woVar = zoVar4.Q0;
                                        long j112 = zoVar4.C0;
                                        if (!zoVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        zo zoVar5 = this.b;
                                        zoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", zoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        yr yrVar2 = new yr(bundle2);
                                        yrVar2.x0(zoVar5.y0);
                                        zoVar5.presentFragment(yrVar2);
                                        break;
                                    case 3:
                                        zo zoVar6 = this.b;
                                        zoVar6.presentFragment(new fi0(zoVar6.w0));
                                        break;
                                    case 4:
                                        zo zoVar7 = this.b;
                                        zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                        break;
                                    case 5:
                                        zo zoVar8 = this.b;
                                        zoVar8.getClass();
                                        zoVar8.presentFragment(new ac(zoVar8.x0));
                                        break;
                                    case 6:
                                        zo zoVar9 = this.b;
                                        zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                        break;
                                    case 7:
                                        zo zoVar10 = this.b;
                                        zoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", zoVar10.C0);
                                        zoVar10.presentFragment(new va(bundle3));
                                        break;
                                    case 8:
                                        zo zoVar11 = this.b;
                                        zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        zo.X(this.b);
                                        break;
                                    case 14:
                                        zo zoVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                        break;
                                    case 15:
                                        zo zoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                            nd0 nd0Var = new nd0(4);
                                            nd0Var.e0 = -zoVar13.w0;
                                            TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            nd0Var.F0 = new qo(zoVar13, 6);
                                            zoVar13.presentFragment(nd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        zo zoVar14 = this.b;
                                        long j122 = zoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        np npVar = new np(null);
                                        npVar.M = new ArrayList();
                                        npVar.N = new ArrayList();
                                        npVar.P = new ArrayList();
                                        npVar.c0 = true;
                                        npVar.f0 = new ArrayList();
                                        npVar.o0 = new HashMap();
                                        npVar.q0 = new cp(npVar, 5);
                                        npVar.t0 = false;
                                        npVar.Z = j122;
                                        npVar.n0 = z152;
                                        TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                        npVar.Y = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                npVar.l0 = tL_chatInviteExported;
                                            } else {
                                                npVar.X(false);
                                            }
                                        }
                                        zoVar14.presentFragment(npVar);
                                        break;
                                    case 17:
                                        zo zoVar15 = this.b;
                                        long j13 = zoVar15.w0;
                                        aq aqVar = new aq(null);
                                        aqVar.v = new ArrayList();
                                        boolean z162 = false;
                                        aqVar.O = false;
                                        aqVar.P = false;
                                        aqVar.E = j13;
                                        TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        aqVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        aqVar.s = z162;
                                        aqVar.h = zoVar15.y0;
                                        zoVar15.presentFragment(aqVar);
                                        break;
                                    case 18:
                                        zo zoVar16 = this.b;
                                        zw0 zw0Var = new zw0(zoVar16.w0);
                                        zw0Var.v = new qo(zoVar16, 4);
                                        zoVar16.presentFragment(zw0Var);
                                        break;
                                    case 19:
                                        zo.Z(this.b);
                                        break;
                                    case 20:
                                        zo zoVar17 = this.b;
                                        x60 x60Var = new x60(-zoVar17.x0.id);
                                        x60Var.c = zoVar17.L0;
                                        x60Var.l0 = zoVar17;
                                        zoVar17.presentFragment(x60Var);
                                        break;
                                    case 21:
                                        zo zoVar18 = this.b;
                                        zoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", zoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                        yr yrVar3 = new yr(bundle4);
                                        yrVar3.x0(zoVar18.y0);
                                        zoVar18.presentFragment(yrVar3);
                                        break;
                                    case 22:
                                        zo zoVar19 = this.b;
                                        ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                        ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                        zoVar19.presentFragment(ei0Var);
                                        break;
                                    case 23:
                                        zo zoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                            zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", zoVar20.w0);
                                            hq hqVar = new hq(bundle5);
                                            hqVar.d = new ArrayList();
                                            hqVar.r = new ArrayList();
                                            hqVar.v = -1;
                                            hqVar.F = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            hqVar.c = j14;
                                            TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                            hqVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (hqVar.a == null) {
                                                    hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                hqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    hqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    hqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    hqVar.w = 1;
                                                }
                                            }
                                            zoVar20.presentFragment(hqVar);
                                            break;
                                        }
                                    default:
                                        zo zoVar21 = this.b;
                                        zoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", zoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                        zoVar21.presentFragment(new fo(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.r8 r8Var22 = new org.telegram.ui.Cells.r8(context2);
                    zoVar.Z = r8Var22;
                    r8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    zoVar.Z.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                    final int i34 = 4;
                    zoVar.Z.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                        public final /* synthetic */ zo b;

                        {
                            this.b = zoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    zo zoVar3 = this.b;
                                    zoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", zoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    yr yrVar = new yr(bundle);
                                    yrVar.x0(zoVar3.y0);
                                    zoVar3.presentFragment(yrVar);
                                    break;
                                case 1:
                                    zo zoVar4 = this.b;
                                    wo woVar = zoVar4.Q0;
                                    long j112 = zoVar4.C0;
                                    if (!zoVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, zoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    zo zoVar5 = this.b;
                                    zoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", zoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    yr yrVar2 = new yr(bundle2);
                                    yrVar2.x0(zoVar5.y0);
                                    zoVar5.presentFragment(yrVar2);
                                    break;
                                case 3:
                                    zo zoVar6 = this.b;
                                    zoVar6.presentFragment(new fi0(zoVar6.w0));
                                    break;
                                case 4:
                                    zo zoVar7 = this.b;
                                    zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                    break;
                                case 5:
                                    zo zoVar8 = this.b;
                                    zoVar8.getClass();
                                    zoVar8.presentFragment(new ac(zoVar8.x0));
                                    break;
                                case 6:
                                    zo zoVar9 = this.b;
                                    zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                    break;
                                case 7:
                                    zo zoVar10 = this.b;
                                    zoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", zoVar10.C0);
                                    zoVar10.presentFragment(new va(bundle3));
                                    break;
                                case 8:
                                    zo zoVar11 = this.b;
                                    zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                    break;
                                case 9:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    zo.X(this.b);
                                    break;
                                case 14:
                                    zo zoVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                    break;
                                case 15:
                                    zo zoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                        nd0 nd0Var = new nd0(4);
                                        nd0Var.e0 = -zoVar13.w0;
                                        TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        nd0Var.F0 = new qo(zoVar13, 6);
                                        zoVar13.presentFragment(nd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    zo zoVar14 = this.b;
                                    long j122 = zoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    np npVar = new np(null);
                                    npVar.M = new ArrayList();
                                    npVar.N = new ArrayList();
                                    npVar.P = new ArrayList();
                                    npVar.c0 = true;
                                    npVar.f0 = new ArrayList();
                                    npVar.o0 = new HashMap();
                                    npVar.q0 = new cp(npVar, 5);
                                    npVar.t0 = false;
                                    npVar.Z = j122;
                                    npVar.n0 = z152;
                                    TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                    npVar.Y = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            npVar.l0 = tL_chatInviteExported;
                                        } else {
                                            npVar.X(false);
                                        }
                                    }
                                    zoVar14.presentFragment(npVar);
                                    break;
                                case 17:
                                    zo zoVar15 = this.b;
                                    long j13 = zoVar15.w0;
                                    aq aqVar = new aq(null);
                                    aqVar.v = new ArrayList();
                                    boolean z162 = false;
                                    aqVar.O = false;
                                    aqVar.P = false;
                                    aqVar.E = j13;
                                    TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    aqVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    aqVar.s = z162;
                                    aqVar.h = zoVar15.y0;
                                    zoVar15.presentFragment(aqVar);
                                    break;
                                case 18:
                                    zo zoVar16 = this.b;
                                    zw0 zw0Var = new zw0(zoVar16.w0);
                                    zw0Var.v = new qo(zoVar16, 4);
                                    zoVar16.presentFragment(zw0Var);
                                    break;
                                case 19:
                                    zo.Z(this.b);
                                    break;
                                case 20:
                                    zo zoVar17 = this.b;
                                    x60 x60Var = new x60(-zoVar17.x0.id);
                                    x60Var.c = zoVar17.L0;
                                    x60Var.l0 = zoVar17;
                                    zoVar17.presentFragment(x60Var);
                                    break;
                                case 21:
                                    zo zoVar18 = this.b;
                                    zoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", zoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                    yr yrVar3 = new yr(bundle4);
                                    yrVar3.x0(zoVar18.y0);
                                    zoVar18.presentFragment(yrVar3);
                                    break;
                                case 22:
                                    zo zoVar19 = this.b;
                                    ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                    ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                    zoVar19.presentFragment(ei0Var);
                                    break;
                                case 23:
                                    zo zoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                        zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", zoVar20.w0);
                                        hq hqVar = new hq(bundle5);
                                        hqVar.d = new ArrayList();
                                        hqVar.r = new ArrayList();
                                        hqVar.v = -1;
                                        hqVar.F = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        hqVar.c = j14;
                                        TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                        hqVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (hqVar.a == null) {
                                                hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            hqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                hqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                hqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                hqVar.w = 1;
                                            }
                                        }
                                        zoVar20.presentFragment(hqVar);
                                        break;
                                    }
                                default:
                                    zo zoVar21 = this.b;
                                    zoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", zoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                    zoVar21.presentFragment(new fo(bundle6));
                                    break;
                            }
                        }
                    });
                    zoVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(zoVar.x0) || zoVar.x0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var23 = new org.telegram.ui.Cells.r8(context2);
                        zoVar.Y = r8Var23;
                        r8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        zoVar.Y.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                        zoVar.Y.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                            public final /* synthetic */ zo b;

                            {
                                this.b = zoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        zo zoVar3 = this.b;
                                        zoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", zoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        yr yrVar = new yr(bundle);
                                        yrVar.x0(zoVar3.y0);
                                        zoVar3.presentFragment(yrVar);
                                        break;
                                    case 1:
                                        zo zoVar4 = this.b;
                                        wo woVar = zoVar4.Q0;
                                        long j112 = zoVar4.C0;
                                        if (!zoVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        zo zoVar5 = this.b;
                                        zoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", zoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        yr yrVar2 = new yr(bundle2);
                                        yrVar2.x0(zoVar5.y0);
                                        zoVar5.presentFragment(yrVar2);
                                        break;
                                    case 3:
                                        zo zoVar6 = this.b;
                                        zoVar6.presentFragment(new fi0(zoVar6.w0));
                                        break;
                                    case 4:
                                        zo zoVar7 = this.b;
                                        zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                        break;
                                    case 5:
                                        zo zoVar8 = this.b;
                                        zoVar8.getClass();
                                        zoVar8.presentFragment(new ac(zoVar8.x0));
                                        break;
                                    case 6:
                                        zo zoVar9 = this.b;
                                        zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                        break;
                                    case 7:
                                        zo zoVar10 = this.b;
                                        zoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", zoVar10.C0);
                                        zoVar10.presentFragment(new va(bundle3));
                                        break;
                                    case 8:
                                        zo zoVar11 = this.b;
                                        zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        zo.X(this.b);
                                        break;
                                    case 14:
                                        zo zoVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                        break;
                                    case 15:
                                        zo zoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                            nd0 nd0Var = new nd0(4);
                                            nd0Var.e0 = -zoVar13.w0;
                                            TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            nd0Var.F0 = new qo(zoVar13, 6);
                                            zoVar13.presentFragment(nd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        zo zoVar14 = this.b;
                                        long j122 = zoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        np npVar = new np(null);
                                        npVar.M = new ArrayList();
                                        npVar.N = new ArrayList();
                                        npVar.P = new ArrayList();
                                        npVar.c0 = true;
                                        npVar.f0 = new ArrayList();
                                        npVar.o0 = new HashMap();
                                        npVar.q0 = new cp(npVar, 5);
                                        npVar.t0 = false;
                                        npVar.Z = j122;
                                        npVar.n0 = z152;
                                        TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                        npVar.Y = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                npVar.l0 = tL_chatInviteExported;
                                            } else {
                                                npVar.X(false);
                                            }
                                        }
                                        zoVar14.presentFragment(npVar);
                                        break;
                                    case 17:
                                        zo zoVar15 = this.b;
                                        long j13 = zoVar15.w0;
                                        aq aqVar = new aq(null);
                                        aqVar.v = new ArrayList();
                                        boolean z162 = false;
                                        aqVar.O = false;
                                        aqVar.P = false;
                                        aqVar.E = j13;
                                        TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        aqVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        aqVar.s = z162;
                                        aqVar.h = zoVar15.y0;
                                        zoVar15.presentFragment(aqVar);
                                        break;
                                    case 18:
                                        zo zoVar16 = this.b;
                                        zw0 zw0Var = new zw0(zoVar16.w0);
                                        zw0Var.v = new qo(zoVar16, 4);
                                        zoVar16.presentFragment(zw0Var);
                                        break;
                                    case 19:
                                        zo.Z(this.b);
                                        break;
                                    case 20:
                                        zo zoVar17 = this.b;
                                        x60 x60Var = new x60(-zoVar17.x0.id);
                                        x60Var.c = zoVar17.L0;
                                        x60Var.l0 = zoVar17;
                                        zoVar17.presentFragment(x60Var);
                                        break;
                                    case 21:
                                        zo zoVar18 = this.b;
                                        zoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", zoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                        yr yrVar3 = new yr(bundle4);
                                        yrVar3.x0(zoVar18.y0);
                                        zoVar18.presentFragment(yrVar3);
                                        break;
                                    case 22:
                                        zo zoVar19 = this.b;
                                        ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                        ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                        zoVar19.presentFragment(ei0Var);
                                        break;
                                    case 23:
                                        zo zoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                            zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", zoVar20.w0);
                                            hq hqVar = new hq(bundle5);
                                            hqVar.d = new ArrayList();
                                            hqVar.r = new ArrayList();
                                            hqVar.v = -1;
                                            hqVar.F = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            hqVar.c = j14;
                                            TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                            hqVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (hqVar.a == null) {
                                                    hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                hqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    hqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    hqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    hqVar.w = 1;
                                                }
                                            }
                                            zoVar20.presentFragment(hqVar);
                                            break;
                                        }
                                    default:
                                        zo zoVar21 = this.b;
                                        zoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", zoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                        zoVar21.presentFragment(new fo(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(zoVar.x0)) {
                        org.telegram.ui.Cells.r8 r8Var24 = new org.telegram.ui.Cells.r8(context2);
                        zoVar.a0 = r8Var24;
                        r8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        zoVar.a0.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                        final int i35 = 6;
                        zoVar.a0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                            public final /* synthetic */ zo b;

                            {
                                this.b = zoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i35) {
                                    case 0:
                                        zo zoVar3 = this.b;
                                        zoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", zoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        yr yrVar = new yr(bundle);
                                        yrVar.x0(zoVar3.y0);
                                        zoVar3.presentFragment(yrVar);
                                        break;
                                    case 1:
                                        zo zoVar4 = this.b;
                                        wo woVar = zoVar4.Q0;
                                        long j112 = zoVar4.C0;
                                        if (!zoVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, zoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        zo zoVar5 = this.b;
                                        zoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", zoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        yr yrVar2 = new yr(bundle2);
                                        yrVar2.x0(zoVar5.y0);
                                        zoVar5.presentFragment(yrVar2);
                                        break;
                                    case 3:
                                        zo zoVar6 = this.b;
                                        zoVar6.presentFragment(new fi0(zoVar6.w0));
                                        break;
                                    case 4:
                                        zo zoVar7 = this.b;
                                        zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                                        break;
                                    case 5:
                                        zo zoVar8 = this.b;
                                        zoVar8.getClass();
                                        zoVar8.presentFragment(new ac(zoVar8.x0));
                                        break;
                                    case 6:
                                        zo zoVar9 = this.b;
                                        zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                                        break;
                                    case 7:
                                        zo zoVar10 = this.b;
                                        zoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", zoVar10.C0);
                                        zoVar10.presentFragment(new va(bundle3));
                                        break;
                                    case 8:
                                        zo zoVar11 = this.b;
                                        zoVar11.presentFragment(new fi.l(zoVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        zo.X(this.b);
                                        break;
                                    case 14:
                                        zo zoVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                                        break;
                                    case 15:
                                        zo zoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                            nd0 nd0Var = new nd0(4);
                                            nd0Var.e0 = -zoVar13.w0;
                                            TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            nd0Var.F0 = new qo(zoVar13, 6);
                                            zoVar13.presentFragment(nd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        zo zoVar14 = this.b;
                                        long j122 = zoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        np npVar = new np(null);
                                        npVar.M = new ArrayList();
                                        npVar.N = new ArrayList();
                                        npVar.P = new ArrayList();
                                        npVar.c0 = true;
                                        npVar.f0 = new ArrayList();
                                        npVar.o0 = new HashMap();
                                        npVar.q0 = new cp(npVar, 5);
                                        npVar.t0 = false;
                                        npVar.Z = j122;
                                        npVar.n0 = z152;
                                        TLRPC.ChatFull chatFull6 = zoVar14.y0;
                                        npVar.Y = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                npVar.l0 = tL_chatInviteExported;
                                            } else {
                                                npVar.X(false);
                                            }
                                        }
                                        zoVar14.presentFragment(npVar);
                                        break;
                                    case 17:
                                        zo zoVar15 = this.b;
                                        long j13 = zoVar15.w0;
                                        aq aqVar = new aq(null);
                                        aqVar.v = new ArrayList();
                                        boolean z162 = false;
                                        aqVar.O = false;
                                        aqVar.P = false;
                                        aqVar.E = j13;
                                        TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        aqVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        aqVar.s = z162;
                                        aqVar.h = zoVar15.y0;
                                        zoVar15.presentFragment(aqVar);
                                        break;
                                    case 18:
                                        zo zoVar16 = this.b;
                                        zw0 zw0Var = new zw0(zoVar16.w0);
                                        zw0Var.v = new qo(zoVar16, 4);
                                        zoVar16.presentFragment(zw0Var);
                                        break;
                                    case 19:
                                        zo.Z(this.b);
                                        break;
                                    case 20:
                                        zo zoVar17 = this.b;
                                        x60 x60Var = new x60(-zoVar17.x0.id);
                                        x60Var.c = zoVar17.L0;
                                        x60Var.l0 = zoVar17;
                                        zoVar17.presentFragment(x60Var);
                                        break;
                                    case 21:
                                        zo zoVar18 = this.b;
                                        zoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", zoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                                        yr yrVar3 = new yr(bundle4);
                                        yrVar3.x0(zoVar18.y0);
                                        zoVar18.presentFragment(yrVar3);
                                        break;
                                    case 22:
                                        zo zoVar19 = this.b;
                                        ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = zoVar19.y0;
                                        ei0Var.g0(chatFull7, chatFull7.exported_invite);
                                        zoVar19.presentFragment(ei0Var);
                                        break;
                                    case 23:
                                        zo zoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                            zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", zoVar20.w0);
                                            hq hqVar = new hq(bundle5);
                                            hqVar.d = new ArrayList();
                                            hqVar.r = new ArrayList();
                                            hqVar.v = -1;
                                            hqVar.F = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            hqVar.c = j14;
                                            TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                            hqVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (hqVar.a == null) {
                                                    hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                hqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    hqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    hqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    hqVar.w = 1;
                                                }
                                            }
                                            zoVar20.presentFragment(hqVar);
                                            break;
                                        }
                                    default:
                                        zo zoVar21 = this.b;
                                        zoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", zoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                                        zoVar21.presentFragment(new fo(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    zoVar.R.addView(zoVar.O, w7.a6.n(-1, i11));
                    r8Var = zoVar.f0;
                    if (r8Var != null) {
                        zoVar.R.addView(r8Var, w7.a6.n(-1, i11));
                    }
                    if (!zoVar.I0 && !zoVar.x0.gigagroup) {
                        zoVar.R.addView(zoVar.X, w7.a6.n(-1, i11));
                    }
                    if (!zoVar.I0) {
                        zoVar.R.addView(zoVar.V, w7.a6.n(-1, i11));
                    }
                    zoVar.R.addView(zoVar.W, w7.a6.n(-1, i11));
                    zoVar.R.addView(zoVar.T, w7.a6.n(-1, i11));
                    r8Var2 = zoVar.U;
                    if (r8Var2 != null && (chatFull = zoVar.y0) != null && chatFull.requests_pending > 0) {
                        zoVar.R.addView(r8Var2, w7.a6.n(-1, i11));
                    }
                    if (zoVar.I0) {
                        zoVar.R.addView(zoVar.V, w7.a6.n(-1, i11));
                    }
                    if (!zoVar.I0 || zoVar.x0.gigagroup) {
                        zoVar.R.addView(zoVar.X, w7.a6.n(-1, i11));
                    }
                    r8Var3 = zoVar.a0;
                    if (r8Var3 != null) {
                        zoVar.R.addView(r8Var3, w7.a6.n(-1, i11));
                    }
                    r8Var4 = zoVar.Y;
                    if (r8Var4 != null) {
                        zoVar.R.addView(r8Var4, w7.a6.n(-1, i11));
                    }
                    r8Var5 = zoVar.Z;
                    if (r8Var5 != null) {
                        zoVar.R.addView(r8Var5, w7.a6.n(-1, i11));
                    }
                    if (zoVar.Z != null && zoVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(zoVar.x0)) {
                        zoVar.Z.setVisibility(0);
                    }
                    r8Var6 = zoVar.Y;
                    if (r8Var6 != null) {
                        org.telegram.ui.Cells.r8 r8Var25 = zoVar.Z;
                        r8Var6.setNeedDivider(r8Var25 != null && r8Var25.getVisibility() == 0);
                    }
                }
            }
            i12 = 0;
            r8Var15.setVisibility(i12);
            final int i272 = 21;
            zoVar.X.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i272) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var162 = new org.telegram.ui.Cells.r8(context2);
            zoVar.V = r8Var162;
            r8Var162.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            final int i282 = 22;
            zoVar.V.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i282) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var172 = new org.telegram.ui.Cells.r8(context2);
            zoVar.O = r8Var172;
            r8Var172.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            final int i292 = 23;
            zoVar.O.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(zoVar.x0, 28)) {
            }
            org.telegram.ui.Cells.r8 r8Var192 = new org.telegram.ui.Cells.r8(context2);
            zoVar.W = r8Var192;
            final int i312 = 0;
            r8Var192.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.W.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i312) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var202 = new org.telegram.ui.Cells.r8(context2);
            zoVar.T = r8Var202;
            r8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
            final int i322 = 2;
            zoVar.T.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(zoVar.x0)) {
            }
            org.telegram.ui.Cells.r8 r8Var222 = new org.telegram.ui.Cells.r8(context2);
            zoVar.Z = r8Var222;
            r8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            zoVar.Z.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            final int i342 = 4;
            zoVar.Z.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            zoVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(zoVar.x0)) {
            }
            org.telegram.ui.Cells.r8 r8Var232 = new org.telegram.ui.Cells.r8(context2);
            zoVar.Y = r8Var232;
            r8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            zoVar.Y.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.Y.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(zoVar.x0)) {
            }
            zoVar.R.addView(zoVar.O, w7.a6.n(-1, i11));
            r8Var = zoVar.f0;
            if (r8Var != null) {
            }
            if (!zoVar.I0) {
                zoVar.R.addView(zoVar.X, w7.a6.n(-1, i11));
            }
            if (!zoVar.I0) {
            }
            zoVar.R.addView(zoVar.W, w7.a6.n(-1, i11));
            zoVar.R.addView(zoVar.T, w7.a6.n(-1, i11));
            r8Var2 = zoVar.U;
            if (r8Var2 != null) {
                zoVar.R.addView(r8Var2, w7.a6.n(-1, i11));
            }
            if (zoVar.I0) {
            }
            if (!zoVar.I0) {
            }
            zoVar.R.addView(zoVar.X, w7.a6.n(-1, i11));
            r8Var3 = zoVar.a0;
            if (r8Var3 != null) {
            }
            r8Var4 = zoVar.Y;
            if (r8Var4 != null) {
            }
            r8Var5 = zoVar.Z;
            if (r8Var5 != null) {
            }
            if (zoVar.Z != null) {
                zoVar.Z.setVisibility(0);
            }
            r8Var6 = zoVar.Y;
            if (r8Var6 != null) {
            }
        }
        if (zoVar.D0 != null) {
            org.telegram.ui.Cells.r8 r8Var26 = new org.telegram.ui.Cells.r8(context2);
            zoVar.l0 = r8Var26;
            r8Var26.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.l0.setPrioritizeTitleOverValue(true);
            zoVar.R.addView(zoVar.l0, w7.a6.n(-1, i11));
            final int i36 = 7;
            zoVar.l0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i36) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            zoVar.r0();
            org.telegram.ui.Cells.r8 r8Var27 = new org.telegram.ui.Cells.r8(context2);
            zoVar.o0 = r8Var27;
            r8Var27.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.o0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            zoVar.R.addView(zoVar.o0, w7.a6.n(-1, i11));
            zoVar.o0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i26) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            zoVar.o0.f(45, zoVar.E0 == null, false);
            TLRPC.UserFull userFull = zoVar.E0;
            if (userFull != null) {
                org.telegram.ui.Cells.r8 r8Var28 = zoVar.o0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                r8Var28.u(format, z11);
            }
            if (!zoVar.getMessagesController().starrefProgramAllowed) {
                zoVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.r8 r8Var29 = new org.telegram.ui.Cells.r8(context2);
            zoVar.p0 = r8Var29;
            r8Var29.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.p0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            zoVar.R.addView(zoVar.p0, w7.a6.n(-1, i11));
            final int i37 = 9;
            zoVar.p0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i37) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var30 = new org.telegram.ui.Cells.r8(context2);
            zoVar.q0 = r8Var30;
            r8Var30.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.q0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            zoVar.R.addView(zoVar.q0, w7.a6.n(-1, i11));
            final int i38 = 10;
            zoVar.q0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var31 = new org.telegram.ui.Cells.r8(context2);
            zoVar.r0 = r8Var31;
            r8Var31.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            zoVar.r0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            zoVar.R.addView(zoVar.r0, w7.a6.n(-1, i11));
            final int i39 = 11;
            zoVar.r0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = zoVar.x0;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                zoVar.R.setVisibility(8);
                zoVar.G.setVisibility(8);
            }
            eeVar2.addView(new org.telegram.ui.Cells.b7(context2), w7.a6.n(-1, i11));
        } else if (zoVar.D0 != null) {
            zoVar.s0 = new org.telegram.ui.Cells.e9(context2, 12, zoVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new yo(0), indexOf, indexOf + 10, 33);
            }
            zoVar.s0.setText(valueOf);
            eeVar2.addView(zoVar.s0, w7.a6.n(-1, i11));
            org.telegram.ui.Cells.r8 r8Var32 = new org.telegram.ui.Cells.r8(context2);
            zoVar.u0 = r8Var32;
            r8Var32.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
            zoVar.u0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.r8 r8Var33 = zoVar.u0;
            int i40 = org.telegram.ui.ActionBar.g6.q6;
            r8Var33.e(i40, i40);
            eeVar2.addView(zoVar.u0, w7.a6.n(-1, i11));
            final int i41 = 13;
            zoVar.u0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i41) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j13 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j13;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j13));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j14;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context2, 12, zoVar.resourceProvider);
            zoVar.t0 = e9Var2;
            e9Var2.setFixedSize(12);
            eeVar2.addView(zoVar.t0, w7.a6.n(-1, i11));
            org.telegram.ui.Cells.r8 r8Var34 = zoVar.u0;
            TLRPC.UserFull userFull2 = zoVar.E0;
            r8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.e9 e9Var3 = zoVar.t0;
            TLRPC.UserFull userFull3 = zoVar.E0;
            e9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = zoVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                zoVar.S = linearLayout5;
                linearLayout5.setOrientation(1);
                eeVar2.addView(zoVar.S, w7.a6.n(-1, i11));
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
                m4Var.setText(LocaleController.getString(R.string.BotBalance));
                zoVar.S.addView(m4Var, w7.a6.n(-1, i11));
                org.telegram.ui.Cells.r8 r8Var35 = new org.telegram.ui.Cells.r8(context2);
                zoVar.m0 = r8Var35;
                r8Var35.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                zoVar.m0.setPrioritizeTitleOverValue(true);
                zoVar.S.addView(zoVar.m0, w7.a6.n(-1, i11));
                final zh.p g11 = zh.p.g(zoVar.currentAccount);
                final int i42 = 0;
                zoVar.m0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.lo
                    public final /* synthetic */ zo b;

                    {
                        this.b = zoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i42) {
                            case 0:
                                zo zoVar3 = this.b;
                                long j13 = zoVar3.C0;
                                if (g11.h(j13, false) != null) {
                                    zoVar3.presentFragment(new zh.g(1, j13));
                                    break;
                                }
                                break;
                            default:
                                zo zoVar4 = this.b;
                                long j14 = zoVar4.C0;
                                if (g11.h(j14, false) != null) {
                                    zoVar4.presentFragment(new zh.g(0, j14));
                                    break;
                                }
                                break;
                        }
                    }
                });
                long j13 = j10;
                if (g11.m(j13)) {
                    long i43 = g11.i(j13);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i43 > 0) {
                        double d = i43 / 1.0E9d;
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
                    zoVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.ia0(AndroidUtilities.dp(30.0f), zoVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    zoVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                zoVar.m0.setVisibility(g11.b(j13) ? 0 : 8);
                org.telegram.ui.Cells.r8 r8Var36 = new org.telegram.ui.Cells.r8(context2);
                zoVar.n0 = r8Var36;
                r8Var36.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                final int i44 = 1;
                zoVar.n0.setPrioritizeTitleOverValue(true);
                zoVar.S.addView(zoVar.n0, w7.a6.n(-1, -2));
                zoVar.n0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.lo
                    public final /* synthetic */ zo b;

                    {
                        this.b = zoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i44) {
                            case 0:
                                zo zoVar3 = this.b;
                                long j132 = zoVar3.C0;
                                if (g11.h(j132, false) != null) {
                                    zoVar3.presentFragment(new zh.g(1, j132));
                                    break;
                                }
                                break;
                            default:
                                zo zoVar4 = this.b;
                                long j14 = zoVar4.C0;
                                if (g11.h(j14, false) != null) {
                                    zoVar4.presentFragment(new zh.g(0, j14));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j13, false) != null) {
                    org.telegram.ui.Cells.r8 r8Var37 = zoVar.n0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j13).amount <= 0) {
                        Y0 = "";
                        z10 = false;
                    } else {
                        z10 = false;
                        Y0 = zh.p7.Y0(false, TextUtils.concat("XTR", zh.p7.L0(g11.c(j13), 0.85f, ' ')), 0.85f, null);
                    }
                    r8Var37.q(string2, Y0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.ia0(AndroidUtilities.dp(30.0f), zoVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    zoVar.n0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                zoVar.n0.setVisibility(g11.a(j13) ? 0 : 8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context2, 12, zoVar.getResourceProvider());
                e9Var4.setFixedSize(12);
                e9Var4.setTag(R.id.fit_width_tag, 1);
                eeVar2.addView(e9Var4, w7.a6.n(-1, 12));
                zoVar.S.setVisibility((zoVar.n0.getVisibility() == 0 || zoVar.m0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = zoVar.x0;
        final int i45 = 14;
        if ((chat5 == null || !chat5.creator) && !((user = zoVar.D0) != null && user.bot && user.bot_can_edit)) {
            zoVar2 = zoVar;
        } else {
            final long j14 = chat5 != null ? chat5.linked_community_id : zoVar.D0.linked_community_id;
            final long j15 = chat5 != null ? -chat5.id : zoVar.D0.id;
            final boolean z17 = zoVar.D0 != null;
            if (j14 != 0) {
                hi.b bVar = new hi.b(context2, zoVar.resourceProvider);
                zoVar.h0 = bVar;
                bVar.a(zoVar.currentAccount, zoVar.getMessagesController().getChat(Long.valueOf(j14)));
                final int i46 = 0;
                zoVar.h0.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                zoVar.h0.setOnClickListener(new View.OnClickListener(zoVar) { // from class: org.telegram.ui.mo
                    public final /* synthetic */ zo b;

                    {
                        this.b = zoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i46) {
                            case 0:
                                zo zoVar3 = this.b;
                                MessagesController messagesController = zoVar3.getMessagesController();
                                long j16 = j14;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j16)))) {
                                    zoVar3.showDialog(new gi.k0(zoVar3, j16, null, null));
                                    break;
                                } else {
                                    zoVar3.presentFragment(new gi.p(t8.b.e(j16, "community_id")));
                                    break;
                                }
                            default:
                                zo zoVar4 = this.b;
                                zoVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j14);
                                zoVar4.presentFragment(new gi.f(bundle));
                                break;
                        }
                    }
                });
                eeVar2.addView(zoVar.h0, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.r8 r8Var38 = new org.telegram.ui.Cells.r8(context2);
                zoVar.j0 = r8Var38;
                r8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : zoVar.I0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                org.telegram.ui.Cells.r8 r8Var39 = zoVar.j0;
                int i47 = org.telegram.ui.ActionBar.g6.p7;
                r8Var39.e(i47, i47);
                zoVar.j0.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                zoVar2 = zoVar;
                zoVar.j0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.no
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                        zo zoVar3 = zo.this;
                        org.telegram.ui.Components.g5.u0(zoVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : zoVar3.I0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new uo(zoVar3, j15, j14, 0));
                    }
                });
                eeVar2.addView(zoVar2.j0, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context2, 12, zoVar2.getResourceProvider());
                zoVar2.k0 = e9Var5;
                e9Var5.setFixedSize(14);
                zoVar2.k0.setTag(R.id.fit_width_tag, 1);
                eeVar2.addView(zoVar2.k0, w7.a6.n(-1, 14));
            } else {
                zoVar2 = zoVar;
                org.telegram.ui.Cells.r8 r8Var40 = new org.telegram.ui.Cells.r8(context2);
                zoVar2.g0 = r8Var40;
                r8Var40.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                zoVar2.g0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.il));
                zoVar2.g0.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                zoVar2.g0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : zoVar2.I0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                final int i48 = 1;
                zoVar2.g0.setOnClickListener(new View.OnClickListener(zoVar2) { // from class: org.telegram.ui.mo
                    public final /* synthetic */ zo b;

                    {
                        this.b = zoVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i48) {
                            case 0:
                                zo zoVar3 = this.b;
                                MessagesController messagesController = zoVar3.getMessagesController();
                                long j16 = j15;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j16)))) {
                                    zoVar3.showDialog(new gi.k0(zoVar3, j16, null, null));
                                    break;
                                } else {
                                    zoVar3.presentFragment(new gi.p(t8.b.e(j16, "community_id")));
                                    break;
                                }
                            default:
                                zo zoVar4 = this.b;
                                zoVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j15);
                                zoVar4.presentFragment(new gi.f(bundle));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.e9 e9Var6 = new org.telegram.ui.Cells.e9(context2, 12, zoVar2.resourceProvider);
                zoVar2.i0 = e9Var6;
                e9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : zoVar2.I0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                eeVar2.addView(zoVar2.g0, w7.a6.n(-1, -2));
                eeVar2.addView(zoVar2.i0, w7.a6.n(-1, -2));
            }
        }
        TLRPC.Chat chat6 = zoVar2.x0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context2);
            zoVar2.c0 = frameLayout3;
            eeVar2.addView(frameLayout3, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context2);
            zoVar2.d0 = caVar;
            caVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7));
            zoVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
            if (zoVar2.D0 != null) {
                zoVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
            } else if (zoVar2.I0) {
                zoVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                zoVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            zoVar2.c0.addView(zoVar2.d0, w7.a6.d(-2.0f, -1));
            zoVar2.d0.setOnClickListener(new View.OnClickListener(zoVar2) { // from class: org.telegram.ui.jo
                public final /* synthetic */ zo b;

                {
                    this.b = zoVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            zo zoVar3 = this.b;
                            zoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", zoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(zoVar3.y0);
                            zoVar3.presentFragment(yrVar);
                            break;
                        case 1:
                            zo zoVar4 = this.b;
                            wo woVar = zoVar4.Q0;
                            long j112 = zoVar4.C0;
                            if (!zoVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j112 == 0 ? null : zoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user22 == null) {
                                    TLRPC.Chat chat22 = zoVar4.getMessagesController().getChat(Long.valueOf(zoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull4 = zoVar4.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(zoVar4.y0.chat_photo.video_sizes.get(0), zoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, zoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().f2(null, user22.photo.photo_big, null, null, null, null, null, 0, woVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            zo zoVar5 = this.b;
                            zoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", zoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            yr yrVar2 = new yr(bundle2);
                            yrVar2.x0(zoVar5.y0);
                            zoVar5.presentFragment(yrVar2);
                            break;
                        case 3:
                            zo zoVar6 = this.b;
                            zoVar6.presentFragment(new fi0(zoVar6.w0));
                            break;
                        case 4:
                            zo zoVar7 = this.b;
                            zoVar7.presentFragment(new fi.f4(-zoVar7.w0));
                            break;
                        case 5:
                            zo zoVar8 = this.b;
                            zoVar8.getClass();
                            zoVar8.presentFragment(new ac(zoVar8.x0));
                            break;
                        case 6:
                            zo zoVar9 = this.b;
                            zoVar9.presentFragment(hb1.d0(zoVar9.x0, false));
                            break;
                        case 7:
                            zo zoVar10 = this.b;
                            zoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", zoVar10.C0);
                            zoVar10.presentFragment(new va(bundle3));
                            break;
                        case 8:
                            zo zoVar11 = this.b;
                            zoVar11.presentFragment(new fi.l(zoVar11.C0));
                            break;
                        case 9:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.s(view.getContext(), "https://t.me/BotFather?start=" + zo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            zo.X(this.b);
                            break;
                        case 14:
                            zo zoVar12 = this.b;
                            org.telegram.ui.Components.g5.r(zoVar12, false, zoVar12.x0, null, false, true, true, false, new qo(zoVar12, 7));
                            break;
                        case 15:
                            zo zoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(zoVar13)) {
                                nd0 nd0Var = new nd0(4);
                                nd0Var.e0 = -zoVar13.w0;
                                TLRPC.ChatFull chatFull5 = zoVar13.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        nd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                nd0Var.F0 = new qo(zoVar13, 6);
                                zoVar13.presentFragment(nd0Var);
                                break;
                            }
                            break;
                        case 16:
                            zo zoVar14 = this.b;
                            long j122 = zoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = zoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            np npVar = new np(null);
                            npVar.M = new ArrayList();
                            npVar.N = new ArrayList();
                            npVar.P = new ArrayList();
                            npVar.c0 = true;
                            npVar.f0 = new ArrayList();
                            npVar.o0 = new HashMap();
                            npVar.q0 = new cp(npVar, 5);
                            npVar.t0 = false;
                            npVar.Z = j122;
                            npVar.n0 = z152;
                            TLRPC.ChatFull chatFull6 = zoVar14.y0;
                            npVar.Y = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    npVar.l0 = tL_chatInviteExported;
                                } else {
                                    npVar.X(false);
                                }
                            }
                            zoVar14.presentFragment(npVar);
                            break;
                        case 17:
                            zo zoVar15 = this.b;
                            long j132 = zoVar15.w0;
                            aq aqVar = new aq(null);
                            aqVar.v = new ArrayList();
                            boolean z162 = false;
                            aqVar.O = false;
                            aqVar.P = false;
                            aqVar.E = j132;
                            TLRPC.Chat chat222 = aqVar.getMessagesController().getChat(Long.valueOf(j132));
                            aqVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !aqVar.f.megagroup) {
                                z162 = true;
                            }
                            aqVar.s = z162;
                            aqVar.h = zoVar15.y0;
                            zoVar15.presentFragment(aqVar);
                            break;
                        case 18:
                            zo zoVar16 = this.b;
                            zw0 zw0Var = new zw0(zoVar16.w0);
                            zw0Var.v = new qo(zoVar16, 4);
                            zoVar16.presentFragment(zw0Var);
                            break;
                        case 19:
                            zo.Z(this.b);
                            break;
                        case 20:
                            zo zoVar17 = this.b;
                            x60 x60Var = new x60(-zoVar17.x0.id);
                            x60Var.c = zoVar17.L0;
                            x60Var.l0 = zoVar17;
                            zoVar17.presentFragment(x60Var);
                            break;
                        case 21:
                            zo zoVar18 = this.b;
                            zoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", zoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((zoVar18.I0 || zoVar18.x0.gigagroup) && !ChatObject.isCommunity(zoVar18.x0)) ? 0 : 3);
                            yr yrVar3 = new yr(bundle4);
                            yrVar3.x0(zoVar18.y0);
                            zoVar18.presentFragment(yrVar3);
                            break;
                        case 22:
                            zo zoVar19 = this.b;
                            ei0 ei0Var = new ei0(zoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = zoVar19.y0;
                            ei0Var.g0(chatFull7, chatFull7.exported_invite);
                            zoVar19.presentFragment(ei0Var);
                            break;
                        case 23:
                            zo zoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(zoVar20.x0)) {
                                zoVar20.presentFragment(new ah.a0(zoVar20.w0, zoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", zoVar20.w0);
                                hq hqVar = new hq(bundle5);
                                hqVar.d = new ArrayList();
                                hqVar.r = new ArrayList();
                                hqVar.v = -1;
                                hqVar.F = new ArrayList();
                                long j142 = bundle5.getLong("chat_id", 0L);
                                hqVar.c = j142;
                                TLRPC.ChatFull chatFull8 = zoVar20.y0;
                                hqVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (hqVar.a == null) {
                                        hqVar.a = hqVar.getMessagesController().getChat(Long.valueOf(j142));
                                    }
                                    hqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        hqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        hqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                hqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        hqVar.w = 1;
                                    }
                                }
                                zoVar20.presentFragment(hqVar);
                                break;
                            }
                        default:
                            zo zoVar21 = this.b;
                            zoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", zoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", zoVar21.w0);
                            zoVar21.presentFragment(new fo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(context2);
            zoVar2.e0 = b7Var2;
            eeVar2.addView(b7Var2, w7.a6.n(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        zoVar2.c = undoView;
        odVar.addView(undoView, w7.a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        org.telegram.ui.Components.vu vuVar6 = zoVar2.v;
        TLRPC.User user3 = zoVar2.D0;
        vuVar6.setText(Emoji.replaceEmoji(user3 != null ? ContactsController.formatName(user3) : zoVar2.x0.title, zoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.vu vuVar7 = zoVar2.v;
        vuVar7.setSelection(vuVar7.n());
        TLRPC.ChatFull chatFull4 = zoVar2.y0;
        if (chatFull4 != null) {
            zoVar2.E.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = zoVar2.E0;
            if (userFull4 != null) {
                zoVar2.E.setText(userFull4.about);
            }
        }
        zoVar2.k0();
        zoVar2.p0(true, false);
        return zoVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.x0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.r8 r8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z11 = true;
        long j10 = this.C0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.w0) {
                if (this.y0 == null && (editTextBoldCursor = this.E) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.y0 == null;
                this.y0 = chatFull;
                f0();
                if (j10 != 0) {
                    this.G0 = false;
                } else {
                    if (!this.F0) {
                        TLRPC.ChatFull chatFull2 = this.y0;
                    }
                    TLRPC.ChatFull chatFull3 = this.y0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z10 = true;
                        this.G0 = z10;
                        r8Var = this.Q;
                        if (r8Var != null) {
                            r8Var.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.G0 = z10;
                    r8Var = this.Q;
                    if (r8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.x0) && !this.y0.hidden_prehistory) {
                    z11 = false;
                }
                this.J0 = z11;
                p0(false, false);
                if (z12) {
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
            if (this.w0 != longValue) {
                return;
            }
            this.F0 = booleanValue;
            this.H0 = booleanValue2;
            org.telegram.ui.Cells.r8 r8Var2 = this.Q;
            if (r8Var2 != null) {
                r8Var2.setChecked(booleanValue);
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
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.y0 = chatFull4;
                if (chatFull4 != null) {
                    this.K0 = chatFull4.available_reactions;
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
                if (i10 == NotificationCenter.dialogDeleted && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
                    if (b5Var2 == null || b5Var2.getLastFragment() != this) {
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
            if (this.n0 != null) {
                zh.p g10 = zh.p.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j10) ? 0 : 8);
                this.n0.u(zh.p7.Y0(false, TextUtils.concat("XTR", zh.p7.K0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.r8 r8Var3 = this.l0;
                if (r8Var3 != null) {
                    r8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.S.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                zh.p g11 = zh.p.g(this.currentAccount);
                this.m0.setVisibility(g11.b(j10) ? 0 : 8);
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
                this.m0.u(spannableStringBuilder, true);
                org.telegram.ui.Cells.r8 r8Var4 = this.l0;
                if (r8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z11 = false;
                    }
                    r8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.S;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.vu vuVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.vu vuVar2 = this.v;
            if ((vuVar2 == null || this.D0.first_name.equals(vuVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new qo(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new qo(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory == this.J0) && (((vuVar = this.v) == null || this.x0.title.equals(vuVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.F0 == this.x0.forum))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.I0) {
                    alertDialog$Builder2.a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder2.a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new qo(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new qo(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    public final void f0() {
        if (this.f0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.w0);
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ kv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.h50
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        xo xoVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(xoVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.r8 r8Var = this.U;
        if (r8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(r8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.vu vuVar = this.v;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c0, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e0, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d0, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i17 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.r8 r8Var2 = this.K;
        if (r8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(r8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.r8 r8Var3 = this.a0;
        if (r8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(r8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new po(this, 0));
    }

    public final void i0() {
        this.s.n(this.v0 != null, new ro(this, 0), new v5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.b0.e.d();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.vu vuVar;
        String str;
        String str2;
        if (this.N0 || (vuVar = this.v) == null) {
            return;
        }
        if (vuVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.N0 = true;
        int i10 = 0;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.D0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.D0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.E.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new ga(this, getConnectionsManager().sendRequest(setbotinfo, new to(i10, this, setbotinfo)), 2));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.x0) && (!this.J0 || this.F0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.w0, this, new qo(this, 5));
            return;
        }
        if (this.y0 != null && ChatObject.isChannel(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.J0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().toggleChannelInvitesHistory(this.w0, this.J0);
            }
        }
        if (this.s.g()) {
            this.M0 = true;
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            this.b = a2Var;
            a2Var.setOnCancelListener(new ug(this, r0));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.w0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.w0, this.E.getText().toString(), this.y0);
        }
        boolean z12 = this.F0;
        TLRPC.Chat chat = this.x0;
        if (z12 != chat.forum || this.H0 != chat.forum_tabs) {
            r0 = this.H0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.w0, this.F0, this.H0);
            if (this.F0 && !this.H0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                while (i10 < fragmentStack.size()) {
                    if ((fragmentStack.get(i10) instanceof fo) && ((fo) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                        HashSet hashSet = lg1.n1;
                        ((ActionBarLayout) parentLayout).c(i10, lg1.E0(getMessagesController(), getMessagesStorage(), bundle));
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
        boolean z10;
        if (this.e == null || this.O0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
        long j10 = this.C0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.D0 = user;
        this.x0 = chat;
        org.telegram.ui.Components.k9 k9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(k9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.v0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, k9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.g()) {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.b0.e.setAnimation(this.R0);
                }
                if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                    PhotoViewer.t1().y0();
                }
                if (this.Z == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.x0)) {
                    this.Z.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.b0 != null) {
        }
        if (PhotoViewer.D1()) {
            PhotoViewer.t1().y0();
        }
        if (this.Z == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.s5 n10;
        this.y0 = chatFull;
        if (chatFull != null) {
            if (this.x0 == null) {
                this.x0 = getMessagesController().getChat(Long.valueOf(this.w0));
            }
            this.J0 = !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory;
            this.K0 = this.y0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
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
                                n10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, org.telegram.ui.Components.s5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.s5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.s5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, org.telegram.ui.Components.s5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.x0)) {
                this.Z.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j10 = this.C0;
                this.D0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.r8 r8Var = this.o0;
            if (r8Var != null) {
                r8Var.f(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.u0;
            if (r8Var2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                r8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.e9 e9Var = this.t0;
            if (e9Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                e9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i10 = 0;
        if (!z11) {
            if (z10) {
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
        if (z10) {
            this.n.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<di.p6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<di.p6, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new vo(i10, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        bq0 bq0Var;
        int w02;
        ArrayList<Integer> arrayList;
        lp0 lp0Var = this.L;
        if (lp0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.r8 r8Var3 = this.N;
            boolean z10 = (r8Var3 != null && r8Var3.getVisibility() == 0) || ((r8Var = this.Q) != null && r8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.x0) && ChatObject.hasAdminRights(this.x0)) || ((r8Var2 = this.M) != null && r8Var2.getVisibility() == 0));
            Paint paint = lp0Var.n;
            int i10 = lp0Var.a;
            org.telegram.ui.ActionBar.c6 c6Var = lp0Var.d;
            if (chat == null) {
                return;
            }
            lp0Var.v = z10;
            lp0Var.r = new org.telegram.ui.Components.h11(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            bq0 bq0Var2 = lp0Var.w;
            if (bq0Var2 != null) {
                bq0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = bq0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                lp0Var.w = new bq0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    bq0Var = bq0.c(i10, ChatObject.getProfileColorId(chat));
                    bq0Var.a = AndroidUtilities.dp(11.0f);
                    bq0Var.d();
                } else {
                    bq0Var = null;
                }
                lp0Var.w = bq0Var;
            }
            bq0 bq0Var3 = lp0Var.w;
            if (bq0Var3 != null) {
                bq0Var3.e(lp0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                lp0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.g6.m1(0.1f, i13));
                bq0 bq0Var4 = new bq0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                bq0Var4.a = AndroidUtilities.dp(11.0f);
                bq0Var4.d();
                lp0Var.x = bq0Var4;
                bq0Var4.e(lp0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.g6.r8[colorId];
                lp0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.g6.w0(i14, c6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    lp0Var.s = -1;
                    w02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.g6.r8[0];
                    lp0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.g6.w0(i15, c6Var);
                }
            }
            lp0Var.r.o(w02);
            paint.setColor(org.telegram.ui.ActionBar.g6.m1(0.1f, w02));
            bq0 a10 = bq0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            lp0Var.x = a10;
            a10.e(lp0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vu vuVar = this.v;
        if (vuVar == null || !vuVar.e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        vuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0113, code lost:
    
        if (java.lang.Math.max(r1 == null ? 0 : r1.participants_count, r0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011d, code lost:
    
        if (r0.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    @Override // org.telegram.ui.ActionBar.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.w0;
        long j11 = this.C0;
        boolean z10 = true;
        if (j10 == 0) {
            TLRPC.User user = j11 == 0 ? null : getMessagesController().getUser(Long.valueOf(j11));
            this.D0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j11);
                this.D0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.D0, true);
                    if (this.E0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.E0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            org.telegram.ui.Components.k9 k9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.i50 i50Var = this.s;
            i50Var.a = this;
            i50Var.b = this;
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.w0));
        this.x0 = chat2;
        if (chat2 == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.w0);
            this.x0 = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.w0, ChatObject.isChannel(this.x0), new CountDownLatch(1), false, false);
                    this.y0 = loadChatInfo;
                }
            }
            return false;
        }
        chat = this.x0;
        org.telegram.ui.Components.k9 k9Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            k9Var2.n(5L, this.x0.title, null);
            this.I0 = ChatObject.isChannel(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat3 = this.x0;
            boolean z11 = chat3.forum;
            this.F0 = z11;
            this.H0 = chat3.forum_tabs;
            if (j11 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.y0;
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null) {
                }
                this.G0 = z10;
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
                getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
            }
            z10 = false;
            this.G0 = z10;
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            k9Var2.n(5L, this.D0.first_name, null);
            this.I0 = false;
            this.F0 = false;
            this.H0 = false;
            this.G0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.i50 i50Var2 = this.s;
        i50Var2.a = this;
        i50Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.y0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.i50 i50Var = this.s;
        if (i50Var != null) {
            i50Var.d();
        }
        if (this.x0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.vu vuVar = this.v;
        if (vuVar != null) {
            vuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ee eeVar = this.w;
        if (eeVar != null) {
            eeVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.s5) obj).p(null);
        }
        org.telegram.ui.Components.vu vuVar = this.v;
        if (vuVar != null) {
            vuVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.vu vuVar = this.v;
        if (vuVar != null) {
            vuVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.s.k();
    }

    public final void p0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        TLRPC.ChatFull chatFull;
        int i14;
        String str2;
        String string;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        org.telegram.ui.Cells.r8 r8Var3;
        org.telegram.ui.Cells.r8 r8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.r8 r8Var5;
        org.telegram.ui.Cells.r8 r8Var6;
        org.telegram.ui.Cells.r8 r8Var7;
        org.telegram.ui.Cells.r8 r8Var8;
        org.telegram.ui.Cells.r8 r8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.w0))) != null) {
            this.x0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.x0);
        org.telegram.ui.Cells.e9 e9Var = this.P;
        if (e9Var != null) {
            e9Var.setVisibility((this.I != null || ((r8Var7 = this.J) != null && r8Var7.getVisibility() == 0) || (((r8Var8 = this.N) != null && r8Var8.getVisibility() == 0) || ((r8Var9 = this.H) != null && r8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.r8 r8Var10 = this.Y;
        if (r8Var10 != null) {
            r8Var10.setVisibility(ChatObject.isChannel(this.x0) ? 0 : 8);
        }
        org.telegram.ui.Cells.r8 r8Var11 = this.J;
        if (r8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.I0 && chatFull2.linked_chat_id == 0)) {
                r8Var11.setVisibility(8);
            } else {
                r8Var11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.J.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.y0.linked_chat_id));
                    if (chat2 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), t8.b.h("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.r8 r8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var13 = this.Q;
                            r8Var12.s(string2, str4, false, i16, r8Var13 != null && r8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.r8 r8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String h = t8.b.h("@", publicUsername2);
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var15 = this.Q;
                            r8Var14.s(string3, h, false, i17, r8Var15 != null && r8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.r8 r8Var16 = this.H;
        if (r8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                r8Var16.setVisibility(8);
            } else {
                r8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.x0.noforwards;
                if (this.I0) {
                    if (isPublic) {
                        i15 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z13) {
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
                    } else if (z13) {
                        i14 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i14);
                }
                String str5 = string;
                if (this.I0) {
                    org.telegram.ui.Cells.r8 r8Var17 = this.I;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i18 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.r8 r8Var18 = this.N;
                    r8Var17.s(string4, str5, false, i18, (r8Var18 != null && r8Var18.getVisibility() == 0) || ((r8Var3 = this.J) != null && r8Var3.getVisibility() == 0) || ((r8Var4 = this.Q) != null && r8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.r8 r8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i19 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var20 = this.N;
                    r8Var19.s(string5, str5, false, i19, (r8Var20 != null && r8Var20.getVisibility() == 0) || ((r8Var = this.J) != null && r8Var.getVisibility() == 0) || ((r8Var2 = this.Q) != null && r8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.x0));
                org.telegram.ui.Cells.r8 r8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i20 = R.drawable.msg_channel;
                org.telegram.ui.Cells.r8 r8Var22 = this.N;
                r8Var21.s(string7, string6, false, i20, (r8Var22 != null && r8Var22.getVisibility() == 0) || ((r8Var5 = this.J) != null && r8Var5.getVisibility() == 0) || ((r8Var6 = this.Q) != null && r8Var6.getVisibility() == 0));
            }
        }
        if (this.N != null) {
            if (!this.J0 || this.F0) {
                i13 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i13 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.N.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i13), z11, R.drawable.msg_discuss, this.Q != null);
            this.N.setEnabled(!this.F0);
            boolean z14 = (this.F0 || isPublic || ((chatFull = this.y0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.N.getAlpha() <= 0.0f && !z14) {
                this.N.setVisibility(8);
                o0();
            } else if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                int i21 = 0;
                boolean z15 = false;
                while (i21 < this.F.getChildCount()) {
                    if (!z15 && this.F.getChildAt(i21) == this.N) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.F.getChildAt(i21));
                    }
                    i21++;
                    z15 = z15;
                }
                int i22 = 0;
                boolean z16 = false;
                while (i22 < this.w.getChildCount()) {
                    if (!z16 && this.w.getChildAt(i22) == this.F) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.w.getChildAt(i22));
                    }
                    i22++;
                    z16 = z16;
                }
                if (this.N.getVisibility() != 0) {
                    this.N.setAlpha(0.0f);
                    this.N.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.N.setVisibility(0);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    ((View) arrayList.get(i23)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.S0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.l0(11, this, arrayList));
                    this.S0.addListener(new ah.q0(this, z14, arrayList, 5));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.es.h);
                    this.S0.start();
                } else {
                    this.N.setAlpha(z14 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z14 ? 0 : 8);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY(0.0f);
                    }
                    this.S0 = null;
                }
            }
        }
        if (this.T != null) {
            if (this.y0 != null) {
                org.telegram.ui.Cells.r8 r8Var23 = this.U;
                if (r8Var23 != null) {
                    if (r8Var23.getParent() == null) {
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.a6.n(-1, -2));
                    }
                    this.U.setVisibility(this.y0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    if (ChatObject.isChannel(this.x0)) {
                        this.T.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.T.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.y0.participants.participants.size())), false, R.drawable.msg_groups, this.U.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.x0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i25 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i10 = yr.n0(tL_chatBannedRights) + i26;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
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
                        z12 = z11;
                        this.X.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.r8 r8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i27 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.r8 r8Var25 = this.Y;
                        r8Var24.s(string8, format, false, i27, r8Var25 != null && r8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.r8 r8Var26 = this.U;
                    if (r8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.y0.requests_pending));
                        int i28 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.r8 r8Var27 = this.Y;
                        r8Var26.s(string9, format2, false, i28, r8Var27 != null && r8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.r8 r8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i29 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.r8 r8Var29 = this.Y;
                    r8Var28.s(string10, format3, false, i29, r8Var29 != null && r8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.r8 r8Var30 = this.W;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.x0)) {
                    i12 = this.y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.y0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i30 = 0;
                        for (int i31 = 0; i31 < size; i31++) {
                            TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i31);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i30++;
                            }
                        }
                        i12 = i30;
                    }
                }
                r8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    org.telegram.ui.Cells.r8 r8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i32 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var32 = this.Y;
                    r8Var31.m(i32, string12, r8Var32 != null && r8Var32.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i33 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.r8 r8Var34 = this.Y;
                        r8Var33.m(i33, string13, r8Var34 != null && r8Var34.getVisibility() == 0);
                    } else {
                        this.X.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.r8 r8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i34 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.r8 r8Var36 = this.Y;
                    r8Var35.m(i34, string14, r8Var36 != null && r8Var36.getVisibility() == 0);
                }
                this.W.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.O.setVisibility(ChatObject.canChangeChatInfo(this.x0) ? 0 : 8);
            s0(z12);
            if (this.y0 == null || !ChatObject.canUserDoAdminAction(this.x0, 3) || (isPublic && this.x0.creator)) {
                this.V.setVisibility(8);
            } else if (this.y0.invitesCount > 0) {
                this.V.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.V.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.K != null) {
            t0(null);
        }
    }

    public final void q0() {
        yy yyVar;
        sx sxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof fo) {
                fo foVar = (fo) fragmentStack.get(i10);
                if (foVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(foVar, false);
                    foVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, foVar);
                    if (!this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new lg1(bundle));
                        i10++;
                    }
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof lg1)) {
                lg1 lg1Var = (lg1) fragmentStack.get(i10);
                if (lg1Var.g() != null && lg1Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(lg1Var, false);
                    i10--;
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof yy) && (yyVar = (yy) fragmentStack.get(i10)) != null && (sxVar = yyVar.F3) != null && sxVar.c()) {
                yyVar.F3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
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
        this.l0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.i50 i50Var = this.s;
        if (i50Var != null) {
            i50Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10) {
        String str;
        String str2;
        int i10;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.w0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.x0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string;
                this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i11 = 0;
            for (0; i10 < tL_chatReactionsSome.reactions.size(); i10 + 1) {
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
        this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.i50 i50Var = this.s;
        if (i50Var != null && (str = i50Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.vu vuVar = this.v;
        if (vuVar != null) {
            String obj = vuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l4) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.K == null) {
            return;
        }
        long j10 = 0;
        if (!(l4 != null ? l4.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.K.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.x0.linked_monoforum_id));
        if (l4 != null) {
            j10 = l4.longValue();
        } else if (chat2 != null) {
            j10 = chat2.send_paid_messages_stars;
        }
        this.K.s(LocaleController.getString(R.string.PostSuggestions), zh.p7.Y0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ void P() {
    }
}
