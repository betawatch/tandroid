package vg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import bi.ca;
import bi.h2;
import bi.nc;
import bi.sc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j20;
import org.telegram.ui.wn;
import zh.p1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class n1 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static f1 J0;
    public j20 A0;
    public Utilities.Callback B0;
    public final HashSet C0;
    public Utilities.Callback2 D0;
    public ar E0;
    public ar F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public final int X;
    public final j1 Y;
    public final h1 Z;
    public final i1 a0;
    public final g1 b0;
    public final aq c0;
    public final sc d0;
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
    public wg.h p0;
    public int q0;
    public final ArrayList r0;
    public boolean s0;
    public float t0;
    public lb0 u0;
    public final BirthdayController.BirthdayState v0;
    public final dy0 w0;
    public int x0;
    public ar y0;
    public String z0;

    public n1(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, u6 u6Var) {
        super(context, null, true, false, u6Var);
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
        this.w0 = new dy0(this, 17);
        this.x0 = -1;
        this.C0 = new HashSet();
        this.currentAccount = i10;
        int i12 = y6.h5;
        fixNavigationBarKey(i12);
        this.drawDoubleNavigationBar = false;
        this.X = i11;
        this.v0 = birthdayState;
        wg.h hVar = this.p0;
        if (hVar != null) {
            hVar.x = i11 == 4;
        }
        g1 g1Var = new g1(getContext(), u6Var);
        this.b0 = g1Var;
        g1Var.setOnCloseClickListener(new a1(this, 11));
        g1Var.setText(y());
        g1Var.setCloseImageVisible(false);
        g1Var.f.c(0.0f, false);
        this.u0 = new lb0(this, 2);
        h1 h1Var = new h1(this, getContext(), u6Var);
        this.Z = h1Var;
        f7.i(i12, h1Var, u6Var);
        h1Var.setOnSearchTextChange(new b1(this, 3));
        h1Var.b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        i1 i1Var = new i1(this, getContext());
        this.a0 = i1Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(g1Var, 0, kb1.j(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(h1Var, kb1.j(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(i1Var, kb1.j(1.0f, 55, i15, 0, i15, 0));
        sc scVar = new sc(getContext(), u6Var, (nm0) null);
        this.d0 = scVar;
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        f7.i(i12, scVar, u6Var);
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i16 = y6.i6;
            org.telegram.ui.Cells.y Z = y6.Z(getThemedColor(i16), 6, 6);
            b7 N = f7.N(i16);
            linearLayout.setBackground(Z);
            f7.k(linearLayout, Z, null, N, u6Var);
            aq aqVar = new aq(context, 24, u6Var);
            this.c0 = aqVar;
            aqVar.b(y6.Oh, y6.j7, y6.k7);
            aqVar.setDrawUnchecked(true);
            aqVar.a(false, false);
            aqVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(aqVar, kb1.x(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            f7.V(textView, y6.j5, u6Var);
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, kb1.x(-2, -2, 16, 9, 0, 0, 0));
            kb1.c(linearLayout, 0.025f, 1.5f);
            final int i17 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vg.e1
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
            scVar.addView(linearLayout, kb1.x(-2, -2, 17, 0, 0, 0, 8));
        }
        j1 j1Var = new j1(this, getContext(), u6Var);
        this.Y = j1Var;
        if (i11 == 4) {
            scVar.setAlpha(0.0f);
            scVar.setVisibility(8);
        }
        final int i18 = 1;
        j1Var.setOnClickListener(new View.OnClickListener(this) { // from class: vg.e1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.c0.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.d0();
                        break;
                }
            }
        });
        scVar.addView(j1Var, kb1.u(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i19 = this.backgroundPaddingLeft;
            viewGroup4.addView(scVar, kb1.j(-2.0f, 87, i19, 0, i19, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i20 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, kb1.j(300.0f, 87, i20, 0, i20, AndroidUtilities.dp(68.0f)));
        wg.h hVar2 = this.p0;
        nm0 nm0Var = this.d;
        hVar2.n = arrayList;
        hVar2.f = nm0Var;
        int i21 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i21, 0, i21, AndroidUtilities.dp(i11 != 1 ? 60.0f : 0.0f));
        this.d.j(new k1(this));
        this.d.setOnItemClickListener(new m4.t0(this, i11, u6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((dm0) new i2.r(this, i11, 19));
        }
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new l1(this));
        h1Var.setText("");
        h1Var.d.b(false);
        h1Var.b(false, hashSet, new a1(this, 12), null);
        g1Var.setText(y());
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            s.j(i10, null, new b1(this, 0));
        }
        if (i11 == 0 || i11 == 2) {
            ca.y(i10, false).V();
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

    public static void Q(n1 n1Var, int i10, u6 u6Var, int i11, View view, int i12) {
        sc scVar = n1Var.d0;
        h1 h1Var = n1Var.Z;
        ArrayList arrayList = n1Var.g0;
        HashSet hashSet = n1Var.h0;
        int i13 = 2;
        if (view instanceof v8) {
            if (i10 != 4) {
                g5.l(n1Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new b1(n1Var, i13), new a1(n1Var, 9), false, false, n1Var.resourcesProvider).a.show();
                return;
            }
            j20 j20Var = n1Var.A0;
            if (j20Var != null) {
                j20Var.run();
                n1Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            wg.g gVar = null;
            if (user == null && chat == null && i10 == 3) {
                int i14 = i12 - 1;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    gVar = (wg.g) arrayList.get(i14);
                }
                Utilities.Callback callback = n1Var.B0;
                if (callback == null || gVar == null) {
                    return;
                }
                int i15 = gVar.i;
                if (i15 == 4) {
                    callback.run(-98L);
                    return;
                } else if (i15 == 5) {
                    callback.run(-97L);
                    return;
                } else {
                    callback.run(-99L);
                    return;
                }
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            if (i10 == 3) {
                Utilities.Callback callback2 = n1Var.B0;
                if (callback2 != null) {
                    callback2.run(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (h1Var != null) {
                    AndroidUtilities.hideKeyboard(h1Var.getEditText());
                }
                nc ncVar = new nc(n1Var.getContext(), u6Var, user, new a1(n1Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    ncVar.makeAttached(n1Var.attachedFragment);
                }
                ncVar.show();
                return;
            }
            if (i10 == 0 || i10 == 2) {
                if (UserObject.areGiftsDisabled(j10)) {
                    new wc(n1Var.container, u6Var).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                    return;
                }
                p1 p1Var = new p1(n1Var.getContext(), i11, j10, s.c(s.b(1, n1Var.r0)), new b1(n1Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = n1Var.v0;
                p1Var.V(birthdayState != null && birthdayState.contains(j10));
                p1Var.show();
                return;
            }
            if (i10 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j10));
                Utilities.Callback2 callback22 = n1Var.D0;
                if (callback22 != null) {
                    aq aqVar = n1Var.c0;
                    callback22.run(Boolean.valueOf(aqVar != null && aqVar.a.q), hashSet);
                    n1Var.D0 = null;
                }
                n1Var.dismiss();
                return;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                n1Var.n0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == n1Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                n1Var.f0();
                return;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                scVar.setVisibility(0);
                scVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(ds.h).setDuration(320L).withEndAction(!z11 ? new a1(n1Var, true ? 1 : 0) : null).start();
                wg.h hVar = n1Var.p0;
                boolean z12 = !z11;
                if (hVar.y != z12) {
                    hVar.y = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f, (Utilities.Callback<View>) new wg.f(z12));
                }
            }
            n1Var.W();
            h1Var.b(true, hashSet, new a1(n1Var, i13), null);
            n1Var.i0(true, true);
            n1Var.X();
        }
    }

    public static void R(n1 n1Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = n1Var.e0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            qc R = new wc(frameLayout, n1Var.resourcesProvider).R(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            R.j = 5000;
            R.j();
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
            org.telegram.messenger.t.q(R.string.UnknownError, new wc(frameLayout, n1Var.resourcesProvider), R.raw.error, 36);
        } else if (n1Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n1Var.getContext(), 0, n1Var.resourcesProvider);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void S(final n1 n1Var, final TLRPC.User user, View view) {
        l80 F = l80.F(n1Var.container, n1Var.resourcesProvider, (View) view.getParent());
        final int i10 = 0;
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(n1Var) { // from class: vg.d1
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
                            r2 r2Var = this.b.n;
                            if (r2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                r2Var.presentFragment(new wn(bundle));
                                break;
                            } else {
                                r2 U = LaunchActivity.U();
                                p2 p2Var = new p2();
                                p2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new wn(bundle2), p2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            r2 r2Var2 = this.b.n;
                            if (r2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                r2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                r2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    p2 p2Var2 = new p2();
                                    p2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), p2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(n1Var) { // from class: vg.d1
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
                            r2 r2Var = this.b.n;
                            if (r2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                r2Var.presentFragment(new wn(bundle));
                                break;
                            } else {
                                r2 U = LaunchActivity.U();
                                p2 p2Var = new p2();
                                p2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new wn(bundle2), p2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            r2 r2Var2 = this.b.n;
                            if (r2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                r2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                r2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    p2 p2Var2 = new p2();
                                    p2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), p2Var2);
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
        ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(updatebirthday, new h2(n1Var, userFull, tL_birthday2, 25), 1024);
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
        n1Var.x0 = ConnectionsManager.getInstance(n1Var.currentAccount).sendRequest(tL_contacts_search, new bi.i0(n1Var, 26));
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
        r2 R = LaunchActivity.R();
        if (R == null) {
            return null;
        }
        f1 f1Var = J0;
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            f1Var2.makeAttached(R);
        }
        R.showDialog(f1Var2);
        J0 = f1Var2;
        return f1Var2;
    }

    @Override // org.telegram.ui.Components.bb
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        g1 g1Var = this.b0;
        g1Var.setTranslationY(max);
        float translationY = g1Var.getTranslationY() + g1Var.getMeasuredHeight();
        h1 h1Var = this.Z;
        h1Var.setTranslationY(translationY);
        float translationY2 = h1Var.getTranslationY() + h1Var.getMeasuredHeight();
        this.a0.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (h1Var.getMeasuredHeight() + g1Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
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
                long j10 = user.id;
                if (j10 != 0 && !this.C0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.h0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    wg.g c10 = wg.g.c(user, hashSet.contains(Long.valueOf(user.id)));
                    Y(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(wg.g.b(str));
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
            AndroidUtilities.runOnUIThread(new a1(this, 3), 10L);
            return;
        }
        if (this.s0) {
            this.s0 = false;
            AndroidUtilities.runOnUIThread(new a1(this, 4), 10L);
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

    /* JADX WARN: Type inference failed for: r2v2, types: [vg.c1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [vg.c1] */
    public final wg.g Y(wg.g gVar) {
        int i10 = this.X;
        if (i10 != 4) {
            gVar.n = i10 == 3 ? null : new org.telegram.ui.web.c(7, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j10 = user.id;
        final int i11 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: vg.c1
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
                        hashSet.add(Long.valueOf(j10));
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
                        hashSet2.add(Long.valueOf(j10));
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
        ?? r32 = new View.OnClickListener(this) { // from class: vg.c1
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
                        hashSet.add(Long.valueOf(j10));
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
                        hashSet2.add(Long.valueOf(j10));
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
                        aq aqVar = this.c0;
                        callback2.run(Boolean.valueOf(aqVar != null && aqVar.a.q), hashSet);
                        this.D0 = null;
                    }
                    dismiss();
                    return;
                }
                List c10 = s.c(s.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j10)) {
                        new wc(this.container, this.resourcesProvider).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    p1 p1Var = new p1(getContext(), this.currentAccount, j10, c10, new b1(this, r5 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.v0;
                    p1Var.V(birthdayState != null && birthdayState.contains(j10));
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
            AndroidUtilities.runOnUIThread(new a1(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new a1(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new a1(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Z.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        J0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.w0);
    }

    public final void f0() {
        new wc(this.container, this.resourcesProvider).R(R.raw.chats_infotip, 36, this.X == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Z()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        j1 j1Var = this.Y;
        j1Var.setShowZero(false);
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
        j1Var.b(hashSet.size(), true);
        j1Var.i(spannableStringBuilder, z10, false);
        j1Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int dp;
        TLRPC.User currentUser;
        float f11;
        long j10;
        wg.g gVar;
        int size;
        int i11;
        int i12;
        ArrayList arrayList;
        BirthdayController.BirthdayState birthdayState;
        HashSet hashSet;
        String str;
        wg.h hVar;
        int i13;
        ArrayList arrayList2 = this.f0;
        arrayList2.clear();
        ArrayList arrayList3 = this.g0;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        boolean isEmpty = TextUtils.isEmpty(this.o0);
        HashSet hashSet2 = this.C0;
        int i14 = 3;
        int i15 = this.X;
        HashSet hashSet3 = this.h0;
        if (isEmpty) {
            if (this.G0) {
                i10 = i15;
                if (i10 == 3) {
                    if (this.F0 == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.filled_gift_send).mutate();
                        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        f7 = 40.0f;
                        ar arVar = new ar(y6.K(AndroidUtilities.dp(40.0f), y6.w0(y6.Oh, this.resourcesProvider)), mutate);
                        int dp2 = AndroidUtilities.dp(24.0f);
                        int dp3 = AndroidUtilities.dp(24.0f);
                        arVar.e = dp2;
                        arVar.f = dp3;
                        this.F0 = arVar;
                    } else {
                        f7 = 40.0f;
                    }
                    ar arVar2 = this.F0;
                    String string = LocaleController.getString(R.string.Gift2MoveToMyGifts);
                    wg.g gVar2 = new wg.g(3, true);
                    gVar2.i = 5;
                    gVar2.r = arVar2;
                    gVar2.g = string;
                    gVar2.h = "";
                    arrayList3.add(gVar2);
                } else {
                    f7 = 40.0f;
                }
            } else {
                f7 = 40.0f;
                i10 = i15;
            }
            if (this.H0 && i10 == 3 && MessagesController.getInstance(this.currentAccount).config.walletAvailable.get()) {
                if (this.E0 == null) {
                    Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_wallet_move).mutate();
                    f10 = 24.0f;
                    mutate2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    ar arVar3 = new ar(y6.K(AndroidUtilities.dp(f7), y6.w0(y6.Oh, this.resourcesProvider)), mutate2);
                    int dp4 = AndroidUtilities.dp(24.0f);
                    int dp5 = AndroidUtilities.dp(24.0f);
                    arVar3.e = dp4;
                    arVar3.f = dp5;
                    this.E0 = arVar3;
                } else {
                    f10 = 24.0f;
                }
                String t10 = org.telegram.ui.Wallet.l0.x(this.currentAccount).t();
                int i16 = this.I0;
                if (i16 > 0) {
                    str = LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i16, new Object[0]);
                } else if (t10 == null || t10.length() < 20) {
                    str = "";
                } else {
                    int w02 = y6.w0(y6.r5, this.resourcesProvider);
                    int length = t10.length();
                    String substring = t10.substring(0, 4);
                    String substring2 = t10.substring(4, 8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t10.substring(8, 10));
                    int i17 = length - 8;
                    sb2.append(t10.substring(length - 10, i17));
                    String sb3 = sb2.toString();
                    int i18 = length - 4;
                    String[] strArr = {substring, substring2, sb3, t10.substring(i17, i18), t10.substring(i18, length)};
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i19 = 0;
                    while (i19 < 5) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) strArr[i19]);
                        spannableStringBuilder.setSpan(new m1(w02, i19 == 2), length2, spannableStringBuilder.length(), 33);
                        i19++;
                    }
                    str = spannableStringBuilder;
                }
                ar arVar4 = this.E0;
                String string2 = LocaleController.getString(R.string.Gift2MoveToMyWallet);
                wg.g gVar3 = new wg.g(3, true);
                gVar3.i = 4;
                gVar3.r = arVar4;
                gVar3.g = string2;
                gVar3.h = str;
                arrayList3.add(gVar3);
            } else {
                f10 = 24.0f;
            }
            if (this.H0 && i10 == 3 && !MessagesController.getInstance(this.currentAccount).config.walletAvailable.get()) {
                if (this.y0 == null) {
                    Drawable mutate3 = getContext().getResources().getDrawable(R.drawable.fragment).mutate();
                    mutate3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    ar arVar5 = new ar(y6.K(AndroidUtilities.dp(f7), -16777216), mutate3);
                    int dp6 = AndroidUtilities.dp(f10);
                    int dp7 = AndroidUtilities.dp(f10);
                    arVar5.e = dp6;
                    arVar5.f = dp7;
                    this.y0 = arVar5;
                }
                ar arVar6 = this.y0;
                String string3 = LocaleController.getString(R.string.Gift2SendViaFragment);
                int i20 = this.I0;
                String formatPluralString = i20 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i20, new Object[0]) : "";
                wg.g gVar4 = new wg.g(3, true);
                gVar4.i = 2;
                gVar4.r = arVar6;
                gVar4.g = string3;
                gVar4.h = formatPluralString;
                arrayList3.add(gVar4);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i10 == 0 || i10 == 2) && userFull != null && userFull.birthday == null) {
                dp = AndroidUtilities.dp(50.0f);
                int i21 = R.drawable.menu_birthday;
                String string4 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                wg.g gVar5 = new wg.g(9, false);
                gVar5.i = 1;
                gVar5.j = i21;
                gVar5.g = string4;
                arrayList3.add(gVar5);
            } else {
                dp = 0;
            }
            if (this.A0 != null && i10 == 4) {
                int i22 = R.drawable.msg2_link2;
                String string5 = LocaleController.getString(R.string.VoipConferenceShareLink);
                wg.g gVar6 = new wg.g(9, false);
                gVar6.i = 3;
                gVar6.j = i22;
                gVar6.g = string5;
                arrayList3.add(gVar6);
            }
            BirthdayController.BirthdayState birthdayState2 = this.v0;
            if (birthdayState2 != null) {
                dp = V(LocaleController.getString(R.string.BirthdayYesterday), arrayList3, birthdayState2.yesterday) + V(LocaleController.getString(R.string.BirthdayToday), arrayList3, birthdayState2.today) + dp + V(LocaleController.getString(R.string.BirthdayTomorrow), arrayList3, birthdayState2.tomorrow);
            }
            if ((i10 == 0 || i10 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList3.add(wg.g.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                wg.g c10 = wg.g.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
                c10.h = LocaleController.getString(R.string.Gift2Myself);
                arrayList3.add(c10);
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = this.j0;
            if (arrayList5.isEmpty()) {
                f11 = 32.0f;
                j10 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size2 = arrayList5.size();
                int i23 = 0;
                while (i23 < size2) {
                    Object obj = arrayList5.get(i23);
                    i23++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (user != null) {
                        long j11 = user.id;
                        if (j11 != 0 && !user.self && !user.bot && !UserObject.isService(j11) && !UserObject.isDeleted(user) && (birthdayState2 == null || !birthdayState2.contains(user.id))) {
                            if (!hashSet2.contains(Long.valueOf(user.id))) {
                                if (hashSet3.contains(Long.valueOf(user.id))) {
                                    arrayList4.add(Long.valueOf(user.id));
                                }
                                dp += AndroidUtilities.dp(56.0f);
                                wg.g c11 = wg.g.c(user, hashSet3.contains(Long.valueOf(user.id)));
                                Y(c11);
                                arrayList6.add(c11);
                            }
                        }
                    }
                }
                f11 = 32.0f;
                j10 = 0;
                if (!arrayList6.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    gVar = wg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList3.add(gVar);
                    arrayList3.addAll(arrayList6);
                    ArrayList arrayList7 = this.m0;
                    size = arrayList7.size();
                    i11 = dp;
                    i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList7.get(i12);
                        int i24 = i12 + 1;
                        String str2 = (String) obj2;
                        ArrayList arrayList8 = new ArrayList();
                        for (TLRPC.TL_contact tL_contact : (List) this.l0.get(str2)) {
                            int i25 = i24;
                            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            ArrayList arrayList9 = arrayList7;
                            int i26 = size;
                            long j12 = tL_contact.user_id;
                            if (j12 == clientUserId || j12 == j10 || ((birthdayState2 != null && birthdayState2.contains(j12)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                                arrayList = arrayList9;
                                birthdayState = birthdayState2;
                            } else {
                                arrayList = arrayList9;
                                birthdayState = birthdayState2;
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                                if (user2 != null && !user2.bot) {
                                    hashSet = hashSet2;
                                    if (!UserObject.isService(user2.id)) {
                                        i11 += AndroidUtilities.dp(56.0f);
                                        if (hashSet3.contains(Long.valueOf(user2.id))) {
                                            arrayList4.add(Long.valueOf(user2.id));
                                        }
                                        wg.g c12 = wg.g.c(user2, hashSet3.contains(Long.valueOf(user2.id)));
                                        Y(c12);
                                        arrayList8.add(c12);
                                    }
                                    hashSet2 = hashSet;
                                    birthdayState2 = birthdayState;
                                    i24 = i25;
                                    arrayList7 = arrayList;
                                    size = i26;
                                }
                            }
                            hashSet = hashSet2;
                            hashSet2 = hashSet;
                            birthdayState2 = birthdayState;
                            i24 = i25;
                            arrayList7 = arrayList;
                            size = i26;
                        }
                        int i27 = i24;
                        ArrayList arrayList10 = arrayList7;
                        int i28 = size;
                        BirthdayController.BirthdayState birthdayState3 = birthdayState2;
                        HashSet hashSet4 = hashSet2;
                        if (!arrayList8.isEmpty()) {
                            int dp8 = AndroidUtilities.dp(f11) + i11;
                            String upperCase = str2.toUpperCase();
                            wg.g gVar7 = new wg.g(7, false);
                            gVar7.g = upperCase;
                            arrayList3.add(gVar7);
                            arrayList3.addAll(arrayList8);
                            i11 = dp8;
                        }
                        hashSet2 = hashSet4;
                        birthdayState2 = birthdayState3;
                        i12 = i27;
                        arrayList7 = arrayList10;
                        size = i28;
                    }
                    if (gVar != null && arrayList4.size() > 0 && !hashSet3.isEmpty()) {
                        String string6 = LocaleController.getString(R.string.DeselectAll);
                        org.telegram.ui.web.c cVar = new org.telegram.ui.web.c(6, this, arrayList4);
                        gVar.h = string6;
                        gVar.m = cVar;
                    }
                }
            }
            gVar = null;
            ArrayList arrayList72 = this.m0;
            size = arrayList72.size();
            i11 = dp;
            i12 = 0;
            while (i12 < size) {
            }
            if (gVar != null) {
                String string62 = LocaleController.getString(R.string.DeselectAll);
                org.telegram.ui.web.c cVar2 = new org.telegram.ui.web.c(6, this, arrayList4);
                gVar.h = string62;
                gVar.m = cVar2;
            }
        } else {
            ArrayList arrayList11 = this.k0;
            int size3 = arrayList11.size();
            int i29 = 0;
            i11 = 0;
            while (i29 < size3) {
                Object obj3 = arrayList11.get(i29);
                i29++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    if (!user3.bot && !UserObject.isService(user3.id)) {
                        long j13 = user3.id;
                        i11 = AndroidUtilities.dp(56.0f) + i11;
                        if (!hashSet2.contains(Long.valueOf(user3.id))) {
                            wg.g c13 = wg.g.c(user3, hashSet3.contains(Long.valueOf(j13)));
                            Y(c13);
                            arrayList3.add(c13);
                            i13 = i15;
                        }
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (i15 == i14 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                        long j14 = -chat.id;
                        i11 += AndroidUtilities.dp(56.0f);
                        i13 = i15;
                        if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                            boolean contains = hashSet3.contains(Long.valueOf(j14));
                            wg.g gVar8 = new wg.g(3, true);
                            gVar8.e = chat;
                            gVar8.c = null;
                            gVar8.d = null;
                            gVar8.k = contains;
                            arrayList3.add(gVar8);
                        }
                    }
                } else {
                    i13 = i15;
                }
                i15 = i13;
                i14 = 3;
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new wg.g(5, false));
            i11 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i11);
        wg.g gVar9 = new wg.g(-1, false);
        gVar9.l = max;
        arrayList3.add(gVar9);
        if (!z11 || (hVar = this.p0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList2, arrayList3);
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
            r2 = r11
            r1 = r0
            r3 = r1
        L8:
            org.telegram.ui.Components.nm0 r4 = r9.d
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof zg.l
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
            wg.g r3 = (wg.g) r3
            zg.l r4 = (zg.l) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            wg.h r7 = r9.p0
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
            wg.h r11 = r9.p0
            r11.q(r0, r2)
            wg.h r11 = r9.p0
            int r0 = r11.h()
            int r0 = r0 - r3
            r11.q(r3, r0)
        L68:
            r9.g0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.n1.i0(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.k3
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int w02 = y6.w0(y6.Oh, this.resourcesProvider);
            ar arVar = this.F0;
            boolean z10 = true;
            if (arVar != null) {
                y6.z1(w02, arVar.a);
            }
            ar arVar2 = this.E0;
            if (arVar2 == null) {
                z10 = false;
            }
            if (z10) {
                y6.z1(w02, arVar2.a);
            }
            nm0 nm0Var = this.d;
            if (nm0Var != null) {
                for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
                    nm0Var.getChildAt(i10).invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        wg.h hVar = new wg.h(getContext(), this.resourcesProvider, false);
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
