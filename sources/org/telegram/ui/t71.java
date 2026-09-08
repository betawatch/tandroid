package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t71 extends org.telegram.ui.Components.bb {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final ah.g Z;
    public TLObject a0;
    public final FrameLayout b0;
    public final l71 c0;
    public final n71 d0;
    public final s71 e0;
    public final s71 f0;
    public final s71 g0;
    public final di.d h0;
    public org.telegram.ui.Components.v51 i0;
    public Context j0;

    public t71(Context context, TLRPC.Chat chat, TLRPC.User user, ah.g gVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.a0 = user;
        this.Z = gVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.j6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.j6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w7.x5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        l71 l71Var = new l71(context);
        this.c0 = l71Var;
        l71Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.R5));
        l71Var.setHintTextColor(getThemedColor(i10));
        l71Var.setTextSize(1, 15.0f);
        l71Var.setSingleLine(true);
        l71Var.setBackground(null);
        l71Var.setCursorWidth(1.5f);
        l71Var.setGravity(112);
        l71Var.setClipToPadding(true);
        l71Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        l71Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        l71Var.setInputType(l71Var.getInputType() | TLObject.FLAG_19);
        l71Var.setImeOptions(33554435);
        l71Var.setTextIsSelectable(false);
        l71Var.setOnEditorActionListener(new ia(this, 11));
        l71Var.addTextChangedListener(new m71(this));
        l71Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(l71Var, w7.x5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.x5.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        n71 n71Var = new n71(context);
        this.d0 = n71Var;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        x9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        n71Var.addView(x9Var, w7.x5.e(130, 130, 17));
        s71 s71Var = new s71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        s71Var.e.add(new f01(this, 15));
        this.e0 = s71Var;
        s71 s71Var2 = new s71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        s71Var2.e.add(new f01(this, 15));
        this.f0 = s71Var2;
        s71 s71Var3 = new s71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        s71Var3.e.add(new f01(this, 15));
        this.g0 = s71Var3;
        org.telegram.ui.Components.ll0 ll0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new b31(this, 3));
        o71 o71Var = new o71(this);
        o71Var.m = false;
        o71Var.C = false;
        o71Var.o(org.telegram.ui.Components.pr.h);
        o71Var.n(350L);
        this.d.setItemAnimator(o71Var);
        this.d.addOnLayoutChangeListener(new p71(this));
        this.d.j(new q71(this));
        this.containerView.addView(new r71(this, getContext()), w7.x5.e(-1, 68, 87));
        di.d dVar = new di.d(getContext(), f6Var, true);
        dVar.setRoundRadius(24);
        this.h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.x5.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new j41(this, 4));
        org.telegram.ui.Components.v51 v51Var = this.i0;
        if (v51Var != null) {
            v51Var.N(false);
        }
        s71Var.b();
        s71Var2.b();
    }

    public static /* synthetic */ void P(t71 t71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            t71Var.X = MessagesController.getInstance(t71Var.currentAccount).getChat(Long.valueOf(j3));
            t71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(t71 t71Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        s71 s71Var = t71Var.g0;
        s71 s71Var2 = t71Var.f0;
        TLRPC.User user = t71Var.Y;
        s71 s71Var3 = t71Var.e0;
        if (s71Var3 != null) {
            ArrayList arrayList2 = s71Var3.d;
            if (s71Var2 == null) {
                return;
            }
            ArrayList arrayList3 = s71Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(t71Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.h51.D(3, AndroidUtilities.dp(64.0f)));
            if (s71Var != null && !TextUtils.isEmpty(s71Var.c.q)) {
                ArrayList arrayList4 = s71Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.h51 v = org.telegram.ui.Components.h51.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(t71Var.a0));
                        arrayList.add(v);
                    }
                }
                if (s71Var.f) {
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                    arrayList.add(org.telegram.ui.Components.h51.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.h51.k(t71Var.d0));
                    return;
                }
                return;
            }
            if (user != null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                            arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(t71Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.h51 v9 = org.telegram.ui.Components.h51.v(user);
                            v9.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(t71Var.a0));
                            arrayList.add(v9);
                            z10 = false;
                        }
                    }
                }
            }
            z10 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(t71Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.h51 v10 = org.telegram.ui.Components.h51.v(tLObject2);
                    v10.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(t71Var.a0));
                    arrayList.add(v10);
                }
            }
            if (s71Var3.f) {
                arrayList.add(org.telegram.ui.Components.h51.n(29));
                arrayList.add(org.telegram.ui.Components.h51.n(29));
                arrayList.add(org.telegram.ui.Components.h51.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(t71Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.h51 v11 = org.telegram.ui.Components.h51.v(user);
                v11.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(t71Var.a0));
                arrayList.add(v11);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(t71Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.h51 v12 = org.telegram.ui.Components.h51.v(tLObject3);
                    v12.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(t71Var.a0));
                    arrayList.add(v12);
                }
            }
            if (arrayList3.isEmpty() || !s71Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.h51.n(29));
            arrayList.add(org.telegram.ui.Components.h51.n(29));
            arrayList.add(org.telegram.ui.Components.h51.n(29));
        }
    }

    public static void R(final t71 t71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                ah.g gVar = t71Var.Z;
                if (gVar != null) {
                    gVar.run();
                }
                t71Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (t71Var.j0 == null) {
            return;
        }
        final int i10 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t71Var.j0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(t71Var.X) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, t71Var.X.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new qv0(9, t71Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(t71Var) { // from class: org.telegram.ui.k71
                    public final /* synthetic */ t71 b;

                    {
                        this.b = t71Var;
                    }

                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                        switch (i10) {
                            case 0:
                                this.b.h0.setLoading(false);
                                break;
                            case 1:
                                t71 t71Var2 = this.b;
                                t71Var2.getClass();
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null) {
                                    t71Var2.dismiss();
                                    U.presentFragment(new hh1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.h0.setLoading(false);
                                break;
                            default:
                                this.b.h0.setLoading(false);
                                break;
                        }
                    }
                });
                alertDialog$Builder.o();
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(t71Var.currentAccount).sendRequest(new TL_account.getPassword(), new ms0(t71Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.e5.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(t71Var.X), ChatObject.isCommunity(t71Var.X), tL_channels_editCreator);
                return;
            }
            if (t71Var.j0 != null && !AccountInstance.getInstance(t71Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                t71Var.showDialog(new sg.k0(5, t71Var.currentAccount, t71Var.j0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            t71Var.dismiss();
            U3.presentFragment(new te1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t71Var.j0);
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(t71Var.j0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(t71Var.j0);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(t71Var.X)) {
            org.telegram.messenger.wl.p(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.wl.p(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(t71Var.j0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(t71Var.j0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(t71Var.j0);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.w1.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
            linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.x5.n(-2, -2));
            linearLayout2.addView(textView2, w7.x5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(t71Var.j0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(t71Var.j0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(t71Var.j0);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.w1.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, w7.x5.n(-1, -2));
            linearLayout3.addView(imageView2, w7.x5.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, w7.x5.n(-2, -2));
            linearLayout3.addView(textView3, w7.x5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i12 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.a2(t71Var) { // from class: org.telegram.ui.k71
                public final /* synthetic */ t71 b;

                {
                    this.b = t71Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i112) {
                    switch (i12) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            t71 t71Var2 = this.b;
                            t71Var2.getClass();
                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                t71Var2.dismiss();
                                U4.presentFragment(new hh1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
            final int i13 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(t71Var) { // from class: org.telegram.ui.k71
                public final /* synthetic */ t71 b;

                {
                    this.b = t71Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i112) {
                    switch (i13) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            t71 t71Var2 = this.b;
                            t71Var2.getClass();
                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                t71Var2.dismiss();
                                U4.presentFragment(new hh1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(t71Var.j0);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i14 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2(t71Var) { // from class: org.telegram.ui.k71
                public final /* synthetic */ t71 b;

                {
                    this.b = t71Var;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i112) {
                    switch (i14) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            t71 t71Var2 = this.b;
                            t71Var2.getClass();
                            org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                t71Var2.dismiss();
                                U4.presentFragment(new hh1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void S(t71 t71Var) {
        org.telegram.ui.Components.ll0 ll0Var = t71Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= ll0Var.getChildCount()) {
                break;
            }
            View childAt = ll0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        t71Var.b0.setTranslationY(f7);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.j0 = getContext();
        }
        if (this.j0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.j0, this.X.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 17));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.X)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.X;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new di.kd(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 11));
    }

    public final void U(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.X) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        di.d dVar = this.h0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.a0), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.e0.a();
        this.f0.a();
        this.g0.a();
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.kl0 v(org.telegram.ui.Components.ll0 ll0Var) {
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(ll0Var, getContext(), this.currentAccount, 0, false, new b5(this, 23), this.resourcesProvider);
        this.i0 = v51Var;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
