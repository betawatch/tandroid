package tg;

import ai.m8;
import ai.u1;
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
import ci.r1;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.aj1;
import org.telegram.ui.o20;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class z0 extends bb {
    public final ci.d X;
    public final y0 Y;
    public final v3 Z;
    public final xg.c a0;
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
    public ug.g o0;
    public int p0;
    public final TLRPC.Chat q0;
    public int r0;
    public j s0;
    public int t0;
    public l u0;
    public final p8.b v0;

    public z0(n2 n2Var, long j3) {
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
        this.v0 = new p8.b(this, 5);
        this.backgroundPaddingLeft = 0;
        this.q0 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        ((ViewGroup) this.e.getParent()).removeView(this.e);
        ViewGroup viewGroup = this.containerView;
        qr qrVar = qr.h;
        this.m0 = new e6(viewGroup, 0L, 350L, qrVar);
        xg.c cVar = new xg.c(getContext(), this.resourcesProvider);
        this.a0 = cVar;
        cVar.setOnCloseClickListener(new t0(this, 7));
        cVar.setText(y());
        cVar.setCloseImageVisible(true);
        cVar.e.c(0.0f, false);
        y0 y0Var = new y0(this, getContext(), this.resourcesProvider);
        this.Y = y0Var;
        int i10 = j6.h5;
        y0Var.setBackgroundColor(getThemedColor(i10));
        y0Var.setOnSearchTextChange(new w0(this, 0));
        this.Z = new v3(getContext(), this.resourcesProvider);
        c0();
        ViewGroup viewGroup2 = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup2.addView(cVar, y5.f(-2.0f, 55, i11, 0, i11, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup3.addView(y0Var, y5.f(-2.0f, 55, i12, 0, i12, 0));
        o20 o20Var = new o20(getContext(), this.resourcesProvider, (wl0) null);
        o20Var.setClickable(true);
        o20Var.setOrientation(1);
        o20Var.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        o20Var.setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        ci.d dVar = new ci.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.setOnClickListener(new v0(this, 1));
        o20Var.addView(dVar, y5.q(-1, 48, 87));
        ViewGroup viewGroup4 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup4.addView(o20Var, y5.f(-2.0f, 87, i13, 0, i13, 0));
        ug.g gVar = this.o0;
        wl0 wl0Var = this.d;
        gVar.n = arrayList;
        gVar.f = wl0Var;
        int i14 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(60.0f));
        this.d.j(new tb0(this, 14));
        this.d.setOnItemClickListener(new r5.d(this, 9));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(qrVar);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new r1(this, 8));
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
        if (view instanceof r8) {
            linkedHashMap.clear();
            z0Var.W(true);
        } else if (view instanceof xg.l) {
            xg.l lVar = (xg.l) view;
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
            if ((hashSet.size() == 11 && z0Var.r0 == 1) || (hashSet.size() == s.f() + 1 && z0Var.r0 == 2)) {
                hashSet.remove(Long.valueOf(j3));
                z0Var.Y();
                return;
            }
            y0Var.b(true, hashSet, new t0(z0Var, 1), null);
            z0Var.b0(true, false);
            if (chat != null && !ChatObject.isPublic(chat) && hashSet.contains(Long.valueOf(j3))) {
                Context context = z0Var.n.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = z0Var.resourcesProvider;
                ai.j jVar = new ai.j(z0Var, j3, 29);
                t0 t0Var = new t0(z0Var, 2);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                alertDialog$Builder.a.R = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannel : R.string.BoostingGiveawayPrivateGroup);
                alertDialog$Builder.a.T = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.BoostingGiveawayPrivateChannelWarning : R.string.BoostingGiveawayPrivateGroupWarning);
                alertDialog$Builder.k(LocaleController.getString("Add", R.string.Add), new s5.e(1, atomicBoolean, t0Var));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), new s9.b(5));
                alertDialog$Builder.j(new ei.e0(15, atomicBoolean, jVar));
                alertDialog$Builder.o();
            } else if (chat != null) {
                z0Var.R();
            }
        }
        if (view instanceof xg.b) {
            long hashCode = ((xg.b) view).getCountry().default_name.hashCode();
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
        if (!e2.u(tL_help_country)) {
            return false;
        }
        String lowerCase = AndroidUtilities.translitSafe(tL_help_country.default_name).toLowerCase();
        if (lowerCase.startsWith(str) || wh.u(" ", str, lowerCase)) {
            return true;
        }
        String lowerCase2 = AndroidUtilities.translitSafe(tL_help_country.iso2).toLowerCase();
        return lowerCase2.startsWith(str) || wh.u(" ", str, lowerCase2);
    }

    @Override // org.telegram.ui.Components.bb
    public final void B(Canvas canvas, int i10) {
        this.t0 = i10;
        float f7 = AndroidUtilities.statusBarHeight;
        xg.c cVar = this.a0;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.resourcesProvider;
        t0 t0Var = new t0(this, 0);
        t0 t0Var2 = new t0(this, 6);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
        alertDialog$Builder.a.T = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString("BoostingApplyChangesCountries", R.string.BoostingApplyChangesCountries) : LocaleController.getString("BoostingApplyChangesChannels", R.string.BoostingApplyChangesChannels) : LocaleController.getString("BoostingApplyChangesUsers", R.string.BoostingApplyChangesUsers);
        alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new r5.d(t0Var, 8));
        alertDialog$Builder.h(LocaleController.getString("Discard", R.string.Discard), new r5.d(t0Var2, 5));
        alertDialog$Builder.o();
        return true;
    }

    public final void T(int i10, String str, boolean z10) {
        TLRPC.Chat chat = this.q0;
        if (i10 == 1) {
            long j3 = chat.id;
            x0 x0Var = new x0(this, z10, 0);
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
            connectionsManager.sendRequest(tL_channels_getParticipants, new aj1(2, messagesController, x0Var));
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
            connectionsManager2.sendRequest(tL_help_getCountriesList, new m8(x0Var2, 19));
            return;
        }
        long j10 = chat.id;
        w0 w0Var = new w0(this, 1);
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        tL_contacts_search.limit = 50;
        connectionsManager3.sendRequest(tL_contacts_search, new u1(messagesController2, j10, w0Var, 4));
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
                l lVar = this.u0;
                if (lVar != null) {
                    lVar.c.b.E(0);
                    a0 a0Var = lVar.a;
                    ArrayList arrayList2 = a0Var.d0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        int i11 = vg.d.s;
                        a0Var.i0 = 0;
                    } else {
                        int i12 = vg.d.s;
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
                l lVar2 = this.u0;
                if (lVar2 != null) {
                    m mVar = lVar2.c;
                    mVar.b.E(0);
                    a0 a0Var2 = lVar2.a;
                    boolean z11 = !mVar.isKeyboardVisible();
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
            l lVar3 = this.u0;
            if (lVar3 != null) {
                lVar3.c.b.E(0);
                a0 a0Var3 = lVar3.a;
                ArrayList arrayList7 = a0Var3.e0;
                arrayList7.clear();
                arrayList7.addAll(arrayList5);
                a0Var3.a0(false, true);
            }
        }
    }

    public final void X(boolean z10) {
        wl0 wl0Var = this.d;
        if (!z10) {
            wl0Var.v0(0);
            return;
        }
        ji.o oVar = new ji.o(getContext(), 2, 0.6f);
        oVar.a = 1;
        oVar.p = AndroidUtilities.dp(38.0f);
        wl0Var.getLayoutManager().w0(oVar);
    }

    public final void Y() {
        int i10 = this.r0;
        String formatPluralString = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]) : LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) s.f(), new Object[0]) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers);
        l lVar = this.u0;
        if (lVar != null) {
            new xc(lVar.c.container, lVar.b).Q(R.raw.chats_infotip, 36, formatPluralString).k(true);
        }
    }

    public final void Z(boolean z10) {
        ci.d dVar = this.X;
        dVar.setShowZero(false);
        int i10 = this.r0;
        dVar.g(i10 != 1 ? (i10 == 2 || i10 == 3) ? LocaleController.getString(R.string.Save) : "" : LocaleController.getString(R.string.BoostingSaveRecipients), z10, true);
        HashSet hashSet = this.e0;
        dVar.b(hashSet.size(), z10);
        dVar.setEnabled(hashSet.size() > 0);
    }

    public final void a0(boolean z10, boolean z11) {
        int i10;
        ug.g gVar;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        ArrayList arrayList2 = this.d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.r0 == 1) {
            int i11 = R.drawable.menu_random;
            String string = LocaleController.getString(R.string.GiveawayChooseUsersRandomly);
            ug.f fVar = new ug.f(9, false);
            fVar.i = 1;
            fVar.j = i11;
            fVar.g = string;
            arrayList2.add(fVar);
        }
        ug.f fVar2 = new ug.f(10, false);
        v3 v3Var = this.Z;
        fVar2.q = v3Var;
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
                        ug.f fVar3 = new ug.f(6, true);
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
                    ug.f fVar4 = new ug.f(7, false);
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
            ug.f fVar5 = new ug.f(3, true);
            fVar5.d = inputPeer;
            fVar5.c = null;
            fVar5.e = null;
            fVar5.k = contains2;
            arrayList2.add(fVar5);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ug.f(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        ug.f fVar6 = new ug.f(-1, false);
        fVar6.l = max;
        arrayList2.add(fVar6);
        if (hashSet.size() > 0 && this.r0 != 3) {
            v3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new v0(this, 0));
        } else if (z10) {
            v3Var.setRightText(null);
        } else {
            u3 u3Var = v3Var.b;
            u3Var.c(null, false, true);
            u3Var.setOnClickListener(null);
            u3Var.setVisibility(0);
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
            wl0 wl0Var = this.d;
            if (i10 >= wl0Var.getChildCount()) {
                Z(z10);
                return;
            }
            View childAt = wl0Var.getChildAt(i10);
            if (childAt instanceof xg.l) {
                int S = RecyclerView.S(childAt) - 1;
                if (S >= 0) {
                    ArrayList arrayList = this.d0;
                    if (S < arrayList.size()) {
                        ug.f fVar = (ug.f) arrayList.get(S);
                        xg.l lVar = (xg.l) childAt;
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
            if (childAt instanceof xg.b) {
                ((xg.b) childAt).c(this.e0.contains(Long.valueOf(r0.getCountry().default_name.hashCode())), true);
            }
            i10++;
        }
    }

    public final void c0() {
        String formatPluralStringComma;
        int i10 = this.r0;
        v3 v3Var = this.Z;
        if (i10 == 1) {
            TLRPC.Chat chat = this.q0;
            formatPluralStringComma = LocaleController.formatPluralStringComma(ChatObject.isChannelAndNotMegaGroup(chat) ? "Subscribers" : "Members", Math.max(0, this.o0.F(chat) - 1));
            v3Var.setLayerHeight(32);
        } else if (i10 == 2) {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToGroupChannelPlural", (int) s.f(), new Object[0]);
            v3Var.setLayerHeight(32);
        } else if (i10 != 3) {
            formatPluralStringComma = "";
        } else {
            formatPluralStringComma = LocaleController.formatPluralString("BoostingSelectUpToCountriesPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax, new Object[0]);
            v3Var.setLayerHeight(1);
        }
        v3Var.setText(formatPluralStringComma);
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
        a0(false, true);
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        ug.g gVar = new ug.g(getContext(), this.resourcesProvider, true);
        this.o0 = gVar;
        return gVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        int i10 = this.r0;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : LocaleController.getString(R.string.BoostingSelectCountry) : LocaleController.getString(R.string.BoostingAddChannelOrGroup) : LocaleController.getString(R.string.GiftPremium);
    }
}
