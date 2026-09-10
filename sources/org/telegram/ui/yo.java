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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class yo extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.d50, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public EditTextBoldCursor E;
    public TLRPC.UserFull E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.c7 G;
    public boolean G0;
    public org.telegram.ui.Cells.s8 H;
    public boolean H0;
    public org.telegram.ui.Cells.s8 I;
    public boolean I0;
    public org.telegram.ui.Cells.s8 J;
    public boolean J0;
    public org.telegram.ui.Cells.s8 K;
    public TLRPC.ChatReactions K0;
    public fp0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.s8 M;
    public boolean M0;
    public org.telegram.ui.Cells.s8 N;
    public boolean N0;
    public org.telegram.ui.Cells.s8 O;
    public boolean O0;
    public org.telegram.ui.Cells.f9 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.s8 Q;
    public final uo Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.hj0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.s8 T;
    public org.telegram.ui.Cells.s8 U;
    public org.telegram.ui.Cells.s8 V;
    public org.telegram.ui.Cells.s8 W;
    public org.telegram.ui.Cells.s8 X;
    public org.telegram.ui.Cells.s8 Y;
    public org.telegram.ui.Cells.s8 Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.s8 a0;
    public org.telegram.ui.ActionBar.d2 b;
    public wo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ga d0;
    public gg.i1 e;
    public org.telegram.ui.Cells.c7 e0;
    public bi.s7 f;
    public org.telegram.ui.Cells.s8 f0;
    public org.telegram.ui.Cells.s8 g0;
    public AnimatorSet h;
    public fi.b h0;
    public org.telegram.ui.Cells.f9 i0;
    public org.telegram.ui.Cells.s8 j0;
    public org.telegram.ui.Cells.f9 k0;
    public org.telegram.ui.Cells.s8 l0;
    public org.telegram.ui.Cells.s8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.s8 n0;
    public org.telegram.ui.Cells.s8 o0;
    public org.telegram.ui.Cells.s8 p0;
    public org.telegram.ui.Cells.s8 q0;
    public final org.telegram.ui.Components.g9 r;
    public org.telegram.ui.Cells.s8 r0;
    public final org.telegram.ui.Components.e50 s;
    public org.telegram.ui.Cells.f9 s0;
    public org.telegram.ui.Cells.f9 t0;
    public org.telegram.ui.Cells.s8 u0;
    public org.telegram.ui.Components.nu v;
    public TLRPC.FileLocation v0;
    public zd w;
    public long w0;
    public org.telegram.ui.Components.io0 x;
    public TLRPC.Chat x0;
    public LinearLayout y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public yo(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new uo(this);
        this.r = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.e50(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.e50((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(yo yoVar, FrameLayout frameLayout, View view) {
        if (!yoVar.G0) {
            TLRPC.ChatFull chatFull = yoVar.y0;
            org.telegram.ui.Components.wc.a0(yoVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", yoVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j3 = -yoVar.w0;
        oz ozVar = new oz(null);
        ozVar.a = j3;
        ozVar.setResourceProvider(yoVar.resourceProvider);
        boolean z10 = yoVar.F0;
        boolean z11 = yoVar.H0;
        bi.k6 k6Var = new bi.k6(6, yoVar, view);
        ozVar.c = z10;
        ozVar.d = z11;
        ozVar.f = k6Var;
        yoVar.presentFragment(ozVar);
    }

    public static /* synthetic */ void V(yo yoVar) {
        yoVar.v0 = null;
        long j3 = yoVar.C0;
        if (j3 == 0) {
            MessagesController.getInstance(yoVar.currentAccount).changeChatAvatar(yoVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = yoVar.getMessagesController().getInputUser(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            yoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new oo(yoVar, 2));
        }
        yoVar.n0(false, true);
        gg.i1 i1Var = yoVar.e;
        org.telegram.ui.Components.g9 g9Var = yoVar.r;
        Object obj = yoVar.D0;
        if (obj == null) {
            obj = yoVar.x0;
        }
        i1Var.h(null, null, g9Var, obj);
        yoVar.R0.M(0);
        yoVar.b0.e.d();
    }

    public static void X(yo yoVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        d2Var.dismiss();
        if (yoVar.getParentActivity() == null) {
            return;
        }
        qg.k0 k0Var = new qg.k0(35, yoVar.currentAccount, yoVar.getParentActivity(), yoVar, yoVar.getResourceProvider());
        k0Var.G1(canApplyBoost);
        k0Var.F1(tL_premium_boostsStatus, true);
        k0Var.H1(j3);
        TLRPC.Chat chat = yoVar.getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            k0Var.Q0 = new qh(11, yoVar, chat);
        }
        yoVar.showDialog(k0Var);
    }

    public static void Y(yo yoVar) {
        int i10 = yoVar.currentAccount;
        long j3 = yoVar.C0;
        TL_bots.botVerifierSettings botverifiersettings = yoVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e = org.telegram.messenger.a2.e(16, "onlySelect", "dialogsType", true);
        e.putBoolean("resetDelegate", false);
        wy wyVar = new wy(e);
        wyVar.setCurrentAccount(i10);
        wyVar.C2 = new di.x1(wyVar, i10, j3, botverifiersettings);
        U.presentFragment(wyVar);
    }

    public static void Z(yo yoVar) {
        cd cdVar = new cd(-yoVar.x0.id);
        cdVar.l0 = yoVar;
        yoVar.presentFragment(cdVar);
        MessagesController.getInstance(yoVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(yoVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(yo yoVar) {
        yoVar.O0 = true;
        NotificationCenter.getInstance(yoVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        f10 f10Var = new f10(10);
        f10Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        f10Var.f = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false);
        spannableStringBuilder.setSpan(f10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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

    @Override // org.telegram.ui.Components.d50
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ei.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0f35  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0f97  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0fc3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0fcb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0f9c  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        Context context2;
        CharSequence charSequence;
        Integer num;
        zd zdVar;
        final int i10;
        final int i11;
        final yo yoVar;
        int i12;
        zd zdVar2;
        Integer num2;
        boolean z10;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i13;
        TLRPC.User user;
        final yo yoVar2;
        float f7;
        zd zdVar3;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        boolean z11;
        String format;
        int i14;
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.s8 s8Var2;
        org.telegram.ui.Cells.s8 s8Var3;
        org.telegram.ui.Cells.s8 s8Var4;
        org.telegram.ui.Cells.s8 s8Var5;
        org.telegram.ui.Cells.s8 s8Var6;
        TLRPC.ChatFull chatFull2;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i15 = 1;
        org.telegram.ui.Components.nu nuVar = this.v;
        if (nuVar != null) {
            nuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 0));
        jd jdVar = new jd(i15, context, this);
        jdVar.setOnTouchListener(new ai.h(9));
        this.fragmentView = jdVar;
        jdVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.a7));
        zd zdVar4 = new zd(context);
        this.w = zdVar4;
        org.telegram.ui.Components.io0 io0Var = new org.telegram.ui.Components.io0(context, this.w, this.resourceProvider, false);
        this.x = io0Var;
        io0Var.setFillViewport(true);
        jdVar.addView(this.x, w7.a6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(zdVar4, new FrameLayout.LayoutParams(-1, -2));
        zdVar4.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.d6));
        zdVar4.addView(this.d, w7.a6.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.a6.n(-1, -2));
        int i16 = 5;
        gg.i1 i1Var = new gg.i1(this, context, i16);
        this.e = i1Var;
        i1Var.setRoundRadius(this.F0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            gg.i1 i1Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(i1Var2, w7.a6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            bi.s7 s7Var = new bi.s7(this, context, paint, i16);
            this.f = s7Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(s7Var, w7.a6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, w7.a6.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j3 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j3 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j3));
                                if (user2 == null) {
                                    TLRPC.Chat chat3 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i17 = chatPhoto2.dc_id;
                                        if (i17 != 0) {
                                            chatPhoto2.photo_big.dc_id = i17;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat3.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i18 = userProfilePhoto2.dc_id;
                                        if (i18 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i18;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j10 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var7 = yoVar14.H;
                            boolean z15 = s8Var7 != null && s8Var7.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j10;
                            mpVar.n0 = z15;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z16 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat4 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !ypVar.f.megagroup) {
                                z16 = true;
                            }
                            ypVar.s = z16;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                            if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
        } else {
            gg.i1 i1Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(i1Var3, w7.a6.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.nu nuVar2 = new org.telegram.ui.Components.nu(context, jdVar, this);
        this.v = nuVar2;
        long j3 = this.C0;
        if (j3 != 0) {
            nuVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.I0) {
            nuVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            nuVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.nu nuVar3 = this.v;
        TLRPC.Chat chat3 = this.x0;
        nuVar3.setEnabled(chat3 != null || ChatObject.canChangeChatInfo(chat3));
        org.telegram.ui.Components.nu nuVar4 = this.v;
        nuVar4.setFocusable(nuVar4.isEnabled());
        int i17 = 2;
        this.v.getEditText().addTextChangedListener(new m0(this, i17));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.nu nuVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(nuVar5, w7.a6.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        zdVar4.addView(this.y, w7.a6.n(-1, -2));
        final int i18 = 12;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            wo woVar = new wo(context);
            this.b0 = woVar;
            woVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            this.b0.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j10 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var7 = yoVar14.H;
                            boolean z152 = s8Var7 != null && s8Var7.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j10;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat4 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                            if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.b0, w7.a6.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.E.setHintTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i19 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.u0(i19));
        this.E.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(LocaleController.isRTL ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.D0 != null || ChatObject.canChangeChatInfo(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.E.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.E.setCursorColor(org.telegram.ui.ActionBar.j6.u0(i19));
        this.E.setCursorSize(AndroidUtilities.dp(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.y.addView(this.E, w7.a6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, w7.a6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new ja(this, i17));
        this.E.addTextChangedListener(new md(1));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context);
        this.G = c7Var;
        zdVar4.addView(c7Var, w7.a6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(1);
        zdVar4.addView(this.F, w7.a6.n(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.s8 s8Var7 = new org.telegram.ui.Cells.s8(context);
                this.H = s8Var7;
                s8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.H, w7.a6.n(-1, -2));
                final int i20 = 15;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                    public final /* synthetic */ yo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                yo yoVar3 = this.b;
                                yoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", yoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wr wrVar = new wr(bundle);
                                wrVar.x0(yoVar3.y0);
                                yoVar3.presentFragment(wrVar);
                                break;
                            case 1:
                                yo yoVar4 = this.b;
                                uo uoVar = yoVar4.Q0;
                                long j32 = yoVar4.C0;
                                if (!yoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                yo yoVar5 = this.b;
                                yoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", yoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wr wrVar2 = new wr(bundle2);
                                wrVar2.x0(yoVar5.y0);
                                yoVar5.presentFragment(wrVar2);
                                break;
                            case 3:
                                yo yoVar6 = this.b;
                                yoVar6.presentFragment(new ai0(yoVar6.w0));
                                break;
                            case 4:
                                yo yoVar7 = this.b;
                                yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                break;
                            case 5:
                                yo yoVar8 = this.b;
                                yoVar8.getClass();
                                yoVar8.presentFragment(new wb(yoVar8.x0));
                                break;
                            case 6:
                                yo yoVar9 = this.b;
                                yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                break;
                            case 7:
                                yo yoVar10 = this.b;
                                yoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", yoVar10.C0);
                                yoVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                yo yoVar11 = this.b;
                                yoVar11.presentFragment(new di.m(yoVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                yo.Y(this.b);
                                break;
                            case 14:
                                yo yoVar12 = this.b;
                                org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                break;
                            case 15:
                                yo yoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -yoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new po(yoVar13, 6);
                                    yoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                yo yoVar14 = this.b;
                                long j10 = yoVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                mp mpVar = new mp(null);
                                mpVar.M = new ArrayList();
                                mpVar.N = new ArrayList();
                                mpVar.P = new ArrayList();
                                mpVar.c0 = true;
                                mpVar.f0 = new ArrayList();
                                mpVar.o0 = new HashMap();
                                mpVar.q0 = new bp(mpVar, 5);
                                mpVar.t0 = false;
                                mpVar.Z = j10;
                                mpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                mpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        mpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        mpVar.X(false);
                                    }
                                }
                                yoVar14.presentFragment(mpVar);
                                break;
                            case 17:
                                yo yoVar15 = this.b;
                                long j11 = yoVar15.w0;
                                yp ypVar = new yp(null);
                                ypVar.v = new ArrayList();
                                boolean z162 = false;
                                ypVar.O = false;
                                ypVar.P = false;
                                ypVar.E = j11;
                                TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                ypVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                    z162 = true;
                                }
                                ypVar.s = z162;
                                ypVar.h = yoVar15.y0;
                                yoVar15.presentFragment(ypVar);
                                break;
                            case 18:
                                yo yoVar16 = this.b;
                                vw0 vw0Var = new vw0(yoVar16.w0);
                                vw0Var.v = new po(yoVar16, 4);
                                yoVar16.presentFragment(vw0Var);
                                break;
                            case 19:
                                yo.Z(this.b);
                                break;
                            case 20:
                                yo yoVar17 = this.b;
                                s60 s60Var = new s60(-yoVar17.x0.id);
                                s60Var.c = yoVar17.L0;
                                s60Var.l0 = yoVar17;
                                yoVar17.presentFragment(s60Var);
                                break;
                            case 21:
                                yo yoVar18 = this.b;
                                yoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", yoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                wr wrVar3 = new wr(bundle4);
                                wrVar3.x0(yoVar18.y0);
                                yoVar18.presentFragment(wrVar3);
                                break;
                            case 22:
                                yo yoVar19 = this.b;
                                zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                yoVar19.presentFragment(zh0Var);
                                break;
                            case 23:
                                yo yoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                    yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", yoVar20.w0);
                                    fq fqVar = new fq(bundle5);
                                    fqVar.d = new ArrayList();
                                    fqVar.r = new ArrayList();
                                    fqVar.v = -1;
                                    fqVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    fqVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                    fqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (fqVar.a == null) {
                                            fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        fqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            fqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            fqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            fqVar.w = 1;
                                        }
                                    }
                                    yoVar20.presentFragment(fqVar);
                                    break;
                                }
                            default:
                                yo yoVar21 = this.b;
                                yoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", yoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                yoVar21.presentFragment(new eo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.s8 s8Var8 = new org.telegram.ui.Cells.s8(context);
                this.I = s8Var8;
                s8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.I, w7.a6.n(-1, -2));
                final int i21 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                    public final /* synthetic */ yo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                yo yoVar3 = this.b;
                                yoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", yoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wr wrVar = new wr(bundle);
                                wrVar.x0(yoVar3.y0);
                                yoVar3.presentFragment(wrVar);
                                break;
                            case 1:
                                yo yoVar4 = this.b;
                                uo uoVar = yoVar4.Q0;
                                long j32 = yoVar4.C0;
                                if (!yoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                yo yoVar5 = this.b;
                                yoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", yoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wr wrVar2 = new wr(bundle2);
                                wrVar2.x0(yoVar5.y0);
                                yoVar5.presentFragment(wrVar2);
                                break;
                            case 3:
                                yo yoVar6 = this.b;
                                yoVar6.presentFragment(new ai0(yoVar6.w0));
                                break;
                            case 4:
                                yo yoVar7 = this.b;
                                yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                break;
                            case 5:
                                yo yoVar8 = this.b;
                                yoVar8.getClass();
                                yoVar8.presentFragment(new wb(yoVar8.x0));
                                break;
                            case 6:
                                yo yoVar9 = this.b;
                                yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                break;
                            case 7:
                                yo yoVar10 = this.b;
                                yoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", yoVar10.C0);
                                yoVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                yo yoVar11 = this.b;
                                yoVar11.presentFragment(new di.m(yoVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                yo.Y(this.b);
                                break;
                            case 14:
                                yo yoVar12 = this.b;
                                org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                break;
                            case 15:
                                yo yoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -yoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new po(yoVar13, 6);
                                    yoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                yo yoVar14 = this.b;
                                long j10 = yoVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                mp mpVar = new mp(null);
                                mpVar.M = new ArrayList();
                                mpVar.N = new ArrayList();
                                mpVar.P = new ArrayList();
                                mpVar.c0 = true;
                                mpVar.f0 = new ArrayList();
                                mpVar.o0 = new HashMap();
                                mpVar.q0 = new bp(mpVar, 5);
                                mpVar.t0 = false;
                                mpVar.Z = j10;
                                mpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                mpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        mpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        mpVar.X(false);
                                    }
                                }
                                yoVar14.presentFragment(mpVar);
                                break;
                            case 17:
                                yo yoVar15 = this.b;
                                long j11 = yoVar15.w0;
                                yp ypVar = new yp(null);
                                ypVar.v = new ArrayList();
                                boolean z162 = false;
                                ypVar.O = false;
                                ypVar.P = false;
                                ypVar.E = j11;
                                TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                ypVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                    z162 = true;
                                }
                                ypVar.s = z162;
                                ypVar.h = yoVar15.y0;
                                yoVar15.presentFragment(ypVar);
                                break;
                            case 18:
                                yo yoVar16 = this.b;
                                vw0 vw0Var = new vw0(yoVar16.w0);
                                vw0Var.v = new po(yoVar16, 4);
                                yoVar16.presentFragment(vw0Var);
                                break;
                            case 19:
                                yo.Z(this.b);
                                break;
                            case 20:
                                yo yoVar17 = this.b;
                                s60 s60Var = new s60(-yoVar17.x0.id);
                                s60Var.c = yoVar17.L0;
                                s60Var.l0 = yoVar17;
                                yoVar17.presentFragment(s60Var);
                                break;
                            case 21:
                                yo yoVar18 = this.b;
                                yoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", yoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                wr wrVar3 = new wr(bundle4);
                                wrVar3.x0(yoVar18.y0);
                                yoVar18.presentFragment(wrVar3);
                                break;
                            case 22:
                                yo yoVar19 = this.b;
                                zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                yoVar19.presentFragment(zh0Var);
                                break;
                            case 23:
                                yo yoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                    yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", yoVar20.w0);
                                    fq fqVar = new fq(bundle5);
                                    fqVar.d = new ArrayList();
                                    fqVar.r = new ArrayList();
                                    fqVar.v = -1;
                                    fqVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    fqVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                    fqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (fqVar.a == null) {
                                            fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        fqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            fqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            fqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            fqVar.w = 1;
                                        }
                                    }
                                    yoVar20.presentFragment(fqVar);
                                    break;
                                }
                            default:
                                yo yoVar21 = this.b;
                                yoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", yoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                yoVar21.presentFragment(new eo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.x0) && ((this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) || (!this.I0 && ChatObject.canUserDoAdminAction(this.x0, 0)))) {
                org.telegram.ui.Cells.s8 s8Var9 = new org.telegram.ui.Cells.s8(context);
                this.J = s8Var9;
                s8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.J, w7.a6.n(-1, -2));
                final int i22 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                    public final /* synthetic */ yo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                yo yoVar3 = this.b;
                                yoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", yoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wr wrVar = new wr(bundle);
                                wrVar.x0(yoVar3.y0);
                                yoVar3.presentFragment(wrVar);
                                break;
                            case 1:
                                yo yoVar4 = this.b;
                                uo uoVar = yoVar4.Q0;
                                long j32 = yoVar4.C0;
                                if (!yoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                yo yoVar5 = this.b;
                                yoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", yoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wr wrVar2 = new wr(bundle2);
                                wrVar2.x0(yoVar5.y0);
                                yoVar5.presentFragment(wrVar2);
                                break;
                            case 3:
                                yo yoVar6 = this.b;
                                yoVar6.presentFragment(new ai0(yoVar6.w0));
                                break;
                            case 4:
                                yo yoVar7 = this.b;
                                yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                break;
                            case 5:
                                yo yoVar8 = this.b;
                                yoVar8.getClass();
                                yoVar8.presentFragment(new wb(yoVar8.x0));
                                break;
                            case 6:
                                yo yoVar9 = this.b;
                                yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                break;
                            case 7:
                                yo yoVar10 = this.b;
                                yoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", yoVar10.C0);
                                yoVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                yo yoVar11 = this.b;
                                yoVar11.presentFragment(new di.m(yoVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                yo.Y(this.b);
                                break;
                            case 14:
                                yo yoVar12 = this.b;
                                org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                break;
                            case 15:
                                yo yoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -yoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new po(yoVar13, 6);
                                    yoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                yo yoVar14 = this.b;
                                long j10 = yoVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                mp mpVar = new mp(null);
                                mpVar.M = new ArrayList();
                                mpVar.N = new ArrayList();
                                mpVar.P = new ArrayList();
                                mpVar.c0 = true;
                                mpVar.f0 = new ArrayList();
                                mpVar.o0 = new HashMap();
                                mpVar.q0 = new bp(mpVar, 5);
                                mpVar.t0 = false;
                                mpVar.Z = j10;
                                mpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                mpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        mpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        mpVar.X(false);
                                    }
                                }
                                yoVar14.presentFragment(mpVar);
                                break;
                            case 17:
                                yo yoVar15 = this.b;
                                long j11 = yoVar15.w0;
                                yp ypVar = new yp(null);
                                ypVar.v = new ArrayList();
                                boolean z162 = false;
                                ypVar.O = false;
                                ypVar.P = false;
                                ypVar.E = j11;
                                TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                ypVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                    z162 = true;
                                }
                                ypVar.s = z162;
                                ypVar.h = yoVar15.y0;
                                yoVar15.presentFragment(ypVar);
                                break;
                            case 18:
                                yo yoVar16 = this.b;
                                vw0 vw0Var = new vw0(yoVar16.w0);
                                vw0Var.v = new po(yoVar16, 4);
                                yoVar16.presentFragment(vw0Var);
                                break;
                            case 19:
                                yo.Z(this.b);
                                break;
                            case 20:
                                yo yoVar17 = this.b;
                                s60 s60Var = new s60(-yoVar17.x0.id);
                                s60Var.c = yoVar17.L0;
                                s60Var.l0 = yoVar17;
                                yoVar17.presentFragment(s60Var);
                                break;
                            case 21:
                                yo yoVar18 = this.b;
                                yoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", yoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                wr wrVar3 = new wr(bundle4);
                                wrVar3.x0(yoVar18.y0);
                                yoVar18.presentFragment(wrVar3);
                                break;
                            case 22:
                                yo yoVar19 = this.b;
                                zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                yoVar19.presentFragment(zh0Var);
                                break;
                            case 23:
                                yo yoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                    yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", yoVar20.w0);
                                    fq fqVar = new fq(bundle5);
                                    fqVar.d = new ArrayList();
                                    fqVar.r = new ArrayList();
                                    fqVar.v = -1;
                                    fqVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    fqVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                    fqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (fqVar.a == null) {
                                            fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        fqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            fqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            fqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            fqVar.w = 1;
                                        }
                                    }
                                    yoVar20.presentFragment(fqVar);
                                    break;
                                }
                            default:
                                yo yoVar21 = this.b;
                                yoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", yoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                yoVar21.presentFragment(new eo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) {
                org.telegram.ui.Cells.s8 s8Var10 = new org.telegram.ui.Cells.s8(context);
                this.K = s8Var10;
                s8Var10.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.K.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.a6.n(-1, -2));
                final int i23 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                    public final /* synthetic */ yo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                yo yoVar3 = this.b;
                                yoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", yoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wr wrVar = new wr(bundle);
                                wrVar.x0(yoVar3.y0);
                                yoVar3.presentFragment(wrVar);
                                break;
                            case 1:
                                yo yoVar4 = this.b;
                                uo uoVar = yoVar4.Q0;
                                long j32 = yoVar4.C0;
                                if (!yoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                yo yoVar5 = this.b;
                                yoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", yoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wr wrVar2 = new wr(bundle2);
                                wrVar2.x0(yoVar5.y0);
                                yoVar5.presentFragment(wrVar2);
                                break;
                            case 3:
                                yo yoVar6 = this.b;
                                yoVar6.presentFragment(new ai0(yoVar6.w0));
                                break;
                            case 4:
                                yo yoVar7 = this.b;
                                yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                break;
                            case 5:
                                yo yoVar8 = this.b;
                                yoVar8.getClass();
                                yoVar8.presentFragment(new wb(yoVar8.x0));
                                break;
                            case 6:
                                yo yoVar9 = this.b;
                                yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                break;
                            case 7:
                                yo yoVar10 = this.b;
                                yoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", yoVar10.C0);
                                yoVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                yo yoVar11 = this.b;
                                yoVar11.presentFragment(new di.m(yoVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                yo.Y(this.b);
                                break;
                            case 14:
                                yo yoVar12 = this.b;
                                org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                break;
                            case 15:
                                yo yoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -yoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new po(yoVar13, 6);
                                    yoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                yo yoVar14 = this.b;
                                long j10 = yoVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                mp mpVar = new mp(null);
                                mpVar.M = new ArrayList();
                                mpVar.N = new ArrayList();
                                mpVar.P = new ArrayList();
                                mpVar.c0 = true;
                                mpVar.f0 = new ArrayList();
                                mpVar.o0 = new HashMap();
                                mpVar.q0 = new bp(mpVar, 5);
                                mpVar.t0 = false;
                                mpVar.Z = j10;
                                mpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                mpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        mpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        mpVar.X(false);
                                    }
                                }
                                yoVar14.presentFragment(mpVar);
                                break;
                            case 17:
                                yo yoVar15 = this.b;
                                long j11 = yoVar15.w0;
                                yp ypVar = new yp(null);
                                ypVar.v = new ArrayList();
                                boolean z162 = false;
                                ypVar.O = false;
                                ypVar.P = false;
                                ypVar.E = j11;
                                TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                ypVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                    z162 = true;
                                }
                                ypVar.s = z162;
                                ypVar.h = yoVar15.y0;
                                yoVar15.presentFragment(ypVar);
                                break;
                            case 18:
                                yo yoVar16 = this.b;
                                vw0 vw0Var = new vw0(yoVar16.w0);
                                vw0Var.v = new po(yoVar16, 4);
                                yoVar16.presentFragment(vw0Var);
                                break;
                            case 19:
                                yo.Z(this.b);
                                break;
                            case 20:
                                yo yoVar17 = this.b;
                                s60 s60Var = new s60(-yoVar17.x0.id);
                                s60Var.c = yoVar17.L0;
                                s60Var.l0 = yoVar17;
                                yoVar17.presentFragment(s60Var);
                                break;
                            case 21:
                                yo yoVar18 = this.b;
                                yoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", yoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                wr wrVar3 = new wr(bundle4);
                                wrVar3.x0(yoVar18.y0);
                                yoVar18.presentFragment(wrVar3);
                                break;
                            case 22:
                                yo yoVar19 = this.b;
                                zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                yoVar19.presentFragment(zh0Var);
                                break;
                            case 23:
                                yo yoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                    yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", yoVar20.w0);
                                    fq fqVar = new fq(bundle5);
                                    fqVar.d = new ArrayList();
                                    fqVar.r = new ArrayList();
                                    fqVar.v = -1;
                                    fqVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    fqVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                    fqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (fqVar.a == null) {
                                            fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        fqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            fqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            fqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            fqVar.w = 1;
                                        }
                                    }
                                    yoVar20.presentFragment(fqVar);
                                    break;
                                }
                            default:
                                yo yoVar21 = this.b;
                                yoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", yoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                yoVar21.presentFragment(new eo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && ChatObject.canChangeChatInfo(this.x0)) {
                zdVar = zdVar4;
                charSequence = "";
                i11 = 2;
                fp0 fp0Var = new fp0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.L = fp0Var;
                fp0Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.L, w7.a6.n(-1, -2));
                final int i24 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.io
                    public final /* synthetic */ yo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                yo yoVar3 = this.b;
                                yoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", yoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wr wrVar = new wr(bundle);
                                wrVar.x0(yoVar3.y0);
                                yoVar3.presentFragment(wrVar);
                                break;
                            case 1:
                                yo yoVar4 = this.b;
                                uo uoVar = yoVar4.Q0;
                                long j32 = yoVar4.C0;
                                if (!yoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                yo yoVar5 = this.b;
                                yoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", yoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wr wrVar2 = new wr(bundle2);
                                wrVar2.x0(yoVar5.y0);
                                yoVar5.presentFragment(wrVar2);
                                break;
                            case 3:
                                yo yoVar6 = this.b;
                                yoVar6.presentFragment(new ai0(yoVar6.w0));
                                break;
                            case 4:
                                yo yoVar7 = this.b;
                                yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                break;
                            case 5:
                                yo yoVar8 = this.b;
                                yoVar8.getClass();
                                yoVar8.presentFragment(new wb(yoVar8.x0));
                                break;
                            case 6:
                                yo yoVar9 = this.b;
                                yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                break;
                            case 7:
                                yo yoVar10 = this.b;
                                yoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", yoVar10.C0);
                                yoVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                yo yoVar11 = this.b;
                                yoVar11.presentFragment(new di.m(yoVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                yo.Y(this.b);
                                break;
                            case 14:
                                yo yoVar12 = this.b;
                                org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                break;
                            case 15:
                                yo yoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -yoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new po(yoVar13, 6);
                                    yoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                yo yoVar14 = this.b;
                                long j10 = yoVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                mp mpVar = new mp(null);
                                mpVar.M = new ArrayList();
                                mpVar.N = new ArrayList();
                                mpVar.P = new ArrayList();
                                mpVar.c0 = true;
                                mpVar.f0 = new ArrayList();
                                mpVar.o0 = new HashMap();
                                mpVar.q0 = new bp(mpVar, 5);
                                mpVar.t0 = false;
                                mpVar.Z = j10;
                                mpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                mpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        mpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        mpVar.X(false);
                                    }
                                }
                                yoVar14.presentFragment(mpVar);
                                break;
                            case 17:
                                yo yoVar15 = this.b;
                                long j11 = yoVar15.w0;
                                yp ypVar = new yp(null);
                                ypVar.v = new ArrayList();
                                boolean z162 = false;
                                ypVar.O = false;
                                ypVar.P = false;
                                ypVar.E = j11;
                                TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                ypVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                    z162 = true;
                                }
                                ypVar.s = z162;
                                ypVar.h = yoVar15.y0;
                                yoVar15.presentFragment(ypVar);
                                break;
                            case 18:
                                yo yoVar16 = this.b;
                                vw0 vw0Var = new vw0(yoVar16.w0);
                                vw0Var.v = new po(yoVar16, 4);
                                yoVar16.presentFragment(vw0Var);
                                break;
                            case 19:
                                yo.Z(this.b);
                                break;
                            case 20:
                                yo yoVar17 = this.b;
                                s60 s60Var = new s60(-yoVar17.x0.id);
                                s60Var.c = yoVar17.L0;
                                s60Var.l0 = yoVar17;
                                yoVar17.presentFragment(s60Var);
                                break;
                            case 21:
                                yo yoVar18 = this.b;
                                yoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", yoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                wr wrVar3 = new wr(bundle4);
                                wrVar3.x0(yoVar18.y0);
                                yoVar18.presentFragment(wrVar3);
                                break;
                            case 22:
                                yo yoVar19 = this.b;
                                zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                yoVar19.presentFragment(zh0Var);
                                break;
                            case 23:
                                yo yoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                    yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", yoVar20.w0);
                                    fq fqVar = new fq(bundle5);
                                    fqVar.d = new ArrayList();
                                    fqVar.r = new ArrayList();
                                    fqVar.v = -1;
                                    fqVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    fqVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                    fqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (fqVar.a == null) {
                                            fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        fqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            fqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            fqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            fqVar.w = 1;
                                        }
                                    }
                                    yoVar20.presentFragment(fqVar);
                                    break;
                                }
                            default:
                                yo yoVar21 = this.b;
                                yoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", yoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                yoVar21.presentFragment(new eo(bundle6));
                                break;
                        }
                    }
                });
            } else {
                charSequence = "";
                zdVar = zdVar4;
                i11 = 2;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.x0) || ChatObject.isCommunity(this.x0)) {
                context3 = context;
                frameLayout = frameLayout2;
                num = 1;
                yoVar = this;
            } else {
                long j10 = -this.x0.id;
                num = 1;
                org.telegram.ui.Cells.s8 s8Var11 = new org.telegram.ui.Cells.s8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.M = s8Var11;
                s8Var11.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.M.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.x0.autotranslation);
                final int i25 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j10, new e2.h(this) { // from class: org.telegram.ui.no
                    public final /* synthetic */ yo b;

                    {
                        this.b = this;
                    }

                    @Override // e2.h
                    public final void accept(Object obj) {
                        switch (i25) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                yo yoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    yoVar3.getClass();
                                    break;
                                } else {
                                    yoVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < yoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, w7.a6.n(-1, -2));
                frameLayout = frameLayout2;
                yoVar = this;
                this.M.setOnClickListener(new jo(this, new boolean[]{false}, j10, 0));
            }
            if (!yoVar.I0 && ChatObject.canBlockUsers(yoVar.x0) && (ChatObject.isChannel(yoVar.x0) || yoVar.x0.creator)) {
                org.telegram.ui.Cells.s8 s8Var12 = new org.telegram.ui.Cells.s8(context3);
                yoVar.N = s8Var12;
                s8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                yoVar.F.addView(yoVar.N, w7.a6.n(-1, -2));
                yoVar.N.setOnClickListener(new sh(i11, yoVar, context3));
            }
            if (ChatObject.isMegagroup(yoVar.x0) && ChatObject.hasAdminRights(yoVar.x0) && !ChatObject.isCommunity(yoVar.x0)) {
                final int i26 = 1;
                MessagesController.getInstance(yoVar.currentAccount).getBoostsController().getBoostsStats(-yoVar.x0.id, new e2.h(yoVar) { // from class: org.telegram.ui.no
                    public final /* synthetic */ yo b;

                    {
                        this.b = yoVar;
                    }

                    @Override // e2.h
                    public final void accept(Object obj) {
                        switch (i26) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                yo yoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    yoVar3.getClass();
                                    break;
                                } else {
                                    yoVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < yoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                fp0 fp0Var2 = new fp0(yoVar.currentAccount, -yoVar.x0.id, context3, yoVar.getResourceProvider());
                yoVar.L = fp0Var2;
                fp0Var2.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                yoVar.F.addView(yoVar.L, w7.a6.n(-1, -2));
                final int i27 = 20;
                yoVar.L.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                    public final /* synthetic */ yo b;

                    {
                        this.b = yoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                yo yoVar3 = this.b;
                                yoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", yoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                wr wrVar = new wr(bundle);
                                wrVar.x0(yoVar3.y0);
                                yoVar3.presentFragment(wrVar);
                                break;
                            case 1:
                                yo yoVar4 = this.b;
                                uo uoVar = yoVar4.Q0;
                                long j32 = yoVar4.C0;
                                if (!yoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, yoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                yo yoVar5 = this.b;
                                yoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", yoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                wr wrVar2 = new wr(bundle2);
                                wrVar2.x0(yoVar5.y0);
                                yoVar5.presentFragment(wrVar2);
                                break;
                            case 3:
                                yo yoVar6 = this.b;
                                yoVar6.presentFragment(new ai0(yoVar6.w0));
                                break;
                            case 4:
                                yo yoVar7 = this.b;
                                yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                break;
                            case 5:
                                yo yoVar8 = this.b;
                                yoVar8.getClass();
                                yoVar8.presentFragment(new wb(yoVar8.x0));
                                break;
                            case 6:
                                yo yoVar9 = this.b;
                                yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                break;
                            case 7:
                                yo yoVar10 = this.b;
                                yoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", yoVar10.C0);
                                yoVar10.presentFragment(new ra(bundle3));
                                break;
                            case 8:
                                yo yoVar11 = this.b;
                                yoVar11.presentFragment(new di.m(yoVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                yo.Y(this.b);
                                break;
                            case 14:
                                yo yoVar12 = this.b;
                                org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                break;
                            case 15:
                                yo yoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -yoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new po(yoVar13, 6);
                                    yoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                yo yoVar14 = this.b;
                                long j102 = yoVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                mp mpVar = new mp(null);
                                mpVar.M = new ArrayList();
                                mpVar.N = new ArrayList();
                                mpVar.P = new ArrayList();
                                mpVar.c0 = true;
                                mpVar.f0 = new ArrayList();
                                mpVar.o0 = new HashMap();
                                mpVar.q0 = new bp(mpVar, 5);
                                mpVar.t0 = false;
                                mpVar.Z = j102;
                                mpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                mpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        mpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        mpVar.X(false);
                                    }
                                }
                                yoVar14.presentFragment(mpVar);
                                break;
                            case 17:
                                yo yoVar15 = this.b;
                                long j11 = yoVar15.w0;
                                yp ypVar = new yp(null);
                                ypVar.v = new ArrayList();
                                boolean z162 = false;
                                ypVar.O = false;
                                ypVar.P = false;
                                ypVar.E = j11;
                                TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                ypVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                    z162 = true;
                                }
                                ypVar.s = z162;
                                ypVar.h = yoVar15.y0;
                                yoVar15.presentFragment(ypVar);
                                break;
                            case 18:
                                yo yoVar16 = this.b;
                                vw0 vw0Var = new vw0(yoVar16.w0);
                                vw0Var.v = new po(yoVar16, 4);
                                yoVar16.presentFragment(vw0Var);
                                break;
                            case 19:
                                yo.Z(this.b);
                                break;
                            case 20:
                                yo yoVar17 = this.b;
                                s60 s60Var = new s60(-yoVar17.x0.id);
                                s60Var.c = yoVar17.L0;
                                s60Var.l0 = yoVar17;
                                yoVar17.presentFragment(s60Var);
                                break;
                            case 21:
                                yo yoVar18 = this.b;
                                yoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", yoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                wr wrVar3 = new wr(bundle4);
                                wrVar3.x0(yoVar18.y0);
                                yoVar18.presentFragment(wrVar3);
                                break;
                            case 22:
                                yo yoVar19 = this.b;
                                zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                yoVar19.presentFragment(zh0Var);
                                break;
                            case 23:
                                yo yoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                    yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", yoVar20.w0);
                                    fq fqVar = new fq(bundle5);
                                    fqVar.d = new ArrayList();
                                    fqVar.r = new ArrayList();
                                    fqVar.v = -1;
                                    fqVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    fqVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                    fqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (fqVar.a == null) {
                                            fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        fqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            fqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            fqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            fqVar.w = 1;
                                        }
                                    }
                                    yoVar20.presentFragment(fqVar);
                                    break;
                                }
                            default:
                                yo yoVar21 = this.b;
                                yoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", yoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                yoVar21.presentFragment(new eo(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!yoVar.I0 && yoVar.x0.creator) {
                org.telegram.ui.Cells.s8 s8Var13 = new org.telegram.ui.Cells.s8(23, context, null, false, true);
                context2 = context;
                yoVar.Q = s8Var13;
                s8Var13.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                yoVar.Q.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), yoVar.F0);
                yoVar.Q.getCheckBox().setIcon(yoVar.G0 ? 0 : R.drawable.permission_locked);
                yoVar.F.addView(yoVar.Q, w7.a6.c(-2.0f, -1));
                i10 = 3;
                yoVar.Q.setOnClickListener(new sh(i10, yoVar, frameLayout));
            } else {
                context2 = context;
                i10 = 3;
            }
            yoVar.o0();
        } else {
            context2 = context;
            charSequence = "";
            num = 1;
            zdVar = zdVar4;
            i10 = 3;
            i11 = 2;
            yoVar = this;
        }
        org.telegram.ui.ActionBar.z n10 = yoVar.actionBar.n();
        if (yoVar.D0 != null || ChatObject.canChangeChatInfo(yoVar.x0) || yoVar.N != null) {
            org.telegram.ui.ActionBar.w0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            yoVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (yoVar.H == null && yoVar.N == null && yoVar.I == null && yoVar.J == null && yoVar.Q == null) {
            zdVar2 = zdVar;
            i12 = 12;
        } else {
            i12 = 12;
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context2, 12, yoVar.resourceProvider);
            yoVar.P = f9Var;
            if (yoVar.Q != null) {
                f9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                f9Var.setFixedSize(12);
            }
            zdVar2 = zdVar;
            zdVar2.addView(yoVar.P, w7.a6.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        yoVar.R = linearLayout4;
        linearLayout4.setOrientation(1);
        zdVar2.addView(yoVar.R, w7.a6.n(-1, -2));
        final int i28 = 8;
        if (yoVar.x0 != null) {
            org.telegram.ui.Cells.s8 s8Var14 = new org.telegram.ui.Cells.s8(context2);
            yoVar.X = s8Var14;
            s8Var14.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            org.telegram.ui.Cells.s8 s8Var15 = yoVar.X;
            if (!ChatObject.isChannel(yoVar.x0)) {
                TLRPC.Chat chat5 = yoVar.x0;
                if (!chat5.creator && (!ChatObject.hasAdminRights(chat5) || !ChatObject.canChangeChatInfo(yoVar.x0))) {
                    i14 = 8;
                    s8Var15.setVisibility(i14);
                    final int i29 = 21;
                    yoVar.X.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    yo yoVar3 = this.b;
                                    yoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar3.y0);
                                    yoVar3.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar4 = this.b;
                                    uo uoVar = yoVar4.Q0;
                                    long j32 = yoVar4.C0;
                                    if (!yoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j11 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j11;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.s8 s8Var16 = new org.telegram.ui.Cells.s8(context2);
                    yoVar.V = s8Var16;
                    s8Var16.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i30 = 22;
                    yoVar.V.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    yo yoVar3 = this.b;
                                    yoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar3.y0);
                                    yoVar3.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar4 = this.b;
                                    uo uoVar = yoVar4.Q0;
                                    long j32 = yoVar4.C0;
                                    if (!yoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j11 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j11;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.s8 s8Var17 = new org.telegram.ui.Cells.s8(context2);
                    yoVar.O = s8Var17;
                    s8Var17.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i31 = 23;
                    yoVar.O.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    yo yoVar3 = this.b;
                                    yoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar3.y0);
                                    yoVar3.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar4 = this.b;
                                    uo uoVar = yoVar4.Q0;
                                    long j32 = yoVar4.C0;
                                    if (!yoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j11 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j11;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(yoVar.x0, 28)) {
                        org.telegram.ui.Cells.s8 s8Var18 = new org.telegram.ui.Cells.s8(context2);
                        yoVar.f0 = s8Var18;
                        s8Var18.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i32 = 24;
                        yoVar.f0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                            public final /* synthetic */ yo b;

                            {
                                this.b = yoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i32) {
                                    case 0:
                                        yo yoVar3 = this.b;
                                        yoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", yoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wr wrVar = new wr(bundle);
                                        wrVar.x0(yoVar3.y0);
                                        yoVar3.presentFragment(wrVar);
                                        break;
                                    case 1:
                                        yo yoVar4 = this.b;
                                        uo uoVar = yoVar4.Q0;
                                        long j32 = yoVar4.C0;
                                        if (!yoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        yo yoVar5 = this.b;
                                        yoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", yoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wr wrVar2 = new wr(bundle2);
                                        wrVar2.x0(yoVar5.y0);
                                        yoVar5.presentFragment(wrVar2);
                                        break;
                                    case 3:
                                        yo yoVar6 = this.b;
                                        yoVar6.presentFragment(new ai0(yoVar6.w0));
                                        break;
                                    case 4:
                                        yo yoVar7 = this.b;
                                        yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                        break;
                                    case 5:
                                        yo yoVar8 = this.b;
                                        yoVar8.getClass();
                                        yoVar8.presentFragment(new wb(yoVar8.x0));
                                        break;
                                    case 6:
                                        yo yoVar9 = this.b;
                                        yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                        break;
                                    case 7:
                                        yo yoVar10 = this.b;
                                        yoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", yoVar10.C0);
                                        yoVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        yo yoVar11 = this.b;
                                        yoVar11.presentFragment(new di.m(yoVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        yo.Y(this.b);
                                        break;
                                    case 14:
                                        yo yoVar12 = this.b;
                                        org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                        break;
                                    case 15:
                                        yo yoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -yoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new po(yoVar13, 6);
                                            yoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        yo yoVar14 = this.b;
                                        long j102 = yoVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        mp mpVar = new mp(null);
                                        mpVar.M = new ArrayList();
                                        mpVar.N = new ArrayList();
                                        mpVar.P = new ArrayList();
                                        mpVar.c0 = true;
                                        mpVar.f0 = new ArrayList();
                                        mpVar.o0 = new HashMap();
                                        mpVar.q0 = new bp(mpVar, 5);
                                        mpVar.t0 = false;
                                        mpVar.Z = j102;
                                        mpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                        mpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                mpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                mpVar.X(false);
                                            }
                                        }
                                        yoVar14.presentFragment(mpVar);
                                        break;
                                    case 17:
                                        yo yoVar15 = this.b;
                                        long j11 = yoVar15.w0;
                                        yp ypVar = new yp(null);
                                        ypVar.v = new ArrayList();
                                        boolean z162 = false;
                                        ypVar.O = false;
                                        ypVar.P = false;
                                        ypVar.E = j11;
                                        TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                        ypVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        ypVar.s = z162;
                                        ypVar.h = yoVar15.y0;
                                        yoVar15.presentFragment(ypVar);
                                        break;
                                    case 18:
                                        yo yoVar16 = this.b;
                                        vw0 vw0Var = new vw0(yoVar16.w0);
                                        vw0Var.v = new po(yoVar16, 4);
                                        yoVar16.presentFragment(vw0Var);
                                        break;
                                    case 19:
                                        yo.Z(this.b);
                                        break;
                                    case 20:
                                        yo yoVar17 = this.b;
                                        s60 s60Var = new s60(-yoVar17.x0.id);
                                        s60Var.c = yoVar17.L0;
                                        s60Var.l0 = yoVar17;
                                        yoVar17.presentFragment(s60Var);
                                        break;
                                    case 21:
                                        yo yoVar18 = this.b;
                                        yoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", yoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                        wr wrVar3 = new wr(bundle4);
                                        wrVar3.x0(yoVar18.y0);
                                        yoVar18.presentFragment(wrVar3);
                                        break;
                                    case 22:
                                        yo yoVar19 = this.b;
                                        zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                        zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        yoVar19.presentFragment(zh0Var);
                                        break;
                                    case 23:
                                        yo yoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                            yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", yoVar20.w0);
                                            fq fqVar = new fq(bundle5);
                                            fqVar.d = new ArrayList();
                                            fqVar.r = new ArrayList();
                                            fqVar.v = -1;
                                            fqVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            fqVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                            fqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (fqVar.a == null) {
                                                    fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                fqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    fqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    fqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    fqVar.w = 1;
                                                }
                                            }
                                            yoVar20.presentFragment(fqVar);
                                            break;
                                        }
                                    default:
                                        yo yoVar21 = this.b;
                                        yoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", yoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                        yoVar21.presentFragment(new eo(bundle6));
                                        break;
                                }
                            }
                        });
                        yoVar.f0();
                    }
                    org.telegram.ui.Cells.s8 s8Var19 = new org.telegram.ui.Cells.s8(context2);
                    yoVar.W = s8Var19;
                    final int i33 = 0;
                    s8Var19.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    yoVar.W.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    yo yoVar3 = this.b;
                                    yoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar3.y0);
                                    yoVar3.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar4 = this.b;
                                    uo uoVar = yoVar4.Q0;
                                    long j32 = yoVar4.C0;
                                    if (!yoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j11 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j11;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.s8 s8Var20 = new org.telegram.ui.Cells.s8(context2);
                    yoVar.T = s8Var20;
                    s8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    yoVar.T.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    yo yoVar3 = this.b;
                                    yoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar3.y0);
                                    yoVar3.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar4 = this.b;
                                    uo uoVar = yoVar4.Q0;
                                    long j32 = yoVar4.C0;
                                    if (!yoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j11 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j11;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(yoVar.x0)) {
                        org.telegram.ui.Cells.s8 s8Var21 = new org.telegram.ui.Cells.s8(context2);
                        yoVar.U = s8Var21;
                        s8Var21.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        yoVar.U.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                            public final /* synthetic */ yo b;

                            {
                                this.b = yoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        yo yoVar3 = this.b;
                                        yoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", yoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wr wrVar = new wr(bundle);
                                        wrVar.x0(yoVar3.y0);
                                        yoVar3.presentFragment(wrVar);
                                        break;
                                    case 1:
                                        yo yoVar4 = this.b;
                                        uo uoVar = yoVar4.Q0;
                                        long j32 = yoVar4.C0;
                                        if (!yoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        yo yoVar5 = this.b;
                                        yoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", yoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wr wrVar2 = new wr(bundle2);
                                        wrVar2.x0(yoVar5.y0);
                                        yoVar5.presentFragment(wrVar2);
                                        break;
                                    case 3:
                                        yo yoVar6 = this.b;
                                        yoVar6.presentFragment(new ai0(yoVar6.w0));
                                        break;
                                    case 4:
                                        yo yoVar7 = this.b;
                                        yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                        break;
                                    case 5:
                                        yo yoVar8 = this.b;
                                        yoVar8.getClass();
                                        yoVar8.presentFragment(new wb(yoVar8.x0));
                                        break;
                                    case 6:
                                        yo yoVar9 = this.b;
                                        yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                        break;
                                    case 7:
                                        yo yoVar10 = this.b;
                                        yoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", yoVar10.C0);
                                        yoVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        yo yoVar11 = this.b;
                                        yoVar11.presentFragment(new di.m(yoVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        yo.Y(this.b);
                                        break;
                                    case 14:
                                        yo yoVar12 = this.b;
                                        org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                        break;
                                    case 15:
                                        yo yoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -yoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new po(yoVar13, 6);
                                            yoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        yo yoVar14 = this.b;
                                        long j102 = yoVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        mp mpVar = new mp(null);
                                        mpVar.M = new ArrayList();
                                        mpVar.N = new ArrayList();
                                        mpVar.P = new ArrayList();
                                        mpVar.c0 = true;
                                        mpVar.f0 = new ArrayList();
                                        mpVar.o0 = new HashMap();
                                        mpVar.q0 = new bp(mpVar, 5);
                                        mpVar.t0 = false;
                                        mpVar.Z = j102;
                                        mpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                        mpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                mpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                mpVar.X(false);
                                            }
                                        }
                                        yoVar14.presentFragment(mpVar);
                                        break;
                                    case 17:
                                        yo yoVar15 = this.b;
                                        long j11 = yoVar15.w0;
                                        yp ypVar = new yp(null);
                                        ypVar.v = new ArrayList();
                                        boolean z162 = false;
                                        ypVar.O = false;
                                        ypVar.P = false;
                                        ypVar.E = j11;
                                        TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                        ypVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        ypVar.s = z162;
                                        ypVar.h = yoVar15.y0;
                                        yoVar15.presentFragment(ypVar);
                                        break;
                                    case 18:
                                        yo yoVar16 = this.b;
                                        vw0 vw0Var = new vw0(yoVar16.w0);
                                        vw0Var.v = new po(yoVar16, 4);
                                        yoVar16.presentFragment(vw0Var);
                                        break;
                                    case 19:
                                        yo.Z(this.b);
                                        break;
                                    case 20:
                                        yo yoVar17 = this.b;
                                        s60 s60Var = new s60(-yoVar17.x0.id);
                                        s60Var.c = yoVar17.L0;
                                        s60Var.l0 = yoVar17;
                                        yoVar17.presentFragment(s60Var);
                                        break;
                                    case 21:
                                        yo yoVar18 = this.b;
                                        yoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", yoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                        wr wrVar3 = new wr(bundle4);
                                        wrVar3.x0(yoVar18.y0);
                                        yoVar18.presentFragment(wrVar3);
                                        break;
                                    case 22:
                                        yo yoVar19 = this.b;
                                        zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                        zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        yoVar19.presentFragment(zh0Var);
                                        break;
                                    case 23:
                                        yo yoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                            yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", yoVar20.w0);
                                            fq fqVar = new fq(bundle5);
                                            fqVar.d = new ArrayList();
                                            fqVar.r = new ArrayList();
                                            fqVar.v = -1;
                                            fqVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            fqVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                            fqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (fqVar.a == null) {
                                                    fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                fqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    fqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    fqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    fqVar.w = 1;
                                                }
                                            }
                                            yoVar20.presentFragment(fqVar);
                                            break;
                                        }
                                    default:
                                        yo yoVar21 = this.b;
                                        yoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", yoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                        yoVar21.presentFragment(new eo(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.s8 s8Var22 = new org.telegram.ui.Cells.s8(context2);
                    yoVar.Z = s8Var22;
                    s8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    yoVar.Z.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i34 = 4;
                    yoVar.Z.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    yo yoVar3 = this.b;
                                    yoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar3.y0);
                                    yoVar3.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar4 = this.b;
                                    uo uoVar = yoVar4.Q0;
                                    long j32 = yoVar4.C0;
                                    if (!yoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j11 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j11;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    yoVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(yoVar.x0) || yoVar.x0.gigagroup) {
                        org.telegram.ui.Cells.s8 s8Var23 = new org.telegram.ui.Cells.s8(context2);
                        yoVar.Y = s8Var23;
                        s8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        yoVar.Y.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i35 = 5;
                        yoVar.Y.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                            public final /* synthetic */ yo b;

                            {
                                this.b = yoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i35) {
                                    case 0:
                                        yo yoVar3 = this.b;
                                        yoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", yoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wr wrVar = new wr(bundle);
                                        wrVar.x0(yoVar3.y0);
                                        yoVar3.presentFragment(wrVar);
                                        break;
                                    case 1:
                                        yo yoVar4 = this.b;
                                        uo uoVar = yoVar4.Q0;
                                        long j32 = yoVar4.C0;
                                        if (!yoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        yo yoVar5 = this.b;
                                        yoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", yoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wr wrVar2 = new wr(bundle2);
                                        wrVar2.x0(yoVar5.y0);
                                        yoVar5.presentFragment(wrVar2);
                                        break;
                                    case 3:
                                        yo yoVar6 = this.b;
                                        yoVar6.presentFragment(new ai0(yoVar6.w0));
                                        break;
                                    case 4:
                                        yo yoVar7 = this.b;
                                        yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                        break;
                                    case 5:
                                        yo yoVar8 = this.b;
                                        yoVar8.getClass();
                                        yoVar8.presentFragment(new wb(yoVar8.x0));
                                        break;
                                    case 6:
                                        yo yoVar9 = this.b;
                                        yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                        break;
                                    case 7:
                                        yo yoVar10 = this.b;
                                        yoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", yoVar10.C0);
                                        yoVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        yo yoVar11 = this.b;
                                        yoVar11.presentFragment(new di.m(yoVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        yo.Y(this.b);
                                        break;
                                    case 14:
                                        yo yoVar12 = this.b;
                                        org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                        break;
                                    case 15:
                                        yo yoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -yoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new po(yoVar13, 6);
                                            yoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        yo yoVar14 = this.b;
                                        long j102 = yoVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        mp mpVar = new mp(null);
                                        mpVar.M = new ArrayList();
                                        mpVar.N = new ArrayList();
                                        mpVar.P = new ArrayList();
                                        mpVar.c0 = true;
                                        mpVar.f0 = new ArrayList();
                                        mpVar.o0 = new HashMap();
                                        mpVar.q0 = new bp(mpVar, 5);
                                        mpVar.t0 = false;
                                        mpVar.Z = j102;
                                        mpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                        mpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                mpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                mpVar.X(false);
                                            }
                                        }
                                        yoVar14.presentFragment(mpVar);
                                        break;
                                    case 17:
                                        yo yoVar15 = this.b;
                                        long j11 = yoVar15.w0;
                                        yp ypVar = new yp(null);
                                        ypVar.v = new ArrayList();
                                        boolean z162 = false;
                                        ypVar.O = false;
                                        ypVar.P = false;
                                        ypVar.E = j11;
                                        TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                        ypVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        ypVar.s = z162;
                                        ypVar.h = yoVar15.y0;
                                        yoVar15.presentFragment(ypVar);
                                        break;
                                    case 18:
                                        yo yoVar16 = this.b;
                                        vw0 vw0Var = new vw0(yoVar16.w0);
                                        vw0Var.v = new po(yoVar16, 4);
                                        yoVar16.presentFragment(vw0Var);
                                        break;
                                    case 19:
                                        yo.Z(this.b);
                                        break;
                                    case 20:
                                        yo yoVar17 = this.b;
                                        s60 s60Var = new s60(-yoVar17.x0.id);
                                        s60Var.c = yoVar17.L0;
                                        s60Var.l0 = yoVar17;
                                        yoVar17.presentFragment(s60Var);
                                        break;
                                    case 21:
                                        yo yoVar18 = this.b;
                                        yoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", yoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                        wr wrVar3 = new wr(bundle4);
                                        wrVar3.x0(yoVar18.y0);
                                        yoVar18.presentFragment(wrVar3);
                                        break;
                                    case 22:
                                        yo yoVar19 = this.b;
                                        zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                        zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        yoVar19.presentFragment(zh0Var);
                                        break;
                                    case 23:
                                        yo yoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                            yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", yoVar20.w0);
                                            fq fqVar = new fq(bundle5);
                                            fqVar.d = new ArrayList();
                                            fqVar.r = new ArrayList();
                                            fqVar.v = -1;
                                            fqVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            fqVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                            fqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (fqVar.a == null) {
                                                    fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                fqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    fqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    fqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    fqVar.w = 1;
                                                }
                                            }
                                            yoVar20.presentFragment(fqVar);
                                            break;
                                        }
                                    default:
                                        yo yoVar21 = this.b;
                                        yoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", yoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                        yoVar21.presentFragment(new eo(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(yoVar.x0)) {
                        org.telegram.ui.Cells.s8 s8Var24 = new org.telegram.ui.Cells.s8(context2);
                        yoVar.a0 = s8Var24;
                        s8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        yoVar.a0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i36 = 6;
                        yoVar.a0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                            public final /* synthetic */ yo b;

                            {
                                this.b = yoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i36) {
                                    case 0:
                                        yo yoVar3 = this.b;
                                        yoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", yoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        wr wrVar = new wr(bundle);
                                        wrVar.x0(yoVar3.y0);
                                        yoVar3.presentFragment(wrVar);
                                        break;
                                    case 1:
                                        yo yoVar4 = this.b;
                                        uo uoVar = yoVar4.Q0;
                                        long j32 = yoVar4.C0;
                                        if (!yoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, yoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        yo yoVar5 = this.b;
                                        yoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", yoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        wr wrVar2 = new wr(bundle2);
                                        wrVar2.x0(yoVar5.y0);
                                        yoVar5.presentFragment(wrVar2);
                                        break;
                                    case 3:
                                        yo yoVar6 = this.b;
                                        yoVar6.presentFragment(new ai0(yoVar6.w0));
                                        break;
                                    case 4:
                                        yo yoVar7 = this.b;
                                        yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                        break;
                                    case 5:
                                        yo yoVar8 = this.b;
                                        yoVar8.getClass();
                                        yoVar8.presentFragment(new wb(yoVar8.x0));
                                        break;
                                    case 6:
                                        yo yoVar9 = this.b;
                                        yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                        break;
                                    case 7:
                                        yo yoVar10 = this.b;
                                        yoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", yoVar10.C0);
                                        yoVar10.presentFragment(new ra(bundle3));
                                        break;
                                    case 8:
                                        yo yoVar11 = this.b;
                                        yoVar11.presentFragment(new di.m(yoVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        yo.Y(this.b);
                                        break;
                                    case 14:
                                        yo yoVar12 = this.b;
                                        org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                        break;
                                    case 15:
                                        yo yoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -yoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new po(yoVar13, 6);
                                            yoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        yo yoVar14 = this.b;
                                        long j102 = yoVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        mp mpVar = new mp(null);
                                        mpVar.M = new ArrayList();
                                        mpVar.N = new ArrayList();
                                        mpVar.P = new ArrayList();
                                        mpVar.c0 = true;
                                        mpVar.f0 = new ArrayList();
                                        mpVar.o0 = new HashMap();
                                        mpVar.q0 = new bp(mpVar, 5);
                                        mpVar.t0 = false;
                                        mpVar.Z = j102;
                                        mpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                        mpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                mpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                mpVar.X(false);
                                            }
                                        }
                                        yoVar14.presentFragment(mpVar);
                                        break;
                                    case 17:
                                        yo yoVar15 = this.b;
                                        long j11 = yoVar15.w0;
                                        yp ypVar = new yp(null);
                                        ypVar.v = new ArrayList();
                                        boolean z162 = false;
                                        ypVar.O = false;
                                        ypVar.P = false;
                                        ypVar.E = j11;
                                        TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                                        ypVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        ypVar.s = z162;
                                        ypVar.h = yoVar15.y0;
                                        yoVar15.presentFragment(ypVar);
                                        break;
                                    case 18:
                                        yo yoVar16 = this.b;
                                        vw0 vw0Var = new vw0(yoVar16.w0);
                                        vw0Var.v = new po(yoVar16, 4);
                                        yoVar16.presentFragment(vw0Var);
                                        break;
                                    case 19:
                                        yo.Z(this.b);
                                        break;
                                    case 20:
                                        yo yoVar17 = this.b;
                                        s60 s60Var = new s60(-yoVar17.x0.id);
                                        s60Var.c = yoVar17.L0;
                                        s60Var.l0 = yoVar17;
                                        yoVar17.presentFragment(s60Var);
                                        break;
                                    case 21:
                                        yo yoVar18 = this.b;
                                        yoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", yoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                        wr wrVar3 = new wr(bundle4);
                                        wrVar3.x0(yoVar18.y0);
                                        yoVar18.presentFragment(wrVar3);
                                        break;
                                    case 22:
                                        yo yoVar19 = this.b;
                                        zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                        zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        yoVar19.presentFragment(zh0Var);
                                        break;
                                    case 23:
                                        yo yoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                            yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", yoVar20.w0);
                                            fq fqVar = new fq(bundle5);
                                            fqVar.d = new ArrayList();
                                            fqVar.r = new ArrayList();
                                            fqVar.v = -1;
                                            fqVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            fqVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                            fqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (fqVar.a == null) {
                                                    fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                fqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    fqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    fqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    fqVar.w = 1;
                                                }
                                            }
                                            yoVar20.presentFragment(fqVar);
                                            break;
                                        }
                                    default:
                                        yo yoVar21 = this.b;
                                        yoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", yoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                        yoVar21.presentFragment(new eo(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    yoVar.R.addView(yoVar.O, w7.a6.n(-1, -2));
                    s8Var = yoVar.f0;
                    if (s8Var != null) {
                        yoVar.R.addView(s8Var, w7.a6.n(-1, -2));
                    }
                    if (!yoVar.I0 && !yoVar.x0.gigagroup) {
                        yoVar.R.addView(yoVar.X, w7.a6.n(-1, -2));
                    }
                    if (!yoVar.I0) {
                        yoVar.R.addView(yoVar.V, w7.a6.n(-1, -2));
                    }
                    yoVar.R.addView(yoVar.W, w7.a6.n(-1, -2));
                    yoVar.R.addView(yoVar.T, w7.a6.n(-1, -2));
                    s8Var2 = yoVar.U;
                    if (s8Var2 != null && (chatFull2 = yoVar.y0) != null && chatFull2.requests_pending > 0) {
                        yoVar.R.addView(s8Var2, w7.a6.n(-1, -2));
                    }
                    if (yoVar.I0) {
                        yoVar.R.addView(yoVar.V, w7.a6.n(-1, -2));
                    }
                    if (!yoVar.I0 || yoVar.x0.gigagroup) {
                        yoVar.R.addView(yoVar.X, w7.a6.n(-1, -2));
                    }
                    s8Var3 = yoVar.a0;
                    if (s8Var3 != null) {
                        yoVar.R.addView(s8Var3, w7.a6.n(-1, -2));
                    }
                    s8Var4 = yoVar.Y;
                    if (s8Var4 != null) {
                        yoVar.R.addView(s8Var4, w7.a6.n(-1, -2));
                    }
                    s8Var5 = yoVar.Z;
                    if (s8Var5 != null) {
                        yoVar.R.addView(s8Var5, w7.a6.n(-1, -2));
                    }
                    if (yoVar.Z != null && yoVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(yoVar.x0)) {
                        yoVar.Z.setVisibility(0);
                    }
                    s8Var6 = yoVar.Y;
                    if (s8Var6 != null) {
                        org.telegram.ui.Cells.s8 s8Var25 = yoVar.Z;
                        s8Var6.setNeedDivider(s8Var25 != null && s8Var25.getVisibility() == 0);
                    }
                }
            }
            i14 = 0;
            s8Var15.setVisibility(i14);
            final int i292 = 21;
            yoVar.X.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var162 = new org.telegram.ui.Cells.s8(context2);
            yoVar.V = s8Var162;
            s8Var162.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i302 = 22;
            yoVar.V.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i302) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var172 = new org.telegram.ui.Cells.s8(context2);
            yoVar.O = s8Var172;
            s8Var172.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i312 = 23;
            yoVar.O.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i312) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(yoVar.x0, 28)) {
            }
            org.telegram.ui.Cells.s8 s8Var192 = new org.telegram.ui.Cells.s8(context2);
            yoVar.W = s8Var192;
            final int i332 = 0;
            s8Var192.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.W.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var202 = new org.telegram.ui.Cells.s8(context2);
            yoVar.T = s8Var202;
            s8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.T.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(yoVar.x0)) {
            }
            org.telegram.ui.Cells.s8 s8Var222 = new org.telegram.ui.Cells.s8(context2);
            yoVar.Z = s8Var222;
            s8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            yoVar.Z.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i342 = 4;
            yoVar.Z.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            yoVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(yoVar.x0)) {
            }
            org.telegram.ui.Cells.s8 s8Var232 = new org.telegram.ui.Cells.s8(context2);
            yoVar.Y = s8Var232;
            s8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            yoVar.Y.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i352 = 5;
            yoVar.Y.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(yoVar.x0)) {
            }
            yoVar.R.addView(yoVar.O, w7.a6.n(-1, -2));
            s8Var = yoVar.f0;
            if (s8Var != null) {
            }
            if (!yoVar.I0) {
                yoVar.R.addView(yoVar.X, w7.a6.n(-1, -2));
            }
            if (!yoVar.I0) {
            }
            yoVar.R.addView(yoVar.W, w7.a6.n(-1, -2));
            yoVar.R.addView(yoVar.T, w7.a6.n(-1, -2));
            s8Var2 = yoVar.U;
            if (s8Var2 != null) {
                yoVar.R.addView(s8Var2, w7.a6.n(-1, -2));
            }
            if (yoVar.I0) {
            }
            if (!yoVar.I0) {
            }
            yoVar.R.addView(yoVar.X, w7.a6.n(-1, -2));
            s8Var3 = yoVar.a0;
            if (s8Var3 != null) {
            }
            s8Var4 = yoVar.Y;
            if (s8Var4 != null) {
            }
            s8Var5 = yoVar.Z;
            if (s8Var5 != null) {
            }
            if (yoVar.Z != null) {
                yoVar.Z.setVisibility(0);
            }
            s8Var6 = yoVar.Y;
            if (s8Var6 != null) {
            }
        }
        if (yoVar.D0 != null) {
            org.telegram.ui.Cells.s8 s8Var26 = new org.telegram.ui.Cells.s8(context2);
            yoVar.l0 = s8Var26;
            s8Var26.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.l0.setPrioritizeTitleOverValue(true);
            yoVar.R.addView(yoVar.l0, w7.a6.n(-1, -2));
            final int i37 = 7;
            yoVar.l0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i37) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            yoVar.r0();
            org.telegram.ui.Cells.s8 s8Var27 = new org.telegram.ui.Cells.s8(context2);
            yoVar.o0 = s8Var27;
            s8Var27.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.o0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), charSequence, R.drawable.msg_shareout, true);
            yoVar.R.addView(yoVar.o0, w7.a6.n(-1, -2));
            yoVar.o0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i28) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            yoVar.o0.f(45, yoVar.E0 == null, false);
            TLRPC.UserFull userFull = yoVar.E0;
            if (userFull != null) {
                org.telegram.ui.Cells.s8 s8Var28 = yoVar.o0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                s8Var28.u(format, z11);
            }
            if (!yoVar.getMessagesController().starrefProgramAllowed) {
                yoVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.s8 s8Var29 = new org.telegram.ui.Cells.s8(context2);
            yoVar.p0 = s8Var29;
            s8Var29.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.p0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            yoVar.R.addView(yoVar.p0, w7.a6.n(-1, -2));
            final int i38 = 9;
            yoVar.p0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var30 = new org.telegram.ui.Cells.s8(context2);
            yoVar.q0 = s8Var30;
            s8Var30.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.q0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            yoVar.R.addView(yoVar.q0, w7.a6.n(-1, -2));
            final int i39 = 10;
            yoVar.q0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var31 = new org.telegram.ui.Cells.s8(context2);
            yoVar.r0 = s8Var31;
            s8Var31.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            yoVar.r0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            yoVar.R.addView(yoVar.r0, w7.a6.n(-1, -2));
            final int i40 = 11;
            yoVar.r0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i40) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = yoVar.x0;
        if (chat6 != null) {
            if (!ChatObject.hasAdminRights(chat6)) {
                yoVar.R.setVisibility(8);
                yoVar.G.setVisibility(8);
            }
            zdVar2.addView(new org.telegram.ui.Cells.c7(context2), w7.a6.n(-1, -2));
        } else if (yoVar.D0 != null) {
            yoVar.s0 = new org.telegram.ui.Cells.f9(context2, i12, yoVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new xo(0), indexOf, indexOf + 10, 33);
            }
            yoVar.s0.setText(valueOf);
            zdVar2.addView(yoVar.s0, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.s8 s8Var32 = new org.telegram.ui.Cells.s8(context2);
            yoVar.u0 = s8Var32;
            s8Var32.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            yoVar.u0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.s8 s8Var33 = yoVar.u0;
            int i41 = org.telegram.ui.ActionBar.j6.q6;
            s8Var33.e(i41, i41);
            zdVar2.addView(yoVar.u0, w7.a6.n(-1, -2));
            final int i42 = 13;
            yoVar.u0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i42) {
                        case 0:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar3.y0);
                            yoVar3.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar4 = this.b;
                            uo uoVar = yoVar4.Q0;
                            long j32 = yoVar4.C0;
                            if (!yoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : yoVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = yoVar4.getMessagesController().getChat(Long.valueOf(yoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar4.y0.chat_photo.video_sizes.get(0), yoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j11 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j11;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j11));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j12;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context2, i12, yoVar.resourceProvider);
            yoVar.t0 = f9Var2;
            f9Var2.setFixedSize(i12);
            zdVar2.addView(yoVar.t0, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.s8 s8Var34 = yoVar.u0;
            TLRPC.UserFull userFull2 = yoVar.E0;
            s8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.f9 f9Var3 = yoVar.t0;
            TLRPC.UserFull userFull3 = yoVar.E0;
            f9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = yoVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                yoVar.S = linearLayout5;
                linearLayout5.setOrientation(1);
                zdVar2.addView(yoVar.S, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
                m4Var.setText(LocaleController.getString(R.string.BotBalance));
                yoVar.S.addView(m4Var, w7.a6.n(-1, -2));
                org.telegram.ui.Cells.s8 s8Var35 = new org.telegram.ui.Cells.s8(context2);
                yoVar.m0 = s8Var35;
                s8Var35.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                yoVar.m0.setPrioritizeTitleOverValue(true);
                yoVar.S.addView(yoVar.m0, w7.a6.n(-1, -2));
                final xh.p g11 = xh.p.g(yoVar.currentAccount);
                final int i43 = 0;
                yoVar.m0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.ko
                    public final /* synthetic */ yo b;

                    {
                        this.b = yoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i43) {
                            case 0:
                                yo yoVar3 = this.b;
                                long j11 = yoVar3.C0;
                                if (g11.h(j11, false) != null) {
                                    yoVar3.presentFragment(new xh.h(1, j11));
                                    break;
                                }
                                break;
                            default:
                                yo yoVar4 = this.b;
                                long j12 = yoVar4.C0;
                                if (g11.h(j12, false) != null) {
                                    yoVar4.presentFragment(new xh.h(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.m(j3)) {
                    long i44 = g11.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i44 > 0) {
                        double d = i44 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(i11);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    yoVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r90(AndroidUtilities.dp(30.0f), yoVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    yoVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                yoVar.m0.setVisibility(g11.b(j3) ? 0 : 8);
                org.telegram.ui.Cells.s8 s8Var36 = new org.telegram.ui.Cells.s8(context2);
                yoVar.n0 = s8Var36;
                s8Var36.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                final int i45 = 1;
                yoVar.n0.setPrioritizeTitleOverValue(true);
                yoVar.S.addView(yoVar.n0, w7.a6.n(-1, -2));
                yoVar.n0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.ko
                    public final /* synthetic */ yo b;

                    {
                        this.b = yoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i45) {
                            case 0:
                                yo yoVar3 = this.b;
                                long j11 = yoVar3.C0;
                                if (g11.h(j11, false) != null) {
                                    yoVar3.presentFragment(new xh.h(1, j11));
                                    break;
                                }
                                break;
                            default:
                                yo yoVar4 = this.b;
                                long j12 = yoVar4.C0;
                                if (g11.h(j12, false) != null) {
                                    yoVar4.presentFragment(new xh.h(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j3, false) != null) {
                    org.telegram.ui.Cells.s8 s8Var37 = yoVar.n0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j3).amount <= 0) {
                        X0 = charSequence;
                        z10 = false;
                    } else {
                        SpannableStringBuilder K0 = xh.z7.K0(g11.c(j3), 0.85f, ' ');
                        CharSequence[] charSequenceArr = new CharSequence[i11];
                        z10 = false;
                        charSequenceArr[0] = "XTR";
                        charSequenceArr[1] = K0;
                        X0 = xh.z7.X0(false, TextUtils.concat(charSequenceArr), 0.85f, null);
                    }
                    s8Var37.q(string2, X0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r90(AndroidUtilities.dp(30.0f), yoVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    yoVar.n0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                yoVar.n0.setVisibility(g11.a(j3) ? 0 : 8);
                org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context2, 12, yoVar.getResourceProvider());
                f9Var4.setFixedSize(12);
                num2 = num;
                f9Var4.setTag(R.id.fit_width_tag, num2);
                zdVar2.addView(f9Var4, w7.a6.n(-1, 12));
                yoVar.S.setVisibility((yoVar.n0.getVisibility() == 0 || yoVar.m0.getVisibility() == 0) ? 0 : 8);
                chat = yoVar.x0;
                i13 = 14;
                if ((chat == null && chat.creator) || ((user = yoVar.D0) != null && user.bot && user.bot_can_edit)) {
                    final long j11 = chat != null ? chat.linked_community_id : yoVar.D0.linked_community_id;
                    long j12 = chat != null ? -chat.id : yoVar.D0.id;
                    final boolean z17 = yoVar.D0 != null;
                    if (j11 != 0) {
                        fi.b bVar = new fi.b(context2, yoVar.resourceProvider);
                        yoVar.h0 = bVar;
                        bVar.a(yoVar.currentAccount, yoVar.getMessagesController().getChat(Long.valueOf(j11)));
                        final int i46 = 0;
                        yoVar.h0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        yoVar.h0.setOnClickListener(new View.OnClickListener(yoVar) { // from class: org.telegram.ui.lo
                            public final /* synthetic */ yo b;

                            {
                                this.b = yoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i46) {
                                    case 0:
                                        yo yoVar3 = this.b;
                                        MessagesController messagesController = yoVar3.getMessagesController();
                                        long j13 = j11;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j13)))) {
                                            yoVar3.showDialog(new ei.k0(yoVar3, j13, null, null));
                                            break;
                                        } else {
                                            yoVar3.presentFragment(new ei.p(w.f.e(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        yo yoVar4 = this.b;
                                        yoVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j11);
                                        yoVar4.presentFragment(new ei.f(bundle));
                                        break;
                                }
                            }
                        });
                        zdVar2.addView(yoVar.h0, w7.a6.n(-1, -2));
                        org.telegram.ui.Cells.s8 s8Var38 = new org.telegram.ui.Cells.s8(context2);
                        yoVar.j0 = s8Var38;
                        s8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : yoVar.I0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                        org.telegram.ui.Cells.s8 s8Var39 = yoVar.j0;
                        int i47 = org.telegram.ui.ActionBar.j6.p7;
                        s8Var39.e(i47, i47);
                        yoVar.j0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        org.telegram.ui.Cells.s8 s8Var40 = yoVar.j0;
                        final long j13 = j12;
                        yo yoVar3 = yoVar;
                        zdVar3 = zdVar2;
                        yoVar2 = yoVar3;
                        f7 = -2.0f;
                        s8Var40.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.mo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                                yo yoVar4 = yo.this;
                                org.telegram.ui.Components.d5.v0(yoVar4, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : yoVar4.I0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new so(yoVar4, j13, j11, 0));
                            }
                        });
                        zdVar3.addView(yoVar2.j0, w7.a6.n(-1, -2));
                        org.telegram.ui.Cells.f9 f9Var5 = new org.telegram.ui.Cells.f9(context2, 12, yoVar2.getResourceProvider());
                        yoVar2.k0 = f9Var5;
                        f9Var5.setFixedSize(14);
                        yoVar2.k0.setTag(R.id.fit_width_tag, num2);
                        zdVar3.addView(yoVar2.k0, w7.a6.n(-1, 14));
                    } else {
                        yo yoVar4 = yoVar;
                        zdVar3 = zdVar2;
                        final long j14 = j12;
                        yoVar2 = yoVar4;
                        f7 = -2.0f;
                        org.telegram.ui.Cells.s8 s8Var41 = new org.telegram.ui.Cells.s8(context2);
                        yoVar2.g0 = s8Var41;
                        s8Var41.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                        yoVar2.g0.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.il));
                        yoVar2.g0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        yoVar2.g0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : yoVar2.I0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                        final int i48 = 1;
                        yoVar2.g0.setOnClickListener(new View.OnClickListener(yoVar2) { // from class: org.telegram.ui.lo
                            public final /* synthetic */ yo b;

                            {
                                this.b = yoVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i48) {
                                    case 0:
                                        yo yoVar32 = this.b;
                                        MessagesController messagesController = yoVar32.getMessagesController();
                                        long j132 = j14;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j132)))) {
                                            yoVar32.showDialog(new ei.k0(yoVar32, j132, null, null));
                                            break;
                                        } else {
                                            yoVar32.presentFragment(new ei.p(w.f.e(j132, "community_id")));
                                            break;
                                        }
                                    default:
                                        yo yoVar42 = this.b;
                                        yoVar42.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j14);
                                        yoVar42.presentFragment(new ei.f(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.f9 f9Var6 = new org.telegram.ui.Cells.f9(context2, 12, yoVar2.resourceProvider);
                        yoVar2.i0 = f9Var6;
                        f9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : yoVar2.I0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                        zdVar3.addView(yoVar2.g0, w7.a6.n(-1, -2));
                        zdVar3.addView(yoVar2.i0, w7.a6.n(-1, -2));
                    }
                } else {
                    yoVar2 = yoVar;
                    f7 = -2.0f;
                    zdVar3 = zdVar2;
                }
                chat2 = yoVar2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    yoVar2.c0 = frameLayout3;
                    zdVar3.addView(frameLayout3, w7.a6.n(-1, -2));
                    org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context2);
                    yoVar2.d0 = gaVar;
                    gaVar.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.p7));
                    yoVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (yoVar2.D0 == null) {
                        yoVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
                    } else if (yoVar2.I0) {
                        yoVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
                    } else {
                        yoVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                    }
                    yoVar2.c0.addView(yoVar2.d0, w7.a6.c(f7, -1));
                    yoVar2.d0.setOnClickListener(new View.OnClickListener(yoVar2) { // from class: org.telegram.ui.io
                        public final /* synthetic */ yo b;

                        {
                            this.b = yoVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    yo yoVar32 = this.b;
                                    yoVar32.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", yoVar32.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wr wrVar = new wr(bundle);
                                    wrVar.x0(yoVar32.y0);
                                    yoVar32.presentFragment(wrVar);
                                    break;
                                case 1:
                                    yo yoVar42 = this.b;
                                    uo uoVar = yoVar42.Q0;
                                    long j32 = yoVar42.C0;
                                    if (!yoVar42.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user22 = j32 == 0 ? null : yoVar42.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user22 == null) {
                                            TLRPC.Chat chat32 = yoVar42.getMessagesController().getChat(Long.valueOf(yoVar42.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar42, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = yoVar42.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(yoVar42.y0.chat_photo.video_sizes.get(0), yoVar42.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, yoVar42, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    yo yoVar5 = this.b;
                                    yoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", yoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    wr wrVar2 = new wr(bundle2);
                                    wrVar2.x0(yoVar5.y0);
                                    yoVar5.presentFragment(wrVar2);
                                    break;
                                case 3:
                                    yo yoVar6 = this.b;
                                    yoVar6.presentFragment(new ai0(yoVar6.w0));
                                    break;
                                case 4:
                                    yo yoVar7 = this.b;
                                    yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                                    break;
                                case 5:
                                    yo yoVar8 = this.b;
                                    yoVar8.getClass();
                                    yoVar8.presentFragment(new wb(yoVar8.x0));
                                    break;
                                case 6:
                                    yo yoVar9 = this.b;
                                    yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                                    break;
                                case 7:
                                    yo yoVar10 = this.b;
                                    yoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", yoVar10.C0);
                                    yoVar10.presentFragment(new ra(bundle3));
                                    break;
                                case 8:
                                    yo yoVar11 = this.b;
                                    yoVar11.presentFragment(new di.m(yoVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    yo.Y(this.b);
                                    break;
                                case 14:
                                    yo yoVar12 = this.b;
                                    org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                                    break;
                                case 15:
                                    yo yoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -yoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new po(yoVar13, 6);
                                        yoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    yo yoVar14 = this.b;
                                    long j102 = yoVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    mp mpVar = new mp(null);
                                    mpVar.M = new ArrayList();
                                    mpVar.N = new ArrayList();
                                    mpVar.P = new ArrayList();
                                    mpVar.c0 = true;
                                    mpVar.f0 = new ArrayList();
                                    mpVar.o0 = new HashMap();
                                    mpVar.q0 = new bp(mpVar, 5);
                                    mpVar.t0 = false;
                                    mpVar.Z = j102;
                                    mpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = yoVar14.y0;
                                    mpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            mpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            mpVar.X(false);
                                        }
                                    }
                                    yoVar14.presentFragment(mpVar);
                                    break;
                                case 17:
                                    yo yoVar15 = this.b;
                                    long j112 = yoVar15.w0;
                                    yp ypVar = new yp(null);
                                    ypVar.v = new ArrayList();
                                    boolean z162 = false;
                                    ypVar.O = false;
                                    ypVar.P = false;
                                    ypVar.E = j112;
                                    TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j112));
                                    ypVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    ypVar.s = z162;
                                    ypVar.h = yoVar15.y0;
                                    yoVar15.presentFragment(ypVar);
                                    break;
                                case 18:
                                    yo yoVar16 = this.b;
                                    vw0 vw0Var = new vw0(yoVar16.w0);
                                    vw0Var.v = new po(yoVar16, 4);
                                    yoVar16.presentFragment(vw0Var);
                                    break;
                                case 19:
                                    yo.Z(this.b);
                                    break;
                                case 20:
                                    yo yoVar17 = this.b;
                                    s60 s60Var = new s60(-yoVar17.x0.id);
                                    s60Var.c = yoVar17.L0;
                                    s60Var.l0 = yoVar17;
                                    yoVar17.presentFragment(s60Var);
                                    break;
                                case 21:
                                    yo yoVar18 = this.b;
                                    yoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", yoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                                    wr wrVar3 = new wr(bundle4);
                                    wrVar3.x0(yoVar18.y0);
                                    yoVar18.presentFragment(wrVar3);
                                    break;
                                case 22:
                                    yo yoVar19 = this.b;
                                    zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = yoVar19.y0;
                                    zh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    yoVar19.presentFragment(zh0Var);
                                    break;
                                case 23:
                                    yo yoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                        yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", yoVar20.w0);
                                        fq fqVar = new fq(bundle5);
                                        fqVar.d = new ArrayList();
                                        fqVar.r = new ArrayList();
                                        fqVar.v = -1;
                                        fqVar.F = new ArrayList();
                                        long j122 = bundle5.getLong("chat_id", 0L);
                                        fqVar.c = j122;
                                        TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                        fqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (fqVar.a == null) {
                                                fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j122));
                                            }
                                            fqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                fqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                fqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                fqVar.w = 1;
                                            }
                                        }
                                        yoVar20.presentFragment(fqVar);
                                        break;
                                    }
                                default:
                                    yo yoVar21 = this.b;
                                    yoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", yoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                                    yoVar21.presentFragment(new eo(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context2);
                    yoVar2.e0 = c7Var2;
                    zdVar3.addView(c7Var2, w7.a6.n(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                yoVar2.c = undoView;
                jdVar.addView(undoView, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.nu nuVar6 = yoVar2.v;
                TLRPC.User user3 = yoVar2.D0;
                nuVar6.setText(Emoji.replaceEmoji(user3 == null ? ContactsController.formatName(user3) : yoVar2.x0.title, yoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.nu nuVar7 = yoVar2.v;
                nuVar7.setSelection(nuVar7.n());
                chatFull = yoVar2.y0;
                if (chatFull == null) {
                    yoVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = yoVar2.E0;
                    if (userFull4 != null) {
                        yoVar2.E.setText(userFull4.about);
                    }
                }
                yoVar2.k0();
                yoVar2.p0(true, false);
                return yoVar2.fragmentView;
            }
        }
        num2 = num;
        chat = yoVar.x0;
        i13 = 14;
        if (chat == null) {
        }
        yoVar2 = yoVar;
        f7 = -2.0f;
        zdVar3 = zdVar2;
        chat2 = yoVar2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            yoVar2.c0 = frameLayout32;
            zdVar3.addView(frameLayout32, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context2);
            yoVar2.d0 = gaVar2;
            gaVar2.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.p7));
            yoVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (yoVar2.D0 == null) {
            }
            yoVar2.c0.addView(yoVar2.d0, w7.a6.c(f7, -1));
            yoVar2.d0.setOnClickListener(new View.OnClickListener(yoVar2) { // from class: org.telegram.ui.io
                public final /* synthetic */ yo b;

                {
                    this.b = yoVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            yo yoVar32 = this.b;
                            yoVar32.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", yoVar32.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            wr wrVar = new wr(bundle);
                            wrVar.x0(yoVar32.y0);
                            yoVar32.presentFragment(wrVar);
                            break;
                        case 1:
                            yo yoVar42 = this.b;
                            uo uoVar = yoVar42.Q0;
                            long j32 = yoVar42.C0;
                            if (!yoVar42.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j32 == 0 ? null : yoVar42.getMessagesController().getUser(Long.valueOf(j32));
                                if (user22 == null) {
                                    TLRPC.Chat chat32 = yoVar42.getMessagesController().getChat(Long.valueOf(yoVar42.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar42, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = yoVar42.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(yoVar42.y0.chat_photo.video_sizes.get(0), yoVar42.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, yoVar42, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", yoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            wr wrVar2 = new wr(bundle2);
                            wrVar2.x0(yoVar5.y0);
                            yoVar5.presentFragment(wrVar2);
                            break;
                        case 3:
                            yo yoVar6 = this.b;
                            yoVar6.presentFragment(new ai0(yoVar6.w0));
                            break;
                        case 4:
                            yo yoVar7 = this.b;
                            yoVar7.presentFragment(new di.h4(-yoVar7.w0));
                            break;
                        case 5:
                            yo yoVar8 = this.b;
                            yoVar8.getClass();
                            yoVar8.presentFragment(new wb(yoVar8.x0));
                            break;
                        case 6:
                            yo yoVar9 = this.b;
                            yoVar9.presentFragment(fb1.d0(yoVar9.x0, false));
                            break;
                        case 7:
                            yo yoVar10 = this.b;
                            yoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", yoVar10.C0);
                            yoVar10.presentFragment(new ra(bundle3));
                            break;
                        case 8:
                            yo yoVar11 = this.b;
                            yoVar11.presentFragment(new di.m(yoVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + yo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            yo.Y(this.b);
                            break;
                        case 14:
                            yo yoVar12 = this.b;
                            org.telegram.ui.Components.d5.s(yoVar12, false, yoVar12.x0, null, false, true, true, false, new po(yoVar12, 7));
                            break;
                        case 15:
                            yo yoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(yoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -yoVar13.w0;
                                TLRPC.ChatFull chatFull6 = yoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new po(yoVar13, 6);
                                yoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            yo yoVar14 = this.b;
                            long j102 = yoVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = yoVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            mp mpVar = new mp(null);
                            mpVar.M = new ArrayList();
                            mpVar.N = new ArrayList();
                            mpVar.P = new ArrayList();
                            mpVar.c0 = true;
                            mpVar.f0 = new ArrayList();
                            mpVar.o0 = new HashMap();
                            mpVar.q0 = new bp(mpVar, 5);
                            mpVar.t0 = false;
                            mpVar.Z = j102;
                            mpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = yoVar14.y0;
                            mpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    mpVar.l0 = tL_chatInviteExported;
                                } else {
                                    mpVar.X(false);
                                }
                            }
                            yoVar14.presentFragment(mpVar);
                            break;
                        case 17:
                            yo yoVar15 = this.b;
                            long j112 = yoVar15.w0;
                            yp ypVar = new yp(null);
                            ypVar.v = new ArrayList();
                            boolean z162 = false;
                            ypVar.O = false;
                            ypVar.P = false;
                            ypVar.E = j112;
                            TLRPC.Chat chat42 = ypVar.getMessagesController().getChat(Long.valueOf(j112));
                            ypVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !ypVar.f.megagroup) {
                                z162 = true;
                            }
                            ypVar.s = z162;
                            ypVar.h = yoVar15.y0;
                            yoVar15.presentFragment(ypVar);
                            break;
                        case 18:
                            yo yoVar16 = this.b;
                            vw0 vw0Var = new vw0(yoVar16.w0);
                            vw0Var.v = new po(yoVar16, 4);
                            yoVar16.presentFragment(vw0Var);
                            break;
                        case 19:
                            yo.Z(this.b);
                            break;
                        case 20:
                            yo yoVar17 = this.b;
                            s60 s60Var = new s60(-yoVar17.x0.id);
                            s60Var.c = yoVar17.L0;
                            s60Var.l0 = yoVar17;
                            yoVar17.presentFragment(s60Var);
                            break;
                        case 21:
                            yo yoVar18 = this.b;
                            yoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", yoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((yoVar18.I0 || yoVar18.x0.gigagroup) && !ChatObject.isCommunity(yoVar18.x0)) ? 0 : 3);
                            wr wrVar3 = new wr(bundle4);
                            wrVar3.x0(yoVar18.y0);
                            yoVar18.presentFragment(wrVar3);
                            break;
                        case 22:
                            yo yoVar19 = this.b;
                            zh0 zh0Var = new zh0(yoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = yoVar19.y0;
                            zh0Var.g0(chatFull8, chatFull8.exported_invite);
                            yoVar19.presentFragment(zh0Var);
                            break;
                        case 23:
                            yo yoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(yoVar20.x0)) {
                                yoVar20.presentFragment(new yg.s(yoVar20.w0, yoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", yoVar20.w0);
                                fq fqVar = new fq(bundle5);
                                fqVar.d = new ArrayList();
                                fqVar.r = new ArrayList();
                                fqVar.v = -1;
                                fqVar.F = new ArrayList();
                                long j122 = bundle5.getLong("chat_id", 0L);
                                fqVar.c = j122;
                                TLRPC.ChatFull chatFull9 = yoVar20.y0;
                                fqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (fqVar.a == null) {
                                        fqVar.a = fqVar.getMessagesController().getChat(Long.valueOf(j122));
                                    }
                                    fqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        fqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        fqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                fqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        fqVar.w = 1;
                                    }
                                }
                                yoVar20.presentFragment(fqVar);
                                break;
                            }
                        default:
                            yo yoVar21 = this.b;
                            yoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", yoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", yoVar21.w0);
                            yoVar21.presentFragment(new eo(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.c7 c7Var22 = new org.telegram.ui.Cells.c7(context2);
            yoVar2.e0 = c7Var22;
            zdVar3.addView(c7Var22, w7.a6.n(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        yoVar2.c = undoView2;
        jdVar.addView(undoView2, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.nu nuVar62 = yoVar2.v;
        TLRPC.User user32 = yoVar2.D0;
        nuVar62.setText(Emoji.replaceEmoji(user32 == null ? ContactsController.formatName(user32) : yoVar2.x0.title, yoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.nu nuVar72 = yoVar2.v;
        nuVar72.setSelection(nuVar72.n());
        chatFull = yoVar2.y0;
        if (chatFull == null) {
        }
        yoVar2.k0();
        yoVar2.p0(true, false);
        return yoVar2.fragmentView;
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
        org.telegram.ui.Cells.s8 s8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z11 = true;
        long j3 = this.C0;
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
                if (j3 != 0) {
                    this.G0 = false;
                } else {
                    if (!this.F0) {
                        TLRPC.ChatFull chatFull2 = this.y0;
                    }
                    TLRPC.ChatFull chatFull3 = this.y0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z10 = true;
                        this.G0 = z10;
                        s8Var = this.Q;
                        if (s8Var != null) {
                            s8Var.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.G0 = z10;
                    s8Var = this.Q;
                    if (s8Var != null) {
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
            org.telegram.ui.Cells.s8 s8Var2 = this.Q;
            if (s8Var2 != null) {
                s8Var2.setChecked(booleanValue);
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
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var == null || f5Var.getLastFragment() != this) {
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
                if (((Long) objArr[0]).longValue() == j3) {
                    m0(getMessagesController().getUserFull(j3));
                    return;
                }
                return;
            } else {
                if (i10 == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i10 == NotificationCenter.dialogDeleted && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.f5 f5Var2 = this.parentLayout;
                    if (f5Var2 == null || f5Var2.getLastFragment() != this) {
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
        if (((Long) objArr[0]).longValue() == j3) {
            if (this.n0 != null) {
                xh.p g10 = xh.p.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j3) ? 0 : 8);
                this.n0.u(xh.z7.X0(false, TextUtils.concat("XTR", xh.z7.J0(g10.c(j3), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.s8 s8Var3 = this.l0;
                if (s8Var3 != null) {
                    s8Var3.setNeedDivider(g10.a(j3) || g10.b(j3));
                }
                this.S.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                xh.p g11 = xh.p.g(this.currentAccount);
                this.m0.setVisibility(g11.b(j3) ? 0 : 8);
                long i14 = g11.i(j3);
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
                org.telegram.ui.Cells.s8 s8Var4 = this.l0;
                if (s8Var4 != null) {
                    if (!g11.a(j3) && !g11.b(j3)) {
                        z11 = false;
                    }
                    s8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.S;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
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

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.nu nuVar;
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
            org.telegram.ui.Components.nu nuVar2 = this.v;
            if ((nuVar2 == null || this.D0.first_name.equals(nuVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new po(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new po(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory == this.J0) && (((nuVar = this.v) == null || this.x0.title.equals(nuVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.F0 == this.x0.forum))) {
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
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new po(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new po(this, 3));
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

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ ev0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        wo woVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(woVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.s8 s8Var = this.U;
        if (s8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(s8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.nu nuVar = this.v;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c0, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d0, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i17 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.s8 s8Var2 = this.K;
        if (s8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(s8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.s8 s8Var3 = this.a0;
        if (s8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(s8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new oo(this, 0));
    }

    public final void i0() {
        this.s.o(this.v0 != null, new qo(this, 0), new s5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.b0.e.d();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.nu nuVar;
        String str;
        String str2;
        if (this.N0 || (nuVar = this.v) == null) {
            return;
        }
        if (nuVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.N0 = true;
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
            this.b = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new ba(this, getConnectionsManager().sendRequest(setbotinfo, new bi.o2(25, this, setbotinfo)), 2));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.x0) && (!this.J0 || this.F0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.w0, this, new po(this, 5));
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
        if (this.s.h()) {
            this.M0 = true;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.b = d2Var;
            d2Var.setOnCancelListener(new qg(this, r0));
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
                for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                    if ((fragmentStack.get(i10) instanceof eo) && ((eo) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.f5 parentLayout = getParentLayout();
                        HashSet hashSet = ig1.n1;
                        ((ActionBarLayout) parentLayout).c(i10, ig1.E0(getMessagesController(), getMessagesStorage(), bundle));
                    }
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
        long j3 = this.C0;
        TLRPC.User user = j3 == 0 ? null : getMessagesController().getUser(Long.valueOf(j3));
        if (chat == null && user == null) {
            return;
        }
        this.D0 = user;
        this.x0 = chat;
        org.telegram.ui.Components.g9 g9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(g9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.v0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, g9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.h()) {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.b0.e.setAnimation(this.R0);
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
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
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().y0();
        }
        if (this.Z == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.p5 n10;
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
                                n10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, org.telegram.ui.Components.p5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.p5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.p5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, org.telegram.ui.Components.p5.g(), tL_availableReaction2.activate_animation);
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
                long j3 = this.C0;
                this.D0 = j3 == 0 ? null : getMessagesController().getUser(Long.valueOf(j3));
            }
            org.telegram.ui.Cells.s8 s8Var = this.o0;
            if (s8Var != null) {
                s8Var.f(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.s8 s8Var2 = this.u0;
            if (s8Var2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                s8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.f9 f9Var = this.t0;
            if (f9Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                f9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<bi.s7, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<bi.s7, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new ai.e(25, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.s8 s8Var2;
        vp0 vp0Var;
        int v02;
        ArrayList<Integer> arrayList;
        fp0 fp0Var = this.L;
        if (fp0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.s8 s8Var3 = this.N;
            boolean z10 = (s8Var3 != null && s8Var3.getVisibility() == 0) || ((s8Var = this.Q) != null && s8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.x0) && ChatObject.hasAdminRights(this.x0)) || ((s8Var2 = this.M) != null && s8Var2.getVisibility() == 0));
            Paint paint = fp0Var.n;
            int i10 = fp0Var.a;
            org.telegram.ui.ActionBar.f6 f6Var = fp0Var.d;
            if (chat == null) {
                return;
            }
            fp0Var.v = z10;
            fp0Var.r = new org.telegram.ui.Components.t01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            vp0 vp0Var2 = fp0Var.w;
            if (vp0Var2 != null) {
                vp0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = vp0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                fp0Var.w = new vp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    vp0Var = vp0.c(i10, ChatObject.getProfileColorId(chat));
                    vp0Var.a = AndroidUtilities.dp(11.0f);
                    vp0Var.d();
                } else {
                    vp0Var = null;
                }
                fp0Var.w = vp0Var;
            }
            vp0 vp0Var3 = fp0Var.w;
            if (vp0Var3 != null) {
                vp0Var3.e(fp0Var);
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
                fp0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i13));
                vp0 vp0Var4 = new vp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                vp0Var4.a = AndroidUtilities.dp(11.0f);
                vp0Var4.d();
                fp0Var.x = vp0Var4;
                vp0Var4.e(fp0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.j6.r8[colorId];
                fp0Var.s = i14;
                v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    fp0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.j6.r8[0];
                    fp0Var.s = i15;
                    v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
                }
            }
            fp0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
            vp0 a10 = vp0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            fp0Var.x = a10;
            a10.e(fp0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.nu nuVar = this.v;
        if (nuVar == null || !nuVar.e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        nuVar.k(true);
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
        long j3 = this.w0;
        long j10 = this.C0;
        boolean z10 = true;
        if (j3 == 0) {
            TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            this.D0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j10);
                this.D0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.D0, true);
                    if (this.E0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j10));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.E0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            org.telegram.ui.Components.g9 g9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.e50 e50Var = this.s;
            e50Var.a = this;
            e50Var.b = this;
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
        org.telegram.ui.Components.g9 g9Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            g9Var2.n(5L, this.x0.title, null);
            this.I0 = ChatObject.isChannel(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat3 = this.x0;
            boolean z11 = chat3.forum;
            this.F0 = z11;
            this.H0 = chat3.forum_tabs;
            if (j10 == 0) {
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
            g9Var2.n(5L, this.D0.first_name, null);
            this.I0 = false;
            this.F0 = false;
            this.H0 = false;
            this.G0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.e50 e50Var2 = this.s;
        e50Var2.a = this;
        e50Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.y0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null) {
            e50Var.e();
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
        org.telegram.ui.Components.nu nuVar = this.v;
        if (nuVar != null) {
            nuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        zd zdVar = this.w;
        if (zdVar != null) {
            zdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.p5) obj).p(null);
        }
        org.telegram.ui.Components.nu nuVar = this.v;
        if (nuVar != null) {
            nuVar.r();
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
        org.telegram.ui.Components.nu nuVar = this.v;
        if (nuVar != null) {
            nuVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.s.l();
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
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.s8 s8Var2;
        org.telegram.ui.Cells.s8 s8Var3;
        org.telegram.ui.Cells.s8 s8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.s8 s8Var5;
        org.telegram.ui.Cells.s8 s8Var6;
        org.telegram.ui.Cells.s8 s8Var7;
        org.telegram.ui.Cells.s8 s8Var8;
        org.telegram.ui.Cells.s8 s8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.w0))) != null) {
            this.x0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.x0);
        org.telegram.ui.Cells.f9 f9Var = this.P;
        int i16 = 8;
        if (f9Var != null) {
            f9Var.setVisibility((this.I != null || ((s8Var7 = this.J) != null && s8Var7.getVisibility() == 0) || (((s8Var8 = this.N) != null && s8Var8.getVisibility() == 0) || ((s8Var9 = this.H) != null && s8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.s8 s8Var10 = this.Y;
        if (s8Var10 != null) {
            s8Var10.setVisibility(ChatObject.isChannel(this.x0) ? 0 : 8);
        }
        org.telegram.ui.Cells.s8 s8Var11 = this.J;
        if (s8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.I0 && chatFull2.linked_chat_id == 0)) {
                s8Var11.setVisibility(8);
            } else {
                s8Var11.setVisibility(0);
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
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), org.telegram.ui.Cells.r6.i("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.s8 s8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.s8 s8Var13 = this.Q;
                            s8Var12.s(string2, str4, false, i17, s8Var13 != null && s8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.s8 s8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String i18 = org.telegram.ui.Cells.r6.i("@", publicUsername2);
                            int i19 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.s8 s8Var15 = this.Q;
                            s8Var14.s(string3, i18, false, i19, s8Var15 != null && s8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.s8 s8Var16 = this.H;
        if (s8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                s8Var16.setVisibility(8);
            } else {
                s8Var16.setVisibility(0);
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
                    org.telegram.ui.Cells.s8 s8Var17 = this.I;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i20 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.s8 s8Var18 = this.N;
                    s8Var17.s(string4, str5, false, i20, (s8Var18 != null && s8Var18.getVisibility() == 0) || ((s8Var3 = this.J) != null && s8Var3.getVisibility() == 0) || ((s8Var4 = this.Q) != null && s8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.s8 s8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i21 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.s8 s8Var20 = this.N;
                    s8Var19.s(string5, str5, false, i21, (s8Var20 != null && s8Var20.getVisibility() == 0) || ((s8Var = this.J) != null && s8Var.getVisibility() == 0) || ((s8Var2 = this.Q) != null && s8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a4.a.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.x0));
                org.telegram.ui.Cells.s8 s8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i22 = R.drawable.msg_channel;
                org.telegram.ui.Cells.s8 s8Var22 = this.N;
                s8Var21.s(string7, string6, false, i22, (s8Var22 != null && s8Var22.getVisibility() == 0) || ((s8Var5 = this.J) != null && s8Var5.getVisibility() == 0) || ((s8Var6 = this.Q) != null && s8Var6.getVisibility() == 0));
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
                boolean z15 = false;
                for (int i23 = 0; i23 < this.F.getChildCount(); i23++) {
                    if (!z15 && this.F.getChildAt(i23) == this.N) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.F.getChildAt(i23));
                    }
                }
                boolean z16 = false;
                for (int i24 = 0; i24 < this.w.getChildCount(); i24++) {
                    if (!z16 && this.w.getChildAt(i24) == this.F) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.w.getChildAt(i24));
                    }
                }
                if (this.N.getVisibility() != 0) {
                    this.N.setAlpha(0.0f);
                    this.N.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.N.setVisibility(0);
                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                    ((View) arrayList.get(i25)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.S0 = ofFloat;
                    ofFloat.addUpdateListener(new gg.t1(i16, this, arrayList));
                    this.S0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 4));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.wr.h);
                    this.S0.start();
                } else {
                    this.N.setAlpha(z14 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z14 ? 0 : 8);
                    for (int i26 = 0; i26 < arrayList.size(); i26++) {
                        ((View) arrayList.get(i26)).setTranslationY(0.0f);
                    }
                    this.S0 = null;
                }
            }
        }
        if (this.T != null) {
            if (this.y0 != null) {
                org.telegram.ui.Cells.s8 s8Var23 = this.U;
                if (s8Var23 != null) {
                    if (s8Var23.getParent() == null) {
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
                        int i27 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i28 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i28++;
                            }
                            i10 = wr.n0(tL_chatBannedRights) + i28;
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
                            i11 = i27;
                        } else {
                            i10 = i27;
                            i11 = i10;
                        }
                        z12 = z11;
                        this.X.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.s8 s8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i29 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.s8 s8Var25 = this.Y;
                        s8Var24.s(string8, format, false, i29, s8Var25 != null && s8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.s8 s8Var26 = this.U;
                    if (s8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.y0.requests_pending));
                        int i30 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.s8 s8Var27 = this.Y;
                        s8Var26.s(string9, format2, false, i30, s8Var27 != null && s8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.s8 s8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i31 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.s8 s8Var29 = this.Y;
                    s8Var28.s(string10, format3, false, i31, s8Var29 != null && s8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.s8 s8Var30 = this.W;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.x0)) {
                    i12 = this.y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.y0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i32 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i33);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i32++;
                            }
                        }
                        i12 = i32;
                    }
                }
                s8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    org.telegram.ui.Cells.s8 s8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i34 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.s8 s8Var32 = this.Y;
                    s8Var31.m(i34, string12, s8Var32 != null && s8Var32.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.s8 s8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i35 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.s8 s8Var34 = this.Y;
                        s8Var33.m(i35, string13, s8Var34 != null && s8Var34.getVisibility() == 0);
                    } else {
                        this.X.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.s8 s8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i36 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.s8 s8Var36 = this.Y;
                    s8Var35.m(i36, string14, s8Var36 != null && s8Var36.getVisibility() == 0);
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
        wy wyVar;
        qx qxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof eo) {
                eo eoVar = (eo) fragmentStack.get(i10);
                if (eoVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(eoVar, false);
                    eoVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, eoVar);
                    if (!this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new ig1(bundle));
                        i10++;
                    }
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof ig1)) {
                ig1 ig1Var = (ig1) fragmentStack.get(i10);
                if (ig1Var.g() != null && ig1Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(ig1Var, false);
                    i10--;
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof wy) && (wyVar = (wy) fragmentStack.get(i10)) != null && (qxVar = wyVar.F3) != null && qxVar.c()) {
                wyVar.F3.a();
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null) {
            e50Var.f = bundle.getString("path");
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
        this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null && (str = e50Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.nu nuVar = this.v;
        if (nuVar != null) {
            String obj = nuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean t() {
        return false;
    }

    public final void t0(Long l4) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.K == null) {
            return;
        }
        long j3 = 0;
        if (!(l4 != null ? l4.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.K.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.x0.linked_monoforum_id));
        if (l4 != null) {
            j3 = l4.longValue();
        } else if (chat2 != null) {
            j3 = chat2.send_paid_messages_stars;
        }
        this.K.s(LocaleController.getString(R.string.PostSuggestions), xh.z7.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
