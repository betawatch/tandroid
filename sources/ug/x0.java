package ug;

import ai.cd;
import ai.m3;
import ai.z3;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.k3;
import ei.q1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.oh0;
import org.telegram.ui.q71;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class x0 extends bb {
    public final ei.d X;
    public final w0 Y;
    public final u3 Z;
    public final yg.c a0;
    public final Paint b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final HashSet e0;
    public final HashSet f0;
    public final ArrayList g0;
    public final ArrayList h0;
    public final HashMap i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final LinkedHashMap l0;
    public final f6 m0;
    public String n0;
    public vg.h o0;
    public int p0;
    public final TLRPC.Chat q0;
    public int r0;
    public i s0;
    public int t0;
    public k u0;
    public final m4 v0;

    public x0(o2 o2Var, long j10) {
        super(o2Var, false);
        this.b0 = new Paint(1);
        this.c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.d0 = arrayList;
        this.e0 = new HashSet();
        this.f0 = new HashSet();
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new HashMap();
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new LinkedHashMap();
        this.p0 = AndroidUtilities.dp(134.0f);
        this.v0 = new m4(this, 11);
        this.backgroundPaddingLeft = 0;
        this.q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        bs bsVar = bs.h;
        this.m0 = new f6(viewGroup, 0L, 350L, bsVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.a0 = cVar;
        cVar.setOnCloseClickListener(new r0(this, 7));
        cVar.setText(z());
        cVar.setCloseImageVisible(true);
        cVar.f.c(0.0f, false);
        w0 w0Var = new w0(this, getContext(), this.resourcesProvider);
        this.Y = w0Var;
        int i10 = k6.h5;
        r6.i(i10, w0Var, this.resourcesProvider);
        w0Var.setOnSearchTextChange(new u0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(w0Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        cd cdVar = new cd(getContext(), this.resourcesProvider, (mm0) null);
        cdVar.setClickable(true);
        cdVar.setOrientation(1);
        cdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        r6.i(i10, cdVar, this.resourcesProvider);
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new t0(this, 1));
        cdVar.addView(dVar, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(cdVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.h hVar = this.o0;
        mm0 mm0Var = this.d;
        hVar.n = arrayList;
        hVar.f = mm0Var;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new kv(this, 20));
        this.d.setOnItemClickListener(new qg.g0(this, 23));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bsVar);
        kVar.C = false;
        kVar.m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new q1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static /* synthetic */ void P(x0 x0Var, boolean z10, Pair pair) {
        HashMap hashMap = x0Var.i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            x0Var.j0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new s0(x0Var, 0));
        }
        if (x0Var.r0 == 3) {
            x0Var.b0(true, true);
            x0Var.X(true);
        }
    }

    public static void Q(x0 x0Var, View view) {
        LinkedHashMap linkedHashMap = x0Var.l0;
        w0 w0Var = x0Var.Y;
        HashSet hashSet = x0Var.e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            x0Var.W(true);
        } else if (view instanceof yg.k) {
            yg.k kVar = (yg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            long j10 = user != null ? user.id : -chat.id;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                Long valueOf = Long.valueOf(j10);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && x0Var.r0 == 1) || (hashSet.size() == q.f() + 1 && x0Var.r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                x0Var.Y();
                return;
            }
            w0Var.b(true, hashSet, new r0(x0Var, 1), null);
            x0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = x0Var.n.getContext();
                g6 g6Var = x0Var.resourcesProvider;
                oh0 oh0Var = new oh0(x0Var, j10, 4);
                r0 r0Var = new r0(x0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.T = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new e8(15, atomicBoolean, r0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(24));
                alertDialog$Builder.j(new z3(18, atomicBoolean, oh0Var));
                alertDialog$Builder.p();
            } else if (chat != null) {
                x0Var.R();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && x0Var.r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                x0Var.Y();
                return;
            }
            w0Var.b(true, hashSet, new r0(x0Var, 3), x0Var.k0);
            if (TextUtils.isEmpty(x0Var.n0)) {
                x0Var.b0(true, false);
                return;
            }
            x0Var.n0 = null;
            w0Var.setText("");
            x0Var.b0(false, false);
            x0Var.b0(true, true);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!k3.s(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.v0.w(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || org.telegram.messenger.v0.w(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.bb
    public final void C(Canvas canvas, int i10) {
        this.t0 = i10;
        float f7 = AndroidUtilities.statusBarHeight;
        yg.c cVar = this.a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f7));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = k6.w0(k6.h5, this.resourcesProvider);
        Paint paint = this.b0;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        boolean z10 = max < AndroidUtilities.statusBarHeight;
        f6 f6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, f6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - f6Var.c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    public final void R() {
        if (TextUtils.isEmpty(this.n0)) {
            return;
        }
        this.n0 = null;
        this.Y.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.v0);
        ArrayList arrayList = this.g0;
        arrayList.clear();
        arrayList.addAll(q.e(this.q0.id));
        b0(false, false);
        b0(true, true);
    }

    public final boolean S() {
        HashSet hashSet = this.e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.r0;
        Context context = getContext();
        g6 g6Var = this.resourcesProvider;
        r0 r0Var = new r0(this, 0);
        r0 r0Var2 = new r0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.T = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new qg.g0(r0Var, 22));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new qg.g0(r0Var2, 19));
        alertDialog$Builder.p();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.q0;
        if (i10 == 1) {
            long j10 = chat.id;
            v0 v0Var = new v0(this, z10, 0);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = messagesController.getInputChannel(j10);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new q71(9, messagesController, v0Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            v0 v0Var2 = new v0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ai.h(v0Var2, 25));
            return;
        }
        long j11 = chat.id;
        u0 u0Var = new u0(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new m3(messagesController2, j11, u0Var, 7));
    }

    public final void V(int i10, List list) {
        this.r0 = i10;
        this.n0 = null;
        HashSet hashSet = this.f0;
        hashSet.clear();
        HashSet hashSet2 = this.e0;
        hashSet2.clear();
        ArrayList arrayList = this.g0;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.l0;
        linkedHashMap.clear();
        if (i10 == 1) {
            arrayList.addAll(this.h0);
        } else if (i10 == 2) {
            arrayList.addAll(q.e(this.q0.id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long j10 = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j10 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j10 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j10));
                linkedHashMap.put(Long.valueOf(j10), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        w0 w0Var = this.Y;
        w0Var.setText("");
        w0Var.d.b(false);
        w0Var.b(false, hashSet2, new r0(this, 4), this.k0);
        c0();
        b0(false, true);
        this.a0.setText(z());
        Z(false);
        X(false);
    }

    public final void W(boolean z10) {
        HashSet hashSet = this.e0;
        if (hashSet.size() != 0 || z10) {
            int i10 = this.r0;
            LinkedHashMap linkedHashMap = this.l0;
            if (i10 == 1) {
                ArrayList arrayList = new ArrayList();
                for (TLObject tLObject : linkedHashMap.values()) {
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(user);
                        }
                    }
                }
                k kVar = this.u0;
                if (kVar != null) {
                    kVar.c.b.D(0);
                    y yVar = kVar.a;
                    ArrayList arrayList2 = yVar.d0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = wg.d.v;
                        yVar.i0 = 0;
                    } else {
                        int i12 = wg.d.v;
                        yVar.i0 = 1;
                    }
                    yVar.n0 = 0;
                    yVar.a0(false, true);
                    yVar.Z(true);
                    yVar.N();
                    return;
                }
                return;
            }
            if (i10 == 2) {
                ArrayList arrayList3 = new ArrayList();
                for (TLObject tLObject2 : linkedHashMap.values()) {
                    if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (hashSet.contains(Long.valueOf(-chat.id))) {
                            arrayList3.add(chat);
                        }
                    }
                }
                k kVar2 = this.u0;
                if (kVar2 != null) {
                    l lVar = kVar2.c;
                    lVar.b.D(0);
                    y yVar2 = kVar2.a;
                    boolean z11 = !lVar.isKeyboardVisible();
                    ArrayList arrayList4 = yVar2.c0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    yVar2.a0(z11, true);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = this.k0;
            int size = arrayList6.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList6.get(i13);
                i13++;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj;
                if (hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()))) {
                    arrayList5.add(tL_help_country);
                }
            }
            k kVar3 = this.u0;
            if (kVar3 != null) {
                kVar3.c.b.D(0);
                y yVar3 = kVar3.a;
                ArrayList arrayList7 = yVar3.e0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                yVar3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        mm0 mm0Var = this.d;
        if (!z10) {
            mm0Var.u0(0);
            return;
        }
        li.n nVar = new li.n(getContext(), 2, 0.6f);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(38.0f);
        mm0Var.getLayoutManager().w0(nVar);
    }

    public final void Y() {
        int i10 = this.r0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) q.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        k kVar = this.u0;
        if (kVar != null) {
            new xc(kVar.c.container, kVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z10) {
        ei.d dVar = this.X;
        dVar.setShowZero(false);
        int i10 = this.r0;
        dVar.i(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.e0;
        dVar.b(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        vg.h hVar;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        ArrayList arrayList2 = this.d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.g gVar = new vg.g(9, false);
            gVar.i = 1;
            gVar.j = i11;
            gVar.g = string;
            arrayList2.add(gVar);
        }
        vg.g gVar2 = new vg.g(10, false);
        u3 u3Var = this.Z;
        gVar2.q = u3Var;
        arrayList2.add(gVar2);
        int i12 = this.r0;
        HashSet hashSet = this.e0;
        if (i12 == 3) {
            ArrayList arrayList3 = this.j0;
            int size = arrayList3.size();
            i10 = 0;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList3.get(i13);
                i13++;
                String str = (String) obj;
                ArrayList arrayList4 = new ArrayList();
                for (TLRPC.TL_help_country tL_help_country : (List) this.i0.get(str)) {
                    if (TextUtils.isEmpty(this.n0) || U(tL_help_country, AndroidUtilities.translitSafe(this.n0).toLowerCase())) {
                        i10 += AndroidUtilities.dp(44.0f);
                        boolean contains = hashSet.contains(Long.valueOf(tL_help_country.default_name.hashCode()));
                        vg.g gVar3 = new vg.g(6, true);
                        gVar3.f = tL_help_country;
                        gVar3.k = contains;
                        arrayList4.add(gVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int dp = AndroidUtilities.dp(32.0f) + i10;
                    String upperCase = str.toUpperCase();
                    vg.g gVar4 = new vg.g(7, false);
                    gVar4.g = upperCase;
                    arrayList2.add(gVar4);
                    arrayList2.addAll(arrayList4);
                    i10 = dp;
                }
                arrayList3 = arrayList5;
            }
        } else {
            i10 = 0;
        }
        ArrayList arrayList6 = this.g0;
        int size2 = arrayList6.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList6.get(i14);
            i14++;
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
            i10 += AndroidUtilities.dp(56.0f);
            boolean contains2 = hashSet.contains(Long.valueOf(DialogObject.getPeerDialogId(inputPeer)));
            vg.g gVar5 = new vg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.g gVar6 = new vg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.r0 != 3) {
            u3Var.a(LocaleController.getString(R.string.UsersDeselectAll), new t0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (!z11 || (hVar = this.o0) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.l();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 >= mm0Var.getChildCount()) {
                Z(z10);
                return;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt instanceof yg.k) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.d0;
                    if (R < arrayList.size()) {
                        vg.g gVar = (vg.g) arrayList.get(R);
                        yg.k kVar = (yg.k) childAt;
                        kVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            kVar.i(this.o0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            kVar.i(1.0f, z10);
                        }
                    }
                }
                i10++;
            }
            if (childAt instanceof yg.b) {
                ((yg.b) childAt).c(this.e0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void c0() {
        String formatPluralStringComma;
        int i10 = this.r0;
        u3 u3Var = this.Z;
        if (i10 == 1) {
            TLRPC.Chat chat = this.q0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) q.f(), new Object[0]);
            u3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            u3Var.setLayerHeight(1);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        i iVar = this.s0;
        if (iVar != null) {
            iVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.v0);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.o0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        int i10 = this.r0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
