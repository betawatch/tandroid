package rh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.n00;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.s9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sm0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x06c6, code lost:
    
        if (r9 == 0) goto L244;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        int i10;
        SQLiteCursor sQLiteCursor;
        boolean z10;
        ArrayList arrayList;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j11;
        th.z2 z2Var;
        th.n7 n7Var;
        int i12 = 7;
        int i13 = 2;
        sm0 sm0Var = null;
        r9 = 0;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        sm0 sm0Var2 = null;
        r9 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        sm0 sm0Var3 = null;
        SQLiteCursor sQLiteCursor2 = 0;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                q70 q70Var = (q70) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error != null) {
                    q70Var.a(Boolean.FALSE, tL_error.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    vp.r1(e6Var.a).V3(paymentForm.users, false);
                    sm0Var = new sm0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    sm0Var = new sm0((TLRPC.PaymentReceipt) tLObject);
                }
                if (sm0Var == null) {
                    q70Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                sm0Var.Z0 = new d0(q70Var, i12);
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                if (!org.telegram.messenger.i0.u1(Q)) {
                    Q.presentFragment(sm0Var);
                    return;
                }
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                Q.showAsSheet(sm0Var, i2Var);
                return;
            case 1:
                e6 e6Var2 = (e6) this.b;
                boolean[] zArr = (boolean[]) this.c;
                String str = (String) this.d;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.e;
                j20 j20Var = (j20) this.f;
                zArr[0] = true;
                e6Var2.Y(str, chatInvite, new qh.d(j20Var, i12));
                return;
            case 2:
                hs hsVar = (hs) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                d0 d0Var = (d0) this.f;
                try {
                    try {
                        ?? r72 = 0;
                        sQLiteCursor2 = hsVar.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        i10 = 0;
                        j10 = 0;
                        while (sQLiteCursor2.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r72);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i10 = (int) sQLiteCursor2.longValue(1);
                                    j10 = sQLiteCursor2.longValue(2);
                                }
                                r72 = 0;
                            } catch (Exception e) {
                                e = e;
                                org.telegram.messenger.f8.g(e, true);
                                sQLiteCursor = sQLiteCursor2;
                                break;
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long o10 = org.telegram.messenger.o5.o(peer);
                                if (o10 > 0) {
                                    arrayList5.add(Long.valueOf(o10));
                                } else if (o10 < 0) {
                                    arrayList6.add(Long.valueOf(-o10));
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            hsVar.Q(TextUtils.join(",", arrayList6), arrayList3);
                        }
                        sQLiteCursor = sQLiteCursor2;
                        if (!arrayList5.isEmpty()) {
                            hsVar.n0(arrayList5, arrayList4, false);
                            sQLiteCursor = sQLiteCursor2;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        j10 = 0;
                        i10 = 0;
                    }
                    sQLiteCursor.dispose();
                    org.telegram.messenger.i0.g3(new n00(d0Var, arrayList2, i10, j10, arrayList4, arrayList3));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor2 != 0) {
                        sQLiteCursor2.dispose();
                    }
                    throw th2;
                }
            case 3:
                e6 e6Var3 = (e6) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                j20 j20Var2 = (j20) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error2 != null) {
                    j20Var2.a(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    vp.r1(e6Var3.a).V3(paymentForm2.users, false);
                    sm0Var3 = new sm0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    sm0Var3 = new sm0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (sm0Var3 == null) {
                    j20Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                sm0Var3.Z0 = new d0(j20Var2, 5);
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.i0.u1(Q2)) {
                    Q2.presentFragment(sm0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.i2 i2Var2 = new org.telegram.ui.ActionBar.i2();
                i2Var2.a = true;
                Q2.showAsSheet(sm0Var3, i2Var2);
                return;
            case 4:
                List list = (List) this.b;
                j20 j20Var3 = (j20) this.c;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.d;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.e;
                Activity activity = (Activity) this.f;
                if (list.isEmpty()) {
                    org.telegram.messenger.f8.b("StarsController.buy queryProductDetails done: no products");
                    org.telegram.messenger.i0.g3(new m4(j20Var3, 1));
                    return;
                }
                c5.m mVar = (c5.m) list.get(0);
                c5.i a2 = mVar.a();
                if (a2 == null) {
                    org.telegram.messenger.f8.b("StarsController.buy queryProductDetails done: no details");
                    org.telegram.messenger.i0.g3(new m4(j20Var3, 2));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                org.telegram.messenger.u1.i().d(mVar.c, new ig.i(j20Var3, 2));
                org.telegram.messenger.u1.i().h = new m4(j20Var3, 3);
                org.telegram.messenger.f8.b("StarsController.buy launchBillingFlow");
                org.telegram.messenger.u1 i17 = org.telegram.messenger.u1.i();
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(d20.s0);
                hf.b bVar = new hf.b(9, false);
                bVar.m0((c5.m) list.get(0));
                i17.l(activity, a10, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar.K()));
                return;
            case 5:
                e6 e6Var4 = (e6) this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                TLObject tLObject3 = (TLObject) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                q20 q20Var = (q20) this.f;
                int i18 = e6Var4.a;
                x1Var.dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    vp.r1(i18).V3(tL_payments_savedStarGifts.users, false);
                    vp.r1(i18).P3(tL_payments_savedStarGifts.chats, false);
                    for (int i19 = 0; i19 < tL_payments_savedStarGifts.gifts.size(); i19++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i19);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                q20Var.a(savedStarGift);
                return;
            case 6:
                e6 e6Var5 = (e6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ih.s sVar = (ih.s) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    sVar.a(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm3.invoice.recurring = true;
                    vp.r1(e6Var5.a).V3(paymentForm3.users, false);
                    sm0Var2 = new sm0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    sm0Var2 = new sm0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (sm0Var2 == null) {
                    sVar.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                sm0Var2.Z0 = new d0(sVar, 6);
                org.telegram.ui.ActionBar.k2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.i0.u1(Q3)) {
                    Q3.presentFragment(sm0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.i2 i2Var3 = new org.telegram.ui.ActionBar.i2();
                i2Var3.a = true;
                Q3.showAsSheet(sm0Var2, i2Var3);
                return;
            case 7:
                th.l lVar = (th.l) this.b;
                th.m mVar2 = (th.m) this.c;
                Long l4 = (Long) this.d;
                vh.o8 o8Var = (vh.o8) this.e;
                Runnable runnable = (Runnable) this.f;
                if (lVar == null) {
                    lVar = mVar2.e(l4.longValue());
                }
                o8Var.X(vh.j8.c(lVar));
                runnable.run();
                return;
            case 8:
                th.z2 z2Var2 = (th.z2) this.b;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                vh.u6 u6Var = (vh.u6) this.f;
                org.telegram.ui.ActionBar.p6 p6Var = z2Var2.k0;
                th.g2 g2Var = z2Var2.L0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error4 == null || "STORY_NOT_MODIFIED".equals(tL_error4.text)) {
                    storyItem.parsedPrivacy = u6Var;
                    ArrayList arrayList7 = u6Var.b;
                    int i20 = u6Var.a;
                    ArrayList arrayList8 = u6Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    int i21 = 0;
                    while (i21 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i21);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i22 = 0;
                                while (i22 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i22 = c3.i0.k(i22, 1, tL_inputPrivacyValueDisallowUsers.users.get(i22).user_id, tL_privacyValueDisallowUsers.users);
                                    tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    int i23 = 0;
                                    for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i23 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                        i23 = c3.i0.k(i23, 1, tL_inputPrivacyValueAllowUsers.users.get(i23).user_id, tL_privacyValueAllowUsers.users);
                                    }
                                    i11 = 1;
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i21++;
                                    i14 = i11;
                                    arrayList7 = arrayList;
                                }
                            }
                            i11 = 1;
                            i21++;
                            i14 = i11;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i11 = i14;
                        i21++;
                        i14 = i11;
                        arrayList7 = arrayList;
                    }
                    int i24 = i14;
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i20 == i24;
                    storyItem.contacts = i20 == 2;
                    storyItem.selected_contacts = i20 == 3;
                    vp.r1(z2Var2.l2).O1().s0(storyItem.dialogId, storyItem, true);
                    z2Var2.L3 = true;
                    if (i20 == 4) {
                        new cc(g2Var, p6Var).Q(R.raw.contact_check, 36, cd.M0("StorySharedToEveryone")).j();
                    } else if (i20 == 1) {
                        new cc(g2Var, p6Var).Q(R.raw.contact_check, 36, cd.M0("StorySharedToCloseFriends")).j();
                    } else if (i20 == 2) {
                        if (arrayList8.isEmpty()) {
                            new cc(g2Var, p6Var).Q(R.raw.contact_check, 36, cd.M0("StorySharedToAllContacts")).j();
                        } else {
                            new cc(g2Var, p6Var).Q(R.raw.contact_check, 36, cd.G(arrayList8.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i20 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = u6Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new cc(g2Var, p6Var).Q(R.raw.contact_check, 36, cd.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                    }
                    z10 = false;
                } else {
                    org.telegram.messenger.m5.n(null, 2131743904, new cc(g2Var, p6Var), R.raw.error, 36);
                    z10 = false;
                }
                z2Var2.d1(z10);
                return;
            case 9:
                th.u2 u2Var = (th.u2) this.b;
                Activity activity2 = (Activity) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                th.o7 o7Var = (th.o7) this.e;
                th.x2 x2Var = (th.x2) this.f;
                vh.o8 D = vh.o8.D(activity2, u2Var.x.l2);
                k2.t0 t0Var = u2Var.x.v2;
                long j12 = (t0Var == null || (n7Var = (th.n7) t0Var.c) == null) ? 0L : n7Var.currentPosition;
                vh.n5 n10 = vh.n5.n(u2Var.x.x1.h(), u2Var.x.x1.a);
                th.z2 z2Var3 = u2Var.x;
                n10.e = z2Var3.k1;
                TL_stories.StoryItem storyItem3 = z2Var3.x1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 < document.attributes.size()) {
                            if (document.attributes.get(i25) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i25);
                            } else {
                                i25++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        vh.n5 g10 = n10.g();
                        g10.b0 = true;
                        z2Var = u2Var.x;
                        TL_stories.StoryItem storyItem4 = z2Var.x1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new kg.d0(u2Var, storyItem4, storyItem2, 10);
                        if (z2Var.G0()) {
                            th.z2 z2Var4 = u2Var.x;
                            g10.J0 = z2Var4.k1;
                            g10.L0 = vp.W4(z2Var4.x1.a.media);
                            th.x4 x4Var = o7Var.O0;
                            if (x4Var instanceof th.q4) {
                                g10.K0 = ((th.q4) x4Var).E;
                            }
                        }
                        D.R(vh.j8.d(o7Var), g10, j12);
                        D.Q = new th.o2(u2Var, i13);
                        D.R = new th.q2(u2Var, x2Var, i15);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                vh.n5 g102 = n10.g();
                g102.b0 = true;
                z2Var = u2Var.x;
                TL_stories.StoryItem storyItem42 = z2Var.x1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new kg.d0(u2Var, storyItem42, storyItem2, 10);
                if (z2Var.G0()) {
                }
                D.R(vh.j8.d(o7Var), g102, j12);
                D.Q = new th.o2(u2Var, i13);
                D.R = new th.q2(u2Var, x2Var, i15);
                return;
            case 10:
                th.j3 j3Var = (th.j3) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str2 = (String) this.d;
                org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                th.y3 y3Var = j3Var.b;
                org.telegram.messenger.i5.r(y3Var.w).i(arrayList10, false);
                new cc(y3Var, y3Var.s).Q(R.raw.ic_ban, 36, cd.a0(null, null, 2131751467, str2)).j();
                q6Var.a(true, y3Var.d(storyView) ? 1.0f : 0.5f);
                return;
            case 11:
                vh.r6 r6Var = (vh.r6) this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                vh.w6 w6Var = r6Var.W;
                x1Var2.dismiss();
                if (!(tLObject5 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error5 != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = w6Var.c;
                        int i26 = vh.w6.U1;
                        new cc(p2Var, w6Var.I0).f0(tL_error5, true);
                        return;
                    }
                    return;
                }
                cr[] crVarArr = new cr[1];
                Context context = r6Var.getContext();
                int i27 = vh.w6.U1;
                cr crVar = new cr(context, w6Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject5, w6Var.C1 ? null : new e3(8, r6Var, crVarArr), new th.b());
                crVarArr[0] = crVar;
                crVar.show();
                return;
            case 12:
                vh.z8.a((vh.z8) this.b, (ViewGroup) this.c, (org.telegram.ui.ActionBar.p6) this.d, (s9) this.e, (View) this.f);
                return;
            default:
                zf.n1 n1Var = (zf.n1) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject6 = (TLObject) this.e;
                ArrayList arrayList11 = (ArrayList) this.d;
                LongSparseArray longSparseArray = (LongSparseArray) this.f;
                n1Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                zf.o1 o1Var = n1Var.a;
                if (str3.equals(o1Var.R)) {
                    o1Var.O = 0;
                    if (tLObject6 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList11.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i15++;
                        }
                        if (size2 != arrayList11.size()) {
                            o1Var.I.put(arrayList11, o1Var.R);
                            if (size2 == 0) {
                                o1Var.J.add(arrayList11);
                            }
                            o1Var.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ r4(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = tLObject;
        this.d = obj3;
        this.f = obj4;
    }

    public /* synthetic */ r4(th.z2 z2Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, vh.u6 u6Var) {
        this.a = 8;
        this.b = z2Var;
        this.d = runnable;
        this.c = tL_error;
        this.e = storyItem;
        this.f = u6Var;
    }

    public /* synthetic */ r4(vh.r6 r6Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.a = 11;
        this.b = r6Var;
        this.d = x1Var;
        this.e = tLObject;
        this.f = getgroupcallstreamrtmpurl;
        this.c = tL_error;
    }
}
