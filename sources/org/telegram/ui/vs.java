package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 2;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.mp.u1(((ws) obj2).a).V3((TLRPC.Updates) obj, false);
                break;
            case 1:
                ut utVar = (ut) obj2;
                a0.h hVar = (a0.h) obj;
                vt vtVar = utVar.V2;
                org.telegram.ui.Components.lc.x(vtVar.getParentActivity(), vtVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, utVar.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, utVar.J0)).j();
                break;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                xt xtVar = (xt) ((a7.d) obj2).c;
                xtVar.a();
                org.telegram.ui.Cells.m8 m8Var = xtVar.e;
                xtVar.c();
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q6, false);
                org.telegram.ui.Components.mh0 mh0Var = xtVar.d;
                mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                if (org.telegram.ui.ActionBar.n6.k1()) {
                    m8Var.p(org.telegram.messenger.gd.M0(2131745271, null), mh0Var, true);
                    m8Var.x += 2;
                } else {
                    m8Var.p(org.telegram.messenger.gd.M0(2131745272, null), mh0Var, true);
                    m8Var.x += 2;
                }
                org.telegram.ui.ActionBar.n6.M1(h2Var);
                break;
            case 3:
                ki.t2.n(((cx) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 4:
                cx cxVar = (cx) obj2;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj;
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    x2VarArr[0] = null;
                }
                org.telegram.messenger.g0.h3(new gu(cxVar, 18), 300L);
                break;
            case 5:
                cx cxVar2 = (cx) obj2;
                cxVar2.getMessagesController().e((ArrayList) obj, (cxVar2.Y2 == 0 && cxVar2.a3 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                cx cxVar3 = ((hv) obj2).a;
                cxVar3.J2 = null;
                org.telegram.ui.Components.cp0 cp0Var = cxVar3.I2;
                if (cp0Var != null && cp0Var.h) {
                    cp0Var.e(charSequence, false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ActionBar.h2[] h2VarArr = (org.telegram.ui.ActionBar.h2[]) obj;
                ((cw) obj2).b.removeSelfFromStack();
                if (h2VarArr[1] != null) {
                    h2VarArr[0].removeSelfFromStack();
                    h2VarArr[1].finishFragment();
                    break;
                } else {
                    h2VarArr[0].finishFragment();
                    break;
                }
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                cx cxVar4 = ((tw) obj2).b;
                boolean z10 = cxVar4.I4(cxVar4.f0[0]) && !cxVar4.U1;
                cxVar4.U4(true, true);
                cxVar4.z3();
                if (z10 && cxVar4.T1 != null) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.add(Long.valueOf(((TLRPC.Dialog) arrayList.get(i13)).id));
                    }
                    boolean z11 = false;
                    for (int size = cxVar4.T1.size() - 1; size >= 0; size--) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar4.T1.get(size);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && hashSet.contains(Long.valueOf(dialog.id)) && cxVar4.H4(cxVar4.f0[0], dialog)) {
                            cxVar4.T1.remove(size);
                            z11 = true;
                        }
                    }
                    if (z11) {
                        cxVar4.f0[0].q(false);
                    }
                }
                while (i12 < arrayList.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList.get(i12)).id;
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
                    if (cxVar4.getMessagesController().y2(j3) || cxVar4.getMessagesController().F2(j3)) {
                        org.telegram.messenger.mp messagesController = cxVar4.getMessagesController();
                        org.telegram.messenger.tr messagesStorage = messagesController.getMessagesStorage();
                        org.telegram.messenger.kl klVar = new org.telegram.messenger.kl(messagesController, j3);
                        org.telegram.messenger.q5 q5Var = messagesStorage.a;
                        org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j3, klVar, 5);
                        j3 = j3;
                        q5Var.c(d4Var);
                    }
                    cxVar4.getMessagesController().v3(j3, 0L);
                    org.telegram.messenger.mp messagesController2 = cxVar4.getMessagesController();
                    int i14 = dialog2.top_message;
                    messagesController2.q3(j3, i14, i14, dialog2.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 9:
                ((tw) obj2).d((org.telegram.messenger.ro) obj);
                break;
            case 10:
                nx nxVar = (nx) obj2;
                bn bnVar = nxVar.a;
                org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(bnVar.getParentActivity(), nxVar.a, org.telegram.messenger.fj.j1(((org.telegram.messenger.fj) obj).k), null, bnVar.a0, bnVar.getResourceProvider());
                boolean V9 = bnVar.V9();
                iw0Var.i0 = V9;
                iw0Var.n = V9;
                bnVar.showDialog(iw0Var);
                break;
            case 11:
                iy iyVar = (iy) obj2;
                iyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                jy jyVar = iyVar.F;
                ky kyVar = jyVar.c;
                org.telegram.messenger.x10 x10Var = kyVar.x;
                if (x10Var != null) {
                    x10Var.a(kyVar.d);
                }
                jyVar.c.finishFragment();
                break;
            case 12:
                kz kzVar = (kz) obj2;
                ky kyVar2 = new ky(kzVar.r, ((cz) obj).m);
                kyVar2.y = new oy(kzVar, 1);
                kyVar2.x = new oy(kzVar, 2);
                kzVar.presentFragment(kyVar2);
                break;
            case 13:
                kz kzVar2 = (kz) obj2;
                kzVar2.h = false;
                kzVar2.s = false;
                kzVar2.r.g = kzVar2.E;
                kzVar2.o0(true);
                kzVar2.getNotificationCenter().k(org.telegram.messenger.ks.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 14:
                kz kzVar3 = (kz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = kzVar3.M;
                kzVar3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    kzVar3.getMessagesController().Z3(tL_chatlists_exportedInvites.chats, false);
                    kzVar3.getMessagesController().f4(tL_chatlists_exportedInvites.users, false);
                    arrayList2.clear();
                    arrayList2.addAll(tL_chatlists_exportedInvites.invites);
                    kzVar3.C0();
                }
                kzVar3.N = 0;
                break;
            case 15:
                kz kzVar4 = (kz) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.messenger.ro roVar = kzVar4.r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                kzVar4.getMessagesController().p4(roVar);
                org.telegram.messenger.tr messagesStorage2 = kzVar4.getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.rq(i10, messagesStorage2, roVar));
                kzVar4.finishFragment();
                break;
            case 16:
                kz kzVar5 = (kz) obj2;
                kzVar5.getClass();
                kzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 17:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new d00(filtersSetupActivity, i10));
                    break;
                }
                break;
            case 18:
                FiltersSetupActivity filtersSetupActivity2 = ((j00) obj2).e;
                filtersSetupActivity2.getMessagesController().W0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(org.telegram.messenger.ks.O2, new Object[0]);
                break;
            case 19:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((f40) obj2).X3;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList4.get(i15)).x != null) {
                        arrayList3.remove(((org.telegram.ui.Components.voip.y) arrayList4.get(i15)).x);
                    }
                }
                while (i12 < arrayList3.size()) {
                    org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList3.get(i12);
                    if (u3Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, u3Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(u3Var.a, u3Var.b);
                    }
                    i12++;
                }
                break;
            case 20:
                f40 f40Var = (f40) obj2;
                org.telegram.messenger.ks.f(f40Var.o1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                f40Var.dismiss();
                break;
            case 21:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.n2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new vs(22, m4Var, c8.j0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 22:
                ((f40) ((m4) obj2).b).P2.setNewColors((int[]) obj);
                break;
            case 23:
                n50.a0((n50) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                j50 j50Var = (j50) obj2;
                String str = (String) obj;
                k50 k50Var = j50Var.a;
                k50Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                k50Var.c = k50Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new e00(i11, j50Var, str), 66);
                break;
            case 25:
                TLObject tLObject2 = (TLObject) obj;
                k50 k50Var2 = ((j50) obj2).a;
                if (tLObject2 != null) {
                    n50.f0(k50Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    n50.f0(k50Var2.h, null);
                    break;
                }
            case 26:
                m50 m50Var = (m50) obj2;
                String str2 = (String) obj;
                m50Var.h = str2;
                n50 n50Var = m50Var.r;
                if (n50Var.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                m50Var.n = n50Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new z9(m50Var, str2, str2, 14), 66);
                break;
            case 27:
                org.telegram.messenger.g0.h3(new oi.s2(26, (b60) obj2, (org.telegram.messenger.t2) obj), 150L);
                break;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.f();
                break;
            default:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i16 = 28;
                if (str3.trim().toLowerCase().length() == 0) {
                    org.telegram.messenger.g0.g3(new vs(i16, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = languageSelectActivity2.h.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) languageSelectActivity2.h.get(i17);
                        if (cdVar.a.toLowerCase().startsWith(str3) || cdVar.b.toLowerCase().startsWith(str3)) {
                            arrayList5.add(cdVar);
                        }
                    }
                    int size3 = languageSelectActivity2.f.size();
                    while (i12 < size3) {
                        org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) languageSelectActivity2.f.get(i12);
                        if (cdVar2.a.toLowerCase().startsWith(str3) || cdVar2.b.toLowerCase().startsWith(str3)) {
                            arrayList5.add(cdVar2);
                        }
                        i12++;
                    }
                    org.telegram.messenger.g0.g3(new vs(i16, languageSelectActivity2, arrayList5));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vs(ut utVar, a0.h hVar, int i7) {
        this.a = 1;
        this.b = utVar;
        this.c = hVar;
    }
}
