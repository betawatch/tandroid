package ug;

import ai.bd;
import ai.p9;
import ai.v3;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.mh0;
import org.telegram.ui.o71;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class y0 extends bb {
    public final ei.d X;
    public final x0 Y;
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
    public j s0;
    public int t0;
    public l u0;
    public final p4.s0 v0;

    public y0(n2 n2Var, long j10) {
        super(n2Var, false);
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
        this.v0 = new p4.s0(this, 8);
        this.backgroundPaddingLeft = 0;
        this.q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        bs bsVar = bs.h;
        this.m0 = new f6(viewGroup, 0L, 350L, bsVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.a0 = cVar;
        cVar.setOnCloseClickListener(new s0(this, 7));
        cVar.setText(A());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        x0 x0Var = new x0(this, getContext(), this.resourcesProvider);
        this.Y = x0Var;
        int i10 = h6.h5;
        x0Var.setBackgroundColor(getThemedColor(i10));
        x0Var.setOnSearchTextChange(new v0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        d0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, z5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(x0Var, z5.f(-2.0f, 55, i12, 0, i12, 0));
        bd bdVar = new bd(getContext(), this.resourcesProvider, (im0) null);
        bdVar.setClickable(true);
        bdVar.setOrientation(1);
        bdVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        bdVar.setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        ei.d dVar = new ei.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new u0(this, 1));
        bdVar.addView(dVar, z5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(bdVar, z5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.h hVar = this.o0;
        im0 im0Var = this.d;
        hVar.n = arrayList;
        hVar.f = im0Var;
        int i14 = this.backgroundPaddingLeft;
        im0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new kv(this, 20));
        this.d.setOnItemClickListener(new qg.g0(this, 23));
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bsVar);
        kVar.C = false;
        kVar.m = false;
        this.d.setItemAnimator(kVar);
        this.d.i(new q1(this, 8));
        c0(false, true);
        U(1, null, true);
        U(3, null, true);
    }

    public static /* synthetic */ void Q(y0 y0Var, boolean z10, Pair pair) {
        HashMap hashMap = y0Var.i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            y0Var.j0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new t0(y0Var, 0));
        }
        if (y0Var.r0 == 3) {
            y0Var.c0(true, true);
            y0Var.Y(true);
        }
    }

    public static void R(y0 y0Var, View view) {
        LinkedHashMap linkedHashMap = y0Var.l0;
        x0 x0Var = y0Var.Y;
        HashSet hashSet = y0Var.e0;
        if (view instanceof q8) {
            linkedHashMap.clear();
            y0Var.X(true);
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
            if ((hashSet.size() == 11 && y0Var.r0 == 1) || (hashSet.size() == r.f() + 1 && y0Var.r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                y0Var.Z();
                return;
            }
            x0Var.b(true, hashSet, new s0(y0Var, 1), null);
            y0Var.c0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = y0Var.n.getContext();
                d6 d6Var = y0Var.resourcesProvider;
                mh0 mh0Var = new mh0(y0Var, j10, 4);
                s0 s0Var = new s0(y0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.T = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new org.telegram.ui.web.m(13, atomicBoolean, s0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new si.a(11));
                alertDialog$Builder.j(new v3(18, atomicBoolean, mh0Var));
                alertDialog$Builder.o();
            } else if (chat != null) {
                y0Var.S();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && y0Var.r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                y0Var.Z();
                return;
            }
            x0Var.b(true, hashSet, new s0(y0Var, 3), y0Var.k0);
            if (TextUtils.isEmpty(y0Var.n0)) {
                y0Var.c0(true, false);
                return;
            }
            y0Var.n0 = null;
            x0Var.setText("");
            y0Var.c0(false, false);
            y0Var.c0(true, true);
        }
    }

    public static boolean V(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!k3.s(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.g0.w(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || org.telegram.messenger.g0.w(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        int i10 = this.r0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }

    @Override // org.telegram.ui.Components.bb
    public final void D(Canvas canvas, int i10) {
        this.t0 = i10;
        float f7 = AndroidUtilities.statusBarHeight;
        yg.c cVar = this.a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f7));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = h6.w0(h6.h5, this.resourcesProvider);
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

    public final void S() {
        if (TextUtils.isEmpty(this.n0)) {
            return;
        }
        this.n0 = null;
        this.Y.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.v0);
        ArrayList arrayList = this.g0;
        arrayList.clear();
        arrayList.addAll(r.e(this.q0.id));
        c0(false, false);
        c0(true, true);
    }

    public final boolean T() {
        HashSet hashSet = this.e0;
        int size = hashSet.size();
        HashSet hashSet2 = this.f0;
        if (size == hashSet2.size() && hashSet2.containsAll(hashSet) && hashSet.containsAll(hashSet2)) {
            return false;
        }
        int i10 = this.r0;
        Context context = getContext();
        d6 d6Var = this.resourcesProvider;
        s0 s0Var = new s0(this, 0);
        s0 s0Var2 = new s0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.T = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new qg.g0(s0Var, 22));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new qg.g0(s0Var2, 19));
        alertDialog$Builder.o();
        return true;
    }

    public final void U(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.q0;
        if (i10 == 1) {
            long j10 = chat.id;
            w0 w0Var = new w0(this, z10, 0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new o71(9, messagesController, w0Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            w0 w0Var2 = new w0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new ai.h(w0Var2, 25));
            return;
        }
        long j11 = chat.id;
        v0 v0Var = new v0(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new p9(messagesController2, j11, v0Var, 6));
    }

    public final void W(int i10, List list) {
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
            arrayList.addAll(r.e(this.q0.id));
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
        x0 x0Var = this.Y;
        x0Var.setText("");
        x0Var.d.b(false);
        x0Var.b(false, hashSet2, new s0(this, 4), this.k0);
        d0();
        c0(false, true);
        this.a0.setText(A());
        a0(false);
        Y(false);
    }

    public final void X(boolean z10) {
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
                l lVar = this.u0;
                if (lVar != null) {
                    lVar.c.b.D(0);
                    z zVar = lVar.a;
                    ArrayList arrayList2 = zVar.d0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = wg.d.v;
                        zVar.i0 = 0;
                    } else {
                        int i12 = wg.d.v;
                        zVar.i0 = 1;
                    }
                    zVar.n0 = 0;
                    zVar.b0(false, true);
                    zVar.a0(true);
                    zVar.O();
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
                l lVar2 = this.u0;
                if (lVar2 != null) {
                    m mVar = lVar2.c;
                    mVar.b.D(0);
                    z zVar2 = lVar2.a;
                    boolean z11 = !mVar.isKeyboardVisible();
                    ArrayList arrayList4 = zVar2.c0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    zVar2.b0(z11, true);
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
            l lVar3 = this.u0;
            if (lVar3 != null) {
                lVar3.c.b.D(0);
                z zVar3 = lVar3.a;
                ArrayList arrayList7 = zVar3.e0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                zVar3.b0(false, true);
            }
        }
    }

    public final void Y(boolean z10) {
        im0 im0Var = this.d;
        if (!z10) {
            im0Var.u0(0);
            return;
        }
        li.n nVar = new li.n(getContext(), 2, 0.6f);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(38.0f);
        im0Var.getLayoutManager().w0(nVar);
    }

    public final void Z() {
        int i10 = this.r0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) r.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        l lVar = this.u0;
        if (lVar != null) {
            new xc(lVar.c.container, lVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void a0(boolean z10) {
        ei.d dVar = this.X;
        dVar.setShowZero(false);
        int i10 = this.r0;
        dVar.g(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.e0;
        dVar.b(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void b0(boolean z10, boolean z11) {
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
                    if (TextUtils.isEmpty(this.n0) || V(tL_help_country, AndroidUtilities.translitSafe(this.n0).toLowerCase())) {
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
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new u0(this, 0));
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

    public final void c0(boolean z10, boolean z11) {
        b0(z10, z11);
        int i10 = 0;
        while (true) {
            im0 im0Var = this.d;
            if (i10 >= im0Var.getChildCount()) {
                a0(z10);
                return;
            }
            View childAt = im0Var.getChildAt(i10);
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

    public final void d0() {
        String formatPluralStringComma;
        int i10 = this.r0;
        u3 u3Var = this.Z;
        if (i10 == 1) {
            TLRPC.Chat chat = this.q0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.o0.F(chat) - 1));
            u3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) r.f(), new Object[0]);
            u3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            u3Var.setLayerHeight(1);
        }
        u3Var.setText(formatPluralStringComma);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        j jVar = this.s0;
        if (jVar != null) {
            jVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.v0);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        vg.h hVar = new vg.h(getContext(), this.resourcesProvider, true);
        this.o0 = hVar;
        return hVar;
    }
}
