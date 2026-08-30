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
import org.telegram.messenger.ci;
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
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tt;
import org.telegram.ui.ad0;
import org.telegram.ui.oc0;
import org.telegram.ui.vc0;
import ph.f8;
import ph.h8;
import ph.m7;
import ph.p7;
import ph.s7;
import ph.t7;
import ph.z7;
import vh.c4;
import vh.i5;
import vh.l5;
import vh.o3;
import vh.r3;
import vh.y2;
import vh.z5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements org.telegram.ui.ActionBar.c2, jl0, kl0, Utilities.Callback3Return, vc0, androidx.car.app.utils.e, vh.l0, tt, c4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // vh.l0
    public o70 a(vh.d1 d1Var) {
        q5.g0 g0Var = (q5.g0) this.b;
        f6 f6Var = (f6) this.c;
        vh.p pVar = (vh.p) g0Var.c;
        o70 o70Var = new o70(pVar, f6Var, d1Var, false, false, true);
        pVar.E = o70Var;
        return o70Var;
    }

    @Override // org.telegram.ui.Components.jl0
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
        z7 z7Var = (z7) this.b;
        Context context = (Context) this.c;
        ArrayList arrayList2 = z7Var.I;
        a0.h hVar = z7Var.b;
        t7 t7Var = z7Var.x;
        ArrayList arrayList3 = z7Var.c;
        HashMap hashMap = z7Var.d;
        f8 f8Var = z7Var.T;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            return;
        }
        p7 p7Var = (p7) arrayList2.get(i10);
        int i17 = p7Var.a;
        if (i17 != 3) {
            if (i17 != 7) {
                if (i17 == 9) {
                    int i18 = p7Var.q;
                    if (i18 == 0) {
                        h8 h8Var = f8Var.Z;
                        if (h8Var != null) {
                            h8Var.run();
                            return;
                        }
                        return;
                    }
                    if (i18 == 1) {
                        TLRPC.InputPeer inputPeer = f8Var.c;
                        if (inputPeer != null) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer);
                        } else {
                            i12 = ((g3) f8Var).currentAccount;
                            clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        }
                        f6Var2 = ((g3) f8Var).resourcesProvider;
                        o70 F = o70.F(z7Var, f6Var2, view);
                        F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new gg.y1(z7Var, clientUserId, 26), false);
                        F.k();
                        o70.f(F, f8Var.i1().B(clientUserId, true), f8Var.v, false, null, new u1(6, z7Var, F));
                        F.Z();
                        return;
                    }
                    if (i18 != 5) {
                        if (i18 == 6) {
                            f8Var.D = false;
                            z7Var.g(true);
                            return;
                        }
                        return;
                    }
                    Context context2 = z7Var.getContext();
                    f6Var = ((g3) f8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, f6Var);
                    d2Var.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = f8Var.c;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    i11 = ((g3) f8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new gg.y(z7Var, d2Var, getgroupcallstreamrtmpurl, 22));
                    return;
                }
                return;
            }
            if (view instanceof o8) {
                o8 o8Var = (o8) view;
                o8Var.setChecked(!o8Var.b());
                p7Var.k = o8Var.b();
                int i19 = p7Var.c;
                if (i19 == 0) {
                    boolean b10 = o8Var.b();
                    f8Var.x = b10;
                    r12 = f8Var.K == 4 ? 1 : 0;
                    if (b10) {
                        e3 e3Var = f8Var.container;
                        f6Var6 = ((g3) f8Var).resourcesProvider;
                        ic G = new qc(e3Var, f6Var6).G(R.raw.ic_save_to_gallery, 4, LocaleController.getString(r12 != 0 ? R.string.StoryEnabledScreenshotsShare : R.string.StoryEnabledScreenshots));
                        G.j = 5000;
                        G.k(true);
                        return;
                    }
                    e3 e3Var2 = f8Var.container;
                    f6Var5 = ((g3) f8Var).resourcesProvider;
                    ic G2 = new qc(e3Var2, f6Var5).G(R.raw.passcode_lock_close, 4, LocaleController.getString(r12 != 0 ? R.string.StoryDisabledScreenshotsShare : R.string.StoryDisabledScreenshots));
                    G2.j = 5000;
                    G2.k(true);
                    return;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        f8Var.w = o8Var.b();
                        z7Var.g(true);
                        return;
                    }
                    return;
                }
                boolean b11 = o8Var.b();
                f8Var.y = b11;
                boolean z4 = f8Var.c instanceof TLRPC.TL_inputPeerChannel;
                if (b11) {
                    e3 e3Var3 = f8Var.container;
                    f6Var4 = ((g3) f8Var).resourcesProvider;
                    ic G3 = new qc(e3Var3, f6Var4).G(R.raw.msg_story_keep, 4, LocaleController.getString(z4 ? R.string.StoryChannelEnableKeep : R.string.StoryEnableKeep));
                    G3.j = 5000;
                    G3.k(true);
                } else {
                    e3 e3Var4 = f8Var.container;
                    f6Var3 = ((g3) f8Var).resourcesProvider;
                    ic G4 = new qc(e3Var4, f6Var3).G(R.raw.fire_on, 4, LocaleController.getString(z4 ? R.string.StoryChannelDisableKeep : R.string.StoryDisableKeep));
                    G4.j = 5000;
                    G4.k(true);
                }
                z7Var.g(true);
                return;
            }
            return;
        }
        if (p7Var.n && f8Var.C) {
            i16 = ((g3) f8Var).currentAccount;
            boolean z10 = f8Var.H;
            TLRPC.InputPeer inputPeer3 = f8Var.c;
            s7 s7Var = new s7(z7Var, 0);
            f6Var9 = ((g3) f8Var).resourcesProvider;
            new m7(context, i16, z10, inputPeer3, s7Var, f6Var9).show();
            return;
        }
        int i20 = p7Var.i;
        if (i20 == 1) {
            if (f8Var.K == 1 || f8.J0(f8Var).isEmpty()) {
                f8Var.J = 1;
                f8Var.b.D(1);
            }
            f8Var.K = 1;
            z7Var.f(true);
            return;
        }
        if (i20 == 3) {
            if (f8Var.K == 3 || (f8Var.n.isEmpty() && f8Var.r.isEmpty())) {
                f8Var.J = 3;
                f8Var.b.D(1);
            }
            f8Var.K = 3;
            z7Var.f(true);
            return;
        }
        if (i20 == 2) {
            if (f8Var.K == 2) {
                f8Var.J = 2;
                f8Var.b.D(1);
            }
            f8Var.K = 2;
            z7Var.f(true);
            return;
        }
        if (i20 == 4) {
            if (f8Var.K == 4) {
                f8Var.J = 4;
                f8Var.b.D(1);
            }
            f8Var.K = 4;
            z7Var.f(true);
            return;
        }
        if (i20 > 0) {
            arrayList3.clear();
            hashMap.clear();
            f8Var.K = p7Var.i;
            t7Var.c.a();
        } else {
            TLRPC.Chat chat = p7Var.h;
            if (chat != null) {
                long j10 = chat.id;
                if (f8.d1(f8Var, chat) > 200) {
                    try {
                        z7Var.performHapticFeedback(3, 1);
                    } catch (Throwable unused) {
                    }
                    Context context3 = z7Var.getContext();
                    f6Var7 = ((g3) f8Var).resourcesProvider;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context3, 0, f6Var7);
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.GroupTooLarge);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                    kh.a2.C(R.string.OK, alertDialog$Builder, null);
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
                    z7Var.i(true);
                } else {
                    i13 = ((g3) f8Var).currentAccount;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(j10));
                    i14 = ((g3) f8Var).currentAccount;
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(i14).getChatFull(j10);
                    if (chatFull == null || (chatParticipants = chatFull.participants) == null || (arrayList = chatParticipants.participants) == null || arrayList.isEmpty() || chatFull.participants.participants.size() < chatFull.participants_count - 1) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = z7Var.D;
                        if (d2Var2 != null) {
                            d2Var2.dismiss();
                            z7Var.D = null;
                        }
                        z7Var.E = j10;
                        Context context4 = z7Var.getContext();
                        f6Var8 = ((g3) f8Var).resourcesProvider;
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, f6Var8);
                        z7Var.D = d2Var3;
                        d2Var3.q(50L);
                        i15 = ((g3) f8Var).currentAccount;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new ci(z7Var, chat2, messagesStorage, j10));
                    } else {
                        z7Var.d(j10, chatFull.participants);
                    }
                    if (!TextUtils.isEmpty(z7Var.F)) {
                        t7Var.setText("");
                        z7Var.F = null;
                        z7Var.g(false);
                    }
                }
            } else {
                TLRPC.User user = p7Var.g;
                if (user != null) {
                    if (z7Var.a == 0) {
                        f8Var.K = 0;
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
                        if (!TextUtils.isEmpty(z7Var.F)) {
                            t7Var.setText("");
                            z7Var.F = null;
                            z7Var.g(false);
                        }
                        hVar.k(Boolean.TRUE, j11);
                    }
                    arrayList3.clear();
                    arrayList3.addAll(hashSet);
                    z7Var.i(true);
                }
            }
        }
        z7Var.f(true);
        z7Var.e(true);
        t7Var.H = true;
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
    @Override // org.telegram.ui.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        uf.u0 u0Var = (uf.u0) this.b;
        ad0 ad0Var = (ad0) this.c;
        u0Var.x = messageMedia.geo;
        String str = null;
        if (TextUtils.isEmpty(u0Var.y)) {
            oc0 oc0Var = ad0Var.Q;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        return rh.e3.B0((rh.e3) this.b, (Context) this.c, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                p.Y((p) this.b, (HashSet) this.c);
                break;
            case 1:
                a1 a1Var = (a1) this.b;
                String[] strArr = (String[]) this.c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.J).getInputUser(a1Var.R);
                ConnectionsManager.getInstance(a1Var.J).sendRequest(allowsendmessage, new gg.y(a1Var, strArr, d2Var, 21));
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
                rh.e3.y0((rh.e3) this.b, (TL_payments.connectedBotStarRef) this.c);
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

    @Override // org.telegram.ui.Components.tt
    public void j0() {
        switch (this.a) {
            case 12:
                vh.h0 h0Var = (vh.h0) this.b;
                vh.g0 g0Var = (vh.g0) this.c;
                h0Var.i();
                g0Var.a0();
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

    @Override // vh.c4
    public void run(long j10) {
        o3 o3Var = (o3) this.b;
        String str = (String) this.c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        o3Var.a(str, tL_inlineButtonTypeUserProfile);
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
        ((o8) view).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
