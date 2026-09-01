package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.di;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.bd0;
import org.telegram.ui.pc0;
import org.telegram.ui.wc0;
import qh.d8;
import qh.g8;
import qh.k7;
import qh.n7;
import qh.q7;
import qh.r7;
import qh.x7;
import sh.d3;
import wh.c4;
import wh.i5;
import wh.l5;
import wh.o3;
import wh.r3;
import wh.y2;
import wh.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements org.telegram.ui.ActionBar.c2, kl0, ll0, androidx.car.app.utils.e, Utilities.Callback3Return, wc0, wh.m0, vt, c4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // wh.m0
    public q70 a(wh.e1 e1Var) {
        q5.g0 g0Var = (q5.g0) this.b;
        g6 g6Var = (g6) this.c;
        wh.q qVar = (wh.q) g0Var.c;
        q70 q70Var = new q70(qVar, g6Var, e1Var, false, false, true);
        qVar.E = q70Var;
        return q70Var;
    }

    @Override // org.telegram.ui.Components.vt
    public void b0() {
        switch (this.a) {
            case 12:
                wh.i0 i0Var = (wh.i0) this.b;
                wh.h0 h0Var = (wh.h0) this.c;
                i0Var.i();
                h0Var.W();
                break;
            default:
                i5 i5Var = (i5) this.b;
                l5 l5Var = (l5) this.c;
                TL_iv.pageTableCell pagetablecell = l5Var.b;
                if (pagetablecell != null) {
                    z5.d(pagetablecell, l5Var.a.getText());
                }
                y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.a != null) {
                    r3.O1(y2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f10, float f11, int i10, View view) {
        g6 g6Var;
        int i11;
        int i12;
        long clientUserId;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        int i13;
        int i14;
        g6 g6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        g6 g6Var9;
        x7 x7Var = (x7) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = x7Var.I;
        a0.h hVar = x7Var.b;
        r7 r7Var = x7Var.x;
        ArrayList arrayList3 = x7Var.c;
        HashMap hashMap = x7Var.d;
        d8 d8Var = x7Var.T;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        n7 n7Var = (n7) arrayList2.get(i10);
        int i17 = n7Var.a;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i18 = n7Var.q;
                    if (i18 == 0) {
                        g8 g8Var = d8Var.Z;
                        if (g8Var != null) {
                            g8Var.run();
                            return;
                        }
                        return;
                    }
                    if (i18 == 1) {
                        TLRPC.InputPeer inputPeer = d8Var.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((h3) d8Var).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        g6Var2 = ((h3) d8Var).resourcesProvider;
                        q70 F = q70.F(x7Var, g6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new hg.y1(x7Var, clientUserId, 25), false);
                        F.k();
                        q70.f(F, d8Var.i1().B(clientUserId, true), d8Var.v, false, null, new v1(6, x7Var, F));
                        F.Z();
                        return;
                    }
                    if (i18 != 5) {
                        if (i18 == 6) {
                            d8Var.D = false;
                            x7Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = x7Var.getContext();
                    g6Var = ((h3) d8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, g6Var);
                    d2Var.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = d8Var.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((h3) d8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new hg.y(x7Var, d2Var, getgroupcallstreamrtmpurl, 22));
                    return;
                }
                return;
            }
            if (view instanceof o8) {
                o8 o8Var = (o8) view;
                o8Var.setChecked(!o8Var.b());
                n7Var.k = o8Var.b();
                int i19 = n7Var.c;
                if (i19 == 0) {
                    boolean b10 = o8Var.b();
                    d8Var.x = b10;
                    r12 = d8Var.K == 4 ? 1 : 0;
                    if (b10) {
                        f3 f3Var = d8Var.container;
                        g6Var6 = ((h3) d8Var).resourcesProvider;
                        ic G = new qc(f3Var, g6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(r12 != 0 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    f3 f3Var2 = d8Var.container;
                    g6Var5 = ((h3) d8Var).resourcesProvider;
                    ic G2 = new qc(f3Var2, g6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(r12 != 0 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        d8Var.w = o8Var.b();
                        x7Var.g(true);
                        return;
                    }
                    return;
                }
                boolean b11 = o8Var.b();
                d8Var.y = b11;
                boolean z4 = d8Var.c instanceof TLRPC.TL_inputPeerChannel;
                if (b11) {
                    f3 f3Var3 = d8Var.container;
                    g6Var4 = ((h3) d8Var).resourcesProvider;
                    ic G3 = new qc(f3Var3, g6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z4 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    f3 f3Var4 = d8Var.container;
                    g6Var3 = ((h3) d8Var).resourcesProvider;
                    ic G4 = new qc(f3Var4, g6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z4 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                x7Var.g(true);
                return;
            }
            return;
        }
        if (n7Var.n && d8Var.C) {
            i16 = ((h3) d8Var).currentAccount;
            boolean z10 = d8Var.H;
            TLRPC.InputPeer inputPeer3 = d8Var.c;
            q7 q7Var = new q7(x7Var, 0);
            g6Var9 = ((h3) d8Var).resourcesProvider;
            new k7(context, i16, z10, inputPeer3, q7Var, g6Var9).show();
            return;
        }
        int i20 = n7Var.i;
        if (i20 == 1) {
            if (d8Var.K == 1 || d8.J0(d8Var).isEmpty()) {
                d8Var.J = 1;
                d8Var.b.D(1);
            }
            d8Var.K = 1;
            x7Var.f(true);
            return;
        }
        if (i20 == 3) {
            if (d8Var.K == 3 || (d8Var.n.isEmpty() && d8Var.r.isEmpty())) {
                d8Var.J = 3;
                d8Var.b.D(1);
            }
            d8Var.K = 3;
            x7Var.f(true);
            return;
        }
        if (i20 == 2) {
            if (d8Var.K == 2) {
                d8Var.J = 2;
                d8Var.b.D(1);
            }
            d8Var.K = 2;
            x7Var.f(true);
            return;
        }
        if (i20 == 4) {
            if (d8Var.K == 4) {
                d8Var.J = 4;
                d8Var.b.D(1);
            }
            d8Var.K = 4;
            x7Var.f(true);
            return;
        }
        if (i20 > 0) {
            arrayList3.clear();
            hashMap.clear();
            d8Var.K = n7Var.i;
            r7Var.c.a();
        } else {
            TLRPC.Chat chat = n7Var.h;
            if (chat != null) {
                long j10 = chat.id;
                if (d8.d1(d8Var, chat) > 200) {
                    try {
                        x7Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = x7Var.getContext();
                    g6Var7 = ((h3) d8Var).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, g6Var7);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                    l.d.C(R.string.OK, alertDialog$Builder, null);
                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                    ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (r12 < size) {
                            Object obj = arrayList4.get(r12);
                            r12++;
                            hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                        }
                    }
                    hashMap.remove(Long.valueOf(j10));
                    x7Var.i(true);
                } else {
                    i13 = ((h3) d8Var).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                    i14 = ((h3) d8Var).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = x7Var.D;
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                            x7Var.D = null;
                        }
                        x7Var.E = j10;
                        Context context4 = x7Var.getContext();
                        g6Var8 = ((h3) d8Var).resourcesProvider;
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, g6Var8);
                        x7Var.D = d2Var3;
                        d2Var3.q(50L);
                        i15 = ((h3) d8Var).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new di(x7Var, chat2, messagesStorage, j10));
                    } else {
                        x7Var.d(j10, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(x7Var.F)) {
                        r7Var.setText("");
                        x7Var.F = null;
                        x7Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = n7Var.g;
                if (user != null) {
                    if (x7Var.a == 0) {
                        d8Var.K = 0;
                    }
                    long j11 = user.id;
                    HashSet hashSet = new HashSet(arrayList3);
                    if (arrayList3.contains(Long.valueOf(j11))) {
                        Iterator it = hashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                it.remove();
                                hashSet.addAll((Collection) entry.getValue());
                            }
                        }
                        hashSet.remove(Long.valueOf(j11));
                        hVar.k(Boolean.FALSE, j11);
                    } else {
                        Iterator it2 = hashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                it2.remove();
                                hashSet.addAll((Collection) entry2.getValue());
                            }
                        }
                        hashSet.add(Long.valueOf(j11));
                        if (!TextUtils.isEmpty(x7Var.F)) {
                            r7Var.setText("");
                            x7Var.F = null;
                            x7Var.g(false);
                        }
                        hVar.k(Boolean.TRUE, j11);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    x7Var.i(true);
                }
            }
        }
        x7Var.f(true);
        x7Var.e(true);
        r7Var.H = true;
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r4 = r1.O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r2.y = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r4 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.y = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2.d = true;
        r1.setText(r2.y);
        r1 = r2.f;
        r1.setSelection(r1.getText().length());
        r2.d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r2.Y();
        r2.a.V2.N(true);
        r2.U(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        if (r2.B != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (android.text.TextUtils.isEmpty(r1 != null ? r1.O : null) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r2.B = true;
        r1 = r3.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // org.telegram.ui.wc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        vf.v0 v0Var = (vf.v0) this.b;
        bd0 bd0Var = (bd0) this.c;
        v0Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(v0Var.y)) {
            pc0 pc0Var = bd0Var.Q;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        return d3.B0((d3) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                p.Y((p) this.b, (HashSet) this.c);
                break;
            case 1:
                a1 a1Var = (a1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.J).getInputUser(a1Var.R);
                ConnectionsManager.getInstance(a1Var.J).sendRequest(allowsendmessage, new hg.y(a1Var, strArr, d2Var, 21));
                break;
            case 2:
                boolean[] zArr = (boolean[]) this.b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    break;
                }
                break;
            case 3:
            case 5:
            default:
                vf.t.d(r6.currentAccount).a((vf.q) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            case 4:
                d3.y0((d3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 6:
                uf.u0 u0Var = (uf.u0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                u0Var.getClass();
                zArr2[0] = true;
                u0Var.Q();
                break;
        }
    }

    @Override // wh.c4
    public void run(long j10) {
        o3 o3Var = (o3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        o3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        vf.k kVar = (vf.k) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        kVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(kVar.d);
        vf.i iVar = kVar.n;
        kVar.x = document;
        iVar.setSticker(document);
        ((o8) view).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
