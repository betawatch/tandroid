package sg;

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
import bi.c2;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.p20;
import org.telegram.ui.w20;
import org.telegram.ui.w71;
import w7.a6;
import w7.c6;
import xh.k7;
import xh.v5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class p1 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static i1 G0;
    public w20 A0;
    public j2 B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public boolean E0;
    public int F0;
    public final int X;
    public final m1 Y;
    public final k1 Z;
    public final l1 a0;
    public final j1 b0;
    public final tp c0;
    public final p20 d0;
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
    public tg.g p0;
    public int q0;
    public final ArrayList r0;
    public boolean s0;
    public float t0;
    public bb0 u0;
    public final BirthdayController.BirthdayState v0;
    public final a1 w0;
    public int x0;
    public vq y0;
    public String z0;

    public p1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, f6Var);
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
        this.w0 = new a1(this, 1);
        this.x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i12 = j6.h5;
        fixNavigationBar(j6.v0(i12, f6Var));
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.v0 = birthdayState;
        tg.g gVar = this.p0;
        if (gVar != null) {
            gVar.x = i11 == 4;
        }
        j1 j1Var = new j1(getContext(), f6Var);
        this.b0 = j1Var;
        j1Var.setOnCloseClickListener(new d1(this, 11));
        j1Var.setText(y());
        j1Var.setCloseImageVisible(false);
        j1Var.e.c(0.0f, false);
        this.u0 = new bb0(this, 2);
        k1 k1Var = new k1(this, getContext(), f6Var);
        this.Z = k1Var;
        k1Var.setBackgroundColor(getThemedColor(i12));
        k1Var.setOnSearchTextChange(new e1(this, 3));
        k1Var.b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        l1 l1Var = new l1(this, getContext());
        this.a0 = l1Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(j1Var, 0, a6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(k1Var, a6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(l1Var, a6.f(1.0f, 55, i15, 0, i15, 0));
        p20 p20Var = new p20(getContext(), f6Var, (vl0) null);
        this.d0 = p20Var;
        p20Var.setClickable(true);
        p20Var.setOrientation(1);
        p20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        p20Var.setBackgroundColor(j6.v0(i12, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.i6), 6, 6));
            tp tpVar = new tp(context, 24, f6Var);
            this.c0 = tpVar;
            tpVar.b(j6.Oh, j6.j7, j6.k7);
            tpVar.setDrawUnchecked(true);
            tpVar.a(false, false);
            tpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(tpVar, a6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, a6.t(-2, -2, 16, 9, 0, 0, 0));
            c6.b(linearLayout, 0.025f, 1.5f);
            final int i16 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: sg.h1
                public final /* synthetic */ p1 b;

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
            p20Var.addView(linearLayout, a6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        m1 m1Var = new m1(this, getContext(), f6Var);
        this.Y = m1Var;
        if (i11 == 4) {
            p20Var.setAlpha(0.0f);
            p20Var.setVisibility(8);
        }
        final int i17 = 1;
        m1Var.setOnClickListener(new View.OnClickListener(this) { // from class: sg.h1
            public final /* synthetic */ p1 b;

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
        p20Var.addView(m1Var, a6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(p20Var, a6.f(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, a6.f(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        tg.g gVar2 = this.p0;
        vl0 vl0Var = this.d;
        gVar2.n = arrayList;
        gVar2.f = vl0Var;
        int i20 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(i11 != 1 ? 60.0f : 0.0f));
        this.d.j(new n1(this));
        this.d.setOnItemClickListener(new zt(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((ml0) new i2.s(this, i11, 18));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new o1(this));
        k1Var.setText("");
        k1Var.d.b(false);
        k1Var.b(false, hashSet, new d1(this, 12), null);
        j1Var.setText(y());
        wa waVar = this.e;
        if (waVar != null) {
            waVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            s.j(i10, null, new e1(this, 0));
        }
        if (i11 == 0 || i11 == 2) {
            v5.y(i10, false).V();
        }
    }

    public static /* synthetic */ void P(p1 p1Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = p1Var.k0;
        arrayList.clear();
        p1Var.x0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(p1Var.currentAccount);
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
        p1Var.i0(true, true);
    }

    public static void Q(p1 p1Var, int i10, f6 f6Var, int i11, View view) {
        p20 p20Var = p1Var.d0;
        k1 k1Var = p1Var.Z;
        HashSet hashSet = p1Var.h0;
        int i12 = 2;
        if (view instanceof s8) {
            if (i10 != 4) {
                d5.m(p1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new e1(p1Var, i12), new d1(p1Var, 9), false, false, p1Var.resourcesProvider).a.show();
                return;
            }
            w20 w20Var = p1Var.A0;
            if (w20Var != null) {
                w20Var.run();
                p1Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof wg.k) {
            wg.k kVar = (wg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            int i13 = 3;
            if (user == null && chat == null && i10 == 3) {
                j2 j2Var = p1Var.B0;
                if (j2Var != null) {
                    j2Var.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.id : -chat.id;
            if (i10 == 3) {
                j2 j2Var2 = p1Var.B0;
                if (j2Var2 != null) {
                    j2Var2.run(Long.valueOf(j3));
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (k1Var != null) {
                    AndroidUtilities.hideKeyboard(k1Var.getEditText());
                }
                k7 k7Var = new k7(p1Var.getContext(), f6Var, user, new d1(p1Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    k7Var.makeAttached(p1Var.attachedFragment);
                }
                k7Var.show();
                return;
            }
            if (i10 == 0 || i10 == 2) {
                if (UserObject.areGiftsDisabled(j3)) {
                    new wc(p1Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                    return;
                }
                wh.p1 p1Var2 = new wh.p1(p1Var.getContext(), i11, j3, s.c(s.b(1, p1Var.r0)), new e1(p1Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = p1Var.v0;
                p1Var2.V(birthdayState != null && birthdayState.contains(j3));
                p1Var2.show();
                return;
            }
            if (i10 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j3));
                Utilities.Callback2 callback2 = p1Var.D0;
                if (callback2 != null) {
                    tp tpVar = p1Var.c0;
                    callback2.run(Boolean.valueOf(tpVar != null && tpVar.a.q), hashSet);
                    p1Var.D0 = null;
                }
                p1Var.dismiss();
                return;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                p1Var.n0.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == p1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j3));
                p1Var.f0();
                return;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                p20Var.setVisibility(0);
                p20Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(wr.h).setDuration(320L).withEndAction(!z11 ? new d1(p1Var, true ? 1 : 0) : null).start();
                tg.g gVar = p1Var.p0;
                boolean z12 = !z11;
                if (gVar.y != z12) {
                    gVar.y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) gVar.f, (e2.h) new m4.o0(i13, z12));
                }
            }
            p1Var.W();
            k1Var.b(true, hashSet, new d1(p1Var, i12), null);
            p1Var.i0(true, true);
            p1Var.X();
        }
    }

    public static void R(p1 p1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = p1Var.e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            pc Q = new wc(frameLayout, p1Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
            MessagesStorage.getInstance(p1Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            a2.o(R.string.UnknownError, new wc(frameLayout, p1Var.resourcesProvider), R.raw.error, 36);
        } else if (p1Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p1Var.getContext(), 0, p1Var.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            hc.b.A(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void S(final p1 p1Var, final TLRPC.User user, View view) {
        w70 F = w70.F(p1Var.container, p1Var.resourcesProvider, (View) view.getParent());
        final int i10 = 0;
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(p1Var) { // from class: sg.g1
            public final /* synthetic */ p1 b;

            {
                this.b = p1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            p2 p2Var = this.b.n;
                            if (p2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                p2Var.presentFragment(new eo(bundle));
                                break;
                            } else {
                                p2 U = LaunchActivity.U();
                                n2 n2Var = new n2();
                                n2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new eo(bundle2), n2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            p2 p2Var2 = this.b.n;
                            if (p2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                p2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    n2 n2Var2 = new n2();
                                    n2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), n2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(p1Var) { // from class: sg.g1
            public final /* synthetic */ p1 b;

            {
                this.b = p1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            p2 p2Var = this.b.n;
                            if (p2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                p2Var.presentFragment(new eo(bundle));
                                break;
                            } else {
                                p2 U = LaunchActivity.U();
                                n2 n2Var = new n2();
                                n2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new eo(bundle2), n2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            p2 p2Var2 = this.b.n;
                            if (p2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                p2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    n2 n2Var2 = new n2();
                                    n2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), n2Var2);
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

    public static /* synthetic */ void T(p1 p1Var, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(p1Var.currentAccount).getUserFull(UserConfig.getInstance(p1Var.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(p1Var.currentAccount).sendRequest(updatebirthday, new bi.wa(p1Var, userFull, tL_birthday2, 19), 1024);
        MessagesController.getInstance(p1Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(p1Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(p1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        p1Var.h0(true, true);
    }

    public static void U(p1 p1Var, String str) {
        if (p1Var.x0 >= 0) {
            ConnectionsManager.getInstance(p1Var.currentAccount).cancelRequest(p1Var.x0, true);
            p1Var.x0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        p1Var.x0 = ConnectionsManager.getInstance(p1Var.currentAccount).sendRequest(tL_contacts_search, new c2(p1Var, 18));
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

    public static p1 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        p2 R = LaunchActivity.R();
        if (R == null) {
            return null;
        }
        i1 i1Var = G0;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = new i1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            i1Var2.makeAttached(R);
        }
        R.showDialog(i1Var2);
        G0 = i1Var2;
        return i1Var2;
    }

    @Override // org.telegram.ui.Components.ab
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        j1 j1Var = this.b0;
        j1Var.setTranslationY(max);
        float translationY = j1Var.getTranslationY() + j1Var.getMeasuredHeight();
        k1 k1Var = this.Z;
        k1Var.setTranslationY(translationY);
        float translationY2 = k1Var.getTranslationY() + k1Var.getMeasuredHeight();
        this.a0.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (k1Var.getMeasuredHeight() + j1Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
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
                    tg.f c10 = tg.f.c(user, hashSet.contains(Long.valueOf(user.id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(tg.f.b(str));
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
            AndroidUtilities.runOnUIThread(new d1(this, 3), 10L);
            return;
        }
        if (this.s0) {
            this.s0 = false;
            AndroidUtilities.runOnUIThread(new d1(this, 4), 10L);
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

    /* JADX WARN: Type inference failed for: r2v2, types: [sg.f1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [sg.f1] */
    public final tg.f Y(tg.f fVar) {
        int i10 = this.X;
        if (i10 != 4) {
            fVar.n = i10 == 3 ? null : new w71(15, this, fVar.c);
            return fVar;
        }
        TLRPC.User user = fVar.c;
        if (user == null) {
            return fVar;
        }
        final long j3 = user.id;
        final int i11 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: sg.f1
            public final /* synthetic */ p1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        p1 p1Var = this.b;
                        HashSet hashSet = p1Var.h0;
                        hashSet.add(Long.valueOf(j3));
                        Utilities.Callback2 callback2 = p1Var.D0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            p1Var.D0 = null;
                        }
                        p1Var.dismiss();
                        break;
                    default:
                        p1 p1Var2 = this.b;
                        HashSet hashSet2 = p1Var2.h0;
                        hashSet2.add(Long.valueOf(j3));
                        Utilities.Callback2 callback22 = p1Var2.D0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            p1Var2.D0 = null;
                        }
                        p1Var2.dismiss();
                        break;
                }
            }
        };
        final int i12 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: sg.f1
            public final /* synthetic */ p1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        p1 p1Var = this.b;
                        HashSet hashSet = p1Var.h0;
                        hashSet.add(Long.valueOf(j3));
                        Utilities.Callback2 callback2 = p1Var.D0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            p1Var.D0 = null;
                        }
                        p1Var.dismiss();
                        break;
                    default:
                        p1 p1Var2 = this.b;
                        HashSet hashSet2 = p1Var2.h0;
                        hashSet2.add(Long.valueOf(j3));
                        Utilities.Callback2 callback22 = p1Var2.D0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            p1Var2.D0 = null;
                        }
                        p1Var2.dismiss();
                        break;
                }
            }
        };
        fVar.o = r22;
        fVar.p = r32;
        return fVar;
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
                        tp tpVar = this.c0;
                        callback2.run(Boolean.valueOf(tpVar != null && tpVar.a.q), hashSet);
                        this.D0 = null;
                    }
                    dismiss();
                    return;
                }
                List c10 = s.c(s.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j3 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j3)) {
                        new wc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j3)))).j();
                        return;
                    }
                    wh.p1 p1Var = new wh.p1(getContext(), this.currentAccount, j3, c10, new e1(this, r5 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.v0;
                    p1Var.V(birthdayState != null && birthdayState.contains(j3));
                    p1Var.show();
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
            AndroidUtilities.runOnUIThread(new d1(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new d1(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new d1(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Z.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        G0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.w0);
    }

    public final void f0() {
        new wc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, this.X == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Z()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        m1 m1Var = this.Y;
        m1Var.setShowZero(false);
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
        m1Var.b(hashSet.size(), true);
        m1Var.g(spannableStringBuilder, z10, false);
        m1Var.setEnabled(hashSet.size() > 0);
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
        tg.f fVar;
        int size;
        int i10;
        int i11;
        HashSet hashSet;
        Iterator it;
        BirthdayController.BirthdayState birthdayState;
        tg.g gVar;
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
                    vq vqVar = new vq(j6.K(AndroidUtilities.dp(46.0f), j6.v0(j6.Oh, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int dp3 = AndroidUtilities.dp(24.0f);
                    vqVar.e = dp2;
                    vqVar.f = dp3;
                    this.y0 = vqVar;
                }
                vq vqVar2 = this.y0;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i15 = this.F0;
                String formatPluralString = i15 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i15, new Object[0]) : "";
                tg.f fVar2 = new tg.f(3, true);
                fVar2.i = 2;
                fVar2.r = vqVar2;
                fVar2.g = string;
                fVar2.h = formatPluralString;
                arrayList2.add(fVar2);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i14 == 0 || i14 == 2) && userFull != null && userFull.birthday == null) {
                dp = AndroidUtilities.dp(50.0f);
                int i16 = R.drawable.menu_birthday;
                String string2 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                tg.f fVar3 = new tg.f(9, false);
                fVar3.i = 1;
                fVar3.j = i16;
                fVar3.g = string2;
                arrayList2.add(fVar3);
            } else {
                dp = 0;
            }
            if (this.A0 != null && i14 == 4) {
                int i17 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                tg.f fVar4 = new tg.f(9, false);
                fVar4.i = 3;
                fVar4.j = i17;
                fVar4.g = string3;
                arrayList2.add(fVar4);
            }
            BirthdayController.BirthdayState birthdayState2 = this.v0;
            if (birthdayState2 != null) {
                dp = V(LocaleController.getString(R.string.BirthdayYesterday), arrayList2, birthdayState2.yesterday) + V(LocaleController.getString(R.string.BirthdayToday), arrayList2, birthdayState2.today) + dp + V(LocaleController.getString(R.string.BirthdayTomorrow), arrayList2, birthdayState2.tomorrow);
            }
            if ((i14 == 0 || i14 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList2.add(tg.f.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                tg.f c10 = tg.f.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
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
                                tg.f c11 = tg.f.c(user, hashSet3.contains(Long.valueOf(user.id)));
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
                    fVar = tg.f.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList2.add(fVar);
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
                                        tg.f c12 = tg.f.c(user2, hashSet3.contains(Long.valueOf(user2.id)));
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
                            tg.f fVar5 = new tg.f(7, false);
                            fVar5.g = upperCase;
                            arrayList2.add(fVar5);
                            arrayList2.addAll(arrayList7);
                            i10 = dp4;
                        }
                        size = i22;
                        hashSet2 = hashSet4;
                        birthdayState2 = birthdayState3;
                        i11 = i23;
                    }
                    if (fVar != null && arrayList3.size() > 0 && !hashSet3.isEmpty()) {
                        String string4 = LocaleController.getString(R.string.DeselectAll);
                        w71 w71Var = new w71(14, this, arrayList3);
                        fVar.h = string4;
                        fVar.m = w71Var;
                    }
                }
            }
            fVar = null;
            ArrayList arrayList62 = this.m0;
            size = arrayList62.size();
            i10 = dp;
            i11 = 0;
            while (i11 < size) {
            }
            if (fVar != null) {
                String string42 = LocaleController.getString(R.string.DeselectAll);
                w71 w71Var2 = new w71(14, this, arrayList3);
                fVar.h = string42;
                fVar.m = w71Var2;
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
                            tg.f c13 = tg.f.c(user3, hashSet3.contains(Long.valueOf(j12)));
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
                                tg.f fVar6 = new tg.f(3, true);
                                fVar6.e = chat;
                                fVar6.c = null;
                                fVar6.d = null;
                                fVar6.k = contains;
                                arrayList2.add(fVar6);
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
            arrayList2.add(new tg.f(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        tg.f fVar7 = new tg.f(-1, false);
        fVar7.l = max;
        arrayList2.add(fVar7);
        if (!z11 || (gVar = this.p0) == null) {
            return;
        }
        if (z10) {
            gVar.E(arrayList, arrayList2);
        } else {
            gVar.l();
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
            org.telegram.ui.Components.vl0 r4 = r9.d
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof wg.k
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
            tg.f r3 = (tg.f) r3
            wg.k r4 = (wg.k) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            tg.g r7 = r9.p0
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
            tg.g r11 = r9.p0
            r11.q(r0, r2)
            tg.g r11 = r9.p0
            int r0 = r11.h()
            int r0 = r0 - r3
            r11.q(r3, r0)
        L68:
            r9.g0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.p1.i0(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.h3
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

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        tg.g gVar = new tg.g(getContext(), this.resourcesProvider, false);
        this.p0 = gVar;
        gVar.s = true;
        return gVar;
    }

    @Override // org.telegram.ui.Components.ab
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
