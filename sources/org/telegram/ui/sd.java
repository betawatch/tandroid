package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.h50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.yj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.w90 P;
    public org.telegram.ui.Cells.j6 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public fc Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.u0 a;
    public boolean a0;
    public org.telegram.ui.Components.ds b;
    public boolean b0;
    public org.telegram.ui.Components.vu c;
    public TLRPC.TL_chatInviteExported c0;
    public org.telegram.ui.Cells.b7 d;
    public boolean d0;
    public bi.k5 e;
    public org.telegram.ui.Cells.e9 e0;
    public di.p6 f;
    public final ArrayList f0;
    public org.telegram.ui.Cells.s4 g0;
    public pd h;
    public final int h0;
    public final long i0;
    public boolean j0;
    public final Boolean k0;
    public TLRPC.InputFile l0;
    public TLRPC.InputFile m0;
    public AnimatorSet n;
    public TLRPC.VideoSize n0;
    public String o0;
    public double p0;
    public boolean q0;
    public qd r;
    public boolean r0;
    public final org.telegram.ui.Components.k9 s;
    public Integer s0;
    public Utilities.Callback2 t0;
    public org.telegram.ui.ActionBar.a2 u0;
    public final org.telegram.ui.Components.i50 v;
    public final jd v0;
    public EditTextBoldCursor w;
    public ValueAnimator w0;
    public TLRPC.FileLocation x;
    public TLRPC.FileLocation y;

    public sd(Bundle bundle) {
        super(bundle);
        this.f0 = new ArrayList();
        this.j0 = true;
        this.v0 = new jd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.s = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            this.v = new org.telegram.ui.Components.i50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new id(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.j0 = z10;
            this.a0 = !z10;
            if (!z10 && !this.d0) {
                this.d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new id(this, 0));
            }
        }
        this.i0 = bundle.getLong("chat_id", 0L);
    }

    public static /* synthetic */ void U(sd sdVar, org.telegram.ui.ActionBar.a2 a2Var) {
        sdVar.r0 = false;
        sdVar.q0 = false;
        if (sdVar.s0 != null) {
            ConnectionsManager.getInstance(sdVar.currentAccount).cancelRequest(sdVar.s0.intValue(), true);
            sdVar.s0 = null;
        }
        sdVar.g0(false);
        a2Var.dismiss();
    }

    public static /* synthetic */ void V(sd sdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(sdVar.currentAccount).sendRequest(tL_channels_updateUsername, new id(sdVar, 1), 64);
    }

    public static /* synthetic */ void W(sd sdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(sdVar.currentAccount).getInputChannel(sdVar.i0);
        sdVar.W = ConnectionsManager.getInstance(sdVar.currentAccount).sendRequest(tL_channels_checkUsername, new fa(sdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(sd sdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.R = string;
        if (currentChannel.megagroup) {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(sdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(sdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.z0(9, sdVar, currentChannel));
        sdVar.showDialog(a2Var);
    }

    public static void Y(sd sdVar) {
        if (sdVar.u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new b1(sdVar, 12));
        sdVar.u0 = alertDialog$Builder.o();
    }

    @Override // org.telegram.ui.Components.h50
    public final void E(float f7) {
        qd qdVar = this.r;
        if (qdVar == null) {
            return;
        }
        qdVar.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.h50
    public final void K(boolean z10, boolean z11) {
        qd qdVar = this.r;
        if (qdVar == null) {
            return;
        }
        qdVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.h50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        final sd sdVar = this;
        org.telegram.ui.Components.vu vuVar = sdVar.c;
        if (vuVar != null) {
            vuVar.o();
        }
        sdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        sdVar.actionBar.setAllowOverlayTitle(true);
        sdVar.actionBar.setActionBarMenuOnItemClick(new nd(sdVar));
        org.telegram.ui.ActionBar.y n10 = sdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        final int i12 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ds dsVar = new org.telegram.ui.Components.ds(mutate, new org.telegram.ui.Components.gq(org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
        sdVar.b = dsVar;
        sdVar.a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), dsVar);
        int i13 = 2;
        int i14 = 5;
        int i15 = sdVar.h0;
        if (i15 == 0) {
            sdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            od odVar = new od(i12, context, sdVar);
            odVar.setOnTouchListener(new ci.d(i13));
            sdVar.fragmentView = odVar;
            int i16 = org.telegram.ui.ActionBar.g6.d6;
            odVar.setTag(Integer.valueOf(i16));
            sdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            LinearLayout linearLayout = new LinearLayout(context);
            sdVar.K = linearLayout;
            linearLayout.setOrientation(1);
            odVar.addView(sdVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            sdVar.K.addView(frameLayout, w7.a6.n(-1, -2));
            bi.k5 k5Var = new bi.k5(sdVar, context, i14);
            sdVar.e = k5Var;
            k5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.k9 k9Var = sdVar.s;
            k9Var.n(5L, null, null);
            sdVar.e.setImageDrawable(k9Var);
            bi.k5 k5Var2 = sdVar.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(k5Var2, w7.a6.a(64.0f, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f, 64, (z10 ? 5 : 3) | 48));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            di.p6 p6Var = new di.p6(sdVar, context, paint, i13);
            sdVar.f = p6Var;
            p6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            di.p6 p6Var2 = sdVar.f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(p6Var2, w7.a6.a(64.0f, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f, 64, (z11 ? 5 : 3) | 48));
            sdVar.f.setOnClickListener(new kd(sdVar, i10));
            sdVar.J = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            pd pdVar = new pd(sdVar, context, 0);
            sdVar.h = pdVar;
            pdVar.setScaleType(ImageView.ScaleType.CENTER);
            sdVar.h.setAnimation(sdVar.J);
            sdVar.h.setEnabled(false);
            sdVar.h.setClickable(false);
            sdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            pd pdVar2 = sdVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(pdVar2, w7.a6.a(64.0f, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f, 64, (z12 ? 5 : 3) | 48));
            qd qdVar = new qd(sdVar, context, i12);
            sdVar.r = qdVar;
            qdVar.setSize(AndroidUtilities.dp(30.0f));
            sdVar.r.setProgressColor(-1);
            sdVar.r.setNoProgress(false);
            qd qdVar2 = sdVar.r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(qdVar2, w7.a6.a(64.0f, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f, 64, (z13 ? 5 : 3) | 48));
            sdVar.e0(false, false);
            org.telegram.ui.Components.vu vuVar2 = new org.telegram.ui.Components.vu(context, odVar, this, 0, false, null);
            sdVar = this;
            sdVar.c = vuVar2;
            vuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = sdVar.E;
            if (str != null) {
                sdVar.c.setText(str);
                sdVar.E = null;
            }
            sdVar.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            sdVar.c.getEditText().setSingleLine(true);
            sdVar.c.getEditText().setImeOptions(5);
            sdVar.c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(sdVar) { // from class: org.telegram.ui.ld
                public final /* synthetic */ sd b;

                {
                    this.b = sdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i12) {
                        case 0:
                            sd sdVar2 = this.b;
                            if (i17 != 5) {
                                sdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(sdVar2.c.getEditText().getText())) {
                                sdVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i17 == 6 && (u0Var = this.b.a) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            org.telegram.ui.Components.vu vuVar3 = sdVar.c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(vuVar3, w7.a6.a(-2.0f, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f, -1, 16));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            sdVar.w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            sdVar.w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = sdVar.w;
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
            sdVar.w.setBackgroundDrawable(null);
            sdVar.w.setLineColors(sdVar.getThemedColor(org.telegram.ui.ActionBar.g6.k6), sdVar.getThemedColor(org.telegram.ui.ActionBar.g6.l6), sdVar.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
            sdVar.w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            sdVar.w.setGravity(LocaleController.isRTL ? 5 : 3);
            sdVar.w.setInputType(180225);
            sdVar.w.setImeOptions(6);
            sdVar.w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            sdVar.w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            sdVar.w.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
            sdVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            sdVar.w.setCursorWidth(1.5f);
            sdVar.K.addView(sdVar.w, w7.a6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            sdVar.w.setOnEditorActionListener(new TextView.OnEditorActionListener(sdVar) { // from class: org.telegram.ui.ld
                public final /* synthetic */ sd b;

                {
                    this.b = sdVar;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i172, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i10) {
                        case 0:
                            sd sdVar2 = this.b;
                            if (i172 != 5) {
                                sdVar2.getClass();
                                break;
                            } else if (!TextUtils.isEmpty(sdVar2.c.getEditText().getText())) {
                                sdVar2.w.requestFocus();
                                break;
                            }
                            break;
                        default:
                            if (i172 == 6 && (u0Var = this.b.a) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                    return true;
                }
            });
            sdVar.w.addTextChangedListener(new rd(0));
            TextView textView = new TextView(context);
            sdVar.T = textView;
            textView.setTextSize(1, 15.0f);
            sdVar.T.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F6, false));
            sdVar.T.setGravity(LocaleController.isRTL ? 5 : 3);
            sdVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            sdVar.K.addView(sdVar.T, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            sdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            sdVar.K = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(sdVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = sdVar.getMessagesController();
            long j10 = sdVar.i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            sdVar.I = z15;
            sdVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = sdVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.g6.a7;
            view.setTag(Integer.valueOf(i18));
            sdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            sdVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = sdVar.G;
            int i19 = org.telegram.ui.ActionBar.g6.d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i19, false));
            sdVar.G.setText(LocaleController.getString(sdVar.I ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            sdVar.K.addView(sdVar.G);
            LinearLayout linearLayout3 = new LinearLayout(context);
            sdVar.F = linearLayout3;
            linearLayout3.setOrientation(1);
            sdVar.F.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i19, false));
            sdVar.K.addView(sdVar.F, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            sdVar.Q = j6Var;
            j6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
            Boolean bool = sdVar.k0;
            if (bool != null && !bool.booleanValue()) {
                sdVar.a0 = true;
            }
            if (sdVar.I) {
                sdVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !sdVar.a0);
            } else {
                sdVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !sdVar.a0);
            }
            sdVar.Q.setOnClickListener(new kd(sdVar, i13));
            if (bool == null || bool.booleanValue()) {
                sdVar.F.addView(sdVar.Q, w7.a6.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            sdVar.R = j6Var2;
            j6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
            if (bool != null && bool.booleanValue()) {
                sdVar.a0 = false;
            }
            if (sdVar.I) {
                sdVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, sdVar.a0);
            } else {
                sdVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, sdVar.a0);
            }
            sdVar.R.setOnClickListener(new kd(sdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                sdVar.F.addView(sdVar.R, w7.a6.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
            sdVar.d = b7Var;
            sdVar.K.addView(b7Var, w7.a6.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            sdVar.M = linearLayout4;
            linearLayout4.setOrientation(1);
            sdVar.M.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i19, false));
            sdVar.K.addView(sdVar.M, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
            sdVar.V = m4Var3;
            sdVar.M.addView(m4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            sdVar.N = linearLayout5;
            linearLayout5.setOrientation(0);
            sdVar.M.addView(sdVar.N, w7.a6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            sdVar.H = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(sdVar.currentAccount).linkPrefix + "/");
            sdVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = sdVar.H;
            int i20 = org.telegram.ui.ActionBar.g6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i20, false));
            EditTextBoldCursor editTextBoldCursor5 = sdVar.H;
            int i21 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i21, false));
            sdVar.H.setMaxLines(1);
            sdVar.H.setLines(1);
            sdVar.H.setEnabled(false);
            sdVar.H.setBackgroundDrawable(null);
            sdVar.H.setPadding(0, 0, 0, 0);
            sdVar.H.setSingleLine(true);
            sdVar.H.setInputType(163840);
            sdVar.H.setImeOptions(6);
            sdVar.N.addView(sdVar.H, w7.a6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            sdVar.w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            sdVar.w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i20, false));
            sdVar.w.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i21, false));
            sdVar.w.setMaxLines(1);
            sdVar.w.setLines(1);
            sdVar.w.setBackgroundDrawable(null);
            sdVar.w.setPadding(0, 0, 0, 0);
            sdVar.w.setSingleLine(true);
            sdVar.w.setInputType(163872);
            sdVar.w.setImeOptions(6);
            sdVar.w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            sdVar.w.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i21, false));
            sdVar.w.setCursorSize(AndroidUtilities.dp(20.0f));
            sdVar.w.setCursorWidth(1.5f);
            sdVar.N.addView(sdVar.w, w7.a6.n(-1, 36));
            sdVar.w.addTextChangedListener(new n0(sdVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            sdVar.O = linearLayout6;
            linearLayout6.setOrientation(1);
            sdVar.M.addView(sdVar.O, w7.a6.n(-1, -2));
            org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(context, sdVar, null, true, ChatObject.isChannel(sdVar.getMessagesController().getChat(Long.valueOf(j10))));
            sdVar.P = w90Var;
            w90Var.b(true);
            sdVar.P.d(0, null, false);
            sdVar.O.addView(sdVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(sdVar, context, 3);
            sdVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
            sdVar.U.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K6, false));
            sdVar.U.setTextSize(1, 15.0f);
            sdVar.U.setGravity(LocaleController.isRTL ? 5 : 3);
            sdVar.U.setVisibility(8);
            sdVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            sdVar.M.addView(sdVar.U, w7.a6.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            sdVar.S = e9Var;
            int i22 = R.drawable.greydivider_bottom;
            int i23 = org.telegram.ui.ActionBar.g6.b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, i22, i23));
            sdVar.K.addView(sdVar.S, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            sdVar.g0 = s4Var;
            sdVar.K.addView(s4Var, w7.a6.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            sdVar.L = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i19, false));
            sdVar.L.setOrientation(1);
            sdVar.K.addView(sdVar.L, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            sdVar.e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, i23));
            sdVar.K.addView(sdVar.e0, w7.a6.n(-1, -2));
            sdVar.h0();
        }
        return sdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.U.setVisibility(8);
        } else {
            this.U.setVisibility(0);
        }
        fc fcVar = this.Y;
        if (fcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fcVar);
            this.Y = null;
            this.X = null;
            if (this.W != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
            }
        }
        this.Z = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var = this.U;
                int i10 = org.telegram.ui.ActionBar.g6.p7;
                y1Var.setTag(Integer.valueOf(i10));
                this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (i11 == 0 && charAt >= '0' && charAt <= '9') {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.y1 y1Var2 = this.U;
                    int i12 = org.telegram.ui.ActionBar.g6.p7;
                    y1Var2.setTag(Integer.valueOf(i12));
                    this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.y1 y1Var3 = this.U;
                    int i13 = org.telegram.ui.ActionBar.g6.p7;
                    y1Var3.setTag(Integer.valueOf(i13));
                    this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.y1 y1Var4 = this.U;
            int i14 = org.telegram.ui.ActionBar.g6.p7;
            y1Var4.setTag(Integer.valueOf(i14));
            this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.g6.p7;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            return false;
        }
        this.U.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.g6.F6;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
        this.X = str;
        fc fcVar2 = new fc(4, this, str);
        this.Y = fcVar2;
        AndroidUtilities.runOnUIThread(fcVar2, 300L);
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.a2 a2Var = this.u0;
            if (a2Var != null) {
                try {
                    a2Var.dismiss();
                    this.u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.r0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.a2 a2Var2 = this.u0;
            if (a2Var2 != null) {
                try {
                    a2Var2.dismiss();
                    this.u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.j0);
            Boolean bool = this.k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.l0 != null || this.m0 != null || this.n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.l0, this.m0, this.n0, this.p0, this.o0, this.x, this.y, null);
            }
            sd sdVar = new sd(bundle);
            sdVar.t0 = this.t0;
            presentFragment(sdVar, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var == null || !i50Var.f(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.i50 i50Var = this.v;
        return (i50Var == null || dialog != i50Var.c) && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        if (!z11) {
            if (z10) {
                this.h.setAlpha(1.0f);
                this.h.setVisibility(4);
                this.r.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            }
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.r.setAlpha(0.0f);
            this.r.setVisibility(4);
            return;
        }
        this.n = new AnimatorSet();
        if (z10) {
            this.r.setVisibility(0);
            AnimatorSet animatorSet2 = this.n;
            pd pdVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(pdVar, (Property<pd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<qd, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.n;
            pd pdVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(pdVar2, (Property<pd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<qd, Float>) property2, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new ah.p0(28, this, z10));
        this.n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.v0 = true;
        j0Var.H0 = new jd(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.v0);
        }
        if (this.b != null) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.c, z10 ? 1.0f : 0.0f);
            this.w0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 4));
            this.w0.setDuration((long) (Math.abs(this.b.c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.w0.setInterpolator(org.telegram.ui.Components.es.f);
            this.w0.start();
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ kv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.h50
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        org.telegram.ui.Components.vu vuVar = this.c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.vu vuVar2 = this.c;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar2, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Components.vu vuVar3 = this.c;
        int i13 = org.telegram.ui.ActionBar.g6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.vu vuVar4 = this.c;
        int i14 = org.telegram.ui.ActionBar.g6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, TLObject.FLAG_23, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.g6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.b7 b7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(b7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, TLObject.FLAG_23, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.g6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.a0 || this.j0) {
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            e9Var.setTag(Integer.valueOf(i11));
            this.S.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
            this.d.setVisibility(0);
            this.e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var2 = this.S;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            this.M.setVisibility(0);
            this.g0.setVisibility(8);
            if (this.I) {
                this.S.setText(LocaleController.getString(this.a0 ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.V.setText(LocaleController.getString(this.a0 ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.S.setText(LocaleController.getString(this.a0 ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.V.setText(LocaleController.getString(this.a0 ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.N.setVisibility(this.a0 ? 8 : 0);
            this.O.setVisibility(this.a0 ? 0 : 8);
            this.M.setPadding(0, 0, 0, this.a0 ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.w90 w90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.c0;
            w90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.a0 && y1Var.length() != 0) {
                i10 = 0;
            }
            y1Var.setVisibility(i10);
        } else {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var3 = this.S;
            int i12 = org.telegram.ui.ActionBar.g6.p7;
            e9Var3.setTag(Integer.valueOf(i12));
            this.S.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var4 = this.S;
                e9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(e9Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                this.e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var5 = this.S;
                e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(e9Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                this.g0.setVisibility(8);
                this.L.setVisibility(0);
                this.e0.setVisibility(0);
            }
        }
        this.Q.a(!this.a0);
        this.R.a(this.a0);
        this.w.clearFocus();
        AndroidUtilities.hideKeyboard(this.w);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.vu vuVar = this.c;
        if (vuVar == null || !vuVar.e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        vuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.h0 == 1 && !this.b0 && this.c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.c0 = chatFull.exported_invite;
            }
            if (this.c0 == null) {
                this.b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new id(this, 3));
            }
        }
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.a = this;
            i50Var.b = this;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.s0.intValue(), true);
            this.s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.vu vuVar = this.c;
        if (vuVar != null) {
            vuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.vu vuVar = this.c;
        if (vuVar != null) {
            vuVar.r();
        }
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.j(i10, strArr, iArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.vu vuVar = this.c;
        if (vuVar != null) {
            vuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.i50 i50Var = this.v;
        if (i50Var != null) {
            i50Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.h0 == 1) {
            return;
        }
        this.c.requestFocus();
        org.telegram.ui.Components.qu quVar = this.c.a;
        quVar.requestFocus();
        AndroidUtilities.showKeyboard(quVar);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.h0 == 0) {
            org.telegram.ui.Components.i50 i50Var = this.v;
            if (i50Var != null) {
                i50Var.f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.vu vuVar = this.c;
                if (vuVar != null) {
                    vuVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.h0 == 0) {
            org.telegram.ui.Components.i50 i50Var = this.v;
            if (i50Var != null && (str = i50Var.f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.vu vuVar = this.c;
            if (vuVar != null) {
                String obj = vuVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.h50
    public final /* synthetic */ void P() {
    }
}
