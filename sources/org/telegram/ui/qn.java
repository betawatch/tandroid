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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class qn extends org.telegram.ui.ActionBar.e2 implements org.telegram.ui.Components.l30, org.telegram.messenger.is {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public org.telegram.ui.Cells.x6 H;
    public boolean H0;
    public org.telegram.ui.Cells.l8 I;
    public boolean I0;
    public org.telegram.ui.Cells.l8 J;
    public boolean J0;
    public org.telegram.ui.Cells.l8 K;
    public boolean K0;
    public org.telegram.ui.Cells.l8 L;
    public TLRPC.ChatReactions L0;
    public ol0 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public org.telegram.ui.Cells.l8 N;
    public boolean N0;
    public org.telegram.ui.Cells.l8 O;
    public boolean O0;
    public org.telegram.ui.Cells.l8 P;
    public boolean P0;
    public org.telegram.ui.Cells.y8 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.l8 R;
    public final on R0;
    public LinearLayout S;
    public org.telegram.ui.Components.ch0 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public org.telegram.ui.Cells.l8 U;
    public org.telegram.ui.Cells.l8 V;
    public org.telegram.ui.Cells.l8 W;
    public org.telegram.ui.Cells.l8 X;
    public org.telegram.ui.Cells.l8 Y;
    public org.telegram.ui.Cells.l8 Z;
    public org.telegram.ui.ActionBar.z4 a;
    public org.telegram.ui.Cells.l8 a0;
    public org.telegram.ui.ActionBar.t1 b;
    public org.telegram.ui.Cells.l8 b0;
    public UndoView c;
    public pn c0;
    public LinearLayout d;
    public FrameLayout d0;
    public fi.v3 e;
    public org.telegram.ui.Cells.v9 e0;
    public hi.n5 f;
    public org.telegram.ui.Cells.l8 f0;
    public org.telegram.ui.Cells.l8 g0;
    public AnimatorSet h;
    public mi.b h0;
    public org.telegram.ui.Cells.y8 i0;
    public org.telegram.ui.Cells.l8 j0;
    public org.telegram.ui.Cells.y8 k0;
    public org.telegram.ui.Cells.l8 l0;
    public org.telegram.ui.Cells.l8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.l8 n0;
    public org.telegram.ui.Cells.l8 o0;
    public org.telegram.ui.Cells.l8 p0;
    public org.telegram.ui.Cells.l8 q0;
    public final org.telegram.ui.Components.t8 r;
    public org.telegram.ui.Cells.l8 r0;
    public final org.telegram.ui.Components.m30 s;
    public org.telegram.ui.Cells.y8 s0;
    public org.telegram.ui.Cells.y8 t0;
    public org.telegram.ui.Cells.l8 u0;
    public TLRPC.FileLocation v0;
    public org.telegram.ui.Components.rt w;
    public long w0;
    public org.telegram.ui.Components.km0 x;
    public TLRPC.Chat x0;
    public org.telegram.ui.Components.lm0 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public qn(Bundle bundle) {
        super(bundle);
        this.Q0 = new ArrayList();
        this.R0 = new on(this);
        this.r = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.m30(0, false, false);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.m30((M0 == null || !org.telegram.messenger.t3.V(M0)) ? 2 : 1, true, true);
        }
    }

    public static void Z(qn qnVar, FrameLayout frameLayout, View view) {
        int i7 = 3;
        if (!qnVar.G0) {
            TLRPC.ChatFull chatFull = qnVar.y0;
            org.telegram.ui.Components.cc.a0(qnVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(qnVar.getMessagesController().d5, "ChannelTopicsForbidden", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752280, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j3 = -qnVar.w0;
        ox oxVar = new ox(null);
        oxVar.a = j3;
        oxVar.setResourceProvider(qnVar.resourceProvider);
        boolean z10 = qnVar.F0;
        boolean z11 = qnVar.H0;
        boolean z12 = qnVar.I0;
        fi.b0 b0Var = new fi.b0(i7, qnVar, view);
        oxVar.c = z10;
        oxVar.d = z11;
        oxVar.e = z12;
        oxVar.h = b0Var;
        qnVar.presentFragment(oxVar);
    }

    public static /* synthetic */ void a0(qn qnVar) {
        qnVar.v0 = null;
        long j3 = qnVar.C0;
        if (j3 == 0) {
            org.telegram.messenger.np.s1(qnVar.currentAccount).B(qnVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = qnVar.getMessagesController().o1(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            qnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new jn(qnVar, 2));
        }
        qnVar.s0(false, true);
        fi.v3 v3Var = qnVar.e;
        org.telegram.ui.Components.t8 t8Var = qnVar.r;
        Object obj = qnVar.D0;
        if (obj == null) {
            obj = qnVar.x0;
        }
        v3Var.j(null, null, t8Var, obj);
        qnVar.S0.M(0);
        qnVar.c0.e.d();
    }

    public static void b0(qn qnVar, long j3, long j10) {
        org.telegram.messenger.np.s1(qnVar.currentAccount).Q2(j3, j10, true, false, new a5(qnVar, 4));
    }

    public static void c0(qn qnVar) {
        int i7 = qnVar.currentAccount;
        long j3 = qnVar.C0;
        TL_bots.BotVerifierSettings botVerifierSettings = qnVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle j10 = org.telegram.ui.Cells.y0.j(16, "onlySelect", "dialogsType", true);
        j10.putBoolean("resetDelegate", false);
        yw ywVar = new yw(j10);
        ywVar.setCurrentAccount(i7);
        ywVar.E2 = new ki.o1(ywVar, i7, j3, botVerifierSettings);
        T.presentFragment(ywVar);
    }

    public static void d0(qn qnVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, org.telegram.messenger.e3 e3Var) {
        t1Var.dismiss();
        if (qnVar.getParentActivity() == null) {
            return;
        }
        ug.j0 j0Var = new ug.j0(35, qnVar.currentAccount, qnVar.getParentActivity(), qnVar, qnVar.getResourceProvider());
        j0Var.A1(e3Var);
        j0Var.z1(tL_premium_boostsStatus, true);
        j0Var.B1(j3);
        TLRPC.Chat M0 = qnVar.getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            j0Var.M2 = new zg(8, qnVar, M0);
        }
        qnVar.showDialog(j0Var);
    }

    public static void e0(qn qnVar) {
        qc qcVar = new qc(-qnVar.x0.id);
        qcVar.m0 = qnVar;
        qnVar.presentFragment(qcVar);
        org.telegram.messenger.np.s1(qnVar.currentAccount).f7.edit().putInt("boostingappearance", org.telegram.messenger.np.s1(qnVar.currentAccount).f7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void f0(qn qnVar) {
        qnVar.P0 = true;
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(qnVar.currentAccount);
        int i7 = org.telegram.messenger.np.D8;
        f10.k(org.telegram.messenger.ns.r, 2);
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        fz fzVar = new fz(10);
        fzVar.a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        fzVar.f = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ck, false);
        fzVar.n = false;
        spannableStringBuilder.setSpan(fzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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

    @Override // org.telegram.ui.Components.l30
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.l30
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.l30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x101c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1029  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x108d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x10b9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1092  */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r22;
        int i7;
        Context context2;
        Integer num;
        final int i10;
        final qn qnVar;
        int i11;
        org.telegram.ui.ActionBar.m6 m6Var;
        Integer num2;
        boolean z10;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i12;
        TLRPC.User user;
        final qn qnVar2;
        Context context3;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        boolean z11;
        String format;
        int i13;
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        int i14;
        org.telegram.ui.Cells.l8 l8Var3;
        org.telegram.ui.Cells.l8 l8Var4;
        org.telegram.ui.Cells.l8 l8Var5;
        org.telegram.ui.Cells.l8 l8Var6;
        TLRPC.ChatFull chatFull2;
        boolean z12;
        Context context4;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i15 = 1;
        setHasOwnBackground(true);
        org.telegram.ui.Components.rt rtVar = this.w;
        if (rtVar != null) {
            rtVar.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i16 = 6;
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, i16));
        wc wcVar = new wc(i15, context, this);
        wcVar.setOnTouchListener(new gi.a(9));
        this.fragmentView = wcVar;
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(context);
        this.x = km0Var;
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, this.x, this.resourceProvider, false);
        this.y = lm0Var;
        lm0Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        wcVar.addView(this.y, c8.ja.c(-1.0f, -1));
        this.y.addView(km0Var, new FrameLayout.LayoutParams(-1, -2));
        km0Var.setOrientation(1);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.L0(2131752415));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i17 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i17, linearLayout2, null);
        km0Var.addView(this.d, c8.ja.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, c8.ja.o(-1, -2));
        fi.v3 v3Var = new fi.v3(i16, context, this);
        this.e = v3Var;
        v3Var.setRoundRadius(this.F0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(32.0f));
        int i18 = 3;
        if (this.D0 != null || org.telegram.messenger.t3.d(this.x0)) {
            fi.v3 v3Var2 = this.e;
            boolean z13 = org.telegram.messenger.hd.a0;
            frameLayout2.addView(v3Var2, c8.ja.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            hi.n5 n5Var = new hi.n5(this, context, paint, i16);
            this.f = n5Var;
            boolean z14 = org.telegram.messenger.hd.a0;
            frameLayout2.addView(n5Var, c8.ja.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z15 = org.telegram.messenger.hd.a0;
            frameLayout2.addView(radialProgressView2, c8.ja.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 8.0f));
            s0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j3 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j3 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j3));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i19 = chatPhoto2.dc_id;
                                        if (i19 != 0) {
                                            chatPhoto2.photo_big.dc_id = i19;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j10 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var7 = qnVar14.I;
                            boolean z16 = l8Var7 != null && l8Var7.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j10;
                            hoVar.o0 = z16;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z17 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z17 = true;
                            }
                            toVar.s = z17;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
        } else {
            fi.v3 v3Var3 = this.e;
            boolean z16 = org.telegram.messenger.hd.a0;
            frameLayout2.addView(v3Var3, c8.ja.d(64, 64.0f, (z16 ? 5 : 3) | 48, z16 ? 0.0f : 16.0f, 12.0f, z16 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.rt rtVar2 = new org.telegram.ui.Components.rt(context, wcVar, this);
        this.w = rtVar2;
        long j3 = this.C0;
        if (j3 != 0) {
            rtVar2.setHint(org.telegram.messenger.hd.L0(2131753021));
            r22 = 0;
        } else if (this.J0) {
            r22 = 0;
            rtVar2.setHint(org.telegram.messenger.hd.M0(2131751124, "EnterChannelName"));
        } else {
            r22 = 0;
            rtVar2.setHint(org.telegram.messenger.hd.M0(2131749422, "GroupName"));
        }
        org.telegram.ui.Components.rt rtVar3 = this.w;
        TLRPC.Chat chat3 = this.x0;
        rtVar3.setEnabled((chat3 != null || org.telegram.messenger.t3.d(chat3)) ? true : r22);
        org.telegram.ui.Components.rt rtVar4 = this.w;
        rtVar4.setFocusable(rtVar4.isEnabled());
        this.w.getEditText().addTextChangedListener(new m0(this, i18));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r22] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        org.telegram.ui.Components.rt rtVar5 = this.w;
        boolean z17 = org.telegram.messenger.hd.a0;
        frameLayout2.addView(rtVar5, c8.ja.d(-1, -2.0f, 16, z17 ? 5.0f : 96.0f, 0.0f, z17 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(1);
        km0Var.addView(this.E, c8.ja.o(-1, -2));
        final int i19 = 12;
        if (this.D0 != null || org.telegram.messenger.t3.d(this.x0)) {
            pn pnVar = new pn(context);
            this.c0 = pnVar;
            org.telegram.ui.ActionBar.q6.R(pnVar, org.telegram.ui.ActionBar.j6.N0(r22), null, org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
            this.c0.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j10 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var7 = qnVar14.I;
                            boolean z162 = l8Var7 != null && l8Var7.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j10;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            this.E.addView(this.c0, c8.ja.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.F = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.E(this.F, org.telegram.ui.ActionBar.j6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor2, i20, null);
        int i21 = r22;
        this.F.setPadding(i21, i21, i21, org.telegram.messenger.g0.L(6.0f));
        this.F.setBackgroundDrawable(null);
        this.F.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        this.F.setInputType(180225);
        this.F.setImeOptions(6);
        this.F.setEnabled(this.D0 != null || org.telegram.messenger.t3.d(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.F;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.ns.e4)});
        this.F.setHint(org.telegram.messenger.hd.M0(2131751460, "DescriptionOptionalPlaceholder"));
        org.telegram.ui.ActionBar.q6.u(this.F, i20);
        this.F.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.F.setCursorWidth(1.5f);
        if (this.F.isEnabled()) {
            this.E.addView(this.F, c8.ja.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.E.addView(this.F, c8.ja.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.F.setOnEditorActionListener(new fa(this, 2));
        this.F.addTextChangedListener(new zc(1));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context);
        this.H = x6Var;
        km0Var.addView(x6Var, c8.ja.o(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        km0Var.addView(this.G, c8.ja.o(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        CharSequence charSequence = "";
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.l8 l8Var7 = new org.telegram.ui.Cells.l8(context);
                this.I = l8Var7;
                org.telegram.ui.ActionBar.q6.R(l8Var7, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i17), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                this.G.addView(this.I, c8.ja.o(-1, -2));
                final int i22 = 15;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                    public final /* synthetic */ qn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                qn qnVar3 = this.b;
                                qnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", qnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qq qqVar = new qq(bundle);
                                qqVar.C0(qnVar3.y0);
                                qnVar3.presentFragment(qqVar);
                                break;
                            case 1:
                                qn qnVar4 = this.b;
                                on onVar = qnVar4.R0;
                                long j32 = qnVar4.C0;
                                if (!qnVar4.s.g()) {
                                    org.telegram.messenger.gc gcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                qn qnVar5 = this.b;
                                qnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", qnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qq qqVar2 = new qq(bundle2);
                                qqVar2.C0(qnVar5.y0);
                                qnVar5.presentFragment(qqVar2);
                                break;
                            case 3:
                                qn qnVar6 = this.b;
                                qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                break;
                            case 4:
                                qn qnVar7 = this.b;
                                qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                break;
                            case 5:
                                qn qnVar8 = this.b;
                                qnVar8.getClass();
                                qnVar8.presentFragment(new lb(qnVar8.x0));
                                break;
                            case 6:
                                qn qnVar9 = this.b;
                                qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                break;
                            case 7:
                                qn qnVar10 = this.b;
                                qnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", qnVar10.C0);
                                qnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                qn qnVar11 = this.b;
                                qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                qn.c0(this.b);
                                break;
                            case 14:
                                qn qnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                break;
                            case 15:
                                qn qnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(qnVar13)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -qnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.H0 = new kn(qnVar13, 6);
                                    qnVar13.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                qn qnVar14 = this.b;
                                long j10 = qnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                ho hoVar = new ho(null);
                                hoVar.N = new ArrayList();
                                hoVar.O = new ArrayList();
                                hoVar.Q = new ArrayList();
                                hoVar.d0 = true;
                                hoVar.g0 = new ArrayList();
                                hoVar.p0 = new HashMap();
                                hoVar.r0 = new sn(hoVar, 5);
                                hoVar.t0 = false;
                                hoVar.a0 = j10;
                                hoVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                hoVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        hoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        hoVar.d0(false);
                                    }
                                }
                                qnVar14.presentFragment(hoVar);
                                break;
                            case 17:
                                qn qnVar15 = this.b;
                                long j11 = qnVar15.w0;
                                to toVar = new to(null);
                                toVar.w = new ArrayList();
                                boolean z172 = false;
                                toVar.P = false;
                                toVar.Q = false;
                                toVar.F = j11;
                                TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                toVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                    z172 = true;
                                }
                                toVar.s = z172;
                                toVar.h = qnVar15.y0;
                                qnVar15.presentFragment(toVar);
                                break;
                            case 18:
                                qn qnVar16 = this.b;
                                es0 es0Var = new es0(qnVar16.w0);
                                es0Var.s = new kn(qnVar16, 4);
                                qnVar16.presentFragment(es0Var);
                                break;
                            case 19:
                                qn.e0(this.b);
                                break;
                            case 20:
                                qn qnVar17 = this.b;
                                j40 j40Var = new j40(-qnVar17.x0.id);
                                j40Var.c = qnVar17.M0;
                                j40Var.m0 = qnVar17;
                                qnVar17.presentFragment(j40Var);
                                break;
                            case 21:
                                qn qnVar18 = this.b;
                                qnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", qnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                qq qqVar3 = new qq(bundle4);
                                qqVar3.C0(qnVar18.y0);
                                qnVar18.presentFragment(qqVar3);
                                break;
                            case 22:
                                qn qnVar19 = this.b;
                                cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                qnVar19.presentFragment(cf0Var);
                                break;
                            case 23:
                                qn qnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                    qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", qnVar20.w0);
                                    ap apVar = new ap(bundle5);
                                    TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                    apVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (apVar.a == null) {
                                            apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                        }
                                        apVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            apVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            apVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            apVar.w = 1;
                                        }
                                    }
                                    qnVar20.presentFragment(apVar);
                                    break;
                                }
                            default:
                                qn qnVar21 = this.b;
                                qnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", qnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                qnVar21.presentFragment(new an(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.l8 l8Var8 = new org.telegram.ui.Cells.l8(context);
                this.J = l8Var8;
                org.telegram.ui.ActionBar.q6.R(l8Var8, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i17), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                this.G.addView(this.J, c8.ja.o(-1, -2));
                final int i23 = 16;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                    public final /* synthetic */ qn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                qn qnVar3 = this.b;
                                qnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", qnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qq qqVar = new qq(bundle);
                                qqVar.C0(qnVar3.y0);
                                qnVar3.presentFragment(qqVar);
                                break;
                            case 1:
                                qn qnVar4 = this.b;
                                on onVar = qnVar4.R0;
                                long j32 = qnVar4.C0;
                                if (!qnVar4.s.g()) {
                                    org.telegram.messenger.gc gcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                qn qnVar5 = this.b;
                                qnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", qnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qq qqVar2 = new qq(bundle2);
                                qqVar2.C0(qnVar5.y0);
                                qnVar5.presentFragment(qqVar2);
                                break;
                            case 3:
                                qn qnVar6 = this.b;
                                qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                break;
                            case 4:
                                qn qnVar7 = this.b;
                                qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                break;
                            case 5:
                                qn qnVar8 = this.b;
                                qnVar8.getClass();
                                qnVar8.presentFragment(new lb(qnVar8.x0));
                                break;
                            case 6:
                                qn qnVar9 = this.b;
                                qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                break;
                            case 7:
                                qn qnVar10 = this.b;
                                qnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", qnVar10.C0);
                                qnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                qn qnVar11 = this.b;
                                qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                qn.c0(this.b);
                                break;
                            case 14:
                                qn qnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                break;
                            case 15:
                                qn qnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(qnVar13)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -qnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.H0 = new kn(qnVar13, 6);
                                    qnVar13.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                qn qnVar14 = this.b;
                                long j10 = qnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                ho hoVar = new ho(null);
                                hoVar.N = new ArrayList();
                                hoVar.O = new ArrayList();
                                hoVar.Q = new ArrayList();
                                hoVar.d0 = true;
                                hoVar.g0 = new ArrayList();
                                hoVar.p0 = new HashMap();
                                hoVar.r0 = new sn(hoVar, 5);
                                hoVar.t0 = false;
                                hoVar.a0 = j10;
                                hoVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                hoVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        hoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        hoVar.d0(false);
                                    }
                                }
                                qnVar14.presentFragment(hoVar);
                                break;
                            case 17:
                                qn qnVar15 = this.b;
                                long j11 = qnVar15.w0;
                                to toVar = new to(null);
                                toVar.w = new ArrayList();
                                boolean z172 = false;
                                toVar.P = false;
                                toVar.Q = false;
                                toVar.F = j11;
                                TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                toVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                    z172 = true;
                                }
                                toVar.s = z172;
                                toVar.h = qnVar15.y0;
                                qnVar15.presentFragment(toVar);
                                break;
                            case 18:
                                qn qnVar16 = this.b;
                                es0 es0Var = new es0(qnVar16.w0);
                                es0Var.s = new kn(qnVar16, 4);
                                qnVar16.presentFragment(es0Var);
                                break;
                            case 19:
                                qn.e0(this.b);
                                break;
                            case 20:
                                qn qnVar17 = this.b;
                                j40 j40Var = new j40(-qnVar17.x0.id);
                                j40Var.c = qnVar17.M0;
                                j40Var.m0 = qnVar17;
                                qnVar17.presentFragment(j40Var);
                                break;
                            case 21:
                                qn qnVar18 = this.b;
                                qnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", qnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                qq qqVar3 = new qq(bundle4);
                                qqVar3.C0(qnVar18.y0);
                                qnVar18.presentFragment(qqVar3);
                                break;
                            case 22:
                                qn qnVar19 = this.b;
                                cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                qnVar19.presentFragment(cf0Var);
                                break;
                            case 23:
                                qn qnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                    qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", qnVar20.w0);
                                    ap apVar = new ap(bundle5);
                                    TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                    apVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (apVar.a == null) {
                                            apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                        }
                                        apVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            apVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            apVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            apVar.w = 1;
                                        }
                                    }
                                    qnVar20.presentFragment(apVar);
                                    break;
                                }
                            default:
                                qn qnVar21 = this.b;
                                qnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", qnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                qnVar21.presentFragment(new an(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.T(this.x0) && ((this.J0 && org.telegram.messenger.t3.y(1, this.x0)) || (!this.J0 && org.telegram.messenger.t3.y(0, this.x0)))) {
                org.telegram.ui.Cells.l8 l8Var9 = new org.telegram.ui.Cells.l8(context);
                this.K = l8Var9;
                org.telegram.ui.ActionBar.q6.R(l8Var9, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i17), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                this.G.addView(this.K, c8.ja.o(-1, -2));
                final int i24 = 17;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                    public final /* synthetic */ qn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                qn qnVar3 = this.b;
                                qnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", qnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qq qqVar = new qq(bundle);
                                qqVar.C0(qnVar3.y0);
                                qnVar3.presentFragment(qqVar);
                                break;
                            case 1:
                                qn qnVar4 = this.b;
                                on onVar = qnVar4.R0;
                                long j32 = qnVar4.C0;
                                if (!qnVar4.s.g()) {
                                    org.telegram.messenger.gc gcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                qn qnVar5 = this.b;
                                qnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", qnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qq qqVar2 = new qq(bundle2);
                                qqVar2.C0(qnVar5.y0);
                                qnVar5.presentFragment(qqVar2);
                                break;
                            case 3:
                                qn qnVar6 = this.b;
                                qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                break;
                            case 4:
                                qn qnVar7 = this.b;
                                qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                break;
                            case 5:
                                qn qnVar8 = this.b;
                                qnVar8.getClass();
                                qnVar8.presentFragment(new lb(qnVar8.x0));
                                break;
                            case 6:
                                qn qnVar9 = this.b;
                                qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                break;
                            case 7:
                                qn qnVar10 = this.b;
                                qnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", qnVar10.C0);
                                qnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                qn qnVar11 = this.b;
                                qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                qn.c0(this.b);
                                break;
                            case 14:
                                qn qnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                break;
                            case 15:
                                qn qnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(qnVar13)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -qnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.H0 = new kn(qnVar13, 6);
                                    qnVar13.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                qn qnVar14 = this.b;
                                long j10 = qnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                ho hoVar = new ho(null);
                                hoVar.N = new ArrayList();
                                hoVar.O = new ArrayList();
                                hoVar.Q = new ArrayList();
                                hoVar.d0 = true;
                                hoVar.g0 = new ArrayList();
                                hoVar.p0 = new HashMap();
                                hoVar.r0 = new sn(hoVar, 5);
                                hoVar.t0 = false;
                                hoVar.a0 = j10;
                                hoVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                hoVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        hoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        hoVar.d0(false);
                                    }
                                }
                                qnVar14.presentFragment(hoVar);
                                break;
                            case 17:
                                qn qnVar15 = this.b;
                                long j11 = qnVar15.w0;
                                to toVar = new to(null);
                                toVar.w = new ArrayList();
                                boolean z172 = false;
                                toVar.P = false;
                                toVar.Q = false;
                                toVar.F = j11;
                                TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                toVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                    z172 = true;
                                }
                                toVar.s = z172;
                                toVar.h = qnVar15.y0;
                                qnVar15.presentFragment(toVar);
                                break;
                            case 18:
                                qn qnVar16 = this.b;
                                es0 es0Var = new es0(qnVar16.w0);
                                es0Var.s = new kn(qnVar16, 4);
                                qnVar16.presentFragment(es0Var);
                                break;
                            case 19:
                                qn.e0(this.b);
                                break;
                            case 20:
                                qn qnVar17 = this.b;
                                j40 j40Var = new j40(-qnVar17.x0.id);
                                j40Var.c = qnVar17.M0;
                                j40Var.m0 = qnVar17;
                                qnVar17.presentFragment(j40Var);
                                break;
                            case 21:
                                qn qnVar18 = this.b;
                                qnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", qnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                qq qqVar3 = new qq(bundle4);
                                qqVar3.C0(qnVar18.y0);
                                qnVar18.presentFragment(qqVar3);
                                break;
                            case 22:
                                qn qnVar19 = this.b;
                                cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                qnVar19.presentFragment(cf0Var);
                                break;
                            case 23:
                                qn qnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                    qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", qnVar20.w0);
                                    ap apVar = new ap(bundle5);
                                    TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                    apVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (apVar.a == null) {
                                            apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                        }
                                        apVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            apVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            apVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            apVar.w = 1;
                                        }
                                    }
                                    qnVar20.presentFragment(apVar);
                                    break;
                                }
                            default:
                                qn qnVar21 = this.b;
                                qnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", qnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                qnVar21.presentFragment(new an(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.V(this.x0) && this.J0 && org.telegram.messenger.t3.y(1, this.x0)) {
                org.telegram.ui.Cells.l8 l8Var10 = new org.telegram.ui.Cells.l8(context);
                this.L = l8Var10;
                org.telegram.ui.ActionBar.q6.R(l8Var10, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i17), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                this.L.s(org.telegram.messenger.hd.L0(2131747096), "", R.drawable.msg_markunread, true);
                this.G.addView(this.L, c8.ja.o(-1, -2));
                final int i25 = 18;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                    public final /* synthetic */ qn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                qn qnVar3 = this.b;
                                qnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", qnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qq qqVar = new qq(bundle);
                                qqVar.C0(qnVar3.y0);
                                qnVar3.presentFragment(qqVar);
                                break;
                            case 1:
                                qn qnVar4 = this.b;
                                on onVar = qnVar4.R0;
                                long j32 = qnVar4.C0;
                                if (!qnVar4.s.g()) {
                                    org.telegram.messenger.gc gcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                qn qnVar5 = this.b;
                                qnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", qnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qq qqVar2 = new qq(bundle2);
                                qqVar2.C0(qnVar5.y0);
                                qnVar5.presentFragment(qqVar2);
                                break;
                            case 3:
                                qn qnVar6 = this.b;
                                qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                break;
                            case 4:
                                qn qnVar7 = this.b;
                                qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                break;
                            case 5:
                                qn qnVar8 = this.b;
                                qnVar8.getClass();
                                qnVar8.presentFragment(new lb(qnVar8.x0));
                                break;
                            case 6:
                                qn qnVar9 = this.b;
                                qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                break;
                            case 7:
                                qn qnVar10 = this.b;
                                qnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", qnVar10.C0);
                                qnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                qn qnVar11 = this.b;
                                qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                qn.c0(this.b);
                                break;
                            case 14:
                                qn qnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                break;
                            case 15:
                                qn qnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(qnVar13)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -qnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.H0 = new kn(qnVar13, 6);
                                    qnVar13.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                qn qnVar14 = this.b;
                                long j10 = qnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                ho hoVar = new ho(null);
                                hoVar.N = new ArrayList();
                                hoVar.O = new ArrayList();
                                hoVar.Q = new ArrayList();
                                hoVar.d0 = true;
                                hoVar.g0 = new ArrayList();
                                hoVar.p0 = new HashMap();
                                hoVar.r0 = new sn(hoVar, 5);
                                hoVar.t0 = false;
                                hoVar.a0 = j10;
                                hoVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                hoVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        hoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        hoVar.d0(false);
                                    }
                                }
                                qnVar14.presentFragment(hoVar);
                                break;
                            case 17:
                                qn qnVar15 = this.b;
                                long j11 = qnVar15.w0;
                                to toVar = new to(null);
                                toVar.w = new ArrayList();
                                boolean z172 = false;
                                toVar.P = false;
                                toVar.Q = false;
                                toVar.F = j11;
                                TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                toVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                    z172 = true;
                                }
                                toVar.s = z172;
                                toVar.h = qnVar15.y0;
                                qnVar15.presentFragment(toVar);
                                break;
                            case 18:
                                qn qnVar16 = this.b;
                                es0 es0Var = new es0(qnVar16.w0);
                                es0Var.s = new kn(qnVar16, 4);
                                qnVar16.presentFragment(es0Var);
                                break;
                            case 19:
                                qn.e0(this.b);
                                break;
                            case 20:
                                qn qnVar17 = this.b;
                                j40 j40Var = new j40(-qnVar17.x0.id);
                                j40Var.c = qnVar17.M0;
                                j40Var.m0 = qnVar17;
                                qnVar17.presentFragment(j40Var);
                                break;
                            case 21:
                                qn qnVar18 = this.b;
                                qnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", qnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                qq qqVar3 = new qq(bundle4);
                                qqVar3.C0(qnVar18.y0);
                                qnVar18.presentFragment(qqVar3);
                                break;
                            case 22:
                                qn qnVar19 = this.b;
                                cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                qnVar19.presentFragment(cf0Var);
                                break;
                            case 23:
                                qn qnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                    qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", qnVar20.w0);
                                    ap apVar = new ap(bundle5);
                                    TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                    apVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (apVar.a == null) {
                                            apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                        }
                                        apVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            apVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            apVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            apVar.w = 1;
                                        }
                                    }
                                    qnVar20.presentFragment(apVar);
                                    break;
                                }
                            default:
                                qn qnVar21 = this.b;
                                qnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", qnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                qnVar21.presentFragment(new an(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.V(this.x0) && org.telegram.messenger.t3.d(this.x0)) {
                i7 = i17;
                z12 = 1;
                ol0 ol0Var = new ol0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.M = ol0Var;
                org.telegram.ui.ActionBar.q6.R(ol0Var, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                this.G.addView(this.M, c8.ja.o(-1, -2));
                final int i26 = 19;
                this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.en
                    public final /* synthetic */ qn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                qn qnVar3 = this.b;
                                qnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", qnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qq qqVar = new qq(bundle);
                                qqVar.C0(qnVar3.y0);
                                qnVar3.presentFragment(qqVar);
                                break;
                            case 1:
                                qn qnVar4 = this.b;
                                on onVar = qnVar4.R0;
                                long j32 = qnVar4.C0;
                                if (!qnVar4.s.g()) {
                                    org.telegram.messenger.gc gcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                qn qnVar5 = this.b;
                                qnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", qnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qq qqVar2 = new qq(bundle2);
                                qqVar2.C0(qnVar5.y0);
                                qnVar5.presentFragment(qqVar2);
                                break;
                            case 3:
                                qn qnVar6 = this.b;
                                qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                break;
                            case 4:
                                qn qnVar7 = this.b;
                                qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                break;
                            case 5:
                                qn qnVar8 = this.b;
                                qnVar8.getClass();
                                qnVar8.presentFragment(new lb(qnVar8.x0));
                                break;
                            case 6:
                                qn qnVar9 = this.b;
                                qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                break;
                            case 7:
                                qn qnVar10 = this.b;
                                qnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", qnVar10.C0);
                                qnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                qn qnVar11 = this.b;
                                qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                qn.c0(this.b);
                                break;
                            case 14:
                                qn qnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                break;
                            case 15:
                                qn qnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(qnVar13)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -qnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.H0 = new kn(qnVar13, 6);
                                    qnVar13.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                qn qnVar14 = this.b;
                                long j10 = qnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                ho hoVar = new ho(null);
                                hoVar.N = new ArrayList();
                                hoVar.O = new ArrayList();
                                hoVar.Q = new ArrayList();
                                hoVar.d0 = true;
                                hoVar.g0 = new ArrayList();
                                hoVar.p0 = new HashMap();
                                hoVar.r0 = new sn(hoVar, 5);
                                hoVar.t0 = false;
                                hoVar.a0 = j10;
                                hoVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                hoVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        hoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        hoVar.d0(false);
                                    }
                                }
                                qnVar14.presentFragment(hoVar);
                                break;
                            case 17:
                                qn qnVar15 = this.b;
                                long j11 = qnVar15.w0;
                                to toVar = new to(null);
                                toVar.w = new ArrayList();
                                boolean z172 = false;
                                toVar.P = false;
                                toVar.Q = false;
                                toVar.F = j11;
                                TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                toVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                    z172 = true;
                                }
                                toVar.s = z172;
                                toVar.h = qnVar15.y0;
                                qnVar15.presentFragment(toVar);
                                break;
                            case 18:
                                qn qnVar16 = this.b;
                                es0 es0Var = new es0(qnVar16.w0);
                                es0Var.s = new kn(qnVar16, 4);
                                qnVar16.presentFragment(es0Var);
                                break;
                            case 19:
                                qn.e0(this.b);
                                break;
                            case 20:
                                qn qnVar17 = this.b;
                                j40 j40Var = new j40(-qnVar17.x0.id);
                                j40Var.c = qnVar17.M0;
                                j40Var.m0 = qnVar17;
                                qnVar17.presentFragment(j40Var);
                                break;
                            case 21:
                                qn qnVar18 = this.b;
                                qnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", qnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                qq qqVar3 = new qq(bundle4);
                                qqVar3.C0(qnVar18.y0);
                                qnVar18.presentFragment(qqVar3);
                                break;
                            case 22:
                                qn qnVar19 = this.b;
                                cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                qnVar19.presentFragment(cf0Var);
                                break;
                            case 23:
                                qn qnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                    qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", qnVar20.w0);
                                    ap apVar = new ap(bundle5);
                                    TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                    apVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (apVar.a == null) {
                                            apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                        }
                                        apVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            apVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            apVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            apVar.w = 1;
                                        }
                                    }
                                    qnVar20.presentFragment(apVar);
                                    break;
                                }
                            default:
                                qn qnVar21 = this.b;
                                qnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", qnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                qnVar21.presentFragment(new an(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i7 = i17;
                z12 = 1;
            }
            if (!org.telegram.messenger.t3.V(this.x0) || org.telegram.messenger.t3.Y(this.x0)) {
                context4 = context;
                frameLayout = frameLayout2;
                num = 1;
                qnVar = this;
            } else {
                long j10 = -this.x0.id;
                num = 1;
                org.telegram.ui.Cells.l8 l8Var11 = new org.telegram.ui.Cells.l8(23, context, this.resourceProvider, false, true);
                context4 = context;
                this.N = l8Var11;
                org.telegram.ui.ActionBar.q6.R(l8Var11, org.telegram.ui.ActionBar.j6.N0(z12), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                this.N.n(R.drawable.msg_translate, org.telegram.messenger.hd.L0(2131752458), this.x0.autotranslation);
                final int i27 = 0;
                getMessagesController().G0().a(j10, new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.in
                    public final /* synthetic */ qn b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        int i28 = i27;
                        qn qnVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i28) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    qnVar3.getClass();
                                    break;
                                } else {
                                    qnVar3.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < qnVar3.getMessagesController().B4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                qnVar3.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                this.G.addView(this.N, c8.ja.o(-1, -2));
                boolean[] zArr = new boolean[z12];
                zArr[0] = false;
                frameLayout = frameLayout2;
                qnVar = this;
                this.N.setOnClickListener(new di.v2(this, zArr, j10, 1));
            }
            if (!qnVar.J0 && org.telegram.messenger.t3.w(2, qnVar.x0) && (org.telegram.messenger.t3.T(qnVar.x0) || qnVar.x0.creator)) {
                org.telegram.ui.Cells.l8 l8Var12 = new org.telegram.ui.Cells.l8(context4);
                qnVar.O = l8Var12;
                org.telegram.ui.ActionBar.q6.R(l8Var12, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                qnVar.G.addView(qnVar.O, c8.ja.o(-1, -2));
                i10 = 21;
                qnVar.O.setOnClickListener(new org.telegram.messenger.video.e(i10, qnVar, context4));
            } else {
                i10 = 21;
            }
            if (org.telegram.messenger.t3.n0(qnVar.x0) && org.telegram.messenger.t3.N(qnVar.x0) && !org.telegram.messenger.t3.Y(qnVar.x0)) {
                final int i28 = 1;
                org.telegram.messenger.np.s1(qnVar.currentAccount).G0().a(-qnVar.x0.id, new org.telegram.messenger.z10(qnVar) { // from class: org.telegram.ui.in
                    public final /* synthetic */ qn b;

                    {
                        this.b = qnVar;
                    }

                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        int i282 = i28;
                        qn qnVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i282) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    qnVar3.getClass();
                                    break;
                                } else {
                                    qnVar3.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < qnVar3.getMessagesController().B4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                qnVar3.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                ol0 ol0Var2 = new ol0(qnVar.currentAccount, -qnVar.x0.id, context4, qnVar.getResourceProvider());
                qnVar.M = ol0Var2;
                org.telegram.ui.ActionBar.q6.R(ol0Var2, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                qnVar.G.addView(qnVar.M, c8.ja.o(-1, -2));
                final int i29 = 20;
                qnVar.M.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                    public final /* synthetic */ qn b;

                    {
                        this.b = qnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i29) {
                            case 0:
                                qn qnVar3 = this.b;
                                qnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", qnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qq qqVar = new qq(bundle);
                                qqVar.C0(qnVar3.y0);
                                qnVar3.presentFragment(qqVar);
                                break;
                            case 1:
                                qn qnVar4 = this.b;
                                on onVar = qnVar4.R0;
                                long j32 = qnVar4.C0;
                                if (!qnVar4.s.g()) {
                                    org.telegram.messenger.gc gcVar = null;
                                    TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().I2(null, qnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                qn qnVar5 = this.b;
                                qnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", qnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qq qqVar2 = new qq(bundle2);
                                qqVar2.C0(qnVar5.y0);
                                qnVar5.presentFragment(qqVar2);
                                break;
                            case 3:
                                qn qnVar6 = this.b;
                                qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                break;
                            case 4:
                                qn qnVar7 = this.b;
                                qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                break;
                            case 5:
                                qn qnVar8 = this.b;
                                qnVar8.getClass();
                                qnVar8.presentFragment(new lb(qnVar8.x0));
                                break;
                            case 6:
                                qn qnVar9 = this.b;
                                qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                break;
                            case 7:
                                qn qnVar10 = this.b;
                                qnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", qnVar10.C0);
                                qnVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                qn qnVar11 = this.b;
                                qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                qn.c0(this.b);
                                break;
                            case 14:
                                qn qnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                break;
                            case 15:
                                qn qnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(qnVar13)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -qnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.H0 = new kn(qnVar13, 6);
                                    qnVar13.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                qn qnVar14 = this.b;
                                long j102 = qnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                ho hoVar = new ho(null);
                                hoVar.N = new ArrayList();
                                hoVar.O = new ArrayList();
                                hoVar.Q = new ArrayList();
                                hoVar.d0 = true;
                                hoVar.g0 = new ArrayList();
                                hoVar.p0 = new HashMap();
                                hoVar.r0 = new sn(hoVar, 5);
                                hoVar.t0 = false;
                                hoVar.a0 = j102;
                                hoVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                hoVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        hoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        hoVar.d0(false);
                                    }
                                }
                                qnVar14.presentFragment(hoVar);
                                break;
                            case 17:
                                qn qnVar15 = this.b;
                                long j11 = qnVar15.w0;
                                to toVar = new to(null);
                                toVar.w = new ArrayList();
                                boolean z172 = false;
                                toVar.P = false;
                                toVar.Q = false;
                                toVar.F = j11;
                                TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                toVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                    z172 = true;
                                }
                                toVar.s = z172;
                                toVar.h = qnVar15.y0;
                                qnVar15.presentFragment(toVar);
                                break;
                            case 18:
                                qn qnVar16 = this.b;
                                es0 es0Var = new es0(qnVar16.w0);
                                es0Var.s = new kn(qnVar16, 4);
                                qnVar16.presentFragment(es0Var);
                                break;
                            case 19:
                                qn.e0(this.b);
                                break;
                            case 20:
                                qn qnVar17 = this.b;
                                j40 j40Var = new j40(-qnVar17.x0.id);
                                j40Var.c = qnVar17.M0;
                                j40Var.m0 = qnVar17;
                                qnVar17.presentFragment(j40Var);
                                break;
                            case 21:
                                qn qnVar18 = this.b;
                                qnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", qnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                qq qqVar3 = new qq(bundle4);
                                qqVar3.C0(qnVar18.y0);
                                qnVar18.presentFragment(qqVar3);
                                break;
                            case 22:
                                qn qnVar19 = this.b;
                                cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                qnVar19.presentFragment(cf0Var);
                                break;
                            case 23:
                                qn qnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                    qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", qnVar20.w0);
                                    ap apVar = new ap(bundle5);
                                    TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                    apVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (apVar.a == null) {
                                            apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                        }
                                        apVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            apVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            apVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            apVar.w = 1;
                                        }
                                    }
                                    qnVar20.presentFragment(apVar);
                                    break;
                                }
                            default:
                                qn qnVar21 = this.b;
                                qnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", qnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                qnVar21.presentFragment(new an(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!qnVar.J0 && qnVar.x0.creator) {
                org.telegram.ui.Cells.l8 l8Var13 = new org.telegram.ui.Cells.l8(23, context, null, false, true);
                context2 = context;
                qnVar.R = l8Var13;
                org.telegram.ui.ActionBar.q6.R(l8Var13, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(i7), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                qnVar.R.n(R.drawable.msg_topics, org.telegram.messenger.hd.L0(2131752281), qnVar.F0);
                qnVar.R.getCheckBox().setIcon(qnVar.G0 ? 0 : R.drawable.permission_locked);
                qnVar.G.addView(qnVar.R, c8.ja.c(-2.0f, -1));
                qnVar.R.setOnClickListener(new org.telegram.messenger.video.e(22, qnVar, frameLayout));
            } else {
                context2 = context;
            }
            qnVar.t0();
        } else {
            i7 = i17;
            context2 = context;
            num = 1;
            i10 = 21;
            qnVar = this;
        }
        qnVar.simpleActionBar.r();
        if (qnVar.D0 != null || org.telegram.messenger.t3.d(qnVar.x0) || qnVar.O != null) {
            qnVar.a = qnVar.simpleActionBar.q(org.telegram.messenger.hd.L0(2131745946));
        }
        if (qnVar.I == null && qnVar.O == null && qnVar.J == null && qnVar.K == null && qnVar.R == null) {
            i11 = -2;
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context2, qnVar.resourceProvider);
            qnVar.Q = y8Var;
            if (qnVar.R != null) {
                y8Var.setText(org.telegram.messenger.hd.L0(2131750588));
            } else {
                y8Var.setFixedSize(12);
            }
            i11 = -2;
            km0Var.addView(qnVar.Q, c8.ja.o(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        qnVar.S = linearLayout5;
        linearLayout5.setOrientation(1);
        km0Var.addView(qnVar.S, c8.ja.o(-1, i11));
        final int i30 = 8;
        if (qnVar.x0 != null) {
            org.telegram.ui.Cells.l8 l8Var14 = new org.telegram.ui.Cells.l8(context2);
            qnVar.Y = l8Var14;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.j6.N0(false);
            int i31 = org.telegram.ui.ActionBar.j6.i6;
            m6Var = null;
            org.telegram.ui.ActionBar.q6.R(l8Var14, N0, null, org.telegram.ui.ActionBar.q6.M(i31));
            org.telegram.ui.Cells.l8 l8Var15 = qnVar.Y;
            if (!org.telegram.messenger.t3.T(qnVar.x0)) {
                TLRPC.Chat chat5 = qnVar.x0;
                if (!chat5.creator && (!org.telegram.messenger.t3.N(chat5) || !org.telegram.messenger.t3.d(qnVar.x0))) {
                    i13 = 8;
                    l8Var15.setVisibility(i13);
                    qnVar.Y.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j11 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j11;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l8 l8Var16 = new org.telegram.ui.Cells.l8(context2);
                    qnVar.W = l8Var16;
                    org.telegram.ui.ActionBar.q6.R(l8Var16, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                    final int i32 = 22;
                    qnVar.W.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j11 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j11;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l8 l8Var17 = new org.telegram.ui.Cells.l8(context2);
                    qnVar.P = l8Var17;
                    org.telegram.ui.ActionBar.q6.R(l8Var17, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                    final int i33 = 23;
                    qnVar.P.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j11 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j11;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    if (org.telegram.messenger.t3.y(28, qnVar.x0)) {
                        org.telegram.ui.Cells.l8 l8Var18 = new org.telegram.ui.Cells.l8(context2);
                        qnVar.f0 = l8Var18;
                        org.telegram.ui.ActionBar.q6.R(l8Var18, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                        final int i34 = 24;
                        qnVar.f0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                            public final /* synthetic */ qn b;

                            {
                                this.b = qnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i34) {
                                    case 0:
                                        qn qnVar3 = this.b;
                                        qnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", qnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qq qqVar = new qq(bundle);
                                        qqVar.C0(qnVar3.y0);
                                        qnVar3.presentFragment(qqVar);
                                        break;
                                    case 1:
                                        qn qnVar4 = this.b;
                                        on onVar = qnVar4.R0;
                                        long j32 = qnVar4.C0;
                                        if (!qnVar4.s.g()) {
                                            org.telegram.messenger.gc gcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        qn qnVar5 = this.b;
                                        qnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", qnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qq qqVar2 = new qq(bundle2);
                                        qqVar2.C0(qnVar5.y0);
                                        qnVar5.presentFragment(qqVar2);
                                        break;
                                    case 3:
                                        qn qnVar6 = this.b;
                                        qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                        break;
                                    case 4:
                                        qn qnVar7 = this.b;
                                        qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                        break;
                                    case 5:
                                        qn qnVar8 = this.b;
                                        qnVar8.getClass();
                                        qnVar8.presentFragment(new lb(qnVar8.x0));
                                        break;
                                    case 6:
                                        qn qnVar9 = this.b;
                                        qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                        break;
                                    case 7:
                                        qn qnVar10 = this.b;
                                        qnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", qnVar10.C0);
                                        qnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        qn qnVar11 = this.b;
                                        qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        qn.c0(this.b);
                                        break;
                                    case 14:
                                        qn qnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                        break;
                                    case 15:
                                        qn qnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(qnVar13)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -qnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.H0 = new kn(qnVar13, 6);
                                            qnVar13.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        qn qnVar14 = this.b;
                                        long j102 = qnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        ho hoVar = new ho(null);
                                        hoVar.N = new ArrayList();
                                        hoVar.O = new ArrayList();
                                        hoVar.Q = new ArrayList();
                                        hoVar.d0 = true;
                                        hoVar.g0 = new ArrayList();
                                        hoVar.p0 = new HashMap();
                                        hoVar.r0 = new sn(hoVar, 5);
                                        hoVar.t0 = false;
                                        hoVar.a0 = j102;
                                        hoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                        hoVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                hoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                hoVar.d0(false);
                                            }
                                        }
                                        qnVar14.presentFragment(hoVar);
                                        break;
                                    case 17:
                                        qn qnVar15 = this.b;
                                        long j11 = qnVar15.w0;
                                        to toVar = new to(null);
                                        toVar.w = new ArrayList();
                                        boolean z172 = false;
                                        toVar.P = false;
                                        toVar.Q = false;
                                        toVar.F = j11;
                                        TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                        toVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        toVar.s = z172;
                                        toVar.h = qnVar15.y0;
                                        qnVar15.presentFragment(toVar);
                                        break;
                                    case 18:
                                        qn qnVar16 = this.b;
                                        es0 es0Var = new es0(qnVar16.w0);
                                        es0Var.s = new kn(qnVar16, 4);
                                        qnVar16.presentFragment(es0Var);
                                        break;
                                    case 19:
                                        qn.e0(this.b);
                                        break;
                                    case 20:
                                        qn qnVar17 = this.b;
                                        j40 j40Var = new j40(-qnVar17.x0.id);
                                        j40Var.c = qnVar17.M0;
                                        j40Var.m0 = qnVar17;
                                        qnVar17.presentFragment(j40Var);
                                        break;
                                    case 21:
                                        qn qnVar18 = this.b;
                                        qnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", qnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                        qq qqVar3 = new qq(bundle4);
                                        qqVar3.C0(qnVar18.y0);
                                        qnVar18.presentFragment(qqVar3);
                                        break;
                                    case 22:
                                        qn qnVar19 = this.b;
                                        cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                        cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                        qnVar19.presentFragment(cf0Var);
                                        break;
                                    case 23:
                                        qn qnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                            qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", qnVar20.w0);
                                            ap apVar = new ap(bundle5);
                                            TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                            apVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (apVar.a == null) {
                                                    apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                                }
                                                apVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    apVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    apVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    apVar.w = 1;
                                                }
                                            }
                                            qnVar20.presentFragment(apVar);
                                            break;
                                        }
                                    default:
                                        qn qnVar21 = this.b;
                                        qnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", qnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                        qnVar21.presentFragment(new an(bundle6));
                                        break;
                                }
                            }
                        });
                        qnVar.k0();
                    }
                    org.telegram.ui.Cells.l8 l8Var19 = new org.telegram.ui.Cells.l8(context2);
                    qnVar.X = l8Var19;
                    final int i35 = 0;
                    org.telegram.ui.ActionBar.q6.R(l8Var19, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                    qnVar.X.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i35) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j11 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j11;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l8 l8Var20 = new org.telegram.ui.Cells.l8(context2);
                    qnVar.U = l8Var20;
                    org.telegram.ui.ActionBar.q6.R(l8Var20, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                    final int i36 = 2;
                    qnVar.U.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j11 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j11;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!org.telegram.messenger.t3.V(qnVar.x0)) {
                        org.telegram.ui.Cells.l8 l8Var21 = new org.telegram.ui.Cells.l8(context2);
                        qnVar.V = l8Var21;
                        org.telegram.ui.ActionBar.q6.R(l8Var21, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                        final int i37 = 3;
                        qnVar.V.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                            public final /* synthetic */ qn b;

                            {
                                this.b = qnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i37) {
                                    case 0:
                                        qn qnVar3 = this.b;
                                        qnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", qnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qq qqVar = new qq(bundle);
                                        qqVar.C0(qnVar3.y0);
                                        qnVar3.presentFragment(qqVar);
                                        break;
                                    case 1:
                                        qn qnVar4 = this.b;
                                        on onVar = qnVar4.R0;
                                        long j32 = qnVar4.C0;
                                        if (!qnVar4.s.g()) {
                                            org.telegram.messenger.gc gcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        qn qnVar5 = this.b;
                                        qnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", qnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qq qqVar2 = new qq(bundle2);
                                        qqVar2.C0(qnVar5.y0);
                                        qnVar5.presentFragment(qqVar2);
                                        break;
                                    case 3:
                                        qn qnVar6 = this.b;
                                        qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                        break;
                                    case 4:
                                        qn qnVar7 = this.b;
                                        qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                        break;
                                    case 5:
                                        qn qnVar8 = this.b;
                                        qnVar8.getClass();
                                        qnVar8.presentFragment(new lb(qnVar8.x0));
                                        break;
                                    case 6:
                                        qn qnVar9 = this.b;
                                        qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                        break;
                                    case 7:
                                        qn qnVar10 = this.b;
                                        qnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", qnVar10.C0);
                                        qnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        qn qnVar11 = this.b;
                                        qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        qn.c0(this.b);
                                        break;
                                    case 14:
                                        qn qnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                        break;
                                    case 15:
                                        qn qnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(qnVar13)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -qnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.H0 = new kn(qnVar13, 6);
                                            qnVar13.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        qn qnVar14 = this.b;
                                        long j102 = qnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        ho hoVar = new ho(null);
                                        hoVar.N = new ArrayList();
                                        hoVar.O = new ArrayList();
                                        hoVar.Q = new ArrayList();
                                        hoVar.d0 = true;
                                        hoVar.g0 = new ArrayList();
                                        hoVar.p0 = new HashMap();
                                        hoVar.r0 = new sn(hoVar, 5);
                                        hoVar.t0 = false;
                                        hoVar.a0 = j102;
                                        hoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                        hoVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                hoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                hoVar.d0(false);
                                            }
                                        }
                                        qnVar14.presentFragment(hoVar);
                                        break;
                                    case 17:
                                        qn qnVar15 = this.b;
                                        long j11 = qnVar15.w0;
                                        to toVar = new to(null);
                                        toVar.w = new ArrayList();
                                        boolean z172 = false;
                                        toVar.P = false;
                                        toVar.Q = false;
                                        toVar.F = j11;
                                        TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                        toVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        toVar.s = z172;
                                        toVar.h = qnVar15.y0;
                                        qnVar15.presentFragment(toVar);
                                        break;
                                    case 18:
                                        qn qnVar16 = this.b;
                                        es0 es0Var = new es0(qnVar16.w0);
                                        es0Var.s = new kn(qnVar16, 4);
                                        qnVar16.presentFragment(es0Var);
                                        break;
                                    case 19:
                                        qn.e0(this.b);
                                        break;
                                    case 20:
                                        qn qnVar17 = this.b;
                                        j40 j40Var = new j40(-qnVar17.x0.id);
                                        j40Var.c = qnVar17.M0;
                                        j40Var.m0 = qnVar17;
                                        qnVar17.presentFragment(j40Var);
                                        break;
                                    case 21:
                                        qn qnVar18 = this.b;
                                        qnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", qnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                        qq qqVar3 = new qq(bundle4);
                                        qqVar3.C0(qnVar18.y0);
                                        qnVar18.presentFragment(qqVar3);
                                        break;
                                    case 22:
                                        qn qnVar19 = this.b;
                                        cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                        cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                        qnVar19.presentFragment(cf0Var);
                                        break;
                                    case 23:
                                        qn qnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                            qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", qnVar20.w0);
                                            ap apVar = new ap(bundle5);
                                            TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                            apVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (apVar.a == null) {
                                                    apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                                }
                                                apVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    apVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    apVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    apVar.w = 1;
                                                }
                                            }
                                            qnVar20.presentFragment(apVar);
                                            break;
                                        }
                                    default:
                                        qn qnVar21 = this.b;
                                        qnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", qnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                        qnVar21.presentFragment(new an(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.l8 l8Var22 = new org.telegram.ui.Cells.l8(context2);
                    qnVar.a0 = l8Var22;
                    l8Var22.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.hd.L0(2131752471)), false);
                    org.telegram.ui.ActionBar.q6.R(qnVar.a0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                    final int i38 = 4;
                    qnVar.a0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i38) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j11 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j11;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    qnVar.a0.setVisibility(8);
                    if (!org.telegram.messenger.t3.T(qnVar.x0) || qnVar.x0.gigagroup) {
                        org.telegram.ui.Cells.l8 l8Var23 = new org.telegram.ui.Cells.l8(context2);
                        qnVar.Z = l8Var23;
                        l8Var23.o(R.drawable.msg_log, org.telegram.messenger.hd.L0(2131751079), false);
                        org.telegram.ui.ActionBar.q6.R(qnVar.Z, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                        final int i39 = 5;
                        qnVar.Z.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                            public final /* synthetic */ qn b;

                            {
                                this.b = qnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i39) {
                                    case 0:
                                        qn qnVar3 = this.b;
                                        qnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", qnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qq qqVar = new qq(bundle);
                                        qqVar.C0(qnVar3.y0);
                                        qnVar3.presentFragment(qqVar);
                                        break;
                                    case 1:
                                        qn qnVar4 = this.b;
                                        on onVar = qnVar4.R0;
                                        long j32 = qnVar4.C0;
                                        if (!qnVar4.s.g()) {
                                            org.telegram.messenger.gc gcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        qn qnVar5 = this.b;
                                        qnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", qnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qq qqVar2 = new qq(bundle2);
                                        qqVar2.C0(qnVar5.y0);
                                        qnVar5.presentFragment(qqVar2);
                                        break;
                                    case 3:
                                        qn qnVar6 = this.b;
                                        qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                        break;
                                    case 4:
                                        qn qnVar7 = this.b;
                                        qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                        break;
                                    case 5:
                                        qn qnVar8 = this.b;
                                        qnVar8.getClass();
                                        qnVar8.presentFragment(new lb(qnVar8.x0));
                                        break;
                                    case 6:
                                        qn qnVar9 = this.b;
                                        qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                        break;
                                    case 7:
                                        qn qnVar10 = this.b;
                                        qnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", qnVar10.C0);
                                        qnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        qn qnVar11 = this.b;
                                        qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        qn.c0(this.b);
                                        break;
                                    case 14:
                                        qn qnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                        break;
                                    case 15:
                                        qn qnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(qnVar13)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -qnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.H0 = new kn(qnVar13, 6);
                                            qnVar13.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        qn qnVar14 = this.b;
                                        long j102 = qnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        ho hoVar = new ho(null);
                                        hoVar.N = new ArrayList();
                                        hoVar.O = new ArrayList();
                                        hoVar.Q = new ArrayList();
                                        hoVar.d0 = true;
                                        hoVar.g0 = new ArrayList();
                                        hoVar.p0 = new HashMap();
                                        hoVar.r0 = new sn(hoVar, 5);
                                        hoVar.t0 = false;
                                        hoVar.a0 = j102;
                                        hoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                        hoVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                hoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                hoVar.d0(false);
                                            }
                                        }
                                        qnVar14.presentFragment(hoVar);
                                        break;
                                    case 17:
                                        qn qnVar15 = this.b;
                                        long j11 = qnVar15.w0;
                                        to toVar = new to(null);
                                        toVar.w = new ArrayList();
                                        boolean z172 = false;
                                        toVar.P = false;
                                        toVar.Q = false;
                                        toVar.F = j11;
                                        TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                        toVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        toVar.s = z172;
                                        toVar.h = qnVar15.y0;
                                        qnVar15.presentFragment(toVar);
                                        break;
                                    case 18:
                                        qn qnVar16 = this.b;
                                        es0 es0Var = new es0(qnVar16.w0);
                                        es0Var.s = new kn(qnVar16, 4);
                                        qnVar16.presentFragment(es0Var);
                                        break;
                                    case 19:
                                        qn.e0(this.b);
                                        break;
                                    case 20:
                                        qn qnVar17 = this.b;
                                        j40 j40Var = new j40(-qnVar17.x0.id);
                                        j40Var.c = qnVar17.M0;
                                        j40Var.m0 = qnVar17;
                                        qnVar17.presentFragment(j40Var);
                                        break;
                                    case 21:
                                        qn qnVar18 = this.b;
                                        qnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", qnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                        qq qqVar3 = new qq(bundle4);
                                        qqVar3.C0(qnVar18.y0);
                                        qnVar18.presentFragment(qqVar3);
                                        break;
                                    case 22:
                                        qn qnVar19 = this.b;
                                        cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                        cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                        qnVar19.presentFragment(cf0Var);
                                        break;
                                    case 23:
                                        qn qnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                            qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", qnVar20.w0);
                                            ap apVar = new ap(bundle5);
                                            TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                            apVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (apVar.a == null) {
                                                    apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                                }
                                                apVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    apVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    apVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    apVar.w = 1;
                                                }
                                            }
                                            qnVar20.presentFragment(apVar);
                                            break;
                                        }
                                    default:
                                        qn qnVar21 = this.b;
                                        qnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", qnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                        qnVar21.presentFragment(new an(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (org.telegram.messenger.t3.R(qnVar.x0)) {
                        org.telegram.ui.Cells.l8 l8Var24 = new org.telegram.ui.Cells.l8(context2);
                        qnVar.b0 = l8Var24;
                        l8Var24.o(R.drawable.msg_stats, org.telegram.messenger.hd.L0(2131744891), true);
                        org.telegram.ui.ActionBar.q6.R(qnVar.b0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
                        final int i40 = 6;
                        qnVar.b0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                            public final /* synthetic */ qn b;

                            {
                                this.b = qnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i40) {
                                    case 0:
                                        qn qnVar3 = this.b;
                                        qnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", qnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qq qqVar = new qq(bundle);
                                        qqVar.C0(qnVar3.y0);
                                        qnVar3.presentFragment(qqVar);
                                        break;
                                    case 1:
                                        qn qnVar4 = this.b;
                                        on onVar = qnVar4.R0;
                                        long j32 = qnVar4.C0;
                                        if (!qnVar4.s.g()) {
                                            org.telegram.messenger.gc gcVar = null;
                                            TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().I2(null, qnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        qn qnVar5 = this.b;
                                        qnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", qnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qq qqVar2 = new qq(bundle2);
                                        qqVar2.C0(qnVar5.y0);
                                        qnVar5.presentFragment(qqVar2);
                                        break;
                                    case 3:
                                        qn qnVar6 = this.b;
                                        qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                        break;
                                    case 4:
                                        qn qnVar7 = this.b;
                                        qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                        break;
                                    case 5:
                                        qn qnVar8 = this.b;
                                        qnVar8.getClass();
                                        qnVar8.presentFragment(new lb(qnVar8.x0));
                                        break;
                                    case 6:
                                        qn qnVar9 = this.b;
                                        qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                        break;
                                    case 7:
                                        qn qnVar10 = this.b;
                                        qnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", qnVar10.C0);
                                        qnVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        qn qnVar11 = this.b;
                                        qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        qn.c0(this.b);
                                        break;
                                    case 14:
                                        qn qnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                        break;
                                    case 15:
                                        qn qnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(qnVar13)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -qnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.H0 = new kn(qnVar13, 6);
                                            qnVar13.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        qn qnVar14 = this.b;
                                        long j102 = qnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        ho hoVar = new ho(null);
                                        hoVar.N = new ArrayList();
                                        hoVar.O = new ArrayList();
                                        hoVar.Q = new ArrayList();
                                        hoVar.d0 = true;
                                        hoVar.g0 = new ArrayList();
                                        hoVar.p0 = new HashMap();
                                        hoVar.r0 = new sn(hoVar, 5);
                                        hoVar.t0 = false;
                                        hoVar.a0 = j102;
                                        hoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                        hoVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                hoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                hoVar.d0(false);
                                            }
                                        }
                                        qnVar14.presentFragment(hoVar);
                                        break;
                                    case 17:
                                        qn qnVar15 = this.b;
                                        long j11 = qnVar15.w0;
                                        to toVar = new to(null);
                                        toVar.w = new ArrayList();
                                        boolean z172 = false;
                                        toVar.P = false;
                                        toVar.Q = false;
                                        toVar.F = j11;
                                        TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                                        toVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        toVar.s = z172;
                                        toVar.h = qnVar15.y0;
                                        qnVar15.presentFragment(toVar);
                                        break;
                                    case 18:
                                        qn qnVar16 = this.b;
                                        es0 es0Var = new es0(qnVar16.w0);
                                        es0Var.s = new kn(qnVar16, 4);
                                        qnVar16.presentFragment(es0Var);
                                        break;
                                    case 19:
                                        qn.e0(this.b);
                                        break;
                                    case 20:
                                        qn qnVar17 = this.b;
                                        j40 j40Var = new j40(-qnVar17.x0.id);
                                        j40Var.c = qnVar17.M0;
                                        j40Var.m0 = qnVar17;
                                        qnVar17.presentFragment(j40Var);
                                        break;
                                    case 21:
                                        qn qnVar18 = this.b;
                                        qnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", qnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                        qq qqVar3 = new qq(bundle4);
                                        qqVar3.C0(qnVar18.y0);
                                        qnVar18.presentFragment(qqVar3);
                                        break;
                                    case 22:
                                        qn qnVar19 = this.b;
                                        cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                        cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                        qnVar19.presentFragment(cf0Var);
                                        break;
                                    case 23:
                                        qn qnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                            qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", qnVar20.w0);
                                            ap apVar = new ap(bundle5);
                                            TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                            apVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (apVar.a == null) {
                                                    apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                                }
                                                apVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    apVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    apVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    apVar.w = 1;
                                                }
                                            }
                                            qnVar20.presentFragment(apVar);
                                            break;
                                        }
                                    default:
                                        qn qnVar21 = this.b;
                                        qnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", qnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                        qnVar21.presentFragment(new an(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    qnVar.S.addView(qnVar.P, c8.ja.o(-1, -2));
                    l8Var = qnVar.f0;
                    if (l8Var != null) {
                        qnVar.S.addView(l8Var, c8.ja.o(-1, -2));
                    }
                    if (!qnVar.J0 && !qnVar.x0.gigagroup) {
                        qnVar.S.addView(qnVar.Y, c8.ja.o(-1, -2));
                    }
                    if (!qnVar.J0) {
                        qnVar.S.addView(qnVar.W, c8.ja.o(-1, -2));
                    }
                    qnVar.S.addView(qnVar.X, c8.ja.o(-1, -2));
                    qnVar.S.addView(qnVar.U, c8.ja.o(-1, -2));
                    l8Var2 = qnVar.V;
                    if (l8Var2 != null && (chatFull2 = qnVar.y0) != null && chatFull2.requests_pending > 0) {
                        qnVar.S.addView(l8Var2, c8.ja.o(-1, -2));
                    }
                    if (qnVar.J0) {
                        qnVar.S.addView(qnVar.W, c8.ja.o(-1, -2));
                    }
                    if (!qnVar.J0 || qnVar.x0.gigagroup) {
                        i14 = -2;
                        qnVar.S.addView(qnVar.Y, c8.ja.o(-1, -2));
                    } else {
                        i14 = -2;
                    }
                    l8Var3 = qnVar.b0;
                    if (l8Var3 != null) {
                        qnVar.S.addView(l8Var3, c8.ja.o(-1, i14));
                    }
                    l8Var4 = qnVar.Z;
                    if (l8Var4 != null) {
                        qnVar.S.addView(l8Var4, c8.ja.o(-1, i14));
                    }
                    l8Var5 = qnVar.a0;
                    if (l8Var5 != null) {
                        qnVar.S.addView(l8Var5, c8.ja.o(-1, i14));
                    }
                    if (qnVar.a0 != null && qnVar.getMessagesController().h6 && org.telegram.messenger.t3.V(qnVar.x0)) {
                        qnVar.a0.setVisibility(0);
                    }
                    l8Var6 = qnVar.Z;
                    if (l8Var6 != null) {
                        org.telegram.ui.Cells.l8 l8Var25 = qnVar.a0;
                        l8Var6.setNeedDivider(l8Var25 != null && l8Var25.getVisibility() == 0);
                    }
                }
            }
            i13 = 0;
            l8Var15.setVisibility(i13);
            qnVar.Y.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var162 = new org.telegram.ui.Cells.l8(context2);
            qnVar.W = l8Var162;
            org.telegram.ui.ActionBar.q6.R(l8Var162, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
            final int i322 = 22;
            qnVar.W.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var172 = new org.telegram.ui.Cells.l8(context2);
            qnVar.P = l8Var172;
            org.telegram.ui.ActionBar.q6.R(l8Var172, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
            final int i332 = 23;
            qnVar.P.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.t3.y(28, qnVar.x0)) {
            }
            org.telegram.ui.Cells.l8 l8Var192 = new org.telegram.ui.Cells.l8(context2);
            qnVar.X = l8Var192;
            final int i352 = 0;
            org.telegram.ui.ActionBar.q6.R(l8Var192, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
            qnVar.X.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var202 = new org.telegram.ui.Cells.l8(context2);
            qnVar.U = l8Var202;
            org.telegram.ui.ActionBar.q6.R(l8Var202, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
            final int i362 = 2;
            qnVar.U.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            if (!org.telegram.messenger.t3.V(qnVar.x0)) {
            }
            org.telegram.ui.Cells.l8 l8Var222 = new org.telegram.ui.Cells.l8(context2);
            qnVar.a0 = l8Var222;
            l8Var222.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.hd.L0(2131752471)), false);
            org.telegram.ui.ActionBar.q6.R(qnVar.a0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
            final int i382 = 4;
            qnVar.a0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i382) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            qnVar.a0.setVisibility(8);
            if (!org.telegram.messenger.t3.T(qnVar.x0)) {
            }
            org.telegram.ui.Cells.l8 l8Var232 = new org.telegram.ui.Cells.l8(context2);
            qnVar.Z = l8Var232;
            l8Var232.o(R.drawable.msg_log, org.telegram.messenger.hd.L0(2131751079), false);
            org.telegram.ui.ActionBar.q6.R(qnVar.Z, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i31));
            final int i392 = 5;
            qnVar.Z.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i392) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.t3.R(qnVar.x0)) {
            }
            qnVar.S.addView(qnVar.P, c8.ja.o(-1, -2));
            l8Var = qnVar.f0;
            if (l8Var != null) {
            }
            if (!qnVar.J0) {
                qnVar.S.addView(qnVar.Y, c8.ja.o(-1, -2));
            }
            if (!qnVar.J0) {
            }
            qnVar.S.addView(qnVar.X, c8.ja.o(-1, -2));
            qnVar.S.addView(qnVar.U, c8.ja.o(-1, -2));
            l8Var2 = qnVar.V;
            if (l8Var2 != null) {
                qnVar.S.addView(l8Var2, c8.ja.o(-1, -2));
            }
            if (qnVar.J0) {
            }
            if (qnVar.J0) {
            }
            i14 = -2;
            qnVar.S.addView(qnVar.Y, c8.ja.o(-1, -2));
            l8Var3 = qnVar.b0;
            if (l8Var3 != null) {
            }
            l8Var4 = qnVar.Z;
            if (l8Var4 != null) {
            }
            l8Var5 = qnVar.a0;
            if (l8Var5 != null) {
            }
            if (qnVar.a0 != null) {
                qnVar.a0.setVisibility(0);
            }
            l8Var6 = qnVar.Z;
            if (l8Var6 != null) {
            }
        } else {
            m6Var = null;
        }
        if (qnVar.D0 != null) {
            org.telegram.ui.Cells.l8 l8Var26 = new org.telegram.ui.Cells.l8(context2);
            qnVar.l0 = l8Var26;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.j6.N0(false);
            int i41 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.ActionBar.q6.R(l8Var26, N02, m6Var, org.telegram.ui.ActionBar.q6.M(i41));
            qnVar.l0.setPrioritizeTitleOverValue(true);
            qnVar.S.addView(qnVar.l0, c8.ja.o(-1, -2));
            final int i42 = 7;
            qnVar.l0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i42) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            qnVar.w0();
            org.telegram.ui.Cells.l8 l8Var27 = new org.telegram.ui.Cells.l8(context2);
            qnVar.o0 = l8Var27;
            org.telegram.ui.ActionBar.q6.R(l8Var27, org.telegram.ui.ActionBar.j6.N0(false), m6Var, org.telegram.ui.ActionBar.q6.M(i41));
            qnVar.o0.s(i0(org.telegram.messenger.hd.L0(2131754346)), "", R.drawable.msg_shareout, true);
            qnVar.S.addView(qnVar.o0, c8.ja.o(-1, -2));
            qnVar.o0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i30) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            qnVar.o0.h(45, qnVar.E0 == null, false);
            TLRPC.UserFull userFull = qnVar.E0;
            if (userFull != null) {
                org.telegram.ui.Cells.l8 l8Var28 = qnVar.o0;
                if (userFull.starref_program == null) {
                    format = org.telegram.messenger.hd.L0(2131754345);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r1.commission_permille / 10.0f));
                }
                l8Var28.w(format, z11);
            }
            if (!qnVar.getMessagesController().g6) {
                qnVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.l8 l8Var29 = new org.telegram.ui.Cells.l8(context2);
            qnVar.p0 = l8Var29;
            org.telegram.ui.ActionBar.q6.R(l8Var29, org.telegram.ui.ActionBar.j6.N0(false), m6Var, org.telegram.ui.ActionBar.q6.M(i41));
            qnVar.p0.o(R.drawable.msg_log, org.telegram.messenger.hd.L0(2131753092), true);
            qnVar.S.addView(qnVar.p0, c8.ja.o(-1, -2));
            final int i43 = 9;
            qnVar.p0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i43) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var30 = new org.telegram.ui.Cells.l8(context2);
            qnVar.q0 = l8Var30;
            org.telegram.ui.ActionBar.q6.R(l8Var30, org.telegram.ui.ActionBar.j6.N0(false), m6Var, org.telegram.ui.ActionBar.q6.M(i41));
            qnVar.q0.o(R.drawable.msg_media, org.telegram.messenger.hd.L0(2131753093), true);
            qnVar.S.addView(qnVar.q0, c8.ja.o(-1, -2));
            final int i44 = 10;
            qnVar.q0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var31 = new org.telegram.ui.Cells.l8(context2);
            qnVar.r0 = l8Var31;
            org.telegram.ui.ActionBar.q6.R(l8Var31, org.telegram.ui.ActionBar.j6.N0(false), m6Var, org.telegram.ui.ActionBar.q6.M(i41));
            qnVar.r0.o(R.drawable.msg_bot, org.telegram.messenger.hd.L0(2131753101), true);
            qnVar.S.addView(qnVar.r0, c8.ja.o(-1, -2));
            final int i45 = 11;
            qnVar.r0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = qnVar.x0;
        if (chat6 != null) {
            if (!org.telegram.messenger.t3.N(chat6)) {
                qnVar.S.setVisibility(8);
                qnVar.H.setVisibility(8);
            }
            km0Var.addView(new org.telegram.ui.Cells.x6(context2), c8.ja.o(-1, -2));
        } else if (qnVar.D0 != null) {
            qnVar.s0 = new org.telegram.ui.Cells.y8(12, context2, qnVar.resourceProvider);
            String L0 = org.telegram.messenger.hd.L0(2131753052);
            SpannableString valueOf = SpannableString.valueOf(L0);
            int indexOf = L0.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new di.b4(1), indexOf, indexOf + 10, 33);
            }
            qnVar.s0.setText(valueOf);
            km0Var.addView(qnVar.s0, c8.ja.o(-1, -2));
            org.telegram.ui.Cells.l8 l8Var32 = new org.telegram.ui.Cells.l8(context2);
            qnVar.u0 = l8Var32;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.j6.N0(true);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            int i46 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.ActionBar.q6.R(l8Var32, N03, M, org.telegram.ui.ActionBar.q6.M(i46));
            qnVar.u0.o(R.drawable.menu_factcheck, org.telegram.messenger.hd.L0(2131752929), false);
            org.telegram.ui.Cells.l8 l8Var33 = qnVar.u0;
            int i47 = org.telegram.ui.ActionBar.j6.q6;
            l8Var33.g(i47, i47);
            km0Var.addView(qnVar.u0, c8.ja.o(-1, -2));
            final int i48 = 13;
            qnVar.u0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i48) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j11 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j11;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j11));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context2, qnVar.resourceProvider);
            qnVar.t0 = y8Var2;
            y8Var2.setFixedSize(12);
            km0Var.addView(qnVar.t0, c8.ja.o(-1, -2));
            org.telegram.ui.Cells.l8 l8Var34 = qnVar.u0;
            TLRPC.UserFull userFull2 = qnVar.E0;
            l8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.y8 y8Var3 = qnVar.t0;
            TLRPC.UserFull userFull3 = qnVar.E0;
            y8Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = qnVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                qnVar.T = linearLayout6;
                linearLayout6.setOrientation(1);
                km0Var.addView(qnVar.T, c8.ja.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
                n4Var.setText(org.telegram.messenger.hd.L0(2131753112));
                qnVar.T.addView(n4Var, c8.ja.o(-1, -2));
                org.telegram.ui.Cells.l8 l8Var35 = new org.telegram.ui.Cells.l8(context2);
                qnVar.m0 = l8Var35;
                org.telegram.ui.ActionBar.q6.R(l8Var35, org.telegram.ui.ActionBar.j6.N0(false), m6Var, org.telegram.ui.ActionBar.q6.M(i46));
                qnVar.m0.setPrioritizeTitleOverValue(true);
                qnVar.T.addView(qnVar.m0, c8.ja.o(-1, -2));
                final di.e0 g10 = di.e0.g(qnVar.currentAccount);
                final int i49 = 0;
                qnVar.m0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.fn
                    public final /* synthetic */ qn b;

                    {
                        this.b = qnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i49) {
                            case 0:
                                qn qnVar3 = this.b;
                                long j11 = qnVar3.C0;
                                if (g10.h(j11, false) != null) {
                                    qnVar3.presentFragment(new di.t(1, j11));
                                    break;
                                }
                                break;
                            default:
                                qn qnVar4 = this.b;
                                long j12 = qnVar4.C0;
                                if (g10.h(j12, false) != null) {
                                    qnVar4.presentFragment(new di.t(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.m(j3)) {
                    long i50 = g10.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i50 > 0) {
                        double d = i50 / 1.0E9d;
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
                    qnVar.m0.s(org.telegram.messenger.hd.L0(2131753110), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e80(org.telegram.messenger.g0.L(30.0f), qnVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    qnVar.m0.s(org.telegram.messenger.hd.L0(2131753110), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                qnVar.m0.setVisibility(g10.b(j3) ? 0 : 8);
                org.telegram.ui.Cells.l8 l8Var36 = new org.telegram.ui.Cells.l8(context2);
                qnVar.n0 = l8Var36;
                org.telegram.ui.ActionBar.q6.R(l8Var36, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i46));
                final int i51 = 1;
                qnVar.n0.setPrioritizeTitleOverValue(true);
                qnVar.T.addView(qnVar.n0, c8.ja.o(-1, -2));
                qnVar.n0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.fn
                    public final /* synthetic */ qn b;

                    {
                        this.b = qnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                qn qnVar3 = this.b;
                                long j11 = qnVar3.C0;
                                if (g10.h(j11, false) != null) {
                                    qnVar3.presentFragment(new di.t(1, j11));
                                    break;
                                }
                                break;
                            default:
                                qn qnVar4 = this.b;
                                long j12 = qnVar4.C0;
                                if (g10.h(j12, false) != null) {
                                    qnVar4.presentFragment(new di.t(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.h(j3, false) != null) {
                    org.telegram.ui.Cells.l8 l8Var37 = qnVar.n0;
                    String L02 = org.telegram.messenger.hd.L0(2131753111);
                    if (g10.c(j3).amount <= 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                        charSequence = di.mb.a1(false, TextUtils.concat("XTR", di.mb.N0(g10.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    l8Var37.s(L02, charSequence, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e80(org.telegram.messenger.g0.L(30.0f), qnVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    qnVar.n0.s(org.telegram.messenger.hd.L0(2131753111), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                qnVar.n0.setVisibility(g10.a(j3) ? 0 : 8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(12, context2, qnVar.getResourceProvider());
                y8Var4.setFixedSize(12);
                num2 = num;
                y8Var4.setTag(R.id.fit_width_tag, num2);
                km0Var.addView(y8Var4, c8.ja.o(-1, 12));
                qnVar.T.setVisibility((qnVar.n0.getVisibility() == 0 || qnVar.m0.getVisibility() == 0) ? 0 : 8);
                chat = qnVar.x0;
                i12 = 14;
                if ((chat == null && chat.creator) || ((user = qnVar.D0) != null && user.bot && user.bot_can_edit)) {
                    final long j11 = chat != null ? chat.linked_community_id : qnVar.D0.linked_community_id;
                    final long j12 = chat != null ? -chat.id : qnVar.D0.id;
                    final boolean z18 = qnVar.D0 != null;
                    if (j11 != 0) {
                        mi.b bVar = new mi.b(context2, qnVar.resourceProvider);
                        qnVar.h0 = bVar;
                        bVar.a(qnVar.currentAccount, qnVar.getMessagesController().M0(Long.valueOf(j11)));
                        mi.b bVar2 = qnVar.h0;
                        final int i52 = 0;
                        org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.j6.N0(false);
                        int i53 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.q6.R(bVar2, N04, null, org.telegram.ui.ActionBar.q6.M(i53));
                        qnVar.h0.setOnClickListener(new View.OnClickListener(qnVar) { // from class: org.telegram.ui.gn
                            public final /* synthetic */ qn b;

                            {
                                this.b = qnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i52) {
                                    case 0:
                                        qn qnVar3 = this.b;
                                        org.telegram.messenger.np messagesController = qnVar3.getMessagesController();
                                        long j13 = j11;
                                        if (!org.telegram.messenger.t3.N(messagesController.M0(Long.valueOf(j13)))) {
                                            qnVar3.showDialog(new li.d0(qnVar3, j13, null, null));
                                            break;
                                        } else {
                                            qnVar3.presentFragment(new li.n(a8.p0.j(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        qn qnVar4 = this.b;
                                        qnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j11);
                                        qnVar4.presentFragment(new li.e(bundle));
                                        break;
                                }
                            }
                        });
                        km0Var.addView(qnVar.h0, c8.ja.o(-1, -2));
                        org.telegram.ui.Cells.l8 l8Var38 = new org.telegram.ui.Cells.l8(context2);
                        qnVar.j0 = l8Var38;
                        l8Var38.o(R.drawable.outline_community_remove_24, org.telegram.messenger.hd.L0(z18 ? 2131751884 : qnVar.J0 ? 2131751883 : 2131751882), false);
                        org.telegram.ui.Cells.l8 l8Var39 = qnVar.j0;
                        int i54 = org.telegram.ui.ActionBar.j6.p7;
                        l8Var39.g(i54, i54);
                        org.telegram.ui.ActionBar.q6.R(qnVar.j0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(i53));
                        org.telegram.ui.Cells.l8 l8Var40 = qnVar.j0;
                        qnVar2 = qnVar;
                        context3 = context;
                        l8Var40.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.hn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String M0 = org.telegram.messenger.hd.M0(2131751915, null);
                                qn qnVar3 = qn.this;
                                org.telegram.ui.Components.t4.s0(qnVar3, M0, org.telegram.messenger.hd.M0(z18 ? 2131751917 : qnVar3.J0 ? 2131751916 : 2131751914, null), org.telegram.messenger.hd.M0(2131746321, null), true, new ai.e0(qnVar3, j12, j11, 2));
                            }
                        });
                        km0Var.addView(qnVar2.j0, c8.ja.o(-1, -2));
                        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(12, context3, qnVar2.getResourceProvider());
                        qnVar2.k0 = y8Var5;
                        y8Var5.setFixedSize(14);
                        qnVar2.k0.setTag(R.id.fit_width_tag, num2);
                        km0Var.addView(qnVar2.k0, c8.ja.o(-1, 14));
                    } else {
                        qnVar2 = qnVar;
                        context3 = context2;
                        org.telegram.ui.Cells.l8 l8Var41 = new org.telegram.ui.Cells.l8(context3);
                        qnVar2.g0 = l8Var41;
                        l8Var41.g(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                        org.telegram.ui.ActionBar.q6.W(qnVar2.g0.getTextView(), org.telegram.ui.ActionBar.j6.Zl);
                        org.telegram.ui.ActionBar.q6.R(qnVar2.g0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                        qnVar2.g0.o(R.drawable.msg_groups, org.telegram.messenger.hd.L0(z18 ? 2131751981 : qnVar2.J0 ? 2131751979 : 2131751976), false);
                        final int i55 = 1;
                        qnVar2.g0.setOnClickListener(new View.OnClickListener(qnVar2) { // from class: org.telegram.ui.gn
                            public final /* synthetic */ qn b;

                            {
                                this.b = qnVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i55) {
                                    case 0:
                                        qn qnVar3 = this.b;
                                        org.telegram.messenger.np messagesController = qnVar3.getMessagesController();
                                        long j13 = j12;
                                        if (!org.telegram.messenger.t3.N(messagesController.M0(Long.valueOf(j13)))) {
                                            qnVar3.showDialog(new li.d0(qnVar3, j13, null, null));
                                            break;
                                        } else {
                                            qnVar3.presentFragment(new li.n(a8.p0.j(j13, "community_id")));
                                            break;
                                        }
                                    default:
                                        qn qnVar4 = this.b;
                                        qnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j12);
                                        qnVar4.presentFragment(new li.e(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.y8 y8Var6 = new org.telegram.ui.Cells.y8(12, context3, qnVar2.resourceProvider);
                        qnVar2.i0 = y8Var6;
                        y8Var6.setText(org.telegram.messenger.hd.L0(z18 ? 2131751980 : qnVar2.J0 ? 2131751978 : 2131751975));
                        km0Var.addView(qnVar2.g0, c8.ja.o(-1, -2));
                        km0Var.addView(qnVar2.i0, c8.ja.o(-1, -2));
                    }
                } else {
                    qnVar2 = qnVar;
                    context3 = context2;
                }
                chat2 = qnVar2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context3);
                    qnVar2.d0 = frameLayout3;
                    km0Var.addView(frameLayout3, c8.ja.o(-1, -2));
                    org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context3);
                    qnVar2.e0 = v9Var;
                    org.telegram.ui.ActionBar.q6.U(v9Var.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
                    org.telegram.ui.ActionBar.q6.R(qnVar2.e0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
                    if (qnVar2.D0 == null) {
                        qnVar2.e0.b(org.telegram.messenger.hd.L0(2131751566), false);
                    } else if (qnVar2.J0) {
                        qnVar2.e0.b(org.telegram.messenger.hd.L0(2131752422), false);
                    } else {
                        qnVar2.e0.b(org.telegram.messenger.hd.L0(2131751572), false);
                    }
                    qnVar2.d0.addView(qnVar2.e0, c8.ja.c(-2.0f, -1));
                    qnVar2.e0.setOnClickListener(new View.OnClickListener(qnVar2) { // from class: org.telegram.ui.en
                        public final /* synthetic */ qn b;

                        {
                            this.b = qnVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    qn qnVar3 = this.b;
                                    qnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", qnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qq qqVar = new qq(bundle);
                                    qqVar.C0(qnVar3.y0);
                                    qnVar3.presentFragment(qqVar);
                                    break;
                                case 1:
                                    qn qnVar4 = this.b;
                                    on onVar = qnVar4.R0;
                                    long j32 = qnVar4.C0;
                                    if (!qnVar4.s.g()) {
                                        org.telegram.messenger.gc gcVar = null;
                                        TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().I2(null, qnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    qn qnVar5 = this.b;
                                    qnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", qnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qq qqVar2 = new qq(bundle2);
                                    qqVar2.C0(qnVar5.y0);
                                    qnVar5.presentFragment(qqVar2);
                                    break;
                                case 3:
                                    qn qnVar6 = this.b;
                                    qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                                    break;
                                case 4:
                                    qn qnVar7 = this.b;
                                    qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                                    break;
                                case 5:
                                    qn qnVar8 = this.b;
                                    qnVar8.getClass();
                                    qnVar8.presentFragment(new lb(qnVar8.x0));
                                    break;
                                case 6:
                                    qn qnVar9 = this.b;
                                    qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                                    break;
                                case 7:
                                    qn qnVar10 = this.b;
                                    qnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", qnVar10.C0);
                                    qnVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    qn qnVar11 = this.b;
                                    qnVar11.presentFragment(new ki.k(qnVar11.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    qn.c0(this.b);
                                    break;
                                case 14:
                                    qn qnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                                    break;
                                case 15:
                                    qn qnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(qnVar13)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -qnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.H0 = new kn(qnVar13, 6);
                                        qnVar13.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    qn qnVar14 = this.b;
                                    long j102 = qnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    ho hoVar = new ho(null);
                                    hoVar.N = new ArrayList();
                                    hoVar.O = new ArrayList();
                                    hoVar.Q = new ArrayList();
                                    hoVar.d0 = true;
                                    hoVar.g0 = new ArrayList();
                                    hoVar.p0 = new HashMap();
                                    hoVar.r0 = new sn(hoVar, 5);
                                    hoVar.t0 = false;
                                    hoVar.a0 = j102;
                                    hoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = qnVar14.y0;
                                    hoVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            hoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            hoVar.d0(false);
                                        }
                                    }
                                    qnVar14.presentFragment(hoVar);
                                    break;
                                case 17:
                                    qn qnVar15 = this.b;
                                    long j112 = qnVar15.w0;
                                    to toVar = new to(null);
                                    toVar.w = new ArrayList();
                                    boolean z172 = false;
                                    toVar.P = false;
                                    toVar.Q = false;
                                    toVar.F = j112;
                                    TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j112));
                                    toVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    toVar.s = z172;
                                    toVar.h = qnVar15.y0;
                                    qnVar15.presentFragment(toVar);
                                    break;
                                case 18:
                                    qn qnVar16 = this.b;
                                    es0 es0Var = new es0(qnVar16.w0);
                                    es0Var.s = new kn(qnVar16, 4);
                                    qnVar16.presentFragment(es0Var);
                                    break;
                                case 19:
                                    qn.e0(this.b);
                                    break;
                                case 20:
                                    qn qnVar17 = this.b;
                                    j40 j40Var = new j40(-qnVar17.x0.id);
                                    j40Var.c = qnVar17.M0;
                                    j40Var.m0 = qnVar17;
                                    qnVar17.presentFragment(j40Var);
                                    break;
                                case 21:
                                    qn qnVar18 = this.b;
                                    qnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", qnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                                    qq qqVar3 = new qq(bundle4);
                                    qqVar3.C0(qnVar18.y0);
                                    qnVar18.presentFragment(qqVar3);
                                    break;
                                case 22:
                                    qn qnVar19 = this.b;
                                    cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = qnVar19.y0;
                                    cf0Var.m0(chatFull8, chatFull8.exported_invite);
                                    qnVar19.presentFragment(cf0Var);
                                    break;
                                case 23:
                                    qn qnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                        qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", qnVar20.w0);
                                        ap apVar = new ap(bundle5);
                                        TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                        apVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (apVar.a == null) {
                                                apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                            }
                                            apVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                apVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                apVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                apVar.w = 1;
                                            }
                                        }
                                        qnVar20.presentFragment(apVar);
                                        break;
                                    }
                                default:
                                    qn qnVar21 = this.b;
                                    qnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", qnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                                    qnVar21.presentFragment(new an(bundle6));
                                    break;
                            }
                        }
                    });
                    km0Var.addView(new org.telegram.ui.Cells.x6(context3), c8.ja.o(-1, -2));
                }
                UndoView undoView = new UndoView(context3);
                qnVar2.c = undoView;
                wcVar.addView(undoView, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.rt rtVar6 = qnVar2.w;
                TLRPC.User user3 = qnVar2.D0;
                rtVar6.setText(org.telegram.messenger.j6.l(user3 == null ? org.telegram.messenger.g5.p(user3) : qnVar2.x0.title, qnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.rt rtVar7 = qnVar2.w;
                rtVar7.setSelection(rtVar7.n());
                chatFull = qnVar2.y0;
                if (chatFull == null) {
                    qnVar2.F.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = qnVar2.E0;
                    if (userFull4 != null) {
                        qnVar2.F.setText(userFull4.about);
                    }
                }
                qnVar2.p0();
                qnVar2.u0(true, false);
                return qnVar2.fragmentView;
            }
        }
        num2 = num;
        chat = qnVar.x0;
        i12 = 14;
        if (chat == null) {
        }
        qnVar2 = qnVar;
        context3 = context2;
        chat2 = qnVar2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context3);
            qnVar2.d0 = frameLayout32;
            km0Var.addView(frameLayout32, c8.ja.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context3);
            qnVar2.e0 = v9Var2;
            org.telegram.ui.ActionBar.q6.U(v9Var2.getTextView(), org.telegram.ui.ActionBar.j6.p7, null);
            org.telegram.ui.ActionBar.q6.R(qnVar2.e0, org.telegram.ui.ActionBar.j6.N0(false), null, org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.i6));
            if (qnVar2.D0 == null) {
            }
            qnVar2.d0.addView(qnVar2.e0, c8.ja.c(-2.0f, -1));
            qnVar2.e0.setOnClickListener(new View.OnClickListener(qnVar2) { // from class: org.telegram.ui.en
                public final /* synthetic */ qn b;

                {
                    this.b = qnVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            qn qnVar3 = this.b;
                            qnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qq qqVar = new qq(bundle);
                            qqVar.C0(qnVar3.y0);
                            qnVar3.presentFragment(qqVar);
                            break;
                        case 1:
                            qn qnVar4 = this.b;
                            on onVar = qnVar4.R0;
                            long j32 = qnVar4.C0;
                            if (!qnVar4.s.g()) {
                                org.telegram.messenger.gc gcVar = null;
                                TLRPC.User a22 = j32 == 0 ? null : qnVar4.getMessagesController().a2(Long.valueOf(j32));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = qnVar4.getMessagesController().M0(Long.valueOf(qnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = qnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                gcVar = org.telegram.messenger.gc.j(qnVar4.y0.chat_photo.video_sizes.get(0), qnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().d2(null, M0.photo.photo_big, null, gcVar, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().I2(null, qnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.p1().d2(null, a22.photo.photo_big, null, null, null, null, null, 0, onVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            qn qnVar5 = this.b;
                            qnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", qnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qq qqVar2 = new qq(bundle2);
                            qqVar2.C0(qnVar5.y0);
                            qnVar5.presentFragment(qqVar2);
                            break;
                        case 3:
                            qn qnVar6 = this.b;
                            qnVar6.presentFragment(new bi.t6(qnVar6.w0));
                            break;
                        case 4:
                            qn qnVar7 = this.b;
                            qnVar7.presentFragment(new ki.n3(-qnVar7.w0));
                            break;
                        case 5:
                            qn qnVar8 = this.b;
                            qnVar8.getClass();
                            qnVar8.presentFragment(new lb(qnVar8.x0));
                            break;
                        case 6:
                            qn qnVar9 = this.b;
                            qnVar9.presentFragment(z41.g0(qnVar9.x0, false));
                            break;
                        case 7:
                            qn qnVar10 = this.b;
                            qnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", qnVar10.C0);
                            qnVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            qn qnVar11 = this.b;
                            qnVar11.presentFragment(new ki.k(qnVar11.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + qn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            qn.c0(this.b);
                            break;
                        case 14:
                            qn qnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(qnVar12, false, qnVar12.x0, null, false, true, true, false, new kn(qnVar12, 7));
                            break;
                        case 15:
                            qn qnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(qnVar13)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -qnVar13.w0;
                                TLRPC.ChatFull chatFull6 = qnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.H0 = new kn(qnVar13, 6);
                                qnVar13.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            qn qnVar14 = this.b;
                            long j102 = qnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = qnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            ho hoVar = new ho(null);
                            hoVar.N = new ArrayList();
                            hoVar.O = new ArrayList();
                            hoVar.Q = new ArrayList();
                            hoVar.d0 = true;
                            hoVar.g0 = new ArrayList();
                            hoVar.p0 = new HashMap();
                            hoVar.r0 = new sn(hoVar, 5);
                            hoVar.t0 = false;
                            hoVar.a0 = j102;
                            hoVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = qnVar14.y0;
                            hoVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    hoVar.m0 = tL_chatInviteExported;
                                } else {
                                    hoVar.d0(false);
                                }
                            }
                            qnVar14.presentFragment(hoVar);
                            break;
                        case 17:
                            qn qnVar15 = this.b;
                            long j112 = qnVar15.w0;
                            to toVar = new to(null);
                            toVar.w = new ArrayList();
                            boolean z172 = false;
                            toVar.P = false;
                            toVar.Q = false;
                            toVar.F = j112;
                            TLRPC.Chat M02 = toVar.getMessagesController().M0(Long.valueOf(j112));
                            toVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !toVar.f.megagroup) {
                                z172 = true;
                            }
                            toVar.s = z172;
                            toVar.h = qnVar15.y0;
                            qnVar15.presentFragment(toVar);
                            break;
                        case 18:
                            qn qnVar16 = this.b;
                            es0 es0Var = new es0(qnVar16.w0);
                            es0Var.s = new kn(qnVar16, 4);
                            qnVar16.presentFragment(es0Var);
                            break;
                        case 19:
                            qn.e0(this.b);
                            break;
                        case 20:
                            qn qnVar17 = this.b;
                            j40 j40Var = new j40(-qnVar17.x0.id);
                            j40Var.c = qnVar17.M0;
                            j40Var.m0 = qnVar17;
                            qnVar17.presentFragment(j40Var);
                            break;
                        case 21:
                            qn qnVar18 = this.b;
                            qnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", qnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((qnVar18.J0 || qnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(qnVar18.x0)) ? 0 : 3);
                            qq qqVar3 = new qq(bundle4);
                            qqVar3.C0(qnVar18.y0);
                            qnVar18.presentFragment(qqVar3);
                            break;
                        case 22:
                            qn qnVar19 = this.b;
                            cf0 cf0Var = new cf0(qnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = qnVar19.y0;
                            cf0Var.m0(chatFull8, chatFull8.exported_invite);
                            qnVar19.presentFragment(cf0Var);
                            break;
                        case 23:
                            qn qnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(qnVar20.x0)) {
                                qnVar20.presentFragment(new ch.o(qnVar20.w0, qnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", qnVar20.w0);
                                ap apVar = new ap(bundle5);
                                TLRPC.ChatFull chatFull9 = qnVar20.y0;
                                apVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (apVar.a == null) {
                                        apVar.a = apVar.getMessagesController().M0(Long.valueOf(apVar.c));
                                    }
                                    apVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        apVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        apVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                apVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        apVar.w = 1;
                                    }
                                }
                                qnVar20.presentFragment(apVar);
                                break;
                            }
                        default:
                            qn qnVar21 = this.b;
                            qnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", qnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", qnVar21.w0);
                            qnVar21.presentFragment(new an(bundle6));
                            break;
                    }
                }
            });
            km0Var.addView(new org.telegram.ui.Cells.x6(context3), c8.ja.o(-1, -2));
        }
        UndoView undoView2 = new UndoView(context3);
        qnVar2.c = undoView2;
        wcVar.addView(undoView2, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.rt rtVar62 = qnVar2.w;
        TLRPC.User user32 = qnVar2.D0;
        rtVar62.setText(org.telegram.messenger.j6.l(user32 == null ? org.telegram.messenger.g5.p(user32) : qnVar2.x0.title, qnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.rt rtVar72 = qnVar2.w;
        rtVar72.setSelection(rtVar72.n());
        chatFull = qnVar2.y0;
        if (chatFull == null) {
        }
        qnVar2.p0();
        qnVar2.u0(true, false);
        return qnVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.x0.participants_count) >= getMessagesController().d5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.l8 l8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i11 = org.telegram.messenger.ns.T;
        boolean z11 = true;
        long j3 = this.C0;
        int i12 = 0;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.w0) {
                if (this.y0 == null && (editTextBoldCursor = this.F) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.y0 == null;
                this.y0 = chatFull;
                k0();
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
                        l8Var = this.R;
                        if (l8Var != null) {
                            l8Var.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.G0 = z10;
                    l8Var = this.R;
                    if (l8Var != null) {
                    }
                }
                if (org.telegram.messenger.t3.T(this.x0) && !this.y0.hidden_prehistory) {
                    z11 = false;
                }
                this.K0 = z11;
                u0(false, false);
                if (z12) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.r5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.w0 != longValue) {
                return;
            }
            this.F0 = booleanValue;
            this.H0 = booleanValue2;
            if (objArr.length > 3) {
                this.I0 = ((Boolean) objArr[3]).booleanValue();
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.R;
            if (l8Var2 != null) {
                l8Var2.setChecked(this.F0);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.np.D8;
            if ((intValue & 2) != 0) {
                p0();
            }
            if ((intValue & 1) != 0) {
                w0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
            if (o4Var == null || o4Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i7 == org.telegram.messenger.ns.X4) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull N0 = getMessagesController().N0(longValue2);
                this.y0 = N0;
                if (N0 != null) {
                    this.L0 = N0.available_reactions;
                }
                x0(true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ns.C3) {
            if (i7 == org.telegram.messenger.ns.E0) {
                if (((Long) objArr[0]).longValue() == j3) {
                    r0(getMessagesController().b2(j3));
                    return;
                }
                return;
            } else {
                if (i7 == org.telegram.messenger.ns.L3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i7 == org.telegram.messenger.ns.y1 && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.o4 o4Var2 = this.parentLayout;
                    if (o4Var2 == null || o4Var2.getLastFragment() != this) {
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
                di.e0 g10 = di.e0.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j3) ? 0 : 8);
                this.n0.w(di.mb.a1(false, TextUtils.concat("XTR", di.mb.M0(g10.c(j3), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.l8 l8Var3 = this.l0;
                if (l8Var3 != null) {
                    l8Var3.setNeedDivider(g10.a(j3) || g10.b(j3));
                }
                this.T.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                di.e0 g11 = di.e0.g(this.currentAccount);
                this.m0.setVisibility(g11.b(j3) ? 0 : 8);
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
                this.m0.w(spannableStringBuilder, true);
                org.telegram.ui.Cells.l8 l8Var4 = this.l0;
                if (l8Var4 != null) {
                    if (!g11.a(j3) && !g11.b(j3)) {
                        z11 = false;
                    }
                    l8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.T;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ uq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.l30
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.lm0 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        pn pnVar = this.c0;
        int i7 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(pnVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c0, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.c0, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.U, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        org.telegram.ui.Cells.l8 l8Var = this.V;
        if (l8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(l8Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.Z, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.J, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.l6));
        LinearLayout linearLayout = this.E;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.e0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.e0, 4, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.P, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        org.telegram.ui.Cells.l8 l8Var2 = this.L;
        if (l8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(l8Var2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        org.telegram.ui.Cells.l8 l8Var3 = this.b0;
        if (l8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(l8Var3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        org.telegram.ui.Components.rt rtVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        int i7 = 1;
        int i10 = 0;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.rt rtVar2 = this.w;
            if ((rtVar2 != null && !this.D0.first_name.equals(rtVar2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131743726, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new kn(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747580, null), new kn(this, i7));
                    showDialog(t1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.t3.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((rtVar = this.w) != null && !this.x0.title.equals(rtVar.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.hd.M0(2131743726, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = M02;
                if (this.J0) {
                    t1Var2.U = org.telegram.messenger.hd.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    t1Var2.U = org.telegram.messenger.hd.M0(2131749401, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754216, "ApplyTheme"), new kn(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747580, "PassportDiscard"), new kn(this, 3));
                showDialog(t1Var2);
            }
            return false;
        }
        return true;
    }

    public final void k0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().P2.f(-this.w0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
            str = !TextUtils.isEmpty(gjVar.z) ? gjVar.z.toString() : !TextUtils.isEmpty(gjVar.v) ? gjVar.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.hd.M0(2131742892, null);
        }
        this.f0.u(org.telegram.messenger.hd.M0(2131742898, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new jn(this, 0));
    }

    public final void n0() {
        this.s.n(this.v0 != null, new ln(this, 0), new q5(this, 5), 0);
        this.S0.M(0);
        this.S0.P(43);
        this.c0.e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.rt rtVar;
        String str;
        String str2;
        if (this.O0 || (rtVar = this.w) == null) {
            return;
        }
        if (rtVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.E3(this.w);
            return;
        }
        this.O0 = true;
        int i7 = 3;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().q1(this.D0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            int i10 = 8;
            if (!this.D0.first_name.equals(this.w.getText().toString())) {
                setbotinfo.name = this.w.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.F.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.b.setOnCancelListener(new di.z(this, getConnectionsManager().sendRequest(setbotinfo, new v7(i10, this, setbotinfo)), i7));
            this.b.show();
            return;
        }
        if (!org.telegram.messenger.t3.T(this.x0) && (!this.K0 || this.F0)) {
            getMessagesController().T(getParentActivity(), this.w0, this, new kn(this, 5), null);
            return;
        }
        if (this.y0 != null && org.telegram.messenger.t3.T(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.K0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().c5(this.w0, this.K0);
            }
        }
        if (this.s.g()) {
            this.N0 = true;
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.b = t1Var;
            t1Var.setOnCancelListener(new tf(this, r0));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.w.getText().toString())) {
            getMessagesController().C(this.w0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            org.telegram.messenger.np messagesController = getMessagesController();
            long j3 = this.w0;
            String obj = this.F.getText().toString();
            TLRPC.ChatFull chatFull3 = this.y0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.j1(-j3);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.bi(messagesController, chatFull3, obj, 7), 64);
        }
        boolean z12 = this.F0;
        TLRPC.Chat chat = this.x0;
        boolean z13 = chat.forum;
        if (z12 != z13 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
            boolean z14 = this.H0 != chat.forum_tabs;
            boolean z15 = this.I0 != chat.forum_sidebar;
            r0 = z12 == z13 ? 0 : 1;
            getMessagesController().b5(this.w0, this.F0, this.H0, this.I0);
            if (this.F0 && !this.H0 && (r0 != 0 || z14)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i11 = 0; i11 < fragmentStack.size(); i11++) {
                    if ((fragmentStack.get(i11) instanceof an) && ((an) fragmentStack.get(i11)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).b0(i11);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.o4 parentLayout = getParentLayout();
                        HashSet hashSet = u91.r1;
                        ((ActionBarLayout) parentLayout).c(i11, u91.I0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z14 || z15) {
                v0(z14);
            }
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.s.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.w;
        if (rtVar == null || !rtVar.e) {
            return j0(z10);
        }
        if (!z10) {
            return false;
        }
        rtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().d5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    @Override // org.telegram.ui.ActionBar.e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j3 = this.w0;
        long j10 = this.C0;
        boolean z10 = true;
        if (j3 == 0) {
            TLRPC.User a22 = j10 == 0 ? null : getMessagesController().a2(Long.valueOf(j10));
            this.D0 = a22;
            if (a22 == null) {
                TLRPC.User k02 = org.telegram.messenger.vr.a0(this.currentAccount).k0(j10);
                this.D0 = k02;
                if (k02 != null) {
                    getMessagesController().X3(this.D0, true, false);
                    if (this.E0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j10));
                        ArrayList L0 = org.telegram.messenger.vr.a0(this.currentAccount).L0(hashSet);
                        if (!L0.isEmpty()) {
                            this.E0 = (TLRPC.UserFull) L0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            org.telegram.ui.Components.t8 t8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.m30 m30Var = this.s;
            m30Var.a = this;
            m30Var.b = this;
            getNotificationCenter().c(this, org.telegram.messenger.ns.r);
            getNotificationCenter().c(this, org.telegram.messenger.ns.y1);
            getNotificationCenter().c(this, org.telegram.messenger.ns.b1);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
        this.x0 = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.vr.a0(this.currentAccount).P(this.w0);
            this.x0 = P;
            if (P != null) {
                getMessagesController().Q3(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.vr.a0(this.currentAccount).F0(this.w0, org.telegram.messenger.t3.T(this.x0), new CountDownLatch(1), false, false, 0);
                    this.y0 = F0;
                }
            }
            return false;
        }
        chat = this.x0;
        org.telegram.ui.Components.t8 t8Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            t8Var2.k(5L, this.x0.title, null, null);
            this.J0 = org.telegram.messenger.t3.T(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat2 = this.x0;
            boolean z11 = chat2.forum;
            this.F0 = z11;
            this.H0 = chat2.forum_tabs;
            this.I0 = chat2.forum_sidebar;
            if (j10 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.y0;
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null) {
                }
                this.G0 = z10;
                getNotificationCenter().c(this, org.telegram.messenger.ns.T);
                getNotificationCenter().c(this, org.telegram.messenger.ns.r5);
                getNotificationCenter().c(this, org.telegram.messenger.ns.X4);
                getNotificationCenter().c(this, org.telegram.messenger.ns.L3);
            }
            z10 = false;
            this.G0 = z10;
            getNotificationCenter().c(this, org.telegram.messenger.ns.T);
            getNotificationCenter().c(this, org.telegram.messenger.ns.r5);
            getNotificationCenter().c(this, org.telegram.messenger.ns.X4);
            getNotificationCenter().c(this, org.telegram.messenger.ns.L3);
        } else {
            t8Var2.k(5L, this.D0.first_name, null, null);
            this.J0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
            this.G0 = false;
            getNotificationCenter().c(this, org.telegram.messenger.ns.E0);
            if (this.D0.bot) {
                getNotificationCenter().c(this, org.telegram.messenger.ns.C3);
            }
        }
        org.telegram.ui.Components.m30 m30Var2 = this.s;
        m30Var2.a = this;
        m30Var2.b = this;
        getNotificationCenter().c(this, org.telegram.messenger.ns.r);
        getNotificationCenter().c(this, org.telegram.messenger.ns.y1);
        getNotificationCenter().c(this, org.telegram.messenger.ns.b1);
        if (this.y0 != null) {
            m0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.m30 m30Var = this.s;
        if (m30Var != null) {
            m30Var.d();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.ns.T);
            getNotificationCenter().n(this, org.telegram.messenger.ns.r5);
            getNotificationCenter().n(this, org.telegram.messenger.ns.X4);
            getNotificationCenter().n(this, org.telegram.messenger.ns.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.ns.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.ns.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.ns.r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.y1);
        getNotificationCenter().n(this, org.telegram.messenger.ns.b1);
        org.telegram.ui.Components.rt rtVar = this.w;
        if (rtVar != null) {
            rtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.Components.g5) obj).o(null);
        }
        org.telegram.ui.Components.rt rtVar = this.w;
        if (rtVar != null) {
            rtVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.s.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.rt rtVar = this.w;
        if (rtVar != null) {
            rtVar.s();
            this.w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        u0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.G6, null);
            }
            fi.v3 v3Var = this.e;
            if (v3Var != null) {
                v3Var.invalidate();
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
        boolean z10;
        if (this.e == null || this.P0) {
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
        long j3 = this.C0;
        TLRPC.User a22 = j3 == 0 ? null : getMessagesController().a2(Long.valueOf(j3));
        if (M0 == null && a22 == null) {
            return;
        }
        this.D0 = a22;
        this.x0 = M0;
        org.telegram.ui.Components.t8 t8Var = this.r;
        if (a22 == null ? M0.photo == null : a22.photo == null) {
            this.e.setImageDrawable(t8Var);
        } else {
            TLRPC.Chat chat = a22 != null ? a22 : M0;
            this.v0 = a22 != null ? a22.photo.photo_small : M0.photo.photo_small;
            org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(this.currentAccount, 1, chat);
            this.e.f(chat, t8Var);
            if (m10 != null) {
                z10 = true;
                if (this.c0 != null) {
                    if (z10 || this.s.g()) {
                        this.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.M0(2131752213, "ChatSetNewPhoto"), true);
                    } else {
                        this.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.hd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                    }
                    if (this.S0 == null) {
                        this.S0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    this.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    this.c0.e.setAnimation(this.S0);
                }
                if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                    PhotoViewer.p1().r0();
                }
                if (this.a0 == null && getMessagesController().h6 && org.telegram.messenger.t3.V(this.x0)) {
                    this.a0.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.c0 != null) {
        }
        if (PhotoViewer.A1()) {
            PhotoViewer.p1().r0();
        }
        if (this.a0 == null) {
        }
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.g5 m10;
        this.y0 = chatFull;
        if (chatFull != null) {
            if (this.x0 == null) {
                this.x0 = getMessagesController().M0(Long.valueOf(this.w0));
            }
            this.K0 = !org.telegram.messenger.t3.T(this.x0) || this.y0.hidden_prehistory;
            this.L0 = this.y0.available_reactions;
            ArrayList arrayList = this.Q0;
            arrayList.clear();
            TLRPC.Chat chat = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
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
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m10 = org.telegram.ui.Components.g5.l(org.telegram.messenger.m10.t0, org.telegram.ui.Components.g5.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.g5.m(org.telegram.messenger.m10.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.g5.f()) : null;
                        }
                        if (m10 != null) {
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(org.telegram.messenger.m10.t0, org.telegram.ui.Components.g5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().h6 && org.telegram.messenger.t3.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        k0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j3 = this.C0;
                this.D0 = j3 == 0 ? null : getMessagesController().a2(Long.valueOf(j3));
            }
            org.telegram.ui.Cells.l8 l8Var = this.o0;
            if (l8Var != null) {
                l8Var.h(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.w(userFull2.starref_program == null ? org.telegram.messenger.hd.M0(2131754345, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.u0;
            if (l8Var2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                l8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.y8 y8Var = this.t0;
            if (y8Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                y8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.m30 m30Var = this.s;
        if (m30Var != null) {
            m30Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10, boolean z11) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i7 = 0;
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<hi.n5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<hi.n5, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new nn(i7, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.m30 m30Var = this.s;
        if (m30Var != null && (str = m30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.rt rtVar = this.w;
        if (rtVar != null) {
            String obj = rtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        int i7;
        dm0 dm0Var;
        int w02;
        ArrayList<Integer> arrayList;
        ol0 ol0Var = this.M;
        if (ol0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.l8 l8Var3 = this.O;
            boolean z10 = (l8Var3 != null && l8Var3.getVisibility() == 0) || ((l8Var = this.R) != null && l8Var.getVisibility() == 0) || ((org.telegram.messenger.t3.n0(this.x0) && org.telegram.messenger.t3.N(this.x0)) || ((l8Var2 = this.N) != null && l8Var2.getVisibility() == 0));
            Paint paint = ol0Var.n;
            int i10 = ol0Var.a;
            org.telegram.ui.ActionBar.e6 e6Var = ol0Var.d;
            if (chat == null) {
                return;
            }
            ol0Var.w = z10;
            ol0Var.r = new org.telegram.ui.Components.oy0(org.telegram.messenger.j6.m(chat.title, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
            dm0 dm0Var2 = ol0Var.x;
            if (dm0Var2 != null) {
                dm0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = dm0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                i7 = -16777216;
                ol0Var.x = new dm0(i12, i12, i12, tL_emojiStatusCollectible.document_id);
            } else {
                i7 = -16777216;
                if (org.telegram.messenger.t3.I(chat) >= 0) {
                    dm0Var = dm0.c(i10, org.telegram.messenger.t3.I(chat));
                    dm0Var.a = org.telegram.messenger.g0.L(11.0f);
                    dm0Var.d();
                } else {
                    dm0Var = null;
                }
                ol0Var.x = dm0Var;
            }
            dm0 dm0Var3 = ol0Var.x;
            if (dm0Var3 != null) {
                dm0Var3.e(ol0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
                int i13 = (!a10 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | i7;
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | i7 : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | i7 : intValue;
                ol0Var.r.n(i13);
                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, i13));
                dm0 dm0Var4 = new dm0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                dm0Var4.a = org.telegram.messenger.g0.L(11.0f);
                dm0Var4.d();
                ol0Var.y = dm0Var4;
                dm0Var4.e(ol0Var);
                return;
            }
            int F = org.telegram.messenger.t3.F(chat);
            if (F < 7) {
                int i14 = org.telegram.ui.ActionBar.j6.r8[F];
                ol0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.j6.w0(i14, e6Var);
            } else {
                org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).r4;
                org.telegram.messenger.cp d = dpVar == null ? null : dpVar.d(F);
                if (d != null) {
                    ol0Var.s = -1;
                    w02 = d.f();
                } else {
                    int i15 = org.telegram.ui.ActionBar.j6.r8[0];
                    ol0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.j6.w0(i15, e6Var);
                }
            }
            ol0Var.r.n(w02);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
            dm0 a11 = dm0.a(i10, F);
            a11.a = org.telegram.messenger.g0.L(11.0f);
            a11.d();
            ol0Var.y = a11;
            a11.e(ol0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(boolean z10, boolean z11) {
        boolean z12;
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
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        org.telegram.ui.Cells.l8 l8Var3;
        org.telegram.ui.Cells.l8 l8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.l8 l8Var5;
        org.telegram.ui.Cells.l8 l8Var6;
        org.telegram.ui.Cells.l8 l8Var7;
        org.telegram.ui.Cells.l8 l8Var8;
        org.telegram.ui.Cells.l8 l8Var9;
        TLRPC.Chat M02;
        if (z10 && (M02 = getMessagesController().M0(Long.valueOf(this.w0))) != null) {
            this.x0 = M02;
        }
        boolean t02 = org.telegram.messenger.t3.t0(this.x0);
        org.telegram.ui.Cells.y8 y8Var = this.Q;
        if (y8Var != null) {
            y8Var.setVisibility((this.J != null || ((l8Var7 = this.K) != null && l8Var7.getVisibility() == 0) || (((l8Var8 = this.O) != null && l8Var8.getVisibility() == 0) || ((l8Var9 = this.I) != null && l8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.l8 l8Var10 = this.Z;
        if (l8Var10 != null) {
            l8Var10.setVisibility(org.telegram.messenger.t3.T(this.x0) ? 0 : 8);
        }
        org.telegram.ui.Cells.l8 l8Var11 = this.K;
        if (l8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.J0 && chatFull2.linked_chat_id == 0)) {
                l8Var11.setVisibility(8);
            } else {
                l8Var11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(org.telegram.messenger.hd.M0(2131751389, "Discussion"), org.telegram.messenger.hd.M0(2131751381, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.y0.linked_chat_id));
                    if (M03 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.K.u(org.telegram.messenger.hd.M0(2131751389, "Discussion"), M03.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.K.u(org.telegram.messenger.hd.M0(2131751389, "Discussion"), r.b.k("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.l8 l8Var12 = this.K;
                            String M04 = org.telegram.messenger.hd.M0(2131748883, "LinkedChannel");
                            String str4 = M03.title;
                            org.telegram.ui.Cells.l8 l8Var13 = this.R;
                            l8Var12.u(M04, str4, false, R.drawable.msg_channel, l8Var13 != null && l8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.l8 l8Var14 = this.K;
                            String M05 = org.telegram.messenger.hd.M0(2131748883, "LinkedChannel");
                            String k10 = r.b.k("@", K2);
                            org.telegram.ui.Cells.l8 l8Var15 = this.R;
                            l8Var14.u(M05, k10, false, R.drawable.msg_channel, l8Var15 != null && l8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.l8 l8Var16 = this.I;
        if (l8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                l8Var16.setVisibility(8);
            } else {
                l8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.I.q(org.telegram.messenger.hd.M0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.I.q(org.telegram.messenger.hd.M0(2131753961, "AttachLocation"), "Unknown address", z11, true);
                }
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.x0.noforwards;
                if (this.J0) {
                    if (t02) {
                        i15 = 2131743920;
                        str3 = "TypePublic";
                    } else if (z13) {
                        i15 = 2131743921;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i15 = 2131743924;
                        str3 = "TypePrivate";
                    }
                    M0 = org.telegram.messenger.hd.M0(i15, str3);
                } else {
                    if (t02) {
                        i14 = 2131743919;
                        str2 = "TypePublicGroup";
                    } else if (z13) {
                        i14 = 2131743922;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = 2131743923;
                        str2 = "TypePrivateGroup";
                    }
                    M0 = org.telegram.messenger.hd.M0(i14, str2);
                }
                String str5 = M0;
                if (this.J0) {
                    org.telegram.ui.Cells.l8 l8Var17 = this.J;
                    String M06 = org.telegram.messenger.hd.M0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.l8 l8Var18 = this.O;
                    l8Var17.u(M06, str5, false, R.drawable.msg_channel, (l8Var18 != null && l8Var18.getVisibility() == 0) || ((l8Var3 = this.K) != null && l8Var3.getVisibility() == 0) || ((l8Var4 = this.R) != null && l8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.l8 l8Var19 = this.J;
                    String M07 = org.telegram.messenger.hd.M0(2131749392, "GroupType");
                    org.telegram.ui.Cells.l8 l8Var20 = this.O;
                    l8Var19.u(M07, str5, false, R.drawable.msg_groups, (l8Var20 != null && l8Var20.getVisibility() == 0) || ((l8Var = this.K) != null && l8Var.getVisibility() == 0) || ((l8Var2 = this.R) != null && l8Var2.getVisibility() == 0));
                }
            } else {
                String M08 = !t02 ? org.telegram.messenger.hd.M0(2131743929, "TypeLocationGroupEdit") : String.format(a8.p0.s(new StringBuilder("https://"), getMessagesController().V2, "/%s"), org.telegram.messenger.t3.K(this.x0, false));
                org.telegram.ui.Cells.l8 l8Var21 = this.J;
                String M09 = org.telegram.messenger.hd.M0(2131743930, "TypeLocationGroup");
                org.telegram.ui.Cells.l8 l8Var22 = this.O;
                l8Var21.u(M09, M08, false, R.drawable.msg_channel, (l8Var22 != null && l8Var22.getVisibility() == 0) || ((l8Var5 = this.K) != null && l8Var5.getVisibility() == 0) || ((l8Var6 = this.R) != null && l8Var6.getVisibility() == 0));
            }
        }
        if (this.O != null) {
            if (!this.K0 || this.F0) {
                i13 = 2131752228;
                str = "ChatHistoryVisible";
            } else {
                i13 = 2131752232;
                str = "ChatHistoryHidden";
            }
            this.O.u(org.telegram.messenger.hd.M0(2131752229, "ChatHistoryShort"), org.telegram.messenger.hd.M0(i13, str), z11, R.drawable.msg_discuss, this.R != null);
            this.O.setEnabled(!this.F0);
            boolean z14 = (this.F0 || t02 || ((chatFull = this.y0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.O.getAlpha() <= 0.0f && !z14) {
                this.O.setVisibility(8);
                t0();
            } else if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                int i16 = 0;
                boolean z15 = false;
                while (i16 < this.G.getChildCount()) {
                    if (!z15 && this.G.getChildAt(i16) == this.O) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.G.getChildAt(i16));
                    }
                    i16++;
                    z15 = z15;
                }
                int i17 = 0;
                boolean z16 = false;
                while (i17 < this.x.getChildCount()) {
                    if (!z16 && this.x.getChildAt(i17) == this.G) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.x.getChildAt(i17));
                    }
                    i17++;
                    z16 = z16;
                }
                if (this.O.getVisibility() != 0) {
                    this.O.setAlpha(0.0f);
                    this.O.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.O.setVisibility(0);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    ((View) arrayList.get(i18)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.T0 = ofFloat;
                    ofFloat.addUpdateListener(new ch.v(10, this, arrayList));
                    this.T0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 7));
                    this.T0.setDuration(320L);
                    this.T0.setInterpolator(org.telegram.ui.Components.er.h);
                    this.T0.start();
                } else {
                    this.O.setAlpha(z14 ? 1.0f : 0.0f);
                    this.O.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.O.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.O.setVisibility(z14 ? 0 : 8);
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        ((View) arrayList.get(i19)).setTranslationY(0.0f);
                    }
                    this.T0 = null;
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                org.telegram.ui.Cells.l8 l8Var23 = this.V;
                if (l8Var23 != null) {
                    if (l8Var23.getParent() == null) {
                        i7 = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, c8.ja.o(-1, -2));
                    } else {
                        i7 = 0;
                    }
                    this.V.setVisibility(this.y0.requests_pending > 0 ? i7 : 8);
                } else {
                    i7 = 0;
                }
                if (!this.J0 || org.telegram.messenger.t3.Y(this.x0)) {
                    if (org.telegram.messenger.t3.T(this.x0)) {
                        org.telegram.ui.Cells.l8 l8Var24 = this.U;
                        String M010 = org.telegram.messenger.hd.M0(2131752377, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i7] = Integer.valueOf(this.y0.participants_count);
                        l8Var24.u(M010, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.l8 l8Var25 = this.U;
                        CharSequence M011 = org.telegram.messenger.hd.M0(2131752377, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i7] = Integer.valueOf(this.y0.participants.participants.size());
                        l8Var25.u(M011, String.format("%d", objArr2), false, R.drawable.msg_groups, this.V.getVisibility() == 0 ? 1 : i7);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (!chat.gigagroup || org.telegram.messenger.t3.Y(chat)) {
                        int i20 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i21 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i21++;
                            }
                            i10 = qq.s0(tL_chatBannedRights) + i21;
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
                            i11 = i20;
                        } else {
                            i10 = i20;
                            i11 = i10;
                        }
                        org.telegram.ui.Cells.l8 l8Var26 = this.Y;
                        String M012 = org.telegram.messenger.hd.M0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i10);
                        Integer valueOf2 = Integer.valueOf(i11);
                        Object[] objArr3 = new Object[2];
                        objArr3[i7] = valueOf;
                        objArr3[1] = valueOf2;
                        l8Var26.u(M012, String.format("%d/%d", objArr3), z11, R.drawable.msg_permissions, true);
                        z12 = z11;
                    } else {
                        org.telegram.ui.Cells.l8 l8Var27 = this.Y;
                        CharSequence M013 = org.telegram.messenger.hd.M0(2131752453, null);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i7] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        org.telegram.ui.Cells.l8 l8Var28 = this.Z;
                        l8Var27.u(M013, format, false, R.drawable.msg_user_remove, (l8Var28 == null || l8Var28.getVisibility() != 0) ? i7 : 1);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.l8 l8Var29 = this.V;
                    if (l8Var29 != null) {
                        CharSequence M014 = org.telegram.messenger.hd.M0(2131748635, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i7] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.l8 l8Var30 = this.Z;
                        l8Var29.u(M014, format2, false, R.drawable.msg_requests, (l8Var30 == null || l8Var30.getVisibility() != 0) ? i7 : 1);
                    }
                } else {
                    org.telegram.ui.Cells.l8 l8Var31 = this.U;
                    String M015 = org.telegram.messenger.hd.M0(2131752289, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i7] = Integer.valueOf(this.y0.participants_count);
                    l8Var31.u(M015, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.l8 l8Var32 = this.Y;
                    CharSequence M016 = org.telegram.messenger.hd.M0(2131752453, null);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i7] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    org.telegram.ui.Cells.l8 l8Var33 = this.Z;
                    l8Var32.u(M016, format3, false, R.drawable.msg_user_remove, (l8Var33 == null || l8Var33.getVisibility() != 0) ? i7 : 1);
                    z12 = z11;
                }
                org.telegram.ui.Cells.l8 l8Var34 = this.X;
                String M017 = org.telegram.messenger.hd.M0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.t3.T(this.x0)) {
                    i12 = this.y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.y0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i22 = i7;
                        int i23 = i22;
                        while (i22 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i22);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i23++;
                            }
                            i22++;
                        }
                        i12 = i23;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i7] = Integer.valueOf(i12);
                l8Var34.u(M017, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                i7 = 0;
                if (!this.J0 || org.telegram.messenger.t3.Y(this.x0)) {
                    org.telegram.ui.Cells.l8 l8Var35 = this.U;
                    String M018 = org.telegram.messenger.hd.M0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.l8 l8Var36 = this.Z;
                    l8Var35.o(R.drawable.msg_groups, M018, l8Var36 != null && l8Var36.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.l8 l8Var37 = this.Y;
                        String M019 = org.telegram.messenger.hd.M0(2131752453, null);
                        org.telegram.ui.Cells.l8 l8Var38 = this.Z;
                        l8Var37.o(R.drawable.msg_chats_remove, M019, l8Var38 != null && l8Var38.getVisibility() == 0);
                    } else {
                        this.Y.o(R.drawable.msg_permissions, org.telegram.messenger.hd.M0(2131752333, null), true);
                    }
                } else {
                    this.U.o(R.drawable.msg_groups, org.telegram.messenger.hd.M0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.l8 l8Var39 = this.Y;
                    String M020 = org.telegram.messenger.hd.M0(2131752453, null);
                    org.telegram.ui.Cells.l8 l8Var40 = this.Z;
                    l8Var39.o(R.drawable.msg_chats_remove, M020, l8Var40 != null && l8Var40.getVisibility() == 0);
                }
                this.X.o(R.drawable.msg_admins, org.telegram.messenger.hd.M0(2131752517, "ChannelAdministrators"), true);
            }
            this.P.setVisibility(org.telegram.messenger.t3.w(1, this.x0) ? i7 : 8);
            x0(z12);
            if (this.y0 == null || !org.telegram.messenger.t3.y(3, this.x0) || (t02 && this.x0.creator)) {
                this.W.setVisibility(8);
            } else if (this.y0.invitesCount > 0) {
                this.W.u(org.telegram.messenger.hd.M0(2131749140, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.W.u(org.telegram.messenger.hd.M0(2131749140, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10) {
        yw ywVar;
        uv uvVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i7 = 0;
        while (i7 < fragmentStack.size()) {
            if (fragmentStack.get(i7) instanceof an) {
                an anVar = (an) fragmentStack.get(i7);
                if (anVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).d0(anVar, false);
                    anVar.clearViews();
                    if (((ActionBarLayout) getParentLayout()).c(i7, anVar)) {
                        org.telegram.messenger.ns.e().j(anVar.ca);
                    }
                    if (z10 && !this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i7, new u91(bundle));
                        i7++;
                    }
                }
            } else if (z10 && this.H0 && (fragmentStack.get(i7) instanceof u91)) {
                u91 u91Var = (u91) fragmentStack.get(i7);
                if (u91Var.g() != null && u91Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).d0(u91Var, false);
                    i7--;
                }
            } else if (z10 && this.H0 && (fragmentStack.get(i7) instanceof yw) && (ywVar = (yw) fragmentStack.get(i7)) != null && (uvVar = ywVar.H3) != null && uvVar.c()) {
                ywVar.H3.a();
            }
            i7++;
        }
    }

    public final void w0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.u(org.telegram.messenger.hd.M0(2131753005, null), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
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
        this.l0.u(org.telegram.messenger.hd.M0(2131753004, null), org.telegram.messenger.hd.a0(null, null, 2131753003, Integer.valueOf(i7), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x0(boolean z10) {
        String str;
        String str2;
        int i7;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.w0);
        boolean V = org.telegram.messenger.t3.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String M0 = org.telegram.messenger.hd.M0(2131746379, null);
            if (N0 == null || !N0.paid_reactions_available) {
                str = M0;
                this.P.u(org.telegram.messenger.hd.M0(2131746387, null), str, z10, R.drawable.msg_reactions2, true);
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
                str2 = i10 == 0 ? org.telegram.messenger.hd.M0(2131746379, null) : String.valueOf(i10);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i10);
                str2 = min == 0 ? org.telegram.messenger.hd.M0(2131746379, null) : org.telegram.messenger.hd.a0(null, null, 2131746384, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = org.telegram.messenger.hd.M0(2131746386, null);
        }
        str = str2;
        this.P.u(org.telegram.messenger.hd.M0(2131746387, null), str, z10, R.drawable.msg_reactions2, true);
    }

    public final void y0(Long l10) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.L == null) {
            return;
        }
        long j3 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.L.u(org.telegram.messenger.hd.M0(2131747096, null), org.telegram.messenger.hd.M0(2131747086, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.x0.linked_monoforum_id));
        if (l10 != null) {
            j3 = l10.longValue();
        } else if (M0 != null) {
            j3 = M0.send_paid_messages_stars;
        }
        this.L.u(org.telegram.messenger.hd.M0(2131747096, null), di.mb.a1(false, org.telegram.messenger.hd.a0(null, null, 2131747068, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.l30
    public final /* synthetic */ void U() {
    }
}
