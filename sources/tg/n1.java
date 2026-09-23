package tg;

import ai.n8;
import ai.s5;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l20;
import org.telegram.ui.py0;
import org.telegram.ui.s20;
import org.telegram.ui.xn;
import w7.x5;
import w7.z5;
import xh.r1;
import yh.h7;
import yh.t5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class n1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static g1 G0;
    public s20 A0;
    public i2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final k1 Y;
    public final i1 Z;
    public final j1 a0;
    public final h1 b0;
    public final op c0;
    public final l20 d0;
    public final FrameLayout e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public final HashSet h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final HashMap l0;
    public final ArrayList m0;
    public final LinkedHashMap n0;
    public String o0;
    public ug.h p0;
    public int q0;
    public final ArrayList r0;
    public boolean s0;
    public float t0;
    public sa0 u0;
    public final BirthdayController.BirthdayState v0;
    public final qg.b0 w0;
    public int x0;
    public qq y0;
    public String z0;

    public n1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, d6 d6Var) {
        super(context, null, true, false, d6Var);
        this.f0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.g0 = arrayList;
        HashSet hashSet = new HashSet();
        this.h0 = hashSet;
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.m0 = new ArrayList();
        this.n0 = new LinkedHashMap();
        this.q0 = AndroidUtilities.dp(120.0f);
        this.r0 = new ArrayList();
        this.s0 = false;
        this.w0 = new qg.b0(this, 4);
        this.x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i12 = h6.h5;
        fixNavigationBar(h6.v0(i12, d6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.v0 = birthdayState;
        ug.h hVar = this.p0;
        if (hVar != null) {
            hVar.x = i11 == 4;
        }
        h1 h1Var = new h1(getContext(), d6Var);
        this.b0 = h1Var;
        h1Var.setOnCloseClickListener(new b1(this, 11));
        h1Var.setText(y());
        h1Var.setCloseImageVisible(false);
        h1Var.e.c(0.0f, false);
        this.u0 = new sa0(this, 2);
        i1 i1Var = new i1(this, getContext(), d6Var);
        this.Z = i1Var;
        i1Var.setBackgroundColor(getThemedColor(i12));
        i1Var.setOnSearchTextChange(new c1(this, 3));
        i1Var.b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        j1 j1Var = new j1(this, getContext());
        this.a0 = j1Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(h1Var, 0, x5.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(i1Var, x5.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(j1Var, x5.f(1.0f, 55, i15, 0, i15, 0));
        l20 l20Var = new l20(getContext(), d6Var, (ml0) null);
        this.d0 = l20Var;
        l20Var.setClickable(true);
        l20Var.setOrientation(1);
        l20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        l20Var.setBackgroundColor(h6.v0(i12, d6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(h6.Y(getThemedColor(h6.i6), 6, 6));
            op opVar = new op(context, 24, d6Var);
            this.c0 = opVar;
            opVar.b(h6.Oh, h6.j7, h6.k7);
            opVar.setDrawUnchecked(true);
            opVar.a(false, false);
            opVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(opVar, x5.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(h6.j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
            z5.b(linearLayout, 0.025f, 1.5f);
            final int i16 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.c0.a(!r3.a.q, true);
                            break;
                        default:
                            this.b.d0();
                            break;
                    }
                }
            });
            l20Var.addView(linearLayout, x5.t(-2, -2, 17, 0, 0, 0, 8));
        }
        k1 k1Var = new k1(this, getContext(), d6Var);
        this.Y = k1Var;
        if (i11 == 4) {
            l20Var.setAlpha(0.0f);
            l20Var.setVisibility(8);
        }
        final int i17 = 1;
        k1Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.c0.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.d0();
                        break;
                }
            }
        });
        l20Var.addView(k1Var, x5.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(l20Var, x5.f(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, x5.f(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        ug.h hVar2 = this.p0;
        ml0 ml0Var = this.d;
        hVar2.n = arrayList;
        hVar2.f = ml0Var;
        int i20 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(i11 != 1 ? 60.0f : 0.0f));
        this.d.j(new l1(this));
        this.d.setOnItemClickListener(new wt(this, i11, d6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((dl0) new i2.s(this, i11, 19));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(rr.h);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new m1(this));
        i1Var.setText("");
        i1Var.d.b(false);
        i1Var.b(false, hashSet, new b1(this, 12), null);
        h1Var.setText(y());
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            t.j(i10, null, new c1(this, 0));
        }
        if (i11 == 0 || i11 == 2) {
            t5.y(i10, false).V();
        }
    }

    public static /* synthetic */ void P(n1 n1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = n1Var.k0;
        arrayList.clear();
        n1Var.x0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(n1Var.currentAccount);
            int i10 = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.Peer peer = arrayList2.get(i11);
                i11++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i10 < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i10);
                i10++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        n1Var.i0(true, true);
    }

    public static void Q(n1 n1Var, int i10, d6 d6Var, int i11, View view) {
        l20 l20Var = n1Var.d0;
        i1 i1Var = n1Var.Z;
        HashSet hashSet = n1Var.h0;
        int i12 = 2;
        if (view instanceof s8) {
            if (i10 != 4) {
                e5.m(n1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new c1(n1Var, i12), new b1(n1Var, 9), false, false, n1Var.resourcesProvider).a.show();
                return;
            }
            s20 s20Var = n1Var.A0;
            if (s20Var != null) {
                s20Var.run();
                n1Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                i2 i2Var = n1Var.B0;
                if (i2Var != null) {
                    i2Var.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.id : -chat.id;
            if (i10 == 3) {
                i2 i2Var2 = n1Var.B0;
                if (i2Var2 != null) {
                    i2Var2.run(Long.valueOf(j3));
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (i1Var != null) {
                    AndroidUtilities.hideKeyboard(i1Var.getEditText());
                }
                h7 h7Var = new h7(n1Var.getContext(), d6Var, user, new b1(n1Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    h7Var.makeAttached(n1Var.attachedFragment);
                }
                h7Var.show();
                return;
            }
            if (i10 == 0 || i10 == 2) {
                if (UserObject.areGiftsDisabled(j3)) {
                    new xc(n1Var.container, d6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                    return;
                }
                r1 r1Var = new r1(n1Var.getContext(), i11, j3, t.c(t.b(1, n1Var.r0)), new c1(n1Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = n1Var.v0;
                r1Var.V(birthdayState != null && birthdayState.contains(j3));
                r1Var.show();
                return;
            }
            if (i10 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j3));
                Utilities.Callback2 callback2 = n1Var.D0;
                if (callback2 != null) {
                    op opVar = n1Var.c0;
                    callback2.run(Boolean.valueOf(opVar != null && opVar.a.q), hashSet);
                    n1Var.D0 = null;
                }
                n1Var.dismiss();
                return;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                n1Var.n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == n1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                n1Var.f0();
                return;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                l20Var.setVisibility(0);
                l20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(rr.h).setDuration(320L).withEndAction(!z11 ? new b1(n1Var, true ? 1 : 0) : null).start();
                ug.h hVar = n1Var.p0;
                boolean z12 = !z11;
                if (hVar.y != z12) {
                    hVar.y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f, (Utilities.Callback<View>) new ug.f(z12));
                }
            }
            n1Var.W();
            i1Var.b(true, hashSet, new b1(n1Var, i12), null);
            n1Var.i0(true, true);
            n1Var.X();
        }
    }

    public static void R(n1 n1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = n1Var.e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            qc Q = new xc(frameLayout, n1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.j = 5000;
            Q.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(n1Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.z0.o(R.string.UnknownError, new xc(frameLayout, n1Var.resourcesProvider), R.raw.error, 36);
        } else if (n1Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n1Var.getContext(), 0, n1Var.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            hg.c.A(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void S(final n1 n1Var, final TLRPC.User user, View view) {
        o70 F = o70.F(n1Var.container, n1Var.resourcesProvider, (View) view.getParent());
        final int i10 = 0;
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(n1Var) { // from class: tg.e1
            public final /* synthetic */ n1 b;

            {
                this.b = n1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.b.n;
                            if (n2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                n2Var.presentFragment(new xn(bundle));
                                break;
                            } else {
                                n2 U = LaunchActivity.U();
                                l2 l2Var = new l2();
                                l2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new xn(bundle2), l2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.b.n;
                            if (n2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    l2 l2Var2 = new l2();
                                    l2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), l2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(n1Var) { // from class: tg.e1
            public final /* synthetic */ n1 b;

            {
                this.b = n1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            n2 n2Var = this.b.n;
                            if (n2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                n2Var.presentFragment(new xn(bundle));
                                break;
                            } else {
                                n2 U = LaunchActivity.U();
                                l2 l2Var = new l2();
                                l2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new xn(bundle2), l2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            n2 n2Var2 = this.b.n;
                            if (n2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                n2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    l2 l2Var2 = new l2();
                                    l2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), l2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        F.Z();
    }

    public static /* synthetic */ void T(n1 n1Var, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(n1Var.currentAccount).getUserFull(UserConfig.getInstance(n1Var.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(updatebirthday, new s5(n1Var, userFull, tL_birthday2, 20), 1024);
        MessagesController.getInstance(n1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(n1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(n1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        n1Var.h0(true, true);
    }

    public static void U(n1 n1Var, String str) {
        if (n1Var.x0 >= 0) {
            ConnectionsManager.getInstance(n1Var.currentAccount).cancelRequest(n1Var.x0, true);
            n1Var.x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        n1Var.x0 = ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(tL_contacts_search, new n8(n1Var, 21));
    }

    public static boolean a0(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String uri = data.toString();
                if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static n1 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        n2 R = LaunchActivity.R();
        if (R == null) {
            return null;
        }
        g1 g1Var = G0;
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            g1Var2.makeAttached(R);
        }
        R.showDialog(g1Var2);
        G0 = g1Var2;
        return g1Var2;
    }

    @Override // org.telegram.ui.Components.bb
    public final void B(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        h1 h1Var = this.b0;
        h1Var.setTranslationY(max);
        float translationY = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        i1 i1Var = this.Z;
        i1Var.setTranslationY(translationY);
        float translationY2 = i1Var.getTranslationY() + i1Var.getMeasuredHeight();
        this.a0.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (i1Var.getMeasuredHeight() + h1Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final int V(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.id)) {
                long j3 = user.id;
                if (j3 != 0 && !this.C0.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    ug.g c10 = ug.g.c(user, hashSet.contains(Long.valueOf(user.id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(ug.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (!this.h0.isEmpty() || (i10 = this.X) == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            if (this.s0) {
                return;
            }
            this.s0 = true;
            AndroidUtilities.runOnUIThread(new b1(this, 3), 10L);
            return;
        }
        if (this.s0) {
            this.s0 = false;
            AndroidUtilities.runOnUIThread(new b1(this, 4), 10L);
        }
    }

    public final void X() {
        if (TextUtils.isEmpty(this.o0)) {
            return;
        }
        this.o0 = null;
        this.Z.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.w0);
        h0(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [tg.d1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [tg.d1] */
    public final ug.g Y(ug.g gVar) {
        int i10 = this.X;
        if (i10 != 4) {
            gVar.n = i10 == 3 ? null : new py0(19, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j3 = user.id;
        final int i11 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: tg.d1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        n1 n1Var = this.b;
                        HashSet hashSet = n1Var.h0;
                        hashSet.add(Long.valueOf(j3));
                        Utilities.Callback2 callback2 = n1Var.D0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            n1Var.D0 = null;
                        }
                        n1Var.dismiss();
                        break;
                    default:
                        n1 n1Var2 = this.b;
                        HashSet hashSet2 = n1Var2.h0;
                        hashSet2.add(Long.valueOf(j3));
                        Utilities.Callback2 callback22 = n1Var2.D0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            n1Var2.D0 = null;
                        }
                        n1Var2.dismiss();
                        break;
                }
            }
        };
        final int i12 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: tg.d1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        n1 n1Var = this.b;
                        HashSet hashSet = n1Var.h0;
                        hashSet.add(Long.valueOf(j3));
                        Utilities.Callback2 callback2 = n1Var.D0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            n1Var.D0 = null;
                        }
                        n1Var.dismiss();
                        break;
                    default:
                        n1 n1Var2 = this.b;
                        HashSet hashSet2 = n1Var2.h0;
                        hashSet2.add(Long.valueOf(j3));
                        Utilities.Callback2 callback22 = n1Var2.D0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            n1Var2.D0 = null;
                        }
                        n1Var2.dismiss();
                        break;
                }
            }
        };
        gVar.o = r22;
        gVar.p = r32;
        return gVar;
    }

    public final int Z() {
        if (this.X == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.C0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.i0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.l0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.m0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.j0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.h0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.r0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.X;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.n0.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.Z.getEditText());
                if (i10 == 1) {
                    return;
                }
                if (i10 == 4) {
                    Utilities.Callback2 callback2 = this.D0;
                    if (callback2 != null) {
                        op opVar = this.c0;
                        callback2.run(Boolean.valueOf(opVar != null && opVar.a.q), hashSet);
                        this.D0 = null;
                    }
                    dismiss();
                    return;
                }
                List c10 = t.c(t.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j3 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j3)) {
                        new xc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                        return;
                    }
                    r1 r1Var = new r1(getContext(), this.currentAccount, j3, c10, new c1(this, r5 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.v0;
                    r1Var.V(birthdayState != null && birthdayState.contains(j3));
                    r1Var.show();
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.giftsToUserSent) {
            dismiss();
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new b1(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new b1(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new b1(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Z.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        G0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.w0);
    }

    public final void f0() {
        new xc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, this.X == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Z()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        k1 k1Var = this.Y;
        k1Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.X;
        HashSet hashSet = this.h0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        } else if (LocaleController.isRTL) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.u0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.u0, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
        }
        k1Var.b(hashSet.size(), true);
        k1Var.g(spannableStringBuilder, z10, false);
        k1Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(boolean z10, boolean z11) {
        int dp;
        TLRPC.User currentUser;
        float f7;
        long j3;
        ug.g gVar;
        int size;
        int i10;
        int i11;
        HashSet hashSet;
        Iterator it;
        BirthdayController.BirthdayState birthdayState;
        ug.h hVar;
        int i12;
        ArrayList arrayList = this.f0;
        arrayList.clear();
        ArrayList arrayList2 = this.g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.o0);
        HashSet hashSet2 = this.C0;
        int i13 = 3;
        int i14 = this.X;
        HashSet hashSet3 = this.h0;
        if (isEmpty) {
            if (this.E0 && i14 == 3) {
                if (this.y0 == null) {
                    qq qqVar = new qq(h6.K(AndroidUtilities.dp(46.0f), h6.v0(h6.Oh, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int dp3 = AndroidUtilities.dp(24.0f);
                    qqVar.e = dp2;
                    qqVar.f = dp3;
                    this.y0 = qqVar;
                }
                qq qqVar2 = this.y0;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i15 = this.F0;
                String formatPluralString = i15 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i15, new Object[0]) : "";
                ug.g gVar2 = new ug.g(3, true);
                gVar2.i = 2;
                gVar2.r = qqVar2;
                gVar2.g = string;
                gVar2.h = formatPluralString;
                arrayList2.add(gVar2);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i14 == 0 || i14 == 2) && userFull != null && userFull.birthday == null) {
                dp = AndroidUtilities.dp(50.0f);
                int i16 = R.drawable.menu_birthday;
                String string2 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                ug.g gVar3 = new ug.g(9, false);
                gVar3.i = 1;
                gVar3.j = i16;
                gVar3.g = string2;
                arrayList2.add(gVar3);
            } else {
                dp = 0;
            }
            if (this.A0 != null && i14 == 4) {
                int i17 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                ug.g gVar4 = new ug.g(9, false);
                gVar4.i = 3;
                gVar4.j = i17;
                gVar4.g = string3;
                arrayList2.add(gVar4);
            }
            BirthdayController.BirthdayState birthdayState2 = this.v0;
            if (birthdayState2 != null) {
                dp = V(LocaleController.getString(R.string.BirthdayYesterday), arrayList2, birthdayState2.yesterday) + V(LocaleController.getString(R.string.BirthdayToday), arrayList2, birthdayState2.today) + dp + V(LocaleController.getString(R.string.BirthdayTomorrow), arrayList2, birthdayState2.tomorrow);
            }
            if ((i14 == 0 || i14 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList2.add(ug.g.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                ug.g c10 = ug.g.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
                c10.h = LocaleController.getString(R.string.Gift2Myself);
                arrayList2.add(c10);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.j0;
            if (arrayList4.isEmpty()) {
                f7 = 32.0f;
                j3 = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList4.get(i18);
                    i18++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (user != null) {
                        long j10 = user.id;
                        if (j10 != 0 && !user.self && !user.bot && !UserObject.isService(j10) && !UserObject.isDeleted(user) && (birthdayState2 == null || !birthdayState2.contains(user.id))) {
                            if (!hashSet2.contains(Long.valueOf(user.id))) {
                                if (hashSet3.contains(Long.valueOf(user.id))) {
                                    arrayList3.add(Long.valueOf(user.id));
                                }
                                dp += AndroidUtilities.dp(56.0f);
                                ug.g c11 = ug.g.c(user, hashSet3.contains(Long.valueOf(user.id)));
                                Y(c11);
                                arrayList5.add(c11);
                            }
                        }
                    }
                }
                f7 = 32.0f;
                j3 = 0;
                if (!arrayList5.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    gVar = ug.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList2.add(gVar);
                    arrayList2.addAll(arrayList5);
                    ArrayList arrayList6 = this.m0;
                    size = arrayList6.size();
                    i10 = dp;
                    i11 = 0;
                    while (i11 < size) {
                        int i19 = i11 + 1;
                        String str = (String) arrayList6.get(i11);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = ((List) this.l0.get(str)).iterator();
                        while (it2.hasNext()) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) it2.next();
                            String str2 = str;
                            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            int i20 = size;
                            int i21 = i19;
                            long j11 = tL_contact.user_id;
                            if (j11 == clientUserId || j11 == j3 || ((birthdayState2 != null && birthdayState2.contains(j11)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                                hashSet = hashSet2;
                                it = it2;
                            } else {
                                hashSet = hashSet2;
                                it = it2;
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                                if (user2 != null && !user2.bot) {
                                    birthdayState = birthdayState2;
                                    if (!UserObject.isService(user2.id)) {
                                        i10 += AndroidUtilities.dp(56.0f);
                                        if (hashSet3.contains(Long.valueOf(user2.id))) {
                                            arrayList3.add(Long.valueOf(user2.id));
                                        }
                                        ug.g c12 = ug.g.c(user2, hashSet3.contains(Long.valueOf(user2.id)));
                                        Y(c12);
                                        arrayList7.add(c12);
                                    }
                                    size = i20;
                                    hashSet2 = hashSet;
                                    birthdayState2 = birthdayState;
                                    str = str2;
                                    it2 = it;
                                    i19 = i21;
                                }
                            }
                            birthdayState = birthdayState2;
                            size = i20;
                            hashSet2 = hashSet;
                            birthdayState2 = birthdayState;
                            str = str2;
                            it2 = it;
                            i19 = i21;
                        }
                        String str3 = str;
                        BirthdayController.BirthdayState birthdayState3 = birthdayState2;
                        int i22 = size;
                        int i23 = i19;
                        HashSet hashSet4 = hashSet2;
                        if (!arrayList7.isEmpty()) {
                            int dp4 = AndroidUtilities.dp(f7) + i10;
                            String upperCase = str3.toUpperCase();
                            ug.g gVar5 = new ug.g(7, false);
                            gVar5.g = upperCase;
                            arrayList2.add(gVar5);
                            arrayList2.addAll(arrayList7);
                            i10 = dp4;
                        }
                        size = i22;
                        hashSet2 = hashSet4;
                        birthdayState2 = birthdayState3;
                        i11 = i23;
                    }
                    if (gVar != null && arrayList3.size() > 0 && !hashSet3.isEmpty()) {
                        String string4 = LocaleController.getString(R.string.DeselectAll);
                        py0 py0Var = new py0(18, this, arrayList3);
                        gVar.h = string4;
                        gVar.m = py0Var;
                    }
                }
            }
            gVar = null;
            ArrayList arrayList62 = this.m0;
            size = arrayList62.size();
            i10 = dp;
            i11 = 0;
            while (i11 < size) {
            }
            if (gVar != null) {
                String string42 = LocaleController.getString(R.string.DeselectAll);
                py0 py0Var2 = new py0(18, this, arrayList3);
                gVar.h = string42;
                gVar.m = py0Var2;
            }
        } else {
            ArrayList arrayList8 = this.k0;
            int size3 = arrayList8.size();
            i10 = 0;
            int i24 = 0;
            while (i24 < size3) {
                Object obj2 = arrayList8.get(i24);
                i24++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    i12 = size3;
                    if (!user3.bot && !UserObject.isService(user3.id)) {
                        long j12 = user3.id;
                        i10 = AndroidUtilities.dp(56.0f) + i10;
                        if (!hashSet2.contains(Long.valueOf(user3.id))) {
                            ug.g c13 = ug.g.c(user3, hashSet3.contains(Long.valueOf(j12)));
                            Y(c13);
                            arrayList2.add(c13);
                            size3 = i12;
                            i13 = 3;
                        }
                    }
                    size3 = i12;
                } else {
                    i12 = size3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (i14 == i13 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                            long j13 = -chat.id;
                            i10 += AndroidUtilities.dp(56.0f);
                            if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                                boolean contains = hashSet3.contains(Long.valueOf(j13));
                                ug.g gVar6 = new ug.g(3, true);
                                gVar6.e = chat;
                                gVar6.c = null;
                                gVar6.d = null;
                                gVar6.k = contains;
                                arrayList2.add(gVar6);
                            }
                        }
                        size3 = i12;
                    }
                    size3 = i12;
                    i13 = 3;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ug.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        ug.g gVar7 = new ug.g(-1, false);
        gVar7.l = max;
        arrayList2.add(gVar7);
        if (!z11 || (hVar = this.p0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.l();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 int, still in use, count: 2, list:
          (r5v2 int) from 0x0053: MOVE (r3v6 int) = (r5v2 int) (LINE:84)
          (r5v2 int) from 0x002b: MOVE (r2v4 int) = (r5v2 int) (LINE:44)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final void i0(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.h0(r10, r11)
            r11 = -1
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = 0
        L8:
            org.telegram.ui.Components.ml0 r4 = r9.d
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof xg.l
            if (r5 == 0) goto L54
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L54
            java.util.ArrayList r7 = r9.g0
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L54
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            ug.g r3 = (ug.g) r3
            xg.l r4 = (xg.l) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            ug.h r7 = r9.p0
            int r3 = r7.F(r3)
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 <= r7) goto L4c
            r6 = 1050253722(0x3e99999a, float:0.3)
        L4c:
            r4.i(r6, r10)
            goto L53
        L50:
            r4.i(r6, r10)
        L53:
            r3 = r5
        L54:
            int r1 = r1 + 1
            goto L8
        L57:
            if (r10 == 0) goto L68
            ug.h r11 = r9.p0
            r11.q(r0, r2)
            ug.h r11 = r9.p0
            int r0 = r11.h()
            int r0 = r0 - r3
            r11.q(r3, r0)
        L68:
            r9.g0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.n1.i0(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h0(false, true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.Components.bb
    public final ll0 v(ml0 ml0Var) {
        ug.h hVar = new ug.h(getContext(), this.resourcesProvider, false);
        this.p0 = hVar;
        hVar.s = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        String str = this.z0;
        if (str != null) {
            return str;
        }
        int i10 = this.X;
        if (i10 != 0) {
            if (i10 == 1) {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
            if (i10 != 2) {
                return i10 != 4 ? LocaleController.getString(R.string.GiftTelegramPremiumTitle) : LocaleController.getString(R.string.VoipConferenceAddPeople);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }
}
