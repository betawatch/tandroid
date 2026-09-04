package ug;

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
import bi.v7;
import com.google.android.gms.internal.vision.e2;
import di.r1;
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
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.cj1;
import org.telegram.ui.o20;
import rg.p2;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class a1 extends bb {
    public final di.d X;
    public final z0 Y;
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
    public final e6 m0;
    public String n0;
    public vg.g o0;
    public int p0;
    public final TLRPC.Chat q0;
    public int r0;
    public k s0;
    public int t0;
    public m u0;
    public final rg.b0 v0;

    public a1(n2 n2Var, long j3) {
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
        this.v0 = new rg.b0(this, 4);
        this.backgroundPaddingLeft = 0;
        this.q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        pr prVar = pr.h;
        this.m0 = new e6(viewGroup, 0L, 350L, prVar);
        yg.c cVar = new yg.c(getContext(), this.resourcesProvider);
        this.a0 = cVar;
        cVar.setOnCloseClickListener(new u0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        z0 z0Var = new z0(this, getContext(), this.resourcesProvider);
        this.Y = z0Var;
        int i10 = j6.h5;
        z0Var.setBackgroundColor(getThemedColor(i10));
        z0Var.setOnSearchTextChange(new x0(this, 0));
        this.Z = new u3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, x5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(z0Var, x5.f(-2.0f, 55, i12, 0, i12, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (ll0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        di.d dVar = new di.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new w0(this, 1));
        o20Var.addView(dVar, x5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, x5.f(-2.0f, 87, i13, 0, i13, 0));
        vg.g gVar = this.o0;
        ll0 ll0Var = this.d;
        gVar.n = arrayList;
        gVar.f = ll0Var;
        int i14 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new lb0(this, 13));
        this.d.setOnItemClickListener(new p2(this, 9));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(prVar);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new r1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static /* synthetic */ void P(a1 a1Var, boolean z10, Pair pair) {
        HashMap hashMap = a1Var.i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            a1Var.j0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new v0(a1Var, 0));
        }
        if (a1Var.r0 == 3) {
            a1Var.b0(true, true);
            a1Var.X(true);
        }
    }

    public static void Q(a1 a1Var, View view) {
        LinkedHashMap linkedHashMap = a1Var.l0;
        z0 z0Var = a1Var.Y;
        HashSet hashSet = a1Var.e0;
        if (view instanceof r8) {
            linkedHashMap.clear();
            a1Var.W(true);
        } else if (view instanceof yg.l) {
            yg.l lVar = (yg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
            long j3 = user != null ? user.id : -chat.id;
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                Long valueOf = Long.valueOf(j3);
                if (user == null) {
                    user = chat;
                }
                linkedHashMap.put(valueOf, user);
            }
            if ((hashSet.size() == 11 && a1Var.r0 == 1) || (hashSet.size() == t.f() + 1 && a1Var.r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                a1Var.Y();
                return;
            }
            z0Var.b(true, hashSet, new u0(a1Var, 1), null);
            a1Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = a1Var.n.getContext();
                f6 f6Var = a1Var.resourcesProvider;
                bi.g gVar = new bi.g(a1Var, j3, 29);
                u0 u0Var = new u0(a1Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.T = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new sg.x(2, atomicBoolean, u0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new t0.a(5));
                alertDialog$Builder.j(new fi.e0(15, atomicBoolean, gVar));
                alertDialog$Builder.o();
            } else if (chat != null) {
                a1Var.R();
            }
        }
        if (view instanceof yg.b) {
            long hashCode = ((yg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && a1Var.r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                a1Var.Y();
                return;
            }
            z0Var.b(true, hashSet, new u0(a1Var, 3), a1Var.k0);
            if (TextUtils.isEmpty(a1Var.n0)) {
                a1Var.b0(true, false);
                return;
            }
            a1Var.n0 = null;
            z0Var.setText("");
            a1Var.b0(false, false);
            a1Var.b0(true, true);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!e2.u(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || w1.w(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || w1.w(" ", str, lowerCase2);
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
        int v02 = j6.v0(j6.h5, this.resourcesProvider);
        Paint paint = this.b0;
        paint.setColor(v02);
        int max = Math.max(0, i10);
        boolean z10 = max < AndroidUtilities.statusBarHeight;
        e6 e6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, e6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - e6Var.c) * AndroidUtilities.dp(14.0f);
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
        arrayList.addAll(t.e(this.q0.id));
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
        f6 f6Var = this.resourcesProvider;
        u0 u0Var = new u0(this, 0);
        u0 u0Var2 = new u0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.T = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new p2(u0Var, 8));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new p2(u0Var2, 5));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.q0;
        if (i10 == 1) {
            long j3 = chat.id;
            y0 y0Var = new y0(this, z10, 0);
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = messagesController.getInputChannel(j3);
            TLRPC.ChannelParticipantsFilter tL_channelParticipantsRecent = str == null ? new TLRPC.TL_channelParticipantsRecent() : new TLRPC.TL_channelParticipantsSearch();
            tL_channels_getParticipants.filter = tL_channelParticipantsRecent;
            if (str == null) {
                str = "";
            }
            tL_channelParticipantsRecent.q = str;
            tL_channels_getParticipants.offset = 0;
            tL_channels_getParticipants.limit = 50;
            connectionsManager.sendRequest(tL_channels_getParticipants, new cj1(2, messagesController, y0Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            y0 y0Var2 = new y0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new v7(y0Var2, 21));
            return;
        }
        long j10 = chat.id;
        x0 x0Var = new x0(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new bi.l1(messagesController2, j10, x0Var, 4));
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
            arrayList.addAll(t.e(this.q0.id));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                long j3 = tLObject instanceof TLRPC.TL_inputPeerChat ? -((TLRPC.TL_inputPeerChat) tLObject).chat_id : 0L;
                if (tLObject instanceof TLRPC.TL_inputPeerChannel) {
                    j3 = -((TLRPC.TL_inputPeerChannel) tLObject).channel_id;
                }
                if (tLObject instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) tLObject).id;
                }
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                }
                if (tLObject instanceof TLRPC.TL_help_country) {
                    j3 = ((TLRPC.TL_help_country) tLObject).default_name.hashCode();
                }
                hashSet2.add(Long.valueOf(j3));
                linkedHashMap.put(Long.valueOf(j3), tLObject);
            }
        }
        hashSet.addAll(hashSet2);
        z0 z0Var = this.Y;
        z0Var.setText("");
        z0Var.d.b(false);
        z0Var.b(false, hashSet2, new u0(this, 4), this.k0);
        c0();
        b0(false, true);
        this.a0.setText(y());
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
                m mVar = this.u0;
                if (mVar != null) {
                    mVar.c.b.D(0);
                    b0 b0Var = mVar.a;
                    ArrayList arrayList2 = b0Var.d0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = wg.d.s;
                        b0Var.i0 = 0;
                    } else {
                        int i12 = wg.d.s;
                        b0Var.i0 = 1;
                    }
                    b0Var.n0 = 0;
                    b0Var.a0(false, true);
                    b0Var.Z(true);
                    b0Var.N();
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
                m mVar2 = this.u0;
                if (mVar2 != null) {
                    n nVar = mVar2.c;
                    nVar.b.D(0);
                    b0 b0Var2 = mVar2.a;
                    boolean z11 = !nVar.isKeyboardVisible();
                    ArrayList arrayList4 = b0Var2.c0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    b0Var2.a0(z11, true);
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
            m mVar3 = this.u0;
            if (mVar3 != null) {
                mVar3.c.b.D(0);
                b0 b0Var3 = mVar3.a;
                ArrayList arrayList7 = b0Var3.e0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                b0Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        ll0 ll0Var = this.d;
        if (!z10) {
            ll0Var.u0(0);
            return;
        }
        ki.p pVar = new ki.p(getContext(), 2, 0.6f);
        pVar.a = 1;
        pVar.p = AndroidUtilities.dp(38.0f);
        ll0Var.getLayoutManager().w0(pVar);
    }

    public final void Y() {
        int i10 = this.r0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) t.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        m mVar = this.u0;
        if (mVar != null) {
            new yc(mVar.c.container, mVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z10) {
        di.d dVar = this.X;
        dVar.setShowZero(false);
        int i10 = this.r0;
        dVar.g(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.e0;
        dVar.b(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        vg.g gVar;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        ArrayList arrayList2 = this.d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            vg.f fVar = new vg.f(9, false);
            fVar.i = 1;
            fVar.j = i11;
            fVar.g = string;
            arrayList2.add(fVar);
        }
        vg.f fVar2 = new vg.f(10, false);
        u3 u3Var = this.Z;
        fVar2.q = u3Var;
        arrayList2.add(fVar2);
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
                        vg.f fVar3 = new vg.f(6, true);
                        fVar3.f = tL_help_country;
                        fVar3.k = contains;
                        arrayList4.add(fVar3);
                        arrayList3 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    int dp = AndroidUtilities.dp(32.0f) + i10;
                    String upperCase = str.toUpperCase();
                    vg.f fVar4 = new vg.f(7, false);
                    fVar4.g = upperCase;
                    arrayList2.add(fVar4);
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
            vg.f fVar5 = new vg.f(3, true);
            fVar5.d = inputPeer;
            fVar5.c = null;
            fVar5.e = null;
            fVar5.k = contains2;
            arrayList2.add(fVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new vg.f(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        vg.f fVar6 = new vg.f(-1, false);
        fVar6.l = max;
        arrayList2.add(fVar6);
        if (hashSet.size() > 0 && this.r0 != 3) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new w0(this, 0));
        } else if (z10) {
            u3Var.setRightText(null);
        } else {
            t3 t3Var = u3Var.b;
            t3Var.c(null, false, true);
            t3Var.setOnClickListener(null);
            t3Var.setVisibility(0);
        }
        if (!z11 || (gVar = this.o0) == null) {
            return;
        }
        if (z10) {
            gVar.E(arrayList, arrayList2);
        } else {
            gVar.l();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        a0(z10, z11);
        int i10 = 0;
        while (true) {
            ll0 ll0Var = this.d;
            if (i10 >= ll0Var.getChildCount()) {
                Z(z10);
                return;
            }
            View childAt = ll0Var.getChildAt(i10);
            if (childAt instanceof yg.l) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.d0;
                    if (R < arrayList.size()) {
                        vg.f fVar = (vg.f) arrayList.get(R);
                        yg.l lVar = (yg.l) childAt;
                        lVar.c(fVar.k, z10);
                        TLRPC.Chat chat = fVar.e;
                        if (chat != null) {
                            lVar.i(this.o0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            lVar.i(1.0f, z10);
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
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) t.f(), new Object[0]);
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
        k kVar = this.s0;
        if (kVar != null) {
            kVar.run();
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
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        vg.g gVar = new vg.g(getContext(), this.resourcesProvider, true);
        this.o0 = gVar;
        return gVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        int i10 = this.r0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
