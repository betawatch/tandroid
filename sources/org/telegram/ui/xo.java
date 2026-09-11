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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class xo extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.t40, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public EditTextBoldCursor E;
    public TLRPC.UserFull E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.a7 G;
    public boolean G0;
    public org.telegram.ui.Cells.r8 H;
    public boolean H0;
    public org.telegram.ui.Cells.r8 I;
    public boolean I0;
    public org.telegram.ui.Cells.r8 J;
    public boolean J0;
    public org.telegram.ui.Cells.r8 K;
    public TLRPC.ChatReactions K0;
    public gp0 L;
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
    public final uo Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.xi0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.r8 T;
    public org.telegram.ui.Cells.r8 U;
    public org.telegram.ui.Cells.r8 V;
    public org.telegram.ui.Cells.r8 W;
    public org.telegram.ui.Cells.r8 X;
    public org.telegram.ui.Cells.r8 Y;
    public org.telegram.ui.Cells.r8 Z;
    public org.telegram.ui.ActionBar.v0 a;
    public org.telegram.ui.Cells.r8 a0;
    public org.telegram.ui.ActionBar.b2 b;
    public vo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ea d0;
    public bi.i5 e;
    public org.telegram.ui.Cells.a7 e0;
    public di.r6 f;
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
    public final org.telegram.ui.Components.i9 r;
    public org.telegram.ui.Cells.r8 r0;
    public final org.telegram.ui.Components.u40 s;
    public org.telegram.ui.Cells.e9 s0;
    public org.telegram.ui.Cells.e9 t0;
    public org.telegram.ui.Cells.r8 u0;
    public org.telegram.ui.Components.hu v;
    public TLRPC.FileLocation v0;
    public yd w;
    public long w0;
    public org.telegram.ui.Components.zn0 x;
    public TLRPC.Chat x0;
    public LinearLayout y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public xo(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new uo(this);
        this.r = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.u40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.u40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(xo xoVar, FrameLayout frameLayout, View view) {
        if (!xoVar.G0) {
            TLRPC.ChatFull chatFull = xoVar.y0;
            org.telegram.ui.Components.yc.a0(xoVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", xoVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j3 = -xoVar.w0;
        mz mzVar = new mz(null);
        mzVar.a = j3;
        mzVar.setResourceProvider(xoVar.resourceProvider);
        boolean z10 = xoVar.F0;
        boolean z11 = xoVar.H0;
        bi.f0 f0Var = new bi.f0(8, xoVar, view);
        mzVar.c = z10;
        mzVar.d = z11;
        mzVar.f = f0Var;
        xoVar.presentFragment(mzVar);
    }

    public static /* synthetic */ void V(xo xoVar) {
        xoVar.v0 = null;
        long j3 = xoVar.C0;
        if (j3 == 0) {
            MessagesController.getInstance(xoVar.currentAccount).changeChatAvatar(xoVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = xoVar.getMessagesController().getInputUser(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            xoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new no(xoVar, 2));
        }
        xoVar.n0(false, true);
        bi.i5 i5Var = xoVar.e;
        org.telegram.ui.Components.i9 i9Var = xoVar.r;
        Object obj = xoVar.D0;
        if (obj == null) {
            obj = xoVar.x0;
        }
        i5Var.h(null, null, i9Var, obj);
        xoVar.R0.K(0);
        xoVar.b0.e.d();
    }

    public static void X(xo xoVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        b2Var.dismiss();
        if (xoVar.getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(35, xoVar.currentAccount, xoVar.getParentActivity(), xoVar, xoVar.getResourceProvider());
        k0Var.G1(canApplyBoost);
        k0Var.F1(tL_premium_boostsStatus, true);
        k0Var.H1(j3);
        TLRPC.Chat chat = xoVar.getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            k0Var.Q0 = new fh(14, xoVar, chat);
        }
        xoVar.showDialog(k0Var);
    }

    public static void Y(xo xoVar) {
        int i10 = xoVar.currentAccount;
        long j3 = xoVar.C0;
        TL_bots.botVerifierSettings botverifiersettings = xoVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e7 = org.telegram.messenger.w1.e(16, "onlySelect", "dialogsType", true);
        e7.putBoolean("resetDelegate", false);
        uy uyVar = new uy(e7);
        uyVar.setCurrentAccount(i10);
        uyVar.C2 = new fi.u1(uyVar, i10, j3, botverifiersettings);
        U.presentFragment(uyVar);
    }

    public static void Z(xo xoVar) {
        bd bdVar = new bd(-xoVar.x0.id);
        bdVar.l0 = xoVar;
        xoVar.presentFragment(bdVar);
        MessagesController.getInstance(xoVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(xoVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(xo xoVar) {
        xoVar.O0 = true;
        NotificationCenter.getInstance(xoVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(10);
        d10Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        d10Var.f = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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

    @Override // org.telegram.ui.Components.t40
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0efe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0f0a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0f6e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0fa2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0f73  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07fb  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        CharSequence charSequence;
        long j3;
        Integer num;
        id idVar;
        final int i10;
        final xo xoVar;
        Context context2;
        int i11;
        final int i12;
        Integer num2;
        boolean z10;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i13;
        TLRPC.User user;
        final xo xoVar2;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        int i14;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        org.telegram.ui.Cells.r8 r8Var3;
        org.telegram.ui.Cells.r8 r8Var4;
        org.telegram.ui.Cells.r8 r8Var5;
        org.telegram.ui.Cells.r8 r8Var6;
        TLRPC.ChatFull chatFull2;
        boolean z11;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i15 = 1;
        org.telegram.ui.Components.hu huVar = this.v;
        if (huVar != null) {
            huVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, i15));
        id idVar2 = new id(i15, context, this);
        idVar2.setOnTouchListener(new ci.d(9));
        this.fragmentView = idVar2;
        idVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.a7));
        yd ydVar = new yd(context);
        this.w = ydVar;
        final int i16 = 0;
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(context, this.w, this.resourceProvider, false);
        this.x = zn0Var;
        zn0Var.setFillViewport(true);
        idVar2.addView(this.x, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(ydVar, new FrameLayout.LayoutParams(-1, -2));
        ydVar.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.d6));
        ydVar.addView(this.d, w7.x5.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.x5.n(-1, -2));
        bi.i5 i5Var = new bi.i5(this, context, 6);
        this.e = i5Var;
        i5Var.setRoundRadius(this.F0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i17 = 5;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            bi.i5 i5Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(i5Var2, w7.x5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            di.r6 r6Var = new di.r6(this, context, paint, i17);
            this.f = r6Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(r6Var, w7.x5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, w7.x5.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j10 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat3 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i18 = chatPhoto2.dc_id;
                                        if (i18 != 0) {
                                            chatPhoto2.photo_big.dc_id = i18;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat3.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i19 = userProfilePhoto2.dc_id;
                                        if (i19 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i19;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j11 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var7 = xoVar14.H;
                            boolean z15 = r8Var7 != null && r8Var7.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j11;
                            lpVar.n0 = z15;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z16 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat4 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !xpVar.f.megagroup) {
                                z16 = true;
                            }
                            xpVar.s = z16;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i20 = 0; i20 < tL_chatReactionsSome.reactions.size(); i20++) {
                                            if (tL_chatReactionsSome.reactions.get(i20) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i20)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
        } else {
            bi.i5 i5Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(i5Var3, w7.x5.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.hu huVar2 = new org.telegram.ui.Components.hu(context, idVar2, this);
        this.v = huVar2;
        long j10 = this.C0;
        if (j10 != 0) {
            huVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.I0) {
            huVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            huVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.hu huVar3 = this.v;
        TLRPC.Chat chat3 = this.x0;
        huVar3.setEnabled(chat3 != null || ChatObject.canChangeChatInfo(chat3));
        org.telegram.ui.Components.hu huVar4 = this.v;
        huVar4.setFocusable(huVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new l0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.hu huVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(huVar5, w7.x5.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        ydVar.addView(this.y, w7.x5.n(-1, -2));
        final int i18 = 12;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            vo voVar = new vo(context);
            this.b0 = voVar;
            voVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            this.b0.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i19 = userProfilePhoto2.dc_id;
                                        if (i19 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i19;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j11 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var7 = xoVar14.H;
                            boolean z152 = r8Var7 != null && r8Var7.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j11;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat4 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i20 = 0; i20 < tL_chatReactionsSome.reactions.size(); i20++) {
                                            if (tL_chatReactionsSome.reactions.get(i20) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i20)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.b0, w7.x5.n(-1, -2));
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
            this.y.addView(this.E, w7.x5.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, w7.x5.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new ia(this, 2));
        this.E.addTextChangedListener(new ld(1));
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context);
        this.G = a7Var;
        ydVar.addView(a7Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(1);
        ydVar.addView(this.F, w7.x5.n(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.r8 r8Var7 = new org.telegram.ui.Cells.r8(context);
                this.H = r8Var7;
                r8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.H, w7.x5.n(-1, -2));
                final int i20 = 15;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ xo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                xo xoVar3 = this.b;
                                xoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                vr vrVar = new vr(bundle);
                                vrVar.x0(xoVar3.y0);
                                xoVar3.presentFragment(vrVar);
                                break;
                            case 1:
                                xo xoVar4 = this.b;
                                uo uoVar = xoVar4.Q0;
                                long j102 = xoVar4.C0;
                                if (!xoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                xo xoVar5 = this.b;
                                xoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", xoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                vr vrVar2 = new vr(bundle2);
                                vrVar2.x0(xoVar5.y0);
                                xoVar5.presentFragment(vrVar2);
                                break;
                            case 3:
                                xo xoVar6 = this.b;
                                xoVar6.presentFragment(new zh0(xoVar6.w0));
                                break;
                            case 4:
                                xo xoVar7 = this.b;
                                xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                break;
                            case 5:
                                xo xoVar8 = this.b;
                                xoVar8.getClass();
                                xoVar8.presentFragment(new ub(xoVar8.x0));
                                break;
                            case 6:
                                xo xoVar9 = this.b;
                                xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                break;
                            case 7:
                                xo xoVar10 = this.b;
                                xoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", xoVar10.C0);
                                xoVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                xo xoVar11 = this.b;
                                xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                break;
                            case 9:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                xo.Y(this.b);
                                break;
                            case 14:
                                xo xoVar12 = this.b;
                                org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                break;
                            case 15:
                                xo xoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -xoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new oo(xoVar13, 6);
                                    xoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                xo xoVar14 = this.b;
                                long j11 = xoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                lp lpVar = new lp(null);
                                lpVar.M = new ArrayList();
                                lpVar.N = new ArrayList();
                                lpVar.P = new ArrayList();
                                lpVar.c0 = true;
                                lpVar.f0 = new ArrayList();
                                lpVar.o0 = new HashMap();
                                lpVar.q0 = new ap(lpVar, 5);
                                lpVar.t0 = false;
                                lpVar.Z = j11;
                                lpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                lpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        lpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        lpVar.X(false);
                                    }
                                }
                                xoVar14.presentFragment(lpVar);
                                break;
                            case 17:
                                xo xoVar15 = this.b;
                                long j12 = xoVar15.w0;
                                xp xpVar = new xp(null);
                                xpVar.v = new ArrayList();
                                boolean z162 = false;
                                xpVar.O = false;
                                xpVar.P = false;
                                xpVar.E = j12;
                                TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                xpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                    z162 = true;
                                }
                                xpVar.s = z162;
                                xpVar.h = xoVar15.y0;
                                xoVar15.presentFragment(xpVar);
                                break;
                            case 18:
                                xo xoVar16 = this.b;
                                tw0 tw0Var = new tw0(xoVar16.w0);
                                tw0Var.v = new oo(xoVar16, 4);
                                xoVar16.presentFragment(tw0Var);
                                break;
                            case 19:
                                xo.Z(this.b);
                                break;
                            case 20:
                                xo xoVar17 = this.b;
                                t60 t60Var = new t60(-xoVar17.x0.id);
                                t60Var.c = xoVar17.L0;
                                t60Var.l0 = xoVar17;
                                xoVar17.presentFragment(t60Var);
                                break;
                            case 21:
                                xo xoVar18 = this.b;
                                xoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", xoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                vr vrVar3 = new vr(bundle4);
                                vrVar3.x0(xoVar18.y0);
                                xoVar18.presentFragment(vrVar3);
                                break;
                            case 22:
                                xo xoVar19 = this.b;
                                yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                xoVar19.presentFragment(yh0Var);
                                break;
                            case 23:
                                xo xoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                    xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", xoVar20.w0);
                                    eq eqVar = new eq(bundle5);
                                    eqVar.d = new ArrayList();
                                    eqVar.r = new ArrayList();
                                    eqVar.v = -1;
                                    eqVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    eqVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                    eqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (eqVar.a == null) {
                                            eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        eqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            eqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            eqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            eqVar.w = 1;
                                        }
                                    }
                                    xoVar20.presentFragment(eqVar);
                                    break;
                                }
                            default:
                                xo xoVar21 = this.b;
                                xoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", xoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                xoVar21.presentFragment(new co(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.r8 r8Var8 = new org.telegram.ui.Cells.r8(context);
                this.I = r8Var8;
                r8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.I, w7.x5.n(-1, -2));
                final int i21 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ xo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                xo xoVar3 = this.b;
                                xoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                vr vrVar = new vr(bundle);
                                vrVar.x0(xoVar3.y0);
                                xoVar3.presentFragment(vrVar);
                                break;
                            case 1:
                                xo xoVar4 = this.b;
                                uo uoVar = xoVar4.Q0;
                                long j102 = xoVar4.C0;
                                if (!xoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                xo xoVar5 = this.b;
                                xoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", xoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                vr vrVar2 = new vr(bundle2);
                                vrVar2.x0(xoVar5.y0);
                                xoVar5.presentFragment(vrVar2);
                                break;
                            case 3:
                                xo xoVar6 = this.b;
                                xoVar6.presentFragment(new zh0(xoVar6.w0));
                                break;
                            case 4:
                                xo xoVar7 = this.b;
                                xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                break;
                            case 5:
                                xo xoVar8 = this.b;
                                xoVar8.getClass();
                                xoVar8.presentFragment(new ub(xoVar8.x0));
                                break;
                            case 6:
                                xo xoVar9 = this.b;
                                xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                break;
                            case 7:
                                xo xoVar10 = this.b;
                                xoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", xoVar10.C0);
                                xoVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                xo xoVar11 = this.b;
                                xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                break;
                            case 9:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                xo.Y(this.b);
                                break;
                            case 14:
                                xo xoVar12 = this.b;
                                org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                break;
                            case 15:
                                xo xoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -xoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new oo(xoVar13, 6);
                                    xoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                xo xoVar14 = this.b;
                                long j11 = xoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                lp lpVar = new lp(null);
                                lpVar.M = new ArrayList();
                                lpVar.N = new ArrayList();
                                lpVar.P = new ArrayList();
                                lpVar.c0 = true;
                                lpVar.f0 = new ArrayList();
                                lpVar.o0 = new HashMap();
                                lpVar.q0 = new ap(lpVar, 5);
                                lpVar.t0 = false;
                                lpVar.Z = j11;
                                lpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                lpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        lpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        lpVar.X(false);
                                    }
                                }
                                xoVar14.presentFragment(lpVar);
                                break;
                            case 17:
                                xo xoVar15 = this.b;
                                long j12 = xoVar15.w0;
                                xp xpVar = new xp(null);
                                xpVar.v = new ArrayList();
                                boolean z162 = false;
                                xpVar.O = false;
                                xpVar.P = false;
                                xpVar.E = j12;
                                TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                xpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                    z162 = true;
                                }
                                xpVar.s = z162;
                                xpVar.h = xoVar15.y0;
                                xoVar15.presentFragment(xpVar);
                                break;
                            case 18:
                                xo xoVar16 = this.b;
                                tw0 tw0Var = new tw0(xoVar16.w0);
                                tw0Var.v = new oo(xoVar16, 4);
                                xoVar16.presentFragment(tw0Var);
                                break;
                            case 19:
                                xo.Z(this.b);
                                break;
                            case 20:
                                xo xoVar17 = this.b;
                                t60 t60Var = new t60(-xoVar17.x0.id);
                                t60Var.c = xoVar17.L0;
                                t60Var.l0 = xoVar17;
                                xoVar17.presentFragment(t60Var);
                                break;
                            case 21:
                                xo xoVar18 = this.b;
                                xoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", xoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                vr vrVar3 = new vr(bundle4);
                                vrVar3.x0(xoVar18.y0);
                                xoVar18.presentFragment(vrVar3);
                                break;
                            case 22:
                                xo xoVar19 = this.b;
                                yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                xoVar19.presentFragment(yh0Var);
                                break;
                            case 23:
                                xo xoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                    xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", xoVar20.w0);
                                    eq eqVar = new eq(bundle5);
                                    eqVar.d = new ArrayList();
                                    eqVar.r = new ArrayList();
                                    eqVar.v = -1;
                                    eqVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    eqVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                    eqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (eqVar.a == null) {
                                            eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        eqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            eqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            eqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            eqVar.w = 1;
                                        }
                                    }
                                    xoVar20.presentFragment(eqVar);
                                    break;
                                }
                            default:
                                xo xoVar21 = this.b;
                                xoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", xoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                xoVar21.presentFragment(new co(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.x0) && ((this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) || (!this.I0 && ChatObject.canUserDoAdminAction(this.x0, 0)))) {
                org.telegram.ui.Cells.r8 r8Var9 = new org.telegram.ui.Cells.r8(context);
                this.J = r8Var9;
                r8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.J, w7.x5.n(-1, -2));
                final int i22 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ xo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                xo xoVar3 = this.b;
                                xoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                vr vrVar = new vr(bundle);
                                vrVar.x0(xoVar3.y0);
                                xoVar3.presentFragment(vrVar);
                                break;
                            case 1:
                                xo xoVar4 = this.b;
                                uo uoVar = xoVar4.Q0;
                                long j102 = xoVar4.C0;
                                if (!xoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                xo xoVar5 = this.b;
                                xoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", xoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                vr vrVar2 = new vr(bundle2);
                                vrVar2.x0(xoVar5.y0);
                                xoVar5.presentFragment(vrVar2);
                                break;
                            case 3:
                                xo xoVar6 = this.b;
                                xoVar6.presentFragment(new zh0(xoVar6.w0));
                                break;
                            case 4:
                                xo xoVar7 = this.b;
                                xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                break;
                            case 5:
                                xo xoVar8 = this.b;
                                xoVar8.getClass();
                                xoVar8.presentFragment(new ub(xoVar8.x0));
                                break;
                            case 6:
                                xo xoVar9 = this.b;
                                xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                break;
                            case 7:
                                xo xoVar10 = this.b;
                                xoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", xoVar10.C0);
                                xoVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                xo xoVar11 = this.b;
                                xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                break;
                            case 9:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                xo.Y(this.b);
                                break;
                            case 14:
                                xo xoVar12 = this.b;
                                org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                break;
                            case 15:
                                xo xoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -xoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new oo(xoVar13, 6);
                                    xoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                xo xoVar14 = this.b;
                                long j11 = xoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                lp lpVar = new lp(null);
                                lpVar.M = new ArrayList();
                                lpVar.N = new ArrayList();
                                lpVar.P = new ArrayList();
                                lpVar.c0 = true;
                                lpVar.f0 = new ArrayList();
                                lpVar.o0 = new HashMap();
                                lpVar.q0 = new ap(lpVar, 5);
                                lpVar.t0 = false;
                                lpVar.Z = j11;
                                lpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                lpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        lpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        lpVar.X(false);
                                    }
                                }
                                xoVar14.presentFragment(lpVar);
                                break;
                            case 17:
                                xo xoVar15 = this.b;
                                long j12 = xoVar15.w0;
                                xp xpVar = new xp(null);
                                xpVar.v = new ArrayList();
                                boolean z162 = false;
                                xpVar.O = false;
                                xpVar.P = false;
                                xpVar.E = j12;
                                TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                xpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                    z162 = true;
                                }
                                xpVar.s = z162;
                                xpVar.h = xoVar15.y0;
                                xoVar15.presentFragment(xpVar);
                                break;
                            case 18:
                                xo xoVar16 = this.b;
                                tw0 tw0Var = new tw0(xoVar16.w0);
                                tw0Var.v = new oo(xoVar16, 4);
                                xoVar16.presentFragment(tw0Var);
                                break;
                            case 19:
                                xo.Z(this.b);
                                break;
                            case 20:
                                xo xoVar17 = this.b;
                                t60 t60Var = new t60(-xoVar17.x0.id);
                                t60Var.c = xoVar17.L0;
                                t60Var.l0 = xoVar17;
                                xoVar17.presentFragment(t60Var);
                                break;
                            case 21:
                                xo xoVar18 = this.b;
                                xoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", xoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                vr vrVar3 = new vr(bundle4);
                                vrVar3.x0(xoVar18.y0);
                                xoVar18.presentFragment(vrVar3);
                                break;
                            case 22:
                                xo xoVar19 = this.b;
                                yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                xoVar19.presentFragment(yh0Var);
                                break;
                            case 23:
                                xo xoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                    xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", xoVar20.w0);
                                    eq eqVar = new eq(bundle5);
                                    eqVar.d = new ArrayList();
                                    eqVar.r = new ArrayList();
                                    eqVar.v = -1;
                                    eqVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    eqVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                    eqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (eqVar.a == null) {
                                            eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        eqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            eqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            eqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            eqVar.w = 1;
                                        }
                                    }
                                    xoVar20.presentFragment(eqVar);
                                    break;
                                }
                            default:
                                xo xoVar21 = this.b;
                                xoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", xoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                xoVar21.presentFragment(new co(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) {
                org.telegram.ui.Cells.r8 r8Var10 = new org.telegram.ui.Cells.r8(context);
                this.K = r8Var10;
                r8Var10.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.K.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.x5.n(-1, -2));
                final int i23 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ xo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                xo xoVar3 = this.b;
                                xoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                vr vrVar = new vr(bundle);
                                vrVar.x0(xoVar3.y0);
                                xoVar3.presentFragment(vrVar);
                                break;
                            case 1:
                                xo xoVar4 = this.b;
                                uo uoVar = xoVar4.Q0;
                                long j102 = xoVar4.C0;
                                if (!xoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                xo xoVar5 = this.b;
                                xoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", xoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                vr vrVar2 = new vr(bundle2);
                                vrVar2.x0(xoVar5.y0);
                                xoVar5.presentFragment(vrVar2);
                                break;
                            case 3:
                                xo xoVar6 = this.b;
                                xoVar6.presentFragment(new zh0(xoVar6.w0));
                                break;
                            case 4:
                                xo xoVar7 = this.b;
                                xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                break;
                            case 5:
                                xo xoVar8 = this.b;
                                xoVar8.getClass();
                                xoVar8.presentFragment(new ub(xoVar8.x0));
                                break;
                            case 6:
                                xo xoVar9 = this.b;
                                xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                break;
                            case 7:
                                xo xoVar10 = this.b;
                                xoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", xoVar10.C0);
                                xoVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                xo xoVar11 = this.b;
                                xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                break;
                            case 9:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                xo.Y(this.b);
                                break;
                            case 14:
                                xo xoVar12 = this.b;
                                org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                break;
                            case 15:
                                xo xoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -xoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new oo(xoVar13, 6);
                                    xoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                xo xoVar14 = this.b;
                                long j11 = xoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                lp lpVar = new lp(null);
                                lpVar.M = new ArrayList();
                                lpVar.N = new ArrayList();
                                lpVar.P = new ArrayList();
                                lpVar.c0 = true;
                                lpVar.f0 = new ArrayList();
                                lpVar.o0 = new HashMap();
                                lpVar.q0 = new ap(lpVar, 5);
                                lpVar.t0 = false;
                                lpVar.Z = j11;
                                lpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                lpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        lpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        lpVar.X(false);
                                    }
                                }
                                xoVar14.presentFragment(lpVar);
                                break;
                            case 17:
                                xo xoVar15 = this.b;
                                long j12 = xoVar15.w0;
                                xp xpVar = new xp(null);
                                xpVar.v = new ArrayList();
                                boolean z162 = false;
                                xpVar.O = false;
                                xpVar.P = false;
                                xpVar.E = j12;
                                TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                xpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                    z162 = true;
                                }
                                xpVar.s = z162;
                                xpVar.h = xoVar15.y0;
                                xoVar15.presentFragment(xpVar);
                                break;
                            case 18:
                                xo xoVar16 = this.b;
                                tw0 tw0Var = new tw0(xoVar16.w0);
                                tw0Var.v = new oo(xoVar16, 4);
                                xoVar16.presentFragment(tw0Var);
                                break;
                            case 19:
                                xo.Z(this.b);
                                break;
                            case 20:
                                xo xoVar17 = this.b;
                                t60 t60Var = new t60(-xoVar17.x0.id);
                                t60Var.c = xoVar17.L0;
                                t60Var.l0 = xoVar17;
                                xoVar17.presentFragment(t60Var);
                                break;
                            case 21:
                                xo xoVar18 = this.b;
                                xoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", xoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                vr vrVar3 = new vr(bundle4);
                                vrVar3.x0(xoVar18.y0);
                                xoVar18.presentFragment(vrVar3);
                                break;
                            case 22:
                                xo xoVar19 = this.b;
                                yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                xoVar19.presentFragment(yh0Var);
                                break;
                            case 23:
                                xo xoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                    xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", xoVar20.w0);
                                    eq eqVar = new eq(bundle5);
                                    eqVar.d = new ArrayList();
                                    eqVar.r = new ArrayList();
                                    eqVar.v = -1;
                                    eqVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    eqVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                    eqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (eqVar.a == null) {
                                            eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        eqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            eqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            eqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            eqVar.w = 1;
                                        }
                                    }
                                    xoVar20.presentFragment(eqVar);
                                    break;
                                }
                            default:
                                xo xoVar21 = this.b;
                                xoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", xoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                xoVar21.presentFragment(new co(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && ChatObject.canChangeChatInfo(this.x0)) {
                num = 1;
                z11 = true;
                j3 = j10;
                i10 = 5;
                charSequence = "";
                gp0 gp0Var = new gp0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.L = gp0Var;
                gp0Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                this.F.addView(this.L, w7.x5.n(-1, -2));
                final int i24 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ xo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                xo xoVar3 = this.b;
                                xoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                vr vrVar = new vr(bundle);
                                vrVar.x0(xoVar3.y0);
                                xoVar3.presentFragment(vrVar);
                                break;
                            case 1:
                                xo xoVar4 = this.b;
                                uo uoVar = xoVar4.Q0;
                                long j102 = xoVar4.C0;
                                if (!xoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                xo xoVar5 = this.b;
                                xoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", xoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                vr vrVar2 = new vr(bundle2);
                                vrVar2.x0(xoVar5.y0);
                                xoVar5.presentFragment(vrVar2);
                                break;
                            case 3:
                                xo xoVar6 = this.b;
                                xoVar6.presentFragment(new zh0(xoVar6.w0));
                                break;
                            case 4:
                                xo xoVar7 = this.b;
                                xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                break;
                            case 5:
                                xo xoVar8 = this.b;
                                xoVar8.getClass();
                                xoVar8.presentFragment(new ub(xoVar8.x0));
                                break;
                            case 6:
                                xo xoVar9 = this.b;
                                xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                break;
                            case 7:
                                xo xoVar10 = this.b;
                                xoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", xoVar10.C0);
                                xoVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                xo xoVar11 = this.b;
                                xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                break;
                            case 9:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                xo.Y(this.b);
                                break;
                            case 14:
                                xo xoVar12 = this.b;
                                org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                break;
                            case 15:
                                xo xoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -xoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new oo(xoVar13, 6);
                                    xoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                xo xoVar14 = this.b;
                                long j11 = xoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                lp lpVar = new lp(null);
                                lpVar.M = new ArrayList();
                                lpVar.N = new ArrayList();
                                lpVar.P = new ArrayList();
                                lpVar.c0 = true;
                                lpVar.f0 = new ArrayList();
                                lpVar.o0 = new HashMap();
                                lpVar.q0 = new ap(lpVar, 5);
                                lpVar.t0 = false;
                                lpVar.Z = j11;
                                lpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                lpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        lpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        lpVar.X(false);
                                    }
                                }
                                xoVar14.presentFragment(lpVar);
                                break;
                            case 17:
                                xo xoVar15 = this.b;
                                long j12 = xoVar15.w0;
                                xp xpVar = new xp(null);
                                xpVar.v = new ArrayList();
                                boolean z162 = false;
                                xpVar.O = false;
                                xpVar.P = false;
                                xpVar.E = j12;
                                TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                xpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                    z162 = true;
                                }
                                xpVar.s = z162;
                                xpVar.h = xoVar15.y0;
                                xoVar15.presentFragment(xpVar);
                                break;
                            case 18:
                                xo xoVar16 = this.b;
                                tw0 tw0Var = new tw0(xoVar16.w0);
                                tw0Var.v = new oo(xoVar16, 4);
                                xoVar16.presentFragment(tw0Var);
                                break;
                            case 19:
                                xo.Z(this.b);
                                break;
                            case 20:
                                xo xoVar17 = this.b;
                                t60 t60Var = new t60(-xoVar17.x0.id);
                                t60Var.c = xoVar17.L0;
                                t60Var.l0 = xoVar17;
                                xoVar17.presentFragment(t60Var);
                                break;
                            case 21:
                                xo xoVar18 = this.b;
                                xoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", xoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                vr vrVar3 = new vr(bundle4);
                                vrVar3.x0(xoVar18.y0);
                                xoVar18.presentFragment(vrVar3);
                                break;
                            case 22:
                                xo xoVar19 = this.b;
                                yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                xoVar19.presentFragment(yh0Var);
                                break;
                            case 23:
                                xo xoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                    xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", xoVar20.w0);
                                    eq eqVar = new eq(bundle5);
                                    eqVar.d = new ArrayList();
                                    eqVar.r = new ArrayList();
                                    eqVar.v = -1;
                                    eqVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    eqVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                    eqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (eqVar.a == null) {
                                            eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        eqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            eqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            eqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            eqVar.w = 1;
                                        }
                                    }
                                    xoVar20.presentFragment(eqVar);
                                    break;
                                }
                            default:
                                xo xoVar21 = this.b;
                                xoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", xoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                xoVar21.presentFragment(new co(bundle6));
                                break;
                        }
                    }
                });
            } else {
                charSequence = "";
                j3 = j10;
                num = 1;
                i10 = 5;
                z11 = true;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.x0) || ChatObject.isCommunity(this.x0)) {
                context3 = context;
                frameLayout = frameLayout2;
                idVar = idVar2;
                xoVar = this;
            } else {
                long j11 = -this.x0.id;
                idVar = idVar2;
                org.telegram.ui.Cells.r8 r8Var11 = new org.telegram.ui.Cells.r8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.M = r8Var11;
                r8Var11.setBackground(org.telegram.ui.ActionBar.j6.K0(z11));
                this.M.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.x0.autotranslation);
                getMessagesController().getBoostsController().getBoostsStats(j11, new e2.h(this) { // from class: org.telegram.ui.mo
                    public final /* synthetic */ xo b;

                    {
                        this.b = this;
                    }

                    @Override // e2.h
                    public final void accept(Object obj) {
                        switch (i16) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                xo xoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    xoVar3.getClass();
                                    break;
                                } else {
                                    xoVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < xoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, w7.x5.n(-1, -2));
                frameLayout = frameLayout2;
                xoVar = this;
                this.M.setOnClickListener(new io(this, new boolean[]{false}, j11, 0));
            }
            if (!xoVar.I0 && ChatObject.canBlockUsers(xoVar.x0) && (ChatObject.isChannel(xoVar.x0) || xoVar.x0.creator)) {
                org.telegram.ui.Cells.r8 r8Var12 = new org.telegram.ui.Cells.r8(context3);
                xoVar.N = r8Var12;
                r8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
                xoVar.F.addView(xoVar.N, w7.x5.n(-1, -2));
                xoVar.N.setOnClickListener(new rf(i10, xoVar, context3));
            }
            if (ChatObject.isMegagroup(xoVar.x0) && ChatObject.hasAdminRights(xoVar.x0) && !ChatObject.isCommunity(xoVar.x0)) {
                final int i25 = 1;
                MessagesController.getInstance(xoVar.currentAccount).getBoostsController().getBoostsStats(-xoVar.x0.id, new e2.h(xoVar) { // from class: org.telegram.ui.mo
                    public final /* synthetic */ xo b;

                    {
                        this.b = xoVar;
                    }

                    @Override // e2.h
                    public final void accept(Object obj) {
                        switch (i25) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                xo xoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    xoVar3.getClass();
                                    break;
                                } else {
                                    xoVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < xoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                gp0 gp0Var2 = new gp0(xoVar.currentAccount, -xoVar.x0.id, context3, xoVar.getResourceProvider());
                xoVar.L = gp0Var2;
                gp0Var2.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                xoVar.F.addView(xoVar.L, w7.x5.n(-1, -2));
                final int i26 = 20;
                xoVar.L.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ xo b;

                    {
                        this.b = xoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                xo xoVar3 = this.b;
                                xoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xoVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                vr vrVar = new vr(bundle);
                                vrVar.x0(xoVar3.y0);
                                xoVar3.presentFragment(vrVar);
                                break;
                            case 1:
                                xo xoVar4 = this.b;
                                uo uoVar = xoVar4.Q0;
                                long j102 = xoVar4.C0;
                                if (!xoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, xoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                xo xoVar5 = this.b;
                                xoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", xoVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                vr vrVar2 = new vr(bundle2);
                                vrVar2.x0(xoVar5.y0);
                                xoVar5.presentFragment(vrVar2);
                                break;
                            case 3:
                                xo xoVar6 = this.b;
                                xoVar6.presentFragment(new zh0(xoVar6.w0));
                                break;
                            case 4:
                                xo xoVar7 = this.b;
                                xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                break;
                            case 5:
                                xo xoVar8 = this.b;
                                xoVar8.getClass();
                                xoVar8.presentFragment(new ub(xoVar8.x0));
                                break;
                            case 6:
                                xo xoVar9 = this.b;
                                xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                break;
                            case 7:
                                xo xoVar10 = this.b;
                                xoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", xoVar10.C0);
                                xoVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                xo xoVar11 = this.b;
                                xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                break;
                            case 9:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                xo.Y(this.b);
                                break;
                            case 14:
                                xo xoVar12 = this.b;
                                org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                break;
                            case 15:
                                xo xoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                    id0 id0Var = new id0(4);
                                    id0Var.e0 = -xoVar13.w0;
                                    TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    id0Var.F0 = new oo(xoVar13, 6);
                                    xoVar13.presentFragment(id0Var);
                                    break;
                                }
                                break;
                            case 16:
                                xo xoVar14 = this.b;
                                long j112 = xoVar14.w0;
                                org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                lp lpVar = new lp(null);
                                lpVar.M = new ArrayList();
                                lpVar.N = new ArrayList();
                                lpVar.P = new ArrayList();
                                lpVar.c0 = true;
                                lpVar.f0 = new ArrayList();
                                lpVar.o0 = new HashMap();
                                lpVar.q0 = new ap(lpVar, 5);
                                lpVar.t0 = false;
                                lpVar.Z = j112;
                                lpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                lpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        lpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        lpVar.X(false);
                                    }
                                }
                                xoVar14.presentFragment(lpVar);
                                break;
                            case 17:
                                xo xoVar15 = this.b;
                                long j12 = xoVar15.w0;
                                xp xpVar = new xp(null);
                                xpVar.v = new ArrayList();
                                boolean z162 = false;
                                xpVar.O = false;
                                xpVar.P = false;
                                xpVar.E = j12;
                                TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                xpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                    z162 = true;
                                }
                                xpVar.s = z162;
                                xpVar.h = xoVar15.y0;
                                xoVar15.presentFragment(xpVar);
                                break;
                            case 18:
                                xo xoVar16 = this.b;
                                tw0 tw0Var = new tw0(xoVar16.w0);
                                tw0Var.v = new oo(xoVar16, 4);
                                xoVar16.presentFragment(tw0Var);
                                break;
                            case 19:
                                xo.Z(this.b);
                                break;
                            case 20:
                                xo xoVar17 = this.b;
                                t60 t60Var = new t60(-xoVar17.x0.id);
                                t60Var.c = xoVar17.L0;
                                t60Var.l0 = xoVar17;
                                xoVar17.presentFragment(t60Var);
                                break;
                            case 21:
                                xo xoVar18 = this.b;
                                xoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", xoVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                vr vrVar3 = new vr(bundle4);
                                vrVar3.x0(xoVar18.y0);
                                xoVar18.presentFragment(vrVar3);
                                break;
                            case 22:
                                xo xoVar19 = this.b;
                                yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                xoVar19.presentFragment(yh0Var);
                                break;
                            case 23:
                                xo xoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                    xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", xoVar20.w0);
                                    eq eqVar = new eq(bundle5);
                                    eqVar.d = new ArrayList();
                                    eqVar.r = new ArrayList();
                                    eqVar.v = -1;
                                    eqVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    eqVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                    eqVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (eqVar.a == null) {
                                            eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        eqVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            eqVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            eqVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            eqVar.w = 1;
                                        }
                                    }
                                    xoVar20.presentFragment(eqVar);
                                    break;
                                }
                            default:
                                xo xoVar21 = this.b;
                                xoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", xoVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                xoVar21.presentFragment(new co(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!xoVar.I0 && xoVar.x0.creator) {
                org.telegram.ui.Cells.r8 r8Var13 = new org.telegram.ui.Cells.r8(23, context, null, false, true);
                context2 = context;
                xoVar.Q = r8Var13;
                r8Var13.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
                xoVar.Q.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), xoVar.F0);
                xoVar.Q.getCheckBox().setIcon(xoVar.G0 ? 0 : R.drawable.permission_locked);
                xoVar.F.addView(xoVar.Q, w7.x5.c(-2.0f, -1));
                xoVar.Q.setOnClickListener(new rf(6, xoVar, frameLayout));
            } else {
                context2 = context;
            }
            xoVar.o0();
        } else {
            charSequence = "";
            j3 = j10;
            num = 1;
            idVar = idVar2;
            i10 = 5;
            xoVar = this;
            context2 = context;
        }
        org.telegram.ui.ActionBar.z n10 = xoVar.actionBar.n();
        if (xoVar.D0 != null || ChatObject.canChangeChatInfo(xoVar.x0) || xoVar.N != null) {
            org.telegram.ui.ActionBar.v0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            xoVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (xoVar.H == null && xoVar.N == null && xoVar.I == null && xoVar.J == null && xoVar.Q == null) {
            i11 = 12;
        } else {
            i11 = 12;
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context2, 12, xoVar.resourceProvider);
            xoVar.P = e9Var;
            if (xoVar.Q != null) {
                e9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                e9Var.setFixedSize(12);
            }
            ydVar.addView(xoVar.P, w7.x5.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        xoVar.R = linearLayout4;
        linearLayout4.setOrientation(1);
        ydVar.addView(xoVar.R, w7.x5.n(-1, -2));
        final int i27 = 8;
        if (xoVar.x0 != null) {
            org.telegram.ui.Cells.r8 r8Var14 = new org.telegram.ui.Cells.r8(context2);
            xoVar.X = r8Var14;
            r8Var14.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            org.telegram.ui.Cells.r8 r8Var15 = xoVar.X;
            if (!ChatObject.isChannel(xoVar.x0)) {
                TLRPC.Chat chat5 = xoVar.x0;
                if (!chat5.creator && (!ChatObject.hasAdminRights(chat5) || !ChatObject.canChangeChatInfo(xoVar.x0))) {
                    i14 = 8;
                    r8Var15.setVisibility(i14);
                    final int i28 = 21;
                    xoVar.X.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i28) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j12 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j12;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var16 = new org.telegram.ui.Cells.r8(context2);
                    xoVar.V = r8Var16;
                    r8Var16.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i29 = 22;
                    xoVar.V.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j12 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j12;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var17 = new org.telegram.ui.Cells.r8(context2);
                    xoVar.O = r8Var17;
                    r8Var17.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i30 = 23;
                    xoVar.O.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j12 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j12;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(xoVar.x0, 28)) {
                        org.telegram.ui.Cells.r8 r8Var18 = new org.telegram.ui.Cells.r8(context2);
                        xoVar.f0 = r8Var18;
                        r8Var18.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i31 = 24;
                        xoVar.f0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                            public final /* synthetic */ xo b;

                            {
                                this.b = xoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i31) {
                                    case 0:
                                        xo xoVar3 = this.b;
                                        xoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", xoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        vr vrVar = new vr(bundle);
                                        vrVar.x0(xoVar3.y0);
                                        xoVar3.presentFragment(vrVar);
                                        break;
                                    case 1:
                                        xo xoVar4 = this.b;
                                        uo uoVar = xoVar4.Q0;
                                        long j102 = xoVar4.C0;
                                        if (!xoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        xo xoVar5 = this.b;
                                        xoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", xoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        vr vrVar2 = new vr(bundle2);
                                        vrVar2.x0(xoVar5.y0);
                                        xoVar5.presentFragment(vrVar2);
                                        break;
                                    case 3:
                                        xo xoVar6 = this.b;
                                        xoVar6.presentFragment(new zh0(xoVar6.w0));
                                        break;
                                    case 4:
                                        xo xoVar7 = this.b;
                                        xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                        break;
                                    case 5:
                                        xo xoVar8 = this.b;
                                        xoVar8.getClass();
                                        xoVar8.presentFragment(new ub(xoVar8.x0));
                                        break;
                                    case 6:
                                        xo xoVar9 = this.b;
                                        xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                        break;
                                    case 7:
                                        xo xoVar10 = this.b;
                                        xoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", xoVar10.C0);
                                        xoVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        xo xoVar11 = this.b;
                                        xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                        break;
                                    case 9:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        xo.Y(this.b);
                                        break;
                                    case 14:
                                        xo xoVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                        break;
                                    case 15:
                                        xo xoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -xoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new oo(xoVar13, 6);
                                            xoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        xo xoVar14 = this.b;
                                        long j112 = xoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        lp lpVar = new lp(null);
                                        lpVar.M = new ArrayList();
                                        lpVar.N = new ArrayList();
                                        lpVar.P = new ArrayList();
                                        lpVar.c0 = true;
                                        lpVar.f0 = new ArrayList();
                                        lpVar.o0 = new HashMap();
                                        lpVar.q0 = new ap(lpVar, 5);
                                        lpVar.t0 = false;
                                        lpVar.Z = j112;
                                        lpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                        lpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                lpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                lpVar.X(false);
                                            }
                                        }
                                        xoVar14.presentFragment(lpVar);
                                        break;
                                    case 17:
                                        xo xoVar15 = this.b;
                                        long j12 = xoVar15.w0;
                                        xp xpVar = new xp(null);
                                        xpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        xpVar.O = false;
                                        xpVar.P = false;
                                        xpVar.E = j12;
                                        TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        xpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        xpVar.s = z162;
                                        xpVar.h = xoVar15.y0;
                                        xoVar15.presentFragment(xpVar);
                                        break;
                                    case 18:
                                        xo xoVar16 = this.b;
                                        tw0 tw0Var = new tw0(xoVar16.w0);
                                        tw0Var.v = new oo(xoVar16, 4);
                                        xoVar16.presentFragment(tw0Var);
                                        break;
                                    case 19:
                                        xo.Z(this.b);
                                        break;
                                    case 20:
                                        xo xoVar17 = this.b;
                                        t60 t60Var = new t60(-xoVar17.x0.id);
                                        t60Var.c = xoVar17.L0;
                                        t60Var.l0 = xoVar17;
                                        xoVar17.presentFragment(t60Var);
                                        break;
                                    case 21:
                                        xo xoVar18 = this.b;
                                        xoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", xoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                        vr vrVar3 = new vr(bundle4);
                                        vrVar3.x0(xoVar18.y0);
                                        xoVar18.presentFragment(vrVar3);
                                        break;
                                    case 22:
                                        xo xoVar19 = this.b;
                                        yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                        yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        xoVar19.presentFragment(yh0Var);
                                        break;
                                    case 23:
                                        xo xoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                            xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", xoVar20.w0);
                                            eq eqVar = new eq(bundle5);
                                            eqVar.d = new ArrayList();
                                            eqVar.r = new ArrayList();
                                            eqVar.v = -1;
                                            eqVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            eqVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                            eqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (eqVar.a == null) {
                                                    eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                eqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    eqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    eqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    eqVar.w = 1;
                                                }
                                            }
                                            xoVar20.presentFragment(eqVar);
                                            break;
                                        }
                                    default:
                                        xo xoVar21 = this.b;
                                        xoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", xoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                        xoVar21.presentFragment(new co(bundle6));
                                        break;
                                }
                            }
                        });
                        xoVar.f0();
                    }
                    org.telegram.ui.Cells.r8 r8Var19 = new org.telegram.ui.Cells.r8(context2);
                    xoVar.W = r8Var19;
                    r8Var19.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    xoVar.W.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j12 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j12;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var20 = new org.telegram.ui.Cells.r8(context2);
                    xoVar.T = r8Var20;
                    r8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i32 = 2;
                    xoVar.T.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j12 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j12;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.isChannelAndNotMegaGroup(xoVar.x0)) {
                        org.telegram.ui.Cells.r8 r8Var21 = new org.telegram.ui.Cells.r8(context2);
                        xoVar.U = r8Var21;
                        r8Var21.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        i12 = 3;
                        xoVar.U.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                            public final /* synthetic */ xo b;

                            {
                                this.b = xoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i12) {
                                    case 0:
                                        xo xoVar3 = this.b;
                                        xoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", xoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        vr vrVar = new vr(bundle);
                                        vrVar.x0(xoVar3.y0);
                                        xoVar3.presentFragment(vrVar);
                                        break;
                                    case 1:
                                        xo xoVar4 = this.b;
                                        uo uoVar = xoVar4.Q0;
                                        long j102 = xoVar4.C0;
                                        if (!xoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        xo xoVar5 = this.b;
                                        xoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", xoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        vr vrVar2 = new vr(bundle2);
                                        vrVar2.x0(xoVar5.y0);
                                        xoVar5.presentFragment(vrVar2);
                                        break;
                                    case 3:
                                        xo xoVar6 = this.b;
                                        xoVar6.presentFragment(new zh0(xoVar6.w0));
                                        break;
                                    case 4:
                                        xo xoVar7 = this.b;
                                        xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                        break;
                                    case 5:
                                        xo xoVar8 = this.b;
                                        xoVar8.getClass();
                                        xoVar8.presentFragment(new ub(xoVar8.x0));
                                        break;
                                    case 6:
                                        xo xoVar9 = this.b;
                                        xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                        break;
                                    case 7:
                                        xo xoVar10 = this.b;
                                        xoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", xoVar10.C0);
                                        xoVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        xo xoVar11 = this.b;
                                        xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                        break;
                                    case 9:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        xo.Y(this.b);
                                        break;
                                    case 14:
                                        xo xoVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                        break;
                                    case 15:
                                        xo xoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -xoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new oo(xoVar13, 6);
                                            xoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        xo xoVar14 = this.b;
                                        long j112 = xoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        lp lpVar = new lp(null);
                                        lpVar.M = new ArrayList();
                                        lpVar.N = new ArrayList();
                                        lpVar.P = new ArrayList();
                                        lpVar.c0 = true;
                                        lpVar.f0 = new ArrayList();
                                        lpVar.o0 = new HashMap();
                                        lpVar.q0 = new ap(lpVar, 5);
                                        lpVar.t0 = false;
                                        lpVar.Z = j112;
                                        lpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                        lpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                lpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                lpVar.X(false);
                                            }
                                        }
                                        xoVar14.presentFragment(lpVar);
                                        break;
                                    case 17:
                                        xo xoVar15 = this.b;
                                        long j12 = xoVar15.w0;
                                        xp xpVar = new xp(null);
                                        xpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        xpVar.O = false;
                                        xpVar.P = false;
                                        xpVar.E = j12;
                                        TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        xpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        xpVar.s = z162;
                                        xpVar.h = xoVar15.y0;
                                        xoVar15.presentFragment(xpVar);
                                        break;
                                    case 18:
                                        xo xoVar16 = this.b;
                                        tw0 tw0Var = new tw0(xoVar16.w0);
                                        tw0Var.v = new oo(xoVar16, 4);
                                        xoVar16.presentFragment(tw0Var);
                                        break;
                                    case 19:
                                        xo.Z(this.b);
                                        break;
                                    case 20:
                                        xo xoVar17 = this.b;
                                        t60 t60Var = new t60(-xoVar17.x0.id);
                                        t60Var.c = xoVar17.L0;
                                        t60Var.l0 = xoVar17;
                                        xoVar17.presentFragment(t60Var);
                                        break;
                                    case 21:
                                        xo xoVar18 = this.b;
                                        xoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", xoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                        vr vrVar3 = new vr(bundle4);
                                        vrVar3.x0(xoVar18.y0);
                                        xoVar18.presentFragment(vrVar3);
                                        break;
                                    case 22:
                                        xo xoVar19 = this.b;
                                        yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                        yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        xoVar19.presentFragment(yh0Var);
                                        break;
                                    case 23:
                                        xo xoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                            xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", xoVar20.w0);
                                            eq eqVar = new eq(bundle5);
                                            eqVar.d = new ArrayList();
                                            eqVar.r = new ArrayList();
                                            eqVar.v = -1;
                                            eqVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            eqVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                            eqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (eqVar.a == null) {
                                                    eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                eqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    eqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    eqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    eqVar.w = 1;
                                                }
                                            }
                                            xoVar20.presentFragment(eqVar);
                                            break;
                                        }
                                    default:
                                        xo xoVar21 = this.b;
                                        xoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", xoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                        xoVar21.presentFragment(new co(bundle6));
                                        break;
                                }
                            }
                        });
                    } else {
                        i12 = 3;
                    }
                    org.telegram.ui.Cells.r8 r8Var22 = new org.telegram.ui.Cells.r8(context2);
                    xoVar.Z = r8Var22;
                    r8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    xoVar.Z.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    final int i33 = 4;
                    xoVar.Z.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j12 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j12;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    xoVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(xoVar.x0) || xoVar.x0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var23 = new org.telegram.ui.Cells.r8(context2);
                        xoVar.Y = r8Var23;
                        r8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        xoVar.Y.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        xoVar.Y.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                            public final /* synthetic */ xo b;

                            {
                                this.b = xoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        xo xoVar3 = this.b;
                                        xoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", xoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        vr vrVar = new vr(bundle);
                                        vrVar.x0(xoVar3.y0);
                                        xoVar3.presentFragment(vrVar);
                                        break;
                                    case 1:
                                        xo xoVar4 = this.b;
                                        uo uoVar = xoVar4.Q0;
                                        long j102 = xoVar4.C0;
                                        if (!xoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        xo xoVar5 = this.b;
                                        xoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", xoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        vr vrVar2 = new vr(bundle2);
                                        vrVar2.x0(xoVar5.y0);
                                        xoVar5.presentFragment(vrVar2);
                                        break;
                                    case 3:
                                        xo xoVar6 = this.b;
                                        xoVar6.presentFragment(new zh0(xoVar6.w0));
                                        break;
                                    case 4:
                                        xo xoVar7 = this.b;
                                        xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                        break;
                                    case 5:
                                        xo xoVar8 = this.b;
                                        xoVar8.getClass();
                                        xoVar8.presentFragment(new ub(xoVar8.x0));
                                        break;
                                    case 6:
                                        xo xoVar9 = this.b;
                                        xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                        break;
                                    case 7:
                                        xo xoVar10 = this.b;
                                        xoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", xoVar10.C0);
                                        xoVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        xo xoVar11 = this.b;
                                        xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                        break;
                                    case 9:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        xo.Y(this.b);
                                        break;
                                    case 14:
                                        xo xoVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                        break;
                                    case 15:
                                        xo xoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -xoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new oo(xoVar13, 6);
                                            xoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        xo xoVar14 = this.b;
                                        long j112 = xoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        lp lpVar = new lp(null);
                                        lpVar.M = new ArrayList();
                                        lpVar.N = new ArrayList();
                                        lpVar.P = new ArrayList();
                                        lpVar.c0 = true;
                                        lpVar.f0 = new ArrayList();
                                        lpVar.o0 = new HashMap();
                                        lpVar.q0 = new ap(lpVar, 5);
                                        lpVar.t0 = false;
                                        lpVar.Z = j112;
                                        lpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                        lpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                lpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                lpVar.X(false);
                                            }
                                        }
                                        xoVar14.presentFragment(lpVar);
                                        break;
                                    case 17:
                                        xo xoVar15 = this.b;
                                        long j12 = xoVar15.w0;
                                        xp xpVar = new xp(null);
                                        xpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        xpVar.O = false;
                                        xpVar.P = false;
                                        xpVar.E = j12;
                                        TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        xpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        xpVar.s = z162;
                                        xpVar.h = xoVar15.y0;
                                        xoVar15.presentFragment(xpVar);
                                        break;
                                    case 18:
                                        xo xoVar16 = this.b;
                                        tw0 tw0Var = new tw0(xoVar16.w0);
                                        tw0Var.v = new oo(xoVar16, 4);
                                        xoVar16.presentFragment(tw0Var);
                                        break;
                                    case 19:
                                        xo.Z(this.b);
                                        break;
                                    case 20:
                                        xo xoVar17 = this.b;
                                        t60 t60Var = new t60(-xoVar17.x0.id);
                                        t60Var.c = xoVar17.L0;
                                        t60Var.l0 = xoVar17;
                                        xoVar17.presentFragment(t60Var);
                                        break;
                                    case 21:
                                        xo xoVar18 = this.b;
                                        xoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", xoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                        vr vrVar3 = new vr(bundle4);
                                        vrVar3.x0(xoVar18.y0);
                                        xoVar18.presentFragment(vrVar3);
                                        break;
                                    case 22:
                                        xo xoVar19 = this.b;
                                        yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                        yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        xoVar19.presentFragment(yh0Var);
                                        break;
                                    case 23:
                                        xo xoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                            xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", xoVar20.w0);
                                            eq eqVar = new eq(bundle5);
                                            eqVar.d = new ArrayList();
                                            eqVar.r = new ArrayList();
                                            eqVar.v = -1;
                                            eqVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            eqVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                            eqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (eqVar.a == null) {
                                                    eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                eqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    eqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    eqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    eqVar.w = 1;
                                                }
                                            }
                                            xoVar20.presentFragment(eqVar);
                                            break;
                                        }
                                    default:
                                        xo xoVar21 = this.b;
                                        xoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", xoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                        xoVar21.presentFragment(new co(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(xoVar.x0)) {
                        org.telegram.ui.Cells.r8 r8Var24 = new org.telegram.ui.Cells.r8(context2);
                        xoVar.a0 = r8Var24;
                        r8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        xoVar.a0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        final int i34 = 6;
                        xoVar.a0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                            public final /* synthetic */ xo b;

                            {
                                this.b = xoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i34) {
                                    case 0:
                                        xo xoVar3 = this.b;
                                        xoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", xoVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        vr vrVar = new vr(bundle);
                                        vrVar.x0(xoVar3.y0);
                                        xoVar3.presentFragment(vrVar);
                                        break;
                                    case 1:
                                        xo xoVar4 = this.b;
                                        uo uoVar = xoVar4.Q0;
                                        long j102 = xoVar4.C0;
                                        if (!xoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, xoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        xo xoVar5 = this.b;
                                        xoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", xoVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        vr vrVar2 = new vr(bundle2);
                                        vrVar2.x0(xoVar5.y0);
                                        xoVar5.presentFragment(vrVar2);
                                        break;
                                    case 3:
                                        xo xoVar6 = this.b;
                                        xoVar6.presentFragment(new zh0(xoVar6.w0));
                                        break;
                                    case 4:
                                        xo xoVar7 = this.b;
                                        xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                        break;
                                    case 5:
                                        xo xoVar8 = this.b;
                                        xoVar8.getClass();
                                        xoVar8.presentFragment(new ub(xoVar8.x0));
                                        break;
                                    case 6:
                                        xo xoVar9 = this.b;
                                        xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                        break;
                                    case 7:
                                        xo xoVar10 = this.b;
                                        xoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", xoVar10.C0);
                                        xoVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        xo xoVar11 = this.b;
                                        xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                        break;
                                    case 9:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        xo.Y(this.b);
                                        break;
                                    case 14:
                                        xo xoVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                        break;
                                    case 15:
                                        xo xoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                            id0 id0Var = new id0(4);
                                            id0Var.e0 = -xoVar13.w0;
                                            TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            id0Var.F0 = new oo(xoVar13, 6);
                                            xoVar13.presentFragment(id0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        xo xoVar14 = this.b;
                                        long j112 = xoVar14.w0;
                                        org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                        boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        lp lpVar = new lp(null);
                                        lpVar.M = new ArrayList();
                                        lpVar.N = new ArrayList();
                                        lpVar.P = new ArrayList();
                                        lpVar.c0 = true;
                                        lpVar.f0 = new ArrayList();
                                        lpVar.o0 = new HashMap();
                                        lpVar.q0 = new ap(lpVar, 5);
                                        lpVar.t0 = false;
                                        lpVar.Z = j112;
                                        lpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                        lpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                lpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                lpVar.X(false);
                                            }
                                        }
                                        xoVar14.presentFragment(lpVar);
                                        break;
                                    case 17:
                                        xo xoVar15 = this.b;
                                        long j12 = xoVar15.w0;
                                        xp xpVar = new xp(null);
                                        xpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        xpVar.O = false;
                                        xpVar.P = false;
                                        xpVar.E = j12;
                                        TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        xpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        xpVar.s = z162;
                                        xpVar.h = xoVar15.y0;
                                        xoVar15.presentFragment(xpVar);
                                        break;
                                    case 18:
                                        xo xoVar16 = this.b;
                                        tw0 tw0Var = new tw0(xoVar16.w0);
                                        tw0Var.v = new oo(xoVar16, 4);
                                        xoVar16.presentFragment(tw0Var);
                                        break;
                                    case 19:
                                        xo.Z(this.b);
                                        break;
                                    case 20:
                                        xo xoVar17 = this.b;
                                        t60 t60Var = new t60(-xoVar17.x0.id);
                                        t60Var.c = xoVar17.L0;
                                        t60Var.l0 = xoVar17;
                                        xoVar17.presentFragment(t60Var);
                                        break;
                                    case 21:
                                        xo xoVar18 = this.b;
                                        xoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", xoVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                        vr vrVar3 = new vr(bundle4);
                                        vrVar3.x0(xoVar18.y0);
                                        xoVar18.presentFragment(vrVar3);
                                        break;
                                    case 22:
                                        xo xoVar19 = this.b;
                                        yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                        yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        xoVar19.presentFragment(yh0Var);
                                        break;
                                    case 23:
                                        xo xoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                            xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", xoVar20.w0);
                                            eq eqVar = new eq(bundle5);
                                            eqVar.d = new ArrayList();
                                            eqVar.r = new ArrayList();
                                            eqVar.v = -1;
                                            eqVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            eqVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                            eqVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (eqVar.a == null) {
                                                    eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                eqVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    eqVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    eqVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    eqVar.w = 1;
                                                }
                                            }
                                            xoVar20.presentFragment(eqVar);
                                            break;
                                        }
                                    default:
                                        xo xoVar21 = this.b;
                                        xoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", xoVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                        xoVar21.presentFragment(new co(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    xoVar.R.addView(xoVar.O, w7.x5.n(-1, -2));
                    r8Var = xoVar.f0;
                    if (r8Var != null) {
                        xoVar.R.addView(r8Var, w7.x5.n(-1, -2));
                    }
                    if (!xoVar.I0 && !xoVar.x0.gigagroup) {
                        xoVar.R.addView(xoVar.X, w7.x5.n(-1, -2));
                    }
                    if (!xoVar.I0) {
                        xoVar.R.addView(xoVar.V, w7.x5.n(-1, -2));
                    }
                    xoVar.R.addView(xoVar.W, w7.x5.n(-1, -2));
                    xoVar.R.addView(xoVar.T, w7.x5.n(-1, -2));
                    r8Var2 = xoVar.U;
                    if (r8Var2 != null && (chatFull2 = xoVar.y0) != null && chatFull2.requests_pending > 0) {
                        xoVar.R.addView(r8Var2, w7.x5.n(-1, -2));
                    }
                    if (xoVar.I0) {
                        xoVar.R.addView(xoVar.V, w7.x5.n(-1, -2));
                    }
                    if (!xoVar.I0 || xoVar.x0.gigagroup) {
                        xoVar.R.addView(xoVar.X, w7.x5.n(-1, -2));
                    }
                    r8Var3 = xoVar.a0;
                    if (r8Var3 != null) {
                        xoVar.R.addView(r8Var3, w7.x5.n(-1, -2));
                    }
                    r8Var4 = xoVar.Y;
                    if (r8Var4 != null) {
                        xoVar.R.addView(r8Var4, w7.x5.n(-1, -2));
                    }
                    r8Var5 = xoVar.Z;
                    if (r8Var5 != null) {
                        xoVar.R.addView(r8Var5, w7.x5.n(-1, -2));
                    }
                    if (xoVar.Z != null && xoVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(xoVar.x0)) {
                        xoVar.Z.setVisibility(0);
                    }
                    r8Var6 = xoVar.Y;
                    if (r8Var6 != null) {
                        org.telegram.ui.Cells.r8 r8Var25 = xoVar.Z;
                        r8Var6.setNeedDivider(r8Var25 != null && r8Var25.getVisibility() == 0);
                    }
                }
            }
            i14 = 0;
            r8Var15.setVisibility(i14);
            final int i282 = 21;
            xoVar.X.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i282) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var162 = new org.telegram.ui.Cells.r8(context2);
            xoVar.V = r8Var162;
            r8Var162.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i292 = 22;
            xoVar.V.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var172 = new org.telegram.ui.Cells.r8(context2);
            xoVar.O = r8Var172;
            r8Var172.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i302 = 23;
            xoVar.O.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i302) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(xoVar.x0, 28)) {
            }
            org.telegram.ui.Cells.r8 r8Var192 = new org.telegram.ui.Cells.r8(context2);
            xoVar.W = r8Var192;
            r8Var192.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.W.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var202 = new org.telegram.ui.Cells.r8(context2);
            xoVar.T = r8Var202;
            r8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            final int i322 = 2;
            xoVar.T.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isChannelAndNotMegaGroup(xoVar.x0)) {
            }
            org.telegram.ui.Cells.r8 r8Var222 = new org.telegram.ui.Cells.r8(context2);
            xoVar.Z = r8Var222;
            r8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            xoVar.Z.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            final int i332 = 4;
            xoVar.Z.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            xoVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(xoVar.x0)) {
            }
            org.telegram.ui.Cells.r8 r8Var232 = new org.telegram.ui.Cells.r8(context2);
            xoVar.Y = r8Var232;
            r8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            xoVar.Y.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.Y.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(xoVar.x0)) {
            }
            xoVar.R.addView(xoVar.O, w7.x5.n(-1, -2));
            r8Var = xoVar.f0;
            if (r8Var != null) {
            }
            if (!xoVar.I0) {
                xoVar.R.addView(xoVar.X, w7.x5.n(-1, -2));
            }
            if (!xoVar.I0) {
            }
            xoVar.R.addView(xoVar.W, w7.x5.n(-1, -2));
            xoVar.R.addView(xoVar.T, w7.x5.n(-1, -2));
            r8Var2 = xoVar.U;
            if (r8Var2 != null) {
                xoVar.R.addView(r8Var2, w7.x5.n(-1, -2));
            }
            if (xoVar.I0) {
            }
            if (!xoVar.I0) {
            }
            xoVar.R.addView(xoVar.X, w7.x5.n(-1, -2));
            r8Var3 = xoVar.a0;
            if (r8Var3 != null) {
            }
            r8Var4 = xoVar.Y;
            if (r8Var4 != null) {
            }
            r8Var5 = xoVar.Z;
            if (r8Var5 != null) {
            }
            if (xoVar.Z != null) {
                xoVar.Z.setVisibility(0);
            }
            r8Var6 = xoVar.Y;
            if (r8Var6 != null) {
            }
        } else {
            i12 = 3;
        }
        if (xoVar.D0 != null) {
            org.telegram.ui.Cells.r8 r8Var26 = new org.telegram.ui.Cells.r8(context2);
            xoVar.l0 = r8Var26;
            r8Var26.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.l0.setPrioritizeTitleOverValue(true);
            xoVar.R.addView(xoVar.l0, w7.x5.n(-1, -2));
            final int i35 = 7;
            xoVar.l0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i35) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            xoVar.r0();
            org.telegram.ui.Cells.r8 r8Var27 = new org.telegram.ui.Cells.r8(context2);
            xoVar.o0 = r8Var27;
            r8Var27.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.o0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), charSequence, R.drawable.msg_shareout, true);
            xoVar.R.addView(xoVar.o0, w7.x5.n(-1, -2));
            xoVar.o0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i27) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            xoVar.o0.f(45, xoVar.E0 == null, false);
            TLRPC.UserFull userFull = xoVar.E0;
            if (userFull != null) {
                xoVar.o0.u(userFull.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f)), false);
            }
            if (!xoVar.getMessagesController().starrefProgramAllowed) {
                xoVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.r8 r8Var28 = new org.telegram.ui.Cells.r8(context2);
            xoVar.p0 = r8Var28;
            r8Var28.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.p0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            xoVar.R.addView(xoVar.p0, w7.x5.n(-1, -2));
            final int i36 = 9;
            xoVar.p0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i36) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var29 = new org.telegram.ui.Cells.r8(context2);
            xoVar.q0 = r8Var29;
            r8Var29.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.q0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            xoVar.R.addView(xoVar.q0, w7.x5.n(-1, -2));
            final int i37 = 10;
            xoVar.q0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i37) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var30 = new org.telegram.ui.Cells.r8(context2);
            xoVar.r0 = r8Var30;
            r8Var30.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            xoVar.r0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            xoVar.R.addView(xoVar.r0, w7.x5.n(-1, -2));
            final int i38 = 11;
            xoVar.r0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = xoVar.x0;
        if (chat6 != null) {
            if (!ChatObject.hasAdminRights(chat6)) {
                xoVar.R.setVisibility(8);
                xoVar.G.setVisibility(8);
            }
            ydVar.addView(new org.telegram.ui.Cells.a7(context2), w7.x5.n(-1, -2));
        } else if (xoVar.D0 != null) {
            xoVar.s0 = new org.telegram.ui.Cells.e9(context2, i11, xoVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new wo(i16), indexOf, indexOf + 10, 33);
            }
            xoVar.s0.setText(valueOf);
            ydVar.addView(xoVar.s0, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.r8 r8Var31 = new org.telegram.ui.Cells.r8(context2);
            xoVar.u0 = r8Var31;
            r8Var31.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            xoVar.u0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.r8 r8Var32 = xoVar.u0;
            int i39 = org.telegram.ui.ActionBar.j6.q6;
            r8Var32.e(i39, i39);
            ydVar.addView(xoVar.u0, w7.x5.n(-1, -2));
            final int i40 = 13;
            xoVar.u0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i40) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j12 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j12;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j12));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j13;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context2, i11, xoVar.resourceProvider);
            xoVar.t0 = e9Var2;
            e9Var2.setFixedSize(i11);
            ydVar.addView(xoVar.t0, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.r8 r8Var33 = xoVar.u0;
            TLRPC.UserFull userFull2 = xoVar.E0;
            r8Var33.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.e9 e9Var3 = xoVar.t0;
            TLRPC.UserFull userFull3 = xoVar.E0;
            e9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = xoVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                xoVar.S = linearLayout5;
                linearLayout5.setOrientation(1);
                ydVar.addView(xoVar.S, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2);
                l4Var.setText(LocaleController.getString(R.string.BotBalance));
                xoVar.S.addView(l4Var, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.r8 r8Var34 = new org.telegram.ui.Cells.r8(context2);
                xoVar.m0 = r8Var34;
                r8Var34.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                xoVar.m0.setPrioritizeTitleOverValue(true);
                xoVar.S.addView(xoVar.m0, w7.x5.n(-1, -2));
                final zh.o g11 = zh.o.g(xoVar.currentAccount);
                xoVar.m0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ xo b;

                    {
                        this.b = xoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                xo xoVar3 = this.b;
                                long j12 = xoVar3.C0;
                                if (g11.h(j12, false) != null) {
                                    xoVar3.presentFragment(new zh.g(1, j12));
                                    break;
                                }
                                break;
                            default:
                                xo xoVar4 = this.b;
                                long j13 = xoVar4.C0;
                                if (g11.h(j13, false) != null) {
                                    xoVar4.presentFragment(new zh.g(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                long j12 = j3;
                if (g11.m(j12)) {
                    long i41 = g11.i(j12);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i41 > 0) {
                        double d = i41 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(i12);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    xoVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i90(AndroidUtilities.dp(30.0f), xoVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    xoVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                xoVar.m0.setVisibility(g11.b(j12) ? 0 : 8);
                org.telegram.ui.Cells.r8 r8Var35 = new org.telegram.ui.Cells.r8(context2);
                xoVar.n0 = r8Var35;
                r8Var35.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                final int i42 = 1;
                xoVar.n0.setPrioritizeTitleOverValue(true);
                xoVar.S.addView(xoVar.n0, w7.x5.n(-1, -2));
                xoVar.n0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.jo
                    public final /* synthetic */ xo b;

                    {
                        this.b = xoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i42) {
                            case 0:
                                xo xoVar3 = this.b;
                                long j122 = xoVar3.C0;
                                if (g11.h(j122, false) != null) {
                                    xoVar3.presentFragment(new zh.g(1, j122));
                                    break;
                                }
                                break;
                            default:
                                xo xoVar4 = this.b;
                                long j13 = xoVar4.C0;
                                if (g11.h(j13, false) != null) {
                                    xoVar4.presentFragment(new zh.g(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j12, false) != null) {
                    org.telegram.ui.Cells.r8 r8Var36 = xoVar.n0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j12).amount <= 0) {
                        X0 = charSequence;
                        z10 = false;
                    } else {
                        z10 = false;
                        X0 = zh.v7.X0(false, TextUtils.concat("XTR", zh.v7.K0(g11.c(j12), 0.85f, ' ')), 0.85f, null);
                    }
                    r8Var36.q(string2, X0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i90(AndroidUtilities.dp(30.0f), xoVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    xoVar.n0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                xoVar.n0.setVisibility(g11.a(j12) ? 0 : 8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context2, 12, xoVar.getResourceProvider());
                e9Var4.setFixedSize(12);
                num2 = num;
                e9Var4.setTag(R.id.fit_width_tag, num2);
                ydVar.addView(e9Var4, w7.x5.n(-1, 12));
                xoVar.S.setVisibility((xoVar.n0.getVisibility() == 0 || xoVar.m0.getVisibility() == 0) ? 0 : 8);
                chat = xoVar.x0;
                i13 = 14;
                if ((chat == null && chat.creator) || ((user = xoVar.D0) != null && user.bot && user.bot_can_edit)) {
                    final long j13 = chat != null ? chat.linked_community_id : xoVar.D0.linked_community_id;
                    final long j14 = chat != null ? -chat.id : xoVar.D0.id;
                    final boolean z17 = xoVar.D0 != null;
                    if (j13 != 0) {
                        hi.b bVar = new hi.b(context2, xoVar.resourceProvider);
                        xoVar.h0 = bVar;
                        bVar.a(xoVar.currentAccount, xoVar.getMessagesController().getChat(Long.valueOf(j13)));
                        final int i43 = 0;
                        xoVar.h0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        xoVar.h0.setOnClickListener(new View.OnClickListener(xoVar) { // from class: org.telegram.ui.ko
                            public final /* synthetic */ xo b;

                            {
                                this.b = xoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i43) {
                                    case 0:
                                        xo xoVar3 = this.b;
                                        MessagesController messagesController = xoVar3.getMessagesController();
                                        long j15 = j13;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j15)))) {
                                            xoVar3.showDialog(new gi.k0(xoVar3, j15, null, null));
                                            break;
                                        } else {
                                            xoVar3.presentFragment(new gi.p(w.f.e(j15, "community_id")));
                                            break;
                                        }
                                    default:
                                        xo xoVar4 = this.b;
                                        xoVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j13);
                                        xoVar4.presentFragment(new gi.f(bundle));
                                        break;
                                }
                            }
                        });
                        ydVar.addView(xoVar.h0, w7.x5.n(-1, -2));
                        org.telegram.ui.Cells.r8 r8Var37 = new org.telegram.ui.Cells.r8(context2);
                        xoVar.j0 = r8Var37;
                        r8Var37.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : xoVar.I0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                        org.telegram.ui.Cells.r8 r8Var38 = xoVar.j0;
                        int i44 = org.telegram.ui.ActionBar.j6.p7;
                        r8Var38.e(i44, i44);
                        xoVar.j0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        xoVar2 = xoVar;
                        xoVar.j0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                                xo xoVar3 = xo.this;
                                org.telegram.ui.Components.e5.v0(xoVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : xoVar3.I0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new so(xoVar3, j14, j13, 0));
                            }
                        });
                        ydVar.addView(xoVar2.j0, w7.x5.n(-1, -2));
                        org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context2, 12, xoVar2.getResourceProvider());
                        xoVar2.k0 = e9Var5;
                        e9Var5.setFixedSize(14);
                        xoVar2.k0.setTag(R.id.fit_width_tag, num2);
                        ydVar.addView(xoVar2.k0, w7.x5.n(-1, 14));
                    } else {
                        xoVar2 = xoVar;
                        org.telegram.ui.Cells.r8 r8Var39 = new org.telegram.ui.Cells.r8(context2);
                        xoVar2.g0 = r8Var39;
                        r8Var39.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                        xoVar2.g0.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.il));
                        xoVar2.g0.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                        xoVar2.g0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : xoVar2.I0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                        final int i45 = 1;
                        xoVar2.g0.setOnClickListener(new View.OnClickListener(xoVar2) { // from class: org.telegram.ui.ko
                            public final /* synthetic */ xo b;

                            {
                                this.b = xoVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i45) {
                                    case 0:
                                        xo xoVar3 = this.b;
                                        MessagesController messagesController = xoVar3.getMessagesController();
                                        long j15 = j14;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j15)))) {
                                            xoVar3.showDialog(new gi.k0(xoVar3, j15, null, null));
                                            break;
                                        } else {
                                            xoVar3.presentFragment(new gi.p(w.f.e(j15, "community_id")));
                                            break;
                                        }
                                    default:
                                        xo xoVar4 = this.b;
                                        xoVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j14);
                                        xoVar4.presentFragment(new gi.f(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.e9 e9Var6 = new org.telegram.ui.Cells.e9(context2, 12, xoVar2.resourceProvider);
                        xoVar2.i0 = e9Var6;
                        e9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : xoVar2.I0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                        ydVar.addView(xoVar2.g0, w7.x5.n(-1, -2));
                        ydVar.addView(xoVar2.i0, w7.x5.n(-1, -2));
                    }
                } else {
                    xoVar2 = xoVar;
                }
                chat2 = xoVar2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    xoVar2.c0 = frameLayout3;
                    ydVar.addView(frameLayout3, w7.x5.n(-1, -2));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context2);
                    xoVar2.d0 = eaVar;
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.p7));
                    xoVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (xoVar2.D0 == null) {
                        xoVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
                    } else if (xoVar2.I0) {
                        xoVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
                    } else {
                        xoVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                    }
                    xoVar2.c0.addView(xoVar2.d0, w7.x5.c(-2.0f, -1));
                    xoVar2.d0.setOnClickListener(new View.OnClickListener(xoVar2) { // from class: org.telegram.ui.ho
                        public final /* synthetic */ xo b;

                        {
                            this.b = xoVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    xo xoVar3 = this.b;
                                    xoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", xoVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    vr vrVar = new vr(bundle);
                                    vrVar.x0(xoVar3.y0);
                                    xoVar3.presentFragment(vrVar);
                                    break;
                                case 1:
                                    xo xoVar4 = this.b;
                                    uo uoVar = xoVar4.Q0;
                                    long j102 = xoVar4.C0;
                                    if (!xoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user22 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user22 == null) {
                                            TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, xoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    xo xoVar5 = this.b;
                                    xoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", xoVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    vr vrVar2 = new vr(bundle2);
                                    vrVar2.x0(xoVar5.y0);
                                    xoVar5.presentFragment(vrVar2);
                                    break;
                                case 3:
                                    xo xoVar6 = this.b;
                                    xoVar6.presentFragment(new zh0(xoVar6.w0));
                                    break;
                                case 4:
                                    xo xoVar7 = this.b;
                                    xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                                    break;
                                case 5:
                                    xo xoVar8 = this.b;
                                    xoVar8.getClass();
                                    xoVar8.presentFragment(new ub(xoVar8.x0));
                                    break;
                                case 6:
                                    xo xoVar9 = this.b;
                                    xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                                    break;
                                case 7:
                                    xo xoVar10 = this.b;
                                    xoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", xoVar10.C0);
                                    xoVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    xo xoVar11 = this.b;
                                    xoVar11.presentFragment(new fi.m(xoVar11.C0));
                                    break;
                                case 9:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    xo.Y(this.b);
                                    break;
                                case 14:
                                    xo xoVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                                    break;
                                case 15:
                                    xo xoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                        id0 id0Var = new id0(4);
                                        id0Var.e0 = -xoVar13.w0;
                                        TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        id0Var.F0 = new oo(xoVar13, 6);
                                        xoVar13.presentFragment(id0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    xo xoVar14 = this.b;
                                    long j112 = xoVar14.w0;
                                    org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                                    boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    lp lpVar = new lp(null);
                                    lpVar.M = new ArrayList();
                                    lpVar.N = new ArrayList();
                                    lpVar.P = new ArrayList();
                                    lpVar.c0 = true;
                                    lpVar.f0 = new ArrayList();
                                    lpVar.o0 = new HashMap();
                                    lpVar.q0 = new ap(lpVar, 5);
                                    lpVar.t0 = false;
                                    lpVar.Z = j112;
                                    lpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = xoVar14.y0;
                                    lpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            lpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            lpVar.X(false);
                                        }
                                    }
                                    xoVar14.presentFragment(lpVar);
                                    break;
                                case 17:
                                    xo xoVar15 = this.b;
                                    long j122 = xoVar15.w0;
                                    xp xpVar = new xp(null);
                                    xpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    xpVar.O = false;
                                    xpVar.P = false;
                                    xpVar.E = j122;
                                    TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j122));
                                    xpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    xpVar.s = z162;
                                    xpVar.h = xoVar15.y0;
                                    xoVar15.presentFragment(xpVar);
                                    break;
                                case 18:
                                    xo xoVar16 = this.b;
                                    tw0 tw0Var = new tw0(xoVar16.w0);
                                    tw0Var.v = new oo(xoVar16, 4);
                                    xoVar16.presentFragment(tw0Var);
                                    break;
                                case 19:
                                    xo.Z(this.b);
                                    break;
                                case 20:
                                    xo xoVar17 = this.b;
                                    t60 t60Var = new t60(-xoVar17.x0.id);
                                    t60Var.c = xoVar17.L0;
                                    t60Var.l0 = xoVar17;
                                    xoVar17.presentFragment(t60Var);
                                    break;
                                case 21:
                                    xo xoVar18 = this.b;
                                    xoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", xoVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                                    vr vrVar3 = new vr(bundle4);
                                    vrVar3.x0(xoVar18.y0);
                                    xoVar18.presentFragment(vrVar3);
                                    break;
                                case 22:
                                    xo xoVar19 = this.b;
                                    yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = xoVar19.y0;
                                    yh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    xoVar19.presentFragment(yh0Var);
                                    break;
                                case 23:
                                    xo xoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                        xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", xoVar20.w0);
                                        eq eqVar = new eq(bundle5);
                                        eqVar.d = new ArrayList();
                                        eqVar.r = new ArrayList();
                                        eqVar.v = -1;
                                        eqVar.F = new ArrayList();
                                        long j132 = bundle5.getLong("chat_id", 0L);
                                        eqVar.c = j132;
                                        TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                        eqVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (eqVar.a == null) {
                                                eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j132));
                                            }
                                            eqVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                eqVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                eqVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                eqVar.w = 1;
                                            }
                                        }
                                        xoVar20.presentFragment(eqVar);
                                        break;
                                    }
                                default:
                                    xo xoVar21 = this.b;
                                    xoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", xoVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                                    xoVar21.presentFragment(new co(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(context2);
                    xoVar2.e0 = a7Var2;
                    ydVar.addView(a7Var2, w7.x5.n(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                xoVar2.c = undoView;
                idVar.addView(undoView, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.hu huVar6 = xoVar2.v;
                TLRPC.User user3 = xoVar2.D0;
                huVar6.setText(Emoji.replaceEmoji(user3 == null ? ContactsController.formatName(user3) : xoVar2.x0.title, xoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.hu huVar7 = xoVar2.v;
                huVar7.setSelection(huVar7.n());
                chatFull = xoVar2.y0;
                if (chatFull == null) {
                    xoVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = xoVar2.E0;
                    if (userFull4 != null) {
                        xoVar2.E.setText(userFull4.about);
                    }
                }
                xoVar2.k0();
                xoVar2.p0(true, false);
                return xoVar2.fragmentView;
            }
        }
        num2 = num;
        chat = xoVar.x0;
        i13 = 14;
        if (chat == null) {
        }
        xoVar2 = xoVar;
        chat2 = xoVar2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            xoVar2.c0 = frameLayout32;
            ydVar.addView(frameLayout32, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar2 = new org.telegram.ui.Cells.ea(context2);
            xoVar2.d0 = eaVar2;
            eaVar2.setTextColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.p7));
            xoVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (xoVar2.D0 == null) {
            }
            xoVar2.c0.addView(xoVar2.d0, w7.x5.c(-2.0f, -1));
            xoVar2.d0.setOnClickListener(new View.OnClickListener(xoVar2) { // from class: org.telegram.ui.ho
                public final /* synthetic */ xo b;

                {
                    this.b = xoVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            xo xoVar3 = this.b;
                            xoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", xoVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            vr vrVar = new vr(bundle);
                            vrVar.x0(xoVar3.y0);
                            xoVar3.presentFragment(vrVar);
                            break;
                        case 1:
                            xo xoVar4 = this.b;
                            uo uoVar = xoVar4.Q0;
                            long j102 = xoVar4.C0;
                            if (!xoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : xoVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat32 = xoVar4.getMessagesController().getChat(Long.valueOf(xoVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = xoVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(xoVar4.y0.chat_photo.video_sizes.get(0), xoVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, xoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, uoVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            xo xoVar5 = this.b;
                            xoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", xoVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            vr vrVar2 = new vr(bundle2);
                            vrVar2.x0(xoVar5.y0);
                            xoVar5.presentFragment(vrVar2);
                            break;
                        case 3:
                            xo xoVar6 = this.b;
                            xoVar6.presentFragment(new zh0(xoVar6.w0));
                            break;
                        case 4:
                            xo xoVar7 = this.b;
                            xoVar7.presentFragment(new fi.e4(-xoVar7.w0));
                            break;
                        case 5:
                            xo xoVar8 = this.b;
                            xoVar8.getClass();
                            xoVar8.presentFragment(new ub(xoVar8.x0));
                            break;
                        case 6:
                            xo xoVar9 = this.b;
                            xoVar9.presentFragment(bb1.d0(xoVar9.x0, false));
                            break;
                        case 7:
                            xo xoVar10 = this.b;
                            xoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", xoVar10.C0);
                            xoVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            xo xoVar11 = this.b;
                            xoVar11.presentFragment(new fi.m(xoVar11.C0));
                            break;
                        case 9:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            of.f.s(view.getContext(), "https://t.me/BotFather?start=" + xo.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            xo.Y(this.b);
                            break;
                        case 14:
                            xo xoVar12 = this.b;
                            org.telegram.ui.Components.e5.s(xoVar12, false, xoVar12.x0, null, false, true, true, false, new oo(xoVar12, 7));
                            break;
                        case 15:
                            xo xoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(xoVar13)) {
                                id0 id0Var = new id0(4);
                                id0Var.e0 = -xoVar13.w0;
                                TLRPC.ChatFull chatFull6 = xoVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        id0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                id0Var.F0 = new oo(xoVar13, 6);
                                xoVar13.presentFragment(id0Var);
                                break;
                            }
                            break;
                        case 16:
                            xo xoVar14 = this.b;
                            long j112 = xoVar14.w0;
                            org.telegram.ui.Cells.r8 r8Var72 = xoVar14.H;
                            boolean z152 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            lp lpVar = new lp(null);
                            lpVar.M = new ArrayList();
                            lpVar.N = new ArrayList();
                            lpVar.P = new ArrayList();
                            lpVar.c0 = true;
                            lpVar.f0 = new ArrayList();
                            lpVar.o0 = new HashMap();
                            lpVar.q0 = new ap(lpVar, 5);
                            lpVar.t0 = false;
                            lpVar.Z = j112;
                            lpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = xoVar14.y0;
                            lpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    lpVar.l0 = tL_chatInviteExported;
                                } else {
                                    lpVar.X(false);
                                }
                            }
                            xoVar14.presentFragment(lpVar);
                            break;
                        case 17:
                            xo xoVar15 = this.b;
                            long j122 = xoVar15.w0;
                            xp xpVar = new xp(null);
                            xpVar.v = new ArrayList();
                            boolean z162 = false;
                            xpVar.O = false;
                            xpVar.P = false;
                            xpVar.E = j122;
                            TLRPC.Chat chat42 = xpVar.getMessagesController().getChat(Long.valueOf(j122));
                            xpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !xpVar.f.megagroup) {
                                z162 = true;
                            }
                            xpVar.s = z162;
                            xpVar.h = xoVar15.y0;
                            xoVar15.presentFragment(xpVar);
                            break;
                        case 18:
                            xo xoVar16 = this.b;
                            tw0 tw0Var = new tw0(xoVar16.w0);
                            tw0Var.v = new oo(xoVar16, 4);
                            xoVar16.presentFragment(tw0Var);
                            break;
                        case 19:
                            xo.Z(this.b);
                            break;
                        case 20:
                            xo xoVar17 = this.b;
                            t60 t60Var = new t60(-xoVar17.x0.id);
                            t60Var.c = xoVar17.L0;
                            t60Var.l0 = xoVar17;
                            xoVar17.presentFragment(t60Var);
                            break;
                        case 21:
                            xo xoVar18 = this.b;
                            xoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", xoVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((xoVar18.I0 || xoVar18.x0.gigagroup) && !ChatObject.isCommunity(xoVar18.x0)) ? 0 : 3);
                            vr vrVar3 = new vr(bundle4);
                            vrVar3.x0(xoVar18.y0);
                            xoVar18.presentFragment(vrVar3);
                            break;
                        case 22:
                            xo xoVar19 = this.b;
                            yh0 yh0Var = new yh0(xoVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = xoVar19.y0;
                            yh0Var.g0(chatFull8, chatFull8.exported_invite);
                            xoVar19.presentFragment(yh0Var);
                            break;
                        case 23:
                            xo xoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(xoVar20.x0)) {
                                xoVar20.presentFragment(new ah.b0(xoVar20.w0, xoVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", xoVar20.w0);
                                eq eqVar = new eq(bundle5);
                                eqVar.d = new ArrayList();
                                eqVar.r = new ArrayList();
                                eqVar.v = -1;
                                eqVar.F = new ArrayList();
                                long j132 = bundle5.getLong("chat_id", 0L);
                                eqVar.c = j132;
                                TLRPC.ChatFull chatFull9 = xoVar20.y0;
                                eqVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (eqVar.a == null) {
                                        eqVar.a = eqVar.getMessagesController().getChat(Long.valueOf(j132));
                                    }
                                    eqVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        eqVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        eqVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                eqVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        eqVar.w = 1;
                                    }
                                }
                                xoVar20.presentFragment(eqVar);
                                break;
                            }
                        default:
                            xo xoVar21 = this.b;
                            xoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", xoVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", xoVar21.w0);
                            xoVar21.presentFragment(new co(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.a7 a7Var22 = new org.telegram.ui.Cells.a7(context2);
            xoVar2.e0 = a7Var22;
            ydVar.addView(a7Var22, w7.x5.n(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        xoVar2.c = undoView2;
        idVar.addView(undoView2, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.hu huVar62 = xoVar2.v;
        TLRPC.User user32 = xoVar2.D0;
        huVar62.setText(Emoji.replaceEmoji(user32 == null ? ContactsController.formatName(user32) : xoVar2.x0.title, xoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.hu huVar72 = xoVar2.v;
        huVar72.setSelection(huVar72.n());
        chatFull = xoVar2.y0;
        if (chatFull == null) {
        }
        xoVar2.k0();
        xoVar2.p0(true, false);
        return xoVar2.fragmentView;
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
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var == null || d5Var.getLastFragment() != this) {
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
                    org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
                    if (d5Var2 == null || d5Var2.getLastFragment() != this) {
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
                zh.o g10 = zh.o.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j3) ? 0 : 8);
                this.n0.u(zh.v7.X0(false, TextUtils.concat("XTR", zh.v7.J0(g10.c(j3), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.r8 r8Var3 = this.l0;
                if (r8Var3 != null) {
                    r8Var3.setNeedDivider(g10.a(j3) || g10.b(j3));
                }
                this.S.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                zh.o g11 = zh.o.g(this.currentAccount);
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
                org.telegram.ui.Cells.r8 r8Var4 = this.l0;
                if (r8Var4 != null) {
                    if (!g11.a(j3) && !g11.b(j3)) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        if (this.s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.hu huVar;
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
            org.telegram.ui.Components.hu huVar2 = this.v;
            if ((huVar2 == null || this.D0.first_name.equals(huVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new oo(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new oo(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory == this.J0) && (((huVar = this.v) == null || this.x0.title.equals(huVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.F0 == this.x0.forum))) {
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
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new oo(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new oo(this, 3));
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

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ cv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        vo voVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(voVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.T, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.r8 r8Var = this.U;
        if (r8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(r8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Y, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.hu huVar = this.v;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(huVar, TLObject.FLAG_23, null, null, null, null, i14));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e0, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d0, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.r8 r8Var2 = this.K;
        if (r8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(r8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.r8 r8Var3 = this.a0;
        if (r8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(r8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.a0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new no(this, 0));
    }

    public final void i0() {
        this.s.o(this.v0 != null, new po(this, 0), new r5(this, 5), 0);
        this.R0.K(0);
        this.R0.N(43);
        this.b0.e.d();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.hu huVar;
        String str;
        String str2;
        if (this.N0 || (huVar = this.v) == null) {
            return;
        }
        if (huVar.a.length() == 0) {
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
            this.b = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new ba(this, getConnectionsManager().sendRequest(setbotinfo, new ro(i10, this, setbotinfo)), 2));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.x0) && (!this.J0 || this.F0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.w0, this, new oo(this, 5));
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
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.b = b2Var;
            b2Var.setOnCancelListener(new pg(this, r0));
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
                    if ((fragmentStack.get(i10) instanceof co) && ((co) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
                        HashSet hashSet = eg1.n1;
                        ((ActionBarLayout) parentLayout).c(i10, eg1.E0(getMessagesController(), getMessagesStorage(), bundle));
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
        long j3 = this.C0;
        TLRPC.User user = j3 == 0 ? null : getMessagesController().getUser(Long.valueOf(j3));
        if (chat == null && user == null) {
            return;
        }
        this.D0 = user;
        this.x0 = chat;
        org.telegram.ui.Components.i9 i9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(i9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.v0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, i9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.h()) {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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
        org.telegram.ui.Components.q5 n10;
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
                                n10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, org.telegram.ui.Components.q5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.q5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.q5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, org.telegram.ui.Components.q5.g(), tL_availableReaction2.activate_animation);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<di.r6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<di.r6, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new to(i10, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        wp0 wp0Var;
        int v02;
        ArrayList<Integer> arrayList;
        gp0 gp0Var = this.L;
        if (gp0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.r8 r8Var3 = this.N;
            boolean z10 = (r8Var3 != null && r8Var3.getVisibility() == 0) || ((r8Var = this.Q) != null && r8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.x0) && ChatObject.hasAdminRights(this.x0)) || ((r8Var2 = this.M) != null && r8Var2.getVisibility() == 0));
            Paint paint = gp0Var.n;
            int i10 = gp0Var.a;
            org.telegram.ui.ActionBar.f6 f6Var = gp0Var.d;
            if (chat == null) {
                return;
            }
            gp0Var.v = z10;
            gp0Var.r = new org.telegram.ui.Components.f01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            wp0 wp0Var2 = gp0Var.w;
            if (wp0Var2 != null) {
                wp0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = wp0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                gp0Var.w = new wp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    wp0Var = wp0.c(i10, ChatObject.getProfileColorId(chat));
                    wp0Var.a = AndroidUtilities.dp(11.0f);
                    wp0Var.d();
                } else {
                    wp0Var = null;
                }
                gp0Var.w = wp0Var;
            }
            wp0 wp0Var3 = gp0Var.w;
            if (wp0Var3 != null) {
                wp0Var3.e(gp0Var);
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
                gp0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i13));
                wp0 wp0Var4 = new wp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                wp0Var4.a = AndroidUtilities.dp(11.0f);
                wp0Var4.d();
                gp0Var.x = wp0Var4;
                wp0Var4.e(gp0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.j6.r8[colorId];
                gp0Var.s = i14;
                v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    gp0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.j6.r8[0];
                    gp0Var.s = i15;
                    v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
                }
            }
            gp0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
            wp0 a10 = wp0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            gp0Var.x = a10;
            a10.e(gp0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.hu huVar = this.v;
        if (huVar == null || !huVar.e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        huVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
    @Override // org.telegram.ui.ActionBar.n2
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
            org.telegram.ui.Components.i9 i9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.u40 u40Var = this.s;
            u40Var.a = this;
            u40Var.b = this;
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
        org.telegram.ui.Components.i9 i9Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            i9Var2.n(5L, this.x0.title, null);
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
            i9Var2.n(5L, this.D0.first_name, null);
            this.I0 = false;
            this.F0 = false;
            this.H0 = false;
            this.G0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.u40 u40Var2 = this.s;
        u40Var2.a = this;
        u40Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.y0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.u40 u40Var = this.s;
        if (u40Var != null) {
            u40Var.e();
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
        org.telegram.ui.Components.hu huVar = this.v;
        if (huVar != null) {
            huVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        yd ydVar = this.w;
        if (ydVar != null) {
            ydVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.q5) obj).p(null);
        }
        org.telegram.ui.Components.hu huVar = this.v;
        if (huVar != null) {
            huVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s.j();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.hu huVar = this.v;
        if (huVar != null) {
            huVar.s();
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
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), org.telegram.ui.Cells.p6.i("@", publicUsername), false, R.drawable.msg_discuss, true);
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
                            String i17 = org.telegram.ui.Cells.p6.i("@", publicUsername2);
                            int i18 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var15 = this.Q;
                            r8Var14.s(string3, i17, false, i18, r8Var15 != null && r8Var15.getVisibility() == 0);
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
                    int i19 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.r8 r8Var18 = this.N;
                    r8Var17.s(string4, str5, false, i19, (r8Var18 != null && r8Var18.getVisibility() == 0) || ((r8Var3 = this.J) != null && r8Var3.getVisibility() == 0) || ((r8Var4 = this.Q) != null && r8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.r8 r8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i20 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var20 = this.N;
                    r8Var19.s(string5, str5, false, i20, (r8Var20 != null && r8Var20.getVisibility() == 0) || ((r8Var = this.J) != null && r8Var.getVisibility() == 0) || ((r8Var2 = this.Q) != null && r8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a4.a.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.x0));
                org.telegram.ui.Cells.r8 r8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i21 = R.drawable.msg_channel;
                org.telegram.ui.Cells.r8 r8Var22 = this.N;
                r8Var21.s(string7, string6, false, i21, (r8Var22 != null && r8Var22.getVisibility() == 0) || ((r8Var5 = this.J) != null && r8Var5.getVisibility() == 0) || ((r8Var6 = this.Q) != null && r8Var6.getVisibility() == 0));
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
                for (int i22 = 0; i22 < this.F.getChildCount(); i22++) {
                    if (!z15 && this.F.getChildAt(i22) == this.N) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.F.getChildAt(i22));
                    }
                }
                boolean z16 = false;
                for (int i23 = 0; i23 < this.w.getChildCount(); i23++) {
                    if (!z16 && this.w.getChildAt(i23) == this.F) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.w.getChildAt(i23));
                    }
                }
                if (this.N.getVisibility() != 0) {
                    this.N.setAlpha(0.0f);
                    this.N.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.N.setVisibility(0);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    ((View) arrayList.get(i24)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.S0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.m0(11, this, arrayList));
                    this.S0.addListener(new ah.r0(this, z14, arrayList, 5));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.pr.h);
                    this.S0.start();
                } else {
                    this.N.setAlpha(z14 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z14 ? 0 : 8);
                    for (int i25 = 0; i25 < arrayList.size(); i25++) {
                        ((View) arrayList.get(i25)).setTranslationY(0.0f);
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
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.x5.n(-1, -2));
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
                        int i26 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i27 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i27++;
                            }
                            i10 = vr.n0(tL_chatBannedRights) + i27;
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
                            i11 = i26;
                        } else {
                            i10 = i26;
                            i11 = i10;
                        }
                        z12 = z11;
                        this.X.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.r8 r8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i28 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.r8 r8Var25 = this.Y;
                        r8Var24.s(string8, format, false, i28, r8Var25 != null && r8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.r8 r8Var26 = this.U;
                    if (r8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.y0.requests_pending));
                        int i29 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.r8 r8Var27 = this.Y;
                        r8Var26.s(string9, format2, false, i29, r8Var27 != null && r8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.r8 r8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i30 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.r8 r8Var29 = this.Y;
                    r8Var28.s(string10, format3, false, i30, r8Var29 != null && r8Var29.getVisibility() == 0);
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
                        int i31 = 0;
                        for (int i32 = 0; i32 < size; i32++) {
                            TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i32);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i31++;
                            }
                        }
                        i12 = i31;
                    }
                }
                r8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    org.telegram.ui.Cells.r8 r8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i33 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var32 = this.Y;
                    r8Var31.m(i33, string12, r8Var32 != null && r8Var32.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i34 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.r8 r8Var34 = this.Y;
                        r8Var33.m(i34, string13, r8Var34 != null && r8Var34.getVisibility() == 0);
                    } else {
                        this.X.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.r8 r8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i35 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.r8 r8Var36 = this.Y;
                    r8Var35.m(i35, string14, r8Var36 != null && r8Var36.getVisibility() == 0);
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
        uy uyVar;
        ox oxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof co) {
                co coVar = (co) fragmentStack.get(i10);
                if (coVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(coVar, false);
                    coVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, coVar);
                    if (!this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new eg1(bundle));
                        i10++;
                    }
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof eg1)) {
                eg1 eg1Var = (eg1) fragmentStack.get(i10);
                if (eg1Var.g() != null && eg1Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(eg1Var, false);
                    i10--;
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof uy) && (uyVar = (uy) fragmentStack.get(i10)) != null && (oxVar = uyVar.F3) != null && oxVar.c()) {
                uyVar.F3.a();
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.u40 u40Var = this.s;
        if (u40Var != null) {
            u40Var.f = bundle.getString("path");
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.u40 u40Var = this.s;
        if (u40Var != null && (str = u40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.hu huVar = this.v;
        if (huVar != null) {
            String obj = huVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
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
        this.K.s(LocaleController.getString(R.string.PostSuggestions), zh.v7.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ void P() {
    }
}
