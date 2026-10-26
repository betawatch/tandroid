package vg;

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
import bi.i3;
import bi.sc;
import bi.u3;
import fi.p1;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.l71;
import org.telegram.ui.lh0;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z0 extends bb {
    public final fi.d X;
    public final y0 Y;
    public final z3 Z;
    public final zg.c a0;
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
    public final h6 m0;
    public String n0;
    public wg.h o0;
    public int p0;
    public final TLRPC.Chat q0;
    public int r0;
    public k s0;
    public int t0;
    public m u0;
    public final cy0 v0;

    public z0(r2 r2Var, long j10) {
        super(r2Var, false);
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
        this.v0 = new cy0(this, 16);
        this.backgroundPaddingLeft = 0;
        this.q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        ds dsVar = ds.h;
        this.m0 = new h6(viewGroup, 0L, 350L, dsVar);
        zg.c cVar = new zg.c(getContext(), this.resourcesProvider);
        this.a0 = cVar;
        cVar.setOnCloseClickListener(new t0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.f.c(0.0f, false);
        y0 y0Var = new y0(this, getContext(), this.resourcesProvider);
        this.Y = y0Var;
        int i10 = y6.h5;
        f7.i(i10, y0Var, this.resourcesProvider);
        y0Var.setOnSearchTextChange(new w0(this, 0));
        this.Z = new z3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, gb1.j(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(y0Var, gb1.j(-2.0f, 55, i12, 0, i12, 0));
        sc scVar = new sc(getContext(), this.resourcesProvider, (mm0) null);
        scVar.setClickable(true);
        scVar.setOrientation(1);
        scVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        f7.i(i10, scVar, this.resourcesProvider);
        fi.d dVar = new fi.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new v0(this, 1));
        scVar.addView(dVar, gb1.u(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(scVar, gb1.j(-2.0f, 87, i13, 0, i13, 0));
        wg.h hVar = this.o0;
        mm0 mm0Var = this.d;
        hVar.n = arrayList;
        hVar.f = mm0Var;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new ml(this, 25));
        this.d.setOnItemClickListener(new org.telegram.ui.Components.voip.j1(this, 28));
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(dsVar);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new p1(this, 8));
        b0(false, true);
        T(1, null, true);
        T(3, null, true);
    }

    public static /* synthetic */ void P(z0 z0Var, boolean z10, Pair pair) {
        HashMap hashMap = z0Var.i0;
        if (z10) {
            hashMap.putAll((Map) pair.first);
            z0Var.j0.addAll((Collection) pair.second);
            Map.-EL.forEach(hashMap, new u0(z0Var, 0));
        }
        if (z0Var.r0 == 3) {
            z0Var.b0(true, true);
            z0Var.X(true);
        }
    }

    public static void Q(z0 z0Var, View view) {
        LinkedHashMap linkedHashMap = z0Var.l0;
        y0 y0Var = z0Var.Y;
        HashSet hashSet = z0Var.e0;
        if (view instanceof v8) {
            linkedHashMap.clear();
            z0Var.W(true);
        } else if (view instanceof zg.l) {
            zg.l lVar = (zg.l) view;
            TLRPC.User user = lVar.getUser();
            TLRPC.Chat chat = lVar.getChat();
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
            if ((hashSet.size() == 11 && z0Var.r0 == 1) || (hashSet.size() == s.f() + 1 && z0Var.r0 == 2)) {
                hashSet.remove(Long.valueOf(j10));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 1), null);
            z0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j10))) {
                Context context = z0Var.n.getContext();
                u6 u6Var = z0Var.resourcesProvider;
                lh0 lh0Var = new lh0(z0Var, j10, 4);
                t0 t0Var = new t0(z0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.T = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new zg1(19, atomicBoolean, t0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new d(0));
                alertDialog$Builder.j(new u3(18, atomicBoolean, lh0Var));
                alertDialog$Builder.p();
            } else if (chat != null) {
                z0Var.R();
            }
        }
        if (view instanceof zg.b) {
            long hashCode = ((zg.b) view).getCountry().default_name.hashCode();
            if (hashSet.contains(Long.valueOf(hashCode))) {
                hashSet.remove(Long.valueOf(hashCode));
            } else {
                hashSet.add(Long.valueOf(hashCode));
            }
            if (hashSet.size() == MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax + 1 && z0Var.r0 == 3) {
                hashSet.remove(Long.valueOf(hashCode));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 3), z0Var.k0);
            if (TextUtils.isEmpty(z0Var.n0)) {
                z0Var.b0(true, false);
                return;
            }
            z0Var.n0 = null;
            y0Var.setText("");
            z0Var.b0(false, false);
            z0Var.b0(true, true);
        }
    }

    public static boolean U(TLRPC.TL_help_country tL_help_country, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!c3.h0.t(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || vh.u(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || vh.u(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.bb
    public final void C(Canvas canvas, int i10) {
        this.t0 = i10;
        float f7 = AndroidUtilities.statusBarHeight;
        zg.c cVar = this.a0;
        cVar.setTranslationY(Math.max(i10, (((cVar.getMeasuredHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(40.0f)) / 2.0f) + f7));
        float translationY = cVar.getTranslationY() + cVar.getMeasuredHeight();
        this.Y.setTranslationY(translationY);
        this.d.setTranslationY((r2.getMeasuredHeight() + cVar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f));
        int w02 = y6.w0(y6.h5, this.resourcesProvider);
        Paint paint = this.b0;
        paint.setColor(w02);
        int max = Math.max(0, i10);
        boolean z10 = max < AndroidUtilities.statusBarHeight;
        h6 h6Var = this.m0;
        int lerp = AndroidUtilities.lerp(max, 0, h6Var.e(z10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.backgroundPaddingLeft, lerp, this.containerView.getWidth() - this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f) + this.containerView.getHeight());
        float dp = (1.0f - h6Var.c) * AndroidUtilities.dp(14.0f);
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
        arrayList.addAll(s.e(this.q0.id));
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
        u6 u6Var = this.resourcesProvider;
        t0 t0Var = new t0(this, 0);
        t0 t0Var2 = new t0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.T = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new org.telegram.ui.Components.voip.j1(t0Var, 27));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new org.telegram.ui.Components.voip.j1(t0Var2, 24));
        alertDialog$Builder.p();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.q0;
        if (i10 == 1) {
            long j10 = chat.id;
            x0 x0Var = new x0(this, z10, 0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new l71(11, messagesController, x0Var));
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            x0 x0Var2 = new x0(this, z10, 1);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            connectionsManager2.sendRequest(tL_help_getCountriesList, new bi.i0(x0Var2, 24));
            return;
        }
        long j11 = chat.id;
        w0 w0Var = new w0(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new i3(messagesController2, j11, w0Var, 7));
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
            arrayList.addAll(s.e(this.q0.id));
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
        y0 y0Var = this.Y;
        y0Var.setText("");
        y0Var.d.b(false);
        y0Var.b(false, hashSet2, new t0(this, 4), this.k0);
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
                    mVar.c.b.E(0);
                    a0 a0Var = mVar.a;
                    ArrayList arrayList2 = a0Var.d0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = xg.d.v;
                        a0Var.i0 = 0;
                    } else {
                        int i12 = xg.d.v;
                        a0Var.i0 = 1;
                    }
                    a0Var.n0 = 0;
                    a0Var.a0(false, true);
                    a0Var.Z(true);
                    a0Var.N();
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
                    nVar.b.E(0);
                    a0 a0Var2 = mVar2.a;
                    boolean z11 = !nVar.isKeyboardVisible();
                    ArrayList arrayList4 = a0Var2.c0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    a0Var2.a0(z11, true);
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
                mVar3.c.b.E(0);
                a0 a0Var3 = mVar3.a;
                ArrayList arrayList7 = a0Var3.e0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                a0Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        mm0 mm0Var = this.d;
        if (!z10) {
            mm0Var.v0(0);
            return;
        }
        mi.n nVar = new mi.n(getContext(), 2, 0.6f);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(38.0f);
        mm0Var.getLayoutManager().w0(nVar);
    }

    public final void Y() {
        int i10 = this.r0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) s.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        m mVar = this.u0;
        if (mVar != null) {
            new wc(mVar.c.container, mVar.b).R(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z10) {
        fi.d dVar = this.X;
        dVar.setShowZero(false);
        int i10 = this.r0;
        dVar.i(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.e0;
        dVar.b(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        wg.h hVar;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        ArrayList arrayList2 = this.d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            wg.g gVar = new wg.g(9, false);
            gVar.i = 1;
            gVar.j = i11;
            gVar.g = string;
            arrayList2.add(gVar);
        }
        wg.g gVar2 = new wg.g(10, false);
        z3 z3Var = this.Z;
        gVar2.q = z3Var;
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
                        wg.g gVar3 = new wg.g(6, true);
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
                    wg.g gVar4 = new wg.g(7, false);
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
            wg.g gVar5 = new wg.g(3, true);
            gVar5.d = inputPeer;
            gVar5.c = null;
            gVar5.e = null;
            gVar5.k = contains2;
            arrayList2.add(gVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new wg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        wg.g gVar6 = new wg.g(-1, false);
        gVar6.l = max;
        arrayList2.add(gVar6);
        if (hashSet.size() > 0 && this.r0 != 3) {
            z3Var.a(LocaleController.getString(R.string.UsersDeselectAll), new v0(this, 0));
        } else if (z10) {
            z3Var.setRightText(null);
        } else {
            y3 y3Var = z3Var.b;
            y3Var.c(null, false, true);
            y3Var.setOnClickListener(null);
            y3Var.setVisibility(0);
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
            if (childAt instanceof zg.l) {
                int R = RecyclerView.R(childAt) - 1;
                if (R >= 0) {
                    ArrayList arrayList = this.d0;
                    if (R < arrayList.size()) {
                        wg.g gVar = (wg.g) arrayList.get(R);
                        zg.l lVar = (zg.l) childAt;
                        lVar.c(gVar.k, z10);
                        TLRPC.Chat chat = gVar.e;
                        if (chat != null) {
                            lVar.i(this.o0.F(chat) > 200 ? 0.3f : 1.0f, z10);
                        } else {
                            lVar.i(1.0f, z10);
                        }
                    }
                }
                i10++;
            }
            if (childAt instanceof zg.b) {
                ((zg.b) childAt).c(this.e0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void c0() {
        String formatPluralStringComma;
        int i10 = this.r0;
        z3 z3Var = this.Z;
        if (i10 == 1) {
            TLRPC.Chat chat = this.q0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.o0.F(chat) - 1));
            z3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) s.f(), new Object[0]);
            z3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            z3Var.setLayerHeight(1);
        }
        z3Var.setText(formatPluralStringComma);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        k kVar = this.s0;
        if (kVar != null) {
            kVar.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        AndroidUtilities.cancelRunOnUIThread(this.v0);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        wg.h hVar = new wg.h(getContext(), this.resourcesProvider, true);
        this.o0 = hVar;
        return hVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        int i10 = this.r0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
