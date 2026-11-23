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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class rn extends org.telegram.ui.ActionBar.g2 implements org.telegram.ui.Components.t30, org.telegram.messenger.fs {
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
    public org.telegram.ui.Cells.y6 H;
    public boolean H0;
    public org.telegram.ui.Cells.m8 I;
    public boolean I0;
    public org.telegram.ui.Cells.m8 J;
    public boolean J0;
    public org.telegram.ui.Cells.m8 K;
    public boolean K0;
    public org.telegram.ui.Cells.m8 L;
    public TLRPC.ChatReactions L0;
    public pl0 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public org.telegram.ui.Cells.m8 N;
    public boolean N0;
    public org.telegram.ui.Cells.m8 O;
    public boolean O0;
    public org.telegram.ui.Cells.m8 P;
    public boolean P0;
    public org.telegram.ui.Cells.z8 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.m8 R;
    public final pn R0;
    public LinearLayout S;
    public org.telegram.ui.Components.nh0 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public org.telegram.ui.Cells.m8 U;
    public org.telegram.ui.Cells.m8 V;
    public org.telegram.ui.Cells.m8 W;
    public org.telegram.ui.Cells.m8 X;
    public org.telegram.ui.Cells.m8 Y;
    public org.telegram.ui.Cells.m8 Z;
    public org.telegram.ui.ActionBar.c5 a;
    public org.telegram.ui.Cells.m8 a0;
    public org.telegram.ui.ActionBar.t1 b;
    public org.telegram.ui.Cells.m8 b0;
    public UndoView c;
    public qn c0;
    public LinearLayout d;
    public FrameLayout d0;
    public fi.t3 e;
    public org.telegram.ui.Cells.w9 e0;
    public hi.w5 f;
    public org.telegram.ui.Cells.m8 f0;
    public org.telegram.ui.Cells.m8 g0;
    public AnimatorSet h;
    public mi.b h0;
    public org.telegram.ui.Cells.z8 i0;
    public org.telegram.ui.Cells.m8 j0;
    public org.telegram.ui.Cells.z8 k0;
    public org.telegram.ui.Cells.m8 l0;
    public org.telegram.ui.Cells.m8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.m8 n0;
    public org.telegram.ui.Cells.m8 o0;
    public org.telegram.ui.Cells.m8 p0;
    public org.telegram.ui.Cells.m8 q0;
    public final org.telegram.ui.Components.a9 r;
    public org.telegram.ui.Cells.m8 r0;
    public final org.telegram.ui.Components.u30 s;
    public org.telegram.ui.Cells.z8 s0;
    public org.telegram.ui.Cells.z8 t0;
    public org.telegram.ui.Cells.m8 u0;
    public TLRPC.FileLocation v0;
    public org.telegram.ui.Components.wt w;
    public long w0;
    public org.telegram.ui.Components.um0 x;
    public TLRPC.Chat x0;
    public org.telegram.ui.Components.vm0 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public rn(Bundle bundle) {
        super(bundle);
        this.Q0 = new ArrayList();
        this.R0 = new pn(this);
        this.r = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.u30(0, false, false);
        } else {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.u30((O0 == null || !org.telegram.messenger.v3.V(O0)) ? 2 : 1, true, true);
        }
    }

    public static void Z(rn rnVar, FrameLayout frameLayout, View view) {
        int i7 = 3;
        if (!rnVar.G0) {
            TLRPC.ChatFull chatFull = rnVar.y0;
            org.telegram.ui.Components.kc.b0(rnVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(rnVar.getMessagesController().f5, "ChannelTopicsForbidden", new Object[0])) : org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752268, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j3 = -rnVar.w0;
        qx qxVar = new qx(null);
        qxVar.a = j3;
        qxVar.setResourceProvider(rnVar.resourceProvider);
        boolean z10 = rnVar.F0;
        boolean z11 = rnVar.H0;
        boolean z12 = rnVar.I0;
        fi.b0 b0Var = new fi.b0(i7, rnVar, view);
        qxVar.c = z10;
        qxVar.d = z11;
        qxVar.e = z12;
        qxVar.h = b0Var;
        rnVar.presentFragment(qxVar);
    }

    public static /* synthetic */ void a0(rn rnVar) {
        rnVar.v0 = null;
        long j3 = rnVar.C0;
        if (j3 == 0) {
            org.telegram.messenger.mp.u1(rnVar.currentAccount).B(rnVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = rnVar.getMessagesController().q1(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            rnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new kn(rnVar, 2));
        }
        rnVar.s0(false, true);
        fi.t3 t3Var = rnVar.e;
        org.telegram.ui.Components.a9 a9Var = rnVar.r;
        Object obj = rnVar.D0;
        if (obj == null) {
            obj = rnVar.x0;
        }
        t3Var.j(null, null, a9Var, obj);
        rnVar.S0.M(0);
        rnVar.c0.e.d();
    }

    public static void b0(rn rnVar, long j3, long j10) {
        org.telegram.messenger.mp.u1(rnVar.currentAccount).W2(j3, j10, true, false, new a5(rnVar, 4));
    }

    public static void c0(rn rnVar) {
        int i7 = rnVar.currentAccount;
        long j3 = rnVar.C0;
        TL_bots.BotVerifierSettings botVerifierSettings = rnVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle l10 = org.telegram.ui.Cells.c0.l(16, "onlySelect", "dialogsType", true);
        l10.putBoolean("resetDelegate", false);
        bx bxVar = new bx(l10);
        bxVar.setCurrentAccount(i7);
        bxVar.E2 = new ki.l1(bxVar, i7, j3, botVerifierSettings);
        T.presentFragment(bxVar);
    }

    public static void d0(rn rnVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, org.telegram.messenger.g3 g3Var) {
        t1Var.dismiss();
        if (rnVar.getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(35, rnVar.currentAccount, rnVar.getParentActivity(), rnVar, rnVar.getResourceProvider());
        k0Var.B1(g3Var);
        k0Var.A1(tL_premium_boostsStatus, true);
        k0Var.C1(j3);
        TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(-j3));
        if (O0 != null) {
            k0Var.M2 = new ah(8, rnVar, O0);
        }
        rnVar.showDialog(k0Var);
    }

    public static void e0(rn rnVar) {
        qc qcVar = new qc(-rnVar.x0.id);
        qcVar.m0 = rnVar;
        rnVar.presentFragment(qcVar);
        org.telegram.messenger.mp.u1(rnVar.currentAccount).h7.edit().putInt("boostingappearance", org.telegram.messenger.mp.u1(rnVar.currentAccount).h7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void f0(rn rnVar) {
        rnVar.P0 = true;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(rnVar.currentAccount);
        int i7 = org.telegram.messenger.mp.I8;
        f10.k(org.telegram.messenger.ks.r, 2);
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz(10);
        hzVar.a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        hzVar.f = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ck, false);
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

    @Override // org.telegram.ui.Components.t30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.t30
    public final void P(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t30
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x044f, code lost:
    
        if (org.telegram.messenger.v3.y(0, r37.x0) != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06ef  */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [org.telegram.ui.ActionBar.i6, org.telegram.ui.ActionBar.q6] */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r23;
        final rn rnVar;
        int i7;
        CharSequence charSequence;
        org.telegram.ui.Components.um0 um0Var;
        Context context2;
        int i10;
        int i11;
        org.telegram.ui.Components.um0 um0Var2;
        org.telegram.ui.ActionBar.q6 q6Var;
        CharSequence charSequence2;
        int i12;
        CharSequence charSequence3;
        boolean z10;
        CharSequence b12;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final rn rnVar2;
        ?? r82;
        boolean z11;
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
        TLRPC.ChatFull chatFull;
        CharSequence charSequence4;
        CharSequence charSequence5;
        float f10;
        int i16;
        Context context3;
        FrameLayout frameLayout;
        final rn rnVar3;
        float f11;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i17 = 1;
        setHasOwnBackground(true);
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 8));
        wc wcVar = new wc(i17, context, this);
        wcVar.setOnTouchListener(new gi.a(9));
        this.fragmentView = wcVar;
        org.telegram.ui.Components.um0 um0Var3 = new org.telegram.ui.Components.um0(context);
        this.x = um0Var3;
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(context, this.x, this.resourceProvider, false);
        this.y = vm0Var;
        vm0Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        wcVar.addView(this.y, c8.na.c(-1.0f, -1));
        this.y.addView(um0Var3, new FrameLayout.LayoutParams(-1, -2));
        um0Var3.setOrientation(1);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131752403));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i18 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i18, linearLayout2, null);
        um0Var3.addView(this.d, c8.na.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, c8.na.o(-1, -2));
        int i19 = 6;
        fi.t3 t3Var = new fi.t3(i19, context, this);
        this.e = t3Var;
        t3Var.setRoundRadius(this.F0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(32.0f));
        int i20 = 3;
        if (this.D0 != null || org.telegram.messenger.v3.d(this.x0)) {
            fi.t3 t3Var2 = this.e;
            boolean z12 = org.telegram.messenger.gd.a0;
            frameLayout2.addView(t3Var2, c8.na.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            hi.w5 w5Var = new hi.w5(this, context, paint, i19);
            this.f = w5Var;
            boolean z13 = org.telegram.messenger.gd.a0;
            frameLayout2.addView(w5Var, c8.na.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = org.telegram.messenger.gd.a0;
            frameLayout2.addView(radialProgressView2, c8.na.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            s0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j3 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j3 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j3));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i21 = chatPhoto2.dc_id;
                                        if (i21 != 0) {
                                            chatPhoto2.photo_big.dc_id = i21;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i22 = userProfilePhoto2.dc_id;
                                        if (i22 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i22;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j10 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var7 = rnVar15.I;
                            boolean z15 = m8Var7 != null && m8Var7.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j10;
                            ioVar.o0 = z15;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z16 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z16 = true;
                            }
                            uoVar.s = z16;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i23 = 0; i23 < tL_chatReactionsSome.reactions.size(); i23++) {
                                            if (tL_chatReactionsSome.reactions.get(i23) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i23)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
        } else {
            fi.t3 t3Var3 = this.e;
            boolean z15 = org.telegram.messenger.gd.a0;
            frameLayout2.addView(t3Var3, c8.na.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, wcVar, this);
        this.w = wtVar2;
        long j3 = this.C0;
        if (j3 != 0) {
            r23 = 0;
            wtVar2.setHint(org.telegram.messenger.gd.M0(2131753009));
        } else if (this.J0) {
            wtVar2.setHint(org.telegram.messenger.gd.N0(2131751112, "EnterChannelName"));
            r23 = false;
        } else {
            wtVar2.setHint(org.telegram.messenger.gd.N0(2131749229, "GroupName"));
            r23 = false;
        }
        org.telegram.ui.Components.wt wtVar3 = this.w;
        TLRPC.Chat chat = this.x0;
        wtVar3.setEnabled((chat != null || org.telegram.messenger.v3.d(chat)) ? true : r23);
        org.telegram.ui.Components.wt wtVar4 = this.w;
        wtVar4.setFocusable(wtVar4.isEnabled());
        this.w.getEditText().addTextChangedListener(new m0(this, i20));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r23] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        org.telegram.ui.Components.wt wtVar5 = this.w;
        boolean z16 = org.telegram.messenger.gd.a0;
        frameLayout2.addView(wtVar5, c8.na.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(1);
        um0Var3.addView(this.E, c8.na.o(-1, -2));
        final int i21 = 12;
        if (this.D0 != null || org.telegram.messenger.v3.d(this.x0)) {
            qn qnVar = new qn(context);
            this.c0 = qnVar;
            org.telegram.ui.ActionBar.u6.R(qnVar, org.telegram.ui.ActionBar.n6.N0(r23), null, org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
            this.c0.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i21) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i22 = userProfilePhoto2.dc_id;
                                        if (i22 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i22;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j10 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var7 = rnVar15.I;
                            boolean z152 = m8Var7 != null && m8Var7.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j10;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i23 = 0; i23 < tL_chatReactionsSome.reactions.size(); i23++) {
                                            if (tL_chatReactionsSome.reactions.get(i23) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i23)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            this.E.addView(this.c0, c8.na.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.F = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.E(this.F, org.telegram.ui.ActionBar.n6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        int i22 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor2, i22, null);
        int i23 = r23;
        this.F.setPadding(i23, i23, i23, org.telegram.messenger.g0.L(6.0f));
        this.F.setBackgroundDrawable(null);
        this.F.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        this.F.setInputType(180225);
        this.F.setImeOptions(6);
        this.F.setEnabled(this.D0 != null || org.telegram.messenger.v3.d(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.F;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.ks.e4)});
        this.F.setHint(org.telegram.messenger.gd.N0(2131751448, "DescriptionOptionalPlaceholder"));
        org.telegram.ui.ActionBar.u6.u(this.F, i22);
        this.F.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.F.setCursorWidth(1.5f);
        if (this.F.isEnabled()) {
            this.E.addView(this.F, c8.na.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.E.addView(this.F, c8.na.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        final int i24 = 2;
        this.F.setOnEditorActionListener(new fa(this, i24));
        this.F.addTextChangedListener(new zc(1));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context);
        this.H = y6Var;
        um0Var3.addView(y6Var, c8.na.o(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        um0Var3.addView(this.G, c8.na.o(-1, -2));
        TLRPC.Chat chat2 = this.x0;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.y0) == null || chatFull3.can_set_location)) {
                org.telegram.ui.Cells.m8 m8Var7 = new org.telegram.ui.Cells.m8(context);
                this.I = m8Var7;
                org.telegram.ui.ActionBar.u6.R(m8Var7, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i18), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                this.G.addView(this.I, c8.na.o(-1, -2));
                final int i25 = 15;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                rn rnVar4 = this.b;
                                rnVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar4.y0);
                                rnVar4.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar5 = this.b;
                                pn pnVar = rnVar5.R0;
                                long j32 = rnVar5.C0;
                                if (!rnVar5.s.g()) {
                                    org.telegram.messenger.fc fcVar = null;
                                    TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                    if (c22 == null) {
                                        TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                        TLRPC.ChatPhoto chatPhoto = O0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                            int i212 = chatPhoto2.dc_id;
                                            if (i212 != 0) {
                                                chatPhoto2.photo_big.dc_id = i212;
                                            }
                                            TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                            int i222 = userProfilePhoto2.dc_id;
                                            if (i222 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i222;
                                            }
                                            PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar6 = this.b;
                                rnVar6.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar6.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar6.y0);
                                rnVar6.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                break;
                            case 4:
                                rn rnVar8 = this.b;
                                rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                break;
                            case 5:
                                rn rnVar9 = this.b;
                                rnVar9.getClass();
                                rnVar9.presentFragment(new lb(rnVar9.x0));
                                break;
                            case 6:
                                rn rnVar10 = this.b;
                                rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                break;
                            case 7:
                                rn rnVar11 = this.b;
                                rnVar11.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar11.C0);
                                rnVar11.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar12 = this.b;
                                rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar13 = this.b;
                                org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                break;
                            case 15:
                                rn rnVar14 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar14)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -rnVar14.w0;
                                    TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.M0 = new ln(rnVar14, 6);
                                    rnVar14.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar15 = this.b;
                                long j10 = rnVar15.w0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.N = new ArrayList();
                                ioVar.O = new ArrayList();
                                ioVar.Q = new ArrayList();
                                ioVar.d0 = true;
                                ioVar.g0 = new ArrayList();
                                ioVar.p0 = new HashMap();
                                ioVar.r0 = new tn(ioVar, 5);
                                ioVar.t0 = false;
                                ioVar.a0 = j10;
                                ioVar.o0 = z152;
                                TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                ioVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.m0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar15.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar16 = this.b;
                                long j11 = rnVar16.w0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.P = false;
                                uoVar.Q = false;
                                uoVar.F = j11;
                                TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                uoVar.f = O02;
                                if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar16.y0;
                                rnVar16.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar17 = this.b;
                                hs0 hs0Var = new hs0(rnVar17.w0);
                                hs0Var.s = new ln(rnVar17, 4);
                                rnVar17.presentFragment(hs0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar18 = this.b;
                                l40 l40Var = new l40(-rnVar18.x0.id);
                                l40Var.c = rnVar18.M0;
                                l40Var.m0 = rnVar18;
                                rnVar18.presentFragment(l40Var);
                                break;
                            case 21:
                                rn rnVar19 = this.b;
                                rnVar19.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar19.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar19.y0);
                                rnVar19.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar20 = this.b;
                                ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                rnVar20.presentFragment(ef0Var);
                                break;
                            case 23:
                                rn rnVar21 = this.b;
                                if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                    rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar21.w0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                    bpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar21.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar22 = this.b;
                                rnVar22.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar22.w0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                rnVar22.presentFragment(new bn(bundle6));
                                break;
                        }
                    }
                });
            }
            final int i26 = 16;
            if (this.x0.creator && ((chatFull2 = this.y0) == null || chatFull2.can_set_username)) {
                org.telegram.ui.Cells.m8 m8Var8 = new org.telegram.ui.Cells.m8(context);
                this.J = m8Var8;
                org.telegram.ui.ActionBar.u6.R(m8Var8, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i18), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                this.G.addView(this.J, c8.na.o(-1, -2));
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                rn rnVar4 = this.b;
                                rnVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar4.y0);
                                rnVar4.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar5 = this.b;
                                pn pnVar = rnVar5.R0;
                                long j32 = rnVar5.C0;
                                if (!rnVar5.s.g()) {
                                    org.telegram.messenger.fc fcVar = null;
                                    TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                    if (c22 == null) {
                                        TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                        TLRPC.ChatPhoto chatPhoto = O0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                            int i212 = chatPhoto2.dc_id;
                                            if (i212 != 0) {
                                                chatPhoto2.photo_big.dc_id = i212;
                                            }
                                            TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                            int i222 = userProfilePhoto2.dc_id;
                                            if (i222 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i222;
                                            }
                                            PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar6 = this.b;
                                rnVar6.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar6.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar6.y0);
                                rnVar6.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                break;
                            case 4:
                                rn rnVar8 = this.b;
                                rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                break;
                            case 5:
                                rn rnVar9 = this.b;
                                rnVar9.getClass();
                                rnVar9.presentFragment(new lb(rnVar9.x0));
                                break;
                            case 6:
                                rn rnVar10 = this.b;
                                rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                break;
                            case 7:
                                rn rnVar11 = this.b;
                                rnVar11.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar11.C0);
                                rnVar11.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar12 = this.b;
                                rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar13 = this.b;
                                org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                break;
                            case 15:
                                rn rnVar14 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar14)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -rnVar14.w0;
                                    TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.M0 = new ln(rnVar14, 6);
                                    rnVar14.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar15 = this.b;
                                long j10 = rnVar15.w0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.N = new ArrayList();
                                ioVar.O = new ArrayList();
                                ioVar.Q = new ArrayList();
                                ioVar.d0 = true;
                                ioVar.g0 = new ArrayList();
                                ioVar.p0 = new HashMap();
                                ioVar.r0 = new tn(ioVar, 5);
                                ioVar.t0 = false;
                                ioVar.a0 = j10;
                                ioVar.o0 = z152;
                                TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                ioVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.m0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar15.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar16 = this.b;
                                long j11 = rnVar16.w0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.P = false;
                                uoVar.Q = false;
                                uoVar.F = j11;
                                TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                uoVar.f = O02;
                                if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar16.y0;
                                rnVar16.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar17 = this.b;
                                hs0 hs0Var = new hs0(rnVar17.w0);
                                hs0Var.s = new ln(rnVar17, 4);
                                rnVar17.presentFragment(hs0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar18 = this.b;
                                l40 l40Var = new l40(-rnVar18.x0.id);
                                l40Var.c = rnVar18.M0;
                                l40Var.m0 = rnVar18;
                                rnVar18.presentFragment(l40Var);
                                break;
                            case 21:
                                rn rnVar19 = this.b;
                                rnVar19.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar19.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar19.y0);
                                rnVar19.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar20 = this.b;
                                ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                rnVar20.presentFragment(ef0Var);
                                break;
                            case 23:
                                rn rnVar21 = this.b;
                                if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                    rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar21.w0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                    bpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar21.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar22 = this.b;
                                rnVar22.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar22.w0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                rnVar22.presentFragment(new bn(bundle6));
                                break;
                        }
                    }
                });
            }
            final int i27 = 17;
            if (org.telegram.messenger.v3.T(this.x0)) {
                if (this.J0 && org.telegram.messenger.v3.y(1, this.x0)) {
                    charSequence4 = "";
                } else if (!this.J0) {
                    charSequence4 = "";
                }
                org.telegram.ui.Cells.m8 m8Var9 = new org.telegram.ui.Cells.m8(context);
                this.K = m8Var9;
                org.telegram.ui.ActionBar.u6.R(m8Var9, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i18), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                this.G.addView(this.K, c8.na.o(-1, -2));
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                rn rnVar4 = this.b;
                                rnVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar4.y0);
                                rnVar4.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar5 = this.b;
                                pn pnVar = rnVar5.R0;
                                long j32 = rnVar5.C0;
                                if (!rnVar5.s.g()) {
                                    org.telegram.messenger.fc fcVar = null;
                                    TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                    if (c22 == null) {
                                        TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                        TLRPC.ChatPhoto chatPhoto = O0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                            int i212 = chatPhoto2.dc_id;
                                            if (i212 != 0) {
                                                chatPhoto2.photo_big.dc_id = i212;
                                            }
                                            TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                            int i222 = userProfilePhoto2.dc_id;
                                            if (i222 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i222;
                                            }
                                            PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar6 = this.b;
                                rnVar6.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar6.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar6.y0);
                                rnVar6.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                break;
                            case 4:
                                rn rnVar8 = this.b;
                                rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                break;
                            case 5:
                                rn rnVar9 = this.b;
                                rnVar9.getClass();
                                rnVar9.presentFragment(new lb(rnVar9.x0));
                                break;
                            case 6:
                                rn rnVar10 = this.b;
                                rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                break;
                            case 7:
                                rn rnVar11 = this.b;
                                rnVar11.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar11.C0);
                                rnVar11.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar12 = this.b;
                                rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar13 = this.b;
                                org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                break;
                            case 15:
                                rn rnVar14 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar14)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -rnVar14.w0;
                                    TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.M0 = new ln(rnVar14, 6);
                                    rnVar14.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar15 = this.b;
                                long j10 = rnVar15.w0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.N = new ArrayList();
                                ioVar.O = new ArrayList();
                                ioVar.Q = new ArrayList();
                                ioVar.d0 = true;
                                ioVar.g0 = new ArrayList();
                                ioVar.p0 = new HashMap();
                                ioVar.r0 = new tn(ioVar, 5);
                                ioVar.t0 = false;
                                ioVar.a0 = j10;
                                ioVar.o0 = z152;
                                TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                ioVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.m0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar15.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar16 = this.b;
                                long j11 = rnVar16.w0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.P = false;
                                uoVar.Q = false;
                                uoVar.F = j11;
                                TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                uoVar.f = O02;
                                if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar16.y0;
                                rnVar16.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar17 = this.b;
                                hs0 hs0Var = new hs0(rnVar17.w0);
                                hs0Var.s = new ln(rnVar17, 4);
                                rnVar17.presentFragment(hs0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar18 = this.b;
                                l40 l40Var = new l40(-rnVar18.x0.id);
                                l40Var.c = rnVar18.M0;
                                l40Var.m0 = rnVar18;
                                rnVar18.presentFragment(l40Var);
                                break;
                            case 21:
                                rn rnVar19 = this.b;
                                rnVar19.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar19.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar19.y0);
                                rnVar19.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar20 = this.b;
                                ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                rnVar20.presentFragment(ef0Var);
                                break;
                            case 23:
                                rn rnVar21 = this.b;
                                if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                    rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar21.w0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                    bpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar21.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar22 = this.b;
                                rnVar22.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar22.w0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                rnVar22.presentFragment(new bn(bundle6));
                                break;
                        }
                    }
                });
                if (org.telegram.messenger.v3.V(this.x0) && this.J0 && org.telegram.messenger.v3.y(1, this.x0)) {
                    org.telegram.ui.Cells.m8 m8Var10 = new org.telegram.ui.Cells.m8(context);
                    this.L = m8Var10;
                    org.telegram.ui.ActionBar.u6.R(m8Var10, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i18), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                    this.L.s(org.telegram.messenger.gd.M0(2131746902), charSequence4, R.drawable.msg_markunread, true);
                    this.G.addView(this.L, c8.na.o(-1, -2));
                    final int i28 = 18;
                    this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i28) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j10 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j10;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.v3.V(this.x0) || !org.telegram.messenger.v3.d(this.x0)) {
                    i7 = i18;
                    charSequence5 = charSequence4;
                    f10 = -2.0f;
                    i16 = 2;
                } else {
                    i7 = i18;
                    charSequence5 = charSequence4;
                    f10 = -2.0f;
                    i16 = 2;
                    pl0 pl0Var = new pl0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                    this.M = pl0Var;
                    org.telegram.ui.ActionBar.u6.R(pl0Var, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                    this.G.addView(this.M, c8.na.o(-1, -2));
                    final int i29 = 19;
                    this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j10 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j10;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.v3.V(this.x0) || org.telegram.messenger.v3.Y(this.x0)) {
                    context3 = context;
                    frameLayout = frameLayout2;
                    rnVar3 = this;
                    charSequence = charSequence5;
                    um0Var = um0Var3;
                    f11 = f10;
                    i24 = i16;
                } else {
                    long j10 = -this.x0.id;
                    um0Var = um0Var3;
                    org.telegram.ui.Cells.m8 m8Var11 = new org.telegram.ui.Cells.m8(23, context, this.resourceProvider, false, true);
                    context3 = context;
                    this.N = m8Var11;
                    org.telegram.ui.ActionBar.u6.R(m8Var11, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                    this.N.n(R.drawable.msg_translate, org.telegram.messenger.gd.M0(2131752446), this.x0.autotranslation);
                    final int i30 = 0;
                    getMessagesController().I0().a(j10, new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.jn
                        public final /* synthetic */ rn b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj) {
                            int i31 = i30;
                            rn rnVar4 = this.b;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            switch (i31) {
                                case 0:
                                    if (tL_premium_boostsStatus == null) {
                                        rnVar4.getClass();
                                        break;
                                    } else {
                                        rnVar4.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar4.getMessagesController().D4 ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                default:
                                    rnVar4.M0 = tL_premium_boostsStatus;
                                    break;
                            }
                        }
                    });
                    this.G.addView(this.N, c8.na.o(-1, -2));
                    i24 = i16;
                    charSequence = charSequence5;
                    f11 = f10;
                    frameLayout = frameLayout2;
                    rnVar3 = this;
                    this.N.setOnClickListener(new di.d3(this, new boolean[]{false}, j10, 1));
                }
                if (!rnVar3.J0 && org.telegram.messenger.v3.w(i24, rnVar3.x0) && (org.telegram.messenger.v3.T(rnVar3.x0) || rnVar3.x0.creator)) {
                    org.telegram.ui.Cells.m8 m8Var12 = new org.telegram.ui.Cells.m8(context3);
                    rnVar3.O = m8Var12;
                    org.telegram.ui.ActionBar.u6.R(m8Var12, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                    rnVar3.G.addView(rnVar3.O, c8.na.o(-1, -2));
                    rnVar3.O.setOnClickListener(new oi.i1(16, rnVar3, context3));
                }
                if (org.telegram.messenger.v3.n0(rnVar3.x0) || !org.telegram.messenger.v3.N(rnVar3.x0) || org.telegram.messenger.v3.Y(rnVar3.x0)) {
                    rnVar = rnVar3;
                } else {
                    final int i31 = 1;
                    org.telegram.messenger.mp.u1(rnVar3.currentAccount).I0().a(-rnVar3.x0.id, new org.telegram.messenger.w10(rnVar3) { // from class: org.telegram.ui.jn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar3;
                        }

                        @Override // org.telegram.messenger.w10
                        public final void a(Object obj) {
                            int i312 = i31;
                            rn rnVar4 = this.b;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            switch (i312) {
                                case 0:
                                    if (tL_premium_boostsStatus == null) {
                                        rnVar4.getClass();
                                        break;
                                    } else {
                                        rnVar4.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < rnVar4.getMessagesController().D4 ? R.drawable.permission_locked : 0);
                                        break;
                                    }
                                default:
                                    rnVar4.M0 = tL_premium_boostsStatus;
                                    break;
                            }
                        }
                    });
                    Context context4 = context3;
                    rnVar = rnVar3;
                    pl0 pl0Var2 = new pl0(rnVar3.currentAccount, -rnVar3.x0.id, context4, rnVar3.getResourceProvider());
                    rnVar.M = pl0Var2;
                    org.telegram.ui.ActionBar.u6.R(pl0Var2, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                    rnVar.G.addView(rnVar.M, c8.na.o(-1, -2));
                    final int i32 = 20;
                    rnVar.M.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                }
                if (!rnVar.J0 && rnVar.x0.creator) {
                    org.telegram.ui.Cells.m8 m8Var13 = new org.telegram.ui.Cells.m8(23, context, null, false, true);
                    context2 = context;
                    rnVar.R = m8Var13;
                    org.telegram.ui.ActionBar.u6.R(m8Var13, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                    rnVar.R.n(R.drawable.msg_topics, org.telegram.messenger.gd.M0(2131752269), rnVar.F0);
                    rnVar.R.getCheckBox().setIcon(!rnVar.G0 ? 0 : R.drawable.permission_locked);
                    rnVar.G.addView(rnVar.R, c8.na.c(f11, -1));
                    rnVar.R.setOnClickListener(new oi.i1(17, rnVar, frameLayout));
                } else {
                    context2 = context;
                }
                rnVar.t0();
            }
            charSequence4 = "";
            if (org.telegram.messenger.v3.V(this.x0)) {
                org.telegram.ui.Cells.m8 m8Var102 = new org.telegram.ui.Cells.m8(context);
                this.L = m8Var102;
                org.telegram.ui.ActionBar.u6.R(m8Var102, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i18), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                this.L.s(org.telegram.messenger.gd.M0(2131746902), charSequence4, R.drawable.msg_markunread, true);
                this.G.addView(this.L, c8.na.o(-1, -2));
                final int i282 = 18;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.fn
                    public final /* synthetic */ rn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i282) {
                            case 0:
                                rn rnVar4 = this.b;
                                rnVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", rnVar4.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                rq rqVar = new rq(bundle);
                                rqVar.C0(rnVar4.y0);
                                rnVar4.presentFragment(rqVar);
                                break;
                            case 1:
                                rn rnVar5 = this.b;
                                pn pnVar = rnVar5.R0;
                                long j32 = rnVar5.C0;
                                if (!rnVar5.s.g()) {
                                    org.telegram.messenger.fc fcVar = null;
                                    TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                    if (c22 == null) {
                                        TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                        TLRPC.ChatPhoto chatPhoto = O0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                            int i212 = chatPhoto2.dc_id;
                                            if (i212 != 0) {
                                                chatPhoto2.photo_big.dc_id = i212;
                                            }
                                            TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.p1().J2(null, rnVar5, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                            int i222 = userProfilePhoto2.dc_id;
                                            if (i222 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i222;
                                            }
                                            PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                rn rnVar6 = this.b;
                                rnVar6.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", rnVar6.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                rq rqVar2 = new rq(bundle2);
                                rqVar2.C0(rnVar6.y0);
                                rnVar6.presentFragment(rqVar2);
                                break;
                            case 3:
                                rn rnVar7 = this.b;
                                rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                break;
                            case 4:
                                rn rnVar8 = this.b;
                                rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                break;
                            case 5:
                                rn rnVar9 = this.b;
                                rnVar9.getClass();
                                rnVar9.presentFragment(new lb(rnVar9.x0));
                                break;
                            case 6:
                                rn rnVar10 = this.b;
                                rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                break;
                            case 7:
                                rn rnVar11 = this.b;
                                rnVar11.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", rnVar11.C0);
                                rnVar11.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                rn rnVar12 = this.b;
                                rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                break;
                            case 9:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                rn.c0(this.b);
                                break;
                            case 14:
                                rn rnVar13 = this.b;
                                org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                break;
                            case 15:
                                rn rnVar14 = this.b;
                                if (org.telegram.messenger.g0.J1(rnVar14)) {
                                    pa0 pa0Var = new pa0(4);
                                    pa0Var.m0 = -rnVar14.w0;
                                    TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pa0Var.M0 = new ln(rnVar14, 6);
                                    rnVar14.presentFragment(pa0Var);
                                    break;
                                }
                                break;
                            case 16:
                                rn rnVar15 = this.b;
                                long j102 = rnVar15.w0;
                                org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                io ioVar = new io(null);
                                ioVar.N = new ArrayList();
                                ioVar.O = new ArrayList();
                                ioVar.Q = new ArrayList();
                                ioVar.d0 = true;
                                ioVar.g0 = new ArrayList();
                                ioVar.p0 = new HashMap();
                                ioVar.r0 = new tn(ioVar, 5);
                                ioVar.t0 = false;
                                ioVar.a0 = j102;
                                ioVar.o0 = z152;
                                TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                ioVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        ioVar.m0 = tL_chatInviteExported;
                                    } else {
                                        ioVar.d0(false);
                                    }
                                }
                                rnVar15.presentFragment(ioVar);
                                break;
                            case 17:
                                rn rnVar16 = this.b;
                                long j11 = rnVar16.w0;
                                uo uoVar = new uo(null);
                                uoVar.w = new ArrayList();
                                boolean z162 = false;
                                uoVar.P = false;
                                uoVar.Q = false;
                                uoVar.F = j11;
                                TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                uoVar.f = O02;
                                if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                    z162 = true;
                                }
                                uoVar.s = z162;
                                uoVar.h = rnVar16.y0;
                                rnVar16.presentFragment(uoVar);
                                break;
                            case 18:
                                rn rnVar17 = this.b;
                                hs0 hs0Var = new hs0(rnVar17.w0);
                                hs0Var.s = new ln(rnVar17, 4);
                                rnVar17.presentFragment(hs0Var);
                                break;
                            case 19:
                                rn.e0(this.b);
                                break;
                            case 20:
                                rn rnVar18 = this.b;
                                l40 l40Var = new l40(-rnVar18.x0.id);
                                l40Var.c = rnVar18.M0;
                                l40Var.m0 = rnVar18;
                                rnVar18.presentFragment(l40Var);
                                break;
                            case 21:
                                rn rnVar19 = this.b;
                                rnVar19.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", rnVar19.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                rq rqVar3 = new rq(bundle4);
                                rqVar3.C0(rnVar19.y0);
                                rnVar19.presentFragment(rqVar3);
                                break;
                            case 22:
                                rn rnVar20 = this.b;
                                ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                rnVar20.presentFragment(ef0Var);
                                break;
                            case 23:
                                rn rnVar21 = this.b;
                                if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                    rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", rnVar21.w0);
                                    bp bpVar = new bp(bundle5);
                                    TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                    bpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (bpVar.a == null) {
                                            bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                        }
                                        bpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            bpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            bpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                    bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                }
                                            }
                                            bpVar.w = 1;
                                        }
                                    }
                                    rnVar21.presentFragment(bpVar);
                                    break;
                                }
                            default:
                                rn rnVar22 = this.b;
                                rnVar22.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", rnVar22.w0);
                                bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                rnVar22.presentFragment(new bn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.v3.V(this.x0)) {
            }
            i7 = i18;
            charSequence5 = charSequence4;
            f10 = -2.0f;
            i16 = 2;
            if (org.telegram.messenger.v3.V(this.x0)) {
            }
            context3 = context;
            frameLayout = frameLayout2;
            rnVar3 = this;
            charSequence = charSequence5;
            um0Var = um0Var3;
            f11 = f10;
            i24 = i16;
            if (!rnVar3.J0) {
                org.telegram.ui.Cells.m8 m8Var122 = new org.telegram.ui.Cells.m8(context3);
                rnVar3.O = m8Var122;
                org.telegram.ui.ActionBar.u6.R(m8Var122, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                rnVar3.G.addView(rnVar3.O, c8.na.o(-1, -2));
                rnVar3.O.setOnClickListener(new oi.i1(16, rnVar3, context3));
            }
            if (org.telegram.messenger.v3.n0(rnVar3.x0)) {
            }
            rnVar = rnVar3;
            if (rnVar.J0) {
                org.telegram.ui.Cells.m8 m8Var132 = new org.telegram.ui.Cells.m8(23, context, null, false, true);
                context2 = context;
                rnVar.R = m8Var132;
                org.telegram.ui.ActionBar.u6.R(m8Var132, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(i7), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                rnVar.R.n(R.drawable.msg_topics, org.telegram.messenger.gd.M0(2131752269), rnVar.F0);
                rnVar.R.getCheckBox().setIcon(!rnVar.G0 ? 0 : R.drawable.permission_locked);
                rnVar.G.addView(rnVar.R, c8.na.c(f11, -1));
                rnVar.R.setOnClickListener(new oi.i1(17, rnVar, frameLayout));
                rnVar.t0();
            }
            context2 = context;
            rnVar.t0();
        } else {
            rnVar = this;
            i7 = i18;
            charSequence = "";
            um0Var = um0Var3;
            context2 = context;
        }
        rnVar.simpleActionBar.t();
        if (rnVar.D0 != null || org.telegram.messenger.v3.d(rnVar.x0) || rnVar.O != null) {
            rnVar.a = rnVar.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745750));
        }
        if (rnVar.I == null && rnVar.O == null && rnVar.J == null && rnVar.K == null && rnVar.R == null) {
            um0Var2 = um0Var;
            i10 = -2;
            i11 = -1;
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context2, rnVar.resourceProvider);
            rnVar.Q = z8Var;
            if (rnVar.R != null) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131750571));
            } else {
                z8Var.setFixedSize(12);
            }
            i10 = -2;
            i11 = -1;
            um0Var2 = um0Var;
            um0Var2.addView(rnVar.Q, c8.na.o(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        rnVar.S = linearLayout5;
        linearLayout5.setOrientation(1);
        um0Var2.addView(rnVar.S, c8.na.o(i11, i10));
        if (rnVar.x0 != null) {
            org.telegram.ui.Cells.m8 m8Var14 = new org.telegram.ui.Cells.m8(context2);
            rnVar.Y = m8Var14;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(false);
            int i33 = org.telegram.ui.ActionBar.n6.i6;
            q6Var = null;
            org.telegram.ui.ActionBar.u6.R(m8Var14, N0, null, org.telegram.ui.ActionBar.u6.M(i33));
            org.telegram.ui.Cells.m8 m8Var15 = rnVar.Y;
            if (!org.telegram.messenger.v3.T(rnVar.x0)) {
                TLRPC.Chat chat3 = rnVar.x0;
                if (!chat3.creator && (!org.telegram.messenger.v3.N(chat3) || !org.telegram.messenger.v3.d(rnVar.x0))) {
                    i13 = 8;
                    m8Var15.setVisibility(i13);
                    final int i34 = 21;
                    rnVar.Y.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var16 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.W = m8Var16;
                    org.telegram.ui.ActionBar.u6.R(m8Var16, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                    final int i35 = 22;
                    rnVar.W.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i35) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var17 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.P = m8Var17;
                    org.telegram.ui.ActionBar.u6.R(m8Var17, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                    final int i36 = 23;
                    rnVar.P.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (org.telegram.messenger.v3.y(28, rnVar.x0)) {
                        org.telegram.ui.Cells.m8 m8Var18 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.f0 = m8Var18;
                        org.telegram.ui.ActionBar.u6.R(m8Var18, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                        final int i37 = 24;
                        rnVar.f0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i37) {
                                    case 0:
                                        rn rnVar4 = this.b;
                                        rnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar4.y0);
                                        rnVar4.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar5 = this.b;
                                        pn pnVar = rnVar5.R0;
                                        long j32 = rnVar5.C0;
                                        if (!rnVar5.s.g()) {
                                            org.telegram.messenger.fc fcVar = null;
                                            TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                            if (c22 == null) {
                                                TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                                TLRPC.ChatPhoto chatPhoto = O0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                    int i212 = chatPhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i212;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                    int i222 = userProfilePhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i222;
                                                    }
                                                    PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar6 = this.b;
                                        rnVar6.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar6.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar6.y0);
                                        rnVar6.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                        break;
                                    case 4:
                                        rn rnVar8 = this.b;
                                        rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                        break;
                                    case 5:
                                        rn rnVar9 = this.b;
                                        rnVar9.getClass();
                                        rnVar9.presentFragment(new lb(rnVar9.x0));
                                        break;
                                    case 6:
                                        rn rnVar10 = this.b;
                                        rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                        break;
                                    case 7:
                                        rn rnVar11 = this.b;
                                        rnVar11.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar11.C0);
                                        rnVar11.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar12 = this.b;
                                        rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar13 = this.b;
                                        org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                        break;
                                    case 15:
                                        rn rnVar14 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar14)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -rnVar14.w0;
                                            TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.M0 = new ln(rnVar14, 6);
                                            rnVar14.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar15 = this.b;
                                        long j102 = rnVar15.w0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.N = new ArrayList();
                                        ioVar.O = new ArrayList();
                                        ioVar.Q = new ArrayList();
                                        ioVar.d0 = true;
                                        ioVar.g0 = new ArrayList();
                                        ioVar.p0 = new HashMap();
                                        ioVar.r0 = new tn(ioVar, 5);
                                        ioVar.t0 = false;
                                        ioVar.a0 = j102;
                                        ioVar.o0 = z152;
                                        TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                        ioVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.m0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar15.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar16 = this.b;
                                        long j11 = rnVar16.w0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.P = false;
                                        uoVar.Q = false;
                                        uoVar.F = j11;
                                        TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                        uoVar.f = O02;
                                        if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar16.y0;
                                        rnVar16.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar17 = this.b;
                                        hs0 hs0Var = new hs0(rnVar17.w0);
                                        hs0Var.s = new ln(rnVar17, 4);
                                        rnVar17.presentFragment(hs0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar18 = this.b;
                                        l40 l40Var = new l40(-rnVar18.x0.id);
                                        l40Var.c = rnVar18.M0;
                                        l40Var.m0 = rnVar18;
                                        rnVar18.presentFragment(l40Var);
                                        break;
                                    case 21:
                                        rn rnVar19 = this.b;
                                        rnVar19.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar19.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar19.y0);
                                        rnVar19.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar20 = this.b;
                                        ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                        ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                        rnVar20.presentFragment(ef0Var);
                                        break;
                                    case 23:
                                        rn rnVar21 = this.b;
                                        if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                            rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar21.w0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                            bpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                        if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar21.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar22 = this.b;
                                        rnVar22.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar22.w0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                        rnVar22.presentFragment(new bn(bundle6));
                                        break;
                                }
                            }
                        });
                        rnVar.k0();
                    }
                    org.telegram.ui.Cells.m8 m8Var19 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.X = m8Var19;
                    final int i38 = 0;
                    org.telegram.ui.ActionBar.u6.R(m8Var19, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                    rnVar.X.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i38) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var20 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.U = m8Var20;
                    org.telegram.ui.ActionBar.u6.R(m8Var20, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                    rnVar.U.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!org.telegram.messenger.v3.V(rnVar.x0)) {
                        org.telegram.ui.Cells.m8 m8Var21 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.V = m8Var21;
                        org.telegram.ui.ActionBar.u6.R(m8Var21, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                        final int i39 = 3;
                        rnVar.V.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i39) {
                                    case 0:
                                        rn rnVar4 = this.b;
                                        rnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar4.y0);
                                        rnVar4.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar5 = this.b;
                                        pn pnVar = rnVar5.R0;
                                        long j32 = rnVar5.C0;
                                        if (!rnVar5.s.g()) {
                                            org.telegram.messenger.fc fcVar = null;
                                            TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                            if (c22 == null) {
                                                TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                                TLRPC.ChatPhoto chatPhoto = O0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                    int i212 = chatPhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i212;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                    int i222 = userProfilePhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i222;
                                                    }
                                                    PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar6 = this.b;
                                        rnVar6.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar6.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar6.y0);
                                        rnVar6.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                        break;
                                    case 4:
                                        rn rnVar8 = this.b;
                                        rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                        break;
                                    case 5:
                                        rn rnVar9 = this.b;
                                        rnVar9.getClass();
                                        rnVar9.presentFragment(new lb(rnVar9.x0));
                                        break;
                                    case 6:
                                        rn rnVar10 = this.b;
                                        rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                        break;
                                    case 7:
                                        rn rnVar11 = this.b;
                                        rnVar11.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar11.C0);
                                        rnVar11.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar12 = this.b;
                                        rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar13 = this.b;
                                        org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                        break;
                                    case 15:
                                        rn rnVar14 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar14)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -rnVar14.w0;
                                            TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.M0 = new ln(rnVar14, 6);
                                            rnVar14.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar15 = this.b;
                                        long j102 = rnVar15.w0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.N = new ArrayList();
                                        ioVar.O = new ArrayList();
                                        ioVar.Q = new ArrayList();
                                        ioVar.d0 = true;
                                        ioVar.g0 = new ArrayList();
                                        ioVar.p0 = new HashMap();
                                        ioVar.r0 = new tn(ioVar, 5);
                                        ioVar.t0 = false;
                                        ioVar.a0 = j102;
                                        ioVar.o0 = z152;
                                        TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                        ioVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.m0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar15.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar16 = this.b;
                                        long j11 = rnVar16.w0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.P = false;
                                        uoVar.Q = false;
                                        uoVar.F = j11;
                                        TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                        uoVar.f = O02;
                                        if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar16.y0;
                                        rnVar16.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar17 = this.b;
                                        hs0 hs0Var = new hs0(rnVar17.w0);
                                        hs0Var.s = new ln(rnVar17, 4);
                                        rnVar17.presentFragment(hs0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar18 = this.b;
                                        l40 l40Var = new l40(-rnVar18.x0.id);
                                        l40Var.c = rnVar18.M0;
                                        l40Var.m0 = rnVar18;
                                        rnVar18.presentFragment(l40Var);
                                        break;
                                    case 21:
                                        rn rnVar19 = this.b;
                                        rnVar19.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar19.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar19.y0);
                                        rnVar19.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar20 = this.b;
                                        ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                        ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                        rnVar20.presentFragment(ef0Var);
                                        break;
                                    case 23:
                                        rn rnVar21 = this.b;
                                        if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                            rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar21.w0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                            bpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                        if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar21.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar22 = this.b;
                                        rnVar22.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar22.w0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                        rnVar22.presentFragment(new bn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.m8 m8Var22 = new org.telegram.ui.Cells.m8(context2);
                    rnVar.a0 = m8Var22;
                    m8Var22.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.gd.M0(2131752459)), false);
                    org.telegram.ui.ActionBar.u6.R(rnVar.a0, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                    final int i40 = 4;
                    rnVar.a0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                        public final /* synthetic */ rn b;

                        {
                            this.b = rnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i40) {
                                case 0:
                                    rn rnVar4 = this.b;
                                    rnVar4.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", rnVar4.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    rq rqVar = new rq(bundle);
                                    rqVar.C0(rnVar4.y0);
                                    rnVar4.presentFragment(rqVar);
                                    break;
                                case 1:
                                    rn rnVar5 = this.b;
                                    pn pnVar = rnVar5.R0;
                                    long j32 = rnVar5.C0;
                                    if (!rnVar5.s.g()) {
                                        org.telegram.messenger.fc fcVar = null;
                                        TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                        if (c22 == null) {
                                            TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                            TLRPC.ChatPhoto chatPhoto = O0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                int i212 = chatPhoto2.dc_id;
                                                if (i212 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i212;
                                                }
                                                TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.p1().J2(null, rnVar5, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                int i222 = userProfilePhoto2.dc_id;
                                                if (i222 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i222;
                                                }
                                                PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    rn rnVar6 = this.b;
                                    rnVar6.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", rnVar6.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    rq rqVar2 = new rq(bundle2);
                                    rqVar2.C0(rnVar6.y0);
                                    rnVar6.presentFragment(rqVar2);
                                    break;
                                case 3:
                                    rn rnVar7 = this.b;
                                    rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                    break;
                                case 4:
                                    rn rnVar8 = this.b;
                                    rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                    break;
                                case 5:
                                    rn rnVar9 = this.b;
                                    rnVar9.getClass();
                                    rnVar9.presentFragment(new lb(rnVar9.x0));
                                    break;
                                case 6:
                                    rn rnVar10 = this.b;
                                    rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                    break;
                                case 7:
                                    rn rnVar11 = this.b;
                                    rnVar11.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", rnVar11.C0);
                                    rnVar11.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    rn rnVar12 = this.b;
                                    rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                    break;
                                case 9:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    rn.c0(this.b);
                                    break;
                                case 14:
                                    rn rnVar13 = this.b;
                                    org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                    break;
                                case 15:
                                    rn rnVar14 = this.b;
                                    if (org.telegram.messenger.g0.J1(rnVar14)) {
                                        pa0 pa0Var = new pa0(4);
                                        pa0Var.m0 = -rnVar14.w0;
                                        TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pa0Var.M0 = new ln(rnVar14, 6);
                                        rnVar14.presentFragment(pa0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    rn rnVar15 = this.b;
                                    long j102 = rnVar15.w0;
                                    org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                    boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    io ioVar = new io(null);
                                    ioVar.N = new ArrayList();
                                    ioVar.O = new ArrayList();
                                    ioVar.Q = new ArrayList();
                                    ioVar.d0 = true;
                                    ioVar.g0 = new ArrayList();
                                    ioVar.p0 = new HashMap();
                                    ioVar.r0 = new tn(ioVar, 5);
                                    ioVar.t0 = false;
                                    ioVar.a0 = j102;
                                    ioVar.o0 = z152;
                                    TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                    ioVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            ioVar.m0 = tL_chatInviteExported;
                                        } else {
                                            ioVar.d0(false);
                                        }
                                    }
                                    rnVar15.presentFragment(ioVar);
                                    break;
                                case 17:
                                    rn rnVar16 = this.b;
                                    long j11 = rnVar16.w0;
                                    uo uoVar = new uo(null);
                                    uoVar.w = new ArrayList();
                                    boolean z162 = false;
                                    uoVar.P = false;
                                    uoVar.Q = false;
                                    uoVar.F = j11;
                                    TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                    uoVar.f = O02;
                                    if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    uoVar.s = z162;
                                    uoVar.h = rnVar16.y0;
                                    rnVar16.presentFragment(uoVar);
                                    break;
                                case 18:
                                    rn rnVar17 = this.b;
                                    hs0 hs0Var = new hs0(rnVar17.w0);
                                    hs0Var.s = new ln(rnVar17, 4);
                                    rnVar17.presentFragment(hs0Var);
                                    break;
                                case 19:
                                    rn.e0(this.b);
                                    break;
                                case 20:
                                    rn rnVar18 = this.b;
                                    l40 l40Var = new l40(-rnVar18.x0.id);
                                    l40Var.c = rnVar18.M0;
                                    l40Var.m0 = rnVar18;
                                    rnVar18.presentFragment(l40Var);
                                    break;
                                case 21:
                                    rn rnVar19 = this.b;
                                    rnVar19.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", rnVar19.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                    rq rqVar3 = new rq(bundle4);
                                    rqVar3.C0(rnVar19.y0);
                                    rnVar19.presentFragment(rqVar3);
                                    break;
                                case 22:
                                    rn rnVar20 = this.b;
                                    ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                    ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                    rnVar20.presentFragment(ef0Var);
                                    break;
                                case 23:
                                    rn rnVar21 = this.b;
                                    if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                        rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", rnVar21.w0);
                                        bp bpVar = new bp(bundle5);
                                        TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                        bpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (bpVar.a == null) {
                                                bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                            }
                                            bpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                bpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                bpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                    if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                        bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                    }
                                                }
                                                bpVar.w = 1;
                                            }
                                        }
                                        rnVar21.presentFragment(bpVar);
                                        break;
                                    }
                                default:
                                    rn rnVar22 = this.b;
                                    rnVar22.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", rnVar22.w0);
                                    bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                    rnVar22.presentFragment(new bn(bundle6));
                                    break;
                            }
                        }
                    });
                    rnVar.a0.setVisibility(8);
                    if (!org.telegram.messenger.v3.T(rnVar.x0) || rnVar.x0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var23 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.Z = m8Var23;
                        m8Var23.o(R.drawable.msg_log, org.telegram.messenger.gd.M0(2131751067), false);
                        org.telegram.ui.ActionBar.u6.R(rnVar.Z, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                        final int i41 = 5;
                        rnVar.Z.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i41) {
                                    case 0:
                                        rn rnVar4 = this.b;
                                        rnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar4.y0);
                                        rnVar4.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar5 = this.b;
                                        pn pnVar = rnVar5.R0;
                                        long j32 = rnVar5.C0;
                                        if (!rnVar5.s.g()) {
                                            org.telegram.messenger.fc fcVar = null;
                                            TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                            if (c22 == null) {
                                                TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                                TLRPC.ChatPhoto chatPhoto = O0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                    int i212 = chatPhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i212;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                    int i222 = userProfilePhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i222;
                                                    }
                                                    PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar6 = this.b;
                                        rnVar6.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar6.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar6.y0);
                                        rnVar6.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                        break;
                                    case 4:
                                        rn rnVar8 = this.b;
                                        rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                        break;
                                    case 5:
                                        rn rnVar9 = this.b;
                                        rnVar9.getClass();
                                        rnVar9.presentFragment(new lb(rnVar9.x0));
                                        break;
                                    case 6:
                                        rn rnVar10 = this.b;
                                        rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                        break;
                                    case 7:
                                        rn rnVar11 = this.b;
                                        rnVar11.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar11.C0);
                                        rnVar11.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar12 = this.b;
                                        rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar13 = this.b;
                                        org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                        break;
                                    case 15:
                                        rn rnVar14 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar14)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -rnVar14.w0;
                                            TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.M0 = new ln(rnVar14, 6);
                                            rnVar14.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar15 = this.b;
                                        long j102 = rnVar15.w0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.N = new ArrayList();
                                        ioVar.O = new ArrayList();
                                        ioVar.Q = new ArrayList();
                                        ioVar.d0 = true;
                                        ioVar.g0 = new ArrayList();
                                        ioVar.p0 = new HashMap();
                                        ioVar.r0 = new tn(ioVar, 5);
                                        ioVar.t0 = false;
                                        ioVar.a0 = j102;
                                        ioVar.o0 = z152;
                                        TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                        ioVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.m0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar15.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar16 = this.b;
                                        long j11 = rnVar16.w0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.P = false;
                                        uoVar.Q = false;
                                        uoVar.F = j11;
                                        TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                        uoVar.f = O02;
                                        if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar16.y0;
                                        rnVar16.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar17 = this.b;
                                        hs0 hs0Var = new hs0(rnVar17.w0);
                                        hs0Var.s = new ln(rnVar17, 4);
                                        rnVar17.presentFragment(hs0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar18 = this.b;
                                        l40 l40Var = new l40(-rnVar18.x0.id);
                                        l40Var.c = rnVar18.M0;
                                        l40Var.m0 = rnVar18;
                                        rnVar18.presentFragment(l40Var);
                                        break;
                                    case 21:
                                        rn rnVar19 = this.b;
                                        rnVar19.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar19.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar19.y0);
                                        rnVar19.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar20 = this.b;
                                        ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                        ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                        rnVar20.presentFragment(ef0Var);
                                        break;
                                    case 23:
                                        rn rnVar21 = this.b;
                                        if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                            rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar21.w0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                            bpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                        if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar21.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar22 = this.b;
                                        rnVar22.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar22.w0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                        rnVar22.presentFragment(new bn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (org.telegram.messenger.v3.R(rnVar.x0)) {
                        org.telegram.ui.Cells.m8 m8Var24 = new org.telegram.ui.Cells.m8(context2);
                        rnVar.b0 = m8Var24;
                        m8Var24.o(R.drawable.msg_stats, org.telegram.messenger.gd.M0(2131744650), true);
                        org.telegram.ui.ActionBar.u6.R(rnVar.b0, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
                        final int i42 = 6;
                        rnVar.b0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                            public final /* synthetic */ rn b;

                            {
                                this.b = rnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i42) {
                                    case 0:
                                        rn rnVar4 = this.b;
                                        rnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", rnVar4.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        rq rqVar = new rq(bundle);
                                        rqVar.C0(rnVar4.y0);
                                        rnVar4.presentFragment(rqVar);
                                        break;
                                    case 1:
                                        rn rnVar5 = this.b;
                                        pn pnVar = rnVar5.R0;
                                        long j32 = rnVar5.C0;
                                        if (!rnVar5.s.g()) {
                                            org.telegram.messenger.fc fcVar = null;
                                            TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                            if (c22 == null) {
                                                TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                                TLRPC.ChatPhoto chatPhoto = O0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                                    int i212 = chatPhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i212;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.p1().J2(null, rnVar5, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                                    int i222 = userProfilePhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i222;
                                                    }
                                                    PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        rn rnVar6 = this.b;
                                        rnVar6.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", rnVar6.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        rq rqVar2 = new rq(bundle2);
                                        rqVar2.C0(rnVar6.y0);
                                        rnVar6.presentFragment(rqVar2);
                                        break;
                                    case 3:
                                        rn rnVar7 = this.b;
                                        rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                                        break;
                                    case 4:
                                        rn rnVar8 = this.b;
                                        rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                                        break;
                                    case 5:
                                        rn rnVar9 = this.b;
                                        rnVar9.getClass();
                                        rnVar9.presentFragment(new lb(rnVar9.x0));
                                        break;
                                    case 6:
                                        rn rnVar10 = this.b;
                                        rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                                        break;
                                    case 7:
                                        rn rnVar11 = this.b;
                                        rnVar11.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", rnVar11.C0);
                                        rnVar11.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        rn rnVar12 = this.b;
                                        rnVar12.presentFragment(new ki.j(rnVar12.C0));
                                        break;
                                    case 9:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        rn.c0(this.b);
                                        break;
                                    case 14:
                                        rn rnVar13 = this.b;
                                        org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                                        break;
                                    case 15:
                                        rn rnVar14 = this.b;
                                        if (org.telegram.messenger.g0.J1(rnVar14)) {
                                            pa0 pa0Var = new pa0(4);
                                            pa0Var.m0 = -rnVar14.w0;
                                            TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pa0Var.M0 = new ln(rnVar14, 6);
                                            rnVar14.presentFragment(pa0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        rn rnVar15 = this.b;
                                        long j102 = rnVar15.w0;
                                        org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                                        boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        io ioVar = new io(null);
                                        ioVar.N = new ArrayList();
                                        ioVar.O = new ArrayList();
                                        ioVar.Q = new ArrayList();
                                        ioVar.d0 = true;
                                        ioVar.g0 = new ArrayList();
                                        ioVar.p0 = new HashMap();
                                        ioVar.r0 = new tn(ioVar, 5);
                                        ioVar.t0 = false;
                                        ioVar.a0 = j102;
                                        ioVar.o0 = z152;
                                        TLRPC.ChatFull chatFull6 = rnVar15.y0;
                                        ioVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                ioVar.m0 = tL_chatInviteExported;
                                            } else {
                                                ioVar.d0(false);
                                            }
                                        }
                                        rnVar15.presentFragment(ioVar);
                                        break;
                                    case 17:
                                        rn rnVar16 = this.b;
                                        long j11 = rnVar16.w0;
                                        uo uoVar = new uo(null);
                                        uoVar.w = new ArrayList();
                                        boolean z162 = false;
                                        uoVar.P = false;
                                        uoVar.Q = false;
                                        uoVar.F = j11;
                                        TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                                        uoVar.f = O02;
                                        if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        uoVar.s = z162;
                                        uoVar.h = rnVar16.y0;
                                        rnVar16.presentFragment(uoVar);
                                        break;
                                    case 18:
                                        rn rnVar17 = this.b;
                                        hs0 hs0Var = new hs0(rnVar17.w0);
                                        hs0Var.s = new ln(rnVar17, 4);
                                        rnVar17.presentFragment(hs0Var);
                                        break;
                                    case 19:
                                        rn.e0(this.b);
                                        break;
                                    case 20:
                                        rn rnVar18 = this.b;
                                        l40 l40Var = new l40(-rnVar18.x0.id);
                                        l40Var.c = rnVar18.M0;
                                        l40Var.m0 = rnVar18;
                                        rnVar18.presentFragment(l40Var);
                                        break;
                                    case 21:
                                        rn rnVar19 = this.b;
                                        rnVar19.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", rnVar19.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                                        rq rqVar3 = new rq(bundle4);
                                        rqVar3.C0(rnVar19.y0);
                                        rnVar19.presentFragment(rqVar3);
                                        break;
                                    case 22:
                                        rn rnVar20 = this.b;
                                        ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull7 = rnVar20.y0;
                                        ef0Var.m0(chatFull7, chatFull7.exported_invite);
                                        rnVar20.presentFragment(ef0Var);
                                        break;
                                    case 23:
                                        rn rnVar21 = this.b;
                                        if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                            rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", rnVar21.w0);
                                            bp bpVar = new bp(bundle5);
                                            TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                            bpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (bpVar.a == null) {
                                                    bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                                }
                                                bpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    bpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    bpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                                        if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                            bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                                        }
                                                    }
                                                    bpVar.w = 1;
                                                }
                                            }
                                            rnVar21.presentFragment(bpVar);
                                            break;
                                        }
                                    default:
                                        rn rnVar22 = this.b;
                                        rnVar22.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", rnVar22.w0);
                                        bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                                        rnVar22.presentFragment(new bn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    rnVar.S.addView(rnVar.P, c8.na.o(-1, -2));
                    m8Var = rnVar.f0;
                    if (m8Var != null) {
                        rnVar.S.addView(m8Var, c8.na.o(-1, -2));
                    }
                    if (!rnVar.J0 && !rnVar.x0.gigagroup) {
                        rnVar.S.addView(rnVar.Y, c8.na.o(-1, -2));
                    }
                    if (!rnVar.J0) {
                        rnVar.S.addView(rnVar.W, c8.na.o(-1, -2));
                    }
                    rnVar.S.addView(rnVar.X, c8.na.o(-1, -2));
                    rnVar.S.addView(rnVar.U, c8.na.o(-1, -2));
                    m8Var2 = rnVar.V;
                    if (m8Var2 != null && (chatFull = rnVar.y0) != null && chatFull.requests_pending > 0) {
                        rnVar.S.addView(m8Var2, c8.na.o(-1, -2));
                    }
                    if (rnVar.J0) {
                        rnVar.S.addView(rnVar.W, c8.na.o(-1, -2));
                    }
                    if (!rnVar.J0 || rnVar.x0.gigagroup) {
                        i14 = -2;
                        i15 = -1;
                        rnVar.S.addView(rnVar.Y, c8.na.o(-1, -2));
                    } else {
                        i14 = -2;
                        i15 = -1;
                    }
                    m8Var3 = rnVar.b0;
                    if (m8Var3 != null) {
                        rnVar.S.addView(m8Var3, c8.na.o(i15, i14));
                    }
                    m8Var4 = rnVar.Z;
                    if (m8Var4 != null) {
                        rnVar.S.addView(m8Var4, c8.na.o(i15, i14));
                    }
                    m8Var5 = rnVar.a0;
                    if (m8Var5 != null) {
                        rnVar.S.addView(m8Var5, c8.na.o(i15, i14));
                    }
                    if (rnVar.a0 != null && rnVar.getMessagesController().j6 && org.telegram.messenger.v3.V(rnVar.x0)) {
                        rnVar.a0.setVisibility(0);
                    }
                    m8Var6 = rnVar.Z;
                    if (m8Var6 != null) {
                        org.telegram.ui.Cells.m8 m8Var25 = rnVar.a0;
                        m8Var6.setNeedDivider(m8Var25 != null && m8Var25.getVisibility() == 0);
                    }
                }
            }
            i13 = 0;
            m8Var15.setVisibility(i13);
            final int i342 = 21;
            rnVar.Y.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var162 = new org.telegram.ui.Cells.m8(context2);
            rnVar.W = m8Var162;
            org.telegram.ui.ActionBar.u6.R(m8Var162, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
            final int i352 = 22;
            rnVar.W.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var172 = new org.telegram.ui.Cells.m8(context2);
            rnVar.P = m8Var172;
            org.telegram.ui.ActionBar.u6.R(m8Var172, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
            final int i362 = 23;
            rnVar.P.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.v3.y(28, rnVar.x0)) {
            }
            org.telegram.ui.Cells.m8 m8Var192 = new org.telegram.ui.Cells.m8(context2);
            rnVar.X = m8Var192;
            final int i382 = 0;
            org.telegram.ui.ActionBar.u6.R(m8Var192, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
            rnVar.X.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i382) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var202 = new org.telegram.ui.Cells.m8(context2);
            rnVar.U = m8Var202;
            org.telegram.ui.ActionBar.u6.R(m8Var202, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
            rnVar.U.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i24) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            if (!org.telegram.messenger.v3.V(rnVar.x0)) {
            }
            org.telegram.ui.Cells.m8 m8Var222 = new org.telegram.ui.Cells.m8(context2);
            rnVar.a0 = m8Var222;
            m8Var222.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.gd.M0(2131752459)), false);
            org.telegram.ui.ActionBar.u6.R(rnVar.a0, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
            final int i402 = 4;
            rnVar.a0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i402) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            rnVar.a0.setVisibility(8);
            if (!org.telegram.messenger.v3.T(rnVar.x0)) {
            }
            org.telegram.ui.Cells.m8 m8Var232 = new org.telegram.ui.Cells.m8(context2);
            rnVar.Z = m8Var232;
            m8Var232.o(R.drawable.msg_log, org.telegram.messenger.gd.M0(2131751067), false);
            org.telegram.ui.ActionBar.u6.R(rnVar.Z, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i33));
            final int i412 = 5;
            rnVar.Z.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i412) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.v3.R(rnVar.x0)) {
            }
            rnVar.S.addView(rnVar.P, c8.na.o(-1, -2));
            m8Var = rnVar.f0;
            if (m8Var != null) {
            }
            if (!rnVar.J0) {
                rnVar.S.addView(rnVar.Y, c8.na.o(-1, -2));
            }
            if (!rnVar.J0) {
            }
            rnVar.S.addView(rnVar.X, c8.na.o(-1, -2));
            rnVar.S.addView(rnVar.U, c8.na.o(-1, -2));
            m8Var2 = rnVar.V;
            if (m8Var2 != null) {
                rnVar.S.addView(m8Var2, c8.na.o(-1, -2));
            }
            if (rnVar.J0) {
            }
            if (rnVar.J0) {
            }
            i14 = -2;
            i15 = -1;
            rnVar.S.addView(rnVar.Y, c8.na.o(-1, -2));
            m8Var3 = rnVar.b0;
            if (m8Var3 != null) {
            }
            m8Var4 = rnVar.Z;
            if (m8Var4 != null) {
            }
            m8Var5 = rnVar.a0;
            if (m8Var5 != null) {
            }
            if (rnVar.a0 != null) {
                rnVar.a0.setVisibility(0);
            }
            m8Var6 = rnVar.Z;
            if (m8Var6 != null) {
            }
        } else {
            q6Var = null;
        }
        if (rnVar.D0 != null) {
            org.telegram.ui.Cells.m8 m8Var26 = new org.telegram.ui.Cells.m8(context2);
            rnVar.l0 = m8Var26;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(false);
            int i43 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.ActionBar.u6.R(m8Var26, N02, q6Var, org.telegram.ui.ActionBar.u6.M(i43));
            rnVar.l0.setPrioritizeTitleOverValue(true);
            rnVar.S.addView(rnVar.l0, c8.na.o(-1, -2));
            final int i44 = 7;
            rnVar.l0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            rnVar.w0();
            org.telegram.ui.Cells.m8 m8Var27 = new org.telegram.ui.Cells.m8(context2);
            rnVar.o0 = m8Var27;
            org.telegram.ui.ActionBar.u6.R(m8Var27, org.telegram.ui.ActionBar.n6.N0(false), q6Var, org.telegram.ui.ActionBar.u6.M(i43));
            charSequence2 = charSequence;
            rnVar.o0.s(i0(org.telegram.messenger.gd.M0(2131754343)), charSequence2, R.drawable.msg_shareout, true);
            rnVar.S.addView(rnVar.o0, c8.na.o(-1, -2));
            final int i45 = 8;
            rnVar.o0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            rnVar.o0.h(45, rnVar.E0 == null, false);
            TLRPC.UserFull userFull = rnVar.E0;
            if (userFull != null) {
                org.telegram.ui.Cells.m8 m8Var28 = rnVar.o0;
                if (userFull.starref_program == null) {
                    format = org.telegram.messenger.gd.M0(2131754342);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                m8Var28.w(format, z11);
            }
            if (!rnVar.getMessagesController().i6) {
                rnVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.m8 m8Var29 = new org.telegram.ui.Cells.m8(context2);
            rnVar.p0 = m8Var29;
            org.telegram.ui.ActionBar.u6.R(m8Var29, org.telegram.ui.ActionBar.n6.N0(false), q6Var, org.telegram.ui.ActionBar.u6.M(i43));
            rnVar.p0.o(R.drawable.msg_log, org.telegram.messenger.gd.M0(2131753089), true);
            rnVar.S.addView(rnVar.p0, c8.na.o(-1, -2));
            final int i46 = 9;
            rnVar.p0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i46) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var30 = new org.telegram.ui.Cells.m8(context2);
            rnVar.q0 = m8Var30;
            org.telegram.ui.ActionBar.u6.R(m8Var30, org.telegram.ui.ActionBar.n6.N0(false), q6Var, org.telegram.ui.ActionBar.u6.M(i43));
            rnVar.q0.o(R.drawable.msg_media, org.telegram.messenger.gd.M0(2131753090), true);
            rnVar.S.addView(rnVar.q0, c8.na.o(-1, -2));
            final int i47 = 10;
            rnVar.q0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i47) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var31 = new org.telegram.ui.Cells.m8(context2);
            rnVar.r0 = m8Var31;
            org.telegram.ui.ActionBar.u6.R(m8Var31, org.telegram.ui.ActionBar.n6.N0(false), q6Var, org.telegram.ui.ActionBar.u6.M(i43));
            rnVar.r0.o(R.drawable.msg_bot, org.telegram.messenger.gd.M0(2131753098), true);
            rnVar.S.addView(rnVar.r0, c8.na.o(-1, -2));
            final int i48 = 11;
            rnVar.r0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i48) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
        } else {
            charSequence2 = charSequence;
        }
        TLRPC.Chat chat4 = rnVar.x0;
        if (chat4 != null) {
            if (!org.telegram.messenger.v3.N(chat4)) {
                rnVar.S.setVisibility(8);
                rnVar.H.setVisibility(8);
            }
            um0Var2.addView(new org.telegram.ui.Cells.y6(context2), c8.na.o(-1, -2));
        } else if (rnVar.D0 != null) {
            rnVar.s0 = new org.telegram.ui.Cells.z8(12, context2, rnVar.resourceProvider);
            String M0 = org.telegram.messenger.gd.M0(2131753040);
            SpannableString valueOf = SpannableString.valueOf(M0);
            int indexOf = M0.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new di.e4(1), indexOf, indexOf + 10, 33);
            }
            rnVar.s0.setText(valueOf);
            um0Var2.addView(rnVar.s0, c8.na.o(-1, -2));
            org.telegram.ui.Cells.m8 m8Var32 = new org.telegram.ui.Cells.m8(context2);
            rnVar.u0 = m8Var32;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.n6.N0(true);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            int i49 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.ActionBar.u6.R(m8Var32, N03, M, org.telegram.ui.ActionBar.u6.M(i49));
            rnVar.u0.o(R.drawable.menu_factcheck, org.telegram.messenger.gd.M0(2131752917), false);
            org.telegram.ui.Cells.m8 m8Var33 = rnVar.u0;
            int i50 = org.telegram.ui.ActionBar.n6.q6;
            m8Var33.g(i50, i50);
            um0Var2.addView(rnVar.u0, c8.na.o(-1, -2));
            final int i51 = 13;
            rnVar.u0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i51) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j11 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j11;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j11));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context2, rnVar.resourceProvider);
            rnVar.t0 = z8Var2;
            z8Var2.setFixedSize(12);
            um0Var2.addView(rnVar.t0, c8.na.o(-1, -2));
            org.telegram.ui.Cells.m8 m8Var34 = rnVar.u0;
            TLRPC.UserFull userFull2 = rnVar.E0;
            m8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.z8 z8Var3 = rnVar.t0;
            TLRPC.UserFull userFull3 = rnVar.E0;
            z8Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = rnVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                rnVar.T = linearLayout6;
                linearLayout6.setOrientation(1);
                um0Var2.addView(rnVar.T, c8.na.o(-1, -2));
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2);
                o4Var.setText(org.telegram.messenger.gd.M0(2131753109));
                rnVar.T.addView(o4Var, c8.na.o(-1, -2));
                org.telegram.ui.Cells.m8 m8Var35 = new org.telegram.ui.Cells.m8(context2);
                rnVar.m0 = m8Var35;
                org.telegram.ui.ActionBar.u6.R(m8Var35, org.telegram.ui.ActionBar.n6.N0(false), q6Var, org.telegram.ui.ActionBar.u6.M(i49));
                rnVar.m0.setPrioritizeTitleOverValue(true);
                rnVar.T.addView(rnVar.m0, c8.na.o(-1, -2));
                final di.e0 g10 = di.e0.g(rnVar.currentAccount);
                final int i52 = 0;
                rnVar.m0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i52) {
                            case 0:
                                rn rnVar4 = this.b;
                                long j11 = rnVar4.C0;
                                if (g10.h(j11, false) != null) {
                                    rnVar4.presentFragment(new di.t(1, j11));
                                    break;
                                }
                                break;
                            default:
                                rn rnVar5 = this.b;
                                long j12 = rnVar5.C0;
                                if (g10.h(j12, false) != null) {
                                    rnVar5.presentFragment(new di.t(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.m(j3)) {
                    long i53 = g10.i(j3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i53 > 0) {
                        double d = i53 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d, 0));
                        } else {
                            i12 = i49;
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            charSequence3 = charSequence2;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            rnVar.m0.s(org.telegram.messenger.gd.M0(2131753107), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i12 = i49;
                    charSequence3 = charSequence2;
                    rnVar.m0.s(org.telegram.messenger.gd.M0(2131753107), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o80(org.telegram.messenger.g0.L(30.0f), rnVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    rnVar.m0.s(org.telegram.messenger.gd.M0(2131753107), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i12 = i49;
                    charSequence3 = charSequence2;
                }
                rnVar.m0.setVisibility(g10.b(j3) ? 0 : 8);
                org.telegram.ui.Cells.m8 m8Var36 = new org.telegram.ui.Cells.m8(context2);
                rnVar.n0 = m8Var36;
                org.telegram.ui.ActionBar.u6.R(m8Var36, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i12));
                final int i54 = 1;
                rnVar.n0.setPrioritizeTitleOverValue(true);
                rnVar.T.addView(rnVar.n0, c8.na.o(-1, -2));
                rnVar.n0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.gn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i54) {
                            case 0:
                                rn rnVar4 = this.b;
                                long j11 = rnVar4.C0;
                                if (g10.h(j11, false) != null) {
                                    rnVar4.presentFragment(new di.t(1, j11));
                                    break;
                                }
                                break;
                            default:
                                rn rnVar5 = this.b;
                                long j12 = rnVar5.C0;
                                if (g10.h(j12, false) != null) {
                                    rnVar5.presentFragment(new di.t(0, j12));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.h(j3, false) != null) {
                    org.telegram.ui.Cells.m8 m8Var37 = rnVar.n0;
                    String M02 = org.telegram.messenger.gd.M0(2131753108);
                    if (g10.c(j3).amount <= 0) {
                        b12 = charSequence3;
                        z10 = false;
                    } else {
                        z10 = false;
                        b12 = di.pb.b1(false, TextUtils.concat("XTR", di.pb.N0(g10.c(j3), 0.85f, ' ')), 0.85f, null);
                    }
                    m8Var37.s(M02, b12, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o80(org.telegram.messenger.g0.L(30.0f), rnVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    rnVar.n0.s(org.telegram.messenger.gd.M0(2131753108), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                rnVar.n0.setVisibility(g10.a(j3) ? 0 : 8);
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(12, context2, rnVar.getResourceProvider());
                z8Var4.setFixedSize(12);
                z8Var4.setTag(R.id.fit_width_tag, 1);
                um0Var2.addView(z8Var4, c8.na.o(-1, 12));
                rnVar.T.setVisibility((rnVar.n0.getVisibility() == 0 || rnVar.m0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = rnVar.x0;
        if ((chat5 == null || !chat5.creator) && !((user = rnVar.D0) != null && user.bot && user.bot_can_edit)) {
            rnVar2 = rnVar;
            r82 = 0;
        } else {
            final long j11 = chat5 != null ? chat5.linked_community_id : rnVar.D0.linked_community_id;
            final long j12 = chat5 != null ? -chat5.id : rnVar.D0.id;
            boolean z17 = rnVar.D0 != null;
            if (j11 != 0) {
                mi.b bVar = new mi.b(context2, rnVar.resourceProvider);
                rnVar.h0 = bVar;
                bVar.a(rnVar.currentAccount, rnVar.getMessagesController().O0(Long.valueOf(j11)));
                mi.b bVar2 = rnVar.h0;
                final int i55 = 0;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.n6.N0(false);
                int i56 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.u6.R(bVar2, N04, null, org.telegram.ui.ActionBar.u6.M(i56));
                rnVar.h0.setOnClickListener(new View.OnClickListener(rnVar) { // from class: org.telegram.ui.hn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i55) {
                            case 0:
                                rn rnVar4 = this.b;
                                org.telegram.messenger.mp messagesController = rnVar4.getMessagesController();
                                long j13 = j11;
                                if (!org.telegram.messenger.v3.N(messagesController.O0(Long.valueOf(j13)))) {
                                    rnVar4.showDialog(new li.c0(rnVar4, j13, null, null));
                                    break;
                                } else {
                                    rnVar4.presentFragment(new li.o(a8.p0.j(j13, "community_id")));
                                    break;
                                }
                            default:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j11);
                                rnVar5.presentFragment(new li.f(bundle));
                                break;
                        }
                    }
                });
                um0Var2.addView(rnVar.h0, c8.na.o(-1, -2));
                org.telegram.ui.Cells.m8 m8Var38 = new org.telegram.ui.Cells.m8(context2);
                rnVar.j0 = m8Var38;
                m8Var38.o(R.drawable.outline_community_remove_24, org.telegram.messenger.gd.M0(z17 ? 2131751872 : rnVar.J0 ? 2131751871 : 2131751870), false);
                org.telegram.ui.Cells.m8 m8Var39 = rnVar.j0;
                int i57 = org.telegram.ui.ActionBar.n6.p7;
                m8Var39.g(i57, i57);
                r82 = 0;
                org.telegram.ui.ActionBar.u6.R(rnVar.j0, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(i56));
                final long j13 = j11;
                rnVar2 = rnVar;
                final boolean z18 = z17;
                rnVar.j0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.in
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String N05 = org.telegram.messenger.gd.N0(2131751903, null);
                        rn rnVar4 = rn.this;
                        org.telegram.ui.Components.b5.s0(rnVar4, N05, org.telegram.messenger.gd.N0(z18 ? 2131751905 : rnVar4.J0 ? 2131751904 : 2131751902, null), org.telegram.messenger.gd.N0(2131746125, null), true, new ai.c0(rnVar4, j12, j13, 2));
                    }
                });
                um0Var2.addView(rnVar2.j0, c8.na.o(-1, -2));
                org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(12, context2, rnVar2.getResourceProvider());
                rnVar2.k0 = z8Var5;
                z8Var5.setFixedSize(14);
                rnVar2.k0.setTag(R.id.fit_width_tag, 1);
                um0Var2.addView(rnVar2.k0, c8.na.o(-1, 14));
            } else {
                rnVar2 = rnVar;
                boolean z19 = z17;
                r82 = 0;
                org.telegram.ui.Cells.m8 m8Var40 = new org.telegram.ui.Cells.m8(context2);
                rnVar2.g0 = m8Var40;
                m8Var40.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                org.telegram.ui.ActionBar.u6.W(rnVar2.g0.getTextView(), org.telegram.ui.ActionBar.n6.Zl);
                org.telegram.ui.ActionBar.u6.R(rnVar2.g0, org.telegram.ui.ActionBar.n6.N0(false), null, org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
                rnVar2.g0.o(R.drawable.msg_groups, org.telegram.messenger.gd.M0(z19 ? 2131751969 : rnVar2.J0 ? 2131751967 : 2131751964), false);
                final int i58 = 1;
                rnVar2.g0.setOnClickListener(new View.OnClickListener(rnVar2) { // from class: org.telegram.ui.hn
                    public final /* synthetic */ rn b;

                    {
                        this.b = rnVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i58) {
                            case 0:
                                rn rnVar4 = this.b;
                                org.telegram.messenger.mp messagesController = rnVar4.getMessagesController();
                                long j132 = j12;
                                if (!org.telegram.messenger.v3.N(messagesController.O0(Long.valueOf(j132)))) {
                                    rnVar4.showDialog(new li.c0(rnVar4, j132, null, null));
                                    break;
                                } else {
                                    rnVar4.presentFragment(new li.o(a8.p0.j(j132, "community_id")));
                                    break;
                                }
                            default:
                                rn rnVar5 = this.b;
                                rnVar5.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j12);
                                rnVar5.presentFragment(new li.f(bundle));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.z8 z8Var6 = new org.telegram.ui.Cells.z8(12, context2, rnVar2.resourceProvider);
                rnVar2.i0 = z8Var6;
                z8Var6.setText(org.telegram.messenger.gd.M0(z19 ? 2131751968 : rnVar2.J0 ? 2131751966 : 2131751963));
                um0Var2.addView(rnVar2.g0, c8.na.o(-1, -2));
                um0Var2.addView(rnVar2.i0, c8.na.o(-1, -2));
            }
        }
        TLRPC.Chat chat6 = rnVar2.x0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context2);
            rnVar2.d0 = frameLayout3;
            um0Var2.addView(frameLayout3, c8.na.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context2);
            rnVar2.e0 = w9Var;
            org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.p7, r82);
            org.telegram.ui.ActionBar.u6.R(rnVar2.e0, org.telegram.ui.ActionBar.n6.N0(false), r82, org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6));
            if (rnVar2.D0 != null) {
                rnVar2.e0.b(org.telegram.messenger.gd.M0(2131751554), false);
            } else if (rnVar2.J0) {
                rnVar2.e0.b(org.telegram.messenger.gd.M0(2131752410), false);
            } else {
                rnVar2.e0.b(org.telegram.messenger.gd.M0(2131751560), false);
            }
            rnVar2.d0.addView(rnVar2.e0, c8.na.c(-2.0f, -1));
            final int i59 = 14;
            rnVar2.e0.setOnClickListener(new View.OnClickListener(rnVar2) { // from class: org.telegram.ui.fn
                public final /* synthetic */ rn b;

                {
                    this.b = rnVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i59) {
                        case 0:
                            rn rnVar4 = this.b;
                            rnVar4.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rnVar4.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            rq rqVar = new rq(bundle);
                            rqVar.C0(rnVar4.y0);
                            rnVar4.presentFragment(rqVar);
                            break;
                        case 1:
                            rn rnVar5 = this.b;
                            pn pnVar = rnVar5.R0;
                            long j32 = rnVar5.C0;
                            if (!rnVar5.s.g()) {
                                org.telegram.messenger.fc fcVar = null;
                                TLRPC.User c22 = j32 == 0 ? null : rnVar5.getMessagesController().c2(Long.valueOf(j32));
                                if (c22 == null) {
                                    TLRPC.Chat O0 = rnVar5.getMessagesController().O0(Long.valueOf(rnVar5.w0));
                                    TLRPC.ChatPhoto chatPhoto = O0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                                        int i212 = chatPhoto2.dc_id;
                                        if (i212 != 0) {
                                            chatPhoto2.photo_big.dc_id = i212;
                                        }
                                        TLRPC.ChatFull chatFull4 = rnVar5.y0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                fcVar = org.telegram.messenger.fc.j(rnVar5.y0.chat_photo.video_sizes.get(0), rnVar5.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.p1().J2(null, rnVar5, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = c22.photo;
                                        int i222 = userProfilePhoto2.dc_id;
                                        if (i222 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i222;
                                        }
                                        PhotoViewer.p1().e2(null, c22.photo.photo_big, null, null, null, null, null, 0, pnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            rn rnVar6 = this.b;
                            rnVar6.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", rnVar6.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            rq rqVar2 = new rq(bundle2);
                            rqVar2.C0(rnVar6.y0);
                            rnVar6.presentFragment(rqVar2);
                            break;
                        case 3:
                            rn rnVar7 = this.b;
                            rnVar7.presentFragment(new bi.e9(rnVar7.w0));
                            break;
                        case 4:
                            rn rnVar8 = this.b;
                            rnVar8.presentFragment(new ki.i3(-rnVar8.w0));
                            break;
                        case 5:
                            rn rnVar9 = this.b;
                            rnVar9.getClass();
                            rnVar9.presentFragment(new lb(rnVar9.x0));
                            break;
                        case 6:
                            rn rnVar10 = this.b;
                            rnVar10.presentFragment(b51.g0(rnVar10.x0, false));
                            break;
                        case 7:
                            rn rnVar11 = this.b;
                            rnVar11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", rnVar11.C0);
                            rnVar11.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            rn rnVar12 = this.b;
                            rnVar12.presentFragment(new ki.j(rnVar12.C0));
                            break;
                        case 9:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            vf.c.t(view.getContext(), "https://t.me/BotFather?start=" + rn.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            rn.c0(this.b);
                            break;
                        case 14:
                            rn rnVar13 = this.b;
                            org.telegram.ui.Components.b5.r(rnVar13, false, rnVar13.x0, null, false, true, true, false, new ln(rnVar13, 7));
                            break;
                        case 15:
                            rn rnVar14 = this.b;
                            if (org.telegram.messenger.g0.J1(rnVar14)) {
                                pa0 pa0Var = new pa0(4);
                                pa0Var.m0 = -rnVar14.w0;
                                TLRPC.ChatFull chatFull5 = rnVar14.y0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pa0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pa0Var.M0 = new ln(rnVar14, 6);
                                rnVar14.presentFragment(pa0Var);
                                break;
                            }
                            break;
                        case 16:
                            rn rnVar15 = this.b;
                            long j102 = rnVar15.w0;
                            org.telegram.ui.Cells.m8 m8Var72 = rnVar15.I;
                            boolean z152 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            io ioVar = new io(null);
                            ioVar.N = new ArrayList();
                            ioVar.O = new ArrayList();
                            ioVar.Q = new ArrayList();
                            ioVar.d0 = true;
                            ioVar.g0 = new ArrayList();
                            ioVar.p0 = new HashMap();
                            ioVar.r0 = new tn(ioVar, 5);
                            ioVar.t0 = false;
                            ioVar.a0 = j102;
                            ioVar.o0 = z152;
                            TLRPC.ChatFull chatFull6 = rnVar15.y0;
                            ioVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    ioVar.m0 = tL_chatInviteExported;
                                } else {
                                    ioVar.d0(false);
                                }
                            }
                            rnVar15.presentFragment(ioVar);
                            break;
                        case 17:
                            rn rnVar16 = this.b;
                            long j112 = rnVar16.w0;
                            uo uoVar = new uo(null);
                            uoVar.w = new ArrayList();
                            boolean z162 = false;
                            uoVar.P = false;
                            uoVar.Q = false;
                            uoVar.F = j112;
                            TLRPC.Chat O02 = uoVar.getMessagesController().O0(Long.valueOf(j112));
                            uoVar.f = O02;
                            if (org.telegram.messenger.v3.T(O02) && !uoVar.f.megagroup) {
                                z162 = true;
                            }
                            uoVar.s = z162;
                            uoVar.h = rnVar16.y0;
                            rnVar16.presentFragment(uoVar);
                            break;
                        case 18:
                            rn rnVar17 = this.b;
                            hs0 hs0Var = new hs0(rnVar17.w0);
                            hs0Var.s = new ln(rnVar17, 4);
                            rnVar17.presentFragment(hs0Var);
                            break;
                        case 19:
                            rn.e0(this.b);
                            break;
                        case 20:
                            rn rnVar18 = this.b;
                            l40 l40Var = new l40(-rnVar18.x0.id);
                            l40Var.c = rnVar18.M0;
                            l40Var.m0 = rnVar18;
                            rnVar18.presentFragment(l40Var);
                            break;
                        case 21:
                            rn rnVar19 = this.b;
                            rnVar19.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", rnVar19.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((rnVar19.J0 || rnVar19.x0.gigagroup) && !org.telegram.messenger.v3.Y(rnVar19.x0)) ? 0 : 3);
                            rq rqVar3 = new rq(bundle4);
                            rqVar3.C0(rnVar19.y0);
                            rnVar19.presentFragment(rqVar3);
                            break;
                        case 22:
                            rn rnVar20 = this.b;
                            ef0 ef0Var = new ef0(rnVar20.w0, 0, 0L);
                            TLRPC.ChatFull chatFull7 = rnVar20.y0;
                            ef0Var.m0(chatFull7, chatFull7.exported_invite);
                            rnVar20.presentFragment(ef0Var);
                            break;
                        case 23:
                            rn rnVar21 = this.b;
                            if (org.telegram.messenger.v3.V(rnVar21.x0)) {
                                rnVar21.presentFragment(new ch.p(rnVar21.w0, rnVar21.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", rnVar21.w0);
                                bp bpVar = new bp(bundle5);
                                TLRPC.ChatFull chatFull8 = rnVar21.y0;
                                bpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (bpVar.a == null) {
                                        bpVar.a = bpVar.getMessagesController().O0(Long.valueOf(bpVar.c));
                                    }
                                    bpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        bpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        bpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i232 = 0; i232 < tL_chatReactionsSome.reactions.size(); i232++) {
                                            if (tL_chatReactionsSome.reactions.get(i232) instanceof TLRPC.TL_reactionEmoji) {
                                                bpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i232)).emoticon);
                                            }
                                        }
                                        bpVar.w = 1;
                                    }
                                }
                                rnVar21.presentFragment(bpVar);
                                break;
                            }
                        default:
                            rn rnVar22 = this.b;
                            rnVar22.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", rnVar22.w0);
                            bundle6.putLong("welcome_messages_chat_id", rnVar22.w0);
                            rnVar22.presentFragment(new bn(bundle6));
                            break;
                    }
                }
            });
            um0Var2.addView(new org.telegram.ui.Cells.y6(context2), c8.na.o(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        rnVar2.c = undoView;
        wcVar.addView(undoView, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.wt wtVar6 = rnVar2.w;
        TLRPC.User user3 = rnVar2.D0;
        wtVar6.setText(org.telegram.messenger.j6.l(user3 != null ? org.telegram.messenger.i5.p(user3) : rnVar2.x0.title, rnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.wt wtVar7 = rnVar2.w;
        wtVar7.setSelection(wtVar7.n());
        TLRPC.ChatFull chatFull4 = rnVar2.y0;
        if (chatFull4 != null) {
            rnVar2.F.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = rnVar2.E0;
            if (userFull4 != null) {
                rnVar2.F.setText(userFull4.about);
            }
        }
        rnVar2.p0();
        rnVar2.u0(true, false);
        return rnVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.x0.participants_count) >= getMessagesController().f5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.m8 m8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i11 = org.telegram.messenger.ks.T;
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
                        m8Var = this.R;
                        if (m8Var != null) {
                            m8Var.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.G0 = z10;
                    m8Var = this.R;
                    if (m8Var != null) {
                    }
                }
                if (org.telegram.messenger.v3.T(this.x0) && !this.y0.hidden_prehistory) {
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
        if (i7 == org.telegram.messenger.ks.u5) {
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
            org.telegram.ui.Cells.m8 m8Var2 = this.R;
            if (m8Var2 != null) {
                m8Var2.setChecked(this.F0);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.mp.I8;
            if ((intValue & 2) != 0) {
                p0();
            }
            if ((intValue & 1) != 0) {
                w0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
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
        if (i7 == org.telegram.messenger.ks.a5) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull P0 = getMessagesController().P0(longValue2);
                this.y0 = P0;
                if (P0 != null) {
                    this.L0 = P0.available_reactions;
                }
                x0(true);
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.E3) {
            if (i7 == org.telegram.messenger.ks.E0) {
                if (((Long) objArr[0]).longValue() == j3) {
                    r0(getMessagesController().d2(j3));
                    return;
                }
                return;
            } else {
                if (i7 == org.telegram.messenger.ks.O3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i7 == org.telegram.messenger.ks.y1 && (-this.w0) == ((Long) objArr[0]).longValue()) {
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
            if (this.n0 != null) {
                di.e0 g10 = di.e0.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j3) ? 0 : 8);
                this.n0.w(di.pb.b1(false, TextUtils.concat("XTR", di.pb.M0(g10.c(j3), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.m8 m8Var3 = this.l0;
                if (m8Var3 != null) {
                    m8Var3.setNeedDivider(g10.a(j3) || g10.b(j3));
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
                org.telegram.ui.Cells.m8 m8Var4 = this.l0;
                if (m8Var4 != null) {
                    if (!g11.a(j3) && !g11.b(j3)) {
                        z11 = false;
                    }
                    m8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.T;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t30
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.vm0 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        qn qnVar = this.c0;
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(qnVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c0, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c0, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.U, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.Cells.m8 m8Var = this.V;
        if (m8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(m8Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.Z, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.J, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.l6));
        LinearLayout linearLayout = this.E;
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.e0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.e0, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.P, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.Cells.m8 m8Var2 = this.L;
        if (m8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(m8Var2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        org.telegram.ui.Cells.m8 m8Var3 = this.b0;
        if (m8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(m8Var3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        org.telegram.ui.Components.wt wtVar;
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
            org.telegram.ui.Components.wt wtVar2 = this.w;
            if ((wtVar2 != null && !this.D0.first_name.equals(wtVar2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131743479, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131752971, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new ln(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747386, null), new ln(this, i7));
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
        if ((chatFull != null && org.telegram.messenger.v3.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((wtVar = this.w) != null && !this.x0.title.equals(wtVar.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N02 = org.telegram.messenger.gd.N0(2131743479, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                t1Var2.S = N02;
                if (this.J0) {
                    t1Var2.U = org.telegram.messenger.gd.N0(2131752293, "ChannelSettingsChangedAlert");
                } else {
                    t1Var2.U = org.telegram.messenger.gd.N0(2131749208, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131754213, "ApplyTheme"), new ln(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131747386, "PassportDiscard"), new ln(this, 3));
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
        ArrayList arrayList = (ArrayList) getMessagesController().R2.f(-this.w0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
            str = !TextUtils.isEmpty(fjVar.z) ? fjVar.z.toString() : !TextUtils.isEmpty(fjVar.v) ? fjVar.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.gd.N0(2131742621, null);
        }
        this.f0.u(org.telegram.messenger.gd.N0(2131742627, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new kn(this, 0));
    }

    public final void n0() {
        this.s.n(this.v0 != null, new mn(this, 0), new q5(this, 5), 0);
        this.S0.M(0);
        this.S0.P(43);
        this.c0.e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.wt wtVar;
        String str;
        String str2;
        if (this.O0 || (wtVar = this.w) == null) {
            return;
        }
        if (wtVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.D3(this.w);
            return;
        }
        this.O0 = true;
        int i7 = 3;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().s1(this.D0);
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
        if (!org.telegram.messenger.v3.T(this.x0) && (!this.K0 || this.F0)) {
            getMessagesController().T(getParentActivity(), this.w0, this, new ln(this, 5), null);
            return;
        }
        if (this.y0 != null && org.telegram.messenger.v3.T(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.K0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().n5(this.w0, this.K0);
            }
        }
        if (this.s.g()) {
            this.N0 = true;
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            this.b = t1Var;
            t1Var.setOnCancelListener(new wf(this, r0));
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
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j3 = this.w0;
            String obj = this.F.getText().toString();
            TLRPC.ChatFull chatFull3 = this.y0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.l1(-j3);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.ci(messagesController, chatFull3, obj, 7), 64);
        }
        boolean z12 = this.F0;
        TLRPC.Chat chat = this.x0;
        boolean z13 = chat.forum;
        if (z12 != z13 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
            boolean z14 = this.H0 != chat.forum_tabs;
            boolean z15 = this.I0 != chat.forum_sidebar;
            r0 = z12 == z13 ? 0 : 1;
            getMessagesController().m5(this.w0, this.F0, this.H0, this.I0);
            if (this.F0 && !this.H0 && (r0 != 0 || z14)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i11 = 0; i11 < fragmentStack.size(); i11++) {
                    if ((fragmentStack.get(i11) instanceof bn) && ((bn) fragmentStack.get(i11)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).b0(i11);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
                        HashSet hashSet = w91.s1;
                        ((ActionBarLayout) parentLayout).c(i11, w91.I0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z14 || z15) {
                v0(z14);
            }
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.s.h(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar == null || !wtVar.e) {
            return j0(z10);
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
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
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().f5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j3 = this.w0;
        long j10 = this.C0;
        boolean z10 = true;
        if (j3 == 0) {
            TLRPC.User c22 = j10 == 0 ? null : getMessagesController().c2(Long.valueOf(j10));
            this.D0 = c22;
            if (c22 == null) {
                TLRPC.User k02 = org.telegram.messenger.tr.a0(this.currentAccount).k0(j10);
                this.D0 = k02;
                if (k02 != null) {
                    getMessagesController().e4(this.D0, true, false);
                    if (this.E0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j10));
                        ArrayList L0 = org.telegram.messenger.tr.a0(this.currentAccount).L0(hashSet);
                        if (!L0.isEmpty()) {
                            this.E0 = (TLRPC.UserFull) L0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            org.telegram.ui.Components.a9 a9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.u30 u30Var = this.s;
            u30Var.a = this;
            u30Var.b = this;
            getNotificationCenter().c(this, org.telegram.messenger.ks.r);
            getNotificationCenter().c(this, org.telegram.messenger.ks.y1);
            getNotificationCenter().c(this, org.telegram.messenger.ks.b1);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.w0));
        this.x0 = O0;
        if (O0 == null) {
            TLRPC.Chat P = org.telegram.messenger.tr.a0(this.currentAccount).P(this.w0);
            this.x0 = P;
            if (P != null) {
                getMessagesController().X3(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.tr.a0(this.currentAccount).F0(this.w0, org.telegram.messenger.v3.T(this.x0), new CountDownLatch(1), false, false, 0);
                    this.y0 = F0;
                }
            }
            return false;
        }
        chat = this.x0;
        org.telegram.ui.Components.a9 a9Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            a9Var2.k(5L, this.x0.title, null, null);
            this.J0 = org.telegram.messenger.v3.T(this.x0) && !this.x0.megagroup;
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
                getNotificationCenter().c(this, org.telegram.messenger.ks.T);
                getNotificationCenter().c(this, org.telegram.messenger.ks.u5);
                getNotificationCenter().c(this, org.telegram.messenger.ks.a5);
                getNotificationCenter().c(this, org.telegram.messenger.ks.O3);
            }
            z10 = false;
            this.G0 = z10;
            getNotificationCenter().c(this, org.telegram.messenger.ks.T);
            getNotificationCenter().c(this, org.telegram.messenger.ks.u5);
            getNotificationCenter().c(this, org.telegram.messenger.ks.a5);
            getNotificationCenter().c(this, org.telegram.messenger.ks.O3);
        } else {
            a9Var2.k(5L, this.D0.first_name, null, null);
            this.J0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
            this.G0 = false;
            getNotificationCenter().c(this, org.telegram.messenger.ks.E0);
            if (this.D0.bot) {
                getNotificationCenter().c(this, org.telegram.messenger.ks.E3);
            }
        }
        org.telegram.ui.Components.u30 u30Var2 = this.s;
        u30Var2.a = this;
        u30Var2.b = this;
        getNotificationCenter().c(this, org.telegram.messenger.ks.r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.y1);
        getNotificationCenter().c(this, org.telegram.messenger.ks.b1);
        if (this.y0 != null) {
            m0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.u30 u30Var = this.s;
        if (u30Var != null) {
            u30Var.d();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.ks.T);
            getNotificationCenter().n(this, org.telegram.messenger.ks.u5);
            getNotificationCenter().n(this, org.telegram.messenger.ks.a5);
            getNotificationCenter().n(this, org.telegram.messenger.ks.O3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.ks.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.ks.E3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.ks.r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.y1);
        getNotificationCenter().n(this, org.telegram.messenger.ks.b1);
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.Components.o5) obj).o(null);
        }
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.s.j(i7, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.s();
            this.w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        u0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.G6, null);
            }
            fi.t3 t3Var = this.e;
            if (t3Var != null) {
                t3Var.invalidate();
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
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.w0));
        long j3 = this.C0;
        TLRPC.User c22 = j3 == 0 ? null : getMessagesController().c2(Long.valueOf(j3));
        if (O0 == null && c22 == null) {
            return;
        }
        this.D0 = c22;
        this.x0 = O0;
        org.telegram.ui.Components.a9 a9Var = this.r;
        if (c22 == null ? O0.photo == null : c22.photo == null) {
            this.e.setImageDrawable(a9Var);
        } else {
            TLRPC.Chat chat = c22 != null ? c22 : O0;
            this.v0 = c22 != null ? c22.photo.photo_small : O0.photo.photo_small;
            org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(this.currentAccount, 1, chat);
            this.e.f(chat, a9Var);
            if (m10 != null) {
                z10 = true;
                if (this.c0 != null) {
                    if (z10 || this.s.g()) {
                        this.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.N0(2131752201, "ChatSetNewPhoto"), true);
                    } else {
                        this.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.gd.N0(2131752200, "ChatSetPhotoOrVideo"), true);
                    }
                    if (this.S0 == null) {
                        this.S0 = new org.telegram.ui.Components.nh0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    this.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    this.c0.e.setAnimation(this.S0);
                }
                if (PhotoViewer.A1() && PhotoViewer.p1().Q1()) {
                    PhotoViewer.p1().r0();
                }
                if (this.a0 == null && getMessagesController().j6 && org.telegram.messenger.v3.V(this.x0)) {
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
        org.telegram.ui.Components.o5 m10;
        this.y0 = chatFull;
        if (chatFull != null) {
            if (this.x0 == null) {
                this.x0 = getMessagesController().O0(Long.valueOf(this.w0));
            }
            this.K0 = !org.telegram.messenger.v3.T(this.x0) || this.y0.hidden_prehistory;
            this.L0 = this.y0.available_reactions;
            ArrayList arrayList = this.Q0;
            arrayList.clear();
            TLRPC.Chat chat = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.v3.V(chat)) {
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
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m10 = org.telegram.ui.Components.o5.l(org.telegram.messenger.i10.t0, org.telegram.ui.Components.o5.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.o5.m(org.telegram.messenger.i10.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.o5.f()) : null;
                        }
                        if (m10 != null) {
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(org.telegram.messenger.i10.t0, org.telegram.ui.Components.o5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().j6 && org.telegram.messenger.v3.V(this.x0)) {
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
                this.D0 = j3 == 0 ? null : getMessagesController().c2(Long.valueOf(j3));
            }
            org.telegram.ui.Cells.m8 m8Var = this.o0;
            if (m8Var != null) {
                m8Var.h(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.w(userFull2.starref_program == null ? org.telegram.messenger.gd.N0(2131754342, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.u0;
            if (m8Var2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                m8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.z8 z8Var = this.t0;
            if (z8Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                z8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.u30 u30Var = this.s;
        if (u30Var != null) {
            u30Var.f = bundle.getString("path");
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<hi.w5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<hi.w5, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new on(i7, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.u30 u30Var = this.s;
        if (u30Var != null && (str = u30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            String obj = wtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        int i7;
        em0 em0Var;
        int w02;
        ArrayList<Integer> arrayList;
        pl0 pl0Var = this.M;
        if (pl0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.m8 m8Var3 = this.O;
            boolean z10 = (m8Var3 != null && m8Var3.getVisibility() == 0) || ((m8Var = this.R) != null && m8Var.getVisibility() == 0) || ((org.telegram.messenger.v3.n0(this.x0) && org.telegram.messenger.v3.N(this.x0)) || ((m8Var2 = this.N) != null && m8Var2.getVisibility() == 0));
            Paint paint = pl0Var.n;
            int i10 = pl0Var.a;
            org.telegram.ui.ActionBar.i6 i6Var = pl0Var.d;
            if (chat == null) {
                return;
            }
            pl0Var.w = z10;
            pl0Var.r = new org.telegram.ui.Components.wy0(org.telegram.messenger.j6.m(chat.title, org.telegram.ui.ActionBar.n6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
            em0 em0Var2 = pl0Var.x;
            if (em0Var2 != null) {
                em0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = em0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                i7 = -16777216;
                pl0Var.x = new em0(i12, i12, i12, tL_emojiStatusCollectible.document_id);
            } else {
                i7 = -16777216;
                if (org.telegram.messenger.v3.I(chat) >= 0) {
                    em0Var = em0.c(i10, org.telegram.messenger.v3.I(chat));
                    em0Var.a = org.telegram.messenger.g0.L(11.0f);
                    em0Var.d();
                } else {
                    em0Var = null;
                }
                pl0Var.x = em0Var;
            }
            em0 em0Var3 = pl0Var.x;
            if (em0Var3 != null) {
                em0Var3.e(pl0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean b10 = i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
                int i13 = (!b10 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!b10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | i7;
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | i7 : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | i7 : intValue;
                pl0Var.r.n(i13);
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, i13));
                em0 em0Var4 = new em0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                em0Var4.a = org.telegram.messenger.g0.L(11.0f);
                em0Var4.d();
                pl0Var.y = em0Var4;
                em0Var4.e(pl0Var);
                return;
            }
            int F = org.telegram.messenger.v3.F(chat);
            if (F < 7) {
                int i14 = org.telegram.ui.ActionBar.n6.r8[F];
                pl0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.n6.w0(i14, i6Var);
            } else {
                org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).t4;
                org.telegram.messenger.bp d = cpVar == null ? null : cpVar.d(F);
                if (d != null) {
                    pl0Var.s = -1;
                    w02 = d.f();
                } else {
                    int i15 = org.telegram.ui.ActionBar.n6.r8[0];
                    pl0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
                }
            }
            pl0Var.r.n(w02);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
            em0 a10 = em0.a(i10, F);
            a10.a = org.telegram.messenger.g0.L(11.0f);
            a10.d();
            pl0Var.y = a10;
            a10.e(pl0Var);
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
        String N0;
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
        TLRPC.Chat O0;
        if (z10 && (O0 = getMessagesController().O0(Long.valueOf(this.w0))) != null) {
            this.x0 = O0;
        }
        boolean t02 = org.telegram.messenger.v3.t0(this.x0);
        org.telegram.ui.Cells.z8 z8Var = this.Q;
        if (z8Var != null) {
            z8Var.setVisibility((this.J != null || ((m8Var7 = this.K) != null && m8Var7.getVisibility() == 0) || (((m8Var8 = this.O) != null && m8Var8.getVisibility() == 0) || ((m8Var9 = this.I) != null && m8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.m8 m8Var10 = this.Z;
        if (m8Var10 != null) {
            m8Var10.setVisibility(org.telegram.messenger.v3.T(this.x0) ? 0 : 8);
        }
        org.telegram.ui.Cells.m8 m8Var11 = this.K;
        if (m8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.J0 && chatFull2.linked_chat_id == 0)) {
                m8Var11.setVisibility(8);
            } else {
                m8Var11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(org.telegram.messenger.gd.N0(2131751377, "Discussion"), org.telegram.messenger.gd.N0(2131751369, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.y0.linked_chat_id));
                    if (O02 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = org.telegram.messenger.v3.K(O02, false);
                        if (TextUtils.isEmpty(K)) {
                            this.K.u(org.telegram.messenger.gd.N0(2131751377, "Discussion"), O02.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.K.u(org.telegram.messenger.gd.N0(2131751377, "Discussion"), p5.c.k("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.v3.K(O02, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.m8 m8Var12 = this.K;
                            String N02 = org.telegram.messenger.gd.N0(2131748690, "LinkedChannel");
                            String str4 = O02.title;
                            org.telegram.ui.Cells.m8 m8Var13 = this.R;
                            m8Var12.u(N02, str4, false, R.drawable.msg_channel, m8Var13 != null && m8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.m8 m8Var14 = this.K;
                            String N03 = org.telegram.messenger.gd.N0(2131748690, "LinkedChannel");
                            String k10 = p5.c.k("@", K2);
                            org.telegram.ui.Cells.m8 m8Var15 = this.R;
                            m8Var14.u(N03, k10, false, R.drawable.msg_channel, m8Var15 != null && m8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.m8 m8Var16 = this.I;
        if (m8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                m8Var16.setVisibility(8);
            } else {
                m8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.I.q(org.telegram.messenger.gd.N0(2131753958, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.I.q(org.telegram.messenger.gd.N0(2131753958, "AttachLocation"), "Unknown address", z11, true);
                }
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.x0.noforwards;
                if (this.J0) {
                    if (t02) {
                        i15 = 2131743673;
                        str3 = "TypePublic";
                    } else if (z13) {
                        i15 = 2131743674;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i15 = 2131743677;
                        str3 = "TypePrivate";
                    }
                    N0 = org.telegram.messenger.gd.N0(i15, str3);
                } else {
                    if (t02) {
                        i14 = 2131743672;
                        str2 = "TypePublicGroup";
                    } else if (z13) {
                        i14 = 2131743675;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = 2131743676;
                        str2 = "TypePrivateGroup";
                    }
                    N0 = org.telegram.messenger.gd.N0(i14, str2);
                }
                String str5 = N0;
                if (this.J0) {
                    org.telegram.ui.Cells.m8 m8Var17 = this.J;
                    String N04 = org.telegram.messenger.gd.N0(2131752264, "ChannelType");
                    org.telegram.ui.Cells.m8 m8Var18 = this.O;
                    m8Var17.u(N04, str5, false, R.drawable.msg_channel, (m8Var18 != null && m8Var18.getVisibility() == 0) || ((m8Var3 = this.K) != null && m8Var3.getVisibility() == 0) || ((m8Var4 = this.R) != null && m8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.m8 m8Var19 = this.J;
                    String N05 = org.telegram.messenger.gd.N0(2131749199, "GroupType");
                    org.telegram.ui.Cells.m8 m8Var20 = this.O;
                    m8Var19.u(N05, str5, false, R.drawable.msg_groups, (m8Var20 != null && m8Var20.getVisibility() == 0) || ((m8Var = this.K) != null && m8Var.getVisibility() == 0) || ((m8Var2 = this.R) != null && m8Var2.getVisibility() == 0));
                }
            } else {
                String N06 = !t02 ? org.telegram.messenger.gd.N0(2131743682, "TypeLocationGroupEdit") : String.format(a8.p0.s(new StringBuilder("https://"), getMessagesController().X2, "/%s"), org.telegram.messenger.v3.K(this.x0, false));
                org.telegram.ui.Cells.m8 m8Var21 = this.J;
                String N07 = org.telegram.messenger.gd.N0(2131743683, "TypeLocationGroup");
                org.telegram.ui.Cells.m8 m8Var22 = this.O;
                m8Var21.u(N07, N06, false, R.drawable.msg_channel, (m8Var22 != null && m8Var22.getVisibility() == 0) || ((m8Var5 = this.K) != null && m8Var5.getVisibility() == 0) || ((m8Var6 = this.R) != null && m8Var6.getVisibility() == 0));
            }
        }
        if (this.O != null) {
            if (!this.K0 || this.F0) {
                i13 = 2131752216;
                str = "ChatHistoryVisible";
            } else {
                i13 = 2131752220;
                str = "ChatHistoryHidden";
            }
            this.O.u(org.telegram.messenger.gd.N0(2131752217, "ChatHistoryShort"), org.telegram.messenger.gd.N0(i13, str), z11, R.drawable.msg_discuss, this.R != null);
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
                    ofFloat.addUpdateListener(new ch.w(10, this, arrayList));
                    this.T0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 7));
                    this.T0.setDuration(320L);
                    this.T0.setInterpolator(org.telegram.ui.Components.kr.h);
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
                org.telegram.ui.Cells.m8 m8Var23 = this.V;
                if (m8Var23 != null) {
                    if (m8Var23.getParent() == null) {
                        i7 = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, c8.na.o(-1, -2));
                    } else {
                        i7 = 0;
                    }
                    this.V.setVisibility(this.y0.requests_pending > 0 ? i7 : 8);
                } else {
                    i7 = 0;
                }
                if (!this.J0 || org.telegram.messenger.v3.Y(this.x0)) {
                    if (org.telegram.messenger.v3.T(this.x0)) {
                        org.telegram.ui.Cells.m8 m8Var24 = this.U;
                        String N08 = org.telegram.messenger.gd.N0(2131752365, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i7] = Integer.valueOf(this.y0.participants_count);
                        m8Var24.u(N08, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.m8 m8Var25 = this.U;
                        CharSequence N09 = org.telegram.messenger.gd.N0(2131752365, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i7] = Integer.valueOf(this.y0.participants.participants.size());
                        m8Var25.u(N09, String.format("%d", objArr2), false, R.drawable.msg_groups, this.V.getVisibility() == 0 ? 1 : i7);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (!chat.gigagroup || org.telegram.messenger.v3.Y(chat)) {
                        int i20 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i21 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i21++;
                            }
                            i10 = rq.s0(tL_chatBannedRights) + i21;
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
                        org.telegram.ui.Cells.m8 m8Var26 = this.Y;
                        String N010 = org.telegram.messenger.gd.N0(2131752321, null);
                        Integer valueOf = Integer.valueOf(i10);
                        Integer valueOf2 = Integer.valueOf(i11);
                        Object[] objArr3 = new Object[2];
                        objArr3[i7] = valueOf;
                        objArr3[1] = valueOf2;
                        m8Var26.u(N010, String.format("%d/%d", objArr3), z11, R.drawable.msg_permissions, true);
                        z12 = z11;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var27 = this.Y;
                        CharSequence N011 = org.telegram.messenger.gd.N0(2131752441, null);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i7] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        org.telegram.ui.Cells.m8 m8Var28 = this.Z;
                        m8Var27.u(N011, format, false, R.drawable.msg_user_remove, (m8Var28 == null || m8Var28.getVisibility() != 0) ? i7 : 1);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.m8 m8Var29 = this.V;
                    if (m8Var29 != null) {
                        CharSequence N012 = org.telegram.messenger.gd.N0(2131748442, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i7] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.m8 m8Var30 = this.Z;
                        m8Var29.u(N012, format2, false, R.drawable.msg_requests, (m8Var30 == null || m8Var30.getVisibility() != 0) ? i7 : 1);
                    }
                } else {
                    org.telegram.ui.Cells.m8 m8Var31 = this.U;
                    String N013 = org.telegram.messenger.gd.N0(2131752277, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i7] = Integer.valueOf(this.y0.participants_count);
                    m8Var31.u(N013, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.m8 m8Var32 = this.Y;
                    CharSequence N014 = org.telegram.messenger.gd.N0(2131752441, null);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i7] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    org.telegram.ui.Cells.m8 m8Var33 = this.Z;
                    m8Var32.u(N014, format3, false, R.drawable.msg_user_remove, (m8Var33 == null || m8Var33.getVisibility() != 0) ? i7 : 1);
                    z12 = z11;
                }
                org.telegram.ui.Cells.m8 m8Var34 = this.X;
                String N015 = org.telegram.messenger.gd.N0(2131752505, "ChannelAdministrators");
                if (org.telegram.messenger.v3.T(this.x0)) {
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
                m8Var34.u(N015, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                i7 = 0;
                if (!this.J0 || org.telegram.messenger.v3.Y(this.x0)) {
                    org.telegram.ui.Cells.m8 m8Var35 = this.U;
                    String N016 = org.telegram.messenger.gd.N0(2131752365, "ChannelMembers");
                    org.telegram.ui.Cells.m8 m8Var36 = this.Z;
                    m8Var35.o(R.drawable.msg_groups, N016, m8Var36 != null && m8Var36.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var37 = this.Y;
                        String N017 = org.telegram.messenger.gd.N0(2131752441, null);
                        org.telegram.ui.Cells.m8 m8Var38 = this.Z;
                        m8Var37.o(R.drawable.msg_chats_remove, N017, m8Var38 != null && m8Var38.getVisibility() == 0);
                    } else {
                        this.Y.o(R.drawable.msg_permissions, org.telegram.messenger.gd.N0(2131752321, null), true);
                    }
                } else {
                    this.U.o(R.drawable.msg_groups, org.telegram.messenger.gd.N0(2131752277, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.m8 m8Var39 = this.Y;
                    String N018 = org.telegram.messenger.gd.N0(2131752441, null);
                    org.telegram.ui.Cells.m8 m8Var40 = this.Z;
                    m8Var39.o(R.drawable.msg_chats_remove, N018, m8Var40 != null && m8Var40.getVisibility() == 0);
                }
                this.X.o(R.drawable.msg_admins, org.telegram.messenger.gd.N0(2131752505, "ChannelAdministrators"), true);
            }
            this.P.setVisibility(org.telegram.messenger.v3.w(1, this.x0) ? i7 : 8);
            x0(z12);
            if (this.y0 == null || !org.telegram.messenger.v3.y(3, this.x0) || (t02 && this.x0.creator)) {
                this.W.setVisibility(8);
            } else if (this.y0.invitesCount > 0) {
                this.W.u(org.telegram.messenger.gd.N0(2131748947, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.W.u(org.telegram.messenger.gd.N0(2131748947, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10) {
        bx bxVar;
        wv wvVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i7 = 0;
        while (i7 < fragmentStack.size()) {
            if (fragmentStack.get(i7) instanceof bn) {
                bn bnVar = (bn) fragmentStack.get(i7);
                if (bnVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).d0(bnVar, false);
                    bnVar.clearViews();
                    if (((ActionBarLayout) getParentLayout()).c(i7, bnVar)) {
                        org.telegram.messenger.ks.e().j(bnVar.da);
                    }
                    if (z10 && !this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i7, new w91(bundle));
                        i7++;
                    }
                }
            } else if (z10 && this.H0 && (fragmentStack.get(i7) instanceof w91)) {
                w91 w91Var = (w91) fragmentStack.get(i7);
                if (w91Var.g() != null && w91Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).d0(w91Var, false);
                    i7--;
                }
            } else if (z10 && this.H0 && (fragmentStack.get(i7) instanceof bx) && (bxVar = (bx) fragmentStack.get(i7)) != null && (wvVar = bxVar.H3) != null && wvVar.c()) {
                bxVar.H3.a();
            }
            i7++;
        }
    }

    public final void w0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.u(org.telegram.messenger.gd.N0(2131752993, null), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
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
        this.l0.u(org.telegram.messenger.gd.N0(2131752992, null), org.telegram.messenger.gd.a0(null, null, 2131752991, Integer.valueOf(i7), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x0(boolean z10) {
        String str;
        String str2;
        int i7;
        TLRPC.ChatFull P0 = getMessagesController().P0(this.w0);
        boolean V = org.telegram.messenger.v3.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String N0 = org.telegram.messenger.gd.N0(2131746183, null);
            if (P0 == null || !P0.paid_reactions_available) {
                str = N0;
                this.P.u(org.telegram.messenger.gd.N0(2131746191, null), str, z10, R.drawable.msg_reactions2, true);
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
                if (P0 != null && P0.paid_reactions_available) {
                    i10++;
                }
                str2 = i10 == 0 ? org.telegram.messenger.gd.N0(2131746183, null) : String.valueOf(i10);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i10);
                str2 = min == 0 ? org.telegram.messenger.gd.N0(2131746183, null) : org.telegram.messenger.gd.a0(null, null, 2131746188, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = org.telegram.messenger.gd.N0(2131746190, null);
        }
        str = str2;
        this.P.u(org.telegram.messenger.gd.N0(2131746191, null), str, z10, R.drawable.msg_reactions2, true);
    }

    public final void y0(Long l10) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.L == null) {
            return;
        }
        long j3 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.L.u(org.telegram.messenger.gd.N0(2131746902, null), org.telegram.messenger.gd.N0(2131746892, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.x0.linked_monoforum_id));
        if (l10 != null) {
            j3 = l10.longValue();
        } else if (O0 != null) {
            j3 = O0.send_paid_messages_stars;
        }
        this.L.u(org.telegram.messenger.gd.N0(2131746902, null), di.pb.b1(false, org.telegram.messenger.gd.a0(null, null, 2131746874, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.t30
    public final /* synthetic */ void U() {
    }
}
