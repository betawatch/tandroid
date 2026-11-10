package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class rn extends org.telegram.ui.ActionBar.f2 implements org.telegram.ui.Components.i30, org.telegram.messenger.ls {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public LinearLayout D;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.y6 G;
    public boolean G0;
    public org.telegram.ui.Cells.m8 H;
    public boolean H0;
    public org.telegram.ui.Cells.m8 I;
    public boolean I0;
    public org.telegram.ui.Cells.m8 J;
    public boolean J0;
    public org.telegram.ui.Cells.m8 K;
    public TLRPC.ChatReactions K0;
    public ql0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.m8 M;
    public boolean M0;
    public org.telegram.ui.Cells.m8 N;
    public boolean N0;
    public org.telegram.ui.Cells.m8 O;
    public boolean O0;
    public org.telegram.ui.Cells.z8 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.m8 Q;
    public final pn Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.zg0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.m8 T;
    public org.telegram.ui.Cells.m8 U;
    public org.telegram.ui.Cells.m8 V;
    public org.telegram.ui.Cells.m8 W;
    public org.telegram.ui.Cells.m8 X;
    public org.telegram.ui.Cells.m8 Y;
    public org.telegram.ui.Cells.m8 Z;
    public org.telegram.ui.ActionBar.c5 a;
    public org.telegram.ui.Cells.m8 a0;
    public org.telegram.ui.ActionBar.u1 b;
    public qn b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.w9 d0;
    public di.d4 e;
    public org.telegram.ui.Cells.m8 e0;
    public fi.p5 f;
    public org.telegram.ui.Cells.m8 f0;
    public ji.b g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.z8 h0;
    public org.telegram.ui.Cells.m8 i0;
    public org.telegram.ui.Cells.z8 j0;
    public org.telegram.ui.Cells.m8 k0;
    public org.telegram.ui.Cells.m8 l0;
    public org.telegram.ui.Cells.m8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.m8 n0;
    public org.telegram.ui.Cells.m8 o0;
    public org.telegram.ui.Cells.m8 p0;
    public org.telegram.ui.Cells.m8 q0;
    public final org.telegram.ui.Components.v8 r;
    public org.telegram.ui.Cells.z8 r0;
    public final org.telegram.ui.Components.j30 s;
    public org.telegram.ui.Cells.z8 s0;
    public org.telegram.ui.Cells.m8 t0;
    public TLRPC.FileLocation u0;
    public long v0;
    public org.telegram.ui.Components.kt w;
    public TLRPC.Chat w0;
    public org.telegram.ui.Components.gm0 x;
    public TLRPC.ChatFull x0;
    public org.telegram.ui.Components.hm0 y;
    public TLRPC.TL_chatAdminRights y0;
    public TLRPC.TL_chatBannedRights z0;

    public rn(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new pn(this);
        this.r = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.v0 == 0) {
            this.s = new org.telegram.ui.Components.j30(0, false, false);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.v0));
            this.s = new org.telegram.ui.Components.j30((M0 == null || !org.telegram.messenger.t3.V(M0)) ? 2 : 1, true, true);
        }
    }

    public static void Z(rn rnVar, FrameLayout frameLayout, View view) {
        int i7 = 3;
        if (!rnVar.F0) {
            TLRPC.ChatFull chatFull = rnVar.x0;
            org.telegram.ui.Components.gc.a0(rnVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(rnVar.getMessagesController().c5, "ChannelTopicsForbidden", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131752280, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j3 = -rnVar.v0;
        qx qxVar = new qx(null);
        qxVar.a = j3;
        qxVar.setResourceProvider(rnVar.resourceProvider);
        boolean z9 = rnVar.E0;
        boolean z10 = rnVar.G0;
        boolean z11 = rnVar.H0;
        di.b0 b0Var = new di.b0(i7, rnVar, view);
        qxVar.c = z9;
        qxVar.d = z10;
        qxVar.e = z11;
        qxVar.h = b0Var;
        rnVar.presentFragment(qxVar);
    }

    public static /* synthetic */ void a0(rn rnVar) {
        rnVar.u0 = null;
        long j3 = rnVar.B0;
        if (j3 == 0) {
            org.telegram.messenger.qp.s1(rnVar.currentAccount).B(rnVar.v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().o1(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ln(rnVar, 2));
        }
        rnVar.s0(false, true);
        di.d4 d4Var = rnVar.e;
        org.telegram.ui.Components.v8 v8Var = rnVar.r;
        Object obj = rnVar.C0;
        if (obj == null) {
            obj = rnVar.w0;
        }
        d4Var.j(null, null, v8Var, obj);
        rnVar.R0.M(0);
        rnVar.b0.e.d();
    }

    public static void b0(rn rnVar, long j3, long j10) {
        org.telegram.messenger.qp.s1(rnVar.currentAccount).Q2(j3, j10, true, false, new a5(rnVar, 4));
    }

    public static void c0(rn rnVar) {
        int i7 = rnVar.currentAccount;
        long j3 = rnVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = rnVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle h = org.telegram.ui.Cells.f1.h(16, "onlySelect", "dialogsType", true);
        h.putBoolean("resetDelegate", false);
        zw zwVar = new zw(h);
        zwVar.setCurrentAccount(i7);
        zwVar.D2 = new hi.n1(zwVar, i7, j3, botVerifierSettings);
        T.presentFragment(zwVar);
    }

    public static void d0(rn rnVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, org.telegram.messenger.e3 e3Var) {
        u1Var.dismiss();
        if (rnVar.getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(35, rnVar.currentAccount, rnVar.getParentActivity(), rnVar, rnVar.getResourceProvider());
        i0Var.A1(e3Var);
        i0Var.z1(tL_premium_boostsStatus, true);
        i0Var.B1(j3);
        TLRPC.Chat M0 = rnVar.getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            i0Var.L2 = new oe(20, rnVar, M0);
        }
        rnVar.showDialog(i0Var);
    }

    public static void e0(rn rnVar) {
        rc rcVar = new rc(-rnVar.w0.id);
        rcVar.l0 = rnVar;
        rnVar.presentFragment(rcVar);
        org.telegram.messenger.qp.s1(rnVar.currentAccount).e7.edit().putInt("boostingappearance", org.telegram.messenger.qp.s1(rnVar.currentAccount).e7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void f0(rn rnVar) {
        rnVar.O0 = true;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(rnVar.currentAccount);
        int i7 = org.telegram.messenger.qp.C8;
        f10.k(org.telegram.messenger.qs.r, 2);
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz(10);
        hzVar.a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        hzVar.f = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zk, false);
        hzVar.n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String l0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i7);
            i7++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x0455, code lost:
    
        if (org.telegram.messenger.t3.y(0, r35.w0) != false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x1064  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x10c8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x10f4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x10fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x10cd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06d2  */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v4, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r22;
        int i7;
        Context context2;
        org.telegram.ui.Components.gm0 gm0Var;
        final rn rnVar;
        int i10;
        int i11;
        org.telegram.ui.Components.gm0 gm0Var2;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i12;
        boolean z9;
        CharSequence a12;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        TLRPC.User user;
        org.telegram.ui.Components.gm0 gm0Var3;
        final rn rnVar2;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        boolean z10;
        String format;
        int i13;
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        int i14;
        int i15;
        org.telegram.ui.Cells.m8 m8Var3;
        org.telegram.ui.Cells.m8 m8Var4;
        org.telegram.ui.Cells.m8 m8Var5;
        org.telegram.ui.Cells.m8 m8Var6;
        TLRPC.ChatFull chatFull2;
        boolean z11;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i16 = 1;
        setHasOwnBackground(true);
        org.telegram.ui.Components.kt ktVar = this.w;
        if (ktVar != null) {
            ktVar.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 5));
        xc xcVar = new xc(i16, context, this);
        xcVar.setOnTouchListener(new ei.b(9));
        this.fragmentView = xcVar;
        org.telegram.ui.Components.gm0 gm0Var4 = new org.telegram.ui.Components.gm0(context);
        this.x = gm0Var4;
        org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(context, this.x, this.resourceProvider, false);
        this.y = hm0Var;
        hm0Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        xcVar.addView(this.y, c8.ha.c(-1.0f, -1));
        this.y.addView(gm0Var4, new FrameLayout.LayoutParams(-1, -2));
        gm0Var4.setOrientation(1);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.L0(2131752415));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i17 = org.telegram.ui.ActionBar.m6.d6;
        org.telegram.ui.ActionBar.t6.h(i17, linearLayout2, null);
        gm0Var4.addView(this.d, c8.ha.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, c8.ha.o(-1, -2));
        int i18 = 6;
        di.d4 d4Var = new di.d4(i18, context, this);
        this.e = d4Var;
        d4Var.setRoundRadius(this.E0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(32.0f));
        int i19 = 3;
        if (this.C0 != null || org.telegram.messenger.t3.d(this.w0)) {
            di.d4 d4Var2 = this.e;
            boolean z12 = org.telegram.messenger.id.a0;
            frameLayout2.addView(d4Var2, c8.ha.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fi.p5 p5Var = new fi.p5(this, context, paint, i18);
            this.f = p5Var;
            boolean z13 = org.telegram.messenger.id.a0;
            frameLayout2.addView(p5Var, c8.ha.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = org.telegram.messenger.id.a0;
            frameLayout2.addView(radialProgressView2, c8.ha.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            s0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j3 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j3 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j3));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i20 = chatPhoto2.dc_id;
                                        if (i20 != 0) {
                                            chatPhoto2.photo_big.dc_id = i20;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j10 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var7 = rnVar14.H;
                            boolean z15 = m8Var7 != null && m8Var7.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j10;
                            ioVar.n0 = z15;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z16 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z16 = true;
                            }
                            uoVar.s = z16;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i22 = 0; i22 < tL_chatReactionsSome.reactions.size(); i22++) {
                                            if (tL_chatReactionsSome.reactions.get(i22) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i22)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
        } else {
            di.d4 d4Var3 = this.e;
            boolean z15 = org.telegram.messenger.id.a0;
            frameLayout2.addView(d4Var3, c8.ha.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.kt ktVar2 = new org.telegram.ui.Components.kt(context, xcVar, this);
        this.w = ktVar2;
        long j3 = this.B0;
        if (j3 != 0) {
            r22 = 0;
            ktVar2.setHint(org.telegram.messenger.id.L0(2131753021));
        } else if (this.I0) {
            ktVar2.setHint(org.telegram.messenger.id.M0(2131751124, "EnterChannelName"));
            r22 = false;
        } else {
            ktVar2.setHint(org.telegram.messenger.id.M0(2131749422, "GroupName"));
            r22 = false;
        }
        org.telegram.ui.Components.kt ktVar3 = this.w;
        TLRPC.Chat chat3 = this.w0;
        ktVar3.setEnabled((chat3 != null || org.telegram.messenger.t3.d(chat3)) ? true : r22);
        org.telegram.ui.Components.kt ktVar4 = this.w;
        ktVar4.setFocusable(ktVar4.isEnabled());
        this.w.getEditText().addTextChangedListener(new m0(this, i19));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r22] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        org.telegram.ui.Components.kt ktVar5 = this.w;
        boolean z16 = org.telegram.messenger.id.a0;
        frameLayout2.addView(ktVar5, c8.ha.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.D = linearLayout3;
        linearLayout3.setOrientation(1);
        gm0Var4.addView(this.D, c8.ha.o(-1, -2));
        final int i20 = 12;
        if (this.C0 != null || org.telegram.messenger.t3.d(this.w0)) {
            qn qnVar = new qn(context);
            this.b0 = qnVar;
            org.telegram.ui.ActionBar.t6.R(qnVar, org.telegram.ui.ActionBar.m6.N0(r22), null, org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
            this.b0.g(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i20) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j10 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var7 = rnVar14.H;
                            boolean z152 = m8Var7 != null && m8Var7.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j10;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i22 = 0; i22 < tL_chatReactionsSome.reactions.size(); i22++) {
                                            if (tL_chatReactionsSome.reactions.get(i22) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i22)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            this.D.addView(this.b0, c8.ha.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.E(this.E, org.telegram.ui.ActionBar.m6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i21 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor2, i21, null);
        int i22 = r22;
        this.E.setPadding(i22, i22, i22, org.telegram.messenger.g0.L(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.C0 != null || org.telegram.messenger.t3.d(this.w0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.qs.e4)});
        this.E.setHint(org.telegram.messenger.id.M0(2131751460, "DescriptionOptionalPlaceholder"));
        org.telegram.ui.ActionBar.t6.u(this.E, i21);
        this.E.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.D.addView(this.E, c8.ha.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.D.addView(this.E, c8.ha.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new fa(this, 2));
        this.E.addTextChangedListener(new ad(1));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context);
        this.G = y6Var;
        gm0Var4.addView(y6Var, c8.ha.o(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        gm0Var4.addView(this.F, c8.ha.o(-1, -2));
        TLRPC.Chat chat4 = this.w0;
        if (chat4 != null) {
            final int i23 = 15;
            if (chat4.megagroup && ((chatFull4 = this.x0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.m8 m8Var7 = new org.telegram.ui.Cells.m8(context);
                this.H = m8Var7;
                z11 = true;
                org.telegram.ui.ActionBar.t6.R(m8Var7, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i17), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                this.F.addView(this.H, c8.ha.o(-1, -2));
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                rn rnVar3 = this.b;
                                rnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar3.x0);
                                rnVar3.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar4 = this.b;
                                pn pnVar = rnVar4.Q0;
                                long j32 = rnVar4.B0;
                                if (!rnVar4.s.g()) {
                                    org.telegram.messenger.hc hcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar5.x0);
                                rnVar5.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar6 = this.b;
                                rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                break;
                            case 4:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                break;
                            case 5:
                                rn rnVar8 = this.b;
                                rnVar8.getClass();
                                rnVar8.presentFragment(new mb(rnVar8.w0));
                                break;
                            case 6:
                                rn rnVar9 = this.b;
                                rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                break;
                            case 7:
                                rn rnVar10 = this.b;
                                rnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar10.B0);
                                rnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar11 = this.b;
                                rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar12 = this.b;
                                org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                break;
                            case 15:
                                rn rnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar13)) {
                                    sa0 sa0Var = new sa0(4);
                                    sa0Var.l0 = -rnVar13.v0;
                                    TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sa0Var.G0 = new mn(rnVar13, 6);
                                    rnVar13.presentFragment(sa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar14 = this.b;
                                long j10 = rnVar14.v0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.M = new ArrayList();
                                ioVar.N = new ArrayList();
                                ioVar.P = new ArrayList();
                                ioVar.c0 = true;
                                ioVar.f0 = new ArrayList();
                                ioVar.o0 = new HashMap();
                                ioVar.q0 = new tn(ioVar, 5);
                                ioVar.s0 = false;
                                ioVar.Z = j10;
                                ioVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                ioVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.l0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar14.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar15 = this.b;
                                long j11 = rnVar15.v0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.O = false;
                                uoVar.P = false;
                                uoVar.E = j11;
                                TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                uoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar15.x0;
                                rnVar15.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar16 = this.b;
                                ks0 ks0Var = new ks0(rnVar16.v0);
                                ks0Var.s = new mn(rnVar16, 4);
                                rnVar16.presentFragment(ks0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar17 = this.b;
                                m40 m40Var = new m40(-rnVar17.w0.id);
                                m40Var.c = rnVar17.L0;
                                m40Var.l0 = rnVar17;
                                rnVar17.presentFragment(m40Var);
                                break;
                            case 21:
                                rn rnVar18 = this.b;
                                rnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar18.x0);
                                rnVar18.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar19 = this.b;
                                ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                rnVar19.presentFragment(ff0Var);
                                break;
                            case 23:
                                rn rnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                    rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar20.v0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                    bpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar20.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar21 = this.b;
                                rnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                rnVar21.presentFragment(new cn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                z11 = true;
            }
            if (this.w0.creator && ((chatFull3 = this.x0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.m8 m8Var8 = new org.telegram.ui.Cells.m8(context);
                this.I = m8Var8;
                org.telegram.ui.ActionBar.t6.R(m8Var8, org.telegram.ui.ActionBar.m6.N0(z11), org.telegram.ui.ActionBar.t6.M(i17), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                this.F.addView(this.I, c8.ha.o(-1, -2));
                final int i24 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                rn rnVar3 = this.b;
                                rnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar3.x0);
                                rnVar3.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar4 = this.b;
                                pn pnVar = rnVar4.Q0;
                                long j32 = rnVar4.B0;
                                if (!rnVar4.s.g()) {
                                    org.telegram.messenger.hc hcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar5.x0);
                                rnVar5.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar6 = this.b;
                                rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                break;
                            case 4:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                break;
                            case 5:
                                rn rnVar8 = this.b;
                                rnVar8.getClass();
                                rnVar8.presentFragment(new mb(rnVar8.w0));
                                break;
                            case 6:
                                rn rnVar9 = this.b;
                                rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                break;
                            case 7:
                                rn rnVar10 = this.b;
                                rnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar10.B0);
                                rnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar11 = this.b;
                                rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar12 = this.b;
                                org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                break;
                            case 15:
                                rn rnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar13)) {
                                    sa0 sa0Var = new sa0(4);
                                    sa0Var.l0 = -rnVar13.v0;
                                    TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sa0Var.G0 = new mn(rnVar13, 6);
                                    rnVar13.presentFragment(sa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar14 = this.b;
                                long j10 = rnVar14.v0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.M = new ArrayList();
                                ioVar.N = new ArrayList();
                                ioVar.P = new ArrayList();
                                ioVar.c0 = true;
                                ioVar.f0 = new ArrayList();
                                ioVar.o0 = new HashMap();
                                ioVar.q0 = new tn(ioVar, 5);
                                ioVar.s0 = false;
                                ioVar.Z = j10;
                                ioVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                ioVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.l0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar14.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar15 = this.b;
                                long j11 = rnVar15.v0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.O = false;
                                uoVar.P = false;
                                uoVar.E = j11;
                                TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                uoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar15.x0;
                                rnVar15.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar16 = this.b;
                                ks0 ks0Var = new ks0(rnVar16.v0);
                                ks0Var.s = new mn(rnVar16, 4);
                                rnVar16.presentFragment(ks0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar17 = this.b;
                                m40 m40Var = new m40(-rnVar17.w0.id);
                                m40Var.c = rnVar17.L0;
                                m40Var.l0 = rnVar17;
                                rnVar17.presentFragment(m40Var);
                                break;
                            case 21:
                                rn rnVar18 = this.b;
                                rnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar18.x0);
                                rnVar18.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar19 = this.b;
                                ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                rnVar19.presentFragment(ff0Var);
                                break;
                            case 23:
                                rn rnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                    rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar20.v0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                    bpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar20.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar21 = this.b;
                                rnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                rnVar21.presentFragment(new cn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.T(this.w0)) {
                if (!this.I0 || !org.telegram.messenger.t3.y(z11 ? 1 : 0, this.w0)) {
                    if (!this.I0) {
                    }
                }
                org.telegram.ui.Cells.m8 m8Var9 = new org.telegram.ui.Cells.m8(context);
                this.J = m8Var9;
                org.telegram.ui.ActionBar.t6.R(m8Var9, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i17), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                this.F.addView(this.J, c8.ha.o(-1, -2));
                final int i25 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                rn rnVar3 = this.b;
                                rnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar3.x0);
                                rnVar3.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar4 = this.b;
                                pn pnVar = rnVar4.Q0;
                                long j32 = rnVar4.B0;
                                if (!rnVar4.s.g()) {
                                    org.telegram.messenger.hc hcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar5.x0);
                                rnVar5.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar6 = this.b;
                                rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                break;
                            case 4:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                break;
                            case 5:
                                rn rnVar8 = this.b;
                                rnVar8.getClass();
                                rnVar8.presentFragment(new mb(rnVar8.w0));
                                break;
                            case 6:
                                rn rnVar9 = this.b;
                                rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                break;
                            case 7:
                                rn rnVar10 = this.b;
                                rnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar10.B0);
                                rnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar11 = this.b;
                                rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar12 = this.b;
                                org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                break;
                            case 15:
                                rn rnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar13)) {
                                    sa0 sa0Var = new sa0(4);
                                    sa0Var.l0 = -rnVar13.v0;
                                    TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sa0Var.G0 = new mn(rnVar13, 6);
                                    rnVar13.presentFragment(sa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar14 = this.b;
                                long j10 = rnVar14.v0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.M = new ArrayList();
                                ioVar.N = new ArrayList();
                                ioVar.P = new ArrayList();
                                ioVar.c0 = true;
                                ioVar.f0 = new ArrayList();
                                ioVar.o0 = new HashMap();
                                ioVar.q0 = new tn(ioVar, 5);
                                ioVar.s0 = false;
                                ioVar.Z = j10;
                                ioVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                ioVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.l0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar14.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar15 = this.b;
                                long j11 = rnVar15.v0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.O = false;
                                uoVar.P = false;
                                uoVar.E = j11;
                                TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                uoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar15.x0;
                                rnVar15.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar16 = this.b;
                                ks0 ks0Var = new ks0(rnVar16.v0);
                                ks0Var.s = new mn(rnVar16, 4);
                                rnVar16.presentFragment(ks0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar17 = this.b;
                                m40 m40Var = new m40(-rnVar17.w0.id);
                                m40Var.c = rnVar17.L0;
                                m40Var.l0 = rnVar17;
                                rnVar17.presentFragment(m40Var);
                                break;
                            case 21:
                                rn rnVar18 = this.b;
                                rnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar18.x0);
                                rnVar18.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar19 = this.b;
                                ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                rnVar19.presentFragment(ff0Var);
                                break;
                            case 23:
                                rn rnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                    rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar20.v0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                    bpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar20.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar21 = this.b;
                                rnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                rnVar21.presentFragment(new cn(bundle6));
                                break;
                        }
                    }
                });
                if (org.telegram.messenger.t3.V(this.w0) && this.I0 && org.telegram.messenger.t3.y(1, this.w0)) {
                    org.telegram.ui.Cells.m8 m8Var10 = new org.telegram.ui.Cells.m8(context);
                    this.K = m8Var10;
                    org.telegram.ui.ActionBar.t6.R(m8Var10, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i17), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    this.K.s(org.telegram.messenger.id.L0(2131747096), "", R.drawable.msg_markunread, true);
                    this.F.addView(this.K, c8.ha.o(-1, -2));
                    final int i26 = 18;
                    this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j10 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j10;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.t3.V(this.w0) || !org.telegram.messenger.t3.d(this.w0)) {
                    i7 = i17;
                } else {
                    i7 = i17;
                    ql0 ql0Var = new ql0(this.currentAccount, -this.w0.id, context, getResourceProvider());
                    this.L = ql0Var;
                    org.telegram.ui.ActionBar.t6.R(ql0Var, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    this.F.addView(this.L, c8.ha.o(-1, -2));
                    final int i27 = 19;
                    this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j10 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j10;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.t3.V(this.w0) || org.telegram.messenger.t3.Y(this.w0)) {
                    context3 = context;
                    frameLayout = frameLayout2;
                    gm0Var = gm0Var4;
                    rnVar = this;
                } else {
                    long j10 = -this.w0.id;
                    gm0Var = gm0Var4;
                    org.telegram.ui.Cells.m8 m8Var11 = new org.telegram.ui.Cells.m8(23, context, this.resourceProvider, false, true);
                    context3 = context;
                    this.M = m8Var11;
                    org.telegram.ui.ActionBar.t6.R(m8Var11, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    this.M.n(R.drawable.msg_translate, org.telegram.messenger.id.L0(2131752458), this.w0.autotranslation);
                    final int i28 = 0;
                    getMessagesController().G0().a(j10, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.kn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj) {
                            int i29 = i28;
                            rn rnVar3 = this.b;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            switch (i29) {
                                case 0:
                                    if (tL_premium_boostsStatus == null) {
                                        rnVar3.getClass();
                                        break;
                                    } else {
                                        rnVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar3.getMessagesController().A4 ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                default:
                                    rnVar3.L0 = tL_premium_boostsStatus;
                                    break;
                            }
                        }
                    });
                    this.F.addView(this.M, c8.ha.o(-1, -2));
                    frameLayout = frameLayout2;
                    rnVar = this;
                    this.M.setOnClickListener(new bi.p3(this, new boolean[]{false}, j10, 1));
                }
                if (!rnVar.I0 && org.telegram.messenger.t3.w(2, rnVar.w0) && (org.telegram.messenger.t3.T(rnVar.w0) || rnVar.w0.creator)) {
                    org.telegram.ui.Cells.m8 m8Var12 = new org.telegram.ui.Cells.m8(context3);
                    rnVar.N = m8Var12;
                    org.telegram.ui.ActionBar.t6.R(m8Var12, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    rnVar.F.addView(rnVar.N, c8.ha.o(-1, -2));
                    rnVar.N.setOnClickListener(new org.telegram.ui.ActionBar.l1(14, rnVar, context3));
                }
                if (org.telegram.messenger.t3.n0(rnVar.w0) && org.telegram.messenger.t3.N(rnVar.w0) && !org.telegram.messenger.t3.Y(rnVar.w0)) {
                    final int i29 = 1;
                    org.telegram.messenger.qp.s1(rnVar.currentAccount).G0().a(-rnVar.w0.id, new org.telegram.messenger.c20(rnVar) { // from class: org.telegram.ui.kn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj) {
                            int i292 = i29;
                            rn rnVar3 = this.b;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            switch (i292) {
                                case 0:
                                    if (tL_premium_boostsStatus == null) {
                                        rnVar3.getClass();
                                        break;
                                    } else {
                                        rnVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar3.getMessagesController().A4 ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                default:
                                    rnVar3.L0 = tL_premium_boostsStatus;
                                    break;
                            }
                        }
                    });
                    ql0 ql0Var2 = new ql0(rnVar.currentAccount, -rnVar.w0.id, context3, rnVar.getResourceProvider());
                    rnVar.L = ql0Var2;
                    org.telegram.ui.ActionBar.t6.R(ql0Var2, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    rnVar.F.addView(rnVar.L, c8.ha.o(-1, -2));
                    final int i30 = 20;
                    rnVar.L.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                }
                if (!rnVar.I0 && rnVar.w0.creator) {
                    org.telegram.ui.Cells.m8 m8Var13 = new org.telegram.ui.Cells.m8(23, context, null, false, true);
                    context2 = context;
                    rnVar.Q = m8Var13;
                    org.telegram.ui.ActionBar.t6.R(m8Var13, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    rnVar.Q.n(R.drawable.msg_topics, org.telegram.messenger.id.L0(2131752281), rnVar.E0);
                    rnVar.Q.getCheckBox().setIcon(!rnVar.F0 ? 0 : R.drawable.permission_locked);
                    rnVar.F.addView(rnVar.Q, c8.ha.c(-2.0f, -1));
                    rnVar.Q.setOnClickListener(new org.telegram.ui.ActionBar.l1(15, rnVar, frameLayout));
                } else {
                    context2 = context;
                }
                rnVar.t0();
            }
            if (org.telegram.messenger.t3.V(this.w0)) {
                org.telegram.ui.Cells.m8 m8Var102 = new org.telegram.ui.Cells.m8(context);
                this.K = m8Var102;
                org.telegram.ui.ActionBar.t6.R(m8Var102, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i17), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                this.K.s(org.telegram.messenger.id.L0(2131747096), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, c8.ha.o(-1, -2));
                final int i262 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i262) {
                            case 0:
                                rn rnVar3 = this.b;
                                rnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar3.x0);
                                rnVar3.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar4 = this.b;
                                pn pnVar = rnVar4.Q0;
                                long j32 = rnVar4.B0;
                                if (!rnVar4.s.g()) {
                                    org.telegram.messenger.hc hcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar5.x0);
                                rnVar5.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar6 = this.b;
                                rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                break;
                            case 4:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                break;
                            case 5:
                                rn rnVar8 = this.b;
                                rnVar8.getClass();
                                rnVar8.presentFragment(new mb(rnVar8.w0));
                                break;
                            case 6:
                                rn rnVar9 = this.b;
                                rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                break;
                            case 7:
                                rn rnVar10 = this.b;
                                rnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar10.B0);
                                rnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar11 = this.b;
                                rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar12 = this.b;
                                org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                break;
                            case 15:
                                rn rnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar13)) {
                                    sa0 sa0Var = new sa0(4);
                                    sa0Var.l0 = -rnVar13.v0;
                                    TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sa0Var.G0 = new mn(rnVar13, 6);
                                    rnVar13.presentFragment(sa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar14 = this.b;
                                long j102 = rnVar14.v0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.M = new ArrayList();
                                ioVar.N = new ArrayList();
                                ioVar.P = new ArrayList();
                                ioVar.c0 = true;
                                ioVar.f0 = new ArrayList();
                                ioVar.o0 = new HashMap();
                                ioVar.q0 = new tn(ioVar, 5);
                                ioVar.s0 = false;
                                ioVar.Z = j102;
                                ioVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                ioVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.l0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar14.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar15 = this.b;
                                long j11 = rnVar15.v0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.O = false;
                                uoVar.P = false;
                                uoVar.E = j11;
                                TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                uoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar15.x0;
                                rnVar15.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar16 = this.b;
                                ks0 ks0Var = new ks0(rnVar16.v0);
                                ks0Var.s = new mn(rnVar16, 4);
                                rnVar16.presentFragment(ks0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar17 = this.b;
                                m40 m40Var = new m40(-rnVar17.w0.id);
                                m40Var.c = rnVar17.L0;
                                m40Var.l0 = rnVar17;
                                rnVar17.presentFragment(m40Var);
                                break;
                            case 21:
                                rn rnVar18 = this.b;
                                rnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar18.x0);
                                rnVar18.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar19 = this.b;
                                ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                rnVar19.presentFragment(ff0Var);
                                break;
                            case 23:
                                rn rnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                    rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar20.v0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                    bpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar20.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar21 = this.b;
                                rnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                rnVar21.presentFragment(new cn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.V(this.w0)) {
            }
            i7 = i17;
            if (org.telegram.messenger.t3.V(this.w0)) {
            }
            context3 = context;
            frameLayout = frameLayout2;
            gm0Var = gm0Var4;
            rnVar = this;
            if (!rnVar.I0) {
                org.telegram.ui.Cells.m8 m8Var122 = new org.telegram.ui.Cells.m8(context3);
                rnVar.N = m8Var122;
                org.telegram.ui.ActionBar.t6.R(m8Var122, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                rnVar.F.addView(rnVar.N, c8.ha.o(-1, -2));
                rnVar.N.setOnClickListener(new org.telegram.ui.ActionBar.l1(14, rnVar, context3));
            }
            if (org.telegram.messenger.t3.n0(rnVar.w0)) {
                final int i292 = 1;
                org.telegram.messenger.qp.s1(rnVar.currentAccount).G0().a(-rnVar.w0.id, new org.telegram.messenger.c20(rnVar) { // from class: org.telegram.ui.kn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        int i2922 = i292;
                        rn rnVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i2922) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    rnVar3.getClass();
                                    break;
                                } else {
                                    rnVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar3.getMessagesController().A4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                rnVar3.L0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                ql0 ql0Var22 = new ql0(rnVar.currentAccount, -rnVar.w0.id, context3, rnVar.getResourceProvider());
                rnVar.L = ql0Var22;
                org.telegram.ui.ActionBar.t6.R(ql0Var22, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                rnVar.F.addView(rnVar.L, c8.ha.o(-1, -2));
                final int i302 = 20;
                rnVar.L.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i302) {
                            case 0:
                                rn rnVar3 = this.b;
                                rnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar3.x0);
                                rnVar3.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar4 = this.b;
                                pn pnVar = rnVar4.Q0;
                                long j32 = rnVar4.B0;
                                if (!rnVar4.s.g()) {
                                    org.telegram.messenger.hc hcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().H2(null, rnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar5.x0);
                                rnVar5.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar6 = this.b;
                                rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                break;
                            case 4:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                break;
                            case 5:
                                rn rnVar8 = this.b;
                                rnVar8.getClass();
                                rnVar8.presentFragment(new mb(rnVar8.w0));
                                break;
                            case 6:
                                rn rnVar9 = this.b;
                                rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                break;
                            case 7:
                                rn rnVar10 = this.b;
                                rnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar10.B0);
                                rnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar11 = this.b;
                                rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar12 = this.b;
                                org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                break;
                            case 15:
                                rn rnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar13)) {
                                    sa0 sa0Var = new sa0(4);
                                    sa0Var.l0 = -rnVar13.v0;
                                    TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sa0Var.G0 = new mn(rnVar13, 6);
                                    rnVar13.presentFragment(sa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar14 = this.b;
                                long j102 = rnVar14.v0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.M = new ArrayList();
                                ioVar.N = new ArrayList();
                                ioVar.P = new ArrayList();
                                ioVar.c0 = true;
                                ioVar.f0 = new ArrayList();
                                ioVar.o0 = new HashMap();
                                ioVar.q0 = new tn(ioVar, 5);
                                ioVar.s0 = false;
                                ioVar.Z = j102;
                                ioVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                ioVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.l0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar14.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar15 = this.b;
                                long j11 = rnVar15.v0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.O = false;
                                uoVar.P = false;
                                uoVar.E = j11;
                                TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                uoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar15.x0;
                                rnVar15.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar16 = this.b;
                                ks0 ks0Var = new ks0(rnVar16.v0);
                                ks0Var.s = new mn(rnVar16, 4);
                                rnVar16.presentFragment(ks0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar17 = this.b;
                                m40 m40Var = new m40(-rnVar17.w0.id);
                                m40Var.c = rnVar17.L0;
                                m40Var.l0 = rnVar17;
                                rnVar17.presentFragment(m40Var);
                                break;
                            case 21:
                                rn rnVar18 = this.b;
                                rnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar18.x0);
                                rnVar18.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar19 = this.b;
                                ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                rnVar19.presentFragment(ff0Var);
                                break;
                            case 23:
                                rn rnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                    rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar20.v0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                    bpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar20.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar21 = this.b;
                                rnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                rnVar21.presentFragment(new cn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (rnVar.I0) {
                org.telegram.ui.Cells.m8 m8Var132 = new org.telegram.ui.Cells.m8(23, context, null, false, true);
                context2 = context;
                rnVar.Q = m8Var132;
                org.telegram.ui.ActionBar.t6.R(m8Var132, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(i7), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                rnVar.Q.n(R.drawable.msg_topics, org.telegram.messenger.id.L0(2131752281), rnVar.E0);
                rnVar.Q.getCheckBox().setIcon(!rnVar.F0 ? 0 : R.drawable.permission_locked);
                rnVar.F.addView(rnVar.Q, c8.ha.c(-2.0f, -1));
                rnVar.Q.setOnClickListener(new org.telegram.ui.ActionBar.l1(15, rnVar, frameLayout));
                rnVar.t0();
            }
            context2 = context;
            rnVar.t0();
        } else {
            i7 = i17;
            context2 = context;
            gm0Var = gm0Var4;
            rnVar = this;
        }
        rnVar.simpleActionBar.q();
        if (rnVar.C0 != null || org.telegram.messenger.t3.d(rnVar.w0) || rnVar.N != null) {
            rnVar.a = rnVar.simpleActionBar.p(org.telegram.messenger.id.L0(2131745946));
        }
        if (rnVar.H == null && rnVar.N == null && rnVar.I == null && rnVar.J == null && rnVar.Q == null) {
            gm0Var2 = gm0Var;
            i10 = -2;
            i11 = -1;
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context2, rnVar.resourceProvider);
            rnVar.P = z8Var;
            if (rnVar.Q != null) {
                z8Var.setText(org.telegram.messenger.id.L0(2131750588));
            } else {
                z8Var.setFixedSize(12);
            }
            i10 = -2;
            i11 = -1;
            gm0Var2 = gm0Var;
            gm0Var2.addView(rnVar.P, c8.ha.o(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        rnVar.R = linearLayout5;
        linearLayout5.setOrientation(1);
        gm0Var2.addView(rnVar.R, c8.ha.o(i11, i10));
        if (rnVar.w0 != null) {
            org.telegram.ui.Cells.m8 m8Var14 = new org.telegram.ui.Cells.m8(context2);
            rnVar.X = m8Var14;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(false);
            int i31 = org.telegram.ui.ActionBar.m6.i6;
            p6Var = null;
            org.telegram.ui.ActionBar.t6.R(m8Var14, N0, null, org.telegram.ui.ActionBar.t6.M(i31));
            org.telegram.ui.Cells.m8 m8Var15 = rnVar.X;
            if (!org.telegram.messenger.t3.T(rnVar.w0)) {
                TLRPC.Chat chat5 = rnVar.w0;
                if (!chat5.creator && (!org.telegram.messenger.t3.N(chat5) || !org.telegram.messenger.t3.d(rnVar.w0))) {
                    i13 = 8;
                    m8Var15.setVisibility(i13);
                    final int i32 = 21;
                    rnVar.X.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var16 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.V = m8Var16;
                    org.telegram.ui.ActionBar.t6.R(m8Var16, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                    final int i33 = 22;
                    rnVar.V.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var17 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.O = m8Var17;
                    org.telegram.ui.ActionBar.t6.R(m8Var17, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                    final int i34 = 23;
                    rnVar.O.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (org.telegram.messenger.t3.y(28, rnVar.w0)) {
                        org.telegram.ui.Cells.m8 m8Var18 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.e0 = m8Var18;
                        org.telegram.ui.ActionBar.t6.R(m8Var18, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                        final int i35 = 24;
                        rnVar.e0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i35) {
                                    case 0:
                                        rn rnVar3 = this.b;
                                        rnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar3.x0);
                                        rnVar3.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar4 = this.b;
                                        pn pnVar = rnVar4.Q0;
                                        long j32 = rnVar4.B0;
                                        if (!rnVar4.s.g()) {
                                            org.telegram.messenger.hc hcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar5 = this.b;
                                        rnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar5.x0);
                                        rnVar5.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar6 = this.b;
                                        rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                        break;
                                    case 4:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                        break;
                                    case 5:
                                        rn rnVar8 = this.b;
                                        rnVar8.getClass();
                                        rnVar8.presentFragment(new mb(rnVar8.w0));
                                        break;
                                    case 6:
                                        rn rnVar9 = this.b;
                                        rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                        break;
                                    case 7:
                                        rn rnVar10 = this.b;
                                        rnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar10.B0);
                                        rnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar11 = this.b;
                                        rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar12 = this.b;
                                        org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                        break;
                                    case 15:
                                        rn rnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar13)) {
                                            sa0 sa0Var = new sa0(4);
                                            sa0Var.l0 = -rnVar13.v0;
                                            TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sa0Var.G0 = new mn(rnVar13, 6);
                                            rnVar13.presentFragment(sa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar14 = this.b;
                                        long j102 = rnVar14.v0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.M = new ArrayList();
                                        ioVar.N = new ArrayList();
                                        ioVar.P = new ArrayList();
                                        ioVar.c0 = true;
                                        ioVar.f0 = new ArrayList();
                                        ioVar.o0 = new HashMap();
                                        ioVar.q0 = new tn(ioVar, 5);
                                        ioVar.s0 = false;
                                        ioVar.Z = j102;
                                        ioVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                        ioVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.l0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar14.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar15 = this.b;
                                        long j11 = rnVar15.v0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.O = false;
                                        uoVar.P = false;
                                        uoVar.E = j11;
                                        TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                        uoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar15.x0;
                                        rnVar15.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar16 = this.b;
                                        ks0 ks0Var = new ks0(rnVar16.v0);
                                        ks0Var.s = new mn(rnVar16, 4);
                                        rnVar16.presentFragment(ks0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar17 = this.b;
                                        m40 m40Var = new m40(-rnVar17.w0.id);
                                        m40Var.c = rnVar17.L0;
                                        m40Var.l0 = rnVar17;
                                        rnVar17.presentFragment(m40Var);
                                        break;
                                    case 21:
                                        rn rnVar18 = this.b;
                                        rnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar18.x0);
                                        rnVar18.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar19 = this.b;
                                        ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                        ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                        rnVar19.presentFragment(ff0Var);
                                        break;
                                    case 23:
                                        rn rnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                            rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar20.v0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                            bpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar20.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar21 = this.b;
                                        rnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                        rnVar21.presentFragment(new cn(bundle6));
                                        break;
                                }
                            }
                        });
                        rnVar.k0();
                    }
                    org.telegram.ui.Cells.m8 m8Var19 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.W = m8Var19;
                    final int i36 = 0;
                    org.telegram.ui.ActionBar.t6.R(m8Var19, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                    rnVar.W.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var20 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.T = m8Var20;
                    org.telegram.ui.ActionBar.t6.R(m8Var20, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                    final int i37 = 2;
                    rnVar.T.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i37) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!org.telegram.messenger.t3.V(rnVar.w0)) {
                        org.telegram.ui.Cells.m8 m8Var21 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.U = m8Var21;
                        org.telegram.ui.ActionBar.t6.R(m8Var21, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                        final int i38 = 3;
                        rnVar.U.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i38) {
                                    case 0:
                                        rn rnVar3 = this.b;
                                        rnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar3.x0);
                                        rnVar3.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar4 = this.b;
                                        pn pnVar = rnVar4.Q0;
                                        long j32 = rnVar4.B0;
                                        if (!rnVar4.s.g()) {
                                            org.telegram.messenger.hc hcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar5 = this.b;
                                        rnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar5.x0);
                                        rnVar5.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar6 = this.b;
                                        rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                        break;
                                    case 4:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                        break;
                                    case 5:
                                        rn rnVar8 = this.b;
                                        rnVar8.getClass();
                                        rnVar8.presentFragment(new mb(rnVar8.w0));
                                        break;
                                    case 6:
                                        rn rnVar9 = this.b;
                                        rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                        break;
                                    case 7:
                                        rn rnVar10 = this.b;
                                        rnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar10.B0);
                                        rnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar11 = this.b;
                                        rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar12 = this.b;
                                        org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                        break;
                                    case 15:
                                        rn rnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar13)) {
                                            sa0 sa0Var = new sa0(4);
                                            sa0Var.l0 = -rnVar13.v0;
                                            TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sa0Var.G0 = new mn(rnVar13, 6);
                                            rnVar13.presentFragment(sa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar14 = this.b;
                                        long j102 = rnVar14.v0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.M = new ArrayList();
                                        ioVar.N = new ArrayList();
                                        ioVar.P = new ArrayList();
                                        ioVar.c0 = true;
                                        ioVar.f0 = new ArrayList();
                                        ioVar.o0 = new HashMap();
                                        ioVar.q0 = new tn(ioVar, 5);
                                        ioVar.s0 = false;
                                        ioVar.Z = j102;
                                        ioVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                        ioVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.l0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar14.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar15 = this.b;
                                        long j11 = rnVar15.v0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.O = false;
                                        uoVar.P = false;
                                        uoVar.E = j11;
                                        TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                        uoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar15.x0;
                                        rnVar15.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar16 = this.b;
                                        ks0 ks0Var = new ks0(rnVar16.v0);
                                        ks0Var.s = new mn(rnVar16, 4);
                                        rnVar16.presentFragment(ks0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar17 = this.b;
                                        m40 m40Var = new m40(-rnVar17.w0.id);
                                        m40Var.c = rnVar17.L0;
                                        m40Var.l0 = rnVar17;
                                        rnVar17.presentFragment(m40Var);
                                        break;
                                    case 21:
                                        rn rnVar18 = this.b;
                                        rnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar18.x0);
                                        rnVar18.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar19 = this.b;
                                        ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                        ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                        rnVar19.presentFragment(ff0Var);
                                        break;
                                    case 23:
                                        rn rnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                            rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar20.v0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                            bpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar20.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar21 = this.b;
                                        rnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                        rnVar21.presentFragment(new cn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.m8 m8Var22 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.Z = m8Var22;
                    m8Var22.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.id.L0(2131752471)), false);
                    org.telegram.ui.ActionBar.t6.R(rnVar.Z, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                    final int i39 = 4;
                    rnVar.Z.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i39) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j11 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j11;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    rnVar.Z.setVisibility(8);
                    if (!org.telegram.messenger.t3.T(rnVar.w0) || rnVar.w0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var23 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.Y = m8Var23;
                        m8Var23.o(R.drawable.msg_log, org.telegram.messenger.id.L0(2131751079), false);
                        org.telegram.ui.ActionBar.t6.R(rnVar.Y, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                        final int i40 = 5;
                        rnVar.Y.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i40) {
                                    case 0:
                                        rn rnVar3 = this.b;
                                        rnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar3.x0);
                                        rnVar3.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar4 = this.b;
                                        pn pnVar = rnVar4.Q0;
                                        long j32 = rnVar4.B0;
                                        if (!rnVar4.s.g()) {
                                            org.telegram.messenger.hc hcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar5 = this.b;
                                        rnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar5.x0);
                                        rnVar5.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar6 = this.b;
                                        rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                        break;
                                    case 4:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                        break;
                                    case 5:
                                        rn rnVar8 = this.b;
                                        rnVar8.getClass();
                                        rnVar8.presentFragment(new mb(rnVar8.w0));
                                        break;
                                    case 6:
                                        rn rnVar9 = this.b;
                                        rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                        break;
                                    case 7:
                                        rn rnVar10 = this.b;
                                        rnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar10.B0);
                                        rnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar11 = this.b;
                                        rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar12 = this.b;
                                        org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                        break;
                                    case 15:
                                        rn rnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar13)) {
                                            sa0 sa0Var = new sa0(4);
                                            sa0Var.l0 = -rnVar13.v0;
                                            TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sa0Var.G0 = new mn(rnVar13, 6);
                                            rnVar13.presentFragment(sa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar14 = this.b;
                                        long j102 = rnVar14.v0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.M = new ArrayList();
                                        ioVar.N = new ArrayList();
                                        ioVar.P = new ArrayList();
                                        ioVar.c0 = true;
                                        ioVar.f0 = new ArrayList();
                                        ioVar.o0 = new HashMap();
                                        ioVar.q0 = new tn(ioVar, 5);
                                        ioVar.s0 = false;
                                        ioVar.Z = j102;
                                        ioVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                        ioVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.l0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar14.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar15 = this.b;
                                        long j11 = rnVar15.v0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.O = false;
                                        uoVar.P = false;
                                        uoVar.E = j11;
                                        TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                        uoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar15.x0;
                                        rnVar15.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar16 = this.b;
                                        ks0 ks0Var = new ks0(rnVar16.v0);
                                        ks0Var.s = new mn(rnVar16, 4);
                                        rnVar16.presentFragment(ks0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar17 = this.b;
                                        m40 m40Var = new m40(-rnVar17.w0.id);
                                        m40Var.c = rnVar17.L0;
                                        m40Var.l0 = rnVar17;
                                        rnVar17.presentFragment(m40Var);
                                        break;
                                    case 21:
                                        rn rnVar18 = this.b;
                                        rnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar18.x0);
                                        rnVar18.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar19 = this.b;
                                        ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                        ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                        rnVar19.presentFragment(ff0Var);
                                        break;
                                    case 23:
                                        rn rnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                            rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar20.v0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                            bpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar20.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar21 = this.b;
                                        rnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                        rnVar21.presentFragment(new cn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (org.telegram.messenger.t3.R(rnVar.w0)) {
                        org.telegram.ui.Cells.m8 m8Var24 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.a0 = m8Var24;
                        m8Var24.o(R.drawable.msg_stats, org.telegram.messenger.id.L0(2131744891), true);
                        org.telegram.ui.ActionBar.t6.R(rnVar.a0, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
                        final int i41 = 6;
                        rnVar.a0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i41) {
                                    case 0:
                                        rn rnVar3 = this.b;
                                        rnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar3.x0);
                                        rnVar3.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar4 = this.b;
                                        pn pnVar = rnVar4.Q0;
                                        long j32 = rnVar4.B0;
                                        if (!rnVar4.s.g()) {
                                            org.telegram.messenger.hc hcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().H2(null, rnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar5 = this.b;
                                        rnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar5.x0);
                                        rnVar5.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar6 = this.b;
                                        rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                        break;
                                    case 4:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                        break;
                                    case 5:
                                        rn rnVar8 = this.b;
                                        rnVar8.getClass();
                                        rnVar8.presentFragment(new mb(rnVar8.w0));
                                        break;
                                    case 6:
                                        rn rnVar9 = this.b;
                                        rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                        break;
                                    case 7:
                                        rn rnVar10 = this.b;
                                        rnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar10.B0);
                                        rnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar11 = this.b;
                                        rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar12 = this.b;
                                        org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                        break;
                                    case 15:
                                        rn rnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar13)) {
                                            sa0 sa0Var = new sa0(4);
                                            sa0Var.l0 = -rnVar13.v0;
                                            TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sa0Var.G0 = new mn(rnVar13, 6);
                                            rnVar13.presentFragment(sa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar14 = this.b;
                                        long j102 = rnVar14.v0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.M = new ArrayList();
                                        ioVar.N = new ArrayList();
                                        ioVar.P = new ArrayList();
                                        ioVar.c0 = true;
                                        ioVar.f0 = new ArrayList();
                                        ioVar.o0 = new HashMap();
                                        ioVar.q0 = new tn(ioVar, 5);
                                        ioVar.s0 = false;
                                        ioVar.Z = j102;
                                        ioVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                        ioVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.l0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar14.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar15 = this.b;
                                        long j11 = rnVar15.v0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.O = false;
                                        uoVar.P = false;
                                        uoVar.E = j11;
                                        TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                                        uoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar15.x0;
                                        rnVar15.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar16 = this.b;
                                        ks0 ks0Var = new ks0(rnVar16.v0);
                                        ks0Var.s = new mn(rnVar16, 4);
                                        rnVar16.presentFragment(ks0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar17 = this.b;
                                        m40 m40Var = new m40(-rnVar17.w0.id);
                                        m40Var.c = rnVar17.L0;
                                        m40Var.l0 = rnVar17;
                                        rnVar17.presentFragment(m40Var);
                                        break;
                                    case 21:
                                        rn rnVar18 = this.b;
                                        rnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar18.x0);
                                        rnVar18.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar19 = this.b;
                                        ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                        ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                        rnVar19.presentFragment(ff0Var);
                                        break;
                                    case 23:
                                        rn rnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                            rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar20.v0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                            bpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar20.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar21 = this.b;
                                        rnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                        rnVar21.presentFragment(new cn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    rnVar.R.addView(rnVar.O, c8.ha.o(-1, -2));
                    m8Var = rnVar.e0;
                    if (m8Var != null) {
                        rnVar.R.addView(m8Var, c8.ha.o(-1, -2));
                    }
                    if (!rnVar.I0 && !rnVar.w0.gigagroup) {
                        rnVar.R.addView(rnVar.X, c8.ha.o(-1, -2));
                    }
                    if (!rnVar.I0) {
                        rnVar.R.addView(rnVar.V, c8.ha.o(-1, -2));
                    }
                    rnVar.R.addView(rnVar.W, c8.ha.o(-1, -2));
                    rnVar.R.addView(rnVar.T, c8.ha.o(-1, -2));
                    m8Var2 = rnVar.U;
                    if (m8Var2 != null && (chatFull2 = rnVar.x0) != null && chatFull2.requests_pending > 0) {
                        rnVar.R.addView(m8Var2, c8.ha.o(-1, -2));
                    }
                    if (rnVar.I0) {
                        rnVar.R.addView(rnVar.V, c8.ha.o(-1, -2));
                    }
                    if (!rnVar.I0 || rnVar.w0.gigagroup) {
                        i14 = -2;
                        i15 = -1;
                        rnVar.R.addView(rnVar.X, c8.ha.o(-1, -2));
                    } else {
                        i14 = -2;
                        i15 = -1;
                    }
                    m8Var3 = rnVar.a0;
                    if (m8Var3 != null) {
                        rnVar.R.addView(m8Var3, c8.ha.o(i15, i14));
                    }
                    m8Var4 = rnVar.Y;
                    if (m8Var4 != null) {
                        rnVar.R.addView(m8Var4, c8.ha.o(i15, i14));
                    }
                    m8Var5 = rnVar.Z;
                    if (m8Var5 != null) {
                        rnVar.R.addView(m8Var5, c8.ha.o(i15, i14));
                    }
                    if (rnVar.Z != null && rnVar.getMessagesController().g6 && org.telegram.messenger.t3.V(rnVar.w0)) {
                        rnVar.Z.setVisibility(0);
                    }
                    m8Var6 = rnVar.Y;
                    if (m8Var6 != null) {
                        org.telegram.ui.Cells.m8 m8Var25 = rnVar.Z;
                        m8Var6.setNeedDivider(m8Var25 != null && m8Var25.getVisibility() == 0);
                    }
                }
            }
            i13 = 0;
            m8Var15.setVisibility(i13);
            final int i322 = 21;
            rnVar.X.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var162 = new org.telegram.ui.Cells.m8(context2);
            rnVar.V = m8Var162;
            org.telegram.ui.ActionBar.t6.R(m8Var162, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
            final int i332 = 22;
            rnVar.V.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var172 = new org.telegram.ui.Cells.m8(context2);
            rnVar.O = m8Var172;
            org.telegram.ui.ActionBar.t6.R(m8Var172, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
            final int i342 = 23;
            rnVar.O.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.t3.y(28, rnVar.w0)) {
            }
            org.telegram.ui.Cells.m8 m8Var192 = new org.telegram.ui.Cells.m8(context2);
            rnVar.W = m8Var192;
            final int i362 = 0;
            org.telegram.ui.ActionBar.t6.R(m8Var192, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
            rnVar.W.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var202 = new org.telegram.ui.Cells.m8(context2);
            rnVar.T = m8Var202;
            org.telegram.ui.ActionBar.t6.R(m8Var202, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
            final int i372 = 2;
            rnVar.T.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i372) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            if (!org.telegram.messenger.t3.V(rnVar.w0)) {
            }
            org.telegram.ui.Cells.m8 m8Var222 = new org.telegram.ui.Cells.m8(context2);
            rnVar.Z = m8Var222;
            m8Var222.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.id.L0(2131752471)), false);
            org.telegram.ui.ActionBar.t6.R(rnVar.Z, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
            final int i392 = 4;
            rnVar.Z.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i392) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            rnVar.Z.setVisibility(8);
            if (!org.telegram.messenger.t3.T(rnVar.w0)) {
            }
            org.telegram.ui.Cells.m8 m8Var232 = new org.telegram.ui.Cells.m8(context2);
            rnVar.Y = m8Var232;
            m8Var232.o(R.drawable.msg_log, org.telegram.messenger.id.L0(2131751079), false);
            org.telegram.ui.ActionBar.t6.R(rnVar.Y, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i31));
            final int i402 = 5;
            rnVar.Y.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i402) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.t3.R(rnVar.w0)) {
            }
            rnVar.R.addView(rnVar.O, c8.ha.o(-1, -2));
            m8Var = rnVar.e0;
            if (m8Var != null) {
            }
            if (!rnVar.I0) {
                rnVar.R.addView(rnVar.X, c8.ha.o(-1, -2));
            }
            if (!rnVar.I0) {
            }
            rnVar.R.addView(rnVar.W, c8.ha.o(-1, -2));
            rnVar.R.addView(rnVar.T, c8.ha.o(-1, -2));
            m8Var2 = rnVar.U;
            if (m8Var2 != null) {
                rnVar.R.addView(m8Var2, c8.ha.o(-1, -2));
            }
            if (rnVar.I0) {
            }
            if (rnVar.I0) {
            }
            i14 = -2;
            i15 = -1;
            rnVar.R.addView(rnVar.X, c8.ha.o(-1, -2));
            m8Var3 = rnVar.a0;
            if (m8Var3 != null) {
            }
            m8Var4 = rnVar.Y;
            if (m8Var4 != null) {
            }
            m8Var5 = rnVar.Z;
            if (m8Var5 != null) {
            }
            if (rnVar.Z != null) {
                rnVar.Z.setVisibility(0);
            }
            m8Var6 = rnVar.Y;
            if (m8Var6 != null) {
            }
        } else {
            p6Var = null;
        }
        if (rnVar.C0 != null) {
            org.telegram.ui.Cells.m8 m8Var26 = new org.telegram.ui.Cells.m8(context2);
            rnVar.k0 = m8Var26;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.m6.N0(false);
            int i42 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.t6.R(m8Var26, N02, p6Var, org.telegram.ui.ActionBar.t6.M(i42));
            rnVar.k0.setPrioritizeTitleOverValue(true);
            rnVar.R.addView(rnVar.k0, c8.ha.o(-1, -2));
            final int i43 = 7;
            rnVar.k0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i43) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            rnVar.w0();
            org.telegram.ui.Cells.m8 m8Var27 = new org.telegram.ui.Cells.m8(context2);
            rnVar.n0 = m8Var27;
            org.telegram.ui.ActionBar.t6.R(m8Var27, org.telegram.ui.ActionBar.m6.N0(false), p6Var, org.telegram.ui.ActionBar.t6.M(i42));
            rnVar.n0.s(i0(org.telegram.messenger.id.L0(2131754346)), "", R.drawable.msg_shareout, true);
            rnVar.R.addView(rnVar.n0, c8.ha.o(-1, -2));
            final int i44 = 8;
            rnVar.n0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            rnVar.n0.h(45, rnVar.D0 == null, false);
            TLRPC.UserFull userFull = rnVar.D0;
            if (userFull != null) {
                org.telegram.ui.Cells.m8 m8Var28 = rnVar.n0;
                if (userFull.starref_program == null) {
                    format = org.telegram.messenger.id.L0(2131754345);
                    z10 = false;
                } else {
                    z10 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                m8Var28.w(format, z10);
            }
            if (!rnVar.getMessagesController().f6) {
                rnVar.n0.setVisibility(8);
            }
            org.telegram.ui.Cells.m8 m8Var29 = new org.telegram.ui.Cells.m8(context2);
            rnVar.o0 = m8Var29;
            org.telegram.ui.ActionBar.t6.R(m8Var29, org.telegram.ui.ActionBar.m6.N0(false), p6Var, org.telegram.ui.ActionBar.t6.M(i42));
            rnVar.o0.o(R.drawable.msg_log, org.telegram.messenger.id.L0(2131753092), true);
            rnVar.R.addView(rnVar.o0, c8.ha.o(-1, -2));
            final int i45 = 9;
            rnVar.o0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var30 = new org.telegram.ui.Cells.m8(context2);
            rnVar.p0 = m8Var30;
            org.telegram.ui.ActionBar.t6.R(m8Var30, org.telegram.ui.ActionBar.m6.N0(false), p6Var, org.telegram.ui.ActionBar.t6.M(i42));
            rnVar.p0.o(R.drawable.msg_media, org.telegram.messenger.id.L0(2131753093), true);
            rnVar.R.addView(rnVar.p0, c8.ha.o(-1, -2));
            final int i46 = 10;
            rnVar.p0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i46) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var31 = new org.telegram.ui.Cells.m8(context2);
            rnVar.q0 = m8Var31;
            org.telegram.ui.ActionBar.t6.R(m8Var31, org.telegram.ui.ActionBar.m6.N0(false), p6Var, org.telegram.ui.ActionBar.t6.M(i42));
            rnVar.q0.o(R.drawable.msg_bot, org.telegram.messenger.id.L0(2131753101), true);
            rnVar.R.addView(rnVar.q0, c8.ha.o(-1, -2));
            final int i47 = 11;
            rnVar.q0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i47) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = rnVar.w0;
        if (chat6 != null) {
            if (!org.telegram.messenger.t3.N(chat6)) {
                rnVar.R.setVisibility(8);
                rnVar.G.setVisibility(8);
            }
            gm0Var2.addView(new org.telegram.ui.Cells.y6(context2), c8.ha.o(-1, -2));
        } else if (rnVar.C0 != null) {
            rnVar.r0 = new org.telegram.ui.Cells.z8(12, context2, rnVar.resourceProvider);
            String L0 = org.telegram.messenger.id.L0(2131753052);
            SpannableString valueOf = SpannableString.valueOf(L0);
            int indexOf = L0.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new bi.b5(1), indexOf, indexOf + 10, 33);
            }
            rnVar.r0.setText(valueOf);
            gm0Var2.addView(rnVar.r0, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.m8 m8Var32 = new org.telegram.ui.Cells.m8(context2);
            rnVar.t0 = m8Var32;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.m6.N0(true);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            int i48 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.t6.R(m8Var32, N03, M, org.telegram.ui.ActionBar.t6.M(i48));
            rnVar.t0.o(R.drawable.menu_factcheck, org.telegram.messenger.id.L0(2131752929), false);
            org.telegram.ui.Cells.m8 m8Var33 = rnVar.t0;
            int i49 = org.telegram.ui.ActionBar.m6.q6;
            m8Var33.g(i49, i49);
            gm0Var2.addView(rnVar.t0, c8.ha.o(-1, -2));
            final int i50 = 13;
            rnVar.t0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i50) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j11 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j11;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j11));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context2, rnVar.resourceProvider);
            rnVar.s0 = z8Var2;
            z8Var2.setFixedSize(12);
            gm0Var2.addView(rnVar.s0, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.m8 m8Var34 = rnVar.t0;
            TLRPC.UserFull userFull2 = rnVar.D0;
            m8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.z8 z8Var3 = rnVar.s0;
            TLRPC.UserFull userFull3 = rnVar.D0;
            z8Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = rnVar.C0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                rnVar.S = linearLayout6;
                linearLayout6.setOrientation(1);
                gm0Var2.addView(rnVar.S, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
                n4Var.setText(org.telegram.messenger.id.L0(2131753112));
                rnVar.S.addView(n4Var, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.m8 m8Var35 = new org.telegram.ui.Cells.m8(context2);
                rnVar.l0 = m8Var35;
                org.telegram.ui.ActionBar.t6.R(m8Var35, org.telegram.ui.ActionBar.m6.N0(false), p6Var, org.telegram.ui.ActionBar.t6.M(i48));
                rnVar.l0.setPrioritizeTitleOverValue(true);
                rnVar.S.addView(rnVar.l0, c8.ha.o(-1, -2));
                final bi.n0 g10 = bi.n0.g(rnVar.currentAccount);
                final int i51 = 0;
                rnVar.l0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.hn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                rn rnVar3 = this.b;
                                long j11 = rnVar3.B0;
                                if (g10.h(j11, false) != null) {
                                    rnVar3.presentFragment(new bi.z(1, j11));
                                    break;
                                }
                                break;
                            default:
                                rn rnVar4 = this.b;
                                long j12 = rnVar4.B0;
                                if (g10.h(j12, false) != null) {
                                    rnVar4.presentFragment(new bi.z(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.m(j3)) {
                    long i52 = g10.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i52 > 0) {
                        double d = i52 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            i12 = i48;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            rnVar.l0.s(org.telegram.messenger.id.L0(2131753110), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i12 = i48;
                    rnVar.l0.s(org.telegram.messenger.id.L0(2131753110), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.b80(org.telegram.messenger.g0.L(30.0f), rnVar.l0.c), 0, spannableStringBuilder2.length(), 33);
                    rnVar.l0.s(org.telegram.messenger.id.L0(2131753110), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i12 = i48;
                }
                rnVar.l0.setVisibility(g10.b(j3) ? 0 : 8);
                org.telegram.ui.Cells.m8 m8Var36 = new org.telegram.ui.Cells.m8(context);
                rnVar.m0 = m8Var36;
                org.telegram.ui.ActionBar.t6.R(m8Var36, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i12));
                final int i53 = 1;
                rnVar.m0.setPrioritizeTitleOverValue(true);
                rnVar.S.addView(rnVar.m0, c8.ha.o(-1, -2));
                rnVar.m0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.hn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i53) {
                            case 0:
                                rn rnVar3 = this.b;
                                long j11 = rnVar3.B0;
                                if (g10.h(j11, false) != null) {
                                    rnVar3.presentFragment(new bi.z(1, j11));
                                    break;
                                }
                                break;
                            default:
                                rn rnVar4 = this.b;
                                long j12 = rnVar4.B0;
                                if (g10.h(j12, false) != null) {
                                    rnVar4.presentFragment(new bi.z(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.h(j3, false) != null) {
                    org.telegram.ui.Cells.m8 m8Var37 = rnVar.m0;
                    String L02 = org.telegram.messenger.id.L0(2131753111);
                    if (g10.c(j3).amount <= 0) {
                        a12 = "";
                        z9 = false;
                    } else {
                        z9 = false;
                        a12 = bi.dd.a1(false, TextUtils.concat("XTR", bi.dd.N0(g10.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    m8Var37.s(L02, a12, R.drawable.menu_premium_main, z9);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.b80(org.telegram.messenger.g0.L(30.0f), rnVar.m0.c), 0, spannableStringBuilder3.length(), 33);
                    rnVar.m0.s(org.telegram.messenger.id.L0(2131753111), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                rnVar.m0.setVisibility(g10.a(j3) ? 0 : 8);
                context2 = context;
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(12, context2, rnVar.getResourceProvider());
                z8Var4.setFixedSize(12);
                z8Var4.setTag(R.id.fit_width_tag, 1);
                gm0Var2.addView(z8Var4, c8.ha.o(-1, 12));
                rnVar.S.setVisibility((rnVar.m0.getVisibility() == 0 || rnVar.l0.getVisibility() == 0) ? 0 : 8);
                chat = rnVar.w0;
                if ((chat == null && chat.creator) || ((user = rnVar.C0) != null && user.bot && user.bot_can_edit)) {
                    final long j11 = chat != null ? chat.linked_community_id : rnVar.C0.linked_community_id;
                    final long j12 = chat != null ? -chat.id : rnVar.C0.id;
                    boolean z17 = rnVar.C0 != null;
                    if (j11 != 0) {
                        ji.b bVar = new ji.b(context2, rnVar.resourceProvider);
                        rnVar.g0 = bVar;
                        bVar.a(rnVar.currentAccount, rnVar.getMessagesController().M0(Long.valueOf(j11)));
                        ji.b bVar2 = rnVar.g0;
                        final int i54 = 0;
                        org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.m6.N0(false);
                        int i55 = org.telegram.ui.ActionBar.m6.i6;
                        org.telegram.ui.ActionBar.t6.R(bVar2, N04, null, org.telegram.ui.ActionBar.t6.M(i55));
                        rnVar.g0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.in
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i54) {
                                    case 0:
                                        rn rnVar3 = this.b;
                                        org.telegram.messenger.qp messagesController = rnVar3.getMessagesController();
                                        long j13 = j11;
                                        if (!org.telegram.messenger.t3.N(messagesController.M0(Long.valueOf(j13)))) {
                                            rnVar3.showDialog(new ii.d0(rnVar3, j13, null, null));
                                            break;
                                        } else {
                                            rnVar3.presentFragment(new ii.p(a8.p0.j(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        rn rnVar4 = this.b;
                                        rnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j11);
                                        rnVar4.presentFragment(new ii.f(bundle));
                                        break;
                                }
                            }
                        });
                        gm0Var2.addView(rnVar.g0, c8.ha.o(-1, -2));
                        org.telegram.ui.Cells.m8 m8Var38 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.i0 = m8Var38;
                        m8Var38.o(R.drawable.outline_community_remove_24, org.telegram.messenger.id.L0(z17 ? 2131751884 : rnVar.I0 ? 2131751883 : 2131751882), false);
                        org.telegram.ui.Cells.m8 m8Var39 = rnVar.i0;
                        int i56 = org.telegram.ui.ActionBar.m6.p7;
                        m8Var39.g(i56, i56);
                        org.telegram.ui.ActionBar.t6.R(rnVar.i0, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(i55));
                        org.telegram.ui.Components.gm0 gm0Var5 = gm0Var2;
                        final boolean z18 = z17;
                        rnVar2 = rnVar;
                        gm0Var3 = gm0Var5;
                        rnVar.i0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String M0 = org.telegram.messenger.id.M0(2131751915, null);
                                rn rnVar3 = rn.this;
                                org.telegram.ui.Components.u4.s0(rnVar3, M0, org.telegram.messenger.id.M0(z18 ? 2131751917 : rnVar3.I0 ? 2131751916 : 2131751914, null), org.telegram.messenger.id.M0(2131746321, null), true, new org.telegram.messenger.xk(rnVar3, j12, j11, 1));
                            }
                        });
                        gm0Var3.addView(rnVar2.i0, c8.ha.o(-1, -2));
                        org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(12, context2, rnVar2.getResourceProvider());
                        rnVar2.j0 = z8Var5;
                        z8Var5.setFixedSize(14);
                        rnVar2.j0.setTag(R.id.fit_width_tag, 1);
                        gm0Var3.addView(rnVar2.j0, c8.ha.o(-1, 14));
                    } else {
                        gm0Var3 = gm0Var2;
                        rnVar2 = rnVar;
                        boolean z19 = z17;
                        org.telegram.ui.Cells.m8 m8Var40 = new org.telegram.ui.Cells.m8(context2);
                        rnVar2.f0 = m8Var40;
                        m8Var40.g(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                        org.telegram.ui.ActionBar.t6.W(rnVar2.f0.getTextView(), org.telegram.ui.ActionBar.m6.Wl);
                        org.telegram.ui.ActionBar.t6.R(rnVar2.f0, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                        rnVar2.f0.o(R.drawable.msg_groups, org.telegram.messenger.id.L0(z19 ? 2131751981 : rnVar2.I0 ? 2131751979 : 2131751976), false);
                        final int i57 = 1;
                        rnVar2.f0.setOnClickListener(new View.OnClickListener(rnVar2) { // from class: org.telegram.ui.in
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i57) {
                                    case 0:
                                        rn rnVar3 = this.b;
                                        org.telegram.messenger.qp messagesController = rnVar3.getMessagesController();
                                        long j13 = j12;
                                        if (!org.telegram.messenger.t3.N(messagesController.M0(Long.valueOf(j13)))) {
                                            rnVar3.showDialog(new ii.d0(rnVar3, j13, null, null));
                                            break;
                                        } else {
                                            rnVar3.presentFragment(new ii.p(a8.p0.j(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        rn rnVar4 = this.b;
                                        rnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j12);
                                        rnVar4.presentFragment(new ii.f(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.z8 z8Var6 = new org.telegram.ui.Cells.z8(12, context2, rnVar2.resourceProvider);
                        rnVar2.h0 = z8Var6;
                        z8Var6.setText(org.telegram.messenger.id.L0(z19 ? 2131751980 : rnVar2.I0 ? 2131751978 : 2131751975));
                        gm0Var3.addView(rnVar2.f0, c8.ha.o(-1, -2));
                        gm0Var3.addView(rnVar2.h0, c8.ha.o(-1, -2));
                    }
                } else {
                    gm0Var3 = gm0Var2;
                    rnVar2 = rnVar;
                }
                chat2 = rnVar2.w0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    rnVar2.c0 = frameLayout3;
                    gm0Var3.addView(frameLayout3, c8.ha.o(-1, -2));
                    org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context2);
                    rnVar2.d0 = w9Var;
                    org.telegram.ui.ActionBar.t6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.m6.p7, null);
                    org.telegram.ui.ActionBar.t6.R(rnVar2.d0, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
                    if (rnVar2.C0 == null) {
                        rnVar2.d0.b(org.telegram.messenger.id.L0(2131751566), false);
                    } else if (rnVar2.I0) {
                        rnVar2.d0.b(org.telegram.messenger.id.L0(2131752422), false);
                    } else {
                        rnVar2.d0.b(org.telegram.messenger.id.L0(2131751572), false);
                    }
                    rnVar2.c0.addView(rnVar2.d0, c8.ha.c(-2.0f, -1));
                    final int i58 = 14;
                    rnVar2.d0.setOnClickListener(new View.OnClickListener(rnVar2) { // from class: org.telegram.ui.gn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i58) {
                                case 0:
                                    rn rnVar3 = this.b;
                                    rnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar3.x0);
                                    rnVar3.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar4 = this.b;
                                    pn pnVar = rnVar4.Q0;
                                    long j32 = rnVar4.B0;
                                    if (!rnVar4.s.g()) {
                                        org.telegram.messenger.hc hcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().H2(null, rnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar5 = this.b;
                                    rnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar5.x0);
                                    rnVar5.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar6 = this.b;
                                    rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                                    break;
                                case 4:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                                    break;
                                case 5:
                                    rn rnVar8 = this.b;
                                    rnVar8.getClass();
                                    rnVar8.presentFragment(new mb(rnVar8.w0));
                                    break;
                                case 6:
                                    rn rnVar9 = this.b;
                                    rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                                    break;
                                case 7:
                                    rn rnVar10 = this.b;
                                    rnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar10.B0);
                                    rnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar11 = this.b;
                                    rnVar11.presentFragment(new hi.j(rnVar11.B0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar12 = this.b;
                                    org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                                    break;
                                case 15:
                                    rn rnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar13)) {
                                        sa0 sa0Var = new sa0(4);
                                        sa0Var.l0 = -rnVar13.v0;
                                        TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sa0Var.G0 = new mn(rnVar13, 6);
                                        rnVar13.presentFragment(sa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar14 = this.b;
                                    long j102 = rnVar14.v0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.M = new ArrayList();
                                    ioVar.N = new ArrayList();
                                    ioVar.P = new ArrayList();
                                    ioVar.c0 = true;
                                    ioVar.f0 = new ArrayList();
                                    ioVar.o0 = new HashMap();
                                    ioVar.q0 = new tn(ioVar, 5);
                                    ioVar.s0 = false;
                                    ioVar.Z = j102;
                                    ioVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = rnVar14.x0;
                                    ioVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.l0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar14.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar15 = this.b;
                                    long j112 = rnVar15.v0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.O = false;
                                    uoVar.P = false;
                                    uoVar.E = j112;
                                    TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j112));
                                    uoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar15.x0;
                                    rnVar15.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar16 = this.b;
                                    ks0 ks0Var = new ks0(rnVar16.v0);
                                    ks0Var.s = new mn(rnVar16, 4);
                                    rnVar16.presentFragment(ks0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar17 = this.b;
                                    m40 m40Var = new m40(-rnVar17.w0.id);
                                    m40Var.c = rnVar17.L0;
                                    m40Var.l0 = rnVar17;
                                    rnVar17.presentFragment(m40Var);
                                    break;
                                case 21:
                                    rn rnVar18 = this.b;
                                    rnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar18.x0);
                                    rnVar18.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar19 = this.b;
                                    ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = rnVar19.x0;
                                    ff0Var.m0(chatFull8, chatFull8.exported_invite);
                                    rnVar19.presentFragment(ff0Var);
                                    break;
                                case 23:
                                    rn rnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                        rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar20.v0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                        bpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar20.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar21 = this.b;
                                    rnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                                    rnVar21.presentFragment(new cn(bundle6));
                                    break;
                            }
                        }
                    });
                    gm0Var3.addView(new org.telegram.ui.Cells.y6(context2), c8.ha.o(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                rnVar2.c = undoView;
                xcVar.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.kt ktVar6 = rnVar2.w;
                TLRPC.User user3 = rnVar2.C0;
                ktVar6.setText(org.telegram.messenger.i6.l(user3 == null ? org.telegram.messenger.g5.p(user3) : rnVar2.w0.title, rnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.kt ktVar7 = rnVar2.w;
                ktVar7.setSelection(ktVar7.n());
                chatFull = rnVar2.x0;
                if (chatFull == null) {
                    rnVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = rnVar2.D0;
                    if (userFull4 != null) {
                        rnVar2.E.setText(userFull4.about);
                    }
                }
                rnVar2.p0();
                rnVar2.u0(true, false);
                return rnVar2.fragmentView;
            }
        }
        chat = rnVar.w0;
        if (chat == null) {
        }
        gm0Var3 = gm0Var2;
        rnVar2 = rnVar;
        chat2 = rnVar2.w0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            rnVar2.c0 = frameLayout32;
            gm0Var3.addView(frameLayout32, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context2);
            rnVar2.d0 = w9Var2;
            org.telegram.ui.ActionBar.t6.U(w9Var2.getTextView(), org.telegram.ui.ActionBar.m6.p7, null);
            org.telegram.ui.ActionBar.t6.R(rnVar2.d0, org.telegram.ui.ActionBar.m6.N0(false), null, org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.i6));
            if (rnVar2.C0 == null) {
            }
            rnVar2.c0.addView(rnVar2.d0, c8.ha.c(-2.0f, -1));
            final int i582 = 14;
            rnVar2.d0.setOnClickListener(new View.OnClickListener(rnVar2) { // from class: org.telegram.ui.gn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i582) {
                        case 0:
                            rn rnVar3 = this.b;
                            rnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar3.x0);
                            rnVar3.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar4 = this.b;
                            pn pnVar = rnVar4.Q0;
                            long j32 = rnVar4.B0;
                            if (!rnVar4.s.g()) {
                                org.telegram.messenger.hc hcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : rnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = rnVar4.getMessagesController().M0(Long.valueOf(rnVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull5 = rnVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                hcVar = org.telegram.messenger.hc.j(rnVar4.x0.chat_photo.video_sizes.get(0), rnVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().H2(null, rnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.p1().c2(null, a22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar5 = this.b;
                            rnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar5.x0);
                            rnVar5.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar6 = this.b;
                            rnVar6.presentFragment(new bi.w4(rnVar6.v0));
                            break;
                        case 4:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new hi.q3(-rnVar7.v0));
                            break;
                        case 5:
                            rn rnVar8 = this.b;
                            rnVar8.getClass();
                            rnVar8.presentFragment(new mb(rnVar8.w0));
                            break;
                        case 6:
                            rn rnVar9 = this.b;
                            rnVar9.presentFragment(e51.g0(rnVar9.w0, false));
                            break;
                        case 7:
                            rn rnVar10 = this.b;
                            rnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar10.B0);
                            rnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar11 = this.b;
                            rnVar11.presentFragment(new hi.j(rnVar11.B0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.C0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar12 = this.b;
                            org.telegram.ui.Components.u4.r(rnVar12, false, rnVar12.w0, null, false, true, true, false, new mn(rnVar12, 7));
                            break;
                        case 15:
                            rn rnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar13)) {
                                sa0 sa0Var = new sa0(4);
                                sa0Var.l0 = -rnVar13.v0;
                                TLRPC.ChatFull chatFull6 = rnVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sa0Var.C0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sa0Var.G0 = new mn(rnVar13, 6);
                                rnVar13.presentFragment(sa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar14 = this.b;
                            long j102 = rnVar14.v0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar14.H;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.M = new ArrayList();
                            ioVar.N = new ArrayList();
                            ioVar.P = new ArrayList();
                            ioVar.c0 = true;
                            ioVar.f0 = new ArrayList();
                            ioVar.o0 = new HashMap();
                            ioVar.q0 = new tn(ioVar, 5);
                            ioVar.s0 = false;
                            ioVar.Z = j102;
                            ioVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = rnVar14.x0;
                            ioVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.l0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar14.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar15 = this.b;
                            long j112 = rnVar15.v0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.O = false;
                            uoVar.P = false;
                            uoVar.E = j112;
                            TLRPC.Chat M02 = uoVar.getMessagesController().M0(Long.valueOf(j112));
                            uoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar15.x0;
                            rnVar15.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar16 = this.b;
                            ks0 ks0Var = new ks0(rnVar16.v0);
                            ks0Var.s = new mn(rnVar16, 4);
                            rnVar16.presentFragment(ks0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar17 = this.b;
                            m40 m40Var = new m40(-rnVar17.w0.id);
                            m40Var.c = rnVar17.L0;
                            m40Var.l0 = rnVar17;
                            rnVar17.presentFragment(m40Var);
                            break;
                        case 21:
                            rn rnVar18 = this.b;
                            rnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar18.I0 || rnVar18.w0.gigagroup) && !org.telegram.messenger.t3.Y(rnVar18.w0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar18.x0);
                            rnVar18.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar19 = this.b;
                            ff0 ff0Var = new ff0(rnVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = rnVar19.x0;
                            ff0Var.m0(chatFull8, chatFull8.exported_invite);
                            rnVar19.presentFragment(ff0Var);
                            break;
                        case 23:
                            rn rnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(rnVar20.w0)) {
                                rnVar20.presentFragment(new ch.o(rnVar20.v0, rnVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar20.v0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull9 = rnVar20.x0;
                                bpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().M0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar20.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar21 = this.b;
                            rnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar21.v0);
                            rnVar21.presentFragment(new cn(bundle6));
                            break;
                    }
                }
            });
            gm0Var3.addView(new org.telegram.ui.Cells.y6(context2), c8.ha.o(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        rnVar2.c = undoView2;
        xcVar.addView(undoView2, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.kt ktVar62 = rnVar2.w;
        TLRPC.User user32 = rnVar2.C0;
        ktVar62.setText(org.telegram.messenger.i6.l(user32 == null ? org.telegram.messenger.g5.p(user32) : rnVar2.w0.title, rnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.kt ktVar72 = rnVar2.w;
        ktVar72.setSelection(ktVar72.n());
        chatFull = rnVar2.x0;
        if (chatFull == null) {
        }
        rnVar2.p0();
        rnVar2.u0(true, false);
        return rnVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.w0.participants_count) >= getMessagesController().c5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z9;
        org.telegram.ui.Cells.m8 m8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i11 = org.telegram.messenger.qs.T;
        boolean z10 = true;
        long j3 = this.B0;
        int i12 = 0;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.v0) {
                if (this.x0 == null && (editTextBoldCursor = this.E) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z11 = this.x0 == null;
                this.x0 = chatFull;
                k0();
                if (j3 != 0) {
                    this.F0 = false;
                } else {
                    if (!this.E0) {
                        TLRPC.ChatFull chatFull2 = this.x0;
                    }
                    TLRPC.ChatFull chatFull3 = this.x0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z9 = true;
                        this.F0 = z9;
                        m8Var = this.Q;
                        if (m8Var != null) {
                            m8Var.getCheckBox().setIcon(this.F0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z9 = false;
                    this.F0 = z9;
                    m8Var = this.Q;
                    if (m8Var != null) {
                    }
                }
                if (org.telegram.messenger.t3.T(this.w0) && !this.x0.hidden_prehistory) {
                    z10 = false;
                }
                this.J0 = z10;
                u0(false, false);
                if (z11) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.r5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.v0 != longValue) {
                return;
            }
            this.E0 = booleanValue;
            this.G0 = booleanValue2;
            if (objArr.length > 3) {
                this.H0 = ((Boolean) objArr[3]).booleanValue();
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.Q;
            if (m8Var2 != null) {
                m8Var2.setChecked(this.E0);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.qp.C8;
            if ((intValue & 2) != 0) {
                p0();
            }
            if ((intValue & 1) != 0) {
                w0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.v0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.y0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.z0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.A0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var == null || r4Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i7 == org.telegram.messenger.qs.X4) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.v0) {
                TLRPC.ChatFull N0 = getMessagesController().N0(longValue2);
                this.x0 = N0;
                if (N0 != null) {
                    this.K0 = N0.available_reactions;
                }
                x0(true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.C3) {
            if (i7 == org.telegram.messenger.qs.E0) {
                if (((Long) objArr[0]).longValue() == j3) {
                    r0(getMessagesController().b2(j3));
                    return;
                }
                return;
            } else {
                if (i7 == org.telegram.messenger.qs.L3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i7 == org.telegram.messenger.qs.y1 && (-this.v0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
                    if (r4Var2 == null || r4Var2.getLastFragment() != this) {
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
            if (this.m0 != null) {
                bi.n0 g10 = bi.n0.g(this.currentAccount);
                this.m0.setVisibility(g10.a(j3) ? 0 : 8);
                this.m0.w(bi.dd.a1(false, TextUtils.concat("XTR", bi.dd.M0(g10.c(j3), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.m8 m8Var3 = this.k0;
                if (m8Var3 != null) {
                    m8Var3.setNeedDivider(g10.a(j3) || g10.b(j3));
                }
                this.S.setVisibility((this.m0.getVisibility() == 0 || this.l0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.l0 != null) {
                bi.n0 g11 = bi.n0.g(this.currentAccount);
                this.l0.setVisibility(g11.b(j3) ? 0 : 8);
                long i14 = g11.i(j3);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i14 > 0) {
                    double d = i14 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d, 0));
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
                this.l0.w(spannableStringBuilder, true);
                org.telegram.ui.Cells.m8 m8Var4 = this.k0;
                if (m8Var4 != null) {
                    if (!g11.a(j3) && !g11.b(j3)) {
                        z10 = false;
                    }
                    m8Var4.setNeedDivider(z10);
                }
                LinearLayout linearLayout = this.S;
                if (this.m0.getVisibility() != 0 && this.l0.getVisibility() != 0) {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ zq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        qn qnVar = this.b0;
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(qnVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b0, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b0, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.V, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.Cells.m8 m8Var = this.U;
        if (m8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(m8Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.N, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.H, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.l6));
        LinearLayout linearLayout = this.D;
        int i10 = org.telegram.ui.ActionBar.m6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d0, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.Cells.m8 m8Var2 = this.K;
        if (m8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(m8Var2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        org.telegram.ui.Cells.m8 m8Var3 = this.a0;
        if (m8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(m8Var3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z9) {
        org.telegram.ui.Components.kt ktVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        int i7 = 1;
        int i10 = 0;
        String str3 = "";
        if (this.B0 != 0) {
            TLRPC.UserFull userFull = this.D0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.kt ktVar2 = this.w;
            if ((ktVar2 != null && !this.C0.first_name.equals(ktVar2.getText().toString())) || ((editTextBoldCursor2 = this.E) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z9) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131743726, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new mn(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, null), new mn(this, i7));
                    showDialog(u1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.x0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.t3.T(this.w0) && this.x0.hidden_prehistory != this.J0) || (((ktVar = this.w) != null && !this.w0.title.equals(ktVar.getText().toString())) || (((editTextBoldCursor = this.E) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.E0 != this.w0.forum))) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.id.M0(2131743726, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = M02;
                if (this.I0) {
                    u1Var2.T = org.telegram.messenger.id.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    u1Var2.T = org.telegram.messenger.id.M0(2131749401, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131754216, "ApplyTheme"), new mn(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747580, "PassportDiscard"), new mn(this, 3));
                showDialog(u1Var2);
            }
            return false;
        }
        return true;
    }

    public final void k0() {
        String str;
        if (this.e0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().O2.f(-this.v0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
            str = !TextUtils.isEmpty(ijVar.z) ? ijVar.z.toString() : !TextUtils.isEmpty(ijVar.v) ? ijVar.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.x0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.id.M0(2131742892, null);
        }
        this.e0.u(org.telegram.messenger.id.M0(2131742898, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ln(this, 0));
    }

    public final void n0() {
        this.s.n(this.u0 != null, new nn(this, 0), new q5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.b0.e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.kt ktVar;
        String str;
        String str2;
        if (this.N0 || (ktVar = this.w) == null) {
            return;
        }
        if (ktVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.F3(this.w);
            return;
        }
        this.N0 = true;
        int i7 = 3;
        String str3 = "";
        if (this.C0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().q1(this.C0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.C0.first_name.equals(this.w.getText().toString())) {
                setbotinfo.name = this.w.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.D0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.E.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            this.b.setOnCancelListener(new bi.g0(this, getConnectionsManager().sendRequest(setbotinfo, new ld(6, this, setbotinfo)), i7));
            this.b.show();
            return;
        }
        if (!org.telegram.messenger.t3.T(this.w0) && (!this.J0 || this.E0)) {
            getMessagesController().T(getParentActivity(), this.v0, this, new mn(this, 5), null);
            return;
        }
        if (this.x0 != null && org.telegram.messenger.t3.T(this.w0)) {
            TLRPC.ChatFull chatFull = this.x0;
            boolean z9 = chatFull.hidden_prehistory;
            boolean z10 = this.J0;
            if (z9 != z10) {
                chatFull.hidden_prehistory = z10;
                getMessagesController().b5(this.v0, this.J0);
            }
        }
        if (this.s.g()) {
            this.M0 = true;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            this.b = u1Var;
            u1Var.setOnCancelListener(new vf(this, r0));
            this.b.show();
            return;
        }
        if (!this.w0.title.equals(this.w.getText().toString())) {
            getMessagesController().C(this.v0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.x0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.v0;
            String obj = this.E.getText().toString();
            TLRPC.ChatFull chatFull3 = this.x0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.j1(-j3);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.di(messagesController, chatFull3, obj, 7), 64);
        }
        boolean z11 = this.E0;
        TLRPC.Chat chat = this.w0;
        boolean z12 = chat.forum;
        if (z11 != z12 || this.G0 != chat.forum_tabs || this.H0 != chat.forum_sidebar) {
            boolean z13 = this.G0 != chat.forum_tabs;
            boolean z14 = this.H0 != chat.forum_sidebar;
            r0 = z11 == z12 ? 0 : 1;
            getMessagesController().a5(this.v0, this.E0, this.G0, this.H0);
            if (this.E0 && !this.G0 && (r0 != 0 || z13)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                    if ((fragmentStack.get(i10) instanceof cn) && ((cn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.v0) {
                        ((ActionBarLayout) getParentLayout()).b0(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
                        HashSet hashSet = z91.q1;
                        ((ActionBarLayout) parentLayout).c(i10, z91.I0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z13 || z14) {
                v0(z13);
            }
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.s.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.w;
        if (ktVar == null || !ktVar.e) {
            return j0(z9);
        }
        if (!z9) {
            return false;
        }
        ktVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().c5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j3 = this.v0;
        long j10 = this.B0;
        boolean z9 = true;
        if (j3 == 0) {
            TLRPC.User a22 = j10 == 0 ? null : getMessagesController().a2(Long.valueOf(j10));
            this.C0 = a22;
            if (a22 == null) {
                TLRPC.User k02 = org.telegram.messenger.yr.a0(this.currentAccount).k0(j10);
                this.C0 = k02;
                if (k02 != null) {
                    getMessagesController().X3(this.C0, true, false);
                    if (this.D0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j10));
                        ArrayList L0 = org.telegram.messenger.yr.a0(this.currentAccount).L0(hashSet);
                        if (!L0.isEmpty()) {
                            this.D0 = (TLRPC.UserFull) L0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.w0;
            org.telegram.ui.Components.v8 v8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.j30 j30Var = this.s;
            j30Var.a = this;
            j30Var.b = this;
            getNotificationCenter().c(this, org.telegram.messenger.qs.r);
            getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
            getNotificationCenter().c(this, org.telegram.messenger.qs.b1);
            if (this.x0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.v0));
        this.w0 = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.yr.a0(this.currentAccount).P(this.v0);
            this.w0 = P;
            if (P != null) {
                getMessagesController().Q3(this.w0, true);
                if (this.x0 == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.yr.a0(this.currentAccount).F0(this.v0, org.telegram.messenger.t3.T(this.w0), new CountDownLatch(1), false, false, 0);
                    this.x0 = F0;
                }
            }
            return false;
        }
        chat = this.w0;
        org.telegram.ui.Components.v8 v8Var2 = this.r;
        if (chat == null) {
            this.y0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.z0 = TLRPC.TL_chatBannedRights.clone(this.w0.banned_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.w0.default_banned_rights);
            v8Var2.k(5L, this.w0.title, null, null);
            this.I0 = org.telegram.messenger.t3.T(this.w0) && !this.w0.megagroup;
            TLRPC.Chat chat2 = this.w0;
            boolean z10 = chat2.forum;
            this.E0 = z10;
            this.G0 = chat2.forum_tabs;
            this.H0 = chat2.forum_sidebar;
            if (j10 == 0) {
                if (!z10) {
                    TLRPC.ChatFull chatFull = this.x0;
                }
                TLRPC.ChatFull chatFull2 = this.x0;
                if (chatFull2 != null) {
                }
                this.F0 = z9;
                getNotificationCenter().c(this, org.telegram.messenger.qs.T);
                getNotificationCenter().c(this, org.telegram.messenger.qs.r5);
                getNotificationCenter().c(this, org.telegram.messenger.qs.X4);
                getNotificationCenter().c(this, org.telegram.messenger.qs.L3);
            }
            z9 = false;
            this.F0 = z9;
            getNotificationCenter().c(this, org.telegram.messenger.qs.T);
            getNotificationCenter().c(this, org.telegram.messenger.qs.r5);
            getNotificationCenter().c(this, org.telegram.messenger.qs.X4);
            getNotificationCenter().c(this, org.telegram.messenger.qs.L3);
        } else {
            v8Var2.k(5L, this.C0.first_name, null, null);
            this.I0 = false;
            this.E0 = false;
            this.G0 = false;
            this.H0 = false;
            this.F0 = false;
            getNotificationCenter().c(this, org.telegram.messenger.qs.E0);
            if (this.C0.bot) {
                getNotificationCenter().c(this, org.telegram.messenger.qs.C3);
            }
        }
        org.telegram.ui.Components.j30 j30Var2 = this.s;
        j30Var2.a = this;
        j30Var2.b = this;
        getNotificationCenter().c(this, org.telegram.messenger.qs.r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        getNotificationCenter().c(this, org.telegram.messenger.qs.b1);
        if (this.x0 != null) {
            m0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.j30 j30Var = this.s;
        if (j30Var != null) {
            j30Var.d();
        }
        if (this.w0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.qs.T);
            getNotificationCenter().n(this, org.telegram.messenger.qs.r5);
            getNotificationCenter().n(this, org.telegram.messenger.qs.X4);
            getNotificationCenter().n(this, org.telegram.messenger.qs.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
            if (this.C0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.qs.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.b1);
        org.telegram.ui.Components.kt ktVar = this.w;
        if (ktVar != null) {
            ktVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.Components.h5) obj).o(null);
        }
        org.telegram.ui.Components.kt ktVar = this.w;
        if (ktVar != null) {
            ktVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.s.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.kt ktVar = this.w;
        if (ktVar != null) {
            ktVar.s();
            this.w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        u0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, null);
            }
            di.d4 d4Var = this.e;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        boolean z9;
        if (this.e == null || this.O0) {
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.v0));
        long j3 = this.B0;
        TLRPC.User a22 = j3 == 0 ? null : getMessagesController().a2(Long.valueOf(j3));
        if (M0 == null && a22 == null) {
            return;
        }
        this.C0 = a22;
        this.w0 = M0;
        org.telegram.ui.Components.v8 v8Var = this.r;
        if (a22 == null ? M0.photo == null : a22.photo == null) {
            this.e.setImageDrawable(v8Var);
        } else {
            TLRPC.Chat chat = a22 != null ? a22 : M0;
            this.u0 = a22 != null ? a22.photo.photo_small : M0.photo.photo_small;
            org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(this.currentAccount, 1, chat);
            this.e.e(chat, v8Var);
            if (m10 != null) {
                z9 = true;
                if (this.b0 != null) {
                    if (z9 || this.s.g()) {
                        this.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.id.M0(2131752213, "ChatSetNewPhoto"), true);
                    } else {
                        this.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.zg0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    this.b0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    this.b0.e.setAnimation(this.R0);
                }
                if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                    PhotoViewer.p1().r0();
                }
                if (this.Z == null && getMessagesController().g6 && org.telegram.messenger.t3.V(this.w0)) {
                    this.Z.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z9 = false;
        if (this.b0 != null) {
        }
        if (PhotoViewer.A1()) {
            PhotoViewer.p1().r0();
        }
        if (this.Z == null) {
        }
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.h5 m10;
        this.x0 = chatFull;
        if (chatFull != null) {
            if (this.w0 == null) {
                this.w0 = getMessagesController().M0(Long.valueOf(this.v0));
            }
            this.J0 = !org.telegram.messenger.t3.T(this.w0) || this.x0.hidden_prehistory;
            this.K0 = this.x0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.w0;
            TLRPC.ChatFull chatFull2 = this.x0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.t3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i7);
                        i7++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m10 = org.telegram.ui.Components.h5.l(org.telegram.messenger.p10.s0, org.telegram.ui.Components.h5.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.h5.m(org.telegram.messenger.p10.s0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.h5.f()) : null;
                        }
                        if (m10 != null) {
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.h5 l10 = org.telegram.ui.Components.h5.l(org.telegram.messenger.p10.s0, org.telegram.ui.Components.h5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().g6 && org.telegram.messenger.t3.V(this.w0)) {
                this.Z.setVisibility(0);
            }
        }
        k0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j3 = this.B0;
                this.C0 = j3 == 0 ? null : getMessagesController().a2(Long.valueOf(j3));
            }
            org.telegram.ui.Cells.m8 m8Var = this.n0;
            if (m8Var != null) {
                m8Var.h(45, this.D0 == null, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    this.n0.w(userFull2.starref_program == null ? org.telegram.messenger.id.M0(2131754345, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.t0;
            if (m8Var2 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                m8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.z8 z8Var = this.s0;
            if (z8Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                z8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j30 j30Var = this.s;
        if (j30Var != null) {
            j30Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z9, boolean z10) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z10) {
            if (z9) {
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
        if (z9) {
            this.n.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<fi.p5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<fi.p5, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new ch.y(29, this, z9));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j30 j30Var = this.s;
        if (j30Var != null && (str = j30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.kt ktVar = this.w;
        if (ktVar != null) {
            String obj = ktVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        int i7;
        fm0 fm0Var;
        int w02;
        ArrayList<Integer> arrayList;
        ql0 ql0Var = this.L;
        if (ql0Var != null) {
            TLRPC.Chat chat = this.w0;
            org.telegram.ui.Cells.m8 m8Var3 = this.N;
            boolean z9 = (m8Var3 != null && m8Var3.getVisibility() == 0) || ((m8Var = this.Q) != null && m8Var.getVisibility() == 0) || ((org.telegram.messenger.t3.n0(this.w0) && org.telegram.messenger.t3.N(this.w0)) || ((m8Var2 = this.M) != null && m8Var2.getVisibility() == 0));
            Paint paint = ql0Var.n;
            int i10 = ql0Var.a;
            org.telegram.ui.ActionBar.h6 h6Var = ql0Var.d;
            if (chat == null) {
                return;
            }
            ql0Var.w = z9;
            ql0Var.r = new org.telegram.ui.Components.my0(org.telegram.messenger.i6.m(chat.title, org.telegram.ui.ActionBar.m6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
            fm0 fm0Var2 = ql0Var.x;
            if (fm0Var2 != null) {
                fm0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = fm0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                i7 = -16777216;
                ql0Var.x = new fm0(i12, i12, i12, tL_emojiStatusCollectible.document_id);
            } else {
                i7 = -16777216;
                if (org.telegram.messenger.t3.I(chat) >= 0) {
                    fm0Var = fm0.c(i10, org.telegram.messenger.t3.I(chat));
                    fm0Var.a = org.telegram.messenger.g0.L(11.0f);
                    fm0Var.d();
                } else {
                    fm0Var = null;
                }
                ql0Var.x = fm0Var;
            }
            fm0 fm0Var3 = ql0Var.x;
            if (fm0Var3 != null) {
                fm0Var3.e(ql0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a10 = h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q();
                int i13 = (!a10 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | i7;
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | i7 : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | i7 : intValue;
                ql0Var.r.n(i13);
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, i13));
                fm0 fm0Var4 = new fm0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                fm0Var4.a = org.telegram.messenger.g0.L(11.0f);
                fm0Var4.d();
                ql0Var.y = fm0Var4;
                fm0Var4.e(ql0Var);
                return;
            }
            int F = org.telegram.messenger.t3.F(chat);
            if (F < 7) {
                int i14 = org.telegram.ui.ActionBar.m6.r8[F];
                ql0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.m6.w0(i14, h6Var);
            } else {
                org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).q4;
                org.telegram.messenger.fp d = gpVar == null ? null : gpVar.d(F);
                if (d != null) {
                    ql0Var.s = -1;
                    w02 = d.f();
                } else {
                    int i15 = org.telegram.ui.ActionBar.m6.r8[0];
                    ql0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
                }
            }
            ql0Var.r.n(w02);
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            fm0 a11 = fm0.a(i10, F);
            a11.a = org.telegram.messenger.g0.L(11.0f);
            a11.d();
            ql0Var.y = a11;
            a11.e(ql0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(boolean z9, boolean z10) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        TLRPC.ChatFull chatFull;
        int i14;
        String str2;
        String M0;
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        org.telegram.ui.Cells.m8 m8Var3;
        org.telegram.ui.Cells.m8 m8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.m8 m8Var5;
        org.telegram.ui.Cells.m8 m8Var6;
        org.telegram.ui.Cells.m8 m8Var7;
        org.telegram.ui.Cells.m8 m8Var8;
        org.telegram.ui.Cells.m8 m8Var9;
        TLRPC.Chat M02;
        if (z9 && (M02 = getMessagesController().M0(Long.valueOf(this.v0))) != null) {
            this.w0 = M02;
        }
        boolean t02 = org.telegram.messenger.t3.t0(this.w0);
        org.telegram.ui.Cells.z8 z8Var = this.P;
        if (z8Var != null) {
            z8Var.setVisibility((this.I != null || ((m8Var7 = this.J) != null && m8Var7.getVisibility() == 0) || (((m8Var8 = this.N) != null && m8Var8.getVisibility() == 0) || ((m8Var9 = this.H) != null && m8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.m8 m8Var10 = this.Y;
        if (m8Var10 != null) {
            m8Var10.setVisibility(org.telegram.messenger.t3.T(this.w0) ? 0 : 8);
        }
        org.telegram.ui.Cells.m8 m8Var11 = this.J;
        if (m8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.x0;
            if (chatFull2 == null || (!this.I0 && chatFull2.linked_chat_id == 0)) {
                m8Var11.setVisibility(8);
            } else {
                m8Var11.setVisibility(0);
                if (this.x0.linked_chat_id == 0) {
                    this.J.u(org.telegram.messenger.id.M0(2131751389, "Discussion"), org.telegram.messenger.id.M0(2131751381, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.x0.linked_chat_id));
                    if (M03 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String K = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.J.u(org.telegram.messenger.id.M0(2131751389, "Discussion"), M03.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.u(org.telegram.messenger.id.M0(2131751389, "Discussion"), rf.b.i("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.m8 m8Var12 = this.J;
                            String M04 = org.telegram.messenger.id.M0(2131748883, "LinkedChannel");
                            String str4 = M03.title;
                            org.telegram.ui.Cells.m8 m8Var13 = this.Q;
                            m8Var12.u(M04, str4, false, R.drawable.msg_channel, m8Var13 != null && m8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.m8 m8Var14 = this.J;
                            String M05 = org.telegram.messenger.id.M0(2131748883, "LinkedChannel");
                            String i16 = rf.b.i("@", K2);
                            org.telegram.ui.Cells.m8 m8Var15 = this.Q;
                            m8Var14.u(M05, i16, false, R.drawable.msg_channel, m8Var15 != null && m8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.m8 m8Var16 = this.H;
        if (m8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.x0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                m8Var16.setVisibility(8);
            } else {
                m8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.x0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.q(org.telegram.messenger.id.M0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z10, true);
                } else {
                    this.H.q(org.telegram.messenger.id.M0(2131753961, "AttachLocation"), "Unknown address", z10, true);
                }
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.x0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z12 = this.w0.noforwards;
                if (this.I0) {
                    if (t02) {
                        i15 = 2131743920;
                        str3 = "TypePublic";
                    } else if (z12) {
                        i15 = 2131743921;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i15 = 2131743924;
                        str3 = "TypePrivate";
                    }
                    M0 = org.telegram.messenger.id.M0(i15, str3);
                } else {
                    if (t02) {
                        i14 = 2131743919;
                        str2 = "TypePublicGroup";
                    } else if (z12) {
                        i14 = 2131743922;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = 2131743923;
                        str2 = "TypePrivateGroup";
                    }
                    M0 = org.telegram.messenger.id.M0(i14, str2);
                }
                String str5 = M0;
                if (this.I0) {
                    org.telegram.ui.Cells.m8 m8Var17 = this.I;
                    String M06 = org.telegram.messenger.id.M0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.m8 m8Var18 = this.N;
                    m8Var17.u(M06, str5, false, R.drawable.msg_channel, (m8Var18 != null && m8Var18.getVisibility() == 0) || ((m8Var3 = this.J) != null && m8Var3.getVisibility() == 0) || ((m8Var4 = this.Q) != null && m8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.m8 m8Var19 = this.I;
                    String M07 = org.telegram.messenger.id.M0(2131749392, "GroupType");
                    org.telegram.ui.Cells.m8 m8Var20 = this.N;
                    m8Var19.u(M07, str5, false, R.drawable.msg_groups, (m8Var20 != null && m8Var20.getVisibility() == 0) || ((m8Var = this.J) != null && m8Var.getVisibility() == 0) || ((m8Var2 = this.Q) != null && m8Var2.getVisibility() == 0));
                }
            } else {
                String M08 = !t02 ? org.telegram.messenger.id.M0(2131743929, "TypeLocationGroupEdit") : String.format(a8.p0.s(new StringBuilder("https://"), getMessagesController().U2, "/%s"), org.telegram.messenger.t3.K(this.w0, false));
                org.telegram.ui.Cells.m8 m8Var21 = this.I;
                String M09 = org.telegram.messenger.id.M0(2131743930, "TypeLocationGroup");
                org.telegram.ui.Cells.m8 m8Var22 = this.N;
                m8Var21.u(M09, M08, false, R.drawable.msg_channel, (m8Var22 != null && m8Var22.getVisibility() == 0) || ((m8Var5 = this.J) != null && m8Var5.getVisibility() == 0) || ((m8Var6 = this.Q) != null && m8Var6.getVisibility() == 0));
            }
        }
        if (this.N != null) {
            if (!this.J0 || this.E0) {
                i13 = 2131752228;
                str = "ChatHistoryVisible";
            } else {
                i13 = 2131752232;
                str = "ChatHistoryHidden";
            }
            this.N.u(org.telegram.messenger.id.M0(2131752229, "ChatHistoryShort"), org.telegram.messenger.id.M0(i13, str), z10, R.drawable.msg_discuss, this.Q != null);
            this.N.setEnabled(!this.E0);
            boolean z13 = (this.E0 || t02 || ((chatFull = this.x0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.N.getAlpha() <= 0.0f && !z13) {
                this.N.setVisibility(8);
                t0();
            } else if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z13) {
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                boolean z14 = false;
                while (i17 < this.F.getChildCount()) {
                    if (!z14 && this.F.getChildAt(i17) == this.N) {
                        z14 = true;
                    } else if (z14) {
                        arrayList.add(this.F.getChildAt(i17));
                    }
                    i17++;
                    z14 = z14;
                }
                int i18 = 0;
                boolean z15 = false;
                while (i18 < this.x.getChildCount()) {
                    if (!z15 && this.x.getChildAt(i18) == this.F) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.x.getChildAt(i18));
                    }
                    i18++;
                    z15 = z15;
                }
                if (this.N.getVisibility() != 0) {
                    this.N.setAlpha(0.0f);
                    this.N.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.N.setVisibility(0);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    ((View) arrayList.get(i19)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                }
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N.getAlpha(), z13 ? 1.0f : 0.0f);
                    this.S0 = ofFloat;
                    ofFloat.addUpdateListener(new bi.de(11, this, arrayList));
                    this.S0.addListener(new ai.g0(this, z13, arrayList, 7));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.wq.h);
                    this.S0.start();
                } else {
                    this.N.setAlpha(z13 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z13 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z13 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z13 ? 0 : 8);
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        ((View) arrayList.get(i20)).setTranslationY(0.0f);
                    }
                    this.S0 = null;
                }
            }
        }
        if (this.T != null) {
            if (this.x0 != null) {
                org.telegram.ui.Cells.m8 m8Var23 = this.U;
                if (m8Var23 != null) {
                    if (m8Var23.getParent() == null) {
                        i7 = 0;
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, c8.ha.o(-1, -2));
                    } else {
                        i7 = 0;
                    }
                    this.U.setVisibility(this.x0.requests_pending > 0 ? i7 : 8);
                } else {
                    i7 = 0;
                }
                if (!this.I0 || org.telegram.messenger.t3.Y(this.w0)) {
                    if (org.telegram.messenger.t3.T(this.w0)) {
                        org.telegram.ui.Cells.m8 m8Var24 = this.T;
                        String M010 = org.telegram.messenger.id.M0(2131752377, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i7] = Integer.valueOf(this.x0.participants_count);
                        m8Var24.u(M010, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.m8 m8Var25 = this.T;
                        CharSequence M011 = org.telegram.messenger.id.M0(2131752377, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i7] = Integer.valueOf(this.x0.participants.participants.size());
                        m8Var25.u(M011, String.format("%d", objArr2), false, R.drawable.msg_groups, this.U.getVisibility() == 0 ? 1 : i7);
                    }
                    TLRPC.Chat chat = this.w0;
                    if (!chat.gigagroup || org.telegram.messenger.t3.Y(chat)) {
                        int i21 = this.E0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.w0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i22 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i22++;
                            }
                            i10 = rq.s0(tL_chatBannedRights) + i22;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.w0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.E0 && !tL_chatBannedRights2.manage_topics) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i10++;
                            }
                            i11 = i21;
                        } else {
                            i10 = i21;
                            i11 = i10;
                        }
                        org.telegram.ui.Cells.m8 m8Var26 = this.X;
                        String M012 = org.telegram.messenger.id.M0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i10);
                        Integer valueOf2 = Integer.valueOf(i11);
                        Object[] objArr3 = new Object[2];
                        objArr3[i7] = valueOf;
                        objArr3[1] = valueOf2;
                        m8Var26.u(M012, String.format("%d/%d", objArr3), z10, R.drawable.msg_permissions, true);
                        z11 = z10;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var27 = this.X;
                        CharSequence M013 = org.telegram.messenger.id.M0(2131752453, null);
                        TLRPC.ChatFull chatFull5 = this.x0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i7] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        org.telegram.ui.Cells.m8 m8Var28 = this.Y;
                        m8Var27.u(M013, format, false, R.drawable.msg_user_remove, (m8Var28 == null || m8Var28.getVisibility() != 0) ? i7 : 1);
                        z11 = z10;
                    }
                    org.telegram.ui.Cells.m8 m8Var29 = this.U;
                    if (m8Var29 != null) {
                        CharSequence M014 = org.telegram.messenger.id.M0(2131748635, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i7] = Integer.valueOf(this.x0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.m8 m8Var30 = this.Y;
                        m8Var29.u(M014, format2, false, R.drawable.msg_requests, (m8Var30 == null || m8Var30.getVisibility() != 0) ? i7 : 1);
                    }
                } else {
                    org.telegram.ui.Cells.m8 m8Var31 = this.T;
                    String M015 = org.telegram.messenger.id.M0(2131752289, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i7] = Integer.valueOf(this.x0.participants_count);
                    m8Var31.u(M015, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.m8 m8Var32 = this.X;
                    CharSequence M016 = org.telegram.messenger.id.M0(2131752453, null);
                    TLRPC.ChatFull chatFull6 = this.x0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i7] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    org.telegram.ui.Cells.m8 m8Var33 = this.Y;
                    m8Var32.u(M016, format3, false, R.drawable.msg_user_remove, (m8Var33 == null || m8Var33.getVisibility() != 0) ? i7 : 1);
                    z11 = z10;
                }
                org.telegram.ui.Cells.m8 m8Var34 = this.W;
                String M017 = org.telegram.messenger.id.M0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.t3.T(this.w0)) {
                    i12 = this.x0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.x0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i23 = i7;
                        int i24 = i23;
                        while (i23 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.x0.participants.participants.get(i23);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i24++;
                            }
                            i23++;
                        }
                        i12 = i24;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i7] = Integer.valueOf(i12);
                m8Var34.u(M017, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z11 = z10;
                i7 = 0;
                if (!this.I0 || org.telegram.messenger.t3.Y(this.w0)) {
                    org.telegram.ui.Cells.m8 m8Var35 = this.T;
                    String M018 = org.telegram.messenger.id.M0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.m8 m8Var36 = this.Y;
                    m8Var35.o(R.drawable.msg_groups, M018, m8Var36 != null && m8Var36.getVisibility() == 0);
                    if (this.w0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var37 = this.X;
                        String M019 = org.telegram.messenger.id.M0(2131752453, null);
                        org.telegram.ui.Cells.m8 m8Var38 = this.Y;
                        m8Var37.o(R.drawable.msg_chats_remove, M019, m8Var38 != null && m8Var38.getVisibility() == 0);
                    } else {
                        this.X.o(R.drawable.msg_permissions, org.telegram.messenger.id.M0(2131752333, null), true);
                    }
                } else {
                    this.T.o(R.drawable.msg_groups, org.telegram.messenger.id.M0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.m8 m8Var39 = this.X;
                    String M020 = org.telegram.messenger.id.M0(2131752453, null);
                    org.telegram.ui.Cells.m8 m8Var40 = this.Y;
                    m8Var39.o(R.drawable.msg_chats_remove, M020, m8Var40 != null && m8Var40.getVisibility() == 0);
                }
                this.W.o(R.drawable.msg_admins, org.telegram.messenger.id.M0(2131752517, "ChannelAdministrators"), true);
            }
            this.O.setVisibility(org.telegram.messenger.t3.w(1, this.w0) ? i7 : 8);
            x0(z11);
            if (this.x0 == null || !org.telegram.messenger.t3.y(3, this.w0) || (t02 && this.w0.creator)) {
                this.V.setVisibility(8);
            } else if (this.x0.invitesCount > 0) {
                this.V.u(org.telegram.messenger.id.M0(2131749140, "InviteLinks"), Integer.toString(this.x0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.V.u(org.telegram.messenger.id.M0(2131749140, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.K != null) {
            y0(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z9) {
        zw zwVar;
        vv vvVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i7 = 0;
        while (i7 < fragmentStack.size()) {
            if (fragmentStack.get(i7) instanceof cn) {
                cn cnVar = (cn) fragmentStack.get(i7);
                if (cnVar.getArguments().getLong("chat_id") == this.v0) {
                    ((ActionBarLayout) getParentLayout()).d0(cnVar, false);
                    cnVar.clearViews();
                    if (((ActionBarLayout) getParentLayout()).c(i7, cnVar)) {
                        org.telegram.messenger.qs.e().j(cnVar.ba);
                    }
                    if (z9 && !this.G0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        ((ActionBarLayout) getParentLayout()).c(i7, new z91(bundle));
                        i7++;
                    }
                }
            } else if (z9 && this.G0 && (fragmentStack.get(i7) instanceof z91)) {
                z91 z91Var = (z91) fragmentStack.get(i7);
                if (z91Var.g() != null && z91Var.g().id == this.v0) {
                    ((ActionBarLayout) getParentLayout()).d0(z91Var, false);
                    i7--;
                }
            } else if (z9 && this.G0 && (fragmentStack.get(i7) instanceof zw) && (zwVar = (zw) fragmentStack.get(i7)) != null && (vvVar = zwVar.G3) != null && vvVar.c()) {
                zwVar.G3.a();
            }
            i7++;
        }
    }

    public final void w0() {
        if (this.k0 == null) {
            return;
        }
        if (this.C0.usernames.size() <= 1) {
            this.k0.u(org.telegram.messenger.id.M0(2131753005, null), "t.me/" + this.C0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.C0.usernames;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            if (tL_username.active) {
                i7++;
            }
        }
        this.k0.u(org.telegram.messenger.id.M0(2131753004, null), org.telegram.messenger.id.a0(null, null, 2131753003, Integer.valueOf(i7), Integer.valueOf(this.C0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x0(boolean z9) {
        String str;
        String str2;
        int i7;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.v0);
        boolean V = org.telegram.messenger.t3.V(this.w0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String M0 = org.telegram.messenger.id.M0(2131746379, null);
            if (N0 == null || !N0.paid_reactions_available) {
                str = M0;
                this.O.u(org.telegram.messenger.id.M0(2131746387, null), str, z9, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i10 = 0;
            for (0; i7 < tL_chatReactionsSome.reactions.size(); i7 + 1) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i7);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i10++;
                    }
                } else {
                    i7 = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i7 + 1;
                    i10++;
                }
            }
            if (V) {
                if (N0 != null && N0.paid_reactions_available) {
                    i10++;
                }
                str2 = i10 == 0 ? org.telegram.messenger.id.M0(2131746379, null) : String.valueOf(i10);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i10);
                str2 = min == 0 ? org.telegram.messenger.id.M0(2131746379, null) : org.telegram.messenger.id.a0(null, null, 2131746384, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = org.telegram.messenger.id.M0(2131746386, null);
        }
        str = str2;
        this.O.u(org.telegram.messenger.id.M0(2131746387, null), str, z9, R.drawable.msg_reactions2, true);
    }

    public final void y0(Long l10) {
        TLRPC.Chat chat = this.w0;
        if (chat == null || this.K == null) {
            return;
        }
        long j3 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.K.u(org.telegram.messenger.id.M0(2131747096, null), org.telegram.messenger.id.M0(2131747086, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0.linked_monoforum_id));
        if (l10 != null) {
            j3 = l10.longValue();
        } else if (M0 != null) {
            j3 = M0.send_paid_messages_stars;
        }
        this.K.u(org.telegram.messenger.id.M0(2131747096, null), bi.dd.a1(false, org.telegram.messenger.id.a0(null, null, 2131747068, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }
}
