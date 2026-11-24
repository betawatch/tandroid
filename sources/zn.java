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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zn implements fo, bj0, ee, ue7, fu2, vn5, xw8, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zn(int i, au1 au1Var, tk5 tk5Var, wn5 wn5Var) {
        this.a = (byte) 7;
        this.c = i;
        this.d = au1Var;
        this.b = tk5Var;
        this.e = wn5Var;
    }

    @Override // vn5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        final au1 au1Var = (au1) this.d;
        final tk5 tk5Var = (tk5) this.b;
        final wn5 wn5Var = (wn5) this.e;
        final int i = this.c;
        gm.c3(new Runnable() { // from class: e88
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
                ConnectionsManager.getInstance(i3).sendRequest(tL_photos_uploadProfilePhoto, new ev0(i3, (Object) photoSize2, (Object) photoSize, (Object) au1Var, (Object) tk5Var, (byte) 9));
                wn5Var.i();
            }
        });
    }

    @Override // xw8
    public final void a(fj0 fj0Var, List list) {
        gm.c3(new jg((Object) fj0Var, this.d, (Object) list, this.c, this.b, this.e, (byte) 10));
    }

    @Override // fu2
    public final void accept(Object obj) {
        kq kqVar = (kq) this.d;
        ((vz6) obj).O(kqVar.b, (rz6) kqVar.c, (ea6) this.b, (ft6) this.e, this.c);
    }

    @Override // bj0
    public final void b(fj0 fj0Var, List list) {
        ArrayList arrayList = (ArrayList) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.d;
        qac qacVar = (qac) this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ln8 ln8Var = (ln8) it.next();
            in8 a = ln8Var.a();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                    String str = tL_premiumGiftCodeOption.store_product;
                    if (str != null && str.equals(ln8Var.c)) {
                        tL_premiumGiftCodeOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_premiumGiftCodeOption.currency)) * (a.b / 1000000.0d));
                        tL_premiumGiftCodeOption.currency = a.c;
                        break;
                    }
                }
            }
        }
        gm.c3(new go0(chat, this.c, arrayList, qacVar, (byte) 0));
    }

    @Override // vn5
    public final boolean c() {
        return true;
    }

    @Override // fo
    public final void d(CharSequence charSequence) {
        ho hoVar = (ho) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.e;
        StaticLayout j = hoVar.j(this.c - ((int) Math.ceil(Math.min(hoVar.d, hoVar.j))), charSequence);
        eo eoVar = new eo(hoVar, j, hoVar.d, arrayList.size());
        eo eoVar2 = new eo(hoVar, j, hoVar.j, arrayList2.size());
        arrayList2.add(eoVar);
        arrayList.add(eoVar2);
        float f = hoVar.d;
        float f2 = eoVar.f;
        hoVar.d = f + f2;
        hoVar.j += f2;
        hoVar.f(eoVar);
        hoVar.g(eoVar2);
    }

    @Override // h59
    public final boolean g(int i, View view) {
        xu9 xu9Var = (xu9) this.d;
        d dVar = (d) this.b;
        ylb ylbVar = (ylb) this.e;
        ArrayList arrayList = xu9Var.r;
        if (i >= 0 && i < arrayList.size()) {
            int i2 = this.c;
            if (z8c.h(i2).p()) {
                if (!z8c.h(i2).p()) {
                    new kj8(dVar, 24, true).show();
                    return true;
                }
                vu9 vu9Var = ((wu9) view).a;
                if (vu9Var != null) {
                    vu9Var.p();
                }
                uu9 uu9Var = (uu9) arrayList.get(i);
                bu5 I = bu5.I(dVar, view);
                I.i = (byte) 3;
                I.b(R.drawable.menu_tag_rename, jb6.M0(TextUtils.isEmpty(uu9Var.c) ? 2131745615 : 2131745603, null), new v36((Object) xu9Var, i2, (Object) uu9Var, (Object) ylbVar, (byte) 24), false);
                I.a0();
                return true;
            }
        }
        return false;
    }

    @Override // vn5
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override // vn5
    public final String getInitialSearchString() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee
    public final void r(he heVar, int i) {
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
                final lf1 lf1Var = (lf1) obj3;
                final TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                View view = (View) obj;
                final boolean z = tL_username.active;
                final String str = tL_username.username;
                final boolean z2 = !z;
                uf1 uf1Var = lf1Var.a;
                long j = uf1Var.y;
                if (j == 0) {
                    TL_account.toggleUsername toggleusername2 = new TL_account.toggleUsername();
                    toggleusername2.username = str;
                    toggleusername2.active = z2;
                    toggleusername = toggleusername2;
                } else {
                    TL_bots.toggleUsername toggleusername3 = new TL_bots.toggleUsername();
                    i2 = ((d) uf1Var).currentAccount;
                    toggleusername3.bot = oc7.r1(i2).n1(j);
                    toggleusername3.username = str;
                    toggleusername3.active = z2;
                    toggleusername = toggleusername3;
                }
                ConnectionsManager connectionsManager = uf1Var.getConnectionsManager();
                final int i4 = this.c;
                connectionsManager.sendRequest(toggleusername, new RequestDelegate() { // from class: jf1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gm.c3(new kf1(lf1.this, str, tLObject, i4, z2, tL_error, tL_username, z));
                    }
                });
                uf1Var.x.add(tL_username.username);
                ((qf1) view).setLoading(true);
                break;
            case 3:
                r23 r23Var = (r23) obj3;
                b61 b61Var = (b61) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                if (!b61Var.R) {
                    b61Var.setLoading(true);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(i3).sendRequest(getgroupcallstreamrtmpurl, new p23(r23Var, b61Var, b2));
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                nha nhaVar = (nha) obj3;
                k47 k47Var = (k47) obj;
                he[] heVarArr = {new he(3, (ylb) obj2, nhaVar.getContext())};
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) k47Var.k.media;
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
                tL_messages_editMessage.peer = oc7.r1(i5).i1(nhaVar.m1);
                tL_messages_editMessage.id = k47Var.e1();
                tL_messages_editMessage.flags |= TLObject.FLAG_14;
                gm.d3(new gea(heVarArr, i5, ConnectionsManager.getInstance(i5).sendRequest(tL_messages_editMessage, new af((Object) nhaVar, (Object) heVarArr, i5, (Object) tL_messages_editMessage, (byte) 9)), b3), 500L);
                break;
            case 6:
                ((PasskeysActivity) obj3).c0((TL_account.Passkey) obj2, (String) obj, i3);
                break;
        }
    }

    @Override // vn5
    public final boolean w() {
        return false;
    }

    @Override // ue7
    public final void z(boolean z) {
        nk3 nk3Var = (nk3) this.d;
        ArrayList arrayList = (ArrayList) this.b;
        HashSet hashSet = (HashSet) this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView w3 = nk3Var.w3();
        int i = this.c;
        if (w3 != null) {
            w3.n(arrayList2, i == 102 ? 27 : 26, null, null, new th3(nk3Var, i, arrayList2, z, hashSet), null);
        }
        nk3Var.A3(i == 103);
    }

    public /* synthetic */ zn(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ zn(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
        this.e = obj3;
    }

    public /* synthetic */ zn(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = i;
    }

    public /* synthetic */ zn(ArrayList arrayList, TLRPC.Chat chat, int i, qac qacVar) {
        this.a = (byte) 1;
        this.b = arrayList;
        this.d = chat;
        this.c = i;
        this.e = qacVar;
    }

    @Override // vn5
    public final void H(float f) {
    }

    @Override // vn5
    public final void T() {
    }

    @Override // vn5
    public final void O(boolean z, boolean z2) {
    }
}
