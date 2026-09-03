package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sg1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.g0 g0Var;
        org.telegram.ui.web.q0 q0Var;
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        switch (this.a) {
            case 0:
                wg1 wg1Var = (wg1) this.b;
                Runnable runnable = (Runnable) this.c;
                for (ds dsVar : wg1Var.w.f) {
                    dsVar.l(0.0f);
                }
                runnable.run();
                break;
            case 1:
                ch1 ch1Var = (ch1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = ch1Var.f;
                ArrayList<TLRPC.Chat> arrayList2 = ch1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ch1Var.a).putChats(arrayList2, false);
                ch1Var.d = false;
                ch1Var.c = true;
                int size = arrayList.size();
                while (i17 < size) {
                    Object obj = arrayList.get(i17);
                    i17++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                break;
            case 2:
                ii1 ii1Var = (ii1) this.b;
                ii1Var.R.a(new rh1(ii1Var, (VoIPService) this.c, i18), true);
                break;
            case 3:
                ii1 ii1Var2 = (ii1) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                org.telegram.ui.Components.voip.m2.Q = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ii1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
                duration.setInterpolator(mrVar).start();
                ii1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(mrVar).start();
                ii1Var2.f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(mrVar).start();
                ii1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(mrVar).start();
                valueAnimator.addListener(new wh1(ii1Var2, i15));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(mrVar);
                valueAnimator.start();
                break;
            case 4:
                ri1 ri1Var = (ri1) this.b;
                int[] iArr = (int[]) this.c;
                ri1Var.getClass();
                int i19 = iArr[0] - 1;
                iArr[0] = i19;
                if (i19 == 0) {
                    WallpapersListActivity wallpapersListActivity = ri1Var.a;
                    int[][] iArr2 = WallpapersListActivity.h0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 5:
                xi1 xi1Var = (xi1) this.b;
                String str = (String) this.c;
                xi1Var.d.clear();
                xi1Var.e.clear();
                xi1Var.f = true;
                xi1Var.F(str, "", true);
                xi1Var.h = str;
                xi1Var.l();
                xi1Var.y = null;
                break;
            case 6:
                xi1 xi1Var2 = (xi1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity2 = xi1Var2.B;
                i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xi1Var2.x;
                xi1Var2.x = null;
                xi1Var2.F(str2, "", false);
                break;
            case 7:
                cj1 cj1Var = (cj1) this.b;
                String str3 = (String) this.c;
                dj1 dj1Var = cj1Var.a;
                Activity parentActivity = dj1Var.getParentActivity();
                MessageObject messageObject = dj1Var.n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (str3.equals("share_game")) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str3.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    dj1Var.showDialog(org.telegram.ui.Components.lq0.N0(dj1Var.getParentActivity(), messageObject, null, false, dj1Var.h));
                    break;
                }
                break;
            case 8:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) this.b;
                nh.j7 j7Var = (nh.j7) this.c;
                rh.p pVar = c1Var2.g0;
                pVar.f = true;
                pVar.k();
                c1Var2.w(j7Var);
                break;
            case 9:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.a) != null && (g0Var = c1Var.c) != null) {
                    g0Var.f(arrayList3);
                    break;
                }
                break;
            case 10:
                ArrayList arrayList4 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                org.telegram.ui.web.e1.c.addAll(0, arrayList4);
                for (int i20 = 0; i20 < longSparseArray.size(); i20++) {
                    org.telegram.ui.web.e1.d.put(longSparseArray.keyAt(i20), (org.telegram.ui.web.d1) longSparseArray.valueAt(i20));
                }
                org.telegram.ui.web.e1.b = true;
                org.telegram.ui.web.e1.a = false;
                ArrayList arrayList5 = org.telegram.ui.web.e1.e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i16 < size2) {
                        Object obj2 = arrayList5.get(i16);
                        i16++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.e1.e = null;
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                org.telegram.ui.web.g1 g1Var = f1Var.h;
                ArrayList arrayList7 = g1Var.f;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                g1Var.h = false;
                org.telegram.ui.Components.a61 a61Var = g1Var.a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.b;
                g1Var2.setEnabled(((org.telegram.ui.web.f2) this.c).b() != null);
                g1Var2.animate().alpha(g1Var2.isEnabled() ? 1.0f : 0.5f);
                break;
            case 13:
                ((o0) this.b).c0.run((Integer) this.c);
                break;
            case 14:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.c);
                y1Var.a.V2.N(true);
                break;
            case 15:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i21 = f2Var.a;
                f2Var.g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i21).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i21).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            f2Var.h = tL_webPage;
                        }
                    }
                    f2Var.h = null;
                }
                TLRPC.WebPage webPage = f2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    f2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (q0Var = f2Var.l) != null) {
                    q0Var.run();
                }
                f2Var.c();
                break;
            case 16:
                ((org.telegram.ui.web.f2) this.b).m.remove((sg1) this.c);
                break;
            case 17:
                ph.d dVar = (ph.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i22 = dVar.C - 1;
                dVar.C = i22;
                dVar.c(i22, true);
                if (dVar.C > 0) {
                    AndroidUtilities.runOnUIThread(dVar.D, 1000L);
                    break;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    break;
                }
            case 18:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                break;
            case 19:
                ph.f1 f1Var2 = (ph.f1) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ph.h1 h1Var = f1Var2.s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    ph.y1 y1Var2 = h1Var.r;
                    i12 = ((org.telegram.ui.ActionBar.g3) y1Var2).currentAccount;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer2.users, false);
                    i13 = ((org.telegram.ui.ActionBar.g3) y1Var2).currentAccount;
                    MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer2.chats, false);
                    i14 = ((org.telegram.ui.ActionBar.g3) y1Var2).currentAccount;
                    MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                f1Var2.n = true;
                f1Var2.G();
                break;
            case 20:
                ((ph.d2) this.b).e(0.0f, 240L, (Runnable) this.c);
                break;
            case 21:
                ph.c5 c5Var = (ph.c5) this.b;
                View view = (View) this.c;
                c5Var.getClass();
                if (view instanceof dg.j) {
                    dg.j jVar = (dg.j) view;
                    jVar.m();
                    c5Var.D0(jVar, true);
                    break;
                }
                break;
            case 22:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        break;
                    } else {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                break;
            case 24:
                ph.k5.a((ph.k5) this.b, (ph.t6) this.c);
                break;
            case 25:
                l7.w0 w0Var = (l7.w0) this.b;
                ph.t6 t6Var = (ph.t6) this.c;
                ph.k5 k5Var = (ph.k5) w0Var.d;
                Bitmap bitmap = k5Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (t6Var.M0 == k5Var.a) {
                        t6Var.M0 = null;
                    }
                    k5Var.a = null;
                    k5Var.invalidate();
                    break;
                }
                break;
            case 26:
                ph.o5 o5Var = (ph.o5) this.b;
                Context context = (Context) this.c;
                AtomicReference atomicReference = o5Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                o5Var.a(o5Var.f);
                break;
            case 27:
                ((ph.o5) this.b).c.run((ph.m5) this.c);
                break;
            case 28:
                ph.n nVar = (ph.n) this.b;
                dg.b3 b3Var = (dg.b3) this.c;
                ph.w5 w5Var = nVar.a;
                if (b3Var.getWidth() <= 0) {
                    w5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.q0(nVar, 22)).start();
                    break;
                } else {
                    float width = b3Var.getWidth() / w5Var.getWidth();
                    ValueAnimator valueAnimator2 = nVar.w;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    nVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nVar.w.addUpdateListener(new ph.v5(nVar, w5Var.getScaleX(), width, ((b3Var.getWidth() / 2.0f) + b3Var.getX()) - ((w5Var.getWidth() / 2.0f) + w5Var.getX()), ((b3Var.getHeight() / 2.0f) + b3Var.getY()) - ((w5Var.getHeight() / 2.0f) + w5Var.getY()), 0));
                    nVar.w.addListener(new org.telegram.ui.Components.ex0(17, nVar, b3Var));
                    nVar.w.setDuration(320L);
                    nVar.w.setInterpolator(org.telegram.ui.Components.mr.h);
                    nVar.v = b3Var;
                    nVar.w.start();
                    break;
                }
            default:
                ph.l6 l6Var = (ph.l6) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                l6Var.I0 = false;
                l6Var.Y.addAll(arrayList8);
                l6Var.n0.N(true);
                break;
        }
    }
}
