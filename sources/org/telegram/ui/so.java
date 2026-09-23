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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class so extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.u40, NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Cells.s8 H;
    public boolean H0;
    public org.telegram.ui.Cells.s8 I;
    public boolean I0;
    public org.telegram.ui.Cells.s8 J;
    public boolean J0;
    public org.telegram.ui.Cells.s8 K;
    public TLRPC.ChatReactions K0;
    public zo0 L;
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
    public final oo Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.yi0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.s8 T;
    public org.telegram.ui.Cells.s8 U;
    public org.telegram.ui.Cells.s8 V;
    public org.telegram.ui.Cells.s8 W;
    public org.telegram.ui.Cells.s8 X;
    public org.telegram.ui.Cells.s8 Y;
    public org.telegram.ui.Cells.s8 Z;
    public org.telegram.ui.ActionBar.v0 a;
    public org.telegram.ui.Cells.s8 a0;
    public org.telegram.ui.ActionBar.b2 b;
    public qo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.fa d0;
    public ai.y5 e;
    public org.telegram.ui.Cells.a7 e0;
    public ci.r6 f;
    public org.telegram.ui.Cells.s8 f0;
    public org.telegram.ui.Cells.s8 g0;
    public AnimatorSet h;
    public gi.b h0;
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
    public final org.telegram.ui.Components.h9 r;
    public org.telegram.ui.Cells.s8 r0;
    public final org.telegram.ui.Components.v40 s;
    public org.telegram.ui.Cells.f9 s0;
    public org.telegram.ui.Cells.f9 t0;
    public org.telegram.ui.Cells.s8 u0;
    public org.telegram.ui.Components.ku v;
    public TLRPC.FileLocation v0;
    public xd w;
    public long w0;
    public org.telegram.ui.Components.zn0 x;
    public TLRPC.Chat x0;
    public LinearLayout y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public so(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new oo(this);
        this.r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.v40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.v40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(so soVar, FrameLayout frameLayout, View view) {
        if (!soVar.G0) {
            TLRPC.ChatFull chatFull = soVar.y0;
            org.telegram.ui.Components.xc.a0(soVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", soVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j3 = -soVar.w0;
        jz jzVar = new jz(null);
        jzVar.a = j3;
        jzVar.setResourceProvider(soVar.resourceProvider);
        boolean z10 = soVar.F0;
        boolean z11 = soVar.H0;
        ai.m0 m0Var = new ai.m0(8, soVar, view);
        jzVar.c = z10;
        jzVar.d = z11;
        jzVar.f = m0Var;
        soVar.presentFragment(jzVar);
    }

    public static /* synthetic */ void V(so soVar) {
        soVar.v0 = null;
        long j3 = soVar.C0;
        if (j3 == 0) {
            MessagesController.getInstance(soVar.currentAccount).changeChatAvatar(soVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = soVar.getMessagesController().getInputUser(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            soVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new io(soVar, 2));
        }
        soVar.n0(false, true);
        ai.y5 y5Var = soVar.e;
        org.telegram.ui.Components.h9 h9Var = soVar.r;
        Object obj = soVar.D0;
        if (obj == null) {
            obj = soVar.x0;
        }
        y5Var.h(null, null, h9Var, obj);
        soVar.R0.M(0);
        soVar.b0.e.d();
    }

    public static void X(so soVar) {
        int i10 = soVar.currentAccount;
        long j3 = soVar.C0;
        TL_bots.botVerifierSettings botverifiersettings = soVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e = org.telegram.messenger.z0.e(16, "onlySelect", "dialogsType", true);
        e.putBoolean("resetDelegate", false);
        ry ryVar = new ry(e);
        ryVar.setCurrentAccount(i10);
        ryVar.C2 = new ei.u1(ryVar, i10, j3, botverifiersettings);
        U.presentFragment(ryVar);
    }

    public static void Y(so soVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        b2Var.dismiss();
        if (soVar.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(35, soVar.currentAccount, soVar.getParentActivity(), soVar, soVar.getResourceProvider());
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j3);
        TLRPC.Chat chat = soVar.getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            j0Var.Q0 = new rh(8, soVar, chat);
        }
        soVar.showDialog(j0Var);
    }

    public static void Z(so soVar) {
        ad adVar = new ad(-soVar.x0.id);
        adVar.l0 = soVar;
        soVar.presentFragment(adVar);
        MessagesController.getInstance(soVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(soVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(so soVar) {
        soVar.O0 = true;
        NotificationCenter.getInstance(soVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        a10 a10Var = new a10(10);
        a10Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        a10Var.f = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lj, false);
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

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.u40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0f2d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f8e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0fba  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0fc2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0f93  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        Context context2;
        CharSequence charSequence;
        Integer num;
        final int i10;
        final int i11;
        final so soVar;
        int i12;
        Integer num2;
        boolean z10;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i13;
        TLRPC.User user;
        final so soVar2;
        float f7;
        Context context3;
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
        Context context4;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i15 = 1;
        org.telegram.ui.Components.ku kuVar = this.v;
        if (kuVar != null) {
            kuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 0));
        hd hdVar = new hd(i15, context, this);
        hdVar.setOnTouchListener(new bi.d(9));
        this.fragmentView = hdVar;
        hdVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.a7));
        xd xdVar = new xd(context);
        this.w = xdVar;
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(context, this.w, this.resourceProvider, false);
        this.x = zn0Var;
        zn0Var.setFillViewport(true);
        hdVar.addView(this.x, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(xdVar, new FrameLayout.LayoutParams(-1, -2));
        xdVar.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.d6));
        xdVar.addView(this.d, w7.x5.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.x5.n(-1, -2));
        ai.y5 y5Var = new ai.y5(this, context, 6);
        this.e = y5Var;
        y5Var.setRoundRadius(this.F0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i16 = 5;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            ai.y5 y5Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(y5Var2, w7.x5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.r6 r6Var = new ci.r6(this, context, paint, i16);
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
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j3 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j3 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j3));
                                if (user2 == null) {
                                    TLRPC.Chat chat3 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i17 = chatPhoto2.dc_id;
                                        if (i17 != 0) {
                                            chatPhoto2.photo_big.dc_id = i17;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat3.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i18 = userProfilePhoto2.dc_id;
                                        if (i18 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i18;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j10 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var7 = soVar14.H;
                            boolean z15 = s8Var7 != null && s8Var7.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j10;
                            gpVar.n0 = z15;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z16 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat4 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !spVar.f.megagroup) {
                                z16 = true;
                            }
                            spVar.s = z16;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                            if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
        } else {
            ai.y5 y5Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(y5Var3, w7.x5.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.ku kuVar2 = new org.telegram.ui.Components.ku(context, hdVar, this);
        this.v = kuVar2;
        long j3 = this.C0;
        if (j3 != 0) {
            kuVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.I0) {
            kuVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            kuVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.ku kuVar3 = this.v;
        TLRPC.Chat chat3 = this.x0;
        kuVar3.setEnabled(chat3 != null || ChatObject.canChangeChatInfo(chat3));
        org.telegram.ui.Components.ku kuVar4 = this.v;
        kuVar4.setFocusable(kuVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new m0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.ku kuVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(kuVar5, w7.x5.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        xdVar.addView(this.y, w7.x5.n(-1, -2));
        final int i17 = 12;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            qo qoVar = new qo(context);
            this.b0 = qoVar;
            qoVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            this.b0.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i18 = userProfilePhoto2.dc_id;
                                        if (i18 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i18;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j10 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var7 = soVar14.H;
                            boolean z152 = s8Var7 != null && s8Var7.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j10;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat4 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                            if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.b0, w7.x5.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.E.setHintTextColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.u0(i18));
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
        this.E.setCursorColor(org.telegram.ui.ActionBar.h6.u0(i18));
        this.E.setCursorSize(AndroidUtilities.dp(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.y.addView(this.E, w7.x5.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, w7.x5.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new ia(this, 2));
        this.E.addTextChangedListener(new kd(1));
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context);
        this.G = a7Var;
        xdVar.addView(a7Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(1);
        xdVar.addView(this.F, w7.x5.n(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.s8 s8Var7 = new org.telegram.ui.Cells.s8(context);
                this.H = s8Var7;
                s8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                this.F.addView(this.H, w7.x5.n(-1, -2));
                final int i19 = 15;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ so b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                so soVar3 = this.b;
                                soVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", soVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(soVar3.y0);
                                soVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                so soVar4 = this.b;
                                oo ooVar = soVar4.Q0;
                                long j32 = soVar4.C0;
                                if (!soVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = soVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                so soVar5 = this.b;
                                soVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", soVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(soVar5.y0);
                                soVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                so soVar6 = this.b;
                                soVar6.presentFragment(new uh0(soVar6.w0));
                                break;
                            case 4:
                                so soVar7 = this.b;
                                soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                break;
                            case 5:
                                so soVar8 = this.b;
                                soVar8.getClass();
                                soVar8.presentFragment(new ub(soVar8.x0));
                                break;
                            case 6:
                                so soVar9 = this.b;
                                soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                break;
                            case 7:
                                so soVar10 = this.b;
                                soVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", soVar10.C0);
                                soVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                so soVar11 = this.b;
                                soVar11.presentFragment(new ei.l(soVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                so.X(this.b);
                                break;
                            case 14:
                                so soVar12 = this.b;
                                org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                break;
                            case 15:
                                so soVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                    dd0 dd0Var = new dd0(4);
                                    dd0Var.e0 = -soVar13.w0;
                                    TLRPC.ChatFull chatFull6 = soVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    dd0Var.F0 = new jo(soVar13, 6);
                                    soVar13.presentFragment(dd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                so soVar14 = this.b;
                                long j10 = soVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                gp gpVar = new gp(null);
                                gpVar.M = new ArrayList();
                                gpVar.N = new ArrayList();
                                gpVar.P = new ArrayList();
                                gpVar.c0 = true;
                                gpVar.f0 = new ArrayList();
                                gpVar.o0 = new HashMap();
                                gpVar.q0 = new vo(gpVar, 5);
                                gpVar.t0 = false;
                                gpVar.Z = j10;
                                gpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = soVar14.y0;
                                gpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        gpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        gpVar.X(false);
                                    }
                                }
                                soVar14.presentFragment(gpVar);
                                break;
                            case 17:
                                so soVar15 = this.b;
                                long j11 = soVar15.w0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.O = false;
                                spVar.P = false;
                                spVar.E = j11;
                                TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                spVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = soVar15.y0;
                                soVar15.presentFragment(spVar);
                                break;
                            case 18:
                                so soVar16 = this.b;
                                mw0 mw0Var = new mw0(soVar16.w0);
                                mw0Var.v = new jo(soVar16, 4);
                                soVar16.presentFragment(mw0Var);
                                break;
                            case 19:
                                so.Z(this.b);
                                break;
                            case 20:
                                so soVar17 = this.b;
                                p60 p60Var = new p60(-soVar17.x0.id);
                                p60Var.c = soVar17.L0;
                                p60Var.l0 = soVar17;
                                soVar17.presentFragment(p60Var);
                                break;
                            case 21:
                                so soVar18 = this.b;
                                soVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", soVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(soVar18.y0);
                                soVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                so soVar19 = this.b;
                                th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = soVar19.y0;
                                th0Var.g0(chatFull8, chatFull8.exported_invite);
                                soVar19.presentFragment(th0Var);
                                break;
                            case 23:
                                so soVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                    soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", soVar20.w0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = soVar20.y0;
                                    zpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    soVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                so soVar21 = this.b;
                                soVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", soVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                soVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.s8 s8Var8 = new org.telegram.ui.Cells.s8(context);
                this.I = s8Var8;
                s8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                this.F.addView(this.I, w7.x5.n(-1, -2));
                final int i20 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ so b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                so soVar3 = this.b;
                                soVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", soVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(soVar3.y0);
                                soVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                so soVar4 = this.b;
                                oo ooVar = soVar4.Q0;
                                long j32 = soVar4.C0;
                                if (!soVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = soVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                so soVar5 = this.b;
                                soVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", soVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(soVar5.y0);
                                soVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                so soVar6 = this.b;
                                soVar6.presentFragment(new uh0(soVar6.w0));
                                break;
                            case 4:
                                so soVar7 = this.b;
                                soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                break;
                            case 5:
                                so soVar8 = this.b;
                                soVar8.getClass();
                                soVar8.presentFragment(new ub(soVar8.x0));
                                break;
                            case 6:
                                so soVar9 = this.b;
                                soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                break;
                            case 7:
                                so soVar10 = this.b;
                                soVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", soVar10.C0);
                                soVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                so soVar11 = this.b;
                                soVar11.presentFragment(new ei.l(soVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                so.X(this.b);
                                break;
                            case 14:
                                so soVar12 = this.b;
                                org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                break;
                            case 15:
                                so soVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                    dd0 dd0Var = new dd0(4);
                                    dd0Var.e0 = -soVar13.w0;
                                    TLRPC.ChatFull chatFull6 = soVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    dd0Var.F0 = new jo(soVar13, 6);
                                    soVar13.presentFragment(dd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                so soVar14 = this.b;
                                long j10 = soVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                gp gpVar = new gp(null);
                                gpVar.M = new ArrayList();
                                gpVar.N = new ArrayList();
                                gpVar.P = new ArrayList();
                                gpVar.c0 = true;
                                gpVar.f0 = new ArrayList();
                                gpVar.o0 = new HashMap();
                                gpVar.q0 = new vo(gpVar, 5);
                                gpVar.t0 = false;
                                gpVar.Z = j10;
                                gpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = soVar14.y0;
                                gpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        gpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        gpVar.X(false);
                                    }
                                }
                                soVar14.presentFragment(gpVar);
                                break;
                            case 17:
                                so soVar15 = this.b;
                                long j11 = soVar15.w0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.O = false;
                                spVar.P = false;
                                spVar.E = j11;
                                TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                spVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = soVar15.y0;
                                soVar15.presentFragment(spVar);
                                break;
                            case 18:
                                so soVar16 = this.b;
                                mw0 mw0Var = new mw0(soVar16.w0);
                                mw0Var.v = new jo(soVar16, 4);
                                soVar16.presentFragment(mw0Var);
                                break;
                            case 19:
                                so.Z(this.b);
                                break;
                            case 20:
                                so soVar17 = this.b;
                                p60 p60Var = new p60(-soVar17.x0.id);
                                p60Var.c = soVar17.L0;
                                p60Var.l0 = soVar17;
                                soVar17.presentFragment(p60Var);
                                break;
                            case 21:
                                so soVar18 = this.b;
                                soVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", soVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(soVar18.y0);
                                soVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                so soVar19 = this.b;
                                th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = soVar19.y0;
                                th0Var.g0(chatFull8, chatFull8.exported_invite);
                                soVar19.presentFragment(th0Var);
                                break;
                            case 23:
                                so soVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                    soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", soVar20.w0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = soVar20.y0;
                                    zpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    soVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                so soVar21 = this.b;
                                soVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", soVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                soVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.x0) && ((this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) || (!this.I0 && ChatObject.canUserDoAdminAction(this.x0, 0)))) {
                org.telegram.ui.Cells.s8 s8Var9 = new org.telegram.ui.Cells.s8(context);
                this.J = s8Var9;
                s8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                this.F.addView(this.J, w7.x5.n(-1, -2));
                final int i21 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ so b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                so soVar3 = this.b;
                                soVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", soVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(soVar3.y0);
                                soVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                so soVar4 = this.b;
                                oo ooVar = soVar4.Q0;
                                long j32 = soVar4.C0;
                                if (!soVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = soVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                so soVar5 = this.b;
                                soVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", soVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(soVar5.y0);
                                soVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                so soVar6 = this.b;
                                soVar6.presentFragment(new uh0(soVar6.w0));
                                break;
                            case 4:
                                so soVar7 = this.b;
                                soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                break;
                            case 5:
                                so soVar8 = this.b;
                                soVar8.getClass();
                                soVar8.presentFragment(new ub(soVar8.x0));
                                break;
                            case 6:
                                so soVar9 = this.b;
                                soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                break;
                            case 7:
                                so soVar10 = this.b;
                                soVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", soVar10.C0);
                                soVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                so soVar11 = this.b;
                                soVar11.presentFragment(new ei.l(soVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                so.X(this.b);
                                break;
                            case 14:
                                so soVar12 = this.b;
                                org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                break;
                            case 15:
                                so soVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                    dd0 dd0Var = new dd0(4);
                                    dd0Var.e0 = -soVar13.w0;
                                    TLRPC.ChatFull chatFull6 = soVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    dd0Var.F0 = new jo(soVar13, 6);
                                    soVar13.presentFragment(dd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                so soVar14 = this.b;
                                long j10 = soVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                gp gpVar = new gp(null);
                                gpVar.M = new ArrayList();
                                gpVar.N = new ArrayList();
                                gpVar.P = new ArrayList();
                                gpVar.c0 = true;
                                gpVar.f0 = new ArrayList();
                                gpVar.o0 = new HashMap();
                                gpVar.q0 = new vo(gpVar, 5);
                                gpVar.t0 = false;
                                gpVar.Z = j10;
                                gpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = soVar14.y0;
                                gpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        gpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        gpVar.X(false);
                                    }
                                }
                                soVar14.presentFragment(gpVar);
                                break;
                            case 17:
                                so soVar15 = this.b;
                                long j11 = soVar15.w0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.O = false;
                                spVar.P = false;
                                spVar.E = j11;
                                TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                spVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = soVar15.y0;
                                soVar15.presentFragment(spVar);
                                break;
                            case 18:
                                so soVar16 = this.b;
                                mw0 mw0Var = new mw0(soVar16.w0);
                                mw0Var.v = new jo(soVar16, 4);
                                soVar16.presentFragment(mw0Var);
                                break;
                            case 19:
                                so.Z(this.b);
                                break;
                            case 20:
                                so soVar17 = this.b;
                                p60 p60Var = new p60(-soVar17.x0.id);
                                p60Var.c = soVar17.L0;
                                p60Var.l0 = soVar17;
                                soVar17.presentFragment(p60Var);
                                break;
                            case 21:
                                so soVar18 = this.b;
                                soVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", soVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(soVar18.y0);
                                soVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                so soVar19 = this.b;
                                th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = soVar19.y0;
                                th0Var.g0(chatFull8, chatFull8.exported_invite);
                                soVar19.presentFragment(th0Var);
                                break;
                            case 23:
                                so soVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                    soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", soVar20.w0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = soVar20.y0;
                                    zpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    soVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                so soVar21 = this.b;
                                soVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", soVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                soVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) {
                org.telegram.ui.Cells.s8 s8Var10 = new org.telegram.ui.Cells.s8(context);
                this.K = s8Var10;
                s8Var10.setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                this.K.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.x5.n(-1, -2));
                final int i22 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ so b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                so soVar3 = this.b;
                                soVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", soVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(soVar3.y0);
                                soVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                so soVar4 = this.b;
                                oo ooVar = soVar4.Q0;
                                long j32 = soVar4.C0;
                                if (!soVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = soVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                so soVar5 = this.b;
                                soVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", soVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(soVar5.y0);
                                soVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                so soVar6 = this.b;
                                soVar6.presentFragment(new uh0(soVar6.w0));
                                break;
                            case 4:
                                so soVar7 = this.b;
                                soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                break;
                            case 5:
                                so soVar8 = this.b;
                                soVar8.getClass();
                                soVar8.presentFragment(new ub(soVar8.x0));
                                break;
                            case 6:
                                so soVar9 = this.b;
                                soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                break;
                            case 7:
                                so soVar10 = this.b;
                                soVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", soVar10.C0);
                                soVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                so soVar11 = this.b;
                                soVar11.presentFragment(new ei.l(soVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                so.X(this.b);
                                break;
                            case 14:
                                so soVar12 = this.b;
                                org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                break;
                            case 15:
                                so soVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                    dd0 dd0Var = new dd0(4);
                                    dd0Var.e0 = -soVar13.w0;
                                    TLRPC.ChatFull chatFull6 = soVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    dd0Var.F0 = new jo(soVar13, 6);
                                    soVar13.presentFragment(dd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                so soVar14 = this.b;
                                long j10 = soVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                gp gpVar = new gp(null);
                                gpVar.M = new ArrayList();
                                gpVar.N = new ArrayList();
                                gpVar.P = new ArrayList();
                                gpVar.c0 = true;
                                gpVar.f0 = new ArrayList();
                                gpVar.o0 = new HashMap();
                                gpVar.q0 = new vo(gpVar, 5);
                                gpVar.t0 = false;
                                gpVar.Z = j10;
                                gpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = soVar14.y0;
                                gpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        gpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        gpVar.X(false);
                                    }
                                }
                                soVar14.presentFragment(gpVar);
                                break;
                            case 17:
                                so soVar15 = this.b;
                                long j11 = soVar15.w0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.O = false;
                                spVar.P = false;
                                spVar.E = j11;
                                TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                spVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = soVar15.y0;
                                soVar15.presentFragment(spVar);
                                break;
                            case 18:
                                so soVar16 = this.b;
                                mw0 mw0Var = new mw0(soVar16.w0);
                                mw0Var.v = new jo(soVar16, 4);
                                soVar16.presentFragment(mw0Var);
                                break;
                            case 19:
                                so.Z(this.b);
                                break;
                            case 20:
                                so soVar17 = this.b;
                                p60 p60Var = new p60(-soVar17.x0.id);
                                p60Var.c = soVar17.L0;
                                p60Var.l0 = soVar17;
                                soVar17.presentFragment(p60Var);
                                break;
                            case 21:
                                so soVar18 = this.b;
                                soVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", soVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(soVar18.y0);
                                soVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                so soVar19 = this.b;
                                th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = soVar19.y0;
                                th0Var.g0(chatFull8, chatFull8.exported_invite);
                                soVar19.presentFragment(th0Var);
                                break;
                            case 23:
                                so soVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                    soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", soVar20.w0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = soVar20.y0;
                                    zpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    soVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                so soVar21 = this.b;
                                soVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", soVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                soVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && ChatObject.canChangeChatInfo(this.x0)) {
                charSequence = "";
                zo0 zo0Var = new zo0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.L = zo0Var;
                zo0Var.setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                this.F.addView(this.L, w7.x5.n(-1, -2));
                final int i23 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ so b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                so soVar3 = this.b;
                                soVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", soVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(soVar3.y0);
                                soVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                so soVar4 = this.b;
                                oo ooVar = soVar4.Q0;
                                long j32 = soVar4.C0;
                                if (!soVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = soVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                so soVar5 = this.b;
                                soVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", soVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(soVar5.y0);
                                soVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                so soVar6 = this.b;
                                soVar6.presentFragment(new uh0(soVar6.w0));
                                break;
                            case 4:
                                so soVar7 = this.b;
                                soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                break;
                            case 5:
                                so soVar8 = this.b;
                                soVar8.getClass();
                                soVar8.presentFragment(new ub(soVar8.x0));
                                break;
                            case 6:
                                so soVar9 = this.b;
                                soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                break;
                            case 7:
                                so soVar10 = this.b;
                                soVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", soVar10.C0);
                                soVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                so soVar11 = this.b;
                                soVar11.presentFragment(new ei.l(soVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                so.X(this.b);
                                break;
                            case 14:
                                so soVar12 = this.b;
                                org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                break;
                            case 15:
                                so soVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                    dd0 dd0Var = new dd0(4);
                                    dd0Var.e0 = -soVar13.w0;
                                    TLRPC.ChatFull chatFull6 = soVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    dd0Var.F0 = new jo(soVar13, 6);
                                    soVar13.presentFragment(dd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                so soVar14 = this.b;
                                long j10 = soVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                gp gpVar = new gp(null);
                                gpVar.M = new ArrayList();
                                gpVar.N = new ArrayList();
                                gpVar.P = new ArrayList();
                                gpVar.c0 = true;
                                gpVar.f0 = new ArrayList();
                                gpVar.o0 = new HashMap();
                                gpVar.q0 = new vo(gpVar, 5);
                                gpVar.t0 = false;
                                gpVar.Z = j10;
                                gpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = soVar14.y0;
                                gpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        gpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        gpVar.X(false);
                                    }
                                }
                                soVar14.presentFragment(gpVar);
                                break;
                            case 17:
                                so soVar15 = this.b;
                                long j11 = soVar15.w0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.O = false;
                                spVar.P = false;
                                spVar.E = j11;
                                TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                spVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = soVar15.y0;
                                soVar15.presentFragment(spVar);
                                break;
                            case 18:
                                so soVar16 = this.b;
                                mw0 mw0Var = new mw0(soVar16.w0);
                                mw0Var.v = new jo(soVar16, 4);
                                soVar16.presentFragment(mw0Var);
                                break;
                            case 19:
                                so.Z(this.b);
                                break;
                            case 20:
                                so soVar17 = this.b;
                                p60 p60Var = new p60(-soVar17.x0.id);
                                p60Var.c = soVar17.L0;
                                p60Var.l0 = soVar17;
                                soVar17.presentFragment(p60Var);
                                break;
                            case 21:
                                so soVar18 = this.b;
                                soVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", soVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(soVar18.y0);
                                soVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                so soVar19 = this.b;
                                th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = soVar19.y0;
                                th0Var.g0(chatFull8, chatFull8.exported_invite);
                                soVar19.presentFragment(th0Var);
                                break;
                            case 23:
                                so soVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                    soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", soVar20.w0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = soVar20.y0;
                                    zpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    soVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                so soVar21 = this.b;
                                soVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", soVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                soVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                charSequence = "";
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.x0) || ChatObject.isCommunity(this.x0)) {
                context4 = context;
                frameLayout = frameLayout2;
                num = 1;
                soVar = this;
            } else {
                long j10 = -this.x0.id;
                num = 1;
                org.telegram.ui.Cells.s8 s8Var11 = new org.telegram.ui.Cells.s8(23, context, this.resourceProvider, false, true);
                context4 = context;
                this.M = s8Var11;
                s8Var11.setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                this.M.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.x0.autotranslation);
                final int i24 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j10, new Utilities.Callback(this) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ so b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i24) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                so soVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    soVar3.getClass();
                                    break;
                                } else {
                                    soVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < soVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
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
                soVar = this;
                this.M.setOnClickListener(new co(this, new boolean[]{false}, j10, 0));
            }
            if (!soVar.I0 && ChatObject.canBlockUsers(soVar.x0) && (ChatObject.isChannel(soVar.x0) || soVar.x0.creator)) {
                org.telegram.ui.Cells.s8 s8Var12 = new org.telegram.ui.Cells.s8(context4);
                soVar.N = s8Var12;
                s8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
                soVar.F.addView(soVar.N, w7.x5.n(-1, -2));
                i11 = 5;
                soVar.N.setOnClickListener(new qf(i11, soVar, context4));
            } else {
                i11 = 5;
            }
            if (ChatObject.isMegagroup(soVar.x0) && ChatObject.hasAdminRights(soVar.x0) && !ChatObject.isCommunity(soVar.x0)) {
                final int i25 = 1;
                MessagesController.getInstance(soVar.currentAccount).getBoostsController().getBoostsStats(-soVar.x0.id, new Utilities.Callback(soVar) { // from class: org.telegram.ui.ho
                    public final /* synthetic */ so b;

                    {
                        this.b = soVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i25) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                so soVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    soVar3.getClass();
                                    break;
                                } else {
                                    soVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < soVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                zo0 zo0Var2 = new zo0(soVar.currentAccount, -soVar.x0.id, context4, soVar.getResourceProvider());
                soVar.L = zo0Var2;
                zo0Var2.setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                soVar.F.addView(soVar.L, w7.x5.n(-1, -2));
                final int i26 = 20;
                soVar.L.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ so b;

                    {
                        this.b = soVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                so soVar3 = this.b;
                                soVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", soVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(soVar3.y0);
                                soVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                so soVar4 = this.b;
                                oo ooVar = soVar4.Q0;
                                long j32 = soVar4.C0;
                                if (!soVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = soVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().J2(null, soVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                so soVar5 = this.b;
                                soVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", soVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(soVar5.y0);
                                soVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                so soVar6 = this.b;
                                soVar6.presentFragment(new uh0(soVar6.w0));
                                break;
                            case 4:
                                so soVar7 = this.b;
                                soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                break;
                            case 5:
                                so soVar8 = this.b;
                                soVar8.getClass();
                                soVar8.presentFragment(new ub(soVar8.x0));
                                break;
                            case 6:
                                so soVar9 = this.b;
                                soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                break;
                            case 7:
                                so soVar10 = this.b;
                                soVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", soVar10.C0);
                                soVar10.presentFragment(new qa(bundle3));
                                break;
                            case 8:
                                so soVar11 = this.b;
                                soVar11.presentFragment(new ei.l(soVar11.C0));
                                break;
                            case 9:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                so.X(this.b);
                                break;
                            case 14:
                                so soVar12 = this.b;
                                org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                break;
                            case 15:
                                so soVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                    dd0 dd0Var = new dd0(4);
                                    dd0Var.e0 = -soVar13.w0;
                                    TLRPC.ChatFull chatFull6 = soVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    dd0Var.F0 = new jo(soVar13, 6);
                                    soVar13.presentFragment(dd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                so soVar14 = this.b;
                                long j102 = soVar14.w0;
                                org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                gp gpVar = new gp(null);
                                gpVar.M = new ArrayList();
                                gpVar.N = new ArrayList();
                                gpVar.P = new ArrayList();
                                gpVar.c0 = true;
                                gpVar.f0 = new ArrayList();
                                gpVar.o0 = new HashMap();
                                gpVar.q0 = new vo(gpVar, 5);
                                gpVar.t0 = false;
                                gpVar.Z = j102;
                                gpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = soVar14.y0;
                                gpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        gpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        gpVar.X(false);
                                    }
                                }
                                soVar14.presentFragment(gpVar);
                                break;
                            case 17:
                                so soVar15 = this.b;
                                long j11 = soVar15.w0;
                                sp spVar = new sp(null);
                                spVar.v = new ArrayList();
                                boolean z162 = false;
                                spVar.O = false;
                                spVar.P = false;
                                spVar.E = j11;
                                TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                spVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                    z162 = true;
                                }
                                spVar.s = z162;
                                spVar.h = soVar15.y0;
                                soVar15.presentFragment(spVar);
                                break;
                            case 18:
                                so soVar16 = this.b;
                                mw0 mw0Var = new mw0(soVar16.w0);
                                mw0Var.v = new jo(soVar16, 4);
                                soVar16.presentFragment(mw0Var);
                                break;
                            case 19:
                                so.Z(this.b);
                                break;
                            case 20:
                                so soVar17 = this.b;
                                p60 p60Var = new p60(-soVar17.x0.id);
                                p60Var.c = soVar17.L0;
                                p60Var.l0 = soVar17;
                                soVar17.presentFragment(p60Var);
                                break;
                            case 21:
                                so soVar18 = this.b;
                                soVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", soVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(soVar18.y0);
                                soVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                so soVar19 = this.b;
                                th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = soVar19.y0;
                                th0Var.g0(chatFull8, chatFull8.exported_invite);
                                soVar19.presentFragment(th0Var);
                                break;
                            case 23:
                                so soVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                    soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", soVar20.w0);
                                    zp zpVar = new zp(bundle5);
                                    zpVar.d = new ArrayList();
                                    zpVar.r = new ArrayList();
                                    zpVar.v = -1;
                                    zpVar.F = new ArrayList();
                                    long j12 = bundle5.getLong("chat_id", 0L);
                                    zpVar.c = j12;
                                    TLRPC.ChatFull chatFull9 = soVar20.y0;
                                    zpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (zpVar.a == null) {
                                            zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        }
                                        zpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            zpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            zpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                }
                                            }
                                            zpVar.w = 1;
                                        }
                                    }
                                    soVar20.presentFragment(zpVar);
                                    break;
                                }
                            default:
                                so soVar21 = this.b;
                                soVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", soVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                soVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!soVar.I0 && soVar.x0.creator) {
                org.telegram.ui.Cells.s8 s8Var13 = new org.telegram.ui.Cells.s8(23, context, null, false, true);
                context2 = context;
                soVar.Q = s8Var13;
                s8Var13.setBackground(org.telegram.ui.ActionBar.h6.K0(true));
                soVar.Q.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), soVar.F0);
                soVar.Q.getCheckBox().setIcon(soVar.G0 ? 0 : R.drawable.permission_locked);
                soVar.F.addView(soVar.Q, w7.x5.c(-2.0f, -1));
                i10 = 6;
                soVar.Q.setOnClickListener(new qf(i10, soVar, frameLayout));
            } else {
                context2 = context;
                i10 = 6;
            }
            soVar.o0();
        } else {
            context2 = context;
            charSequence = "";
            num = 1;
            i10 = 6;
            i11 = 5;
            soVar = this;
        }
        org.telegram.ui.ActionBar.z n10 = soVar.actionBar.n();
        if (soVar.D0 != null || ChatObject.canChangeChatInfo(soVar.x0) || soVar.N != null) {
            org.telegram.ui.ActionBar.v0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            soVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (soVar.H == null && soVar.N == null && soVar.I == null && soVar.J == null && soVar.Q == null) {
            i12 = 12;
        } else {
            i12 = 12;
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context2, 12, soVar.resourceProvider);
            soVar.P = f9Var;
            if (soVar.Q != null) {
                f9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                f9Var.setFixedSize(12);
            }
            xdVar.addView(soVar.P, w7.x5.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        soVar.R = linearLayout4;
        linearLayout4.setOrientation(1);
        xdVar.addView(soVar.R, w7.x5.n(-1, -2));
        final int i27 = 8;
        if (soVar.x0 != null) {
            org.telegram.ui.Cells.s8 s8Var14 = new org.telegram.ui.Cells.s8(context2);
            soVar.X = s8Var14;
            s8Var14.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            org.telegram.ui.Cells.s8 s8Var15 = soVar.X;
            if (!ChatObject.isChannel(soVar.x0)) {
                TLRPC.Chat chat5 = soVar.x0;
                if (!chat5.creator && (!ChatObject.hasAdminRights(chat5) || !ChatObject.canChangeChatInfo(soVar.x0))) {
                    i14 = 8;
                    s8Var15.setVisibility(i14);
                    final int i28 = 21;
                    soVar.X.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i28) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j11 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j11;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.s8 s8Var16 = new org.telegram.ui.Cells.s8(context2);
                    soVar.V = s8Var16;
                    s8Var16.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    final int i29 = 22;
                    soVar.V.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j11 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j11;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.s8 s8Var17 = new org.telegram.ui.Cells.s8(context2);
                    soVar.O = s8Var17;
                    s8Var17.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    final int i30 = 23;
                    soVar.O.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j11 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j11;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(soVar.x0, 28)) {
                        org.telegram.ui.Cells.s8 s8Var18 = new org.telegram.ui.Cells.s8(context2);
                        soVar.f0 = s8Var18;
                        s8Var18.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        final int i31 = 24;
                        soVar.f0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ so b;

                            {
                                this.b = soVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i31) {
                                    case 0:
                                        so soVar3 = this.b;
                                        soVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", soVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(soVar3.y0);
                                        soVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        so soVar4 = this.b;
                                        oo ooVar = soVar4.Q0;
                                        long j32 = soVar4.C0;
                                        if (!soVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        so soVar5 = this.b;
                                        soVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", soVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(soVar5.y0);
                                        soVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        so soVar6 = this.b;
                                        soVar6.presentFragment(new uh0(soVar6.w0));
                                        break;
                                    case 4:
                                        so soVar7 = this.b;
                                        soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                        break;
                                    case 5:
                                        so soVar8 = this.b;
                                        soVar8.getClass();
                                        soVar8.presentFragment(new ub(soVar8.x0));
                                        break;
                                    case 6:
                                        so soVar9 = this.b;
                                        soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                        break;
                                    case 7:
                                        so soVar10 = this.b;
                                        soVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", soVar10.C0);
                                        soVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        so soVar11 = this.b;
                                        soVar11.presentFragment(new ei.l(soVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        so.X(this.b);
                                        break;
                                    case 14:
                                        so soVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                        break;
                                    case 15:
                                        so soVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                            dd0 dd0Var = new dd0(4);
                                            dd0Var.e0 = -soVar13.w0;
                                            TLRPC.ChatFull chatFull6 = soVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            dd0Var.F0 = new jo(soVar13, 6);
                                            soVar13.presentFragment(dd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        so soVar14 = this.b;
                                        long j102 = soVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        gp gpVar = new gp(null);
                                        gpVar.M = new ArrayList();
                                        gpVar.N = new ArrayList();
                                        gpVar.P = new ArrayList();
                                        gpVar.c0 = true;
                                        gpVar.f0 = new ArrayList();
                                        gpVar.o0 = new HashMap();
                                        gpVar.q0 = new vo(gpVar, 5);
                                        gpVar.t0 = false;
                                        gpVar.Z = j102;
                                        gpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = soVar14.y0;
                                        gpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                gpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                gpVar.X(false);
                                            }
                                        }
                                        soVar14.presentFragment(gpVar);
                                        break;
                                    case 17:
                                        so soVar15 = this.b;
                                        long j11 = soVar15.w0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.O = false;
                                        spVar.P = false;
                                        spVar.E = j11;
                                        TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                        spVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = soVar15.y0;
                                        soVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        so soVar16 = this.b;
                                        mw0 mw0Var = new mw0(soVar16.w0);
                                        mw0Var.v = new jo(soVar16, 4);
                                        soVar16.presentFragment(mw0Var);
                                        break;
                                    case 19:
                                        so.Z(this.b);
                                        break;
                                    case 20:
                                        so soVar17 = this.b;
                                        p60 p60Var = new p60(-soVar17.x0.id);
                                        p60Var.c = soVar17.L0;
                                        p60Var.l0 = soVar17;
                                        soVar17.presentFragment(p60Var);
                                        break;
                                    case 21:
                                        so soVar18 = this.b;
                                        soVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", soVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(soVar18.y0);
                                        soVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        so soVar19 = this.b;
                                        th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = soVar19.y0;
                                        th0Var.g0(chatFull8, chatFull8.exported_invite);
                                        soVar19.presentFragment(th0Var);
                                        break;
                                    case 23:
                                        so soVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                            soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", soVar20.w0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = soVar20.y0;
                                            zpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            soVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        so soVar21 = this.b;
                                        soVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", soVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                        soVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                        soVar.f0();
                    }
                    org.telegram.ui.Cells.s8 s8Var19 = new org.telegram.ui.Cells.s8(context2);
                    soVar.W = s8Var19;
                    final int i32 = 0;
                    s8Var19.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    soVar.W.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j11 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j11;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.s8 s8Var20 = new org.telegram.ui.Cells.s8(context2);
                    soVar.T = s8Var20;
                    s8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    final int i33 = 2;
                    soVar.T.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j11 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j11;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.isChannelAndNotMegaGroup(soVar.x0)) {
                        org.telegram.ui.Cells.s8 s8Var21 = new org.telegram.ui.Cells.s8(context2);
                        soVar.U = s8Var21;
                        s8Var21.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        final int i34 = 3;
                        soVar.U.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ so b;

                            {
                                this.b = soVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i34) {
                                    case 0:
                                        so soVar3 = this.b;
                                        soVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", soVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(soVar3.y0);
                                        soVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        so soVar4 = this.b;
                                        oo ooVar = soVar4.Q0;
                                        long j32 = soVar4.C0;
                                        if (!soVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        so soVar5 = this.b;
                                        soVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", soVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(soVar5.y0);
                                        soVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        so soVar6 = this.b;
                                        soVar6.presentFragment(new uh0(soVar6.w0));
                                        break;
                                    case 4:
                                        so soVar7 = this.b;
                                        soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                        break;
                                    case 5:
                                        so soVar8 = this.b;
                                        soVar8.getClass();
                                        soVar8.presentFragment(new ub(soVar8.x0));
                                        break;
                                    case 6:
                                        so soVar9 = this.b;
                                        soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                        break;
                                    case 7:
                                        so soVar10 = this.b;
                                        soVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", soVar10.C0);
                                        soVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        so soVar11 = this.b;
                                        soVar11.presentFragment(new ei.l(soVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        so.X(this.b);
                                        break;
                                    case 14:
                                        so soVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                        break;
                                    case 15:
                                        so soVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                            dd0 dd0Var = new dd0(4);
                                            dd0Var.e0 = -soVar13.w0;
                                            TLRPC.ChatFull chatFull6 = soVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            dd0Var.F0 = new jo(soVar13, 6);
                                            soVar13.presentFragment(dd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        so soVar14 = this.b;
                                        long j102 = soVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        gp gpVar = new gp(null);
                                        gpVar.M = new ArrayList();
                                        gpVar.N = new ArrayList();
                                        gpVar.P = new ArrayList();
                                        gpVar.c0 = true;
                                        gpVar.f0 = new ArrayList();
                                        gpVar.o0 = new HashMap();
                                        gpVar.q0 = new vo(gpVar, 5);
                                        gpVar.t0 = false;
                                        gpVar.Z = j102;
                                        gpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = soVar14.y0;
                                        gpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                gpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                gpVar.X(false);
                                            }
                                        }
                                        soVar14.presentFragment(gpVar);
                                        break;
                                    case 17:
                                        so soVar15 = this.b;
                                        long j11 = soVar15.w0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.O = false;
                                        spVar.P = false;
                                        spVar.E = j11;
                                        TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                        spVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = soVar15.y0;
                                        soVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        so soVar16 = this.b;
                                        mw0 mw0Var = new mw0(soVar16.w0);
                                        mw0Var.v = new jo(soVar16, 4);
                                        soVar16.presentFragment(mw0Var);
                                        break;
                                    case 19:
                                        so.Z(this.b);
                                        break;
                                    case 20:
                                        so soVar17 = this.b;
                                        p60 p60Var = new p60(-soVar17.x0.id);
                                        p60Var.c = soVar17.L0;
                                        p60Var.l0 = soVar17;
                                        soVar17.presentFragment(p60Var);
                                        break;
                                    case 21:
                                        so soVar18 = this.b;
                                        soVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", soVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(soVar18.y0);
                                        soVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        so soVar19 = this.b;
                                        th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = soVar19.y0;
                                        th0Var.g0(chatFull8, chatFull8.exported_invite);
                                        soVar19.presentFragment(th0Var);
                                        break;
                                    case 23:
                                        so soVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                            soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", soVar20.w0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = soVar20.y0;
                                            zpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            soVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        so soVar21 = this.b;
                                        soVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", soVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                        soVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.s8 s8Var22 = new org.telegram.ui.Cells.s8(context2);
                    soVar.Z = s8Var22;
                    s8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    soVar.Z.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    final int i35 = 4;
                    soVar.Z.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i35) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j11 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j11;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j12 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j12;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    soVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(soVar.x0) || soVar.x0.gigagroup) {
                        org.telegram.ui.Cells.s8 s8Var23 = new org.telegram.ui.Cells.s8(context2);
                        soVar.Y = s8Var23;
                        s8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        soVar.Y.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        soVar.Y.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ so b;

                            {
                                this.b = soVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i11) {
                                    case 0:
                                        so soVar3 = this.b;
                                        soVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", soVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(soVar3.y0);
                                        soVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        so soVar4 = this.b;
                                        oo ooVar = soVar4.Q0;
                                        long j32 = soVar4.C0;
                                        if (!soVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        so soVar5 = this.b;
                                        soVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", soVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(soVar5.y0);
                                        soVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        so soVar6 = this.b;
                                        soVar6.presentFragment(new uh0(soVar6.w0));
                                        break;
                                    case 4:
                                        so soVar7 = this.b;
                                        soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                        break;
                                    case 5:
                                        so soVar8 = this.b;
                                        soVar8.getClass();
                                        soVar8.presentFragment(new ub(soVar8.x0));
                                        break;
                                    case 6:
                                        so soVar9 = this.b;
                                        soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                        break;
                                    case 7:
                                        so soVar10 = this.b;
                                        soVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", soVar10.C0);
                                        soVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        so soVar11 = this.b;
                                        soVar11.presentFragment(new ei.l(soVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        so.X(this.b);
                                        break;
                                    case 14:
                                        so soVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                        break;
                                    case 15:
                                        so soVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                            dd0 dd0Var = new dd0(4);
                                            dd0Var.e0 = -soVar13.w0;
                                            TLRPC.ChatFull chatFull6 = soVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            dd0Var.F0 = new jo(soVar13, 6);
                                            soVar13.presentFragment(dd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        so soVar14 = this.b;
                                        long j102 = soVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        gp gpVar = new gp(null);
                                        gpVar.M = new ArrayList();
                                        gpVar.N = new ArrayList();
                                        gpVar.P = new ArrayList();
                                        gpVar.c0 = true;
                                        gpVar.f0 = new ArrayList();
                                        gpVar.o0 = new HashMap();
                                        gpVar.q0 = new vo(gpVar, 5);
                                        gpVar.t0 = false;
                                        gpVar.Z = j102;
                                        gpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = soVar14.y0;
                                        gpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                gpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                gpVar.X(false);
                                            }
                                        }
                                        soVar14.presentFragment(gpVar);
                                        break;
                                    case 17:
                                        so soVar15 = this.b;
                                        long j11 = soVar15.w0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.O = false;
                                        spVar.P = false;
                                        spVar.E = j11;
                                        TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                        spVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = soVar15.y0;
                                        soVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        so soVar16 = this.b;
                                        mw0 mw0Var = new mw0(soVar16.w0);
                                        mw0Var.v = new jo(soVar16, 4);
                                        soVar16.presentFragment(mw0Var);
                                        break;
                                    case 19:
                                        so.Z(this.b);
                                        break;
                                    case 20:
                                        so soVar17 = this.b;
                                        p60 p60Var = new p60(-soVar17.x0.id);
                                        p60Var.c = soVar17.L0;
                                        p60Var.l0 = soVar17;
                                        soVar17.presentFragment(p60Var);
                                        break;
                                    case 21:
                                        so soVar18 = this.b;
                                        soVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", soVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(soVar18.y0);
                                        soVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        so soVar19 = this.b;
                                        th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = soVar19.y0;
                                        th0Var.g0(chatFull8, chatFull8.exported_invite);
                                        soVar19.presentFragment(th0Var);
                                        break;
                                    case 23:
                                        so soVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                            soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", soVar20.w0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = soVar20.y0;
                                            zpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            soVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        so soVar21 = this.b;
                                        soVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", soVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                        soVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(soVar.x0)) {
                        org.telegram.ui.Cells.s8 s8Var24 = new org.telegram.ui.Cells.s8(context2);
                        soVar.a0 = s8Var24;
                        s8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        soVar.a0.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        soVar.a0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ so b;

                            {
                                this.b = soVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        so soVar3 = this.b;
                                        soVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", soVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(soVar3.y0);
                                        soVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        so soVar4 = this.b;
                                        oo ooVar = soVar4.Q0;
                                        long j32 = soVar4.C0;
                                        if (!soVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().J2(null, soVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        so soVar5 = this.b;
                                        soVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", soVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(soVar5.y0);
                                        soVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        so soVar6 = this.b;
                                        soVar6.presentFragment(new uh0(soVar6.w0));
                                        break;
                                    case 4:
                                        so soVar7 = this.b;
                                        soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                        break;
                                    case 5:
                                        so soVar8 = this.b;
                                        soVar8.getClass();
                                        soVar8.presentFragment(new ub(soVar8.x0));
                                        break;
                                    case 6:
                                        so soVar9 = this.b;
                                        soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                        break;
                                    case 7:
                                        so soVar10 = this.b;
                                        soVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", soVar10.C0);
                                        soVar10.presentFragment(new qa(bundle3));
                                        break;
                                    case 8:
                                        so soVar11 = this.b;
                                        soVar11.presentFragment(new ei.l(soVar11.C0));
                                        break;
                                    case 9:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        so.X(this.b);
                                        break;
                                    case 14:
                                        so soVar12 = this.b;
                                        org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                        break;
                                    case 15:
                                        so soVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                            dd0 dd0Var = new dd0(4);
                                            dd0Var.e0 = -soVar13.w0;
                                            TLRPC.ChatFull chatFull6 = soVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            dd0Var.F0 = new jo(soVar13, 6);
                                            soVar13.presentFragment(dd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        so soVar14 = this.b;
                                        long j102 = soVar14.w0;
                                        org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                        boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                        gp gpVar = new gp(null);
                                        gpVar.M = new ArrayList();
                                        gpVar.N = new ArrayList();
                                        gpVar.P = new ArrayList();
                                        gpVar.c0 = true;
                                        gpVar.f0 = new ArrayList();
                                        gpVar.o0 = new HashMap();
                                        gpVar.q0 = new vo(gpVar, 5);
                                        gpVar.t0 = false;
                                        gpVar.Z = j102;
                                        gpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = soVar14.y0;
                                        gpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                gpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                gpVar.X(false);
                                            }
                                        }
                                        soVar14.presentFragment(gpVar);
                                        break;
                                    case 17:
                                        so soVar15 = this.b;
                                        long j11 = soVar15.w0;
                                        sp spVar = new sp(null);
                                        spVar.v = new ArrayList();
                                        boolean z162 = false;
                                        spVar.O = false;
                                        spVar.P = false;
                                        spVar.E = j11;
                                        TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                                        spVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        spVar.s = z162;
                                        spVar.h = soVar15.y0;
                                        soVar15.presentFragment(spVar);
                                        break;
                                    case 18:
                                        so soVar16 = this.b;
                                        mw0 mw0Var = new mw0(soVar16.w0);
                                        mw0Var.v = new jo(soVar16, 4);
                                        soVar16.presentFragment(mw0Var);
                                        break;
                                    case 19:
                                        so.Z(this.b);
                                        break;
                                    case 20:
                                        so soVar17 = this.b;
                                        p60 p60Var = new p60(-soVar17.x0.id);
                                        p60Var.c = soVar17.L0;
                                        p60Var.l0 = soVar17;
                                        soVar17.presentFragment(p60Var);
                                        break;
                                    case 21:
                                        so soVar18 = this.b;
                                        soVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", soVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(soVar18.y0);
                                        soVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        so soVar19 = this.b;
                                        th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = soVar19.y0;
                                        th0Var.g0(chatFull8, chatFull8.exported_invite);
                                        soVar19.presentFragment(th0Var);
                                        break;
                                    case 23:
                                        so soVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                            soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", soVar20.w0);
                                            zp zpVar = new zp(bundle5);
                                            zpVar.d = new ArrayList();
                                            zpVar.r = new ArrayList();
                                            zpVar.v = -1;
                                            zpVar.F = new ArrayList();
                                            long j12 = bundle5.getLong("chat_id", 0L);
                                            zpVar.c = j12;
                                            TLRPC.ChatFull chatFull9 = soVar20.y0;
                                            zpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (zpVar.a == null) {
                                                    zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                                }
                                                zpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    zpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    zpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                        }
                                                    }
                                                    zpVar.w = 1;
                                                }
                                            }
                                            soVar20.presentFragment(zpVar);
                                            break;
                                        }
                                    default:
                                        so soVar21 = this.b;
                                        soVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", soVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                        soVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    soVar.R.addView(soVar.O, w7.x5.n(-1, -2));
                    s8Var = soVar.f0;
                    if (s8Var != null) {
                        soVar.R.addView(s8Var, w7.x5.n(-1, -2));
                    }
                    if (!soVar.I0 && !soVar.x0.gigagroup) {
                        soVar.R.addView(soVar.X, w7.x5.n(-1, -2));
                    }
                    if (!soVar.I0) {
                        soVar.R.addView(soVar.V, w7.x5.n(-1, -2));
                    }
                    soVar.R.addView(soVar.W, w7.x5.n(-1, -2));
                    soVar.R.addView(soVar.T, w7.x5.n(-1, -2));
                    s8Var2 = soVar.U;
                    if (s8Var2 != null && (chatFull2 = soVar.y0) != null && chatFull2.requests_pending > 0) {
                        soVar.R.addView(s8Var2, w7.x5.n(-1, -2));
                    }
                    if (soVar.I0) {
                        soVar.R.addView(soVar.V, w7.x5.n(-1, -2));
                    }
                    if (!soVar.I0 || soVar.x0.gigagroup) {
                        soVar.R.addView(soVar.X, w7.x5.n(-1, -2));
                    }
                    s8Var3 = soVar.a0;
                    if (s8Var3 != null) {
                        soVar.R.addView(s8Var3, w7.x5.n(-1, -2));
                    }
                    s8Var4 = soVar.Y;
                    if (s8Var4 != null) {
                        soVar.R.addView(s8Var4, w7.x5.n(-1, -2));
                    }
                    s8Var5 = soVar.Z;
                    if (s8Var5 != null) {
                        soVar.R.addView(s8Var5, w7.x5.n(-1, -2));
                    }
                    if (soVar.Z != null && soVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(soVar.x0)) {
                        soVar.Z.setVisibility(0);
                    }
                    s8Var6 = soVar.Y;
                    if (s8Var6 != null) {
                        org.telegram.ui.Cells.s8 s8Var25 = soVar.Z;
                        s8Var6.setNeedDivider(s8Var25 != null && s8Var25.getVisibility() == 0);
                    }
                }
            }
            i14 = 0;
            s8Var15.setVisibility(i14);
            final int i282 = 21;
            soVar.X.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i282) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var162 = new org.telegram.ui.Cells.s8(context2);
            soVar.V = s8Var162;
            s8Var162.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            final int i292 = 22;
            soVar.V.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var172 = new org.telegram.ui.Cells.s8(context2);
            soVar.O = s8Var172;
            s8Var172.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            final int i302 = 23;
            soVar.O.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i302) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(soVar.x0, 28)) {
            }
            org.telegram.ui.Cells.s8 s8Var192 = new org.telegram.ui.Cells.s8(context2);
            soVar.W = s8Var192;
            final int i322 = 0;
            s8Var192.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.W.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var202 = new org.telegram.ui.Cells.s8(context2);
            soVar.T = s8Var202;
            s8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            final int i332 = 2;
            soVar.T.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isChannelAndNotMegaGroup(soVar.x0)) {
            }
            org.telegram.ui.Cells.s8 s8Var222 = new org.telegram.ui.Cells.s8(context2);
            soVar.Z = s8Var222;
            s8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            soVar.Z.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            final int i352 = 4;
            soVar.Z.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            soVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(soVar.x0)) {
            }
            org.telegram.ui.Cells.s8 s8Var232 = new org.telegram.ui.Cells.s8(context2);
            soVar.Y = s8Var232;
            s8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            soVar.Y.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.Y.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(soVar.x0)) {
            }
            soVar.R.addView(soVar.O, w7.x5.n(-1, -2));
            s8Var = soVar.f0;
            if (s8Var != null) {
            }
            if (!soVar.I0) {
                soVar.R.addView(soVar.X, w7.x5.n(-1, -2));
            }
            if (!soVar.I0) {
            }
            soVar.R.addView(soVar.W, w7.x5.n(-1, -2));
            soVar.R.addView(soVar.T, w7.x5.n(-1, -2));
            s8Var2 = soVar.U;
            if (s8Var2 != null) {
                soVar.R.addView(s8Var2, w7.x5.n(-1, -2));
            }
            if (soVar.I0) {
            }
            if (!soVar.I0) {
            }
            soVar.R.addView(soVar.X, w7.x5.n(-1, -2));
            s8Var3 = soVar.a0;
            if (s8Var3 != null) {
            }
            s8Var4 = soVar.Y;
            if (s8Var4 != null) {
            }
            s8Var5 = soVar.Z;
            if (s8Var5 != null) {
            }
            if (soVar.Z != null) {
                soVar.Z.setVisibility(0);
            }
            s8Var6 = soVar.Y;
            if (s8Var6 != null) {
            }
        }
        if (soVar.D0 != null) {
            org.telegram.ui.Cells.s8 s8Var26 = new org.telegram.ui.Cells.s8(context2);
            soVar.l0 = s8Var26;
            s8Var26.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.l0.setPrioritizeTitleOverValue(true);
            soVar.R.addView(soVar.l0, w7.x5.n(-1, -2));
            final int i36 = 7;
            soVar.l0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i36) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            soVar.r0();
            org.telegram.ui.Cells.s8 s8Var27 = new org.telegram.ui.Cells.s8(context2);
            soVar.o0 = s8Var27;
            s8Var27.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.o0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), charSequence, R.drawable.msg_shareout, true);
            soVar.R.addView(soVar.o0, w7.x5.n(-1, -2));
            soVar.o0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i27) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            soVar.o0.f(45, soVar.E0 == null, false);
            TLRPC.UserFull userFull = soVar.E0;
            if (userFull != null) {
                org.telegram.ui.Cells.s8 s8Var28 = soVar.o0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r1.commission_permille / 10.0f));
                }
                s8Var28.u(format, z11);
            }
            if (!soVar.getMessagesController().starrefProgramAllowed) {
                soVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.s8 s8Var29 = new org.telegram.ui.Cells.s8(context2);
            soVar.p0 = s8Var29;
            s8Var29.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.p0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            soVar.R.addView(soVar.p0, w7.x5.n(-1, -2));
            final int i37 = 9;
            soVar.p0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i37) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var30 = new org.telegram.ui.Cells.s8(context2);
            soVar.q0 = s8Var30;
            s8Var30.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.q0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            soVar.R.addView(soVar.q0, w7.x5.n(-1, -2));
            final int i38 = 10;
            soVar.q0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var31 = new org.telegram.ui.Cells.s8(context2);
            soVar.r0 = s8Var31;
            s8Var31.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
            soVar.r0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            soVar.R.addView(soVar.r0, w7.x5.n(-1, -2));
            final int i39 = 11;
            soVar.r0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = soVar.x0;
        if (chat6 != null) {
            if (!ChatObject.hasAdminRights(chat6)) {
                soVar.R.setVisibility(8);
                soVar.G.setVisibility(8);
            }
            xdVar.addView(new org.telegram.ui.Cells.a7(context2), w7.x5.n(-1, -2));
        } else if (soVar.D0 != null) {
            soVar.s0 = new org.telegram.ui.Cells.f9(context2, i12, soVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new ro(0), indexOf, indexOf + 10, 33);
            }
            soVar.s0.setText(valueOf);
            xdVar.addView(soVar.s0, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.s8 s8Var32 = new org.telegram.ui.Cells.s8(context2);
            soVar.u0 = s8Var32;
            s8Var32.setBackground(org.telegram.ui.ActionBar.h6.K0(true));
            soVar.u0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.s8 s8Var33 = soVar.u0;
            int i40 = org.telegram.ui.ActionBar.h6.q6;
            s8Var33.e(i40, i40);
            xdVar.addView(soVar.u0, w7.x5.n(-1, -2));
            final int i41 = 13;
            soVar.u0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i41) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j11 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j11;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j11));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j12 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j12;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context2, i12, soVar.resourceProvider);
            soVar.t0 = f9Var2;
            f9Var2.setFixedSize(i12);
            xdVar.addView(soVar.t0, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.s8 s8Var34 = soVar.u0;
            TLRPC.UserFull userFull2 = soVar.E0;
            s8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.f9 f9Var3 = soVar.t0;
            TLRPC.UserFull userFull3 = soVar.E0;
            f9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = soVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                soVar.S = linearLayout5;
                linearLayout5.setOrientation(1);
                xdVar.addView(soVar.S, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
                m4Var.setText(LocaleController.getString(R.string.BotBalance));
                soVar.S.addView(m4Var, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.s8 s8Var35 = new org.telegram.ui.Cells.s8(context2);
                soVar.m0 = s8Var35;
                s8Var35.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                soVar.m0.setPrioritizeTitleOverValue(true);
                soVar.S.addView(soVar.m0, w7.x5.n(-1, -2));
                final yh.o g11 = yh.o.g(soVar.currentAccount);
                final int i42 = 0;
                soVar.m0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ so b;

                    {
                        this.b = soVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i42) {
                            case 0:
                                so soVar3 = this.b;
                                long j11 = soVar3.C0;
                                if (g11.h(j11, false) != null) {
                                    soVar3.presentFragment(new yh.g(1, j11));
                                    break;
                                }
                                break;
                            default:
                                so soVar4 = this.b;
                                long j12 = soVar4.C0;
                                if (g11.h(j12, false) != null) {
                                    soVar4.presentFragment(new yh.g(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.m(j3)) {
                    long i43 = g11.i(j3);
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
                    soVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i90(AndroidUtilities.dp(30.0f), soVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    soVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                soVar.m0.setVisibility(g11.b(j3) ? 0 : 8);
                org.telegram.ui.Cells.s8 s8Var36 = new org.telegram.ui.Cells.s8(context2);
                soVar.n0 = s8Var36;
                s8Var36.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                final int i44 = 1;
                soVar.n0.setPrioritizeTitleOverValue(true);
                soVar.S.addView(soVar.n0, w7.x5.n(-1, -2));
                soVar.n0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ so b;

                    {
                        this.b = soVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i44) {
                            case 0:
                                so soVar3 = this.b;
                                long j11 = soVar3.C0;
                                if (g11.h(j11, false) != null) {
                                    soVar3.presentFragment(new yh.g(1, j11));
                                    break;
                                }
                                break;
                            default:
                                so soVar4 = this.b;
                                long j12 = soVar4.C0;
                                if (g11.h(j12, false) != null) {
                                    soVar4.presentFragment(new yh.g(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j3, false) != null) {
                    org.telegram.ui.Cells.s8 s8Var37 = soVar.n0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j3).amount <= 0) {
                        X0 = charSequence;
                        z10 = false;
                    } else {
                        z10 = false;
                        X0 = yh.w7.X0(false, TextUtils.concat("XTR", yh.w7.K0(g11.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    s8Var37.q(string2, X0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i90(AndroidUtilities.dp(30.0f), soVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    soVar.n0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                soVar.n0.setVisibility(g11.a(j3) ? 0 : 8);
                org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context2, 12, soVar.getResourceProvider());
                f9Var4.setFixedSize(12);
                num2 = num;
                f9Var4.setTag(R.id.fit_width_tag, num2);
                xdVar.addView(f9Var4, w7.x5.n(-1, 12));
                soVar.S.setVisibility((soVar.n0.getVisibility() == 0 || soVar.m0.getVisibility() == 0) ? 0 : 8);
                chat = soVar.x0;
                i13 = 14;
                if ((chat == null && chat.creator) || ((user = soVar.D0) != null && user.bot && user.bot_can_edit)) {
                    final long j11 = chat != null ? chat.linked_community_id : soVar.D0.linked_community_id;
                    final long j12 = chat != null ? -chat.id : soVar.D0.id;
                    final boolean z17 = soVar.D0 != null;
                    if (j11 != 0) {
                        gi.b bVar = new gi.b(context2, soVar.resourceProvider);
                        soVar.h0 = bVar;
                        bVar.a(soVar.currentAccount, soVar.getMessagesController().getChat(Long.valueOf(j11)));
                        final int i45 = 0;
                        soVar.h0.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        soVar.h0.setOnClickListener(new View.OnClickListener(soVar) { // from class: org.telegram.ui.fo
                            public final /* synthetic */ so b;

                            {
                                this.b = soVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i45) {
                                    case 0:
                                        so soVar3 = this.b;
                                        MessagesController messagesController = soVar3.getMessagesController();
                                        long j13 = j11;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j13)))) {
                                            soVar3.showDialog(new fi.k0(soVar3, j13, null, null));
                                            break;
                                        } else {
                                            soVar3.presentFragment(new fi.p(w.c.e(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        so soVar4 = this.b;
                                        soVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j11);
                                        soVar4.presentFragment(new fi.f(bundle));
                                        break;
                                }
                            }
                        });
                        xdVar.addView(soVar.h0, w7.x5.n(-1, -2));
                        org.telegram.ui.Cells.s8 s8Var38 = new org.telegram.ui.Cells.s8(context2);
                        soVar.j0 = s8Var38;
                        s8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : soVar.I0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                        org.telegram.ui.Cells.s8 s8Var39 = soVar.j0;
                        int i46 = org.telegram.ui.ActionBar.h6.p7;
                        s8Var39.e(i46, i46);
                        soVar.j0.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        org.telegram.ui.Cells.s8 s8Var40 = soVar.j0;
                        soVar2 = soVar;
                        f7 = -2.0f;
                        context3 = context;
                        s8Var40.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.go
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                                so soVar3 = so.this;
                                org.telegram.ui.Components.e5.v0(soVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : soVar3.I0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new no(soVar3, j12, j11, 0));
                            }
                        });
                        xdVar.addView(soVar2.j0, w7.x5.n(-1, -2));
                        org.telegram.ui.Cells.f9 f9Var5 = new org.telegram.ui.Cells.f9(context3, 12, soVar2.getResourceProvider());
                        soVar2.k0 = f9Var5;
                        f9Var5.setFixedSize(14);
                        soVar2.k0.setTag(R.id.fit_width_tag, num2);
                        xdVar.addView(soVar2.k0, w7.x5.n(-1, 14));
                    } else {
                        soVar2 = soVar;
                        f7 = -2.0f;
                        context3 = context2;
                        org.telegram.ui.Cells.s8 s8Var41 = new org.telegram.ui.Cells.s8(context3);
                        soVar2.g0 = s8Var41;
                        s8Var41.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                        soVar2.g0.setTextColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.il));
                        soVar2.g0.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                        soVar2.g0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : soVar2.I0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                        final int i47 = 1;
                        soVar2.g0.setOnClickListener(new View.OnClickListener(soVar2) { // from class: org.telegram.ui.fo
                            public final /* synthetic */ so b;

                            {
                                this.b = soVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i47) {
                                    case 0:
                                        so soVar3 = this.b;
                                        MessagesController messagesController = soVar3.getMessagesController();
                                        long j13 = j12;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j13)))) {
                                            soVar3.showDialog(new fi.k0(soVar3, j13, null, null));
                                            break;
                                        } else {
                                            soVar3.presentFragment(new fi.p(w.c.e(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        so soVar4 = this.b;
                                        soVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j12);
                                        soVar4.presentFragment(new fi.f(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.f9 f9Var6 = new org.telegram.ui.Cells.f9(context3, 12, soVar2.resourceProvider);
                        soVar2.i0 = f9Var6;
                        f9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : soVar2.I0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                        xdVar.addView(soVar2.g0, w7.x5.n(-1, -2));
                        xdVar.addView(soVar2.i0, w7.x5.n(-1, -2));
                    }
                } else {
                    soVar2 = soVar;
                    f7 = -2.0f;
                    context3 = context2;
                }
                chat2 = soVar2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context3);
                    soVar2.c0 = frameLayout3;
                    xdVar.addView(frameLayout3, w7.x5.n(-1, -2));
                    org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context3);
                    soVar2.d0 = faVar;
                    faVar.setTextColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.p7));
                    soVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
                    if (soVar2.D0 == null) {
                        soVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
                    } else if (soVar2.I0) {
                        soVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
                    } else {
                        soVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                    }
                    soVar2.c0.addView(soVar2.d0, w7.x5.c(f7, -1));
                    soVar2.d0.setOnClickListener(new View.OnClickListener(soVar2) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ so b;

                        {
                            this.b = soVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    so soVar3 = this.b;
                                    soVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", soVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(soVar3.y0);
                                    soVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    so soVar4 = this.b;
                                    oo ooVar = soVar4.Q0;
                                    long j32 = soVar4.C0;
                                    if (!soVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user22 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                        if (user22 == null) {
                                            TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = soVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().J2(null, soVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    so soVar5 = this.b;
                                    soVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", soVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(soVar5.y0);
                                    soVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    so soVar6 = this.b;
                                    soVar6.presentFragment(new uh0(soVar6.w0));
                                    break;
                                case 4:
                                    so soVar7 = this.b;
                                    soVar7.presentFragment(new ei.e4(-soVar7.w0));
                                    break;
                                case 5:
                                    so soVar8 = this.b;
                                    soVar8.getClass();
                                    soVar8.presentFragment(new ub(soVar8.x0));
                                    break;
                                case 6:
                                    so soVar9 = this.b;
                                    soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                                    break;
                                case 7:
                                    so soVar10 = this.b;
                                    soVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", soVar10.C0);
                                    soVar10.presentFragment(new qa(bundle3));
                                    break;
                                case 8:
                                    so soVar11 = this.b;
                                    soVar11.presentFragment(new ei.l(soVar11.C0));
                                    break;
                                case 9:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    so.X(this.b);
                                    break;
                                case 14:
                                    so soVar12 = this.b;
                                    org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                                    break;
                                case 15:
                                    so soVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                        dd0 dd0Var = new dd0(4);
                                        dd0Var.e0 = -soVar13.w0;
                                        TLRPC.ChatFull chatFull6 = soVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        dd0Var.F0 = new jo(soVar13, 6);
                                        soVar13.presentFragment(dd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    so soVar14 = this.b;
                                    long j102 = soVar14.w0;
                                    org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                                    boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                                    gp gpVar = new gp(null);
                                    gpVar.M = new ArrayList();
                                    gpVar.N = new ArrayList();
                                    gpVar.P = new ArrayList();
                                    gpVar.c0 = true;
                                    gpVar.f0 = new ArrayList();
                                    gpVar.o0 = new HashMap();
                                    gpVar.q0 = new vo(gpVar, 5);
                                    gpVar.t0 = false;
                                    gpVar.Z = j102;
                                    gpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = soVar14.y0;
                                    gpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            gpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            gpVar.X(false);
                                        }
                                    }
                                    soVar14.presentFragment(gpVar);
                                    break;
                                case 17:
                                    so soVar15 = this.b;
                                    long j112 = soVar15.w0;
                                    sp spVar = new sp(null);
                                    spVar.v = new ArrayList();
                                    boolean z162 = false;
                                    spVar.O = false;
                                    spVar.P = false;
                                    spVar.E = j112;
                                    TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j112));
                                    spVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    spVar.s = z162;
                                    spVar.h = soVar15.y0;
                                    soVar15.presentFragment(spVar);
                                    break;
                                case 18:
                                    so soVar16 = this.b;
                                    mw0 mw0Var = new mw0(soVar16.w0);
                                    mw0Var.v = new jo(soVar16, 4);
                                    soVar16.presentFragment(mw0Var);
                                    break;
                                case 19:
                                    so.Z(this.b);
                                    break;
                                case 20:
                                    so soVar17 = this.b;
                                    p60 p60Var = new p60(-soVar17.x0.id);
                                    p60Var.c = soVar17.L0;
                                    p60Var.l0 = soVar17;
                                    soVar17.presentFragment(p60Var);
                                    break;
                                case 21:
                                    so soVar18 = this.b;
                                    soVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", soVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(soVar18.y0);
                                    soVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    so soVar19 = this.b;
                                    th0 th0Var = new th0(soVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = soVar19.y0;
                                    th0Var.g0(chatFull8, chatFull8.exported_invite);
                                    soVar19.presentFragment(th0Var);
                                    break;
                                case 23:
                                    so soVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                        soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", soVar20.w0);
                                        zp zpVar = new zp(bundle5);
                                        zpVar.d = new ArrayList();
                                        zpVar.r = new ArrayList();
                                        zpVar.v = -1;
                                        zpVar.F = new ArrayList();
                                        long j122 = bundle5.getLong("chat_id", 0L);
                                        zpVar.c = j122;
                                        TLRPC.ChatFull chatFull9 = soVar20.y0;
                                        zpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (zpVar.a == null) {
                                                zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j122));
                                            }
                                            zpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                zpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                zpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                                    }
                                                }
                                                zpVar.w = 1;
                                            }
                                        }
                                        soVar20.presentFragment(zpVar);
                                        break;
                                    }
                                default:
                                    so soVar21 = this.b;
                                    soVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", soVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                                    soVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(context3);
                    soVar2.e0 = a7Var2;
                    xdVar.addView(a7Var2, w7.x5.n(-1, -2));
                }
                UndoView undoView = new UndoView(context3);
                soVar2.c = undoView;
                hdVar.addView(undoView, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.ku kuVar6 = soVar2.v;
                TLRPC.User user3 = soVar2.D0;
                kuVar6.setText(Emoji.replaceEmoji(user3 == null ? ContactsController.formatName(user3) : soVar2.x0.title, soVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.ku kuVar7 = soVar2.v;
                kuVar7.setSelection(kuVar7.n());
                chatFull = soVar2.y0;
                if (chatFull == null) {
                    soVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = soVar2.E0;
                    if (userFull4 != null) {
                        soVar2.E.setText(userFull4.about);
                    }
                }
                soVar2.k0();
                soVar2.p0(true, false);
                return soVar2.fragmentView;
            }
        }
        num2 = num;
        chat = soVar.x0;
        i13 = 14;
        if (chat == null) {
        }
        soVar2 = soVar;
        f7 = -2.0f;
        context3 = context2;
        chat2 = soVar2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context3);
            soVar2.c0 = frameLayout32;
            xdVar.addView(frameLayout32, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.fa faVar2 = new org.telegram.ui.Cells.fa(context3);
            soVar2.d0 = faVar2;
            faVar2.setTextColor(org.telegram.ui.ActionBar.h6.u0(org.telegram.ui.ActionBar.h6.p7));
            soVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            if (soVar2.D0 == null) {
            }
            soVar2.c0.addView(soVar2.d0, w7.x5.c(f7, -1));
            soVar2.d0.setOnClickListener(new View.OnClickListener(soVar2) { // from class: org.telegram.ui.bo
                public final /* synthetic */ so b;

                {
                    this.b = soVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            so soVar3 = this.b;
                            soVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", soVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(soVar3.y0);
                            soVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            so soVar4 = this.b;
                            oo ooVar = soVar4.Q0;
                            long j32 = soVar4.C0;
                            if (!soVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j32 == 0 ? null : soVar4.getMessagesController().getUser(Long.valueOf(j32));
                                if (user22 == null) {
                                    TLRPC.Chat chat32 = soVar4.getMessagesController().getChat(Long.valueOf(soVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = soVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(soVar4.y0.chat_photo.video_sizes.get(0), soVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().J2(null, soVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, ooVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            so soVar5 = this.b;
                            soVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", soVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(soVar5.y0);
                            soVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            so soVar6 = this.b;
                            soVar6.presentFragment(new uh0(soVar6.w0));
                            break;
                        case 4:
                            so soVar7 = this.b;
                            soVar7.presentFragment(new ei.e4(-soVar7.w0));
                            break;
                        case 5:
                            so soVar8 = this.b;
                            soVar8.getClass();
                            soVar8.presentFragment(new ub(soVar8.x0));
                            break;
                        case 6:
                            so soVar9 = this.b;
                            soVar9.presentFragment(ra1.d0(soVar9.x0, false));
                            break;
                        case 7:
                            so soVar10 = this.b;
                            soVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", soVar10.C0);
                            soVar10.presentFragment(new qa(bundle3));
                            break;
                        case 8:
                            so soVar11 = this.b;
                            soVar11.presentFragment(new ei.l(soVar11.C0));
                            break;
                        case 9:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            nf.f.s(view.getContext(), "https://t.me/BotFather?start=" + so.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            so.X(this.b);
                            break;
                        case 14:
                            so soVar12 = this.b;
                            org.telegram.ui.Components.e5.s(soVar12, false, soVar12.x0, null, false, true, true, false, new jo(soVar12, 7));
                            break;
                        case 15:
                            so soVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(soVar13)) {
                                dd0 dd0Var = new dd0(4);
                                dd0Var.e0 = -soVar13.w0;
                                TLRPC.ChatFull chatFull6 = soVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        dd0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                dd0Var.F0 = new jo(soVar13, 6);
                                soVar13.presentFragment(dd0Var);
                                break;
                            }
                            break;
                        case 16:
                            so soVar14 = this.b;
                            long j102 = soVar14.w0;
                            org.telegram.ui.Cells.s8 s8Var72 = soVar14.H;
                            boolean z152 = s8Var72 != null && s8Var72.getVisibility() == 0;
                            gp gpVar = new gp(null);
                            gpVar.M = new ArrayList();
                            gpVar.N = new ArrayList();
                            gpVar.P = new ArrayList();
                            gpVar.c0 = true;
                            gpVar.f0 = new ArrayList();
                            gpVar.o0 = new HashMap();
                            gpVar.q0 = new vo(gpVar, 5);
                            gpVar.t0 = false;
                            gpVar.Z = j102;
                            gpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = soVar14.y0;
                            gpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    gpVar.l0 = tL_chatInviteExported;
                                } else {
                                    gpVar.X(false);
                                }
                            }
                            soVar14.presentFragment(gpVar);
                            break;
                        case 17:
                            so soVar15 = this.b;
                            long j112 = soVar15.w0;
                            sp spVar = new sp(null);
                            spVar.v = new ArrayList();
                            boolean z162 = false;
                            spVar.O = false;
                            spVar.P = false;
                            spVar.E = j112;
                            TLRPC.Chat chat42 = spVar.getMessagesController().getChat(Long.valueOf(j112));
                            spVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !spVar.f.megagroup) {
                                z162 = true;
                            }
                            spVar.s = z162;
                            spVar.h = soVar15.y0;
                            soVar15.presentFragment(spVar);
                            break;
                        case 18:
                            so soVar16 = this.b;
                            mw0 mw0Var = new mw0(soVar16.w0);
                            mw0Var.v = new jo(soVar16, 4);
                            soVar16.presentFragment(mw0Var);
                            break;
                        case 19:
                            so.Z(this.b);
                            break;
                        case 20:
                            so soVar17 = this.b;
                            p60 p60Var = new p60(-soVar17.x0.id);
                            p60Var.c = soVar17.L0;
                            p60Var.l0 = soVar17;
                            soVar17.presentFragment(p60Var);
                            break;
                        case 21:
                            so soVar18 = this.b;
                            soVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", soVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((soVar18.I0 || soVar18.x0.gigagroup) && !ChatObject.isCommunity(soVar18.x0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(soVar18.y0);
                            soVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            so soVar19 = this.b;
                            th0 th0Var = new th0(soVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = soVar19.y0;
                            th0Var.g0(chatFull8, chatFull8.exported_invite);
                            soVar19.presentFragment(th0Var);
                            break;
                        case 23:
                            so soVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(soVar20.x0)) {
                                soVar20.presentFragment(new zg.q(soVar20.w0, soVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", soVar20.w0);
                                zp zpVar = new zp(bundle5);
                                zpVar.d = new ArrayList();
                                zpVar.r = new ArrayList();
                                zpVar.v = -1;
                                zpVar.F = new ArrayList();
                                long j122 = bundle5.getLong("chat_id", 0L);
                                zpVar.c = j122;
                                TLRPC.ChatFull chatFull9 = soVar20.y0;
                                zpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (zpVar.a == null) {
                                        zpVar.a = zpVar.getMessagesController().getChat(Long.valueOf(j122));
                                    }
                                    zpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        zpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        zpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                zpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
                                            }
                                        }
                                        zpVar.w = 1;
                                    }
                                }
                                soVar20.presentFragment(zpVar);
                                break;
                            }
                        default:
                            so soVar21 = this.b;
                            soVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", soVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", soVar21.w0);
                            soVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.a7 a7Var22 = new org.telegram.ui.Cells.a7(context3);
            soVar2.e0 = a7Var22;
            xdVar.addView(a7Var22, w7.x5.n(-1, -2));
        }
        UndoView undoView2 = new UndoView(context3);
        soVar2.c = undoView2;
        hdVar.addView(undoView2, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.ku kuVar62 = soVar2.v;
        TLRPC.User user32 = soVar2.D0;
        kuVar62.setText(Emoji.replaceEmoji(user32 == null ? ContactsController.formatName(user32) : soVar2.x0.title, soVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.ku kuVar72 = soVar2.v;
        kuVar72.setSelection(kuVar72.n());
        chatFull = soVar2.y0;
        if (chatFull == null) {
        }
        soVar2.k0();
        soVar2.p0(true, false);
        return soVar2.fragmentView;
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
            org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
            if (c5Var == null || c5Var.getLastFragment() != this) {
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
                    org.telegram.ui.ActionBar.c5 c5Var2 = this.parentLayout;
                    if (c5Var2 == null || c5Var2.getLastFragment() != this) {
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
                yh.o g10 = yh.o.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j3) ? 0 : 8);
                this.n0.u(yh.w7.X0(false, TextUtils.concat("XTR", yh.w7.J0(g10.c(j3), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.s8 s8Var3 = this.l0;
                if (s8Var3 != null) {
                    s8Var3.setNeedDivider(g10.a(j3) || g10.b(j3));
                }
                this.S.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                yh.o g11 = yh.o.g(this.currentAccount);
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

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.ku kuVar;
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
            org.telegram.ui.Components.ku kuVar2 = this.v;
            if ((kuVar2 == null || this.D0.first_name.equals(kuVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new jo(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new jo(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory == this.J0) && (((kuVar = this.v) == null || this.x0.title.equals(kuVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.F0 == this.x0.forum))) {
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
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new jo(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new jo(this, 3));
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

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ wu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        qo qoVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.h6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(qoVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b0, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b0, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.s8 s8Var = this.U;
        if (s8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(s8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.ku kuVar = this.v;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kuVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c0, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e0, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d0, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i17 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.s8 s8Var2 = this.K;
        if (s8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(s8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.s8 s8Var3 = this.a0;
        if (s8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(s8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.a0, 4, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.a0, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new io(this, 0));
    }

    public final void i0() {
        this.s.o(this.v0 != null, new ko(this, 0), new s5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.b0.e.d();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.ku kuVar;
        String str;
        String str2;
        if (this.N0 || (kuVar = this.v) == null) {
            return;
        }
        if (kuVar.a.length() == 0) {
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
            this.b.setOnCancelListener(new ba(this, getConnectionsManager().sendRequest(setbotinfo, new mo(i10, this, setbotinfo)), 2));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.x0) && (!this.J0 || this.F0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.w0, this, new jo(this, 5));
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
            b2Var.setOnCancelListener(new ng(this, r0));
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
                    if ((fragmentStack.get(i10) instanceof xn) && ((xn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.c5 parentLayout = getParentLayout();
                        HashSet hashSet = wf1.n1;
                        ((ActionBarLayout) parentLayout).c(i10, wf1.E0(getMessagesController(), getMessagesStorage(), bundle));
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
        org.telegram.ui.Components.h9 h9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(h9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.v0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, h9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.h()) {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<ci.r6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<ci.r6, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new ai.n(29, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.s8 s8Var2;
        pp0 pp0Var;
        int v02;
        ArrayList<Integer> arrayList;
        zo0 zo0Var = this.L;
        if (zo0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.s8 s8Var3 = this.N;
            boolean z10 = (s8Var3 != null && s8Var3.getVisibility() == 0) || ((s8Var = this.Q) != null && s8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.x0) && ChatObject.hasAdminRights(this.x0)) || ((s8Var2 = this.M) != null && s8Var2.getVisibility() == 0));
            Paint paint = zo0Var.n;
            int i10 = zo0Var.a;
            org.telegram.ui.ActionBar.d6 d6Var = zo0Var.d;
            if (chat == null) {
                return;
            }
            zo0Var.v = z10;
            zo0Var.r = new org.telegram.ui.Components.f01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.h6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            pp0 pp0Var2 = zo0Var.w;
            if (pp0Var2 != null) {
                pp0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = pp0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                zo0Var.w = new pp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    pp0Var = pp0.c(i10, ChatObject.getProfileColorId(chat));
                    pp0Var.a = AndroidUtilities.dp(11.0f);
                    pp0Var.d();
                } else {
                    pp0Var = null;
                }
                zo0Var.w = pp0Var;
            }
            pp0 pp0Var3 = zo0Var.w;
            if (pp0Var3 != null) {
                pp0Var3.e(zo0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                zo0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.1f, i13));
                pp0 pp0Var4 = new pp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                pp0Var4.a = AndroidUtilities.dp(11.0f);
                pp0Var4.d();
                zo0Var.x = pp0Var4;
                pp0Var4.e(zo0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.h6.r8[colorId];
                zo0Var.s = i14;
                v02 = org.telegram.ui.ActionBar.h6.v0(i14, d6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    zo0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.h6.r8[0];
                    zo0Var.s = i15;
                    v02 = org.telegram.ui.ActionBar.h6.v0(i15, d6Var);
                }
            }
            zo0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.1f, v02));
            pp0 a10 = pp0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            zo0Var.x = a10;
            a10.e(zo0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ku kuVar = this.v;
        if (kuVar == null || !kuVar.e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        kuVar.k(true);
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
            org.telegram.ui.Components.h9 h9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.v40 v40Var = this.s;
            v40Var.a = this;
            v40Var.b = this;
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
        org.telegram.ui.Components.h9 h9Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            h9Var2.n(5L, this.x0.title, null);
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
            h9Var2.n(5L, this.D0.first_name, null);
            this.I0 = false;
            this.F0 = false;
            this.H0 = false;
            this.G0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.v40 v40Var2 = this.s;
        v40Var2.a = this;
        v40Var2.b = this;
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
        org.telegram.ui.Components.v40 v40Var = this.s;
        if (v40Var != null) {
            v40Var.e();
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
        org.telegram.ui.Components.ku kuVar = this.v;
        if (kuVar != null) {
            kuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        xd xdVar = this.w;
        if (xdVar != null) {
            xdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
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
        org.telegram.ui.Components.ku kuVar = this.v;
        if (kuVar != null) {
            kuVar.r();
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
        org.telegram.ui.Components.ku kuVar = this.v;
        if (kuVar != null) {
            kuVar.s();
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
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), org.telegram.ui.Cells.q3.i("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.s8 s8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.s8 s8Var13 = this.Q;
                            s8Var12.s(string2, str4, false, i16, s8Var13 != null && s8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.s8 s8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String i17 = org.telegram.ui.Cells.q3.i("@", publicUsername2);
                            int i18 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.s8 s8Var15 = this.Q;
                            s8Var14.s(string3, i17, false, i18, s8Var15 != null && s8Var15.getVisibility() == 0);
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
                    int i19 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.s8 s8Var18 = this.N;
                    s8Var17.s(string4, str5, false, i19, (s8Var18 != null && s8Var18.getVisibility() == 0) || ((s8Var3 = this.J) != null && s8Var3.getVisibility() == 0) || ((s8Var4 = this.Q) != null && s8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.s8 s8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i20 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.s8 s8Var20 = this.N;
                    s8Var19.s(string5, str5, false, i20, (s8Var20 != null && s8Var20.getVisibility() == 0) || ((s8Var = this.J) != null && s8Var.getVisibility() == 0) || ((s8Var2 = this.Q) != null && s8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a4.a.t(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.x0));
                org.telegram.ui.Cells.s8 s8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i21 = R.drawable.msg_channel;
                org.telegram.ui.Cells.s8 s8Var22 = this.N;
                s8Var21.s(string7, string6, false, i21, (s8Var22 != null && s8Var22.getVisibility() == 0) || ((s8Var5 = this.J) != null && s8Var5.getVisibility() == 0) || ((s8Var6 = this.Q) != null && s8Var6.getVisibility() == 0));
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
                    ofFloat.addUpdateListener(new ai.x(10, this, arrayList));
                    this.S0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 4));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.rr.h);
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
                org.telegram.ui.Cells.s8 s8Var23 = this.U;
                if (s8Var23 != null) {
                    if (s8Var23.getParent() == null) {
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
                            i10 = qr.n0(tL_chatBannedRights) + i27;
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
                        org.telegram.ui.Cells.s8 s8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i28 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.s8 s8Var25 = this.Y;
                        s8Var24.s(string8, format, false, i28, s8Var25 != null && s8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.s8 s8Var26 = this.U;
                    if (s8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.y0.requests_pending));
                        int i29 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.s8 s8Var27 = this.Y;
                        s8Var26.s(string9, format2, false, i29, s8Var27 != null && s8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.s8 s8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i30 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.s8 s8Var29 = this.Y;
                    s8Var28.s(string10, format3, false, i30, s8Var29 != null && s8Var29.getVisibility() == 0);
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
                s8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    org.telegram.ui.Cells.s8 s8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i33 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.s8 s8Var32 = this.Y;
                    s8Var31.m(i33, string12, s8Var32 != null && s8Var32.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.s8 s8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i34 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.s8 s8Var34 = this.Y;
                        s8Var33.m(i34, string13, s8Var34 != null && s8Var34.getVisibility() == 0);
                    } else {
                        this.X.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.s8 s8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i35 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.s8 s8Var36 = this.Y;
                    s8Var35.m(i35, string14, s8Var36 != null && s8Var36.getVisibility() == 0);
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
        ry ryVar;
        lx lxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof xn) {
                xn xnVar = (xn) fragmentStack.get(i10);
                if (xnVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(xnVar, false);
                    xnVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, xnVar);
                    if (!this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new wf1(bundle));
                        i10++;
                    }
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof wf1)) {
                wf1 wf1Var = (wf1) fragmentStack.get(i10);
                if (wf1Var.g() != null && wf1Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(wf1Var, false);
                    i10--;
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof ry) && (ryVar = (ry) fragmentStack.get(i10)) != null && (lxVar = ryVar.F3) != null && lxVar.c()) {
                ryVar.F3.a();
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
        org.telegram.ui.Components.v40 v40Var = this.s;
        if (v40Var != null) {
            v40Var.f = bundle.getString("path");
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
        org.telegram.ui.Components.v40 v40Var = this.s;
        if (v40Var != null && (str = v40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ku kuVar = this.v;
        if (kuVar != null) {
            String obj = kuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.u40
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
        this.K.s(LocaleController.getString(R.string.PostSuggestions), yh.w7.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ void P() {
    }
}
