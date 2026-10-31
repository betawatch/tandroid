package org.telegram.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xs(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.tk0 tk0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 14;
        int i12 = 2;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) obj2;
                if (tk0Var2 != null) {
                    tk0Var2.setOnItemClickListener((org.telegram.ui.Components.gk0) obj);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.pj pjVar = (org.telegram.ui.Components.pj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new xs(i12, pjVar, new ArrayList()));
                    break;
                } else {
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = pjVar.f;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        nt ntVar = (nt) obj3;
                        String str = ntVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.i0.N3(ntVar.a).toLowerCase();
                        String str2 = ntVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.i0.N3(ntVar.b).toLowerCase();
                        String str3 = ntVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(N3) || lowerCase5.contains(" ".concat(N3)) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(ntVar);
                        }
                    }
                    org.telegram.messenger.i0.g3(new xs(2, pjVar, arrayList));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.pj pjVar2 = (org.telegram.ui.Components.pj) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                rt rtVar = (rt) pjVar2.n;
                if (rtVar.f) {
                    pjVar2.e = arrayList3;
                    if (rtVar.e && (tk0Var = rtVar.a) != null) {
                        s4.g0 adapter = tk0Var.getAdapter();
                        org.telegram.ui.Components.pj pjVar3 = rtVar.d;
                        if (adapter != pjVar3) {
                            rtVar.a.setAdapter(pjVar3);
                            rtVar.a.setFastScrollVisible(false);
                        }
                    }
                    pjVar2.f();
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.vp.r1(((ut) obj2).a).L3((TLRPC.Updates) obj, false);
                break;
            case 4:
                ru ruVar = (ru) obj2;
                a0.h hVar = (a0.h) obj;
                su suVar = ruVar.R2;
                org.telegram.ui.Components.cc.x(suVar.getParentActivity(), suVar.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, ruVar.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, ruVar.I0)).j();
                break;
            case 5:
                ay ayVar = (ay) obj2;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) obj;
                org.telegram.ui.ActionBar.z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                }
                org.telegram.messenger.i0.h3(new fv(ayVar, 10), 300L);
                break;
            case 6:
                ay ayVar2 = (ay) obj2;
                ayVar2.getMessagesController().e((ArrayList) obj, (ayVar2.W2 == 0 && ayVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 7:
                xh.m2.n(((ay) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                ay ayVar3 = ((iw) obj2).a;
                ayVar3.H2 = null;
                org.telegram.ui.Components.sp0 sp0Var = ayVar3.G2;
                if (sp0Var != null && sp0Var.h) {
                    sp0Var.e(charSequence, false);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.k2[] k2VarArr = (org.telegram.ui.ActionBar.k2[]) obj;
                ((cx) obj2).b.removeSelfFromStack();
                if (k2VarArr[1] != null) {
                    k2VarArr[0].removeSelfFromStack();
                    k2VarArr[1].finishFragment();
                    break;
                } else {
                    k2VarArr[0].finishFragment();
                    break;
                }
            case 10:
                ArrayList arrayList4 = (ArrayList) obj;
                ay ayVar4 = ((rx) obj2).b;
                ayVar4.L4(true, true);
                ayVar4.y3();
                while (i13 < arrayList4.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList4.get(i13)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                    if (ayVar4.getMessagesController().s2(j10) || ayVar4.getMessagesController().y2(j10)) {
                        org.telegram.messenger.vp messagesController = ayVar4.getMessagesController();
                        org.telegram.messenger.hs messagesStorage = messagesController.getMessagesStorage();
                        org.telegram.messenger.vl vlVar = new org.telegram.messenger.vl(messagesController, j10);
                        org.telegram.messenger.r5 r5Var = messagesStorage.a;
                        org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j10, vlVar, 5);
                        j10 = j10;
                        r5Var.c(d4Var);
                    }
                    ayVar4.getMessagesController().l3(j10, 0L);
                    org.telegram.messenger.vp messagesController2 = ayVar4.getMessagesController();
                    int i14 = dialog.top_message;
                    messagesController2.h3(j10, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                break;
            case 11:
                ((rx) obj2).d((org.telegram.messenger.ap) obj);
                break;
            case 12:
                ly lyVar = (ly) obj2;
                un unVar = lyVar.a;
                org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(unVar.getParentActivity(), lyVar.a, org.telegram.messenger.jj.k1(((org.telegram.messenger.jj) obj).k), null, unVar.Z, unVar.getResourceProvider());
                boolean J9 = unVar.J9();
                cx0Var.h0 = J9;
                cx0Var.n = J9;
                unVar.showDialog(cx0Var);
                break;
            case 13:
                gz gzVar = (gz) obj2;
                gzVar.getClass();
                ((org.telegram.ui.ActionBar.x1) obj).dismiss();
                hz hzVar = gzVar.E;
                iz izVar = hzVar.c;
                org.telegram.messenger.q20 q20Var = izVar.x;
                if (q20Var != null) {
                    q20Var.a(izVar.d);
                }
                hzVar.c.finishFragment();
                break;
            case 14:
                i00 i00Var = (i00) obj2;
                iz izVar2 = new iz(i00Var.r, ((a00) obj).m);
                izVar2.y = new lz(i00Var, 1);
                izVar2.x = new lz(i00Var, 2);
                i00Var.presentFragment(izVar2);
                break;
            case 15:
                i00 i00Var2 = (i00) obj2;
                i00Var2.h = false;
                i00Var2.s = false;
                i00Var2.r.g = i00Var2.D;
                i00Var2.n0(true);
                i00Var2.getNotificationCenter().k(org.telegram.messenger.zs.O2, new Object[0]);
                ((Runnable) obj).run();
                break;
            case 16:
                i00 i00Var3 = (i00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = i00Var3.L;
                i00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    i00Var3.getMessagesController().P3(tL_chatlists_exportedInvites.chats, false);
                    i00Var3.getMessagesController().V3(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    i00Var3.B0();
                }
                i00Var3.M = 0;
                break;
            case 17:
                i00 i00Var4 = (i00) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                org.telegram.messenger.ap apVar = i00Var4.r;
                if (x1Var != null) {
                    try {
                        x1Var.dismiss();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                i00Var4.getMessagesController().e4(apVar);
                org.telegram.messenger.hs messagesStorage2 = i00Var4.getMessagesStorage();
                messagesStorage2.a.c(new org.telegram.messenger.oi(29, messagesStorage2, apVar));
                i00Var4.finishFragment();
                break;
            case 18:
                i00 i00Var5 = (i00) obj2;
                i00Var5.getClass();
                i00Var5.r0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 19:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.e0(new a10(filtersSetupActivity, 3));
                    break;
                }
                break;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((f10) obj2).e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(org.telegram.messenger.zs.O2, new Object[0]);
                break;
            case 21:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((b50) obj2).P3;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    if (((org.telegram.ui.Components.voip.r) arrayList7.get(i15)).x != null) {
                        arrayList6.remove(((org.telegram.ui.Components.voip.r) arrayList7.get(i15)).x);
                    }
                }
                while (i13 < arrayList6.size()) {
                    org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList6.get(i13);
                    if (v3Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, v3Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(v3Var.a, v3Var.b);
                    }
                    i13++;
                }
                break;
            case 22:
                b50 b50Var = (b50) obj2;
                org.telegram.messenger.zs.f(b50Var.k1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                b50Var.dismiss();
                break;
            case 23:
                m4 m4Var = (m4) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.y1) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(new xs(24, m4Var, w7.l8.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 24:
                ((b50) ((m4) obj2).b).L2.setNewColors((int[]) obj);
                break;
            case 25:
                k60.Z((k60) obj2, (TLRPC.TL_error) obj);
                break;
            case 26:
                g60 g60Var = (g60) obj2;
                String str4 = (String) obj;
                h60 h60Var = g60Var.a;
                h60Var.e = str4;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str4;
                h60Var.c = h60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.t20(i11, g60Var, str4), 66);
                break;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                h60 h60Var2 = ((g60) obj2).a;
                if (tLObject2 != null) {
                    k60.e0(h60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    k60.e0(h60Var2.h, null);
                    break;
                }
            case 28:
                j60 j60Var = (j60) obj2;
                String str5 = (String) obj;
                j60Var.h = str5;
                k60 k60Var = j60Var.r;
                if (k60Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                j60Var.n = k60Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(j60Var, str5, str5, i11), 66);
                break;
            default:
                org.telegram.messenger.i0.h3(new h0(5, (z60) obj2, (org.telegram.messenger.w2) obj), 150L);
                break;
        }
    }

    public /* synthetic */ xs(ru ruVar, a0.h hVar, int i10) {
        this.a = 4;
        this.b = ruVar;
        this.c = hVar;
    }
}
