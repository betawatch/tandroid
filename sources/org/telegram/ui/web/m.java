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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.st;
import org.telegram.ui.cd0;
import org.telegram.ui.qc0;
import org.telegram.ui.xc0;
import ph.e8;
import ph.g8;
import ph.l7;
import ph.o7;
import ph.r7;
import ph.s7;
import ph.y7;
import rh.d3;
import vh.a6;
import vh.d4;
import vh.j5;
import vh.m5;
import vh.p3;
import vh.s3;
import vh.z2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements org.telegram.ui.ActionBar.c2, il0, jl0, Utilities.Callback3Return, xc0, androidx.car.app.utils.e, vh.m0, st, d4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.st
    public void J() {
        switch (this.a) {
            case 12:
                vh.i0 i0Var = (vh.i0) this.b;
                vh.h0 h0Var = (vh.h0) this.c;
                i0Var.i();
                h0Var.h2();
                break;
            default:
                j5 j5Var = (j5) this.b;
                m5 m5Var = (m5) this.c;
                TL_iv.pageTableCell pagetablecell = m5Var.b;
                if (pagetablecell != null) {
                    a6.d(pagetablecell, m5Var.a.getText());
                }
                z2 z2Var = j5Var.B;
                if (z2Var != null && j5Var.a != null) {
                    s3.N1(z2Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // vh.m0
    public p70 a(vh.e1 e1Var) {
        q5.c0 c0Var = (q5.c0) this.b;
        f6 f6Var = (f6) this.c;
        vh.q qVar = (vh.q) c0Var.b;
        p70 p70Var = new p70(qVar, f6Var, e1Var, false, false, true);
        qVar.E = p70Var;
        return p70Var;
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
    @Override // org.telegram.ui.xc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        uf.v0 v0Var = (uf.v0) this.b;
        cd0 cd0Var = (cd0) this.c;
        v0Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(v0Var.y)) {
            qc0 qc0Var = cd0Var.Q;
        }
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        f6 f6Var;
        int i11;
        int i12;
        long clientUserId;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        f6 f6Var7;
        int i13;
        int i14;
        f6 f6Var8;
        int i15;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i16;
        f6 f6Var9;
        y7 y7Var = (y7) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = y7Var.I;
        a0.h hVar = y7Var.b;
        s7 s7Var = y7Var.x;
        ArrayList arrayList3 = y7Var.c;
        HashMap hashMap = y7Var.d;
        e8 e8Var = y7Var.T;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        o7 o7Var = (o7) arrayList2.get(i10);
        int i17 = o7Var.a;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i18 = o7Var.q;
                    if (i18 == 0) {
                        g8 g8Var = e8Var.Z;
                        if (g8Var != null) {
                            g8Var.run();
                            return;
                        }
                        return;
                    }
                    if (i18 == 1) {
                        TLRPC.InputPeer inputPeer = e8Var.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((g3) e8Var).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        f6Var2 = ((g3) e8Var).resourcesProvider;
                        p70 F = p70.F(y7Var, f6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new gg.y1(y7Var, clientUserId, 25), false);
                        F.k();
                        p70.f(F, e8Var.i1().B(clientUserId, true), e8Var.v, false, null, new ph.s1(4, y7Var, F));
                        F.Z();
                        return;
                    }
                    if (i18 != 5) {
                        if (i18 == 6) {
                            e8Var.D = false;
                            y7Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = y7Var.getContext();
                    f6Var = ((g3) e8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, f6Var);
                    d2Var.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = e8Var.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((g3) e8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new gg.y(y7Var, d2Var, getgroupcallstreamrtmpurl, 21));
                    return;
                }
                return;
            }
            if (view instanceof n8) {
                n8 n8Var = (n8) view;
                n8Var.setChecked(!n8Var.b());
                o7Var.k = n8Var.b();
                int i19 = o7Var.c;
                if (i19 == 0) {
                    boolean b10 = n8Var.b();
                    e8Var.x = b10;
                    r12 = e8Var.K == 4 ? 1 : 0;
                    if (b10) {
                        e3 e3Var = e8Var.container;
                        f6Var6 = ((g3) e8Var).resourcesProvider;
                        ic G = new qc(e3Var, f6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(r12 != 0 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    e3 e3Var2 = e8Var.container;
                    f6Var5 = ((g3) e8Var).resourcesProvider;
                    ic G2 = new qc(e3Var2, f6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(r12 != 0 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        e8Var.w = n8Var.b();
                        y7Var.g(true);
                        return;
                    }
                    return;
                }
                boolean b11 = n8Var.b();
                e8Var.y = b11;
                boolean z4 = e8Var.c instanceof TLRPC.TL_inputPeerChannel;
                if (b11) {
                    e3 e3Var3 = e8Var.container;
                    f6Var4 = ((g3) e8Var).resourcesProvider;
                    ic G3 = new qc(e3Var3, f6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z4 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    e3 e3Var4 = e8Var.container;
                    f6Var3 = ((g3) e8Var).resourcesProvider;
                    ic G4 = new qc(e3Var4, f6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z4 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                y7Var.g(true);
                return;
            }
            return;
        }
        if (o7Var.n && e8Var.C) {
            i16 = ((g3) e8Var).currentAccount;
            boolean z10 = e8Var.H;
            TLRPC.InputPeer inputPeer3 = e8Var.c;
            r7 r7Var = new r7(y7Var, 0);
            f6Var9 = ((g3) e8Var).resourcesProvider;
            new l7(context, i16, z10, inputPeer3, r7Var, f6Var9).show();
            return;
        }
        int i20 = o7Var.i;
        if (i20 == 1) {
            if (e8Var.K == 1 || e8.J0(e8Var).isEmpty()) {
                e8Var.J = 1;
                e8Var.b.D(1);
            }
            e8Var.K = 1;
            y7Var.f(true);
            return;
        }
        if (i20 == 3) {
            if (e8Var.K == 3 || (e8Var.n.isEmpty() && e8Var.r.isEmpty())) {
                e8Var.J = 3;
                e8Var.b.D(1);
            }
            e8Var.K = 3;
            y7Var.f(true);
            return;
        }
        if (i20 == 2) {
            if (e8Var.K == 2) {
                e8Var.J = 2;
                e8Var.b.D(1);
            }
            e8Var.K = 2;
            y7Var.f(true);
            return;
        }
        if (i20 == 4) {
            if (e8Var.K == 4) {
                e8Var.J = 4;
                e8Var.b.D(1);
            }
            e8Var.K = 4;
            y7Var.f(true);
            return;
        }
        if (i20 > 0) {
            arrayList3.clear();
            hashMap.clear();
            e8Var.K = o7Var.i;
            s7Var.c.a();
        } else {
            TLRPC.Chat chat = o7Var.h;
            if (chat != null) {
                long j10 = chat.id;
                if (e8.d1(e8Var, chat) > 200) {
                    try {
                        y7Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = y7Var.getContext();
                    f6Var7 = ((g3) e8Var).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, f6Var7);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                    kf.k0.C(R.string.OK, alertDialog$Builder, null);
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
                    y7Var.i(true);
                } else {
                    i13 = ((g3) e8Var).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                    i14 = ((g3) e8Var).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = y7Var.D;
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                            y7Var.D = null;
                        }
                        y7Var.E = j10;
                        Context context4 = y7Var.getContext();
                        f6Var8 = ((g3) e8Var).resourcesProvider;
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, f6Var8);
                        y7Var.D = d2Var3;
                        d2Var3.q(50L);
                        i15 = ((g3) e8Var).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new di(y7Var, chat2, messagesStorage, j10));
                    } else {
                        y7Var.d(j10, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(y7Var.F)) {
                        s7Var.setText("");
                        y7Var.F = null;
                        y7Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = o7Var.g;
                if (user != null) {
                    if (y7Var.a == 0) {
                        e8Var.K = 0;
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
                        if (!TextUtils.isEmpty(y7Var.F)) {
                            s7Var.setText("");
                            y7Var.F = null;
                            y7Var.g(false);
                        }
                        hVar.k(Boolean.TRUE, j11);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    y7Var.i(true);
                }
            }
        }
        y7Var.f(true);
        y7Var.e(true);
        s7Var.H = true;
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.b;
        Intent intent = (Intent) this.c;
        int i10 = CarAppNotificationBroadcastReceiver.a;
        iStartCarApp.startCarApp(intent);
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        return d3.B0((d3) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                p.Y((p) this.b, (HashSet) this.c);
                break;
            case 1:
                c1 c1Var = (c1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(c1Var.J).getInputUser(c1Var.R);
                ConnectionsManager.getInstance(c1Var.J).sendRequest(allowsendmessage, new gg.y(c1Var, strArr, d2Var, 20));
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
                uf.t.d(r6.currentAccount).a((uf.q) this.b, ((TL_account.TL_businessChatLink) this.c).link);
                break;
            case 4:
                d3.y0((d3) this.b, (TL_payments.connectedBotStarRef) this.c);
                break;
            case 6:
                tf.u0 u0Var = (tf.u0) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                u0Var.getClass();
                zArr2[0] = true;
                u0Var.Q();
                break;
        }
    }

    @Override // vh.d4
    public void run(long j10) {
        p3 p3Var = (p3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        p3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    @Override // org.telegram.messenger.Utilities.Callback3Return
    public Object run(Object obj, Object obj2, Object obj3) {
        uf.k kVar = (uf.k) this.b;
        View view = (View) this.c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        kVar.w = false;
        AndroidUtilities.cancelRunOnUIThread(kVar.d);
        uf.i iVar = kVar.n;
        kVar.x = document;
        iVar.setSticker(document);
        ((n8) view).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }
}
