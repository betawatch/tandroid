package xh;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        boolean z10;
        boolean z11;
        boolean z12;
        yg.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        org.telegram.ui.Components.p5 p5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                x3.k0((x3) obj3, (TLObject) obj2, (MessageObject) obj);
                break;
            case 1:
                x3 x3Var = (x3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                x3Var.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                x3Var.e0.setResellPrice(yf.a.i(0L, yf.b.a));
                wh.b2 b2Var = x3Var.d1;
                if (b2Var != null) {
                    b2Var.run();
                }
                com.google.android.gms.internal.vision.e2.o(R.string.Gift2ResaleDisable, new Object[]{x3Var.C1()}, x3Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            case 2:
                x3 x3Var2 = (x3) obj3;
                x3Var2.getClass();
                ((nf.e) obj2).c(false);
                x3Var2.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                break;
            case 3:
                ((sg.p1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                x3.d2((TwoStepVerificationActivity) obj);
                break;
            case 4:
                x3.T((x3) obj3, (org.telegram.ui.ActionBar.d2) obj2, (MessageObject) obj);
                break;
            case 5:
                x3.V((x3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                break;
            case 6:
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    callback.run((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                    break;
                } else {
                    v5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                    callback.run(null);
                    break;
                }
            case 7:
                v5 v5Var = (v5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList = v5Var.v;
                boolean[] zArr = v5Var.r;
                ArrayList[] arrayListArr = v5Var.q;
                int i13 = v5Var.a;
                boolean z13 = !v5Var.e;
                v5Var.c = System.currentTimeMillis();
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i13).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i13).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList2 = starsStatus.history;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TL_stars.StarsTransaction starsTransaction = arrayList2.get(i14);
                            i14++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[i12].add(starsTransaction2);
                            Runnable runnable3 = runnable2;
                            arrayListArr[starsTransaction2.amount.amount > 0 ? (char) 1 : (char) 2].add(starsTransaction2);
                            runnable2 = runnable3;
                            i12 = 0;
                        }
                        runnable = runnable2;
                        for (int i15 = 0; i15 < 3; i15++) {
                            zArr[i15] = !arrayListArr[i15].isEmpty() || zArr[i15];
                            boolean[] zArr2 = v5Var.u;
                            boolean z14 = (starsStatus.flags & 1) == 0;
                            zArr2[i15] = z14;
                            if (z14) {
                                v5Var.t[i15] = false;
                            }
                            v5Var.s[i15] = zArr2[i15] ? null : starsStatus.next_offset;
                        }
                        z12 = true;
                    } else {
                        runnable = runnable2;
                        z12 = false;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(starsStatus.subscriptions);
                        v5Var.x = false;
                        v5Var.w = starsStatus.subscriptions_next_offset;
                        v5Var.y = (starsStatus.flags & 4) == 0;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long j3 = v5Var.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j3 != starsAmount.amount) {
                        z13 = true;
                    }
                    v5Var.f = starsAmount;
                    v5Var.g = 0L;
                    z11 = z12;
                } else {
                    runnable = runnable2;
                    z10 = false;
                    z11 = false;
                }
                v5Var.d = false;
                v5Var.e = true;
                if (z13) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z11) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z10) {
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                v5 v5Var2 = (v5) obj3;
                Runnable runnable4 = (Runnable) obj;
                v5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    v5Var2.Q.remove(num);
                    v5Var2.R.remove(num);
                }
                runnable4.run();
                break;
            case 9:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                break;
            case 10:
                zh.g2 g2Var = (zh.g2) obj3;
                yg.p0 p0Var = (yg.p0) obj2;
                View view = (View) obj;
                zh.a3 a3Var = g2Var.a;
                a3Var.u3 = true;
                zh.z2 z2Var = a3Var.O1;
                ImageReceiver imageReceiver = a3Var.l3;
                boolean[] zArr3 = {false};
                zh.o5 o5Var = a3Var.E0;
                o5Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new zh.r1(i11, o5Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                zh.o5 o5Var2 = new zh.o5(a3Var.getContext(), a3Var.x1);
                a3Var.E0 = o5Var2;
                o5Var2.setPadding(dp, dp, dp, dp);
                a3Var.D0.addView(a3Var.E0, w7.a6.e(40, 40, 3));
                org.telegram.ui.Components.p5 p5Var2 = a3Var.o3;
                if (p5Var2 != null) {
                    p5Var2.o(a3Var);
                    eVar = null;
                    a3Var.o3 = null;
                } else {
                    eVar = null;
                }
                yg.e eVar2 = a3Var.m3;
                if (eVar2 != null) {
                    eVar2.d(a3Var);
                    a3Var.m3 = eVar;
                }
                a3Var.p3 = false;
                if (p0Var.g != 0) {
                    a3Var.p3 = true;
                    org.telegram.ui.Components.p5 p5Var3 = new org.telegram.ui.Components.p5(2, a3Var.C2, p0Var.g);
                    a3Var.o3 = p5Var3;
                    p5Var3.a(a3Var);
                } else if (p0Var.f != null && (tL_availableReaction = MediaDataController.getInstance(a3Var.C2).getReactionsMap().get(p0Var.f)) != null) {
                    a3Var.n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), yg.l0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                a3Var.E0.setReaction(p0Var);
                if (a3Var.D1) {
                    TL_stories.StoryItem storyItem3 = z2Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = z2Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        yg.r0.b(null, storyItem4.sent_reaction, storyViews);
                        a3Var.k1(true);
                    }
                }
                if (p0Var.g != 0 && (p5Var = a3Var.E0.f) != null) {
                    yg.e a2 = yg.e.a(p5Var, false, true);
                    a3Var.m3 = a2;
                    a2.f(a3Var);
                }
                a3Var.S1.g0(a3Var.B1, z2Var.a, p0Var);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                a3Var.getLocationInWindow(iArr2);
                a3Var.w3 = iArr[0] - iArr2[0];
                a3Var.x3 = iArr[1] - iArr2[1];
                a3Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a3Var.v3 = 0.0f;
                a3Var.invalidate();
                zh.o5 o5Var3 = a3Var.E0;
                o5Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = o5Var3.e;
                if (p0Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new bi.v5(g2Var, ofFloat, zArr3, 4));
                ofFloat.addListener(new org.telegram.ui.ActionBar.l1(g2Var, zArr3, o5Var3, 8));
                ofFloat.setDuration(220L);
                ofFloat.start();
                a3Var.b1(false);
                break;
            case 11:
                zh.v2 v2Var = (zh.v2) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                zh.a3 a3Var2 = v2Var.l;
                org.telegram.ui.Components.d5.S(a3Var2.getContext(), null, f6Var, new f21(v2Var, (TL_stories.StoryItem) obj, f6Var, 10));
                zh.v2 v2Var2 = a3Var2.t1;
                if (v2Var2 != null) {
                    v2Var2.a();
                    break;
                }
                break;
            case 12:
                zh.s4 s4Var = (zh.s4) obj3;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                while (i12 < s4Var.i.size()) {
                    MessageObject messageObject2 = (MessageObject) s4Var.i.get(i12);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback2.run(document2);
                        break;
                    } else {
                        i12++;
                    }
                }
                callback2.run(null);
                break;
            case 13:
                zh.i5 i5Var = (zh.i5) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                int i16 = i5Var.a;
                i5Var.R = true;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    i5Var.S = null;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    break;
                } else if (tLObject3 instanceof TL_stories.canSendStoryCount) {
                    i5Var.S = new j4.w(1, ((TL_stories.canSendStoryCount) tLObject3).count_remains, -1L);
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    break;
                } else {
                    i5Var.n(tL_error2);
                    break;
                }
            case 14:
                zh.r4 r4Var = (zh.r4) obj2;
                org.telegram.messenger.k2 k2Var = (org.telegram.messenger.k2) obj;
                ArrayList arrayList3 = ((zh.s4) obj3).i;
                while (i12 < arrayList3.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList3.get(i12);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = r4Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 != null) {
                                if (document4.id == document3.id) {
                                    k2Var.run((zh.r4) storyItem2);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            k2Var.run((zh.r4) storyItem2);
                            break;
                        }
                    }
                    i12++;
                }
                k2Var.run(null);
                break;
            case 15:
                zh.s4 s4Var2 = (zh.s4) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Runnable runnable5 = (Runnable) obj;
                zh.x4 x4Var = s4Var2.q;
                ArrayList arrayList4 = s4Var2.G;
                ArrayList arrayList5 = s4Var2.i;
                ArrayList arrayList6 = s4Var2.H;
                s4Var2.F = 0;
                s4Var2.C = false;
                s4Var2.D = true;
                s4Var2.r = true;
                ArrayList arrayList7 = new ArrayList();
                if (tLObject4 instanceof Vector) {
                    ArrayList<T> arrayList8 = ((Vector) tLObject4).objects;
                    int size2 = arrayList8.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList8.get(i17);
                        i17++;
                        arrayList7.add((TL_bots.botPreviewMedia) obj4);
                    }
                } else if (tLObject4 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject4;
                    arrayList4.clear();
                    arrayList4.addAll(previewinfo.lang_codes);
                    arrayList7.addAll(previewinfo.media);
                }
                ArrayList arrayList9 = new ArrayList(arrayList5);
                arrayList5.clear();
                arrayList6.clear();
                int size3 = arrayList7.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj5 = arrayList7.get(i18);
                    int i19 = i18 + 1;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj5;
                    MessageObject messageObject4 = new MessageObject(s4Var2.c, new zh.r4(s4Var2, s4Var2.d, botpreviewmedia));
                    int i20 = 0;
                    while (true) {
                        if (i20 >= arrayList9.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList9.get(i20)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList9.get(i20);
                        } else {
                            i20++;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = s4Var2.I;
                        s4Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem6.id = id2;
                    messageObject4.parentStoriesList = s4Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList6.isEmpty()) {
                        arrayList6.add(new ArrayList());
                    }
                    ((ArrayList) arrayList6.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList5.add(messageObject4);
                    i18 = i19;
                }
                AndroidUtilities.cancelRunOnUIThread(x4Var);
                AndroidUtilities.runOnUIThread(x4Var);
                if (runnable5 != null) {
                    AndroidUtilities.runOnUIThread(runnable5);
                    break;
                }
                break;
            case 16:
                zh.u7 u7Var = ((zh.l7) obj3).d;
                u7Var.n0.D(u7Var.h, ((zh.a5) obj2).d, (ArrayList) obj);
                break;
            default:
                zh.d8 d8Var = (zh.d8) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                zh.k5 k5Var = d8Var.f;
                int i21 = d8Var.b;
                zh.d8.g = System.currentTimeMillis();
                if (tLObject5 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject5;
                    MessagesController.getInstance(i21).putUsers(tL_stories_storyViews.users, false);
                    if (!d8Var.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        d8Var.d = 0;
                        d8Var.e = false;
                        break;
                    } else {
                        NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                d8Var.d = 0;
                if (d8Var.e) {
                    AndroidUtilities.cancelRunOnUIThread(k5Var);
                    AndroidUtilities.runOnUIThread(k5Var, 10000L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n1(x3 x3Var, sg.p1[] p1VarArr, nf.e eVar, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = 3;
        this.b = p1VarArr;
        this.c = eVar;
        this.d = twoStepVerificationActivity;
    }

    public /* synthetic */ n1(v5 v5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback callback) {
        this.a = 6;
        this.c = tLObject;
        this.b = tL_error;
        this.d = callback;
    }
}
