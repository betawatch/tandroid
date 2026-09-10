package xh;

import android.app.Activity;
import android.text.TextUtils;
import bi.ce;
import bi.pb;
import bi.r9;
import bi.xd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wo0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x0576, code lost:
    
        if (r7 == null) goto L195;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        int i10;
        boolean z10;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j10;
        zh.a3 a3Var;
        zh.t7 t7Var;
        int i11 = 2;
        SQLiteCursor sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        wo0 wo0Var = null;
        sQLiteCursor = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList<TLRPC.Chat> arrayList3 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.e;
                th.e eVar = (th.e) this.f;
                int i13 = 0;
                try {
                    try {
                        sQLiteCursor2 = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        j3 = 0;
                        i10 = 0;
                        while (sQLiteCursor2.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i10 = (int) sQLiteCursor2.longValue(1);
                                    j3 = sQLiteCursor2.longValue(2);
                                }
                            } catch (Exception e) {
                                e = e;
                                FileLog.e(e);
                                break;
                            }
                        }
                        ArrayList<Long> arrayList5 = new ArrayList<>();
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList2.size();
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                if (peerDialogId > 0) {
                                    arrayList5.add(Long.valueOf(peerDialogId));
                                } else if (peerDialogId < 0) {
                                    arrayList6.add(Long.valueOf(-peerDialogId));
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList6), arrayList3);
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList5, arrayList4);
                        }
                    } catch (Exception e7) {
                        e = e7;
                        j3 = 0;
                        i10 = 0;
                    }
                    sQLiteCursor2.dispose();
                    AndroidUtilities.runOnUIThread(new di.s3(eVar, arrayList2, i10, j3, arrayList4, arrayList3));
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 1:
                v5 v5Var = (v5) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                int i14 = v5Var.a;
                d2Var.dismiss();
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                    for (int i15 = 0; i15 < tL_payments_savedStarGifts.gifts.size(); i15++) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(i15);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift.saved_id)) {
                            sQLiteCursor = savedStarGift;
                        }
                    }
                }
                callback.run(sQLiteCursor);
                return;
            case 2:
                v5 v5Var2 = (v5) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error != null) {
                    callback2.run(Boolean.FALSE, tL_error.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(v5Var2.a).putUsers(paymentForm.users, false);
                    wo0Var = new wo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    wo0Var = new wo0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (wo0Var == null) {
                    callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                wo0Var.Z0 = new th.e(callback2, 14);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R == null) {
                    return;
                }
                if (!AndroidUtilities.hasDialogOnTop(R)) {
                    R.presentFragment(wo0Var);
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                R.showAsSheet(wo0Var, n2Var);
                return;
            case 3:
                List list = (List) this.b;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.c;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.d;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.e;
                Activity activity = (Activity) this.f;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new c4(2, callback22));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.k a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new c4(3, callback22));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.c, new bi.a6(callback22, 6));
                BillingController.getInstance().setOnCanceled(new c4(0, callback22));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                n4.y yVar = new n4.y(7, (boolean) (0 == true ? 1 : 0));
                yVar.z((c5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(yVar.d()));
                return;
            case 4:
                zh.k kVar = (zh.k) this.b;
                zh.l lVar = (zh.l) this.c;
                Long l4 = (Long) this.d;
                ce ceVar = (ce) this.e;
                Runnable runnable = (Runnable) this.f;
                if (kVar == null) {
                    kVar = lVar.e(l4.longValue());
                }
                ceVar.Y(xd.c(kVar));
                runnable.run();
                return;
            case 5:
                zh.a3 a3Var2 = (zh.a3) this.b;
                Runnable runnable2 = (Runnable) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                pb pbVar = (pb) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = a3Var2.B0;
                zh.h2 h2Var = a3Var2.c1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error2 == null || "STORY_NOT_MODIFIED".equals(tL_error2.text)) {
                    storyItem.parsedPrivacy = pbVar;
                    ArrayList arrayList7 = pbVar.b;
                    int i16 = pbVar.a;
                    ArrayList arrayList8 = pbVar.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    int i17 = 0;
                    while (i17 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i17);
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
                                int i18 = 0;
                                while (i18 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i18 = com.google.android.gms.internal.vision.e2.f(tL_inputPrivacyValueDisallowUsers.users.get(i18).user_id, tL_privacyValueDisallowUsers.users, i18, 1);
                                    tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    int i19 = 0;
                                    for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i19 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                        i19 = com.google.android.gms.internal.vision.e2.f(tL_inputPrivacyValueAllowUsers.users.get(i19).user_id, tL_privacyValueAllowUsers.users, i19, 1);
                                    }
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i17++;
                                    arrayList7 = arrayList;
                                }
                            }
                            i17++;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i17++;
                        arrayList7 = arrayList;
                    }
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i16 == 1;
                    storyItem.contacts = i16 == 2;
                    storyItem.selected_contacts = i16 == 3;
                    MessagesController.getInstance(a3Var2.C2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    a3Var2.b4 = true;
                    if (i16 == 4) {
                        new wc(h2Var, f6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i16 == 1) {
                        new wc(h2Var, f6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i16 == 2) {
                        if (arrayList8.isEmpty()) {
                            new wc(h2Var, f6Var).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new wc(h2Var, f6Var).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList8.size(), new Object[0])).j();
                        }
                    } else if (i16 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = pbVar.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new wc(h2Var, f6Var).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                        a3Var2.f1(z10);
                        return;
                    }
                } else {
                    org.telegram.messenger.a2.o(R.string.UnknownError, new wc(h2Var, f6Var), R.raw.error, 36);
                }
                z10 = false;
                a3Var2.f1(z10);
                return;
            case 6:
                zh.v2 v2Var = (zh.v2) this.b;
                Activity activity2 = (Activity) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                zh.u7 u7Var = (zh.u7) this.e;
                zh.y2 y2Var = (zh.y2) this.f;
                ce E = ce.E(activity2, v2Var.l.C2);
                k2.v vVar = v2Var.l.M2;
                long j11 = (vVar == null || (t7Var = (zh.t7) vVar.c) == null) ? 0L : t7Var.currentPosition;
                r9 n10 = r9.n(v2Var.l.O1.h(), v2Var.l.O1.a);
                zh.a3 a3Var3 = v2Var.l;
                n10.e = a3Var3.B1;
                TL_stories.StoryItem storyItem3 = a3Var3.O1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 < document.attributes.size()) {
                            if (document.attributes.get(i20) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i20);
                            } else {
                                i20++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j10;
                        r9 g10 = n10.g();
                        g10.b0 = true;
                        a3Var = v2Var.l;
                        TL_stories.StoryItem storyItem4 = a3Var.O1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new org.telegram.ui.Components.h7(v2Var, storyItem4, storyItem2, 10);
                        if (a3Var.I0()) {
                            zh.a3 a3Var4 = v2Var.l;
                            g10.J0 = a3Var4.B1;
                            g10.L0 = MessagesController.toInputMedia(a3Var4.O1.a.media);
                            zh.a5 a5Var = u7Var.O0;
                            if (a5Var instanceof zh.s4) {
                                g10.K0 = ((zh.s4) a5Var).E;
                            }
                        }
                        E.S(xd.d(u7Var), g10, j11);
                        E.Q = new zh.p2(v2Var, i11);
                        E.R = new zh.s2(v2Var, y2Var, i12);
                        return;
                    }
                }
                j10 = 0;
                n10.e0 = j10;
                r9 g102 = n10.g();
                g102.b0 = true;
                a3Var = v2Var.l;
                TL_stories.StoryItem storyItem42 = a3Var.O1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new org.telegram.ui.Components.h7(v2Var, storyItem42, storyItem2, 10);
                if (a3Var.I0()) {
                }
                E.S(xd.d(u7Var), g102, j11);
                E.Q = new zh.p2(v2Var, i11);
                E.R = new zh.s2(v2Var, y2Var, i12);
                return;
            default:
                zh.k3 k3Var = (zh.k3) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str = (String) this.d;
                org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList<TLRPC.User> arrayList10 = new ArrayList<>();
                arrayList10.add(user);
                zh.z3 z3Var = k3Var.b;
                ContactsController.getInstance(z3Var.v).deleteContact(arrayList10, false);
                com.google.android.gms.internal.vision.e2.o(R.string.DeletedFromYourContacts, new Object[]{str}, new wc(z3Var, z3Var.s), R.raw.ic_ban, 36);
                p6Var.a(z3Var.d(storyView) ? 1.0f : 0.5f, true);
                return;
        }
    }
}
