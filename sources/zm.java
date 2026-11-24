// default package

import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PasskeysActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm implements en, bi0, ed, sc7, us2, vl5, wu8, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zm(int i, os1 os1Var, ui5 ui5Var, wl5 wl5Var) {
        this.a = (byte) 7;
        this.c = i;
        this.d = os1Var;
        this.b = ui5Var;
        this.e = wl5Var;
    }

    @Override // vl5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        final os1 os1Var = (os1) this.d;
        final ui5 ui5Var = (ui5) this.b;
        final wl5 wl5Var = (wl5) this.e;
        final int i = this.c;
        gl.c3(new Runnable() { // from class: c68
            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                TLRPC.InputFile inputFile3 = TLRPC.InputFile.this;
                if (inputFile3 != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile3;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile4 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile4;
                    int i2 = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i2 | 6;
                }
                TLRPC.VideoSize videoSize2 = videoSize;
                if (videoSize2 != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                int i3 = i;
                ConnectionsManager.getInstance(i3).sendRequest(tL_photos_uploadProfilePhoto, new vt0(i3, (Object) photoSize2, (Object) photoSize, (Object) os1Var, (Object) ui5Var, (byte) 9));
                wl5Var.i();
            }
        });
    }

    @Override // wu8
    public final void a(fi0 fi0Var, List list) {
        gl.c3(new jf((Object) fi0Var, this.d, (Object) list, this.c, this.b, this.e, (byte) 10));
    }

    @Override // us2
    public final void accept(Object obj) {
        kp kpVar = (kp) this.d;
        ((vx6) obj).O(kpVar.b, (rx6) kpVar.c, (f86) this.b, (fr6) this.e, this.c);
    }

    @Override // bi0
    public final void b(fi0 fi0Var, List list) {
        ArrayList arrayList = (ArrayList) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        p8c p8cVar = (p8c) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kl8 kl8Var = (kl8) it.next();
            gl8 a = kl8Var.a();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(kl8Var.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_premiumGiftCodeOption.currency)) * (a.b / 1000000.0d));
                        tL_premiumGiftCodeOption.currency = a.c;
                        break;
                    }
                }
            }
        }
        gl.c3(new gn0(chat, this.c, arrayList, p8cVar, (byte) 0));
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        vs9 vs9Var = (vs9) this.d;
        d dVar = (d) this.b;
        wjb wjbVar = (wjb) this.e;
        ArrayList arrayList = vs9Var.r;
        if (i >= 0 && i < arrayList.size()) {
            int i2 = this.c;
            if (y6c.h(i2).p()) {
                if (!y6c.h(i2).p()) {
                    new jh8(dVar, 24, true).show();
                    return true;
                }
                ts9 ts9Var = ((us9) view).a;
                if (ts9Var != null) {
                    ts9Var.p();
                }
                ss9 ss9Var = (ss9) arrayList.get(i);
                cs5 I = cs5.I(dVar, view);
                I.i = (byte) 3;
                I.b(R.drawable.menu_tag_rename, k96.M0(TextUtils.isEmpty(ss9Var.c) ? 2131745689 : 2131745677, null), new q76((Object) vs9Var, i2, (Object) ss9Var, (Object) wjbVar, (byte) 23), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // en
    public final void e(CharSequence charSequence) {
        gn gnVar = (gn) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j = gnVar.j(this.c - ((int) Math.ceil(Math.min(gnVar.d, gnVar.j))), charSequence);
        dn dnVar = new dn(gnVar, j, gnVar.d, arrayList.size());
        dn dnVar2 = new dn(gnVar, j, gnVar.j, arrayList2.size());
        arrayList2.add(dnVar);
        arrayList.add(dnVar2);
        float f = gnVar.d;
        float f2 = dnVar.f;
        gnVar.d = f + f2;
        gnVar.j += f2;
        gnVar.f(dnVar);
        gnVar.g(dnVar2);
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // sc7
    public final void k(boolean z) {
        cj3 cj3Var = (cj3) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView u3 = cj3Var.u3();
        int i = this.c;
        if (u3 != null) {
            u3.n(arrayList2, i == 102 ? 27 : 26, null, null, new gg3(cj3Var, i, arrayList2, z, hashSet), null);
        }
        cj3Var.y3(i == 103);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed
    public final void u(hd hdVar, int i) {
        int i2;
        TL_bots.toggleUsername toggleusername;
        byte b = this.a;
        int i3 = this.c;
        byte b2 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        byte b3 = 1;
        switch (b) {
            case 2:
                final de1 de1Var = (de1) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z = tL_username.active;
                final String str = tL_username.username;
                final boolean z2 = !z;
                me1 me1Var = de1Var.a;
                long j = me1Var.y;
                if (j == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z2;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i2 = ((d) me1Var).currentAccount;
                    toggleusername3.bot = na7.q1(i2).m1(j);
                    toggleusername3.username = str;
                    toggleusername3.active = z2;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = me1Var.getConnectionsManager();
                final int i4 = this.c;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: be1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gl.c3(new ce1(de1.this, str, tLObject, i4, z2, tL_error, tL_username, z));
                    }
                });
                me1Var.x.add(tL_username.username);
                ((ie1) view).setLoading(true);
                break;
            case 3:
                f13 f13Var = (f13) obj3;
                u41 u41Var = (u41) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i3).sendRequest(getgroupcallstreamrtmpurl, new d13(f13Var, u41Var, b2));
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                nfa nfaVar = (nfa) obj3;
                k27 k27Var = (k27) obj;
                hd[] hdVarArr = {new hd(3, (wjb) obj2, nfaVar.getContext())};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k27Var.k.media;
                TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_inputMediaPoll.poll = tL_poll;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                tL_poll.id = poll.id;
                tL_poll.question = poll.question;
                tL_poll.answers = poll.answers;
                tL_poll.closed = true;
                tL_messages_editMessage.media = tL_inputMediaPoll;
                int i5 = this.c;
                tL_messages_editMessage.peer = na7.q1(i5).h1(nfaVar.m1);
                tL_messages_editMessage.id = k27Var.e1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                gl.d3(new fca(hdVarArr, i5, ConnectionsManager.getInstance(i5).sendRequest(tL_messages_editMessage, new ae((Object) nfaVar, (Object) hdVarArr, i5, (Object) tL_messages_editMessage, (byte) 9)), b3), 500L);
                break;
            case 6:
                ((PasskeysActivity) obj3).b0((TL_account.Passkey) obj2, (String) obj, i3);
                break;
        }
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    public /* synthetic */ zm(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ zm(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
        this.e = obj3;
    }

    public /* synthetic */ zm(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }

    public /* synthetic */ zm(ArrayList arrayList, TLRPC.Chat chat, int i, p8c p8cVar) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = chat;
        this.c = i;
        this.e = p8cVar;
    }

    @Override // vl5
    public final void T() {
    }

    @Override // vl5
    public final void H(float f) {
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
    }
}
