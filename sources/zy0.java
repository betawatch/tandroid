// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zy0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zy0(int i, TLRPC.User user, TLRPC.Document document, int i2, pt0 pt0Var) {
        this.a = (byte) 9;
        this.c = i;
        this.b = user;
        this.f = document;
        this.d = i2;
        this.e = pt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x017f A[LOOP:1: B:36:0x0115->B:55:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        km6 km6Var;
        String[] strArr;
        int i;
        byte b = this.a;
        int i2 = 3;
        int i3 = this.c;
        Object obj = this.e;
        int i4 = this.d;
        Object obj2 = this.f;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                pz0 pz0Var = (pz0) obj3;
                kz0 kz0Var = (kz0) obj2;
                gz0 gz0Var = (gz0) obj;
                byte b2 = gz0Var.a;
                ArrayList arrayList = pz0Var.P;
                ez0 ez0Var = pz0Var.a;
                if (i3 == pz0Var.b) {
                    int i5 = kz0Var.g;
                    lz0 lz0Var = kz0Var.a;
                    if (i5 == i4 && kz0Var.e != null && arrayList.contains(kz0Var)) {
                        kz0Var.e = null;
                        pz0Var.v--;
                        if (b2 == 1) {
                            pz0Var.A(kz0Var.h, ez0Var.h(), kz0Var.i);
                            kz0Var.f = ez0Var.j(new z20(pz0Var, kz0Var, (byte) 24), 100L);
                            break;
                        } else {
                            arrayList.remove(kz0Var);
                            if (b2 == 0) {
                                pz0Var.x(kz0Var.d, gz0Var.c);
                                oz0 oz0Var = new oz0(kz0Var.b, kz0Var.c, kz0Var.d, gz0Var.b, gz0Var.c);
                                ArrayList arrayList2 = lz0Var.f;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (((oz0) arrayList2.get(i6)).a.equals(kz0Var.b)) {
                                        arrayList2.set(i6, oz0Var);
                                    }
                                }
                                lz0 lz0Var2 = new lz0(lz0Var.a, 0, null, 0, lz0Var.e);
                                lz0Var2.f.add(oz0Var);
                                ez0Var.b(lz0Var2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                pz0 pz0Var2 = (pz0) obj3;
                fz0 fz0Var = (fz0) obj2;
                gz0 gz0Var2 = (gz0) obj;
                if (i3 == pz0Var2.b) {
                    int i7 = fz0Var.e;
                    long j = fz0Var.a;
                    if (i7 == i4 && pz0Var2.d.get(Long.valueOf(j)) == fz0Var && fz0Var.c != null) {
                        boolean z = pz0Var2.F;
                        ez0 ez0Var2 = pz0Var2.a;
                        long h = ez0Var2.h();
                        fz0Var.c = null;
                        pz0Var2.v--;
                        byte b3 = gz0Var2.a;
                        int i8 = gz0Var2.c;
                        if (b3 != 0) {
                            if (b3 != 1) {
                                if (b3 != 2) {
                                    if (b3 == 3) {
                                        ez0Var2.d("rejoin needed at " + j);
                                        pz0Var2.e(false);
                                        pz0Var2.c = (byte) 3;
                                        pz0Var2.o = h;
                                        ez0Var2.f();
                                        break;
                                    }
                                } else {
                                    pz0Var2.A(fz0Var.f, h, fz0Var.g);
                                    ez0Var2.d("resync at " + j);
                                    if (z) {
                                        pz0Var2.z(gz0Var2.d);
                                        break;
                                    } else {
                                        pz0Var2.e(false);
                                        pz0.d(pz0Var2.l);
                                        pz0Var2.l = null;
                                        pz0Var2.y();
                                        break;
                                    }
                                }
                            } else {
                                pz0Var2.A(fz0Var.f, h, fz0Var.g);
                                fz0Var.d = ez0Var2.j(new z20(pz0Var2, fz0Var, (byte) 23), 100L);
                                break;
                            }
                        } else {
                            fz0Var.h = gz0Var2.b;
                            fz0Var.i = i8;
                            fz0Var.j = gz0Var2.e;
                            if (z) {
                                fz0Var.l += i8;
                                HashMap hashMap = gz0Var2.f;
                                if (hashMap != null) {
                                    pz0Var2.I = hashMap;
                                    pz0Var2.v(fz0Var, hashMap);
                                }
                                pz0Var2.i(fz0Var, h);
                                break;
                            } else {
                                p44 k = pz0Var2.k();
                                double max = h - Math.max(fz0Var.f, pz0Var2.w);
                                if (fz0Var.g) {
                                    max -= k.b();
                                }
                                k.c(i8, max);
                                pz0Var2.x(fz0Var.b, i8);
                                pz0Var2.w = h;
                                pz0Var2.x = fz0Var.b;
                                pz0Var2.j();
                                pz0Var2.w();
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                MediaController mediaController = (MediaController) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                String[] strArr2 = MediaController.W1;
                ArrayList arrayList3 = mediaController.S0;
                HashMap hashMap2 = mediaController.T0;
                if (mediaController.a1 == i3 && (km6Var = mediaController.D0) != null && mediaController.v0 != null && tL_error == null) {
                    mediaController.Y0 = false;
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    km6Var.h = messages_messages.next_rate;
                    ad7.Y(i4).j1(messages_messages.users, messages_messages.chats, true, true);
                    na7.q1(i4).b4(messages_messages.users, false);
                    na7.q1(i4).V3(messages_messages.chats, false);
                    int size = messages_messages.messages.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        k27 k27Var = new k27(i4, messages_messages.messages.get(i10), false, true);
                        if (!k27Var.R4() && !hashMap2.containsKey(Integer.valueOf(k27Var.e1()))) {
                            arrayList3.add(0, k27Var);
                            hashMap2.put(Integer.valueOf(k27Var.e1()), k27Var);
                            i9++;
                        }
                    }
                    mediaController.s0();
                    mediaController.Y0 = false;
                    mediaController.D0.g = arrayList3.size() == mediaController.D0.f;
                    if (gba.J0) {
                        mediaController.b();
                    }
                    if (i9 != 0) {
                        kk7.f(mediaController.v0.K1).k(74, Integer.valueOf(i9));
                        break;
                    }
                }
                break;
            case 3:
                mc9 mc9Var = (mc9) obj2;
                fib fibVar = (fib) obj;
                ac9 ac9Var = ((xb9) obj3).a;
                if (mc9Var.length() >= i3 && mc9Var.getSelectionStart() != mc9Var.getSelectionEnd() && fibVar.i0(ac9Var, 0, i4, i3)) {
                    ac9Var.n = true;
                    mc9Var.setSelection(i3);
                    ac9Var.n = false;
                    break;
                }
                break;
            case 4:
                mc9 mc9Var2 = (mc9) obj2;
                fib fibVar2 = (fib) obj;
                ai9 ai9Var = (ai9) ((u39) obj3).b;
                if (mc9Var2.length() >= i3 && mc9Var2.getSelectionStart() != mc9Var2.getSelectionEnd()) {
                    if (fibVar2.w()) {
                        ai9Var.x = true;
                        mc9Var2.setSelection(i3);
                        ai9Var.x = false;
                        break;
                    } else if (fibVar2.i0(ai9Var, 0, i4, i3)) {
                        ai9Var.x = true;
                        mc9Var2.setSelection(i3);
                        ai9Var.x = false;
                        break;
                    }
                }
                break;
            case 5:
                mc9 mc9Var3 = (mc9) obj2;
                fib fibVar3 = (fib) obj;
                ii9 ii9Var = (ii9) ((ln8) obj3).b;
                if (mc9Var3.length() >= i3 && mc9Var3.getSelectionStart() != mc9Var3.getSelectionEnd() && fibVar3.i0(ii9Var, 0, i4, i3)) {
                    ii9Var.H = true;
                    mc9Var3.setSelection(i3);
                    ii9Var.H = false;
                    break;
                }
                break;
            case 6:
                mc9 mc9Var4 = (mc9) obj2;
                fib fibVar4 = (fib) obj;
                wi9 wi9Var = ((qi9) obj3).a;
                if (mc9Var4.length() >= i3 && mc9Var4.getSelectionStart() != mc9Var4.getSelectionEnd()) {
                    if (fibVar4.w()) {
                        wi9Var.G = true;
                        mc9Var4.setSelection(i3);
                        wi9Var.G = false;
                        break;
                    } else if (fibVar4.i0(wi9Var, 0, i4, i3)) {
                        wi9Var.G = true;
                        mc9Var4.setSelection(i3);
                        wi9Var.G = false;
                        break;
                    }
                }
                break;
            case 7:
                mc9 mc9Var5 = (mc9) obj2;
                fib fibVar5 = (fib) obj;
                wi9 wi9Var2 = ((ri9) obj3).a;
                if (mc9Var5.length() >= i3 && mc9Var5.getSelectionStart() != mc9Var5.getSelectionEnd()) {
                    if (fibVar5.w()) {
                        wi9Var2.n = true;
                        mc9Var5.setSelection(i3);
                        wi9Var2.n = false;
                        break;
                    } else if (fibVar5.i0(wi9Var2, 1, i4, i3)) {
                        wi9Var2.n = true;
                        mc9Var5.setSelection(i3);
                        wi9Var2.n = false;
                        break;
                    }
                }
                break;
            case 8:
                sr9 sr9Var = (sr9) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                sr9Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int length = lowerCase.length();
                int i11 = this.c;
                if (length == 0) {
                    gl.c3(new i57((Object) sr9Var, i11, (Object) new ArrayList(), (Object) new ArrayList(), (Object) sr9Var.I, (byte) 22));
                    break;
                } else {
                    String S0 = k96.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i12 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr3 = new String[i12];
                    strArr3[0] = lowerCase;
                    if (S0 != null) {
                        strArr3[1] = S0;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        int i14 = i13;
                        TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i13)).user_id));
                        if (sr9Var.w || !V1.self) {
                            String[] strArr4 = new String[i2];
                            strArr4[0] = qu2.m(0, V1.first_name, V1.last_name).toLowerCase();
                            strArr = strArr3;
                            String S02 = k96.D0().S0(strArr4[0], true, false);
                            strArr4[1] = S02;
                            if (strArr4[0].equals(S02)) {
                                strArr4[1] = null;
                            }
                            if (l7c.B(V1)) {
                                strArr4[2] = k96.M0(2131746073, null).toLowerCase();
                            } else if (V1.self) {
                                strArr4[2] = k96.M0(2131745709, null).toLowerCase();
                            }
                            boolean z2 = false;
                            int i15 = 0;
                            while (true) {
                                if (i15 < i12) {
                                    String str = strArr[i15];
                                    i = i12;
                                    for (int i16 = 0; i16 < 3; i16++) {
                                        String str2 = strArr4[i16];
                                        if (str2 != null && (str2.startsWith(str) || de9.t(" ", str, str2))) {
                                            z2 = true;
                                            String p = l7c.p(V1);
                                            if (!z2 && p != null && p.startsWith(str)) {
                                                z2 = 2;
                                            }
                                            if (z2) {
                                                i15++;
                                                i12 = i;
                                            } else {
                                                if (z2) {
                                                    arrayList6.add(gl.r0(V1.first_name, V1.last_name, str));
                                                } else {
                                                    arrayList6.add(gl.r0("@" + l7c.p(V1), null, "@" + str));
                                                }
                                                arrayList5.add(V1);
                                            }
                                        }
                                    }
                                    String p2 = l7c.p(V1);
                                    if (!z2) {
                                        z2 = 2;
                                    }
                                    if (z2) {
                                    }
                                } else {
                                    i = i12;
                                }
                            }
                        } else {
                            i = i12;
                            strArr = strArr3;
                        }
                        i13 = i14 + 1;
                        strArr3 = strArr;
                        i12 = i;
                        i2 = 3;
                    }
                    if (sr9Var.H == null) {
                        sr9Var.H = new ArrayList();
                        ArrayList arrayList8 = qu2.r(i4).b0;
                        int size2 = arrayList8.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj4 = arrayList8.get(i17);
                            i17++;
                            nu2 nu2Var = (nu2) obj4;
                            rr9 rr9Var = new rr9();
                            rr9Var.b = nu2Var;
                            rr9Var.a = (nu2Var.i + " " + nu2Var.j).toLowerCase();
                            (nu2Var.j + " " + nu2Var.i).toLowerCase();
                            sr9Var.H.add(rr9Var);
                        }
                    }
                    for (int i18 = 0; i18 < sr9Var.H.size(); i18++) {
                        rr9 rr9Var2 = (rr9) sr9Var.H.get(i18);
                        if ((S0 != null && (rr9Var2.a.toLowerCase().contains(S0) || rr9Var2.a.toLowerCase().contains(S0))) || rr9Var2.a.toLowerCase().contains(lowerCase) || rr9Var2.a.toLowerCase().contains(lowerCase)) {
                            arrayList7.add(rr9Var2.b);
                        }
                    }
                    gl.c3(new i57((Object) sr9Var, i11, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, (byte) 22));
                    break;
                }
                break;
            default:
                TLRPC.Document document = (TLRPC.Document) obj2;
                y8a.g(i3, (TLRPC.User) obj3, document, i4, new r8a((pt0) obj, document, (byte) 0));
                break;
        }
    }

    public /* synthetic */ zy0(pz0 pz0Var, int i, Object obj, int i2, gz0 gz0Var, byte b) {
        this.a = b;
        this.b = pz0Var;
        this.c = i;
        this.f = obj;
        this.d = i2;
        this.e = gz0Var;
    }

    public /* synthetic */ zy0(Object obj, Object obj2, int i, Object obj3, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.c = i;
        this.e = obj3;
        this.d = i2;
    }

    public /* synthetic */ zy0(MediaController mediaController, int i, TLRPC.TL_error tL_error, TLObject tLObject, int i2) {
        this.a = (byte) 2;
        this.b = mediaController;
        this.c = i;
        this.f = tL_error;
        this.e = tLObject;
        this.d = i2;
    }
}
