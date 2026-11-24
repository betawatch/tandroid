// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w72 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w72(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(Object obj, Object obj2) {
        final ot9 ot9Var = (ot9) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = ot9Var.S;
        ArrayList arrayList3 = ot9Var.Y;
        int i = ot9Var.Q;
        final byte b = 0;
        int i2 = 0;
        final byte b2 = 1;
        if (TextUtils.isEmpty(ot9Var.e0)) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                if (arrayList3.size() > 5) {
                    arrayList.add(c4c.s(k96.M0(2131745547, null), k96.M0(ot9Var.X ? 2131745148 : 2131745147, null), new View.OnClickListener() { // from class: wj3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = b;
                            ot9 ot9Var2 = ot9Var;
                            switch (b3) {
                                case 0:
                                    ot9Var2.X = !ot9Var2.X;
                                    ot9Var2.O(true);
                                    if (ot9Var2.X) {
                                        gl.t1(ot9Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                                default:
                                    ot9Var2.W = !ot9Var2.W;
                                    ot9Var2.O(true);
                                    if (ot9Var2.W) {
                                        gl.t1(ot9Var2.g0.getParentActivity().getCurrentFocus());
                                        break;
                                    }
                                    break;
                            }
                        }
                    }));
                } else {
                    arrayList.add(c4c.r(k96.M0(2131745547, null)));
                }
                int size = arrayList3.size();
                if (!ot9Var.X) {
                    size = Math.min(5, size);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    c4c w = c4c.w((TLObject) arrayList3.get(i3));
                    w.J = true;
                    arrayList.add(w);
                }
            }
            HashMap hashMap = na7.q1(i).M4;
            p97 p97Var = hashMap == null ? null : (p97) hashMap.get(0L);
            if (p97Var == null) {
                arrayList.add(c4c.p(30));
                arrayList.add(c4c.p(29));
                arrayList.add(c4c.p(29));
                arrayList.add(c4c.p(29));
                arrayList.add(c4c.p(29));
                return;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = p97Var.b;
            int size2 = arrayList5.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(chat.id));
                    if (hc2.r0(chat) && (K0 == null || hc2.r0(K0))) {
                        arrayList4.add(chat);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(c4c.r(k96.M0(2131745519, null)));
            }
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj4 = arrayList4.get(i2);
                i2++;
                arrayList.add(c4c.w((TLRPC.Chat) obj4));
            }
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = ot9Var.T;
        int size4 = arrayList7.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj5 = arrayList7.get(i5);
            i5++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj5;
            TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(chat2.id));
            if (hc2.r0(chat2) && (K02 == null || hc2.r0(K02))) {
                arrayList6.add(chat2);
            }
        }
        ArrayList arrayList8 = ot9Var.U;
        int size5 = arrayList8.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj6 = arrayList8.get(i6);
            i6++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
            TLRPC.Chat K03 = na7.q1(i).K0(Long.valueOf(chat3.id));
            if (hc2.r0(chat3) && (K03 == null || hc2.r0(K03))) {
                arrayList6.add(chat3);
            }
        }
        ArrayList arrayList9 = ot9Var.V;
        int size6 = arrayList9.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj7 = arrayList9.get(i7);
            i7++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj7;
            TLRPC.Chat K04 = na7.q1(i).K0(Long.valueOf(chat4.id));
            if (hc2.r0(chat4) && (K04 == null || hc2.r0(K04))) {
                arrayList6.add(chat4);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() <= 5 || arrayList2.isEmpty()) {
                arrayList.add(c4c.r(k96.M0(2131745622, null)));
            } else {
                arrayList.add(c4c.s(k96.M0(2131745622, null), k96.M0(ot9Var.W ? 2131745148 : 2131745147, null), new View.OnClickListener() { // from class: wj3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        ot9 ot9Var2 = ot9Var;
                        switch (b3) {
                            case 0:
                                ot9Var2.X = !ot9Var2.X;
                                ot9Var2.O(true);
                                if (ot9Var2.X) {
                                    gl.t1(ot9Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                            default:
                                ot9Var2.W = !ot9Var2.W;
                                ot9Var2.O(true);
                                if (ot9Var2.W) {
                                    gl.t1(ot9Var2.g0.getParentActivity().getCurrentFocus());
                                    break;
                                }
                                break;
                        }
                    }
                }));
            }
            int size7 = arrayList6.size();
            if (!ot9Var.W && !arrayList2.isEmpty()) {
                size7 = Math.min(5, size7);
            }
            for (int i8 = 0; i8 < size7; i8++) {
                arrayList.add(c4c.w((TLObject) arrayList6.get(i8)));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(c4c.r(k96.M0(2131745564, null)));
        int size8 = arrayList2.size();
        while (b < size8) {
            Object obj8 = arrayList2.get(b);
            c4c c4cVar = new c4c(33);
            c4cVar.H = (k27) obj8;
            arrayList.add(c4cVar);
            b++;
        }
        if (ot9Var.b0) {
            arrayList.add(c4c.p(1));
        }
    }

    private final void c(Object obj, Object obj2) {
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
        mt9 mt9Var = (mt9) ((bl3) this.b);
        cj3 cj3Var = mt9Var.J0;
        gl.t1(cj3Var.getParentActivity().getCurrentFocus());
        cs5 J = cs5.J(cj3Var, (rr8) obj);
        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
            cs5 K = J.K();
            K.b(R.drawable.ic_ab_back, k96.M0(2131753753, null), new en1(J, (byte) 10), false);
            K.j();
            if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                K.o(13, -1, tL_sponsoredPeer.sponsor_info);
            }
            if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                    K.j();
                }
                K.o(13, -1, tL_sponsoredPeer.additional_info);
            }
            J.b(R.drawable.msg_channel, k96.M0(2131745011, null), new c10(J, K, (byte) 9), false);
        }
        J.b(R.drawable.msg_info, k96.M0(2131754943, null), new bm8((Object) mt9Var, (Object) cj3Var, (Object) mt9Var.K0, (Object) J, (byte) 12), false);
        J.b(R.drawable.msg_block2, k96.M0(2131746041, null), new bm8((Object) mt9Var, (Object) cj3Var, (Object) tL_sponsoredPeer, (Object) J, (byte) 13), false);
        J.j();
        J.b(R.drawable.msg_cancel, k96.M0(2131746127, null), new gm8(mt9Var, cj3Var, J, (byte) 25), false);
        J.W(k96.a0 ? 3 : 5);
        J.b0 = true;
        J.t = false;
        J.a0();
    }

    private final void d(Object obj, Object obj2) {
        tv3 tv3Var = (tv3) this.b;
        String str = (String) obj;
        ew3 ew3Var = tv3Var.s;
        ew3Var.l1 = str;
        ew3Var.m1 = ((Integer) obj2).intValue();
        tv3Var.c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        t14 t14Var = (t14) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        c14 c14Var = t14Var.S1;
        if (c14Var == null || !(c14Var.getDrawable() instanceof oq2)) {
            return;
        }
        oq2 oq2Var = (oq2) t14Var.S1.getDrawable();
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        pq2 pq2Var = oq2Var.c;
        if (pq2Var.a != intValue) {
            pq2 pq2Var2 = oq2Var.g;
            if (pq2Var2 != null) {
                oq2Var.c = pq2Var2;
                pq2Var = pq2Var2;
            }
            if (pq2Var.a != intValue) {
                pq2Var = new pq2(intValue, pq2Var.b ? 1 : 0);
            }
            oq2Var.g = pq2Var;
            lm lmVar = oq2Var.e;
            if (lmVar != null) {
                lmVar.e(true, 0.0f);
            }
        }
        pq2 pq2Var3 = oq2Var.d;
        if (pq2Var3.a != intValue2) {
            pq2 pq2Var4 = oq2Var.h;
            if (pq2Var4 != null) {
                oq2Var.d = pq2Var4;
                pq2Var3 = pq2Var4;
            }
            if (pq2Var3.a != intValue2) {
                pq2Var3 = new pq2(intValue2, pq2Var3.b ? 1 : 0);
            }
            oq2Var.h = pq2Var3;
            lm lmVar2 = oq2Var.f;
            if (lmVar2 != null) {
                lmVar2.e(true, 0.0f);
            }
        }
        oq2Var.invalidateSelf();
        String str = (String) t14Var.S1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            vu3.j.remove(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(num.intValue() >= 0 ? (String) qq2.a.get(num.intValue()) : "");
            sb.append("\u200d");
            sb.append(num2.intValue() >= 0 ? (String) qq2.a.get(num2.intValue()) : "");
            vu3.j.put(str, sb.toString());
        }
        vu3.q();
    }

    private final void f(Object obj, Object obj2) {
        t04 t04Var = (t04) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = t04Var.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList2.get(i);
            i++;
            m04 m04Var = (m04) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m04Var.b;
            if (tL_messages_stickerSet != null) {
                boolean z = tL_messages_stickerSet.set.id == t04Var.d;
                int i2 = v04.b;
                c4c K = c4c.K(v04.class);
                long j = tL_messages_stickerSet.set.id;
                K.d = (int) ((j >>> 32) ^ j);
                K.C = j;
                K.H = tL_messages_stickerSet;
                K.e = z;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = m04Var.a;
                if (stickerSetCovered != null) {
                    arrayList.add(v04.i(stickerSetCovered, m04Var, stickerSetCovered.set.id == t04Var.d));
                }
            }
        }
    }

    private final void g(Object obj, Object obj2) {
        o14 o14Var = (o14) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = o14Var.F;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i);
            i++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z = tL_messages_stickerSet.set.id == o14Var.d;
                int i2 = v04.b;
                c4c K = c4c.K(v04.class);
                long j = tL_messages_stickerSet.set.id;
                K.d = (int) ((j >>> 32) ^ j);
                K.C = j;
                K.H = tL_messages_stickerSet;
                K.e = z;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = o14Var.K;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj4 = arrayList3.get(i3);
            i3++;
            m04 m04Var = (m04) obj4;
            TLRPC.StickerSet stickerSet = m04Var.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(v04.i(m04Var.a, m04Var, stickerSet.id == o14Var.d));
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        m24 m24Var = (m24) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String M0 = k96.M0(2131743750, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.k = R.raw.topics_top;
        arrayList.add(c4cVar);
        c4c i = c4c.i(1, k96.M0(2131743753, null));
        i.L(m24Var.c);
        arrayList.add(i);
        if (m24Var.c) {
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131743749, null)));
            hj3 hj3Var = new hj3(m24Var, (byte) 7);
            int i2 = k24.b;
            c4c K = c4c.K(k24.class);
            K.d = 2;
            K.H = hj3Var;
            K.A = m24Var.e ? 2 : m24Var.d ? 0 : 1;
            arrayList.add(K);
            arrayList.add(c4c.C(k96.M0(2131743748, null)));
        }
    }

    private final void i(Object obj, Object obj2) {
        wb5 wb5Var = (wb5) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(c4c.k(wb5Var.T1));
        arrayList.add(p64.i(k96.M0(2131750855, null), k96.M0(2131750856, null), R.drawable.msg_gift_premium));
        arrayList.add(p64.i(k96.M0(2131750853, null), gl.D2(gl.N2(k96.M0(2131750854, null), -1, 0, new s54((Object) wb5Var, (byte) 2), null), true), R.drawable.msg_bot));
        arrayList.add(p64.i(k96.M0(2131750851, null), k96.M0(2131750852, null), R.drawable.menu_unlock));
        arrayList.add(p64.i(k96.M0(2131750849, null), k96.M0(2131750850, null), R.drawable.menu_feature_paid));
        arrayList.add(c4c.D(gl.L(68.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i8c
    public final void a(Object obj, Object obj2) {
        int i;
        byte b;
        byte b2;
        byte b3;
        TLRPC.UserProfilePhoto userProfilePhoto;
        final byte b4 = 1;
        final byte b5 = 0;
        int i2 = 0;
        int i3 = 0;
        r2 = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                c82 c82Var = (c82) this.b;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = c82Var.G;
                ahb ahbVar = c82Var.e;
                if (ahbVar != null && c82Var.f != null) {
                    arrayList.add(c4c.j(1, ahbVar));
                    arrayList.add(c4c.l(2, c82Var.f));
                    int i4 = c82Var.Z;
                    if (i4 == 1 || i4 == 0 || c82Var.a) {
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            View view = (View) arrayList2.get(i5);
                            arrayList.add(((Boolean) c82Var.H.get(i5)).booleanValue() ? c4c.l(i5 + 100, view) : c4c.j(i5 + 100, view));
                        }
                        break;
                    }
                }
                break;
            case 1:
                p82 p82Var = (p82) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    u21.b0(p82Var).g0(tL_error, false);
                }
                gl.B2(p82Var.k0);
                gl.B2(p82Var.h0);
                gl.B2(p82Var.j0);
                break;
            case 2:
                je2 je2Var = (je2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                if (updates != null) {
                    je2Var.getMessagesController().R3(updates, false);
                    break;
                }
                break;
            case 3:
                gl.d3(new le2((kf2) this.b, (byte) 1), 1000L);
                break;
            case 4:
                mf2 mf2Var = (mf2) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                l5cVar.G = true;
                arrayList3.add(c4c.l(-5, mf2Var.V1));
                TL_account.TL_connectedBot tL_connectedBot = mf2Var.S1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        oo1.o(2131745367, null, arrayList3);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(c4c.f(k96.M0(2131745364, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i = 2;
                            arrayList3.add(c4c.f(k96.M0(2131745363, null), tL_connectedBot.location, 2));
                        } else {
                            i = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i)) {
                            arrayList3.add(c4c.f(k96.M0(2131745365, null), k96.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(c4c.C(null));
                    }
                    l5cVar.V();
                    arrayList3.add(c4c.u(k96.M0(2131752807, null)));
                    c4c x = c4c.x(-1, k96.M0(2131752769, null));
                    x.L(mf2Var.a2);
                    arrayList3.add(x);
                    int i6 = mf2.f2;
                    c4c x2 = c4c.x(-2, k96.M0(2131752764, null));
                    x2.L(!mf2Var.a2);
                    arrayList3.add(x2);
                    l5cVar.U();
                    arrayList3.add(c4c.C(null));
                    m41 m41Var = mf2Var.U1;
                    if (m41Var != null) {
                        m41Var.a(arrayList3, l5cVar, true);
                    }
                    arrayList3.add(c4c.C(k96.M0(2131752806, null)));
                    break;
                }
                break;
            case 5:
                final uf2 uf2Var = (uf2) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                l5c l5cVar2 = (l5c) obj2;
                LongSparseArray longSparseArray = uf2Var.O;
                String M0 = k96.M0(2131752771, null);
                String M02 = k96.M0(2131752770, null);
                c4c c4cVar = new c4c(2);
                c4cVar.m = M0;
                c4cVar.p = M02;
                c4cVar.n = "tg_superplaceholders_android_2";
                c4cVar.o = "🤖🏝️";
                c4cVar.A = 120;
                arrayList4.add(c4cVar);
                if (uf2Var.N != null) {
                    l5cVar2.V();
                    long j = uf2Var.N.id;
                    c4c c4cVar2 = new c4c(13);
                    c4cVar2.y = j;
                    c4cVar2.L(true);
                    c4cVar2.E = new View.OnClickListener() { // from class: qf2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b6 = b5;
                            uf2 uf2Var2 = uf2Var;
                            switch (b6) {
                                case 0:
                                    uf2Var2.N = null;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights = uf2Var2.K;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = uf2Var2.K;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        uf2Var2.Y(-14, true, new of2(uf2Var2, (byte) 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = uf2Var2.K;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        uf2Var2.Y(-17, true, new of2(uf2Var2, (byte) 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                default:
                                    uf2Var2.K.manage_stories = !r4.manage_stories;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(c4cVar2);
                    l5cVar2.U();
                    b = 1;
                } else {
                    l5cVar2.V();
                    arrayList4.add(c4c.k(uf2Var.e));
                    longSparseArray.clear();
                    int i7 = 0;
                    byte b6 = 0;
                    while (i7 < uf2Var.d.d.size()) {
                        TLObject tLObject = (TLObject) uf2Var.d.d.get(i7);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                byte b7 = b4;
                                long j2 = user.id;
                                b3 = b7;
                                String str = uf2Var.E;
                                c4c c4cVar3 = new c4c(13);
                                c4cVar3.y = j2;
                                c4cVar3.o = str;
                                arrayList4.add(c4cVar3);
                                longSparseArray.put(user.id, user);
                                b6 = b3;
                                i7++;
                                b4 = b3;
                            }
                        }
                        b3 = b4;
                        i7++;
                        b4 = b3;
                    }
                    b = b4;
                    for (int i8 = 0; i8 < uf2Var.d.e.size(); i8++) {
                        TLObject tLObject2 = (TLObject) uf2Var.d.e.get(i8);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j3 = user2.id;
                                String str2 = uf2Var.E;
                                c4c c4cVar4 = new c4c(13);
                                c4cVar4.y = j3;
                                c4cVar4.o = str2;
                                arrayList4.add(c4cVar4);
                                longSparseArray.put(user2.id, user2);
                                b6 = b;
                            }
                        }
                    }
                    if (longSparseArray.size() > 0 || !(!TextUtils.isEmpty(uf2Var.f.getText().toString()) || uf2Var.d.e() || uf2Var.y)) {
                        b2 = b6;
                    } else {
                        arrayList4.add(c4c.k(uf2Var.n));
                        b2 = b;
                    }
                    uf2Var.h.setVisibility(b2 != 0 ? 0 : 8);
                    l5cVar2.U();
                }
                arrayList4.add(c4c.C(k96.M0(2131752803, null)));
                l5cVar2.V();
                c4c u = c4c.u(k96.M0(2131752807, null));
                u.g = uf2Var.N != null ? b : 0;
                arrayList4.add(u);
                c4c x3 = c4c.x(-1, k96.M0(2131752769, null));
                x3.L(uf2Var.J);
                x3.g = uf2Var.N != null ? b : 0;
                arrayList4.add(x3);
                c4c x4 = c4c.x(-2, k96.M0(2131752764, null));
                x4.L(!uf2Var.J);
                x4.g = uf2Var.N != null ? b : 0;
                arrayList4.add(x4);
                l5cVar2.U();
                arrayList4.add(c4c.C(null));
                uf2Var.w.a(arrayList4, l5cVar2, uf2Var.N != null ? b : 0);
                arrayList4.add(c4c.C(k96.M0(2131752806, null)));
                if (uf2Var.N != null) {
                    l5cVar2.V();
                    arrayList4.add(c4c.u(k96.M0(2131752796, null)));
                    String M03 = k96.M0(2131752783, null);
                    StringBuilder sb = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = uf2Var.K;
                    sb.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb.append("/5");
                    c4c o = c4c.o(-4, M03, sb.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = uf2Var.K;
                    o.L((tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) ? b : 0);
                    o.f = !uf2Var.Q;
                    boolean z2 = b;
                    final byte b8 = z2 ? (byte) 1 : (byte) 0;
                    o.E = new View.OnClickListener() { // from class: qf2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b8;
                            uf2 uf2Var2 = uf2Var;
                            switch (b62) {
                                case 0:
                                    uf2Var2.N = null;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = uf2Var2.K;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = uf2Var2.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        uf2Var2.Y(-14, true, new of2(uf2Var2, (byte) 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = uf2Var2.K;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        uf2Var2.Y(-17, true, new of2(uf2Var2, (byte) 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                default:
                                    uf2Var2.K.manage_stories = !r4.manage_stories;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o);
                    if (uf2Var.Q) {
                        c4c z3 = c4c.z(-5, k96.M0(2131752785, null));
                        z3.L(z2);
                        z3.g = false;
                        z3.i = z2 ? 1 : 0;
                        arrayList4.add(z3);
                        c4c z4 = c4c.z(-6, k96.M0(2131752784, null));
                        z4.L(uf2Var.K.reply);
                        z4.i = z2 ? 1 : 0;
                        arrayList4.add(z4);
                        c4c z5 = c4c.z(-7, k96.M0(2131752786, null));
                        z5.L(uf2Var.K.read_messages);
                        z5.i = z2 ? 1 : 0;
                        arrayList4.add(z5);
                        c4c z6 = c4c.z(-8, k96.M0(2131752787, null));
                        z6.L(uf2Var.K.delete_sent_messages);
                        z6.i = z2 ? 1 : 0;
                        arrayList4.add(z6);
                        c4c z7 = c4c.z(-9, k96.M0(2131752788, null));
                        z7.L(uf2Var.K.delete_received_messages);
                        z7.i = z2 ? 1 : 0;
                        arrayList4.add(z7);
                    }
                    String M04 = k96.M0(2131752779, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = uf2Var.K;
                    sb2.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb2.append("/4");
                    c4c o2 = c4c.o(-10, M04, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = uf2Var.K;
                    o2.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o2.f = !uf2Var.R;
                    final byte b9 = 2;
                    o2.E = new View.OnClickListener() { // from class: qf2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b9;
                            uf2 uf2Var2 = uf2Var;
                            switch (b62) {
                                case 0:
                                    uf2Var2.N = null;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = uf2Var2.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = uf2Var2.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        uf2Var2.Y(-14, true, new of2(uf2Var2, (byte) 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = uf2Var2.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        uf2Var2.Y(-17, true, new of2(uf2Var2, (byte) 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                default:
                                    uf2Var2.K.manage_stories = !r4.manage_stories;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o2);
                    if (uf2Var.R) {
                        c4c z8 = c4c.z(-11, k96.M0(2131752781, null));
                        z8.L(uf2Var.K.edit_name);
                        z8.i = 1;
                        arrayList4.add(z8);
                        c4c z9 = c4c.z(-12, k96.M0(2131752782, null));
                        z9.L(uf2Var.K.edit_bio);
                        z9.i = 1;
                        arrayList4.add(z9);
                        c4c z10 = c4c.z(-13, k96.M0(2131752780, null));
                        z10.L(uf2Var.K.edit_profile_photo);
                        z10.i = 1;
                        arrayList4.add(z10);
                        c4c z11 = c4c.z(-14, k96.M0(2131752778, null));
                        z11.L(uf2Var.K.edit_username);
                        z11.i = 1;
                        arrayList4.add(z11);
                    }
                    String M05 = k96.M0(2131752795, null);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = uf2Var.K;
                    sb3.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb3.append("/5");
                    c4c o3 = c4c.o(-15, M05, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = uf2Var.K;
                    o3.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o3.f = !uf2Var.S;
                    final byte b10 = 3;
                    o3.E = new View.OnClickListener() { // from class: qf2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b10;
                            uf2 uf2Var2 = uf2Var;
                            switch (b62) {
                                case 0:
                                    uf2Var2.N = null;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = uf2Var2.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = uf2Var2.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        uf2Var2.Y(-14, true, new of2(uf2Var2, (byte) 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = uf2Var2.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        uf2Var2.Y(-17, true, new of2(uf2Var2, (byte) 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                default:
                                    uf2Var2.K.manage_stories = !r4.manage_stories;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o3);
                    if (uf2Var.S) {
                        c4c z12 = c4c.z(-16, k96.M0(2131752790, null));
                        z12.L(uf2Var.K.view_gifts);
                        z12.i = 1;
                        arrayList4.add(z12);
                        c4c z13 = c4c.z(-17, k96.M0(2131752794, null));
                        z13.L(uf2Var.K.sell_gifts);
                        z13.i = 1;
                        arrayList4.add(z13);
                        c4c z14 = c4c.z(-18, k96.M0(2131752793, null));
                        z14.L(uf2Var.K.change_gift_settings);
                        z14.i = 1;
                        arrayList4.add(z14);
                        c4c z15 = c4c.z(-19, k96.M0(2131752792, null));
                        z15.L(uf2Var.K.transfer_and_upgrade_gifts);
                        z15.i = 1;
                        arrayList4.add(z15);
                        c4c z16 = c4c.z(-20, k96.M0(2131752791, null));
                        z16.L(uf2Var.K.transfer_stars);
                        z16.i = 1;
                        arrayList4.add(z16);
                    }
                    c4c o4 = c4c.o(-21, k96.M0(2131752777, null), "");
                    o4.L(uf2Var.K.manage_stories);
                    final byte b11 = 4;
                    o4.E = new View.OnClickListener() { // from class: qf2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b62 = b11;
                            uf2 uf2Var2 = uf2Var;
                            switch (b62) {
                                case 0:
                                    uf2Var2.N = null;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 1:
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = uf2Var2.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                                case 2:
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = uf2Var2.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        uf2Var2.Y(-14, true, new of2(uf2Var2, (byte) 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = uf2Var2.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        uf2Var2.Y(-17, true, new of2(uf2Var2, (byte) 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        uf2Var2.c.g3.O(true);
                                        uf2Var2.Z(true);
                                        break;
                                    }
                                default:
                                    uf2Var2.K.manage_stories = !r4.manage_stories;
                                    uf2Var2.c.g3.O(true);
                                    uf2Var2.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o4);
                    l5cVar2.U();
                    arrayList4.add(c4c.B(-4, null));
                    arrayList4.add(c4c.B(-5, null));
                    arrayList4.add(c4c.B(-6, null));
                    arrayList4.add(c4c.B(-7, null));
                    break;
                }
                break;
            case 6:
                ((wk4) this.b).d0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                break;
            case 7:
                qm2 qm2Var = (qm2) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(c4c.E(0, gl.L(12.0f)));
                arrayList5.add(c4c.j(1, qm2Var.U1));
                arrayList5.add(c4c.E(2, gl.L(12.0f)));
                arrayList5.add(c4c.t(3, k96.M0(2131751935, null)));
                qm2Var.X1 = arrayList5.size();
                String M06 = k96.M0(2131751934, null);
                boolean z17 = qm2Var.W1;
                c4c y = c4c.y(kk7.g2, M06, k96.M0(z17 ? 2131751933 : 2131751932, null));
                y.L(!qm2Var.T1);
                arrayList5.add(y);
                c4c y2 = c4c.y(kk7.f2, k96.M0(2131751938, null), k96.M0(z17 ? 2131751937 : 2131751936, null));
                y2.L(qm2Var.T1);
                arrayList5.add(y2);
                arrayList5.add(c4c.B(6, k96.M0(2131751939, null)));
                break;
            case 8:
                ((ArrayList) obj).add(c4c.j(0, ((fn2) this.b).S1));
                break;
            case 9:
                ((pn2) this.b).w.c((ArrayList) obj);
                break;
            case 10:
                it2 it2Var = (it2) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                TLRPC.User V1 = it2Var.getMessagesController().V1(Long.valueOf(it2Var.I));
                arrayList6.add(c4c.k(it2Var.W));
                arrayList6.add(c4c.k(it2Var.b));
                arrayList6.add(c4c.k(it2Var.c));
                if (TextUtils.isEmpty(it2Var.a0())) {
                    arrayList6.add(c4c.C(gl.G2(gl.S2(k96.M0(2131748217, null)), l7c.k(V1, true), "%1$s")));
                } else if (it2Var.L) {
                    arrayList6.add(c4c.C(gl.S2(k96.a0("MobileVisibleInfo", null, 2131748216, l7c.k(V1, true)))));
                } else {
                    arrayList6.add(c4c.C(null));
                }
                if (it2Var.J && it2Var.L) {
                    c4c i9 = c4c.i(2, k96.M0(2131754444, null));
                    i9.L(it2Var.Y);
                    arrayList6.add(i9);
                    arrayList6.add(c4c.C(k96.a0(null, null, 2131754443, l7c.k(V1, true))));
                }
                arrayList6.add(c4c.k(it2Var.d));
                arrayList6.add(c4c.C(k96.M0(2131754391, null)));
                if (!it2Var.J) {
                    TLRPC.UserFull W1 = it2Var.getMessagesController().W1(it2Var.I);
                    if (W1 != null && W1.birthday == null) {
                        arrayList6.add(c4c.k(it2Var.G));
                    }
                    arrayList6.add(c4c.k(it2Var.y));
                    arrayList6.add(c4c.k(it2Var.E));
                    if (V1 != null && (userProfilePhoto = V1.photo) != null && userProfilePhoto.personal) {
                        arrayList6.add(c4c.k(it2Var.F));
                    }
                    arrayList6.add(c4c.C(null));
                    c4c e = c4c.e(1, k96.M0(2131751540, null));
                    e.s = true;
                    arrayList6.add(e);
                }
                arrayList6.add(c4c.C(null));
                if (it2Var.Z) {
                    gl.c3(new ys2(it2Var, V1, b5));
                    it2Var.Z = false;
                    gl.d3(new ws2(it2Var, b4), 200L);
                    break;
                }
                break;
            case 11:
                ((xv2) this.b).f((Bitmap) obj, (Bitmap) obj2);
                break;
            case 12:
                tv2 tv2Var = (tv2) this.b;
                CharSequence charSequence = (CharSequence) obj;
                p8c p8cVar = (p8c) obj2;
                xv2 xv2Var = tv2Var.a;
                vv2 vv2Var = xv2Var.l;
                if (vv2Var != null) {
                    vv2Var.R(charSequence, TextUtils.join("", xv2Var.o), p8cVar != null ? new pz1((Object) tv2Var, (Object) p8cVar, (byte) 11) : null);
                    if (p8cVar == null) {
                        xv2Var.d();
                        break;
                    }
                }
                break;
            case 13:
                xx2 xx2Var = (xx2) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = xx2Var.V1;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    int L = gl.L(13.0f) + ((gl.q.y - a.getCurrentActionBarHeight()) - gl.L(68.0f));
                    int L2 = gl.L(88.0f) + xx2Var.g2;
                    arrayList7.add(c4c.E(0, L2));
                    int i10 = L - L2;
                    int size = arrayList8.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList8.get(i11);
                        i11++;
                        for (TLRPC.TL_help_country tL_help_country : (List) xx2Var.U1.get((String) obj3)) {
                            if (TextUtils.isEmpty(xx2Var.X1) || zy9.b1(tL_help_country, gl.I3(xx2Var.X1).toLowerCase())) {
                                i10 -= gl.L(44.0f);
                                boolean containsKey = xx2Var.e2.containsKey(tL_help_country.iso2);
                                int i12 = wx2.b;
                                c4c K = c4c.K(wx2.class);
                                K.m = tL_help_country.iso2;
                                K.H = tL_help_country;
                                K.e = containsKey;
                                arrayList7.add(K);
                            }
                        }
                    }
                    arrayList7.add(c4c.E(1, Math.max(0, i10)));
                    break;
                }
                break;
            case 14:
                q03 q03Var = (q03) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(c4c.k(q03Var.S1));
                arrayList9.add(c4c.C(null));
                ArrayList arrayList10 = q03Var.V1;
                if (arrayList10 != null && !arrayList10.isEmpty()) {
                    oo1.o(2131749297, null, arrayList9);
                    while (b5 < arrayList10.size()) {
                        Long l = (Long) arrayList10.get(b5);
                        l.getClass();
                        TLRPC.User V12 = na7.q1(q03Var.a).V1(l);
                        if (V12 == null) {
                            break;
                        } else {
                            int i13 = jz9.b;
                            c4c K2 = c4c.K(jz9.class);
                            K2.H = V12;
                            K2.L(q03Var.W1.contains(l));
                            arrayList9.add(K2);
                            b5++;
                        }
                    }
                    break;
                }
                break;
            case 15:
                f13 f13Var = (f13) this.b;
                ArrayList arrayList11 = (ArrayList) obj;
                t1 t1Var = f13Var.b2;
                t1 t1Var2 = t1Var;
                if (t1Var == null) {
                    Context context = f13Var.getContext();
                    wjb wjbVar = f13Var.J0;
                    t1 t1Var3 = new t1((byte) 6, context, false);
                    t1Var3.setOrientation(1);
                    ry8 ry8Var = new ry8(context);
                    ry8Var.setAutoRepeat(true);
                    ry8Var.f(R.raw.utyan_streaming, kk7.w1, kk7.w1, null);
                    ry8Var.d();
                    t1Var3.addView(ry8Var, nme.t(kk7.w1, kk7.w1, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(gl.o());
                    textView.setText(k96.a0(null, null, 2131744197, new Object[0]));
                    textView.setTextSize(1, 20.0f);
                    zkb.X(textView, bkb.F6, wjbVar);
                    t1Var3.addView(textView, nme.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    zkb.X(textView2, bkb.i5, wjbVar);
                    textView2.setText(k96.a0(null, null, 2131742994, new Object[0]));
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    t1Var3.addView(textView2, nme.t(-2, -2, 1, 28, 0, 28, 17));
                    f13Var.b2 = t1Var3;
                    t1Var2 = t1Var3;
                }
                arrayList11.add(c4c.k(t1Var2));
                arrayList11.add(c4c.C(null));
                arrayList11.add(c4c.u(k96.M0(2131743189, null)));
                String str3 = f13Var.W1;
                String M07 = k96.M0(2131743190, null);
                int i14 = e13.b;
                c4c K3 = c4c.K(e13.class);
                K3.m = str3;
                K3.o = M07;
                K3.j = false;
                K3.g = false;
                arrayList11.add(K3);
                SpannableStringBuilder spannableStringBuilder = f13Var.Y1;
                String M08 = k96.M0(2131743191, null);
                c4c K4 = c4c.K(e13.class);
                K4.m = spannableStringBuilder;
                K4.o = M08;
                K4.j = true;
                K4.g = false;
                arrayList11.add(K4);
                arrayList11.add(c4c.C(f13Var.a2 ? k96.M0(f13Var.S1 ? 2131743186 : 2131743187, null) : null));
                break;
            case 16:
                a43 a43Var = (a43) this.b;
                TL_wallet.currencyRates currencyrates = (TL_wallet.currencyRates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    de9.s(tL_error2.text, new StringBuilder("[gram-wallet] failed to load currency rates: "));
                    break;
                } else {
                    Utilities.d.c(new z33(a43Var, currencyrates, b5));
                    break;
                }
            case 17:
                cj3 cj3Var = (cj3) this.b;
                cj3Var.R1 = (Long) obj;
                cj3Var.m5();
                break;
            case 18:
                ((Runnable) this.b).run();
                break;
            case 19:
                final vj3 vj3Var = (vj3) this.b;
                ArrayList arrayList12 = (ArrayList) obj;
                int i15 = vj3Var.Q;
                hj3 hj3Var = vj3Var.k0;
                uj3 uj3Var = vj3Var.T;
                ArrayList arrayList13 = vj3Var.W;
                boolean z18 = vj3Var.S;
                HashSet hashSet = new HashSet();
                if (TextUtils.isEmpty(vj3Var.h0)) {
                    ArrayList arrayList14 = hq6.d0(i15).m1;
                    ArrayList arrayList15 = new ArrayList();
                    if (arrayList14 != null) {
                        for (int i16 = 0; i16 < arrayList14.size(); i16++) {
                            TLRPC.User V13 = na7.q1(i15).V1(Long.valueOf(cf3.n(((TLRPC.TL_topPeer) arrayList14.get(i16)).peer)));
                            if (V13 != null && V13.bot) {
                                arrayList15.add(V13);
                            }
                        }
                    }
                    vj3Var.a0 = arrayList12.size();
                    if (!arrayList15.isEmpty() && !z18) {
                        if (arrayList15.size() > 5) {
                            arrayList12.add(c4c.s(k96.M0(2131745628, null), k96.M0(vj3Var.X ? 2131745148 : 2131745147, null), new View.OnClickListener() { // from class: sj3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    byte b12 = b4;
                                    vj3 vj3Var2 = vj3Var;
                                    switch (b12) {
                                        case 0:
                                            vj3Var2.Y = !vj3Var2.Y;
                                            vj3Var2.O(true);
                                            break;
                                        default:
                                            vj3Var2.X = !vj3Var2.X;
                                            vj3Var2.O(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList12.add(c4c.r(k96.M0(2131745628, null)));
                        }
                        int i17 = 0;
                        for (int i18 = 5; i17 < arrayList15.size() && (i17 < i18 || vj3Var.X); i18 = 5) {
                            TLRPC.User user3 = (TLRPC.User) arrayList15.get(i17);
                            if (!hashSet.contains(Long.valueOf(user3.id))) {
                                hashSet.add(Long.valueOf(user3.id));
                                c4c w = c4c.w(user3);
                                w.r = true;
                                w.u = true;
                                w.I = hj3Var;
                                arrayList12.add(w);
                            }
                            i17++;
                        }
                    }
                    hashSet.clear();
                    vj3Var.b0 = arrayList12.size();
                    ArrayList arrayList16 = uj3Var.h;
                    if (!arrayList16.isEmpty()) {
                        if (!z18) {
                            arrayList12.add(c4c.r(k96.M0(2131745627, null)));
                        }
                        boolean z19 = false;
                        while (i3 < arrayList16.size()) {
                            TLRPC.User user4 = (TLRPC.User) arrayList16.get(i3);
                            if (!hashSet.contains(Long.valueOf(user4.id))) {
                                hashSet.add(Long.valueOf(user4.id));
                                c4c w2 = c4c.w(user4);
                                w2.r = true;
                                w2.s = true;
                                w2.u = true;
                                w2.I = hj3Var;
                                arrayList12.add(w2);
                                z19 = true;
                            }
                            i3++;
                            z19 = z19;
                        }
                        if (uj3Var.c || !uj3Var.e) {
                            arrayList12.add(c4c.p(29));
                            arrayList12.add(c4c.p(29));
                            arrayList12.add(c4c.p(29));
                        }
                        z = z19 ? 1 : 0;
                    } else if (uj3Var.c || !uj3Var.e) {
                        if (!z18) {
                            arrayList12.add(c4c.p(30));
                        }
                        arrayList12.add(c4c.p(29));
                        arrayList12.add(c4c.p(29));
                        arrayList12.add(c4c.p(29));
                        arrayList12.add(c4c.p(29));
                    }
                    if (z) {
                        arrayList12.add(c4c.C(vj3Var.Z));
                        break;
                    }
                } else {
                    ArrayList arrayList17 = new ArrayList();
                    arrayList17.addAll(vj3Var.U);
                    arrayList17.addAll(vj3Var.V);
                    if (!arrayList17.isEmpty()) {
                        if (arrayList17.size() <= 5 || arrayList13.isEmpty() || z18) {
                            arrayList12.add(c4c.r(k96.M0(2131745630, null)));
                        } else {
                            arrayList12.add(c4c.s(k96.M0(2131745630, null), k96.M0(vj3Var.Y ? 2131745148 : 2131745147, null), new View.OnClickListener() { // from class: sj3
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    byte b12 = b5;
                                    vj3 vj3Var2 = vj3Var;
                                    switch (b12) {
                                        case 0:
                                            vj3Var2.Y = !vj3Var2.Y;
                                            vj3Var2.O(true);
                                            break;
                                        default:
                                            vj3Var2.X = !vj3Var2.X;
                                            vj3Var2.O(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size2 = arrayList17.size();
                        if (!vj3Var.Y && !arrayList13.isEmpty() && !z18) {
                            size2 = Math.min(5, size2);
                        }
                        for (int i19 = 0; i19 < size2; i19++) {
                            c4c w3 = c4c.w((TLObject) arrayList17.get(i19));
                            w3.u = true;
                            w3.I = hj3Var;
                            arrayList12.add(w3);
                        }
                    }
                    if (!arrayList13.isEmpty() && !z18) {
                        arrayList12.add(c4c.r(k96.M0(2131745564, null)));
                        int size3 = arrayList13.size();
                        while (i2 < size3) {
                            Object obj4 = arrayList13.get(i2);
                            i2++;
                            c4c c4cVar5 = new c4c(33);
                            c4cVar5.H = (k27) obj4;
                            arrayList12.add(c4cVar5);
                        }
                        if (vj3Var.e0) {
                            arrayList12.add(c4c.p(1));
                            break;
                        }
                    }
                }
                break;
            case 20:
                b(obj, obj2);
                break;
            case 21:
                c(obj, obj2);
                break;
            case 22:
                nv3 nv3Var = (nv3) this.b;
                String str4 = (String) obj;
                ew3 ew3Var = nv3Var.r;
                ew3Var.l1 = str4;
                ew3Var.m1 = ((Integer) obj2).intValue();
                nv3Var.c.G(str4);
                break;
            case 23:
                d(obj, obj2);
                break;
            case 24:
                e(obj, obj2);
                break;
            case 25:
                f(obj, obj2);
                break;
            case 26:
                g(obj, obj2);
                break;
            case 27:
                h(obj, obj2);
                break;
            case 28:
                i(obj, obj2);
                break;
            default:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.A0 = !((Boolean) obj2).booleanValue();
                MediaController w4 = MediaController.w();
                boolean z20 = fragmentContextView.W;
                v7 v7Var = fragmentContextView.I;
                float floatValue = ((Float) obj).floatValue();
                v7Var.getClass();
                w4.l0(z20, (floatValue * 2.8f) + 0.2f);
                break;
        }
    }
}
