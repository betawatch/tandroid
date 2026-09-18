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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s71 extends org.telegram.ui.Components.za {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final ai.n8 Z;
    public TLObject a0;
    public final FrameLayout b0;
    public final k71 c0;
    public final m71 d0;
    public final r71 e0;
    public final r71 f0;
    public final r71 g0;
    public final ci.d h0;
    public org.telegram.ui.Components.x51 i0;
    public Context j0;

    public s71(Context context, TLRPC.Chat chat, TLRPC.User user, ai.n8 n8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.a0 = user;
        this.Z = n8Var;
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
        k71 k71Var = new k71(context);
        this.c0 = k71Var;
        k71Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.R5));
        k71Var.setHintTextColor(getThemedColor(i10));
        k71Var.setTextSize(1, 15.0f);
        k71Var.setSingleLine(true);
        k71Var.setBackground(null);
        k71Var.setCursorWidth(1.5f);
        k71Var.setGravity(112);
        k71Var.setClipToPadding(true);
        k71Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        k71Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        k71Var.setInputType(k71Var.getInputType() | TLObject.FLAG_19);
        k71Var.setImeOptions(33554435);
        k71Var.setTextIsSelectable(false);
        k71Var.setOnEditorActionListener(new ka(this, 11));
        k71Var.addTextChangedListener(new l71(this));
        k71Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(k71Var, w7.x5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.x5.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        m71 m71Var = new m71(context);
        this.d0 = m71Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        u9Var.setImageDrawable(new org.telegram.ui.Components.yi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        m71Var.addView(u9Var, w7.x5.e(130, 130, 17));
        r71 r71Var = new r71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        r71Var.e.add(new g01(this, 15));
        this.e0 = r71Var;
        r71 r71Var2 = new r71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        r71Var2.e.add(new g01(this, 15));
        this.f0 = r71Var2;
        r71 r71Var3 = new r71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        r71Var3.e.add(new g01(this, 15));
        this.g0 = r71Var3;
        org.telegram.ui.Components.ml0 ml0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new b31(this, 3));
        n71 n71Var = new n71(this);
        n71Var.m = false;
        n71Var.C = false;
        n71Var.o(org.telegram.ui.Components.qr.h);
        n71Var.n(350L);
        this.d.setItemAnimator(n71Var);
        this.d.addOnLayoutChangeListener(new o71(this));
        this.d.j(new p71(this));
        this.containerView.addView(new q71(this, getContext()), w7.x5.e(-1, 68, 87));
        ci.d dVar = new ci.d(getContext(), f6Var, true);
        dVar.setRoundRadius(24);
        this.h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.x5.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new i41(this, 4));
        org.telegram.ui.Components.x51 x51Var = this.i0;
        if (x51Var != null) {
            x51Var.N(false);
        }
        r71Var.b();
        r71Var2.b();
    }

    public static /* synthetic */ void P(s71 s71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            s71Var.X = MessagesController.getInstance(s71Var.currentAccount).getChat(Long.valueOf(j3));
            s71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(s71 s71Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        r71 r71Var = s71Var.g0;
        r71 r71Var2 = s71Var.f0;
        TLRPC.User user = s71Var.Y;
        r71 r71Var3 = s71Var.e0;
        if (r71Var3 != null) {
            ArrayList arrayList2 = r71Var3.d;
            if (r71Var2 == null) {
                return;
            }
            ArrayList arrayList3 = r71Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(s71Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.j51.D(3, AndroidUtilities.dp(64.0f)));
            if (r71Var != null && !TextUtils.isEmpty(r71Var.c.q)) {
                ArrayList arrayList4 = r71Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.j51 v = org.telegram.ui.Components.j51.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(s71Var.a0));
                        arrayList.add(v);
                    }
                }
                if (r71Var.f) {
                    arrayList.add(org.telegram.ui.Components.j51.n(29));
                    arrayList.add(org.telegram.ui.Components.j51.n(29));
                    arrayList.add(org.telegram.ui.Components.j51.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.j51.k(s71Var.d0));
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
                            arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(s71Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.j51 v9 = org.telegram.ui.Components.j51.v(user);
                            v9.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(s71Var.a0));
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
                        arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(s71Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.j51 v10 = org.telegram.ui.Components.j51.v(tLObject2);
                    v10.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(s71Var.a0));
                    arrayList.add(v10);
                }
            }
            if (r71Var3.f) {
                arrayList.add(org.telegram.ui.Components.j51.n(29));
                arrayList.add(org.telegram.ui.Components.j51.n(29));
                arrayList.add(org.telegram.ui.Components.j51.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(s71Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.j51 v11 = org.telegram.ui.Components.j51.v(user);
                v11.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(s71Var.a0));
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
                        arrayList.add(org.telegram.ui.Components.j51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(s71Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.j51 v12 = org.telegram.ui.Components.j51.v(tLObject3);
                    v12.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(s71Var.a0));
                    arrayList.add(v12);
                }
            }
            if (arrayList3.isEmpty() || !r71Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.j51.n(29));
            arrayList.add(org.telegram.ui.Components.j51.n(29));
            arrayList.add(org.telegram.ui.Components.j51.n(29));
        }
    }

    public static void R(final s71 s71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                ai.n8 n8Var = s71Var.Z;
                if (n8Var != null) {
                    n8Var.run();
                }
                s71Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (s71Var.j0 == null) {
            return;
        }
        int i10 = 8;
        final int i11 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s71Var.j0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(s71Var.X) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, s71Var.X.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new tv0(i10, s71Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(s71Var) { // from class: org.telegram.ui.j71
                    public final /* synthetic */ s71 b;

                    {
                        this.b = s71Var;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                        switch (i11) {
                            case 0:
                                this.b.h0.setLoading(false);
                                break;
                            case 1:
                                s71 s71Var2 = this.b;
                                s71Var2.getClass();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    s71Var2.dismiss();
                                    U.presentFragment(new ih1(6, null));
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
                ConnectionsManager.getInstance(s71Var.currentAccount).sendRequest(new TL_account.getPassword(), new ps0(s71Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.c5.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(s71Var.X), ChatObject.isCommunity(s71Var.X), tL_channels_editCreator);
                return;
            }
            if (s71Var.j0 != null && !AccountInstance.getInstance(s71Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                s71Var.showDialog(new rg.j0(5, s71Var.currentAccount, s71Var.j0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            s71Var.dismiss();
            U3.presentFragment(new ue1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s71Var.j0);
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(s71Var.j0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(s71Var.j0);
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(s71Var.X)) {
            org.telegram.messenger.wl.p(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.wl.p(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(s71Var.j0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(s71Var.j0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(s71Var.j0);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
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
        LinearLayout linearLayout3 = new LinearLayout(s71Var.j0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(s71Var.j0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i12, false), mode));
        TextView textView3 = new TextView(s71Var.j0);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
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
            final int i13 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(s71Var) { // from class: org.telegram.ui.j71
                public final /* synthetic */ s71 b;

                {
                    this.b = s71Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i122) {
                    switch (i13) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            s71 s71Var2 = this.b;
                            s71Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                s71Var2.dismiss();
                                U4.presentFragment(new ih1(6, null));
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
            final int i14 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(s71Var) { // from class: org.telegram.ui.j71
                public final /* synthetic */ s71 b;

                {
                    this.b = s71Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i122) {
                    switch (i14) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            s71 s71Var2 = this.b;
                            s71Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                s71Var2.dismiss();
                                U4.presentFragment(new ih1(6, null));
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
            TextView textView4 = new TextView(s71Var.j0);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i15 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(s71Var) { // from class: org.telegram.ui.j71
                public final /* synthetic */ s71 b;

                {
                    this.b = s71Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i122) {
                    switch (i15) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            s71 s71Var2 = this.b;
                            s71Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                s71Var2.dismiss();
                                U4.presentFragment(new ih1(6, null));
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

    public static void S(s71 s71Var) {
        org.telegram.ui.Components.ml0 ml0Var = s71Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        s71Var.b0.setTranslationY(f7);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.j0 = getContext();
        }
        if (this.j0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ci.kd(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 11));
    }

    public final void U(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.X) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        ci.d dVar = this.h0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.a0), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.e0.a();
        this.f0.a();
        this.g0.a();
    }

    @Override // org.telegram.ui.Components.za
    public final org.telegram.ui.Components.ll0 v(org.telegram.ui.Components.ml0 ml0Var) {
        org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(ml0Var, getContext(), this.currentAccount, 0, false, new b5(this, 23), this.resourcesProvider);
        this.i0 = x51Var;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
