// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.PollVotesAlert$UserCell;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ te(c51 c51Var, TLObject tLObject, nx0[] nx0VarArr, vnb vnbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = c51Var;
        this.d = tLObject;
        this.e = nx0VarArr;
        this.h = vnbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fd  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 12;
        byte b4 = 5;
        final int i = this.b;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                new b2a((Activity) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new zd(i, obj3, (byte) 1), (vnb) obj2).show();
                break;
            case 1:
                xi5 xi5Var = (xi5) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject = (TLObject) obj3;
                fu fuVar = (fu) obj2;
                xi5Var.r = false;
                if (!((ex) obj4).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            fuVar.a(4, false);
                            break;
                        } else {
                            uc7.s1(i).j4(tL_contacts_resolvedPeer.users, false);
                            uc7.s1(i).c4(tL_contacts_resolvedPeer.chats, false);
                            jf7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            xi5Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                fuVar.a(4, false);
                                break;
                            } else {
                                fuVar.a(0, false);
                                break;
                            }
                        }
                    } else {
                        fuVar.a(4, false);
                        break;
                    }
                }
                break;
            case 2:
                ((yd0) obj5).e((Runnable[]) obj4, (Bitmap) obj, (lr5) obj3, this.b, (ksd[]) obj2);
                break;
            case 3:
                rv0 rv0Var = (rv0) obj5;
                nv0 nv0Var = (nv0) obj;
                pv0 pv0Var = (pv0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z3 = ((TLObject) obj4) instanceof TLRPC.TL_boolTrue;
                int i2 = this.b;
                if (z3) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        rv0.t(i2, nv0Var, pv0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    rv0Var.Y(tL_error2.text);
                    break;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rv0Var.getContext());
                    String M0 = ob6.M0(2131752879, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131752880, null);
                    alertDialog$Builder.j(ob6.M0(2131752890, null), new o(rv0Var, strArr, (byte) 25));
                    alertDialog$Builder.g(ob6.M0(2131752885, null), new rm0((byte) 7));
                    rv0Var.W(3, idVar, new gu0(strArr, i2, nv0Var, pv0Var, (byte) 1));
                    break;
                }
            case 4:
                TLObject tLObject2 = (TLObject) obj5;
                id idVar2 = (id) obj4;
                Context context = (Context) obj;
                vnb vnbVar = (vnb) obj2;
                gc5 gc5Var = (gc5) obj3;
                boolean z4 = tLObject2 instanceof TLRPC.Updates;
                int i3 = this.b;
                if (z4) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    uc7.s1(i3).j4(updates.users, false);
                    uc7.s1(i3).c4(updates.chats, false);
                    ArrayList z0 = uc7.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size = z0.size();
                    TLRPC.GroupCall groupCall = null;
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj6 = z0.get(i4);
                        i4++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    idVar2.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i91.l0(context, i3, tL_inputGroupCall, groupCall.invite_link, vnbVar, true, true);
                        hl.c3(gc5Var);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    uc7.s1(i3).j4(groupcall.users, false);
                    uc7.s1(i3).c4(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i3).sendRequest(exportgroupcallinvite, new rt(idVar2, context, i3, exportgroupcallinvite, vnbVar, gc5Var));
                    break;
                } else {
                    idVar2.dismiss();
                    hl.c3(gc5Var);
                    break;
                }
                break;
            case 5:
                vc2 vc2Var = (vc2) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                ps0 ps0Var = (ps0) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = vc2Var.n;
                ArrayList arrayList2 = vc2Var.e;
                if (vc2Var.G.remove(Integer.valueOf(i))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        uc7.s1(vc2Var.C.a).j4(groupparticipants.users, false);
                        uc7.s1(vc2Var.C.a).c4(groupparticipants.chats, false);
                        int size2 = groupparticipants.participants.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i5);
                            long B1 = r47.B1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) vc2Var.d.f(B1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                vc2Var.o(groupCallParticipant2, false);
                            }
                            vc2Var.d.k(B1, groupCallParticipant);
                            arrayList2.add(groupCallParticipant);
                            vc2Var.o(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(B1))) {
                                Long valueOf = Long.valueOf(B1);
                                hashSet2.remove(valueOf);
                                vc2Var.j.remove(valueOf);
                            }
                        }
                        if (vc2Var.b.participants_count < vc2Var.d.m()) {
                            vc2Var.b.participants_count = vc2Var.d.m();
                        }
                        vc2Var.B();
                        jn7.f(vc2Var.C.a).k(jn7.w2, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
                        if (ps0Var != null) {
                            ((VoIPService) ps0Var.c).lambda$createGroupInstance$73(ps0Var.b, (int[]) ps0Var.d, arrayList);
                        } else {
                            vc2Var.x();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    break;
                }
                break;
            case 6:
                sz6 sz6Var = (sz6) obj5;
                h9a h9aVar = (h9a) obj;
                String str = h9aVar.b;
                yx6 yx6Var = (yx6) obj3;
                int i6 = this.b;
                gk5 gk5Var = (gk5) obj2;
                rx6 rx6Var = sz6Var.b;
                xw6 M = rx6Var.M((IBinder) obj4);
                if (M != null && rx6Var.Y(M)) {
                    try {
                        bn2 c = bn2.c(h9aVar);
                        Object obj7 = c.g;
                        int i7 = c.b;
                        if (!c.a()) {
                            efd.f("MediaSessionStub", "Can't execute predefined custom command: ".concat(str));
                            sz6.W(yx6Var, M, i6, new gaa(-6));
                            break;
                        } else {
                            h9a h9aVar2 = c.a;
                            if (h9aVar2 != null) {
                                yve.p(h9aVar2.a == 40010);
                                sz6Var.d(gk5Var, i6, null, 40010, new gz6(new kz6(c), (byte) 1));
                                break;
                            } else {
                                yx6Var.t();
                                og8 og8Var = yx6Var.t;
                                if (i7 == 1) {
                                    if (obj7 != null) {
                                        z = ((Boolean) obj7).booleanValue();
                                    } else if (!og8Var.s()) {
                                        z = true;
                                    }
                                    if (!z) {
                                        sz6Var.Q(M, i6);
                                    } else if (i7 == 31) {
                                        obj7.getClass();
                                        sz6Var.S(M, i6, 31, new gz6(new rm6(new bm6((ft6) obj7, (byte) 8), new hz6((byte) 0), b2), (byte) 1));
                                    } else {
                                        sz6Var.S(M, i6, i7, sz6.X(new kz6(c)));
                                    }
                                    rx6Var.F(M);
                                    break;
                                }
                                z = false;
                                if (!z) {
                                }
                                rx6Var.F(M);
                            }
                        }
                    } catch (RuntimeException e2) {
                        efd.g("MediaSessionStub", "Failed to convert predefined custom command: ".concat(str), e2);
                        sz6.W(yx6Var, M, i6, new gaa(-3));
                        return;
                    }
                }
                break;
            case 7:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr2 = (String[]) obj4;
                Context context2 = (Context) obj;
                sq7 sq7Var = (sq7) obj3;
                e eVar = (e) obj2;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr2[0])) {
                    sq7Var.run();
                    break;
                } else {
                    uq7.c(context2, this.b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new v35(strArr2, sq7Var, (byte) 12), true, new kc((byte) 10), eVar.getResourceProvider());
                    break;
                }
            case 8:
                TLObject tLObject4 = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                bt1 bt1Var = (bt1) obj3;
                wk5 wk5Var = (wk5) obj2;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    uc7.s1(i).j4(tL_photos_photo.users, false);
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(yac.h(i).n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && X1 != null) {
                        TLRPC.PhotoSize w = xb4.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w2 = xb4.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w == null || photoSize == null || photoSize.location == null) {
                            z2 = true;
                        } else {
                            xb4.G(i);
                            File J = xb4.J(w, null, true, true);
                            xb4.G(i);
                            xb4.J(photoSize.location, null, true, true).renameTo(J);
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize.location.volume_id);
                            sb.append("_");
                            String l = uh9.l(sb, photoSize.location.local_id, "@50_50");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(w.location.volume_id);
                            sb2.append("_");
                            String l2 = uh9.l(sb2, w.location.local_id, "@50_50");
                            z2 = true;
                            in5.z().O(l, l2, jn5.l(i, 1, X1));
                        }
                        if (w2 != null && photoSize2 != null && photoSize2.location != null) {
                            xb4.G(i);
                            File J2 = xb4.J(w2, null, z2, z2);
                            xb4.G(i);
                            xb4.J(photoSize2.location, null, z2, z2).renameTo(J2);
                        }
                        u98.a(tL_photos_photo.photo, X1, false);
                        yac.h(i).v(X1);
                        yac.h(i).u(z2);
                        bt1Var.run();
                        d31.b0(wk5Var.getLastFragment()).V(Collections.singletonList(X1), hl.S2(ob6.M0(2131754212, null)), hl.N2(ob6.M0(2131754213, null), -1, 0, new me7(i, wk5Var, (byte) 5), null), null).j();
                        break;
                    }
                }
                break;
            case 9:
                ui8 ui8Var = (ui8) obj5;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList3 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                qi8 qi8Var = ui8Var.m1;
                ArrayList arrayList4 = ui8Var.w1;
                oi8 oi8Var = ui8Var.l1;
                ArrayList arrayList5 = ui8Var.z1;
                arrayList5.remove(((Integer[]) obj4)[i]);
                if (tLObject5 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject5;
                    uc7.s1(ui8Var.a).j4(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList3.add(new ti8(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList5.isEmpty()) {
                        int size3 = arrayList3.size();
                        boolean z5 = false;
                        for (int i8 = 0; i8 < size3; i8++) {
                            ti8 ti8Var = (ti8) arrayList3.get(i8);
                            int size4 = arrayList4.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 < size4) {
                                    ti8 ti8Var2 = (ti8) arrayList4.get(i9);
                                    if (Arrays.equals(ti8Var.d, ti8Var2.d)) {
                                        ti8Var2.c = ti8Var.c;
                                        if (ti8Var2.a != ti8Var.a || ti8Var2.b.size() != ti8Var.b.size()) {
                                            z5 = true;
                                        }
                                        ti8Var2.a = ti8Var.a;
                                        ti8Var2.b = ti8Var.b;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                        }
                        ui8Var.F1 = false;
                        if (oi8Var != null) {
                            if (ui8Var.B0 != 0 || ui8Var.H != null || z5) {
                                if (z5) {
                                    ui8Var.G0();
                                }
                                qi8Var.X(false);
                                break;
                            } else {
                                int childCount = oi8Var.getChildCount();
                                ArrayList arrayList6 = new ArrayList();
                                for (int i10 = 0; i10 < childCount; i10++) {
                                    View childAt = oi8Var.getChildAt(i10);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View G = oi8Var.G(childAt);
                                        f89 U = G == null ? null : oi8Var.U(G);
                                        if (U != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList6;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            qi8Var.y(U);
                                            pollVotesAlert$UserCell.E = null;
                                        }
                                    }
                                }
                                if (!arrayList6.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList6);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                ui8Var.F1 = false;
                                break;
                            }
                        }
                    }
                } else {
                    ui8Var.dismiss();
                    break;
                }
                break;
            case 10:
                e eVar2 = (e) obj4;
                List<Purchase> list = (List) obj;
                ekd ekdVar = (ekd) obj3;
                tl8 tl8Var = (tl8) obj2;
                if (((gi0) obj5).a == 0) {
                    yv1 yv1Var = new yv1(eVar2, b4);
                    int i11 = this.b;
                    if (list != null && !list.isEmpty() && !yac.h(i11).p()) {
                        for (Purchase purchase : list) {
                            if (purchase.c().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (ekdVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_assignPlayMarketTransaction, new lh(i11, yv1Var, eVar2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    di0.h().c("telegram_premium", new hw(yv1Var, b3));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (ekdVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new rt(eVar2, tL_inputStorePaymentPremiumSubscription2, tl8Var, ekdVar, i11, tL_payments_canPurchaseStore));
                    break;
                }
                break;
            case 11:
                TLObject tLObject6 = (TLObject) obj4;
                nx0[] nx0VarArr = (nx0[]) obj;
                vnb vnbVar2 = (vnb) obj2;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj3;
                ((c51) obj5).setLoading(false);
                if (tLObject6 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject6;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new d31(nx0VarArr[0].F, vnbVar2).t(ob6.M0(2131743534, null), null).k(false);
                        break;
                    } else {
                        final long j = tL_starsSubscriptionPricing.amount;
                        jxa.v(i, false).i0(tL_messages_checkChatInvite.hash, chatInvite, new icc() { // from class: lxa
                            @Override // icc
                            public final void a(Object obj8, Object obj9) {
                                Long l3 = (Long) obj9;
                                if (!"paid".equals((String) obj8) || l3.longValue() == 0) {
                                    return;
                                }
                                hl.c3(new lb2((Object) l3, i, j, (byte) 6));
                            }
                        });
                        break;
                    }
                } else {
                    new d31(nx0VarArr[0].F, vnbVar2).t(ob6.M0(2131748667, null), null).k(false);
                    break;
                }
            default:
                ((u7b) obj5).c((TLObject) obj4, this.e, (ArrayList) obj3, (boolean[]) obj2, this.b);
                break;
        }
    }

    public /* synthetic */ te(u7b u7bVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 12;
        this.c = u7bVar;
        this.d = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.b = i;
    }

    public /* synthetic */ te(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
        this.h = tLObject;
    }

    public /* synthetic */ te(Object obj, int i, TLObject tLObject, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    public /* synthetic */ te(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ te(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
        this.h = obj5;
    }

    public /* synthetic */ te(TLObject tLObject, int i, id idVar, Context context, vnb vnbVar, gc5 gc5Var) {
        this.a = (byte) 4;
        this.c = tLObject;
        this.b = i;
        this.d = idVar;
        this.e = context;
        this.h = vnbVar;
        this.f = gc5Var;
    }
}
